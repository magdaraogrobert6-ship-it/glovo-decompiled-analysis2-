package coil3.intercept;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.MutatorMutex$mutate$2;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import coil3.memory.MemoryCacheService;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DelayKt;
import o.AndroidColorSpace_androidKt;
import o.AndroidGraphicsContextUniqueDrawingIdApi29;
import o.PathDefaultImpls;
import o.PixelMap;
import o.PointMode;
import o.RadialGradient;
import o.ShaderKt;
import o.ShortNewsContentCardView;
import o.StrokeCapCompanion;
import o.TextAnnouncementContentCardView;
import o.accessandjd;
import o.accessgetBevelcp;
import o.accessgetLayerBlockp;
import o.accessgetLinescp;
import o.accessgetPointscp;
import o.accessgetPolygoncp;
import o.accessiteratorjd;
import o.accessplusjd;
import o.accessquadraticTojd;
import o.accessregisterComponentCallback;
import o.accessrewindjd;
import o.asComposeColorFilter;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getBlurRadius;
import o.getBlurRadiusannotations;
import o.getBufferOffset;
import o.getColor0d7_KjUannotations;
import o.getContentViewGroupParentLayout;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getDoneSegment;
import o.getRadiusui_graphics;
import o.getReverseDifferenceb3I0S0c;
import o.getSegmentdefault;
import o.getUnregisteredInAppMessageannotations;
import o.getWaAFU9c;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.supportsColorMatrixQuery;
import o.toAndroidColorSpace;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public final class EngineInterceptor {
    public final Extras$Key IconCompatParcelizer;
    public final RealImageLoader read;
    public final MemoryCacheService serializer;
    public final StrokeCapCompanion write;

    /* JADX INFO: renamed from: coil3.intercept.EngineInterceptor$intercept$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ Object IconCompatParcelizer;
        public Object MediaBrowserCompatMediaItem;
        public int MediaMetadataCompat;
        public Object MediaSessionCompatQueueItem;
        public final /* synthetic */ int RatingCompat = 0;
        public final /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ Object read;
        public Object serializer;
        public final /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EngineInterceptor engineInterceptor, ShaderKt shaderKt, Object obj, getBlurRadiusannotations getblurradiusannotations, accessquadraticTojd accessquadratictojd, accessgetPointscp accessgetpointscp, RealInterceptorChain realInterceptorChain, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.MediaSessionCompatQueueItem = engineInterceptor;
            this.MediaBrowserCompatMediaItem = shaderKt;
            this.serializer = obj;
            this.write = getblurradiusannotations;
            this.read = accessquadratictojd;
            this.RemoteActionCompatParcelizer = accessgetpointscp;
            this.IconCompatParcelizer = realInterceptorChain;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = this.RatingCompat;
            Object obj2 = this.IconCompatParcelizer;
            Object obj3 = this.RemoteActionCompatParcelizer;
            Object obj4 = this.read;
            Object obj5 = this.write;
            return i != 0 ? new AnonymousClass2((supportsColorMatrixQuery) obj5, (toColorLong8_81llA) obj4, (getContentViewGroupParentLayout) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView) : new AnonymousClass2((EngineInterceptor) this.MediaSessionCompatQueueItem, (ShaderKt) this.MediaBrowserCompatMediaItem, this.serializer, (getBlurRadiusannotations) obj5, (accessquadraticTojd) obj4, (accessgetPointscp) obj3, (RealInterceptorChain) obj2, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.RatingCompat;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            return i != 0 ? ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0094  */
        /* JADX WARN: Code duplicated, block: B:26:0x009d  */
        /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objAccess$execute;
            boolean z;
            getRadiusui_graphics getradiusui_graphicsWrite;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber2;
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0;
            toAndroidColorSpace toandroidcolorspace;
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda1;
            toAndroidColorSpace toandroidcolorspace2;
            if (this.RatingCompat == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.MediaMetadataCompat;
                if (i == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    EngineInterceptor engineInterceptor = (EngineInterceptor) this.MediaSessionCompatQueueItem;
                    ShaderKt shaderKt = (ShaderKt) this.MediaBrowserCompatMediaItem;
                    Object obj2 = this.serializer;
                    getBlurRadiusannotations getblurradiusannotations = (getBlurRadiusannotations) this.write;
                    accessquadraticTojd accessquadratictojd = (accessquadraticTojd) this.read;
                    this.MediaMetadataCompat = 1;
                    objAccess$execute = EngineInterceptor.access$execute(engineInterceptor, shaderKt, obj2, getblurradiusannotations, accessquadratictojd, this);
                    if (objAccess$execute == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objAccess$execute = obj;
                }
                getBufferOffset getbufferoffset = (getBufferOffset) objAccess$execute;
                StrokeCapCompanion strokeCapCompanion = ((EngineInterceptor) this.MediaSessionCompatQueueItem).write;
                synchronized (strokeCapCompanion) {
                    RealImageLoader realImageLoader = (RealImageLoader) strokeCapCompanion.RemoteActionCompatParcelizer.get();
                    if (realImageLoader == null) {
                        strokeCapCompanion.serializer();
                    } else if (strokeCapCompanion.serializer == null) {
                        Context context = realImageLoader.write.serializer;
                        strokeCapCompanion.serializer = context;
                        context.registerComponentCallbacks(strokeCapCompanion.write);
                    }
                }
                MemoryCacheService memoryCacheService = ((EngineInterceptor) this.MediaSessionCompatQueueItem).serializer;
                accessgetPointscp accessgetpointscp = (accessgetPointscp) this.RemoteActionCompatParcelizer;
                ShaderKt shaderKt2 = (ShaderKt) this.MediaBrowserCompatMediaItem;
                if (accessgetpointscp == null || !shaderKt2.ResultReceiver.getWriteEnabled() || !getbufferoffset.write.serializer() || (getradiusui_graphicsWrite = ((RealImageLoader) memoryCacheService.RemoteActionCompatParcelizer).write()) == null) {
                    z = false;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("coil#is_sampled", Boolean.valueOf(getbufferoffset.IconCompatParcelizer));
                    String str = getbufferoffset.RemoteActionCompatParcelizer;
                    if (str != null) {
                        linkedHashMap.put("coil#disk_cache_key", str);
                    }
                    accessrewindjd accessrewindjdVar = getbufferoffset.write;
                    Map mapWrite = DelayKt.write(linkedHashMap);
                    synchronized (getradiusui_graphicsWrite.RemoteActionCompatParcelizer) {
                        long j = accessrewindjdVar.read();
                        if (j < 0) {
                            throw new IllegalStateException(("Image size must be non-negative: " + j).toString());
                        }
                        getradiusui_graphicsWrite.IconCompatParcelizer.serializer(accessgetpointscp, accessrewindjdVar, mapWrite, j);
                    }
                    z = true;
                }
                accessrewindjd accessrewindjdVar2 = getbufferoffset.write;
                ShaderKt shaderKt3 = (ShaderKt) this.MediaBrowserCompatMediaItem;
                getSegmentdefault getsegmentdefault = getbufferoffset.serializer;
                accessgetPointscp accessgetpointscp2 = z ? (accessgetPointscp) this.RemoteActionCompatParcelizer : null;
                String str2 = getbufferoffset.RemoteActionCompatParcelizer;
                boolean z2 = getbufferoffset.IconCompatParcelizer;
                RealInterceptorChain realInterceptorChain = (RealInterceptorChain) this.IconCompatParcelizer;
                return new getColor0d7_KjUannotations(accessrewindjdVar2, shaderKt3, getsegmentdefault, accessgetpointscp2, str2, z2, realInterceptorChain != null && realInterceptorChain.IconCompatParcelizer);
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            supportsColorMatrixQuery supportscolormatrixquery = (supportsColorMatrixQuery) this.write;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.MediaMetadataCompat;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (((accessregisterComponentCallback) supportscolormatrixquery).RatingCompat != toColorLong8_81llA.DESTROYED) {
                    createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                    createInAppMessageEventSubscriber createinappmessageeventsubscriber3 = new createInAppMessageEventSubscriber();
                    try {
                        toColorLong8_81llA tocolorlong8_81lla = (toColorLong8_81llA) this.read;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer;
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.IconCompatParcelizer;
                        this.MediaSessionCompatQueueItem = createinappmessageeventsubscriber;
                        this.MediaBrowserCompatMediaItem = createinappmessageeventsubscriber3;
                        this.serializer = getcontentviewgroupparentlayout;
                        this.MediaMetadataCompat = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(this));
                        cancellableContinuationImpl.read();
                        AndroidColorSpace_androidKt.Companion.getClass();
                        AndroidGraphicsContextUniqueDrawingIdApi29 androidGraphicsContextUniqueDrawingIdApi29 = new AndroidGraphicsContextUniqueDrawingIdApi29(asComposeColorFilter.serializer(tocolorlong8_81lla), createinappmessageeventsubscriber, getcontentviewgroupparentlayout, asComposeColorFilter.write(tocolorlong8_81lla), cancellableContinuationImpl, getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer(), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                        createinappmessageeventsubscriber3.IconCompatParcelizer = androidGraphicsContextUniqueDrawingIdApi29;
                        supportscolormatrixquery.IconCompatParcelizer(androidGraphicsContextUniqueDrawingIdApi29);
                        if (cancellableContinuationImpl.getResult() == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        createinappmessageeventsubscriber2 = createinappmessageeventsubscriber3;
                        setallviewgroupchildrenasnonaccessibilityimportantlambda1 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) createinappmessageeventsubscriber.IconCompatParcelizer;
                        if (setallviewgroupchildrenasnonaccessibilityimportantlambda1 != null) {
                            setallviewgroupchildrenasnonaccessibilityimportantlambda1.write(null);
                        }
                        toandroidcolorspace2 = (toAndroidColorSpace) createinappmessageeventsubscriber2.IconCompatParcelizer;
                        if (toandroidcolorspace2 != null) {
                            supportscolormatrixquery.read(toandroidcolorspace2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        createinappmessageeventsubscriber2 = createinappmessageeventsubscriber3;
                        setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) createinappmessageeventsubscriber.IconCompatParcelizer;
                        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
                        }
                        toandroidcolorspace = (toAndroidColorSpace) createinappmessageeventsubscriber2.IconCompatParcelizer;
                        if (toandroidcolorspace != null) {
                            supportscolormatrixquery.read(toandroidcolorspace);
                        }
                        throw th;
                    }
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                createinappmessageeventsubscriber2 = (createInAppMessageEventSubscriber) this.MediaBrowserCompatMediaItem;
                createinappmessageeventsubscriber = (createInAppMessageEventSubscriber) this.MediaSessionCompatQueueItem;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    setallviewgroupchildrenasnonaccessibilityimportantlambda1 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) createinappmessageeventsubscriber.IconCompatParcelizer;
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda1 != null) {
                        setallviewgroupchildrenasnonaccessibilityimportantlambda1.write(null);
                    }
                    toandroidcolorspace2 = (toAndroidColorSpace) createinappmessageeventsubscriber2.IconCompatParcelizer;
                    if (toandroidcolorspace2 != null) {
                        supportscolormatrixquery.read(toandroidcolorspace2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) createinappmessageeventsubscriber.IconCompatParcelizer;
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                        setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
                    }
                    toandroidcolorspace = (toAndroidColorSpace) createinappmessageeventsubscriber2.IconCompatParcelizer;
                    if (toandroidcolorspace != null) {
                        supportscolormatrixquery.read(toandroidcolorspace);
                    }
                    throw th;
                }
            }
            return createfromparcel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(supportsColorMatrixQuery supportscolormatrixquery, toColorLong8_81llA tocolorlong8_81lla, getContentViewGroupParentLayout getcontentviewgroupparentlayout, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.write = supportscolormatrixquery;
            this.read = tocolorlong8_81lla;
            this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
            this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ba  */
    public static final Object access$execute(EngineInterceptor engineInterceptor, ShaderKt shaderKt, Object obj, getBlurRadiusannotations getblurradiusannotations, accessquadraticTojd accessquadratictojd, ContinuationImpl continuationImpl) throws Throwable {
        PointMode pointMode;
        createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        PixelMap pixelMap;
        Object obj2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber3;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber4;
        ShaderKt shaderKt2;
        accessquadraticTojd accessquadratictojd2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber5;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber6;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber7;
        Object obj3;
        accessquadraticTojd accessquadratictojd3;
        ShaderKt shaderKt3;
        getBufferOffset getbufferoffset;
        accessquadraticTojd accessquadratictojd4;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber8;
        Object obj4;
        PixelMap pixelMap2;
        getReverseDifferenceb3I0S0c getreversedifferenceb3i0s0c;
        Object obj5;
        PixelMap pixelMap3;
        getReverseDifferenceb3I0S0c getreversedifferenceb3i0s0c2;
        accessrewindjd accessrewindjdVar;
        if (continuationImpl instanceof PointMode) {
            pointMode = (PointMode) continuationImpl;
            int i = pointMode.RatingCompat;
            if ((i & Integer.MIN_VALUE) != 0) {
                pointMode.RatingCompat = i - Integer.MIN_VALUE;
            } else {
                pointMode = new PointMode(engineInterceptor, continuationImpl);
            }
        } else {
            pointMode = new PointMode(engineInterceptor, continuationImpl);
        }
        PointMode pointMode2 = pointMode;
        Object objFetch = pointMode2.MediaDescriptionCompat;
        Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pointMode2.RatingCompat;
        try {
            if (i2 == 0) {
                createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(objFetch);
                createinappmessageeventsubscriberM3979m.IconCompatParcelizer = getblurradiusannotations;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber9 = new createInAppMessageEventSubscriber();
                createinappmessageeventsubscriber9.IconCompatParcelizer = engineInterceptor.read.serializer;
                createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                try {
                    getBlurRadiusannotations getblurradiusannotations2 = (getBlurRadiusannotations) createinappmessageeventsubscriberM3979m.IconCompatParcelizer;
                    accessplusjd accessplusjdVar = getblurradiusannotations2.read;
                    Bitmap.Config config = Bitmap.Config.HARDWARE;
                    createinappmessageeventsubscriberM3979m.IconCompatParcelizer = getblurradiusannotations2;
                    shaderKt.getClass();
                    accessandjd accessandjdVar = (accessandjd) createinappmessageeventsubscriber9.IconCompatParcelizer;
                    getBlurRadiusannotations getblurradiusannotations3 = (getBlurRadiusannotations) createinappmessageeventsubscriberM3979m.IconCompatParcelizer;
                    pointMode2.write = shaderKt;
                    pointMode2.IconCompatParcelizer = obj;
                    pointMode2.serializer = accessquadratictojd;
                    pointMode2.read = createinappmessageeventsubscriberM3979m;
                    pointMode2.RemoteActionCompatParcelizer = createinappmessageeventsubscriber9;
                    pointMode2.MediaSessionCompatQueueItem = createinappmessageeventsubscriber;
                    pointMode2.MediaBrowserCompatMediaItem = createinappmessageeventsubscriber;
                    pointMode2.RatingCompat = 1;
                    objFetch = engineInterceptor.fetch(accessandjdVar, shaderKt, obj, getblurradiusannotations3, accessquadratictojd, pointMode2);
                    if (objFetch == obj6) {
                        return obj6;
                    }
                    obj2 = obj;
                    createinappmessageeventsubscriber2 = createinappmessageeventsubscriber9;
                    createinappmessageeventsubscriber3 = createinappmessageeventsubscriber;
                    createinappmessageeventsubscriber4 = createinappmessageeventsubscriber3;
                    shaderKt2 = shaderKt;
                    accessquadratictojd2 = accessquadratictojd;
                } catch (Throwable th) {
                    th = th;
                    pixelMap = null;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        createinappmessageeventsubscriber7 = pointMode2.read;
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber10 = (createInAppMessageEventSubscriber) pointMode2.serializer;
                        accessquadratictojd3 = (accessquadraticTojd) pointMode2.IconCompatParcelizer;
                        shaderKt3 = pointMode2.write;
                        try {
                            ExtrasKt.RemoteActionCompatParcelizer(objFetch);
                            createinappmessageeventsubscriber6 = createinappmessageeventsubscriber10;
                            obj3 = obj6;
                            try {
                                getbufferoffset = (getBufferOffset) objFetch;
                                createinappmessageeventsubscriber8 = createinappmessageeventsubscriber7;
                                accessquadratictojd4 = accessquadratictojd3;
                                shaderKt2 = shaderKt3;
                                createInAppMessageEventSubscriber createinappmessageeventsubscriber11 = createinappmessageeventsubscriber6;
                                obj5 = createinappmessageeventsubscriber8.IconCompatParcelizer;
                                if (obj5 instanceof PixelMap) {
                                    pixelMap3 = (PixelMap) obj5;
                                } else {
                                    pixelMap3 = null;
                                }
                                if (pixelMap3 != null && (getreversedifferenceb3i0s0c2 = pixelMap3.serializer) != null) {
                                    try {
                                        af$$ExternalSyntheticOutline0.m(getreversedifferenceb3i0s0c2);
                                    } catch (RuntimeException e) {
                                        throw e;
                                    } catch (Exception unused) {
                                    }
                                }
                                getBlurRadiusannotations getblurradiusannotations4 = (getBlurRadiusannotations) createinappmessageeventsubscriber11.IconCompatParcelizer;
                                pointMode2.write = null;
                                pointMode2.IconCompatParcelizer = null;
                                pointMode2.serializer = null;
                                pointMode2.read = null;
                                pointMode2.RemoteActionCompatParcelizer = null;
                                pointMode2.MediaSessionCompatQueueItem = null;
                                pointMode2.MediaBrowserCompatMediaItem = null;
                                pointMode2.RatingCompat = 3;
                                objFetch = SQLite.transform(getbufferoffset, shaderKt2, getblurradiusannotations4, accessquadratictojd4, pointMode2);
                                if (objFetch == obj3) {
                                    return obj3;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                pixelMap = null;
                                createinappmessageeventsubscriber = createinappmessageeventsubscriber7;
                                obj4 = createinappmessageeventsubscriber.IconCompatParcelizer;
                                if (obj4 instanceof PixelMap) {
                                    pixelMap2 = (PixelMap) obj4;
                                } else {
                                    pixelMap2 = pixelMap;
                                }
                                if (pixelMap2 != null) {
                                    try {
                                        af$$ExternalSyntheticOutline0.m(getreversedifferenceb3i0s0c);
                                    } catch (RuntimeException e2) {
                                        throw e2;
                                    } catch (Exception unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            pixelMap = null;
                        }
                    } else {
                        if (i2 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(objFetch);
                    }
                    getBufferOffset getbufferoffset2 = (getBufferOffset) objFetch;
                    accessrewindjdVar = getbufferoffset2.write;
                    Bitmap.Config[] configArr = accessgetBevelcp.write;
                    if (accessrewindjdVar instanceof accessiteratorjd) {
                        ((accessiteratorjd) accessrewindjdVar).serializer.prepareToDraw();
                    }
                    return getbufferoffset2;
                }
                createinappmessageeventsubscriber3 = pointMode2.MediaBrowserCompatMediaItem;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber12 = pointMode2.MediaSessionCompatQueueItem;
                createinappmessageeventsubscriber2 = pointMode2.RemoteActionCompatParcelizer;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber13 = pointMode2.read;
                accessquadraticTojd accessquadratictojd5 = (accessquadraticTojd) pointMode2.serializer;
                Object obj7 = pointMode2.IconCompatParcelizer;
                ShaderKt shaderKt4 = pointMode2.write;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(objFetch);
                    accessquadratictojd2 = accessquadratictojd5;
                    obj2 = obj7;
                    shaderKt2 = shaderKt4;
                    createinappmessageeventsubscriber4 = createinappmessageeventsubscriber12;
                    createinappmessageeventsubscriberM3979m = createinappmessageeventsubscriber13;
                } catch (Throwable th4) {
                    th = th4;
                    createinappmessageeventsubscriber5 = createinappmessageeventsubscriber12;
                    pixelMap = null;
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber5;
                    obj4 = createinappmessageeventsubscriber.IconCompatParcelizer;
                    if (obj4 instanceof PixelMap) {
                        pixelMap2 = (PixelMap) obj4;
                    } else {
                        pixelMap2 = pixelMap;
                    }
                    if (pixelMap2 != null) {
                        af$$ExternalSyntheticOutline0.m(getreversedifferenceb3i0s0c);
                    }
                    throw th;
                }
            }
            createinappmessageeventsubscriber3.IconCompatParcelizer = objFetch;
            Object obj8 = createinappmessageeventsubscriber4.IconCompatParcelizer;
            getDoneSegment getdonesegment = (getDoneSegment) obj8;
            if (!(getdonesegment instanceof PixelMap)) {
                createInAppMessageEventSubscriber createinappmessageeventsubscriber14 = createinappmessageeventsubscriber4;
                createinappmessageeventsubscriber6 = createinappmessageeventsubscriberM3979m;
                obj3 = obj6;
                accessquadraticTojd accessquadratictojd6 = accessquadratictojd2;
                try {
                    if (getdonesegment instanceof getWaAFU9c) {
                        try {
                            getbufferoffset = new getBufferOffset(((getWaAFU9c) obj8).serializer, ((getWaAFU9c) obj8).read, ((getWaAFU9c) obj8).RemoteActionCompatParcelizer, null);
                            accessquadratictojd4 = accessquadratictojd6;
                            createinappmessageeventsubscriber8 = createinappmessageeventsubscriber14;
                        } catch (Throwable th5) {
                            th = th5;
                            pixelMap = null;
                        }
                    } else {
                        pixelMap = null;
                        try {
                            throw new NoWhenBranchMatchedException();
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    pixelMap = null;
                }
                createinappmessageeventsubscriber7 = createinappmessageeventsubscriber14;
                createinappmessageeventsubscriber = createinappmessageeventsubscriber7;
                obj4 = createinappmessageeventsubscriber.IconCompatParcelizer;
                if (obj4 instanceof PixelMap) {
                    pixelMap2 = (PixelMap) obj4;
                } else {
                    pixelMap2 = pixelMap;
                }
                if (pixelMap2 != null && (getreversedifferenceb3i0s0c = pixelMap2.serializer) != null) {
                    af$$ExternalSyntheticOutline0.m(getreversedifferenceb3i0s0c);
                }
                throw th;
            }
            try {
                TextAnnouncementContentCardView textAnnouncementContentCardView = shaderKt2.RemoteActionCompatParcelizer;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber15 = createinappmessageeventsubscriber4;
                createinappmessageeventsubscriber6 = createinappmessageeventsubscriberM3979m;
                accessquadraticTojd accessquadratictojd7 = accessquadratictojd2;
                try {
                    MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(engineInterceptor, createinappmessageeventsubscriber4, createinappmessageeventsubscriber2, shaderKt2, obj2, createinappmessageeventsubscriberM3979m, accessquadratictojd2, null);
                    pointMode2.write = shaderKt2;
                    pointMode2.IconCompatParcelizer = accessquadratictojd7;
                    pointMode2.serializer = createinappmessageeventsubscriber6;
                    pointMode2.read = createinappmessageeventsubscriber15;
                    pointMode2.RemoteActionCompatParcelizer = null;
                    pointMode2.MediaSessionCompatQueueItem = null;
                    pointMode2.MediaBrowserCompatMediaItem = null;
                    pointMode2.RatingCompat = 2;
                    objFetch = BuildersKt.withContext(textAnnouncementContentCardView, mutatorMutex$mutate$2, pointMode2);
                    obj3 = obj6;
                    if (objFetch == obj3) {
                        return obj3;
                    }
                    accessquadratictojd3 = accessquadratictojd7;
                    createinappmessageeventsubscriber7 = createinappmessageeventsubscriber15;
                    shaderKt3 = shaderKt2;
                    getbufferoffset = (getBufferOffset) objFetch;
                    createinappmessageeventsubscriber8 = createinappmessageeventsubscriber7;
                    accessquadratictojd4 = accessquadratictojd3;
                    shaderKt2 = shaderKt3;
                } catch (Throwable th8) {
                    th = th8;
                    createinappmessageeventsubscriber7 = createinappmessageeventsubscriber15;
                    pixelMap = null;
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber7;
                    obj4 = createinappmessageeventsubscriber.IconCompatParcelizer;
                    if (obj4 instanceof PixelMap) {
                        pixelMap2 = (PixelMap) obj4;
                    } else {
                        pixelMap2 = pixelMap;
                    }
                    if (pixelMap2 != null) {
                        af$$ExternalSyntheticOutline0.m(getreversedifferenceb3i0s0c);
                    }
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                createinappmessageeventsubscriber5 = createinappmessageeventsubscriber4;
                pixelMap = null;
                createinappmessageeventsubscriber = createinappmessageeventsubscriber5;
                obj4 = createinappmessageeventsubscriber.IconCompatParcelizer;
                if (obj4 instanceof PixelMap) {
                    pixelMap2 = (PixelMap) obj4;
                } else {
                    pixelMap2 = pixelMap;
                }
                if (pixelMap2 != null) {
                    af$$ExternalSyntheticOutline0.m(getreversedifferenceb3i0s0c);
                }
                throw th;
            }
            createInAppMessageEventSubscriber createinappmessageeventsubscriber16 = createinappmessageeventsubscriber6;
            obj5 = createinappmessageeventsubscriber8.IconCompatParcelizer;
            if (obj5 instanceof PixelMap) {
                pixelMap3 = (PixelMap) obj5;
            } else {
                pixelMap3 = null;
            }
            if (pixelMap3 != null) {
                af$$ExternalSyntheticOutline0.m(getreversedifferenceb3i0s0c2);
            }
            getBlurRadiusannotations getblurradiusannotations5 = (getBlurRadiusannotations) createinappmessageeventsubscriber16.IconCompatParcelizer;
            pointMode2.write = null;
            pointMode2.IconCompatParcelizer = null;
            pointMode2.serializer = null;
            pointMode2.read = null;
            pointMode2.RemoteActionCompatParcelizer = null;
            pointMode2.MediaSessionCompatQueueItem = null;
            pointMode2.MediaBrowserCompatMediaItem = null;
            pointMode2.RatingCompat = 3;
            objFetch = SQLite.transform(getbufferoffset, shaderKt2, getblurradiusannotations5, accessquadratictojd4, pointMode2);
            if (objFetch == obj3) {
                return obj3;
            }
            getBufferOffset getbufferoffset3 = (getBufferOffset) objFetch;
            accessrewindjdVar = getbufferoffset3.write;
            Bitmap.Config[] configArr2 = accessgetBevelcp.write;
            if (accessrewindjdVar instanceof accessiteratorjd) {
                ((accessiteratorjd) accessrewindjdVar).serializer.prepareToDraw();
            }
            return getbufferoffset3;
        } catch (Throwable th10) {
            th = th10;
            createinappmessageeventsubscriber5 = createinappmessageeventsubscriber4;
            pixelMap = null;
            createinappmessageeventsubscriber = createinappmessageeventsubscriber5;
            obj4 = createinappmessageeventsubscriber.IconCompatParcelizer;
            if (obj4 instanceof PixelMap) {
                pixelMap2 = (PixelMap) obj4;
            } else {
                pixelMap2 = pixelMap;
            }
            if (pixelMap2 != null) {
                af$$ExternalSyntheticOutline0.m(getreversedifferenceb3i0s0c);
            }
            throw th;
        }
    }

    public EngineInterceptor(RealImageLoader realImageLoader, StrokeCapCompanion strokeCapCompanion, Extras$Key extras$Key) {
        this.read = realImageLoader;
        this.write = strokeCapCompanion;
        this.IconCompatParcelizer = extras$Key;
        MemoryCacheService memoryCacheService = new MemoryCacheService();
        memoryCacheService.RemoteActionCompatParcelizer = realImageLoader;
        this.serializer = memoryCacheService;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072 A[LOOP:0: B:16:0x0052->B:20:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009f -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$decode(coil3.intercept.EngineInterceptor r7, o.PixelMap r8, o.accessandjd r9, o.ShaderKt r10, java.lang.Object r11, o.getBlurRadiusannotations r12, o.accessquadraticTojd r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.access$decode(coil3.intercept.EngineInterceptor, o.PixelMap, o.accessandjd, o.ShaderKt, java.lang.Object, o.getBlurRadiusannotations, o.accessquadraticTojd, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c6 -> B:29:0x00ca). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object fetch(o.accessandjd r18, o.ShaderKt r19, java.lang.Object r20, o.getBlurRadiusannotations r21, o.accessquadraticTojd r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.fetch(o.accessandjd, o.ShaderKt, java.lang.Object, o.getBlurRadiusannotations, o.accessquadraticTojd, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object intercept(RealInterceptorChain realInterceptorChain, ContinuationImpl continuationImpl) throws Throwable {
        accessgetLinescp accessgetlinescp;
        RealInterceptorChain realInterceptorChain2;
        MemoryCacheService memoryCacheService = this.serializer;
        if (continuationImpl instanceof accessgetLinescp) {
            accessgetlinescp = (accessgetLinescp) continuationImpl;
            int i = accessgetlinescp.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessgetlinescp.serializer = i - Integer.MIN_VALUE;
            } else {
                accessgetlinescp = new accessgetLinescp(this, continuationImpl);
            }
        } else {
            accessgetlinescp = new accessgetLinescp(this, continuationImpl);
        }
        accessgetLinescp accessgetlinescp2 = accessgetlinescp;
        Object obj = accessgetlinescp2.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accessgetlinescp2.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                ShaderKt shaderKt = realInterceptorChain.MediaMetadataCompat;
                Object obj2 = shaderKt.write;
                accessgetLayerBlockp accessgetlayerblockp = realInterceptorChain.MediaSessionCompatQueueItem;
                accessquadraticTojd accessquadratictojd = realInterceptorChain.serializer;
                getBlurRadiusannotations getblurradiusannotationsWrite = this.IconCompatParcelizer.write(shaderKt, accessgetlayerblockp);
                getBlurRadius getblurradius = getblurradiusannotationsWrite.MediaBrowserCompatMediaItem;
                List list = this.read.serializer.MediaDescriptionCompat;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) list.get(i3);
                    accessgetPolygoncp accessgetpolygoncp = (accessgetPolygoncp) onviewattachedtowindowlambda0.serializer;
                    if (((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) ((getUnregisteredInAppMessageannotations) onviewattachedtowindowlambda0.write)).read(obj2)) {
                        accessgetpolygoncp.getClass();
                        PathDefaultImpls pathDefaultImplsIconCompatParcelizer = accessgetpolygoncp.IconCompatParcelizer(obj2, getblurradiusannotationsWrite);
                        if (pathDefaultImplsIconCompatParcelizer != null) {
                            obj2 = pathDefaultImplsIconCompatParcelizer;
                        }
                    }
                }
                accessgetPointscp accessgetpointscpRemoteActionCompatParcelizer = memoryCacheService.RemoteActionCompatParcelizer(shaderKt, obj2, getblurradiusannotationsWrite, accessquadratictojd);
                RadialGradient radialGradientRemoteActionCompatParcelizer = accessgetpointscpRemoteActionCompatParcelizer != null ? memoryCacheService.RemoteActionCompatParcelizer(shaderKt, accessgetpointscpRemoteActionCompatParcelizer, accessgetlayerblockp, getblurradius) : null;
                if (radialGradientRemoteActionCompatParcelizer != null) {
                    Map map = radialGradientRemoteActionCompatParcelizer.read;
                    accessrewindjd accessrewindjdVar = radialGradientRemoteActionCompatParcelizer.IconCompatParcelizer;
                    getSegmentdefault getsegmentdefault = getSegmentdefault.MEMORY_CACHE;
                    Object obj3 = map.get("coil#disk_cache_key");
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    Object obj4 = map.get("coil#is_sampled");
                    Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                    return new getColor0d7_KjUannotations(accessrewindjdVar, shaderKt, getsegmentdefault, accessgetpointscpRemoteActionCompatParcelizer, str, bool != null ? bool.booleanValue() : false, realInterceptorChain.IconCompatParcelizer);
                }
                TextAnnouncementContentCardView textAnnouncementContentCardView = shaderKt.MediaSessionCompatResultReceiverWrapper;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, shaderKt, obj2, getblurradiusannotationsWrite, accessquadratictojd, accessgetpointscpRemoteActionCompatParcelizer, realInterceptorChain, null);
                accessgetlinescp2.read = realInterceptorChain;
                accessgetlinescp2.serializer = 1;
                Object objWithContext = BuildersKt.withContext(textAnnouncementContentCardView, anonymousClass2, accessgetlinescp2);
                return objWithContext == coroutineSingletons ? coroutineSingletons : objWithContext;
            } catch (Throwable th) {
                th = th;
                realInterceptorChain2 = realInterceptorChain;
            }
        } else if (i2 == 1) {
            realInterceptorChain2 = accessgetlinescp2.read;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (!(th instanceof CancellationException)) {
            return UtilsKt.write(realInterceptorChain2.MediaMetadataCompat, th);
        }
        throw th;
    }
}
