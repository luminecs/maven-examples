# maven-examples

* Check the Maven version

```bash
mvn --version
```

* Set `${project.package}` to `pom`

```xml
<packaging>pom</packaging>
```

* Create a new Maven module (project) named `app-001`

```bash
mvn archetype:generate -DgroupId=com.example -DartifactId=app-001 -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false -DjavaCompilerVersion=21
```