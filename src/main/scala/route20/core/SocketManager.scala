package route20.core

object SocketManager {

  def createPublisher[A](): Publisher[A] = {
    new Publisher
  }

}