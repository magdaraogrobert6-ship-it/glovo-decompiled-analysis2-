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
public final class LayoutNodeWhenMappings {
    private static final /* synthetic */ LayoutNodeWhenMappings[] $VALUES;
    public static final LayoutNodeWhenMappings BOOLEAN;
    public static final LayoutNodeWhenMappings BYTE_STRING;
    public static final LayoutNodeWhenMappings DOUBLE;
    public static final LayoutNodeWhenMappings ENUM;
    public static final LayoutNodeWhenMappings FLOAT;
    public static final LayoutNodeWhenMappings INT;
    public static final LayoutNodeWhenMappings LONG;
    public static final LayoutNodeWhenMappings MESSAGE;
    public static final LayoutNodeWhenMappings STRING;
    public static final LayoutNodeWhenMappings VOID;
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

    public static LayoutNodeWhenMappings valueOf(String str) {
        return (LayoutNodeWhenMappings) Enum.valueOf(LayoutNodeWhenMappings.class, str);
    }

    public static LayoutNodeWhenMappings[] values() {
        return (LayoutNodeWhenMappings[]) $VALUES.clone();
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }

    private LayoutNodeWhenMappings(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    static {
        LayoutNodeWhenMappings layoutNodeWhenMappings = new LayoutNodeWhenMappings("VOID", 0, Void.class, Void.class, null);
        VOID = layoutNodeWhenMappings;
        Class cls = Integer.TYPE;
        LayoutNodeWhenMappings layoutNodeWhenMappings2 = new LayoutNodeWhenMappings("INT", 1, cls, Integer.class, 0);
        INT = layoutNodeWhenMappings2;
        LayoutNodeWhenMappings layoutNodeWhenMappings3 = new LayoutNodeWhenMappings("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = layoutNodeWhenMappings3;
        LayoutNodeWhenMappings layoutNodeWhenMappings4 = new LayoutNodeWhenMappings("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = layoutNodeWhenMappings4;
        LayoutNodeWhenMappings layoutNodeWhenMappings5 = new LayoutNodeWhenMappings("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = layoutNodeWhenMappings5;
        LayoutNodeWhenMappings layoutNodeWhenMappings6 = new LayoutNodeWhenMappings("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = layoutNodeWhenMappings6;
        LayoutNodeWhenMappings layoutNodeWhenMappings7 = new LayoutNodeWhenMappings("STRING", 6, String.class, String.class, "");
        STRING = layoutNodeWhenMappings7;
        LayoutNodeWhenMappings layoutNodeWhenMappings8 = new LayoutNodeWhenMappings("BYTE_STRING", 7, setOnAttachui.class, setOnAttachui.class, setOnAttachui.IconCompatParcelizer);
        BYTE_STRING = layoutNodeWhenMappings8;
        LayoutNodeWhenMappings layoutNodeWhenMappings9 = new LayoutNodeWhenMappings("ENUM", 8, cls, Integer.class, null);
        ENUM = layoutNodeWhenMappings9;
        LayoutNodeWhenMappings layoutNodeWhenMappings10 = new LayoutNodeWhenMappings("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = layoutNodeWhenMappings10;
        $VALUES = new LayoutNodeWhenMappings[]{layoutNodeWhenMappings, layoutNodeWhenMappings2, layoutNodeWhenMappings3, layoutNodeWhenMappings4, layoutNodeWhenMappings5, layoutNodeWhenMappings6, layoutNodeWhenMappings7, layoutNodeWhenMappings8, layoutNodeWhenMappings9, layoutNodeWhenMappings10};
    }
}
