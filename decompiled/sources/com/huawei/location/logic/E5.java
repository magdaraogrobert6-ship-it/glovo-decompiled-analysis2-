package com.huawei.location.logic;

import android.content.Context;
import android.content.IntentFilter;
import android.media.Image;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.face.internal.zzm;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.callback.d2;
import com.huawei.location.lite.common.chain.TaskTimeOutException;
import com.huawei.location.lite.common.util.NetworkUtil;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.TextStreamsKt;
import o.Api30Impl;
import o.AutoClearFocusBehaviorCompanion;
import o.ContentCaptureSessionCompat;
import o.DateTimeConverter;
import o.DistanceAndFlags;
import o.DrawableTransformation;
import o.ExtendedFabSmallTokens;
import o.InAppMessageHtmlBaseViewCompanion;
import o.JsonUtilsExternalSyntheticLambda1;
import o.LifecycleAwarelambda0;
import o.TriStateCheckbox;
import o.WindowRecomposerFactory;
import o.WindowRecomposerPolicy;
import o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1;
import o.WrappedCompositionsetContent1211;
import o.accessgetCursorInBoundsOfNodep;
import o.accessgetSystemNavigationDowncp;
import o.accesssetStatep;
import o.calculateWindowSize;
import o.displayIconIfDescendantsDoNotHavePriority;
import o.findDescendantNodeWithCursorInBounds;
import o.getAndSetFactory;
import o.getAppropriateImageUrl;
import o.getCacheFileSuffix;
import o.getContentCaptureSession;
import o.getContentChild;
import o.getGlobalKeyboardModifiersui;
import o.getMeasurable;
import o.getOriginalEventPositionF1C5BW0ui;
import o.getPanOffsetF1C5BW0;
import o.getParentData;
import o.getPlatformAndroidManager;
import o.getTitleResource;
import o.getWindowRecomposerannotations;
import o.isRelevantPointerTypeuerMTgs;
import o.isValidPushStoryClickInputlambda0;
import o.newViewStructure;
import o.onEnter;
import o.onHideTranslationui;
import o.onPrepareActionMode;
import o.placeAtf8xVGno;
import o.r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdakcTilwmporjFCAWe8ASdQv1Ks;
import o.readAnimationScale;
import o.resetMessageMargins;
import o.setDateOfBirthlambda3;
import o.setDownChange;
import o.setOnCopyRequested;
import o.setRequestedFrameRate;
import o.toMotionEventScoped4ec7I;

/* JADX INFO: loaded from: classes2.dex */
public final class E5 implements AutoClearFocusBehaviorCompanion, WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1, isValidPushStoryClickInputlambda0 {
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public boolean read;
    public Object serializer;
    public Object write;

    @Override // o.isValidPushStoryClickInputlambda0
    public boolean MediaBrowserCompatMediaItem() {
        return this.read;
    }

    @Override // o.isValidPushStoryClickInputlambda0
    public void RatingCompat() {
    }

    @Override // o.isValidPushStoryClickInputlambda0
    public void read(int i) {
    }

    @Override // o.isValidPushStoryClickInputlambda0
    public void serializer() {
        this.read = true;
        TextStreamsKt.RemoteActionCompatParcelizer("Lack of request message. GET request is only supported for unary requests", ((byte[]) this.serializer) != null);
        ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) ((getCacheFileSuffix) this.RemoteActionCompatParcelizer)).MediaSessionCompatResultReceiverWrapper.serializer((r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) this.IconCompatParcelizer, (byte[]) this.serializer);
        this.serializer = null;
        this.IconCompatParcelizer = null;
    }

    @Override // o.isValidPushStoryClickInputlambda0
    public isValidPushStoryClickInputlambda0 write(r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks) {
        return this;
    }

    @Override // o.AutoClearFocusBehaviorCompanion
    public void IconCompatParcelizer() {
        accessgetCursorInBoundsOfNodep accessgetcursorinboundsofnodep = (accessgetCursorInBoundsOfNodep) this.serializer;
        if (accessgetcursorinboundsofnodep != null) {
            try {
                accessgetcursorinboundsofnodep.IconCompatParcelizer(3, accessgetcursorinboundsofnodep.read());
            } catch (RemoteException e) {
                SentryLogcatAdapter.read("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.serializer = null;
        }
    }

    public int MediaDescriptionCompat() {
        return ((onHideTranslationui) ((getPlatformAndroidManager) this.write)).serializer();
    }

    public void MediaMetadataCompat() {
        zzm zzmVar = (zzm) this.write;
        try {
            StringBuilder sb = new StringBuilder("tasks is start,tid:");
            String str = (String) zzmVar.RatingCompat;
            String str2 = (String) zzmVar.RatingCompat;
            sb.append(str);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TaskChain", sb.toString());
            List list = (List) this.IconCompatParcelizer;
            zp zpVar = new zp(9);
            zpVar.write = -1;
            zpVar.serializer = list;
            zpVar.IconCompatParcelizer = zzmVar;
            zpVar.serializer();
            if (((CountDownLatch) this.serializer).await(zzmVar.write, TimeUnit.MILLISECONDS)) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TaskChain", "tasks is success,tid:" + str2);
            } else {
                WrappedCompositionsetContent1211.write("TaskChain", "tasks is timeOut,tid:" + str2);
                zzmVar.RemoteActionCompatParcelizer = true;
                throw new TaskTimeOutException("task timeout");
            }
        } catch (InterruptedException unused) {
            throw new TaskTimeOutException("task interrupted");
        }
    }

    public int MediaSessionCompatQueueItem() {
        return ((onHideTranslationui) ((getPlatformAndroidManager) this.IconCompatParcelizer)).serializer();
    }

    public void PlaybackStateCompatCustomAction() {
        synchronized (((byte[]) this.serializer)) {
            if (((AtomicInteger) this.RemoteActionCompatParcelizer) == null) {
                this.RemoteActionCompatParcelizer = new AtomicInteger(0);
            }
            ((AtomicInteger) this.RemoteActionCompatParcelizer).incrementAndGet();
            ((AtomicInteger) this.RemoteActionCompatParcelizer).get();
            WrappedCompositionsetContent1211.read();
        }
        if (((getContentCaptureSession) this.write) != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.write = new getContentCaptureSession(1, this);
        placeAtf8xVGno.read().registerReceiver((getContentCaptureSession) this.write, intentFilter);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("GnssAndNetReceiver", "register network receiver");
    }

    public resetMessageMargins RemoteActionCompatParcelizer() {
        return (resetMessageMargins) this.RemoteActionCompatParcelizer;
    }

    public void RemoteActionCompatParcelizer(newViewStructure newviewstructure) {
        String str;
        Context context = (Context) this.write;
        if (getTitleResource.read(context, "android.permission.ACCESS_WIFI_STATE") && getTitleResource.read(context, "android.permission.CHANGE_WIFI_STATE")) {
            this.RemoteActionCompatParcelizer = newviewstructure;
            if (((getContentCaptureSession) this.serializer) == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiScanManager", "registeredWifiBroadcast");
                this.serializer = new getContentCaptureSession(0, this);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
                context.registerReceiver((getContentCaptureSession) this.serializer, intentFilter);
            }
            WifiManager wifiManager = (WifiManager) this.IconCompatParcelizer;
            if (wifiManager == null) {
                str = "WifiScanManager is null";
            } else {
                try {
                    wifiManager.startScan();
                    this.read = false;
                    return;
                } catch (Exception unused) {
                    str = "WifiScanManager throw Exception";
                }
            }
            WrappedCompositionsetContent1211.read("WifiScanManager", str);
        }
        ContentCaptureSessionCompat.IconCompatParcelizer(10000);
        newviewstructure.MediaBrowserCompatMediaItem();
    }

    public void read() {
        synchronized (((getAppropriateImageUrl) this.serializer)) {
            if (this.read) {
                return;
            }
            this.read = true;
            InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer((DateTimeConverter) this.write);
            try {
                ((r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) this.IconCompatParcelizer).read();
            } catch (IOException unused) {
            }
        }
    }

    @Override // o.isValidPushStoryClickInputlambda0
    public void write(setDateOfBirthlambda3 setdateofbirthlambda3) {
        r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0 = (r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0) this.write;
        TextStreamsKt.RemoteActionCompatParcelizer("writePayload should not be called multiple times", ((byte[]) this.serializer) == null);
        try {
            this.serializer = DistanceAndFlags.write(setdateofbirthlambda3);
            JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr = r8lambdamwysina6epuugeuvjtl8aepfjn0.write;
            JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr2 = r8lambdamwysina6epuugeuvjtl8aepfjn0.write;
            for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 : jsonUtilsExternalSyntheticLambda1Arr) {
                jsonUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(0);
            }
            byte[] bArr = (byte[]) this.serializer;
            long length = bArr.length;
            long length2 = bArr.length;
            for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda2 : r8lambdamwysina6epuugeuvjtl8aepfjn0.write) {
                jsonUtilsExternalSyntheticLambda2.serializer(length, length2, 0);
            }
            long length3 = ((byte[]) this.serializer).length;
            for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda3 : jsonUtilsExternalSyntheticLambda1Arr2) {
                jsonUtilsExternalSyntheticLambda3.write(length3);
            }
            long length4 = ((byte[]) this.serializer).length;
            for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda4 : jsonUtilsExternalSyntheticLambda1Arr2) {
                jsonUtilsExternalSyntheticLambda4.IconCompatParcelizer(length4);
            }
        } catch (IOException e) {
            DrawableTransformation.read((Throwable) e);
        }
    }

    @Override // o.AutoClearFocusBehaviorCompanion
    public ArrayList zza(setRequestedFrameRate setrequestedframerate) throws MlKitException {
        zzu[] zzuVarArrWrite;
        if (((accessgetCursorInBoundsOfNodep) this.serializer) == null) {
            zzc();
        }
        accessgetCursorInBoundsOfNodep accessgetcursorinboundsofnodep = (accessgetCursorInBoundsOfNodep) this.serializer;
        if (accessgetcursorinboundsofnodep == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzan zzanVar = new zzan(0L, setrequestedframerate.read, setrequestedframerate.IconCompatParcelizer, 0, getParentData.RemoteActionCompatParcelizer(setrequestedframerate.MediaBrowserCompatMediaItem));
        try {
            int i = setrequestedframerate.MediaSessionCompatQueueItem;
            if (i == -1) {
                ObjectWrapper objectWrapper = new ObjectWrapper(setrequestedframerate.write);
                Parcel parcel = accessgetcursorinboundsofnodep.read();
                int i2 = isRelevantPointerTypeuerMTgs.IconCompatParcelizer;
                parcel.writeStrongBinder(objectWrapper);
                parcel.writeInt(1);
                zzanVar.writeToParcel(parcel, 0);
                Parcel parcelSerializer = accessgetcursorinboundsofnodep.serializer(2, parcel);
                zzu[] zzuVarArr = (zzu[]) parcelSerializer.createTypedArray(zzu.CREATOR);
                parcelSerializer.recycle();
                zzuVarArrWrite = zzuVarArr;
            } else if (i == 17) {
                zzuVarArrWrite = accessgetcursorinboundsofnodep.write(new ObjectWrapper(setrequestedframerate.serializer), zzanVar);
            } else if (i == 35) {
                Image.Plane[] planeArr = setrequestedframerate.read();
                accessgetSystemNavigationDowncp.IconCompatParcelizer(planeArr);
                zzanVar.read = planeArr[0].getRowStride();
                zzuVarArrWrite = accessgetcursorinboundsofnodep.write(new ObjectWrapper(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (i != 842094169) {
                    throw new MlKitException("Unsupported image format: " + setrequestedframerate.MediaSessionCompatQueueItem, 3);
                }
                zzuVarArrWrite = accessgetcursorinboundsofnodep.write(new ObjectWrapper(getMeasurable.write(setrequestedframerate)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArrWrite) {
                arrayList.add(new Barcode(new i$d.a(5, zzuVar)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to detect with legacy barcode detector", 13, e);
        }
    }

    @Override // o.AutoClearFocusBehaviorCompanion
    public boolean zzc() throws MlKitException {
        displayIconIfDescendantsDoNotHavePriority finddescendantnodewithcursorinbounds;
        toMotionEventScoped4ec7I tomotioneventscoped4ec7i = (toMotionEventScoped4ec7I) this.RemoteActionCompatParcelizer;
        Context context = (Context) this.IconCompatParcelizer;
        if (((accessgetCursorInBoundsOfNodep) this.serializer) == null) {
            try {
                IBinder iBinderRemoteActionCompatParcelizer = DynamiteModule.load(context, DynamiteModule.RemoteActionCompatParcelizer, "com.google.android.gms.vision.dynamite").RemoteActionCompatParcelizer("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                int i = onEnter.read;
                if (iBinderRemoteActionCompatParcelizer == null) {
                    finddescendantnodewithcursorinbounds = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderRemoteActionCompatParcelizer.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    finddescendantnodewithcursorinbounds = iInterfaceQueryLocalInterface instanceof displayIconIfDescendantsDoNotHavePriority ? (displayIconIfDescendantsDoNotHavePriority) iInterfaceQueryLocalInterface : new findDescendantNodeWithCursorInBounds(iBinderRemoteActionCompatParcelizer, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                }
                accessgetCursorInBoundsOfNodep accessgetcursorinboundsofnodep = ((findDescendantNodeWithCursorInBounds) finddescendantnodewithcursorinbounds).read(new ObjectWrapper(context), (zzah) this.write);
                this.serializer = accessgetcursorinboundsofnodep;
                if (accessgetcursorinboundsofnodep == null && !this.read) {
                    Feature[] featureArr = OptionalModuleUtils.write;
                    setDownChange setdownchange = getOriginalEventPositionF1C5BW0ui.write;
                    Object[] objArr = {"barcode"};
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.write(1, objArr);
                    OptionalModuleUtils.RemoteActionCompatParcelizer(context, new getPanOffsetF1C5BW0(1, objArr));
                    this.read = true;
                    Api30Impl.RemoteActionCompatParcelizer(tomotioneventscoped4ec7i, accesssetStatep.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
                Api30Impl.RemoteActionCompatParcelizer(tomotioneventscoped4ec7i, accesssetStatep.NO_ERROR);
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create legacy barcode detector.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
            }
        }
        return false;
    }

    @Override // o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1
    public void serializer(getContentChild getcontentchild) {
        this.RemoteActionCompatParcelizer = getcontentchild;
        this.read = true;
        ((zzm) this.write).getClass();
        ((CountDownLatch) this.serializer).countDown();
    }

    @Override // o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1
    public void write(getContentChild getcontentchild) {
        this.RemoteActionCompatParcelizer = getcontentchild;
        this.read = false;
        ((zzm) this.write).getClass();
        ((CountDownLatch) this.serializer).countDown();
    }

    public E5(int i) {
        if (i != 5) {
            this.read = true;
            this.serializer = new byte[0];
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.location.MODE_CHANGED");
            this.IconCompatParcelizer = new getWindowRecomposerannotations();
            placeAtf8xVGno.read().registerReceiver((getWindowRecomposerannotations) this.IconCompatParcelizer, intentFilter);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("GnssAndNetReceiver", "register gnss receiver ");
            return;
        }
        this.read = true;
        Context context = placeAtf8xVGno.read();
        this.write = context;
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        if (systemService instanceof WifiManager) {
            this.IconCompatParcelizer = (WifiManager) systemService;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiScanManager", "WifiScanManager init");
        }
    }

    public static void read(readAnimationScale readanimationscale) {
        try {
            placeAtf8xVGno.read().unregisterReceiver(readanimationscale);
        } catch (IllegalArgumentException e) {
            WrappedCompositionsetContent1211.read("GnssAndNetReceiver", e.getMessage());
        }
    }

    public static void write() {
        boolean zRemoteActionCompatParcelizer = onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read());
        boolean zRemoteActionCompatParcelizer2 = NetworkUtil.RemoteActionCompatParcelizer(placeAtf8xVGno.read());
        if (!zRemoteActionCompatParcelizer) {
            WindowRecomposerFactory.read().serializer = null;
        }
        if (zRemoteActionCompatParcelizer && zRemoteActionCompatParcelizer2) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationAvailabilityObserver", "available,resume scan and get location");
            setOnCopyRequested.IconCompatParcelizer().write();
        } else {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationAvailabilityObserver", "unAvailable,stop scan and get location");
            setOnCopyRequested.IconCompatParcelizer().serializer();
        }
        Iterator it = WindowRecomposerFactory.read().read.entrySet().iterator();
        while (it.hasNext()) {
            d2 d2Var = ((getGlobalKeyboardModifiersui) ((Map.Entry) it.next()).getValue()).IconCompatParcelizer;
            if (d2Var != null) {
                if ((d2Var instanceof LifecycleAwarelambda0) || (d2Var instanceof WindowRecomposerPolicy) || (d2Var instanceof getAndSetFactory)) {
                    d2Var.read(zRemoteActionCompatParcelizer);
                } else {
                    d2Var.read(zRemoteActionCompatParcelizer && zRemoteActionCompatParcelizer2);
                }
            }
        }
    }

    public void read(int i, int i2) {
        if (i < 0.0f) {
            TriStateCheckbox.read("Index should be non-negative (" + i + ')');
        }
        ((onHideTranslationui) ((getPlatformAndroidManager) this.IconCompatParcelizer)).serializer(i);
        ((ExtendedFabSmallTokens) this.serializer).IconCompatParcelizer(i);
        ((onHideTranslationui) ((getPlatformAndroidManager) this.write)).serializer(i2);
    }

    public E5(Context context, calculateWindowSize calculatewindowsize, toMotionEventScoped4ec7I tomotioneventscoped4ec7i) {
        zzah zzahVar = new zzah();
        this.write = zzahVar;
        this.IconCompatParcelizer = context;
        zzahVar.read = calculatewindowsize.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = tomotioneventscoped4ec7i;
    }

    public E5(getAppropriateImageUrl getappropriateimageurl, r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai) {
        this.serializer = getappropriateimageurl;
        this.IconCompatParcelizer = r8lambdalmkbrrgswwtv97obrsj7trj7ai;
        DateTimeConverter dateTimeConverterSerializer = r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer(1);
        this.write = dateTimeConverterSerializer;
        this.RemoteActionCompatParcelizer = new resetMessageMargins(getappropriateimageurl, this, dateTimeConverterSerializer);
    }

    public E5(getCacheFileSuffix getcachefilesuffix, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0) {
        this.RemoteActionCompatParcelizer = getcachefilesuffix;
        TextStreamsKt.serializer(r8lambdaqn1du6uas6agx4srbugfttxtpwa, "headers");
        this.IconCompatParcelizer = r8lambdaqn1du6uas6agx4srbugfttxtpwa;
        this.write = r8lambdamwysina6epuugeuvjtl8aepfjn0;
    }

    public E5() {
    }
}
