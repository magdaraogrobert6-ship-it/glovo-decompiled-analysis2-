package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface IconCompatParcelizer {
    String RemoteActionCompatParcelizer(String str);

    Map RemoteActionCompatParcelizer();

    default Boolean IconCompatParcelizer(String str) {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (strRemoteActionCompatParcelizer != null) {
            return Boolean.valueOf(strRemoteActionCompatParcelizer);
        }
        return null;
    }

    default Long serializer(String str) {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (strRemoteActionCompatParcelizer == null) {
            return null;
        }
        try {
            return Long.valueOf(strRemoteActionCompatParcelizer);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    default List write(String str) {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        return strRemoteActionCompatParcelizer != null ? Arrays.asList(strRemoteActionCompatParcelizer.split(",")) : Collections.EMPTY_LIST;
    }
}
