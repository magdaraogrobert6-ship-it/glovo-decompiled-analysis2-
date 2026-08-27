package com.roadrunner.customerchat.selfservice.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import java.util.concurrent.CancellationException;
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
import o.isItemDismissable;
import o.maxIntrinsicWidth_delegatelambda0;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatViewModel$fetchRequiredInfoForChat$3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ WebChatViewModel serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatViewModel$fetchRequiredInfoForChat$3(WebChatViewModel webChatViewModel, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        WebChatViewModel$fetchRequiredInfoForChat$3 webChatViewModel$fetchRequiredInfoForChat$3 = new WebChatViewModel$fetchRequiredInfoForChat$3(this.serializer, shortNewsContentCardView);
        int i2 = RemoteActionCompatParcelizer + 23;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return webChatViewModel$fetchRequiredInfoForChat$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((WebChatViewModel$fetchRequiredInfoForChat$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = read + 89;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e A[PHI: r1 r5 r6 r7
  0x004e: PHI (r1v9 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel) = 
  (r1v4 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel)
  (r1v11 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel)
 binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x004e: PHI (r5v3 kotlinx.coroutines.flow.MutableStateFlow) = (r5v0 kotlinx.coroutines.flow.MutableStateFlow), (r5v4 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x004e: PHI (r6v6 o.maxIntrinsicWidth_delegatelambda0) = (r6v0 o.maxIntrinsicWidth_delegatelambda0), (r6v7 o.maxIntrinsicWidth_delegatelambda0) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x004e: PHI (r7v6 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r7v0 kotlin.coroutines.intrinsics.CoroutineSingletons), (r7v7 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[DONT_INVERT, PHI: r1 r5 r6 r8
  0x002f: PHI (r1v5 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel) = 
  (r1v4 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel)
  (r1v11 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel)
 binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r5v1 kotlinx.coroutines.flow.MutableStateFlow) = (r5v0 kotlinx.coroutines.flow.MutableStateFlow), (r5v4 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r6v1 o.maxIntrinsicWidth_delegatelambda0) = (r6v0 o.maxIntrinsicWidth_delegatelambda0), (r6v7 o.maxIntrinsicWidth_delegatelambda0) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r8v1 int) = (r8v0 int), (r8v7 int) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        WebChatViewModel webChatViewModel;
        MutableStateFlow mutableStateFlow;
        maxIntrinsicWidth_delegatelambda0 maxintrinsicwidth_delegatelambda0;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        Object objM4890getChatIdgIAlus;
        Object obj2;
        Object obj3;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 111;
        read = i4 % Fields.SpotShadowColor;
        Object obj4 = null;
        if (i4 % 2 == 0) {
            webChatViewModel = this.serializer;
            mutableStateFlow = webChatViewModel.read;
            maxintrinsicwidth_delegatelambda0 = webChatViewModel.PlaybackStateCompatCustomAction;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = this.write;
            int i5 = 53 / 0;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((getInfoListui_text) maxintrinsicwidth_delegatelambda0).serializer("chat_native_activity_get_chat_id");
                SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl = webChatViewModel.defaultViewModelProviderFactory_delegatelambda0;
                String str = webChatViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer.serializer;
                this.write = 1;
                objM4890getChatIdgIAlus = selfServiceCustomerChatRepositoryImpl.m4890getChatIdgIAlus(str, this);
                if (objM4890getChatIdgIAlus == coroutineSingletons) {
                    int i6 = read + 65;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i == 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    i2 = read + 9;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return null;
                    }
                    obj4.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM4890getChatIdgIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            }
        } else {
            webChatViewModel = this.serializer;
            mutableStateFlow = webChatViewModel.read;
            maxintrinsicwidth_delegatelambda0 = webChatViewModel.PlaybackStateCompatCustomAction;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = this.write;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((getInfoListui_text) maxintrinsicwidth_delegatelambda0).serializer("chat_native_activity_get_chat_id");
                SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl2 = webChatViewModel.defaultViewModelProviderFactory_delegatelambda0;
                String str2 = webChatViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer.serializer;
                this.write = 1;
                objM4890getChatIdgIAlus = selfServiceCustomerChatRepositoryImpl2.m4890getChatIdgIAlus(str2, this);
                if (objM4890getChatIdgIAlus == coroutineSingletons) {
                    int i8 = read + 65;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i == 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    i2 = read + 9;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return null;
                    }
                    obj4.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM4890getChatIdgIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            }
        }
        if (!(objM4890getChatIdgIAlus instanceof isItemDismissable)) {
            int i10 = RemoteActionCompatParcelizer + 103;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                obj4.hashCode();
                throw null;
            }
            String str3 = (String) objM4890getChatIdgIAlus;
            do {
                obj3 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, findParagraphByIndex.RemoteActionCompatParcelizer((findParagraphByIndex) obj3, false, false, Boolean.TRUE, str3, 2)));
            ((getInfoListui_text) maxintrinsicwidth_delegatelambda0).write("chat_native_activity_get_chat_id");
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4890getChatIdgIAlus);
        if (thSerializer != null) {
            int i11 = RemoteActionCompatParcelizer + 63;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (thSerializer instanceof CancellationException) {
                throw thSerializer;
            }
            ((addSpans) webChatViewModel._init_lambda4).serializer(fromHtml.ERROR, "WEB_CHAT_OPEN_ERROR", "Fetch ChatID endpoint failed", thSerializer);
            getInfoListui_text getinfolistui_text = (getInfoListui_text) maxintrinsicwidth_delegatelambda0;
            getinfolistui_text.IconCompatParcelizer("chat_e2e_tap_to_page_loaded");
            getinfolistui_text.IconCompatParcelizer("chat_native_tap_to_web_start");
            getinfolistui_text.IconCompatParcelizer("chat_native_before_load_url");
            getinfolistui_text.IconCompatParcelizer("chat_native_activity_get_chat_id");
            getinfolistui_text.read();
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, findParagraphByIndex.RemoteActionCompatParcelizer((findParagraphByIndex) obj2, false, true, null, null, 12)));
        }
        return createFromParcel.INSTANCE;
    }
}
