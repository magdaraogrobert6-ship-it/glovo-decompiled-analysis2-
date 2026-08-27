package com.deliveryhero.selfServiceChat.ui;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.domain.analytics.WebChatEventsTrackerImpl;
import com.deliveryhero.selfServiceChat.domain.analytics.WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.LayerSnapshotV21;
import o.ShortNewsContentCardView;
import o.VectorComposeKtPath21;
import o.VectorPainter;
import o.ViewLayer;
import o.ViewLayerVerificationHelper31;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAutoMirrorui;
import o.setIntrinsicColorFilterui;
import o.setNameui;
import o.validateSizeN5eqBDc;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatViewmodel$trackInitialization$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ WebChatViewmodel RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ int write = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatViewmodel$trackInitialization$1(ShortNewsContentCardView shortNewsContentCardView, WebChatViewmodel webChatViewmodel, boolean z) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = webChatViewmodel;
        this.serializer = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.write;
        boolean z = this.serializer;
        WebChatViewmodel webChatViewmodel = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            WebChatViewmodel$trackInitialization$1 webChatViewmodel$trackInitialization$1 = new WebChatViewmodel$trackInitialization$1(shortNewsContentCardView, webChatViewmodel, z);
            webChatViewmodel$trackInitialization$1.read = obj;
            return webChatViewmodel$trackInitialization$1;
        }
        WebChatViewmodel$trackInitialization$1 webChatViewmodel$trackInitialization$2 = new WebChatViewmodel$trackInitialization$1(z, webChatViewmodel, shortNewsContentCardView);
        webChatViewmodel$trackInitialization$2.read = obj;
        return webChatViewmodel$trackInitialization$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        return i != 0 ? ((WebChatViewmodel$trackInitialization$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((WebChatViewmodel$trackInitialization$1) create((VectorPainter) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WebChatViewmodel webChatViewmodel = this.RemoteActionCompatParcelizer;
        boolean z = this.serializer;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.IconCompatParcelizer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StringBuilder sb = new StringBuilder("HOST_NOTIFIES_ABOUT_WEBVIEW_VISIBILITY_CHANGE_");
                ((setAutoMirrorui) webChatViewmodel.ResultReceiver).getClass();
                sb.append(System.currentTimeMillis());
                VectorComposeKtPath21 vectorComposeKtPath21 = new VectorComposeKtPath21(sb.toString(), z);
                this.IconCompatParcelizer = 1;
                if (webChatViewmodel.sendMessage(vectorComposeKtPath21, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!z) {
                return createfromparcel;
            }
            LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) webChatViewmodel.read).write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layerSnapshotV21Write != null ? layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null, ViewLayer.INSTANCE}, getCieXyz.write())).booleanValue() || ((Boolean) webChatViewmodel.write.MediaSessionCompatToken.read()).booleanValue()) {
                return createfromparcel;
            }
            setIntrinsicColorFilterui setintrinsiccolorfilteruiSerializer = ((setNameui) webChatViewmodel.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).serializer();
            this.IconCompatParcelizer = 2;
            if (webChatViewmodel.sendMessage(setintrinsiccolorfilteruiSerializer, this) != coroutineSingletons) {
                return createfromparcel;
            }
            return coroutineSingletons;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.IconCompatParcelizer;
        if (i3 != 0) {
            if (i3 == 1 || i3 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        VectorPainter vectorPainter = (VectorPainter) this.read;
        if (z) {
            validateSizeN5eqBDc validatesizen5eqbdc = WebChatViewmodel.read(webChatViewmodel);
            if (validatesizen5eqbdc == null) {
                return createfromparcel;
            }
            this.IconCompatParcelizer = 1;
            WebChatEventsTrackerImpl webChatEventsTrackerImpl = (WebChatEventsTrackerImpl) vectorPainter;
            webChatEventsTrackerImpl.getClass();
            Object objIfTrackingEnabled = webChatEventsTrackerImpl.ifTrackingEnabled(this, new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl, validatesizen5eqbdc, objArr2 == true ? 1 : 0, 6));
            if (objIfTrackingEnabled != coroutineSingletons2) {
                objIfTrackingEnabled = createfromparcel;
            }
            if (objIfTrackingEnabled != coroutineSingletons2) {
                return createfromparcel;
            }
        } else {
            validateSizeN5eqBDc validatesizen5eqbdc2 = WebChatViewmodel.read(webChatViewmodel);
            if (validatesizen5eqbdc2 == null) {
                return createfromparcel;
            }
            this.IconCompatParcelizer = 2;
            WebChatEventsTrackerImpl webChatEventsTrackerImpl2 = (WebChatEventsTrackerImpl) vectorPainter;
            webChatEventsTrackerImpl2.getClass();
            Object objIfTrackingEnabled2 = webChatEventsTrackerImpl2.ifTrackingEnabled(this, new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl2, validatesizen5eqbdc2, objArr == true ? 1 : 0, 5));
            if (objIfTrackingEnabled2 != coroutineSingletons2) {
                objIfTrackingEnabled2 = createfromparcel;
            }
            if (objIfTrackingEnabled2 != coroutineSingletons2) {
                return createfromparcel;
            }
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatViewmodel$trackInitialization$1(boolean z, WebChatViewmodel webChatViewmodel, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = z;
        this.RemoteActionCompatParcelizer = webChatViewmodel;
    }
}
