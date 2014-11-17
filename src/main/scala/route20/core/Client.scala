package route20.core

class Client[A] extends Socket with SendingSocket[A] {
  override def attach(address: String): Unit = {}
  override def detach(address: String): Unit = {}
  override def close(): Unit = {}
  override def send(a: A)(cf: A => Message): Unit = {}

}