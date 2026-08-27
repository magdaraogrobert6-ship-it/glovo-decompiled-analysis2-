package o;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class accessdrawOvaljd {
    public final long[] RatingCompat;
    public final boolean[] RemoteActionCompatParcelizer;
    public volatile boolean read;
    public volatile boolean write;
    public final ReentrantLock serializer = new ReentrantLock();
    public final ReentrantLock IconCompatParcelizer = new ReentrantLock();

    public final boolean IconCompatParcelizer(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = this.serializer;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.RatingCompat;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    this.read = true;
                    z = true;
                }
            }
            return z || this.read || this.write;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean serializer(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = this.serializer;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.RatingCompat;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    this.read = true;
                    z = true;
                }
            }
            return z || this.read || this.write;
        } finally {
            reentrantLock.unlock();
        }
    }

    public accessdrawOvaljd(int i) {
        this.RatingCompat = new long[i];
        this.RemoteActionCompatParcelizer = new boolean[i];
    }
}
