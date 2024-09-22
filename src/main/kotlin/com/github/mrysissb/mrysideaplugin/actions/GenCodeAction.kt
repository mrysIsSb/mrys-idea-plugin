package com.github.mrysissb.mrysideaplugin.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.diagnostic.thisLogger

class GenCodeAction : AnAction("生成代码") {
    override fun actionPerformed(event: AnActionEvent) {
        thisLogger().info("actionPerformed${event}")
        val project = getEventProject(event)
    }
}