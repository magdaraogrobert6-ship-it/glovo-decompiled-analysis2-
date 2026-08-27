package io.sentry.config;

import bo.app.ff$$ExternalSyntheticOutline0;
import io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatQueueItem implements IconCompatParcelizer {
    public final String IconCompatParcelizer;
    public final Properties write;

    @Override // io.sentry.config.IconCompatParcelizer
    public final String RemoteActionCompatParcelizer(String str) {
        return r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer(this.write.getProperty(this.IconCompatParcelizer + str));
    }

    @Override // io.sentry.config.IconCompatParcelizer
    public final Map RemoteActionCompatParcelizer() {
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.IconCompatParcelizer, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.write.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strM)) {
                    map.put(str.substring(strM.length()), r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    public MediaSessionCompatQueueItem(String str, Properties properties) {
        this.IconCompatParcelizer = str;
        setNativeShader.read(properties, "properties are required");
        this.write = properties;
    }

    public MediaSessionCompatQueueItem(Properties properties) {
        this("", properties);
    }
}
