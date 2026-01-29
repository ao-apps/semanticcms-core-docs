#!/usr/bin/env groovy
/*
 * semanticcms-core-docs - Documentation runner for Java API for modeling web page content and relationships.
 * Copyright (C) 2021, 2022, 2023, 2024, 2025, 2026  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-core-docs.
 *
 * semanticcms-core-docs is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-core-docs is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-core-docs.  If not, see <https://www.gnu.org/licenses/>.
 */

// Parent, Extensions, Plugins, Direct and BOM Dependencies
binding.setVariable('upstreamProjects', [
  // Parent
  '../parent', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-parent</artifactId>

  // "development" profile
  // Runtime Direct
  '../openfile/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-all</artifactId>
  '../view-all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-all</artifactId>
  '../view-tree', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-tree</artifactId>
  '../view-what-links-here', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-what-links-here</artifactId>

  // "publish" profile
  // Dependencies for javadocs
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-core</artifactId><classifier>javadoc</classifier>
  'breadcrumblist-json-ld', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-breadcrumblist-json-ld</artifactId><classifier>javadoc</classifier>
  'canonical', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-canonical</artifactId><classifier>javadoc</classifier>
  'model', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-model</artifactId><classifier>javadoc</classifier>
  'servlet', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-servlet</artifactId><classifier>javadoc</classifier>
  'sitemap', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-sitemap</artifactId><classifier>javadoc</classifier>
  'style', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-style</artifactId><classifier>javadoc</classifier>
  'taglib', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-taglib</artifactId><classifier>javadoc</classifier>
  'theme-base', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-theme-base</artifactId><classifier>javadoc</classifier>
  'view-content', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-view-content</artifactId><classifier>javadoc</classifier>

  // Direct
  'all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
  'all-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all-book</artifactId>
  'bom-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-bom-book</artifactId>
  'book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-book</artifactId>
  'breadcrumblist-json-ld-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-breadcrumblist-json-ld-book</artifactId>
  'canonical-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-canonical-book</artifactId>
  'model-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-model-book</artifactId>
  'servlet-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-servlet-book</artifactId>
  'sitemap-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-sitemap-book</artifactId>
  'style-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-style-book</artifactId>
  'taglib-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-taglib-book</artifactId>
  'theme-base-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-theme-base-book</artifactId>
  'view-content-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-view-content-book</artifactId>
  '../news/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
  '../section/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>

  // Runtime Direct
  '../../oss/mime-mappings', // <groupId>com.aoapps</groupId><artifactId>ao-mime-mappings</artifactId>
  '../../oss/servlet-filter', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-filter</artifactId>
  '../theme-documentation', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation</artifactId>

  // BOM
  '../../oss/jakartaee-web-profile-bom', // <groupId>com.aoapps</groupId><artifactId>jakartaee-web-profile-bom</artifactId>
])

// Java 17
binding.setVariable('buildJdks', ['17', '21']) // Changes must be copied to matrix axes!
binding.setVariable('testJdks', ['17', '21']) // Changes must be copied to matrix axes!

/******************************************************************************************
 *                                                                                        *
 * Everything below this line is identical for all projects, except the copied matrix     *
 * axes and any "Begin .*custom" / "End .*custom" blocks (see filter_custom script).      *
 *                                                                                        *
 *****************************************************************************************/

// Load ao-jenkins-shared-library
// TODO: Put @Library on import once we have our first library class
// TODO: Replace master with a specific tag version number once working
@Library('ao@master') _
ao.setVariables(binding, currentBuild, scm, params)

pipeline {
  agent any
  options {
    ansiColor('xterm')
    disableConcurrentBuilds(abortPrevious: true)
    quietPeriod(quietPeriod)
    skipDefaultCheckout()
    timeout(time: PIPELINE_TIMEOUT, unit: TIMEOUT_UNIT)
    // Only allowed to copy build artifacts from self
    // See https://plugins.jenkins.io/copyartifact/
    copyArtifactPermission("/${JOB_NAME}")
    buildDiscarder(buildDiscarder)
  }
  parameters {
    string(
      name: 'BuildPriority',
      defaultValue: "$buildPriority",
      description: BuildPriority_description
    )
    booleanParam(
      name: 'abortOnUnreadyDependency',
      defaultValue: true,
      description: abortOnUnreadyDependency_description
    )
    booleanParam(
      name: 'requireLastBuild',
      defaultValue: true,
      description: requireLastBuild_description
    )
    booleanParam(
      name: 'mavenDebug',
      defaultValue: false,
      description: mavenDebug_description
    )
    choice(
      name: 'sonarQubeAnalysis',
      choices: sonarQubeAnalysis_choices,
      description: sonarQubeAnalysis_description
    )
  }
  triggers {
    upstream(
      threshold: hudson.model.Result.SUCCESS,
      upstreamProjects: "${prunedUpstreamProjects.join(', ')}"
    )
    cron(cron)
  }
  stages {
    stage('Check Ready') {
      when {
        expression {
          return (params.abortOnUnreadyDependency == null) ? true : params.abortOnUnreadyDependency
        }
      }
      steps {
        script {
          ao.checkReadySteps()
        }
      }
    }
    stage('Workaround Git #27287') {
      when {
        expression {
          ao.continueCurrentBuild() && projectDir != '.' && fileExists('.gitmodules')
        }
      }
      steps {
        script {
          ao.workaroundGit27287Steps(scmUrl, scmBranch, scmBrowser, sparseCheckoutPaths, disableSubmodules)
        }
      }
    }
    stage('Checkout SCM') {
      when {
        expression {
          ao.continueCurrentBuild()
        }
      }
      steps {
        script {
          ao.checkoutScmSteps(projectDir, niceCmd, scmUrl, scmBranch, scmBrowser, sparseCheckoutPaths, disableSubmodules)
        }
      }
    }
    stage('Builds') {
      matrix {
        when {
          expression {
            ao.continueCurrentBuild()
          }
        }
        axes {
          axis {
            name 'jdk'
            values '17', '21' // buildJdks
          }
        }
        stages {
          stage('Build') {
            steps {
              script {
                ao.buildSteps(projectDir, niceCmd, maven, deployJdk, mavenOpts, mvnCommon, jdk, buildPhases, testWhenExpression, testJdks)
              }
            }
          }
        }
      }
    }
    stage('Tests') {
      matrix {
        when {
          expression {
            ao.continueCurrentBuild() && testWhenExpression.call()
          }
        }
        axes {
          axis {
            name 'jdk'
            values '17', '21' // buildJdks
          }
          axis {
            name 'testJdk'
            values '17', '21' // testJdks
          }
        }
        stages {
          stage('Test') {
            steps {
              script {
                ao.testSteps(projectDir, niceCmd, deployJdk, maven, mavenOpts, mvnCommon, jdk, testJdk)
              }
            }
          }
        }
      }
    }
    stage('Deploy') {
      when {
        expression {
          ao.continueCurrentBuild()
        }
      }
      steps {
        script {
          ao.deploySteps(projectDir, niceCmd, deployJdk, maven, mavenOpts, mvnCommon)
        }
      }
    }
    stage('SonarQube analysis') {
      when {
        expression {
          ao.continueCurrentBuild() && sonarqubeWhenExpression.call()
        }
      }
      steps {
        script {
          ao.sonarQubeAnalysisSteps(projectDir, niceCmd, deployJdk, maven, mavenOpts, mvnCommon)
        }
      }
    }
    stage('Quality Gate') {
      when {
        expression {
          ao.continueCurrentBuild() && sonarqubeWhenExpression.call()
        }
      }
      steps {
        script {
          ao.qualityGateSteps()
        }
      }
    }
    stage('Analysis') {
      when {
        expression {
          ao.continueCurrentBuild()
        }
      }
      steps {
        script {
          ao.analysisSteps()
        }
      }
    }
  }
  post {
    failure {
      script {
        ao.postFailure(failureEmailTo)
      }
    }
  }
}
