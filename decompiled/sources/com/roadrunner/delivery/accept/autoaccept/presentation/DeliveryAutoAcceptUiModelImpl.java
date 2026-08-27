package com.roadrunner.delivery.accept.autoaccept.presentation;

import androidx.compose.material3.ThumbNode$onAttach$1$1;
import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker$startWork$1;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.accept.domain.AcceptDeliveriesUseCaseImpl;
import com.roadrunner.delivery.accept.domain.StoreAutoAcceptedDeliveryIdsImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import o.FontVariationSettingTextUnit;
import o.SaversKtColorSaver2;
import o.WebViewBuilderException;
import o.clearTmpDetachFlag;
import o.createFromParcel;
import o.createQuery;
import o.findNestedRecyclerView;
import o.getContentViewGroupParentLayout;
import o.getKeyboardTap5zf0vsI;
import o.getNeedsDensity;
import o.getQueryContext;
import o.invoke4WTKRHQ;
import o.r8lambdat1peidAd9PyU23jWJ4Oj0nfx3d4;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAutoAcceptUiModelImpl implements findNestedRecyclerView {
    private static int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 1;
    public final getNeedsDensity ComponentActivity;
    public final MutableStateFlow IconCompatParcelizer;
    public final clearTmpDetachFlag MediaBrowserCompatMediaItem;
    public final WebViewBuilderException MediaDescriptionCompat;
    public final FontVariationSettingTextUnit MediaMetadataCompat;
    public final createQuery MediaSessionCompatQueueItem;
    public final DeliveryAcceptanceLogger MediaSessionCompatResultReceiverWrapper;
    public final r8lambdat1peidAd9PyU23jWJ4Oj0nfx3d4 MediaSessionCompatToken;
    public final getQueryContext ParcelableVolumeInfo;
    public final DefaultForegroundSoundManager PlaybackStateCompat;
    public final setTransactionSuccessful PlaybackStateCompatCustomAction;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final UpdateStateUseCaseImpl ResultReceiver;
    public final getKeyboardTap5zf0vsI r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final StateFlow r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final StoreAutoAcceptedDeliveryIdsImpl r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final DeliveryErrorProviderImpl read;
    public final AcceptDeliveriesUseCaseImpl serializer;
    public final getContentViewGroupParentLayout write;

    @Override // o.findNestedRecyclerView
    public final StateFlow serializer() {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 23;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RatingCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DeliveryAutoAcceptUiModelImpl(getContentViewGroupParentLayout getcontentviewgroupparentlayout, getQueryContext getquerycontext, setTransactionSuccessful settransactionsuccessful, r8lambdat1peidAd9PyU23jWJ4Oj0nfx3d4 r8lambdat1peidad9pyu23jwj4oj0nfx3d4, AcceptDeliveriesUseCaseImpl acceptDeliveriesUseCaseImpl, FontVariationSettingTextUnit fontVariationSettingTextUnit, UpdateStateUseCaseImpl updateStateUseCaseImpl, DeliveryAcceptanceLogger deliveryAcceptanceLogger, DefaultForegroundSoundManager defaultForegroundSoundManager, getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi, getNeedsDensity getneedsdensity, StoreAutoAcceptedDeliveryIdsImpl storeAutoAcceptedDeliveryIdsImpl, createQuery createquery, clearTmpDetachFlag cleartmpdetachflag, WebViewBuilderException webViewBuilderException, DeliveryErrorProviderImpl deliveryErrorProviderImpl) {
        getcontentviewgroupparentlayout.getClass();
        this.write = getcontentviewgroupparentlayout;
        this.ParcelableVolumeInfo = getquerycontext;
        this.PlaybackStateCompatCustomAction = settransactionsuccessful;
        this.MediaSessionCompatToken = r8lambdat1peidad9pyu23jwj4oj0nfx3d4;
        this.serializer = acceptDeliveriesUseCaseImpl;
        this.MediaMetadataCompat = fontVariationSettingTextUnit;
        this.ResultReceiver = updateStateUseCaseImpl;
        this.MediaSessionCompatResultReceiverWrapper = deliveryAcceptanceLogger;
        this.PlaybackStateCompat = defaultForegroundSoundManager;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getkeyboardtap5zf0vsi;
        this.ComponentActivity = getneedsdensity;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = storeAutoAcceptedDeliveryIdsImpl;
        this.MediaSessionCompatQueueItem = createquery;
        this.MediaBrowserCompatMediaItem = cleartmpdetachflag;
        this.MediaDescriptionCompat = webViewBuilderException;
        this.read = deliveryErrorProviderImpl;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.IconCompatParcelizer = mutableStateFlow;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new CoroutineWorker$startWork$1(this, null, 18), 3);
    }

    public static final void IconCompatParcelizer(DeliveryAutoAcceptUiModelImpl deliveryAutoAcceptUiModelImpl) {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 27;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % Fields.SpotShadowColor;
        SaversKtColorSaver2 saversKtColorSaver2 = null;
        if (i2 % 2 == 0) {
            setTransactionSuccessful settransactionsuccessful = deliveryAutoAcceptUiModelImpl.PlaybackStateCompatCustomAction;
            saversKtColorSaver2.hashCode();
            throw null;
        }
        setTransactionSuccessful settransactionsuccessful2 = deliveryAutoAcceptUiModelImpl.PlaybackStateCompatCustomAction;
        MutableStateFlow mutableStateFlow = deliveryAutoAcceptUiModelImpl.IconCompatParcelizer;
        SaversKtColorSaver2 saversKtColorSaver3 = (SaversKtColorSaver2) mutableStateFlow.read();
        mutableStateFlow.IconCompatParcelizer(saversKtColorSaver3 != null ? SaversKtColorSaver2.read(saversKtColorSaver3, new invoke4WTKRHQ(settransactionsuccessful2.IconCompatParcelizer(R.string.all_error), settransactionsuccessful2.IconCompatParcelizer(R.string.state_api_error_dialog_message), settransactionsuccessful2.IconCompatParcelizer(R.string.all_retry), "state_api_error_dialog")) : null);
        int i3 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 11;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static final Object access$updateState(DeliveryAutoAcceptUiModelImpl deliveryAutoAcceptUiModelImpl, SuspendLambda suspendLambda) {
        String strIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 87;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        SaversKtColorSaver2 saversKtColorSaver2 = (SaversKtColorSaver2) deliveryAutoAcceptUiModelImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read();
        if (saversKtColorSaver2 == null || (strIconCompatParcelizer = saversKtColorSaver2.IconCompatParcelizer()) == null) {
            strIconCompatParcelizer = deliveryAutoAcceptUiModelImpl.PlaybackStateCompatCustomAction.IconCompatParcelizer(R.string.auto_accept_success_message);
        }
        Object objCollect = ((ChannelFlow) TuplesKt.write(UpdateStateUseCaseImpl.write(deliveryAutoAcceptUiModelImpl.ResultReceiver))).collect(new ThumbNode$onAttach$1$1(deliveryAutoAcceptUiModelImpl, 11, strIconCompatParcelizer), suspendLambda);
        if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i3 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 125;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objCollect;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 51;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
