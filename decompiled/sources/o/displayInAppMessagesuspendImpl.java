package o;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class displayInAppMessagesuspendImpl extends displayInAppMessagelambda2 {
    @Override // o.displayInAppMessagelambda2
    public final Random IconCompatParcelizer() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }

    @Override // o.displayInAppMessagelambda9
    public final int RemoteActionCompatParcelizer(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // o.displayInAppMessagelambda9
    public final long write(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
