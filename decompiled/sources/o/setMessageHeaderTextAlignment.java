package o;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setMessageHeaderTextAlignment {
    public int IconCompatParcelizer;
    public final ArrayList MediaBrowserCompatMediaItem;
    public final io.sentry.logger.serializer MediaMetadataCompat;
    public final List RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public List read;
    public final InAppMessageHtmlView serializer;
    public final getMessageClickableView write;

    public final boolean read() {
        return this.IconCompatParcelizer < this.RatingCompat.size() || !this.MediaBrowserCompatMediaItem.isEmpty();
    }

    public setMessageHeaderTextAlignment(getMessageClickableView getmessageclickableview, io.sentry.logger.serializer serializerVar, InAppMessageHtmlView inAppMessageHtmlView, boolean z) {
        List<Proxy> list;
        getmessageclickableview.getClass();
        serializerVar.getClass();
        inAppMessageHtmlView.getClass();
        this.write = getmessageclickableview;
        this.MediaMetadataCompat = serializerVar;
        this.serializer = inAppMessageHtmlView;
        this.RemoteActionCompatParcelizer = z;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.RatingCompat = instance_delegatelambda0Var;
        this.read = instance_delegatelambda0Var;
        this.MediaBrowserCompatMediaItem = new ArrayList();
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = getmessageclickableview.url;
        setinappmessageimageviewattributes.getClass();
        clipCanvasToPath clipcanvastopath = inAppMessageHtmlView.write;
        clipcanvastopath.eventListener.proxySelectStart(clipcanvastopath, setinappmessageimageviewattributes);
        URI uriRatingCompat = setinappmessageimageviewattributes.RatingCompat();
        if (uriRatingCompat.getHost() == null) {
            list = setWebViewContent.read(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = getmessageclickableview.proxySelector.select(uriRatingCompat);
            List<Proxy> list2 = listSelect;
            list = (list2 == null || list2.isEmpty()) ? setWebViewContent.read(new Proxy[]{Proxy.NO_PROXY}) : setWebViewContent.read(listSelect);
        }
        this.RatingCompat = list;
        this.IconCompatParcelizer = 0;
        setinappmessageimageviewattributes.getClass();
        clipCanvasToPath clipcanvastopath2 = inAppMessageHtmlView.write;
        clipcanvastopath2.eventListener.proxySelectEnd(clipcanvastopath2, setinappmessageimageviewattributes, list);
    }
}
