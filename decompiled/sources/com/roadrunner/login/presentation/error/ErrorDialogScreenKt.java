package com.roadrunner.login.presentation.error;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.a6;
import o.a7;
import o.a7ExternalSyntheticLambda3;
import o.a8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ErrorDialogScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, a6 a6Var) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-685538931);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            if ((i & 64) == 0 ? getpostalcode.read(a6Var) : getpostalcode.IconCompatParcelizer(a6Var)) {
                int i5 = IconCompatParcelizer + 59;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i2 = 32;
            } else {
                i2 = 16;
            }
            i4 |= i2;
        }
        boolean z2 = true;
        if ((i4 & 19) != 18) {
            int i7 = serializer + 99;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            int i9 = serializer + 125;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                Modifier.Companion companion = Modifier.Companion;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            modifier = Modifier.Companion;
            if (a6Var != null) {
                int i10 = serializer + 97;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.serializer(-320665221);
                if ((i4 & 112) != 32) {
                    int i12 = IconCompatParcelizer + 9;
                    serializer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    if ((i4 & 64) == 0 || !getpostalcode.IconCompatParcelizer(a6Var)) {
                        z2 = false;
                    }
                }
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new a7(a6Var, 0);
                    getpostalcode.write(objComponentActivity);
                }
                AndroidDialog_androidKt.Dialog((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, ExtrasKt.write(556342463, new SnackbarKt$$ExternalSyntheticLambda2(a6Var, 11, modifier), getpostalcode), getpostalcode, 384, 2);
                getpostalcode.IconCompatParcelizer(false);
                int i14 = IconCompatParcelizer + 89;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            } else {
                getpostalcode.serializer(-320363467);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new a8(modifier, a6Var, i);
            int i16 = serializer + 33;
            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        }
    }

    public static final void IconCompatParcelizer(String str, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        getPostalCode getpostalcode;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(784860710);
        if ((i & 6) == 0) {
            if (getpostalcode2.read((Object) null)) {
                int i6 = serializer + 103;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                i4 = i6 % 2 == 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = IconCompatParcelizer + 117;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 |= getpostalcode2.read(str) ? 32 : 16;
        }
        if (getpostalcode2.write(i2 & 1, !((i2 & 19) == 18))) {
            getpostalcode2.serializer(-16276004);
            getpostalcode2.IconCompatParcelizer(false);
            if (str.length() != 0) {
                getpostalcode2.serializer(-16223800);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.getNestedScrollAxes)});
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                i3 = 0;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                int i9 = serializer + 57;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    getpostalcode2.serializer(-15989316);
                    getpostalcode2.IconCompatParcelizer(true);
                } else {
                    getpostalcode2.serializer(-15989316);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                i3 = 0;
                getpostalcode = getpostalcode2;
            }
        } else {
            i3 = 0;
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new a7ExternalSyntheticLambda3(str, i, i3);
            int i10 = IconCompatParcelizer + 23;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a  */
    public static final void DialogContent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, a6 a6Var) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(331469102);
        if ((i & 6) == 0) {
            int i4 = serializer + 45;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            i2 = ((i4 % 2 != 0 ? (i & 8) != 0 : (i & 124) != 0) ? getpostalcode2.IconCompatParcelizer(a6Var) : getpostalcode2.read(a6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i5 = serializer + 105;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            Modifier modifierIconCompatParcelizer = SizeKt.IconCompatParcelizer(modifier, null, 3);
            modifierIconCompatParcelizer.getClass();
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierIconCompatParcelizer, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
            float f = Dimensions.setLogo;
            Modifier modifierWrite = PaddingKt.write(modifierM20backgroundbw27NRU, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i7 = serializer + 19;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i8 = 70 / 0;
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i9 = IconCompatParcelizer + 1;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
            } else {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i11 = IconCompatParcelizer + 1;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getpostalcode2.serializer(-591008125);
            IconCompatParcelizer(a6Var.serializer, getpostalcode2, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierM = af$$ExternalSyntheticOutline1.m(companion2, f, getpostalcode2, companion2, 1.0f);
            String str = a6Var.read.RemoteActionCompatParcelizer;
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(a6Var);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (!(!zIconCompatParcelizer)) {
                objComponentActivity = new a7(a6Var, 1);
                getpostalcode2.write(objComponentActivity);
                int i13 = IconCompatParcelizer + 117;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else {
                int i15 = IconCompatParcelizer + 83;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new a7(a6Var, 1);
                    getpostalcode2.write(objComponentActivity);
                    int i17 = IconCompatParcelizer + 117;
                    serializer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                }
            }
            getpostalcode = getpostalcode2;
            PrimaryKt.write(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierM, false, false, null, null, null, null, null, getpostalcode2, 384, 0, 2040);
            getpostalcode.serializer(1811348646);
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new a8(a6Var, modifier, i);
        }
    }
}
