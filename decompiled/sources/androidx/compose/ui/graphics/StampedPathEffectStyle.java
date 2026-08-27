package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes4.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class StampedPathEffectStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Translate = m1083constructorimpl(0);
    private static final int Rotate = m1083constructorimpl(1);
    private static final int Morph = m1083constructorimpl(2);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1083constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1085equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1086hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1088unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StampedPathEffectStyle m1082boximpl(int i) {
        return new StampedPathEffectStyle(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1087toStringimpl(int i) {
        if (m1085equalsimpl0(i, Translate)) {
            return "Translate";
        }
        if (m1085equalsimpl0(i, Rotate)) {
            return "Rotate";
        }
        return m1085equalsimpl0(i, Morph) ? "Morph" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1084equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1086hashCodeimpl(this.value);
    }

    public String toString() {
        return m1087toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getMorph-Ypspkwk, reason: not valid java name */
        public final int m1089getMorphYpspkwk() {
            return StampedPathEffectStyle.Morph;
        }

        /* JADX INFO: renamed from: getRotate-Ypspkwk, reason: not valid java name */
        public final int m1090getRotateYpspkwk() {
            return StampedPathEffectStyle.Rotate;
        }

        /* JADX INFO: renamed from: getTranslate-Ypspkwk, reason: not valid java name */
        public final int m1091getTranslateYpspkwk() {
            return StampedPathEffectStyle.Translate;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StampedPathEffectStyle(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1084equalsimpl(int i, Object obj) {
        return (obj instanceof StampedPathEffectStyle) && i == ((StampedPathEffectStyle) obj).m1088unboximpl();
    }
}
