package o;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class isPreinstallTrackingEnabled {
    public final MulticastConsumer read;
    public final Application write;

    public isPreinstallTrackingEnabled(Application application, MulticastConsumer multicastConsumer) {
        application.getClass();
        multicastConsumer.getClass();
        this.write = application;
        this.read = multicastConsumer;
    }
}
