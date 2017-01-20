FROM java:8
LABEL authors="Frode Sjovatsen <frode@fintprosjektet.no>"

ADD build/libs/fint-bluegarden-adapter-see-*.jar /data/app.jar
ADD certs/* /data/
RUN /bin/bash -c 'mkdir $JAVA_HOME/lib/security; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit -noprompt -alias startcom.ca -file /data/ca.crt; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit -noprompt -alias startcom.ca.sub.class1 -file /data/sub.class1.server.ca.crt; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit -noprompt -alias startcom.ca.sub.class2 -file /data/sub.class2.server.ca.crt; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit -noprompt -alias startcom.ca.sub.class3 -file /data/sub.class3.server.ca.crt; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit -noprompt -alias startcom.ca.sub.class4 -file /data/sub.class4.server.ca.crt; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/jre/lib/security/cacerts -storepass changeit -noprompt -alias startcom.ca2 -file /data/ca-g2.cer; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/jre/lib/security/cacerts -storepass changeit -noprompt -alias startcom.ca2.sub.class1 -file /data/sub.class1.server.sha2.ca.pem; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/jre/lib/security/cacerts -storepass changeit -noprompt -alias startcom.ca2.sub.class2 -file /data/sub.class2.server.sha2.ca.pem; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/jre/lib/security/cacerts -storepass changeit -noprompt -alias startcom.ca2.sub.class3 -file /data/sub.class3.server.sha2.ca.pem; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/jre/lib/security/cacerts -storepass changeit -noprompt -alias startcom.ca2.sub.class4 -file /data/sub.ev.server.sha2.ca.pem; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/lib/security/jssecacerts -storepass changeit -noprompt -alias startcom.ca -file /data/ca.crt; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/lib/security/jssecacerts -storepass changeit -noprompt -alias startcom.ca.sub.class1 -file /data/sub.class1.server.ca.crt; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/lib/security/jssecacerts -storepass changeit -noprompt -alias startcom.ca.sub.class2 -file /data/sub.class2.server.ca.crt; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/lib/security/jssecacerts -storepass changeit -noprompt -alias startcom.ca.sub.class3 -file /data/sub.class3.server.ca.crt; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/lib/security/jssecacerts -storepass changeit -noprompt -alias startcom.ca.sub.class4 -file /data/sub.class4.server.ca.crt; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/jre/lib/security/jssecacerts -storepass changeit -noprompt -alias startcom.ca2 -file /data/ca-g2.cer; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/jre/lib/security/jssecacerts -storepass changeit -noprompt -alias startcom.ca2.sub.class1 -file /data/sub.class1.server.sha2.ca.pem; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/jre/lib/security/jssecacerts -storepass changeit -noprompt -alias startcom.ca2.sub.class2 -file /data/sub.class2.server.sha2.ca.pem; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/jre/lib/security/jssecacerts -storepass changeit -noprompt -alias startcom.ca2.sub.class3 -file /data/sub.class3.server.sha2.ca.pem; \
    $JAVA_HOME/bin/keytool -import -trustcacerts -keystore $JAVA_HOME/jre/lib/security/jssecacerts -storepass changeit -noprompt -alias startcom.ca2.sub.class4 -file /data/sub.ev.server.sha2.ca.pem'



ENTRYPOINT java ${PARAMS} -jar /data/app.jar