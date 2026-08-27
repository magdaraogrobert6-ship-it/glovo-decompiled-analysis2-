package androidx.compose.ui.unit;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class TextUnitType {
    private final long type;
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m3893constructorimpl(0);
    private static final long Sp = m3893constructorimpl(4294967296L);
    private static final long Em = m3893constructorimpl(8589934592L);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3893constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3895equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3896hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3898unboximpl() {
        return this.type;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnitType m3892boximpl(long j) {
        return new TextUnitType(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3897toStringimpl(long j) {
        if (m3895equalsimpl0(j, Unspecified)) {
            return "Unspecified";
        }
        if (m3895equalsimpl0(j, Sp)) {
            return "Sp";
        }
        return m3895equalsimpl0(j, Em) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3894equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m3896hashCodeimpl(this.type);
    }

    public String toString() {
        return m3897toStringimpl(this.type);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m3899getEmUIouoOA() {
            return TextUnitType.Em;
        }

        /* JADX INFO: renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m3900getSpUIouoOA() {
            return TextUnitType.Sp;
        }

        /* JADX INFO: renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m3901getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextUnitType(long j) {
        this.type = j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3894equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnitType) && j == ((TextUnitType) obj).m3898unboximpl();
    }
}
