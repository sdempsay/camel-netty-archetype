FROM ${rootArtifactId}_base
MAINTAINER Your Name <your.name@your.domain>

ADD target/lib/ /opt/felix/current/bundle/
RUN echo 'felix.cm.dir=/opt/felix/current/configs' >> /opt/felix/current/conf/config.properties
RUN mkdir -p /opt/felix/current/configs
