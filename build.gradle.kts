plugins {
    kotlin("jvm") version "2.0.0"
    checkstyle
    id("io.gitlab.arturbosch.detekt") version "1.23.7"
}
checkstyle {
    configFile = rootProject.file("checkstyle.xml")
}

group = "ru.job4j"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.1")
    testImplementation("org.assertj:assertj-core:3.24.2")
}

tasks.test {
    useJUnitPlatform()
}

detekt {
    toolVersion = "1.23.7" // Версия Detekt
    config = files("$projectDir/config/detekt/detekt.yml") // Путь к конфигурационному файлу
    buildUponDefaultConfig = true // Настройки будут расширять дефолтный конфиг Detekt
    allRules = false // Использовать только правила, указанные в конфиге
}

tasks.withType<io.gitlab.arturbosch.detekt.Detekt> {
    reports {
        html.required.set(true) // Отчет в формате HTML
        xml.required.set(true)  // Отчет в формате XML
        txt.required.set(false) // Текстовый отчет
    }
}


tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
