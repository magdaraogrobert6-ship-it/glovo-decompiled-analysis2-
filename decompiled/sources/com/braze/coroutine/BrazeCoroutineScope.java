package com.braze.coroutine;

import bo.app.k1;
import bo.app.l1;
import com.braze.BrazeUser$$ExternalSyntheticLambda3;
import com.braze.support.BrazeLogger;
import io.sentry.util.UrlUtils;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.TextAnnouncementContentCardView;
import o.getContentViewGroupParentLayout;
import o.getOnBackInvokedCallback;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeCoroutineScope implements getContentViewGroupParentLayout {
    public static final BrazeCoroutineScope INSTANCE = new BrazeCoroutineScope();
    private static final TextAnnouncementContentCardView coroutineContext;
    private static final CoroutineExceptionHandler exceptionHandler;
    private static boolean shouldReRaiseExceptions;

    private BrazeCoroutineScope() {
    }

    @Override // o.getContentViewGroupParentLayout
    public TextAnnouncementContentCardView getCoroutineContext() {
        return coroutineContext;
    }

    public final boolean getShouldReRaiseExceptions$android_sdk_base_release() {
        return shouldReRaiseExceptions;
    }

    public final void setShouldReRaiseExceptions$android_sdk_base_release(boolean z) {
        shouldReRaiseExceptions = z;
    }

    static {
        l1 l1Var = new l1(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        exceptionHandler = l1Var;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        coroutineContext = DefaultIoScheduler.RemoteActionCompatParcelizer.plus(l1Var).plus(UrlUtils.serializer());
    }

    public static final void cancelChildren() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeCoroutineScope, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(21), 6, (Object) null);
        JobKt.serializer(brazeCoroutineScope.getCoroutineContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelChildren$lambda$0() {
        return "Cancelling children of BrazeCoroutineScope";
    }

    public final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 launchDelayed(Number number, TextAnnouncementContentCardView textAnnouncementContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        number.getClass();
        textAnnouncementContentCardView.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        return BuildersKt.RemoteActionCompatParcelizer(this, textAnnouncementContentCardView, null, new k1(number, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null), 2);
    }

    public static /* synthetic */ setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 launchDelayed$default(BrazeCoroutineScope brazeCoroutineScope, Number number, TextAnnouncementContentCardView textAnnouncementContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 2) != 0) {
            textAnnouncementContentCardView = brazeCoroutineScope.getCoroutineContext();
        }
        return brazeCoroutineScope.launchDelayed(number, textAnnouncementContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
