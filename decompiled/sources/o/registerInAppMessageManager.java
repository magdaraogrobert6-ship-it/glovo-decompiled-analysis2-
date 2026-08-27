package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IGNORE_CASE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class registerInAppMessageManager {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ registerInAppMessageManager[] $VALUES;
    public static final registerInAppMessageManager CANON_EQ;
    public static final registerInAppMessageManager COMMENTS;
    public static final registerInAppMessageManager DOT_MATCHES_ALL;
    public static final registerInAppMessageManager IGNORE_CASE;
    public static final registerInAppMessageManager LITERAL;
    public static final registerInAppMessageManager MULTILINE;
    public static final registerInAppMessageManager UNIX_LINES;
    private final int mask;
    private final int value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    private static final /* synthetic */ registerInAppMessageManager[] $values() {
        return new registerInAppMessageManager[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    public static registerInAppMessageManager valueOf(String str) {
        return (registerInAppMessageManager) Enum.valueOf(registerInAppMessageManager.class, str);
    }

    public static registerInAppMessageManager[] values() {
        return (registerInAppMessageManager[]) $VALUES.clone();
    }

    public /* synthetic */ registerInAppMessageManager(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }

    static {
        int i = 2;
        IGNORE_CASE = new registerInAppMessageManager("IGNORE_CASE", 0, i, 0, 2, null);
        int i2 = 0;
        int i3 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        MULTILINE = new registerInAppMessageManager("MULTILINE", 1, 8, i2, i3, defaultConstructorMarker);
        int i4 = 0;
        int i5 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        LITERAL = new registerInAppMessageManager("LITERAL", i, 16, i4, i5, defaultConstructorMarker2);
        UNIX_LINES = new registerInAppMessageManager("UNIX_LINES", 3, 1, i2, i3, defaultConstructorMarker);
        COMMENTS = new registerInAppMessageManager("COMMENTS", 4, 4, i4, i5, defaultConstructorMarker2);
        DOT_MATCHES_ALL = new registerInAppMessageManager("DOT_MATCHES_ALL", 5, 32, i2, i3, defaultConstructorMarker);
        CANON_EQ = new registerInAppMessageManager("CANON_EQ", 6, androidx.compose.ui.graphics.Fields.SpotShadowColor, i4, i5, defaultConstructorMarker2);
        registerInAppMessageManager[] registerinappmessagemanagerArr$values = $values();
        $VALUES = registerinappmessagemanagerArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) registerinappmessagemanagerArr$values);
    }

    private registerInAppMessageManager(String str, int i, int i2, int i3) {
        super(str, i);
        this.value = i2;
        this.mask = i3;
    }
}
