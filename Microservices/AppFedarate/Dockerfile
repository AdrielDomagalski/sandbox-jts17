FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD build/libs/AppFedarate-0.0.1-SNAPSHOT.jar appFederate.jar
EXPOSE 7003
RUN sh -c 'touch /appFederate.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /appFederate.jar" ]
