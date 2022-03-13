# spring-kafka-template

# 1. Kafka
- 공식적인 docker image가 없으므로 star수가 가장 많은 bitnami/kafka를 사용
   
# 2. zookeeper
- Apache Zookeeper image 사용

# 3. command
- kafka 접속
``` 
docker exec -it kafka bash
``` 

- 토픽 생성
``` 
kafka-topics.sh --bootstrap-server localhost:9092 --create --topic test --partitions 1 --replication-factor 1
``` 
- producer 접속
``` 
kafka-console-producer.sh --bootstrap-server localhost:9092 --topic test
``` 
- consumer 접속
``` 
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test
``` 


