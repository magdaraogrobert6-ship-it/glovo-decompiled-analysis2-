package androidx.navigation.compose;

import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.biometrics.presentation.compose.BiometricContentKt;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose.PhotoSharedSuccessDialogKt;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.ButtonTypeTokenMapperKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;
import com.roadrunner.push.presentation.MessageDialogFragment;
import com.roadrunner.push.presentation.NotificationDialogKt;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.EmailAndPhoneScreenKt;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationContentKt;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel;
import com.roadrunner.rider.recruitment.passverification.presentation.VerifyScreenKt;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockKt$CashBlock$1$1;
import com.roadrunner.rider.state.ondemand.api.bonus.OnDemandWithBonusUiModel;
import com.roadrunner.rider.state.ondemand.api.presentation.OnDemandUiModel;
import com.roadrunner.rider.state.ondemand.bonus.OnDemandWithBonusUiModelImpl;
import com.roadrunner.rider.state.ondemand.presentation.OnDemandUiModelImpl;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.rrds.compose.component.navigations.TabsKt;
import com.roadrunner.settings.SettingsFragment;
import io.sentry.SentryUUID;
import kotlinx.coroutines.BuildersKt;
import o.ActivityHandler2;
import o.AdjustBridgeInstance4;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ComposeAnimationState;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.IndentationFixSpan;
import o.LetterSpacingSpanEm;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RadioButton;
import o.SelectionMagnifierKt;
import o.SemanticsSortKtUnmergedConfigComparator1;
import o.SimpleLayoutKtSimpleLayout11;
import o.StaticLayoutFactory28;
import o.buildMapping;
import o.cancelPendingWebViewPauselambda0;
import o.createFromParcel;
import o.cubicTo;
import o.executeRequestimpl;
import o.generatePOSTBodyString;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getEllipsizedRightPadding;
import o.getNewPassword;
import o.getPostalCode;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START;
import o.getSTYLEABLE_VECTOR_DRAWABLE_TINT;
import o.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE;
import o.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY;
import o.getStoreInfoFromClient;
import o.handleUrlOverridelambda1;
import o.lambdaisEnabled11;
import o.lambdaprocessDeeplink12;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaG2Lta7vZPQRir3Ldpv_t1nZTSzg;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.removeGlobalCallbackParameters;
import o.removeGlobalCallbackParametersI;
import o.removeGlobalPartnerParameter;
import o.setContainer;
import o.setContentType;
import o.setCurrentSemanticsNodesui;
import o.trackThirdPartySharing;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.serializer = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:168:0x0519 A[PHI: r1
  0x0519: PHI (r1v46 o.getPostalCode) = (r1v45 o.getPostalCode), (r1v49 o.getPostalCode) binds: [B:167:0x0517, B:164:0x050c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:170:0x054b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0552  */
    /* JADX WARN: Code duplicated, block: B:173:0x0560  */
    /* JADX WARN: Code duplicated, block: B:175:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:177:0x05ef A[PHI: r1
  0x05ef: PHI (r1v48 o.getPostalCode) = (r1v45 o.getPostalCode), (r1v49 o.getPostalCode) binds: [B:167:0x0517, B:164:0x050c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getPostalCode getpostalcode;
        Modifier.Companion companion;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        TextStyle textStyleMediaSessionCompatResultReceiverWrapper;
        int iM3516getStarte0LSkKk;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.serializer;
        Object obj4 = this.RemoteActionCompatParcelizer;
        Object obj5 = this.read;
        boolean z = false;
        switch (i2) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) obj5, null, null, new NavHostKt$NavHost$29$1$1$1(fFloatValue, (SeekableTransitionState) obj4, (cubicTo) obj3, null), 3);
                return createfromparcel;
            case 1:
                cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0 = (cancelPendingWebViewPauselambda0) obj5;
                ScrollingLogic scrollingLogic = (ScrollingLogic) obj4;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jM59toOffsettuRUvjQ = scrollingLogic.m59toOffsettuRUvjQ(scrollingLogic.RemoteActionCompatParcelizer(fFloatValue2 - cancelpendingwebviewpauselambda0.write));
                int iM1938getUserInputWNlRxjI = NestedScrollSource.Companion.m1938getUserInputWNlRxjI();
                ScrollingLogic scrollingLogic2 = ((SimpleLayoutKtSimpleLayout11) obj3).write;
                cancelpendingwebviewpauselambda0.write += scrollingLogic.RemoteActionCompatParcelizer(scrollingLogic.m58toFloatk4lQ0M(scrollingLogic2.serializer(scrollingLogic2.RatingCompat, jM59toOffsettuRUvjQ, iM1938getUserInputWNlRxjI)));
                return createfromparcel;
            case 2:
                Modifier modifier = (Modifier) obj5;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj4;
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) obj3;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
                if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new SelectionMagnifierKt(populateViewStructure_androidKtpopulate7, 2);
                        getpostalcode2.write(objComponentActivity);
                    }
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity);
                    MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), true);
                    int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierOnGloballyPositioned);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                    if (getpostalcode2.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor2);
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                    dragAndDropTargetModifierNode.invoke(getpostalcode2, 0);
                    getpostalcode2.IconCompatParcelizer(true);
                }
                return createfromparcel;
            case 3:
                getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START getstyleable_vector_drawable_path_trim_path_start = (getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START) obj5;
                getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START getstyleable_vector_drawable_path_trim_path_start2 = (getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START) obj4;
                getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START getstyleable_vector_drawable_path_trim_path_start3 = (getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START) obj3;
                DialogInterface dialogInterface = (DialogInterface) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY getstyleable_vector_drawable_type_array = (getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY) obj2;
                dialogInterface.getClass();
                getstyleable_vector_drawable_type_array.getClass();
                if (getstyleable_vector_drawable_type_array.equals(getSTYLEABLE_VECTOR_DRAWABLE_TINT.read)) {
                    if (getstyleable_vector_drawable_path_trim_path_start == null) {
                        return createfromparcel;
                    }
                    getstyleable_vector_drawable_path_trim_path_start.RemoteActionCompatParcelizer.invoke(dialogInterface);
                    return createfromparcel;
                }
                if (getstyleable_vector_drawable_type_array.equals(getSTYLEABLE_VECTOR_DRAWABLE_TINT.RemoteActionCompatParcelizer)) {
                    if (getstyleable_vector_drawable_path_trim_path_start2 == null) {
                        return createfromparcel;
                    }
                    getstyleable_vector_drawable_path_trim_path_start2.RemoteActionCompatParcelizer.invoke(dialogInterface);
                    return createfromparcel;
                }
                if (!getstyleable_vector_drawable_type_array.equals(getSTYLEABLE_VECTOR_DRAWABLE_TINT.IconCompatParcelizer)) {
                    if (getstyleable_vector_drawable_type_array instanceof getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE) {
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i3 = write + 29;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (getstyleable_vector_drawable_path_trim_path_start3 == null) {
                    return createfromparcel;
                }
                getstyleable_vector_drawable_path_trim_path_start3.RemoteActionCompatParcelizer.invoke(dialogInterface);
                return createfromparcel;
            case 4:
                setContentType setcontenttype = (setContentType) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                Modifier modifier2 = (Modifier) obj3;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                if (!getpostalcode3.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    generatePOSTBodyString generatepostbodystring = setcontenttype.write;
                    if (generatepostbodystring == null) {
                        getpostalcode3.serializer(-247474950);
                        getpostalcode3.IconCompatParcelizer(false);
                    } else {
                        getpostalcode3.serializer(-247474949);
                        setContainer.read(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, getpostalcode3, 0);
                        getpostalcode3.IconCompatParcelizer(false);
                    }
                }
                return createfromparcel;
            case 5:
                r8lambdaG2Lta7vZPQRir3Ldpv_t1nZTSzg r8lambdag2lta7vzpqrir3ldpv_t1nztszg = (r8lambdaG2Lta7vZPQRir3Ldpv_t1nZTSzg) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode4.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int i5 = write + 33;
                    MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        boolean z2 = r8lambdag2lta7vzpqrir3ldpv_t1nztszg instanceof SemanticsSortKtUnmergedConfigComparator1;
                        throw null;
                    }
                    if (r8lambdag2lta7vzpqrir3ldpv_t1nztszg instanceof SemanticsSortKtUnmergedConfigComparator1) {
                        getpostalcode4.serializer(-1743534215);
                        BiometricContentKt.BiometricContent((SemanticsSortKtUnmergedConfigComparator1) r8lambdag2lta7vzpqrir3ldpv_t1nztszg, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier.Companion, getpostalcode4, 3072);
                        getpostalcode4.IconCompatParcelizer(false);
                    } else {
                        getpostalcode4.serializer(-1743298770);
                        getpostalcode4.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 6:
                return SelfServiceCustomerChatActivity.IconCompatParcelizer((SelfServiceCustomerChatActivity) obj5, (StaticLayoutFactory28) obj4, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 7:
                LetterSpacingSpanEm letterSpacingSpanEm = (LetterSpacingSpanEm) obj5;
                IndentationFixSpan indentationFixSpan = (IndentationFixSpan) obj4;
                executeRequestimpl executerequestimpl = (executeRequestimpl) obj3;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode5.write(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ((r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) letterSpacingSpanEm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).invoke(((getEllipsizedRightPadding) indentationFixSpan).IconCompatParcelizer, executerequestimpl, getpostalcode5, 0);
                } else {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 8:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull5;
                if (getpostalcode6.write(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Modifier.Companion companion4 = Modifier.Companion;
                    Modifier modifierWrite = PaddingKt.write(companion4, Dimensions.setActionBarVisibilityCallback);
                    Alignment.Companion companion5 = Alignment.Companion;
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion5.getStart(), getpostalcode6, 48);
                    int iHashCode3 = Long.hashCode(getpostalcode6.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode6.serializer();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode6, modifierWrite);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion6.getConstructor();
                    if (getpostalcode6.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode6.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode6.ComponentActivity) {
                        getpostalcode6.serializer(constructor3);
                    } else {
                        getpostalcode6.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion6, getpostalcode6, modalBottomSheetYbuCTN8Serializer2, getpostalcode6, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode6, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion6, getpostalcode6, Integer.valueOf(iHashCode3), getpostalcode6));
                    PhotoSharedSuccessDialogKt.SuccessLottie(0, getpostalcode6, companion4.then(new RadioButton(companion5.getStart())), r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, SizeKt.m75height3ABfNKs(companion4, Dimensions.setHideOnContentScrollEnabled)});
                    TextStyle textStyleMediaSessionCompatResultReceiverWrapper2 = performLayout.MediaSessionCompatResultReceiverWrapper();
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper2, getpostalcode6, 0, 0, 131066);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, SizeKt.m75height3ABfNKs(companion4, Dimensions.getActionBarHideOffset)});
                    TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode6, 0, 0, 131066);
                    getpostalcode6.IconCompatParcelizer(true);
                } else {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 9:
                Modifier modifier3 = (Modifier) obj5;
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj4;
                PagerState pagerState = (PagerState) obj3;
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                boolean z3 = (iIntValue6 & 3) != 2;
                int i6 = write + 17;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode7.write(iIntValue6 & 1, z3)) {
                    Modifier modifierWrite2 = SizeKt.write(modifier3, 1.0f);
                    float f = Dimensions.setLogo;
                    float f2 = Dimensions.getNestedScrollAxes;
                    Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierWrite2, f, f2);
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode7, 0);
                    int iHashCode4 = Long.hashCode(getpostalcode7.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode7.serializer();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode7, modifierRemoteActionCompatParcelizer);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion7.getConstructor();
                    if (getpostalcode7.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode7.ComponentActivity) {
                        getpostalcode7.serializer(constructor4);
                    } else {
                        getpostalcode7.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion7, getpostalcode7, modalBottomSheetYbuCTN8Serializer3, getpostalcode7, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode7, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion7, getpostalcode7, Integer.valueOf(iHashCode4), getpostalcode7));
                    TabsKt.ScrollableTabRow(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, pagerState, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, f2, 0.0f, 0.0f, 13), null, null, getpostalcode7, 0);
                    getpostalcode7.IconCompatParcelizer(true);
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 10:
                String str3 = (String) obj5;
                ComposeAnimationState composeAnimationState = (ComposeAnimationState) obj4;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                boolean z4 = (iIntValue7 & 3) != 2;
                int i8 = write + 25;
                MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    getpostalcode = (getPostalCode) getbirthdatefull7;
                    if (getpostalcode.write(0, z4)) {
                        companion = Modifier.Companion;
                        Modifier modifierWrite3 = PaddingKt.write(SizeKt.write(companion, 1.0f), Dimensions.setActionBarVisibilityCallback);
                        modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
                        iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                        dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite3);
                        companion2 = ComposeUiNode.Companion;
                        constructor = companion2.getConstructor();
                        if (getpostalcode.read != null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            int i9 = write + 121;
                            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                        TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setHideOnContentScrollEnabled)});
                        ButtonTypeTokenMapperKt.IconCompatParcelizer(composeAnimationState.type, composeAnimationState.actionTitle, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, SizeKt.write(companion, 1.0f), false, false, null, getpostalcode, 3072, 240);
                        getpostalcode.IconCompatParcelizer(true);
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                } else {
                    getpostalcode = (getPostalCode) getbirthdatefull7;
                    if (getpostalcode.write(iIntValue7 & 1, z4)) {
                        companion = Modifier.Companion;
                        Modifier modifierWrite4 = PaddingKt.write(SizeKt.write(companion, 1.0f), Dimensions.setActionBarVisibilityCallback);
                        modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
                        iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                        dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite4);
                        companion2 = ComposeUiNode.Companion;
                        constructor = companion2.getConstructor();
                        if (getpostalcode.read != null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            int i11 = write + 121;
                            MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                        TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setHideOnContentScrollEnabled)});
                        ButtonTypeTokenMapperKt.IconCompatParcelizer(composeAnimationState.type, composeAnimationState.actionTitle, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, SizeKt.write(companion, 1.0f), false, false, null, getpostalcode, 3072, 240);
                        getpostalcode.IconCompatParcelizer(true);
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                }
                return createfromparcel;
            case 11:
                MessageDialogData messageDialogData = (MessageDialogData) obj5;
                MessageDialogFragment messageDialogFragment = (MessageDialogFragment) obj4;
                lambdaisEnabled11 lambdaisenabled11 = (lambdaisEnabled11) obj3;
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull8;
                if (getpostalcode8.write(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    lambdaprocessDeeplink12 lambdaprocessdeeplink12 = (lambdaprocessDeeplink12) messageDialogFragment.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper();
                    boolean zIconCompatParcelizer = getpostalcode8.IconCompatParcelizer(lambdaprocessdeeplink12);
                    Object objComponentActivity2 = getpostalcode8.ComponentActivity();
                    if (zIconCompatParcelizer) {
                        objComponentActivity2 = new NafathModalContentKt$NafathModal$1$1(0, lambdaprocessdeeplink12, lambdaprocessDeeplink12.class, "onDismissRequested", "onDismissRequested()V", 0, 28);
                        getpostalcode8.write(objComponentActivity2);
                    } else {
                        int i13 = write + 105;
                        MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            Object obj6 = null;
                            obj6.hashCode();
                            throw null;
                        }
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = new NafathModalContentKt$NafathModal$1$1(0, lambdaprocessdeeplink12, lambdaprocessDeeplink12.class, "onDismissRequested", "onDismissRequested()V", 0, 28);
                            getpostalcode8.write(objComponentActivity2);
                        }
                    }
                    NotificationDialogKt.RemoteActionCompatParcelizer(messageDialogData, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), lambdaisenabled11, getpostalcode8, 0);
                } else {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 12:
                removeGlobalCallbackParameters removeglobalcallbackparameters = (removeGlobalCallbackParameters) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) obj3;
                getBirthDateFull getbirthdatefull9 = (getBirthDateFull) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode9 = (getPostalCode) getbirthdatefull9;
                if (getpostalcode9.write(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    Modifier.Companion companion8 = Modifier.Companion;
                    Modifier modifierWrite5 = SizeKt.write(companion8, 1.0f);
                    Alignment.Companion companion9 = Alignment.Companion;
                    MeasurePolicy measurePolicy2 = BoxKt.read(companion9.getTopStart(), false);
                    int iHashCode5 = Long.hashCode(getpostalcode9.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode9.serializer();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode9, modifierWrite5);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion10.getConstructor();
                    if (getpostalcode9.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode9.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode9.ComponentActivity) {
                        getpostalcode9.serializer(constructor5);
                    } else {
                        getpostalcode9.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion10, getpostalcode9, measurePolicy2, getpostalcode9, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode9, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion10, getpostalcode9, Integer.valueOf(iHashCode5), getpostalcode9));
                    String str4 = removeglobalcallbackparameters.write;
                    if (((Boolean) onviewattachedtowindow.getValue()).booleanValue()) {
                        textStyleMediaSessionCompatResultReceiverWrapper = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    } else {
                        textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
                    }
                    TextStyle textStyle = textStyleMediaSessionCompatResultReceiverWrapper;
                    if (!(!((Boolean) onviewattachedtowindow.getValue()).booleanValue())) {
                        int i14 = write + 79;
                        MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 == 0) {
                            TextAlign.Companion.m3511getCentere0LSkKk();
                            throw null;
                        }
                        iM3516getStarte0LSkKk = TextAlign.Companion.m3511getCentere0LSkKk();
                    } else {
                        iM3516getStarte0LSkKk = TextAlign.Companion.m3516getStarte0LSkKk();
                    }
                    Modifier modifierWrite6 = SizeKt.write(companion8, 1.0f);
                    float f3 = Dimensions.getAnimatedVisibility;
                    TextKt.m131TextNvy7gAk(str4, PaddingKt.RemoteActionCompatParcelizer(modifierWrite6, f3, ((Boolean) onviewattachedtowindow.getValue()).booleanValue() ? f3 : Dimensions.setTabContainer), 0L, 0L, null, null, 0L, TextAlign.m3504boximpl(iM3516getStarte0LSkKk), 0L, 0, false, 0, 0, null, textStyle, getpostalcode9, 0, 0, 130044);
                    if (((Boolean) onviewattachedtowindow.getValue()).booleanValue()) {
                        getpostalcode9.serializer(-1789014622);
                        HeaderKt.read(R.drawable.ic_bold_medium_cancel_thin, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, PaddingKt.m74paddingqDBjuR0$default(BoxScopeInstance.serializer.align(companion8, companion9.getCenterEnd()), 0.0f, 0.0f, f3, 0.0f, 11), false, null, getpostalcode9, 0, 24);
                        getpostalcode9.IconCompatParcelizer(false);
                    } else {
                        getpostalcode9.serializer(-1788668662);
                        getpostalcode9.IconCompatParcelizer(false);
                    }
                    getpostalcode9.IconCompatParcelizer(true);
                } else {
                    getpostalcode9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 13:
                Modifier modifier4 = (Modifier) obj5;
                removeGlobalPartnerParameter removeglobalpartnerparameter = (removeGlobalPartnerParameter) obj4;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) obj3;
                getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if ((iIntValue10 & 3) != 2) {
                    int i15 = MediaSessionCompatQueueItem + 99;
                    write = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    z = true;
                }
                getPostalCode getpostalcode10 = (getPostalCode) getbirthdatefull10;
                if (getpostalcode10.write(iIntValue10 & 1, z)) {
                    removeGlobalCallbackParametersI removeglobalcallbackparametersi = (removeGlobalCallbackParametersI) populateViewStructure_androidKtpopulate8.getValue();
                    boolean zIconCompatParcelizer2 = getpostalcode10.IconCompatParcelizer(removeglobalpartnerparameter);
                    Object objComponentActivity3 = getpostalcode10.ComponentActivity();
                    if (zIconCompatParcelizer2 || objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new CashBlockKt$CashBlock$1$1(0, removeglobalpartnerparameter, removeGlobalPartnerParameter.class, "onNextButtonClicked", "onNextButtonClicked()V", 0, 3);
                        getpostalcode10.write(objComponentActivity3);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                    boolean zIconCompatParcelizer3 = getpostalcode10.IconCompatParcelizer(removeglobalpartnerparameter);
                    Object objComponentActivity4 = getpostalcode10.ComponentActivity();
                    if (zIconCompatParcelizer3 || objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new CashBlockKt$CashBlock$1$1(0, removeglobalpartnerparameter, removeGlobalPartnerParameter.class, "onSignInButtonClicked", "onSignInButtonClicked()V", 0, 4);
                        getpostalcode10.write(objComponentActivity4);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4);
                    boolean zIconCompatParcelizer4 = getpostalcode10.IconCompatParcelizer(removeglobalpartnerparameter);
                    Object objComponentActivity5 = getpostalcode10.ComponentActivity();
                    if (zIconCompatParcelizer4 || objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new CashBlockKt$CashBlock$1$1(0, removeglobalpartnerparameter, removeGlobalPartnerParameter.class, "onBackButtonClicked", "onBackButtonClicked()V", 0, 5);
                        getpostalcode10.write(objComponentActivity5);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k8 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5);
                    boolean zIconCompatParcelizer5 = getpostalcode10.IconCompatParcelizer(removeglobalpartnerparameter);
                    Object objComponentActivity6 = getpostalcode10.ComponentActivity();
                    if (zIconCompatParcelizer5 || objComponentActivity6 == androidContentCaptureManager) {
                        objComponentActivity6 = new CashBlockKt$CashBlock$1$1(0, removeglobalpartnerparameter, removeGlobalPartnerParameter.class, "onPhonePrefixClicked", "onPhonePrefixClicked()V", 0, 6);
                        getpostalcode10.write(objComponentActivity6);
                    }
                    EmailAndPhoneScreenKt.EmailAndPhoneContent(removeglobalcallbackparametersi, modifier4, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdardpfsr94j4iebcwx_kpqzpm8k7, r8lambdardpfsr94j4iebcwx_kpqzpm8k8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity6), getpostalcode10, 0);
                } else {
                    getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 14:
                OtpVerificationViewModel otpVerificationViewModel = (OtpVerificationViewModel) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k9 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = (PopulateViewStructure_androidKtpopulate7) obj3;
                getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull11;
                if (getpostalcode11.write(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    trackThirdPartySharing trackthirdpartysharing = (trackThirdPartySharing) populateViewStructure_androidKtpopulate9.getValue();
                    boolean zIconCompatParcelizer6 = getpostalcode11.IconCompatParcelizer(otpVerificationViewModel);
                    Object objComponentActivity7 = getpostalcode11.ComponentActivity();
                    if (zIconCompatParcelizer6 || objComponentActivity7 == androidContentCaptureManager) {
                        SettingsFragment.AnonymousClass1 anonymousClass1 = new SettingsFragment.AnonymousClass1(1, otpVerificationViewModel, OtpVerificationViewModel.class, "onPinChanged", "onPinChanged(Lkotlinx/collections/immutable/ImmutableList;)V", 0, 11);
                        getpostalcode11.write(anonymousClass1);
                        objComponentActivity7 = anonymousClass1;
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity7);
                    boolean zIconCompatParcelizer7 = getpostalcode11.IconCompatParcelizer(otpVerificationViewModel);
                    Object objComponentActivity8 = getpostalcode11.ComponentActivity();
                    if (zIconCompatParcelizer7 || objComponentActivity8 == androidContentCaptureManager) {
                        CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$1 = new CashBlockKt$CashBlock$1$1(0, otpVerificationViewModel, OtpVerificationViewModel.class, "onResendClicked", "onResendClicked()V", 0, 7);
                        getpostalcode11.write(cashBlockKt$CashBlock$1$1);
                        objComponentActivity8 = cashBlockKt$CashBlock$1$1;
                    }
                    OtpVerificationContentKt.OtpVerificationContent(trackthirdpartysharing, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity8), getpostalcode11, 0);
                } else {
                    getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 15:
                FormBody.Builder builder = (FormBody.Builder) obj5;
                ActivityHandler2 activityHandler2 = (ActivityHandler2) obj4;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k10 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull12;
                if (getpostalcode12.write(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zIconCompatParcelizer8 = getpostalcode12.IconCompatParcelizer(activityHandler2);
                    Object objComponentActivity9 = getpostalcode12.ComponentActivity();
                    if (zIconCompatParcelizer8 || objComponentActivity9 == androidContentCaptureManager) {
                        objComponentActivity9 = new CashBlockKt$CashBlock$1$1(0, activityHandler2, ActivityHandler2.class, "onVerifyClicked", "onVerifyClicked()V", 0, 14);
                        getpostalcode12.write(objComponentActivity9);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k11 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity9);
                    builder.getClass();
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k11.getClass();
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k10.getClass();
                    new DragAndDropTargetModifierNode(new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k10, r8lambdardpfsr94j4iebcwx_kpqzpm8k11, builder, 16), true, 1494471755).invoke(getpostalcode12, 0);
                } else {
                    getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 16:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k12 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k13 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                FormBody.Builder builder2 = (FormBody.Builder) obj3;
                getBirthDateFull getbirthdatefull13 = (getBirthDateFull) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull13;
                if (getpostalcode13.write(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    int i17 = write + 85;
                    MediaSessionCompatQueueItem = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    Context context = (Context) getpostalcode13.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
                    boolean zIconCompatParcelizer9 = getpostalcode13.IconCompatParcelizer(builder2);
                    boolean zIconCompatParcelizer10 = getpostalcode13.IconCompatParcelizer(context);
                    Object objComponentActivity10 = getpostalcode13.ComponentActivity();
                    if ((zIconCompatParcelizer9 | zIconCompatParcelizer10) || objComponentActivity10 == androidContentCaptureManager) {
                        objComponentActivity10 = new OtpNavigationKt$$ExternalSyntheticLambda4(builder2, 22, context);
                        getpostalcode13.write(objComponentActivity10);
                    }
                    VerifyScreenKt.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k12, r8lambdardpfsr94j4iebcwx_kpqzpm8k13, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity10, null, getpostalcode13, 0);
                } else {
                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 17:
                r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) obj5;
                OnDemandWithBonusUiModel onDemandWithBonusUiModel = (OnDemandWithBonusUiModel) obj4;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3;
                getBirthDateFull getbirthdatefull14 = (getBirthDateFull) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode14 = (getPostalCode) getbirthdatefull14;
                if (getpostalcode14.write(iIntValue14 & 1, !((iIntValue14 & 3) == 2))) {
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke((getStoreInfoFromClient) ((OnDemandWithBonusUiModelImpl) onDemandWithBonusUiModel).PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode14, 384);
                } else {
                    getpostalcode14.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 18:
                r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) obj5;
                OnDemandUiModel onDemandUiModel = (OnDemandUiModel) obj4;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3;
                getBirthDateFull getbirthdatefull15 = (getBirthDateFull) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode15 = (getPostalCode) getbirthdatefull15;
                if (getpostalcode15.write(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2.invoke((getStoreInfoFromClient) ((OnDemandUiModelImpl) onDemandUiModel).PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, getpostalcode15, 384);
                } else {
                    getpostalcode15.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 19:
                AdjustBridgeInstance4 adjustBridgeInstance4 = (AdjustBridgeInstance4) obj5;
                String str5 = (String) obj4;
                String str6 = (String) obj3;
                getBirthDateFull getbirthdatefull16 = (getBirthDateFull) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode16 = (getPostalCode) getbirthdatefull16;
                if (getpostalcode16.write(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    HeaderKt.HeaderTitleAndDescription(((Boolean) ((onShowTranslationui) adjustBridgeInstance4.serializer).getValue()).booleanValue() ? str5 : null, str6, getpostalcode16, 0);
                } else {
                    getpostalcode16.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            default:
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5;
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode2 = (DragAndDropTargetModifierNode) obj4;
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode3 = (DragAndDropTargetModifierNode) obj3;
                getBirthDateFull getbirthdatefull17 = (getBirthDateFull) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if ((iIntValue17 & 3) != 2) {
                    int i19 = write + 25;
                    MediaSessionCompatQueueItem = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    z = true;
                }
                getPostalCode getpostalcode17 = (getPostalCode) getbirthdatefull17;
                if (getpostalcode17.write(1 & iIntValue17, z)) {
                    HeaderKt.HeaderLayout(((Density) getpostalcode17.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(HeaderKt.serializer), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, dragAndDropTargetModifierNode2, dragAndDropTargetModifierNode3, null, getpostalcode17, 3072);
                } else {
                    getpostalcode17.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
        }
    }
}
