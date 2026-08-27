package o;

import android.text.TextUtils;
import com.deliveryhero.fwf_http.ConstantKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class selectPaint {
    public static final Map serializer;
    public boolean read = true;
    public Map IconCompatParcelizer = serializer;

    public final drawArcyD3GUKo write() {
        this.read = true;
        return new drawArcyD3GUKo(this.IconCompatParcelizer);
    }

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put(ConstantKt.USER_AGENT_HEADER, Collections.singletonList(new drawyzxVdVo(property)));
        }
        serializer = Collections.unmodifiableMap(map);
    }
}
