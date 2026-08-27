package o;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class migrateSealedSessionsMapToJsonlambda10 {
    private final ArrayList write;

    public static migrateSealedSessionsMapToJsonlambda10 RemoteActionCompatParcelizer(String str, String str2) {
        return new migrateSealedSessionsMapToJsonlambda10(str, str2);
    }

    public final String read() {
        StringBuilder sb = new StringBuilder();
        for (Pair pair : this.write) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append((String) pair.first);
            sb.append(" ");
            sb.append((String) pair.second);
        }
        return sb.toString();
    }

    private migrateSealedSessionsMapToJsonlambda10(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        this.write = arrayList;
        arrayList.add(new Pair(str, str2));
    }
}
