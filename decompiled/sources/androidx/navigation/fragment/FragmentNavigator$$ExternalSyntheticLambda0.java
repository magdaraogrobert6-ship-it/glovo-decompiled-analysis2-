package androidx.navigation.fragment;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.deliveryhero.selfServiceChat.ui.NoopWebViewClient;
import com.deliveryhero.selfServiceChat.ui.WebChatFragment;
import com.deliveryhero.selfServiceChat.ui.WebViewManager;
import java.util.Collection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidColorSpace_androidKt;
import o.LayerSnapshotV21;
import o.VectorPropertyScaleX;
import o.ViewLayer;
import o.ViewLayerVerificationHelper31;
import o.accessisRenderNodeCompatiblecp;
import o.countTransparentColors;
import o.cubicTo;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;
import o.setSpotShadowColor;
import o.toAndroidColorSpace;
import o.toAndroidTileMode0vamqd0;
import o.toColorLong8_81llA;
import o.validateColorStops;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FragmentNavigator$$ExternalSyntheticLambda0 implements toAndroidColorSpace {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ FragmentNavigator$$ExternalSyntheticLambda0(int i, Object obj) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        Object obj;
        Object obj2;
        int i = this.write;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = null;
        if (i == 0) {
            countTransparentColors counttransparentcolors = (countTransparentColors) obj3;
            if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
                Fragment fragment = (Fragment) accessisrendernodecompatiblecp;
                for (Object obj5 : (Iterable) counttransparentcolors.serializer().MediaBrowserCompatMediaItem.read()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((cubicTo) obj5).serializer, fragment.getTag()}, getCieXyz.write())).booleanValue()) {
                        obj4 = obj5;
                    }
                }
                cubicTo cubicto = (cubicTo) obj4;
                if (cubicto != null) {
                    if (countTransparentColors.RemoteActionCompatParcelizer()) {
                        cubicto.toString();
                        accessisrendernodecompatiblecp.toString();
                    }
                    counttransparentcolors.serializer().IconCompatParcelizer(cubicto);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = (toAndroidTileMode0vamqd0) obj3;
            toandroidtilemode0vamqd0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = androidColorSpace_androidKt.getTargetState();
            if (toandroidtilemode0vamqd0.write != null) {
                for (cubicTo cubicto2 : onContentCardDismissed.IconCompatParcelizer((Collection) toandroidtilemode0vamqd0.MediaSessionCompatQueueItem)) {
                    cubicto2.getClass();
                    validateColorStops validatecolorstops = cubicto2.MediaBrowserCompatMediaItem;
                    validatecolorstops.getClass();
                    cubicTo cubicto3 = validatecolorstops.IconCompatParcelizer;
                    toColorLong8_81llA targetState = androidColorSpace_androidKt.getTargetState();
                    targetState.getClass();
                    cubicto3.RemoteActionCompatParcelizer = targetState;
                    validatecolorstops.write = androidColorSpace_androidKt.getTargetState();
                    validatecolorstops.read();
                }
                return;
            }
            return;
        }
        WebChatFragment webChatFragment = (WebChatFragment) obj3;
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
            LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) webChatFragment.serializer()).write();
            setSpotShadowColor setspotshadowcolor = layerSnapshotV21Write != null ? layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null;
            LayerSnapshotV21 layerSnapshotV21Write2 = ((ViewLayerVerificationHelper31) webChatFragment.serializer()).write();
            boolean zWrite = BuildersKt.write(layerSnapshotV21Write2 != null ? layerSnapshotV21Write2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null);
            WebView webView = webChatFragment.ParcelableVolumeInfo;
            if (!zWrite) {
                if (webView != null) {
                    webChatFragment.ParcelableVolumeInfo = null;
                    webView.removeJavascriptInterface("hcAndroidBridgeEntry");
                    MutableStateFlow mutableStateFlow = webChatFragment.IconCompatParcelizer().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    do {
                        obj2 = mutableStateFlow.read();
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj2, null, false, false, null, false, 29)));
                    webView.destroy();
                    return;
                }
                return;
            }
            if (webView != null) {
                ViewLayer viewLayer = ViewLayer.INSTANCE;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setspotshadowcolor, viewLayer}, getCieXyz.write())).booleanValue()) {
                    webView.removeJavascriptInterface("hcAndroidBridgeEntry");
                }
                MutableStateFlow mutableStateFlow2 = webChatFragment.IconCompatParcelizer().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                do {
                    obj = mutableStateFlow2.read();
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj, null, false, false, null, false, 29)));
                WebView webView2 = webChatFragment.MediaMetadataCompat().ParcelableVolumeInfo;
                if (webView2 != null) {
                    ViewParent parent = webView2.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(webView2);
                    }
                }
                webView.stopLoading();
                webView.setWebChromeClient(null);
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setspotshadowcolor, viewLayer}, getCieXyz.write())).booleanValue()) {
                    WebViewManager webViewManagerMediaMetadataCompat = webChatFragment.MediaMetadataCompat();
                    WebView webView3 = webViewManagerMediaMetadataCompat.ParcelableVolumeInfo;
                    if (webView3 != null) {
                        WebViewClient webViewClient = webViewManagerMediaMetadataCompat.MediaSessionCompatResultReceiverWrapper;
                        if (webViewClient == null) {
                            webViewClient = NoopWebViewClient.read;
                        }
                        webView3.setWebViewClient(webViewClient);
                    }
                    webViewManagerMediaMetadataCompat.RemoteActionCompatParcelizer("Re-attached preload WebViewClient");
                    webChatFragment.MediaMetadataCompat().PlaybackStateCompatCustomAction = false;
                } else {
                    webView.setWebViewClient(NoopWebViewClient.read);
                }
                webView.clearFocus();
                webChatFragment.ParcelableVolumeInfo = null;
            }
        }
    }
}
