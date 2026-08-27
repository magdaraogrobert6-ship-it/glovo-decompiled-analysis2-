package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getAssertive0phEisY {
    public final accessgetIndeterminatecp RemoteActionCompatParcelizer;
    public final accessgetIndeterminatecp read;
    public final ConcurrentHashMap IconCompatParcelizer = new ConcurrentHashMap();
    public final ConcurrentHashMap serializer = new ConcurrentHashMap();

    public static Class serializer(Map map, Type type) {
        Class clsRemoteActionCompatParcelizer;
        if (type == null) {
            return null;
        }
        if ((type instanceof Class) && (clsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(map, (Class) type)) != null) {
            return clsRemoteActionCompatParcelizer;
        }
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getRawType() instanceof Class) {
            return RemoteActionCompatParcelizer(map, (Class) parameterizedType.getRawType());
        }
        return null;
    }

    public getAssertive0phEisY(Class... clsArr) {
        accessgetIndeterminatecp accessgetindeterminatecp = new accessgetIndeterminatecp();
        Class cls = Byte.TYPE;
        accessgetindeterminatecp.put(cls, Byte.class);
        Class cls2 = Short.TYPE;
        accessgetindeterminatecp.put(cls2, Short.class);
        Class cls3 = Integer.TYPE;
        accessgetindeterminatecp.put(cls3, Integer.class);
        Class cls4 = Long.TYPE;
        accessgetindeterminatecp.put(cls4, Long.class);
        Class cls5 = Float.TYPE;
        accessgetindeterminatecp.put(cls5, Float.class);
        Class cls6 = Double.TYPE;
        accessgetindeterminatecp.put(cls6, Double.class);
        Class cls7 = Character.TYPE;
        accessgetindeterminatecp.put(cls7, Character.class);
        Class cls8 = Boolean.TYPE;
        accessgetindeterminatecp.put(cls8, Boolean.class);
        this.read = accessgetindeterminatecp;
        accessgetIndeterminatecp accessgetindeterminatecp2 = new accessgetIndeterminatecp();
        accessgetindeterminatecp2.put(cls, byte[].class);
        accessgetindeterminatecp2.put(cls2, short[].class);
        accessgetindeterminatecp2.put(cls3, int[].class);
        accessgetindeterminatecp2.put(cls4, long[].class);
        accessgetindeterminatecp2.put(cls5, float[].class);
        accessgetindeterminatecp2.put(cls6, double[].class);
        accessgetindeterminatecp2.put(cls7, char[].class);
        accessgetindeterminatecp2.put(cls8, boolean[].class);
        this.RemoteActionCompatParcelizer = accessgetindeterminatecp2;
        for (Class cls9 : clsArr) {
            accessgetIndeterminatecp accessgetindeterminatecp3 = this.RemoteActionCompatParcelizer;
            ConcurrentHashMap concurrentHashMap = this.IconCompatParcelizer;
            Type type = ((ParameterizedType) cls9.getGenericInterfaces()[0]).getActualTypeArguments()[1];
            if (type instanceof Class) {
                Class cls10 = (Class) type;
                if (cls10.isArray()) {
                    this.serializer.put(cls10.getComponentType(), cls9);
                }
                concurrentHashMap.put(type, cls9);
            } else if (type instanceof GenericArrayType) {
                Class cls11 = (Class) ((GenericArrayType) type).getGenericComponentType();
                if (accessgetindeterminatecp3.containsKey(cls11)) {
                    concurrentHashMap.put((Type) accessgetindeterminatecp3.get(cls11), cls9);
                }
            }
        }
    }

    public static Class RemoteActionCompatParcelizer(Map map, Class cls) {
        if (map.containsKey(cls)) {
            return (Class) map.get(cls);
        }
        Class clsSerializer = serializer(map, cls.getGenericSuperclass());
        if (clsSerializer != null) {
            return clsSerializer;
        }
        for (Type type : cls.getGenericInterfaces()) {
            Class clsSerializer2 = serializer(map, type);
            if (clsSerializer2 != null) {
                return clsSerializer2;
            }
        }
        return null;
    }
}
