package route20.core

class SocketManagerTest extends BaseTest {

  "SocketManager" should "create new Publisher" in {
    val pub = SocketManager.createPublisher[String]()
    assert(pub.isInstanceOf[Publisher[String]] == true)
  }

}