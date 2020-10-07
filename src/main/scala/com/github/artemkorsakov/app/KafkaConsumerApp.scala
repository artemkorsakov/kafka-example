package com.github.artemkorsakov.app

import java.time.Duration
import java.util.Collections
import java.util.concurrent._

import com.github.artemkorsakov.props.KafkaProperties.createKafkaConsumer
import kafka.utils.Logging

object KafkaConsumerApp extends App with Logging {
  if (args.length < 3)
    logger.error("Must be three arguments: server, groupId and topic")
  else {
    val consumer = createKafkaConsumer(args.head, args(1))
    val topic    = args(2)
    consumer.subscribe(Collections.singletonList(topic))
    Executors.newSingleThreadExecutor.execute(() =>
      while (true) {
        val records = consumer.poll(Duration.ofMillis(500))
        records.forEach(record =>
          logger.info(s"Received message: (${record.key}, ${record.value}) at offset ${record.offset}")
        )
      }
    )
  }
}
