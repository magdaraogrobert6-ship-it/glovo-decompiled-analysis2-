package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetDepthComparatorp {
    public static String IconCompatParcelizer(accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetp) {
        int i = accessgetlookaheadandancestormeasuresetp.MediaDescriptionCompat;
        androidx.sqlite.SQLite.serializer(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : accessgetlookaheadandancestormeasuresetp.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static boolean read(accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetp, Object obj) {
        if (accessgetlookaheadandancestormeasuresetp == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return accessgetlookaheadandancestormeasuresetp.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
