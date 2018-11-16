mvn clean install -Dmaven.test.skip=true

docker build -t registry.cn-hangzhou.aliyuncs.com/jackcc/api-gateway .

docker push registry.cn-hangzhou.aliyuncs.com/jackcc/api-gateway