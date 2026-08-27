package androidx.compose.ui.text.style;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class LineBreak {
    public static final Companion Companion = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;
    private final int mask;

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m3431constructorimpl(1);
        private static final int HighQuality = m3431constructorimpl(2);
        private static final int Balanced = m3431constructorimpl(3);
        private static final int Unspecified = m3431constructorimpl(0);

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m3431constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3433equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3434hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3436unboximpl() {
            return this.value;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m3430boximpl(int i) {
            return new Strategy(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3435toStringimpl(int i) {
            if (m3433equalsimpl0(i, Simple)) {
                return "Strategy.Simple";
            }
            if (m3433equalsimpl0(i, HighQuality)) {
                return "Strategy.HighQuality";
            }
            if (m3433equalsimpl0(i, Balanced)) {
                return "Strategy.Balanced";
            }
            return m3433equalsimpl0(i, Unspecified) ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m3432equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3434hashCodeimpl(this.value);
        }

        public String toString() {
            return m3435toStringimpl(this.value);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m3437getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* JADX INFO: renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m3438getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* JADX INFO: renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m3439getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* JADX INFO: renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m3440getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Strategy(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3432equalsimpl(int i, Object obj) {
            return (obj instanceof Strategy) && i == ((Strategy) obj).m3436unboximpl();
        }
    }

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m3442constructorimpl(1);
        private static final int Loose = m3442constructorimpl(2);
        private static final int Normal = m3442constructorimpl(3);
        private static final int Strict = m3442constructorimpl(4);
        private static final int Unspecified = m3442constructorimpl(0);
        private final int value;

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m3442constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3444equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3445hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3447unboximpl() {
            return this.value;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m3441boximpl(int i) {
            return new Strictness(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3446toStringimpl(int i) {
            if (m3444equalsimpl0(i, Default)) {
                return "Strictness.None";
            }
            if (m3444equalsimpl0(i, Loose)) {
                return "Strictness.Loose";
            }
            if (m3444equalsimpl0(i, Normal)) {
                return "Strictness.Normal";
            }
            if (m3444equalsimpl0(i, Strict)) {
                return "Strictness.Strict";
            }
            return m3444equalsimpl0(i, Unspecified) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m3443equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3445hashCodeimpl(this.value);
        }

        public String toString() {
            return m3446toStringimpl(this.value);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m3448getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* JADX INFO: renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m3449getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* JADX INFO: renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m3450getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* JADX INFO: renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m3451getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* JADX INFO: renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m3452getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Strictness(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3443equalsimpl(int i, Object obj) {
            return (obj instanceof Strictness) && i == ((Strictness) obj).m3447unboximpl();
        }
    }

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m3454constructorimpl(1);
        private static final int Phrase = m3454constructorimpl(2);
        private static final int Unspecified = m3454constructorimpl(0);
        private final int value;

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m3454constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3456equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3457hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3459unboximpl() {
            return this.value;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m3453boximpl(int i) {
            return new WordBreak(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3458toStringimpl(int i) {
            if (m3456equalsimpl0(i, Default)) {
                return "WordBreak.None";
            }
            if (m3456equalsimpl0(i, Phrase)) {
                return "WordBreak.Phrase";
            }
            return m3456equalsimpl0(i, Unspecified) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m3455equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3457hashCodeimpl(this.value);
        }

        public String toString() {
            return m3458toStringimpl(this.value);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m3460getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* JADX INFO: renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m3461getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* JADX INFO: renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m3462getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ WordBreak(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3455equalsimpl(int i, Object obj) {
            return (obj instanceof WordBreak) && i == ((WordBreak) obj).m3459unboximpl();
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3410constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m3412copygijOMQM(int i, int i2, int i3, int i4) {
        return m3411constructorimpl(i2, i3, i4);
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3415equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3419hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3421unboximpl() {
        return this.mask;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m3409boximpl(int i) {
        return new LineBreak(i);
    }

    public boolean equals(Object obj) {
        return m3414equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m3419hashCodeimpl(this.mask);
    }

    public String toString() {
        return m3420toStringimpl(this.mask);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3422getHeadingrAG3T2k$annotations() {
        }

        /* JADX INFO: renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3423getParagraphrAG3T2k$annotations() {
        }

        /* JADX INFO: renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3424getSimplerAG3T2k$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3425getUnspecifiedrAG3T2k$annotations() {
        }

        /* JADX INFO: renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m3426getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* JADX INFO: renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m3427getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* JADX INFO: renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m3428getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* JADX INFO: renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m3429getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }

        private Companion() {
        }
    }

    static {
        Strategy.Companion companion = Strategy.Companion;
        int iM3439getSimplefcGXIks = companion.m3439getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int iM3450getNormalusljTpc = companion2.m3450getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        Simple = m3410constructorimpl(LineBreak_androidKt.packBytes(iM3439getSimplefcGXIks, iM3450getNormalusljTpc, companion3.m3460getDefaultjp8hJ3c()));
        Heading = m3410constructorimpl(LineBreak_androidKt.packBytes(companion.m3437getBalancedfcGXIks(), companion2.m3449getLooseusljTpc(), companion3.m3461getPhrasejp8hJ3c()));
        Paragraph = m3410constructorimpl(LineBreak_androidKt.packBytes(companion.m3438getHighQualityfcGXIks(), companion2.m3451getStrictusljTpc(), companion3.m3460getDefaultjp8hJ3c()));
        Unspecified = m3410constructorimpl(0);
    }

    private /* synthetic */ LineBreak(int i) {
        this.mask = i;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3411constructorimpl(int i, int i2, int i3) {
        return m3410constructorimpl(LineBreak_androidKt.packBytes(i, i2, i3));
    }

    /* JADX INFO: renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m3413copygijOMQM$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = m3416getStrategyfcGXIks(i);
        }
        if ((i5 & 2) != 0) {
            i3 = m3417getStrictnessusljTpc(i);
        }
        if ((i5 & 4) != 0) {
            i4 = m3418getWordBreakjp8hJ3c(i);
        }
        return m3412copygijOMQM(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m3416getStrategyfcGXIks(int i) {
        return Strategy.m3431constructorimpl(LineBreak_androidKt.unpackByte1(i));
    }

    /* JADX INFO: renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m3417getStrictnessusljTpc(int i) {
        return Strictness.m3442constructorimpl(LineBreak_androidKt.unpackByte2(i));
    }

    /* JADX INFO: renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m3418getWordBreakjp8hJ3c(int i) {
        return WordBreak.m3454constructorimpl(LineBreak_androidKt.unpackByte3(i));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3420toStringimpl(int i) {
        return "LineBreak(strategy=" + ((Object) Strategy.m3435toStringimpl(m3416getStrategyfcGXIks(i))) + ", strictness=" + ((Object) Strictness.m3446toStringimpl(m3417getStrictnessusljTpc(i))) + ", wordBreak=" + ((Object) WordBreak.m3458toStringimpl(m3418getWordBreakjp8hJ3c(i))) + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3414equalsimpl(int i, Object obj) {
        return (obj instanceof LineBreak) && i == ((LineBreak) obj).m3421unboximpl();
    }
}
