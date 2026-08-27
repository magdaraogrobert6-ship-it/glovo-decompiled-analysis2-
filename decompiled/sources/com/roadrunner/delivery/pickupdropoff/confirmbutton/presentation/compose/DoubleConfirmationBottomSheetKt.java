package com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getActivityKind;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DoubleConfirmationBottomSheetKt {
    private static int serializer = 1;
    private static int write;

    public static final void DoubleConfirmationBottomSheet(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-208081363);
        if ((i & 6) == 0) {
            int i7 = write + 97;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getpostalcode.read(str);
                throw null;
            }
            if (getpostalcode.read(str)) {
                i5 = 4;
            } else {
                int i8 = write + 17;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i10 = serializer + 111;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                getpostalcode.read(str3);
                throw null;
            }
            if (getpostalcode.read(str3)) {
                int i11 = serializer + 73;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i13 = write + 113;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i15 = i2 | 196608;
        if ((74899 & i15) != 74898) {
            int i16 = serializer + 47;
            write = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i15 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, f, f, f, 0.0f, 8);
            modifierM74paddingqDBjuR0$default.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
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
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, i15 & 14, 0, 131066);
            Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, Dimensions.setLogo, 0.0f, f, 5);
            modifierM74paddingqDBjuR0$default2.getClass();
            int i18 = i15 >> 6;
            PrimaryKt.write(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierM74paddingqDBjuR0$default2, false, false, null, null, null, null, null, getpostalcode, ((i15 >> 3) & 14) | (i18 & 112), 0, 2040);
            Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, 0.0f, 0.0f, f, 7);
            modifierM74paddingqDBjuR0$default3.getClass();
            TertiaryKt.IconCompatParcelizer(str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifierM74paddingqDBjuR0$default3, false, 0, null, null, null, getpostalcode, (i18 & 14) | ((i15 >> 9) & 112), 248);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getActivityKind(str, str2, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i);
        }
    }
}
