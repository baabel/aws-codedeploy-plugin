package com.svb.aws.codedeploy.plugin

import com.svb.aws.codedeploy.plugin.GradleProperty
import groovy.lang.Closure
import org.gradle.api.Project

/**
 * Container for the custom Cloud deployment plugin configuration DSL.
 */
open class CodedeployExtension(project: Project) {

    var application by GradleProperty(project, String::class.java, "")


}