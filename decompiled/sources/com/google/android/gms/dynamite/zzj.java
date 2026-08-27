package com.google.android.gms.dynamite;

import android.content.Context;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.deliveryhero.perseus.utils.BackoffTimer;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsApi;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AndroidColorFilter_androidKt;
import o.AndroidPointerIcon;
import o.AndroidPointerIconType;
import o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2;
import o.NestedScrollNodeonPreFling1;
import o.Paint;
import o.accessgetExtendedTouchPaddingNHjbRcjd;
import o.accessgetNumPad6cp;
import o.accessgetNumPadDirectionDowncp;
import o.accessgetNumPadSubtractcp;
import o.accessgetUcp;
import o.accessgetVolumeMutecp;
import o.asFrameworkPaint;
import o.createImageBitmap;
import o.emit;
import o.findNearestAttachedAncestor;
import o.getFlingWNlRxjI;
import o.getNEK5gGoQ;
import o.getPerformMeasureBlockui;
import o.getRelocateWNlRxjI;
import o.premeasure0kLqBqw;
import o.setDetachedFromParentLookaheadPassui;
import o.setPathEffect;
import o.setStrokeCapBeK7IIE;
import o.setTrimPathStart;
import o.toRegionOp7u2Bmg;
import o.toXyzui_graphics;
import o.updateDispatcherFields;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj implements emit, accessgetVolumeMutecp, SettingsApi, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2, setDetachedFromParentLookaheadPassui, getPerformMeasureBlockui {
    public final /* synthetic */ int MediaSessionCompatResultReceiverWrapper;
    public static final /* synthetic */ zzj serializer = new zzj(11);
    public static final /* synthetic */ zzj write = new zzj(12);
    public static final /* synthetic */ zzj MediaSessionCompatQueueItem = new zzj(13);
    public static final /* synthetic */ zzj MediaMetadataCompat = new zzj(14);
    public static final /* synthetic */ zzj MediaBrowserCompatMediaItem = new zzj(15);
    public static final /* synthetic */ zzj RatingCompat = new zzj(16);
    public static final /* synthetic */ zzj ParcelableVolumeInfo = new zzj(17);
    public static final /* synthetic */ zzj MediaSessionCompatToken = new zzj(18);
    public static final /* synthetic */ zzj PlaybackStateCompatCustomAction = new zzj(19);
    public static final /* synthetic */ zzj PlaybackStateCompat = new zzj(20);
    public static final /* synthetic */ zzj read = new zzj(21);
    public static final /* synthetic */ zzj RemoteActionCompatParcelizer = new zzj(22);
    public static final /* synthetic */ zzj IconCompatParcelizer = new zzj(23);
    public static final /* synthetic */ zzj MediaDescriptionCompat = new zzj(24);

    @Override // o.emit
    public float IconCompatParcelizer(float f, long j) {
        return 0.0f;
    }

    @Override // o.getPerformMeasureBlockui
    public void IconCompatParcelizer(long j, String str) {
    }

    @Override // o.getPerformMeasureBlockui
    public String RemoteActionCompatParcelizer() {
        return null;
    }

    @Override // o.emit
    public float read(float f, float f2, long j) {
        return 0.0f;
    }

    @Override // o.getPerformMeasureBlockui
    public void read() {
    }

    @Override // o.emit
    public long serializer(float f) {
        return 0L;
    }

    @Override // o.emit
    public float write() {
        return 0.0f;
    }

    @Override // o.emit
    public float write(float f, float f2) {
        return 0.0f;
    }

    public /* synthetic */ zzj(int i) {
        this.MediaSessionCompatResultReceiverWrapper = i;
    }

    @Override // o.setDetachedFromParentLookaheadPassui
    public Object IconCompatParcelizer(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // com.google.android.gms.location.SettingsApi
    public accessgetNumPadDirectionDowncp checkLocationSettings(accessgetNumPad6cp accessgetnumpad6cp, LocationSettingsRequest locationSettingsRequest) {
        getNEK5gGoQ getnek5ggoq = new getNEK5gGoQ(accessgetnumpad6cp, locationSettingsRequest);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(0, getnek5ggoq);
        return getnek5ggoq;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // o.accessgetVolumeMutecp
    public toXyzui_graphics read(Context context, String str, accessgetUcp accessgetucp) {
        toXyzui_graphics toxyzui_graphics = new toXyzui_graphics();
        toxyzui_graphics.RemoteActionCompatParcelizer = accessgetucp.IconCompatParcelizer(context, str);
        int i = 1;
        int iRemoteActionCompatParcelizer = accessgetucp.RemoteActionCompatParcelizer(context, str, true);
        toxyzui_graphics.IconCompatParcelizer = iRemoteActionCompatParcelizer;
        int i2 = toxyzui_graphics.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            i2 = 0;
            if (iRemoteActionCompatParcelizer == 0) {
                i = 0;
            } else if (i2 >= iRemoteActionCompatParcelizer) {
                i = -1;
            }
        } else if (i2 >= iRemoteActionCompatParcelizer) {
            i = -1;
        }
        toxyzui_graphics.write = i;
        return toxyzui_graphics;
    }

    public static toRegionOp7u2Bmg serializer(asFrameworkPaint asframeworkpaint, createImageBitmap createimagebitmap, int i) {
        setStrokeCapBeK7IIE defaultViewModelCreationExtras;
        if ((i & 2) != 0) {
            if (asframeworkpaint instanceof AndroidColorFilter_androidKt) {
                createimagebitmap = ((AndroidColorFilter_androidKt) asframeworkpaint).getDefaultViewModelProviderFactory();
            } else {
                createimagebitmap = Paint.serializer;
            }
        }
        if (asframeworkpaint instanceof AndroidColorFilter_androidKt) {
            defaultViewModelCreationExtras = ((AndroidColorFilter_androidKt) asframeworkpaint).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = setPathEffect.IconCompatParcelizer;
        }
        createimagebitmap.getClass();
        defaultViewModelCreationExtras.getClass();
        return new toRegionOp7u2Bmg(asframeworkpaint.getViewModelStore(), createimagebitmap, defaultViewModelCreationExtras);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object getInstance$perseus_release(PerseusLogger perseusLogger, PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        setTrimPathStart settrimpathstart;
        PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImpl2;
        BackoffTimer backoffTimer;
        BackoffTimer backoffTimer2;
        BackoffTimer backoffTimer3;
        if (continuationImpl instanceof setTrimPathStart) {
            settrimpathstart = (setTrimPathStart) continuationImpl;
            int i = settrimpathstart.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                settrimpathstart.write = i - Integer.MIN_VALUE;
            } else {
                settrimpathstart = new setTrimPathStart(this, continuationImpl);
            }
        } else {
            settrimpathstart = new setTrimPathStart(this, continuationImpl);
        }
        Object maxBackoffTime = settrimpathstart.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = settrimpathstart.write;
        if (i2 != 0) {
            if (i2 == 1) {
                backoffTimer2 = settrimpathstart.RemoteActionCompatParcelizer;
                backoffTimer = settrimpathstart.serializer;
                perseusConfigLocalDataStoreImpl2 = settrimpathstart.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(maxBackoffTime);
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                backoffTimer3 = settrimpathstart.RemoteActionCompatParcelizer;
                backoffTimer = settrimpathstart.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(maxBackoffTime);
            }
            backoffTimer3.RatingCompat = ((Number) maxBackoffTime).longValue();
            return backoffTimer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(maxBackoffTime);
        BackoffTimer backoffTimer4 = new BackoffTimer(perseusLogger, perseusConfigLocalDataStoreImpl);
        settrimpathstart.IconCompatParcelizer = perseusConfigLocalDataStoreImpl;
        settrimpathstart.serializer = backoffTimer4;
        settrimpathstart.RemoteActionCompatParcelizer = backoffTimer4;
        settrimpathstart.write = 1;
        Object batchDispatchHitsDelay = perseusConfigLocalDataStoreImpl.getBatchDispatchHitsDelay(settrimpathstart);
        if (batchDispatchHitsDelay != coroutineSingletons) {
            perseusConfigLocalDataStoreImpl2 = perseusConfigLocalDataStoreImpl;
            backoffTimer = backoffTimer4;
            maxBackoffTime = batchDispatchHitsDelay;
            backoffTimer2 = backoffTimer;
        }
        return coroutineSingletons;
        backoffTimer2.write = ((Number) maxBackoffTime).longValue();
        backoffTimer.RemoteActionCompatParcelizer = backoffTimer.write;
        settrimpathstart.IconCompatParcelizer = null;
        settrimpathstart.serializer = backoffTimer;
        settrimpathstart.RemoteActionCompatParcelizer = backoffTimer;
        settrimpathstart.write = 2;
        maxBackoffTime = perseusConfigLocalDataStoreImpl2.getMaxBackoffTime(settrimpathstart);
        if (maxBackoffTime != coroutineSingletons) {
            backoffTimer3 = backoffTimer;
            backoffTimer3.RatingCompat = ((Number) maxBackoffTime).longValue();
            return backoffTimer;
        }
        return coroutineSingletons;
    }

    @Override // o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle2
    public Object serializer() {
        switch (this.MediaSessionCompatResultReceiverWrapper) {
            case 11:
                List list = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l = (Long) NestedScrollNodeonPreFling1.addOnConfigurationChangedListener.read();
                l.getClass();
                return l;
            case 12:
                List list2 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.fullyDrawnReporter_delegatelambda00.read()).longValue());
            case 13:
                List list3 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l2 = (Long) NestedScrollNodeonPreFling1.ResultReceiver.read();
                l2.getClass();
                return l2;
            case 14:
                List list4 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l3 = (Long) NestedScrollNodeonPreFling1.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read();
                l3.getClass();
                return l3;
            case 15:
                List list5 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l4 = (Long) NestedScrollNodeonPreFling1.write.read();
                l4.getClass();
                return l4;
            case 16:
                List list6 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                Long l5 = (Long) NestedScrollNodeonPreFling1.addContentView.read();
                l5.getClass();
                return l5;
            case 17:
                List list7 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                getRelocateWNlRxjI.read.B_();
                Boolean bool = (Boolean) getFlingWNlRxjI.write.read();
                bool.getClass();
                return bool;
            case 18:
                List list8 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.getNavigationEventDispatcher.read()).longValue());
            case 19:
                List list9 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return (String) NestedScrollNodeonPreFling1.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read();
            case 20:
                List list10 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.fullyDrawnReporter_delegatelambda0.read()).longValue());
            case 21:
                List list11 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                updateDispatcherFields.write.B_();
                return Integer.valueOf((int) ((Long) NestedScrollNodeonPreFling1.serializer.read()).longValue());
            case 22:
                List list12 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Integer.valueOf((int) findNearestAttachedAncestor.write());
            case 23:
                List list13 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                accessgetExtendedTouchPaddingNHjbRcjd.write.B_();
                Boolean bool2 = (Boolean) AndroidPointerIconType.RatingCompat.read();
                bool2.getClass();
                return bool2;
            default:
                List list14 = premeasure0kLqBqw.removeOnConfigurationChangedListener;
                return Boolean.valueOf(AndroidPointerIcon.serializer());
        }
    }
}
