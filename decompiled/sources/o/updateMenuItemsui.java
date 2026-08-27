package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class updateMenuItemsui {
    public static final byte[] IconCompatParcelizer = new byte[0];
    public static volatile updateMenuItemsui serializer;
    public final long MediaSessionCompatQueueItem;
    public final long RatingCompat;
    public List write = new ArrayList();
    public List RemoteActionCompatParcelizer = new ArrayList();
    public long MediaMetadataCompat = 0;
    public long read = 0;

    public final boolean serializer() {
        synchronized (this) {
            List list = this.write;
            if (list != null && !list.isEmpty()) {
                return SystemClock.elapsedRealtime() - (this.read / 1000000) < this.RatingCompat;
            }
            WrappedCompositionsetContent1211.read("NLPCacheManger", "cellInfoList is empty");
            return false;
        }
    }

    public static updateMenuItemsui read() {
        if (serializer == null) {
            synchronized (IconCompatParcelizer) {
                if (serializer == null) {
                    serializer = new updateMenuItemsui();
                }
            }
        }
        return serializer;
    }

    public updateMenuItemsui() {
        this.MediaSessionCompatQueueItem = 30000L;
        this.RatingCompat = 30000L;
        LayoutNodeSubcompositionsStateScope layoutNodeSubcompositionsStateScope = WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1.serializer;
        String strWrite = layoutNodeSubcompositionsStateScope.write("valid_wifi_position_time");
        boolean zIsEmpty = TextUtils.isEmpty(strWrite);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (!zIsEmpty) {
            WrappedCompositionsetContent1211.read();
            this.MediaSessionCompatQueueItem = timeUnit.toMillis(Integer.parseInt(strWrite));
        }
        String strWrite2 = layoutNodeSubcompositionsStateScope.write("valid_cell_position_time");
        if (TextUtils.isEmpty(strWrite2)) {
            return;
        }
        WrappedCompositionsetContent1211.read();
        this.RatingCompat = timeUnit.toMillis(Integer.parseInt(strWrite2));
    }

    public final boolean RemoteActionCompatParcelizer() {
        List list = this.RemoteActionCompatParcelizer;
        if (list != null && !list.isEmpty()) {
            return SystemClock.elapsedRealtime() - this.MediaMetadataCompat < this.MediaSessionCompatQueueItem;
        }
        WrappedCompositionsetContent1211.read("NLPCacheManger", "wifiInfoList is empty");
        return false;
    }

    public final void IconCompatParcelizer(Pair pair) {
        synchronized (this) {
            this.read = ((Long) pair.first).longValue();
            this.write = (List) pair.second;
        }
    }
}
