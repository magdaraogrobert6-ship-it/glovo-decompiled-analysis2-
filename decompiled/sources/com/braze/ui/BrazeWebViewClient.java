package com.braze.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.braze.BrazeInternal;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.support.i$$ExternalSyntheticLambda1;
import com.braze.ui.actions.UriAction$$ExternalSyntheticLambda4;
import com.braze.ui.banners.listeners.IBannerWebViewClientListener;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.support.UriUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.FocusOwnerImplmoveFocusfocusSearchSuccess1;
import o.ShortNewsContentCardView;
import o.SweepGradientShader9KIMszodefault;
import o.createFromParcel;
import o.getActiveFocusTargetNode;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getLowestValueslo4al4;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onItemDismisslambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.toDoubleimpl;
import o.toFloatimpl;
import o.withSignqCeQghg;

/* JADX INFO: loaded from: classes.dex */
public class BrazeWebViewClient extends WebViewClient {
    private static final String AUTHORITY_NAME_CLOSE = "close";
    private static final String AUTHORITY_NAME_CUSTOM_EVENT = "customEvent";
    private static final String BRAZE_CUSTOM_EVENT_NAME_KEY = "name";
    private static final String BRAZE_SCHEME = "appboy";
    public static final String BRIDGE_JS_FILE = "braze-html-bridge.js";
    public static final Companion Companion = new Companion(null);
    public static final String JAVASCRIPT_PREFIX = "javascript:";
    public static final String QUERY_NAME_BUTTON_ID = "abButtonId";
    public static final String QUERY_NAME_DEEPLINK = "abDeepLink";
    public static final String QUERY_NAME_EXTERNAL_OPEN = "abExternalOpen";
    private final toFloatimpl assetLoader;
    private final IBannerWebViewClientListener bannerWebViewClientListener;
    private final Context context;
    private final AtomicBoolean hasCalledPageFinishedOnListener;
    private boolean hasPageFinishedLoading;
    private final IInAppMessage inAppMessage;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    private setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 markPageFinishedJob;
    private final int maxOnPageFinishedWaitTimeMs;
    private final Type type;
    private IWebViewClientStateListener webViewClientStateListener;

    public enum Type {
        BANNER,
        IN_APP_MESSAGE;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.BrazeWebViewClient$setWebViewClientStateListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        int label;

        /* JADX INFO: renamed from: com.braze.ui.BrazeWebViewClient$setWebViewClientStateListener$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00121 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            int label;
            final /* synthetic */ BrazeWebViewClient this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
                return new C00121(this.this$0, shortNewsContentCardView);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.this$0.markPageFinished();
                return createFromParcel.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00121(BrazeWebViewClient brazeWebViewClient, ShortNewsContentCardView<? super C00121> shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.this$0 = brazeWebViewClient;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                return ((C00121) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
            return BrazeWebViewClient.this.new AnonymousClass1(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.read;
                C00121 c00121 = new C00121(BrazeWebViewClient.this, null);
                this.label = 1;
                if (BuildersKt.withContext(mainCoroutineDispatcher, c00121, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$0$0(String str) {
        return str;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Type getType() {
        return this.type;
    }

    private final void appendBridgeJavascript(WebView webView) throws Throwable {
        try {
            AssetManager assets = this.context.getAssets();
            assets.getClass();
            webView.loadUrl(JAVASCRIPT_PREFIX + BrazeFileUtils.getAssetFileStringContents(assets, BRIDGE_JS_FILE));
        } catch (Exception e) {
            if (this.type == Type.IN_APP_MESSAGE) {
                BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(false);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda28(5, this), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String appendBridgeJavascript$lambda$0(BrazeWebViewClient brazeWebViewClient) {
        return ff$$ExternalSyntheticOutline0.m("Failed to get HTML ", brazeWebViewClient.type.name(), " javascript additions");
    }

    public static final Bundle getBundleFromUrl(String str) {
        return Companion.getBundleFromUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleQueryAction$lambda$0(Uri uri) {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Uri authority was null. Uri: ");
    }

    private final boolean handleUrlOverride(String str) {
        String str2;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener;
        Type type = this.type;
        if (type == Type.IN_APP_MESSAGE && this.inAppMessageWebViewClientListener == null) {
            str2 = "BrazeWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.";
        } else if (type == Type.BANNER && this.bannerWebViewClientListener == null) {
            str2 = "BrazeWebViewClient was given null IBannerWebViewClientListener listener. Returning true.";
        } else {
            str2 = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? "BrazeWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true." : null;
        }
        int i = 2;
        if (str2 != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str2, i), 6, (Object) null);
            return true;
        }
        Uri uri = Uri.parse(str);
        Bundle bundleFromUrl = Companion.getBundleFromUrl(str);
        if (uri.getScheme() != null) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{uri.getScheme(), BRAZE_SCHEME}, getCieXyz.write())).booleanValue()) {
                handleQueryAction(str, uri, bundleFromUrl);
                return true;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriAction$$ExternalSyntheticLambda4(6, uri), 7, (Object) null);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i2 == 1) {
            IInAppMessage iInAppMessage = this.inAppMessage;
            if (iInAppMessage != null && (iInAppMessageWebViewClientListener = this.inAppMessageWebViewClientListener) != null) {
                iInAppMessageWebViewClientListener.onOtherUrlAction(iInAppMessage, str, bundleFromUrl);
            }
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return false;
            }
            IBannerWebViewClientListener iBannerWebViewClientListener = this.bannerWebViewClientListener;
            if (iBannerWebViewClientListener != null) {
                iBannerWebViewClientListener.onOtherUrlAction(this.context, str, bundleFromUrl);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$1(Uri uri) {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Uri scheme was null or not an appboy url. Uri: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markPageFinished$lambda$0$0() {
        return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPageFinished$lambda$0$0() {
        return "Page has finished loading. Calling onPageFinished on listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onRenderProcessGone$lambda$0() {
        return "The webview rendering process crashed, returning true";
    }

    public static final String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return Companion.parseCustomEventNameFromQueryBundle(bundle);
    }

    public static final BrazeProperties parsePropertiesFromQueryBundle(Bundle bundle) {
        return Companion.parsePropertiesFromQueryBundle(bundle);
    }

    public final void setWebViewClientStateListener(IWebViewClientStateListener iWebViewClientStateListener) {
        if (iWebViewClientStateListener != null && this.hasPageFinishedLoading && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            iWebViewClientStateListener.onPageFinished();
        } else {
            BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
            int i = this.maxOnPageFinishedWaitTimeMs;
            this.markPageFinishedJob = BrazeCoroutineScope.launchDelayed$default(brazeCoroutineScope, Integer.valueOf(i), null, new AnonymousClass1(null), 2, null);
        }
        this.webViewClientStateListener = iWebViewClientStateListener;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Bundle getBundleFromUrl(String str) {
            str.getClass();
            Bundle bundle = new Bundle();
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                for (Map.Entry<String, String> entry : UriUtils.getQueryParameters(Uri.parse(str)).entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue());
                }
            }
            return bundle;
        }

        public final String parseCustomEventNameFromQueryBundle(Bundle bundle) {
            bundle.getClass();
            return bundle.getString(BrazeWebViewClient.BRAZE_CUSTOM_EVENT_NAME_KEY);
        }

        public final BrazeProperties parsePropertiesFromQueryBundle(Bundle bundle) {
            String string;
            bundle.getClass();
            BrazeProperties brazeProperties = new BrazeProperties();
            for (String str : bundle.keySet()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, BrazeWebViewClient.BRAZE_CUSTOM_EVENT_NAME_KEY}, getCieXyz.write())).booleanValue() && (string = bundle.getString(str, null)) != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
                    str.getClass();
                    brazeProperties.addProperty(str, string);
                }
            }
            return brazeProperties;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.IN_APP_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BrazeWebViewClient(Context context, Type type, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, IBannerWebViewClientListener iBannerWebViewClientListener, String str) {
        toFloatimpl tofloatimpl;
        context.getClass();
        type.getClass();
        this.context = context;
        this.type = type;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
        this.bannerWebViewClientListener = iBannerWebViewClientListener;
        this.hasCalledPageFinishedOnListener = new AtomicBoolean(false);
        this.maxOnPageFinishedWaitTimeMs = BrazeInternal.INSTANCE.getConfigurationProvider(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
        if (str != null) {
            ArrayList<FocusOwnerImplmoveFocusfocusSearchSuccess1> arrayList = new ArrayList();
            arrayList.add(new FocusOwnerImplmoveFocusfocusSearchSuccess1("/", new toDoubleimpl(context, new File(str))));
            ArrayList arrayList2 = new ArrayList();
            for (FocusOwnerImplmoveFocusfocusSearchSuccess1 focusOwnerImplmoveFocusfocusSearchSuccess1 : arrayList) {
                arrayList2.add(new withSignqCeQghg((String) focusOwnerImplmoveFocusfocusSearchSuccess1.IconCompatParcelizer, (toDoubleimpl) focusOwnerImplmoveFocusfocusSearchSuccess1.RemoteActionCompatParcelizer));
            }
            tofloatimpl = new toFloatimpl(arrayList2);
        } else {
            File file = new File(context.getCacheDir(), Constants.TRIGGERS_ASSETS_FOLDER);
            ArrayList<FocusOwnerImplmoveFocusfocusSearchSuccess1> arrayList3 = new ArrayList();
            arrayList3.add(new FocusOwnerImplmoveFocusfocusSearchSuccess1("/ab_triggers/", new toDoubleimpl(context, file)));
            ArrayList arrayList4 = new ArrayList();
            for (FocusOwnerImplmoveFocusfocusSearchSuccess1 focusOwnerImplmoveFocusfocusSearchSuccess2 : arrayList3) {
                arrayList4.add(new withSignqCeQghg((String) focusOwnerImplmoveFocusfocusSearchSuccess2.IconCompatParcelizer, (toDoubleimpl) focusOwnerImplmoveFocusfocusSearchSuccess2.RemoteActionCompatParcelizer));
            }
            tofloatimpl = new toFloatimpl(arrayList4);
        }
        this.assetLoader = tofloatimpl;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) throws Throwable {
        webView.getClass();
        str.getClass();
        super.onPageFinished(webView, str);
        appendBridgeJavascript(webView);
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener != null && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(8), 6, (Object) null);
            iWebViewClientStateListener.onPageFinished();
        }
        this.hasPageFinishedLoading = true;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.markPageFinishedJob;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.markPageFinishedJob = null;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(7), 6, (Object) null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            toFloatimpl tofloatimpl = this.assetLoader;
            Uri url = webResourceRequest.getUrl();
            for (withSignqCeQghg withsignqceqghg : tofloatimpl.read) {
                withsignqceqghg.getClass();
                String str = withsignqceqghg.read;
                toDoubleimpl todoubleimpl = (!url.getScheme().equals("http") && (url.getScheme().equals("http") || url.getScheme().equals(com.adjust.sdk.Constants.SCHEME)) && url.getAuthority().equals(withsignqceqghg.write) && url.getPath().startsWith(str)) ? withsignqceqghg.IconCompatParcelizer : null;
                if (todoubleimpl != null) {
                    String strReplaceFirst = url.getPath().replaceFirst(str, "");
                    File file = todoubleimpl.RemoteActionCompatParcelizer;
                    try {
                        String strIconCompatParcelizer = getLowestValueslo4al4.IconCompatParcelizer(file);
                        String canonicalPath = new File(file, strReplaceFirst).getCanonicalPath();
                        File file2 = canonicalPath.startsWith(strIconCompatParcelizer) ? new File(canonicalPath) : null;
                        if (file2 == null) {
                            SentryLogcatAdapter.serializer("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", strReplaceFirst, file));
                            return new WebResourceResponse(null, null, null);
                        }
                        InputStream inputStreamWrite = getActiveFocusTargetNode.write(file2, new FileInputStream(file2));
                        if (file2.getPath().endsWith(".svgz")) {
                            inputStreamWrite = new GZIPInputStream(inputStreamWrite);
                        }
                        return new WebResourceResponse(getLowestValueslo4al4.IconCompatParcelizer(strReplaceFirst), null, inputStreamWrite);
                    } catch (IOException e) {
                        SentryLogcatAdapter.read("WebViewAssetLoader", "Error opening the requested path: " + strReplaceFirst, e);
                    }
                }
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        return handleUrlOverride(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markPageFinished() {
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(6), 6, (Object) null);
        iWebViewClientStateListener.onPageFinished();
    }

    private final void handleQueryAction(String str, Uri uri, Bundle bundle) {
        IBannerWebViewClientListener iBannerWebViewClientListener;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener;
        IBannerWebViewClientListener iBannerWebViewClientListener2;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener2;
        String authority = uri.getAuthority();
        if (authority == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriAction$$ExternalSyntheticLambda4(5, uri), 7, (Object) null);
            return;
        }
        int iHashCode = authority.hashCode();
        if (iHashCode == -1801488983) {
            if (authority.equals(AUTHORITY_NAME_CUSTOM_EVENT)) {
                Type type = this.type;
                if (type != Type.IN_APP_MESSAGE) {
                    if (type != Type.BANNER || (iBannerWebViewClientListener = this.bannerWebViewClientListener) == null) {
                        return;
                    }
                    iBannerWebViewClientListener.onCustomEventAction(this.context, str, bundle);
                    return;
                }
                IInAppMessage iInAppMessage = this.inAppMessage;
                if (iInAppMessage == null || (iInAppMessageWebViewClientListener = this.inAppMessageWebViewClientListener) == null) {
                    return;
                }
                iInAppMessageWebViewClientListener.onCustomEventAction(iInAppMessage, str, bundle);
                return;
            }
            return;
        }
        if (iHashCode == 94756344 && authority.equals(AUTHORITY_NAME_CLOSE)) {
            Type type2 = this.type;
            if (type2 != Type.IN_APP_MESSAGE) {
                if (type2 != Type.BANNER || (iBannerWebViewClientListener2 = this.bannerWebViewClientListener) == null) {
                    return;
                }
                iBannerWebViewClientListener2.onCloseAction(this.context, str, bundle);
                return;
            }
            IInAppMessage iInAppMessage2 = this.inAppMessage;
            if (iInAppMessage2 == null || (iInAppMessageWebViewClientListener2 = this.inAppMessageWebViewClientListener) == null) {
                return;
            }
            iInAppMessageWebViewClientListener2.onCloseAction(iInAppMessage2, str, bundle);
        }
    }

    @Override // android.webkit.WebViewClient
    @onItemDismisslambda0
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        return handleUrlOverride(str);
    }

    public /* synthetic */ BrazeWebViewClient(Context context, Type type, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, IBannerWebViewClientListener iBannerWebViewClientListener, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, type, (i & 4) != 0 ? null : iInAppMessage, (i & 8) != 0 ? null : iInAppMessageWebViewClientListener, (i & 16) != 0 ? null : iBannerWebViewClientListener, (i & 32) != 0 ? null : str);
    }
}
