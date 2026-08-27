package o;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawStyleSpan {
    private static int serializer = 0;
    private static int write = 1;
    public final FontEj4NQ78default IconCompatParcelizer;
    public final decode RemoteActionCompatParcelizer;

    public DrawStyleSpan(FontEj4NQ78default fontEj4NQ78default, decode decodeVar) {
        this.IconCompatParcelizer = fontEj4NQ78default;
        this.RemoteActionCompatParcelizer = decodeVar;
    }

    public static Map serializer(Map map) {
        Map mapSerializer;
        int i = 2 % 2;
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            int i2 = serializer + 17;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new onViewAttachedToWindowlambda0((String) entry.getKey(), entry.getValue().toString()));
                int i4 = serializer + 45;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            mapSerializer = onMove.serializer(arrayList);
        } else {
            mapSerializer = null;
        }
        if (mapSerializer != null) {
            return mapSerializer;
        }
        int i6 = write + 27;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        int i7 = 7 / 0;
        return SimpleItemTouchHelperCallback.serializer;
    }
}
