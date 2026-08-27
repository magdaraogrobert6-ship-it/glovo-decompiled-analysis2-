package io.sentry.cache;

import java.io.File;
import java.util.Comparator;
import o.handlePushNotificationPayloadlambda7;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class write implements Comparator {
    public final /* synthetic */ int serializer;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.serializer != 0 ? ((handlePushNotificationPayloadlambda7) obj2).RatingCompat() - ((handlePushNotificationPayloadlambda7) obj).RatingCompat() : Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}
