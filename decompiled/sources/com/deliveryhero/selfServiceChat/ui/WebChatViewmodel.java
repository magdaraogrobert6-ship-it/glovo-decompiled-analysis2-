package com.deliveryhero.selfServiceChat.ui;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$2$job$1;
import com.deliveryhero.customerchat.fwf.FeatureFlagProvider;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.customerchat.internal.ChatTokenProvider$requestAuthTokenRefresh$1;
import com.roadrunner.customerchat.legacy.core.usecases.CustomerChatEventUseCase$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.GraphicsLayerImplCompanionDefaultDrawBlock1;
import o.GraphicsLayerKt;
import o.GraphicsLayerV23;
import o.LayerSnapshotV21;
import o.LayerSnapshotV22;
import o.PathNodeKt;
import o.PathNodeQuadTo;
import o.PathNodeRelativeCurveTo;
import o.PathNodeRelativeReflectiveCurveTo;
import o.PathNodeRelativeReflectiveQuadTo;
import o.ShortNewsContentCardView;
import o.VectorComposeKtGroup23;
import o.VectorComposeKtGroup24;
import o.VectorComposeKtGroup26;
import o.VectorComposeKtGroup28;
import o.VectorComposeKtPath11;
import o.VectorComposeKtPath23;
import o.VectorPainter;
import o.VectorPainterKtrememberVectorPainter2composition11;
import o.VectorPropertyFill;
import o.VectorPropertyPivotX;
import o.VectorPropertyScaleX;
import o.VectorPropertyScaleY;
import o.VectorPropertyStroke;
import o.VectorPropertyTrimPathEnd;
import o.ViewLayer;
import o.ViewLayerVerificationHelper31;
import o.accessdoInvalidate;
import o.accessgetRootScaleXp;
import o.accessgetTestFailCreateRenderNodecp;
import o.arcToBezier;
import o.asComposePaint;
import o.createFromParcel;
import o.getArcStartDx;
import o.getAutoMirrorui;
import o.getBitmapConfig_sVssgQui;
import o.getCacheBitmapConfig_sVssgQui;
import o.getCieXyz;
import o.getConfig;
import o.getContentViewGroupParentLayout;
import o.getDefaultDrawBlock;
import o.getDx;
import o.getDy;
import o.getDy1;
import o.getDy3;
import o.getEmptyArray;
import o.getHasNonTranslationComponentsannotations;
import o.getIntrinsicColorFilterui;
import o.getInvalidateCallbackui;
import o.getOwnerId;
import o.getTransaction;
import o.getVectorui;
import o.getViewportSizeNHjbRcui;
import o.getX2;
import o.getY2;
import o.getY3;
import o.insertBottomUp;
import o.insertTopDown;
import o.invokepweu1eQ;
import o.isIdentityannotations;
import o.isPlacementApproachInProgress;
import o.obtainSizePxVpY3zN4;
import o.onImageAvailable;
import o.pathNodesFromArgs;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.record;
import o.removeNodeAtDepth;
import o.resizeNodeData;
import o.setAutoMirrorui;
import o.setCompositionui;
import o.setInvalidated;
import o.setNameui;
import o.setOutline;
import o.setOutlineAmbientShadowColor;
import o.setOutlineO0kMr_c;
import o.setOutlineSpotShadowColor;
import o.setSpotShadowColor;
import o.toBitmapConfig1JJdX4A;
import o.toNodes;
import o.toRadians;
import o.updateLayerProperties;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatViewmodel extends ViewModel {
    private static int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
    private static int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 1;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU ComponentActivity;
    public final VectorComposeKtPath23 IconCompatParcelizer;
    public final updateLayerProperties MediaBrowserCompatMediaItem;
    public final GraphicsLayerImplCompanionDefaultDrawBlock1 MediaDescriptionCompat;
    public final SharedFlowImpl MediaMetadataCompat;
    public final getBitmapConfig_sVssgQui MediaSessionCompatQueueItem;
    public final getAutoMirrorui MediaSessionCompatResultReceiverWrapper;
    public isPlacementApproachInProgress MediaSessionCompatToken;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU ParcelableVolumeInfo;
    public final SharedFlowImpl PlaybackStateCompat;
    public final FeatureFlagProvider PlaybackStateCompatCustomAction;
    public final setOutlineSpotShadowColor RatingCompat;
    public final onImageAvailable RemoteActionCompatParcelizer;
    public final setCompositionui ResultReceiver;
    public final GraphicsLayerKt r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final getVectorui r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final StateFlow r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final VectorPainter r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final MutableStateFlow r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final WebViewManager r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final setOutlineAmbientShadowColor read;
    public final getInvalidateCallbackui serializer;
    public final obtainSizePxVpY3zN4 write;

    public WebChatViewmodel(getInvalidateCallbackui getinvalidatecallbackui, getAutoMirrorui getautomirrorui, updateLayerProperties updatelayerproperties, getBitmapConfig_sVssgQui getbitmapconfig_svssgqui, setOutlineSpotShadowColor setoutlinespotshadowcolor, getVectorui getvectorui, onImageAvailable onimageavailable, VectorPainter vectorPainter, setOutlineAmbientShadowColor setoutlineambientshadowcolor, setCompositionui setcompositionui, GraphicsLayerImplCompanionDefaultDrawBlock1 graphicsLayerImplCompanionDefaultDrawBlock1, WebViewManager webViewManager, GraphicsLayerKt graphicsLayerKt, FeatureFlagProvider featureFlagProvider, obtainSizePxVpY3zN4 obtainsizepxvpy3zn4, VectorComposeKtPath23 vectorComposeKtPath23) {
        setSpotShadowColor setspotshadowcolor;
        this.serializer = getinvalidatecallbackui;
        this.MediaSessionCompatResultReceiverWrapper = getautomirrorui;
        this.MediaBrowserCompatMediaItem = updatelayerproperties;
        this.MediaSessionCompatQueueItem = getbitmapconfig_svssgqui;
        this.RatingCompat = setoutlinespotshadowcolor;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getvectorui;
        this.RemoteActionCompatParcelizer = onimageavailable;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = vectorPainter;
        this.read = setoutlineambientshadowcolor;
        this.ResultReceiver = setcompositionui;
        this.MediaDescriptionCompat = graphicsLayerImplCompanionDefaultDrawBlock1;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = webViewManager;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = graphicsLayerKt;
        this.PlaybackStateCompatCustomAction = featureFlagProvider;
        this.write = obtainsizepxvpy3zn4;
        this.IconCompatParcelizer = vectorComposeKtPath23;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new VectorPropertyScaleX());
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = mutableStateFlow;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = FlowKt.write(mutableStateFlow);
        int i = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(1, 0, null, 6);
        this.PlaybackStateCompat = sharedFlowImplRemoteActionCompatParcelizer;
        this.MediaMetadataCompat = sharedFlowImplRemoteActionCompatParcelizer;
        int i2 = 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer.plus(new getConfig(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), this, 3)), null, new WebChatViewmodel$fetchChatURL$1(this, shortNewsContentCardView, 3), 2);
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) setoutlineambientshadowcolor).write();
        if (layerSnapshotV21Write != null) {
            setspotshadowcolor = layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        } else {
            int i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 85;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            setspotshadowcolor = null;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setspotshadowcolor, ViewLayer.INSTANCE}, getCieXyz.write())).booleanValue()) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new WebChatViewmodel$fetchChatURL$1(this, shortNewsContentCardView, i), 3);
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new WebChatViewmodel$fetchChatURL$1(this, shortNewsContentCardView, i2), 3);
        }
        int i5 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 63;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 75;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) this.read).write();
        if (layerSnapshotV21Write == null) {
            return false;
        }
        boolean z = layerSnapshotV21Write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i4 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 49;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return z;
    }

    public final void write(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), new getConfig(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), this, 0), null, new RealImageLoader$execute$2$job$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, this, shortNewsContentCardView, 10), 2);
        int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 47;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r1 = r1.globalEntityID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r1 = java.lang.String.valueOf(r1);
        r3 = java.lang.String.valueOf(r7.ParcelableVolumeInfo);
        r4 = java.lang.String.valueOf(r7.read);
        r7 = r7.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r5 = com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 79;
        com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if ((r5 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r2 = r7.id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        r7 = r7.id;
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        return new o.validateSizeN5eqBDc(r1, r3, r4, java.lang.String.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r1 = r7.write;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o.validateSizeN5eqBDc read(com.deliveryhero.selfServiceChat.ui.WebChatViewmodel r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1e
            o.setOutlineAmbientShadowColor r7 = r7.read
            o.ViewLayerVerificationHelper31 r7 = (o.ViewLayerVerificationHelper31) r7
            o.LayerSnapshotV21 r7 = r7.write()
            r1 = 59
            int r1 = r1 / 0
            if (r7 == 0) goto L62
            goto L28
        L1e:
            o.setOutlineAmbientShadowColor r7 = r7.read
            o.ViewLayerVerificationHelper31 r7 = (o.ViewLayerVerificationHelper31) r7
            o.LayerSnapshotV21 r7 = r7.write()
            if (r7 == 0) goto L62
        L28:
            o.LayerSnapshot_androidKt r1 = r7.write
            if (r1 == 0) goto L2f
            java.lang.String r1 = r1.globalEntityID
            goto L30
        L2f:
            r1 = r2
        L30:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = r7.ParcelableVolumeInfo
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r7.read
            java.lang.String r4 = java.lang.String.valueOf(r4)
            o.SurfaceUtils r7 = r7.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus
            if (r7 == 0) goto L58
            int r5 = com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
            int r5 = r5 + 79
            int r6 = r5 % 128
            com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L52
            java.lang.String r2 = r7.id
            goto L58
        L52:
            java.lang.String r7 = r7.id
            r2.hashCode()
            throw r2
        L58:
            java.lang.String r7 = java.lang.String.valueOf(r2)
            o.validateSizeN5eqBDc r0 = new o.validateSizeN5eqBDc
            r0.<init>(r1, r3, r4, r7)
            return r0
        L62:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.read(com.deliveryhero.selfServiceChat.ui.WebChatViewmodel):o.validateSizeN5eqBDc");
    }

    public final Object sendHostEncounteredErrorMessage(String str, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("HOST_ENCOUNTERED_ERROR_");
        ((setAutoMirrorui) this.ResultReceiver).getClass();
        sb.append(System.currentTimeMillis());
        Object objSendMessage = sendMessage(new VectorComposeKtGroup23(sb.toString(), new VectorComposeKtGroup28(new VectorComposeKtGroup24(str))), continuationImpl);
        if (objSendMessage != CoroutineSingletons.COROUTINE_SUSPENDED) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 1;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 51 / 0;
            }
            return createfromparcel;
        }
        int i4 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 71;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objSendMessage;
    }

    public final void IconCompatParcelizer(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 35;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            obtainSizePxVpY3zN4 obtainsizepxvpy3zn4 = this.write;
            boolean z3 = obtainsizepxvpy3zn4.ComponentActivity;
            obtainsizepxvpy3zn4.ComponentActivity = z;
            throw null;
        }
        obtainSizePxVpY3zN4 obtainsizepxvpy3zn5 = this.write;
        boolean z4 = obtainsizepxvpy3zn5.ComponentActivity;
        obtainsizepxvpy3zn5.ComponentActivity = z;
        if (z && !z4) {
            ArrayList arrayList = obtainsizepxvpy3zn5.MediaSessionCompatQueueItem;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    obtainsizepxvpy3zn5.read.b_((getY2) it.next());
                }
                arrayList.clear();
            }
        }
        if (z2) {
            int i3 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 19;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(this);
        BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, new getConfig(ascomposepaintIconCompatParcelizer, this, 2), null, new WebChatViewmodel$trackInitialization$1((ShortNewsContentCardView) null, this, z), 2);
        int i4 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 111;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r8.emit(o.VectorPainterKtRenderVectorGroupconfig1.serializer, r1) == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onCloseRequested(o.getY2 r8, o.ShortNewsContentCardView r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L83
            boolean r1 = r9 instanceof o.VectorPropertyTrimPathOffset
            if (r1 == 0) goto L2f
            r1 = r9
            o.VectorPropertyTrimPathOffset r1 = (o.VectorPropertyTrimPathOffset) r1
            int r3 = r1.write
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L2f
            int r9 = com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
            int r9 = r9 + 85
            int r5 = r9 % 128
            com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = r5
            int r9 = r9 % r0
            if (r9 != 0) goto L2b
            int r3 = r3 % r4
            goto L2c
        L2b:
            int r3 = r3 + r4
        L2c:
            r1.write = r3
            goto L34
        L2f:
            o.VectorPropertyTrimPathOffset r1 = new o.VectorPropertyTrimPathOffset
            r1.<init>(r7, r9)
        L34:
            java.lang.Object r9 = r1.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.write
            r5 = 1
            if (r4 == 0) goto L5a
            int r8 = com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw
            int r8 = r8 + 117
            int r6 = r8 % 128
            com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r6
            int r8 = r8 % r0
            if (r4 == r5) goto L54
            if (r4 != r0) goto L4e
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L80
        L4e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r2
        L54:
            com.deliveryhero.selfServiceChat.ui.WebChatViewmodel r8 = r1.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L71
        L5a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            r8.getClass()
            o.getIntrinsicColorFilterui r9 = new o.getIntrinsicColorFilterui
            r9.<init>(r8)
            r1.read = r7
            r1.write = r5
            java.lang.Object r8 = r7.sendMessage(r9, r1)
            if (r8 != r3) goto L70
            goto L7f
        L70:
            r8 = r7
        L71:
            kotlinx.coroutines.flow.SharedFlowImpl r8 = r8.PlaybackStateCompat
            r1.read = r2
            r1.write = r0
            o.VectorPainterKtRenderVectorGroupconfig1 r9 = o.VectorPainterKtRenderVectorGroupconfig1.serializer
            java.lang.Object r8 = r8.emit(r9, r1)
            if (r8 != r3) goto L80
        L7f:
            return r3
        L80:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            return r8
        L83:
            boolean r8 = r9 instanceof o.VectorPropertyTrimPathOffset
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.onCloseRequested(o.getY2, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r7.emit(o.VectorPath.read, r1) == r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onHCWontHandleBackNavigation(o.getY2 r7, o.ShortNewsContentCardView r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r2
            int r1 = r1 % r0
            boolean r1 = r8 instanceof o.VectorPropertyTrimPathStart
            if (r1 == 0) goto L28
            r1 = r8
            o.VectorPropertyTrimPathStart r1 = (o.VectorPropertyTrimPathStart) r1
            int r2 = r1.read
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L28
            int r8 = com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
            int r8 = r8 + 9
            int r4 = r8 % 128
            com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = r4
            int r8 = r8 % r0
            int r2 = r2 + r3
            r1.read = r2
            goto L2d
        L28:
            o.VectorPropertyTrimPathStart r1 = new o.VectorPropertyTrimPathStart
            r1.<init>(r6, r8)
        L2d:
            java.lang.Object r8 = r1.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.read
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L4b
            if (r3 == r5) goto L45
            if (r3 != r0) goto L3f
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L71
        L3f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r4
        L45:
            com.deliveryhero.selfServiceChat.ui.WebChatViewmodel r7 = r1.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L62
        L4b:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            r7.getClass()
            o.getIntrinsicColorFilterui r8 = new o.getIntrinsicColorFilterui
            r8.<init>(r7)
            r1.write = r6
            r1.read = r5
            java.lang.Object r7 = r6.sendMessage(r8, r1)
            if (r7 != r2) goto L61
            goto L70
        L61:
            r7 = r6
        L62:
            kotlinx.coroutines.flow.SharedFlowImpl r7 = r7.PlaybackStateCompat
            r1.write = r4
            r1.read = r0
            o.VectorPath r8 = o.VectorPath.read
            java.lang.Object r7 = r7.emit(r8, r1)
            if (r7 != r2) goto L71
        L70:
            return r2
        L71:
            o.createFromParcel r7 = o.createFromParcel.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.onHCWontHandleBackNavigation(o.getY2, o.ShortNewsContentCardView):java.lang.Object");
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        Object obj2;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            obj = mutableStateFlow.read();
            ((VectorPropertyScaleX) obj).getClass();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, VectorPropertyScaleX.write()));
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer()) {
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj2, null, false, false, VectorPropertyPivotX.read, false, 19)));
            int i2 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 51;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        write(new WebChatViewmodel$trackInitialization$1(z, this, (ShortNewsContentCardView) null));
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int i3 = 0;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i4 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 15;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                int i5 = 27 / 0;
            } else {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
        }
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), new getConfig(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), this, 1), null, new WebChatViewmodel$fetchChatURL$1(this, shortNewsContentCardView, i3), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object onInitStarted(ShortNewsContentCardView shortNewsContentCardView) {
        VectorPropertyTrimPathEnd vectorPropertyTrimPathEnd;
        WebChatViewmodel webChatViewmodel;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof VectorPropertyTrimPathEnd) {
            int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 71;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            vectorPropertyTrimPathEnd = (VectorPropertyTrimPathEnd) shortNewsContentCardView;
            int i4 = vectorPropertyTrimPathEnd.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vectorPropertyTrimPathEnd.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                vectorPropertyTrimPathEnd = new VectorPropertyTrimPathEnd(this, shortNewsContentCardView);
            }
        } else {
            vectorPropertyTrimPathEnd = new VectorPropertyTrimPathEnd(this, shortNewsContentCardView);
        }
        Object obj = vectorPropertyTrimPathEnd.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = vectorPropertyTrimPathEnd.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i5 != 0) {
            int i6 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 33;
            int i7 = i6 % Fields.SpotShadowColor;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i7;
            int i8 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i7 + 1;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                WebChatViewmodel webChatViewmodel2 = vectorPropertyTrimPathEnd.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                shortNewsContentCardView2.hashCode();
                throw null;
            }
            webChatViewmodel = vectorPropertyTrimPathEnd.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StringBuilder sb = new StringBuilder("HOST_IS_READY_");
            ((setAutoMirrorui) this.ResultReceiver).getClass();
            sb.append(System.currentTimeMillis());
            VectorComposeKtGroup26 vectorComposeKtGroup26 = new VectorComposeKtGroup26(sb.toString(), new VectorComposeKtPath11(accessgetRootScaleXp.RemoteActionCompatParcelizer()));
            vectorPropertyTrimPathEnd.read = this;
            vectorPropertyTrimPathEnd.RemoteActionCompatParcelizer = 1;
            if (sendMessage(vectorComposeKtGroup26, vectorPropertyTrimPathEnd) == coroutineSingletons) {
                return coroutineSingletons;
            }
            webChatViewmodel = this;
        }
        webChatViewmodel.getClass();
        asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodel);
        webChatViewmodel.RatingCompat.getClass();
        webChatViewmodel.ParcelableVolumeInfo = BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer.plus(new getConfig(ascomposepaintIconCompatParcelizer, webChatViewmodel, 2)), null, new WebChatViewmodel$startTimerForTimeout$1$1(shortNewsContentCardView2, webChatViewmodel, 10), 2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i10 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 13;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return createfromparcel;
        }
        shortNewsContentCardView2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Comparable access$cacheGalleryImage(WebChatViewmodel webChatViewmodel, Uri uri, ContinuationImpl continuationImpl) {
        VectorPropertyScaleY vectorPropertyScaleY;
        int i = 2 % 2;
        int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 81;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof VectorPropertyScaleY) {
            vectorPropertyScaleY = (VectorPropertyScaleY) continuationImpl;
            int i4 = vectorPropertyScaleY.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vectorPropertyScaleY.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                vectorPropertyScaleY = new VectorPropertyScaleY(webChatViewmodel, continuationImpl);
            }
        } else {
            vectorPropertyScaleY = new VectorPropertyScaleY(webChatViewmodel, continuationImpl);
        }
        Object objCacheGalleryImage = vectorPropertyScaleY.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = vectorPropertyScaleY.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objCacheGalleryImage);
            GraphicsLayerKt graphicsLayerKt = webChatViewmodel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            String string = uri.toString();
            string.getClass();
            vectorPropertyScaleY.read = webChatViewmodel;
            vectorPropertyScaleY.write = uri;
            vectorPropertyScaleY.RemoteActionCompatParcelizer = 1;
            objCacheGalleryImage = graphicsLayerKt.IconCompatParcelizer.cacheGalleryImage(string, vectorPropertyScaleY);
            if (objCacheGalleryImage == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 97;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            uri = vectorPropertyScaleY.write;
            webChatViewmodel = vectorPropertyScaleY.read;
            ExtrasKt.RemoteActionCompatParcelizer(objCacheGalleryImage);
        }
        accessgetTestFailCreateRenderNodecp accessgettestfailcreaterendernodecp = (accessgetTestFailCreateRenderNodecp) objCacheGalleryImage;
        if (accessgettestfailcreaterendernodecp instanceof GraphicsLayerV23) {
            try {
                Uri uri2 = Uri.parse(((GraphicsLayerV23) accessgettestfailcreaterendernodecp).serializer());
                uri2.getClass();
                int i8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 121;
                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return uri2;
            } catch (Exception e) {
                isIdentityannotations isidentityannotations = webChatViewmodel.RemoteActionCompatParcelizer.serializer;
                if (isidentityannotations != null) {
                    isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "selfServiceChat", "Failed to parse gallery image uri from string path.", e);
                }
            }
        } else {
            if (!(accessgettestfailcreaterendernodecp instanceof setOutline)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            isIdentityannotations isidentityannotations2 = webChatViewmodel.RemoteActionCompatParcelizer.serializer;
            if (isidentityannotations2 != null) {
                isidentityannotations2.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "selfServiceChat", "Failed to cache file from gallery.", ((setOutline) accessgettestfailcreaterendernodecp).IconCompatParcelizer());
            }
        }
        int i10 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 111;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return uri;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (sendMessage(r10, r1) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (sendHostEncounteredErrorMessage("Verification token is invalid", r1) == r3) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendUpdatedVerificationToken(java.lang.String r10, o.ShortNewsContentCardView r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.sendUpdatedVerificationToken(java.lang.String, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
    
        if (r4.notifyBridgeMessageFailure(r10, r1) == r3) goto L40;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x009d, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendMessage(o.getCacheBitmapConfig_sVssgQui r10, o.ShortNewsContentCardView r11) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.selfServiceChat.ui.WebChatViewmodel.sendMessage(o.getCacheBitmapConfig_sVssgQui, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    public final Object notifyBridgeMessageFailure(getCacheBitmapConfig_sVssgQui getcachebitmapconfig_svssgqui, ContinuationImpl continuationImpl) {
        VectorPropertyStroke vectorPropertyStroke;
        WebChatViewmodel webChatViewmodel;
        isIdentityannotations isidentityannotations;
        int i = 2 % 2;
        if (continuationImpl instanceof VectorPropertyStroke) {
            vectorPropertyStroke = (VectorPropertyStroke) continuationImpl;
            int i2 = vectorPropertyStroke.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 103;
                r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                vectorPropertyStroke.read = i2 - Integer.MIN_VALUE;
            } else {
                vectorPropertyStroke = new VectorPropertyStroke(this, continuationImpl);
            }
        } else {
            vectorPropertyStroke = new VectorPropertyStroke(this, continuationImpl);
        }
        Object obj = vectorPropertyStroke.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = vectorPropertyStroke.read;
        if (i5 != 0) {
            int i6 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 19;
            int i7 = i6 % Fields.SpotShadowColor;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i7;
            int i8 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i7 + 45;
            webChatViewmodel = i9 % Fields.SpotShadowColor;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = webChatViewmodel;
            try {
                if (i9 % 2 != 0) {
                    WebChatViewmodel webChatViewmodel2 = vectorPropertyStroke.RemoteActionCompatParcelizer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i10 = 33 / 0;
                    webChatViewmodel = webChatViewmodel2;
                } else {
                    WebChatViewmodel webChatViewmodel3 = vectorPropertyStroke.RemoteActionCompatParcelizer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    webChatViewmodel = webChatViewmodel3;
                }
            } catch (Exception e) {
                e = e;
                isidentityannotations = webChatViewmodel.RemoteActionCompatParcelizer.serializer;
                if (isidentityannotations != null) {
                    isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "EVENT", "Failed to send error message for bridge failure", e);
                }
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                StringBuilder sb = new StringBuilder("HOST_ENCOUNTERED_ERROR_");
                ((setAutoMirrorui) this.ResultReceiver).getClass();
                sb.append(System.currentTimeMillis());
                VectorComposeKtGroup23 vectorComposeKtGroup23 = new VectorComposeKtGroup23(sb.toString(), new VectorComposeKtGroup28(new VectorComposeKtGroup24("Failed to send bridge message: " + getcachebitmapconfig_svssgqui)));
                ((getViewportSizeNHjbRcui) this.serializer).getClass();
                String strRemoteActionCompatParcelizer = getViewportSizeNHjbRcui.IconCompatParcelizer.RemoteActionCompatParcelizer(invokepweu1eQ.RemoteActionCompatParcelizer, vectorComposeKtGroup23);
                SharedFlowImpl sharedFlowImpl = this.PlaybackStateCompat;
                VectorPropertyFill vectorPropertyFill = new VectorPropertyFill(strRemoteActionCompatParcelizer);
                vectorPropertyStroke.RemoteActionCompatParcelizer = this;
                vectorPropertyStroke.read = 1;
                if (sharedFlowImpl.emit(vectorPropertyFill, vectorPropertyStroke) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Exception e2) {
                e = e2;
                webChatViewmodel = this;
                isidentityannotations = webChatViewmodel.RemoteActionCompatParcelizer.serializer;
                if (isidentityannotations != null) {
                    isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "EVENT", "Failed to send error message for bridge failure", e);
                }
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object access$handleMessage(WebChatViewmodel webChatViewmodel, getY2 gety2, ShortNewsContentCardView shortNewsContentCardView) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = 2;
        int i2 = 2 % 2;
        setOutlineAmbientShadowColor setoutlineambientshadowcolor = webChatViewmodel.read;
        onImageAvailable onimageavailable = webChatViewmodel.RemoteActionCompatParcelizer;
        MutableStateFlow mutableStateFlow = webChatViewmodel.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        GraphicsLayerImplCompanionDefaultDrawBlock1 graphicsLayerImplCompanionDefaultDrawBlock1 = webChatViewmodel.MediaDescriptionCompat;
        boolean z = gety2 instanceof insertTopDown;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        String strRemoteActionCompatParcelizer = null;
        if (z) {
            Object objOnInitStarted = webChatViewmodel.onInitStarted(shortNewsContentCardView);
            if (objOnInitStarted == CoroutineSingletons.COROUTINE_SUSPENDED) {
                int i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 107;
                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return objOnInitStarted;
                }
                obj4.hashCode();
                throw null;
            }
        } else if (gety2 instanceof insertBottomUp) {
            int i4 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 43;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = webChatViewmodel.ParcelableVolumeInfo;
                throw null;
            }
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = webChatViewmodel.ParcelableVolumeInfo;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
            }
            webChatViewmodel.write(new WebChatViewmodel$startTimerForTimeout$1$1(webChatViewmodel, (ShortNewsContentCardView) (objArr5 == true ? 1 : 0), 4));
            asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodel);
            webChatViewmodel.RatingCompat.getClass();
            webChatViewmodel.ComponentActivity = BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer.plus(new getConfig(ascomposepaintIconCompatParcelizer, webChatViewmodel, 2)), null, new WebChatViewmodel$startTimerForTimeout$1$1((ShortNewsContentCardView) (objArr4 == true ? 1 : 0), webChatViewmodel, 9), 2);
            do {
                obj3 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj3, null, true, false, null, false, 21)));
        } else if (gety2 instanceof getEmptyArray) {
            webChatViewmodel.write(new WebChatViewmodel$startTimerForTimeout$1$1(webChatViewmodel, (ShortNewsContentCardView) (objArr3 == true ? 1 : 0), 5));
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj2, null, false, false, VectorPropertyPivotX.serializer, false, 16)));
        } else if (gety2 instanceof resizeNodeData) {
            Object objOnCloseRequested = webChatViewmodel.onCloseRequested(gety2, shortNewsContentCardView);
            if (objOnCloseRequested == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objOnCloseRequested;
            }
        } else if (gety2 instanceof arcToBezier) {
            Object objSendMessage = webChatViewmodel.sendMessage(new getIntrinsicColorFilterui(gety2), shortNewsContentCardView);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objSendMessage != coroutineSingletons) {
                objSendMessage = createfromparcel;
            }
            if (objSendMessage == coroutineSingletons) {
                int i5 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 95;
                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return objSendMessage;
                }
                throw null;
            }
        } else if (gety2 instanceof toRadians) {
            Object objOnHCWontHandleBackNavigation = webChatViewmodel.onHCWontHandleBackNavigation(gety2, shortNewsContentCardView);
            if (objOnHCWontHandleBackNavigation == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objOnHCWontHandleBackNavigation;
            }
        } else if (!(gety2 instanceof PathNodeQuadTo) && !(gety2 instanceof getX2)) {
            if (gety2 instanceof getY3) {
                Object objSendMessage2 = webChatViewmodel.sendMessage(((setNameui) webChatViewmodel.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).serializer(), shortNewsContentCardView);
                if (objSendMessage2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    int i6 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 107;
                    r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        return objSendMessage2;
                    }
                    (objArr6 == true ? 1 : 0).hashCode();
                    throw null;
                }
            } else if (gety2 instanceof getArcStartDx) {
                getDefaultDrawBlock getdefaultdrawblock = new getDefaultDrawBlock(((getArcStartDx) gety2).payload.RemoteActionCompatParcelizer());
                CustomerChatEventUseCase$$ExternalSyntheticLambda0 customerChatEventUseCase$$ExternalSyntheticLambda0 = graphicsLayerImplCompanionDefaultDrawBlock1.serializer;
                if (customerChatEventUseCase$$ExternalSyntheticLambda0 != null) {
                    customerChatEventUseCase$$ExternalSyntheticLambda0.invoke(getdefaultdrawblock);
                    return createfromparcel;
                }
            } else if (gety2 instanceof getDy1) {
                getOwnerId getownerid = new getOwnerId(((getDy1) gety2).payload.serializer());
                CustomerChatEventUseCase$$ExternalSyntheticLambda0 customerChatEventUseCase$$ExternalSyntheticLambda1 = graphicsLayerImplCompanionDefaultDrawBlock1.serializer;
                if (customerChatEventUseCase$$ExternalSyntheticLambda1 != null) {
                    int i7 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 103;
                    r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    customerChatEventUseCase$$ExternalSyntheticLambda1.invoke(getownerid);
                    return createfromparcel;
                }
            } else if (gety2 instanceof getDx) {
                record recordVar = record.IconCompatParcelizer;
                CustomerChatEventUseCase$$ExternalSyntheticLambda0 customerChatEventUseCase$$ExternalSyntheticLambda2 = graphicsLayerImplCompanionDefaultDrawBlock1.serializer;
                if (customerChatEventUseCase$$ExternalSyntheticLambda2 != null) {
                    int i9 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 29;
                    r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        customerChatEventUseCase$$ExternalSyntheticLambda2.invoke(recordVar);
                        return createfromparcel;
                    }
                    customerChatEventUseCase$$ExternalSyntheticLambda2.invoke(recordVar);
                    (objArr7 == true ? 1 : 0).hashCode();
                    throw null;
                }
            } else if (gety2 instanceof getDy3) {
                setInvalidated setinvalidated = new setInvalidated(webChatViewmodel.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer());
                CustomerChatEventUseCase$$ExternalSyntheticLambda0 customerChatEventUseCase$$ExternalSyntheticLambda3 = graphicsLayerImplCompanionDefaultDrawBlock1.serializer;
                if (customerChatEventUseCase$$ExternalSyntheticLambda3 != null) {
                    customerChatEventUseCase$$ExternalSyntheticLambda3.invoke(setinvalidated);
                    return createfromparcel;
                }
            } else if (gety2 instanceof PathNodeRelativeReflectiveCurveTo) {
                record recordVar2 = record.RemoteActionCompatParcelizer;
                CustomerChatEventUseCase$$ExternalSyntheticLambda0 customerChatEventUseCase$$ExternalSyntheticLambda4 = graphicsLayerImplCompanionDefaultDrawBlock1.serializer;
                if (customerChatEventUseCase$$ExternalSyntheticLambda4 != null) {
                    customerChatEventUseCase$$ExternalSyntheticLambda4.invoke(recordVar2);
                    return createfromparcel;
                }
            } else if (gety2 instanceof PathNodeKt) {
                setOutlineO0kMr_c setoutlineo0kmr_c = new setOutlineO0kMr_c(((PathNodeKt) gety2).payload.serializer());
                CustomerChatEventUseCase$$ExternalSyntheticLambda0 customerChatEventUseCase$$ExternalSyntheticLambda5 = graphicsLayerImplCompanionDefaultDrawBlock1.serializer;
                if (customerChatEventUseCase$$ExternalSyntheticLambda5 != null) {
                    int i10 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 45;
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        customerChatEventUseCase$$ExternalSyntheticLambda5.invoke(setoutlineo0kmr_c);
                        return createfromparcel;
                    }
                    customerChatEventUseCase$$ExternalSyntheticLambda5.invoke(setoutlineo0kmr_c);
                    (objArr8 == true ? 1 : 0).hashCode();
                    throw null;
                }
            } else {
                if (gety2 instanceof pathNodesFromArgs) {
                    webChatViewmodel.write(new PerseusLogger$w$1(gety2, webChatViewmodel, objArr2 == true ? 1 : 0, i));
                    return createfromparcel;
                }
                if (!(gety2 instanceof accessdoInvalidate)) {
                    int i11 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 99;
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        boolean z2 = gety2 instanceof PathNodeRelativeCurveTo;
                        throw null;
                    }
                    if (gety2 instanceof PathNodeRelativeCurveTo) {
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 = webChatViewmodel.ComponentActivity;
                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 != null) {
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
                        }
                        do {
                            obj = mutableStateFlow.read();
                        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj, null, false, false, null, false, 27)));
                        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = onimageavailable.read;
                        if (gethasnontranslationcomponentsannotations != null) {
                            gethasnontranslationcomponentsannotations.RemoteActionCompatParcelizer("chat_e2e_tap_to_page_loaded");
                            gethasnontranslationcomponentsannotations.RemoteActionCompatParcelizer("chat_web_start_to_rendered");
                            if (gethasnontranslationcomponentsannotations.RemoteActionCompatParcelizer()) {
                                getTransaction gettransaction = gethasnontranslationcomponentsannotations.RatingCompat;
                                if (gettransaction != null) {
                                    gettransaction.RemoteActionCompatParcelizer();
                                }
                                gethasnontranslationcomponentsannotations.MediaSessionCompatQueueItem.clear();
                                gethasnontranslationcomponentsannotations.RatingCompat = null;
                                return createfromparcel;
                            }
                        }
                    } else if (gety2 instanceof toNodes) {
                        ViewLayerVerificationHelper31 viewLayerVerificationHelper31 = (ViewLayerVerificationHelper31) setoutlineambientshadowcolor;
                        LayerSnapshotV21 layerSnapshotV21Write = viewLayerVerificationHelper31.write();
                        if (layerSnapshotV21Write == null || !layerSnapshotV21Write.MediaSessionCompatResultReceiverWrapper) {
                            LayerSnapshotV21 layerSnapshotV21Write2 = viewLayerVerificationHelper31.write();
                            if (layerSnapshotV21Write2 != null) {
                                int i12 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 37;
                                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i12 % Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                strRemoteActionCompatParcelizer = layerSnapshotV21Write2.RemoteActionCompatParcelizer();
                            }
                            Object objSendUpdatedVerificationToken = webChatViewmodel.sendUpdatedVerificationToken(strRemoteActionCompatParcelizer, shortNewsContentCardView);
                            if (objSendUpdatedVerificationToken == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                int i14 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 11;
                                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i14 % Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                return objSendUpdatedVerificationToken;
                            }
                        } else {
                            ProtobufEncoder protobufEncoder = onimageavailable.RemoteActionCompatParcelizer;
                            if (protobufEncoder != null) {
                                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) protobufEncoder.RemoteActionCompatParcelizer, null, null, new ChatTokenProvider$requestAuthTokenRefresh$1(protobufEncoder, objArr == true ? 1 : 0, 0), 3);
                                return createfromparcel;
                            }
                        }
                    } else if (gety2 instanceof PathNodeRelativeReflectiveQuadTo) {
                        SharedFlowImpl sharedFlowImpl = webChatViewmodel.PlaybackStateCompat;
                        getDy getdy = ((PathNodeRelativeReflectiveQuadTo) gety2).payload;
                        Object objEmit = sharedFlowImpl.emit(new VectorPainterKtrememberVectorPainter2composition11(getdy.RemoteActionCompatParcelizer(), getdy.write()), shortNewsContentCardView);
                        if (objEmit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return objEmit;
                        }
                    }
                }
            }
        }
        return createfromparcel;
    }
}
