package org.indigoshift.flyway

import com.typesafe.config.ConfigFactory
import org.flywaydb.core.Flyway

object FlywayMigration {

  val config = ConfigFactory.load("db/flyway_migration")

  def main(args: Array[String]): Unit = { // Create the Flyway instance and point it to the database
    val flyway = Flyway.configure.dataSource(config.getString("flyway.uri"), config.getString("flyway.user"), config.getString("flyway.password")).load
    // Start the migration
    flyway.migrate
  }
}