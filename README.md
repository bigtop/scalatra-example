Bigtop / Scalatra example
=========================

This example demonstrates the use of [Bigtop Routes] within a [Scalatra] application.

Running the code
================

You should be able to get this up and running with the following code:

    git clone git@github.com/bigtop/scalatra-example.git bigtop-scalatra-example
    cd bigtop-scalatra-example
    ./sbt jetty-run ~prepare-webapp

Key files
=========

The important files in this demo are:

 - `ExampleServlet.scala` - your trusty ScalatraServlet;
 - `ExampleSite.scala` - Routes Site object.

[Bigtop Routes]: http://bigtopweb.com/routes/
[Scalatra]: https://github.com/scalatra/scalatra

