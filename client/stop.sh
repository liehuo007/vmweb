#!/bin/bash

# cd ..
# Curdir=$(pwd)

# export JAVA_HOME=$Curdir/java/jdk1.7.0_80
# export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH:
# export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar

# cd $Curdir/Client
kill -9 $( cat pid ) &
