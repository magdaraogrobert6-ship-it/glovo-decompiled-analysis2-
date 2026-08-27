package o;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class QueryListener {
    private static int IconCompatParcelizer = 0;
    public static final Map RemoteActionCompatParcelizer;
    private static int write = 1;
    public final transferSessionPackageI read;
    public final AtomicLong serializer;

    public QueryListener(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.read = transfersessionpackagei;
        this.serializer = new AtomicLong(0L);
    }

    static {
        Map mapSingletonMap = Collections.singletonMap("/api/rider-help-center/v1/helpcenter/chat/unread-message-count", RangesKt.write((Object) 404));
        mapSingletonMap.getClass();
        RemoteActionCompatParcelizer = mapSingletonMap;
        int i = IconCompatParcelizer + 1;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
