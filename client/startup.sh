#!/bin/bash

export JAVA_HOME=$Curdir/java/jdk1.7.0_80
export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH:
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar

nohup java -Xms128M -Xmx256M -Dfile.encoding=UTF-8 -jar vmweb-0.0.1-SNAPSHOT.jar --spring.config.location=application.properties >/dev/null 2>&1 &
/bin/echo -n $! > "$Curdir/Client/pid" &
