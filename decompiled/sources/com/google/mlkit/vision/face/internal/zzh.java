package com.google.mlkit.vision.face.internal;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import androidx.lifecycle.BlockRunner;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.internal.zzh;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.logic.zp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AndroidUiFrameClockwithFrameNanos2callback1;
import o.AndroidUriHandler;
import o.AutoClearFocusBehavior;
import o.CalculateMatrixToWindow;
import o.ChainedPlatformTextInputInterceptor;
import o.ImageVectorCacheImageVectorEntry;
import o.MeasurePolicyDefaultImpls;
import o.accessgetCurrentApproachIndexp;
import o.accessgetPrecomposeMapp;
import o.accessgetRootp;
import o.accessgetSystemNavigationDowncp;
import o.computeFillWidthiLBOSCw;
import o.getDefault4UtRPd4;
import o.getOutOfFrameExecutor;
import o.getScaledHandwritingGestureLineMargin;
import o.preTranslate3XD1CNM;
import o.resetLayoutState;
import o.setRequestedFrameRate;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh extends AndroidUiFrameClockwithFrameNanos2callback1 {
    public static final AtomicBoolean read = new AtomicBoolean(true);
    public static final ImageUtils serializer = ImageUtils.write;
    public final resetLayoutState MediaBrowserCompatMediaItem;
    public final CalculateMatrixToWindow MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public final preTranslate3XD1CNM RatingCompat;
    public final AutoClearFocusBehavior PlaybackStateCompatCustomAction = new AutoClearFocusBehavior();
    public final i$d MediaSessionCompatQueueItem = new i$d(AndroidUriHandler.serializer().IconCompatParcelizer());

    @Override // o.AndroidUiFrameClockwithFrameNanos2callback1
    public final void read() {
        synchronized (this) {
            this.RatingCompat.t_();
            read.set(true);
            resetLayoutState resetlayoutstate = this.MediaBrowserCompatMediaItem;
            BlockRunner blockRunner = new BlockRunner();
            blockRunner.RatingCompat = this.MediaMetadataCompat ? accessgetCurrentApproachIndexp.TYPE_THICK : accessgetCurrentApproachIndexp.TYPE_THIN;
            getScaledHandwritingGestureLineMargin.INSTANCE.execute(new ImageVectorCacheImageVectorEntry((Object) resetlayoutstate, (Object) new zp(blockRunner, 0, (byte) 0), (Enum) accessgetRootp.ON_DEVICE_FACE_CLOSE, resetlayoutstate.read(), 6));
        }
    }

    @Override // o.AndroidUiFrameClockwithFrameNanos2callback1
    public final void serializer() {
        synchronized (this) {
            this.MediaMetadataCompat = this.RatingCompat.zzd();
        }
    }

    public final void write(final accessgetPrecomposeMapp accessgetprecomposemapp, long j, final setRequestedFrameRate setrequestedframerate, final int i, final int i2) {
        synchronized (this) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(new getOutOfFrameExecutor() { // from class: o.getInterceptor
                @Override // o.getOutOfFrameExecutor
                public final zp serializer() {
                    accessdisposeUnusedSlotsInApproach accessdisposeunusedslotsinapproach;
                    accessgetCurrentApproachIndexp accessgetcurrentapproachindexp;
                    com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = new com.airbnb.lottie.parser.DropShadowEffect(12);
                    com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect2 = new com.airbnb.lottie.parser.DropShadowEffect(11);
                    dropShadowEffect2.read = Long.valueOf(jElapsedRealtime & Long.MAX_VALUE);
                    dropShadowEffect2.RatingCompat = accessgetprecomposemapp;
                    dropShadowEffect2.write = Boolean.valueOf(zzh.read.get());
                    Boolean bool = Boolean.TRUE;
                    dropShadowEffect2.serializer = bool;
                    dropShadowEffect2.MediaDescriptionCompat = bool;
                    dropShadowEffect.read = new accessgetCurrentIndexp(dropShadowEffect2);
                    zzh zzhVar = this.RemoteActionCompatParcelizer;
                    dropShadowEffect.write = ChainedPlatformTextInputInterceptor.RemoteActionCompatParcelizer(zzhVar.MediaDescriptionCompat);
                    dropShadowEffect.serializer = Integer.valueOf(i & Integer.MAX_VALUE);
                    dropShadowEffect.MediaDescriptionCompat = Integer.valueOf(i2 & Integer.MAX_VALUE);
                    zzh.serializer.getClass();
                    setRequestedFrameRate setrequestedframerate2 = setrequestedframerate;
                    int i3 = setrequestedframerate2.MediaSessionCompatQueueItem;
                    int iSerializer = ImageUtils.serializer(setrequestedframerate2);
                    com.huawei.agconnect.config.impl.m mVar = new com.huawei.agconnect.config.impl.m(1);
                    if (i3 == -1) {
                        accessdisposeunusedslotsinapproach = accessdisposeUnusedSlotsInApproach.BITMAP;
                    } else if (i3 == 35) {
                        accessdisposeunusedslotsinapproach = accessdisposeUnusedSlotsInApproach.YUV_420_888;
                    } else if (i3 == 842094169) {
                        accessdisposeunusedslotsinapproach = accessdisposeUnusedSlotsInApproach.YV12;
                    } else if (i3 == 16) {
                        accessdisposeunusedslotsinapproach = accessdisposeUnusedSlotsInApproach.NV16;
                    } else if (i3 != 17) {
                        accessdisposeunusedslotsinapproach = accessdisposeUnusedSlotsInApproach.UNKNOWN_FORMAT;
                    } else {
                        accessdisposeunusedslotsinapproach = accessdisposeUnusedSlotsInApproach.NV21;
                    }
                    mVar.RemoteActionCompatParcelizer = accessdisposeunusedslotsinapproach;
                    mVar.read = Integer.valueOf(iSerializer & Integer.MAX_VALUE);
                    dropShadowEffect.RatingCompat = new accessapproachSubcompose(mVar);
                    accesssetCurrentApproachIndexp accesssetcurrentapproachindexp = new accesssetCurrentApproachIndexp(dropShadowEffect);
                    androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
                    if (zzhVar.MediaMetadataCompat) {
                        accessgetcurrentapproachindexp = accessgetCurrentApproachIndexp.TYPE_THICK;
                    } else {
                        accessgetcurrentapproachindexp = accessgetCurrentApproachIndexp.TYPE_THIN;
                    }
                    blockRunner.RatingCompat = accessgetcurrentapproachindexp;
                    blockRunner.write = accesssetcurrentapproachindexp;
                    return new zp(blockRunner, 0, (byte) 0);
                }
            }, accessgetRootp.ON_DEVICE_FACE_DETECT);
            DropShadowEffect dropShadowEffect = new DropShadowEffect(10);
            dropShadowEffect.read = accessgetprecomposemapp;
            dropShadowEffect.RatingCompat = Boolean.valueOf(read.get());
            dropShadowEffect.serializer = Integer.valueOf(i & Integer.MAX_VALUE);
            dropShadowEffect.MediaDescriptionCompat = Integer.valueOf(i2 & Integer.MAX_VALUE);
            dropShadowEffect.write = ChainedPlatformTextInputInterceptor.RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
            getScaledHandwritingGestureLineMargin.INSTANCE.execute(new MeasurePolicyDefaultImpls(this.MediaBrowserCompatMediaItem, accessgetRootp.AGGREGATED_ON_DEVICE_FACE_DETECTION, new computeFillWidthiLBOSCw(dropShadowEffect), jElapsedRealtime, new i$d.a(7, this), 2));
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.MediaSessionCompatQueueItem.read(true != this.MediaMetadataCompat ? 24303 : 24304, accessgetprecomposemapp.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0112  */
    /* JADX WARN: Code duplicated, block: B:47:0x0114 A[Catch: MlKitException -> 0x0135, all -> 0x0152, TryCatch #0 {, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:12:0x002d, B:44:0x010e, B:51:0x0122, B:50:0x011d, B:47:0x0114, B:14:0x0037, B:16:0x0040, B:17:0x0049, B:19:0x004f, B:20:0x005a, B:22:0x0060, B:24:0x006a, B:26:0x006e, B:28:0x0074, B:30:0x009e, B:32:0x00c2, B:33:0x00ca, B:35:0x00d0, B:38:0x00e8, B:59:0x013a, B:61:0x0140, B:63:0x0145, B:64:0x0151, B:62:0x0143, B:41:0x00fb, B:43:0x0106), top: B:68:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x011b  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d A[Catch: MlKitException -> 0x0135, all -> 0x0152, TryCatch #0 {, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:12:0x002d, B:44:0x010e, B:51:0x0122, B:50:0x011d, B:47:0x0114, B:14:0x0037, B:16:0x0040, B:17:0x0049, B:19:0x004f, B:20:0x005a, B:22:0x0060, B:24:0x006a, B:26:0x006e, B:28:0x0074, B:30:0x009e, B:32:0x00c2, B:33:0x00ca, B:35:0x00d0, B:38:0x00e8, B:59:0x013a, B:61:0x0140, B:63:0x0145, B:64:0x0151, B:62:0x0143, B:41:0x00fb, B:43:0x0106), top: B:68:0x0005 }] */
    @Override // o.AndroidUiFrameClockwithFrameNanos2callback1
    public final List write(setRequestedFrameRate setrequestedframerate) {
        long j;
        accessgetPrecomposeMapp accessgetprecomposemapp;
        List arrayList;
        Iterator it;
        Iterator it2;
        Rect rect;
        List list;
        int size;
        int size2;
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.PlaybackStateCompatCustomAction.write(setrequestedframerate);
            try {
                Pair pairZza = this.RatingCompat.zza(setrequestedframerate);
                List list2 = (List) pairZza.first;
                List list3 = (List) pairZza.second;
                if (list2 == null && list3 == null) {
                    throw new MlKitException("No detector is enabled", 13);
                }
                if (list2 == null) {
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(list3);
                    list = list3;
                } else if (list3 == null) {
                    list = list2;
                } else {
                    HashSet hashSet = new HashSet();
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        Face face = (Face) it3.next();
                        Iterator it4 = list2.iterator();
                        boolean z = false;
                        while (it4.hasNext()) {
                            Face face2 = (Face) it4.next();
                            Rect rect2 = face.IconCompatParcelizer;
                            if (rect2 == null || (rect = face2.IconCompatParcelizer) == null || !rect2.intersect(rect)) {
                                it = it3;
                                it2 = it4;
                                j = jElapsedRealtime;
                            } else {
                                it = it3;
                                it2 = it4;
                                j = jElapsedRealtime;
                                double dMin = (Math.min(rect2.bottom, rect.bottom) - Math.max(rect2.top, rect.top)) * (Math.min(rect2.right, rect.right) - Math.max(rect2.left, rect.left));
                                try {
                                    if (dMin / ((((double) ((rect2.bottom - rect2.top) * (rect2.right - rect2.left))) + ((double) ((rect.bottom - rect.top) * (rect.right - rect.left)))) - dMin) > 0.6d) {
                                        SparseArray sparseArray = face.RatingCompat;
                                        SparseArray sparseArray2 = face2.RatingCompat;
                                        sparseArray2.clear();
                                        for (int i = 0; i < sparseArray.size(); i++) {
                                            sparseArray2.put(sparseArray.keyAt(i), (getDefault4UtRPd4) sparseArray.valueAt(i));
                                        }
                                        z = true;
                                    }
                                } catch (MlKitException e) {
                                    e = e;
                                    if (e.read == 14) {
                                        accessgetprecomposemapp = accessgetPrecomposeMapp.MODEL_NOT_DOWNLOADED;
                                    } else {
                                        accessgetprecomposemapp = accessgetPrecomposeMapp.UNKNOWN_ERROR;
                                    }
                                    write(accessgetprecomposemapp, j, setrequestedframerate, 0, 0);
                                    throw e;
                                }
                            }
                            hashSet.add(face2);
                            it3 = it;
                            it4 = it2;
                            jElapsedRealtime = j;
                        }
                        Iterator it5 = it3;
                        long j2 = jElapsedRealtime;
                        if (!z) {
                            hashSet.add(face);
                        }
                        it3 = it5;
                        jElapsedRealtime = j2;
                    }
                    j = jElapsedRealtime;
                    arrayList = new ArrayList(hashSet);
                    accessgetPrecomposeMapp accessgetprecomposemapp2 = accessgetPrecomposeMapp.NO_ERROR;
                    if (list3 == null) {
                        size = 0;
                    } else {
                        size = list3.size();
                    }
                    if (list2 == null) {
                        size2 = 0;
                    } else {
                        size2 = list2.size();
                    }
                    write(accessgetprecomposemapp2, j, setrequestedframerate, size, size2);
                    read.set(false);
                }
                arrayList = list;
                j = jElapsedRealtime;
                accessgetPrecomposeMapp accessgetprecomposemapp3 = accessgetPrecomposeMapp.NO_ERROR;
                if (list3 == null) {
                    size = 0;
                } else {
                    size = list3.size();
                }
                if (list2 == null) {
                    size2 = 0;
                } else {
                    size2 = list2.size();
                }
                write(accessgetprecomposemapp3, j, setrequestedframerate, size, size2);
                read.set(false);
            } catch (MlKitException e2) {
                e = e2;
                j = jElapsedRealtime;
            }
        }
        return arrayList;
    }

    public zzh(resetLayoutState resetlayoutstate, CalculateMatrixToWindow calculateMatrixToWindow, preTranslate3XD1CNM pretranslate3xd1cnm) {
        this.MediaDescriptionCompat = calculateMatrixToWindow;
        this.MediaBrowserCompatMediaItem = resetlayoutstate;
        this.RatingCompat = pretranslate3xd1cnm;
    }
}
