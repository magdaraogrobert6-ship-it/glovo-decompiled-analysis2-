package io.sentry.util;

import java.util.concurrent.locks.ReentrantLock;
import o.UriActionExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer extends ReentrantLock {
    public final UriActionExternalSyntheticLambda4 serializer() {
        lock();
        return new UriActionExternalSyntheticLambda4(1, this);
    }
}
