import bigtop.core._
import bigtop.routes.scalatra._

object ExampleSite extends Site {

  val home =
    (end) >> {
      () =>
        <html>
          <body>
            <h1>Hello, world!</h1>
            <p>Why not { testPage.url(1, 2).link("add some numbers together") }</p>
          </body>
        </html>
    }
  
  val testPage =
    ("add" :/: IntArg :/: "to" :/: IntArg :/: end) >> {
      (a: Int, b: Int) =>
        <html>
          <body>
            <p>{ a.toString } + { b.toString } = { (a + b).toString }</p>
          </body>
        </html>
    }

}
