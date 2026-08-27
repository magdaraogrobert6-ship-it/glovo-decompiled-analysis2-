package io.sentry.android.core.internal.util;

import android.os.StrictMode;
import android.os.SystemClock;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements io.sentry.transport.MediaSessionCompatQueueItem, io.sentry.util.runtime.IconCompatParcelizer {
    public static final serializer IconCompatParcelizer = new serializer();

    @Override // io.sentry.transport.MediaSessionCompatQueueItem
    public long IconCompatParcelizer() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.util.runtime.IconCompatParcelizer
    public Object RemoteActionCompatParcelizer(io.sentry.util.runtime.read readVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            return readVar.A_();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // io.sentry.util.runtime.IconCompatParcelizer
    public void serializer(f$$ExternalSyntheticLambda1 f__externalsyntheticlambda1) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            f__externalsyntheticlambda1.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
}
