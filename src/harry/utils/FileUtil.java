package harry.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import org.junit.Test;

/**
 * 
 * @author harry
 *
 */
public final class FileUtil {
	private FileUtil() {
	}

	/**
	 * copy the content of the file of source to the file of target
	 * 
	 * @param source
	 *            the file of source
	 * @param target
	 *            the file of target
	 */
	public static void copy(String source, String target) {
		try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream(target)) {
			byte[] b = new byte[1024];
			int len;
			while ((len = in.read(b)) != -1) {
				out.write(b, 0, len);
				out.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * copy the content of the file of source to the file of target
	 * 
	 * @param source
	 *            the file of source
	 * @param target
	 *            the file of target
	 */
	@Test
	public static void copyNIO(String source, String target) {
		try (FileInputStream in = new FileInputStream(source); FileOutputStream out = new FileOutputStream(target)) {
			FileChannel inChannel = in.getChannel();
			FileChannel outChannel = out.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			while (inChannel.read(buffer) != -1) {
				buffer.flip();
				outChannel.write(buffer);
				buffer.clear();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * list all the file of the given path
	 * 
	 * @param filePath
	 *            the path of directory
	 */
	public static void listFile(String filePath) {
		_listFile(new File(filePath), 0);
	}

	private static void _listFile(File file, int level) {
		if (file.isDirectory()) {
			for (File _file : file.listFiles()) {
				_listFile(_file, level + 1);
			}
		} else {
			for (int i = 0; i < level - 1; i++) {
				System.out.print("\t");
			}

			System.out.println(file.getName());
		}
	}

	/**
	 * list all the file of the given path
	 * 
	 * @param filePath
	 *            the path of directory
	 * @throws IOException
	 */
	public static void listFileNIO(String filePath) {
		Path start = Paths.get(filePath);
		try {
			Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					System.out.println(file.getFileName());
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
