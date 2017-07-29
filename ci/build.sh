#!/bin/bash

set -e

cd git-repo
mvn -B -DoutputDirectory=../target package