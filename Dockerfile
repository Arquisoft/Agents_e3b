FROM maven:3.5-jdk-8-alpine
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} /usr/share/agents_e3b/agents_e3b.jar
EXPOSE 8091
ENTRYPOINT ["/usr/bin/java","-jar","/usr/share/agents_e3b/agents_e3b.jar" \
			,"-Djava.security.egd=file:/dev/./urandom" \
]