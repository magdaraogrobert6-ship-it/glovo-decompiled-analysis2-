package com.roadrunner.web.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewFragment$observeViewState$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ WebViewFragment RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewFragment$observeViewState$1(WebViewFragment webViewFragment, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = webViewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 113;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        WebViewFragment webViewFragment = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            return new WebViewFragment$observeViewState$1(webViewFragment, shortNewsContentCardView, 1);
        }
        WebViewFragment$observeViewState$1 webViewFragment$observeViewState$1 = new WebViewFragment$observeViewState$1(webViewFragment, shortNewsContentCardView, 0);
        int i4 = write + 17;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return webViewFragment$observeViewState$1;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 37;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((WebViewFragment$observeViewState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((WebViewFragment$observeViewState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = write + 95;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        WebViewFragment webViewFragment = this.RemoteActionCompatParcelizer;
        ?? r4 = 0;
        r4 = 0;
        int i3 = 1;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.serializer;
            if (i4 != 0) {
                int i5 = write + 55;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp viewLifecycleOwner = webViewFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.STARTED;
                WebViewFragment$observeViewState$1 webViewFragment$observeViewState$1 = new WebViewFragment$observeViewState$1(webViewFragment, r4, i3);
                this.serializer = 1;
                if (UrlUtils.repeatOnLifecycle(viewLifecycleOwner, tocolorlong8_81lla, webViewFragment$observeViewState$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.serializer;
        if (i6 != 0) {
            int i7 = read + 115;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i9 = read + 33;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                DrawableTransformation.read();
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StateFlow stateFlow = webViewFragment.RatingCompat().RatingCompat;
            RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(29, webViewFragment);
            this.serializer = 1;
            if (stateFlow.collect(anonymousClass1, this) == coroutineSingletons2) {
                int i11 = read + 11;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                r4 = coroutineSingletons2;
            } else {
                DrawableTransformation.read();
            }
        }
        int i13 = read + 43;
        write = i13 % Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return r4;
    }
}
