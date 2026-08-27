package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.tasks.zzw;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNumPad7cp;
import o.accessgetNumPadDividecp;
import o.accessgetNumPadPageDowncp;
import o.accessgetScp;
import o.accessgetSlashcp;
import o.accessgetSpacebarcp;
import o.createnHHXs2Y;
import o.getBackEK5gGoQ;
import o.getVariationdefault;
import o.setMeasurementConstraintsBRTryo0;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleApiManager implements Handler.Callback {
    public static GoogleApiManager serializer;
    public final getBackEK5gGoQ ComponentActivity;
    public final Context MediaDescriptionCompat;
    public accessgetSlashcp MediaMetadataCompat;
    public final zzbv MediaSessionCompatToken;
    public final GoogleApiAvailability PlaybackStateCompatCustomAction;
    public TelemetryData RatingCompat;
    public volatile boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final Status RemoteActionCompatParcelizer = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status IconCompatParcelizer = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object write = new Object();
    public static volatile boolean read = false;
    public long MediaBrowserCompatMediaItem = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    public boolean MediaSessionCompatQueueItem = false;
    public final AtomicInteger PlaybackStateCompat = new AtomicInteger(1);
    public final AtomicInteger MediaSessionCompatResultReceiverWrapper = new AtomicInteger(0);
    public final ConcurrentHashMap ParcelableVolumeInfo = new ConcurrentHashMap(5, 0.75f, 1);
    public accessgetNumPadPageDowncp r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
    public final createnHHXs2Y ResultReceiver = new createnHHXs2Y(0);
    public final createnHHXs2Y r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new createnHHXs2Y(0);

    public static GoogleApiManager IconCompatParcelizer(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (write) {
            if (serializer == null) {
                Looper looper = zzq.IconCompatParcelizer().getLooper();
                context.getPackageName();
                read = true;
                GoogleApiManager googleApiManager2 = new GoogleApiManager(context.getApplicationContext(), looper, GoogleApiAvailability.getInstance());
                accessgetScp.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = setMeasurementConstraintsBRTryo0.IconCompatParcelizer(googleApiManager2.MediaDescriptionCompat);
                serializer = googleApiManager2;
            }
            googleApiManager = serializer;
        }
        return googleApiManager;
    }

    public static Status read(accessgetNumPadDividecp accessgetnumpaddividecp, ConnectionResult connectionResult) {
        String str = accessgetnumpaddividecp.write.write;
        String strValueOf = String.valueOf(connectionResult);
        return new Status(17, ff$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), connectionResult.serializer, connectionResult);
    }

    public final zabk IconCompatParcelizer(accessgetNumPad7cp accessgetnumpad7cp) {
        accessgetNumPadDividecp accessgetnumpaddividecp = accessgetnumpad7cp.MediaBrowserCompatMediaItem;
        ConcurrentHashMap concurrentHashMap = this.ParcelableVolumeInfo;
        zabk zabkVar = (zabk) concurrentHashMap.get(accessgetnumpaddividecp);
        if (zabkVar == null) {
            zabkVar = new zabk(this, accessgetnumpad7cp);
            concurrentHashMap.put(accessgetnumpaddividecp, zabkVar);
        }
        if (zabkVar.RemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.add(accessgetnumpaddividecp);
        }
        zabkVar.MediaSessionCompatQueueItem();
        return zabkVar;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:149:0x0306  */
    /* JADX WARN: Code duplicated, block: B:151:0x030a  */
    /* JADX WARN: Code duplicated, block: B:153:0x033b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0345  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v16 com.google.android.gms.common.api.internal.zabk, still in use, count: 2, list:
          (r2v16 com.google.android.gms.common.api.internal.zabk) from 0x02fe: IGET (r2v16 com.google.android.gms.common.api.internal.zabk) A[WRAPPED] (LINE:772) com.google.android.gms.common.api.internal.zabk.MediaSessionCompatQueueItem int
          (r2v16 com.google.android.gms.common.api.internal.zabk) from 0x0304: PHI (r2 I:??) = (r2v13 com.google.android.gms.common.api.internal.zabk), (r2v16 com.google.android.gms.common.api.internal.zabk) binds: [B:147:0x0303, B:216:0x0304] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.GoogleApiManager.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    public final void serializer(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls, int i, accessgetNumPad7cp accessgetnumpad7cp) {
        zabx zabxVar;
        if (i != 0) {
            accessgetNumPadDividecp accessgetnumpaddividecp = accessgetnumpad7cp.MediaBrowserCompatMediaItem;
            if (write()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) accessgetSpacebarcp.IconCompatParcelizer().read;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.IconCompatParcelizer) {
                        boolean z2 = rootTelemetryConfiguration.RemoteActionCompatParcelizer;
                        zabk zabkVar = (zabk) this.ParcelableVolumeInfo.get(accessgetnumpaddividecp);
                        if (zabkVar != null) {
                            accessgetScp accessgetscp = zabkVar.RemoteActionCompatParcelizer;
                            if (accessgetscp instanceof BaseGmsClient) {
                                accessgetScp accessgetscp2 = accessgetscp;
                                if (accessgetscp2.MediaSessionCompatQueueItem == null || accessgetscp2.PlaybackStateCompatCustomAction()) {
                                    z = z2;
                                } else {
                                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationIconCompatParcelizer = zabx.IconCompatParcelizer(zabkVar, accessgetscp2, i);
                                    if (connectionTelemetryConfigurationIconCompatParcelizer != null) {
                                        zabkVar.MediaSessionCompatResultReceiverWrapper++;
                                        z = connectionTelemetryConfigurationIconCompatParcelizer.write;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    zabxVar = null;
                }
                zabxVar = new zabx(this, i, accessgetnumpaddividecp, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                zabxVar = null;
            }
            if (zabxVar != null) {
                zzw zzwVar = parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
                getBackEK5gGoQ getbackek5ggoq = this.ComponentActivity;
                Objects.requireNonNull(getbackek5ggoq);
                zzwVar.addOnCompleteListener(new getVariationdefault(getbackek5ggoq), zabxVar);
            }
        }
    }

    public final void write(accessgetNumPadPageDowncp accessgetnumpadpagedowncp) {
        synchronized (write) {
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != accessgetnumpadpagedowncp) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = accessgetnumpadpagedowncp;
                this.ResultReceiver.clear();
            }
            this.ResultReceiver.addAll(accessgetnumpadpagedowncp.serializer);
        }
    }

    public final boolean write(ConnectionResult connectionResult, int i) {
        int i2 = connectionResult.IconCompatParcelizer;
        GoogleApiAvailability googleApiAvailability = this.PlaybackStateCompatCustomAction;
        if (googleApiAvailability.zaj(i2)) {
            return googleApiAvailability.zad(this.MediaDescriptionCompat, connectionResult, i);
        }
        SentryLogcatAdapter.IconCompatParcelizer("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(connectionResult)));
        return false;
    }

    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
        this.MediaDescriptionCompat = context;
        getBackEK5gGoQ getbackek5ggoq = new getBackEK5gGoQ(looper, this);
        Looper.getMainLooper();
        this.ComponentActivity = getbackek5ggoq;
        this.PlaybackStateCompatCustomAction = googleApiAvailability;
        this.MediaSessionCompatToken = new zzbv(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (DefaultContentCardsUpdateHandlerCompanionCREATOR1.MediaBrowserCompatMediaItem == null) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.MediaBrowserCompatMediaItem = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (DefaultContentCardsUpdateHandlerCompanionCREATOR1.MediaBrowserCompatMediaItem.booleanValue()) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
        }
        getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(6));
    }

    public final boolean write() {
        int i;
        if (this.MediaSessionCompatQueueItem) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) accessgetSpacebarcp.IconCompatParcelizer().read;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.IconCompatParcelizer) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.MediaSessionCompatToken.write;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final void IconCompatParcelizer(ConnectionResult connectionResult, int i) {
        if (write(connectionResult, i)) {
            return;
        }
        getBackEK5gGoQ getbackek5ggoq = this.ComponentActivity;
        getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(5, i, 0, connectionResult));
    }
}
