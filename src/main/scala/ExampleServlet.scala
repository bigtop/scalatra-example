import bigtop.routes.scalatra._
import org.scalatra._

class ExampleServlet extends ScalatraServlet with BigtopRoutes {

  get(ExampleSite)
  
  notFound { serveStaticResource() getOrElse resourceNotFound() }
  
}
