package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import io.socket.engineio.client.transports.WebSocket$1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class setContentCardsUpdatedSubscriber extends getNetworkUnavailableJob {
    public static final java.util.logging.Logger ParcelableVolumeInfo = java.util.logging.Logger.getLogger(setContentCardsSwipeLayout.class.getName());
    public ViewUtilsExternalSyntheticLambda1 PlaybackStateCompatCustomAction;

    @Override // o.getNetworkUnavailableJob
    public final void IconCompatParcelizer(ContentCardsFragmentcontentCardsUpdate5[] contentCardsFragmentcontentCardsUpdate5Arr) {
        this.MediaSessionCompatToken = false;
        r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74 r8lambdax0ikgfkcyf8phqkdy2wfcdmih74 = new r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(7, this);
        int[] iArr = {contentCardsFragmentcontentCardsUpdate5Arr.length};
        for (ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5 : contentCardsFragmentcontentCardsUpdate5Arr) {
            onRefresh onrefresh = this.RatingCompat;
            if (onrefresh != onRefresh.OPENING && onrefresh != onRefresh.OPEN) {
                return;
            }
            swapRecyclerViewAdapter.IconCompatParcelizer(contentCardsFragmentcontentCardsUpdate5, new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(this, iArr, r8lambdax0ikgfkcyf8phqkdy2wfcdmih74, 14));
        }
    }

    @Override // o.getNetworkUnavailableJob
    public final void write() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Map map = this.IconCompatParcelizer;
        if (map != null) {
            treeMap.putAll(map);
        }
        write("requestHeaders", treeMap);
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
        HashMap map2 = this.MediaMetadataCompat;
        if (map2 == null) {
            map2 = new HashMap();
        }
        String str = this.MediaDescriptionCompat ? "wss" : "ws";
        int i = this.MediaSessionCompatQueueItem;
        String strM = (i <= 0 || ((!"wss".equals(str) || i == 443) && (!"ws".equals(str) || i == 80))) ? "" : c8$$ExternalSyntheticOutline0.m(i, ":");
        if (this.MediaSessionCompatResultReceiverWrapper) {
            map2.put(this.MediaBrowserCompatMediaItem, r8lambdaeIElsnIxy2C0JIpjXxjoJzHVpA.RemoteActionCompatParcelizer());
        }
        String strSerializer = ContentCardsFragmentonRefresh1.serializer(map2);
        if (strSerializer.length() > 0) {
            strSerializer = "?".concat(strSerializer);
        }
        String strM2 = this.write;
        boolean zContains = strM2.contains(":");
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, "://");
        if (zContains) {
            strM2 = ff$$ExternalSyntheticOutline0.m("[", strM2, "]");
        }
        sbM.append(strM2);
        sbM.append(strM);
        sbM.append(this.read);
        sbM.append(strSerializer);
        _get_messagewebview_lambda0.read(sbM.toString());
        for (Map.Entry entry : treeMap.entrySet()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                _get_messagewebview_lambda0.serializer((String) entry.getKey(), (String) it.next());
            }
        }
        this.PlaybackStateCompatCustomAction = this.PlaybackStateCompat.serializer(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0), new WebSocket$1(this));
    }

    @Override // o.getNetworkUnavailableJob
    public final void serializer() {
        ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1 = this.PlaybackStateCompatCustomAction;
        if (viewUtilsExternalSyntheticLambda1 != null) {
            viewUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(1000, "");
            this.PlaybackStateCompatCustomAction = null;
        }
    }

    public setContentCardsUpdatedSubscriber(initializeRecyclerView initializerecyclerview) {
        super(initializerecyclerview);
    }
}
