package com.braze.ui.inappmessage;

import android.app.Activity;
import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import o.getCieXyz;
import o.onAddedToParentLayer;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageActivityTransitionCoordinator {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class UnregisterDisplayedMessageResult {
        private final IInAppMessage carryoverInAppMessage;
        private final boolean shouldClearActiveWrapper;

        public final IInAppMessage component1() {
            return this.carryoverInAppMessage;
        }

        public final boolean component2() {
            return this.shouldClearActiveWrapper;
        }

        public final IInAppMessage getCarryoverInAppMessage() {
            return this.carryoverInAppMessage;
        }

        public final boolean getShouldClearActiveWrapper() {
            return this.shouldClearActiveWrapper;
        }

        public final UnregisterDisplayedMessageResult copy(IInAppMessage iInAppMessage, boolean z) {
            return new UnregisterDisplayedMessageResult(iInAppMessage, z);
        }

        public String toString() {
            return "UnregisterDisplayedMessageResult(carryoverInAppMessage=" + this.carryoverInAppMessage + ", shouldClearActiveWrapper=" + this.shouldClearActiveWrapper + ")";
        }

        public UnregisterDisplayedMessageResult(IInAppMessage iInAppMessage, boolean z) {
            this.carryoverInAppMessage = iInAppMessage;
            this.shouldClearActiveWrapper = z;
        }

        public static /* synthetic */ UnregisterDisplayedMessageResult copy$default(UnregisterDisplayedMessageResult unregisterDisplayedMessageResult, IInAppMessage iInAppMessage, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                iInAppMessage = unregisterDisplayedMessageResult.carryoverInAppMessage;
            }
            if ((i & 2) != 0) {
                z = unregisterDisplayedMessageResult.shouldClearActiveWrapper;
            }
            return unregisterDisplayedMessageResult.copy(iInAppMessage, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnregisterDisplayedMessageResult)) {
                return false;
            }
            UnregisterDisplayedMessageResult unregisterDisplayedMessageResult = (UnregisterDisplayedMessageResult) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.carryoverInAppMessage, unregisterDisplayedMessageResult.carryoverInAppMessage}, getCieXyz.write())).booleanValue() && this.shouldClearActiveWrapper == unregisterDisplayedMessageResult.shouldClearActiveWrapper;
        }

        public int hashCode() {
            IInAppMessage iInAppMessage = this.carryoverInAppMessage;
            return Boolean.hashCode(this.shouldClearActiveWrapper) + ((iInAppMessage == null ? 0 : iInAppMessage.hashCode()) * 31);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logUnregisterActivity$lambda$0() {
        return "Null Activity passed to unregisterInAppMessageManager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resolveUnregisterDisplayedMessage$lambda$0() {
        return "In-app message view includes HTML. Removing the page finished listener.";
    }

    private final void finalizeAnimatingCloseOnUnregister(IInAppMessageViewWrapper iInAppMessageViewWrapper, View view, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        ViewUtils.removeViewFromParent(view);
        if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(iInAppMessageViewWrapper)).booleanValue()) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(iInAppMessageViewWrapper.getInAppMessage());
        }
    }

    private final IInAppMessage saveInAppMessageForCarryoverOnUnregister(IInAppMessageViewWrapper iInAppMessageViewWrapper, View view) {
        iInAppMessageViewWrapper.prepareForActivityTransitionCarryover();
        ViewUtils.removeViewFromParent(view);
        return iInAppMessageViewWrapper.getInAppMessage();
    }

    public final UnregisterDisplayedMessageResult resolveUnregisterDisplayedMessage(IInAppMessageViewWrapper iInAppMessageViewWrapper, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        IInAppMessage iInAppMessageSaveInAppMessageForCarryoverOnUnregister = null;
        if (iInAppMessageViewWrapper == null) {
            return new UnregisterDisplayedMessageResult(null, false);
        }
        View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
        if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new onAddedToParentLayer(8), 7, (Object) null);
            ((InAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener(null);
        }
        if (iInAppMessageViewWrapper.isAnimatingClose()) {
            finalizeAnimatingCloseOnUnregister(iInAppMessageViewWrapper, inAppMessageView, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        } else {
            iInAppMessageSaveInAppMessageForCarryoverOnUnregister = saveInAppMessageForCarryoverOnUnregister(iInAppMessageViewWrapper, inAppMessageView);
        }
        return new UnregisterDisplayedMessageResult(iInAppMessageSaveInAppMessageForCarryoverOnUnregister, true);
    }

    public final void logUnregisterActivity(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new onAddedToParentLayer(9), 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda0(activity, 2), 6, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logUnregisterActivity$lambda$1(Activity activity) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unregistering InAppMessageManager from activity: ", activity.getLocalClassName());
    }
}
