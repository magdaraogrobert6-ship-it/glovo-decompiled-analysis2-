package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class Hyphens {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m3397constructorimpl(1);
    private static final int Auto = m3397constructorimpl(2);
    private static final int Unspecified = m3397constructorimpl(0);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3397constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3399equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3400hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3402unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m3396boximpl(int i) {
        return new Hyphens(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3401toStringimpl(int i) {
        if (m3399equalsimpl0(i, None)) {
            return "Hyphens.None";
        }
        if (m3399equalsimpl0(i, Auto)) {
            return "Hyphens.Auto";
        }
        return m3399equalsimpl0(i, Unspecified) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3398equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3400hashCodeimpl(this.value);
    }

    public String toString() {
        return m3401toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m3403getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* JADX INFO: renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m3404getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* JADX INFO: renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m3405getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: valueOf-kPa1_AA, reason: not valid java name */
        public final int m3406valueOfkPa1_AA(int i) {
            if (i < 0 || i >= 3) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by Hyphens.");
            }
            return Hyphens.m3397constructorimpl(i);
        }
    }

    private /* synthetic */ Hyphens(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3398equalsimpl(int i, Object obj) {
        return (obj instanceof Hyphens) && i == ((Hyphens) obj).m3402unboximpl();
    }
}
