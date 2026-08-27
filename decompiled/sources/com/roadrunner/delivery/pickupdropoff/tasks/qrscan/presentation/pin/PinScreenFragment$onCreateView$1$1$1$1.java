package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.RemoteFunctionKt$onRemoteFunction$1;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.incognia.internal.pcn;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.common.data.model.TrackingEventExtensionsKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderActionsFragment;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.FullScreenDetailsFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.AcknowledgementTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.CardCashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangingReasonDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragmentV2;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.DatePickerTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.PinValidationTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.PinScreenArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidUiFrameClock;
import o.AndroidUiMode;
import o.AnimatedContentComposeAnimation;
import o.AnimationSearchAnimateContentSizeSearch;
import o.AnimationSearchAnimateXAsStateSearch;
import o.AnimationSearchExternalSyntheticLambda2;
import o.C0195provider;
import o.DensityWithConverter;
import o.Densitydefault;
import o.Dp;
import o.DpOffset;
import o.DpSizeCompanion;
import o.DragAndDropNodeKtDragAndDropTargetModifierNode1;
import o.FontScalingLinear;
import o.FontScalingLinearDefaultImpls;
import o.IntOffset;
import o.PlatformOptimizedCancellationException;
import o.PreviewContainer;
import o.PreviewParameter;
import o.PreviewScreenSizes;
import o.ShortNewsContentCardView;
import o.SlotTreeKtExternalSyntheticLambda0;
import o.SourceContext;
import o.UiToolingDataApi;
import o.accessgetCountjd;
import o.accessibleField;
import o.addAnimationslambda100;
import o.asTree;
import o.attachAllAnimationslambda04;
import o.copyiSbpLlY;
import o.copyiSbpLlYdefault;
import o.createFromParcel;
import o.ddefault;
import o.div7Ah8Wj8;
import o.divBjo55l4;
import o.divGh9hcWk;
import o.divu2uoSUM;
import o.dlambda0;
import o.executeAsList;
import o.extractFromIndyLambdaFields;
import o.findAndTrackAnimations;
import o.findAnimatable;
import o.findAnimationSpec;
import o.findToolingOverride;
import o.getCieXyz;
import o.getDesignInfoMethodOrNull;
import o.getDisplayName;
import o.getEnterjXw82LU;
import o.getFileName;
import o.getFontScaleannotations;
import o.getHeightD9Ej5fM;
import o.getLeftD9Ej5fM;
import o.getLocations;
import o.getMaxDuration;
import o.getPackageHash;
import o.getSourceFile;
import o.getTopD9Ej5fMannotations;
import o.getUnspecifiedMYxV2XQ;
import o.getYD9Ej5fM;
import o.hasAnimation;
import o.invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0;
import o.isAppSetIdReadingEnabled;
import o.lerp81ZRxRo;
import o.makeTreedefault;
import o.maxAllowedForSize;
import o.millisToNanos;
import o.minus5rwHm24;
import o.minusCBMgk4;
import o.minuse_xh8Ic;
import o.notifySubscribe;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.plusqkQi6aY;
import o.r8lambda1rNldqZTruYAmq0tSFsnillPA;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaKPF3ExuVmwcbLmeNzxtdfQ9jzhs;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaeumubazLX3rPa32p5PWb4lF8Js;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo;
import o.recreateDisplayListIfNeeded;
import o.remBjo55l4;
import o.removeNodeAtDepth;
import o.searchAny;
import o.setGuidelineBegin;
import o.setNativeShader;
import o.setViewInfosui_tooling;
import o.sourceInformationContextOf;
import o.throwIfPresent;
import o.toBitmapConfig1JJdX4A;
import o.wrapper;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PinScreenFragment$onCreateView$1$1$1$1 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinScreenFragment$onCreateView$1$1$1$1(CustomerUnavailableFragment customerUnavailableFragment) {
        super(1, 0, CustomerUnavailableFragment.class, customerUnavailableFragment, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/delivery/pickupdropoff/tasks/customerunavailable/CustomerUnavailableAction;)V");
        this.serializer = 12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinScreenFragment$onCreateView$1$1$1$1(ContactRiderActionsFragment contactRiderActionsFragment) {
        super(1, 0, ContactRiderActionsFragment.class, contactRiderActionsFragment, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/delivery/pickupdropoff/details/contactrider/navigator/ContactRiderAction;)V");
        this.serializer = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinScreenFragment$onCreateView$1$1$1$1(FullScreenDetailsFragment fullScreenDetailsFragment) {
        super(1, 0, FullScreenDetailsFragment.class, fullScreenDetailsFragment, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/delivery/pickupdropoff/fullscreendetails/presentation/FullScreenDetailsAction;)V");
        this.serializer = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PinScreenFragment$onCreateView$1$1$1$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.serializer = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinScreenFragment$onCreateView$1$1$1$1(CustomerUnavailableFragmentV2 customerUnavailableFragmentV2) {
        super(1, 0, CustomerUnavailableFragmentV2.class, customerUnavailableFragmentV2, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/delivery/pickupdropoff/tasks/customerunavailable/CustomerUnavailableV2Action;)V");
        this.serializer = 13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Bundle arguments;
        PreviewContainer previewContainer;
        Map map;
        asTree astree;
        List list;
        Object obj2;
        sourceInformationContextOf sourceinformationcontextofRemoteActionCompatParcelizer;
        Object minus5rwhm24;
        getDisplayName getdisplayname;
        PreviewScreenSizes previewScreenSizes;
        QrPaymentTaskUiItem$QrPaymentType qrPaymentTaskUiItem$QrPaymentType;
        Object next;
        PreviewParameter previewParameter;
        List list2;
        PreviewParameter previewParameter2;
        List list3;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        Object dpSizeCompanion = minuse_xh8Ic.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = 9;
        int i5 = 25;
        int i6 = 10;
        int i7 = 26;
        boolean zSerializer = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        switch (i3) {
            case 0:
                divGh9hcWk divgh9hcwk = (divGh9hcWk) obj;
                divgh9hcwk.getClass();
                PinScreenFragment pinScreenFragment = (PinScreenFragment) this.MediaMetadataCompat;
                pinScreenFragment.getClass();
                if (!divgh9hcwk.equals(divGh9hcWk.IconCompatParcelizer)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                getFontScaleannotations getfontscaleannotations = (getFontScaleannotations) pinScreenFragment.serializer().MediaMetadataCompat.read();
                copyiSbpLlY copyisbplly = getfontscaleannotations instanceof copyiSbpLlY ? (copyiSbpLlY) getfontscaleannotations : null;
                Object[] objArr7 = (copyisbplly == null || (previewContainer = copyisbplly.RemoteActionCompatParcelizer) == null || !previewContainer.isSuccess) ? false : true;
                if (objArr7 == false) {
                    PinScreenViewModel pinScreenViewModelSerializer = pinScreenFragment.serializer();
                    pinScreenViewModelSerializer.write.IconCompatParcelizer(dpSizeCompanion);
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = pinScreenViewModelSerializer.MediaSessionCompatQueueItem;
                    ShortNewsContentCardView shortNewsContentCardView = null;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    pinScreenViewModelSerializer.MediaSessionCompatQueueItem = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(pinScreenViewModelSerializer), null, null, new SwitcherUiModelImpl$1(pinScreenViewModelSerializer, shortNewsContentCardView, i7), 3);
                }
                if (objArr7 != false && (arguments = pinScreenFragment.getArguments()) != null) {
                    int i8 = write + 11;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    PinScreenArgs pinScreenArgs = (PinScreenArgs) SQLite.read(arguments, "args_pin_screen", PinScreenArgs.class);
                    if (pinScreenArgs != null && pinScreenArgs.IconCompatParcelizer()) {
                        pinScreenFragment.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{new onViewAttachedToWindowlambda0[]{new onViewAttachedToWindowlambda0("is_success", Boolean.TRUE)}}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320), "key_pin_validation_result");
                        return createfromparcel;
                    }
                }
                pinScreenFragment.read(false, false);
                return createfromparcel;
            case 1:
                findAndTrackAnimations findandtrackanimations = (findAndTrackAnimations) obj;
                findandtrackanimations.getClass();
                ContactRiderActionsFragment contactRiderActionsFragment = (ContactRiderActionsFragment) this.MediaMetadataCompat;
                contactRiderActionsFragment.getClass();
                if (findandtrackanimations.equals(getFileName.read)) {
                    contactRiderActionsFragment.write();
                    return createfromparcel;
                }
                if (!(findandtrackanimations instanceof getDesignInfoMethodOrNull)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                ddefault ddefaultVar = ddefault.RemoteActionCompatParcelizer;
                String str = ((getDesignInfoMethodOrNull) findandtrackanimations).RemoteActionCompatParcelizer;
                dlambda0 dlambda0Var = contactRiderActionsFragment.getNavigationEventDispatcher;
                if (dlambda0Var == null) {
                    removeNodeAtDepth.serializer("snackBarManager");
                    throw null;
                }
                View viewRequireView = contactRiderActionsFragment.requireView();
                viewRequireView.getClass();
                r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, str, ddefaultVar, 0, null, null, 56);
                return createfromparcel;
            case 2:
                setViewInfosui_tooling setviewinfosui_tooling = (setViewInfosui_tooling) obj;
                setviewinfosui_tooling.getClass();
                FullScreenDetailsFragment fullScreenDetailsFragment = (FullScreenDetailsFragment) this.MediaMetadataCompat;
                fullScreenDetailsFragment.getClass();
                if (setviewinfosui_tooling.equals(setViewInfosui_tooling.serializer)) {
                    fullScreenDetailsFragment.read(false, false);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AcknowledgementTaskUiModelImpl acknowledgementTaskUiModelImpl = (AcknowledgementTaskUiModelImpl) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(acknowledgementTaskUiModelImpl.serializer, null, null, new TextFieldSelectionManager$copy$1(acknowledgementTaskUiModelImpl, zBooleanValue, (ShortNewsContentCardView) null, 4), 3);
                return createfromparcel;
            case 4:
                CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType = (CardCashPaymentTaskUiItem$PaymentType) obj;
                cardCashPaymentTaskUiItem$PaymentType.getClass();
                CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl = (CardCashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                cardCashPaymentTaskUiModelImpl.getClass();
                cardCashPaymentTaskUiModelImpl.serializer(new BarcodeAnalyzer$$ExternalSyntheticLambda0(29, cardCashPaymentTaskUiItem$PaymentType));
                return createfromparcel;
            case 5:
                getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) obj;
                getenterjxw82lu.getClass();
                CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl2 = (CardCashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                cardCashPaymentTaskUiModelImpl2.getClass();
                BuildersKt.RemoteActionCompatParcelizer(cardCashPaymentTaskUiModelImpl2.IconCompatParcelizer, null, null, new QrCodeScanTaskUiModelImpl$1(cardCashPaymentTaskUiModelImpl2, getenterjxw82lu, null, i), 3);
                return createfromparcel;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl3 = (CardCashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                cardCashPaymentTaskUiModelImpl3.getClass();
                cardCashPaymentTaskUiModelImpl3.serializer(new SessionDao_Impl$$ExternalSyntheticLambda1(cardCashPaymentTaskUiModelImpl3, 26, str2));
                return createfromparcel;
            case 7:
                CashPaymentTaskUiItem.Reasons reasons = (CashPaymentTaskUiItem.Reasons) obj;
                reasons.getClass();
                CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl4 = (CardCashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                cardCashPaymentTaskUiModelImpl4.getClass();
                cardCashPaymentTaskUiModelImpl4.serializer.serializer(new throwIfPresent(cardCashPaymentTaskUiModelImpl4.PlaybackStateCompat, reasons));
                return createfromparcel;
            case 8:
                CashPaymentTaskUiItem.Reasons reasons2 = (CashPaymentTaskUiItem.Reasons) obj;
                reasons2.getClass();
                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = (CashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                cashPaymentTaskUiModelImpl.getClass();
                cashPaymentTaskUiModelImpl.read.serializer(new AnimatedContentComposeAnimation(reasons2));
                return createfromparcel;
            case 9:
                String str3 = (String) obj;
                str3.getClass();
                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl2 = (CashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                cashPaymentTaskUiModelImpl2.getClass();
                BuildersKt.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl2.serializer, null, null, new QrCodeScanTaskUiModelImpl$1(cashPaymentTaskUiModelImpl2, str3, null, 5), 3);
                return createfromparcel;
            case 10:
                CashPaymentTaskUiItem.ReasonItem reasonItem = (CashPaymentTaskUiItem.ReasonItem) obj;
                reasonItem.getClass();
                AmountChangingReasonDialogFragment amountChangingReasonDialogFragment = (AmountChangingReasonDialogFragment) this.MediaMetadataCompat;
                amountChangingReasonDialogFragment.getClass();
                amountChangingReasonDialogFragment.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{new onViewAttachedToWindowlambda0[]{new onViewAttachedToWindowlambda0("TAG_SELECTED_REASON", reasonItem)}}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320), "TAG_AMOUNT_CHANGING_REASONS");
                ((attachAllAnimationslambda04) amountChangingReasonDialogFragment.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper()).read();
                return createfromparcel;
            case 11:
                List list4 = (List) obj;
                list4.getClass();
                CustomerUnavailableViewModel customerUnavailableViewModel = (CustomerUnavailableViewModel) this.MediaMetadataCompat;
                customerUnavailableViewModel.getClass();
                getMaxDuration getmaxduration = (getMaxDuration) customerUnavailableViewModel.MediaSessionCompatResultReceiverWrapper.read();
                if (getmaxduration != null && (map = getmaxduration.tasksStatus) != null) {
                    makeTreedefault maketreedefault = (makeTreedefault) customerUnavailableViewModel._init_lambda1.read();
                    if (maketreedefault == null || (list = maketreedefault.components) == null) {
                        astree = null;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                int i9 = write + 39;
                                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                                int i10 = i9 % 2;
                                Object next2 = it.next();
                                if (next2 instanceof asTree) {
                                    obj2 = next2;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        astree = (asTree) obj2;
                    }
                    zSerializer = customerUnavailableViewModel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.serializer(map, list4, astree);
                }
                return Boolean.valueOf(zSerializer);
            case 12:
                AnimationSearchExternalSyntheticLambda2 animationSearchExternalSyntheticLambda2 = (AnimationSearchExternalSyntheticLambda2) obj;
                animationSearchExternalSyntheticLambda2.getClass();
                CustomerUnavailableFragment customerUnavailableFragment = (CustomerUnavailableFragment) this.MediaMetadataCompat;
                customerUnavailableFragment.getClass();
                if (animationSearchExternalSyntheticLambda2.equals(searchAny.IconCompatParcelizer)) {
                    customerUnavailableFragment.write();
                    return createfromparcel;
                }
                if (animationSearchExternalSyntheticLambda2.equals(r8lambdaeumubazLX3rPa32p5PWb4lF8Js.RemoteActionCompatParcelizer)) {
                    int i11 = write + 15;
                    RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        Object obj4 = null;
                        AndroidUiFrameClock androidUiFrameClock = customerUnavailableFragment.getSavedStateRegistry;
                        obj4.hashCode();
                        throw null;
                    }
                    AndroidUiFrameClock androidUiFrameClock2 = customerUnavailableFragment.getSavedStateRegistry;
                    if (androidUiFrameClock2 == null) {
                        removeNodeAtDepth.serializer("fullScreenLoadingController");
                        throw null;
                    }
                    div7Ah8Wj8 childFragmentManager = customerUnavailableFragment.getChildFragmentManager();
                    childFragmentManager.getClass();
                    AndroidUiFrameClock.RemoteActionCompatParcelizer(androidUiFrameClock2, childFragmentManager);
                    return createfromparcel;
                }
                if (animationSearchExternalSyntheticLambda2.equals(AnimationSearchAnimateContentSizeSearch.read)) {
                    if (customerUnavailableFragment.getSavedStateRegistry == null) {
                        removeNodeAtDepth.serializer("fullScreenLoadingController");
                        throw null;
                    }
                    div7Ah8Wj8 childFragmentManager2 = customerUnavailableFragment.getChildFragmentManager();
                    childFragmentManager2.getClass();
                    List listIconCompatParcelizer = childFragmentManager2.PlaybackStateCompatCustomAction.IconCompatParcelizer();
                    listIconCompatParcelizer.getClass();
                    Fragment fragment = (Fragment) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
                    FragmentActivity activity = fragment != null ? fragment.getActivity() : null;
                    if (activity == null) {
                        return createfromparcel;
                    }
                    DragAndDropNodeKtDragAndDropTargetModifierNode1.RemoteActionCompatParcelizer(activity);
                    return createfromparcel;
                }
                if (!(animationSearchExternalSyntheticLambda2 instanceof addAnimationslambda100)) {
                    if (animationSearchExternalSyntheticLambda2 instanceof r8lambda1rNldqZTruYAmq0tSFsnillPA) {
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                String str4 = ((addAnimationslambda100) animationSearchExternalSyntheticLambda2).RemoteActionCompatParcelizer;
                dlambda0 dlambda0Var2 = customerUnavailableFragment.onBackPressed;
                if (dlambda0Var2 == null) {
                    removeNodeAtDepth.serializer("snackbarManager");
                    throw null;
                }
                View viewRequireView2 = customerUnavailableFragment.requireView();
                viewRequireView2.getClass();
                r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var2, viewRequireView2, str4, ddefault.IconCompatParcelizer, 0, null, null, 56);
                return createfromparcel;
            case 13:
                findAnimationSpec findanimationspec = (findAnimationSpec) obj;
                findanimationspec.getClass();
                CustomerUnavailableFragmentV2 customerUnavailableFragmentV2 = (CustomerUnavailableFragmentV2) this.MediaMetadataCompat;
                customerUnavailableFragmentV2.getClass();
                if (findanimationspec.equals(AnimationSearchAnimateXAsStateSearch.write)) {
                    customerUnavailableFragmentV2.write();
                    return createfromparcel;
                }
                if (findanimationspec instanceof findToolingOverride) {
                    dlambda0 dlambda0Var3 = customerUnavailableFragmentV2.invalidateMenu;
                    if (dlambda0Var3 == null) {
                        removeNodeAtDepth.serializer("snackbarManager");
                        throw null;
                    }
                    View viewRequireView3 = customerUnavailableFragmentV2.requireView();
                    viewRequireView3.getClass();
                    r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var3, viewRequireView3, ((findToolingOverride) findanimationspec).IconCompatParcelizer, ddefault.IconCompatParcelizer, 0, null, null, 56);
                    return createfromparcel;
                }
                if (findanimationspec instanceof hasAnimation) {
                    return createfromparcel;
                }
                if (!(findanimationspec instanceof findAnimatable)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                findAnimatable findanimatable = (findAnimatable) findanimationspec;
                String str5 = findanimatable.RemoteActionCompatParcelizer;
                String str6 = findanimatable.write;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str6));
                    intent.setFlags(268435456);
                    customerUnavailableFragmentV2.startActivity(intent);
                    CustomerUnavailableViewModelV2.RemoteActionCompatParcelizer(227606622, pcn.serializer(), new Object[]{customerUnavailableFragmentV2.serializer(), str5}, -227606621, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    return createfromparcel;
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Cannot open deeplink: ", str6), new Object[0]);
                    customerUnavailableFragmentV2.serializer().IconCompatParcelizer(str5);
                    return createfromparcel;
                }
            case 14:
                makeTreedefault maketreedefault2 = (makeTreedefault) obj;
                maketreedefault2.getClass();
                CustomerUnavailableTaskUiModelImpl customerUnavailableTaskUiModelImpl = (CustomerUnavailableTaskUiModelImpl) this.MediaMetadataCompat;
                customerUnavailableTaskUiModelImpl.getClass();
                BuildersKt.RemoteActionCompatParcelizer(customerUnavailableTaskUiModelImpl.RemoteActionCompatParcelizer, null, null, new QrCodeScanTaskUiModelImpl$1(maketreedefault2, customerUnavailableTaskUiModelImpl, objArr == true ? 1 : 0, i6), 3);
                return createfromparcel;
            case 15:
                accessibleField accessiblefield = (accessibleField) obj;
                accessiblefield.getClass();
                notifySubscribe notifysubscribe = (notifySubscribe) this.MediaMetadataCompat;
                notifysubscribe.getClass();
                BuildersKt.RemoteActionCompatParcelizer(notifysubscribe.IconCompatParcelizer, null, null, new SwitcherUiModelImpl$1.AnonymousClass1(notifysubscribe, accessiblefield, objArr2 == true ? 1 : 0, 22), 3);
                return createfromparcel;
            case 16:
                extractFromIndyLambdaFields extractfromindylambdafields = (extractFromIndyLambdaFields) obj;
                extractfromindylambdafields.getClass();
                DatePickerTaskUiModelImpl datePickerTaskUiModelImpl = (DatePickerTaskUiModelImpl) this.MediaMetadataCompat;
                datePickerTaskUiModelImpl.getClass();
                BuildersKt.RemoteActionCompatParcelizer(datePickerTaskUiModelImpl.serializer, null, null, new SwitcherUiModelImpl$1.AnonymousClass1(datePickerTaskUiModelImpl, extractfromindylambdafields, null, i5), 3);
                return createfromparcel;
            case 17:
                maxAllowedForSize maxallowedforsize = (maxAllowedForSize) obj;
                maxallowedforsize.getClass();
                CodeScanFragment codeScanFragment = (CodeScanFragment) this.MediaMetadataCompat;
                codeScanFragment.getClass();
                if (maxallowedforsize.equals(maxAllowedForSize.IconCompatParcelizer)) {
                    codeScanFragment.read(false, false);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 18:
                List list5 = (List) obj;
                list5.getClass();
                CodeScanViewModel codeScanViewModel = (CodeScanViewModel) this.MediaMetadataCompat;
                codeScanViewModel.getClass();
                MutableStateFlow mutableStateFlow = codeScanViewModel.write;
                if ((mutableStateFlow.read() instanceof getPackageHash) || (mutableStateFlow.read() instanceof getSourceFile) || (sourceinformationcontextofRemoteActionCompatParcelizer = codeScanViewModel.RemoteActionCompatParcelizer()) == null) {
                    return createfromparcel;
                }
                SlotTreeKtExternalSyntheticLambda0 slotTreeKtExternalSyntheticLambda0 = sourceinformationcontextofRemoteActionCompatParcelizer.codeScanScreenUiItem;
                n0 n0Var = codeScanViewModel.MediaMetadataCompat;
                List list6 = slotTreeKtExternalSyntheticLambda0.codes;
                Set set = sourceinformationcontextofRemoteActionCompatParcelizer.scannedCodes;
                n0Var.getClass();
                list6.getClass();
                set.getClass();
                boolean zIsEmpty = list5.isEmpty();
                Densitydefault densitydefault = Densitydefault.IconCompatParcelizer;
                DensityWithConverter densityWithConverter = DensityWithConverter.IconCompatParcelizer;
                if (zIsEmpty) {
                    minus5rwhm24 = densityWithConverter;
                } else if (list5.size() > 1) {
                    minus5rwhm24 = densitydefault;
                } else {
                    String str7 = (String) onContentCardDismissed.read(list5);
                    if (set.contains(str7)) {
                        minus5rwhm24 = new Dp(str7);
                    } else {
                        minus5rwhm24 = !list6.contains(str7) ? new minus5rwHm24(str7) : new divu2uoSUM(str7);
                    }
                }
                if (minus5rwhm24.equals(densityWithConverter)) {
                    int i12 = RemoteActionCompatParcelizer + 65;
                    write = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 = (invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0) mutableStateFlow.read();
                    if (!(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof SourceContext) && !(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof UiToolingDataApi) && !(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof getLocations)) {
                        return createfromparcel;
                    }
                    mutableStateFlow.IconCompatParcelizer(AndroidUiMode.INSTANCE);
                    return createfromparcel;
                }
                if (minus5rwhm24.equals(densitydefault)) {
                    int i14 = RemoteActionCompatParcelizer + 89;
                    write = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        int i15 = 45 / 0;
                        if (mutableStateFlow.read() instanceof getLocations) {
                            return createfromparcel;
                        }
                    } else if (mutableStateFlow.read() instanceof getLocations) {
                        return createfromparcel;
                    }
                    codeScanViewModel.serializer = null;
                    mutableStateFlow.IconCompatParcelizer(new getLocations(slotTreeKtExternalSyntheticLambda0.moveCloserMessage));
                    return createfromparcel;
                }
                if (minus5rwhm24 instanceof Dp) {
                    String str8 = codeScanViewModel.serializer;
                    String str9 = ((Dp) minus5rwhm24).write;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str8, str9}, getCieXyz.write())).booleanValue() && (mutableStateFlow.read() instanceof SourceContext)) {
                        return createfromparcel;
                    }
                    codeScanViewModel.serializer = str9;
                    mutableStateFlow.IconCompatParcelizer(new SourceContext(slotTreeKtExternalSyntheticLambda0.alreadyScannedMessage, str9));
                    return createfromparcel;
                }
                if (!(minus5rwhm24 instanceof minus5rwHm24)) {
                    if (minus5rwhm24 instanceof divu2uoSUM) {
                        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(codeScanViewModel), null, null, new ReconnectScheduler$schedule$1(codeScanViewModel, (divu2uoSUM) minus5rwhm24, sourceinformationcontextofRemoteActionCompatParcelizer, null, 4), 3);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i16 = RemoteActionCompatParcelizer + 9;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{codeScanViewModel.serializer, ((minus5rwHm24) minus5rwhm24).write}, getCieXyz.write())).booleanValue();
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
                String str10 = codeScanViewModel.serializer;
                String str11 = ((minus5rwHm24) minus5rwhm24).write;
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str10, str11}, getCieXyz.write())).booleanValue()) && (mutableStateFlow.read() instanceof UiToolingDataApi)) {
                    return createfromparcel;
                }
                codeScanViewModel.serializer = str11;
                mutableStateFlow.IconCompatParcelizer(new UiToolingDataApi(slotTreeKtExternalSyntheticLambda0.wrongShelfMessage, str11));
                return createfromparcel;
            case 19:
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj;
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
                PinValidationTaskUiModelImpl pinValidationTaskUiModelImpl = (PinValidationTaskUiModelImpl) this.MediaMetadataCompat;
                pinValidationTaskUiModelImpl.getClass();
                BuildersKt.RemoteActionCompatParcelizer(pinValidationTaskUiModelImpl.IconCompatParcelizer, null, null, new RemoteFunctionKt$onRemoteFunction$1(pinValidationTaskUiModelImpl, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, (ShortNewsContentCardView) null), 3);
                return createfromparcel;
            case 20:
                String str12 = (String) obj;
                str12.getClass();
                getTopD9Ej5fMannotations gettopd9ej5fmannotations = (getTopD9Ej5fMannotations) this.MediaMetadataCompat;
                gettopd9ej5fmannotations.getClass();
                gettopd9ej5fmannotations.serializer(new GestureNodeKt$$ExternalSyntheticLambda0(new SuspendingWorkUseCase$$ExternalSyntheticLambda0(gettopd9ej5fmannotations, i4, str12), 10));
                return createfromparcel;
            case 21:
                CashPaymentTaskUiItem.Reasons reasons3 = (CashPaymentTaskUiItem.Reasons) obj;
                reasons3.getClass();
                getTopD9Ej5fMannotations gettopd9ej5fmannotations2 = (getTopD9Ej5fMannotations) this.MediaMetadataCompat;
                gettopd9ej5fmannotations2.getClass();
                gettopd9ej5fmannotations2.serializer.serializer(new minusCBMgk4(reasons3));
                return createfromparcel;
            case 22:
                DpOffset dpOffset = (DpOffset) obj;
                dpOffset.getClass();
                QrPaymentScreenFragment qrPaymentScreenFragment = (QrPaymentScreenFragment) this.MediaMetadataCompat;
                qrPaymentScreenFragment.getClass();
                if (dpOffset.equals(DpOffset.serializer)) {
                    qrPaymentScreenFragment.read(false, false);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 23:
                String str13 = (String) obj;
                getHeightD9Ej5fM getheightd9ej5fm = (getHeightD9Ej5fM) this.MediaMetadataCompat;
                Object obj6 = getheightd9ej5fm.ParcelableVolumeInfo.read();
                getYD9Ej5fM getyd9ej5fm = obj6 instanceof getYD9Ej5fM ? (getYD9Ej5fM) obj6 : null;
                C0195provider c0195provider = getyd9ej5fm != null ? getyd9ej5fm.IconCompatParcelizer : null;
                if (c0195provider != null && (getdisplayname = c0195provider.qrCode) != null && (previewScreenSizes = getdisplayname.qrPaymentDetails) != null && (qrPaymentTaskUiItem$QrPaymentType = previewScreenSizes.type) != null) {
                    getLeftD9Ej5fM getleftd9ej5fm = getheightd9ej5fm.RatingCompat;
                    String strName = qrPaymentTaskUiItem$QrPaymentType.name();
                    getleftd9ej5fm.getClass();
                    strName.getClass();
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("root_error_class", "QrPaymentCriticalIssueLogger");
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("mode", strName);
                    if (str13 == null) {
                        str13 = "";
                    }
                    ((SentryCriticalIssueLogger) getleftd9ej5fm.write).write("qr_payment_qr_code_generation_failed", executeAsList.PUDO, "Could not generate the QR code for the provided data", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, new onViewAttachedToWindowlambda0("error_message", str13)));
                }
                return createfromparcel;
            case 24:
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj;
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2.getClass();
                PinScreenViewModel pinScreenViewModel = (PinScreenViewModel) this.MediaMetadataCompat;
                remBjo55l4 rembjo55l4 = pinScreenViewModel.IconCompatParcelizer;
                Object obj7 = pinScreenViewModel.MediaMetadataCompat.read();
                copyiSbpLlY copyisbplly2 = obj7 instanceof copyiSbpLlY ? (copyiSbpLlY) obj7 : null;
                if (copyisbplly2 != null) {
                    accessgetCountjd accessgetcountjd = copyisbplly2.RemoteActionCompatParcelizer.qrScanScreen.fallbackScreen;
                    String str14 = accessgetcountjd.validationPin;
                    List list7 = accessgetcountjd.trackingEvents;
                    IsFixableByRetry isFixableByRetry = pinScreenViewModel.ParcelableVolumeInfo;
                    String str15 = accessgetcountjd.pinSuccessMessage;
                    String str16 = accessgetcountjd.pinErrorMessage;
                    isFixableByRetry.getClass();
                    str14.getClass();
                    str15.getClass();
                    str16.getClass();
                    String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2), "", null, null, null, 62);
                    if (strIconCompatParcelizer.length() == str14.length()) {
                        dpSizeCompanion = strIconCompatParcelizer.equals(str14) ? new DpSizeCompanion(str15) : new getUnspecifiedMYxV2XQ(str16);
                    }
                    pinScreenViewModel.write.IconCompatParcelizer(dpSizeCompanion);
                    boolean z = dpSizeCompanion instanceof DpSizeCompanion;
                    if (z) {
                        rembjo55l4.getClass();
                        list7.getClass();
                        rembjo55l4.read.read(TrackingEventExtensionsKt.RemoteActionCompatParcelizer(list7, Trigger.DELIVERIES_TASK_READY));
                    } else if (dpSizeCompanion instanceof getUnspecifiedMYxV2XQ) {
                        rembjo55l4.getClass();
                        list7.getClass();
                        rembjo55l4.read.read(TrackingEventExtensionsKt.RemoteActionCompatParcelizer(list7, Trigger.DELIVERIES_TASK_ERROR));
                    }
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = pinScreenViewModel.MediaSessionCompatQueueItem;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                    }
                    pinScreenViewModel.MediaSessionCompatQueueItem = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(pinScreenViewModel), null, null, new RoomDatabase.AnonymousClass1(pinScreenViewModel, z, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, null, 6), 3);
                }
                return createfromparcel;
            case 25:
                FontScalingLinear fontScalingLinear = (FontScalingLinear) obj;
                fontScalingLinear.getClass();
                QrScannerFragment qrScannerFragment = (QrScannerFragment) this.MediaMetadataCompat;
                qrScannerFragment.getClass();
                if (fontScalingLinear.equals(FontScalingLinearDefaultImpls.serializer)) {
                    qrScannerFragment.read(false, false);
                    return createfromparcel;
                }
                if (!(fontScalingLinear instanceof IntOffset)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                IntOffset intOffset = (IntOffset) fontScalingLinear;
                PinScreenArgs pinScreenArgs2 = new PinScreenArgs(intOffset.IconCompatParcelizer, intOffset.serializer, intOffset.read, true);
                if (qrScannerFragment.getSavedStateRegistry == null) {
                    removeNodeAtDepth.serializer("pinScreenNavigator");
                    throw null;
                }
                div7Ah8Wj8 childFragmentManager3 = qrScannerFragment.getChildFragmentManager();
                childFragmentManager3.getClass();
                PlatformOptimizedCancellationException.RemoteActionCompatParcelizer(pinScreenArgs2).RemoteActionCompatParcelizer(childFragmentManager3, "PinScreenFragment");
                return createfromparcel;
            case 26:
                List list8 = (List) obj;
                list8.getClass();
                lerp81ZRxRo lerp81zrxro = (lerp81ZRxRo) this.MediaMetadataCompat;
                lerp81zrxro.getClass();
                MutableStateFlow mutableStateFlow2 = lerp81zrxro.read;
                if (!(mutableStateFlow2.read() instanceof copyiSbpLlYdefault)) {
                    if (!list8.isEmpty()) {
                        remBjo55l4 rembjo55l5 = lerp81zrxro.write;
                        PreviewContainer previewContainerWrite = lerp81zrxro.write();
                        if (previewContainerWrite != null) {
                            p0 p0Var = lerp81zrxro.RemoteActionCompatParcelizer;
                            String str17 = previewContainerWrite.qrScanScreen.qrCode;
                            p0Var.getClass();
                            str17.getClass();
                            Iterator it2 = list8.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    int i17 = RemoteActionCompatParcelizer + 45;
                                    write = i17 % Fields.SpotShadowColor;
                                    if (i17 % 2 == 0) {
                                        next = it2.next();
                                        int i18 = 15 / 0;
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) next, str17}, getCieXyz.write())).booleanValue()) {
                                        }
                                    } else {
                                        next = it2.next();
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) next, str17}, getCieXyz.write())).booleanValue()) {
                                        }
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            if (((String) next) != null) {
                                mutableStateFlow2.IconCompatParcelizer(copyiSbpLlYdefault.write);
                                PreviewContainer previewContainerWrite2 = lerp81zrxro.write();
                                if (previewContainerWrite2 != null && (previewParameter2 = previewContainerWrite2.qrScanScreen) != null && (list3 = previewParameter2.trackingEvents) != null) {
                                    rembjo55l5.getClass();
                                    rembjo55l5.read.read(TrackingEventExtensionsKt.RemoteActionCompatParcelizer(list3, Trigger.DELIVERIES_TASK_READY));
                                }
                                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(lerp81zrxro), null, null, new SwitcherUiModelImpl$1((Object) lerp81zrxro, (ShortNewsContentCardView) (objArr3 == true ? 1 : 0), 27), 3);
                            } else if (!(mutableStateFlow2.read() instanceof plusqkQi6aY)) {
                                int i19 = RemoteActionCompatParcelizer + 7;
                                write = i19 % Fields.SpotShadowColor;
                                if (i19 % 2 == 0) {
                                    mutableStateFlow2.IconCompatParcelizer(plusqkQi6aY.IconCompatParcelizer);
                                    lerp81zrxro.write();
                                    throw null;
                                }
                                mutableStateFlow2.IconCompatParcelizer(plusqkQi6aY.IconCompatParcelizer);
                                PreviewContainer previewContainerWrite3 = lerp81zrxro.write();
                                if (previewContainerWrite3 != null && (previewParameter = previewContainerWrite3.qrScanScreen) != null && (list2 = previewParameter.trackingEvents) != null) {
                                    int i20 = write + 77;
                                    RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                                    if (i20 % 2 != 0) {
                                        rembjo55l5.getClass();
                                        rembjo55l5.read.read(TrackingEventExtensionsKt.RemoteActionCompatParcelizer(list2, Trigger.DELIVERIES_TASK_ERROR));
                                        (objArr5 == true ? 1 : 0).hashCode();
                                        throw null;
                                    }
                                    rembjo55l5.getClass();
                                    rembjo55l5.read.read(TrackingEventExtensionsKt.RemoteActionCompatParcelizer(list2, Trigger.DELIVERIES_TASK_ERROR));
                                }
                            }
                        }
                    } else if (mutableStateFlow2.read() instanceof plusqkQi6aY) {
                        mutableStateFlow2.IconCompatParcelizer(divBjo55l4.RemoteActionCompatParcelizer);
                    }
                }
                int i21 = RemoteActionCompatParcelizer + 67;
                write = i21 % Fields.SpotShadowColor;
                if (i21 % 2 != 0) {
                    return createfromparcel;
                }
                (objArr6 == true ? 1 : 0).hashCode();
                throw null;
            case 27:
                wrapper wrapperVar = (wrapper) obj;
                wrapperVar.getClass();
                SignatureTaskUiModelImpl signatureTaskUiModelImpl = (SignatureTaskUiModelImpl) this.MediaMetadataCompat;
                signatureTaskUiModelImpl.getClass();
                millisToNanos millistonanos = signatureTaskUiModelImpl.IconCompatParcelizer;
                long j = signatureTaskUiModelImpl.MediaDescriptionCompat;
                String str18 = wrapperVar.taskId;
                str18.getClass();
                setGuidelineBegin setguidelinebegin = millistonanos.RemoteActionCompatParcelizer;
                setguidelinebegin.getClass();
                recreateDisplayListIfNeeded recreatedisplaylistifneeded = (recreateDisplayListIfNeeded) setguidelinebegin.write;
                File fileIconCompatParcelizer = recreatedisplaylistifneeded.IconCompatParcelizer("photo_" + j + BundleUtil.UNDERLINE_TAG + str18);
                Uri uri = recreatedisplaylistifneeded.read(fileIconCompatParcelizer);
                String absolutePath = fileIconCompatParcelizer.getAbsolutePath();
                absolutePath.getClass();
                BuildersKt.RemoteActionCompatParcelizer(signatureTaskUiModelImpl.serializer, null, null, new NavHostKt$NavHost$29$1(signatureTaskUiModelImpl, wrapperVar, new r8lambdaKPF3ExuVmwcbLmeNzxtdfQ9jzhs(uri, absolutePath), null, 26), 3);
                return createfromparcel;
            case 28:
                wrapper wrapperVar2 = (wrapper) obj;
                wrapperVar2.getClass();
                SignatureTaskUiModelImpl signatureTaskUiModelImpl2 = (SignatureTaskUiModelImpl) this.MediaMetadataCompat;
                signatureTaskUiModelImpl2.getClass();
                BuildersKt.RemoteActionCompatParcelizer(signatureTaskUiModelImpl2.serializer, null, null, new QrCodeScanTaskUiModelImpl$1(wrapperVar2, signatureTaskUiModelImpl2, objArr4 == true ? 1 : 0, i5), 3);
                return createfromparcel;
            default:
                String str19 = (String) obj;
                str19.getClass();
                SignatureTaskUiModelImpl signatureTaskUiModelImpl3 = (SignatureTaskUiModelImpl) this.MediaMetadataCompat;
                signatureTaskUiModelImpl3.getClass();
                BuildersKt.RemoteActionCompatParcelizer(signatureTaskUiModelImpl3.serializer, null, null, new QrCodeScanTaskUiModelImpl$1(signatureTaskUiModelImpl3, str19, null, i7), 3);
                return createfromparcel;
        }
    }
}
