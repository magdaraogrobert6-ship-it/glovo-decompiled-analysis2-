package o;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.socket.emitter.Emitter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class setDefaultEmptyContentCardsAdapter extends Emitter {
    public static final InAppMessageHtmlBaseView read;
    public Map IconCompatParcelizer;
    public _get_messageWebView_lambda1 MediaMetadataCompat;
    public String RatingCompat;
    public getMessageImageView RemoteActionCompatParcelizer;
    public String serializer;
    public String write;

    public final void serializer() {
        String str = this.write;
        String str2 = this.RatingCompat;
        String str3 = this.serializer;
        boolean z = setContentCardsSwipeLayout.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (z) {
            setContentCardsSwipeLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.fine("xhr open " + str3 + ": " + str2);
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Map map = this.IconCompatParcelizer;
        if (map != null) {
            treeMap.putAll(map);
        }
        if ("POST".equals(str3)) {
            treeMap.put("Content-type", new LinkedList(Collections.singletonList("text/plain;charset=UTF-8")));
        }
        treeMap.put("Accept", new LinkedList(Collections.singletonList("*/*")));
        write("requestHeaders", treeMap);
        if (z) {
            setContentCardsSwipeLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.fine("sending xhr with url " + str2 + " | data " + str);
        }
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
        for (Map.Entry entry : treeMap.entrySet()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                _get_messagewebview_lambda0.serializer((String) entry.getKey(), (String) it.next());
            }
        }
        setInAppMessageImageViewAttributes setinappmessageimageviewattributesRemoteActionCompatParcelizer = null;
        RequestBody requestBodyCreate = str != null ? RequestBody.create(read, str) : null;
        str2.getClass();
        try {
            createAppropriateViews createappropriateviews = new createAppropriateViews();
            createappropriateviews.read(null, str2);
            setinappmessageimageviewattributesRemoteActionCompatParcelizer = createappropriateviews.RemoteActionCompatParcelizer();
        } catch (IllegalArgumentException unused) {
        }
        setinappmessageimageviewattributesRemoteActionCompatParcelizer.getClass();
        _get_messagewebview_lambda0.write = setinappmessageimageviewattributesRemoteActionCompatParcelizer;
        _get_messagewebview_lambda0.write(str3, requestBodyCreate);
        FirebasePerfOkHttpClient.enqueue(this.RemoteActionCompatParcelizer.IconCompatParcelizer(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0)), new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(21, this));
    }

    static {
        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite;
        getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
        try {
            inAppMessageHtmlBaseViewWrite = androidx.sqlite.SQLite.write("text/plain;charset=UTF-8");
        } catch (IllegalArgumentException unused) {
            inAppMessageHtmlBaseViewWrite = null;
        }
        read = inAppMessageHtmlBaseViewWrite;
    }

    public setDefaultEmptyContentCardsAdapter(int i) {
        super(i);
    }
}
