package com.deliveryhero.selfServiceChat.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.room.Room;
import coil3.ExtrasKt;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.deliveryhero.customerchat.CustomerChatModule$sendMessage$2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl;
import com.deliveryhero.selfServiceChat.data.chat.url.ChatUrlProviderImpl;
import com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl;
import com.foodora.courier.main.presentation.MainActivity;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.LayerSnapshotV21;
import o.LayerSnapshotV22;
import o.ShortNewsContentCardView;
import o.VectorComposeKtPath23;
import o.VectorPainterKtrememberVectorPainter211invokeinlinedonDispose1;
import o.ViewLayer;
import o.ViewLayerVerificationHelper31;
import o.accessgetOrDefaultjd;
import o.accessgetVcp;
import o.accessgetWcp;
import o.createFromParcel;
import o.getBitmapConfig_sVssgQui;
import o.getCieXyz;
import o.getDimension;
import o.getSize;
import o.isIdentityannotations;
import o.lockCanvas;
import o.obtainSizePxVpY3zN4;
import o.onBackInvokedlambda0;
import o.onImageAvailable;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.removeNodeAtDepth;
import o.rgbEqualOWjLjI;
import o.setOutlineAmbientShadowColor;
import o.setOutlineSpotShadowColor;
import o.setSpotShadowColor;
import o.updateConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewManager {
    public final setOutlineAmbientShadowColor IconCompatParcelizer;
    public final ContextScope MediaBrowserCompatMediaItem;
    public final accessgetOrDefaultjd MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public final getBitmapConfig_sVssgQui MediaSessionCompatQueueItem;
    public WebViewManager$createWebView$1$client$1 MediaSessionCompatResultReceiverWrapper;
    public ViewGroup MediaSessionCompatToken;
    public WebView ParcelableVolumeInfo;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public DeferredCoroutine RatingCompat;
    public final rgbEqualOWjLjI RemoteActionCompatParcelizer;
    public final VectorComposeKtPath23 read;
    public final onImageAvailable serializer;
    public final obtainSizePxVpY3zN4 write;

    public final boolean IconCompatParcelizer() {
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) this.IconCompatParcelizer).write();
        return (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layerSnapshotV21Write != null ? layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null, lockCanvas.INSTANCE}, getCieXyz.write())).booleanValue() || this.MediaMetadataCompat) ? false : true;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        isIdentityannotations isidentityannotations = this.serializer.serializer;
        if (isidentityannotations != null) {
            isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.INFO, "WEB_PRELOADING", str, null);
        }
    }

    public WebViewManager(setOutlineAmbientShadowColor setoutlineambientshadowcolor, getBitmapConfig_sVssgQui getbitmapconfig_svssgqui, accessgetOrDefaultjd accessgetordefaultjd, setOutlineSpotShadowColor setoutlinespotshadowcolor, onImageAvailable onimageavailable, accessgetWcp accessgetwcp, rgbEqualOWjLjI rgbequalowjlji, obtainSizePxVpY3zN4 obtainsizepxvpy3zn4, VectorComposeKtPath23 vectorComposeKtPath23) {
        this.IconCompatParcelizer = setoutlineambientshadowcolor;
        this.MediaSessionCompatQueueItem = getbitmapconfig_svssgqui;
        this.MediaDescriptionCompat = accessgetordefaultjd;
        this.serializer = onimageavailable;
        this.RemoteActionCompatParcelizer = rgbequalowjlji;
        this.write = obtainsizepxvpy3zn4;
        this.read = vectorComposeKtPath23;
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read).plus(new VectorPainterKtrememberVectorPainter211invokeinlinedonDispose1(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.webkit.WebViewClient, com.deliveryhero.selfServiceChat.ui.WebViewManager$createWebView$1$client$1] */
    public final void serializer(Context context) {
        if (this.ParcelableVolumeInfo == null) {
            LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) this.IconCompatParcelizer).write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layerSnapshotV21Write != null ? layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null, lockCanvas.INSTANCE}, getCieXyz.write())).booleanValue()) {
                return;
            }
            RemoteActionCompatParcelizer("creating WebView instance");
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            WebView webView = new WebView(applicationContext.getApplicationContext());
            if ((applicationContext.getApplicationInfo().flags & 2) != 0) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setBuiltInZoomControls(false);
            settings.setDomStorageEnabled(true);
            ?? r10 = new WebViewClient() { // from class: com.deliveryhero.selfServiceChat.ui.WebViewManager$createWebView$1$client$1
                @Override // android.webkit.WebViewClient
                public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                    WebViewManager webViewManager = this.read;
                    LayerSnapshotV21 layerSnapshotV21Write2 = ((ViewLayerVerificationHelper31) webViewManager.IconCompatParcelizer).write();
                    if (layerSnapshotV21Write2 == null || !layerSnapshotV21Write2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                        return super.onRenderProcessGone(webView2, renderProcessGoneDetail);
                    }
                    Object[] objArr = {layerSnapshotV21Write2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, ViewLayer.INSTANCE};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        webViewManager.write.MediaSessionCompatResultReceiverWrapper.set(true);
                    }
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                    super.onPageStarted(webView2, str, bitmap);
                    WebViewManager webViewManager = this.read;
                    LayerSnapshotV21 layerSnapshotV21Write2 = ((ViewLayerVerificationHelper31) webViewManager.IconCompatParcelizer).write();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layerSnapshotV21Write2 != null ? layerSnapshotV21Write2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null, ViewLayer.INSTANCE}, getCieXyz.write())).booleanValue()) {
                        webViewManager.RemoteActionCompatParcelizer("onPageStarted called during FullPreload");
                        webViewManager.PlaybackStateCompatCustomAction = true;
                        webViewManager.write();
                    }
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView2, String str) {
                    super.onPageFinished(webView2, str);
                    WebViewManager webViewManager = this.read;
                    webViewManager.RemoteActionCompatParcelizer("onPageFinished called for warmup url");
                    webViewManager.MediaMetadataCompat = false;
                }
            };
            this.MediaSessionCompatResultReceiverWrapper = r10;
            webView.setWebViewClient(r10);
            this.ParcelableVolumeInfo = webView;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$fetchBaseUrl(WebViewManager webViewManager, ContinuationImpl continuationImpl) {
        updateConfig updateconfig;
        String str;
        if (continuationImpl instanceof updateConfig) {
            updateconfig = (updateConfig) continuationImpl;
            int i = updateconfig.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateconfig.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                updateconfig = new updateConfig(webViewManager, continuationImpl);
            }
        } else {
            updateconfig = new updateConfig(webViewManager, continuationImpl);
        }
        Object objFetchBaseChatUrl = updateconfig.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updateconfig.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFetchBaseChatUrl);
            LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) webViewManager.IconCompatParcelizer).write();
            if (!BuildersKt.RemoteActionCompatParcelizer(layerSnapshotV21Write != null ? layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null) || ((str = ((getSize) webViewManager.MediaDescriptionCompat).read) != null && str.length() != 0)) {
                return null;
            }
            webViewManager.RemoteActionCompatParcelizer("fetching base url");
            getBitmapConfig_sVssgQui getbitmapconfig_svssgqui = webViewManager.MediaSessionCompatQueueItem;
            updateconfig.IconCompatParcelizer = 1;
            objFetchBaseChatUrl = ((ChatUrlProviderImpl) getbitmapconfig_svssgqui).fetchBaseChatUrl(updateconfig);
            if (objFetchBaseChatUrl == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFetchBaseChatUrl);
        }
        Uri uri = Uri.parse((String) objFetchBaseChatUrl);
        uri.getClass();
        return uri.buildUpon().encodedPath("/chat-page/warmup/").build().toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object access$prefetchChatIds(WebViewManager webViewManager, ArrayList arrayList, MainActivity mainActivity, ContinuationImpl continuationImpl) {
        getDimension getdimension;
        String str;
        MainActivity mainActivity2;
        Object chatID;
        WebViewManager webViewManager2 = webViewManager;
        ArrayList arrayList2 = arrayList;
        if (continuationImpl instanceof getDimension) {
            getdimension = (getDimension) continuationImpl;
            int i = getdimension.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getdimension.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getdimension = new getDimension(webViewManager2, continuationImpl);
            }
        } else {
            getdimension = new getDimension(webViewManager2, continuationImpl);
        }
        Object obj = getdimension.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getdimension.IconCompatParcelizer;
        int i3 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) webViewManager2.IconCompatParcelizer).write();
            setSpotShadowColor setspotshadowcolor = layerSnapshotV21Write != null ? layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null;
            if (BuildersKt.RemoteActionCompatParcelizer(setspotshadowcolor)) {
                webViewManager2.RemoteActionCompatParcelizer("prefetching chat ids");
                str = layerSnapshotV21Write != null ? layerSnapshotV21Write.ParcelableVolumeInfo : null;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setspotshadowcolor, ViewLayer.INSTANCE}, getCieXyz.write())).booleanValue() && str != null && arrayList2.contains(str)) {
                    rgbEqualOWjLjI rgbequalowjlji = webViewManager2.RemoteActionCompatParcelizer;
                    getdimension.RemoteActionCompatParcelizer = webViewManager2;
                    getdimension.serializer = arrayList2;
                    mainActivity2 = mainActivity;
                    getdimension.read = mainActivity2;
                    getdimension.write = str;
                    getdimension.IconCompatParcelizer = 1;
                    chatID = ((HelpcenterRemoteDataSourceImpl) ((ChatRepositoryImpl) rgbequalowjlji).write).getChatID(str, getdimension);
                    if (chatID == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        BuildersKt.RemoteActionCompatParcelizer(webViewManager2.MediaBrowserCompatMediaItem, null, null, new WebViewManager$prefetchChatIds$4$1(webViewManager2, (String) it.next(), shortNewsContentCardView, i3), 3);
                    }
                }
            }
            return createFromParcel.INSTANCE;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str2 = getdimension.write;
        MainActivity mainActivity3 = getdimension.read;
        ArrayList arrayList3 = getdimension.serializer;
        WebViewManager webViewManager3 = getdimension.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        mainActivity2 = mainActivity3;
        arrayList2 = arrayList3;
        str = str2;
        webViewManager2 = webViewManager3;
        chatID = obj;
        accessgetVcp accessgetvcp = CustomerChatModule.write;
        Context applicationContext = mainActivity2.getApplicationContext();
        applicationContext.getClass();
        accessgetvcp.serializer(applicationContext).serializer(new CustomerChatModule$sendMessage$2((String) chatID, 2));
        webViewManager2.RemoteActionCompatParcelizer("Primary chatID fetched for FullPreload: " + str);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) obj2, str}, getCieXyz.write())).booleanValue()) {
                arrayList4.add(obj2);
            }
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            BuildersKt.RemoteActionCompatParcelizer(webViewManager2.MediaBrowserCompatMediaItem, null, null, new WebViewManager$prefetchChatIds$4$1(webViewManager2, (String) it2.next(), shortNewsContentCardView, 0), 3);
        }
        return createFromParcel.INSTANCE;
    }

    public final void write() {
        ViewGroup viewGroup;
        WebView webView = this.ParcelableVolumeInfo;
        if (webView == null || (viewGroup = this.MediaSessionCompatToken) == null) {
            return;
        }
        RemoteActionCompatParcelizer("Detaching WebView from temporary container");
        try {
            viewGroup.removeView(webView);
            webView.setOnApplyWindowInsetsListener(null);
        } catch (Exception e) {
            RemoteActionCompatParcelizer("Failed to detach WebView from temporary container: " + e.getMessage());
        }
        this.MediaSessionCompatToken = null;
    }
}
