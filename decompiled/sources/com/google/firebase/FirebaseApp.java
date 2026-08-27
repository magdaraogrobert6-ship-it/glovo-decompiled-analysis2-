package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Trace;
import android.util.Base64;
import androidx.room.Room;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AccessibilityIteratorsPageTextSegmentIteratorCompanion;
import o.ImageKt;
import o.MemoryCachedecodeFeatures11;
import o.MutatorMutexmutateWith2;
import o.accessgetGreencp;
import o.accessgetNumPadDirectionUpcp;
import o.accessgetSystemNavigationDowncp;
import o.getCachedAlignmentLineui;
import o.getChild;
import o.getHasMeasureResult;
import o.getPositionnOccac;
import o.isOutMostLookaheadRoot;
import o.isTreeConsistent;
import o.onSemanticsChange;
import o.provideRulerValue;
import o.updateChildMeasurables;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseApp {
    public final CopyOnWriteArrayList IconCompatParcelizer;
    public final AtomicBoolean MediaBrowserCompatMediaItem;
    public final AbstractComposeViewExternalSyntheticLambda0 MediaDescriptionCompat;
    public final CopyOnWriteArrayList MediaMetadataCompat;
    public final provideRulerValue MediaSessionCompatQueueItem;
    public final String ParcelableVolumeInfo;
    public final isTreeConsistent PlaybackStateCompatCustomAction;
    public final getPositionnOccac RatingCompat;
    public final AtomicBoolean RemoteActionCompatParcelizer;
    public final Context read;
    public static final Object write = new Object();
    public static final ImageKt serializer = new ImageKt(0);

    /* JADX INFO: loaded from: classes4.dex */
    public final class GlobalBackgroundStateListener implements accessgetNumPadDirectionUpcp {
        public static final AtomicReference IconCompatParcelizer = new AtomicReference();

        @Override // o.accessgetNumPadDirectionUpcp
        public final void read(boolean z) {
            synchronized (FirebaseApp.write) {
                for (FirebaseApp firebaseApp : new ArrayList(FirebaseApp.serializer.values())) {
                    if (firebaseApp.RemoteActionCompatParcelizer.get()) {
                        Iterator it = firebaseApp.IconCompatParcelizer.iterator();
                        while (it.hasNext()) {
                            FirebaseApp firebaseApp2 = ((updateChildMeasurables) it.next()).RemoteActionCompatParcelizer;
                            if (!z) {
                                ((onSemanticsChange) firebaseApp2.MediaDescriptionCompat.write()).serializer();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final class UserUnlockReceiver extends BroadcastReceiver {
        public static final AtomicReference read = new AtomicReference();
        public final Context serializer;

        public static void read(Context context) {
            AtomicReference atomicReference = read;
            if (atomicReference.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                while (!atomicReference.compareAndSet(null, userUnlockReceiver)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.write) {
                Iterator it = ((MutatorMutexmutateWith2) FirebaseApp.serializer.values()).iterator();
                while (it.hasNext()) {
                    ((FirebaseApp) it.next()).read();
                }
            }
            this.serializer.unregisterReceiver(this);
        }

        public UserUnlockReceiver(Context context) {
            this.serializer = context;
        }
    }

    public static FirebaseApp RemoteActionCompatParcelizer(Context context, isTreeConsistent istreeconsistent) {
        FirebaseApp firebaseApp;
        AtomicReference atomicReference = GlobalBackgroundStateListener.IconCompatParcelizer;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = GlobalBackgroundStateListener.IconCompatParcelizer;
            if (atomicReference2.get() == null) {
                GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                do {
                    if (atomicReference2.compareAndSet(null, globalBackgroundStateListener)) {
                        BackgroundDetector.read(application);
                        BackgroundDetector.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(globalBackgroundStateListener);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (write) {
            ImageKt imageKt = serializer;
            accessgetSystemNavigationDowncp.serializer("FirebaseApp name [DEFAULT] already exists!", !imageKt.containsKey("[DEFAULT]"));
            accessgetSystemNavigationDowncp.serializer(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, "[DEFAULT]", istreeconsistent);
            imageKt.put("[DEFAULT]", firebaseApp);
        }
        firebaseApp.read();
        return firebaseApp;
    }

    public static FirebaseApp write() {
        FirebaseApp firebaseApp;
        synchronized (write) {
            firebaseApp = (FirebaseApp) serializer.get("[DEFAULT]");
            if (firebaseApp == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + MemoryCachedecodeFeatures11.IconCompatParcelizer() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            ((onSemanticsChange) firebaseApp.MediaDescriptionCompat.write()).serializer();
        }
        return firebaseApp;
    }

    public final void IconCompatParcelizer() {
        accessgetSystemNavigationDowncp.serializer("FirebaseApp was deleted", !this.MediaBrowserCompatMediaItem.get());
    }

    public final int hashCode() {
        return this.ParcelableVolumeInfo.hashCode();
    }

    public final void read() {
        Context context = this.read;
        if (!Room.write(context)) {
            IconCompatParcelizer();
            UserUnlockReceiver.read(context);
            return;
        }
        IconCompatParcelizer();
        IconCompatParcelizer();
        this.RatingCompat.IconCompatParcelizer("[DEFAULT]".equals(this.ParcelableVolumeInfo));
        ((onSemanticsChange) this.MediaDescriptionCompat.write()).serializer();
    }

    public final String serializer() {
        StringBuilder sb = new StringBuilder();
        IconCompatParcelizer();
        byte[] bytes = this.ParcelableVolumeInfo.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        IconCompatParcelizer();
        byte[] bytes2 = this.PlaybackStateCompatCustomAction.IconCompatParcelizer.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final String toString() {
        accessgetGreencp accessgetgreencp = new accessgetGreencp(this);
        accessgetgreencp.IconCompatParcelizer(this.ParcelableVolumeInfo, "name");
        accessgetgreencp.IconCompatParcelizer(this.PlaybackStateCompatCustomAction, "options");
        return accessgetgreencp.toString();
    }

    public final boolean RemoteActionCompatParcelizer() {
        boolean z;
        IconCompatParcelizer();
        AccessibilityIteratorsPageTextSegmentIteratorCompanion accessibilityIteratorsPageTextSegmentIteratorCompanion = (AccessibilityIteratorsPageTextSegmentIteratorCompanion) this.MediaSessionCompatQueueItem.write();
        synchronized (accessibilityIteratorsPageTextSegmentIteratorCompanion) {
            z = accessibilityIteratorsPageTextSegmentIteratorCompanion.IconCompatParcelizer;
        }
        return z;
    }

    public final Object write(Class cls) {
        IconCompatParcelizer();
        return this.RatingCompat.read(cls);
    }

    public FirebaseApp(Context context, String str, isTreeConsistent istreeconsistent) {
        int i = 0;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.RemoteActionCompatParcelizer = atomicBoolean;
        this.MediaBrowserCompatMediaItem = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.IconCompatParcelizer = copyOnWriteArrayList;
        this.MediaMetadataCompat = new CopyOnWriteArrayList();
        this.read = context;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.ParcelableVolumeInfo = str;
        this.PlaybackStateCompatCustomAction = istreeconsistent;
        isOutMostLookaheadRoot isoutmostlookaheadroot = FirebaseInitProvider.startupTime;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList = new zzbv(context, 14, new zzz(getChild.class)).read();
        Trace.endSection();
        Trace.beginSection("Runtime");
        getCachedAlignmentLineui getcachedalignmentlineui = getCachedAlignmentLineui.INSTANCE;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList2.addAll(arrayList);
        int i2 = 1;
        arrayList2.add(new ComponentDiscovery$$ExternalSyntheticLambda0(i2, new FirebaseCommonRegistrar()));
        arrayList2.add(new ComponentDiscovery$$ExternalSyntheticLambda0(i2, new ExecutorsRegistrar()));
        arrayList3.add(getHasMeasureResult.IconCompatParcelizer(context, Context.class, new Class[0]));
        arrayList3.add(getHasMeasureResult.IconCompatParcelizer(this, FirebaseApp.class, new Class[0]));
        arrayList3.add(getHasMeasureResult.IconCompatParcelizer(istreeconsistent, isTreeConsistent.class, new Class[0]));
        PlaybackStateCompatCustomAction playbackStateCompatCustomAction = new PlaybackStateCompatCustomAction(29);
        if (Room.write(context) && FirebaseInitProvider.currentlyInitializing.get()) {
            arrayList3.add(getHasMeasureResult.IconCompatParcelizer(isoutmostlookaheadroot, isOutMostLookaheadRoot.class, new Class[0]));
        }
        getPositionnOccac getpositionnoccac = new getPositionnOccac(getcachedalignmentlineui, arrayList2, arrayList3, playbackStateCompatCustomAction);
        this.RatingCompat = getpositionnoccac;
        Trace.endSection();
        this.MediaSessionCompatQueueItem = new provideRulerValue(new FirebaseApp$$ExternalSyntheticLambda0(this, i, context));
        this.MediaDescriptionCompat = getpositionnoccac.write(onSemanticsChange.class);
        updateChildMeasurables updatechildmeasurables = new updateChildMeasurables(this);
        IconCompatParcelizer();
        if (atomicBoolean.get()) {
            BackgroundDetector.RemoteActionCompatParcelizer.write.get();
        }
        copyOnWriteArrayList.add(updatechildmeasurables);
        Trace.endSection();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        firebaseApp.IconCompatParcelizer();
        return this.ParcelableVolumeInfo.equals(firebaseApp.ParcelableVolumeInfo);
    }

    public static void write(Context context) {
        synchronized (write) {
            if (serializer.containsKey("[DEFAULT]")) {
                write();
                return;
            }
            isTreeConsistent istreeconsistent = isTreeConsistent.read(context);
            if (istreeconsistent == null) {
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
            } else {
                RemoteActionCompatParcelizer(context, istreeconsistent);
            }
        }
    }
}
