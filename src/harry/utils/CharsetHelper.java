package harry.utils;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;

/**
 * 
 * @author harry
 *
 */
public class CharsetHelper {
	private static final String UTF_8 = "UTF-8";

	private CharsetHelper() {
	}

	public static ByteBuffer encode(CharBuffer in) throws CharacterCodingException {
		return Charset.forName(UTF_8).newEncoder().encode(in);
	}

	public static CharBuffer decode(ByteBuffer in) throws CharacterCodingException {
		return Charset.forName(UTF_8).newDecoder().decode(in);
	}

}
