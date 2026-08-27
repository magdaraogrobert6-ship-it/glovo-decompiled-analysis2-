package com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.compose;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger$logNavigationArrival$1;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.TripInformationUiModel;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.TripInformationUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.ConfirmButtonV1UiModel;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.api.PickUpDropOffTasksUiModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.CardCashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.logger.MultipleCodeScanEventLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.delivery.state.Trigger;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AnimationDebugMutableState;
import o.AnimationSearchAnimateXAsStateSearch;
import o.BaselineShift;
import o.BaselineShiftCompanion;
import o.C0204sourceLocation;
import o.ComposableSingletonsPreviewActivity_androidKt;
import o.ComposeAnimationState;
import o.CustomBulletSpan;
import o.DensityDefaultImpls;
import o.DpOffsetCompanion;
import o.DrawStyleSpan;
import o.EmptyGroup;
import o.JoinedKey;
import o.LineHeightStyleMode;
import o.ParameterInformation;
import o.SlotTreeKtExternalSyntheticLambda0;
import o.TextAlignKt;
import o.TextDirectionKt;
import o.accessgetContentOrRtlcp;
import o.accessgetContentcp;
import o.accessgetInfinitycp;
import o.accessgetTightcp;
import o.accesssetApiAvailablecp;
import o.attachAllAnimationslambda04;
import o.buildCompositionParentHierarchy;
import o.combine;
import o.copya9UjIt4;
import o.createFromParcel;
import o.findMethod;
import o.getApplicationInfo;
import o.getCenterPIaL0Z0;
import o.getCompared;
import o.getContentOrRtls_7Xco;
import o.getFileName;
import o.getJustifye0LSkKk;
import o.getLambda1163195098ui_tooling;
import o.getLambda2086912010ui_tooling;
import o.getLefte0LSkKk;
import o.getRtls_7Xco;
import o.getSpanVerticalAligndo9XGg;
import o.getStates;
import o.getTopD9Ej5fMannotations;
import o.hasDesignInfo;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.makeTreedefault;
import o.maxAllowedForSize;
import o.onMove;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdakX1auGmjk4nKnxFqVYyTYqzkc;
import o.searchAny;
import o.setBrushAndDrawyzxVdVo;
import o.sourceInformationContextOf;
import o.throwInvalidConstraintException;
import o.throwInvalidConstraintsSizeException;
import o.toBitmapConfig1JJdX4A;
import o.valueOfE8nx0Ws;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SwitcherKt$Switcher$2$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwitcherKt$Switcher$2$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.RemoteActionCompatParcelizer = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        setBrushAndDrawyzxVdVo setbrushanddrawyzxvdvo;
        getStates getstates;
        InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
        InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData;
        r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc;
        r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc2;
        r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc3;
        ComposeAnimationState composeAnimationState;
        List list;
        C0204sourceLocation c0204sourceLocation;
        ComposeAnimationState composeAnimationState2;
        List list2;
        List list3;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 21;
        setBrushAndDrawyzxVdVo setbrushanddrawyzxvdvo2 = 0;
        list = null;
        list = null;
        List list4 = null;
        switch (i2) {
            case 0:
                ((TextAlignKt) ((getJustifye0LSkKk) this.MediaMetadataCompat)).serializer.serializer(getLefte0LSkKk.IconCompatParcelizer);
                return createfromparcel;
            case 1:
                CustomBulletSpan customBulletSpan = (CustomBulletSpan) this.MediaMetadataCompat;
                MutableStateFlow mutableStateFlow = customBulletSpan.read;
                Object obj = mutableStateFlow.read();
                setBrushAndDrawyzxVdVo setbrushanddrawyzxvdvo3 = obj instanceof setBrushAndDrawyzxVdVo ? (setBrushAndDrawyzxVdVo) obj : null;
                getApplicationInfo getapplicationinfo = setbrushanddrawyzxvdvo3 != null ? setbrushanddrawyzxvdvo3.RemoteActionCompatParcelizer : null;
                if (getapplicationinfo == null) {
                    Timber.RemoteActionCompatParcelizer.write(new Exception("Customer call data is empty"));
                } else {
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customBulletSpan), null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(customBulletSpan, new getSpanVerticalAligndo9XGg(88, getapplicationinfo.deliveryId, getapplicationinfo.number, (String) null, (String) null, getapplicationinfo.callee, getapplicationinfo.masked), setbrushanddrawyzxvdvo2, i3), 3);
                    Object obj2 = mutableStateFlow.read();
                    if (obj2 instanceof setBrushAndDrawyzxVdVo) {
                        setbrushanddrawyzxvdvo = (setBrushAndDrawyzxVdVo) obj2;
                    }
                    if (setbrushanddrawyzxvdvo2 != 0) {
                        setbrushanddrawyzxvdvo2 = setbrushanddrawyzxvdvo;
                        DrawStyleSpan drawStyleSpan = customBulletSpan.RemoteActionCompatParcelizer;
                        Map map = setbrushanddrawyzxvdvo2.read;
                        drawStyleSpan.getClass();
                        drawStyleSpan.RemoteActionCompatParcelizer.logEvent("deliveries_planner_call_click", onMove.RemoteActionCompatParcelizer(DrawStyleSpan.serializer(map), drawStyleSpan.IconCompatParcelizer.write()));
                    }
                }
                setbrushanddrawyzxvdvo2 = setbrushanddrawyzxvdvo;
                return createfromparcel;
            case 2:
                MutableStateFlow mutableStateFlow2 = ((BaselineShiftCompanion) this.MediaMetadataCompat).RemoteActionCompatParcelizer;
                Object obj3 = mutableStateFlow2.read();
                BaselineShift baselineShift = obj3 instanceof BaselineShift ? (BaselineShift) obj3 : null;
                if (baselineShift != null) {
                    boolean z = baselineShift.read;
                    String str = baselineShift.IconCompatParcelizer;
                    List list5 = baselineShift.write;
                    findMethod findmethod = baselineShift.serializer;
                    List list6 = baselineShift.RemoteActionCompatParcelizer;
                    str.getClass();
                    list6.getClass();
                    mutableStateFlow2.IconCompatParcelizer(new BaselineShift(str, list5, findmethod, !z, list6));
                }
                return createfromparcel;
            case 3:
                ((getCenterPIaL0Z0) ((LineHeightStyleMode) this.MediaMetadataCompat)).IconCompatParcelizer.serializer(accessgetTightcp.RemoteActionCompatParcelizer);
                return createfromparcel;
            case 4:
                TripInformationUiModelImpl tripInformationUiModelImpl = (TripInformationUiModelImpl) ((TripInformationUiModel) this.MediaMetadataCompat);
                if (((accessgetContentOrRtlcp) tripInformationUiModelImpl.MediaBrowserCompatMediaItem.read()) instanceof accessgetContentcp) {
                    TurnByTurnNavigationLogger turnByTurnNavigationLogger = tripInformationUiModelImpl.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
                    BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, null, 2), 3);
                    tripInformationUiModelImpl.IconCompatParcelizer.serializer(combine.serializer);
                } else {
                    int i4 = read + 11;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                }
                return createfromparcel;
            case 5:
                valueOfE8nx0Ws valueofe8nx0ws = (valueOfE8nx0Ws) ((TextDirectionKt) this.MediaMetadataCompat);
                if (valueofe8nx0ws.MediaSessionCompatQueueItem.read() != getRtls_7Xco.DISABLED) {
                    valueofe8nx0ws.RemoteActionCompatParcelizer.serializer(getContentOrRtls_7Xco.read);
                }
                return createfromparcel;
            case 6:
                ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl = (ConfirmButtonV1UiModelImpl) ((ConfirmButtonV1UiModel) this.MediaMetadataCompat);
                Object obj4 = confirmButtonV1UiModelImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.read();
                if (obj4 instanceof getStates) {
                    int i6 = IconCompatParcelizer + 81;
                    read = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        getstates = (getStates) obj4;
                        int i7 = 2 / 0;
                    } else {
                        getstates = (getStates) obj4;
                    }
                } else {
                    getstates = null;
                }
                buildCompositionParentHierarchy buildcompositionparenthierarchy = getstates != null ? getstates.IconCompatParcelizer : null;
                if (buildcompositionparenthierarchy == null) {
                    int i8 = IconCompatParcelizer + 17;
                    read = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ConfirmButtonV1UiModelImpl: The confirmation button is not found!", Timber.RemoteActionCompatParcelizer);
                        int i9 = 50 / 0;
                    } else {
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ConfirmButtonV1UiModelImpl: The confirmation button is not found!", Timber.RemoteActionCompatParcelizer);
                    }
                } else {
                    EmptyGroup emptyGroup = buildcompositionparenthierarchy.doubleConfirmationData;
                    if (emptyGroup == null) {
                        int i10 = IconCompatParcelizer + 53;
                        read = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0) {
                            confirmButtonV1UiModelImpl.RemoteActionCompatParcelizer();
                            throw null;
                        }
                        confirmButtonV1UiModelImpl.RemoteActionCompatParcelizer();
                    } else {
                        confirmButtonV1UiModelImpl.RemoteActionCompatParcelizer.serializer(new AnimationDebugMutableState(emptyGroup.title, emptyGroup.skipButtonTitle, emptyGroup.doneButtonTitle));
                    }
                }
                return createfromparcel;
            case 7:
                ((getLambda1163195098ui_tooling) this.MediaMetadataCompat).read.serializer(ComposableSingletonsPreviewActivity_androidKt.serializer);
                return createfromparcel;
            case 8:
                ((getLambda1163195098ui_tooling) this.MediaMetadataCompat).read.serializer(getLambda2086912010ui_tooling.IconCompatParcelizer);
                return createfromparcel;
            case 9:
                ContactRiderViewModel contactRiderViewModel = (ContactRiderViewModel) this.MediaMetadataCompat;
                Object obj5 = contactRiderViewModel.IconCompatParcelizer.read();
                hasDesignInfo hasdesigninfo = obj5 instanceof hasDesignInfo ? (hasDesignInfo) obj5 : null;
                if (hasdesigninfo != null && (instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet = hasdesigninfo.write) != null && (instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.IconCompatParcelizer) != null) {
                    list4 = instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.read;
                }
                contactRiderViewModel.read.write(list4);
                contactRiderViewModel.serializer.serializer(getFileName.read);
                return createfromparcel;
            case 10:
                ((CardCashPaymentTaskUiModelImpl) this.MediaMetadataCompat).serializer(new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(5));
                return createfromparcel;
            case 11:
                CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl = (CardCashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                cardCashPaymentTaskUiModelImpl.getClass();
                cardCashPaymentTaskUiModelImpl.serializer(new accesssetApiAvailablecp(cardCashPaymentTaskUiModelImpl, 0));
                return createfromparcel;
            case 12:
                CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl2 = (CardCashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                cardCashPaymentTaskUiModelImpl2.getClass();
                cardCashPaymentTaskUiModelImpl2.serializer(new accesssetApiAvailablecp(cardCashPaymentTaskUiModelImpl2, 2));
                return createfromparcel;
            case 13:
                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = (CashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl.serializer, null, null, new CashPaymentTaskUiModelImpl.AnonymousClass2(cashPaymentTaskUiModelImpl, null, 4), 3);
                return createfromparcel;
            case 14:
                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl2 = (CashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl2.serializer, null, null, new CashPaymentTaskUiModelImpl.AnonymousClass2(cashPaymentTaskUiModelImpl2, null, 2), 3);
                return createfromparcel;
            case 15:
                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl3 = (CashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl3.serializer, null, null, new CashPaymentTaskUiModelImpl.AnonymousClass2(cashPaymentTaskUiModelImpl3, null, 3), 3);
                return createfromparcel;
            case 16:
                ((attachAllAnimationslambda04) this.MediaMetadataCompat).read();
                return createfromparcel;
            case 17:
                ((CustomerUnavailableViewModel) this.MediaMetadataCompat).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(searchAny.IconCompatParcelizer);
                return createfromparcel;
            case 18:
                CustomerUnavailableViewModel customerUnavailableViewModel = (CustomerUnavailableViewModel) this.MediaMetadataCompat;
                makeTreedefault maketreedefault = (makeTreedefault) customerUnavailableViewModel.write.read();
                if (maketreedefault != null && (r8lambdakx1augmjk4nknxfqvyytyqzkc = maketreedefault.customerData) != null) {
                    JoinedKey joinedKey = r8lambdakx1augmjk4nknxfqvyytyqzkc.customerChat;
                    if (joinedKey == null) {
                        Timber.RemoteActionCompatParcelizer.read("Customer chat data is empty", new Object[0]);
                    } else {
                        customerUnavailableViewModel.ParcelableVolumeInfo().read(customerUnavailableViewModel.MediaSessionCompatToken.RemoteActionCompatParcelizer(customerUnavailableViewModel.IconCompatParcelizer()));
                        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModel), null, null, new SwitcherUiModelImpl$1.AnonymousClass1(customerUnavailableViewModel, joinedKey, setbrushanddrawyzxvdvo2, 24), 3);
                    }
                }
                return createfromparcel;
            case 19:
                CustomerUnavailableViewModel customerUnavailableViewModel2 = (CustomerUnavailableViewModel) this.MediaMetadataCompat;
                makeTreedefault maketreedefault2 = (makeTreedefault) customerUnavailableViewModel2.write.read();
                if (maketreedefault2 != null && (r8lambdakx1augmjk4nknxfqvyytyqzkc2 = maketreedefault2.customerData) != null) {
                    getCompared getcompared = r8lambdakx1augmjk4nknxfqvyytyqzkc2.customerCall;
                    if (getcompared == null) {
                        Timber.RemoteActionCompatParcelizer.read("Customer call data is empty", new Object[0]);
                    } else {
                        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModel2), null, null, new PerseusLogger$w$1(customerUnavailableViewModel2, new getSpanVerticalAligndo9XGg(88, customerUnavailableViewModel2.IconCompatParcelizer(), getcompared.write, (String) null, (String) null, getcompared.RemoteActionCompatParcelizer, getcompared.IconCompatParcelizer), getcompared, null, 29), 3);
                    }
                }
                return createfromparcel;
            case 20:
                CustomerUnavailableViewModel customerUnavailableViewModel3 = (CustomerUnavailableViewModel) this.MediaMetadataCompat;
                makeTreedefault maketreedefault3 = (makeTreedefault) customerUnavailableViewModel3.write.read();
                if (maketreedefault3 != null && (r8lambdakx1augmjk4nknxfqvyytyqzkc3 = maketreedefault3.customerData) != null) {
                    ParameterInformation parameterInformation = r8lambdakx1augmjk4nknxfqvyytyqzkc3.customerChatAndCall;
                    if (parameterInformation == null) {
                        int i11 = IconCompatParcelizer + 89;
                        read = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        Timber.RemoteActionCompatParcelizer.read("Customer chat and call data is empty", new Object[0]);
                    } else {
                        customerUnavailableViewModel3.ParcelableVolumeInfo().read(customerUnavailableViewModel3.MediaSessionCompatToken.RemoteActionCompatParcelizer(customerUnavailableViewModel3.IconCompatParcelizer()));
                        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModel3), null, null, new SwitcherUiModelImpl$1.AnonymousClass1(customerUnavailableViewModel3, parameterInformation, setbrushanddrawyzxvdvo2, 23), 3);
                    }
                }
                return createfromparcel;
            case 21:
                CustomerUnavailableViewModel customerUnavailableViewModel4 = (CustomerUnavailableViewModel) this.MediaMetadataCompat;
                customerUnavailableViewModel4.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModel4), null, null, new QrCodeScanTaskUiModelImpl$1(customerUnavailableViewModel4, setbrushanddrawyzxvdvo2, 12), 3);
                return createfromparcel;
            case 22:
                ((CustomerUnavailableViewModelV2) this.MediaMetadataCompat).ComponentActivity.serializer(AnimationSearchAnimateXAsStateSearch.write);
                return createfromparcel;
            case 23:
                accessgetInfinitycp accessgetinfinitycp = (accessgetInfinitycp) this.MediaMetadataCompat;
                Object obj6 = accessgetinfinitycp.write.read();
                DensityDefaultImpls densityDefaultImpls = obj6 instanceof DensityDefaultImpls ? (DensityDefaultImpls) obj6 : null;
                sourceInformationContextOf sourceinformationcontextof = densityDefaultImpls != null ? densityDefaultImpls.IconCompatParcelizer : null;
                if (sourceinformationcontextof != null && (composeAnimationState = sourceinformationcontextof.scanCodesButton) != null && (list = composeAnimationState.trackingEvents) != null) {
                    int i13 = IconCompatParcelizer + 111;
                    read = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        MultipleCodeScanEventLoggerImpl multipleCodeScanEventLoggerImpl = accessgetinfinitycp.MediaMetadataCompat;
                        multipleCodeScanEventLoggerImpl.getClass();
                        multipleCodeScanEventLoggerImpl.serializer(list, Trigger.DELIVERIES_TASK_CLICK);
                        throw null;
                    }
                    MultipleCodeScanEventLoggerImpl multipleCodeScanEventLoggerImpl2 = accessgetinfinitycp.MediaMetadataCompat;
                    multipleCodeScanEventLoggerImpl2.getClass();
                    multipleCodeScanEventLoggerImpl2.serializer(list, Trigger.DELIVERIES_TASK_CLICK);
                }
                accessgetinfinitycp.read.serializer(new throwInvalidConstraintException(accessgetinfinitycp.IconCompatParcelizer, accessgetinfinitycp.serializer, accessgetinfinitycp.MediaBrowserCompatMediaItem));
                return createfromparcel;
            case 24:
                ((accessgetInfinitycp) this.MediaMetadataCompat).read.serializer(throwInvalidConstraintsSizeException.RemoteActionCompatParcelizer);
                return createfromparcel;
            case 25:
                ((CodeScanViewModel) this.MediaMetadataCompat).MediaBrowserCompatMediaItem.serializer(maxAllowedForSize.IconCompatParcelizer);
                return createfromparcel;
            case 26:
                CodeScanViewModel codeScanViewModel = (CodeScanViewModel) this.MediaMetadataCompat;
                sourceInformationContextOf sourceinformationcontextofRemoteActionCompatParcelizer = codeScanViewModel.RemoteActionCompatParcelizer();
                if (sourceinformationcontextofRemoteActionCompatParcelizer != null) {
                    int i14 = IconCompatParcelizer + 21;
                    read = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        SlotTreeKtExternalSyntheticLambda0 slotTreeKtExternalSyntheticLambda0 = sourceinformationcontextofRemoteActionCompatParcelizer.codeScanScreenUiItem;
                        setbrushanddrawyzxvdvo2.hashCode();
                        throw null;
                    }
                    SlotTreeKtExternalSyntheticLambda0 slotTreeKtExternalSyntheticLambda1 = sourceinformationcontextofRemoteActionCompatParcelizer.codeScanScreenUiItem;
                    if (slotTreeKtExternalSyntheticLambda1 != null && (c0204sourceLocation = slotTreeKtExternalSyntheticLambda1.scannedItemsDialog) != null && (composeAnimationState2 = c0204sourceLocation.closeButton) != null && (list2 = composeAnimationState2.trackingEvents) != null) {
                        int i15 = read + 83;
                        IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        MultipleCodeScanEventLoggerImpl multipleCodeScanEventLoggerImpl3 = codeScanViewModel.MediaDescriptionCompat;
                        multipleCodeScanEventLoggerImpl3.getClass();
                        multipleCodeScanEventLoggerImpl3.serializer(list2, Trigger.BUTTON_CLICK);
                    }
                }
                return createfromparcel;
            case 27:
                CodeScanViewModel codeScanViewModel2 = (CodeScanViewModel) this.MediaMetadataCompat;
                sourceInformationContextOf sourceinformationcontextofRemoteActionCompatParcelizer2 = codeScanViewModel2.RemoteActionCompatParcelizer();
                if (sourceinformationcontextofRemoteActionCompatParcelizer2 != null) {
                    int i17 = IconCompatParcelizer + 59;
                    read = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    SlotTreeKtExternalSyntheticLambda0 slotTreeKtExternalSyntheticLambda2 = sourceinformationcontextofRemoteActionCompatParcelizer2.codeScanScreenUiItem;
                    if (slotTreeKtExternalSyntheticLambda2 != null) {
                        int i19 = IconCompatParcelizer + 75;
                        read = i19 % Fields.SpotShadowColor;
                        if (i19 % 2 == 0) {
                            ComposeAnimationState composeAnimationState3 = slotTreeKtExternalSyntheticLambda2.extraCodeCloseButton;
                            throw null;
                        }
                        ComposeAnimationState composeAnimationState4 = slotTreeKtExternalSyntheticLambda2.extraCodeCloseButton;
                        if (composeAnimationState4 != null && (list3 = composeAnimationState4.trackingEvents) != null) {
                            MultipleCodeScanEventLoggerImpl multipleCodeScanEventLoggerImpl4 = codeScanViewModel2.MediaDescriptionCompat;
                            multipleCodeScanEventLoggerImpl4.getClass();
                            multipleCodeScanEventLoggerImpl4.serializer(list3, Trigger.BUTTON_CLICK);
                        }
                    }
                }
                return createfromparcel;
            case 28:
                PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl = (PickUpDropOffTasksUiModelV2Impl) ((PickUpDropOffTasksUiModelV2) this.MediaMetadataCompat);
                BuildersKt.RemoteActionCompatParcelizer(pickUpDropOffTasksUiModelV2Impl.MediaBrowserCompatMediaItem, null, null, new PickUpDropOffTasksUiModelV2Impl.AnonymousClass1(pickUpDropOffTasksUiModelV2Impl, null, 2), 3);
                return createfromparcel;
            default:
                getTopD9Ej5fMannotations gettopd9ej5fmannotations = (getTopD9Ej5fMannotations) this.MediaMetadataCompat;
                gettopd9ej5fmannotations.getClass();
                gettopd9ej5fmannotations.serializer(new copya9UjIt4(gettopd9ej5fmannotations, 0));
                gettopd9ej5fmannotations.serializer.serializer(new DpOffsetCompanion(gettopd9ej5fmannotations.MediaBrowserCompatMediaItem, gettopd9ej5fmannotations.RatingCompat, gettopd9ej5fmannotations.MediaSessionCompatToken));
                return createfromparcel;
        }
    }
}
