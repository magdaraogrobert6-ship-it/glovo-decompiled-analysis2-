package androidx.compose.ui.text.input;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class KeyboardType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m3299constructorimpl(0);
    private static final int Text = m3299constructorimpl(1);
    private static final int Ascii = m3299constructorimpl(2);
    private static final int Number = m3299constructorimpl(3);
    private static final int Phone = m3299constructorimpl(4);
    private static final int Uri = m3299constructorimpl(5);
    private static final int Email = m3299constructorimpl(6);
    private static final int Password = m3299constructorimpl(7);
    private static final int NumberPassword = m3299constructorimpl(8);
    private static final int Decimal = m3299constructorimpl(9);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m3299constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3301equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3302hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3304unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m3298boximpl(int i) {
        return new KeyboardType(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3303toStringimpl(int i) {
        if (m3301equalsimpl0(i, Unspecified)) {
            return "Unspecified";
        }
        if (m3301equalsimpl0(i, Text)) {
            return "Text";
        }
        if (m3301equalsimpl0(i, Ascii)) {
            return "Ascii";
        }
        if (m3301equalsimpl0(i, Number)) {
            return "Number";
        }
        if (m3301equalsimpl0(i, Phone)) {
            return "Phone";
        }
        if (m3301equalsimpl0(i, Uri)) {
            return "Uri";
        }
        if (m3301equalsimpl0(i, Email)) {
            return "Email";
        }
        if (m3301equalsimpl0(i, Password)) {
            return "Password";
        }
        if (m3301equalsimpl0(i, NumberPassword)) {
            return "NumberPassword";
        }
        return m3301equalsimpl0(i, Decimal) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3300equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3302hashCodeimpl(this.value);
    }

    public String toString() {
        return m3303toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3305getAsciiPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3306getDecimalPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3307getEmailPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3308getNumberPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3309getNumberPasswordPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3310getPasswordPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3311getPhonePjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3312getTextPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3313getUnspecifiedPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3314getUriPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m3315getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* JADX INFO: renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m3316getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* JADX INFO: renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m3317getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* JADX INFO: renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m3318getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* JADX INFO: renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m3319getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* JADX INFO: renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m3320getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* JADX INFO: renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m3321getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* JADX INFO: renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m3322getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* JADX INFO: renamed from: getUnspecified-PjHm6EE, reason: not valid java name */
        public final int m3323getUnspecifiedPjHm6EE() {
            return KeyboardType.Unspecified;
        }

        /* JADX INFO: renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m3324getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyboardType(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3300equalsimpl(int i, Object obj) {
        return (obj instanceof KeyboardType) && i == ((KeyboardType) obj).m3304unboximpl();
    }
}
