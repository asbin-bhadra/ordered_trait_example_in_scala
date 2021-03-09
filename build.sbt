name := "Ordered Trait"
version := "1.0.0"
scalaVersion := "2.12.12"
sbtPlugin := true

// Create a variable for assignment module
lazy val assignment = (project in file("assignment"))

// Aggregate assignment module with root project
lazy val root = (project in file(".")).aggregate(assignment)