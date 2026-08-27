package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetAmbientShadowColor0d7_KjUjd {
    public static final accessgetAmbientShadowColor0d7_KjUjd write;
    public final HashMap RemoteActionCompatParcelizer;

    static {
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = new accessgetAmbientShadowColor0d7_KjUjd(new LinkedHashMap());
        Okio.serializer(accessgetambientshadowcolor0d7_kjujd);
        write = accessgetambientshadowcolor0d7_kjujd;
    }

    public final String RemoteActionCompatParcelizer(String str) {
        Object obj = this.RemoteActionCompatParcelizer.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.RemoteActionCompatParcelizer.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final boolean serializer(String str) {
        Object obj = this.RemoteActionCompatParcelizer.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public accessgetAmbientShadowColor0d7_KjUjd(accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd) {
        accessgetambientshadowcolor0d7_kjujd.getClass();
        this.RemoteActionCompatParcelizer = new HashMap(accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Data {"), onContentCardDismissed.IconCompatParcelizer(this.RemoteActionCompatParcelizer.entrySet(), null, null, null, new accessgetBlendMode0nO6VwUjd(0), 31), "}");
    }

    public final long IconCompatParcelizer(String str) {
        Object obj = this.RemoteActionCompatParcelizer.get(str);
        return ((Number) (obj instanceof Long ? obj : 0L)).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj == null || !accessgetAmbientShadowColor0d7_KjUjd.class.equals(obj.getClass())) {
            return false;
        }
        HashMap map = ((accessgetAmbientShadowColor0d7_KjUjd) obj).RemoteActionCompatParcelizer;
        HashMap map2 = this.RemoteActionCompatParcelizer;
        Set<String> setKeySet = map2.keySet();
        Object[] objArr = {setKeySet, map.keySet()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = map2.get(str);
            Object obj3 = map.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 != obj3) {
                    return false;
                }
            } else {
                if (obj2 instanceof Object[]) {
                    Object[] objArr2 = (Object[]) obj2;
                    if (obj3 instanceof Object[]) {
                        zEquals = onContentCardClicked.RemoteActionCompatParcelizer(objArr2, (Object[]) obj3);
                    } else {
                        zEquals = obj2.equals(obj3);
                    }
                } else {
                    zEquals = obj2.equals(obj3);
                }
                if (!zEquals) {
                    return false;
                }
            }
        }
        return true;
    }

    public accessgetAmbientShadowColor0d7_KjUjd(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.RemoteActionCompatParcelizer = new HashMap(linkedHashMap);
    }
}
