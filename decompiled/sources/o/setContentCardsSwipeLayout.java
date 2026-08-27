package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.core.model.thrift.O$b;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class setContentCardsSwipeLayout extends networkUnavailable {
    public static final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final java.util.logging.Logger r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

    static {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(setContentCardsSwipeLayout.class.getName());
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = logger;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = logger.isLoggable(Level.FINE);
    }

    public final setDefaultEmptyContentCardsAdapter write(O$b o$b) {
        String strM;
        if (o$b == null) {
            o$b = new O$b();
        }
        HashMap map = this.MediaMetadataCompat;
        if (map == null) {
            map = new HashMap();
        }
        String str = this.MediaDescriptionCompat ? com.adjust.sdk.Constants.SCHEME : "http";
        if (this.MediaSessionCompatResultReceiverWrapper) {
            map.put(this.MediaBrowserCompatMediaItem, r8lambdaeIElsnIxy2C0JIpjXxjoJzHVpA.RemoteActionCompatParcelizer());
        }
        String strSerializer = ContentCardsFragmentonRefresh1.serializer(map);
        int i = this.MediaSessionCompatQueueItem;
        if (i > 0 && ((com.adjust.sdk.Constants.SCHEME.equals(str) && i != 443) || ("http".equals(str) && i != 80))) {
            strM = c8$$ExternalSyntheticOutline0.m(i, ":");
        } else {
            strM = "";
        }
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
        o$b.read = ff$$ExternalSyntheticOutline0.m(sbM, this.read, strSerializer);
        o$b.RemoteActionCompatParcelizer = this.serializer;
        o$b.serializer = this.IconCompatParcelizer;
        int i2 = 0;
        setDefaultEmptyContentCardsAdapter setdefaultemptycontentcardsadapter = new setDefaultEmptyContentCardsAdapter(0);
        String str2 = (String) o$b.IconCompatParcelizer;
        if (str2 == null) {
            str2 = "GET";
        }
        setdefaultemptycontentcardsadapter.serializer = str2;
        setdefaultemptycontentcardsadapter.RatingCompat = (String) o$b.read;
        setdefaultemptycontentcardsadapter.write = (String) o$b.write;
        setdefaultemptycontentcardsadapter.RemoteActionCompatParcelizer = (getMessageImageView) o$b.RemoteActionCompatParcelizer;
        setdefaultemptycontentcardsadapter.IconCompatParcelizer = (Map) o$b.serializer;
        setdefaultemptycontentcardsadapter.read("requestHeaders", new setContentCardsRecyclerView(this, 1));
        setdefaultemptycontentcardsadapter.read("responseHeaders", new setContentCardsRecyclerView(this, i2));
        return setdefaultemptycontentcardsadapter;
    }

    public setContentCardsSwipeLayout(initializeRecyclerView initializerecyclerview) {
        super(initializerecyclerview);
    }
}
