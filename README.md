# akka-bazel-boilerplate

Boilerplate for creating an Akka project built using [bazel](https://bazel.build).

## DB Management
This boilerplate uses [Flyway](https://flywaydb.org) for DB migrations.
To run the migrations, modify the configuration file in [flyway_migration.conf](src/main/resources/db/flyway_migration.conf) run it with bazel:
```
bazel run //src/main/scala/org/indigoshift/flyway:FlywayMigration
```

## bazelw
The boilerplate provides a wrapper to bazel called bazelw. 
The wrapper provides the ability to set environment variables through a `.env` file located next to the `bazelw` script.
This wrapper is useful for IDEs that do not provide a way to set environment variables in the run configuration (e.g., Intellij).

## Running the server
To run the server:
```
bazel run //src/main/scala/org/indigoshift/example:example
```
