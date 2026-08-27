package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class TextRange {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3065constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3069equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m3071getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m3076getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3077hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3080unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m3064boximpl(long j) {
        return new TextRange(j);
    }

    public boolean equals(Object obj) {
        return m3068equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3077hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3079toStringimpl(this.packedValue);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m3081getZerod9O1mEE() {
            return TextRange.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m3066contains5zctL8(long j, long j2) {
        return (m3074getMinimpl(j) <= m3074getMinimpl(j2)) & (m3073getMaximpl(j2) <= m3073getMaximpl(j));
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3067containsimpl(long j, int i) {
        return i < m3073getMaximpl(j) && m3074getMinimpl(j) <= i;
    }

    /* JADX INFO: renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m3070getCollapsedimpl(long j) {
        return m3076getStartimpl(j) == m3071getEndimpl(j);
    }

    /* JADX INFO: renamed from: getLength-impl, reason: not valid java name */
    public static final int m3072getLengthimpl(long j) {
        return m3073getMaximpl(j) - m3074getMinimpl(j);
    }

    /* JADX INFO: renamed from: getMax-impl, reason: not valid java name */
    public static final int m3073getMaximpl(long j) {
        return Math.max(m3076getStartimpl(j), m3071getEndimpl(j));
    }

    /* JADX INFO: renamed from: getMin-impl, reason: not valid java name */
    public static final int m3074getMinimpl(long j) {
        return Math.min(m3076getStartimpl(j), m3071getEndimpl(j));
    }

    /* JADX INFO: renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m3075getReversedimpl(long j) {
        return m3076getStartimpl(j) > m3071getEndimpl(j);
    }

    /* JADX INFO: renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m3078intersects5zctL8(long j, long j2) {
        return (m3074getMinimpl(j) < m3073getMaximpl(j2)) & (m3074getMinimpl(j2) < m3073getMaximpl(j));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3079toStringimpl(long j) {
        return "TextRange(" + m3076getStartimpl(j) + ", " + m3071getEndimpl(j) + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3068equalsimpl(long j, Object obj) {
        return (obj instanceof TextRange) && j == ((TextRange) obj).m3080unboximpl();
    }
}
