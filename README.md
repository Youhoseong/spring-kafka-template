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

# 4. test

- producer

![스크린샷 2022-03-13 오후 3 59 32](https://user-images.githubusercontent.com/33655186/158049003-202f2f45-5b2c-4e15-be1f-cdf09804c208.png)


- consumer

<img width="760" alt="스크린샷 2022-03-13 오후 3 59 53" src="https://user-images.githubusercontent.com/33655186/158049012-76ea3fd8-a90b-416b-99d8-852f4940b9b0.png">
