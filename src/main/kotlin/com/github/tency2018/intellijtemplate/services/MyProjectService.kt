package com.github.tency2018.intellijtemplate.services

import com.intellij.openapi.project.Project
import com.github.tency2018.intellijtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
