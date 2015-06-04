import offheap._

@data class Point(x: Int, y: Int)

object Test extends App {
  implicit val props = Region.Props()
  Region { implicit r =>
    val p = Point(10, 20)
    println(s"Hello, I'm a point at (${p.x}, ${p.y}).")
  }
}
