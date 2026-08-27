package com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PassthroughConnectionusePrepared2;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.hasDesignInfo;
import o.isValidParameter;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ContactRiderBottomSheetKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x0058  */
    /* JADX WARN: Code duplicated, block: B:13:0x0061  */
    /* JADX WARN: Code duplicated, block: B:14:0x0066  */
    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[PHI: r4 r8 r9
  0x0075: PHI (r4v9 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider) = 
  (r4v4 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider)
  (r4v10 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider)
 binds: [B:8:0x0049, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x0075: PHI (r8v6 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) = 
  (r8v0 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet)
  (r8v7 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet)
 binds: [B:8:0x0049, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x0075: PHI (r9v50 o.getPostalCode) = (r9v1 o.getPostalCode), (r9v52 o.getPostalCode) binds: [B:8:0x0049, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x0211  */
    /* JADX WARN: Code duplicated, block: B:9:0x004b A[PHI: r4 r8 r9
  0x004b: PHI (r4v5 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider) = 
  (r4v4 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider)
  (r4v10 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider)
 binds: [B:8:0x0049, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r8v1 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet) = 
  (r8v0 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet)
  (r8v7 com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet)
 binds: [B:8:0x0049, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r9v2 o.getPostalCode) = (r9v1 o.getPostalCode), (r9v52 o.getPostalCode) binds: [B:8:0x0049, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void ContactRiderBottomSheet(hasDesignInfo hasdesigninfo, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;
        InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
        getPostalCode getpostalcode;
        int i2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4;
        int i5;
        boolean z;
        getPostalCode getpostalcode2;
        Modifier modifier2;
        Modifier.Companion companion;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = serializer + 101;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        Object obj = null;
        if (i9 % 2 == 0) {
            instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider = hasdesigninfo.IconCompatParcelizer;
            instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet = hasdesigninfo.write;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1410418670);
            if ((i & 93) == 0) {
                int i10 = serializer + 3;
                i2 = i10 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i2;
                int i11 = i10 % 2;
                if ((i & 8) == 0) {
                    i5 = i2 + 15;
                    serializer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        zIconCompatParcelizer = getpostalcode.read(hasdesigninfo);
                    } else {
                        getpostalcode.read(hasdesigninfo);
                        throw null;
                    }
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(hasdesigninfo);
                }
                if (zIconCompatParcelizer) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider = hasdesigninfo.IconCompatParcelizer;
            instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet = hasdesigninfo.write;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1410418670);
            if ((i & 6) == 0) {
                int i12 = serializer + 3;
                i2 = i12 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i2;
                int i13 = i12 % 2;
                if ((i & 8) == 0) {
                    i5 = i2 + 15;
                    serializer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        zIconCompatParcelizer = getpostalcode.read(hasdesigninfo);
                    } else {
                        getpostalcode.read(hasdesigninfo);
                        throw null;
                    }
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(hasdesigninfo);
                }
                if (zIconCompatParcelizer) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        getPostalCode getpostalcode3 = getpostalcode;
        if ((i & 48) == 0) {
            i4 |= getpostalcode3.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i14 = serializer + 69;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                if (getpostalcode3.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                    int i15 = RemoteActionCompatParcelizer + 19;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    i7 = Fields.RotationX;
                } else {
                    i7 = Fields.SpotShadowColor;
                }
                i4 |= i7;
            } else {
                getpostalcode3.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i17 = serializer + 73;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                i6 = i17 % 2 == 0 ? 22164 : Fields.CameraDistance;
            } else {
                i6 = Fields.RotationZ;
            }
            i4 |= i6;
        }
        int i18 = i4 | 24576;
        if ((i18 & 9363) != 9362) {
            int i19 = RemoteActionCompatParcelizer + 121;
            serializer = i19 % Fields.SpotShadowColor;
            if (i19 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode3.write(i18 & 1, z)) {
            Modifier.Companion companion2 = Modifier.Companion;
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion2, f, f, f, 0.0f, 8);
            modifierM74paddingqDBjuR0$default.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode3, 0);
            InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2 = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode3.read != null) {
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode3.ComponentActivity) {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i20 = RemoteActionCompatParcelizer + 9;
                    serializer = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 != 0) {
                        getpostalcode3.serializer(constructor);
                        int i21 = 32 / 0;
                    } else {
                        getpostalcode3.serializer(constructor);
                    }
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                getpostalcode2 = getpostalcode3;
                TextKt.m131TextNvy7gAk(af$$ExternalSyntheticOutline0.m(instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2.serializer, " ", instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.write), null, ((buildMapping) getpostalcode3.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, 0, 0, 131066);
                String str = instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.IconCompatParcelizer;
                if (str == null) {
                    int i22 = serializer + 93;
                    RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                    if (i22 % 2 == 0) {
                        getpostalcode2.serializer(638308070);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.serializer(638308070);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                    companion = companion2;
                } else {
                    getpostalcode2.serializer(638308071);
                    String str2 = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2.RemoteActionCompatParcelizer.IconCompatParcelizer;
                    Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion2, 1.0f), 0.0f, Dimensions.setLogo, 0.0f, f, 5);
                    modifierM74paddingqDBjuR0$default2.getClass();
                    boolean z2 = (i18 & 112) == 32;
                    boolean z3 = getpostalcode2.read(str);
                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (!(z3 | z2)) {
                        int i23 = serializer + 13;
                        RemoteActionCompatParcelizer = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        if (objComponentActivity == androidContentCaptureManager) {
                            objComponentActivity = new PassthroughConnectionusePrepared2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, str, 1);
                            getpostalcode2.write(objComponentActivity);
                        }
                    } else {
                        objComponentActivity = new PassthroughConnectionusePrepared2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, str, 1);
                        getpostalcode2.write(objComponentActivity);
                    }
                    PrimaryKt.write(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierM74paddingqDBjuR0$default2, false, false, Integer.valueOf(R.drawable.ic_bold_large_phone_default), null, null, null, null, getpostalcode2, 0, 0, 2008);
                    String str3 = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2.write.IconCompatParcelizer;
                    Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion2, 1.0f), 0.0f, 0.0f, 0.0f, f, 7);
                    modifierM74paddingqDBjuR0$default3.getClass();
                    boolean z4 = (i18 & 896) == 256;
                    boolean z5 = getpostalcode2.read(str);
                    Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if ((z5 | z4) || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new PassthroughConnectionusePrepared2(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, str, 2);
                        getpostalcode2.write(objComponentActivity2);
                    }
                    companion = companion2;
                    isValidParameter.RemoteActionCompatParcelizer(str3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifierM74paddingqDBjuR0$default3, false, false, Integer.valueOf(R.drawable.ic_bold_large_essentials_copy), null, null, null, getpostalcode2, 0, 984);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                String str4 = instructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet2.IconCompatParcelizer.IconCompatParcelizer;
                Modifier modifierM74paddingqDBjuR0$default4 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, 0.0f, 0.0f, f, 7);
                modifierM74paddingqDBjuR0$default4.getClass();
                TertiaryKt.IconCompatParcelizer(str4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierM74paddingqDBjuR0$default4, false, 0, null, null, null, getpostalcode2, (i18 >> 6) & 112, 248);
                getpostalcode2.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode2 = getpostalcode3;
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) hasdesigninfo, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 16);
        }
    }
}
