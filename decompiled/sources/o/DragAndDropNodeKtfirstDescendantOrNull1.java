package o;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class DragAndDropNodeKtfirstDescendantOrNull1 {
    public static final long write;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        write = id;
    }
}
