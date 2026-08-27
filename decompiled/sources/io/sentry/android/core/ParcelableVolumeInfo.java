package io.sentry.android.core;

import io.sentry.android.core.cache.AndroidEnvelopeCache;
import java.io.File;
import java.util.List;
import o.performDismissTeardown;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ParcelableVolumeInfo implements io.sentry.util.MediaSessionCompatQueueItem {
    public final /* synthetic */ SentryAndroidOptions RemoteActionCompatParcelizer;

    @Override // io.sentry.util.MediaSessionCompatQueueItem
    public Object evaluate() {
        List list = AndroidEnvelopeCache.write;
        SentryAndroidOptions sentryAndroidOptions = this.RemoteActionCompatParcelizer;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        boolean z = false;
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean zBooleanValue = ((Boolean) sentryAndroidOptions.getRuntimeManager().RemoteActionCompatParcelizer(new performDismissTeardown(file, 3))).booleanValue();
                if (zBooleanValue && !((Boolean) sentryAndroidOptions.getRuntimeManager().RemoteActionCompatParcelizer(new performDismissTeardown(file, 4))).booleanValue()) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z = zBooleanValue;
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            }
        }
        return Boolean.valueOf(z);
    }
}
