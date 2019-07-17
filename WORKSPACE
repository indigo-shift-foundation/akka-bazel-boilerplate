
rules_scala_version="69d3c5b5d9b51537231746e93b4383384c9ebcf4" # update this as needed

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
http_archive(
    name = "io_bazel_rules_scala",
    strip_prefix = "rules_scala-%s" % rules_scala_version,
    type = "zip",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip" % rules_scala_version,
)

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

RULES_JVM_EXTERNAL_TAG = "2.4"
RULES_JVM_EXTERNAL_SHA = "2393f002b0a274055a4e803801cd078df90d1a8ac9f15748d1f803b97cfcdc9c"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)
load("@rules_jvm_external//:defs.bzl", "maven_install")

protobuf_version="09745575a923640154bcf307fba8aedff47f240a"
protobuf_version_sha256="416212e14481cff8fd4849b1c1c1200a7f34808a54377e22d7447efdf54ad758"

http_archive(
    name = "com_google_protobuf",
    url = "https://github.com/protocolbuffers/protobuf/archive/%s.tar.gz" % protobuf_version,
    strip_prefix = "protobuf-%s" % protobuf_version,
    sha256 = protobuf_version_sha256,
)

# bazel-skylib 0.8.0 released 2019.03.20 (https://github.com/bazelbuild/bazel-skylib/releases/tag/0.8.0)
skylib_version = "0.8.0"
http_archive(
    name = "bazel_skylib",
    type = "tar.gz",
    url = "https://github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib.{}.tar.gz".format (skylib_version, skylib_version),
    sha256 = "2ef429f5d7ce7111263289644d233707dba35e39696377ebab8b0bc701f7818e",
)

scala_repositories((
    "2.12.8",
    {
       "scala_compiler": "f34e9119f45abd41e85b9e121ba19dd9288b3b4af7f7047e86dc70236708d170",
       "scala_library": "321fb55685635c931eba4bc0d7668349da3f2c09aee2de93a70566066ff25c28",
       "scala_reflect": "4d6405395c4599ce04cea08ba082339e3e42135de9aae2923c9f5367e957315a"
    }
))

maven_install(
    artifacts = [
        "com.github.pureconfig:pureconfig_2.12:0.10.2",
        "com.typesafe.akka:akka-actor_2.12:2.5.23",
        "com.typesafe.akka:akka-http_2.12:10.1.8",
        "com.typesafe.akka:akka-http-testkit_2.12:10.1.8",
        "com.typesafe.akka:akka-stream_2.12:2.5.23",
        "com.typesafe.akka:akka-stream-testkit_2.12:2.5.23",
        "com.typesafe.akka:akka-testkit_2.12:2.5.23",
        "com.typesafe:config:1.3.4",
        "com.typesafe.scala-logging:scala-logging_2.12:3.9.2",
        "org.flywaydb:flyway-core:5.2.4",
        "org.mockito:mockito-core:2.26.0",
        "org.scalaz:scalaz-core_2.12:7.2.27",
        "org.scalaz:scalaz-concurrent_2.12:7.2.27",
        "org.slf4j:slf4j-api:1.7.26",
        "org.slf4j:slf4j-simple:1.7.26",
    ],
    repositories = [
        "https://jcenter.bintray.com",
    ],
    maven_install_json = "//:maven_install.json",
)

load("@maven//:defs.bzl", "pinned_maven_install")
pinned_maven_install()