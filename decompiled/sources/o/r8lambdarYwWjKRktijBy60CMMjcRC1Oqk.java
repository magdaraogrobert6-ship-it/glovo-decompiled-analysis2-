package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdarYwWjKRktijBy60CMMjcRC1Oqk {
    public _get_messageWebView_lambda3 IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public _get_messageWebView_lambda1 MediaDescriptionCompat;
    public applyDisplayCutoutMarginsToContentArealambda0 MediaMetadataCompat;
    public r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc MediaSessionCompatQueueItem;
    public r8lambday113fDFTSR5e4PZj6XsSXLtpL60 MediaSessionCompatResultReceiverWrapper;
    public getMessageWebView MediaSessionCompatToken;
    public long PlaybackStateCompat;
    public long PlaybackStateCompatCustomAction;
    public _get_messageWebView_lambda1 RatingCompat;
    public r8lambda0088L0EiZH2mqIpRPuXhwYCr8 RemoteActionCompatParcelizer;
    public _get_messageWebView_lambda1 read;
    public int serializer;
    public applyDisplayCutoutMarginsToCloseButton write;

    public static void serializer(_get_messageWebView_lambda1 _get_messagewebview_lambda1, String str) {
        if (_get_messagewebview_lambda1 != null) {
            if (_get_messagewebview_lambda1.networkResponse != null) {
                DrawableTransformation.serializer((Object) str.concat(".networkResponse != null"));
            } else if (_get_messagewebview_lambda1.cacheResponse != null) {
                DrawableTransformation.serializer((Object) str.concat(".cacheResponse != null"));
            } else {
                if (_get_messagewebview_lambda1.priorResponse == null) {
                    return;
                }
                DrawableTransformation.serializer((Object) str.concat(".priorResponse != null"));
            }
        }
    }

    public final _get_messageWebView_lambda1 IconCompatParcelizer() {
        int i = this.serializer;
        if (i < 0) {
            DrawableTransformation.read(i, "code < 0: ");
            return null;
        }
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = this.MediaSessionCompatResultReceiverWrapper;
        if (r8lambday113fdftsr5e4pzj6xssxltpl60 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("request == null");
            return null;
        }
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = this.MediaSessionCompatQueueItem;
        if (r8lambdacwme7obcpvw4lrr1hr7xiufmyc == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("protocol == null");
            return null;
        }
        String str = this.MediaBrowserCompatMediaItem;
        if (str != null) {
            return new _get_messageWebView_lambda1(r8lambday113fdftsr5e4pzj6xssxltpl60, r8lambdacwme7obcpvw4lrr1hr7xiufmyc, str, i, this.write, this.MediaMetadataCompat.read(), this.IconCompatParcelizer, this.RatingCompat, this.read, this.MediaDescriptionCompat, this.PlaybackStateCompatCustomAction, this.PlaybackStateCompat, this.RemoteActionCompatParcelizer, this.MediaSessionCompatToken);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("message == null");
        return null;
    }

    public r8lambdarYwWjKRktijBy60CMMjcRC1Oqk() {
        this.serializer = -1;
        this.IconCompatParcelizer = _get_messageWebView_lambda3.EMPTY;
        this.MediaSessionCompatToken = getMessageWebView.EMPTY;
        this.MediaMetadataCompat = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
    }

    public r8lambdarYwWjKRktijBy60CMMjcRC1Oqk(int i) {
    }
}
