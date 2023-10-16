plugins {
    id("java")
}

group = "hvl.dat250"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // https://mvnrepository.com/artifact/com.rabbitmq/amqp-client
    implementation("com.rabbitmq:amqp-client:5.19.0")
}

tasks.test {
    useJUnitPlatform()
}