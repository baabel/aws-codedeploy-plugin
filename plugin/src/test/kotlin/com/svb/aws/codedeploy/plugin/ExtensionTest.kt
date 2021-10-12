package com.svb.aws.codedeploy.plugin

import com.svb.aws.codedeploy.plugin.CodedeployExtension

import kotlin.test.Test
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec
import org.gradle.testfixtures.ProjectBuilder


class ExtensionTest : WordSpec({

    "Application" should {
        "Be by blank default" {
            extension().application shouldBe ""
        }
    }
})

private fun extension() = CodedeployExtension(ProjectBuilder.builder().build())