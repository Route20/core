package route20.core

class Server[A] extends Socket with ReceivingSocket[A] {
  override def attach(address: String): Unit = {}
  override def detach(address: String): Unit = {}
  override def close(): Unit = {}
  override def onReceive(f: A => Unit)(cf: Message => A): Unit = {}
}