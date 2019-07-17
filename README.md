# akka-bazel-boilerplate

Boilerplate for creating an Akka project built using [bazel](https://bazel.build).

This boilerplate makes use of [bazel-deps](https://github.com/johnynek/bazel-deps) to generate transitive maven dependencies.

To generate the `3rdparty` directory, run
```$xslt
cd $BAZEL_DEPS_DIRECTORY
bazel run //:parse generate -- --repo-root "/path/to/akka-bazel-boilerplate/" --sha-file 3rdparty/workspace.bzl --deps dependencies.yaml
```
where `BAZEL_DEPS_DIRECTORY` is where you cloned bazel-deps.
