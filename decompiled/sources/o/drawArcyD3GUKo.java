package o;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class drawArcyD3GUKo implements obtainStrokePaint {
    public volatile Map serializer;
    public final Map write;

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final HashMap serializer() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.write.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((drawyzxVdVo) list.get(i)).RemoteActionCompatParcelizer;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put((String) entry.getKey(), string);
            }
        }
        return map;
    }

    public drawArcyD3GUKo(Map map) {
        this.write = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof drawArcyD3GUKo) {
            return this.write.equals(((drawArcyD3GUKo) obj).write);
        }
        return false;
    }

    public final String toString() {
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(new StringBuilder("LazyHeaders{headers="), this.write, '}');
    }

    @Override // o.obtainStrokePaint
    public final Map write() {
        if (this.serializer == null) {
            synchronized (this) {
                if (this.serializer == null) {
                    this.serializer = Collections.unmodifiableMap(serializer());
                }
            }
        }
        return this.serializer;
    }
}
