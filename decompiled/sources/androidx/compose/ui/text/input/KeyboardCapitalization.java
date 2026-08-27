package androidx.compose.ui.text.input;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class KeyboardCapitalization {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m3282constructorimpl(-1);
    private static final int None = m3282constructorimpl(0);
    private static final int Characters = m3282constructorimpl(1);
    private static final int Words = m3282constructorimpl(2);
    private static final int Sentences = m3282constructorimpl(3);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m3282constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3284equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3285hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3287unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m3281boximpl(int i) {
        return new KeyboardCapitalization(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3286toStringimpl(int i) {
        if (m3284equalsimpl0(i, Unspecified)) {
            return "Unspecified";
        }
        if (m3284equalsimpl0(i, None)) {
            return "None";
        }
        if (m3284equalsimpl0(i, Characters)) {
            return "Characters";
        }
        if (m3284equalsimpl0(i, Words)) {
            return "Words";
        }
        return m3284equalsimpl0(i, Sentences) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3283equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3285hashCodeimpl(this.value);
    }

    public String toString() {
        return m3286toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3288getCharactersIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3289getNoneIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3290getSentencesIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3291getUnspecifiedIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3292getWordsIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m3293getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* JADX INFO: renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m3294getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* JADX INFO: renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m3295getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }

        /* JADX INFO: renamed from: getUnspecified-IUNYP9k, reason: not valid java name */
        public final int m3296getUnspecifiedIUNYP9k() {
            return KeyboardCapitalization.Unspecified;
        }

        /* JADX INFO: renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m3297getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyboardCapitalization(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3283equalsimpl(int i, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i == ((KeyboardCapitalization) obj).m3287unboximpl();
    }
}
