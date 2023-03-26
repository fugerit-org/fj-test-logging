# No provider configuration

[back](README.md)

The following dependencies are needed : 

```
		<dependency>
		    <groupId>org.apache.logging.log4j</groupId>
		    <artifactId>log4j-api</artifactId>
		    <version>${log4j2-version}</version>
		    <scope>provided</scope>
		</dependency>
		<dependency>
		    <groupId>org.apache.logging.log4j</groupId>
		    <artifactId>log4j-core</artifactId>
		   <version>${log4j2-version}</version>
		   <scope>provided</scope>
		</dependency>
		<dependency>
		    <groupId>org.apache.logging.log4j</groupId>
		    <artifactId>log4j-slf4j2-impl</artifactId>
		    <version>${log4j2-version}</version>
		    <scope>provided</scope>
		</dependency>
```

And a simple log4j2.xml configuration : 

```
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
  <Appenders>
    <Console name="Console" target="SYSTEM_OUT">
      <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
    </Console>
  </Appenders>
  <Loggers>
    <Root level="DEBUG">
      <AppenderRef ref="Console"/>
    </Root>
  </Loggers>
</Configuration>
```

The output of the test classes will be the like of : 

```
2023-03-26 12:13:41.239 [main] INFO  org.fugerit.java.test.logging.TestLogging - Test logging : fj-test-logging
```