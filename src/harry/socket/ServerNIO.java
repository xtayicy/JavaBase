package harry.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

import harry.utils.CharsetHelper;

/**
 * 
 * @author harry
 *
 */
public class ServerNIO {
	private static Selector selector;
	private static ByteBuffer buffer = ByteBuffer.allocate(1024);

	public static void main(String[] args) {
		try {
			ServerSocketChannel server = ServerSocketChannel.open();
			server.socket().bind(new InetSocketAddress(8888));
			server.configureBlocking(false);
			selector = Selector.open();
			server.register(selector, SelectionKey.OP_ACCEPT);
			while (true) {
				if (selector.select(3000) != 0) {
					Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
					while (iterator.hasNext()) {
						SelectionKey element = iterator.next();
						iterator.remove();
						handleElement(element);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void handleElement(SelectionKey element) {
		SocketChannel socketChannel;
		try {
			if (element.isAcceptable()) {
				ServerSocketChannel server = (ServerSocketChannel) element.channel();
				socketChannel = server.accept();
				socketChannel.configureBlocking(false);
				socketChannel.register(selector, SelectionKey.OP_READ);
			} else if (element.isReadable()) {
				socketChannel = (SocketChannel) element.channel();
				buffer.clear();
				if (socketChannel.read(buffer) > 0) {
					buffer.flip();
					CharBuffer charBuffer = CharsetHelper.decode(buffer);
					String msg = charBuffer.toString();
					System.out.println("收到" + socketChannel.getRemoteAddress() + "的消息：" + msg);
					socketChannel.write(CharsetHelper.encode(CharBuffer.wrap("hello client")));
				} 
				
				socketChannel.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
