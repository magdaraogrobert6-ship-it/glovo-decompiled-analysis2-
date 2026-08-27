package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class decodeTextGeometricTransform {
    private static final /* synthetic */ decodeTextGeometricTransform[] $VALUES;
    public static final decodeTextGeometricTransform BOOLEAN;
    public static final decodeTextGeometricTransform BYTE_STRING;
    public static final decodeTextGeometricTransform DOUBLE;
    public static final decodeTextGeometricTransform ENUM;
    public static final decodeTextGeometricTransform FLOAT;
    public static final decodeTextGeometricTransform INT;
    public static final decodeTextGeometricTransform LONG;
    public static final decodeTextGeometricTransform MESSAGE;
    public static final decodeTextGeometricTransform STRING;
    public static final decodeTextGeometricTransform VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public static decodeTextGeometricTransform valueOf(String str) {
        return (decodeTextGeometricTransform) Enum.valueOf(decodeTextGeometricTransform.class, str);
    }

    public static decodeTextGeometricTransform[] values() {
        return (decodeTextGeometricTransform[]) $VALUES.clone();
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }

    private decodeTextGeometricTransform(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    static {
        decodeTextGeometricTransform decodetextgeometrictransform = new decodeTextGeometricTransform("VOID", 0, Void.class, Void.class, null);
        VOID = decodetextgeometrictransform;
        Class cls = Integer.TYPE;
        decodeTextGeometricTransform decodetextgeometrictransform2 = new decodeTextGeometricTransform("INT", 1, cls, Integer.class, 0);
        INT = decodetextgeometrictransform2;
        decodeTextGeometricTransform decodetextgeometrictransform3 = new decodeTextGeometricTransform("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = decodetextgeometrictransform3;
        decodeTextGeometricTransform decodetextgeometrictransform4 = new decodeTextGeometricTransform("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = decodetextgeometrictransform4;
        decodeTextGeometricTransform decodetextgeometrictransform5 = new decodeTextGeometricTransform("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = decodetextgeometrictransform5;
        decodeTextGeometricTransform decodetextgeometrictransform6 = new decodeTextGeometricTransform("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = decodetextgeometrictransform6;
        decodeTextGeometricTransform decodetextgeometrictransform7 = new decodeTextGeometricTransform("STRING", 6, String.class, String.class, "");
        STRING = decodetextgeometrictransform7;
        decodeTextGeometricTransform decodetextgeometrictransform8 = new decodeTextGeometricTransform("BYTE_STRING", 7, getClipMetadata.class, getClipMetadata.class, getClipMetadata.serializer);
        BYTE_STRING = decodetextgeometrictransform8;
        decodeTextGeometricTransform decodetextgeometrictransform9 = new decodeTextGeometricTransform("ENUM", 8, cls, Integer.class, null);
        ENUM = decodetextgeometrictransform9;
        decodeTextGeometricTransform decodetextgeometrictransform10 = new decodeTextGeometricTransform("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = decodetextgeometrictransform10;
        $VALUES = new decodeTextGeometricTransform[]{decodetextgeometrictransform, decodetextgeometrictransform2, decodetextgeometrictransform3, decodetextgeometrictransform4, decodetextgeometrictransform5, decodetextgeometrictransform6, decodetextgeometrictransform7, decodetextgeometrictransform8, decodetextgeometrictransform9, decodetextgeometrictransform10};
    }
}
