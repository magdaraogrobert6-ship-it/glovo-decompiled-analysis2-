package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CompositionLocalsKtLocalWindowInfo1 {
    public static final byte[] IconCompatParcelizer;
    public static final Charset serializer;
    public static final ByteBuffer write;

    public static int IconCompatParcelizer(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        Charset.forName("US-ASCII");
        serializer = Charset.forName(com.adjust.sdk.Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        IconCompatParcelizer = bArr;
        write = ByteBuffer.wrap(bArr);
        CodedInputStream.serializer(bArr, 0, 0, false);
    }

    public static void read(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
    }
}
