package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getRemoteBitmaplambda4 {
    public static final Class IconCompatParcelizer;
    public static final Class RemoteActionCompatParcelizer;
    public static final Set read = Collections.EMPTY_SET;
    public static final Type[] write = new Type[0];

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        RemoteActionCompatParcelizer = cls;
        IconCompatParcelizer = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        Collections.unmodifiableMap(linkedHashMap);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static String read(Type type, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static Type serializer(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return serializer(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return serializer(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static com.squareup.moshi.JsonDataException IconCompatParcelizer(String str, String str2, getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        String string;
        String strRemoteActionCompatParcelizer = getdisplayheightandwidthpixels.RemoteActionCompatParcelizer();
        if (str2.equals(str)) {
            string = af$$ExternalSyntheticOutline0.m("Non-null value '", str, "' was null at ", strRemoteActionCompatParcelizer);
        } else {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            sbM.append(strRemoteActionCompatParcelizer);
            string = sbM.toString();
        }
        return new com.squareup.moshi.JsonDataException(string);
    }

    public static com.squareup.moshi.JsonDataException RemoteActionCompatParcelizer(String str, String str2, getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        String string;
        String strRemoteActionCompatParcelizer = getdisplayheightandwidthpixels.RemoteActionCompatParcelizer();
        if (str2.equals(str)) {
            string = af$$ExternalSyntheticOutline0.m("Required value '", str, "' missing at ", strRemoteActionCompatParcelizer);
        } else {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Required value '", str, "' (JSON name '", str2, "') missing at ");
            sbM.append(strRemoteActionCompatParcelizer);
            string = sbM.toString();
        }
        return new com.squareup.moshi.JsonDataException(string);
    }

    public static String read(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type serializer(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new getRemoteBitmaplambda3(serializer((Type) cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof resizeToBitmapDimensions) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new resizeToBitmapDimensions(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof getRemoteBitmaplambda3 ? type : new getRemoteBitmaplambda3(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof getRemoteBitmaplambda5)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new getRemoteBitmaplambda5(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void serializer(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    public static void IconCompatParcelizer(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            DrawableTransformation.IconCompatParcelizer("Unexpected primitive ", type, ". Use the boxed type.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    public static Type serializer(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type typeSerializer;
        TypeVariable typeVariable;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeSerializer2 = serializer(type, cls, componentType, linkedHashSet);
                        return componentType == typeSerializer2 ? cls2 : new getRemoteBitmaplambda3(typeSerializer2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeSerializer3 = serializer(type, cls, genericComponentType, linkedHashSet);
                    return genericComponentType == typeSerializer3 ? genericArrayType : new getRemoteBitmaplambda3(typeSerializer3);
                }
                if (!(type2 instanceof ParameterizedType)) {
                    if (!(type2 instanceof WildcardType)) {
                        return type2;
                    }
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeSerializer4 = serializer(type, cls, lowerBounds[0], linkedHashSet);
                        if (typeSerializer4 != lowerBounds[0]) {
                            return new getRemoteBitmaplambda5(new Type[]{Object.class}, typeSerializer4 instanceof WildcardType ? ((WildcardType) typeSerializer4).getLowerBounds() : new Type[]{typeSerializer4});
                        }
                        return wildcardType;
                    }
                    if (upperBounds.length != 1 || (typeSerializer = serializer(type, cls, upperBounds[0], linkedHashSet)) == upperBounds[0]) {
                        return wildcardType;
                    }
                    return new getRemoteBitmaplambda5(typeSerializer instanceof WildcardType ? ((WildcardType) typeSerializer).getUpperBounds() : new Type[]{typeSerializer}, write);
                }
                ParameterizedType parameterizedType = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type typeSerializer5 = serializer(type, cls, ownerType, linkedHashSet);
                boolean z = typeSerializer5 != ownerType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i < length) {
                    Type typeSerializer6 = serializer(type, cls, actualTypeArguments[i], linkedHashSet);
                    if (typeSerializer6 != actualTypeArguments[i]) {
                        if (!z) {
                            actualTypeArguments = (Type[]) actualTypeArguments.clone();
                            z = true;
                        }
                        actualTypeArguments[i] = typeSerializer6;
                    }
                    i++;
                }
                return z ? new resizeToBitmapDimensions(typeSerializer5, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
            }
            typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type2 = typeVariable;
            } else {
                Type typeSerializer7 = serializer(type, cls, cls3);
                if (typeSerializer7 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.read();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) typeSerializer7).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    public static boolean serializer(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }
}
