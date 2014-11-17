package route20.core

class Publisher[A] extends Socket with SendingSocket[A] with FilteringSocket[A] {
  override def attach(address: String): Unit = {}
  override def detach(address: String): Unit = {}
  override def close(): Unit = {}
  override def send(a: A)(cf: A => Message): Unit = {}
  override def filter(f: A => Boolean): Unit = {}
}