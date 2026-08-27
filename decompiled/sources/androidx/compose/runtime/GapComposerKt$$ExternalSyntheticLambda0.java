package androidx.compose.runtime;

import android.app.RemoteAction;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.compose.ui.tooling.PreviewActivity;
import androidx.compose.ui.unit.Constraints;
import androidx.fragment.app.FragmentActivity;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.agconnect.config.impl.m;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.biometrics.presentation.BiometricsActivity;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.delivery.accept.declinebutton.presentation.DeclineButtonContentKt;
import com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt;
import com.roadrunner.delivery.ontheway.address.presentation.compose.DestinationAddressKt;
import com.roadrunner.delivery.ontheway.address.presentation.compose.DestinationSecondaryAddressKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.compose.DeliveryNotesKt;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.compose.DeliveryNotesLinkKt;
import com.roadrunner.delivery.ontheway.header.api.DestinationHeaderUiModel;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderButtonsKt;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.compose.TripInformationKt;
import com.roadrunner.delivery.pickupdropoff.details.api.PickUpDropOffDetailsUiModel;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderActionsFragment;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.compose.navigator.ContactRiderArgs;
import com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.sync.MutexImpl;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidStringDelegate;
import o.AndroidTextPaint;
import o.BaselineButtonTokens;
import o.BiasAlignmentVertical;
import o.CheckboxTokens;
import o.ComposedModifierKt;
import o.ContentType_androidKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.HeightInLinesNode;
import o.ImeAction;
import o.InlineChildren;
import o.InputMethodManagerImplimm2;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.ModifierCompanion;
import o.Nonelambda0;
import o.PlatformSelectionBehaviorsImpl;
import o.SemanticsSortKt;
import o.SwitchKt;
import o.TextDirectionCompanion;
import o.TextFieldDefaults;
import o.TextInputServiceAndroidstopInput2;
import o.TextLayoutResultProxy;
import o.TextStyleKtWhenMappings;
import o.accessgetContentcp;
import o.accessgetSentencescp;
import o.accessgetWordscp;
import o.accessisInitializedcp;
import o.accesssetStaticLayoutConstructorcp;
import o.accessupdateWithEmojiCompat;
import o.animateToHidden;
import o.any;
import o.buildMapping;
import o.cancelPendingWebViewPauselambda0;
import o.constrainedMap;
import o.consumeAvailableOffsetMKHz9U;
import o.copyejIjP34;
import o.createFromAutofillValue;
import o.createFromParcel;
import o.disableThirdPartySharingForCoppaEnabledI;
import o.drawTextLVfH_YUdefault;
import o.firstDescendantOrNull;
import o.getAddressCountry;
import o.getAddressStreet;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getCurrent;
import o.getCurrentSemanticsNodesui;
import o.getDetachedListenerui;
import o.getDoneeUduSuoannotations;
import o.getFactory;
import o.getGoeUduSuoannotations;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.getPreviouseUduSuoannotations;
import o.getSpanUnitR2X_6o;
import o.getSpanVerticalAligndo9XGgannotations;
import o.getType;
import o.getVerbatim;
import o.handleUrlOverridelambda1;
import o.hashCodeimpl;
import o.initui_toolingdefault;
import o.lerpInv;
import o.lookupAndInterpolate;
import o.materialize;
import o.moveTodefault;
import o.onCreateVirtualViewTranslationRequests;
import o.onMove;
import o.onRelease;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.onViewAttachedToWindowlambda0;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.s5;
import o.s9;
import o.setCurrentSemanticsNodesui;
import o.setMatrix;
import o.supportingTextPaddinga9UjIt4material3default;
import o.updateSelection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GapComposerKt$$ExternalSyntheticLambda0 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ GapComposerKt$$ExternalSyntheticLambda0(getPreviouseUduSuoannotations getpreviouseudusuoannotations, getDoneeUduSuoannotations getdoneeudusuoannotations, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.RemoteActionCompatParcelizer = 25;
        this.read = getdoneeudusuoannotations;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    public /* synthetic */ GapComposerKt$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.serializer = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0320 A[PHI: r2
  0x0320: PHI (r2v79 o.getPostalCode) = (r2v77 o.getPostalCode), (r2v80 o.getPostalCode) binds: [B:94:0x02f9, B:91:0x02ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:324:0x0b1f  */
    /* JADX WARN: Code duplicated, block: B:95:0x02fb A[PHI: r2
  0x02fb: PHI (r2v78 o.getPostalCode) = (r2v77 o.getPostalCode), (r2v80 o.getPostalCode) binds: [B:94:0x02f9, B:91:0x02ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x030f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v206 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89, types: [int] */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean z;
        TextRange textRangeM3064boximpl;
        Object obj3;
        TextClassification textClassification;
        TextClassification textClassification2;
        boolean z2;
        long jM732unboximpl;
        boolean z3;
        ?? r1;
        Modifier modifier;
        boolean z4;
        getPostalCode getpostalcode;
        boolean z5;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        boolean z6;
        boolean z7;
        Map mapSerializer;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.serializer;
        Object obj5 = this.read;
        int i4 = 9;
        switch (i3) {
            case 0:
                firstDescendantOrNull firstdescendantornull = (firstDescendantOrNull) obj5;
                getType gettype = (getType) obj4;
                int iIntValue = ((Integer) obj).intValue();
                if (obj2 instanceof getAddressStreet) {
                    ((onCreateVirtualViewTranslationRequests) firstdescendantornull.write).IconCompatParcelizer((getAddressStreet) obj2);
                } else if (!(obj2 instanceof getCurrentSemanticsNodesui)) {
                    int i5 = write + 25;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        boolean z8 = obj2 instanceof createFromAutofillValue;
                        Object obj6 = null;
                        obj6.hashCode();
                        throw null;
                    }
                    if (obj2 instanceof createFromAutofillValue) {
                        ContentType_androidKt.IconCompatParcelizer(gettype, iIntValue, obj2);
                        firstdescendantornull.serializer((createFromAutofillValue) obj2);
                    } else if (obj2 instanceof getHandleruiannotations) {
                        ContentType_androidKt.IconCompatParcelizer(gettype, iIntValue, obj2);
                        ((getHandleruiannotations) obj2).RemoteActionCompatParcelizer();
                    }
                }
                return createfromparcel;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                ((HeightInLinesNode) obj5).read(fFloatValue, ((Float) obj2).floatValue());
                ((cancelPendingWebViewPauselambda0) obj4).write = fFloatValue;
                return createfromparcel;
            case 2:
                cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0 = (cancelPendingWebViewPauselambda0) obj5;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = cancelpendingwebviewpauselambda0.write;
                cancelpendingwebviewpauselambda0.write = ((PlatformSelectionBehaviorsImpl) obj4).read(fFloatValue2 - f) + f;
                return createfromparcel;
            case 3:
                animateToHidden animatetohidden = (animateToHidden) obj5;
                consumeAvailableOffsetMKHz9U consumeavailableoffsetmkhz9u = (consumeAvailableOffsetMKHz9U) obj4;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
                if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    onRelease onrelease = (onRelease) animatetohidden.write.invoke();
                    int iSerializer = consumeavailableoffsetmkhz9u.read;
                    Object obj7 = consumeavailableoffsetmkhz9u.serializer;
                    if ((iSerializer >= onrelease.serializer() || !onrelease.write(iSerializer).equals(obj7)) && (iSerializer = onrelease.serializer(obj7)) != -1) {
                        consumeavailableoffsetmkhz9u.read = iSerializer;
                    }
                    if (iSerializer != -1) {
                        getpostalcode2.serializer(-1664741271);
                        moveTodefault.serializer(onrelease, animatetohidden.serializer, iSerializer, consumeavailableoffsetmkhz9u.serializer, getpostalcode2, 0);
                        getpostalcode2.IconCompatParcelizer(false);
                    } else {
                        getpostalcode2.serializer(-1664505826);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                    boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(consumeavailableoffsetmkhz9u);
                    Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new InlineChildren(i4, consumeavailableoffsetmkhz9u);
                        getpostalcode2.write(objComponentActivity2);
                    }
                    getPhoneNumberNational.serializer(obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode2);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 4:
                return ((CheckboxTokens) obj4).mo89measure0kLqBqw(new BaselineButtonTokens((animateToHidden) obj5, (SubcomposeMeasureScope) obj), ((Constraints) obj2).m3632unboximpl());
            case 5:
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) obj5;
                getCurrent getcurrent = (getCurrent) obj4;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dragAndDropTargetModifierNode.invoke(getcurrent, getpostalcode3, 0);
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 6:
                cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1 = (cancelPendingWebViewPauselambda0) obj5;
                float fFloatValue3 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                cancelpendingwebviewpauselambda1.write += ((PlatformSelectionBehaviorsImpl) ((TextLayoutResultProxy) obj4).write).read(fFloatValue3 - cancelpendingwebviewpauselambda1.write);
                return createfromparcel;
            case 7:
                hashCodeimpl hashcodeimpl = (hashCodeimpl) obj5;
                ComposedModifierKt composedModifierKt = (ComposedModifierKt) obj4;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if ((iIntValue4 & 3) != 2) {
                    i = 1;
                    z = false;
                } else {
                    i = 1;
                    z = true;
                }
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode4.write(iIntValue4 & i, !z)) {
                    int i6 = IconCompatParcelizer + 109;
                    write = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    boolean z9 = getpostalcode4.read(hashcodeimpl);
                    Object objComponentActivity3 = getpostalcode4.ComponentActivity();
                    if (z9 || objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = CompositionKt.serializer(new MapboxNavigation.AnonymousClass15(0, hashcodeimpl, hashCodeimpl.class, RemoteMessageConst.DATA, "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 1));
                        getpostalcode4.write(objComponentActivity3);
                    }
                    materialize.serializer(composedModifierKt, (any) ((onViewAttachedToWindow) objComponentActivity3).getValue(), getpostalcode4, 0);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 8:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj5;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj4;
                BiasAlignmentVertical biasAlignmentVertical = (BiasAlignmentVertical) obj;
                Context context = (Context) obj2;
                boolean z10 = textFieldSelectionManager.read();
                AnnotatedString annotatedStringSerializer = textFieldSelectionManager.serializer();
                String text = annotatedStringSerializer != null ? annotatedStringSerializer.getText() : null;
                TextRange textRange = textFieldSelectionManager.MediaSessionCompatToken;
                if (textRange != null) {
                    long jM3080unboximpl = textRange.m3080unboximpl();
                    OffsetMapping offsetMapping = textFieldSelectionManager.PlaybackStateCompatCustomAction;
                    textRangeM3064boximpl = TextRange.m3064boximpl(TextRangeKt.TextRange(offsetMapping.originalToTransformed(TextRange.m3076getStartimpl(jM3080unboximpl)), offsetMapping.originalToTransformed(TextRange.m3071getEndimpl(jM3080unboximpl))));
                } else {
                    textRangeM3064boximpl = null;
                }
                o.Modifier modifier2 = textFieldSelectionManager.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                UserJavascriptInterfaceBase$$ExternalSyntheticLambda12 userJavascriptInterfaceBase$$ExternalSyntheticLambda12 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(textFieldSelectionManager, getcontentviewgroupparentlayout, context, 11);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = ModifierCompanion.read;
                if (text == null || textRangeM3064boximpl == null || modifier2 == null || !(modifier2 instanceof androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl)) {
                    userJavascriptInterfaceBase$$ExternalSyntheticLambda12.invoke(biasAlignmentVertical);
                    if (text != null && textRangeM3064boximpl != null) {
                        disableThirdPartySharingForCoppaEnabledI.serializer(biasAlignmentVertical, context, z10, text, textRangeM3064boximpl.m3080unboximpl());
                    }
                } else {
                    androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl) modifier2;
                    long jM3080unboximpl2 = textRangeM3064boximpl.m3080unboximpl();
                    Object obj8 = platformSelectionBehaviorsImpl.RemoteActionCompatParcelizer;
                    MutexImpl mutexImpl = platformSelectionBehaviorsImpl.IconCompatParcelizer;
                    if (mutexImpl.write()) {
                        getDetachedListenerui getdetachedlistenerui = (getDetachedListenerui) ((onShowTranslationui) platformSelectionBehaviorsImpl.MediaDescriptionCompat).getValue();
                        if (getdetachedlistenerui == null || (!TextRange.m3069equalsimpl0(jM3080unboximpl2, getdetachedlistenerui.write))) {
                            obj3 = null;
                            textClassification = null;
                        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{text, getdetachedlistenerui.serializer}, getCieXyz.write())).booleanValue()) {
                            textClassification = getdetachedlistenerui.IconCompatParcelizer;
                            obj3 = null;
                        } else {
                            obj3 = null;
                            textClassification = null;
                        }
                        mutexImpl.write(obj3);
                        textClassification2 = textClassification;
                    } else {
                        textClassification2 = null;
                    }
                    if (textClassification2 == null) {
                        userJavascriptInterfaceBase$$ExternalSyntheticLambda12.invoke(biasAlignmentVertical);
                    } else {
                        if (!textClassification2.getActions().isEmpty()) {
                            biasAlignmentVertical.write.read(new getFactory(obj8, textClassification2, 0));
                        } else if ((textClassification2.getIcon() != null || !TextUtils.isEmpty(textClassification2.getLabel())) && (textClassification2.getIntent() != null || textClassification2.getOnClickListener() != null)) {
                            biasAlignmentVertical.write.read(new getFactory(obj8, textClassification2, -1));
                        }
                        userJavascriptInterfaceBase$$ExternalSyntheticLambda12.invoke(biasAlignmentVertical);
                        List<RemoteAction> actions = textClassification2.getActions();
                        int size = actions.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            int i9 = IconCompatParcelizer + 65;
                            write = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            actions.get(i8);
                            if (i8 > 0) {
                                biasAlignmentVertical.write.read(new getFactory(obj8, textClassification2, i8));
                            }
                        }
                    }
                    disableThirdPartySharingForCoppaEnabledI.serializer(biasAlignmentVertical, context, z10, text, textRangeM3064boximpl.m3080unboximpl());
                }
                return createfromparcel;
            case 9:
                return ComposeViewAdapter.WrapPreview$lambda$0((ComposeViewAdapter) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 10:
                return PreviewActivity.setParameterizedContent$lambda$0$1((Object[]) obj5, (getPlatformAndroidManager) obj4, (getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 11:
                return PreviewActivity.setComposableContent$lambda$1((String) obj5, (String) obj4, (getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 12:
                return BiometricsActivity.IconCompatParcelizer((BiometricsActivity) obj5, (SemanticsSortKt) obj4, (getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 13:
                return SelfServiceCustomerChatActivity.serializer((SelfServiceCustomerChatActivity) obj5, (onViewAttachedToWindow) obj4, (getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 14:
                drawTextLVfH_YUdefault drawtextlvfh_yudefault = (drawTextLVfH_YUdefault) obj5;
                getVerbatim getverbatim = (getVerbatim) obj4;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode5.write(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    new DragAndDropTargetModifierNode(new GapComposerKt$$ExternalSyntheticLambda0(getverbatim, 15, drawtextlvfh_yudefault.IconCompatParcelizer), true, -24786998).invoke(getpostalcode5, 0);
                } else {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 15:
                getVerbatim getverbatim2 = (getVerbatim) obj5;
                TextStyleKtWhenMappings textStyleKtWhenMappings = (TextStyleKtWhenMappings) obj4;
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull5;
                if (getpostalcode6.write(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    DeclineButtonContentKt.DeclineButtonContent(getverbatim2, textStyleKtWhenMappings.write, getpostalcode6, 0);
                } else {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 16:
                SwitchKt switchKt = (SwitchKt) obj5;
                accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcp = (accesssetStaticLayoutConstructorcp) obj4;
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull6;
                boolean zWrite = getpostalcode7.write(iIntValue7 & 1, (iIntValue7 & 3) != 2);
                getAddressCountry getaddresscountry = getpostalcode7.read;
                if (zWrite) {
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(SizeKt.write(companion, 1.0f), switchKt);
                    Alignment.Companion companion2 = Alignment.Companion;
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getCenterHorizontally(), getpostalcode7, 48);
                    int iHashCode = Long.hashCode(getpostalcode7.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode7.serializer();
                    Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode7, modifierIconCompatParcelizer);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                    if (getaddresscountry == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    int i11 = write + 101;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        Object obj9 = null;
                        getpostalcode7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        boolean z11 = getpostalcode7.ComponentActivity;
                        obj9.hashCode();
                        throw null;
                    }
                    getpostalcode7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode7.ComponentActivity) {
                        getpostalcode7.serializer(constructor);
                    } else {
                        getpostalcode7.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode7, modalBottomSheetYbuCTN8Serializer, getpostalcode7, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode7, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode7, Integer.valueOf(iHashCode), getpostalcode7));
                    accesssetstaticlayoutconstructorcp.getClass();
                    getpostalcode7.serializer(-1919151494);
                    getpostalcode7.IconCompatParcelizer(false);
                    String str = accesssetstaticlayoutconstructorcp.MediaMetadataCompat;
                    if (str == null) {
                        getpostalcode7.serializer(-1919109583);
                        getpostalcode7.IconCompatParcelizer(false);
                    } else {
                        getpostalcode7.serializer(-1919109582);
                        TextKt.m131TextNvy7gAk(str, companion, ((buildMapping) getpostalcode7.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode7, 48, 0, 131064);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode7, PaddingKt.write(companion, Dimensions.getNestedScrollAxes)});
                        getpostalcode7.IconCompatParcelizer(false);
                    }
                    FlowLayoutKt.serializer(null, Arrangement.IconCompatParcelizer, null, null, 0, 0, ExtrasKt.write(149545933, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(i4, accesssetstaticlayoutconstructorcp), getpostalcode7), getpostalcode7, 1572912, 61);
                    lerpInv lerpinv = accesssetstaticlayoutconstructorcp.RemoteActionCompatParcelizer;
                    if (lerpinv == null) {
                        getpostalcode7.serializer(-1917436296);
                        z3 = false;
                        getpostalcode7.IconCompatParcelizer(false);
                    } else {
                        getpostalcode7.serializer(-1917436295);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode7, PaddingKt.write(companion, Dimensions.getActionBarHideOffset)});
                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getTop(), getpostalcode7, 0);
                        int iHashCode2 = Long.hashCode(getpostalcode7.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode7.serializer();
                        Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode7, companion);
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                        getpostalcode7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode7.ComponentActivity) {
                            getpostalcode7.serializer(constructor2);
                        } else {
                            getpostalcode7.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode7, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode7, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode7, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode7, Integer.valueOf(iHashCode2), getpostalcode7));
                        getpostalcode7.serializer(-871210844);
                        for (constrainedMap constrainedmap : lerpinv.write) {
                            boolean z12 = getpostalcode7.read(constrainedmap.write);
                            Object objComponentActivity4 = getpostalcode7.ComponentActivity();
                            if (z12 || objComponentActivity4 == androidContentCaptureManager) {
                                objComponentActivity4 = SingleEarningsContentKt.RemoteActionCompatParcelizer(constrainedmap);
                                getpostalcode7.write(objComponentActivity4);
                            }
                            Color color = (Color) objComponentActivity4;
                            if (color == null) {
                                getpostalcode7.serializer(-1492182502);
                                jM732unboximpl = ColorResources_androidKt.colorResource(constrainedmap.IconCompatParcelizer, getpostalcode7, 0);
                                getpostalcode7.IconCompatParcelizer(false);
                            } else {
                                getpostalcode7.serializer(-1492185943);
                                getpostalcode7.IconCompatParcelizer(false);
                                jM732unboximpl = color.m732unboximpl();
                            }
                            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(constrainedmap.serializer, getpostalcode7, 0), constrainedmap.write, SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 11), Dimensions.setHideOnContentScrollEnabled), jM732unboximpl, getpostalcode7, Painter.$stable, 0);
                        }
                        getpostalcode7.IconCompatParcelizer(false);
                        String str2 = lerpinv.RemoteActionCompatParcelizer;
                        if (str2 == null) {
                            getpostalcode7.serializer(-1236777246);
                            getpostalcode7.IconCompatParcelizer(false);
                            z2 = false;
                        } else {
                            getpostalcode7.serializer(-1236777245);
                            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode7.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode7, 0, 0, 131066);
                            z2 = false;
                            getpostalcode7.IconCompatParcelizer(false);
                        }
                        getpostalcode7.IconCompatParcelizer(true);
                        getpostalcode7.IconCompatParcelizer(z2);
                        z3 = z2;
                    }
                    lookupAndInterpolate lookupandinterpolate = accesssetstaticlayoutconstructorcp.IconCompatParcelizer;
                    accessisInitializedcp accessisinitializedcp = accesssetstaticlayoutconstructorcp.read;
                    if (lookupandinterpolate == null && accessisinitializedcp == null) {
                        getpostalcode7.serializer(-1915736038);
                        getpostalcode7.IconCompatParcelizer(z3);
                        r1 = z3;
                    } else {
                        getpostalcode7.serializer(-1915821567);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode7, PaddingKt.write(Modifier.Companion, Dimensions.getActionBarHideOffset)});
                        r1 = 0;
                        getpostalcode7.IconCompatParcelizer(false);
                    }
                    SingleEarningsContentKt.serializer(lookupandinterpolate, accessisinitializedcp, null, getpostalcode7, r1);
                    getpostalcode7.IconCompatParcelizer(true);
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 17:
                setMatrix setmatrix = (setMatrix) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull7;
                if (getpostalcode8.write(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    int i12 = write + 25;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    Modifier.Companion companion4 = Modifier.Companion;
                    float f2 = Dimensions.setStackedBackground;
                    Modifier modifier3 = PaddingKt.read(companion4, f2, f2, Dimensions.getAnimatedVisibility, f2);
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode8, 0);
                    int iHashCode3 = Long.hashCode(getpostalcode8.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode8.serializer();
                    Modifier modifierMaterializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode8, modifier3);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion5.getConstructor();
                    if (getpostalcode8.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode8.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode8.ComponentActivity) {
                        getpostalcode8.serializer(constructor3);
                    } else {
                        getpostalcode8.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion5, getpostalcode8, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode8, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode8, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode8, Integer.valueOf(iHashCode3), getpostalcode8));
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_map_pin, getpostalcode8, 0);
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m83size3ABfNKs(companion4, Dimensions.removeMenuProvider), ((buildMapping) getpostalcode8.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter(), getpostalcode8, Painter.$stable | 48, 0);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode8, SizeKt.m86width3ABfNKs(companion4, Dimensions.setTabContainer)});
                    String str3 = setmatrix.write;
                    TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    long presenter = ((buildMapping) getpostalcode8.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter();
                    Modifier modifierWrite = SizeKt.write(companion4, 1.0f);
                    boolean z13 = getpostalcode8.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    Object objComponentActivity5 = getpostalcode8.ComponentActivity();
                    if (!(!z13) || objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 7);
                        getpostalcode8.write(objComponentActivity5);
                    }
                    TextKt.m131TextNvy7gAk(str3, modifierWrite, presenter, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, textStyle, getpostalcode8, 48, 0, 65528);
                    getpostalcode8.IconCompatParcelizer(true);
                } else {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 18:
                ComposeView composeView = (ComposeView) obj5;
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode2 = (DragAndDropTargetModifierNode) obj4;
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode9 = (getPostalCode) getbirthdatefull8;
                if (getpostalcode9.write(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                    Modifier modifierWrite2 = PaddingKt.write(Modifier.Companion.then(SizeKt.read), Dimensions.getActionBarHideOffset);
                    MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iHashCode4 = Long.hashCode(getpostalcode9.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode9.serializer();
                    Modifier modifierMaterializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode9, modifierWrite2);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion6.getConstructor();
                    if (getpostalcode9.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode9.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode9.ComponentActivity) {
                        getpostalcode9.serializer(constructor4);
                    } else {
                        getpostalcode9.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion6, getpostalcode9, measurePolicy, getpostalcode9, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode9, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion6, getpostalcode9, Integer.valueOf(iHashCode4), getpostalcode9));
                    dragAndDropTargetModifierNode2.invoke(getpostalcode9, 0);
                    getpostalcode9.IconCompatParcelizer(true);
                } else {
                    getpostalcode9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 19:
                s5 s5Var = (s5) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                getBirthDateFull getbirthdatefull9 = (getBirthDateFull) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode10 = (getPostalCode) getbirthdatefull9;
                if (getpostalcode10.write(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    Modifier modifierWrite3 = SizeKt.write(Modifier.Companion, 1.0f);
                    float f3 = Dimensions.setActionBarVisibilityCallback;
                    Modifier modifier4 = PaddingKt.read(modifierWrite3, f3, f3, f3, Dimensions.getNestedScrollAxes);
                    MeasurePolicy measurePolicy2 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iHashCode5 = Long.hashCode(getpostalcode10.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode10.serializer();
                    Modifier modifierMaterializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode10, modifier4);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion7.getConstructor();
                    if (getpostalcode10.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode10.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode10.ComponentActivity) {
                        getpostalcode10.serializer(constructor5);
                    } else {
                        getpostalcode10.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion7, getpostalcode10, measurePolicy2, getpostalcode10, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode10, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion7, getpostalcode10, Integer.valueOf(iHashCode5), getpostalcode10));
                    DestinationAddressKt.Address(s5Var.IconCompatParcelizer, s5Var.RemoteActionCompatParcelizer, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode10, 0);
                    getpostalcode10.IconCompatParcelizer(true);
                } else {
                    getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 20:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                s9 s9Var = (s9) obj4;
                getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull10;
                if (getpostalcode11.write(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    DestinationSecondaryAddressKt.DestinationSecondaryAddressWithBadge(0, getpostalcode11, null, s9Var, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                } else {
                    getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 21:
                m mVar = (m) obj5;
                FragmentActivity fragmentActivity = (FragmentActivity) obj4;
                InputMethodManagerImplimm2 inputMethodManagerImplimm2 = (InputMethodManagerImplimm2) obj;
                String str4 = (String) obj2;
                inputMethodManagerImplimm2.getClass();
                str4.getClass();
                if (inputMethodManagerImplimm2.equals(accessgetWordscp.IconCompatParcelizer)) {
                    ((p0) mVar.read).getClass();
                    p0.read(fragmentActivity);
                    return createfromparcel;
                }
                if (inputMethodManagerImplimm2.equals(accessgetSentencescp.write)) {
                    ((n0) mVar.RemoteActionCompatParcelizer).getClass();
                    n0.IconCompatParcelizer(fragmentActivity, str4);
                    return createfromparcel;
                }
                if (inputMethodManagerImplimm2.equals(updateSelection.RemoteActionCompatParcelizer)) {
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 22:
                accessupdateWithEmojiCompat accessupdatewithemojicompat = (accessupdateWithEmojiCompat) obj5;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4;
                getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull11;
                if (getpostalcode12.write(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    Modifier.Companion companion8 = Modifier.Companion;
                    float f4 = Dimensions.setActionBarVisibilityCallback;
                    float f5 = Dimensions.getNestedScrollAxes;
                    Modifier modifier5 = PaddingKt.read(companion8, f4, f5, f4, f5);
                    MeasurePolicy measurePolicy3 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iHashCode6 = Long.hashCode(getpostalcode12.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer6 = getpostalcode12.serializer();
                    Modifier modifierMaterializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode12, modifier5);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor6 = companion9.getConstructor();
                    if (getpostalcode12.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode12.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode12.ComponentActivity) {
                        int i14 = write + 105;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 != 0) {
                            getpostalcode12.serializer(constructor6);
                            Object obj10 = null;
                            obj10.hashCode();
                            throw null;
                        }
                        getpostalcode12.serializer(constructor6);
                        modifier = null;
                    } else {
                        modifier = null;
                        getpostalcode12.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion9, getpostalcode12, measurePolicy3, getpostalcode12, dragAndDropNodestartDragAndDropTransfer1Serializer6);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode12, modifierMaterializeModifier6, m1$$ExternalSyntheticOutline0.m(companion9, getpostalcode12, Integer.valueOf(iHashCode6), getpostalcode12));
                    DeliveryNotesKt.DeliveryNotesContent(accessupdatewithemojicompat, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, getpostalcode12, 0);
                    getpostalcode12.IconCompatParcelizer(true);
                } else {
                    getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 23:
                TextInputServiceAndroidstopInput2 textInputServiceAndroidstopInput2 = (TextInputServiceAndroidstopInput2) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull12;
                if (getpostalcode13.write(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    Modifier.Companion companion10 = Modifier.Companion;
                    float f6 = Dimensions.setActionBarVisibilityCallback;
                    float f7 = Dimensions.getNestedScrollAxes;
                    Modifier modifier6 = PaddingKt.read(companion10, f6, f7, f6, f7);
                    MeasurePolicy measurePolicy4 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iHashCode7 = Long.hashCode(getpostalcode13.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer7 = getpostalcode13.serializer();
                    Modifier modifierMaterializeModifier7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode13, modifier6);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor7 = companion11.getConstructor();
                    if (getpostalcode13.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode13.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode13.ComponentActivity) {
                        getpostalcode13.serializer(constructor7);
                    } else {
                        getpostalcode13.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion11, getpostalcode13, measurePolicy4, getpostalcode13, dragAndDropNodestartDragAndDropTransfer1Serializer7);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode13, modifierMaterializeModifier7, m1$$ExternalSyntheticOutline0.m(companion11, getpostalcode13, Integer.valueOf(iHashCode7), getpostalcode13));
                    DeliveryNotesLinkKt.DeliveryNotesContent(textInputServiceAndroidstopInput2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, getpostalcode13, 0);
                    getpostalcode13.IconCompatParcelizer(true);
                } else {
                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 24:
                getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations = (getSpanVerticalAligndo9XGgannotations) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                getBirthDateFull getbirthdatefull13 = (getBirthDateFull) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if ((iIntValue14 & 3) != 2) {
                    int i15 = write + 91;
                    IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    z4 = true;
                } else {
                    z4 = false;
                }
                int i17 = write + 13;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    getpostalcode = (getPostalCode) getbirthdatefull13;
                    if (getpostalcode.write(iIntValue14 & 1, z4)) {
                        getspanverticalaligndo9xggannotations.getClass();
                        z5 = getpostalcode.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getspanverticalaligndo9xggannotations);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (!(z5 | zIconCompatParcelizer) || objComponentActivity == androidContentCaptureManager) {
                            objComponentActivity = new TextDirectionCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getspanverticalaligndo9xggannotations, 1);
                            getpostalcode.write(objComponentActivity);
                        }
                        getSpanUnitR2X_6o.IconCompatParcelizer(0, getpostalcode, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity);
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                } else {
                    getpostalcode = (getPostalCode) getbirthdatefull13;
                    if (getpostalcode.write(iIntValue14 & 1, z4)) {
                        getspanverticalaligndo9xggannotations.getClass();
                        z5 = getpostalcode.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getspanverticalaligndo9xggannotations);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (z5 || zIconCompatParcelizer) {
                            objComponentActivity = new TextDirectionCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getspanverticalaligndo9xggannotations, 1);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            objComponentActivity = new TextDirectionCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getspanverticalaligndo9xggannotations, 1);
                            getpostalcode.write(objComponentActivity);
                        }
                        getSpanUnitR2X_6o.IconCompatParcelizer(0, getpostalcode, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity);
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                }
                return createfromparcel;
            case 25:
                getDoneeUduSuoannotations getdoneeudusuoannotations = (getDoneeUduSuoannotations) obj5;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4;
                getBirthDateFull getbirthdatefull14 = (getBirthDateFull) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode14 = (getPostalCode) getbirthdatefull14;
                if (getpostalcode14.write(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    getGoeUduSuoannotations.RemoteActionCompatParcelizer.invoke(getdoneeudusuoannotations, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode14, 0);
                } else {
                    getpostalcode14.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 26:
                AndroidTextPaint androidTextPaint = (AndroidTextPaint) obj5;
                DestinationHeaderUiModel destinationHeaderUiModel = (DestinationHeaderUiModel) obj4;
                getBirthDateFull getbirthdatefull15 = (getBirthDateFull) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode15 = (getPostalCode) getbirthdatefull15;
                if (getpostalcode15.write(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations2 = androidTextPaint.serializer;
                    if (getspanverticalaligndo9xggannotations2 != null) {
                        getpostalcode15.serializer(-886331415);
                        boolean z14 = getpostalcode15.read(destinationHeaderUiModel);
                        Object objComponentActivity6 = getpostalcode15.ComponentActivity();
                        if (z14 || objComponentActivity6 == androidContentCaptureManager) {
                            objComponentActivity6 = new ReportPictureUseCase$invoke$2(1, destinationHeaderUiModel, DestinationHeaderUiModel.class, "onCallClicked", "onCallClicked(Lcom/roadrunner/delivery/ontheway/phonecall/api/PhoneNumber;)V", 0, 21);
                            getpostalcode15.write(objComponentActivity6);
                        }
                        DestinationHeaderButtonsKt.RemoteActionCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity6), getspanverticalaligndo9xggannotations2, getpostalcode15, 64);
                        getpostalcode15.IconCompatParcelizer(false);
                    } else {
                        getpostalcode15.serializer(-886152669);
                        getpostalcode15.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode15.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 27:
                AndroidStringDelegate androidStringDelegate = (AndroidStringDelegate) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                getBirthDateFull getbirthdatefull16 = (getBirthDateFull) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if ((iIntValue17 & 3) != 2) {
                    int i18 = write + 9;
                    IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    z6 = true;
                } else {
                    z6 = false;
                }
                getPostalCode getpostalcode16 = (getPostalCode) getbirthdatefull16;
                boolean zWrite2 = getpostalcode16.write(iIntValue17 & 1, z6);
                getAddressCountry getaddresscountry2 = getpostalcode16.read;
                if (zWrite2) {
                    Modifier.Companion companion12 = Modifier.Companion;
                    Modifier modifierWrite4 = SizeKt.write(companion12, 1.0f);
                    Alignment.Companion companion13 = Alignment.Companion;
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer3 = TextFieldDefaults.serializer(Arrangement.read, companion13.getCenterVertically(), getpostalcode16, 54);
                    int iHashCode8 = Long.hashCode(getpostalcode16.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer8 = getpostalcode16.serializer();
                    Modifier modifierMaterializeModifier8 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode16, modifierWrite4);
                    ComposeUiNode.Companion companion14 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor8 = companion14.getConstructor();
                    if (getaddresscountry2 == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode16.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode16.ComponentActivity) {
                        getpostalcode16.serializer(constructor8);
                    } else {
                        getpostalcode16.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion14, getpostalcode16, supportingtextpaddinga9ujit4material3defaultSerializer3, getpostalcode16, dragAndDropNodestartDragAndDropTransfer1Serializer8);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode16, modifierMaterializeModifier8, m1$$ExternalSyntheticOutline0.m(companion14, getpostalcode16, Integer.valueOf(iHashCode8), getpostalcode16));
                    Modifier modifierWrite5 = copyejIjP34.write(companion12, 0.8f);
                    MeasurePolicy measurePolicy5 = BoxKt.read(companion13.getTopStart(), false);
                    int iHashCode9 = Long.hashCode(getpostalcode16.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer9 = getpostalcode16.serializer();
                    Modifier modifierMaterializeModifier9 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode16, modifierWrite5);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor9 = companion14.getConstructor();
                    getpostalcode16.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode16.ComponentActivity) {
                        int i20 = write + 77;
                        IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                        if (i20 % 2 != 0) {
                            getpostalcode16.serializer(constructor9);
                            int i21 = 15 / 0;
                        } else {
                            getpostalcode16.serializer(constructor9);
                        }
                    } else {
                        getpostalcode16.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion14, getpostalcode16, measurePolicy5, getpostalcode16, dragAndDropNodestartDragAndDropTransfer1Serializer9);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode16, modifierMaterializeModifier9, m1$$ExternalSyntheticOutline0.m(companion14, getpostalcode16, Integer.valueOf(iHashCode9), getpostalcode16));
                    DestinationHeaderKt.DestinationTextContainer(androidStringDelegate, null, getpostalcode16, 8);
                    getpostalcode16.IconCompatParcelizer(true);
                    getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations3 = androidStringDelegate.serializer;
                    if (getspanverticalaligndo9xggannotations3 != null) {
                        getpostalcode16.serializer(1386085655);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode16, copyejIjP34.write(companion12, 0.03f)});
                        float f8 = Dimensions.getSubtitle;
                        Modifier modifierWrite6 = SizeKt.write(companion12, f8, f8);
                        MeasurePolicy measurePolicy6 = BoxKt.read(companion13.getTopStart(), false);
                        int iHashCode10 = Long.hashCode(getpostalcode16.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer10 = getpostalcode16.serializer();
                        Modifier modifierMaterializeModifier10 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode16, modifierWrite6);
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor10 = companion14.getConstructor();
                        getpostalcode16.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode16.ComponentActivity) {
                            getpostalcode16.serializer(constructor10);
                        } else {
                            getpostalcode16.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        af$$ExternalSyntheticOutline0.m(companion14, getpostalcode16, measurePolicy6, getpostalcode16, dragAndDropNodestartDragAndDropTransfer1Serializer10);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode16, modifierMaterializeModifier10, m1$$ExternalSyntheticOutline0.m(companion14, getpostalcode16, Integer.valueOf(iHashCode10), getpostalcode16));
                        boolean z15 = getpostalcode16.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm3);
                        boolean zIconCompatParcelizer3 = getpostalcode16.IconCompatParcelizer(getspanverticalaligndo9xggannotations3);
                        Object objComponentActivity7 = getpostalcode16.ComponentActivity();
                        if ((z15 | zIconCompatParcelizer3) || objComponentActivity7 == androidContentCaptureManager) {
                            objComponentActivity7 = new TextDirectionCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm3, getspanverticalaligndo9xggannotations3, 2);
                            getpostalcode16.write(objComponentActivity7);
                        }
                        getSpanUnitR2X_6o.IconCompatParcelizer(0, getpostalcode16, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7);
                        z7 = true;
                        getpostalcode16.IconCompatParcelizer(true);
                        getpostalcode16.IconCompatParcelizer(false);
                    } else {
                        z7 = true;
                        getpostalcode16.serializer(1386530598);
                        getpostalcode16.IconCompatParcelizer(false);
                    }
                    getpostalcode16.IconCompatParcelizer(z7);
                } else {
                    getpostalcode16.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 28:
                accessgetContentcp accessgetcontentcp = (accessgetContentcp) obj5;
                Nonelambda0 nonelambda0 = (Nonelambda0) obj4;
                getBirthDateFull getbirthdatefull17 = (getBirthDateFull) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode17 = (getPostalCode) getbirthdatefull17;
                if (getpostalcode17.write(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ImeAction imeAction = accessgetcontentcp.IconCompatParcelizer;
                    if (imeAction != null) {
                        String str5 = imeAction.IconCompatParcelizer;
                        boolean zIconCompatParcelizer4 = getpostalcode17.IconCompatParcelizer(nonelambda0);
                        boolean zIconCompatParcelizer5 = getpostalcode17.IconCompatParcelizer(imeAction);
                        Object objComponentActivity8 = getpostalcode17.ComponentActivity();
                        if ((zIconCompatParcelizer4 | zIconCompatParcelizer5) || objComponentActivity8 == androidContentCaptureManager) {
                            objComponentActivity8 = new ViewUtils$$ExternalSyntheticLambda6(nonelambda0, 29, imeAction);
                            getpostalcode17.write(objComponentActivity8);
                        }
                        TripInformationKt.serializer(0, getpostalcode17, null, str5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity8);
                    }
                } else {
                    getpostalcode17.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            default:
                InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider = (InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider) obj;
                InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet = (InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) obj2;
                instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.getClass();
                instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet.getClass();
                PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl = (PickUpDropOffDetailsUiModelImpl) ((PickUpDropOffDetailsUiModel) obj5);
                pickUpDropOffDetailsUiModelImpl.getClass();
                ContactRiderArgs contactRiderArgs = new ContactRiderArgs(instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider, instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet);
                Bundle bundle = new Bundle();
                bundle.putParcelable("RIDER_PARAMS", contactRiderArgs);
                ContactRiderActionsFragment contactRiderActionsFragment = new ContactRiderActionsFragment();
                contactRiderActionsFragment.setArguments(bundle);
                contactRiderActionsFragment.RemoteActionCompatParcelizer(((FragmentActivity) obj4).getSupportFragmentManager(), "com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderActionsFragment");
                initui_toolingdefault initui_toolingdefaultVar = pickUpDropOffDetailsUiModelImpl.MediaMetadataCompat;
                List list = instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.serializer;
                if (list != null) {
                    ArrayList<TrackingEvent> arrayList = new ArrayList();
                    for (Object obj11 : list) {
                        Trigger.Companion companion15 = Trigger.Companion;
                        String str6 = ((TrackingEvent) obj11).trigger;
                        companion15.getClass();
                        if (Trigger.Companion.write(str6) == Trigger.BUTTON_CLICK) {
                            arrayList.add(obj11);
                        }
                    }
                    for (TrackingEvent trackingEvent : arrayList) {
                        Map map = trackingEvent.parameters;
                        if (map != null) {
                            ArrayList arrayList2 = new ArrayList(map.size());
                            for (Map.Entry entry : map.entrySet()) {
                                arrayList2.add(new onViewAttachedToWindowlambda0((String) entry.getKey(), entry.getValue().toString()));
                            }
                            mapSerializer = onMove.serializer(arrayList2);
                        } else {
                            mapSerializer = null;
                        }
                        initui_toolingdefaultVar.read.logEvent(trackingEvent.name, mapSerializer);
                    }
                }
                return createfromparcel;
        }
    }
}
