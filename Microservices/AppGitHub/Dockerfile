FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD build/libs/AppGitHub-0.0.1-SNAPSHOT.jar appGitHub.jar
EXPOSE 7000
RUN sh -c 'touch /appGitHub.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /appGitHub.jar" ]
