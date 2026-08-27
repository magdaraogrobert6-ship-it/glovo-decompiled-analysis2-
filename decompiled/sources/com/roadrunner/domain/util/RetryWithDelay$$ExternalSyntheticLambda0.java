package com.roadrunner.domain.util;

import android.graphics.Paint;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1;
import androidx.activity.result.ActivityResult;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.common_ui.databinding.ItemSingleChoiceBinding;
import com.data.error.ApiException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.PickUpDropOffTasksUiModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangingReasonDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.UtccTaskStateRepositoryImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragmentV2;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.logger.MultipleCodeScanEventLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.logger.QrPaymentEventLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository;
import com.roadrunner.diagnostics.domain.CheckDeviceTokenUseCase;
import com.roadrunner.diagnostics.domain.FixTokenUseCase;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.face.verification.presentation.selfie.camera.CameraInstructionsOverlayKt;
import com.roadrunner.freelancing.api.infraboost.WorkNowWithInfraBoostUiModel;
import com.roadrunner.freelancing.api.presentation.WorkNowUiModel;
import com.roadrunner.freelancing.presentation.WorkNowUiModelImpl;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostUiModelImpl;
import com.roadrunner.instant.shifts.presentation.BookShiftConfirmationResult;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationContainerFragment;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.push.tokenregistry.data.api.TokenRegistryApiRequest;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import io.grpc.internal.SharedResourcePool;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableError;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.single.SingleMap;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidIndirectPointerEvent_androidKt;
import o.BrazeExternalSyntheticLambda28;
import o.BrazeLogger;
import o.EntityInsertionAdapter;
import o.IntOffsetKt;
import o.NotificationCompatBigPictureStyle;
import o.NotificationCompatCallStyle;
import o.RectListDebuggerModifierNode;
import o.StaggeredGridLayoutManagerSavedState1;
import o.ToolingState;
import o.TurbineTimeoutCancellationException;
import o.a4;
import o.addCompatExtras;
import o.addID;
import o.bbExternalSyntheticLambda0;
import o.bind;
import o.clearOverride;
import o.createFromParcel;
import o.d4ExternalSyntheticLambda2;
import o.dispatchLayoutStep1;
import o.getBitmapui_graphics;
import o.getBoolean;
import o.getCieXyz;
import o.getDefaultCapKaPHkGw;
import o.getFillColor;
import o.getHeightD9Ej5fM;
import o.getKeyboardTap5zf0vsI;
import o.getLeftD9Ej5fM;
import o.getMaxDurationPerIterationMillis;
import o.getPivotOffsetF1C5BW0;
import o.getPlatformStyle;
import o.getQueryContext;
import o.getScrollState;
import o.getStrokeWidth;
import o.getStyleTiuSbCo;
import o.getTypeUIouoOA;
import o.getWidthD9Ej5fMannotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.i2ExternalSyntheticLambda2;
import o.infiniteTransitionSearch;
import o.insertAndReturnIdsArray;
import o.insertAndReturnIdsArrayBox;
import o.instance_delegatelambda0;
import o.instantiateService;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.lambdaprocessAndResolveDeeplink14;
import o.lambdaremoveGlobalCallbackParameter25;
import o.lerp81ZRxRo;
import o.localeSpan;
import o.logEcommerceEvent;
import o.m7;
import o.mergeJsonObjects;
import o.minusNvtHpc;
import o.overrideState;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdapkx6kfYbgP4lEOWkebovjPb0ug;
import o.readInstallReferrerHuaweiAppGallery;
import o.remBjo55l4;
import o.removeNodeAtDepth;
import o.roundk4lQ0M;
import o.setDpMargin;
import o.timesu2uoSUM;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RetryWithDelay$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ RetryWithDelay$$ExternalSyntheticLambda0(int i, Object obj) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Object obj2;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 75;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.RemoteActionCompatParcelizer;
        int i6 = 3;
        int i7 = 1;
        switch (i5) {
            case 0:
                RetryWithDelay retryWithDelay = (RetryWithDelay) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                if (!(th instanceof SocketTimeoutException) && !(th instanceof UnknownHostException) && !(th instanceof ConnectException)) {
                    ApiException apiException = th instanceof ApiException ? (ApiException) th : null;
                    if (apiException == null || apiException.RemoteActionCompatParcelizer() != 503) {
                        int i8 = retryWithDelay.RemoteActionCompatParcelizer + 1;
                        retryWithDelay.RemoteActionCompatParcelizer = i8;
                        int i9 = retryWithDelay.write;
                        if (i8 < i9 || i9 == -1) {
                            TimeUnit timeUnit = (TimeUnit) retryWithDelay.IconCompatParcelizer;
                            Scheduler scheduler = (Scheduler) retryWithDelay.read;
                            int i10 = Flowable.write;
                            return new FlowableTimer(Math.max(0L, 0L), timeUnit, scheduler);
                        }
                    }
                }
                int i11 = Flowable.write;
                return new FlowableError(Functions.RemoteActionCompatParcelizer(th));
            case 1:
                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = (CashPaymentTaskUiModelImpl) obj3;
                CashPaymentTaskUiItem.ReasonItem reasonItem = (CashPaymentTaskUiItem.ReasonItem) obj;
                reasonItem.getClass();
                cashPaymentTaskUiModelImpl.getClass();
                BuildersKt.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl.serializer, null, null, new QrCodeScanTaskUiModelImpl$1(cashPaymentTaskUiModelImpl, reasonItem, null, 6), 3);
                return createfromparcel;
            case 2:
                AmountChangingReasonDialogFragment amountChangingReasonDialogFragment = (AmountChangingReasonDialogFragment) obj3;
                infiniteTransitionSearch infinitetransitionsearch = (infiniteTransitionSearch) obj;
                infinitetransitionsearch.getClass();
                if (infinitetransitionsearch.equals(infiniteTransitionSearch.serializer)) {
                    amountChangingReasonDialogFragment.write();
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 3:
                getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) obj;
                getbitmapui_graphics.getClass();
                clearOverride clearoverride = ((CustomerUnavailableFragment) obj3).getOnBackPressedDispatcher;
                if (clearoverride != null) {
                    ToolingState toolingState = clearoverride.RemoteActionCompatParcelizer;
                    return new CustomerUnavailableViewModel(getbitmapui_graphics, new SharedResourcePool(24), (GetTaskByTypeAndIdUseCaseImpl) toolingState.RatingCompat.write(), (CustomerChatCommunicatorImpl) toolingState.write.write(), (UnifiedPhoneCallerImpl) toolingState.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(), (Vw$Vw) toolingState.read.write(), (UpdateTaskUseCaseImpl) toolingState.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write(), (DeliveryConfirmationLoggerImpl) toolingState.MediaDescriptionCompat.write(), (localeSpan) toolingState.MediaSessionCompatResultReceiverWrapper.write(), (getPlatformStyle) toolingState.serializer.write(), (isOpenInternalroom_runtime) toolingState.MediaMetadataCompat.write(), (UtccTaskStateRepositoryImpl) toolingState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write(), (GetDeliveryAnalyticsUseCaseImpl) toolingState.MediaSessionCompatQueueItem.write(), (InitiateTransferChangeUseCase) toolingState.RemoteActionCompatParcelizer.write(), (InitiateTransferChangeUseCase) toolingState.MediaSessionCompatToken.write(), (InitiateTransferChangeUseCase) toolingState.PlaybackStateCompat.write(), (UpdateStateUseCaseImpl) toolingState.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write(), new g0(), (Clock) toolingState.IconCompatParcelizer.write(), (BrazeExternalSyntheticLambda28) toolingState.ComponentActivity.write(), (getMaxDurationPerIterationMillis) toolingState.MediaBrowserCompatMediaItem.write(), (SendTestPushUseCase) toolingState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write(), (Parser.Pair) toolingState.ResultReceiver.write(), (ObservePuDoDeliveriesResponseImpl) toolingState.ParcelableVolumeInfo.write(), (NetworkErrorMapperImpl) toolingState.PlaybackStateCompatCustomAction.write(), (getPivotOffsetF1C5BW0) toolingState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write());
                }
                removeNodeAtDepth.serializer("customerUnavailableViewModelFactory");
                throw null;
            case 4:
                getBitmapui_graphics getbitmapui_graphics2 = (getBitmapui_graphics) obj;
                getbitmapui_graphics2.getClass();
                overrideState overridestate = ((CustomerUnavailableFragmentV2) obj3).getNavigationEventDispatcher;
                if (overridestate != null) {
                    AnchoredDraggableState anchoredDraggableState = overridestate.read;
                    return new CustomerUnavailableViewModelV2(getbitmapui_graphics2, new SharedResourcePool(24), (GetTaskByTypeAndIdUseCaseImpl) ((mergeJsonObjects) anchoredDraggableState.ParcelableVolumeInfo).write(), (UpdateTaskUseCaseImpl) ((mergeJsonObjects) anchoredDraggableState.PlaybackStateCompat).write(), (CustomerChatCommunicatorImpl) ((mergeJsonObjects) anchoredDraggableState.IconCompatParcelizer).write(), (UnifiedPhoneCallerImpl) ((mergeJsonObjects) anchoredDraggableState.serializer).write(), (SendTestPushUseCase) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) anchoredDraggableState.MediaBrowserCompatMediaItem).write(), (m) ((readInstallReferrerHuaweiAppGallery) anchoredDraggableState.MediaMetadataCompat).write(), (InitiateTransferChangeUseCase) ((AndroidIndirectPointerEvent_androidKt) anchoredDraggableState.MediaDescriptionCompat).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) anchoredDraggableState.MediaSessionCompatQueueItem).write(), new g0(), (Clock) ((mergeJsonObjects) anchoredDraggableState.RemoteActionCompatParcelizer).write(), (getPlatformStyle) ((mergeJsonObjects) anchoredDraggableState.MediaSessionCompatToken).write(), (localeSpan) ((mergeJsonObjects) anchoredDraggableState.write).write(), (ObservePuDoDeliveriesResponseImpl) ((mergeJsonObjects) anchoredDraggableState.PlaybackStateCompatCustomAction).write(), (NetworkErrorMapperImpl) ((mergeJsonObjects) anchoredDraggableState.RatingCompat).write(), (BrazeExternalSyntheticLambda28) ((AndroidIndirectPointerEvent_androidKt) anchoredDraggableState.read).write());
                }
                removeNodeAtDepth.serializer("customerUnavailableViewModelFactory");
                throw null;
            case 5:
                getBitmapui_graphics getbitmapui_graphics3 = (getBitmapui_graphics) obj;
                getbitmapui_graphics3.getClass();
                timesu2uoSUM timesu2uosum = ((CodeScanFragment) obj3).getNavigationEventDispatcher;
                if (timesu2uosum != null) {
                    logEcommerceEvent logecommerceevent = timesu2uosum.write;
                    return new CodeScanViewModel(getbitmapui_graphics3, new getQueryContext(), (ObserveTaskByTypeAndIdUseCaseImpl) logecommerceevent.serializer.write(), (UpdateTaskUseCaseImpl) logecommerceevent.write.write(), new n0(0), (getKeyboardTap5zf0vsI) logecommerceevent.IconCompatParcelizer.write(), (MultipleCodeScanEventLoggerImpl) logecommerceevent.RemoteActionCompatParcelizer.write());
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 6:
                getStrokeWidth getstrokewidth = (getStrokeWidth) obj;
                getstrokewidth.getClass();
                PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl = (PickUpDropOffTasksUiModelV2Impl) ((PickUpDropOffTasksUiModelV2) obj3);
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = pickUpDropOffTasksUiModelV2Impl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu == null || !r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
                    pickUpDropOffTasksUiModelV2Impl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = BuildersKt.RemoteActionCompatParcelizer(pickUpDropOffTasksUiModelV2Impl.MediaBrowserCompatMediaItem, null, null, new PickUpDropOffTasksUiModelV2Impl.AnonymousClass1(pickUpDropOffTasksUiModelV2Impl, null, i7), 3);
                }
                return new PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1(getstrokewidth, pickUpDropOffTasksUiModelV2Impl, i6);
            case 7:
                getBitmapui_graphics getbitmapui_graphics4 = (getBitmapui_graphics) obj;
                getbitmapui_graphics4.getClass();
                getWidthD9Ej5fMannotations getwidthd9ej5fmannotations = ((QrPaymentScreenFragment) obj3).getNavigationEventDispatcher;
                if (getwidthd9ej5fmannotations != null) {
                    IntOffsetKt intOffsetKt = getwidthd9ej5fmannotations.read;
                    return new getHeightD9Ej5fM(getbitmapui_graphics4, new getQueryContext(), (ObserveTaskByTypeAndIdUseCaseImpl) intOffsetKt.read.write(), (QrPaymentEventLoggerImpl) intOffsetKt.RemoteActionCompatParcelizer.write(), (getLeftD9Ej5fM) intOffsetKt.serializer.write());
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 8:
                Vw$Vw vw$Vw = (Vw$Vw) obj3;
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String strRemoteActionCompatParcelizer = ((Barcode) it.next()).serializer.RemoteActionCompatParcelizer();
                    if (strRemoteActionCompatParcelizer != null) {
                        int i12 = read + 111;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 == 0) {
                            arrayList.add(strRemoteActionCompatParcelizer);
                            int i13 = 79 / 0;
                        } else {
                            arrayList.add(strRemoteActionCompatParcelizer);
                        }
                    }
                }
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) vw$Vw.serializer).invoke(arrayList);
                return createfromparcel;
            case 9:
                getBitmapui_graphics getbitmapui_graphics5 = (getBitmapui_graphics) obj;
                getbitmapui_graphics5.getClass();
                minusNvtHpc minusnvthpc = ((PinScreenFragment) obj3).getNavigationEventDispatcher;
                if (minusnvthpc != null) {
                    IntOffsetKt intOffsetKt2 = minusnvthpc.IconCompatParcelizer;
                    return new PinScreenViewModel(getbitmapui_graphics5, new getQueryContext(), (ObserveTaskByTypeAndIdUseCaseImpl) intOffsetKt2.read.write(), (remBjo55l4) intOffsetKt2.RemoteActionCompatParcelizer.write(), (UpdateTaskUseCaseImpl) intOffsetKt2.serializer.write(), new IsFixableByRetry(24));
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 10:
                getBitmapui_graphics getbitmapui_graphics6 = (getBitmapui_graphics) obj;
                getbitmapui_graphics6.getClass();
                roundk4lQ0M roundk4lq0m = ((QrScannerFragment) obj3).getOnBackPressedDispatcher;
                if (roundk4lq0m != null) {
                    logEcommerceEvent logecommerceevent2 = roundk4lq0m.serializer;
                    return new lerp81ZRxRo(getbitmapui_graphics6, new getQueryContext(), (ObserveTaskByTypeAndIdUseCaseImpl) logecommerceevent2.serializer.write(), new p0(0), (UpdateTaskUseCaseImpl) logecommerceevent2.write.write(), (getKeyboardTap5zf0vsI) logecommerceevent2.IconCompatParcelizer.write(), (remBjo55l4) logecommerceevent2.RemoteActionCompatParcelizer.write());
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 11:
                TakePictureTaskUiModelImpl takePictureTaskUiModelImpl = (TakePictureTaskUiModelImpl) obj3;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                int i14 = activityResult.write;
                if (i14 != -1) {
                    int i15 = IconCompatParcelizer + 121;
                    read = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 != 0) {
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    if (i14 == 0) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CAMERA_CANCEL_ACTION", new Object[0]);
                        takePictureTaskUiModelImpl.write();
                    }
                } else {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CAMERA_OK_ACTION", new Object[0]);
                    takePictureTaskUiModelImpl.RemoteActionCompatParcelizer();
                }
                return createfromparcel;
            case 12:
                InAppCameraWithTagsFragment inAppCameraWithTagsFragment = (InAppCameraWithTagsFragment) obj3;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    inAppCameraWithTagsFragment.serializer().write(uri);
                } else {
                    inAppCameraWithTagsFragment.serializer().IconCompatParcelizer();
                }
                return createfromparcel;
            case 13:
                getTypeUIouoOA gettypeuiouooa = (getTypeUIouoOA) obj3;
                getStyleTiuSbCo getstyletiusbco = (getStyleTiuSbCo) obj;
                getstyletiusbco.getClass();
                gettypeuiouooa.enable();
                return new getFillColor(getstyletiusbco, gettypeuiouooa, i);
            case 14:
                CheckDeviceTokenUseCase checkDeviceTokenUseCase = (CheckDeviceTokenUseCase) obj3;
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 0) {
                    return Single.serializer(addID.CORRUPT);
                }
                NotificationsDiagnosticsRepository notificationsDiagnosticsRepository = checkDeviceTokenUseCase.write;
                notificationsDiagnosticsRepository.getClass();
                setDpMargin setdpmargin = notificationsDiagnosticsRepository.serializer;
                setdpmargin.getClass();
                TokenRegistryApiRequest tokenRegistryApiRequest = setdpmargin.IconCompatParcelizer;
                lambdaremoveGlobalCallbackParameter25 lambdaremoveglobalcallbackparameter25 = new lambdaremoveGlobalCallbackParameter25(str);
                tokenRegistryApiRequest.getClass();
                Single<lambdaprocessAndResolveDeeplink14> singleIconCompatParcelizer = tokenRegistryApiRequest.read.IconCompatParcelizer(lambdaremoveglobalcallbackparameter25);
                RetryWithDelay$$ExternalSyntheticLambda1 retryWithDelay$$ExternalSyntheticLambda1 = new RetryWithDelay$$ExternalSyntheticLambda1(14, new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(15));
                singleIconCompatParcelizer.getClass();
                return new SingleMap(new SingleMap(singleIconCompatParcelizer, retryWithDelay$$ExternalSyntheticLambda1), new RetryWithDelay$$ExternalSyntheticLambda1(17, new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(17)));
            case 15:
                String str2 = (String) obj;
                str2.getClass();
                NotificationsDiagnosticsRepository notificationsDiagnosticsRepository2 = ((FixTokenUseCase) obj3).serializer;
                notificationsDiagnosticsRepository2.getClass();
                setDpMargin setdpmargin2 = notificationsDiagnosticsRepository2.serializer;
                setdpmargin2.getClass();
                TokenRegistryApiRequest tokenRegistryApiRequest2 = setdpmargin2.IconCompatParcelizer;
                lambdaremoveGlobalCallbackParameter25 lambdaremoveglobalcallbackparameter26 = new lambdaremoveGlobalCallbackParameter25(str2);
                tokenRegistryApiRequest2.getClass();
                return tokenRegistryApiRequest2.read.read(lambdaremoveglobalcallbackparameter26);
            case 16:
                SolidColor solidColor = (SolidColor) obj3;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                long jMo1304getSizeNHjbRc = drawScope.mo1304getSizeNHjbRc();
                float f = Dimensions.setTitleOptional;
                float fMo48toPx0680j_4 = drawScope.mo48toPx0680j_4(f);
                float f2 = Dimensions.setActionBarHideOffset;
                Path pathM4962getFaceShapePathCqks5Fs = CameraInstructionsOverlayKt.m4962getFaceShapePathCqks5Fs(jMo1304getSizeNHjbRc, fMo48toPx0680j_4, drawScope.mo48toPx0680j_4(f2), 0.0f);
                Path pathM4962getFaceShapePathCqks5Fs2 = CameraInstructionsOverlayKt.m4962getFaceShapePathCqks5Fs(drawScope.mo1304getSizeNHjbRc(), drawScope.mo48toPx0680j_4(f), drawScope.mo48toPx0680j_4(f2), drawScope.mo48toPx0680j_4(Dimensions.read));
                int iM710getDifferencertfAjoo = ClipOp.Companion.m710getDifferencertfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo1227clipPathmtrdDE(pathM4962getFaceShapePathCqks5Fs, iM710getDifferencertfAjoo);
                    DrawScope.m1297drawRectAsUm42w$default(drawScope, solidColor, 0L, 0L, 0.0f, null, null, 0, 126, null);
                    c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
                    long jM759getWhite0d7_KjU = Color.Companion.m759getWhite0d7_KjU();
                    float fMo48toPx0680j_5 = drawScope.mo48toPx0680j_4(Dimensions.write);
                    PathEffect.Companion companion = PathEffect.Companion;
                    float f3 = Dimensions.setTabContainer;
                    DrawScope.m1294drawPathLG529CI$default(drawScope, pathM4962getFaceShapePathCqks5Fs2, jM759getWhite0d7_KjU, 0.0f, new Stroke(fMo48toPx0680j_5, 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(companion, new float[]{drawScope.mo48toPx0680j_4(f3), drawScope.mo48toPx0680j_4(f3)}, 0.0f, 2, null), 14, null), null, 0, 52, null);
                    return createfromparcel;
                } catch (Throwable th2) {
                    c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
                    throw th2;
                }
            case 17:
                WorkNowUiModel workNowUiModel = (WorkNowUiModel) obj3;
                NotificationCompatCallStyle notificationCompatCallStyle = (NotificationCompatCallStyle) obj;
                notificationCompatCallStyle.getClass();
                if (notificationCompatCallStyle instanceof addCompatExtras) {
                    ((StartWorkingNavigationUiModelImpl) ((WorkNowUiModelImpl) workNowUiModel).MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).serializer(((addCompatExtras) notificationCompatCallStyle).RemoteActionCompatParcelizer);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 18:
                WorkNowWithInfraBoostUiModel workNowWithInfraBoostUiModel = (WorkNowWithInfraBoostUiModel) obj3;
                instantiateService instantiateservice = (instantiateService) obj;
                instantiateservice.getClass();
                if (!(instantiateservice instanceof NotificationCompatBigPictureStyle)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i16 = IconCompatParcelizer + 47;
                read = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    ((StartWorkingNavigationUiModelImpl) ((WorkNowWithInfraBoostUiModelImpl) workNowWithInfraBoostUiModel).MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper()).serializer(((NotificationCompatBigPictureStyle) instantiateservice).IconCompatParcelizer);
                    return createfromparcel;
                }
                ((StartWorkingNavigationUiModelImpl) ((WorkNowWithInfraBoostUiModelImpl) workNowWithInfraBoostUiModel).MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper()).serializer(((NotificationCompatBigPictureStyle) instantiateservice).IconCompatParcelizer);
                throw null;
            case 19:
                dispatchLayoutStep1 dispatchlayoutstep1 = (dispatchLayoutStep1) obj;
                dispatchlayoutstep1.getClass();
                return ((getScrollState) obj3).read(dispatchlayoutstep1);
            case 20:
                BookShiftConfirmationContainerFragment bookShiftConfirmationContainerFragment = (BookShiftConfirmationContainerFragment) obj3;
                StaggeredGridLayoutManagerSavedState1 staggeredGridLayoutManagerSavedState1 = (StaggeredGridLayoutManagerSavedState1) obj;
                staggeredGridLayoutManagerSavedState1.getClass();
                if (!(staggeredGridLayoutManagerSavedState1 instanceof EntityInsertionAdapter)) {
                    if (staggeredGridLayoutManagerSavedState1.equals(bind.serializer)) {
                        bookShiftConfirmationContainerFragment.write();
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                BookShiftConfirmationResult bookShiftConfirmationResult = ((EntityInsertionAdapter) staggeredGridLayoutManagerSavedState1).IconCompatParcelizer;
                String string = bookShiftConfirmationContainerFragment.requireArguments().getString("book_shift_confirmation_flow_request_key", "");
                string.getClass();
                if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("book_shift_confirmation_flow_result_key", bookShiftConfirmationResult);
                    bookShiftConfirmationContainerFragment.getParentFragmentManager().write(bundle, string);
                }
                bookShiftConfirmationContainerFragment.write();
                return createfromparcel;
            case 21:
                getDefaultCapKaPHkGw getdefaultcapkaphkgw = (getDefaultCapKaPHkGw) obj3;
                insertAndReturnIdsArray insertandreturnidsarray = (insertAndReturnIdsArray) obj;
                insertandreturnidsarray.getClass();
                insertAndReturnIdsArrayBox insertandreturnidsarraybox = insertandreturnidsarray.write;
                if (insertandreturnidsarraybox != null) {
                    TextView textView = (TextView) getdefaultcapkaphkgw.read;
                    Button button = (Button) getdefaultcapkaphkgw.IconCompatParcelizer;
                    ItemSingleChoiceBinding itemSingleChoiceBinding = (ItemSingleChoiceBinding) getdefaultcapkaphkgw.write;
                    textView.setText(R.string.instant_shift_confirm_booking);
                    ((TextView) getdefaultcapkaphkgw.MediaDescriptionCompat).setText(R.string.instant_shift_booking_confirmation_description);
                    ((TextView) itemSingleChoiceBinding.serializer).setText(insertandreturnidsarraybox.IconCompatParcelizer);
                    ((TextView) itemSingleChoiceBinding.write).setText(insertandreturnidsarraybox.write);
                    ((TextView) itemSingleChoiceBinding.read).setText(insertandreturnidsarraybox.MediaDescriptionCompat);
                    ((TextView) getdefaultcapkaphkgw.MediaMetadataCompat).setText(insertandreturnidsarraybox.RemoteActionCompatParcelizer);
                    ((TextView) getdefaultcapkaphkgw.MediaBrowserCompatMediaItem).setText(insertandreturnidsarraybox.serializer);
                    button.setText(R.string.instant_shift_confirm_booking);
                    button.setEnabled(true);
                }
                return createfromparcel;
            case 22:
                ((RoomDatabase$$ExternalSyntheticLambda2) obj3).invoke((Location) obj);
                return createfromparcel;
            case 23:
                String str3 = (String) obj;
                str3.getClass();
                return Boolean.valueOf(((Paint) ((isAdapterPositionOnScreen) ((m) obj3).RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).hasGlyph(str3));
            case 24:
                RectListDebuggerModifierNode rectListDebuggerModifierNode = (RectListDebuggerModifierNode) obj;
                rectListDebuggerModifierNode.getClass();
                MutableStateFlow mutableStateFlow = ((TurbineTimeoutCancellationException) obj3).IconCompatParcelizer;
                do {
                    obj2 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, a4.serializer((a4) obj2, false, rectListDebuggerModifierNode, 63)));
                int i17 = read + 111;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                return createfromparcel;
            case 25:
                FocusManager.clearFocus$default((FocusManager) obj3, false, 1, null);
                return createfromparcel;
            case 26:
                String str4 = (String) obj;
                str4.getClass();
                getBoolean getboolean = ((bbExternalSyntheticLambda0) obj3).write;
                getboolean.read(str4);
                getboolean.read();
                return createfromparcel;
            case 27:
                BrazeLogger brazeLogger = ((SignInViewModel) obj3).PlaybackStateCompatCustomAction;
                brazeLogger.getClass();
                brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(d4ExternalSyntheticLambda2.RemoteActionCompatParcelizer((d4ExternalSyntheticLambda2) brazeLogger.write(), null, null, true, null, 503));
                return createfromparcel;
            case 28:
                MapboxViewProxy mapboxViewProxy = (MapboxViewProxy) obj3;
                CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) obj;
                cameraAnimationsPlugin.getClass();
                CameraAnimationsPluginImpl cameraAnimationsPluginImpl = (CameraAnimationsPluginImpl) cameraAnimationsPlugin;
                cameraAnimationsPluginImpl.cancelAllAnimators(instance_delegatelambda0.write);
                cameraAnimationsPluginImpl.zoomListeners.remove(new i2ExternalSyntheticLambda2(mapboxViewProxy.ParcelableVolumeInfo));
                cameraAnimationsPluginImpl.centerListeners.remove(new i2ExternalSyntheticLambda2(mapboxViewProxy.MediaSessionCompatResultReceiverWrapper));
                return createfromparcel;
            default:
                m7 m7Var = (m7) obj3;
                NavigationRoute navigationRoute = (NavigationRoute) obj;
                navigationRoute.getClass();
                if (!navigationRoute.equals(m7Var.IconCompatParcelizer().primaryRoute)) {
                    int i19 = read + 11;
                    IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    List list2 = m7Var.IconCompatParcelizer().routes;
                    if (!list2.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : list2) {
                            int i21 = read + 107;
                            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                            int i22 = i21 % 2;
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{navigationRoute.id, ((NavigationRoute) obj5).id}, getCieXyz.write())).booleanValue()) {
                                arrayList2.add(obj5);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        arrayList3.add(0, navigationRoute);
                        SuspendingWorkUseCase$$ExternalSyntheticLambda0 suspendingWorkUseCase$$ExternalSyntheticLambda0 = m7Var.MediaSessionCompatQueueItem;
                        if (suspendingWorkUseCase$$ExternalSyntheticLambda0 != null) {
                            suspendingWorkUseCase$$ExternalSyntheticLambda0.invoke(arrayList3);
                        }
                    }
                }
                return createfromparcel;
        }
    }
}
