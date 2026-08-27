package o;

import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeCompanion {
    private static final /* synthetic */ LayoutNodeCompanion[] $VALUES;
    public static final LayoutNodeCompanion BOOL;
    public static final LayoutNodeCompanion BOOL_LIST;
    public static final LayoutNodeCompanion BOOL_LIST_PACKED;
    public static final LayoutNodeCompanion BYTES;
    public static final LayoutNodeCompanion BYTES_LIST;
    public static final LayoutNodeCompanion DOUBLE;
    public static final LayoutNodeCompanion DOUBLE_LIST;
    public static final LayoutNodeCompanion DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final LayoutNodeCompanion ENUM;
    public static final LayoutNodeCompanion ENUM_LIST;
    public static final LayoutNodeCompanion ENUM_LIST_PACKED;
    public static final LayoutNodeCompanion FIXED32;
    public static final LayoutNodeCompanion FIXED32_LIST;
    public static final LayoutNodeCompanion FIXED32_LIST_PACKED;
    public static final LayoutNodeCompanion FIXED64;
    public static final LayoutNodeCompanion FIXED64_LIST;
    public static final LayoutNodeCompanion FIXED64_LIST_PACKED;
    public static final LayoutNodeCompanion FLOAT;
    public static final LayoutNodeCompanion FLOAT_LIST;
    public static final LayoutNodeCompanion FLOAT_LIST_PACKED;
    public static final LayoutNodeCompanion GROUP;
    public static final LayoutNodeCompanion GROUP_LIST;
    public static final LayoutNodeCompanion INT32;
    public static final LayoutNodeCompanion INT32_LIST;
    public static final LayoutNodeCompanion INT32_LIST_PACKED;
    public static final LayoutNodeCompanion INT64;
    public static final LayoutNodeCompanion INT64_LIST;
    public static final LayoutNodeCompanion INT64_LIST_PACKED;
    public static final LayoutNodeCompanion MAP;
    public static final LayoutNodeCompanion MESSAGE;
    public static final LayoutNodeCompanion MESSAGE_LIST;
    public static final LayoutNodeCompanion SFIXED32;
    public static final LayoutNodeCompanion SFIXED32_LIST;
    public static final LayoutNodeCompanion SFIXED32_LIST_PACKED;
    public static final LayoutNodeCompanion SFIXED64;
    public static final LayoutNodeCompanion SFIXED64_LIST;
    public static final LayoutNodeCompanion SFIXED64_LIST_PACKED;
    public static final LayoutNodeCompanion SINT32;
    public static final LayoutNodeCompanion SINT32_LIST;
    public static final LayoutNodeCompanion SINT32_LIST_PACKED;
    public static final LayoutNodeCompanion SINT64;
    public static final LayoutNodeCompanion SINT64_LIST;
    public static final LayoutNodeCompanion SINT64_LIST_PACKED;
    public static final LayoutNodeCompanion STRING;
    public static final LayoutNodeCompanion STRING_LIST;
    public static final LayoutNodeCompanion UINT32;
    public static final LayoutNodeCompanion UINT32_LIST;
    public static final LayoutNodeCompanion UINT32_LIST_PACKED;
    public static final LayoutNodeCompanion UINT64;
    public static final LayoutNodeCompanion UINT64_LIST;
    public static final LayoutNodeCompanion UINT64_LIST_PACKED;
    private static final LayoutNodeCompanion[] VALUES;
    private final IconCompatParcelizer collection;
    private final Class<?> elementType;
    private final int id;
    private final LayoutNodeWhenMappings javaType;
    private final boolean primitiveScalar;

    public LayoutNodeWhenMappings getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public enum IconCompatParcelizer {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        public boolean isList() {
            return this.isList;
        }

        IconCompatParcelizer(boolean z) {
            this.isList = z;
        }
    }

    static {
        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.SCALAR;
        LayoutNodeWhenMappings layoutNodeWhenMappings = LayoutNodeWhenMappings.DOUBLE;
        LayoutNodeCompanion layoutNodeCompanion = new LayoutNodeCompanion("DOUBLE", 0, 0, iconCompatParcelizer, layoutNodeWhenMappings);
        DOUBLE = layoutNodeCompanion;
        LayoutNodeWhenMappings layoutNodeWhenMappings2 = LayoutNodeWhenMappings.FLOAT;
        LayoutNodeCompanion layoutNodeCompanion2 = new LayoutNodeCompanion("FLOAT", 1, 1, iconCompatParcelizer, layoutNodeWhenMappings2);
        FLOAT = layoutNodeCompanion2;
        LayoutNodeWhenMappings layoutNodeWhenMappings3 = LayoutNodeWhenMappings.LONG;
        LayoutNodeCompanion layoutNodeCompanion3 = new LayoutNodeCompanion("INT64", 2, 2, iconCompatParcelizer, layoutNodeWhenMappings3);
        INT64 = layoutNodeCompanion3;
        LayoutNodeCompanion layoutNodeCompanion4 = new LayoutNodeCompanion("UINT64", 3, 3, iconCompatParcelizer, layoutNodeWhenMappings3);
        UINT64 = layoutNodeCompanion4;
        LayoutNodeWhenMappings layoutNodeWhenMappings4 = LayoutNodeWhenMappings.INT;
        LayoutNodeCompanion layoutNodeCompanion5 = new LayoutNodeCompanion("INT32", 4, 4, iconCompatParcelizer, layoutNodeWhenMappings4);
        INT32 = layoutNodeCompanion5;
        LayoutNodeCompanion layoutNodeCompanion6 = new LayoutNodeCompanion("FIXED64", 5, 5, iconCompatParcelizer, layoutNodeWhenMappings3);
        FIXED64 = layoutNodeCompanion6;
        LayoutNodeCompanion layoutNodeCompanion7 = new LayoutNodeCompanion("FIXED32", 6, 6, iconCompatParcelizer, layoutNodeWhenMappings4);
        FIXED32 = layoutNodeCompanion7;
        LayoutNodeWhenMappings layoutNodeWhenMappings5 = LayoutNodeWhenMappings.BOOLEAN;
        LayoutNodeCompanion layoutNodeCompanion8 = new LayoutNodeCompanion("BOOL", 7, 7, iconCompatParcelizer, layoutNodeWhenMappings5);
        BOOL = layoutNodeCompanion8;
        LayoutNodeWhenMappings layoutNodeWhenMappings6 = LayoutNodeWhenMappings.STRING;
        LayoutNodeCompanion layoutNodeCompanion9 = new LayoutNodeCompanion("STRING", 8, 8, iconCompatParcelizer, layoutNodeWhenMappings6);
        STRING = layoutNodeCompanion9;
        LayoutNodeWhenMappings layoutNodeWhenMappings7 = LayoutNodeWhenMappings.MESSAGE;
        LayoutNodeCompanion layoutNodeCompanion10 = new LayoutNodeCompanion("MESSAGE", 9, 9, iconCompatParcelizer, layoutNodeWhenMappings7);
        MESSAGE = layoutNodeCompanion10;
        LayoutNodeWhenMappings layoutNodeWhenMappings8 = LayoutNodeWhenMappings.BYTE_STRING;
        LayoutNodeCompanion layoutNodeCompanion11 = new LayoutNodeCompanion("BYTES", 10, 10, iconCompatParcelizer, layoutNodeWhenMappings8);
        BYTES = layoutNodeCompanion11;
        LayoutNodeCompanion layoutNodeCompanion12 = new LayoutNodeCompanion("UINT32", 11, 11, iconCompatParcelizer, layoutNodeWhenMappings4);
        UINT32 = layoutNodeCompanion12;
        LayoutNodeWhenMappings layoutNodeWhenMappings9 = LayoutNodeWhenMappings.ENUM;
        LayoutNodeCompanion layoutNodeCompanion13 = new LayoutNodeCompanion("ENUM", 12, 12, iconCompatParcelizer, layoutNodeWhenMappings9);
        ENUM = layoutNodeCompanion13;
        LayoutNodeCompanion layoutNodeCompanion14 = new LayoutNodeCompanion("SFIXED32", 13, 13, iconCompatParcelizer, layoutNodeWhenMappings4);
        SFIXED32 = layoutNodeCompanion14;
        LayoutNodeCompanion layoutNodeCompanion15 = new LayoutNodeCompanion("SFIXED64", 14, 14, iconCompatParcelizer, layoutNodeWhenMappings3);
        SFIXED64 = layoutNodeCompanion15;
        LayoutNodeCompanion layoutNodeCompanion16 = new LayoutNodeCompanion("SINT32", 15, 15, iconCompatParcelizer, layoutNodeWhenMappings4);
        SINT32 = layoutNodeCompanion16;
        LayoutNodeCompanion layoutNodeCompanion17 = new LayoutNodeCompanion("SINT64", 16, 16, iconCompatParcelizer, layoutNodeWhenMappings3);
        SINT64 = layoutNodeCompanion17;
        LayoutNodeCompanion layoutNodeCompanion18 = new LayoutNodeCompanion("GROUP", 17, 17, iconCompatParcelizer, layoutNodeWhenMappings7);
        GROUP = layoutNodeCompanion18;
        IconCompatParcelizer iconCompatParcelizer2 = IconCompatParcelizer.VECTOR;
        LayoutNodeCompanion layoutNodeCompanion19 = new LayoutNodeCompanion("DOUBLE_LIST", 18, 18, iconCompatParcelizer2, layoutNodeWhenMappings);
        DOUBLE_LIST = layoutNodeCompanion19;
        LayoutNodeCompanion layoutNodeCompanion20 = new LayoutNodeCompanion("FLOAT_LIST", 19, 19, iconCompatParcelizer2, layoutNodeWhenMappings2);
        FLOAT_LIST = layoutNodeCompanion20;
        LayoutNodeCompanion layoutNodeCompanion21 = new LayoutNodeCompanion("INT64_LIST", 20, 20, iconCompatParcelizer2, layoutNodeWhenMappings3);
        INT64_LIST = layoutNodeCompanion21;
        LayoutNodeCompanion layoutNodeCompanion22 = new LayoutNodeCompanion("UINT64_LIST", 21, 21, iconCompatParcelizer2, layoutNodeWhenMappings3);
        UINT64_LIST = layoutNodeCompanion22;
        LayoutNodeCompanion layoutNodeCompanion23 = new LayoutNodeCompanion("INT32_LIST", 22, 22, iconCompatParcelizer2, layoutNodeWhenMappings4);
        INT32_LIST = layoutNodeCompanion23;
        LayoutNodeCompanion layoutNodeCompanion24 = new LayoutNodeCompanion("FIXED64_LIST", 23, 23, iconCompatParcelizer2, layoutNodeWhenMappings3);
        FIXED64_LIST = layoutNodeCompanion24;
        LayoutNodeCompanion layoutNodeCompanion25 = new LayoutNodeCompanion("FIXED32_LIST", 24, 24, iconCompatParcelizer2, layoutNodeWhenMappings4);
        FIXED32_LIST = layoutNodeCompanion25;
        LayoutNodeCompanion layoutNodeCompanion26 = new LayoutNodeCompanion("BOOL_LIST", 25, 25, iconCompatParcelizer2, layoutNodeWhenMappings5);
        BOOL_LIST = layoutNodeCompanion26;
        LayoutNodeCompanion layoutNodeCompanion27 = new LayoutNodeCompanion("STRING_LIST", 26, 26, iconCompatParcelizer2, layoutNodeWhenMappings6);
        STRING_LIST = layoutNodeCompanion27;
        LayoutNodeCompanion layoutNodeCompanion28 = new LayoutNodeCompanion("MESSAGE_LIST", 27, 27, iconCompatParcelizer2, layoutNodeWhenMappings7);
        MESSAGE_LIST = layoutNodeCompanion28;
        LayoutNodeCompanion layoutNodeCompanion29 = new LayoutNodeCompanion("BYTES_LIST", 28, 28, iconCompatParcelizer2, layoutNodeWhenMappings8);
        BYTES_LIST = layoutNodeCompanion29;
        LayoutNodeCompanion layoutNodeCompanion30 = new LayoutNodeCompanion("UINT32_LIST", 29, 29, iconCompatParcelizer2, layoutNodeWhenMappings4);
        UINT32_LIST = layoutNodeCompanion30;
        LayoutNodeCompanion layoutNodeCompanion31 = new LayoutNodeCompanion("ENUM_LIST", 30, 30, iconCompatParcelizer2, layoutNodeWhenMappings9);
        ENUM_LIST = layoutNodeCompanion31;
        LayoutNodeCompanion layoutNodeCompanion32 = new LayoutNodeCompanion("SFIXED32_LIST", 31, 31, iconCompatParcelizer2, layoutNodeWhenMappings4);
        SFIXED32_LIST = layoutNodeCompanion32;
        LayoutNodeCompanion layoutNodeCompanion33 = new LayoutNodeCompanion("SFIXED64_LIST", 32, 32, iconCompatParcelizer2, layoutNodeWhenMappings3);
        SFIXED64_LIST = layoutNodeCompanion33;
        LayoutNodeCompanion layoutNodeCompanion34 = new LayoutNodeCompanion("SINT32_LIST", 33, 33, iconCompatParcelizer2, layoutNodeWhenMappings4);
        SINT32_LIST = layoutNodeCompanion34;
        LayoutNodeCompanion layoutNodeCompanion35 = new LayoutNodeCompanion("SINT64_LIST", 34, 34, iconCompatParcelizer2, layoutNodeWhenMappings3);
        SINT64_LIST = layoutNodeCompanion35;
        IconCompatParcelizer iconCompatParcelizer3 = IconCompatParcelizer.PACKED_VECTOR;
        LayoutNodeCompanion layoutNodeCompanion36 = new LayoutNodeCompanion("DOUBLE_LIST_PACKED", 35, 35, iconCompatParcelizer3, layoutNodeWhenMappings);
        DOUBLE_LIST_PACKED = layoutNodeCompanion36;
        LayoutNodeCompanion layoutNodeCompanion37 = new LayoutNodeCompanion("FLOAT_LIST_PACKED", 36, 36, iconCompatParcelizer3, layoutNodeWhenMappings2);
        FLOAT_LIST_PACKED = layoutNodeCompanion37;
        LayoutNodeCompanion layoutNodeCompanion38 = new LayoutNodeCompanion("INT64_LIST_PACKED", 37, 37, iconCompatParcelizer3, layoutNodeWhenMappings3);
        INT64_LIST_PACKED = layoutNodeCompanion38;
        LayoutNodeCompanion layoutNodeCompanion39 = new LayoutNodeCompanion("UINT64_LIST_PACKED", 38, 38, iconCompatParcelizer3, layoutNodeWhenMappings3);
        UINT64_LIST_PACKED = layoutNodeCompanion39;
        LayoutNodeCompanion layoutNodeCompanion40 = new LayoutNodeCompanion("INT32_LIST_PACKED", 39, 39, iconCompatParcelizer3, layoutNodeWhenMappings4);
        INT32_LIST_PACKED = layoutNodeCompanion40;
        LayoutNodeCompanion layoutNodeCompanion41 = new LayoutNodeCompanion("FIXED64_LIST_PACKED", 40, 40, iconCompatParcelizer3, layoutNodeWhenMappings3);
        FIXED64_LIST_PACKED = layoutNodeCompanion41;
        LayoutNodeCompanion layoutNodeCompanion42 = new LayoutNodeCompanion("FIXED32_LIST_PACKED", 41, 41, iconCompatParcelizer3, layoutNodeWhenMappings4);
        FIXED32_LIST_PACKED = layoutNodeCompanion42;
        LayoutNodeCompanion layoutNodeCompanion43 = new LayoutNodeCompanion("BOOL_LIST_PACKED", 42, 42, iconCompatParcelizer3, layoutNodeWhenMappings5);
        BOOL_LIST_PACKED = layoutNodeCompanion43;
        LayoutNodeCompanion layoutNodeCompanion44 = new LayoutNodeCompanion("UINT32_LIST_PACKED", 43, 43, iconCompatParcelizer3, layoutNodeWhenMappings4);
        UINT32_LIST_PACKED = layoutNodeCompanion44;
        LayoutNodeCompanion layoutNodeCompanion45 = new LayoutNodeCompanion("ENUM_LIST_PACKED", 44, 44, iconCompatParcelizer3, layoutNodeWhenMappings9);
        ENUM_LIST_PACKED = layoutNodeCompanion45;
        LayoutNodeCompanion layoutNodeCompanion46 = new LayoutNodeCompanion("SFIXED32_LIST_PACKED", 45, 45, iconCompatParcelizer3, layoutNodeWhenMappings4);
        SFIXED32_LIST_PACKED = layoutNodeCompanion46;
        LayoutNodeCompanion layoutNodeCompanion47 = new LayoutNodeCompanion("SFIXED64_LIST_PACKED", 46, 46, iconCompatParcelizer3, layoutNodeWhenMappings3);
        SFIXED64_LIST_PACKED = layoutNodeCompanion47;
        LayoutNodeCompanion layoutNodeCompanion48 = new LayoutNodeCompanion("SINT32_LIST_PACKED", 47, 47, iconCompatParcelizer3, layoutNodeWhenMappings4);
        SINT32_LIST_PACKED = layoutNodeCompanion48;
        LayoutNodeCompanion layoutNodeCompanion49 = new LayoutNodeCompanion("SINT64_LIST_PACKED", 48, 48, iconCompatParcelizer3, layoutNodeWhenMappings3);
        SINT64_LIST_PACKED = layoutNodeCompanion49;
        LayoutNodeCompanion layoutNodeCompanion50 = new LayoutNodeCompanion("GROUP_LIST", 49, 49, iconCompatParcelizer2, layoutNodeWhenMappings7);
        GROUP_LIST = layoutNodeCompanion50;
        LayoutNodeCompanion layoutNodeCompanion51 = new LayoutNodeCompanion("MAP", 50, 50, IconCompatParcelizer.MAP, LayoutNodeWhenMappings.VOID);
        MAP = layoutNodeCompanion51;
        $VALUES = new LayoutNodeCompanion[]{layoutNodeCompanion, layoutNodeCompanion2, layoutNodeCompanion3, layoutNodeCompanion4, layoutNodeCompanion5, layoutNodeCompanion6, layoutNodeCompanion7, layoutNodeCompanion8, layoutNodeCompanion9, layoutNodeCompanion10, layoutNodeCompanion11, layoutNodeCompanion12, layoutNodeCompanion13, layoutNodeCompanion14, layoutNodeCompanion15, layoutNodeCompanion16, layoutNodeCompanion17, layoutNodeCompanion18, layoutNodeCompanion19, layoutNodeCompanion20, layoutNodeCompanion21, layoutNodeCompanion22, layoutNodeCompanion23, layoutNodeCompanion24, layoutNodeCompanion25, layoutNodeCompanion26, layoutNodeCompanion27, layoutNodeCompanion28, layoutNodeCompanion29, layoutNodeCompanion30, layoutNodeCompanion31, layoutNodeCompanion32, layoutNodeCompanion33, layoutNodeCompanion34, layoutNodeCompanion35, layoutNodeCompanion36, layoutNodeCompanion37, layoutNodeCompanion38, layoutNodeCompanion39, layoutNodeCompanion40, layoutNodeCompanion41, layoutNodeCompanion42, layoutNodeCompanion43, layoutNodeCompanion44, layoutNodeCompanion45, layoutNodeCompanion46, layoutNodeCompanion47, layoutNodeCompanion48, layoutNodeCompanion49, layoutNodeCompanion50, layoutNodeCompanion51};
        EMPTY_TYPES = new Type[0];
        LayoutNodeCompanion[] layoutNodeCompanionArrValues = values();
        VALUES = new LayoutNodeCompanion[layoutNodeCompanionArrValues.length];
        for (LayoutNodeCompanion layoutNodeCompanion52 : layoutNodeCompanionArrValues) {
            VALUES[layoutNodeCompanion52.id] = layoutNodeCompanion52;
        }
    }

    public static LayoutNodeCompanion forId(int i) {
        if (i < 0) {
            return null;
        }
        LayoutNodeCompanion[] layoutNodeCompanionArr = VALUES;
        if (i >= layoutNodeCompanionArr.length) {
            return null;
        }
        return layoutNodeCompanionArr[i];
    }

    public static LayoutNodeCompanion valueOf(String str) {
        return (LayoutNodeCompanion) Enum.valueOf(LayoutNodeCompanion.class, str);
    }

    public static LayoutNodeCompanion[] values() {
        return (LayoutNodeCompanion[]) $VALUES.clone();
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == IconCompatParcelizer.MAP;
    }

    public boolean isPacked() {
        return IconCompatParcelizer.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isScalar() {
        return this.collection == IconCompatParcelizer.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return IconCompatParcelizer.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }

    private LayoutNodeCompanion(String str, int i, int i2, IconCompatParcelizer iconCompatParcelizer, LayoutNodeWhenMappings layoutNodeWhenMappings) {
        int i3;
        super(str, i);
        this.id = i2;
        this.collection = iconCompatParcelizer;
        this.javaType = layoutNodeWhenMappings;
        int i4 = getConstructorui.read[iconCompatParcelizer.ordinal()];
        if (i4 == 1 || i4 == 2) {
            this.elementType = layoutNodeWhenMappings.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (iconCompatParcelizer != IconCompatParcelizer.SCALAR || (i3 = getConstructorui.RemoteActionCompatParcelizer[layoutNodeWhenMappings.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i = 0;
            if (cls != List.class) {
                Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length != typeParameters.length) {
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Type array mismatch");
                                return null;
                            }
                            int i3 = 0;
                            while (true) {
                                if (i3 < typeParameters.length) {
                                    if (type == typeParameters[i3]) {
                                        actualTypeArguments[i2] = typeArr[i3];
                                        break;
                                    }
                                    i3++;
                                } else {
                                    FieldType$$ExternalSyntheticBUOutline0.IconCompatParcelizer(type, "Unable to find replacement for ");
                                    return null;
                                }
                            }
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i < length) {
                            Class<?> cls2 = interfaces[i];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Unable to identify parameter type for List<T>");
                return null;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }
}
