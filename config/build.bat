mvn clean install -Dmaven.test.skip=true
docker build -t hub.c.163.com/jackcc/config .
docker push hub.c.163.com/jackcc/config