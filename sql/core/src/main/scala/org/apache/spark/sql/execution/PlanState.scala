package org.apache.spark.sql.execution

object PlanState extends Enumeration {
  type PlanState = Value

  val NotStart = Value("Not Start")
  val Running = Value("Running")
  val Success = Value("Success")
  val Failed = Value("Failed")

}
