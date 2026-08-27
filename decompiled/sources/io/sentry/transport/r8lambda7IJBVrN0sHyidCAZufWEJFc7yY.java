package io.sentry.transport;

import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda7IJBVrN0sHyidCAZufWEJFc7yY extends TextStreamsKt {
    public final int write;

    @Override // kotlin.io.TextStreamsKt
    public final boolean RemoteActionCompatParcelizer() {
        return false;
    }

    @Override // kotlin.io.TextStreamsKt
    public final int serializer() {
        return this.write;
    }

    public r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(int i) {
        this.write = i;
    }
}
