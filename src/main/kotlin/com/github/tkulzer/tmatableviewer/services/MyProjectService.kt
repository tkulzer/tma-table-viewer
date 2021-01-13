package com.github.tkulzer.tmatableviewer.services

import com.github.tkulzer.tmatableviewer.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
