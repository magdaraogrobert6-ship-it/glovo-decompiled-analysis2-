package com.roadrunner.customerchat.selfservice.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.huawei.riemann.gnsslocation.core.bean.log.GpsRtiItem;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ShortNewsContentCardView;
import o.addSpans;
import o.createFromParcel;
import o.findParagraphByIndex;
import o.fromHtml;
import o.getContentViewGroupParentLayout;
import o.getInfoListui_text;
import o.getParagraph;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toGlobalYPosition;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ WebChatViewModel RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Throwable serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1(Throwable th, ShortNewsContentCardView shortNewsContentCardView, WebChatViewModel webChatViewModel, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = th;
        this.RemoteActionCompatParcelizer = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 117;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        WebChatViewModel webChatViewModel = this.RemoteActionCompatParcelizer;
        Throwable th = this.serializer;
        if (i5 != 0) {
            int i6 = 1;
            if (i5 != 1) {
                return i5 != 2 ? new WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewModel, 3) : new WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewModel, i);
            }
            return new WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewModel, i6);
        }
        WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1 webChatViewModel$trackEvent$$inlined$exceptionHandler$1$1 = new WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewModel, 0);
        int i7 = write + 21;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return webChatViewModel$trackEvent$$inlined$exceptionHandler$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            ((WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i4 == 1) {
            ((WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i4 == 2) {
            ((WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((WebChatViewModel$trackEvent$$inlined$exceptionHandler$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = write + 101;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WebChatViewModel webChatViewModel = this.RemoteActionCompatParcelizer;
        Throwable th = this.serializer;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((addSpans) webChatViewModel._init_lambda4).serializer("WEB_CHAT_TRACKING_ERROR_EVENT", th);
            return createfromparcel;
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow = webChatViewModel.serializer;
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj2, null, false, false, new toGlobalYPosition(th), false, false, 51)));
            Object[] objArr = {webChatViewModel, new WebChatViewModel$fetchChatUrl$1.AnonymousClass2(webChatViewModel, (ShortNewsContentCardView) null, i)};
            int iWrite = GpsRtiItem.write();
            WebChatViewModel.IconCompatParcelizer(1681248497, objArr, GpsRtiItem.write(), -1681248494, GpsRtiItem.write(), iWrite, GpsRtiItem.write());
            int i4 = write + 81;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        if (i3 != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((addSpans) webChatViewModel._init_lambda4).serializer("WEB_CHAT_TRACKING_ERROR_EVENT", th);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ((addSpans) webChatViewModel._init_lambda4).serializer(fromHtml.ERROR, "WEB_CHAT_OPEN_ERROR", "Fetch ChatID endpoint failed", th);
        getInfoListui_text getinfolistui_text = (getInfoListui_text) webChatViewModel.PlaybackStateCompatCustomAction;
        getinfolistui_text.IconCompatParcelizer("chat_e2e_tap_to_page_loaded");
        getinfolistui_text.IconCompatParcelizer("chat_native_tap_to_web_start");
        getinfolistui_text.IconCompatParcelizer("chat_native_before_load_url");
        getinfolistui_text.IconCompatParcelizer("chat_native_activity_get_chat_id");
        getinfolistui_text.read();
        MutableStateFlow mutableStateFlow2 = webChatViewModel.read;
        do {
            obj3 = mutableStateFlow2.read();
        } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj3, findParagraphByIndex.RemoteActionCompatParcelizer((findParagraphByIndex) obj3, false, true, null, null, 12)));
        int i6 = write + 1;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
