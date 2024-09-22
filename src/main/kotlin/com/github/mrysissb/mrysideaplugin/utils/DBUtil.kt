package com.github.mrysissb.mrysideaplugin.utils

import com.intellij.database.psi.DbTable
import com.intellij.database.util.DasUtil

object DBUtil {
    /**
     * 获取所有列
     */
    fun getAllColumns(dbTable: DbTable) {
        DasUtil.getColumns(dbTable).map { it }
    }
}