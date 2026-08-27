package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getMinimumTouchTargetSizeMYxV2XQ {
    public static final byte[] IconCompatParcelizer;
    public static final Charset write;

    public static int RemoteActionCompatParcelizer(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        Charset.forName("US-ASCII");
        write = Charset.forName(com.adjust.sdk.Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        IconCompatParcelizer = bArr;
        ByteBuffer.wrap(bArr);
        setOuterToInnerOffsetDirtyui.IconCompatParcelizer(bArr, 0, 0, false);
    }

    public static void RemoteActionCompatParcelizer(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
    }
}
