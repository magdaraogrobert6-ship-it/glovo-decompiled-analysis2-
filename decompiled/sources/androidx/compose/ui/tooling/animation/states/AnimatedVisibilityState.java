package androidx.compose.ui.tooling.animation.states;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class AnimatedVisibilityState implements ComposeAnimationState {
    public static final Companion Companion = new Companion(null);
    private static final String Enter = m3604constructorimpl("Enter");
    private static final String Exit = m3604constructorimpl("Exit");
    private final String value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static String m3604constructorimpl(String str) {
        return str;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3606equalsimpl0(String str, String str2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, str2}, iWrite3)).booleanValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3607hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3608toStringimpl(String str) {
        return str;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3609unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AnimatedVisibilityState m3603boximpl(String str) {
        return new AnimatedVisibilityState(str);
    }

    public boolean equals(Object obj) {
        return m3605equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3607hashCodeimpl(this.value);
    }

    public String toString() {
        return m3608toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getEnter-jXw82LU, reason: not valid java name */
        public final String m3610getEnterjXw82LU() {
            return AnimatedVisibilityState.Enter;
        }

        /* JADX INFO: renamed from: getExit-jXw82LU, reason: not valid java name */
        public final String m3611getExitjXw82LU() {
            return AnimatedVisibilityState.Exit;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AnimatedVisibilityState(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3605equalsimpl(String str, Object obj) {
        if (!(obj instanceof AnimatedVisibilityState)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ((AnimatedVisibilityState) obj).m3609unboximpl()}, getCieXyz.write())).booleanValue();
    }
}
