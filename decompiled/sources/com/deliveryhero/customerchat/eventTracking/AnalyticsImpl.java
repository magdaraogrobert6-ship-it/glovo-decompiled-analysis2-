package com.deliveryhero.customerchat.eventTracking;

import coil3.ExtrasKt;
import com.deliveryhero.customerchat.analytics.model.EventCreationRequest;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BitmapPainter;
import o.LayerSnapshotV21;
import o.LayerSnapshot_androidKt;
import o.ShortNewsContentCardView;
import o.ViewLayerCompanionLayerOutlineProvider1;
import o.ViewLayerVerificationHelper31;
import o.accessgetLayerOutlinep;
import o.createFromParcel;
import o.getOwnerView;
import o.isIdentityannotations;
import o.onImageAvailable;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.resolveLockHardwareCanvasMethod;
import o.setCanUseCompositingLayerui_graphics;
import o.setDrawParams;
import o.setOutlineAmbientShadowColor;

/* JADX INFO: loaded from: classes2.dex */
public final class AnalyticsImpl {
    public final setOutlineAmbientShadowColor IconCompatParcelizer;
    public final onImageAvailable serializer;
    public final accessgetLayerOutlinep write;

    public AnalyticsImpl(accessgetLayerOutlinep accessgetlayeroutlinep, setOutlineAmbientShadowColor setoutlineambientshadowcolor, onImageAvailable onimageavailable) {
        this.write = accessgetlayeroutlinep;
        this.IconCompatParcelizer = setoutlineambientshadowcolor;
        this.serializer = onimageavailable;
    }

    public final void IconCompatParcelizer(String str, String str2) {
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("GCC_EVENT_TRACKED_EVENT_NAME", str), new onViewAttachedToWindowlambda0("GCC_EVENT_TRACKED_EVENT_STATUS", str2));
        isIdentityannotations isidentityannotations = this.serializer.serializer;
        if (isidentityannotations != null) {
            isidentityannotations.RemoteActionCompatParcelizer("GCC_EVENT_TRACKING_SERVICE", mapRemoteActionCompatParcelizer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object track(EventCreationRequest eventCreationRequest, ContinuationImpl continuationImpl) {
        BitmapPainter bitmapPainter;
        LayerSnapshot_androidKt layerSnapshot_androidKt;
        resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod;
        AnalyticsImpl analyticsImpl;
        if (continuationImpl instanceof BitmapPainter) {
            bitmapPainter = (BitmapPainter) continuationImpl;
            int i = bitmapPainter.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                bitmapPainter.serializer = i - Integer.MIN_VALUE;
            } else {
                bitmapPainter = new BitmapPainter(this, continuationImpl);
            }
        } else {
            bitmapPainter = new BitmapPainter(this, continuationImpl);
        }
        Object objHandleApi = bitmapPainter.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bitmapPainter.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objHandleApi);
            LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) this.IconCompatParcelizer).write();
            if (layerSnapshotV21Write != null) {
                String str = layerSnapshotV21Write.write().globalEntityID;
                String strRemoteActionCompatParcelizer = layerSnapshotV21Write.RemoteActionCompatParcelizer();
                if (strRemoteActionCompatParcelizer != null && (layerSnapshot_androidKt = layerSnapshotV21Write.write) != null && (resolvelockhardwarecanvasmethod = layerSnapshot_androidKt.userType) != null) {
                    bitmapPainter.write = this;
                    bitmapPainter.read = eventCreationRequest;
                    bitmapPainter.serializer = 1;
                    objHandleApi = SentryLogcatAdapter.handleApi(new TwoFaViewModel$onPinChanged$1(this.write, eventCreationRequest, strRemoteActionCompatParcelizer, str, resolvelockhardwarecanvasmethod, (ShortNewsContentCardView) null, 1), bitmapPainter);
                    if (objHandleApi == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    analyticsImpl = this;
                }
            }
            return createfromparcel;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        eventCreationRequest = bitmapPainter.read;
        analyticsImpl = bitmapPainter.write;
        ExtrasKt.RemoteActionCompatParcelizer(objHandleApi);
        getOwnerView getownerview = (getOwnerView) objHandleApi;
        if (getownerview instanceof ViewLayerCompanionLayerOutlineProvider1) {
            analyticsImpl.IconCompatParcelizer(eventCreationRequest.getEvent().getName(), "Success");
            return createfromparcel;
        }
        if (getownerview instanceof setCanUseCompositingLayerui_graphics) {
            analyticsImpl.IconCompatParcelizer(eventCreationRequest.getEvent().getName(), "Failure");
            return createfromparcel;
        }
        if (getownerview instanceof setDrawParams) {
            ((setDrawParams) getownerview).read().printStackTrace();
            analyticsImpl.IconCompatParcelizer(eventCreationRequest.getEvent().getName(), "Exception");
        }
        return createfromparcel;
    }
}
