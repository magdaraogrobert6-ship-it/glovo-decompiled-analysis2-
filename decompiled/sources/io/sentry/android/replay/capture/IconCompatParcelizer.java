package io.sentry.android.replay.capture;

import io.sentry.SentryOptions;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import o.displayInAppMessagelambda4;
import o.getCieXyz;
import o.isAutomaticGeofenceRequestsEnabled;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.registerInAppMessageManagerlambda2;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer implements displayInAppMessagelambda4 {
    public final /* synthetic */ RemoteActionCompatParcelizer IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ RemoteActionCompatParcelizer serializer;
    public final AtomicReference write;

    @Override // o.displayInAppMessagelambda13
    public final Object getValue(Object obj, registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2) {
        int i = this.RemoteActionCompatParcelizer;
        AtomicReference atomicReference = this.write;
        registerinappmessagemanagerlambda2.getClass();
        if (i == 0) {
            return atomicReference.get();
        }
        if (i == 1) {
            return atomicReference.get();
        }
        if (i == 2) {
            return atomicReference.get();
        }
        if (i != 3) {
            return i != 4 ? atomicReference.get() : atomicReference.get();
        }
        return atomicReference.get();
    }

    @Override // o.displayInAppMessagelambda4
    public final void setValue(Object obj, registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.serializer;
        AtomicReference atomicReference = this.write;
        registerinappmessagemanagerlambda2.getClass();
        if (i == 0) {
            Object andSet = atomicReference.getAndSet(obj2);
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{andSet, obj2}, iWrite3)).booleanValue()) {
                return;
            }
            read readVar = new read(andSet, obj2, remoteActionCompatParcelizer2, 0);
            SentryOptions sentryOptions = remoteActionCompatParcelizer.RatingCompat;
            if (sentryOptions.getThreadChecker().IconCompatParcelizer()) {
                ((ScheduledExecutorService) remoteActionCompatParcelizer.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).submit(new io.sentry.android.replay.util.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(22, readVar), "CaptureStrategy.runInBackground"));
                return;
            }
            try {
                readVar.invoke();
                return;
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                return;
            }
        }
        int i2 = 1;
        if (i == 1) {
            Object andSet2 = atomicReference.getAndSet(obj2);
            int iWrite4 = getCieXyz.write();
            int iWrite5 = getCieXyz.write();
            int iWrite6 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{andSet2, obj2}, iWrite6)).booleanValue()) {
                return;
            }
            read readVar2 = new read(andSet2, obj2, remoteActionCompatParcelizer2, i2);
            SentryOptions sentryOptions2 = remoteActionCompatParcelizer.RatingCompat;
            if (sentryOptions2.getThreadChecker().IconCompatParcelizer()) {
                ((ScheduledExecutorService) remoteActionCompatParcelizer.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).submit(new io.sentry.android.replay.util.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(23, readVar2), "CaptureStrategy.runInBackground"));
                return;
            }
            try {
                readVar2.invoke();
                return;
            } catch (Throwable th2) {
                sentryOptions2.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                return;
            }
        }
        int i3 = 2;
        if (i == 2) {
            Object andSet3 = atomicReference.getAndSet(obj2);
            int iWrite7 = getCieXyz.write();
            int iWrite8 = getCieXyz.write();
            int iWrite9 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite7, 1803334089, -1803334089, getCieXyz.write(), iWrite8, new Object[]{andSet3, obj2}, iWrite9)).booleanValue()) {
                return;
            }
            read readVar3 = new read(andSet3, obj2, remoteActionCompatParcelizer2, i3);
            SentryOptions sentryOptions3 = remoteActionCompatParcelizer.RatingCompat;
            if (sentryOptions3.getThreadChecker().IconCompatParcelizer()) {
                ((ScheduledExecutorService) remoteActionCompatParcelizer.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).submit(new io.sentry.android.replay.util.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(24, readVar3), "CaptureStrategy.runInBackground"));
                return;
            }
            try {
                readVar3.invoke();
                return;
            } catch (Throwable th3) {
                sentryOptions3.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th3);
                return;
            }
        }
        int i4 = 3;
        if (i == 3) {
            Object andSet4 = atomicReference.getAndSet(obj2);
            int iWrite10 = getCieXyz.write();
            int iWrite11 = getCieXyz.write();
            int iWrite12 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite10, 1803334089, -1803334089, getCieXyz.write(), iWrite11, new Object[]{andSet4, obj2}, iWrite12)).booleanValue()) {
                return;
            }
            read readVar4 = new read(andSet4, obj2, remoteActionCompatParcelizer2, i4);
            SentryOptions sentryOptions4 = remoteActionCompatParcelizer.RatingCompat;
            if (sentryOptions4.getThreadChecker().IconCompatParcelizer()) {
                ((ScheduledExecutorService) remoteActionCompatParcelizer.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).submit(new io.sentry.android.replay.util.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(25, readVar4), "CaptureStrategy.runInBackground"));
                return;
            }
            try {
                readVar4.invoke();
                return;
            } catch (Throwable th4) {
                sentryOptions4.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th4);
                return;
            }
        }
        int i5 = 4;
        if (i != 4) {
            Object andSet5 = atomicReference.getAndSet(obj2);
            int iWrite13 = getCieXyz.write();
            int iWrite14 = getCieXyz.write();
            int iWrite15 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite13, 1803334089, -1803334089, getCieXyz.write(), iWrite14, new Object[]{andSet5, obj2}, iWrite15)).booleanValue()) {
                return;
            }
            read readVar5 = new read(andSet5, obj2, remoteActionCompatParcelizer2, 5);
            SentryOptions sentryOptions5 = remoteActionCompatParcelizer.RatingCompat;
            if (sentryOptions5.getThreadChecker().IconCompatParcelizer()) {
                ((ScheduledExecutorService) remoteActionCompatParcelizer.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).submit(new io.sentry.android.replay.util.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(27, readVar5), "CaptureStrategy.runInBackground"));
                return;
            }
            try {
                readVar5.invoke();
                return;
            } catch (Throwable th5) {
                sentryOptions5.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th5);
                return;
            }
        }
        Object andSet6 = atomicReference.getAndSet(obj2);
        int iWrite16 = getCieXyz.write();
        int iWrite17 = getCieXyz.write();
        int iWrite18 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite16, 1803334089, -1803334089, getCieXyz.write(), iWrite17, new Object[]{andSet6, obj2}, iWrite18)).booleanValue()) {
            return;
        }
        read readVar6 = new read(andSet6, obj2, remoteActionCompatParcelizer2, i5);
        SentryOptions sentryOptions6 = remoteActionCompatParcelizer.RatingCompat;
        if (sentryOptions6.getThreadChecker().IconCompatParcelizer()) {
            ((ScheduledExecutorService) remoteActionCompatParcelizer.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).submit(new io.sentry.android.replay.util.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(26, readVar6), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            readVar6.invoke();
        } catch (Throwable th6) {
            sentryOptions6.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th6);
        }
    }

    public IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2, int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i == 2) {
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            this.serializer = remoteActionCompatParcelizer2;
            this.write = new AtomicReference(null);
            return;
        }
        if (i == 3) {
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            this.serializer = remoteActionCompatParcelizer2;
            this.write = new AtomicReference(null);
        } else if (i == 4) {
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            this.serializer = remoteActionCompatParcelizer2;
            this.write = new AtomicReference(null);
        } else if (i != 5) {
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            this.serializer = remoteActionCompatParcelizer2;
            this.write = new AtomicReference(-1);
        } else {
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            this.serializer = remoteActionCompatParcelizer2;
            this.write = new AtomicReference(null);
        }
    }

    public IconCompatParcelizer(Object obj, RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        this.serializer = remoteActionCompatParcelizer2;
        this.write = new AtomicReference(obj);
    }
}
