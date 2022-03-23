#!/usr/bin/env groovy
def call(command){
  sh maven{command}
}
