package io.sentry.featureflags;

import io.sentry.protocol.MediaBrowserCompatMediaItem;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer implements write {
    public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();

    public final /* bridge */ /* synthetic */ Object clone() {
        return read;
    }

    @Override // io.sentry.featureflags.write
    public final MediaBrowserCompatMediaItem write() {
        return null;
    }

    @Override // io.sentry.featureflags.write
    public final write RemoteActionCompatParcelizer() {
        return read;
    }
}
