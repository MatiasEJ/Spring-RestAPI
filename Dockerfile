FROM mysql:8.0.2
# Command to add DB
ENV MYSQL_DATABASE dockerdb
# Copy Scripts to docker-entrypoint-initdb.d/ which will be
# automatically executed during container startup
# COPY ./scripts /docker-entrypoint-initdb.d/


