# akka-bazel-boilerplate

Boilerplate for creating an Akka project built using [bazel](https://bazel.build).

## DB Management
This boilerplate uses [Flyway](https://flywaydb.org) for DB migrations.

## bazelw
The boilerplate provides a wrapper to bazel called bazelw. 
The wrapper provides the ability to set environment variables through a `.env` file located next to the `bazelw` script.
This wrapper is useful for IDEs that do not provide a way to set environment variables in the run configuration (e.g., Intellij).