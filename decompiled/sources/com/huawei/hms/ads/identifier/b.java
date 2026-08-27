package com.huawei.hms.ads.identifier;

import com.huawei.hms.common.PackageConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    private static final Map<String, List<String>> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("com.huawei.hwid", Arrays.asList("b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"));
        map.put("com.huawei.hwid.tv", Arrays.asList("3517262215d8d3008cbf888750b6418edc4d562ac33ed6874e0d73aba667bc3c"));
        map.put(PackageConstants.SERVICES_PACKAGE_ALL_SCENE, Arrays.asList("e49d5c2c0e11b3b1b96ca56c6de2a14ec7dab5ccc3b5f300d03e5b4dba44f539"));
    }

    private static boolean a(List<String> list, String str) {
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        return a(a.get(str), str2);
    }
}
