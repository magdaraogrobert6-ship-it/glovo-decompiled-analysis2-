package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessonPreScrollOzD1aCkjd {
    public static final byte[] serializer;
    public static final Charset write;

    static {
        Charset.forName("US-ASCII");
        write = Charset.forName(com.adjust.sdk.Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        serializer = bArr;
        ByteBuffer.wrap(bArr);
    }
}
