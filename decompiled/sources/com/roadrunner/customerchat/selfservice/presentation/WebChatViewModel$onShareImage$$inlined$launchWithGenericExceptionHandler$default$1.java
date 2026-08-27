package com.roadrunner.customerchat.selfservice.presentation;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.grpc.internal.SharedResourcePool;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ExperimentalTextApi;
import o.ShortNewsContentCardView;
import o.accessanalyzeComponents58bKbWc;
import o.addSpan;
import o.addSpans;
import o.applyPausedPrecomposition;
import o.copyElsmlbk;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getEndIndex;
import o.getLineBreakLgCVezo;
import o.getParagraph;
import o.getStartIndex;
import o.mergedefault;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toGlobalxdX6G0;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ WebChatViewModel read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1(ShortNewsContentCardView shortNewsContentCardView, WebChatViewModel webChatViewModel, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.read = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 123;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        WebChatViewModel webChatViewModel = this.read;
        if (i5 == 0) {
            WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1 webChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1 = new WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1(shortNewsContentCardView, webChatViewModel, 0);
            webChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1.RemoteActionCompatParcelizer = obj;
            int i6 = serializer + 83;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 23 / 0;
            }
            return webChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1;
        }
        int i8 = 1;
        if (i5 != 1) {
            WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1 webChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$2 = new WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1(shortNewsContentCardView, webChatViewModel, i);
            webChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$2.RemoteActionCompatParcelizer = obj;
            return webChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$2;
        }
        WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1 webChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$3 = new WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1(shortNewsContentCardView, webChatViewModel, i8);
        webChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$3.RemoteActionCompatParcelizer = obj;
        return webChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 == 0) {
            ((WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = serializer + 121;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        if (i2 == 1) {
            ((WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 113;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        Object obj2;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WebChatViewModel webChatViewModel = this.read;
        if (i4 != 0) {
            if (i4 == 1) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                webChatViewModel.RemoteActionCompatParcelizer.serializer(getEndIndex.write);
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow = webChatViewModel.serializer;
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj2, null, false, false, toGlobalxdX6G0.RemoteActionCompatParcelizer, false, false, 50)));
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        SharedResourcePool sharedResourcePool = webChatViewModel.RemoteActionCompatParcelizer;
        applyPausedPrecomposition applypausedprecompositionRemoteActionCompatParcelizer = webChatViewModel.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.RemoteActionCompatParcelizer(webChatViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer.IconCompatParcelizer);
        if (applypausedprecompositionRemoteActionCompatParcelizer instanceof addSpan) {
            uri = ((addSpan) applypausedprecompositionRemoteActionCompatParcelizer).IconCompatParcelizer;
        } else {
            if (!(applypausedprecompositionRemoteActionCompatParcelizer instanceof ExperimentalTextApi)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i5 = IconCompatParcelizer + 117;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                ((addSpans) webChatViewModel._init_lambda4).serializer("WEB_CHAT_IMAGE_SENDING_FAILED", ((ExperimentalTextApi) applypausedprecompositionRemoteActionCompatParcelizer).read);
                int i6 = 7 / 0;
            } else {
                ((addSpans) webChatViewModel._init_lambda4).serializer("WEB_CHAT_IMAGE_SENDING_FAILED", ((ExperimentalTextApi) applypausedprecompositionRemoteActionCompatParcelizer).read);
            }
            uri = null;
        }
        if (uri == null) {
            sharedResourcePool.serializer(new getStartIndex(null));
            return createfromparcel;
        }
        mergedefault copyelsmlbk = ((FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) webChatViewModel.ResultReceiver).serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_CHAT_IMAGE_SHARING_CAMERA_ONLY_ENABLED.getFirebaseFlagName()) ? new copyElsmlbk(uri) : new getLineBreakLgCVezo(uri);
        webChatViewModel.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = copyelsmlbk;
        sharedResourcePool.serializer(new getStartIndex(copyelsmlbk));
        return createfromparcel;
    }
}
