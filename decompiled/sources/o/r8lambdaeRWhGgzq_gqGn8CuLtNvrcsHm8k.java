package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject$Companion;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc.class)
public final class r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k extends SwipeDismissTouchListenerVerticalDismissDirection implements Map<String, SwipeDismissTouchListenerVerticalDismissDirection>, displayInAppMessagelambda121 {
    public static final JsonObject$Companion Companion = new JsonObject$Companion();
    public final Map content;

    @Override // java.util.Map
    public final Set<Map.Entry<String, SwipeDismissTouchListenerVerticalDismissDirection>> entrySet() {
        return this.content.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        Object[] objArr = {this.content, obj};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.content.keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return this.content.size();
    }

    public final String toString() {
        return onContentCardDismissed.IconCompatParcelizer(this.content.entrySet(), ",", "{", "}", new r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA(0), 24);
    }

    @Override // java.util.Map
    public final Collection<SwipeDismissTouchListenerVerticalDismissDirection> values() {
        return this.content.values();
    }

    public r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k(Map map) {
        map.getClass();
        this.content = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ SwipeDismissTouchListenerVerticalDismissDirection compute(String str, BiFunction<? super String, ? super SwipeDismissTouchListenerVerticalDismissDirection, ? extends SwipeDismissTouchListenerVerticalDismissDirection> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ SwipeDismissTouchListenerVerticalDismissDirection computeIfAbsent(String str, Function<? super String, ? extends SwipeDismissTouchListenerVerticalDismissDirection> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ SwipeDismissTouchListenerVerticalDismissDirection computeIfPresent(String str, BiFunction<? super String, ? super SwipeDismissTouchListenerVerticalDismissDirection, ? extends SwipeDismissTouchListenerVerticalDismissDirection> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ SwipeDismissTouchListenerVerticalDismissDirection merge(String str, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection, BiFunction<? super SwipeDismissTouchListenerVerticalDismissDirection, ? super SwipeDismissTouchListenerVerticalDismissDirection, ? extends SwipeDismissTouchListenerVerticalDismissDirection> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ SwipeDismissTouchListenerVerticalDismissDirection put(String str, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends SwipeDismissTouchListenerVerticalDismissDirection> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ SwipeDismissTouchListenerVerticalDismissDirection putIfAbsent(String str, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final SwipeDismissTouchListenerVerticalDismissDirection remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ SwipeDismissTouchListenerVerticalDismissDirection replace(String str, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super SwipeDismissTouchListenerVerticalDismissDirection, ? extends SwipeDismissTouchListenerVerticalDismissDirection> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.content.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof SwipeDismissTouchListenerVerticalDismissDirection)) {
            return false;
        }
        return this.content.containsValue((SwipeDismissTouchListenerVerticalDismissDirection) obj);
    }

    @Override // java.util.Map
    public final SwipeDismissTouchListenerVerticalDismissDirection get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (SwipeDismissTouchListenerVerticalDismissDirection) this.content.get((String) obj);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean replace(String str, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
