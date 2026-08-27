package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class isFromOfflineStorage {
    public static final Charset read;
    public static final byte[] serializer;

    public static int write(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        Charset.forName("US-ASCII");
        read = Charset.forName(com.adjust.sdk.Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        serializer = bArr;
        ByteBuffer.wrap(bArr);
        com.sentiance.protobuf.u.IconCompatParcelizer(bArr, 0, 0, false);
    }

    public static void read(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
    }
}
