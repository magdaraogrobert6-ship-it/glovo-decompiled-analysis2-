package androidx.compose.ui.layout;

import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.ScrollingLayoutElement;
import o.getQueryParameterslambda2;
import o.isCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes.dex */
final class SubcomposeLayoutPausableCompositionException extends IllegalStateException {
    private final ScrollingLayoutElement operations;
    private final Object slotId;

    public static /* synthetic */ void getMessage$annotations() {
    }

    public SubcomposeLayoutPausableCompositionException(ScrollingLayoutElement scrollingLayoutElement, Object obj, Throwable th) {
        super(th);
        this.operations = scrollingLayoutElement;
        this.slotId = obj;
    }

    private final List<String> operationsList() {
        String strM;
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, getQueryParameterslambda2.serializer());
        int i = this.operations.RemoteActionCompatParcelizer;
        while (true) {
            i--;
            if (i < 0) {
                return SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
            }
            int iRemoteActionCompatParcelizer = this.operations.RemoteActionCompatParcelizer(i);
            int iM2297constructorimpl = SLOperation.m2297constructorimpl(iRemoteActionCompatParcelizer);
            SLOperation.Companion companion = SLOperation.Companion;
            if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2304getCancelPausedPrecompositionNjRlDlw())) {
                strM = "CancelPausedPrecomposition";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2310getReuseForceSyncDeactivationNjRlDlw())) {
                strM = "ReuseForceSyncDeactivation";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2311getReuseScheduleOutOfFrameDeactivationNjRlDlw())) {
                strM = "ReuseScheduleOutOfFrameDeactivation";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2312getReuseSyncDeactivationNjRlDlw())) {
                strM = "ReuseSyncDeactivation";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2309getReuseDeactivationViaHostNjRlDlw())) {
                strM = "ReuseDeactivationViaHost";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2320getTookFromPrecomposeMapNjRlDlw())) {
                strM = "TookFromPrecomposeMap";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2316getSubcomposeNjRlDlw())) {
                strM = "Subcompose";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2318getSubcomposeNewNjRlDlw())) {
                strM = "SubcomposeNew";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2319getSubcomposePausableNjRlDlw())) {
                strM = "SubcomposePausable";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2317getSubcomposeForceReuseNjRlDlw())) {
                strM = "SubcomposeForceReuse";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2305getDeactivateOutOfFrameNjRlDlw())) {
                strM = "DeactivateOutOfFrame";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2306getDeactivateOutOfFrameCancelledNjRlDlw())) {
                strM = "DeactivateOutOfFrameCancelled";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2314getSlotToReusedFromOnDeactivateNjRlDlw())) {
                strM = "SlotToReusedFromOnDeactivate";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2315getSlotToReusedFromOnReuseNjRlDlw())) {
                strM = "SlotToReusedFromOnReuse";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2313getReusedNjRlDlw())) {
                strM = "Reused";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2308getResumePausedNjRlDlw())) {
                strM = "ResumePaused";
            } else if (SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2307getPausePausedNjRlDlw())) {
                strM = "PausePaused";
            } else {
                strM = SLOperation.m2299equalsimpl0(iM2297constructorimpl, companion.m2303getApplyPausedNjRlDlw()) ? "ApplyPaused" : c8$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer, "Unexpected ");
            }
            baseContentCardViewExternalSyntheticLambda0.add(i + ": " + strM);
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n            |slotid=" + this.slotId + ". Last operations:\n            |" + onContentCardDismissed.IconCompatParcelizer(operationsList(), "\n", null, null, null, 62) + "\n            ");
    }
}
