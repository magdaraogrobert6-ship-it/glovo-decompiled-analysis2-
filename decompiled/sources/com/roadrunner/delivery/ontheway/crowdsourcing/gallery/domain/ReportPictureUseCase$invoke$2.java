package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import bo.app.d0$$ExternalSyntheticLambda4;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineWithAcceptanceRateBottomSheet;
import com.roadrunner.delivery.accept.individualEarnings.api.presentation.IndividualEarningsUiModel;
import com.roadrunner.delivery.accept.individualEarnings.presentation.IndividualEarningsUiModelImpl;
import com.roadrunner.delivery.accept.laststop.api.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModel;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.header.api.DestinationHeaderUiModel;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.DestinationHeaderUiModelImpl;
import com.roadrunner.delivery.ontheway.tripplanner.actions.api.navigator.ActionsParams;
import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.TripPlannerActionsFragment;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.TripInformationUiModel;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.TripInformationUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.DoubleConfirmationFragment;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderViewModel;
import com.roadrunner.domain.util.IsFixableByRetry;
import io.sentry.hints.MediaSessionCompatQueueItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import o.BaselineShiftCompanion;
import o.BrazeExternalSyntheticLambda45;
import o.ComposableSingletonsPreviewActivity_androidKt;
import o.CoroutineLiveDataExternalSyntheticLambda0;
import o.CustomBulletSpan;
import o.DrawStyleSpan;
import o.EditingBufferCompanion;
import o.ImeOptions;
import o.IndentationFixSpan_androidKtWhenMappings;
import o.InputMethodManager;
import o.InputMethodManagerImplimm2;
import o.LetterSpacingSpanPx;
import o.NullableInputConnectionWrapperApi34;
import o.OffsetMappingCompanion;
import o.PasswordVisualTransformation;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactory33;
import o.TextIndentCompanion;
import o.TextInputServiceAndroidTextInputCommand;
import o.TextStyleKt;
import o.TypefaceResult;
import o.TypefaceResultAsync;
import o.accessgetCursorAnchorInfoControllerp;
import o.accessgetSentencescp;
import o.accessgetStaticLayoutConstructorcp;
import o.accessgetWordscp;
import o.accesssetStaticLayoutConstructorcp;
import o.chooseHeight;
import o.clipOutRect;
import o.commitCompositionui_text;
import o.copyNB67dxo;
import o.createFromParcel;
import o.deleteui_text;
import o.div7Ah8Wj8;
import o.getApplicationInfo;
import o.getBaseInputConnection;
import o.getCharactersIUNYP9k;
import o.getCieXyz;
import o.getDefaulteUduSuo;
import o.getDesignInfoMethodOrNull;
import o.getFirstLineXSAIIZE;
import o.getGestureThresholdActivate5zf0vsI;
import o.getHeightPx;
import o.getLambda2086912010ui_tooling;
import o.getLineThrough;
import o.getMBufferStateui_text;
import o.getNoneIUNYP9k;
import o.getOutline;
import o.getOwnerViewId;
import o.getPlatformLocaleDelegate;
import o.getSUPPRESSannotations;
import o.getSentencesIUNYP9k;
import o.getShaderBrush;
import o.getSizeui_text;
import o.getSpanVerticalAligndo9XGg;
import o.getSpanVerticalAligndo9XGgannotations;
import o.getUnspecifiedeUduSuo;
import o.getWordsIUNYP9kannotations;
import o.hasDesignInfo;
import o.invokeComposable;
import o.invokeyxL6bBk;
import o.isAppSetIdReadingEnabled;
import o.isEditorFocused;
import o.isIncludeFontPaddingEnabled;
import o.isOpaque;
import o.isValidTimeZone;
import o.notifyFocusedRect;
import o.nowInMillisecondslambda0;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.processInputCommands;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaLZjsjPSXWRendXZH98LKrH6PSs;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.resolveTextDirectionIhaHGbI;
import o.setBrushAndDrawyzxVdVo;
import o.setNativeShader;
import o.setPathOutline;
import o.toAndroidCapBeK7IIE;
import o.toAndroidJoinWw9F2mQ;
import o.toBitmapConfig1JJdX4A;
import o.toStringForLog;
import o.updateExtractedText;
import o.updateSelection;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReportPictureUseCase$invoke$2 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportPictureUseCase$invoke$2(LasagnaDeclineWithAcceptanceRateBottomSheet lasagnaDeclineWithAcceptanceRateBottomSheet, int i) {
        super(1, 0, LasagnaDeclineWithAcceptanceRateBottomSheet.class, lasagnaDeclineWithAcceptanceRateBottomSheet, "updateUi", "updateUi(Lcom/roadrunner/delivery/accept/declinebutton/presentation/LasagnaDeclineBottomSheetViewState;)V");
        this.read = i;
        if (i != 2) {
        } else {
            super(1, 0, LasagnaDeclineWithAcceptanceRateBottomSheet.class, lasagnaDeclineWithAcceptanceRateBottomSheet, "handleMessageDialogAction", "handleMessageDialogAction(Lcom/ui/common/widget/message_dialog/MessageDialogViewModel$ResultAction;)V");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReportPictureUseCase$invoke$2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.read = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportPictureUseCase$invoke$2(IndividualEarningsUiModel individualEarningsUiModel) {
        super(1, 0, IndividualEarningsUiModel.class, individualEarningsUiModel, "onPageSelected", "onPageSelected(I)V");
        this.read = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportPictureUseCase$invoke$2(TripPlannerActionsFragment tripPlannerActionsFragment) {
        super(1, 0, TripPlannerActionsFragment.class, tripPlannerActionsFragment, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/delivery/ontheway/tripplanner/actions/presentation/NavigationAction;)V");
        this.read = 23;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportPictureUseCase$invoke$2(DoubleConfirmationFragment doubleConfirmationFragment) {
        super(1, 0, DoubleConfirmationFragment.class, doubleConfirmationFragment, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/delivery/pickupdropoff/confirmbutton/presentation/DoubleConfirmationEvent;)V");
        this.read = 27;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:272:0x0800 A[PHI: r0
  0x0800: PHI (r0v135 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) = 
  (r0v134 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet)
  (r0v137 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet)
 binds: [B:271:0x07fe, B:268:0x07f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:274:0x0804  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r9v32 */
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
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        LayoutTileBinding layoutTileBinding;
        resolveTextDirectionIhaHGbI resolvetextdirectionihahgbi;
        Object obj2;
        StaticLayoutFactory33 accessgetstaticlayoutconstructorcp;
        Object obj3;
        IndentationFixSpan_androidKtWhenMappings chooseheight;
        Object obj4;
        OffsetMappingCompanion offsetMappingCompanion;
        NullableInputConnectionWrapperApi34 nullableInputConnectionWrapperApi34;
        Object obj5;
        long j;
        List list;
        InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
        InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2;
        InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 24;
        int i4 = 0;
        resolveTextDirectionIhaHGbI resolvetextdirectionihahgbi2 = 0;
        list = null;
        list = null;
        list = null;
        List list2 = null;
        lValueOf = null;
        Long lValueOf = null;
        setBrushAndDrawyzxVdVo setbrushanddrawyzxvdvo = null;
        switch (i2) {
            case 0:
                Exception exc = (Exception) obj;
                exc.getClass();
                getDefaulteUduSuo getdefaulteudusuo = (getDefaulteUduSuo) this.MediaMetadataCompat;
                getdefaulteudusuo.getClass();
                getdefaulteudusuo.write("endpoint_issue_crowdsourcing_report", exc);
                return createfromparcel;
            case 1:
                clipOutRect clipoutrect = (clipOutRect) obj;
                clipoutrect.getClass();
                LasagnaDeclineWithAcceptanceRateBottomSheet lasagnaDeclineWithAcceptanceRateBottomSheet = (LasagnaDeclineWithAcceptanceRateBottomSheet) this.MediaMetadataCompat;
                lasagnaDeclineWithAcceptanceRateBottomSheet.getClass();
                TextStyleKt textStyleKt = clipoutrect.write;
                if (textStyleKt instanceof resolveTextDirectionIhaHGbI) {
                    resolvetextdirectionihahgbi = (resolveTextDirectionIhaHGbI) textStyleKt;
                }
                if (resolvetextdirectionihahgbi2 != 0 && (layoutTileBinding = lasagnaDeclineWithAcceptanceRateBottomSheet.getNavigationEventDispatcher) != null) {
                    resolvetextdirectionihahgbi2 = resolvetextdirectionihahgbi;
                    ((TextView) layoutTileBinding.read).setText(resolvetextdirectionihahgbi2.serializer);
                    ((getSUPPRESSannotations) layoutTileBinding.RemoteActionCompatParcelizer).setText(resolvetextdirectionihahgbi2.write);
                    ((getSUPPRESSannotations) layoutTileBinding.write).setText(resolvetextdirectionihahgbi2.read);
                }
                resolvetextdirectionihahgbi2 = resolvetextdirectionihahgbi;
                resolvetextdirectionihahgbi2 = resolvetextdirectionihahgbi;
                return createfromparcel;
            case 2:
                nowInMillisecondslambda0 nowinmillisecondslambda0 = (nowInMillisecondslambda0) obj;
                nowinmillisecondslambda0.getClass();
                LasagnaDeclineWithAcceptanceRateBottomSheet lasagnaDeclineWithAcceptanceRateBottomSheet2 = (LasagnaDeclineWithAcceptanceRateBottomSheet) this.MediaMetadataCompat;
                if (nowinmillisecondslambda0 instanceof isValidTimeZone) {
                    lasagnaDeclineWithAcceptanceRateBottomSheet2.serializer().MediaDescriptionCompat();
                } else {
                    lasagnaDeclineWithAcceptanceRateBottomSheet2.getClass();
                }
                return createfromparcel;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                MutableStateFlow mutableStateFlow = ((IndividualEarningsUiModelImpl) ((IndividualEarningsUiModel) this.MediaMetadataCompat)).RemoteActionCompatParcelizer;
                do {
                    obj2 = mutableStateFlow.read();
                    accessgetstaticlayoutconstructorcp = (StaticLayoutFactory33) obj2;
                    if (accessgetstaticlayoutconstructorcp instanceof accessgetStaticLayoutConstructorcp) {
                        accessgetStaticLayoutConstructorcp accessgetstaticlayoutconstructorcp2 = (accessgetStaticLayoutConstructorcp) accessgetstaticlayoutconstructorcp;
                        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = accessgetstaticlayoutconstructorcp2.IconCompatParcelizer;
                        accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcp = (accesssetStaticLayoutConstructorcp) onContentCardDismissed.read(iIntValue, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = accessgetstaticlayoutconstructorcp2.write;
                        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2.getClass();
                        accessgetstaticlayoutconstructorcp = new accessgetStaticLayoutConstructorcp(iIntValue, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, accesssetstaticlayoutconstructorcp);
                    }
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, accessgetstaticlayoutconstructorcp));
                return createfromparcel;
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl = (LastStopSelectionBottomSheetUiModelImpl) ((LastStopSelectionBottomSheetUiModel) this.MediaMetadataCompat);
                isOpaque isopaque = (isOpaque) lastStopSelectionBottomSheetUiModelImpl.MediaSessionCompatResultReceiverWrapper.read();
                ContextScope contextScope = lastStopSelectionBottomSheetUiModelImpl.serializer;
                BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new LastStopSelectionBottomSheetUiModelImpl$onSetRecentLocationClick$1(iIntValue2, isopaque, lastStopSelectionBottomSheetUiModelImpl, null), 3);
                BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new BridgeManager$trackEvent$2(iIntValue2, isopaque, lastStopSelectionBottomSheetUiModelImpl, (ShortNewsContentCardView) null), 3);
                return createfromparcel;
            case 5:
                String str = (String) obj;
                str.getClass();
                getHeightPx getheightpx = (getHeightPx) this.MediaMetadataCompat;
                getheightpx.getClass();
                MutableStateFlow mutableStateFlow2 = getheightpx.write;
                IndentationFixSpan_androidKtWhenMappings indentationFixSpan_androidKtWhenMappings = (IndentationFixSpan_androidKtWhenMappings) mutableStateFlow2.read();
                if (indentationFixSpan_androidKtWhenMappings instanceof chooseHeight) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((chooseHeight) indentationFixSpan_androidKtWhenMappings).read, str}, getCieXyz.write())).booleanValue()) {
                        do {
                            obj3 = mutableStateFlow2.read();
                            chooseheight = (IndentationFixSpan_androidKtWhenMappings) obj3;
                            chooseHeight chooseheight2 = !(chooseheight instanceof chooseHeight) ? null : (chooseHeight) chooseheight;
                            if (chooseheight2 != null) {
                                String str2 = chooseheight2.write;
                                String str3 = chooseheight2.IconCompatParcelizer;
                                LetterSpacingSpanPx letterSpacingSpanPx = chooseheight2.serializer;
                                str2.getClass();
                                str3.getClass();
                                chooseheight = new chooseHeight(str2, str3, letterSpacingSpanPx, str);
                            }
                        } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj3, chooseheight));
                        BuildersKt.RemoteActionCompatParcelizer(getheightpx.RemoteActionCompatParcelizer, null, null, new BridgeManager$trackEvent$2(getheightpx, str, (ShortNewsContentCardView) resolvetextdirectionihahgbi2, i3), 3);
                    }
                }
                return createfromparcel;
            case 6:
                Throwable th = (Throwable) obj;
                th.getClass();
                InAppCameraWithTagsFragment inAppCameraWithTagsFragment = (InAppCameraWithTagsFragment) this.MediaMetadataCompat;
                inAppCameraWithTagsFragment.getClass();
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "InAppCameraWithTagsFragment: Unable to capture the picture.", new Object[0]);
                inAppCameraWithTagsFragment.serializer().serializer();
                return createfromparcel;
            case 7:
                getSizeui_text getsizeui_text = (getSizeui_text) obj;
                getsizeui_text.getClass();
                InAppCameraWithTagsFragment inAppCameraWithTagsFragment2 = (InAppCameraWithTagsFragment) this.MediaMetadataCompat;
                inAppCameraWithTagsFragment2.getClass();
                if (!getsizeui_text.equals(TypefaceResultAsync.write)) {
                    if (!(getsizeui_text instanceof TypefaceResult)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    inAppCameraWithTagsFragment2.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{new onViewAttachedToWindowlambda0[]{new onViewAttachedToWindowlambda0("InAppCameraWithTagsFragment_screen_data", ((TypefaceResult) getsizeui_text).write)}}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320), "InAppCameraWithTagsFragment");
                    inAppCameraWithTagsFragment2.read(false, false);
                    return createfromparcel;
                }
                int i5 = serializer + 117;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (!inAppCameraWithTagsFragment2.isAdded() || !inAppCameraWithTagsFragment2.isResumed() || inAppCameraWithTagsFragment2.isDetached() || inAppCameraWithTagsFragment2.getChildFragmentManager().findFragmentByTag("error_dialog_tag") != null) {
                    return createfromparcel;
                }
                MediaSessionCompatQueueItem.IconCompatParcelizer(inAppCameraWithTagsFragment2.getString(R.string.take_better_picture_failure_dialog_message_title), inAppCameraWithTagsFragment2.getString(R.string.take_better_picture_failure_dialog_message_description), inAppCameraWithTagsFragment2.getString(R.string.take_better_picture_failure_dialog_retry_button_text), null, null, false, false, true, 376).RemoteActionCompatParcelizer(inAppCameraWithTagsFragment2.getChildFragmentManager(), "error_dialog_tag");
                return createfromparcel;
            case 8:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                InAppCameraWithTagsFragment inAppCameraWithTagsFragment3 = (InAppCameraWithTagsFragment) this.MediaMetadataCompat;
                inAppCameraWithTagsFragment3.getClass();
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th2, "InAppCameraWithTagsFragment: Unable to capture the picture.", new Object[0]);
                inAppCameraWithTagsFragment3.serializer().serializer();
                return createfromparcel;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                EditingBufferCompanion editingBufferCompanion = (EditingBufferCompanion) this.MediaMetadataCompat;
                toStringForLog tostringforlog = editingBufferCompanion.IconCompatParcelizer;
                StateFlow stateFlow = editingBufferCompanion.MediaSessionCompatResultReceiverWrapper;
                getMBufferStateui_text getmbufferstateui_text = (getMBufferStateui_text) ((Map) stateFlow.read()).get(str4);
                if (getmbufferstateui_text == null) {
                    return createfromparcel;
                }
                if (!editingBufferCompanion.ParcelableVolumeInfo && getmbufferstateui_text.RemoteActionCompatParcelizer().size() > 1) {
                    editingBufferCompanion.ParcelableVolumeInfo = true;
                    getOutline getoutlineWrite = editingBufferCompanion.read.write(editingBufferCompanion.ParcelableVolumeInfo, false, (Map) stateFlow.read());
                    editingBufferCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(true ^ (getoutlineWrite instanceof getOwnerViewId)));
                    editingBufferCompanion.serializer.IconCompatParcelizer(getoutlineWrite);
                    if (!(getmbufferstateui_text instanceof commitCompositionui_text)) {
                        return createfromparcel;
                    }
                    tostringforlog.RemoteActionCompatParcelizer(((commitCompositionui_text) getmbufferstateui_text).IconCompatParcelizer, "chat_notification_expanded");
                    return createfromparcel;
                }
                if (getmbufferstateui_text instanceof commitCompositionui_text) {
                    commitCompositionui_text commitcompositionui_text = (commitCompositionui_text) getmbufferstateui_text;
                    editingBufferCompanion.RatingCompat.IconCompatParcelizer(commitcompositionui_text.MediaDescriptionCompat, false);
                    tostringforlog.read(Long.valueOf(commitcompositionui_text.IconCompatParcelizer), setPathOutline.CUSTOMER);
                    return createfromparcel;
                }
                if (!(getmbufferstateui_text instanceof deleteui_text)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                getGestureThresholdActivate5zf0vsI.read(editingBufferCompanion.MediaDescriptionCompat);
                tostringforlog.read(null, setPathOutline.DISPATCHER);
                return createfromparcel;
            case 10:
                Exception exc2 = (Exception) obj;
                exc2.getClass();
                getDefaulteUduSuo getdefaulteudusuo2 = (getDefaulteUduSuo) this.MediaMetadataCompat;
                getdefaulteudusuo2.getClass();
                getdefaulteudusuo2.write("endpoint_issue_crowdsourcing_vote", exc2);
                return createfromparcel;
            case 11:
                String str5 = (String) obj;
                str5.getClass();
                notifyFocusedRect notifyfocusedrect = (notifyFocusedRect) this.MediaMetadataCompat;
                notifyfocusedrect.getClass();
                MutableStateFlow mutableStateFlow3 = notifyfocusedrect.read;
                do {
                    obj4 = mutableStateFlow3.read();
                    offsetMappingCompanion = (OffsetMappingCompanion) obj4;
                    nullableInputConnectionWrapperApi34 = offsetMappingCompanion.RemoteActionCompatParcelizer;
                } while (!mutableStateFlow3.RemoteActionCompatParcelizer(obj4, OffsetMappingCompanion.read(offsetMappingCompanion, null, null, false, null, nullableInputConnectionWrapperApi34 != null ? NullableInputConnectionWrapperApi34.serializer(nullableInputConnectionWrapperApi34, str5, false, 5) : null, false, 47)));
                return createfromparcel;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                notifyFocusedRect notifyfocusedrect2 = (notifyFocusedRect) this.MediaMetadataCompat;
                notifyfocusedrect2.getClass();
                if (!zBooleanValue) {
                    notifyfocusedrect2.IconCompatParcelizer(ImeOptions.LIKE);
                }
                notifyfocusedrect2.IconCompatParcelizer(zBooleanValue ? PasswordVisualTransformation.LIKE_UNPRESSED : PasswordVisualTransformation.LIKE_PRESSED);
                return createfromparcel;
            case 13:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                notifyFocusedRect notifyfocusedrect3 = (notifyFocusedRect) this.MediaMetadataCompat;
                notifyfocusedrect3.getClass();
                if (!zBooleanValue2) {
                    notifyfocusedrect3.IconCompatParcelizer(ImeOptions.DISLIKE);
                }
                notifyfocusedrect3.IconCompatParcelizer(zBooleanValue2 ? PasswordVisualTransformation.DISLIKE_UNPRESSED : PasswordVisualTransformation.DISLIKE_PRESSED);
                return createfromparcel;
            case 14:
                String str6 = (String) obj;
                str6.getClass();
                notifyFocusedRect notifyfocusedrect4 = (notifyFocusedRect) this.MediaMetadataCompat;
                notifyfocusedrect4.getClass();
                Object obj6 = notifyfocusedrect4.MediaMetadataCompat.read();
                updateExtractedText updateextractedtext = obj6 instanceof updateExtractedText ? (updateExtractedText) obj6 : null;
                if (updateextractedtext != null) {
                    r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3 = updateextractedtext.MediaSessionCompatQueueItem;
                    Iterator it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = -1;
                        } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((InputMethodManager) it.next()).RemoteActionCompatParcelizer, updateextractedtext.PlaybackStateCompat}, getCieXyz.write())).booleanValue()) {
                            i7++;
                        }
                    }
                    Iterator it2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            int i8 = serializer + 121;
                            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((InputMethodManager) it2.next()).RemoteActionCompatParcelizer, str6}, getCieXyz.write())).booleanValue()) {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                        }
                    }
                    if (i7 != -1 && i4 != -1 && i7 != i4) {
                        int i10 = RemoteActionCompatParcelizer + 23;
                        serializer = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 != 0) {
                            resolvetextdirectionihahgbi2.hashCode();
                            throw null;
                        }
                        notifyfocusedrect4.RemoteActionCompatParcelizer.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3.size(), i4 > i7 ? ImeOptions.SWIPE_LEFT : ImeOptions.SWIPE_RIGHT);
                    }
                }
                MutableStateFlow mutableStateFlow4 = notifyfocusedrect4.read;
                do {
                    obj5 = mutableStateFlow4.read();
                } while (!mutableStateFlow4.RemoteActionCompatParcelizer(obj5, OffsetMappingCompanion.read((OffsetMappingCompanion) obj5, str6, null, false, null, null, false, 62)));
                return createfromparcel;
            case 15:
                Exception exc3 = (Exception) obj;
                exc3.getClass();
                getDefaulteUduSuo getdefaulteudusuo3 = (getDefaulteUduSuo) this.MediaMetadataCompat;
                getdefaulteudusuo3.getClass();
                getdefaulteudusuo3.write("endpoint_issue_crowdsourcing_upload", exc3);
                return createfromparcel;
            case 16:
                String str7 = (String) obj;
                str7.getClass();
                isEditorFocused iseditorfocused = (isEditorFocused) this.MediaMetadataCompat;
                ArrayList arrayList = iseditorfocused.read;
                MutableStateFlow mutableStateFlow5 = iseditorfocused.IconCompatParcelizer;
                Object obj7 = mutableStateFlow5.read();
                getBaseInputConnection getbaseinputconnection = obj7 instanceof getBaseInputConnection ? (getBaseInputConnection) obj7 : null;
                if (getbaseinputconnection != null) {
                    onContentCardDismissed.write((List) arrayList, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new d0$$ExternalSyntheticLambda4(str7, 20));
                    iseditorfocused.RatingCompat.read(getUnspecifiedeUduSuo.DELETE_IMAGE);
                    boolean zIsEmpty = arrayList.isEmpty();
                    int i11 = getbaseinputconnection.IconCompatParcelizer;
                    if (zIsEmpty) {
                        mutableStateFlow5.IconCompatParcelizer(new processInputCommands(i11, getbaseinputconnection.MediaMetadataCompat, getbaseinputconnection.serializer, getbaseinputconnection.MediaSessionCompatQueueItem, getbaseinputconnection.read, getbaseinputconnection.RatingCompat));
                        iseditorfocused.MediaDescriptionCompat.serializer(accessgetCursorAnchorInfoControllerp.serializer);
                    } else {
                        mutableStateFlow5.IconCompatParcelizer(getBaseInputConnection.serializer(getbaseinputconnection, iseditorfocused.write(i11), false, 510));
                    }
                }
                return createfromparcel;
            case 17:
                getNoneIUNYP9k getnoneiunyp9k = (getNoneIUNYP9k) obj;
                getnoneiunyp9k.getClass();
                TermsAndConditionsFragment termsAndConditionsFragment = (TermsAndConditionsFragment) this.MediaMetadataCompat;
                termsAndConditionsFragment.getClass();
                getCharactersIUNYP9k getcharactersiunyp9k = getCharactersIUNYP9k.RemoteActionCompatParcelizer;
                if (getnoneiunyp9k.equals(getcharactersiunyp9k)) {
                    termsAndConditionsFragment.write();
                    return createfromparcel;
                }
                if (getnoneiunyp9k instanceof getSentencesIUNYP9k) {
                    TextInputServiceAndroidTextInputCommand textInputServiceAndroidTextInputCommandSerializer = termsAndConditionsFragment.serializer();
                    FragmentActivity fragmentActivityRequireActivity = termsAndConditionsFragment.requireActivity();
                    fragmentActivityRequireActivity.getClass();
                    InputMethodManagerImplimm2 inputMethodManagerImplimm2 = ((getSentencesIUNYP9k) getnoneiunyp9k).IconCompatParcelizer;
                    inputMethodManagerImplimm2.getClass();
                    textInputServiceAndroidTextInputCommandSerializer.serializer.serializer(getcharactersiunyp9k);
                    if (inputMethodManagerImplimm2.equals(updateSelection.RemoteActionCompatParcelizer)) {
                        IsFixableByRetry isFixableByRetry = textInputServiceAndroidTextInputCommandSerializer.read;
                        String str8 = textInputServiceAndroidTextInputCommandSerializer.IconCompatParcelizer;
                        isFixableByRetry.getClass();
                        IsFixableByRetry.read(fragmentActivityRequireActivity, str8, "content_sharing_submitted_from_floating_button");
                        return createfromparcel;
                    }
                    if (inputMethodManagerImplimm2.equals(accessgetWordscp.IconCompatParcelizer)) {
                        textInputServiceAndroidTextInputCommandSerializer.MediaSessionCompatQueueItem.getClass();
                        p0.read(fragmentActivityRequireActivity);
                        return createfromparcel;
                    }
                    if (inputMethodManagerImplimm2.equals(accessgetSentencescp.write)) {
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                } else {
                    if (getnoneiunyp9k instanceof getWordsIUNYP9kannotations) {
                        BrazeExternalSyntheticLambda45 brazeExternalSyntheticLambda45 = termsAndConditionsFragment.onConfigurationChanged;
                        if (brazeExternalSyntheticLambda45 == null) {
                            removeNodeAtDepth.serializer("webNavigator");
                            throw null;
                        }
                        int i12 = RemoteActionCompatParcelizer + 81;
                        serializer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        FragmentActivity fragmentActivityRequireActivity2 = termsAndConditionsFragment.requireActivity();
                        fragmentActivityRequireActivity2.getClass();
                        div7Ah8Wj8 supportFragmentManager = termsAndConditionsFragment.requireActivity().getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        getWordsIUNYP9kannotations getwordsiunyp9kannotations = (getWordsIUNYP9kannotations) getnoneiunyp9k;
                        r8lambdaLZjsjPSXWRendXZH98LKrH6PSs.write(brazeExternalSyntheticLambda45, fragmentActivityRequireActivity2, supportFragmentManager, getwordsiunyp9kannotations.read, getwordsiunyp9kannotations.RemoteActionCompatParcelizer, "terms_and_conditions_web_view");
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                }
                return null;
            case 18:
                int iIntValue3 = ((Number) obj).intValue();
                isIncludeFontPaddingEnabled isincludefontpaddingenabled = (isIncludeFontPaddingEnabled) this.MediaMetadataCompat;
                getPlatformLocaleDelegate getplatformlocaledelegateSerializer = isincludefontpaddingenabled.serializer();
                if (getplatformlocaledelegateSerializer != null) {
                    isincludefontpaddingenabled.RemoteActionCompatParcelizer.IconCompatParcelizer(getPlatformLocaleDelegate.IconCompatParcelizer(getplatformlocaledelegateSerializer, iIntValue3, null, false, false, Constant.ERROR_ROAD_AREA_INVALID));
                }
                return createfromparcel;
            case 19:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                isIncludeFontPaddingEnabled isincludefontpaddingenabled2 = (isIncludeFontPaddingEnabled) this.MediaMetadataCompat;
                getPlatformLocaleDelegate getplatformlocaledelegateSerializer2 = isincludefontpaddingenabled2.serializer();
                if (getplatformlocaledelegateSerializer2 != null) {
                    isincludefontpaddingenabled2.RemoteActionCompatParcelizer.IconCompatParcelizer(getPlatformLocaleDelegate.IconCompatParcelizer(getplatformlocaledelegateSerializer2, 0, null, false, !zBooleanValue3, 127));
                }
                return createfromparcel;
            case 20:
                getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations = (getSpanVerticalAligndo9XGgannotations) obj;
                getspanverticalaligndo9xggannotations.getClass();
                ((DestinationHeaderUiModelImpl) ((DestinationHeaderUiModel) this.MediaMetadataCompat)).RemoteActionCompatParcelizer(getspanverticalaligndo9xggannotations);
                return createfromparcel;
            case 21:
                getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations2 = (getSpanVerticalAligndo9XGgannotations) obj;
                getspanverticalaligndo9xggannotations2.getClass();
                ((DestinationHeaderUiModelImpl) ((DestinationHeaderUiModel) this.MediaMetadataCompat)).RemoteActionCompatParcelizer(getspanverticalaligndo9xggannotations2);
                return createfromparcel;
            case 22:
                String str9 = (String) obj;
                str9.getClass();
                CustomBulletSpan customBulletSpan = (CustomBulletSpan) this.MediaMetadataCompat;
                customBulletSpan.getClass();
                customBulletSpan.write.IconCompatParcelizer(str9, false);
                Object obj8 = customBulletSpan.read.read();
                if (obj8 instanceof setBrushAndDrawyzxVdVo) {
                    int i14 = RemoteActionCompatParcelizer + 109;
                    serializer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        setbrushanddrawyzxvdvo = (setBrushAndDrawyzxVdVo) obj8;
                        int i15 = 29 / 0;
                    } else {
                        setbrushanddrawyzxvdvo = (setBrushAndDrawyzxVdVo) obj8;
                    }
                }
                if (setbrushanddrawyzxvdvo != null) {
                    int i16 = RemoteActionCompatParcelizer + 101;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    DrawStyleSpan drawStyleSpan = customBulletSpan.RemoteActionCompatParcelizer;
                    Map map = setbrushanddrawyzxvdvo.read;
                    drawStyleSpan.getClass();
                    drawStyleSpan.RemoteActionCompatParcelizer.logEvent("deliveries_planner_chat_click", onMove.RemoteActionCompatParcelizer(DrawStyleSpan.serializer(map), drawStyleSpan.IconCompatParcelizer.write()));
                }
                return createfromparcel;
            case 23:
                toAndroidJoinWw9F2mQ toandroidjoinww9f2mq = (toAndroidJoinWw9F2mQ) obj;
                toandroidjoinww9f2mq.getClass();
                TripPlannerActionsFragment tripPlannerActionsFragment = (TripPlannerActionsFragment) this.MediaMetadataCompat;
                tripPlannerActionsFragment.getClass();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{toandroidjoinww9f2mq, toAndroidJoinWw9F2mQ.serializer}, getCieXyz.write())).booleanValue()) {
                    tripPlannerActionsFragment.write();
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 24:
                toAndroidCapBeK7IIE toandroidcapbek7iie = (toAndroidCapBeK7IIE) obj;
                toandroidcapbek7iie.getClass();
                BaselineShiftCompanion baselineShiftCompanion = (BaselineShiftCompanion) this.MediaMetadataCompat;
                baselineShiftCompanion.getClass();
                invokeyxL6bBk invokeyxl6bbk = toandroidcapbek7iie.serializer;
                if (invokeyxl6bbk != null) {
                    getApplicationInfo getapplicationinfo = invokeyxl6bbk.phone;
                    if (getapplicationinfo != null) {
                        j = getapplicationinfo.deliveryId;
                    } else {
                        CoroutineLiveDataExternalSyntheticLambda0 coroutineLiveDataExternalSyntheticLambda0 = invokeyxl6bbk.chat;
                        if (coroutineLiveDataExternalSyntheticLambda0 != null) {
                            j = coroutineLiveDataExternalSyntheticLambda0.deliveryId;
                        }
                    }
                    lValueOf = Long.valueOf(j);
                }
                if (lValueOf == null) {
                    Timber.RemoteActionCompatParcelizer.write(new Exception("Attempt opening actions sheet when actions are null"));
                } else {
                    baselineShiftCompanion.read.serializer(new getShaderBrush(new ActionsParams(lValueOf.longValue(), toandroidcapbek7iie.MediaDescriptionCompat, toandroidcapbek7iie.RemoteActionCompatParcelizer)));
                }
                return createfromparcel;
            case 25:
                getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations3 = (getSpanVerticalAligndo9XGgannotations) obj;
                getspanverticalaligndo9xggannotations3.getClass();
                TripInformationUiModelImpl tripInformationUiModelImpl = (TripInformationUiModelImpl) ((TripInformationUiModel) this.MediaMetadataCompat);
                tripInformationUiModelImpl.getClass();
                tripInformationUiModelImpl.IconCompatParcelizer.serializer(getLineThrough.IconCompatParcelizer);
                tripInformationUiModelImpl.RatingCompat.serializer(getspanverticalaligndo9xggannotations3);
                BuildersKt.RemoteActionCompatParcelizer(tripInformationUiModelImpl.serializer, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(tripInformationUiModelImpl, getspanverticalaligndo9xggannotations3, resolvetextdirectionihahgbi2, i3), 3);
                return createfromparcel;
            case 26:
                getFirstLineXSAIIZE getfirstlinexsaiize = (getFirstLineXSAIIZE) obj;
                getfirstlinexsaiize.getClass();
                TimeChangedBlockingDialogFragment timeChangedBlockingDialogFragment = (TimeChangedBlockingDialogFragment) this.MediaMetadataCompat;
                timeChangedBlockingDialogFragment.getClass();
                if (!getfirstlinexsaiize.equals(TextIndentCompanion.read)) {
                    if (getfirstlinexsaiize.equals(copyNB67dxo.IconCompatParcelizer)) {
                        timeChangedBlockingDialogFragment.read(false, false);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                Intent intent = new Intent("android.settings.DATE_SETTINGS");
                try {
                    timeChangedBlockingDialogFragment.serializer().write();
                    timeChangedBlockingDialogFragment.requireContext().startActivity(intent);
                    return createfromparcel;
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Could not open Phone Date/Time Settings.", new Object[0]);
                    return createfromparcel;
                }
            case 27:
                invokeComposable invokecomposable = (invokeComposable) obj;
                invokecomposable.getClass();
                DoubleConfirmationFragment doubleConfirmationFragment = (DoubleConfirmationFragment) this.MediaMetadataCompat;
                if (invokecomposable instanceof ComposableSingletonsPreviewActivity_androidKt) {
                    doubleConfirmationFragment.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{new onViewAttachedToWindowlambda0[]{new onViewAttachedToWindowlambda0("KEY_CONFIRMED", Boolean.TRUE)}}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320), "com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.DoubleConfirmationFragment");
                    doubleConfirmationFragment.write();
                    return createfromparcel;
                }
                if (invokecomposable instanceof getLambda2086912010ui_tooling) {
                    doubleConfirmationFragment.write();
                    return createfromparcel;
                }
                doubleConfirmationFragment.getClass();
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 28:
                String str10 = (String) obj;
                str10.getClass();
                ContactRiderViewModel contactRiderViewModel = (ContactRiderViewModel) this.MediaMetadataCompat;
                contactRiderViewModel.getClass();
                Object obj9 = contactRiderViewModel.IconCompatParcelizer.read();
                hasDesignInfo hasdesigninfo = obj9 instanceof hasDesignInfo ? (hasDesignInfo) obj9 : null;
                if (hasdesigninfo == null || (instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet = hasdesigninfo.write) == null) {
                    list = null;
                } else {
                    int i18 = RemoteActionCompatParcelizer + 47;
                    serializer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData2 = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.RemoteActionCompatParcelizer;
                    if (instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData2 != null) {
                        int i20 = serializer + 45;
                        RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                        if (i20 % 2 == 0) {
                            List list3 = instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData2.read;
                            throw null;
                        }
                        list = instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData2.read;
                    } else {
                        list = null;
                    }
                }
                contactRiderViewModel.read.write(list);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(contactRiderViewModel), null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(contactRiderViewModel, new getSpanVerticalAligndo9XGg(120, 0L, str10, (String) null, (String) null, (String) null, false), resolvetextdirectionihahgbi2, 26), 3);
                return createfromparcel;
            default:
                String str11 = (String) obj;
                str11.getClass();
                ContactRiderViewModel contactRiderViewModel2 = (ContactRiderViewModel) this.MediaMetadataCompat;
                contactRiderViewModel2.getClass();
                Object obj10 = contactRiderViewModel2.IconCompatParcelizer.read();
                hasDesignInfo hasdesigninfo2 = obj10 instanceof hasDesignInfo ? (hasDesignInfo) obj10 : null;
                if (hasdesigninfo2 != null) {
                    int i21 = serializer + 57;
                    RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                    if (i21 % 2 == 0) {
                        instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2 = hasdesigninfo2.write;
                        int i22 = 76 / 0;
                        if (instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2 != null) {
                            instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2.write;
                            if (instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData != null) {
                                list2 = instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.read;
                            }
                        }
                    } else {
                        instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2 = hasdesigninfo2.write;
                        if (instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2 != null) {
                            instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2.write;
                            if (instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData != null) {
                                list2 = instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData.read;
                            }
                        }
                    }
                }
                contactRiderViewModel2.read.write(list2);
                contactRiderViewModel2.RemoteActionCompatParcelizer.setPrimaryClip(ClipData.newPlainText("copied", str11));
                contactRiderViewModel2.serializer.serializer(new getDesignInfoMethodOrNull(contactRiderViewModel2.write.read(R.string.all_clipboard, str11)));
                return createfromparcel;
        }
    }
}
