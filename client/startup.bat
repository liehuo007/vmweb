@echo off
title testApp

REM cd ..
REM set curdir=%cd%
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_131
REM set JAVA_HOME=%curdir%\java\jdk1.8.0_25
set CLASSPATH=.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;
set Path=%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;%Path%

java -Dfile.encoding=UTF-8 -jar vmweb-0.0.1-SNAPSHOT.jar --spring.config.location=application.properties