package o;

import android.os.HandlerThread;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class readInt {
    private static readInt read;
    private final HashMap write = new HashMap();

    public final void IconCompatParcelizer(String str) {
        synchronized (this) {
            HandlerThread handlerThread = (HandlerThread) this.write.get(str);
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.write.remove(str);
            }
        }
    }

    public final HandlerThread write(String str) {
        HandlerThread handlerThread;
        synchronized (this) {
            handlerThread = (HandlerThread) this.write.get(str);
            if (handlerThread == null) {
                handlerThread = new HandlerThread(str);
                handlerThread.start();
                this.write.put(str, handlerThread);
            }
        }
        return handlerThread;
    }

    private readInt() {
    }

    public static readInt write() {
        readInt readint;
        synchronized (readInt.class) {
            if (read == null) {
                read = new readInt();
            }
            readint = read;
        }
        return readint;
    }
}
