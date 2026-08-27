package okhttp3.internal.http2;

import android.os.Process;
import java.io.IOException;
import o.InAppMessageSlideupView;

/* JADX INFO: loaded from: classes4.dex */
public final class StreamResetException extends IOException {
    public static int RemoteActionCompatParcelizer;
    public static int serializer;
    public final InAppMessageSlideupView read;

    public StreamResetException(InAppMessageSlideupView inAppMessageSlideupView) {
        super("stream was reset: " + inAppMessageSlideupView);
        this.read = inAppMessageSlideupView;
    }

    public static int serializer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 7239957;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int iMyUid = Process.myUid();
        serializer = iMyUid;
        return iMyUid;
    }
}
