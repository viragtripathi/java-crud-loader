export CLASSPATH="../lib/*"
export LOADER_CONFIG=../config
export LOGBACK_CONFIG=../config/logback.xml
echo -------------------------------


java -XX:+HeapDumpOnOutOfMemoryError -Xms256m -Xmx1g -classpath "../lib/*" -Dlogback.configurationFile=$LOGBACK_CONFIG -Dcrud.loader.configLocation=$LOADER_CONFIG com.crud.loader.LoaderMain $1