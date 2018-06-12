FROM maven:3.5-jdk-8-alpine
VOLUME /tmp
ADD "target/agents_e3b-0.0.1-SNAPSHOT.jar" "/maven/usr/share/agents_e3b/agents_e3b.jar"
EXPOSE 8090
ENTRYPOINT ["/usr/bin/java" \
			,"-Djava.security.egd=file:/dev/./urandom" \
			,"-jar" \
			,"/maven/usr/share/agents_e3b/agents_e3b.jar" \
]