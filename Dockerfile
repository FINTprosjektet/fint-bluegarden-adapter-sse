FROM java:8
LABEL authors="Frode Sjovatsen <frode@fintprosjektet.no>"

ADD build/libs/fint-bluegarden-adapter-see-*.jar /data/app.jar
ADD import-startssl /data/import-startssl
CMD sudo chmod +x /data/import-startssl && /data/import-startssl
ENTRYPOINT java ${PARAMS} -jar /data/app.jar
ENTRYPOINT java ${PARAMS} -jar /data/app.jar