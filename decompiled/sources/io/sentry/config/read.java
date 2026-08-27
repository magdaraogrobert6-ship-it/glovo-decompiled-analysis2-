package io.sentry.config;

import com.huawei.hms.framework.common.BundleUtil;
import io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class read implements IconCompatParcelizer {
    @Override // io.sentry.config.IconCompatParcelizer
    public final Map RemoteActionCompatParcelizer() {
        String strIconCompatParcelizer;
        String strConcat = read("tags").concat(BundleUtil.UNDERLINE_TAG);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(strConcat) && (strIconCompatParcelizer = r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(strConcat.length()).toLowerCase(Locale.ROOT), strIconCompatParcelizer);
            }
        }
        return concurrentHashMap;
    }

    public static String read(String str) {
        return "SENTRY_" + str.replace(".", BundleUtil.UNDERLINE_TAG).replace("-", BundleUtil.UNDERLINE_TAG).toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.IconCompatParcelizer
    public final String RemoteActionCompatParcelizer(String str) {
        return r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer(System.getenv(read(str)));
    }
}
