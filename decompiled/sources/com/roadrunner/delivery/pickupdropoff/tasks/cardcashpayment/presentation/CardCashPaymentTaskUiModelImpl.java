package com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain.GetSoftPosDeeplinkUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.FontVariationSettingTextUnit;
import o.PreviewLogger;
import o.ShortNewsContentCardView;
import o.ViewInfoUtil_androidKt;
import o.accesssetApiAvailablecp;
import o.createAnimation;
import o.createFromParcel;
import o.fastFilterNotNull;
import o.filterTree;
import o.getApiAvailable;
import o.getPositionannotations;
import o.getQueryContext;
import o.getToolingState;
import o.getTransition;
import o.isItemDismissable;
import o.minHeightOffsets;
import o.onItemDismiss;
import o.openSessionlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setTransactionSuccessful;
import o.toDebugStringlambda1;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CardCashPaymentTaskUiModelImpl implements minHeightOffsets {
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
    private static int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 1;
    public final createAnimation ComponentActivity;
    public final ContextScope IconCompatParcelizer;
    public final long MediaBrowserCompatMediaItem;
    public final fastFilterNotNull MediaDescriptionCompat;
    public final DeliveryConfirmationLoggerImpl MediaMetadataCompat;
    public final FontVariationSettingTextUnit MediaSessionCompatQueueItem;
    public final filterTree MediaSessionCompatResultReceiverWrapper;
    public final GetSoftPosDeeplinkUseCaseImpl MediaSessionCompatToken;
    public final GetDeliveryAnalyticsUseCaseImpl ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final setTransactionSuccessful PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final openSessionlambda1 RemoteActionCompatParcelizer;
    public final UpdateTaskUseCaseImpl ResultReceiver;
    public final StateFlow r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getTransition r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public getPositionannotations read;
    public final getQueryContext serializer;
    public final MutableStateFlow write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 107;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.PlaybackStateCompat;
        }
        throw null;
    }

    public CardCashPaymentTaskUiModelImpl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, FontVariationSettingTextUnit fontVariationSettingTextUnit, setTransactionSuccessful settransactionsuccessful, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, openSessionlambda1 opensessionlambda1, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl, filterTree filtertree, GetSoftPosDeeplinkUseCaseImpl getSoftPosDeeplinkUseCaseImpl, createAnimation createanimation, getTransition gettransition, getQueryContext getquerycontext) {
        str.getClass();
        this.MediaDescriptionCompat = fastfilternotnull;
        this.IconCompatParcelizer = contextScope;
        this.PlaybackStateCompat = str;
        this.MediaSessionCompatQueueItem = fontVariationSettingTextUnit;
        this.PlaybackStateCompatCustomAction = settransactionsuccessful;
        this.ResultReceiver = updateTaskUseCaseImpl;
        this.ParcelableVolumeInfo = getDeliveryAnalyticsUseCaseImpl;
        this.RemoteActionCompatParcelizer = opensessionlambda1;
        this.MediaMetadataCompat = deliveryConfirmationLoggerImpl;
        this.MediaSessionCompatResultReceiverWrapper = filtertree;
        this.MediaSessionCompatToken = getSoftPosDeeplinkUseCaseImpl;
        this.ComponentActivity = createanimation;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = gettransition;
        this.serializer = getquerycontext;
        this.MediaBrowserCompatMediaItem = fastfilternotnull.deliveryId;
        this.RatingCompat = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(ViewInfoUtil_androidKt.write);
        this.write = mutableStateFlow;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, shortNewsContentCardView, 1), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 18), 3);
    }

    public final void serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new QrCodeScanTaskUiModelImpl$1(this, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 3), 3);
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 15;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final String read(Double d) {
        String strSerializer;
        int i = 2 % 2;
        if (d != null) {
            int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 79;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            strSerializer = this.RemoteActionCompatParcelizer.serializer(d.doubleValue(), "", true);
        } else {
            strSerializer = null;
        }
        if (strSerializer != null) {
            return strSerializer;
        }
        int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 81;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public static final Object access$callDeeplinkEndpoint(CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl, SessionDao_Impl$$ExternalSyntheticLambda1 sessionDao_Impl$$ExternalSyntheticLambda1, accesssetApiAvailablecp accesssetapiavailablecp, ContinuationImpl continuationImpl) {
        getApiAvailable getapiavailable;
        Object objM4928invokegIAlus;
        int i = 2 % 2;
        cardCashPaymentTaskUiModelImpl.getClass();
        if (!(!(continuationImpl instanceof getApiAvailable))) {
            getapiavailable = (getApiAvailable) continuationImpl;
            int i2 = getapiavailable.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 97;
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                getapiavailable.write = i2 - Integer.MIN_VALUE;
            } else {
                getapiavailable = new getApiAvailable(cardCashPaymentTaskUiModelImpl, continuationImpl);
            }
        } else {
            getapiavailable = new getApiAvailable(cardCashPaymentTaskUiModelImpl, continuationImpl);
        }
        Object obj = getapiavailable.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getapiavailable.write;
        if (i5 != 0) {
            int i6 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            int i7 = i6 + 75;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 85;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return null;
            }
            int i10 = i6 + 31;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            accesssetapiavailablecp = getapiavailable.read;
            sessionDao_Impl$$ExternalSyntheticLambda1 = getapiavailable.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4928invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetSoftPosDeeplinkUseCaseImpl getSoftPosDeeplinkUseCaseImpl = cardCashPaymentTaskUiModelImpl.MediaSessionCompatToken;
            toDebugStringlambda1 todebugstringlambda1 = new toDebugStringlambda1(cardCashPaymentTaskUiModelImpl.MediaBrowserCompatMediaItem);
            getapiavailable.RemoteActionCompatParcelizer = sessionDao_Impl$$ExternalSyntheticLambda1;
            getapiavailable.read = accesssetapiavailablecp;
            getapiavailable.write = 1;
            objM4928invokegIAlus = getSoftPosDeeplinkUseCaseImpl.m4928invokegIAlus(todebugstringlambda1, getapiavailable);
            if (objM4928invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4928invokegIAlus);
        if (thSerializer == null) {
            sessionDao_Impl$$ExternalSyntheticLambda1.invoke(objM4928invokegIAlus);
        } else {
            accesssetapiavailablecp.invoke(thSerializer);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$loadAnalytics(CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl, ContinuationImpl continuationImpl) {
        getToolingState gettoolingstate;
        Object objM4939invoke0E7RQCE;
        int i = 2 % 2;
        if (continuationImpl instanceof getToolingState) {
            gettoolingstate = (getToolingState) continuationImpl;
            int i2 = gettoolingstate.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gettoolingstate.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                gettoolingstate = new getToolingState(cardCashPaymentTaskUiModelImpl, continuationImpl);
            }
        } else {
            gettoolingstate = new getToolingState(cardCashPaymentTaskUiModelImpl, continuationImpl);
        }
        Object obj = gettoolingstate.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = gettoolingstate.IconCompatParcelizer;
        Object obj2 = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = cardCashPaymentTaskUiModelImpl.ParcelableVolumeInfo;
            long j = cardCashPaymentTaskUiModelImpl.MediaBrowserCompatMediaItem;
            String str = cardCashPaymentTaskUiModelImpl.RatingCompat;
            gettoolingstate.IconCompatParcelizer = 1;
            objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl.m4939invoke0E7RQCE(j, str, gettoolingstate);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 119;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
                obj2.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4939invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            getPositionannotations getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
            cardCashPaymentTaskUiModelImpl.read = getpositionannotations;
            if (getpositionannotations == null) {
                int i5 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 91;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CardCashPaymentTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
                } else {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CardCashPaymentTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
                }
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "CardCashPaymentTaskUiModelImpl: Analytics failed to load.", new Object[0]);
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 103;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
