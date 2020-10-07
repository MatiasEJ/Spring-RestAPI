FROM mysql:8.0.2
#Add DB
ENV MYSQL_DATABASE dockerdb
#Copy the Script to docker-entrypoint-initdb.d/ which will be
#automatically executed during container startup
# COPY ./scripts /docker-entrypoint-initdb.d/


