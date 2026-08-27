package o;

import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain.GetSoftPosDeeplinkUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.CardCashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class setState {
    private static int read = 1;
    private static int write;
    public final firstDescendantOrNull IconCompatParcelizer;

    public setState(firstDescendantOrNull firstdescendantornull) {
        this.IconCompatParcelizer = firstdescendantornull;
    }

    public final CardCashPaymentTaskUiModelImpl write(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str) {
        int i = 2 % 2;
        str.getClass();
        firstDescendantOrNull firstdescendantornull = this.IconCompatParcelizer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) firstdescendantornull.serializer).write();
        objWrite.getClass();
        ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl = (ObserveTaskByTypeAndIdUseCaseImpl) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) firstdescendantornull.MediaSessionCompatToken).write();
        objWrite2.getClass();
        FontVariationSettingTextUnit fontVariationSettingTextUnit = (FontVariationSettingTextUnit) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) firstdescendantornull.MediaBrowserCompatMediaItem).write();
        objWrite3.getClass();
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite3;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) firstdescendantornull.read).write();
        objWrite4.getClass();
        UpdateTaskUseCaseImpl updateTaskUseCaseImpl = (UpdateTaskUseCaseImpl) objWrite4;
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) firstdescendantornull.write).write();
        objWrite5.getClass();
        GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = (GetDeliveryAnalyticsUseCaseImpl) objWrite5;
        Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) firstdescendantornull.MediaDescriptionCompat).write();
        objWrite6.getClass();
        openSessionlambda1 opensessionlambda1 = (openSessionlambda1) objWrite6;
        Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) firstdescendantornull.MediaSessionCompatQueueItem).write();
        objWrite7.getClass();
        DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl = (DeliveryConfirmationLoggerImpl) objWrite7;
        Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) firstdescendantornull.RatingCompat).write();
        objWrite8.getClass();
        filterTree filtertree = (filterTree) objWrite8;
        Object objWrite9 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) firstdescendantornull.MediaMetadataCompat).write();
        objWrite9.getClass();
        GetSoftPosDeeplinkUseCaseImpl getSoftPosDeeplinkUseCaseImpl = (GetSoftPosDeeplinkUseCaseImpl) objWrite9;
        Object objWrite10 = ((mergeJsonObjects) firstdescendantornull.IconCompatParcelizer).write();
        objWrite10.getClass();
        CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl = new CardCashPaymentTaskUiModelImpl(fastfilternotnull, contextScope, str, observeTaskByTypeAndIdUseCaseImpl, fontVariationSettingTextUnit, settransactionsuccessful, updateTaskUseCaseImpl, getDeliveryAnalyticsUseCaseImpl, opensessionlambda1, deliveryConfirmationLoggerImpl, filtertree, getSoftPosDeeplinkUseCaseImpl, (createAnimation) objWrite10, (getTransition) ((getIterationDuration) firstdescendantornull.RemoteActionCompatParcelizer).write(), new getQueryContext());
        int i2 = write + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
        return cardCashPaymentTaskUiModelImpl;
    }
}
