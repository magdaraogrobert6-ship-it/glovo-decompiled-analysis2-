package o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class fromDpSizeitqla9I extends LinkedHashMap {
    public static final fromDpSizeitqla9I serializer;
    public boolean RemoteActionCompatParcelizer;

    static {
        fromDpSizeitqla9I fromdpsizeitqla9i = new fromDpSizeitqla9I();
        serializer = fromdpsizeitqla9i;
        fromdpsizeitqla9i.RemoteActionCompatParcelizer = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        RemoteActionCompatParcelizer();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        RemoteActionCompatParcelizer();
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        RemoteActionCompatParcelizer();
        for (Object obj : map.keySet()) {
            Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
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

    public fromDpSizeitqla9I() {
        this.RemoteActionCompatParcelizer = true;
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
        int iSerializer = 0;
        for (Map.Entry entry : entrySet()) {
            iSerializer += serializer(entry.getValue()) ^ serializer(entry.getKey());
        }
        return iSerializer;
    }

    public static int serializer(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof ifDebug)) {
                return obj.hashCode();
            }
            getAlignmentLinesMap.write();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
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
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        getAlignmentLinesMap.write();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    public final fromDpSizeitqla9I serializer() {
        if (isEmpty()) {
            return new fromDpSizeitqla9I();
        }
        fromDpSizeitqla9I fromdpsizeitqla9i = new fromDpSizeitqla9I(this);
        fromdpsizeitqla9i.RemoteActionCompatParcelizer = true;
        return fromdpsizeitqla9i;
    }

    public fromDpSizeitqla9I(Map map) {
        super(map);
    }
}
