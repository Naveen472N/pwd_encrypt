package in.naveen;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodePassword {
	public String getEncoder(String pwd) {
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(pwd.getBytes());
		String encodedpwd = new String(encode);
		return encodedpwd;
	}
	public String getDecoder(String encodedPwd) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedPwd.getBytes());
		String decodedPwd = new String(decode);
		return decodedPwd;
	}
}
