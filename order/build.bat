mvn clean install -Dmaven.test.skip=true

docker build -t registry.cn-hangzhou.aliyuncs.com/jackcc/order .

docker push registry.cn-hangzhou.aliyuncs.com/jackcc/order