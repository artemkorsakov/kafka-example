# Kafka Producer and Consumer example in scala

You can test this example with local server.

Install [Apache Kafka]. 

### start zookeeper
``` sh
bin/zookeeper-server-start.sh config/zookeeper.properties
```

### start kafka
``` sh
bin/kafka-server-start.sh config/server.properties
```

### create a topic with name "kafka-example"
``` sh
bin/kafka-topics.sh --create --topic kafka-example --bootstrap-server localhost:9092 --replication-factor 1 --partitions 10
```

### compile project
``` sh
sbt clean compile
```

### Run the Producer
``` sh
sbt "runMain com.github.artemkorsakov.app.KafkaProducerApp localhost:9092 kafka-example 10"
```

### Run the Consumer
``` sh
sbt "runMain com.github.artemkorsakov.app.KafkaConsumerApp localhost:9092 group1 kafka-example"
```

[Apache Kafka]: https://kafka.apache.org/documentation/#quickstart