package route20.core

trait Socket2 {
  def close(): Unit
}

trait BindingSocket2 extends Socket2 {
  def bind(address: String): Unit
  def unbind(address: String): Unit
}

trait ConnectingSocket2 extends Socket2 {
  def connect(address: String): Unit
  def disconnect(address: String): Unit
}

trait ReceivingSocket2[A] extends Socket2 {
  def onReceive(f: A => Unit)(cf: Message => A): Unit
}

trait SendingSocket2[A] extends Socket2 {
  def send(a: A)(cf: A => Message): Unit
}

trait FilteringSocket2[A] extends Socket2 {
  def filter(f: A => Boolean): Unit
}

