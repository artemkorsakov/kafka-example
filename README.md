# Kafka Producer and Consumer example in scala

You can test this example with local server.

Install [Apache Kafka]. 

### start zookeeper
``` sh
> bin/zookeeper-server-start.sh config/zookeeper.properties
```

### start kafka
``` sh
> bin/kafka-server-start.sh config/server.properties
```

### create a topic with name "quickstart-events"
``` sh
> bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092
```

### package this example
``` sh
sbt assembly
```

### Run the Producer
``` sh
java -cp kafka_example-0.1.0-SNAPSHOT.jar com.colobu.kafka.ScalaProducerExample 10000 test_topic localhost:9092
```

### Run the Consumer
``` sh
java -cp kafka_example-0.1.0-SNAPSHOT.jar com.colobu.kafka.ScalaConsumerExample localhost:9092 group1 test_topic 10 0
```

[Apache Kafka]: https://kafka.apache.org/documentation/#quickstart