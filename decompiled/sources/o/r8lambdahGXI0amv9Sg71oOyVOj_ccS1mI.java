package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdahGXI0amv9Sg71oOyVOj_ccS1mI {
    public static final Map write;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM r8lambdab0isqpsb2j3nkxpxcm79mddzdtm : r8lambdaqWHh_D9OmwtkJ21CJOYxsvMqaVc.serializer.a.values()) {
            String str = r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.b;
            Object linkedHashSet = linkedHashMap.get(str);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(str, linkedHashSet);
            }
            ((Set) linkedHashSet).addAll(r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.c);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new onViewAttachedToWindowlambda0(entry.getKey(), onContentCardDismissed.PlaybackStateCompat((Iterable) entry.getValue())));
        }
        write = onMove.serializer(arrayList);
    }
}
