package com.roadrunner.appperformance.performance;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.appperformance.AppPerformanceAttributesValueProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.executeAsOneOrNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AppPerformanceAttributesValueProviderImpl implements AppPerformanceAttributesValueProvider {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final ConcurrentHashMap serializer = new ConcurrentHashMap();

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperties(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1) {
        int i = 2 % 2;
        int i2 = write + 109;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            executableQueryexecuteAsOneOrNull1.getClass();
            IconCompatParcelizer(executableQueryexecuteAsOneOrNull1.read);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        executableQueryexecuteAsOneOrNull1.getClass();
        IconCompatParcelizer(executableQueryexecuteAsOneOrNull1.read);
        int i3 = IconCompatParcelizer + 123;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void onInfoUpdated(executeAsOneOrNull executeasoneornull) {
        int i = 2 % 2;
        int i2 = write + 83;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            executeasoneornull.getClass();
            IconCompatParcelizer(executeasoneornull.MediaMetadataCompat.read);
        } else {
            executeasoneornull.getClass();
            IconCompatParcelizer(executeasoneornull.MediaMetadataCompat.read);
            int i3 = 96 / 0;
        }
    }

    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateUserProperty(String str, String str2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            str2.getClass();
            int i3 = 97 / 0;
            if (!str.equals("employee_id")) {
                return;
            }
        } else {
            str.getClass();
            str2.getClass();
            if (!str.equals("employee_id")) {
                return;
            }
        }
        IconCompatParcelizer(str2);
        int i4 = write + 41;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void IconCompatParcelizer(String str) {
        int i = 2 % 2;
        ConcurrentHashMap concurrentHashMap = this.serializer;
        if (str != null) {
            int i2 = write + 107;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                concurrentHashMap.put("employee_id", str);
                int i4 = IconCompatParcelizer + 45;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 22 / 0;
                    return;
                }
                return;
            }
        }
        concurrentHashMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r4
  0x0027: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v11 java.lang.Object) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.roadrunner.logger.api.data.AppInfoChangedListener
    public final void updateProperties(Map map) {
        Object obj;
        String string;
        int i = 2 % 2;
        int i2 = write + 5;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            map.getClass();
            obj = map.get("employee_id");
            int i3 = 61 / 0;
            if (obj != null) {
                string = obj.toString();
            } else {
                string = null;
            }
        } else {
            map.getClass();
            obj = map.get("employee_id");
            if (obj != null) {
                string = obj.toString();
            } else {
                string = null;
            }
        }
        IconCompatParcelizer(string);
        int i4 = write + 59;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }
}
