package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: loaded from: classes4.dex */
public final class ResultReceiver extends AbstractQueuedSynchronizer {
    public static final /* synthetic */ int read = 0;

    public static int serializer(ResultReceiver resultReceiver) {
        return resultReceiver.getState();
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i) {
        return getState() == 0 ? 1 : -1;
    }

    public ResultReceiver() {
        setState(0);
    }

    public static void IconCompatParcelizer(ResultReceiver resultReceiver) {
        int state;
        do {
            state = resultReceiver.getState();
        } while (!resultReceiver.compareAndSetState(state, state + 1));
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i) {
        int state;
        int i2;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i2 = state - 1;
        } while (!compareAndSetState(state, i2));
        return i2 == 0;
    }
}
