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
/* JADX INFO: loaded from: classes.dex */
public class getHeight {
    private static final /* synthetic */ getHeight[] $VALUES;
    public static final getHeight BOOL;
    public static final getHeight BYTES;
    public static final getHeight DOUBLE;
    public static final getHeight ENUM;
    public static final getHeight FIXED32;
    public static final getHeight FIXED64;
    public static final getHeight FLOAT;
    public static final getHeight GROUP;
    public static final getHeight INT32;
    public static final getHeight INT64;
    public static final getHeight MESSAGE;
    public static final getHeight SFIXED32;
    public static final getHeight SFIXED64;
    public static final getHeight SINT32;
    public static final getHeight SINT64;
    public static final getHeight STRING;
    public static final getHeight UINT32;
    public static final getHeight UINT64;
    private final getCenterLeftF1C5BW0 javaType;
    private final int wireType;

    public getCenterLeftF1C5BW0 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    static {
        getHeight getheight = new getHeight("DOUBLE", 0, getCenterLeftF1C5BW0.DOUBLE, 1);
        DOUBLE = getheight;
        getHeight getheight2 = new getHeight("FLOAT", 1, getCenterLeftF1C5BW0.FLOAT, 5);
        FLOAT = getheight2;
        getCenterLeftF1C5BW0 getcenterleftf1c5bw0 = getCenterLeftF1C5BW0.LONG;
        getHeight getheight3 = new getHeight("INT64", 2, getcenterleftf1c5bw0, 0);
        INT64 = getheight3;
        getHeight getheight4 = new getHeight("UINT64", 3, getcenterleftf1c5bw0, 0);
        UINT64 = getheight4;
        getCenterLeftF1C5BW0 getcenterleftf1c5bw1 = getCenterLeftF1C5BW0.INT;
        getHeight getheight5 = new getHeight("INT32", 4, getcenterleftf1c5bw1, 0);
        INT32 = getheight5;
        getHeight getheight6 = new getHeight("FIXED64", 5, getcenterleftf1c5bw0, 1);
        FIXED64 = getheight6;
        getHeight getheight7 = new getHeight("FIXED32", 6, getcenterleftf1c5bw1, 5);
        FIXED32 = getheight7;
        getHeight getheight8 = new getHeight("BOOL", 7, getCenterLeftF1C5BW0.BOOLEAN, 0);
        BOOL = getheight8;
        getHeight getheight9 = new getHeight("STRING", 8, getCenterLeftF1C5BW0.STRING, 2) { // from class: o.getHeight.4
            @Override // o.getHeight
            public boolean isPackable() {
                return false;
            }
        };
        STRING = getheight9;
        getCenterLeftF1C5BW0 getcenterleftf1c5bw2 = getCenterLeftF1C5BW0.MESSAGE;
        getHeight getheight10 = new getHeight("GROUP", 9, getcenterleftf1c5bw2, 3) { // from class: o.getHeight.5
            @Override // o.getHeight
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = getheight10;
        int i = 2;
        getHeight getheight11 = new getHeight("MESSAGE", 10, getcenterleftf1c5bw2, i) { // from class: o.getHeight.1
            @Override // o.getHeight
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = getheight11;
        getHeight getheight12 = new getHeight("BYTES", 11, getCenterLeftF1C5BW0.BYTE_STRING, i) { // from class: o.getHeight.3
            @Override // o.getHeight
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = getheight12;
        getHeight getheight13 = new getHeight("UINT32", 12, getcenterleftf1c5bw1, 0);
        UINT32 = getheight13;
        getHeight getheight14 = new getHeight("ENUM", 13, getCenterLeftF1C5BW0.ENUM, 0);
        ENUM = getheight14;
        getHeight getheight15 = new getHeight("SFIXED32", 14, getcenterleftf1c5bw1, 5);
        SFIXED32 = getheight15;
        getHeight getheight16 = new getHeight("SFIXED64", 15, getcenterleftf1c5bw0, 1);
        SFIXED64 = getheight16;
        getHeight getheight17 = new getHeight("SINT32", 16, getcenterleftf1c5bw1, 0);
        SINT32 = getheight17;
        getHeight getheight18 = new getHeight("SINT64", 17, getcenterleftf1c5bw0, 0);
        SINT64 = getheight18;
        $VALUES = new getHeight[]{getheight, getheight2, getheight3, getheight4, getheight5, getheight6, getheight7, getheight8, getheight9, getheight10, getheight11, getheight12, getheight13, getheight14, getheight15, getheight16, getheight17, getheight18};
    }

    public static getHeight valueOf(String str) {
        return (getHeight) Enum.valueOf(getHeight.class, str);
    }

    public static getHeight[] values() {
        return (getHeight[]) $VALUES.clone();
    }

    private getHeight(String str, int i, getCenterLeftF1C5BW0 getcenterleftf1c5bw0, int i2) {
        super(str, i);
        this.javaType = getcenterleftf1c5bw0;
        this.wireType = i2;
    }
}
