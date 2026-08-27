package o;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class markPageFinishedlambda00 {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final AtomicInteger read;
    public final int write;

    public final boolean serializer() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.read;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i2 = i + androidx.core.app.NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
        return i2 > this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof markPageFinishedlambda00)) {
            return false;
        }
        markPageFinishedlambda00 markpagefinishedlambda00 = (markPageFinishedlambda00) obj;
        return this.RemoteActionCompatParcelizer == markpagefinishedlambda00.RemoteActionCompatParcelizer && this.write == markpagefinishedlambda00.write;
    }

    public markPageFinishedlambda00(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.read = atomicInteger;
        this.write = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i / 2;
        atomicInteger.set(i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.write)});
    }
}
