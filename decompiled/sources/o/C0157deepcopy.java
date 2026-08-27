package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.deepcopy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0157deepcopy extends convertJSONObjectToMap {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;

    static {
        getDoubleOrNull.write(Collections.EMPTY_MAP);
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        Map map = this.serializer;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((mergeJsonObjects) entry.getValue()).write());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public C0157deepcopy(LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
    }
}
