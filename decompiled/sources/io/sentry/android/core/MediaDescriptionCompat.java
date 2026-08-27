package io.sentry.android.core;

import android.os.Debug;
import o.containsAnyPushPermissionBrazeActions;
import o.getSrcJson;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaDescriptionCompat implements containsAnyPushPermissionBrazeActions {
    @Override // o.containsAnyPushPermissionBrazeActions
    public final void read() {
    }

    @Override // o.containsAnyPushPermissionBrazeActions
    public final void serializer(getSrcJson getsrcjson) {
        long j = Runtime.getRuntime().totalMemory();
        long jFreeMemory = Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize();
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize();
        getsrcjson.RemoteActionCompatParcelizer = Long.valueOf(j - jFreeMemory);
        getsrcjson.write = Long.valueOf(nativeHeapSize - nativeHeapFreeSize);
    }
}
