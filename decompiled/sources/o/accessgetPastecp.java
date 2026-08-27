package o;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class accessgetPastecp implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public static final /* synthetic */ accessgetPastecp write = new accessgetPastecp(0);
    public static final /* synthetic */ accessgetPastecp serializer = new accessgetPastecp(2);

    public /* synthetic */ accessgetPastecp(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            if (i != 1) {
                isAltPressedZmokQxo.IconCompatParcelizer.incrementAndGet();
                return;
            }
            try {
                Method method = releaseFocus.serializer;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (MutableRectKt.write()) {
                    MutableRectKt.RemoteActionCompatParcelizer().serializer();
                }
            } finally {
                Method method2 = releaseFocus.serializer;
                Trace.endSection();
            }
        }
    }
}
