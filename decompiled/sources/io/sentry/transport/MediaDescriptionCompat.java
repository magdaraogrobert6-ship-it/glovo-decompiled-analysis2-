package io.sentry.transport;

import java.io.Closeable;
import o.executelambda4;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public interface MediaDescriptionCompat extends Closeable {
    void IconCompatParcelizer(long j);

    void IconCompatParcelizer(OkHttpCall$1 okHttpCall$1, executelambda4 executelambda4Var);

    void RemoteActionCompatParcelizer(boolean z);

    default boolean read() {
        return true;
    }

    PlaybackStateCompat write();
}
