package o;

import android.os.Build;
import android.text.TextUtils;
import com.deliveryhero.fwf_http.ConstantKt;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getButtono7Vup1c {
    public static HashMap read(String str, String str2, String str3) {
        String string;
        HashMap map = new HashMap();
        map.put(ConstantKt.CONTENT_TYPE_HEADER, ConstantKt.CONTENT_TYPE_JSON);
        if (!TextUtils.isEmpty(str)) {
            map.put("X-App-ID", str);
        }
        map.put("X-Client-Version", "1.0.4.320");
        String str4 = Build.MODEL;
        map.put("terminalType", str4);
        map.put("X-Request-ID", str3);
        map.put("X-Credential-Terminal", "aucs");
        HashMap map2 = new HashMap();
        map2.put("terminalType", str4);
        map2.put("appPkgName", str2);
        map2.put("callTime", String.valueOf(System.currentTimeMillis()));
        if (map2.size() == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : map2.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append((String) entry.getValue());
                sb.append(",");
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
            string = sb.toString();
        }
        map.put("X-RequestContext", string);
        return map;
    }
}
