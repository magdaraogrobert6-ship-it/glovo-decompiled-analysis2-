package com.roadrunner.liveness.instruction.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.UiMediaScopeImpl;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FooterComponentKt {
    private static int read = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[PHI: r1
  0x0048: PHI (r1v73 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v75 o.getPostalCode) binds: [B:8:0x003a, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003c A[PHI: r1
  0x003c: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v75 o.getPostalCode) binds: [B:8:0x003a, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void FooterComponent(String str, String str2, String str3, String str4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        boolean z;
        getPostalCode getpostalcode3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = serializer + 3;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1889653148);
            if ((i & 4) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1889653148);
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(str2)) {
                int i8 = read + 29;
                serializer = i8 % Fields.SpotShadowColor;
                i5 = i8 % 2 != 0 ? 38 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i9 = serializer + 61;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode2.read(str4);
                obj.hashCode();
                throw null;
            }
            i3 |= getpostalcode2.read(str4) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 8192 : Fields.Clip;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = read + 73;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = Fields.RenderEffect;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.read(modifier) ? 1048576 : Fields.BlendMode;
        }
        int i12 = i3;
        if ((599187 & i12) != 599186) {
            z = true;
        } else {
            int i13 = serializer + 55;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = false;
        }
        if (!getpostalcode2.write(i12 & 1, z)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode3 = getpostalcode2;
        } else {
            int i15 = read + 103;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = serializer + 109;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i19 = serializer + 113;
                read = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            if (str == null) {
                getpostalcode2.serializer(752500383);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(752500384);
                PrivacyPolicyKt.PrivacyPolicy(str, str2, str3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode2, (i12 & 1008) | ((i12 >> 6) & 7168));
                getpostalcode2.IconCompatParcelizer(false);
            }
            Modifier.Companion companion2 = Modifier.Companion;
            getpostalcode3 = getpostalcode2;
            PrimaryKt.write(str4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion2, 1.0f), 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), false, false, null, null, null, null, null, getpostalcode3, (i12 >> 9) & 126, 0, 2040);
            IconCompatParcelizer.IconCompatParcelizer(companion2, Dimensions.getAnimatedVisibility, getpostalcode3, true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(str, str2, str3, str4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, i, 13);
        }
    }
}
