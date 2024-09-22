package com.github.mrysissb.mrysideaplugin.actions

import com.intellij.database.psi.DbTable
import com.intellij.openapi.actionSystem.*

class SelectTableAction : ActionGroup() {


    override fun getChildren(event: AnActionEvent?): Array<AnAction> {
        event ?: return EMPTY_ARRAY
        val project = getEventProject(event) ?: return EMPTY_ARRAY
        val psiElement = event.getData(LangDataKeys.PSI_ELEMENT) ?: return EMPTY_ARRAY
        val dbTable = takeIf { psiElement is DbTable }?.let { psiElement as DbTable } ?: return EMPTY_ARRAY
        return getMenu()
    }

    private fun getMenu(): Array<AnAction> {
        val genCodeAction = GenCodeAction()
        ActionManager.getInstance().registerAction(GenCodeAction::class.java.name, genCodeAction)
        return arrayOf(genCodeAction)
    }


}