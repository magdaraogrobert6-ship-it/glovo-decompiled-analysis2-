package com.mapbox.navigation.core.internal.dump;

import com.sentiance.core.model.events.H$b;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MapboxDumpRegistry {
    public static final H$b delegate = new H$b();

    public static ArrayList getInterceptors(String str) {
        str.getClass();
        H$b h$b = delegate;
        h$b.getClass();
        LinkedHashSet linkedHashSet = (LinkedHashSet) h$b.serializer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            ((HelpDumpInterceptor) obj).getClass();
            if ("help".equals(str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
