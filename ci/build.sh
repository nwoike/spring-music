#!/bin/bash

set -e

ls -lR
cd git-repo
mvn -B -DoutputDirectory=../target package
find .