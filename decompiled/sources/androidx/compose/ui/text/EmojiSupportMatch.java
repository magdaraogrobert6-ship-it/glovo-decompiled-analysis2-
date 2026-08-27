package androidx.compose.ui.text;

import bo.app.m1$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class EmojiSupportMatch {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Default = m2897constructorimpl(0);
    private static final int None = m2897constructorimpl(1);
    private static final int All = m2897constructorimpl(2);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2897constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2899equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2900hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2902unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m2896boximpl(int i) {
        return new EmojiSupportMatch(i);
    }

    public boolean equals(Object obj) {
        return m2898equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2900hashCodeimpl(this.value);
    }

    public String toString() {
        return m2901toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAll-_3YsG6Y, reason: not valid java name */
        public final int m2903getAll_3YsG6Y() {
            return EmojiSupportMatch.All;
        }

        /* JADX INFO: renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m2904getDefault_3YsG6Y() {
            return EmojiSupportMatch.Default;
        }

        /* JADX INFO: renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m2905getNone_3YsG6Y() {
            return EmojiSupportMatch.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ EmojiSupportMatch(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2898equalsimpl(int i, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i == ((EmojiSupportMatch) obj).m2902unboximpl();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2901toStringimpl(int i) {
        if (i == Default) {
            return "EmojiSupportMatch.Default";
        }
        if (i == None) {
            return "EmojiSupportMatch.None";
        }
        return i == All ? "EmojiSupportMatch.All" : m1$$ExternalSyntheticOutline0.m("Invalid(value=", i, ')');
    }
}
