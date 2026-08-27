package o;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class setSupportButtonTintMode extends androidx.room.Room {
    public static volatile setSupportButtonTintMode read;
    public static final setSupportButtonTintList write = new setSupportButtonTintList(0);
    public final setSupportCheckMarkTintMode serializer = new setSupportCheckMarkTintMode();

    public final boolean RemoteActionCompatParcelizer() {
        this.serializer.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static setSupportButtonTintMode IconCompatParcelizer() {
        if (read != null) {
            return read;
        }
        synchronized (setSupportButtonTintMode.class) {
            if (read == null) {
                read = new setSupportButtonTintMode();
            }
        }
        return read;
    }
}
