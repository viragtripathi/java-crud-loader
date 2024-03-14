@ECHO OFF
set CLASSPATH=.
set CLASSPATH=%CLASSPATH%;"..\lib\*"
set LOADER_CONFIG=..\config
set LOGBACK_CONFIG=..\config\logback.xml
echo -------------------------------


java -XX:+HeapDumpOnOutOfMemoryError -Xms256m -Xmx1g -classpath "%CLASSPATH%" -Dlogback.configurationFile=$LOGBACK_CONFIG -Dcrud.loader.configLocation=$LOADER_CONFIG com.crud.loader.LoaderMain %1