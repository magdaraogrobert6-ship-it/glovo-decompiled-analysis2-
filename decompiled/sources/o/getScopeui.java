package o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class getScopeui extends LinkedHashMap {
    public static final getScopeui read;
    public boolean serializer;

    static {
        getScopeui getscopeui = new getScopeui();
        read = getscopeui;
        getscopeui.serializer = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        RemoteActionCompatParcelizer();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        RemoteActionCompatParcelizer();
        Charset charset = accessonPreScrollOzD1aCkjd.write;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        RemoteActionCompatParcelizer();
        for (Object obj : map.keySet()) {
            Charset charset = accessonPreScrollOzD1aCkjd.write;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        RemoteActionCompatParcelizer();
        return super.remove(obj);
    }

    public getScopeui() {
        this.serializer = true;
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
        int iIconCompatParcelizer = 0;
        for (Map.Entry entry : entrySet()) {
            iIconCompatParcelizer += IconCompatParcelizer(entry.getValue()) ^ IconCompatParcelizer(entry.getKey());
        }
        return iIconCompatParcelizer;
    }

    public static int IconCompatParcelizer(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof accessonPostFlingRZ2iAVYjd)) {
                return obj.hashCode();
            }
            getAlignmentLinesMap.write();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = accessonPreScrollOzD1aCkjd.write;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.serializer) {
            return;
        }
        getAlignmentLinesMap.write();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    public final getScopeui serializer() {
        if (isEmpty()) {
            return new getScopeui();
        }
        getScopeui getscopeui = new getScopeui(this);
        getscopeui.serializer = true;
        return getscopeui;
    }

    public getScopeui(Map map) {
        super(map);
    }
}
