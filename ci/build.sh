#!/bin/bash

set -e

mvn -B -f git-repo/pom.xml -Dmaven.repo.local=../maven-cache clean package