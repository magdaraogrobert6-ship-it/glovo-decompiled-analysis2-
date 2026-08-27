package o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class draweZhPAX0ui extends LinkedHashMap {
    public static final draweZhPAX0ui serializer;
    public boolean write;

    public static draweZhPAX0ui serializer() {
        return serializer;
    }

    public final void read() {
        this.write = false;
    }

    public final boolean write() {
        return this.write;
    }

    static {
        draweZhPAX0ui drawezhpax0ui = new draweZhPAX0ui();
        serializer = drawezhpax0ui;
        drawezhpax0ui.write = false;
    }

    public final void RemoteActionCompatParcelizer(draweZhPAX0ui drawezhpax0ui) {
        IconCompatParcelizer();
        if (drawezhpax0ui.isEmpty()) {
            return;
        }
        putAll(drawezhpax0ui);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        IconCompatParcelizer();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        IconCompatParcelizer();
        Charset charset = getMinimumTouchTargetSizeMYxV2XQ.write;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        IconCompatParcelizer();
        for (Object obj : map.keySet()) {
            Charset charset = getMinimumTouchTargetSizeMYxV2XQ.write;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        IconCompatParcelizer();
        return super.remove(obj);
    }

    public draweZhPAX0ui() {
        this.write = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iRemoteActionCompatParcelizer = 0;
        for (Map.Entry entry : entrySet()) {
            iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer(entry.getValue()) ^ RemoteActionCompatParcelizer(entry.getKey());
        }
        return iRemoteActionCompatParcelizer;
    }

    public static int RemoteActionCompatParcelizer(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof getDoubleTapMinTimeMillis)) {
                return obj.hashCode();
            }
            getAlignmentLinesMap.write();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = getMinimumTouchTargetSizeMYxV2XQ.write;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final void IconCompatParcelizer() {
        if (this.write) {
            return;
        }
        getAlignmentLinesMap.write();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    public final draweZhPAX0ui RemoteActionCompatParcelizer() {
        if (isEmpty()) {
            return new draweZhPAX0ui();
        }
        draweZhPAX0ui drawezhpax0ui = new draweZhPAX0ui(this);
        drawezhpax0ui.write = true;
        return drawezhpax0ui;
    }

    public draweZhPAX0ui(Map map) {
        super(map);
    }
}
