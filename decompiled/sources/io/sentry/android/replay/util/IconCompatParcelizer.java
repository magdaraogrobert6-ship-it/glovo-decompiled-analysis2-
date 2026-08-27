package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer implements Runnable {
    public final /* synthetic */ Runnable read;
    public final String serializer;

    @Override // java.lang.Runnable
    public final void run() {
        this.read.run();
    }

    public IconCompatParcelizer(Runnable runnable, String str) {
        runnable.getClass();
        this.serializer = str;
        this.read = runnable;
    }
}
