package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ {
    public long acknowledged;
    public final int streamId;
    public long total;

    public final long read() {
        long j;
        long j2;
        synchronized (this) {
            j = this.total;
            j2 = this.acknowledged;
        }
        return j - j2;
    }

    public r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ(int i) {
        this.streamId = i;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.streamId + ", total=" + this.total + ", acknowledged=" + this.acknowledged + ", unacknowledged=" + read() + ')';
    }

    public static void write(r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ r8lambdakjkemutsdzneikk7hv7wrakxqzq, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (r8lambdakjkemutsdzneikk7hv7wrakxqzq) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 >= 0) {
                    long j3 = r8lambdakjkemutsdzneikk7hv7wrakxqzq.total + j;
                    r8lambdakjkemutsdzneikk7hv7wrakxqzq.total = j3;
                    long j4 = r8lambdakjkemutsdzneikk7hv7wrakxqzq.acknowledged + j2;
                    r8lambdakjkemutsdzneikk7hv7wrakxqzq.acknowledged = j4;
                    if (j4 > j3) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
