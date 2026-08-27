package io.sentry.android.core;

import o.BrazeActionParserExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class addContentView extends io.sentry.hints.read implements io.sentry.hints.write, io.sentry.hints.RatingCompat {
    public final long read;
    public final boolean serializer;

    @Override // io.sentry.hints.read
    public final void IconCompatParcelizer(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
    }

    @Override // io.sentry.hints.write
    public final boolean serializer() {
        return this.serializer;
    }

    @Override // io.sentry.hints.read
    public final boolean serializer(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        return true;
    }

    public addContentView(long j, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, long j2, boolean z) {
        super(j, brazeActionParserExternalSyntheticLambda0);
        this.read = j2;
        this.serializer = z;
    }
}
