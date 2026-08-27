package com.braze.ui.banners;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.f2$$ExternalSyntheticLambda4;
import bo.app.n$$ExternalSyntheticLambda3;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.events.BannerDismissedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.managers.banners.IBannerView;
import com.braze.models.Banner;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import com.braze.ui.banners.utils.BannerWebViewClient;
import com.braze.ui.support.WebViewUtilsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.ensureSubscribedToInAppMessageEvents;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BannerView extends WebView implements IBannerView {
    private static final Companion Companion = new Companion(null);
    private static final String JS_BRIDGE_NAME = "brazeInternalBridge";
    private String _placementId;
    private final BannerView$attachStateListener$1 attachStateListener;
    private String currentUserId;
    private final AtomicReference<PendingBannerDismissSnapshot> dismissSnapshot;
    private final IEventSubscriber<BannerDismissedEvent> dismissSubscriber;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM heightCallback;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM internalHeightCallback;
    private final AtomicBoolean isDismissed;
    private String loadedHtml;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onDismissCallback;

    private final void init(AttributeSet attributeSet, int i) {
        setBackgroundColor(0);
        Context context = getContext();
        context.getClass();
        int[] iArr = R.styleable.BannerView;
        iArr.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BannerView_placementId)) {
            this._placementId = typedArrayObtainStyledAttributes.getString(R.styleable.BannerView_placementId);
        }
        typedArrayObtainStyledAttributes.recycle();
        initBanner(getPlacementId());
    }

    private final void setWebviewToEmpty() {
        this.loadedHtml = null;
        Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            new Handler(Looper.getMainLooper()).post(new BannerView$$ExternalSyntheticLambda2(this, 1));
            return;
        }
        loadData("", "text/html", "base64");
        invalidate();
        this.internalHeightCallback.invoke(Double.valueOf(0.0d));
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getHeightCallback() {
        return this.heightCallback;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnDismissCallback() {
        return this.onDismissCallback;
    }

    public final String getPlacementId() {
        return this._placementId;
    }

    public final void setHeightCallback(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.heightCallback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setOnDismissCallback(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onDismissCallback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismiss$lambda$0(BannerView bannerView) {
        if (bannerView.isDismissed.get()) {
            bannerView.performDismissTeardown();
        }
    }

    public final void setPlacementId(String str) {
        this._placementId = str;
        initBanner(str);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View$OnAttachStateChangeListener, com.braze.ui.banners.BannerView$attachStateListener$1] */
    public BannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.isDismissed = new AtomicBoolean(false);
        this.dismissSnapshot = new AtomicReference<>(null);
        this.dismissSubscriber = new BannerView$$ExternalSyntheticLambda0(0, this);
        ?? r4 = new View.OnAttachStateChangeListener() { // from class: com.braze.ui.banners.BannerView$attachStateListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                view.getClass();
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context context2 = this.this$0.getContext();
                context2.getClass();
                brazeInternal.subscribeToBannersDismissedEvent(context2, this.this$0.dismissSubscriber);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                view.getClass();
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context context2 = this.this$0.getContext();
                context2.getClass();
                brazeInternal.unsubscribeFromBannersDismissedEvent(context2, this.this$0.dismissSubscriber);
            }
        };
        this.attachStateListener = r4;
        this.internalHeightCallback = new f2$$ExternalSyntheticLambda4(13, this);
        addOnAttachStateChangeListener(r4);
        init(attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissSubscriber$lambda$0(BannerView bannerView, BannerDismissedEvent bannerDismissedEvent) {
        bannerDismissedEvent.getClass();
        Object[] objArr = {bannerDismissedEvent.getPlacementId(), bannerView._placementId};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            bannerView.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadHtmlData(String str) {
        if (this.isDismissed.getAndSet(false)) {
            onResume();
            getSettings().setJavaScriptEnabled(true);
            setVisibility(0);
        }
        configureWebView(str);
        String str2 = this.loadedHtml;
        if (str2 != null) {
            byte[] bytes = str2.getBytes(ensureSubscribedToInAppMessageEvents.write);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(bytes, 1);
            if (strEncodeToString == null) {
                strEncodeToString = "";
            }
            loadData(strEncodeToString, "text/html", "base64");
            invalidate();
        }
    }

    private final void performDismissTeardown() {
        try {
            stopLoading();
            setWebviewToEmpty();
            clearHistory();
            final int i = 0;
            getSettings().setJavaScriptEnabled(false);
            removeJavascriptInterface("brazeInternalBridge");
            setWebViewClient(new WebViewClient());
            onPause();
            setVisibility(8);
            fireOnDismissCallback();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.braze.ui.banners.BannerView$$ExternalSyntheticLambda3
                public final /* synthetic */ BannerView f$0;

                {
                    this.f$0 = this;
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i2 = i;
                    BannerView bannerView = this.f$0;
                    return i2 != 0 ? BannerView.performDismissTeardown$lambda$1(bannerView) : BannerView.performDismissTeardown$lambda$0(bannerView);
                }
            }, 6, (Object) null);
        } catch (Exception e) {
            final int i2 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.braze.ui.banners.BannerView$$ExternalSyntheticLambda3
                public final /* synthetic */ BannerView f$0;

                {
                    this.f$0 = this;
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i3 = i2;
                    BannerView bannerView = this.f$0;
                    return i3 != 0 ? BannerView.performDismissTeardown$lambda$1(bannerView) : BannerView.performDismissTeardown$lambda$0(bannerView);
                }
            }, 4, (Object) null);
        }
    }

    @Override // com.braze.managers.banners.IBannerView
    public void initBanner(String str) {
        Banner banner;
        if (str != null) {
            Braze.Companion companion = Braze.Companion;
            Context context = getContext();
            context.getClass();
            banner = companion.getInstance(context).getBanner(str);
        } else {
            banner = null;
        }
        AtomicReference<PendingBannerDismissSnapshot> atomicReference = this.dismissSnapshot;
        if (banner == null) {
            atomicReference.set(null);
            this.currentUserId = null;
            setWebviewToEmpty();
            if (str != null) {
                BrazeInternal.INSTANCE.addBannerViewMonitor(str, this, true);
                return;
            }
            return;
        }
        atomicReference.set(new PendingBannerDismissSnapshot(banner.getPlacementId(), banner.getStableKey(), banner.getTrackingId()));
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{banner.getHtml(), this.loadedHtml}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{banner.getUserId(), this.currentUserId}, getCieXyz.write())).booleanValue()) {
                return;
            }
        }
        this.loadedHtml = banner.getHtml();
        this.currentUserId = banner.getUserId();
        if (banner.isControl()) {
            setWebviewToEmpty();
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Looper.myLooper(), Looper.getMainLooper()}, getCieXyz.write())).booleanValue()) {
                new Handler(Looper.getMainLooper()).post(new w4$$ExternalSyntheticLambda0(this, 11, str));
            } else {
                loadHtmlData(str);
            }
        }
        BrazeInternal.INSTANCE.addBannerViewMonitor(banner.getPlacementId(), this, false);
    }

    private final void configureWebView(String str) {
        WebSettings settings = getSettings();
        settings.getClass();
        Context context = getContext();
        context.getClass();
        WebViewUtilsKt.setWebViewSettings(settings, context);
        setLayerType(2, null);
        setBackgroundColor(0);
        Context context2 = getContext();
        context2.getClass();
        setWebViewClient(new BannerWebViewClient(context2, createBannerWebViewClientListener$android_sdk_ui_release(str)));
        Context context3 = getContext();
        context3.getClass();
        addJavascriptInterface(new BannerJavascriptInterface(context3, str, this.internalHeightCallback), "brazeInternalBridge");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss() {
        int i = 0;
        if (this.isDismissed.compareAndSet(false, true)) {
            Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                performDismissTeardown();
            } else {
                new Handler(Looper.getMainLooper()).post(new BannerView$$ExternalSyntheticLambda2(this, i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performDismissTeardown$lambda$0(BannerView bannerView) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Banner dismiss completed. placementId=", bannerView._placementId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performDismissTeardown$lambda$1(BannerView bannerView) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Banner dismiss: error during view teardown or onDismissCallback for placementId=", bannerView._placementId);
    }

    private final void fireOnDismissCallback() {
        String placementId;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onDismissCallback;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
            return;
        }
        PendingBannerDismissSnapshot pendingBannerDismissSnapshot = this.dismissSnapshot.get();
        if (pendingBannerDismissSnapshot == null || (placementId = pendingBannerDismissSnapshot.getPlacementId()) == null) {
            placementId = this._placementId;
        }
        String stableKey = pendingBannerDismissSnapshot != null ? pendingBannerDismissSnapshot.getStableKey() : null;
        String trackingId = pendingBannerDismissSnapshot != null ? pendingBannerDismissSnapshot.getTrackingId() : null;
        BannerDismissSnapshot bannerDismissSnapshotFromNullableFields = BannerDismissSnapshot.Companion.fromNullableFields(placementId, stableKey, trackingId);
        if (bannerDismissSnapshotFromNullableFields == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda3(placementId, stableKey, trackingId, 12), 6, (Object) null);
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(bannerDismissSnapshotFromNullableFields);
        }
    }

    public final DefaultBannerWebViewClientListener createBannerWebViewClientListener$android_sdk_ui_release(final String str) {
        str.getClass();
        return new DefaultBannerWebViewClientListener(str) { // from class: com.braze.ui.banners.BannerView$createBannerWebViewClientListener$1
            @Override // com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener, com.braze.ui.banners.listeners.IBannerWebViewClientListener
            public void onCloseAction(Context context, String str2, Bundle bundle) {
                context.getClass();
                str2.getClass();
                bundle.getClass();
                super.onCloseAction(context, str2, bundle);
                this.dismiss();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fireOnDismissCallback$lambda$0(String str, String str2, String str3) {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Banner dismiss callback skipped because required snapshot fields were missing. placementId=", str, " stableKey=", str2, " trackingId=");
        sbM.append(str3);
        return sbM.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWebviewToEmpty$lambda$0(BannerView bannerView) {
        bannerView.loadData("", "text/html", "base64");
        bannerView.invalidate();
        bannerView.internalHeightCallback.invoke(Double.valueOf(0.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel internalHeightCallback$lambda$0(BannerView bannerView, double d) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = bannerView.heightCallback;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Double.valueOf(d));
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View$OnAttachStateChangeListener, com.braze.ui.banners.BannerView$attachStateListener$1] */
    public BannerView(Context context) {
        super(context);
        context.getClass();
        this.isDismissed = new AtomicBoolean(false);
        this.dismissSnapshot = new AtomicReference<>(null);
        this.dismissSubscriber = new BannerView$$ExternalSyntheticLambda0(0, this);
        ?? r5 = new View.OnAttachStateChangeListener() { // from class: com.braze.ui.banners.BannerView$attachStateListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                view.getClass();
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context context2 = this.this$0.getContext();
                context2.getClass();
                brazeInternal.subscribeToBannersDismissedEvent(context2, this.this$0.dismissSubscriber);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                view.getClass();
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context context2 = this.this$0.getContext();
                context2.getClass();
                brazeInternal.unsubscribeFromBannersDismissedEvent(context2, this.this$0.dismissSubscriber);
            }
        };
        this.attachStateListener = r5;
        this.internalHeightCallback = new f2$$ExternalSyntheticLambda4(13, this);
        addOnAttachStateChangeListener(r5);
        init(null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View$OnAttachStateChangeListener, com.braze.ui.banners.BannerView$attachStateListener$1] */
    public BannerView(Context context, String str) {
        super(context);
        context.getClass();
        this.isDismissed = new AtomicBoolean(false);
        this.dismissSnapshot = new AtomicReference<>(null);
        this.dismissSubscriber = new BannerView$$ExternalSyntheticLambda0(0, this);
        ?? r5 = new View.OnAttachStateChangeListener() { // from class: com.braze.ui.banners.BannerView$attachStateListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                view.getClass();
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context context2 = this.this$0.getContext();
                context2.getClass();
                brazeInternal.subscribeToBannersDismissedEvent(context2, this.this$0.dismissSubscriber);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                view.getClass();
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context context2 = this.this$0.getContext();
                context2.getClass();
                brazeInternal.unsubscribeFromBannersDismissedEvent(context2, this.this$0.dismissSubscriber);
            }
        };
        this.attachStateListener = r5;
        this.internalHeightCallback = new f2$$ExternalSyntheticLambda4(13, this);
        this._placementId = str;
        addOnAttachStateChangeListener(r5);
        init(null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View$OnAttachStateChangeListener, com.braze.ui.banners.BannerView$attachStateListener$1] */
    public BannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        this.isDismissed = new AtomicBoolean(false);
        this.dismissSnapshot = new AtomicReference<>(null);
        this.dismissSubscriber = new BannerView$$ExternalSyntheticLambda0(0, this);
        ?? r3 = new View.OnAttachStateChangeListener() { // from class: com.braze.ui.banners.BannerView$attachStateListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                view.getClass();
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context context2 = this.this$0.getContext();
                context2.getClass();
                brazeInternal.subscribeToBannersDismissedEvent(context2, this.this$0.dismissSubscriber);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                view.getClass();
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context context2 = this.this$0.getContext();
                context2.getClass();
                brazeInternal.unsubscribeFromBannersDismissedEvent(context2, this.this$0.dismissSubscriber);
            }
        };
        this.attachStateListener = r3;
        this.internalHeightCallback = new f2$$ExternalSyntheticLambda4(13, this);
        addOnAttachStateChangeListener(r3);
        init(attributeSet, i);
    }
}
