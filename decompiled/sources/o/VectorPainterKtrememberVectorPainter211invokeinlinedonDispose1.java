package o;

import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPainterKtrememberVectorPainter211invokeinlinedonDispose1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKtrememberVectorPainter211invokeinlinedonDispose1(getHasStaleResolvedFonts gethasstaleresolvedfonts) {
        super(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        this.write = gethasstaleresolvedfonts;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKtrememberVectorPainter211invokeinlinedonDispose1(WebViewManager webViewManager) {
        super(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        this.write = webViewManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKtrememberVectorPainter211invokeinlinedonDispose1(obtainSizePxVpY3zN4 obtainsizepxvpy3zn4) {
        super(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        this.write = obtainsizepxvpy3zn4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKtrememberVectorPainter211invokeinlinedonDispose1(com.deliveryhero.selfServiceChat.ui.WebViewManager webViewManager) {
        super(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        this.write = webViewManager;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i2 == 0) {
            obtainSizePxVpY3zN4 obtainsizepxvpy3zn4 = (obtainSizePxVpY3zN4) obj;
            isIdentityannotations isidentityannotations = obtainsizepxvpy3zn4.serializer.serializer;
            if (isidentityannotations != null) {
                int i3 = RemoteActionCompatParcelizer + 91;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "WEB_PRELOADING", "BridgeManager coroutine exception", th);
            }
            if (th instanceof OutOfMemoryError) {
                int i5 = serializer + 33;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                obtainsizepxvpy3zn4.serializer();
                return;
            }
            return;
        }
        if (i2 == 1) {
            com.deliveryhero.selfServiceChat.ui.WebViewManager webViewManager = (com.deliveryhero.selfServiceChat.ui.WebViewManager) obj;
            obtainSizePxVpY3zN4 obtainsizepxvpy3zn5 = webViewManager.write;
            obtainsizepxvpy3zn5.IconCompatParcelizer.IconCompatParcelizer(Boolean.FALSE);
            obtainsizepxvpy3zn5.MediaSessionCompatResultReceiverWrapper.set(true);
            webViewManager.MediaMetadataCompat = false;
            isIdentityannotations isidentityannotations2 = webViewManager.serializer.serializer;
            if (isidentityannotations2 != null) {
                int i7 = RemoteActionCompatParcelizer + 35;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    isidentityannotations2.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "WEB_PRELOADING", "Chat preloading failure", th);
                    return;
                } else {
                    isidentityannotations2.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "WEB_PRELOADING", "Chat preloading failure", th);
                    int i8 = 85 / 0;
                    return;
                }
            }
            return;
        }
        if (i2 == 2) {
            getHasStaleResolvedFonts gethasstaleresolvedfonts = (getHasStaleResolvedFonts) obj;
            ((addSpans) gethasstaleresolvedfonts.PlaybackStateCompat).serializer(fromHtml.ERROR, "WEB_PRELOADING", "BridgeManager coroutine exception", th);
            if (th instanceof OutOfMemoryError) {
                gethasstaleresolvedfonts.RemoteActionCompatParcelizer();
                return;
            }
            return;
        }
        WebViewManager webViewManager2 = (WebViewManager) obj;
        getHasStaleResolvedFonts gethasstaleresolvedfonts2 = webViewManager2.write;
        gethasstaleresolvedfonts2.IconCompatParcelizer.IconCompatParcelizer(Boolean.FALSE);
        gethasstaleresolvedfonts2.MediaSessionCompatToken.set(true);
        webViewManager2.MediaDescriptionCompat = false;
        ((addSpans) webViewManager2.MediaBrowserCompatMediaItem).serializer(fromHtml.ERROR, "WebViewPreloading", "Chat preloading failure", th);
    }
}
