scala_library(
    name = "example_lib",
    srcs=glob(["*.scala"]),
    deps=[
        "@maven//:com_typesafe_akka_akka_actor_2_12",
        "@maven//:com_typesafe_akka_akka_http_2_12",
        "@maven//:com_typesafe_akka_akka_http_core_2_12",
        "@maven//:com_typesafe_akka_akka_stream_2_12",
        "@maven//:com_h2database_h2",
        "@maven//:mysql_mysql_connector_java",
        "@maven//:com_typesafe_config",
        "@maven//:com_typesafe_scala_logging_scala_logging_2_12",
        "@maven//:org_scalaz_scalaz_core_2_12",
        "@maven//:org_scalaz_scalaz_concurrent_2_12",
        "@maven//:ch_qos_logback_logback_classic",
        "@maven//:org_slf4j_slf4j_api",
        "@maven//:org_slf4j_slf4j_simple",
     ],
    resources=[
        "//src/main/resources/org/indigoshift/example:configs",
    ],
)

scala_binary(
    name="example",
    main_class = "org.indigoshift.example.ExampleApp",
    runtime_deps = [
        ":example_lib",
    ],
)
