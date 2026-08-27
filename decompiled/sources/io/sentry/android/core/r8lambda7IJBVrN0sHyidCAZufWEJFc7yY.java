package io.sentry.android.core;

import o.BrazeActionParserExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda7IJBVrN0sHyidCAZufWEJFc7yY extends io.sentry.hints.read implements io.sentry.hints.write, io.sentry.hints.IconCompatParcelizer {
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final long read;

    @Override // io.sentry.hints.read
    public final void IconCompatParcelizer(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
    }

    @Override // io.sentry.hints.IconCompatParcelizer
    public final boolean RemoteActionCompatParcelizer() {
        return false;
    }

    @Override // io.sentry.hints.write
    public final boolean serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // io.sentry.hints.read
    public final boolean serializer(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        return true;
    }

    public r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(long j, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, long j2, boolean z, boolean z2) {
        super(j, brazeActionParserExternalSyntheticLambda0);
        this.read = j2;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
    }

    @Override // io.sentry.hints.IconCompatParcelizer
    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.IconCompatParcelizer
    public final Long write() {
        return Long.valueOf(this.read);
    }
}
