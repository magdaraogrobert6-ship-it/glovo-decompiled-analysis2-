package androidx.compose.ui.layout;

import bo.app.m1$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
final class SLOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int CancelPausedPrecomposition = m2297constructorimpl(0);
    private static final int ReuseForceSyncDeactivation = m2297constructorimpl(1);
    private static final int ReuseScheduleOutOfFrameDeactivation = m2297constructorimpl(2);
    private static final int ReuseSyncDeactivation = m2297constructorimpl(3);
    private static final int ReuseDeactivationViaHost = m2297constructorimpl(4);
    private static final int TookFromPrecomposeMap = m2297constructorimpl(5);
    private static final int Subcompose = m2297constructorimpl(6);
    private static final int SubcomposeNew = m2297constructorimpl(7);
    private static final int SubcomposePausable = m2297constructorimpl(8);
    private static final int SubcomposeForceReuse = m2297constructorimpl(9);
    private static final int DeactivateOutOfFrame = m2297constructorimpl(10);
    private static final int DeactivateOutOfFrameCancelled = m2297constructorimpl(11);
    private static final int SlotToReusedFromOnDeactivate = m2297constructorimpl(12);
    private static final int SlotToReusedFromOnReuse = m2297constructorimpl(13);
    private static final int Reused = m2297constructorimpl(14);
    private static final int ResumePaused = m2297constructorimpl(15);
    private static final int PausePaused = m2297constructorimpl(16);
    private static final int ApplyPaused = m2297constructorimpl(17);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2297constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2299equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2300hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2302unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SLOperation m2296boximpl(int i) {
        return new SLOperation(i);
    }

    public boolean equals(Object obj) {
        return m2298equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2300hashCodeimpl(this.value);
    }

    public String toString() {
        return m2301toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getApplyPaused-NjRlDlw, reason: not valid java name */
        public final int m2303getApplyPausedNjRlDlw() {
            return SLOperation.ApplyPaused;
        }

        /* JADX INFO: renamed from: getCancelPausedPrecomposition-NjRlDlw, reason: not valid java name */
        public final int m2304getCancelPausedPrecompositionNjRlDlw() {
            return SLOperation.CancelPausedPrecomposition;
        }

        /* JADX INFO: renamed from: getDeactivateOutOfFrame-NjRlDlw, reason: not valid java name */
        public final int m2305getDeactivateOutOfFrameNjRlDlw() {
            return SLOperation.DeactivateOutOfFrame;
        }

        /* JADX INFO: renamed from: getDeactivateOutOfFrameCancelled-NjRlDlw, reason: not valid java name */
        public final int m2306getDeactivateOutOfFrameCancelledNjRlDlw() {
            return SLOperation.DeactivateOutOfFrameCancelled;
        }

        /* JADX INFO: renamed from: getPausePaused-NjRlDlw, reason: not valid java name */
        public final int m2307getPausePausedNjRlDlw() {
            return SLOperation.PausePaused;
        }

        /* JADX INFO: renamed from: getResumePaused-NjRlDlw, reason: not valid java name */
        public final int m2308getResumePausedNjRlDlw() {
            return SLOperation.ResumePaused;
        }

        /* JADX INFO: renamed from: getReuseDeactivationViaHost-NjRlDlw, reason: not valid java name */
        public final int m2309getReuseDeactivationViaHostNjRlDlw() {
            return SLOperation.ReuseDeactivationViaHost;
        }

        /* JADX INFO: renamed from: getReuseForceSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m2310getReuseForceSyncDeactivationNjRlDlw() {
            return SLOperation.ReuseForceSyncDeactivation;
        }

        /* JADX INFO: renamed from: getReuseScheduleOutOfFrameDeactivation-NjRlDlw, reason: not valid java name */
        public final int m2311getReuseScheduleOutOfFrameDeactivationNjRlDlw() {
            return SLOperation.ReuseScheduleOutOfFrameDeactivation;
        }

        /* JADX INFO: renamed from: getReuseSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m2312getReuseSyncDeactivationNjRlDlw() {
            return SLOperation.ReuseSyncDeactivation;
        }

        /* JADX INFO: renamed from: getReused-NjRlDlw, reason: not valid java name */
        public final int m2313getReusedNjRlDlw() {
            return SLOperation.Reused;
        }

        /* JADX INFO: renamed from: getSlotToReusedFromOnDeactivate-NjRlDlw, reason: not valid java name */
        public final int m2314getSlotToReusedFromOnDeactivateNjRlDlw() {
            return SLOperation.SlotToReusedFromOnDeactivate;
        }

        /* JADX INFO: renamed from: getSlotToReusedFromOnReuse-NjRlDlw, reason: not valid java name */
        public final int m2315getSlotToReusedFromOnReuseNjRlDlw() {
            return SLOperation.SlotToReusedFromOnReuse;
        }

        /* JADX INFO: renamed from: getSubcompose-NjRlDlw, reason: not valid java name */
        public final int m2316getSubcomposeNjRlDlw() {
            return SLOperation.Subcompose;
        }

        /* JADX INFO: renamed from: getSubcomposeForceReuse-NjRlDlw, reason: not valid java name */
        public final int m2317getSubcomposeForceReuseNjRlDlw() {
            return SLOperation.SubcomposeForceReuse;
        }

        /* JADX INFO: renamed from: getSubcomposeNew-NjRlDlw, reason: not valid java name */
        public final int m2318getSubcomposeNewNjRlDlw() {
            return SLOperation.SubcomposeNew;
        }

        /* JADX INFO: renamed from: getSubcomposePausable-NjRlDlw, reason: not valid java name */
        public final int m2319getSubcomposePausableNjRlDlw() {
            return SLOperation.SubcomposePausable;
        }

        /* JADX INFO: renamed from: getTookFromPrecomposeMap-NjRlDlw, reason: not valid java name */
        public final int m2320getTookFromPrecomposeMapNjRlDlw() {
            return SLOperation.TookFromPrecomposeMap;
        }

        private Companion() {
        }
    }

    private /* synthetic */ SLOperation(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2301toStringimpl(int i) {
        return m1$$ExternalSyntheticOutline0.m("SLOperation(value=", i, ')');
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2298equalsimpl(int i, Object obj) {
        return (obj instanceof SLOperation) && i == ((SLOperation) obj).m2302unboximpl();
    }
}
