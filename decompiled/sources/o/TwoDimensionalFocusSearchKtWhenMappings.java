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
/* JADX INFO: loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKtWhenMappings {
    private static final /* synthetic */ TwoDimensionalFocusSearchKtWhenMappings[] $VALUES;
    public static final TwoDimensionalFocusSearchKtWhenMappings BOOLEAN;
    public static final TwoDimensionalFocusSearchKtWhenMappings BYTE_STRING;
    public static final TwoDimensionalFocusSearchKtWhenMappings DOUBLE;
    public static final TwoDimensionalFocusSearchKtWhenMappings ENUM;
    public static final TwoDimensionalFocusSearchKtWhenMappings FLOAT;
    public static final TwoDimensionalFocusSearchKtWhenMappings INT;
    public static final TwoDimensionalFocusSearchKtWhenMappings LONG;
    public static final TwoDimensionalFocusSearchKtWhenMappings MESSAGE;
    public static final TwoDimensionalFocusSearchKtWhenMappings STRING;
    public static final TwoDimensionalFocusSearchKtWhenMappings VOID;
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

    public static TwoDimensionalFocusSearchKtWhenMappings valueOf(String str) {
        return (TwoDimensionalFocusSearchKtWhenMappings) Enum.valueOf(TwoDimensionalFocusSearchKtWhenMappings.class, str);
    }

    public static TwoDimensionalFocusSearchKtWhenMappings[] values() {
        return (TwoDimensionalFocusSearchKtWhenMappings[]) $VALUES.clone();
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }

    private TwoDimensionalFocusSearchKtWhenMappings(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    static {
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings = new TwoDimensionalFocusSearchKtWhenMappings("VOID", 0, Void.class, Void.class, null);
        VOID = twoDimensionalFocusSearchKtWhenMappings;
        Class cls = Integer.TYPE;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings2 = new TwoDimensionalFocusSearchKtWhenMappings("INT", 1, cls, Integer.class, 0);
        INT = twoDimensionalFocusSearchKtWhenMappings2;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings3 = new TwoDimensionalFocusSearchKtWhenMappings("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = twoDimensionalFocusSearchKtWhenMappings3;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings4 = new TwoDimensionalFocusSearchKtWhenMappings("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = twoDimensionalFocusSearchKtWhenMappings4;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings5 = new TwoDimensionalFocusSearchKtWhenMappings("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = twoDimensionalFocusSearchKtWhenMappings5;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings6 = new TwoDimensionalFocusSearchKtWhenMappings("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = twoDimensionalFocusSearchKtWhenMappings6;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings7 = new TwoDimensionalFocusSearchKtWhenMappings("STRING", 6, String.class, String.class, "");
        STRING = twoDimensionalFocusSearchKtWhenMappings7;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings8 = new TwoDimensionalFocusSearchKtWhenMappings("BYTE_STRING", 7, moveFocusInChildren3ESFkO8.class, moveFocusInChildren3ESFkO8.class, moveFocusInChildren3ESFkO8.IconCompatParcelizer);
        BYTE_STRING = twoDimensionalFocusSearchKtWhenMappings8;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings9 = new TwoDimensionalFocusSearchKtWhenMappings("ENUM", 8, cls, Integer.class, null);
        ENUM = twoDimensionalFocusSearchKtWhenMappings9;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings10 = new TwoDimensionalFocusSearchKtWhenMappings("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = twoDimensionalFocusSearchKtWhenMappings10;
        $VALUES = new TwoDimensionalFocusSearchKtWhenMappings[]{twoDimensionalFocusSearchKtWhenMappings, twoDimensionalFocusSearchKtWhenMappings2, twoDimensionalFocusSearchKtWhenMappings3, twoDimensionalFocusSearchKtWhenMappings4, twoDimensionalFocusSearchKtWhenMappings5, twoDimensionalFocusSearchKtWhenMappings6, twoDimensionalFocusSearchKtWhenMappings7, twoDimensionalFocusSearchKtWhenMappings8, twoDimensionalFocusSearchKtWhenMappings9, twoDimensionalFocusSearchKtWhenMappings10};
    }
}
