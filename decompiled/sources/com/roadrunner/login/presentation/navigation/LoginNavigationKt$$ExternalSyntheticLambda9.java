package com.roadrunner.login.presentation.navigation;

import android.os.Bundle;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.delivery.accept.laststop.api.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModel;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose.LastStopSelectionBottomSheetContentKt;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose.LastStopSelectionLocationContentKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.sentiance.core.model.events.E$b;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextMeasurerHelperKt;
import o.addRect;
import o.computeVerticalScrollExtent;
import o.createFromParcel;
import o.cubicTo;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getGlobalParameters;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.isOpaque;
import o.onHideTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.registerInAppMessageManagerlambda0;
import o.relativeMoveTo;
import o.sendDragEventEu1f8Dk;
import o.validateColorStops;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LoginNavigationKt$$ExternalSyntheticLambda9 implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ LoginNavigationKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, int i) {
        this.read = i;
        this.write = obj;
        this.serializer = obj2;
        this.IconCompatParcelizer = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0084  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        String string2;
        int i;
        int i2 = 2 % 2;
        int i3 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        Object obj5 = this.IconCompatParcelizer;
        Object obj6 = this.serializer;
        Object obj7 = this.write;
        if (i3 == 0) {
            getGlobalParameters getglobalparameters = (getGlobalParameters) obj7;
            relativeMoveTo relativemoveto = (relativeMoveTo) obj6;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
            cubicTo cubicto = (cubicTo) obj2;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            cubicto.getClass();
            validateColorStops validatecolorstops = cubicto.MediaBrowserCompatMediaItem;
            Bundle bundleRemoteActionCompatParcelizer = validatecolorstops.RemoteActionCompatParcelizer();
            String string3 = bundleRemoteActionCompatParcelizer != null ? bundleRemoteActionCompatParcelizer.getString("resultCode") : null;
            String str = string3 == null ? "" : string3;
            Bundle bundleRemoteActionCompatParcelizer2 = validatecolorstops.RemoteActionCompatParcelizer();
            if (bundleRemoteActionCompatParcelizer2 != null) {
                int i4 = RemoteActionCompatParcelizer + 73;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                string = bundleRemoteActionCompatParcelizer2.getString("phoneNumber");
            } else {
                int i6 = RemoteActionCompatParcelizer + 13;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                string = null;
            }
            String str2 = string == null ? "" : string;
            Bundle bundleRemoteActionCompatParcelizer3 = validatecolorstops.RemoteActionCompatParcelizer();
            if (bundleRemoteActionCompatParcelizer3 != null) {
                int i8 = RemoteActionCompatParcelizer + 109;
                MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    bundleRemoteActionCompatParcelizer3.getString("originalMessageId");
                    throw null;
                }
                string2 = bundleRemoteActionCompatParcelizer3.getString("originalMessageId");
            } else {
                string2 = null;
            }
            String str3 = string2 == null ? "" : string2;
            Bundle bundleRemoteActionCompatParcelizer4 = validatecolorstops.RemoteActionCompatParcelizer();
            if (bundleRemoteActionCompatParcelizer4 != null) {
                int i9 = RemoteActionCompatParcelizer + 63;
                MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i = bundleRemoteActionCompatParcelizer4.getInt("retryCount");
            } else {
                i = 0;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(relativemoveto);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new addRect(relativemoveto, 4);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(relativemoveto);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new addRect(relativemoveto, 5);
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(relativemoveto);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new addRect(relativemoveto, 6);
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3;
            E$b e$b = (E$b) getglobalparameters;
            e$b.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
            new DragAndDropTargetModifierNode(new computeVerticalScrollExtent(str, str2, str3, i, e$b, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k2), true, 324954132).invoke(getpostalcode, 0);
            return createfromparcel;
        }
        LastStopSelectionBottomSheetUiModel lastStopSelectionBottomSheetUiModel = (LastStopSelectionBottomSheetUiModel) obj7;
        getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) obj6;
        Modifier modifier = (Modifier) obj5;
        isOpaque isopaque = (isOpaque) obj2;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((sendDragEventEu1f8Dk) obj).getClass();
        if (isopaque != null) {
            int i11 = RemoteActionCompatParcelizer + 45;
            MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            getpostalcode2.serializer(-981440815);
            boolean z = getpostalcode2.read(lastStopSelectionBottomSheetUiModel);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (z || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new MapboxNavigation.AnonymousClass15(0, lastStopSelectionBottomSheetUiModel, LastStopSelectionBottomSheetUiModel.class, "onSetLocationClick", "onSetLocationClick()V", 0, 28);
                getpostalcode2.write(objComponentActivity4);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4);
            boolean z2 = getpostalcode2.read(lastStopSelectionBottomSheetUiModel);
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (z2) {
                objComponentActivity5 = new ReportPictureUseCase$invoke$2(1, lastStopSelectionBottomSheetUiModel, LastStopSelectionBottomSheetUiModel.class, "onSetRecentLocationClick", "onSetRecentLocationClick(I)V", 0, 4);
                getpostalcode2.write(objComponentActivity5);
                int i13 = MediaSessionCompatQueueItem + 23;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else {
                int i15 = RemoteActionCompatParcelizer + 33;
                MediaSessionCompatQueueItem = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new ReportPictureUseCase$invoke$2(1, lastStopSelectionBottomSheetUiModel, LastStopSelectionBottomSheetUiModel.class, "onSetRecentLocationClick", "onSetRecentLocationClick(I)V", 0, 4);
                    getpostalcode2.write(objComponentActivity5);
                    int i17 = MediaSessionCompatQueueItem + 23;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                }
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity5);
            onHideTranslationui onhidetranslationui = (onHideTranslationui) getplatformandroidmanager;
            int iSerializer = onhidetranslationui.serializer();
            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
            if (objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = new TextMeasurerHelperKt(onhidetranslationui, 3);
                getpostalcode2.write(objComponentActivity6);
            }
            LastStopSelectionBottomSheetContentKt.LastStopSelectionBottomSheetContent(isopaque, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, iSerializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, modifier, getpostalcode2, ((iIntValue >> 3) & 14) | 24576);
            getpostalcode2.IconCompatParcelizer(false);
        } else {
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
            getpostalcode3.serializer(-981009047);
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode3, 0);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode3.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i19 = RemoteActionCompatParcelizer + 5;
            MediaSessionCompatQueueItem = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                getpostalcode3.serializer(constructor);
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            LastStopSelectionLocationContentKt.LastStopBottomSheetLoadingContent(modifier, getpostalcode3, 3, 6);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode3, SizeKt.m75height3ABfNKs(companion, Dimensions.setSplitBackground)});
            getpostalcode3.IconCompatParcelizer(true);
            getpostalcode3.IconCompatParcelizer(false);
        }
        return createfromparcel;
    }
}
