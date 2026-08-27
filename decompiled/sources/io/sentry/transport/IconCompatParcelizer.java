package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer implements MediaSessionCompatQueueItem {
    public static final IconCompatParcelizer write = new IconCompatParcelizer();

    @Override // io.sentry.transport.MediaSessionCompatQueueItem
    public final long IconCompatParcelizer() {
        return System.currentTimeMillis();
    }
}
