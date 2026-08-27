package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onMove extends BuildersKt {
    public static int RemoteActionCompatParcelizer(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap IconCompatParcelizer(onViewAttachedToWindowlambda0... onviewattachedtowindowlambda0Arr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RemoteActionCompatParcelizer(onviewattachedtowindowlambda0Arr.length));
        read((HashMap) linkedHashMap, onviewattachedtowindowlambda0Arr);
        return linkedHashMap;
    }

    public static HashMap serializer(onViewAttachedToWindowlambda0... onviewattachedtowindowlambda0Arr) {
        HashMap map = new HashMap(RemoteActionCompatParcelizer(onviewattachedtowindowlambda0Arr.length));
        read(map, onviewattachedtowindowlambda0Arr);
        return map;
    }

    public static List IconCompatParcelizer(Map map) {
        map.getClass();
        int size = map.size();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (size == 0) {
            return instance_delegatelambda0Var;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return instance_delegatelambda0Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            Object[] objArr = {new onViewAttachedToWindowlambda0(entry.getKey(), entry.getValue())};
            int iSerializer = getQueryParameterslambda2.serializer();
            return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new onViewAttachedToWindowlambda0(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new onViewAttachedToWindowlambda0(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map IconCompatParcelizer(Map map, Iterable iterable) {
        map.getClass();
        iterable.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set setKeySet = linkedHashMap.keySet();
        setKeySet.getClass();
        setKeySet.removeAll(onContentCardDismissed.write(iterable));
        return read(linkedHashMap);
    }

    public static Object read(Map map, Object obj) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        DrawableTransformation.write(af$$ExternalSyntheticOutline0.m(obj, "Key ", " is missing in the map."));
        return null;
    }

    public static Map serializer(Map map, onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0) {
        map.getClass();
        onviewattachedtowindowlambda0.getClass();
        if (map.isEmpty()) {
            return serializer(onviewattachedtowindowlambda0);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(onviewattachedtowindowlambda0.serializer, onviewattachedtowindowlambda0.write);
        return linkedHashMap;
    }

    public static void RemoteActionCompatParcelizer(Map map, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) it.next();
            map.put(onviewattachedtowindowlambda0.serializer, onviewattachedtowindowlambda0.write);
        }
    }

    public static Map RemoteActionCompatParcelizer(onViewAttachedToWindowlambda0... onviewattachedtowindowlambda0Arr) {
        if (onviewattachedtowindowlambda0Arr.length <= 0) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RemoteActionCompatParcelizer(onviewattachedtowindowlambda0Arr.length));
        read((HashMap) linkedHashMap, onviewattachedtowindowlambda0Arr);
        return linkedHashMap;
    }

    public static Map serializer(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            RemoteActionCompatParcelizer(linkedHashMap, iterable);
            return read(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        if (size == 1) {
            return serializer((onViewAttachedToWindowlambda0) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RemoteActionCompatParcelizer(collection.size()));
        RemoteActionCompatParcelizer(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static LinkedHashMap write(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static final Map read(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Map serializer(onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0) {
        onviewattachedtowindowlambda0.getClass();
        Map mapSingletonMap = Collections.singletonMap(onviewattachedtowindowlambda0.serializer, onviewattachedtowindowlambda0.write);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static final void read(HashMap map, onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr) {
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : onviewattachedtowindowlambda0Arr) {
            map.put(onviewattachedtowindowlambda0.serializer, onviewattachedtowindowlambda0.write);
        }
    }

    public static LinkedHashMap RemoteActionCompatParcelizer(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map RemoteActionCompatParcelizer(resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = resumewebviewifnecessarylambda0.iterator();
        while (it.hasNext()) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) it.next();
            linkedHashMap.put(onviewattachedtowindowlambda0.serializer, onviewattachedtowindowlambda0.write);
        }
        return read(linkedHashMap);
    }

    public static Map serializer(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
