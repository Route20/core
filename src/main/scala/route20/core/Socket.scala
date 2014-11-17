package route20.core

/**
 * Socket present an abstraction of a asynchronous message queue, with the exact queueing semantics depending on the socket type in use.
 * Generally speaking, conventional sockets present a synchronous interface to either connection-oriented reliable byte streams,
 * or connection-less unreliable datagrams. Where conventional sockets transfer streams of bytes or discrete datagrams,
 * our sockets transfer discrete messages.
 */
trait Socket {
  def attach(address: String): Unit
  def detach(address: String): Unit
  def close(): Unit
}

trait ReceivingSocket[A] extends Socket {
  def onReceive(f: A => Unit)(cf: Message => A): Unit
}

trait SendingSocket[A] extends Socket {
  def send(a: A)(cf: A => Message): Unit
}

trait FilteringSocket[A] extends Socket {
  def filter(f: A => Boolean): Unit
}

