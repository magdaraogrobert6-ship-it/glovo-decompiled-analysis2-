package androidx.compose.ui.modifier;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.setAlpha;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;
    private final setAlpha map;

    public MultiLocalMap(onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0, onViewAttachedToWindowlambda0... onviewattachedtowindowlambda0Arr) {
        Map mapSerializer;
        super(null);
        setAlpha setalpha = new setAlpha();
        this.map = setalpha;
        setalpha.put(onviewattachedtowindowlambda0.serializer, onviewattachedtowindowlambda0.write);
        onviewattachedtowindowlambda0Arr.getClass();
        int length = onviewattachedtowindowlambda0Arr.length;
        if (length == 0) {
            mapSerializer = SimpleItemTouchHelperCallback.serializer;
        } else if (length != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0Arr.length));
            onMove.read((HashMap) linkedHashMap, onviewattachedtowindowlambda0Arr);
            mapSerializer = linkedHashMap;
        } else {
            mapSerializer = onMove.serializer(onviewattachedtowindowlambda0Arr[0]);
        }
        setalpha.putAll(mapSerializer);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui(ModifierLocal<?> modifierLocal) {
        return this.map.containsKey(modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui(ModifierLocal<T> modifierLocal) {
        T t = (T) this.map.get(modifierLocal);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: set$ui */
    public <T> void mo2368set$ui(ModifierLocal<T> modifierLocal, T t) {
        this.map.put(modifierLocal, t);
    }
}
