package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.measurement.zzcq;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfa;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.net.zza;
import com.google.android.gms.tasks.zzc;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o.ImageKt;
import o.ImageVectorCacheImageVectorEntry;
import o.LookaheadScope;
import o.LookaheadScopeKtLookaheadScope21;
import o.LookaheadScopeKtLookaheadScope221;
import o.LookaheadScopeKtLookaheadScope4;
import o.MeasureScopeMarker;
import o.MeasuringIntrinsics;
import o.MeasuringIntrinsicsEmptyPlaceable;
import o.NoOpSubcomposeSlotReusePolicy;
import o.NoWindowInsetsAnimation;
import o.OnFirstVisibleNode;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvTeletextcp;
import o.accessgetTwocp;
import o.accessgetWcp;
import o.disposeAndRegister;
import o.getCallback;
import o.getExtra;
import o.getHasPremeasured;
import o.getLookaheadDelegate;
import o.getProgramYellowEK5gGoQ;
import o.getQEK5gGoQ;
import o.getRightBracketEK5gGoQ;
import o.getSemicolonEK5gGoQ;
import o.getViewportBounds;
import o.getWidthHeight;
import o.maxWidth;
import o.minWidth;
import o.onLayoutRectChangeddefault;
import o.resume;

/* JADX INFO: loaded from: classes2.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends zzcq {
    public LookaheadScopeKtLookaheadScope221 zza;
    public final ImageKt zzb;

    @Override // o.getProgramRedEK5gGoQ
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setConsent(Bundle bundle, long j) throws RemoteException {
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setInstanceIdProvider(getSemicolonEK5gGoQ getsemicolonek5ggoq) throws RemoteException {
        zzb();
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.zza = null;
        this.zzb = new ImageKt(0);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void retrieveAndUploadBatches(getRightBracketEK5gGoQ getrightbracketek5ggoq) {
        int i;
        getCallback getcallback;
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        zza zzaVar = new zza(this, 24, getrightbracketek5ggoq);
        noWindowInsetsAnimation.serializer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        if (lookaheadScopeKtLookaheadScope4.MediaMetadataCompat()) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
        if (Thread.currentThread() == lookaheadScopeKtLookaheadScope5.write) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.RemoteActionCompatParcelizer("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean z = accessgetWcp.read();
        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        if (z) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.serializer.RemoteActionCompatParcelizer("Cannot retrieve and upload batches from main thread");
            return;
        }
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
        getlookaheaddelegate3.PlaybackStateCompat.RemoteActionCompatParcelizer("[sgtm] Started client-side batch upload work.");
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        while (!z3) {
            getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
            getlookaheaddelegate4.PlaybackStateCompat.RemoteActionCompatParcelizer("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope6 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope6);
            lookaheadScopeKtLookaheadScope6.write(atomicReference, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, "[sgtm] Getting upload batches", new MeasuringIntrinsicsEmptyPlaceable(noWindowInsetsAnimation, atomicReference, 7, z2));
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.read;
            if (list.isEmpty()) {
                break;
            }
            getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
            getlookaheaddelegate5.PlaybackStateCompat.serializer(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            int size = i2 + list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = size;
                    z3 = false;
                    break;
                }
                zzom zzomVar = (zzom) it.next();
                try {
                    URL url = new URI(zzomVar.read).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    resume resumeVarMediaMetadataCompat = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaMetadataCompat();
                    resumeVarMediaMetadataCompat.serializer();
                    accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) resumeVarMediaMetadataCompat.MediaSessionCompatQueueItem);
                    String str = resumeVarMediaMetadataCompat.MediaSessionCompatQueueItem;
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                    zzgs zzgsVar = getlookaheaddelegate6.PlaybackStateCompat;
                    i = size;
                    Long lValueOf = Long.valueOf(zzomVar.write);
                    zzgsVar.IconCompatParcelizer("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.read, Integer.valueOf(zzomVar.RemoteActionCompatParcelizer.length));
                    if (!TextUtils.isEmpty(zzomVar.RatingCompat)) {
                        getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                        getlookaheaddelegate7.PlaybackStateCompat.serializer("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.RatingCompat);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = zzomVar.serializer;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    NoOpSubcomposeSlotReusePolicy noOpSubcomposeSlotReusePolicy = lookaheadScopeKtLookaheadScope222.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    LookaheadScopeKtLookaheadScope221.write(noOpSubcomposeSlotReusePolicy);
                    byte[] bArr = zzomVar.RemoteActionCompatParcelizer;
                    accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp(noWindowInsetsAnimation, atomicReference2, zzomVar, 19);
                    noOpSubcomposeSlotReusePolicy.ComponentActivity();
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(url);
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(bArr);
                    LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope7 = ((LookaheadScopeKtLookaheadScope221) noOpSubcomposeSlotReusePolicy.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope7);
                    lookaheadScopeKtLookaheadScope7.serializer((Runnable) new LookaheadScope(noOpSubcomposeSlotReusePolicy, str, url, bArr, map, accessgettvteletextcp));
                    try {
                        onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope222.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        lookaheadScopeKtLookaheadScope223.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = (jCurrentTimeMillis + 60000) - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    lookaheadScopeKtLookaheadScope223.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        getLookaheadDelegate getlookaheaddelegate8 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate8);
                        getlookaheaddelegate8.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("[sgtm] Interrupted waiting for uploading batch");
                    }
                    getcallback = atomicReference2.get() == null ? getCallback.UNKNOWN : (getCallback) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    i = size;
                    getLookaheadDelegate getlookaheaddelegate9 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate9);
                    getlookaheaddelegate9.serializer.IconCompatParcelizer("[sgtm] Bad upload url for row_id", zzomVar.read, Long.valueOf(zzomVar.write), e);
                    getcallback = getCallback.FAILURE;
                }
                if (getcallback != getCallback.SUCCESS) {
                    if (getcallback == getCallback.BACKOFF) {
                        z3 = true;
                        break;
                    }
                } else {
                    i3++;
                }
                size = i;
            }
            i2 = i;
            z2 = false;
        }
        getLookaheadDelegate getlookaheaddelegate10 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate10);
        getlookaheaddelegate10.PlaybackStateCompat.serializer("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i2), Integer.valueOf(i3));
        zzaVar.run();
    }

    @Override // o.getProgramRedEK5gGoQ
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        getHasPremeasured gethaspremeasured = this.zza.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        LookaheadScopeKtLookaheadScope221.write(gethaspremeasured);
        gethaspremeasured.serializer(j, str);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.write(str, str2, bundle);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.serializer();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new zza(noWindowInsetsAnimation, null, false, 16));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        getHasPremeasured gethaspremeasured = this.zza.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        LookaheadScopeKtLookaheadScope221.write(gethaspremeasured);
        gethaspremeasured.write(j, str);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void generateEventId(getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        onLayoutRectChangeddefault onlayoutrectchangeddefault = this.zza.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        long jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onlayoutrectchangeddefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        zzb();
        onLayoutRectChangeddefault onlayoutrectchangeddefault2 = this.zza.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
        onlayoutrectchangeddefault2.write(getqek5ggoq, jR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void getAppInstanceId(getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = this.zza.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new LookaheadScopeKtLookaheadScope21(this, getqek5ggoq, 0));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void getCachedAppInstanceId(getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        zzc((String) noWindowInsetsAnimation.MediaMetadataCompat.get(), getqek5ggoq);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void getConditionalUserProperties(String str, String str2, getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = this.zza.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new ImageVectorCacheImageVectorEntry(this, getqek5ggoq, str, str2));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void getCurrentScreenClass(getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        OnFirstVisibleNode onFirstVisibleNode = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ResultReceiver;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        getViewportBounds getviewportbounds = onFirstVisibleNode.IconCompatParcelizer;
        zzc(getviewportbounds != null ? getviewportbounds.write : null, getqek5ggoq);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void getCurrentScreenName(getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        OnFirstVisibleNode onFirstVisibleNode = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ResultReceiver;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        getViewportBounds getviewportbounds = onFirstVisibleNode.IconCompatParcelizer;
        zzc(getviewportbounds != null ? getviewportbounds.read : null, getqek5ggoq);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void getGmpAppId(getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        zzc(noWindowInsetsAnimation.ComponentActivity(), getqek5ggoq);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void getMaxUserProperties(String str, getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        zzb();
        onLayoutRectChangeddefault onlayoutrectchangeddefault = this.zza.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        onlayoutrectchangeddefault.serializer(getqek5ggoq, 25);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void getSessionId(getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new zza(noWindowInsetsAnimation, getqek5ggoq));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void getUserProperties(String str, String str2, boolean z, getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = this.zza.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new maxWidth(this, getqek5ggoq, str, str2, z));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void isDataCollectionEnabled(getQEK5gGoQ getqek5ggoq) throws RemoteException {
        zzb();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = this.zza.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new LookaheadScopeKtLookaheadScope21(this, getqek5ggoq, 1));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.RemoteActionCompatParcelizer(str, str2, bundle, z, z2, j);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void logEventAndBundle(String str, String str2, Bundle bundle, getQEK5gGoQ getqek5ggoq, long j) throws RemoteException {
        zzb();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        zzbg zzbgVar = new zzbg(str2, new zzbe(bundle), "app", j);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = this.zza.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new ImageVectorCacheImageVectorEntry(this, getqek5ggoq, zzbgVar, str));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityCreated(accessgetTwocp accessgettwocp, Bundle bundle, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(accessgettwocp);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(activity);
        onActivityCreatedByScionActivityInfo(zzdf.IconCompatParcelizer(activity), bundle, j);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        zzfa zzfaVar = noWindowInsetsAnimation.IconCompatParcelizer;
        if (zzfaVar != null) {
            NoWindowInsetsAnimation noWindowInsetsAnimation2 = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
            noWindowInsetsAnimation2.ResultReceiver();
            zzfaVar.write(zzdfVar, bundle);
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityDestroyed(accessgetTwocp accessgettwocp, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(accessgettwocp);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(activity);
        onActivityDestroyedByScionActivityInfo(zzdf.IconCompatParcelizer(activity), j);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        zzfa zzfaVar = noWindowInsetsAnimation.IconCompatParcelizer;
        if (zzfaVar != null) {
            NoWindowInsetsAnimation noWindowInsetsAnimation2 = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
            noWindowInsetsAnimation2.ResultReceiver();
            zzfaVar.RemoteActionCompatParcelizer(zzdfVar);
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityPaused(accessgetTwocp accessgettwocp, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(accessgettwocp);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(activity);
        onActivityPausedByScionActivityInfo(zzdf.IconCompatParcelizer(activity), j);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        zzfa zzfaVar = noWindowInsetsAnimation.IconCompatParcelizer;
        if (zzfaVar != null) {
            NoWindowInsetsAnimation noWindowInsetsAnimation2 = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
            noWindowInsetsAnimation2.ResultReceiver();
            zzfaVar.read(zzdfVar);
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityResumed(accessgetTwocp accessgettwocp, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(accessgettwocp);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(activity);
        onActivityResumedByScionActivityInfo(zzdf.IconCompatParcelizer(activity), j);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        zzfa zzfaVar = noWindowInsetsAnimation.IconCompatParcelizer;
        if (zzfaVar != null) {
            NoWindowInsetsAnimation noWindowInsetsAnimation2 = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
            noWindowInsetsAnimation2.ResultReceiver();
            zzfaVar.write(zzdfVar);
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivitySaveInstanceState(accessgetTwocp accessgettwocp, getQEK5gGoQ getqek5ggoq, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(accessgettwocp);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.IconCompatParcelizer(activity), getqek5ggoq, j);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, getQEK5gGoQ getqek5ggoq, long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        zzfa zzfaVar = noWindowInsetsAnimation.IconCompatParcelizer;
        Bundle bundle = new Bundle();
        if (zzfaVar != null) {
            NoWindowInsetsAnimation noWindowInsetsAnimation2 = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
            noWindowInsetsAnimation2.ResultReceiver();
            zzfaVar.RemoteActionCompatParcelizer(zzdfVar, bundle);
        }
        try {
            getqek5ggoq.RemoteActionCompatParcelizer(bundle);
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate = this.zza.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityStarted(accessgetTwocp accessgettwocp, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(accessgettwocp);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(activity);
        onActivityStartedByScionActivityInfo(zzdf.IconCompatParcelizer(activity), j);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        if (noWindowInsetsAnimation.IconCompatParcelizer != null) {
            NoWindowInsetsAnimation noWindowInsetsAnimation2 = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
            noWindowInsetsAnimation2.ResultReceiver();
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityStopped(accessgetTwocp accessgettwocp, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(accessgettwocp);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(activity);
        onActivityStoppedByScionActivityInfo(zzdf.IconCompatParcelizer(activity), j);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        if (noWindowInsetsAnimation.IconCompatParcelizer != null) {
            NoWindowInsetsAnimation noWindowInsetsAnimation2 = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
            noWindowInsetsAnimation2.ResultReceiver();
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void registerOnMeasurementEventListener(getProgramYellowEK5gGoQ getprogramyellowek5ggoq) throws RemoteException {
        minWidth disposeandregister;
        zzb();
        ImageKt imageKt = this.zzb;
        synchronized (imageKt) {
            disposeandregister = (minWidth) imageKt.get(Integer.valueOf(getprogramyellowek5ggoq.IconCompatParcelizer()));
            if (disposeandregister == null) {
                disposeandregister = new disposeAndRegister(this, getprogramyellowek5ggoq);
                imageKt.put(Integer.valueOf(getprogramyellowek5ggoq.IconCompatParcelizer()), disposeandregister);
            }
        }
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.IconCompatParcelizer(disposeandregister);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.MediaMetadataCompat.set(null);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new getWidthHeight(noWindowInsetsAnimation, j, 1));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = this.zza;
        if (bundle == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Conditional user property must not be null");
        } else {
            NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope221.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
            noWindowInsetsAnimation.RemoteActionCompatParcelizer(bundle, j);
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.IconCompatParcelizer(bundle, -20, j);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setCurrentScreen(accessgetTwocp accessgettwocp, String str, String str2, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(accessgettwocp);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(activity);
        setCurrentScreenByScionActivityInfo(zzdf.IconCompatParcelizer(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    @Override // o.getProgramRedEK5gGoQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf r6, java.lang.String r7, java.lang.String r8, long r9) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf, java.lang.String, java.lang.String, long):void");
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.serializer();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new MeasuringIntrinsics(noWindowInsetsAnimation, z));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new getExtra(noWindowInsetsAnimation, bundle2, 2));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.serializer();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new zza(noWindowInsetsAnimation, Boolean.valueOf(z), false, 16));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new getWidthHeight(noWindowInsetsAnimation, j, 0));
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        Uri data = intent.getData();
        if (data == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaMetadataCompat.RemoteActionCompatParcelizer("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.MediaMetadataCompat.RemoteActionCompatParcelizer("[sgtm] Preview Mode was not enabled.");
            lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.serializer = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
        getlookaheaddelegate3.MediaMetadataCompat.serializer(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.serializer = queryParameter2;
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setUserId(String str, long j) throws RemoteException {
        zzb();
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (str != null && TextUtils.isEmpty(str)) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("User ID must be non-empty or null");
        } else {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write((Runnable) new zzc(noWindowInsetsAnimation, 13, str));
            noWindowInsetsAnimation.write(null, "_id", str, true, j);
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setUserProperty(String str, String str2, accessgetTwocp accessgettwocp, boolean z, long j) throws RemoteException {
        zzb();
        Object objUnwrap = ObjectWrapper.unwrap(accessgettwocp);
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.write(str, str2, objUnwrap, z, j);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void unregisterOnMeasurementEventListener(getProgramYellowEK5gGoQ getprogramyellowek5ggoq) throws RemoteException {
        Object disposeandregister;
        zzb();
        ImageKt imageKt = this.zzb;
        synchronized (imageKt) {
            disposeandregister = (minWidth) imageKt.remove(Integer.valueOf(getprogramyellowek5ggoq.IconCompatParcelizer()));
        }
        if (disposeandregister == null) {
            disposeandregister = new disposeAndRegister(this, getprogramyellowek5ggoq);
        }
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
        noWindowInsetsAnimation.serializer();
        if (noWindowInsetsAnimation.RatingCompat.remove(disposeandregister)) {
            return;
        }
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("OnEventListener had not been registered");
    }

    public final void zzc(String str, getQEK5gGoQ getqek5ggoq) {
        zzb();
        onLayoutRectChangeddefault onlayoutrectchangeddefault = this.zza.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        onlayoutrectchangeddefault.read(str, getqek5ggoq);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void initialize(accessgetTwocp accessgettwocp, zzdd zzddVar, long j) throws RemoteException {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = this.zza;
        if (lookaheadScopeKtLookaheadScope221 == null) {
            Context context = (Context) ObjectWrapper.unwrap(accessgettwocp);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
            this.zza = LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(context, zzddVar, Long.valueOf(j));
        } else {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Attempting to initialize multiple times");
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void performAction(Bundle bundle, getQEK5gGoQ getqek5ggoq, long j) throws RemoteException {
        zzb();
        getqek5ggoq.RemoteActionCompatParcelizer(null);
    }

    public final void zzb() {
        if (this.zza != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Attempting to perform action before initialize.");
    }

    @Override // o.getProgramRedEK5gGoQ
    public void logHealthData(int i, String str, accessgetTwocp accessgettwocp, accessgetTwocp accessgettwocp2, accessgetTwocp accessgettwocp3) throws RemoteException {
        zzb();
        Object objUnwrap = accessgettwocp == null ? null : ObjectWrapper.unwrap(accessgettwocp);
        Object objUnwrap2 = accessgettwocp2 == null ? null : ObjectWrapper.unwrap(accessgettwocp2);
        Object objUnwrap3 = accessgettwocp3 != null ? ObjectWrapper.unwrap(accessgettwocp3) : null;
        getLookaheadDelegate getlookaheaddelegate = this.zza.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.serializer(i, true, false, str, objUnwrap, objUnwrap2, objUnwrap3);
    }

    @Override // o.getProgramRedEK5gGoQ
    public void setEventInterceptor(getProgramYellowEK5gGoQ getprogramyellowek5ggoq) throws RemoteException {
        zzb();
        zzbv zzbvVar = new zzbv(this, getprogramyellowek5ggoq, false, 8);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = this.zza.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        boolean zMediaMetadataCompat = lookaheadScopeKtLookaheadScope4.MediaMetadataCompat();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = this.zza;
        if (zMediaMetadataCompat) {
            NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope221.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
            noWindowInsetsAnimation.write((MeasureScopeMarker) zzbvVar);
        } else {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
            lookaheadScopeKtLookaheadScope5.write((Runnable) new zza(this, zzbvVar, false, 18));
        }
    }

    @Override // o.getProgramRedEK5gGoQ
    public void getTestFlag(getQEK5gGoQ getqek5ggoq, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            onLayoutRectChangeddefault onlayoutrectchangeddefault = this.zza.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            NoWindowInsetsAnimation noWindowInsetsAnimation = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
            AtomicReference atomicReference = new AtomicReference();
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            onlayoutrectchangeddefault.read((String) lookaheadScopeKtLookaheadScope4.write(atomicReference, 15000L, "String test flag value", new MeasuringIntrinsicsEmptyPlaceable(noWindowInsetsAnimation, atomicReference, 2)), getqek5ggoq);
            return;
        }
        if (i == 1) {
            onLayoutRectChangeddefault onlayoutrectchangeddefault2 = this.zza.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
            NoWindowInsetsAnimation noWindowInsetsAnimation2 = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
            AtomicReference atomicReference2 = new AtomicReference();
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
            onlayoutrectchangeddefault2.write(getqek5ggoq, ((Long) lookaheadScopeKtLookaheadScope5.write(atomicReference2, 15000L, "long test flag value", new MeasuringIntrinsicsEmptyPlaceable(noWindowInsetsAnimation2, atomicReference2, 3))).longValue());
            return;
        }
        if (i == 2) {
            onLayoutRectChangeddefault onlayoutrectchangeddefault3 = this.zza.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
            NoWindowInsetsAnimation noWindowInsetsAnimation3 = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation3);
            AtomicReference atomicReference3 = new AtomicReference();
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope6 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope6);
            double dDoubleValue = ((Double) lookaheadScopeKtLookaheadScope6.write(atomicReference3, 15000L, "double test flag value", new MeasuringIntrinsicsEmptyPlaceable(noWindowInsetsAnimation3, atomicReference3, 5))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                getqek5ggoq.RemoteActionCompatParcelizer(bundle);
                return;
            } catch (RemoteException e) {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            onLayoutRectChangeddefault onlayoutrectchangeddefault4 = this.zza.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault4);
            NoWindowInsetsAnimation noWindowInsetsAnimation4 = this.zza.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation4);
            AtomicReference atomicReference4 = new AtomicReference();
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope7 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope7);
            onlayoutrectchangeddefault4.serializer(getqek5ggoq, ((Integer) lookaheadScopeKtLookaheadScope7.write(atomicReference4, 15000L, "int test flag value", new MeasuringIntrinsicsEmptyPlaceable(noWindowInsetsAnimation4, atomicReference4, 4))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        onLayoutRectChangeddefault onlayoutrectchangeddefault5 = this.zza.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault5);
        NoWindowInsetsAnimation noWindowInsetsAnimation5 = this.zza.ComponentActivity;
        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation5);
        AtomicReference atomicReference5 = new AtomicReference();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope8 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope8);
        onlayoutrectchangeddefault5.write(getqek5ggoq, ((Boolean) lookaheadScopeKtLookaheadScope8.write(atomicReference5, 15000L, "boolean test flag value", new MeasuringIntrinsicsEmptyPlaceable(noWindowInsetsAnimation5, atomicReference5, 0))).booleanValue());
    }
}
