package com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.network.NetworkFetcher;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessgetStripNonMetricAffectingCharSpansp;
import o.accessgetTextCentercp;
import o.accessstripNonMetricAffectingCharacterStyleSpans;
import o.buildMapping;
import o.computeVerticalScrollRange;
import o.containsimpl;
import o.drawTextLVfH_YU;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.measurewNUYSr0;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;
import o.registerInAppMessageManagerlambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OverlayFooterKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final void OverlayStickyFooter(drawTextLVfH_YU drawtextlvfh_yu, accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans, TncComposableFactoryImpl$$ExternalSyntheticLambda0 tncComposableFactoryImpl$$ExternalSyntheticLambda0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        ?? r9;
        boolean z;
        int i2 = 2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1329374384);
        int i4 = (i & 6) == 0 ? (getpostalcode.IconCompatParcelizer(drawtextlvfh_yu) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            int i5 = read + 57;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i4 |= getpostalcode.IconCompatParcelizer(accessstripnonmetricaffectingcharacterstylespans) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i7 = read + 5;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i4 |= getpostalcode.IconCompatParcelizer(tncComposableFactoryImpl$$ExternalSyntheticLambda0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i4 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i9 = i4;
        if (getpostalcode.write(i9 & 1, (i9 & 1171) != 1170)) {
            int i10 = read + 77;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            Object obj = getCreditCardExpirationMonth.write;
            if (objComponentActivity == obj) {
                Object dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new computeVerticalScrollRange(1, accessstripnonmetricaffectingcharacterstylespans), true, 590718748);
                getpostalcode.write(dragAndDropTargetModifierNode);
                objComponentActivity = dragAndDropTargetModifierNode;
            }
            r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim = (r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM) objComponentActivity;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(drawtextlvfh_yu.RemoteActionCompatParcelizer, getpostalcode, 0);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(drawtextlvfh_yu.IconCompatParcelizer, getpostalcode, 0);
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(SizeKt.write(modifier, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i12 = IconCompatParcelizer + 107;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i14 = read + 73;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    r9 = 0;
                    int i15 = 79 / 0;
                } else {
                    r9 = 0;
                    getpostalcode.serializer(constructor);
                }
            } else {
                r9 = 0;
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(285302894);
            for (Object obj2 : (List) populateViewStructure_androidKtpopulate7Write.getValue()) {
                if (obj2 instanceof accessgetStripNonMetricAffectingCharSpansp) {
                    int i16 = IconCompatParcelizer + 61;
                    read = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % i2;
                    getpostalcode.serializer(1937401379);
                    Object objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (objComponentActivity2 == obj) {
                        objComponentActivity2 = new accessgetTextCentercp(16);
                        getpostalcode.write(objComponentActivity2);
                    }
                    Object obj3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2;
                    Object objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (objComponentActivity3 == obj) {
                        z = true;
                        objComponentActivity3 = new b8$$ExternalSyntheticLambda4(1);
                        getpostalcode.write(objComponentActivity3);
                    } else {
                        z = true;
                    }
                    r8lambdahlfuu54mfvlmnthbk7uy9j3wgim.read(obj2, tncComposableFactoryImpl$$ExternalSyntheticLambda0, obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, Integer.valueOf(((i9 >> 3) & 112) | 28032));
                    getpostalcode.IconCompatParcelizer((boolean) r9);
                } else {
                    getpostalcode.serializer(1937475376);
                    getpostalcode.IconCompatParcelizer((boolean) r9);
                }
                obj = obj;
                i2 = 2;
            }
            Object obj4 = obj;
            getpostalcode.IconCompatParcelizer((boolean) r9);
            measurewNUYSr0 measurewnuysr0 = (measurewNUYSr0) populateViewStructure_androidKtpopulate7Write2.getValue();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(drawtextlvfh_yu);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity4 == obj4) {
                Object anonymousClass2 = new NetworkFetcher.AnonymousClass2(1, drawtextlvfh_yu, drawTextLVfH_YU.class, "onOverlayErrorBannerDismissed", "onOverlayErrorBannerDismissed(Ljava/lang/String;)V", 0, 26);
                getpostalcode.write(anonymousClass2);
                objComponentActivity4 = anonymousClass2;
            }
            containsimpl.IconCompatParcelizer(measurewnuysr0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity4), getpostalcode, r9);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) drawtextlvfh_yu, (Object) accessstripnonmetricaffectingcharacterstylespans, (Object) tncComposableFactoryImpl$$ExternalSyntheticLambda0, modifier, i, 8);
        }
    }
}
