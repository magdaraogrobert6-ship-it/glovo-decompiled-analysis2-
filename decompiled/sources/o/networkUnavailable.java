package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.socket.engineio.client.Socket$7$1;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class networkUnavailable extends getNetworkUnavailableJob {
    public static final java.util.logging.Logger PlaybackStateCompatCustomAction = java.util.logging.Logger.getLogger(networkUnavailable.class.getName());
    public boolean ParcelableVolumeInfo;

    @Override // o.getNetworkUnavailableJob
    public final void IconCompatParcelizer(ContentCardsFragmentcontentCardsUpdate5[] contentCardsFragmentcontentCardsUpdate5Arr) {
        this.MediaSessionCompatToken = false;
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs(this, new r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(3, this));
        ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls = swapRecyclerViewAdapter.read;
        if (contentCardsFragmentcontentCardsUpdate5Arr.length == 0) {
            r8lambda1mnczrzuv4owduwgkg6cjtsws.write("0:");
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = contentCardsFragmentcontentCardsUpdate5Arr.length;
        int i = 0;
        while (i < length) {
            boolean z = i == length + (-1);
            ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5 = contentCardsFragmentcontentCardsUpdate5Arr[i];
            ContentCardsFragmentCompanion contentCardsFragmentCompanion = new ContentCardsFragmentCompanion(sb, z);
            Object obj = contentCardsFragmentcontentCardsUpdate5.RemoteActionCompatParcelizer;
            if (obj instanceof byte[]) {
                try {
                    contentCardsFragmentCompanion.write("b".concat(new String(setCustomContentCardsViewBindingHandler.read((byte[]) obj), "US-ASCII")));
                } catch (UnsupportedEncodingException e) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
                    return;
                }
            } else {
                swapRecyclerViewAdapter.IconCompatParcelizer(contentCardsFragmentcontentCardsUpdate5, contentCardsFragmentCompanion);
            }
            i++;
        }
        r8lambda1mnczrzuv4owduwgkg6cjtsws.write(sb.toString());
    }

    @Override // o.getNetworkUnavailableJob
    public final void write() {
        read();
    }

    @Override // o.getNetworkUnavailableJob
    public final void serializer() {
        Socket$7$1 socket$7$1 = new Socket$7$1(1, this);
        onRefresh onrefresh = this.RatingCompat;
        onRefresh onrefresh2 = onRefresh.OPEN;
        java.util.logging.Logger logger = PlaybackStateCompatCustomAction;
        if (onrefresh == onrefresh2) {
            logger.fine("transport open - closing");
            socket$7$1.RemoteActionCompatParcelizer(new Object[0]);
        } else {
            logger.fine("transport not open - deferring close");
            serializer("open", socket$7$1);
        }
    }

    public final void read() {
        PlaybackStateCompatCustomAction.fine("polling");
        this.ParcelableVolumeInfo = true;
        setContentCardsSwipeLayout setcontentcardsswipelayout = (setContentCardsSwipeLayout) this;
        setContentCardsSwipeLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.fine("xhr poll");
        setDefaultEmptyContentCardsAdapter setdefaultemptycontentcardsadapterWrite = setcontentcardsswipelayout.write(null);
        setdefaultemptycontentcardsadapterWrite.read(RemoteMessageConst.DATA, new setContentCardsRecyclerView(setcontentcardsswipelayout, 3));
        setdefaultemptycontentcardsadapterWrite.read(FWFConstants.EXPLANATION_TYPE_ERROR, new setContentCardsRecyclerView(setcontentcardsswipelayout, 4));
        setdefaultemptycontentcardsadapterWrite.serializer();
        write("poll", new Object[0]);
    }
}
