package androidx.compose.foundation.pager;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import coil3.util.UtilsKt;
import com.huawei.hms.location.ActivityIdentificationData;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.compose.AutoAcceptPreferencesToggleKt;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.compose.AutoAcceptPreferencesToggleSectionKt;
import com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.compose.LastStopAddressManageBottomSheetKt;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt$AutoAcceptOption$1$1;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageModalBottomSheetKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageSentCardKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportScreenKt;
import com.roadrunner.rider.state.noorders.api.HomeNoOrdersUiModel;
import com.roadrunner.rider.state.noorders.presentation.HomeNoOrdersUiModelImpl;
import com.roadrunner.rrds.compose.component.actions.links.LinkKt$LinkText$1$1;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.forms.CheckboxKt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;
import com.roadrunner.rrds.compose.component.indicators.ChipsKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.settings.ui.screens.NavigationSettingsScreenKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.DelayKt;
import o.AnchoredDraggableKtanimateTo2;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.Api26Bitmap;
import o.BasicTextFieldKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.EditingBufferCompanion;
import o.IconButtonKt;
import o.LinearGradientShaderVjE6UOUdefault;
import o.ModalBottomSheetDialogWrapper;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.NavHostFragmentExternalSyntheticLambda1;
import o.PassthroughConnectionusePrepared2;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.SimpleGraphicsLayerModifiermeasure1;
import o.SpanStyle;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.TextFieldDefaults;
import o.TextRange;
import o.UpdatableAnimationState;
import o.accessgetTextCentercp;
import o.accessisInitializedcp;
import o.b3;
import o.buildMapping;
import o.clearAndSetSemantics;
import o.computeDirection;
import o.copyejIjP34;
import o.createFromParcel;
import o.div7Ah8Wj8;
import o.getAndroidRenderEffect;
import o.getBirthDateFull;
import o.getCenterHorizontally;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getDownimpl;
import o.getNewPassword;
import o.getOnEventTrackingFailedListener;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getRootCause;
import o.getSaveCount;
import o.getShouldCreateCompositionOnAttachedToWindow;
import o.getTopLeftnOccac;
import o.getWindow;
import o.handleUrlOverridelambda1;
import o.hasRootCause;
import o.invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21;
import o.isValidParameter;
import o.logPushDeliveryandroid_sdk_base_release;
import o.lookupAndInterpolate;
import o.makeContentView;
import o.onViewAttachedToWindow;
import o.performFling;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.processAndResolveDeeplink;
import o.r8lambdaLZjsjPSXWRendXZH98LKrH6PSs;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.recordmLhObY;
import o.registerInAppMessageManagerlambda0;
import o.removeGlobalCallbackParameters;
import o.requestBannersRefresh;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;
import o.setTransformQ8lPUPs;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;
import o.trackNewSessionI;
import o.updateData;
import o.waitForFirstLayout;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PagerDefaults$$ExternalSyntheticLambda0 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ PagerDefaults$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.write = obj;
        this.read = obj2;
    }

    private final Object IconCompatParcelizer(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = 2 % 2;
        r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri = (r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI) this.write;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ModalBottomSheetDialogWrapper) obj).getClass();
        if ((iIntValue & 17) != 16) {
            int i2 = RemoteActionCompatParcelizer + 87;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        boolean zWrite = getpostalcode.write(iIntValue & 1, z);
        Object obj4 = null;
        if (zWrite) {
            NavigationSettingsScreenKt.NaverDescriptionContent(0, getpostalcode, null, r8lambdav9hvubmv32qeolrxalsjens1hri, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        obj4.hashCode();
        throw null;
    }

    private final Object read(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = (String) this.write;
        onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ModalBottomSheetDialogWrapper) obj).getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, !((iIntValue & 17) == 16))) {
            int i4 = RemoteActionCompatParcelizer + 113;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            TextKt.m131TextNvy7gAk(upperCase, PaddingKt.read(Modifier.Companion, Dimensions.onTitleChanged, Dimensions.onSupportNavigateUp, Dimensions.onWindowStartingSupportActionMode, Dimensions.onSupportContentChanged), ((Color) onviewattachedtowindow.getValue()).m732unboximpl(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.onBackPressedDispatcher_delegatelambda0.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 0, 131064);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    private final Object RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        removeGlobalCallbackParameters removeglobalcallbackparameters = (removeGlobalCallbackParameters) this.write;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((AnchoredDraggableKtanimateTo2) obj).getClass();
        boolean z = false;
        if ((iIntValue & 17) != 16) {
            int i4 = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                z = true;
            }
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            TextInputBigV2Kt.TextInputBigV2(removeglobalcallbackparameters.IconCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, PaddingKt.RemoteActionCompatParcelizer(Modifier.Companion, Dimensions.getAnimatedVisibility, Dimensions.setSplitBackground), false, null, removeglobalcallbackparameters.serializer, null, processAndResolveDeeplink.write, false, null, null, true, 0, new getCenterHorizontally(KeyboardCapitalization.Companion.m3294getNoneIUNYP9k(), Boolean.FALSE, KeyboardType.Companion.m3323getUnspecifiedPjHm6EE(), ImeAction.Companion.m3269getUnspecifiedeUduSuo()), null, null, null, null, null, getpostalcode, 100663296, 3072, 0, 8347320);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return createfromparcel;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }

    private final Object serializer(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = 2 % 2;
        removeGlobalCallbackParameters removeglobalcallbackparameters = (removeGlobalCallbackParameters) this.write;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ModalBottomSheetDialogWrapper) obj).getClass();
        if ((iIntValue & 17) != 16) {
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 107;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            z = i3 % 2 != 0;
            int i4 = i2 + 25;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            int i6 = RemoteActionCompatParcelizer + 53;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            TertiaryKt.IconCompatParcelizer(removeglobalcallbackparameters.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.write(SizeKt.write(companion, 1.0f), Dimensions.setTabContainer), false, 0, null, null, null, getpostalcode, 0, 248);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0592  */
    /* JADX WARN: Code duplicated, block: B:195:0x069a  */
    /* JADX WARN: Code duplicated, block: B:377:0x0d45  */
    /* JADX WARN: Code duplicated, block: B:380:0x0d4a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0204  */
    /* JADX WARN: Code duplicated, block: B:88:0x026d  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        char c;
        float f2;
        boolean z;
        int i = 2 % 2;
        int i2 = this.serializer;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.read;
        Object obj5 = this.write;
        switch (i2) {
            case 0:
                PagerState pagerState = (PagerState) obj5;
                LayoutDirection layoutDirection = (LayoutDirection) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zWrite = getDownimpl.write(pagerState, fFloatValue);
                if (pagerState.MediaSessionCompatQueueItem().MediaSessionCompatToken != SelectionHandleIcon.Vertical && layoutDirection != LayoutDirection.Ltr) {
                    zWrite = !zWrite;
                }
                int i3 = pagerState.MediaSessionCompatQueueItem().PlaybackStateCompatCustomAction;
                float fIconCompatParcelizer = i3 == 0 ? 0.0f : getDownimpl.IconCompatParcelizer(pagerState) / i3;
                float f3 = (int) fIconCompatParcelizer;
                if (Math.abs(fFloatValue) < pagerState.MediaMetadataCompat.mo48toPx0680j_4(SnapFlingBehaviorKt.read)) {
                    c = 0;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    c = fFloatValue > 0.0f ? (char) 1 : (char) 2;
                }
                if (c == 0) {
                    if (Math.abs(fIconCompatParcelizer - f3) <= 0.5f ? Math.abs(fIconCompatParcelizer) < Math.abs(Math.min(pagerState.MediaMetadataCompat.mo48toPx0680j_4(PagerStateKt.serializer), pagerState.MediaMetadataCompat() / 2.0f) / pagerState.MediaMetadataCompat()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zWrite : zWrite) {
                        f2 = fFloatValue3;
                    } else {
                        f2 = fFloatValue2;
                    }
                } else if (c == 1) {
                    f2 = fFloatValue3;
                } else if (c == 2) {
                    f2 = fFloatValue2;
                } else {
                    f2 = f;
                }
                return Float.valueOf(f2);
            case 1:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
                BasicTextFieldKt basicTextFieldKt = (BasicTextFieldKt) obj4;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new ContextMenuScope();
                        getpostalcode.write(objComponentActivity);
                    }
                    ContextMenuScope contextMenuScope = (ContextMenuScope) objComponentActivity;
                    contextMenuScope.serializer.clear();
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(contextMenuScope);
                    contextMenuScope.Content$foundation(basicTextFieldKt, getpostalcode, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 2:
                Api26Bitmap api26Bitmap = (Api26Bitmap) obj5;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj4;
                ((Integer) obj3).getClass();
                getPostalCode getpostalcode2 = (getPostalCode) ((getBirthDateFull) obj2);
                getpostalcode2.serializer(-102778667);
                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                    getpostalcode2.write(objComponentActivity2);
                }
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(null);
                    getpostalcode2.write(objComponentActivity3);
                }
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(api26Bitmap, getpostalcode2);
                boolean z2 = getpostalcode2.read(mutableInteractionSourceImpl);
                Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (z2 || objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new waitForFirstLayout(populateViewStructure_androidKtpopulate7, 24, mutableInteractionSourceImpl);
                    getpostalcode2.write(objComponentActivity4);
                }
                getPhoneNumberNational.serializer(mutableInteractionSourceImpl, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode2);
                Modifier.Companion companion = Modifier.Companion;
                boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                boolean z3 = getpostalcode2.read(mutableInteractionSourceImpl);
                boolean z4 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
                Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                if ((zIconCompatParcelizer | z3 | z4) || objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new LinkKt$LinkText$1$1(getcontentviewgroupparentlayout, populateViewStructure_androidKtpopulate7, mutableInteractionSourceImpl, populateViewStructure_androidKtpopulate7Serializer);
                    getpostalcode2.write(objComponentActivity5);
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, mutableInteractionSourceImpl, (PointerInputEventHandler) objComponentActivity5);
                getpostalcode2.IconCompatParcelizer(false);
                return modifierPointerInput;
            case 3:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                ((Integer) obj3).getClass();
                getPostalCode getpostalcode3 = (getPostalCode) ((getBirthDateFull) obj2);
                getpostalcode3.serializer(759876635);
                Object objComponentActivity6 = getpostalcode3.ComponentActivity();
                if (objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = CompositionKt.serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode3.write(objComponentActivity6);
                }
                onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) objComponentActivity6;
                Object objComponentActivity7 = getpostalcode3.ComponentActivity();
                if (objComponentActivity7 == androidContentCaptureManager) {
                    Animatable animatable = new Animatable(Offset.m466boximpl(((Offset) onviewattachedtowindow.getValue()).m487unboximpl()), SelectionMagnifierKt.serializer, Offset.m466boximpl(SelectionMagnifierKt.write), 8);
                    getpostalcode3.write(animatable);
                    objComponentActivity7 = animatable;
                }
                Animatable animatable2 = (Animatable) objComponentActivity7;
                boolean zIconCompatParcelizer2 = getpostalcode3.IconCompatParcelizer(animatable2);
                Object objComponentActivity8 = getpostalcode3.ComponentActivity();
                if (zIconCompatParcelizer2 || objComponentActivity8 == androidContentCaptureManager) {
                    objComponentActivity8 = new RealImageLoader.AnonymousClass2(onviewattachedtowindow, animatable2, (ShortNewsContentCardView) null, 15);
                    getpostalcode3.write(objComponentActivity8);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity8);
                UpdatableAnimationState updatableAnimationState = animatable2.IconCompatParcelizer;
                boolean z5 = getpostalcode3.read(updatableAnimationState);
                Object objComponentActivity9 = getpostalcode3.ComponentActivity();
                if (z5 || objComponentActivity9 == androidContentCaptureManager) {
                    objComponentActivity9 = new getAndroidRenderEffect(updatableAnimationState, 1);
                    getpostalcode3.write(objComponentActivity9);
                }
                Modifier modifier = (Modifier) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity9);
                getpostalcode3.IconCompatParcelizer(false);
                return modifier;
            case 4:
                clearAndSetSemantics clearandsetsemantics = (clearAndSetSemantics) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull2;
                if (!getpostalcode4.write(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else if (clearandsetsemantics.MediaBrowserCompatMediaItem) {
                    int i4 = RemoteActionCompatParcelizer + 67;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    getpostalcode4.serializer(-640814085);
                    HeaderKt.read(R.drawable.ic_bold_large_cancel_thin, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, false, null, getpostalcode4, 0, 28);
                    getpostalcode4.IconCompatParcelizer(false);
                } else {
                    getpostalcode4.serializer(-640624768);
                    getpostalcode4.IconCompatParcelizer(false);
                }
                return createfromparcel;
            case 5:
                SpanStyle spanStyle = (SpanStyle) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode5.write(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                    Modifier.Companion companion2 = Modifier.Companion;
                    Modifier modifierWrite = SizeKt.write(companion2, 1.0f);
                    float f4 = Dimensions.setTabContainer;
                    Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, 0.0f, f4, 0.0f, Dimensions.setSplitBackground, 5);
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, centerHorizontally, getpostalcode5, 48);
                    int iHashCode = Long.hashCode(getpostalcode5.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode5.serializer();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode5, modifierM74paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                    if (getpostalcode5.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode5.ComponentActivity) {
                        int i6 = IconCompatParcelizer + 79;
                        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            getpostalcode5.serializer(constructor);
                            Object obj6 = null;
                            obj6.hashCode();
                            throw null;
                        }
                        getpostalcode5.serializer(constructor);
                    } else {
                        getpostalcode5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode5, modalBottomSheetYbuCTN8Serializer, getpostalcode5, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode5, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode5, Integer.valueOf(iHashCode), getpostalcode5));
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_small_brand_sending_forms, getpostalcode5, 0), null, SizeKt.m83size3ABfNKs(companion2, AutoAcceptPreferencesToggleSectionKt.read), null, null, 0.0f, null, getpostalcode5, Painter.$stable | 432, 120);
                    TextKt.m131TextNvy7gAk("", PaddingKt.write(companion2, f4), ((buildMapping) getpostalcode5.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode5, 0, 0, 130040);
                    AutoAcceptPreferencesToggleKt.AutoAcceptPreferencesToggleContent("", spanStyle.IconCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, PaddingKt.m73paddingVpY3zN4$default(PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, f4, 0.0f, 0.0f, 13), f4, 0.0f, 2), false, null, getpostalcode5, 0, 48);
                    getpostalcode5.IconCompatParcelizer(true);
                } else {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 6:
                Float f5 = (Float) obj5;
                TextRange textRange = (TextRange) obj4;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer(f5 != null ? f5.floatValue() : 0.0f, (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{1000, 0, performFling.read, 2}), "FloatAnimation", null, getbirthdatefull4, 3072, 20);
                Modifier.Companion companion4 = Modifier.Companion;
                Modifier modifierWrite2 = SizeKt.write(companion4, 1.0f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getbirthdatefull4, 48);
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull4;
                int iHashCode2 = Long.hashCode(getpostalcode6.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode6.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getbirthdatefull4, modifierWrite2);
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion5.getConstructor();
                if (getpostalcode6.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode6.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode6.ComponentActivity) {
                    getpostalcode6.serializer(constructor2);
                } else {
                    getpostalcode6.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull4, modalBottomSheetYbuCTN8Serializer2, companion5.getSetMeasurePolicy());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull4, dragAndDropNodestartDragAndDropTransfer1Serializer2, companion5.getSetResolvedCompositionLocals());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull4, Integer.valueOf(iHashCode2), companion5.getSetCompositeKeyHash());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull4, companion5.getApplyOnDeactivatedNodeAssertion());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull4, modifierMaterializeModifier2, companion5.getSetModifier());
                Modifier modifierWrite3 = SizeKt.write(companion4, 1.0f);
                modifierWrite3.getClass();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getbirthdatefull4, SizeKt.m75height3ABfNKs(BackgroundKt.m20backgroundbw27NRU(modifierWrite3, ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.read)});
                boolean z6 = getpostalcode6.read(onviewattachedtowindowIconCompatParcelizer);
                Object objComponentActivity10 = getpostalcode6.ComponentActivity();
                if (z6 || objComponentActivity10 == androidContentCaptureManager) {
                    objComponentActivity10 = new getAndroidRenderEffect(onviewattachedtowindowIconCompatParcelizer, 5);
                    getpostalcode6.write(objComponentActivity10);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity10;
                Modifier modifierWrite4 = SizeKt.write(companion4, 1.0f);
                modifierWrite4.getClass();
                long j = ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui)).read();
                long jM757getTransparent0d7_KjU = Color.Companion.m757getTransparent0d7_KjU();
                Object objComponentActivity11 = getpostalcode6.ComponentActivity();
                if (objComponentActivity11 == androidContentCaptureManager) {
                    objComponentActivity11 = new accessgetTextCentercp(17);
                    getpostalcode6.write(objComponentActivity11);
                }
                ProgressIndicatorKt.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifierWrite4, j, jM757getTransparent0d7_KjU, 0, 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity11, getbirthdatefull4, 1575984);
                if (textRange == null) {
                    getpostalcode6.serializer(1469695198);
                    getpostalcode6.IconCompatParcelizer(false);
                } else {
                    getpostalcode6.serializer(1469695199);
                    if (textRange.RemoteActionCompatParcelizer) {
                        int i7 = IconCompatParcelizer + 111;
                        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        getpostalcode6.serializer(-951215412);
                        String str = textRange.serializer;
                        TextStyle textStyleRemoteActionCompatParcelizer = performLayout.RemoteActionCompatParcelizer();
                        long supportBackgroundTintMode = ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
                        Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(companion4, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13);
                        modifierM74paddingqDBjuR0$default2.getClass();
                        TextKt.m131TextNvy7gAk(str, modifierM74paddingqDBjuR0$default2, supportBackgroundTintMode, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleRemoteActionCompatParcelizer, getbirthdatefull4, 0, 0, 131064);
                        z = false;
                        getpostalcode6.IconCompatParcelizer(false);
                    } else {
                        z = false;
                        getpostalcode6.serializer(-950853518);
                        getpostalcode6.IconCompatParcelizer(false);
                    }
                    getpostalcode6.IconCompatParcelizer(z);
                }
                getpostalcode6.IconCompatParcelizer(true);
                return createfromparcel;
            case 7:
                lookupAndInterpolate lookupandinterpolate = (lookupAndInterpolate) obj5;
                accessisInitializedcp accessisinitializedcp = (accessisInitializedcp) obj4;
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((o.ProgressIndicatorKt) obj).getClass();
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull5;
                if (getpostalcode7.write(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    if (lookupandinterpolate == null) {
                        getpostalcode7.serializer(2055849650);
                    } else {
                        getpostalcode7.serializer(2055849651);
                        SingleEarningsContentKt.PromoBonus(lookupandinterpolate, null, getpostalcode7, 0);
                    }
                    getpostalcode7.IconCompatParcelizer(false);
                    if (accessisinitializedcp == null) {
                        int i9 = RemoteActionCompatParcelizer + 31;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        getpostalcode7.serializer(2055902443);
                        getpostalcode7.IconCompatParcelizer(false);
                    } else {
                        getpostalcode7.serializer(2055902444);
                        PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                        snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dp.m3673constructorimpl(0.0f));
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Modifier.Companion companion6 = Modifier.Companion;
                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, centerVertically, getpostalcode7, 54);
                        int iHashCode3 = Long.hashCode(getpostalcode7.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode7.serializer();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode7, companion6);
                        ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion7.getConstructor();
                        if (getpostalcode7.read == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        int i11 = RemoteActionCompatParcelizer + 103;
                        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 == 0) {
                            getpostalcode7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            boolean z7 = getpostalcode7.ComponentActivity;
                            throw null;
                        }
                        getpostalcode7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode7.ComponentActivity) {
                            getpostalcode7.serializer(constructor3);
                        } else {
                            getpostalcode7.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion7, getpostalcode7, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode7, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode7, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion7, getpostalcode7, Integer.valueOf(iHashCode3), getpostalcode7));
                        if (lookupandinterpolate != null) {
                            getpostalcode7.serializer(1723931440);
                            SingleEarningsContentKt.write(getpostalcode7, 0);
                            getpostalcode7.IconCompatParcelizer(false);
                        } else {
                            getpostalcode7.serializer(1723981412);
                            getpostalcode7.IconCompatParcelizer(false);
                        }
                        SingleEarningsContentKt.Multiplier(accessisinitializedcp, null, getpostalcode7, 0);
                        getpostalcode7.IconCompatParcelizer(true);
                        getpostalcode7.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 8:
                getSaveCount getsavecount = (getSaveCount) obj5;
                LastStopOptionUiModelImpl lastStopOptionUiModelImpl = (LastStopOptionUiModelImpl) obj4;
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode8.write(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    boolean zIconCompatParcelizer3 = getpostalcode8.IconCompatParcelizer(lastStopOptionUiModelImpl);
                    Object objComponentActivity12 = getpostalcode8.ComponentActivity();
                    if (zIconCompatParcelizer3) {
                        objComponentActivity12 = new MapboxNavigation.AnonymousClass15(0, lastStopOptionUiModelImpl, LastStopOptionUiModelImpl.class, "onEditClick", "onEditClick()V", 0, 25);
                        getpostalcode8.write(objComponentActivity12);
                    } else {
                        int i12 = RemoteActionCompatParcelizer + 109;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 == 0) {
                            Object obj7 = null;
                            obj7.hashCode();
                            throw null;
                        }
                        if (objComponentActivity12 == androidContentCaptureManager) {
                            objComponentActivity12 = new MapboxNavigation.AnonymousClass15(0, lastStopOptionUiModelImpl, LastStopOptionUiModelImpl.class, "onEditClick", "onEditClick()V", 0, 25);
                            getpostalcode8.write(objComponentActivity12);
                        }
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity12);
                    boolean zIconCompatParcelizer4 = getpostalcode8.IconCompatParcelizer(lastStopOptionUiModelImpl);
                    Object objComponentActivity13 = getpostalcode8.ComponentActivity();
                    if (zIconCompatParcelizer4 || objComponentActivity13 == androidContentCaptureManager) {
                        objComponentActivity13 = new MapboxNavigation.AnonymousClass15(0, lastStopOptionUiModelImpl, LastStopOptionUiModelImpl.class, "onRemoveClick", "onRemoveClick()V", 0, 26);
                        getpostalcode8.write(objComponentActivity13);
                    }
                    LastStopAddressManageBottomSheetKt.LastStopAddressManageContent(getsavecount, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity13), null, getpostalcode8, getSaveCount.read);
                } else {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 9:
                getTopLeftnOccac gettopleftnoccac = (getTopLeftnOccac) obj5;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                gettopleftnoccac.getClass();
                ActionableMessageSentCardKt.MessageSentCardContent(0, (getBirthDateFull) obj2, null, ((recordmLhObY) gettopleftnoccac).MediaBrowserCompatMediaItem, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4);
                return createfromparcel;
            case 10:
                getTopLeftnOccac gettopleftnoccac2 = (getTopLeftnOccac) obj5;
                EditingBufferCompanion editingBufferCompanion = (EditingBufferCompanion) obj4;
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode9 = (getPostalCode) getbirthdatefull7;
                if (getpostalcode9.write(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    boolean z8 = getpostalcode9.read(editingBufferCompanion);
                    Object objComponentActivity14 = getpostalcode9.ComponentActivity();
                    if (z8 || objComponentActivity14 == androidContentCaptureManager) {
                        objComponentActivity14 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, editingBufferCompanion, EditingBufferCompanion.class, "onClose", "onClose()V", 0, 13);
                        getpostalcode9.write(objComponentActivity14);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity14);
                    boolean z9 = getpostalcode9.read(editingBufferCompanion);
                    Object objComponentActivity15 = getpostalcode9.ComponentActivity();
                    if (z9 || objComponentActivity15 == androidContentCaptureManager) {
                        objComponentActivity15 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, editingBufferCompanion, EditingBufferCompanion.class, "clearAllMessages", "clearAllMessages()V", 0, 14);
                        getpostalcode9.write(objComponentActivity15);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity15);
                    boolean z10 = getpostalcode9.read(editingBufferCompanion);
                    Object objComponentActivity16 = getpostalcode9.ComponentActivity();
                    if (z10) {
                        objComponentActivity16 = new ReportPictureUseCase$invoke$2(1, editingBufferCompanion, EditingBufferCompanion.class, "onMessageTextClick", "onMessageTextClick(Ljava/lang/String;)V", 0, 9);
                        getpostalcode9.write(objComponentActivity16);
                    } else {
                        int i13 = IconCompatParcelizer + 3;
                        RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        if (objComponentActivity16 == androidContentCaptureManager) {
                            objComponentActivity16 = new ReportPictureUseCase$invoke$2(1, editingBufferCompanion, EditingBufferCompanion.class, "onMessageTextClick", "onMessageTextClick(Ljava/lang/String;)V", 0, 9);
                            getpostalcode9.write(objComponentActivity16);
                        }
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity16);
                    boolean z11 = getpostalcode9.read(editingBufferCompanion);
                    boolean zIconCompatParcelizer5 = getpostalcode9.IconCompatParcelizer(gettopleftnoccac2);
                    Object objComponentActivity17 = getpostalcode9.ComponentActivity();
                    if ((z11 | zIconCompatParcelizer5) || objComponentActivity17 == androidContentCaptureManager) {
                        objComponentActivity17 = new SessionDao_Impl$$ExternalSyntheticLambda1(editingBufferCompanion, 18, gettopleftnoccac2);
                        getpostalcode9.write(objComponentActivity17);
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity17;
                    boolean z12 = getpostalcode9.read(editingBufferCompanion);
                    Object objComponentActivity18 = getpostalcode9.ComponentActivity();
                    if (z12 || objComponentActivity18 == androidContentCaptureManager) {
                        objComponentActivity18 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, editingBufferCompanion, EditingBufferCompanion.class, "onClose", "onClose()V", 0, 15);
                        getpostalcode9.write(objComponentActivity18);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity18);
                    boolean z13 = getpostalcode9.read(editingBufferCompanion);
                    Object objComponentActivity19 = getpostalcode9.ComponentActivity();
                    if (z13 || objComponentActivity19 == androidContentCaptureManager) {
                        objComponentActivity19 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, editingBufferCompanion, EditingBufferCompanion.class, "onQuickReplyFailureAnimationComplete", "onQuickReplyFailureAnimationComplete()V", 0, 16);
                        getpostalcode9.write(objComponentActivity19);
                    }
                    ActionableMessageModalBottomSheetKt.ModalBottomSheetContent(gettopleftnoccac2, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity19), null, getpostalcode9, 0);
                } else {
                    getpostalcode9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 11:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                String str4 = (String) obj3;
                str2.getClass();
                str3.getClass();
                str4.getClass();
                FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) obj5);
                r8lambdaLZjsjPSXWRendXZH98LKrH6PSs r8lambdalzjsjpsxwrendxzh98lkrh6pss = (r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) ((SaveHeatmapUrlImpl) obj4).serializer;
                div7Ah8Wj8 supportFragmentManager = fragmentActivityRemoteActionCompatParcelizer.getSupportFragmentManager();
                supportFragmentManager.getClass();
                r8lambdaLZjsjPSXWRendXZH98LKrH6PSs.write(r8lambdalzjsjpsxwrendxzh98lkrh6pss, fragmentActivityRemoteActionCompatParcelizer, supportFragmentManager, str2, str3, str4);
                return createfromparcel;
            case 12:
                Integer num = (Integer) obj5;
                String str5 = (String) obj4;
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode10 = (getPostalCode) getbirthdatefull8;
                if (getpostalcode10.write(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    Modifier.Companion companion8 = Modifier.Companion;
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(companion8, ((buildMapping) getpostalcode10.write((getNewPassword) setcurrentsemanticsnodesui2)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.setActionBarVisibilityCallback, Dimensions.getNestedScrollAxes);
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode10, 48);
                    int iHashCode4 = Long.hashCode(getpostalcode10.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode10.serializer();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode10, modifierRemoteActionCompatParcelizer);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion9.getConstructor();
                    if (getpostalcode10.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode10.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode10.ComponentActivity) {
                        getpostalcode10.serializer(constructor4);
                    } else {
                        getpostalcode10.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion9, getpostalcode10, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode10, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode10, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion9, getpostalcode10, Integer.valueOf(iHashCode4), getpostalcode10));
                    if (num == null) {
                        getpostalcode10.serializer(-932306879);
                        getpostalcode10.IconCompatParcelizer(false);
                    } else {
                        getpostalcode10.serializer(-932306878);
                        IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(num.intValue(), getpostalcode10, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode10.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter(), getpostalcode10, Painter.$stable | 48, 4);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode10, SizeKt.m86width3ABfNKs(companion8, Dimensions.setPrimaryBackground)});
                        getpostalcode10.IconCompatParcelizer(false);
                    }
                    TextKt.m131TextNvy7gAk(str5, null, ((buildMapping) getpostalcode10.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter(), 0L, FontWeight.Companion.getW700(), null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.getLifecycle.MediaSessionCompatResultReceiverWrapper(), getpostalcode10, 1572864, 0, 129978);
                    getpostalcode10.IconCompatParcelizer(true);
                } else {
                    getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 13:
                Uri uri = (Uri) obj5;
                String str6 = (String) obj4;
                getShouldCreateCompositionOnAttachedToWindow getshouldcreatecompositiononattachedtowindow = (getShouldCreateCompositionOnAttachedToWindow) obj;
                getBirthDateFull getbirthdatefull9 = (getBirthDateFull) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                getshouldcreatecompositiononattachedtowindow.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((getPostalCode) getbirthdatefull9).read(getshouldcreatecompositiononattachedtowindow) ? 4 : 2;
                }
                getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull9;
                if (getpostalcode11.write(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    getWindow getwindow = (getWindow) getshouldcreatecompositiononattachedtowindow;
                    Dp dpM3671boximpl = Dp.m3671boximpl(getwindow.read());
                    Dp dpM3671boximpl2 = Dp.m3671boximpl(getwindow.serializer());
                    dpM3671boximpl.getClass();
                    dpM3671boximpl2.getClass();
                    if (dpM3671boximpl.compareTo(dpM3671boximpl2) > 0) {
                        dpM3671boximpl = dpM3671boximpl2;
                    }
                    float fM3687unboximpl = dpM3671boximpl.m3687unboximpl();
                    Modifier modifierM86width3ABfNKs = SizeKt.m86width3ABfNKs(SizeKt.m75height3ABfNKs(Modifier.Companion, fM3687unboximpl), fM3687unboximpl);
                    MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iHashCode5 = Long.hashCode(getpostalcode11.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode11.serializer();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode11, modifierM86width3ABfNKs);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion10.getConstructor();
                    if (getpostalcode11.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode11.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode11.ComponentActivity) {
                        int i15 = IconCompatParcelizer + 9;
                        RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        getpostalcode11.serializer(constructor5);
                    } else {
                        getpostalcode11.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion10, getpostalcode11, measurePolicy, getpostalcode11, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode11, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion10, getpostalcode11, Integer.valueOf(iHashCode5), getpostalcode11));
                    setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode11.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    settransformq8lpups.IconCompatParcelizer = uri;
                    LinearGradientShaderVjE6UOUdefault.serializer(settransformq8lpups, new SimpleGraphicsLayerModifiermeasure1());
                    if (str6 != null) {
                        settransformq8lpups.read().put("retake_count", str6);
                    } else {
                        settransformq8lpups.read().remove("retake_count");
                    }
                    ImageKt.Image(computeDirection.RemoteActionCompatParcelizer(settransformq8lpups.IconCompatParcelizer(), null, null, getpostalcode11, 0, 30), null, null, null, ContentScale.Companion.getFit(), 0.0f, null, getpostalcode11, 24624, ActivityIdentificationData.RUNNING);
                    getpostalcode11.IconCompatParcelizer(true);
                } else {
                    getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 14:
                makeContentView makecontentview = (makeContentView) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull10;
                if (getpostalcode12.write(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    String str7 = makecontentview.RemoteActionCompatParcelizer;
                    boolean z14 = makecontentview.write;
                    boolean z15 = getpostalcode12.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm6);
                    Object objComponentActivity20 = getpostalcode12.ComponentActivity();
                    if (z15) {
                        objComponentActivity20 = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm6, 12);
                        getpostalcode12.write(objComponentActivity20);
                    } else {
                        int i17 = RemoteActionCompatParcelizer + 5;
                        IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0) {
                            int i18 = 20 / 0;
                            if (objComponentActivity20 == androidContentCaptureManager) {
                                objComponentActivity20 = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm6, 12);
                                getpostalcode12.write(objComponentActivity20);
                            }
                        } else if (objComponentActivity20 == androidContentCaptureManager) {
                            objComponentActivity20 = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm6, 12);
                            getpostalcode12.write(objComponentActivity20);
                        }
                    }
                    CheckboxKt.m5038CheckboxBigPIknLig(str7, z14, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity20, PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dimensions.setMenu, 1), false, getpostalcode12, 0);
                } else {
                    getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 15:
                invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21 invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21 = (invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull11;
                if (getpostalcode13.write(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    Iterator it = invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21.IconCompatParcelizer.iterator();
                    while (!(!it.hasNext())) {
                        NavHostFragmentExternalSyntheticLambda1 navHostFragmentExternalSyntheticLambda1 = (NavHostFragmentExternalSyntheticLambda1) it.next();
                        int i19 = navHostFragmentExternalSyntheticLambda1.read();
                        boolean z16 = getpostalcode13.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm7);
                        boolean zIconCompatParcelizer6 = getpostalcode13.IconCompatParcelizer(navHostFragmentExternalSyntheticLambda1);
                        Object objComponentActivity21 = getpostalcode13.ComponentActivity();
                        if (z16 || zIconCompatParcelizer6) {
                            objComponentActivity21 = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm7, 22, navHostFragmentExternalSyntheticLambda1);
                            getpostalcode13.write(objComponentActivity21);
                        } else {
                            int i20 = IconCompatParcelizer + 99;
                            RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                            if (i20 % 2 != 0) {
                                throw null;
                            }
                            if (objComponentActivity21 == androidContentCaptureManager) {
                                objComponentActivity21 = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm7, 22, navHostFragmentExternalSyntheticLambda1);
                                getpostalcode13.write(objComponentActivity21);
                            }
                        }
                        HeaderKt.read(i19, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity21, null, false, null, getpostalcode13, 0, 28);
                    }
                } else {
                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 16:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
                String str8 = (String) obj4;
                IconButtonKt iconButtonKt = (IconButtonKt) obj;
                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                iconButtonKt.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((getPostalCode) getbirthdatefull12).read(iconButtonKt) ? 4 : 2;
                }
                getPostalCode getpostalcode14 = (getPostalCode) getbirthdatefull12;
                if (getpostalcode14.write(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    boolean z17 = getpostalcode14.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm8);
                    boolean z18 = getpostalcode14.read(str8);
                    Object objComponentActivity22 = getpostalcode14.ComponentActivity();
                    if ((z17 | z18) || objComponentActivity22 == androidContentCaptureManager) {
                        objComponentActivity22 = new PassthroughConnectionusePrepared2(r8lambdaunavo3sxub_pc9xroryotnrlvsm8, str8, 3);
                        getpostalcode14.write(objComponentActivity22);
                    }
                    Modifier modifierAlign = iconButtonKt.align(Modifier.Companion, Alignment.Companion.getCenter());
                    modifierAlign.getClass();
                    getRootCause.read(R.drawable.ic_bold_medium_essentials_copy, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity22, modifierAlign, null, false, null, null, getpostalcode14, 0, 248);
                } else {
                    getpostalcode14.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 17:
                trackNewSessionI tracknewsessioni = (trackNewSessionI) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                getBirthDateFull getbirthdatefull13 = (getBirthDateFull) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((AnchoredDraggableKtanimateTo2) obj).getClass();
                getPostalCode getpostalcode15 = (getPostalCode) getbirthdatefull13;
                if (getpostalcode15.write(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    String str9 = tracknewsessioni.IconCompatParcelizer.write;
                    hasRootCause hasrootcause = hasRootCause.END;
                    Modifier modifierWrite5 = PaddingKt.write(SizeKt.write(Modifier.Companion, 1.0f), Dimensions.getAnimatedVisibility);
                    boolean z19 = getpostalcode15.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm9);
                    boolean zIconCompatParcelizer7 = getpostalcode15.IconCompatParcelizer(tracknewsessioni);
                    Object objComponentActivity23 = getpostalcode15.ComponentActivity();
                    if ((z19 | zIconCompatParcelizer7) || objComponentActivity23 == androidContentCaptureManager) {
                        objComponentActivity23 = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm9, 19, tracknewsessioni);
                        getpostalcode15.write(objComponentActivity23);
                    }
                    isValidParameter.RemoteActionCompatParcelizer(str9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity23, modifierWrite5, false, false, Integer.valueOf(R.drawable.ic_bold_large_text_formatting_external_link), hasrootcause, null, null, getpostalcode15, 1572864, 920);
                } else {
                    getpostalcode15.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 18:
                return serializer(obj, obj2, obj3);
            case 19:
                return RemoteActionCompatParcelizer(obj, obj2, obj3);
            case 20:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                RiderSafetyReportScreenKt.IconCompatParcelizer(0, (getBirthDateFull) obj2, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setHideOnContentScrollEnabled, 0.0f, 0.0f, 13), ((getOnEventTrackingFailedListener) obj5).MediaMetadataCompat.write, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4);
                return createfromparcel;
            case 21:
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5;
                HomeNoOrdersUiModel homeNoOrdersUiModel = (HomeNoOrdersUiModel) obj4;
                getBirthDateFull getbirthdatefull14 = (getBirthDateFull) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode16 = (getPostalCode) getbirthdatefull14;
                if (getpostalcode16.write(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke((updateData) ((HomeNoOrdersUiModelImpl) homeNoOrdersUiModel).IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), getpostalcode16, 48);
                } else {
                    getpostalcode16.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 22:
                return read(obj, obj2, obj3);
            case 23:
                return IconCompatParcelizer(obj, obj2, obj3);
            default:
                logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release = (logPushDeliveryandroid_sdk_base_release) obj5;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4;
                getBirthDateFull getbirthdatefull15 = (getBirthDateFull) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((o.ProgressIndicatorKt) obj).getClass();
                getPostalCode getpostalcode17 = (getPostalCode) getbirthdatefull15;
                if (getpostalcode17.write(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    List list = logpushdeliveryandroid_sdk_base_release.write;
                    ArrayList<requestBannersRefresh> arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (!(!it2.hasNext())) {
                        Object next = it2.next();
                        if (((requestBannersRefresh) next).IconCompatParcelizer) {
                            arrayList.add(next);
                        }
                    }
                    for (requestBannersRefresh requestbannersrefresh : arrayList) {
                        String str10 = requestbannersrefresh.RemoteActionCompatParcelizer;
                        boolean z20 = requestbannersrefresh.read;
                        boolean z21 = getpostalcode17.read(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                        boolean zIconCompatParcelizer8 = getpostalcode17.IconCompatParcelizer(logpushdeliveryandroid_sdk_base_release);
                        boolean z22 = getpostalcode17.read(requestbannersrefresh);
                        Object objComponentActivity24 = getpostalcode17.ComponentActivity();
                        if ((z21 | zIconCompatParcelizer8 | z22) || objComponentActivity24 == androidContentCaptureManager) {
                            objComponentActivity24 = new b3(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, logpushdeliveryandroid_sdk_base_release, requestbannersrefresh, 12);
                            getpostalcode17.write(objComponentActivity24);
                        }
                        ChipsKt.RemoteActionCompatParcelizer(str10, z20, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity24, null, 0, getpostalcode17, 0, 24);
                    }
                } else {
                    getpostalcode17.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
        }
    }
}
