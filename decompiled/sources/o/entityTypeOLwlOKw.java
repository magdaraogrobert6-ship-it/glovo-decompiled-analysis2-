package o;

import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class entityTypeOLwlOKw implements Cloneable {
    public volatile Value IconCompatParcelizer;
    public final HashMap RemoteActionCompatParcelizer;
    public Value serializer;
    public final Object write;

    public static void RemoteActionCompatParcelizer(HashMap map, childHitTestqzLsGqo childhittestqzlsgqo, Value value) {
        Map map2;
        Map map3;
        int i = 0;
        Map map4 = map;
        while (i < childhittestqzlsgqo.IconCompatParcelizer.size() - 1) {
            String strRemoteActionCompatParcelizer = childhittestqzlsgqo.RemoteActionCompatParcelizer(i);
            Object obj = map4.get(strRemoteActionCompatParcelizer);
            if (obj instanceof Map) {
                map2 = (Map) obj;
            } else {
                if (obj instanceof Value) {
                    Value value2 = (Value) obj;
                    if (value2.hasMapValue()) {
                        HashMap map5 = new HashMap(value2.getMapValue().getFieldsMap());
                        map4.put(strRemoteActionCompatParcelizer, map5);
                        map3 = map5;
                    }
                    i++;
                    map4 = map3;
                }
                map2 = new HashMap();
                map4.put(strRemoteActionCompatParcelizer, map2);
            }
            map3 = map2;
            i++;
            map4 = map3;
        }
        map4.put(childhittestqzlsgqo.serializer(), value);
    }

    public final Object clone() {
        return new entityTypeOLwlOKw(serializer());
    }

    public static MapValue IconCompatParcelizer(Value value, childHitTestqzLsGqo childhittestqzlsgqo, Map map) {
        Value valueRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(childhittestqzlsgqo, value);
        NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
        getAction getactionNewBuilder = (valueRemoteActionCompatParcelizer == null || !valueRemoteActionCompatParcelizer.hasMapValue()) ? MapValue.newBuilder() : (getAction) valueRemoteActionCompatParcelizer.getMapValue().toBuilder();
        boolean z = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value2 = entry.getValue();
            if (value2 instanceof Map) {
                MapValue mapValueIconCompatParcelizer = IconCompatParcelizer(value, (childHitTestqzLsGqo) childhittestqzlsgqo.write(str), (Map) value2);
                if (mapValueIconCompatParcelizer != null) {
                    accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
                    accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
                    ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setMapValue(mapValueIconCompatParcelizer);
                    getactionNewBuilder.serializer(str, (Value) accesscontainsdescendantNewBuilder.serializer());
                    z = true;
                }
            } else {
                if (value2 instanceof Value) {
                    getactionNewBuilder.serializer(str, (Value) value2);
                } else {
                    getactionNewBuilder.getClass();
                    str.getClass();
                    if (((MapValue) getactionNewBuilder.RemoteActionCompatParcelizer).getFieldsMap().containsKey(str)) {
                        getRectManager.RemoteActionCompatParcelizer(value2 == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                        getactionNewBuilder.RemoteActionCompatParcelizer();
                        ((MapValue) getactionNewBuilder.RemoteActionCompatParcelizer).getMutableFieldsMap().remove(str);
                    }
                }
                z = true;
            }
        }
        if (z) {
            return (MapValue) getactionNewBuilder.serializer();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof entityTypeOLwlOKw) {
            return serializer().equals(((entityTypeOLwlOKw) obj).serializer());
        }
        return false;
    }

    public final int hashCode() {
        return serializer().hashCode();
    }

    public final void read(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            childHitTestqzLsGqo childhittestqzlsgqo = (childHitTestqzLsGqo) entry.getKey();
            if (entry.getValue() == null) {
                getRectManager.RemoteActionCompatParcelizer(!childhittestqzlsgqo.IconCompatParcelizer(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
                write(childhittestqzlsgqo, null);
            } else {
                Value value = (Value) entry.getValue();
                getRectManager.RemoteActionCompatParcelizer(!childhittestqzlsgqo.IconCompatParcelizer(), "Cannot set field for empty path on ObjectValue", new Object[0]);
                write(childhittestqzlsgqo, value);
            }
        }
    }

    public final Value serializer() {
        Value value;
        Value value2 = this.IconCompatParcelizer;
        if (value2 != null) {
            return value2;
        }
        synchronized (this.write) {
            value = this.IconCompatParcelizer;
            if (value == null) {
                boolean zIsEmpty = this.RemoteActionCompatParcelizer.isEmpty();
                Value value3 = this.serializer;
                if (zIsEmpty) {
                    value = value3;
                } else {
                    MapValue mapValueIconCompatParcelizer = IconCompatParcelizer(value3, childHitTestqzLsGqo.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer);
                    if (mapValueIconCompatParcelizer == null) {
                        value = this.serializer;
                    } else {
                        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
                        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
                        ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setMapValue(mapValueIconCompatParcelizer);
                        value = (Value) accesscontainsdescendantNewBuilder.serializer();
                    }
                }
                this.IconCompatParcelizer = value;
                this.serializer = null;
                this.RemoteActionCompatParcelizer.clear();
            }
        }
        return value;
    }

    public final String toString() {
        return "ObjectValue{internalValue=" + NodeCoordinatorCompaniononCommitAffectingLayer1.IconCompatParcelizer(serializer()) + '}';
    }

    public final Value write(childHitTestqzLsGqo childhittestqzlsgqo) {
        return RemoteActionCompatParcelizer(childhittestqzlsgqo, serializer());
    }

    public entityTypeOLwlOKw(Value value) {
        this.write = new Object();
        this.RemoteActionCompatParcelizer = new HashMap();
        getRectManager.RemoteActionCompatParcelizer(value.hasMapValue(), "ObjectValues should be backed by a MapValue", new Object[0]);
        getRectManager.RemoteActionCompatParcelizer(!shouldHitTestChildren.read(value), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.IconCompatParcelizer = value;
    }

    public static Value RemoteActionCompatParcelizer(childHitTestqzLsGqo childhittestqzlsgqo, Value value) {
        if (childhittestqzlsgqo.IconCompatParcelizer()) {
            return value;
        }
        for (int i = 0; i < childhittestqzlsgqo.IconCompatParcelizer.size() - 1; i++) {
            value = value.getMapValue().getFieldsOrDefault(childhittestqzlsgqo.RemoteActionCompatParcelizer(i), null);
            NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
            if (value == null || !value.hasMapValue()) {
                return null;
            }
        }
        return value.getMapValue().getFieldsOrDefault(childhittestqzlsgqo.serializer(), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public entityTypeOLwlOKw() {
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        MapValue defaultInstance = MapValue.getDefaultInstance();
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setMapValue(defaultInstance);
        this((Value) accesscontainsdescendantNewBuilder.serializer());
    }

    public final void write(childHitTestqzLsGqo childhittestqzlsgqo, Value value) {
        synchronized (this.write) {
            if (this.IconCompatParcelizer != null) {
                this.serializer = this.IconCompatParcelizer;
                this.IconCompatParcelizer = null;
            }
            RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, childhittestqzlsgqo, value);
        }
    }
}
