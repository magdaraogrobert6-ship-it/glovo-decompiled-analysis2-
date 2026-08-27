package com.deliveryhero.selfServiceChat.ui;

import android.net.Uri;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.SharedFlowImpl;
import o.ShortNewsContentCardView;
import o.VectorPropertyFillAlpha;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ WebChatViewmodel IconCompatParcelizer;
    public final /* synthetic */ Uri RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1(ShortNewsContentCardView shortNewsContentCardView, WebChatViewmodel webChatViewmodel, Uri uri, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.IconCompatParcelizer = webChatViewmodel;
        this.RemoteActionCompatParcelizer = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.serializer;
        Uri uri = this.RemoteActionCompatParcelizer;
        WebChatViewmodel webChatViewmodel = this.IconCompatParcelizer;
        if (i != 0) {
            WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1 webChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1 = new WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1(shortNewsContentCardView, webChatViewmodel, uri, 1);
            webChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1.read = obj;
            return webChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1;
        }
        WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1 webChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$2 = new WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1(shortNewsContentCardView, webChatViewmodel, uri, 0);
        webChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$2.read = obj;
        return webChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((WebChatViewmodel$onCameraImageSelectionSuccess$$inlined$launchWithGenericExceptionHandler$default$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Uri uri = this.RemoteActionCompatParcelizer;
        WebChatViewmodel webChatViewmodel = this.IconCompatParcelizer;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.write;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SharedFlowImpl sharedFlowImpl = webChatViewmodel.PlaybackStateCompat;
            VectorPropertyFillAlpha vectorPropertyFillAlpha = new VectorPropertyFillAlpha(uri);
            this.write = 1;
            return sharedFlowImpl.emit(vectorPropertyFillAlpha, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.write;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.write = 1;
            obj = WebChatViewmodel.access$cacheGalleryImage(webChatViewmodel, uri, this);
            if (obj != coroutineSingletons2) {
            }
            return coroutineSingletons2;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        SharedFlowImpl sharedFlowImpl2 = webChatViewmodel.PlaybackStateCompat;
        VectorPropertyFillAlpha vectorPropertyFillAlpha2 = new VectorPropertyFillAlpha((Uri) obj);
        this.write = 2;
        if (sharedFlowImpl2.emit(vectorPropertyFillAlpha2, this) != coroutineSingletons2) {
            return createfromparcel;
        }
        return coroutineSingletons2;
    }
}
