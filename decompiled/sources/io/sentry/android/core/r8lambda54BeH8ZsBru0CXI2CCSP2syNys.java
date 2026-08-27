package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda54BeH8ZsBru0CXI2CCSP2syNys implements io.sentry.hints.IconCompatParcelizer, io.sentry.hints.MediaSessionCompatResultReceiverWrapper {
    public final boolean serializer;

    @Override // io.sentry.hints.IconCompatParcelizer
    public final boolean RemoteActionCompatParcelizer() {
        return true;
    }

    @Override // io.sentry.hints.IconCompatParcelizer
    public final Long write() {
        return null;
    }

    public r8lambda54BeH8ZsBru0CXI2CCSP2syNys(boolean z) {
        this.serializer = z;
    }

    @Override // io.sentry.hints.IconCompatParcelizer
    public final String IconCompatParcelizer() {
        return this.serializer ? "anr_background" : "anr_foreground";
    }
}
