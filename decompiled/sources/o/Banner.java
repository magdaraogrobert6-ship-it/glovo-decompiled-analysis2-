package o;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Banner<K, V> implements Map<K, V>, displayInAppMessagelambda120 {
    private final Map<K, V> IconCompatParcelizer;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;

    @Override // java.util.Map
    public final void clear() {
        this.IconCompatParcelizer.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.IconCompatParcelizer.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.IconCompatParcelizer.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.IconCompatParcelizer.entrySet();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        Map<K, V> map = this.IconCompatParcelizer;
        V v = map.get(obj);
        if (v != null) {
            return v;
        }
        V v2 = (V) this.RemoteActionCompatParcelizer.invoke(obj);
        map.put((K) obj, v2);
        return v2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.IconCompatParcelizer.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.IconCompatParcelizer.keySet();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return this.IconCompatParcelizer.put(k, v);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return this.IconCompatParcelizer.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.IconCompatParcelizer.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.IconCompatParcelizer.values();
    }

    public Banner(Map<K, V> map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        map.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.IconCompatParcelizer = map;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        this.IconCompatParcelizer.putAll(map);
    }

    public /* synthetic */ Banner(Map map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
