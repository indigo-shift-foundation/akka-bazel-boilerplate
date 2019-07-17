scala_binary(
    name="FlywayMigrate",
    srcs=[
        "FlywayMigration.scala"
    ],
    main_class = "org.indigoshift.flyway.FlywayMigration",
    deps=[
        "@maven//:org_flywaydb_flyway_core",
        "@maven//:com_h2database_h2",
        "@maven//:mysql_mysql_connector_java",
        "@maven//:com_typesafe_config",
    ],
    resources=[
        "//src/main/resources/db:configs",
    ]
)