package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class toURLSpan {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final decode write;

    public toURLSpan(decode decodeVar, io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        this.write = decodeVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    public final void serializer(getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations) {
        Map map;
        String str;
        Map mapSerializer;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getspanverticalaligndo9xggannotations.getClass();
        setPlaceholder setplaceholder = getspanverticalaligndo9xggannotations.IconCompatParcelizer;
        Object obj = null;
        if (setplaceholder != null) {
            map = setplaceholder.write;
            int i4 = serializer + 93;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            map = null;
        }
        if (map == null) {
            map = SimpleItemTouchHelperCallback.serializer;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("currentDeliveryId", String.valueOf(getspanverticalaligndo9xggannotations.serializer));
        if (setplaceholder != null) {
            str = setplaceholder.read;
            int i6 = serializer + 27;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 4 / 5;
            }
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            int i8 = RemoteActionCompatParcelizer + 49;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -988476804) {
            int i10 = RemoteActionCompatParcelizer + 61;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (iHashCode != -934396624) {
                if (iHashCode == 1925735456 && str.equals("dropoff")) {
                    int i12 = serializer + 89;
                    RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    str2 = "Customer";
                }
            } else if (str.equals("return")) {
                str2 = "Vendor";
            }
            Timber.RemoteActionCompatParcelizer.write(new Error("Invalid Delivery state ".concat(str)));
        } else if (str.equals("pickup")) {
            str2 = "Vendor";
        } else {
            Timber.RemoteActionCompatParcelizer.write(new Error("Invalid Delivery state ".concat(str)));
        }
        List list = androidx.sqlite.SQLite.read(onviewattachedtowindowlambda0, new onViewAttachedToWindowlambda0("callType", str2), new onViewAttachedToWindowlambda0("has_map_centric", "true"), new onViewAttachedToWindowlambda0("isVoip", String.valueOf(false)));
        if (map.isEmpty()) {
            int i14 = RemoteActionCompatParcelizer + 21;
            serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            mapSerializer = onMove.serializer(list);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            onMove.RemoteActionCompatParcelizer(linkedHashMap, list);
            mapSerializer = linkedHashMap;
        }
        this.write.logEvent("call_click", mapSerializer);
        int i16 = RemoteActionCompatParcelizer + 101;
        serializer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i16 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
