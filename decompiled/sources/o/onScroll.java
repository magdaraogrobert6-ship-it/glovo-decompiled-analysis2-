package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public class onScroll {
    private static final /* synthetic */ onScroll[] $VALUES;
    public static final onScroll BOOL;
    public static final onScroll BYTES;
    public static final onScroll DOUBLE;
    public static final onScroll ENUM;
    public static final onScroll FIXED32;
    public static final onScroll FIXED64;
    public static final onScroll FLOAT;
    public static final onScroll GROUP;
    public static final onScroll INT32;
    public static final onScroll INT64;
    public static final onScroll MESSAGE;
    public static final onScroll SFIXED32;
    public static final onScroll SFIXED64;
    public static final onScroll SINT32;
    public static final onScroll SINT64;
    public static final onScroll STRING;
    public static final onScroll UINT32;
    public static final onScroll UINT64;
    private final onDown javaType;
    private final int wireType;

    public onDown getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    static {
        onScroll onscroll = new onScroll("DOUBLE", 0, onDown.DOUBLE, 1);
        DOUBLE = onscroll;
        onScroll onscroll2 = new onScroll("FLOAT", 1, onDown.FLOAT, 5);
        FLOAT = onscroll2;
        onDown ondown = onDown.LONG;
        onScroll onscroll3 = new onScroll("INT64", 2, ondown, 0);
        INT64 = onscroll3;
        onScroll onscroll4 = new onScroll("UINT64", 3, ondown, 0);
        UINT64 = onscroll4;
        onDown ondown2 = onDown.INT;
        onScroll onscroll5 = new onScroll("INT32", 4, ondown2, 0);
        INT32 = onscroll5;
        onScroll onscroll6 = new onScroll("FIXED64", 5, ondown, 1);
        FIXED64 = onscroll6;
        onScroll onscroll7 = new onScroll("FIXED32", 6, ondown2, 5);
        FIXED32 = onscroll7;
        onScroll onscroll8 = new onScroll("BOOL", 7, onDown.BOOLEAN, 0);
        BOOL = onscroll8;
        onScroll onscroll9 = new onScroll("STRING", 8, onDown.STRING, 2) { // from class: o.onScroll.2
            @Override // o.onScroll
            public boolean isPackable() {
                return false;
            }

            {
                IndirectPointerNavigationGestureDetectorgestureDetector1 indirectPointerNavigationGestureDetectorgestureDetector1 = null;
            }
        };
        STRING = onscroll9;
        onDown ondown3 = onDown.MESSAGE;
        onScroll onscroll10 = new onScroll("GROUP", 9, ondown3, 3) { // from class: o.onScroll.5
            @Override // o.onScroll
            public boolean isPackable() {
                return false;
            }

            {
                IndirectPointerNavigationGestureDetectorgestureDetector1 indirectPointerNavigationGestureDetectorgestureDetector1 = null;
            }
        };
        GROUP = onscroll10;
        int i = 2;
        onScroll onscroll11 = new onScroll("MESSAGE", 10, ondown3, i) { // from class: o.onScroll.4
            @Override // o.onScroll
            public boolean isPackable() {
                return false;
            }

            {
                IndirectPointerNavigationGestureDetectorgestureDetector1 indirectPointerNavigationGestureDetectorgestureDetector1 = null;
            }
        };
        MESSAGE = onscroll11;
        onScroll onscroll12 = new onScroll("BYTES", 11, onDown.BYTE_STRING, i) { // from class: o.onScroll.1
            @Override // o.onScroll
            public boolean isPackable() {
                return false;
            }

            {
                IndirectPointerNavigationGestureDetectorgestureDetector1 indirectPointerNavigationGestureDetectorgestureDetector1 = null;
            }
        };
        BYTES = onscroll12;
        onScroll onscroll13 = new onScroll("UINT32", 12, ondown2, 0);
        UINT32 = onscroll13;
        onScroll onscroll14 = new onScroll("ENUM", 13, onDown.ENUM, 0);
        ENUM = onscroll14;
        onScroll onscroll15 = new onScroll("SFIXED32", 14, ondown2, 5);
        SFIXED32 = onscroll15;
        onScroll onscroll16 = new onScroll("SFIXED64", 15, ondown, 1);
        SFIXED64 = onscroll16;
        onScroll onscroll17 = new onScroll("SINT32", 16, ondown2, 0);
        SINT32 = onscroll17;
        onScroll onscroll18 = new onScroll("SINT64", 17, ondown, 0);
        SINT64 = onscroll18;
        $VALUES = new onScroll[]{onscroll, onscroll2, onscroll3, onscroll4, onscroll5, onscroll6, onscroll7, onscroll8, onscroll9, onscroll10, onscroll11, onscroll12, onscroll13, onscroll14, onscroll15, onscroll16, onscroll17, onscroll18};
    }

    public static onScroll valueOf(String str) {
        return (onScroll) Enum.valueOf(onScroll.class, str);
    }

    public static onScroll[] values() {
        return (onScroll[]) $VALUES.clone();
    }

    private onScroll(String str, int i, onDown ondown, int i2) {
        super(str, i);
        this.javaType = ondown;
        this.wireType = i2;
    }

    public /* synthetic */ onScroll(String str, int i, onDown ondown, int i2, IndirectPointerNavigationGestureDetectorgestureDetector1 indirectPointerNavigationGestureDetectorgestureDetector1) {
        this(str, i, ondown, i2);
    }
}
