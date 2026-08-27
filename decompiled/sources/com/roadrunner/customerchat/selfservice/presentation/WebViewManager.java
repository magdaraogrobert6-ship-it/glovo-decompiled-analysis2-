package com.roadrunner.customerchat.selfservice.presentation;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ParagraphUl8oQg4;
import o.ParagraphUl8oQg4default;
import o.ParagraphczeNHc;
import o.ParagraphczeNHcdefault;
import o.PreviewBlackScreenQuirk;
import o.ShortNewsContentCardView;
import o.VectorPainterKtrememberVectorPainter211invokeinlinedonDispose1;
import o.accessanalyzeComponents58bKbWc;
import o.accessisSetgyyYBs;
import o.addBulletr9BaKPg;
import o.addSpans;
import o.createFromParcel;
import o.fromHtml;
import o.getCieXyz;
import o.getHasStaleResolvedFonts;
import o.ignorableWhitespace;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerOnChangedCallback;
import o.removeNodeAtDepth;
import o.removeScheduledCallback;
import o.toAnnotatedStringdefault;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewManager {
    private static int ResultReceiver = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final ParagraphUl8oQg4 ComponentActivity;
    public final addBulletr9BaKPg IconCompatParcelizer;
    public final toAnnotatedStringdefault MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public DeferredCoroutine MediaMetadataCompat;
    public final registerOnChangedCallback MediaSessionCompatQueueItem;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaSessionCompatResultReceiverWrapper;
    public final SelfServiceCustomerChatRepositoryImpl MediaSessionCompatToken;
    public WebViewManager$createWebView$1$client$1 ParcelableVolumeInfo;
    public WebView PlaybackStateCompat;
    public ViewGroup PlaybackStateCompatCustomAction;
    public final accessisSetgyyYBs RatingCompat;
    public final ContextScope RemoteActionCompatParcelizer;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final ChatUrlProviderImpl read;
    public final ignorableWhitespace serializer;
    public final getHasStaleResolvedFonts write;

    public WebViewManager(accessisSetgyyYBs accessissetgyyybs, ChatUrlProviderImpl chatUrlProviderImpl, addBulletr9BaKPg addbulletr9bakpg, registerOnChangedCallback registeronchangedcallback, ParagraphUl8oQg4 paragraphUl8oQg4, SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, getHasStaleResolvedFonts gethasstaleresolvedfonts, ignorableWhitespace ignorablewhitespace, toAnnotatedStringdefault toannotatedstringdefault, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        accessissetgyyybs.getClass();
        chatUrlProviderImpl.getClass();
        addbulletr9bakpg.getClass();
        registeronchangedcallback.getClass();
        paragraphUl8oQg4.getClass();
        selfServiceCustomerChatRepositoryImpl.getClass();
        gethasstaleresolvedfonts.getClass();
        ignorablewhitespace.getClass();
        toannotatedstringdefault.getClass();
        isopeninternalroom_runtime.getClass();
        this.RatingCompat = accessissetgyyybs;
        this.read = chatUrlProviderImpl;
        this.IconCompatParcelizer = addbulletr9bakpg;
        this.MediaSessionCompatQueueItem = registeronchangedcallback;
        this.ComponentActivity = paragraphUl8oQg4;
        this.MediaSessionCompatToken = selfServiceCustomerChatRepositoryImpl;
        this.write = gethasstaleresolvedfonts;
        this.serializer = ignorablewhitespace;
        this.MediaBrowserCompatMediaItem = toannotatedstringdefault;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(MainDispatcherLoader.read.plus(new VectorPainterKtrememberVectorPainter211invokeinlinedonDispose1(this)));
    }

    public final void serializer(String str) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 39;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        toAnnotatedStringdefault.write(this.MediaBrowserCompatMediaItem, fromHtml.INFO, "WebViewPreloading", str);
        int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 23;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void read() {
        int i = 2 % 2;
        WebView webView = this.PlaybackStateCompat;
        if (webView == null) {
            int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 107;
            ResultReceiver = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            ViewGroup viewGroup = this.PlaybackStateCompatCustomAction;
            if (viewGroup != null) {
                serializer("Detaching WebView from temporary container");
                try {
                    viewGroup.removeView(webView);
                    webView.setOnApplyWindowInsetsListener(null);
                } catch (Exception e) {
                    serializer("Failed to detach WebView from temporary container: " + e.getMessage());
                }
                this.PlaybackStateCompatCustomAction = null;
                return;
            }
        }
        int i4 = ResultReceiver + 63;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.webkit.WebViewClient, com.roadrunner.customerchat.selfservice.presentation.WebViewManager$createWebView$1$client$1] */
    public final void write(AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        if (this.PlaybackStateCompat == null) {
            int i2 = ResultReceiver + 89;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (this.RatingCompat.serializer() != removeScheduledCallback.NO_PRELOADING) {
                serializer("creating WebView instance");
                Context applicationContext = appCompatActivity.getApplicationContext();
                applicationContext.getClass();
                ParagraphUl8oQg4 paragraphUl8oQg4 = this.ComponentActivity;
                paragraphUl8oQg4.getClass();
                WebView webView = new WebView(applicationContext.getApplicationContext());
                paragraphUl8oQg4.read.getClass();
                WebView.setWebContentsDebuggingEnabled(false);
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setBuiltInZoomControls(false);
                settings.setDomStorageEnabled(true);
                ?? r5 = new WebViewClient() { // from class: com.roadrunner.customerchat.selfservice.presentation.WebViewManager$createWebView$1$client$1
                    private static int read = 1;
                    private static int write;

                    @Override // android.webkit.WebViewClient
                    public final void onPageFinished(WebView webView2, String str) {
                        WebViewManager webViewManager;
                        boolean z;
                        int i4 = 2 % 2;
                        int i5 = write + 27;
                        read = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            super.onPageFinished(webView2, str);
                            webViewManager = this.IconCompatParcelizer;
                            webViewManager.serializer("onPageFinished called for warmup url");
                            z = true;
                        } else {
                            super.onPageFinished(webView2, str);
                            webViewManager = this.IconCompatParcelizer;
                            webViewManager.serializer("onPageFinished called for warmup url");
                            z = false;
                        }
                        webViewManager.MediaDescriptionCompat = z;
                        int i6 = read + 19;
                        write = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    }

                    @Override // android.webkit.WebViewClient
                    public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                        int i4 = 2 % 2;
                        int i5 = write + 113;
                        read = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        super.onPageStarted(webView2, str, bitmap);
                        WebViewManager webViewManager = this.IconCompatParcelizer;
                        if (webViewManager.RatingCompat.serializer() == removeScheduledCallback.FULL_PRELOAD) {
                            webViewManager.serializer("onPageStarted called during FullPreload");
                            webViewManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                            webViewManager.read();
                        }
                        int i7 = read + 105;
                        write = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                    }

                    @Override // android.webkit.WebViewClient
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        int i4 = 2 % 2;
                        WebViewManager webViewManager = this.IconCompatParcelizer;
                        if (((FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) webViewManager.MediaSessionCompatQueueItem).serializer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                            if (webViewManager.RatingCompat.serializer() == removeScheduledCallback.FULL_PRELOAD) {
                                int i5 = write + 17;
                                read = i5 % Fields.SpotShadowColor;
                                (i5 % 2 == 0 ? webViewManager.write : webViewManager.write).MediaSessionCompatToken.set(true);
                            }
                            return true;
                        }
                        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView2, renderProcessGoneDetail);
                        int i6 = write + 85;
                        read = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        return zOnRenderProcessGone;
                    }
                };
                this.ParcelableVolumeInfo = r5;
                webView.setWebViewClient(r5);
                this.PlaybackStateCompat = webView;
            }
        }
        int i4 = ResultReceiver + 23;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public static final Object access$fetchBaseChatUrl(WebViewManager webViewManager, String str, ContinuationImpl continuationImpl) throws Throwable {
        ParagraphUl8oQg4default paragraphUl8oQg4default;
        Object objM4887fetchBaseChatUrlIoAF18A;
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = i2 + 63;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            boolean z = continuationImpl instanceof ParagraphUl8oQg4default;
            throw null;
        }
        if (!(continuationImpl instanceof ParagraphUl8oQg4default)) {
            paragraphUl8oQg4default = new ParagraphUl8oQg4default(webViewManager, continuationImpl);
        } else {
            int i4 = i2 + 15;
            ResultReceiver = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = ((ParagraphUl8oQg4default) continuationImpl).serializer;
                throw null;
            }
            paragraphUl8oQg4default = (ParagraphUl8oQg4default) continuationImpl;
            int i6 = paragraphUl8oQg4default.serializer;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                paragraphUl8oQg4default.serializer = i6 - Integer.MIN_VALUE;
            } else {
                paragraphUl8oQg4default = new ParagraphUl8oQg4default(webViewManager, continuationImpl);
            }
        }
        Object obj = paragraphUl8oQg4default.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = paragraphUl8oQg4default.serializer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ChatUrlProviderImpl chatUrlProviderImpl = webViewManager.read;
            paragraphUl8oQg4default.RemoteActionCompatParcelizer = str;
            paragraphUl8oQg4default.serializer = 1;
            objM4887fetchBaseChatUrlIoAF18A = chatUrlProviderImpl.m4887fetchBaseChatUrlIoAF18A(paragraphUl8oQg4default);
            if (objM4887fetchBaseChatUrlIoAF18A == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = ResultReceiver + 31;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            str = paragraphUl8oQg4default.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4887fetchBaseChatUrlIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4887fetchBaseChatUrlIoAF18A);
        if (thSerializer == null) {
            return objM4887fetchBaseChatUrlIoAF18A;
        }
        if (thSerializer instanceof CancellationException) {
            throw thSerializer;
        }
        int i10 = ResultReceiver + 125;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            ((addSpans) webViewManager.MediaBrowserCompatMediaItem).serializer(fromHtml.ERROR, "WebViewPreloading", r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Base url is missing while fetching chat url, order id is ", str), thSerializer);
            return null;
        }
        ((addSpans) webViewManager.MediaBrowserCompatMediaItem).serializer(fromHtml.ERROR, "WebViewPreloading", r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Base url is missing while fetching chat url, order id is ", str), thSerializer);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object fetchChatId(String str, ContinuationImpl continuationImpl) throws Throwable {
        ParagraphczeNHcdefault paragraphczeNHcdefault;
        Object objM4890getChatIdgIAlus;
        int i = 2 % 2;
        int i2 = ResultReceiver + 3;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof ParagraphczeNHcdefault;
            throw null;
        }
        if (continuationImpl instanceof ParagraphczeNHcdefault) {
            paragraphczeNHcdefault = (ParagraphczeNHcdefault) continuationImpl;
            int i3 = paragraphczeNHcdefault.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = ResultReceiver + 5;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                paragraphczeNHcdefault.read = i3 - Integer.MIN_VALUE;
            } else {
                paragraphczeNHcdefault = new ParagraphczeNHcdefault(this, continuationImpl);
            }
        } else {
            paragraphczeNHcdefault = new ParagraphczeNHcdefault(this, continuationImpl);
        }
        Object obj = paragraphczeNHcdefault.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = paragraphczeNHcdefault.read;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            paragraphczeNHcdefault.serializer = str;
            paragraphczeNHcdefault.read = 1;
            objM4890getChatIdgIAlus = this.MediaSessionCompatToken.m4890getChatIdgIAlus(str, paragraphczeNHcdefault);
            if (objM4890getChatIdgIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = ResultReceiver + 71;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                str = paragraphczeNHcdefault.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM4890getChatIdgIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
                int i8 = 23 / 0;
            } else {
                str = paragraphczeNHcdefault.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM4890getChatIdgIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4890getChatIdgIAlus);
        if (thSerializer == null) {
            return objM4890getChatIdgIAlus;
        }
        if (thSerializer instanceof CancellationException) {
            throw thSerializer;
        }
        ((addSpans) this.MediaBrowserCompatMediaItem).serializer(fromHtml.ERROR, "WebViewPreloading", ff$$ExternalSyntheticOutline0.m("Failed to prefetch chatID for order: ", str, " (non-critical)"), thSerializer);
        int i9 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 77;
        ResultReceiver = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
    
        if (r6 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
    
        if (r6 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ee, code lost:
    
        return r6.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$fetchBaseUrl(com.roadrunner.customerchat.selfservice.presentation.WebViewManager r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.WebViewManager.access$fetchBaseUrl(com.roadrunner.customerchat.selfservice.presentation.WebViewManager, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    public static final Object access$prefetchChatIds(WebViewManager webViewManager, String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        ParagraphczeNHc paragraphczeNHc;
        String str2 = str;
        ArrayList arrayList2 = arrayList;
        int i = 2 % 2;
        ContextScope contextScope = webViewManager.RemoteActionCompatParcelizer;
        if (continuationImpl instanceof ParagraphczeNHc) {
            int i2 = ResultReceiver + 47;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            paragraphczeNHc = (ParagraphczeNHc) continuationImpl;
            int i4 = paragraphczeNHc.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = ResultReceiver + 29;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % Fields.SpotShadowColor;
                paragraphczeNHc.IconCompatParcelizer = i5 % 2 == 0 ? i4 / Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                paragraphczeNHc = new ParagraphczeNHc(webViewManager, continuationImpl);
            }
        } else {
            paragraphczeNHc = new ParagraphczeNHc(webViewManager, continuationImpl);
        }
        Object obj = paragraphczeNHc.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = paragraphczeNHc.IconCompatParcelizer;
        int i7 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            removeScheduledCallback removescheduledcallbackSerializer = webViewManager.RatingCompat.serializer();
            if (PreviewBlackScreenQuirk.IconCompatParcelizer(removescheduledcallbackSerializer)) {
                webViewManager.serializer("prefetching chat ids");
                if (removescheduledcallbackSerializer == removeScheduledCallback.FULL_PRELOAD && str2 != null && arrayList2.contains(str2)) {
                    paragraphczeNHc.RemoteActionCompatParcelizer = str2;
                    paragraphczeNHc.read = arrayList2;
                    paragraphczeNHc.IconCompatParcelizer = 1;
                    if (webViewManager.fetchChatId(str2, paragraphczeNHc) == obj2) {
                        return obj2;
                    }
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new WebViewManager$prefetchChatIds$3$1(webViewManager, (String) it.next(), shortNewsContentCardView, i7), 3);
                    }
                }
            }
            return createFromParcel.INSTANCE;
        }
        if (i6 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList arrayList3 = paragraphczeNHc.read;
        String str3 = paragraphczeNHc.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        arrayList2 = arrayList3;
        str2 = str3;
        webViewManager.serializer("Primary chatID fetched for FullPreload: " + str2);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int i8 = ResultReceiver + 17;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) it2.next(), str2}, getCieXyz.write())).booleanValue();
                shortNewsContentCardView.hashCode();
                throw null;
            }
            Object next = it2.next();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) next, str2}, getCieXyz.write())).booleanValue()) {
                arrayList4.add(next);
            }
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new WebViewManager$prefetchChatIds$3$1(webViewManager, (String) it3.next(), shortNewsContentCardView, 0), 3);
            int i9 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 39;
            ResultReceiver = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        return createFromParcel.INSTANCE;
    }
}
