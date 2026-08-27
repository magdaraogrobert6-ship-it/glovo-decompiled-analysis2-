package com.roadrunner.delivery.pickupdropoff.codescanner;

import android.net.Uri;
import android.view.View;
import androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.huawei.agconnect.config.impl.m;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.legacy.chatlist.presentation.CustomerChatsActivity;
import com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.autoaccept.preferences.nest.AutoAcceptPreferencesNestUiModelImpl$1;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.AutoAcceptPreferencesFragment;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineComposeBottomSheet;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineWithAcceptanceRateBottomSheet;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.EntrancePictureFragment;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.TripPlannerActionsFragment;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.api.PickUpDropOffUiModel;
import com.roadrunner.delivery.pickupdropoff.api.PickupDropOffSingleDeliveryUiModel;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.ConfirmButtonV1UiModel;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.presentation.PickupDropOffSingleDeliveryUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.home.CreateHomeScope;
import com.sentiance.core.model.events.N$b;
import com.ui.common.widget.LoadingDialogFullScreen;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import com.ui.common.widget.message_dialog.MessageDialogFragment;
import io.grpc.internal.SharedResourcePool;
import io.sentry.hints.MediaSessionCompatQueueItem;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidIndirectPointerEvent_androidKt;
import o.BlockRunner;
import o.BoringLayoutFactory33;
import o.BrazeExternalSyntheticLambda28;
import o.CanvasCompatM;
import o.CanvasCompatO;
import o.CursorAnchorInfoApi33Helper;
import o.CustomBulletSpan;
import o.DrawStyleSpan;
import o.InputMethodManager;
import o.LineHeightStyleMode;
import o.SelectionMagnifierKt;
import o.ShaderBrushSpan;
import o.ShortNewsContentCardView;
import o.TextAlignKt;
import o.TextDirectionKt;
import o.TextInputServiceAndroidTextInputCommand;
import o.TextInputServiceAndroidWhenMappings;
import o.accessgetParagraphcp;
import o.accessgetTightcp;
import o.acquire;
import o.calculateOcclusions;
import o.clipOutPath;
import o.copyCXVQc50;
import o.copygijOMQM;
import o.copywBHncE4default;
import o.createFromParcel;
import o.ddefault;
import o.div7Ah8Wj8;
import o.dlambda0;
import o.drawTextRun;
import o.enableVerboseLogging;
import o.executeRequestimpl;
import o.fastMergedSHsh3o;
import o.fractionVisibleInRect;
import o.getBitmapui_graphics;
import o.getCenterPIaL0Z0;
import o.getContentOrRtls_7Xco;
import o.getDefaultPaddingXSAIIZE;
import o.getDoneeUduSuo;
import o.getEnterjXw82LU;
import o.getFillColor;
import o.getImm;
import o.getJustifye0LSkKk;
import o.getLefte0LSkKk;
import o.getOnLoggedCallbackannotations;
import o.getPersonNamePrefix;
import o.getPhonePjHm6EEannotations;
import o.getQueryContext;
import o.getStrokeWidth;
import o.getStyleTiuSbCo;
import o.getUnspecifiedvmbZdU8;
import o.getWindowOffsetnOccac;
import o.hasSameNonLayoutAttributesui_text;
import o.loadAsync;
import o.measure;
import o.mergeJsonObjects;
import o.parseLanguageTag;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo;
import o.removeNodeAtDepth;
import o.sendInputCommandlambda0;
import o.valueOfE8nx0Ws;
import o.valueOfkPa1_AA;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BarcodeAnalyzer$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ BarcodeAnalyzer$$ExternalSyntheticLambda0(int i, Object obj) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        View viewRequireView;
        ddefault ddefaultVar;
        int i;
        Float f;
        ThrottledButton$$ExternalSyntheticLambda0 throttledButton$$ExternalSyntheticLambda0;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = serializer + 81;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.RemoteActionCompatParcelizer;
        int i8 = 1;
        Long lValueOf = null;
        switch (i7) {
            case 0:
                m mVar = (m) obj2;
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int i9 = IconCompatParcelizer + 67;
                    serializer = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        ((Barcode) it.next()).serializer.RemoteActionCompatParcelizer();
                        throw null;
                    }
                    String strRemoteActionCompatParcelizer = ((Barcode) it.next()).serializer.RemoteActionCompatParcelizer();
                    if (strRemoteActionCompatParcelizer != null) {
                        arrayList.add(strRemoteActionCompatParcelizer);
                    }
                }
                ((SelectionMagnifierKt) mVar.RemoteActionCompatParcelizer).invoke(arrayList);
                return createfromparcel;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((calculateOcclusions) obj2).invoke(th);
                return createfromparcel;
            case 2:
                return CustomerChatsActivity.RemoteActionCompatParcelizer((CustomerChatsActivity) obj2, (fractionVisibleInRect) obj);
            case 3:
                getWindowOffsetnOccac getwindowoffsetnoccac = (getWindowOffsetnOccac) obj;
                getwindowoffsetnoccac.getClass();
                ((LegacyCustomerChatCommunicatorImpl) obj2).serializer(getwindowoffsetnoccac, false);
                return createfromparcel;
            case 4:
                String str = (String) obj;
                str.getClass();
                ((SessionDao_Impl$$ExternalSyntheticLambda1) obj2).invoke(str);
                return createfromparcel;
            case 5:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((SessionDao_Impl$$ExternalSyntheticLambda1) obj2).invoke(th2);
                return createfromparcel;
            case 6:
                getDefaultPaddingXSAIIZE getdefaultpaddingxsaiize = (getDefaultPaddingXSAIIZE) obj;
                getdefaultpaddingxsaiize.getClass();
                String str2 = getdefaultpaddingxsaiize.IconCompatParcelizer;
                ((CreateHomeScope) obj2).getClass();
                try {
                    lValueOf = Long.valueOf(Instant.parse(str2).toEpochMilli());
                    break;
                } catch (DateTimeParseException e) {
                    Timber.RemoteActionCompatParcelizer.write(new Exception(e));
                }
                if (lValueOf != null) {
                    return lValueOf;
                }
                return 0L;
            case 7:
                ((fastMergedSHsh3o) obj).getClass();
                ((AutoAcceptPreferencesFragment) obj2).read(false, false);
                return createfromparcel;
            case 8:
                hasSameNonLayoutAttributesui_text hassamenonlayoutattributesui_text = (hasSameNonLayoutAttributesui_text) obj2;
                ((Boolean) obj).getClass();
                BuildersKt.RemoteActionCompatParcelizer(hassamenonlayoutattributesui_text.IconCompatParcelizer, null, null, new AutoAcceptPreferencesNestUiModelImpl$1(hassamenonlayoutattributesui_text, null == true ? 1 : 0, i8), 3);
                return createfromparcel;
            case 9:
                ((DeliveryAutoAcceptUiModelImpl) obj2).PlaybackStateCompat.serializer();
                return createfromparcel;
            case 10:
                ((getPersonNamePrefix) obj).getClass();
                ((executeRequestimpl) obj2).invoke();
                return new BlockRunner(3);
            case 11:
                LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet = (LasagnaDeclineBottomSheet) obj2;
                measure measureVar = (measure) obj;
                measureVar.getClass();
                if (measureVar instanceof BoringLayoutFactory33) {
                    lasagnaDeclineBottomSheet.write();
                    return createfromparcel;
                }
                if (measureVar instanceof clipOutPath) {
                    div7Ah8Wj8 childFragmentManager = lasagnaDeclineBottomSheet.getChildFragmentManager();
                    childFragmentManager.getClass();
                    LoadingDialogFullScreen loadingDialogFullScreenSerializer = enableVerboseLogging.serializer(childFragmentManager);
                    div7Ah8Wj8 childFragmentManager2 = lasagnaDeclineBottomSheet.getChildFragmentManager();
                    childFragmentManager2.getClass();
                    loadingDialogFullScreenSerializer.serializer(childFragmentManager2);
                    return createfromparcel;
                }
                if (measureVar instanceof drawTextRun) {
                    int i10 = IconCompatParcelizer + 19;
                    serializer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        div7Ah8Wj8 childFragmentManager3 = lasagnaDeclineBottomSheet.getChildFragmentManager();
                        childFragmentManager3.getClass();
                        LoadingDialogFullScreen loadingDialogFullScreenSerializer2 = enableVerboseLogging.serializer(childFragmentManager3);
                        lasagnaDeclineBottomSheet.getChildFragmentManager().getClass();
                        loadingDialogFullScreenSerializer2.serializer();
                        return createfromparcel;
                    }
                    div7Ah8Wj8 childFragmentManager4 = lasagnaDeclineBottomSheet.getChildFragmentManager();
                    childFragmentManager4.getClass();
                    LoadingDialogFullScreen loadingDialogFullScreenSerializer3 = enableVerboseLogging.serializer(childFragmentManager4);
                    lasagnaDeclineBottomSheet.getChildFragmentManager().getClass();
                    loadingDialogFullScreenSerializer3.serializer();
                    int i11 = 78 / 0;
                    return createfromparcel;
                }
                if (!(measureVar instanceof CanvasCompatO)) {
                    if (measureVar instanceof CanvasCompatM) {
                        MediaSessionCompatQueueItem.IconCompatParcelizer(lasagnaDeclineBottomSheet.getString(R.string.all_error), lasagnaDeclineBottomSheet.getString(R.string.state_api_error_dialog_message), lasagnaDeclineBottomSheet.getString(R.string.all_retry), null, null, false, false, false, 504).RemoteActionCompatParcelizer(lasagnaDeclineBottomSheet.getChildFragmentManager(), "state_error_dialog");
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                String str3 = ((CanvasCompatO) measureVar).RemoteActionCompatParcelizer;
                dlambda0 dlambda0Var = lasagnaDeclineBottomSheet.onConfigurationChanged;
                if (dlambda0Var == null) {
                    removeNodeAtDepth.serializer("snackbarManager");
                    throw null;
                }
                int i12 = serializer + 113;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    viewRequireView = lasagnaDeclineBottomSheet.requireView();
                    viewRequireView.getClass();
                    ddefaultVar = ddefault.IconCompatParcelizer;
                    i = 1;
                    f = null;
                    throttledButton$$ExternalSyntheticLambda0 = null;
                    i2 = 33;
                } else {
                    viewRequireView = lasagnaDeclineBottomSheet.requireView();
                    viewRequireView.getClass();
                    ddefaultVar = ddefault.IconCompatParcelizer;
                    i = 0;
                    f = null;
                    throttledButton$$ExternalSyntheticLambda0 = null;
                    i2 = 56;
                }
                r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, str3, ddefaultVar, i, f, throttledButton$$ExternalSyntheticLambda0, i2);
                return createfromparcel;
            case 12:
                LasagnaDeclineComposeBottomSheet lasagnaDeclineComposeBottomSheet = (LasagnaDeclineComposeBottomSheet) obj2;
                measure measureVar2 = (measure) obj;
                measureVar2.getClass();
                if (!(!(measureVar2 instanceof BoringLayoutFactory33))) {
                    lasagnaDeclineComposeBottomSheet.write();
                    return createfromparcel;
                }
                if (measureVar2 instanceof clipOutPath) {
                    div7Ah8Wj8 childFragmentManager5 = lasagnaDeclineComposeBottomSheet.getChildFragmentManager();
                    childFragmentManager5.getClass();
                    LoadingDialogFullScreen loadingDialogFullScreenSerializer4 = enableVerboseLogging.serializer(childFragmentManager5);
                    div7Ah8Wj8 childFragmentManager6 = lasagnaDeclineComposeBottomSheet.getChildFragmentManager();
                    childFragmentManager6.getClass();
                    loadingDialogFullScreenSerializer4.serializer(childFragmentManager6);
                    return createfromparcel;
                }
                if (!(!(measureVar2 instanceof drawTextRun))) {
                    int i13 = IconCompatParcelizer + 47;
                    serializer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    div7Ah8Wj8 childFragmentManager7 = lasagnaDeclineComposeBottomSheet.getChildFragmentManager();
                    childFragmentManager7.getClass();
                    LoadingDialogFullScreen loadingDialogFullScreenSerializer5 = enableVerboseLogging.serializer(childFragmentManager7);
                    lasagnaDeclineComposeBottomSheet.getChildFragmentManager().getClass();
                    loadingDialogFullScreenSerializer5.serializer();
                    return createfromparcel;
                }
                if (!(measureVar2 instanceof CanvasCompatO)) {
                    if (measureVar2 instanceof CanvasCompatM) {
                        MediaSessionCompatQueueItem.IconCompatParcelizer(lasagnaDeclineComposeBottomSheet.getString(R.string.all_error), lasagnaDeclineComposeBottomSheet.getString(R.string.state_api_error_dialog_message), lasagnaDeclineComposeBottomSheet.getString(R.string.all_retry), null, null, false, false, false, 504).RemoteActionCompatParcelizer(lasagnaDeclineComposeBottomSheet.getChildFragmentManager(), "state_error_dialog");
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                String str4 = ((CanvasCompatO) measureVar2).RemoteActionCompatParcelizer;
                dlambda0 dlambda0Var2 = lasagnaDeclineComposeBottomSheet.getOnBackPressedDispatcher;
                if (dlambda0Var2 == null) {
                    removeNodeAtDepth.serializer("snackbarManager");
                    throw null;
                }
                View viewRequireView2 = lasagnaDeclineComposeBottomSheet.requireView();
                viewRequireView2.getClass();
                r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var2, viewRequireView2, str4, ddefault.IconCompatParcelizer, 0, null, null, 56);
                return createfromparcel;
            case 13:
                LasagnaDeclineWithAcceptanceRateBottomSheet lasagnaDeclineWithAcceptanceRateBottomSheet = (LasagnaDeclineWithAcceptanceRateBottomSheet) obj2;
                measure measureVar3 = (measure) obj;
                measureVar3.getClass();
                if (measureVar3 instanceof BoringLayoutFactory33) {
                    lasagnaDeclineWithAcceptanceRateBottomSheet.write();
                    return createfromparcel;
                }
                if (measureVar3 instanceof clipOutPath) {
                    int i15 = serializer + 119;
                    IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    div7Ah8Wj8 childFragmentManager8 = lasagnaDeclineWithAcceptanceRateBottomSheet.getChildFragmentManager();
                    childFragmentManager8.getClass();
                    LoadingDialogFullScreen loadingDialogFullScreenSerializer6 = enableVerboseLogging.serializer(childFragmentManager8);
                    div7Ah8Wj8 childFragmentManager9 = lasagnaDeclineWithAcceptanceRateBottomSheet.getChildFragmentManager();
                    childFragmentManager9.getClass();
                    loadingDialogFullScreenSerializer6.serializer(childFragmentManager9);
                    return createfromparcel;
                }
                if (measureVar3 instanceof drawTextRun) {
                    int i17 = IconCompatParcelizer + 69;
                    serializer = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 == 0) {
                        div7Ah8Wj8 childFragmentManager10 = lasagnaDeclineWithAcceptanceRateBottomSheet.getChildFragmentManager();
                        childFragmentManager10.getClass();
                        LoadingDialogFullScreen loadingDialogFullScreenSerializer7 = enableVerboseLogging.serializer(childFragmentManager10);
                        lasagnaDeclineWithAcceptanceRateBottomSheet.getChildFragmentManager().getClass();
                        loadingDialogFullScreenSerializer7.serializer();
                        return createfromparcel;
                    }
                    div7Ah8Wj8 childFragmentManager11 = lasagnaDeclineWithAcceptanceRateBottomSheet.getChildFragmentManager();
                    childFragmentManager11.getClass();
                    LoadingDialogFullScreen loadingDialogFullScreenSerializer8 = enableVerboseLogging.serializer(childFragmentManager11);
                    lasagnaDeclineWithAcceptanceRateBottomSheet.getChildFragmentManager().getClass();
                    loadingDialogFullScreenSerializer8.serializer();
                    int i18 = 7 / 0;
                    return createfromparcel;
                }
                if (!(measureVar3 instanceof CanvasCompatO)) {
                    if (measureVar3 instanceof CanvasCompatM) {
                        MediaSessionCompatQueueItem.IconCompatParcelizer(lasagnaDeclineWithAcceptanceRateBottomSheet.getString(R.string.all_error), lasagnaDeclineWithAcceptanceRateBottomSheet.getString(R.string.state_api_error_dialog_message), lasagnaDeclineWithAcceptanceRateBottomSheet.getString(R.string.all_retry), null, null, false, false, false, 504).RemoteActionCompatParcelizer(lasagnaDeclineWithAcceptanceRateBottomSheet.getChildFragmentManager(), "state_error_dialog");
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i19 = serializer + 103;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                String str5 = ((CanvasCompatO) measureVar3).RemoteActionCompatParcelizer;
                dlambda0 dlambda0Var3 = lasagnaDeclineWithAcceptanceRateBottomSheet.onActivityResult;
                if (dlambda0Var3 == null) {
                    removeNodeAtDepth.serializer("snackbarManager");
                    throw null;
                }
                View viewRequireView3 = lasagnaDeclineWithAcceptanceRateBottomSheet.requireView();
                viewRequireView3.getClass();
                r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var3, viewRequireView3, str5, ddefault.IconCompatParcelizer, 0, null, null, 56);
                return createfromparcel;
            case 14:
                loadAsync loadasync = (loadAsync) obj2;
                copyCXVQc50 copycxvqc50 = (copyCXVQc50) obj;
                copycxvqc50.getClass();
                getOnLoggedCallbackannotations getonloggedcallbackannotations = copycxvqc50.IconCompatParcelizer;
                getonloggedcallbackannotations.setChecked(loadasync.IconCompatParcelizer);
                getonloggedcallbackannotations.setToggleEnabled(loadasync.RemoteActionCompatParcelizer);
                return createfromparcel;
            case 15:
                InAppCameraWithTagsFragment inAppCameraWithTagsFragment = (InAppCameraWithTagsFragment) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    int i21 = IconCompatParcelizer + 111;
                    serializer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    inAppCameraWithTagsFragment.serializer().IconCompatParcelizer(uri);
                } else {
                    inAppCameraWithTagsFragment.serializer().serializer();
                }
                return createfromparcel;
            case 16:
                CursorAnchorInfoApi33Helper cursorAnchorInfoApi33Helper = (CursorAnchorInfoApi33Helper) obj2;
                getStyleTiuSbCo getstyletiusbco = (getStyleTiuSbCo) obj;
                getstyletiusbco.getClass();
                cursorAnchorInfoApi33Helper.enable();
                return new getFillColor(getstyletiusbco, cursorAnchorInfoApi33Helper, i8);
            case 17:
                ((String) obj).getClass();
                ((copywBHncE4default) obj2).RatingCompat();
                return createfromparcel;
            case 18:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, ((getImm) obj2).RemoteActionCompatParcelizer);
                return createfromparcel;
            case 19:
                return ((InputMethodManager) ((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj2).get(((Integer) obj).intValue())).RemoteActionCompatParcelizer;
            case 20:
                getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) obj;
                getbitmapui_graphics.getClass();
                TextInputServiceAndroidWhenMappings textInputServiceAndroidWhenMappings = ((TermsAndConditionsFragment) obj2).getOnBackPressedDispatcher;
                if (textInputServiceAndroidWhenMappings != null) {
                    androidx.lifecycle.BlockRunner blockRunner = textInputServiceAndroidWhenMappings.RemoteActionCompatParcelizer;
                    return new TextInputServiceAndroidTextInputCommand(new getQueryContext(), (SendTestPushUseCase) ((AndroidIndirectPointerEvent_androidKt) blockRunner.read).write(), (getPhonePjHm6EEannotations) ((mergeJsonObjects) blockRunner.serializer).write(), (GetCrowdSourcingEntryPointScreenImpl) ((mergeJsonObjects) blockRunner.RatingCompat).write(), (BrazeExternalSyntheticLambda28) ((AndroidIndirectPointerEvent_androidKt) blockRunner.write).write(), (sendInputCommandlambda0) ((mergeJsonObjects) blockRunner.RemoteActionCompatParcelizer).write(), new IsFixableByRetry(18), (getDoneeUduSuo) ((acquire) blockRunner.IconCompatParcelizer).write(), getbitmapui_graphics, new p0(0));
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 21:
                ((parseLanguageTag) obj).getClass();
                ((EntrancePictureFragment) obj2).read(false, false);
                return createfromparcel;
            case 22:
                getBitmapui_graphics getbitmapui_graphics2 = (getBitmapui_graphics) obj;
                getbitmapui_graphics2.getClass();
                ShaderBrushSpan shaderBrushSpan = ((TripPlannerActionsFragment) obj2).getOnBackPressedDispatcher;
                if (shaderBrushSpan != null) {
                    N$b n$b = shaderBrushSpan.serializer;
                    return new CustomBulletSpan((CustomerChatCommunicatorImpl) ((mergeJsonObjects) n$b.read).write(), (SignInDataStore) ((acquire) n$b.write).write(), new SharedResourcePool(24), (UnifiedPhoneCallerImpl) ((mergeJsonObjects) n$b.IconCompatParcelizer).write(), (DrawStyleSpan) ((mergeJsonObjects) n$b.serializer).write(), getbitmapui_graphics2);
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 23:
                LineHeightStyleMode lineHeightStyleMode = (LineHeightStyleMode) obj2;
                accessgetTightcp accessgettightcp = (accessgetTightcp) obj;
                accessgettightcp.getClass();
                if (!accessgettightcp.equals(accessgetTightcp.RemoteActionCompatParcelizer)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                getCenterPIaL0Z0 getcenterpial0z0 = (getCenterPIaL0Z0) lineHeightStyleMode;
                accessgetParagraphcp accessgetparagraphcp = getcenterpial0z0.RatingCompat;
                MutableStateFlow mutableStateFlow = getcenterpial0z0.read;
                accessgetparagraphcp.IconCompatParcelizer.write(new valueOfkPa1_AA(mutableStateFlow.read() != null));
                mutableStateFlow.IconCompatParcelizer(null);
                return createfromparcel;
            case 24:
                getJustifye0LSkKk getjustifye0lskkk = (getJustifye0LSkKk) obj2;
                getLefte0LSkKk getlefte0lskkk = (getLefte0LSkKk) obj;
                getlefte0lskkk.getClass();
                if (getlefte0lskkk instanceof getLefte0LSkKk) {
                    ((TextAlignKt) getjustifye0lskkk).read.IconCompatParcelizer.write(getUnspecifiedvmbZdU8.serializer);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    createfromparcel = null;
                }
                int i23 = serializer + 81;
                IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                return createfromparcel;
            case 25:
                TextDirectionKt textDirectionKt = (TextDirectionKt) obj2;
                getContentOrRtls_7Xco getcontentorrtls_7xco = (getContentOrRtls_7Xco) obj;
                getcontentorrtls_7xco.getClass();
                if (!(getcontentorrtls_7xco instanceof getContentOrRtls_7Xco)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                ((valueOfE8nx0Ws) textDirectionKt).write.IconCompatParcelizer.write(copygijOMQM.RemoteActionCompatParcelizer);
                return createfromparcel;
            case 26:
                ConfirmButtonV1UiModel confirmButtonV1UiModel = (ConfirmButtonV1UiModel) obj2;
                MessageDialogFragment.read readVar = (MessageDialogFragment.read) obj;
                readVar.getClass();
                if (readVar == MessageDialogFragment.read.CLICKED_MAIN_BUTTON) {
                    ((ConfirmButtonV1UiModelImpl) confirmButtonV1UiModel).RemoteActionCompatParcelizer();
                }
                return createfromparcel;
            case 27:
                PickUpDropOffUiModel pickUpDropOffUiModel = (PickUpDropOffUiModel) obj2;
                getStrokeWidth getstrokewidth = (getStrokeWidth) obj;
                getstrokewidth.getClass();
                PickUpDropOffUiModelImpl pickUpDropOffUiModelImpl = (PickUpDropOffUiModelImpl) pickUpDropOffUiModel;
                pickUpDropOffUiModelImpl.ParcelableVolumeInfo = BuildersKt.RemoteActionCompatParcelizer(pickUpDropOffUiModelImpl.MediaSessionCompatQueueItem, null, null, new SwitcherUiModelImpl$1((Object) pickUpDropOffUiModelImpl, (ShortNewsContentCardView) (null == true ? 1 : 0), 16), 3);
                return new PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1(getstrokewidth, pickUpDropOffUiModel, i8);
            case 28:
                PickupDropOffSingleDeliveryUiModel pickupDropOffSingleDeliveryUiModel = (PickupDropOffSingleDeliveryUiModel) obj2;
                getStrokeWidth getstrokewidth2 = (getStrokeWidth) obj;
                getstrokewidth2.getClass();
                PickupDropOffSingleDeliveryUiModelImpl pickupDropOffSingleDeliveryUiModelImpl = (PickupDropOffSingleDeliveryUiModelImpl) pickupDropOffSingleDeliveryUiModel;
                pickupDropOffSingleDeliveryUiModelImpl.ParcelableVolumeInfo = BuildersKt.RemoteActionCompatParcelizer(pickupDropOffSingleDeliveryUiModelImpl.IconCompatParcelizer, null, null, new PickupDropOffSingleDeliveryUiModelImpl.AnonymousClass1(pickupDropOffSingleDeliveryUiModelImpl, null == true ? 1 : 0, i8), 3);
                return new PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1(getstrokewidth2, pickupDropOffSingleDeliveryUiModel, i3);
            default:
                getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) obj;
                getenterjxw82lu.getClass();
                return getEnterjXw82LU.write(getenterjxw82lu, (CardCashPaymentTaskUiItem$PaymentType) obj2, null, null, null, 8175);
        }
    }
}
