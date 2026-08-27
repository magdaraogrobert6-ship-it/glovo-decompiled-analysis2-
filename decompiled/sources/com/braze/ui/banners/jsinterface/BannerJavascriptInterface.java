package com.braze.ui.banners.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import bo.app.hg$$ExternalSyntheticLambda5;
import coil3.ExtrasKt;
import com.braze.Braze;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class BannerJavascriptInterface extends JavascriptInterfaceBase {
    private final String placementId;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM setHeightCallback;
    private final BannerUserJavascriptInterface user;

    /* JADX INFO: renamed from: com.braze.ui.banners.jsinterface.BannerJavascriptInterface$requestPushPermission$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int label;

        public AnonymousClass2(ShortNewsContentCardView<? super AnonymousClass2> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass2(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.Companion.getInstance().getActivity());
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel _init_$lambda$0(double d) {
        return createFromParcel.INSTANCE;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getSetHeightCallback() {
        return this.setHeightCallback;
    }

    @JavascriptInterface
    public final BannerUserJavascriptInterface getUser() {
        return this.user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$0() {
        return "Banner logButtonClick() called. Logging banner click with button ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$0() {
        return "Banner logClick() called. Logging banner click without button ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermission$lambda$0() {
        return "Banner requestPushPermission() called. Requesting push permission now.";
    }

    @JavascriptInterface
    public final void beforeMessageClosed() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda28(7, this), 6, (Object) null);
        Braze.Companion.getInstance(getContext()).dismissBanner(this.placementId);
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logButtonClick(String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(16), 6, (Object) null);
        Braze.Companion.getInstance(getContext()).logBannerClick(this.placementId, str);
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logClick() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(17), 6, (Object) null);
        Braze.Companion.getInstance(getContext()).logBannerClick(this.placementId, null);
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(18), 6, (Object) null);
        BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new AnonymousClass2(null), 3);
    }

    @JavascriptInterface
    public final void setBannerHeight(final double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d < 0.0d) {
            final int i = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.ui.banners.jsinterface.BannerJavascriptInterface$$ExternalSyntheticLambda5
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    return i != 0 ? BannerJavascriptInterface.setBannerHeight$lambda$1(d) : BannerJavascriptInterface.setBannerHeight$lambda$0(d);
                }
            }, 7, (Object) null);
        } else {
            final int i2 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.ui.banners.jsinterface.BannerJavascriptInterface$$ExternalSyntheticLambda5
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    return i2 != 0 ? BannerJavascriptInterface.setBannerHeight$lambda$1(d) : BannerJavascriptInterface.setBannerHeight$lambda$0(d);
                }
            }, 6, (Object) null);
            this.setHeightCallback.invoke(Double.valueOf(d));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerJavascriptInterface(Context context, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(context);
        context.getClass();
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.placementId = str;
        this.setHeightCallback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.user = new BannerUserJavascriptInterface(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String beforeMessageClosed$lambda$0(BannerJavascriptInterface bannerJavascriptInterface) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Banner dismiss triggered from WebView bridge (beforeMessageClosed). placementId=", bannerJavascriptInterface.placementId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBannerHeight$lambda$0(double d) {
        return "Banner setBannerHeight(" + d + ") called with invalid height. Height must be a finite number, not NaN, and greater or equal to 0.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBannerHeight$lambda$1(double d) {
        return "Banner setBannerHeight(" + d + ") called.";
    }

    public /* synthetic */ BannerJavascriptInterface(Context context, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new hg$$ExternalSyntheticLambda5(3) : r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
