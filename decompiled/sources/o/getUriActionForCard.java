package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getUriActionForCard extends io.sentry.hints.read implements io.sentry.hints.MediaBrowserCompatMediaItem, io.sentry.hints.MediaSessionCompatResultReceiverWrapper {
    public final AtomicReference RemoteActionCompatParcelizer;

    @Override // io.sentry.hints.read
    public final void IconCompatParcelizer(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        this.RemoteActionCompatParcelizer.set(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
    }

    @Override // io.sentry.hints.read
    public final boolean serializer(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) this.RemoteActionCompatParcelizer.get();
        return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 != null && r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2.equals(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
    }

    public getUriActionForCard(long j, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        super(j, brazeActionParserExternalSyntheticLambda0);
        this.RemoteActionCompatParcelizer = new AtomicReference();
    }
}
