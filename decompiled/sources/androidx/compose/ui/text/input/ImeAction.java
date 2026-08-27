package androidx.compose.ui.text.input;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class ImeAction {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m3246constructorimpl(-1);
    private static final int Default = m3246constructorimpl(1);
    private static final int None = m3246constructorimpl(0);
    private static final int Go = m3246constructorimpl(2);
    private static final int Search = m3246constructorimpl(3);
    private static final int Send = m3246constructorimpl(4);
    private static final int Previous = m3246constructorimpl(5);
    private static final int Next = m3246constructorimpl(6);
    private static final int Done = m3246constructorimpl(7);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m3246constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3248equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3249hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3251unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m3245boximpl(int i) {
        return new ImeAction(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3250toStringimpl(int i) {
        if (m3248equalsimpl0(i, Unspecified)) {
            return "Unspecified";
        }
        if (m3248equalsimpl0(i, None)) {
            return "None";
        }
        if (m3248equalsimpl0(i, Default)) {
            return "Default";
        }
        if (m3248equalsimpl0(i, Go)) {
            return "Go";
        }
        if (m3248equalsimpl0(i, Search)) {
            return "Search";
        }
        if (m3248equalsimpl0(i, Send)) {
            return "Send";
        }
        if (m3248equalsimpl0(i, Previous)) {
            return "Previous";
        }
        if (m3248equalsimpl0(i, Next)) {
            return "Next";
        }
        return m3248equalsimpl0(i, Done) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3247equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3249hashCodeimpl(this.value);
    }

    public String toString() {
        return m3250toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m3252getDefaulteUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m3253getDoneeUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m3254getGoeUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m3255getNexteUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m3256getNoneeUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m3257getPreviouseUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m3258getSearcheUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m3259getSendeUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m3260getUnspecifiedeUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m3261getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* JADX INFO: renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m3262getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* JADX INFO: renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m3263getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* JADX INFO: renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m3264getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* JADX INFO: renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m3265getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* JADX INFO: renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m3266getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* JADX INFO: renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m3267getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* JADX INFO: renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m3268getSendeUduSuo() {
            return ImeAction.Send;
        }

        /* JADX INFO: renamed from: getUnspecified-eUduSuo, reason: not valid java name */
        public final int m3269getUnspecifiedeUduSuo() {
            return ImeAction.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ImeAction(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3247equalsimpl(int i, Object obj) {
        return (obj instanceof ImeAction) && i == ((ImeAction) obj).m3251unboximpl();
    }
}
