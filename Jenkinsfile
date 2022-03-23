@Library('my_library')_

pipeline{
  agent any
  stages{
    stage("cloning"){
      steps{
        git 'https://github.com/coderpro2000/spring3hibernate'
      }
    }
    stage("codd stability"){
      steps{
        maven('compile')
      }
    }
    stage("code coverging"){
      steps{
        maven('checkstyle:checkstyle')
              }
              }
    
  }
}
