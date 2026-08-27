package io.sentry.transport;

import java.util.Collections;
import java.util.Iterator;
import o.executelambda4;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class RatingCompat implements io.sentry.cache.serializer {
    public static final RatingCompat RemoteActionCompatParcelizer = new RatingCompat();

    @Override // io.sentry.cache.serializer
    public final void IconCompatParcelizer(OkHttpCall$1 okHttpCall$1) {
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyIterator();
    }

    @Override // io.sentry.cache.serializer
    public final boolean write(OkHttpCall$1 okHttpCall$1, executelambda4 executelambda4Var) {
        return false;
    }
}
