package com.github.nwpistols.jetbrains.services

import com.intellij.openapi.project.Project
import com.github.nwpistols.jetbrains.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
