package com.roadrunner.delivery.accept.footer.implementation.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import io.sentry.SentryUUID;
import io.sentry.util.MediaBrowserCompatMediaItem;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LineHeightStyleSpan_androidKt;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextAlignSaverlambda1;
import o.accessgetStripNonMetricAffectingCharSpansp;
import o.accessisMainThread;
import o.computeVerticalScrollExtent;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHeightPx;
import o.getMinimpl;
import o.getPostalCode;
import o.isMainThread;
import o.packWithCheck;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeliveryAcceptFooterContentKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final void DeliveryAcceptFooterContent(accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp, isMainThread ismainthread, accessisMainThread accessismainthread, MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        accessgetstripnonmetricaffectingcharspansp.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1351476220);
        int i6 = 4;
        if ((i & 6) == 0) {
            if (getpostalcode.read(accessgetstripnonmetricaffectingcharspansp)) {
                int i7 = IconCompatParcelizer + 9;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            int i9 = IconCompatParcelizer + 1;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 4 % 5;
            }
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = IconCompatParcelizer + 21;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(ismainthread) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(accessismainthread)) {
                int i13 = RemoteActionCompatParcelizer + 69;
                int i14 = i13 % Fields.SpotShadowColor;
                IconCompatParcelizer = i14;
                i4 = i13 % 2 == 0 ? 23521 : Fields.RotationX;
                int i15 = i14 + 99;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(mediaBrowserCompatMediaItem)) {
                int i17 = IconCompatParcelizer + 87;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.Clip : 8192;
        }
        Object obj = null;
        if ((196608 & i) == 0) {
            int i19 = RemoteActionCompatParcelizer + 99;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            if (i19 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true ? 65536 : Fields.RenderEffect;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 1048576 : Fields.BlendMode;
        }
        int i20 = i2 | 12582912;
        if (!getpostalcode.write(i20 & 1, (4793491 & i20) != 4793490)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = TextAlignSaverlambda1.serializer;
                getpostalcode.write(objComponentActivity);
            }
            r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim = (r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getMinimpl.RemoteActionCompatParcelizer;
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                int i21 = RemoteActionCompatParcelizer + 9;
                IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                if (i21 % 2 == 0) {
                    getpostalcode.write(LineHeightStyleSpan_androidKt.write);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                objComponentActivity3 = LineHeightStyleSpan_androidKt.write;
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity3;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i22 = IconCompatParcelizer + 63;
                RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke((getHeightPx) accessgetstripnonmetricaffectingcharspansp.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((packWithCheck) accessgetstripnonmetricaffectingcharspansp.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
            int i24 = i20 >> 9;
            r8lambdahlfuu54mfvlmnthbk7uy9j3wgim.read((DeliveryAcceptButtonUiModelImpl) accessgetstripnonmetricaffectingcharspansp.serializer.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, Integer.valueOf((i24 & 896) | (i24 & 112) | 24576 | (i24 & 7168)));
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent(accessgetstripnonmetricaffectingcharspansp, ismainthread, accessismainthread, mediaBrowserCompatMediaItem, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i);
        }
    }
}
