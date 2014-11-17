package route20.core

class Subscriber[A] extends Socket with ReceivingSocket[A] with FilteringSocket[A] {
  override def attach(address: String): Unit = {}
  override def detach(address: String): Unit = {}
  override def close(): Unit = {}
  override def onReceive(f: A => Unit)(cf: Message => A): Unit = {}
  override def filter(f: A => Boolean): Unit = {}
}