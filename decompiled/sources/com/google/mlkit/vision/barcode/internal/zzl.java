package com.google.mlkit.vision.barcode.internal;

import android.os.SystemClock;
import androidx.lifecycle.BlockRunner;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.Vw$Vw;
import com.huawei.location.logic.zp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import o.AndroidUiFrameClockwithFrameNanos2callback1;
import o.AndroidUriHandler;
import o.Api30Impl;
import o.AutoClearFocusBehavior;
import o.AutoClearFocusBehaviorCompanion;
import o.ImageVectorCacheImageVectorEntry;
import o.InternalPointerEvent;
import o.MeasurePolicyDefaultImpls;
import o.PointerInteropFilter_androidKt;
import o.PointerInteropFilterpointerInputFilter1;
import o.PointerInteropFilterpointerInputFilter1dispatchToView2;
import o.accessgetSlashcp;
import o.accessgetSystemNavigationDowncp;
import o.accesssetStatep;
import o.calculateWindowSize;
import o.getRecommendedTimeoutMillis;
import o.getScaledHandwritingGestureLineMargin;
import o.resetFakeFingerGesture;
import o.resizeGraphicFrameIfAppropriatelambda0;
import o.setDisallowInterceptui;
import o.setRequestedFrameRate;
import o.stopDispatching;
import o.toMotionEventScoped4ec7I;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends AndroidUiFrameClockwithFrameNanos2callback1 {
    public static boolean read = true;
    public static final ImageUtils serializer = ImageUtils.write;
    public final AutoClearFocusBehaviorCompanion MediaBrowserCompatMediaItem;
    public final AutoClearFocusBehavior MediaDescriptionCompat = new AutoClearFocusBehavior();
    public final toMotionEventScoped4ec7I MediaMetadataCompat;
    public final calculateWindowSize MediaSessionCompatQueueItem;
    public boolean PlaybackStateCompatCustomAction;
    public final Vw$Vw RatingCompat;

    @Override // o.AndroidUiFrameClockwithFrameNanos2callback1
    public final void read() {
        synchronized (this) {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
            read = true;
            BlockRunner blockRunner = new BlockRunner();
            setDisallowInterceptui setdisallowinterceptui = this.PlaybackStateCompatCustomAction ? setDisallowInterceptui.TYPE_THICK : setDisallowInterceptui.TYPE_THIN;
            toMotionEventScoped4ec7I tomotioneventscoped4ec7i = this.MediaMetadataCompat;
            blockRunner.RatingCompat = setdisallowinterceptui;
            DropShadowEffect dropShadowEffect = new DropShadowEffect(9);
            dropShadowEffect.RatingCompat = Api30Impl.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
            blockRunner.write = new PointerInteropFilter_androidKt(dropShadowEffect);
            getScaledHandwritingGestureLineMargin.INSTANCE.execute(new ImageVectorCacheImageVectorEntry((Object) tomotioneventscoped4ec7i, (Object) new zp(blockRunner, 0), (Enum) PointerInteropFilterpointerInputFilter1dispatchToView2.ON_DEVICE_BARCODE_CLOSE, tomotioneventscoped4ec7i.write(), 4));
        }
    }

    @Override // o.AndroidUiFrameClockwithFrameNanos2callback1
    public final void serializer() {
        synchronized (this) {
            this.PlaybackStateCompatCustomAction = this.MediaBrowserCompatMediaItem.zzc();
        }
    }

    @Override // o.AndroidUiFrameClockwithFrameNanos2callback1
    public final List write(setRequestedFrameRate setrequestedframerate) {
        ArrayList arrayListZza;
        synchronized (this) {
            AutoClearFocusBehavior autoClearFocusBehavior = this.MediaDescriptionCompat;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            autoClearFocusBehavior.write(setrequestedframerate);
            try {
                arrayListZza = this.MediaBrowserCompatMediaItem.zza(setrequestedframerate);
                write(accesssetStatep.NO_ERROR, jElapsedRealtime, setrequestedframerate, arrayListZza);
                read = false;
            } catch (MlKitException e) {
                write(e.read == 14 ? accesssetStatep.MODEL_NOT_DOWNLOADED : accesssetStatep.UNKNOWN_ERROR, jElapsedRealtime, setrequestedframerate, null);
                throw e;
            }
        }
        return arrayListZza;
    }

    public final void write(accesssetStatep accesssetstatep, long j, setRequestedFrameRate setrequestedframerate, List list) {
        int i;
        int i2;
        InternalPointerEvent internalPointerEvent = new InternalPointerEvent(0);
        InternalPointerEvent internalPointerEvent2 = new InternalPointerEvent(0);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Barcode barcode = (Barcode) it.next();
                i$d.a aVar = barcode.serializer;
                if (aVar.RemoteActionCompatParcelizer != 4) {
                    i = ((zzu) aVar.read).write;
                } else {
                    i = ((zzyb) aVar.read).read;
                }
                if (i > 4096 || i == 0) {
                    i = -1;
                }
                PointerInteropFilterpointerInputFilter1 pointerInteropFilterpointerInputFilter1 = (PointerInteropFilterpointerInputFilter1) Api30Impl.read.get(i);
                if (pointerInteropFilterpointerInputFilter1 == null) {
                    pointerInteropFilterpointerInputFilter1 = PointerInteropFilterpointerInputFilter1.FORMAT_UNKNOWN;
                }
                internalPointerEvent.read(pointerInteropFilterpointerInputFilter1);
                i$d.a aVar2 = barcode.serializer;
                if (aVar2.RemoteActionCompatParcelizer != 4) {
                    i2 = ((zzu) aVar2.read).IconCompatParcelizer;
                } else {
                    i2 = ((zzyb) aVar2.read).MediaSessionCompatQueueItem;
                }
                stopDispatching stopdispatching = (stopDispatching) Api30Impl.RemoteActionCompatParcelizer.get(i2);
                if (stopdispatching == null) {
                    stopdispatching = stopDispatching.TYPE_UNKNOWN;
                }
                internalPointerEvent2.read(stopdispatching);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.MediaMetadataCompat.read(new getRecommendedTimeoutMillis(this, jElapsedRealtime, accesssetstatep, internalPointerEvent, internalPointerEvent2, setrequestedframerate), PointerInteropFilterpointerInputFilter1dispatchToView2.ON_DEVICE_BARCODE_DETECT);
        DropShadowEffect dropShadowEffect = new DropShadowEffect(7);
        dropShadowEffect.read = accesssetstatep;
        dropShadowEffect.RatingCompat = Boolean.valueOf(read);
        dropShadowEffect.write = Api30Impl.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
        dropShadowEffect.serializer = internalPointerEvent.write();
        dropShadowEffect.MediaDescriptionCompat = internalPointerEvent2.write();
        getScaledHandwritingGestureLineMargin.INSTANCE.execute(new MeasurePolicyDefaultImpls(this.MediaMetadataCompat, PointerInteropFilterpointerInputFilter1dispatchToView2.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, new resetFakeFingerGesture(dropShadowEffect), jElapsedRealtime, new i$d.a(3, this), 1));
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = this.PlaybackStateCompatCustomAction;
        Vw$Vw vw$Vw = this.RatingCompat;
        int i3 = true != z ? 24301 : 24302;
        int iZza = accesssetstatep.zza();
        synchronized (vw$Vw) {
            AtomicLong atomicLong = (AtomicLong) vw$Vw.IconCompatParcelizer;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && jElapsedRealtime2 - ((AtomicLong) vw$Vw.IconCompatParcelizer).get() <= 1800000) {
                return;
            }
            ((accessgetSlashcp) vw$Vw.serializer).serializer(new TelemetryData(0, Arrays.asList(new MethodInvocation(i3, iZza, 0, jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new resizeGraphicFrameIfAppropriatelambda0(jElapsedRealtime2, 4, vw$Vw));
        }
    }

    public zzl(AndroidUriHandler androidUriHandler, calculateWindowSize calculatewindowsize, AutoClearFocusBehaviorCompanion autoClearFocusBehaviorCompanion, toMotionEventScoped4ec7I tomotioneventscoped4ec7i) {
        accessgetSystemNavigationDowncp.serializer(androidUriHandler, "MlKitContext can not be null");
        this.MediaSessionCompatQueueItem = calculatewindowsize;
        this.MediaBrowserCompatMediaItem = autoClearFocusBehaviorCompanion;
        this.MediaMetadataCompat = tomotioneventscoped4ec7i;
        this.RatingCompat = new Vw$Vw(androidUriHandler.IconCompatParcelizer());
    }
}
