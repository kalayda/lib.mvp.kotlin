package com.itgrx.lib.mvp.module.stacked

import com.itgrx.lib.mvp.module.BaseModuleManager
import com.itgrx.lib.mvp.module.Module
import io.reactivex.Completable

import java.util.Stack

/**
 * Created by Алексей Калайда on 10.10.2017.
 */

abstract class StackedModuleManager : BaseModuleManager() {

    data class StackNode(val container: NodeContainer, val module: Module)

    private val mNodes: Stack<StackNode> = Stack()

    override fun create() = Unit

    override fun destroy() {
        for (node in mNodes)
            node.module.detach()
        getNodeContainerFactory().destroy()
    }

    override fun show(module: Module): Completable {
        val stackNode = StackNode(getNodeContainerFactory().get(module), module)
        val prevContainer = if (mNodes.isEmpty()) null else mNodes.peek().container
        mNodes.push(stackNode)
        return stackNode.container.lr(prevContainer).andThen { onShown(stackNode.module) }
    }

    open fun back(): Boolean =
            if (mNodes.size > 1) {
                val node = mNodes.pop()
                node.module.dispose {
                    node.container.rl(mNodes.peek().container) {
                        //                        replaceTitle(stackNode.module, mNodes.peek().module)
                        node.module.detach()
                        onDisposed(node.module)
                    }
                }
                true
            } else
                false

    abstract fun getNodeContainerFactory(): NodeContainerFactory

}


