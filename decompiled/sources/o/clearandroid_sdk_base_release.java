package o;

import android.os.SystemClock;
import com.sentiance.sdk.threading.executors.Executors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class clearandroid_sdk_base_release {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final Executors read;
    private final int serializer;

    public final void IconCompatParcelizer(String str, long j, Runnable runnable) {
        this.RemoteActionCompatParcelizer.getClass();
        readIntlambda0.read readVar = new readIntlambda0.read(this.serializer, SystemClock.uptimeMillis() + j, runnable);
        readVar.read(str);
        this.read.IconCompatParcelizer(new readIntlambda0(readVar));
    }

    public final void RemoteActionCompatParcelizer(Runnable runnable) {
        serializer(runnable, 0L);
    }

    public clearandroid_sdk_base_release(int i, Executors executors, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.serializer = i;
        this.read = executors;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final void serializer(Runnable runnable, long j) {
        this.RemoteActionCompatParcelizer.getClass();
        this.read.IconCompatParcelizer(new readIntlambda0(new readIntlambda0.read(this.serializer, SystemClock.uptimeMillis() + j, runnable)));
    }

    public final void RemoteActionCompatParcelizer(Runnable runnable, String str) {
        IconCompatParcelizer(str, 0L, runnable);
    }

    public final void IconCompatParcelizer(Runnable runnable) {
        this.read.read(new readIntlambda0(new readIntlambda0.read(this.serializer, 0L, runnable)));
    }
}
