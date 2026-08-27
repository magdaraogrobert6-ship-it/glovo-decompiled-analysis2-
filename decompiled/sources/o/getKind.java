package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getKind {
    public static boolean RemoteActionCompatParcelizer = true;
    public static final Type[] serializer = new Type[0];

    public static IllegalArgumentException IconCompatParcelizer(Method method, int i, String str, Object... objArr) {
        return read(method, null, m1$$ExternalSyntheticOutline0.m(str, " (", ProtoErrorMsgCompanion.write.IconCompatParcelizer(method, i), ")"), objArr);
    }

    public static Type IconCompatParcelizer(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return write(type, cls, write(type, cls, Map.class));
        }
        DrawableTransformation.write();
        return null;
    }

    public static Class write(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            DrawableTransformation.write();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) write(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return write(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        getOffVariationName.serializer(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    public static Type write(Type type, Class cls, Class cls2) {
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
                    return write(cls.getGenericInterfaces()[i], (Class) interfaces[i], cls2);
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
                    return write(cls.getGenericSuperclass(), (Class) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static void IconCompatParcelizer(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            DrawableTransformation.write();
        }
    }

    public static String RemoteActionCompatParcelizer(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static void read(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static boolean serializer(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return serializer(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static boolean read(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static Type write(Type type, Class cls, Type type2) {
        Type typeWrite;
        Type type3;
        while (true) {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeWrite2 = write(type, cls, (Type) componentType);
                        return componentType == typeWrite2 ? cls2 : new getPrerequisiteFeatures(typeWrite2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeWrite3 = write(type, cls, genericComponentType);
                    return genericComponentType == typeWrite3 ? genericArrayType : new getPrerequisiteFeatures(typeWrite3);
                }
                if (!(type2 instanceof ParameterizedType)) {
                    if (!(type2 instanceof WildcardType)) {
                        return type2;
                    }
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length != 1) {
                        return (upperBounds.length != 1 || (typeWrite = write(type, cls, upperBounds[0])) == upperBounds[0]) ? wildcardType : new getSalt(new Type[]{typeWrite}, serializer);
                    }
                    Type typeWrite4 = write(type, cls, lowerBounds[0]);
                    return typeWrite4 != lowerBounds[0] ? new getSalt(new Type[]{Object.class}, new Type[]{typeWrite4}) : wildcardType;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type typeWrite5 = write(type, cls, ownerType);
                boolean z = typeWrite5 != ownerType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i < length) {
                    Type typeWrite6 = write(type, cls, actualTypeArguments[i]);
                    if (typeWrite6 != actualTypeArguments[i]) {
                        if (!z) {
                            actualTypeArguments = (Type[]) actualTypeArguments.clone();
                            z = true;
                        }
                        actualTypeArguments[i] = typeWrite6;
                    }
                    i++;
                }
                return z ? new getTargets(typeWrite5, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
            }
            TypeVariable typeVariable = (TypeVariable) type2;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type3 = typeVariable;
            } else {
                Type typeWrite7 = write(type, cls, cls3);
                if (typeWrite7 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.read();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) typeWrite7).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type3 = typeVariable;
                }
            }
            if (type3 == typeVariable) {
                return type3;
            }
            type2 = type3;
        }
    }

    public static Type read(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "Index ", " not in range [0,");
        sbM.append(actualTypeArguments.length);
        sbM.append(") for ");
        sbM.append(parameterizedType);
        throw new IllegalArgumentException(sbM.toString());
    }

    public static boolean read(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return read(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            getOffVariationName.read("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (read(type2)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException read(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(String.format(str, objArr), "\n    for method ");
        sbM.append(method.getDeclaringClass().getSimpleName());
        sbM.append(".");
        sbM.append(method.getName());
        return new IllegalArgumentException(sbM.toString(), exc);
    }

    public static IllegalArgumentException IconCompatParcelizer(Method method, Exception exc, int i, String str, Object... objArr) {
        return read(method, exc, m1$$ExternalSyntheticOutline0.m(str, " (", ProtoErrorMsgCompanion.write.IconCompatParcelizer(method, i), ")"), objArr);
    }
}
