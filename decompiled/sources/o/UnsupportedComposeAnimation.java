package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.ButtonTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.MessageBoxTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableStepComposableKt;
import com.roadrunner.delivery.state.pudo.MessageBoxTypeToken;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UnsupportedComposeAnimation {
    private static int read = 1;
    private static int serializer;

    public static final void read(mapTreeWithStitching maptreewithstitching, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        MessageBoxTypeToken messageBoxTypeToken;
        Integer num;
        String str;
        String str2;
        androidx.compose.ui.Modifier modifier;
        String str3;
        enableBridgeSecurity enablebridgesecurity;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1091351892);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(maptreewithstitching) : getpostalcode.IconCompatParcelizer(maptreewithstitching)) {
                int i7 = serializer + 3;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
            int i9 = serializer + 5;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i11 = read + 9;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i13 = serializer + 23;
            read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                messageBoxTypeToken = maptreewithstitching.type;
                num = maptreewithstitching.icon;
                str = maptreewithstitching.title;
                str2 = maptreewithstitching.body;
                modifier = null;
                str3 = null;
                enablebridgesecurity = null;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
                i3 = 0;
                i4 = 811;
            } else {
                messageBoxTypeToken = maptreewithstitching.type;
                num = maptreewithstitching.icon;
                str = maptreewithstitching.title;
                str2 = maptreewithstitching.body;
                modifier = null;
                str3 = null;
                enablebridgesecurity = null;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
                i3 = 0;
                i4 = Constant.ERROR_WSS_SPEED_JUMP;
            }
            MessageBoxTypeTokenMapperKt.read(messageBoxTypeToken, modifier, num, str, str2, str3, enablebridgesecurity, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, i3, i4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(maptreewithstitching, i, 19);
        }
    }

    public static final void serializer(ComposeAnimationState composeAnimationState, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(921843382);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(composeAnimationState);
                int i6 = read + 43;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(composeAnimationState);
            }
            if (zIconCompatParcelizer) {
                int i8 = serializer + 109;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = serializer + 51;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i12 = serializer + 71;
            read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i2 |= getpostalcode.write(z2) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i14 = serializer + 9;
                read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i14 % 2 == 0 ? 24944 : androidx.compose.ui.graphics.Fields.CameraDistance;
            } else {
                i3 = androidx.compose.ui.graphics.Fields.RotationZ;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            int i15 = read + 71;
            serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            int i17 = i2 << 9;
            ButtonTypeTokenMapperKt.IconCompatParcelizer(composeAnimationState.type, composeAnimationState.actionTitle, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.foundation.layout.SizeKt.write(androidx.compose.ui.Modifier.Companion, 1.0f), z, z2, composeAnimationState.actionIcon, getpostalcode, (i17 & 458752) | ((i2 >> 3) & 896) | 3072 | (57344 & i17), androidx.compose.ui.graphics.Fields.SpotShadowColor);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isSpecified4Dl_Bck(composeAnimationState, z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 1);
        }
    }

    public static final void write(fixedJhjzzOo fixedjhjzzoo, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, Integer num, boolean z, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        androidx.compose.ui.Modifier modifier2;
        fieldToDouble fieldtodouble;
        String str;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1251980627);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(fixedjhjzzoo) : getpostalcode.IconCompatParcelizer(fixedjhjzzoo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i6 = i2 | 384;
        if ((i & 3072) == 0) {
            if (getpostalcode.read(num)) {
                int i7 = serializer + 27;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = androidx.compose.ui.graphics.Fields.CameraDistance;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.RotationZ;
            }
            i6 |= i4;
        }
        if ((i & 24576) == 0) {
            if (!getpostalcode.write(z)) {
                i3 = 8192;
            } else {
                int i9 = serializer + 31;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i9 % 2 == 0 ? 17776 : androidx.compose.ui.graphics.Fields.Clip;
            }
            i6 |= i3;
        }
        if (getpostalcode.write(i6 & 1, (i6 & 9363) != 9362)) {
            int i10 = read + 45;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            modifier2 = androidx.compose.ui.Modifier.Companion;
            int i12 = UnsupportedComposeAnimationCompanion.serializer[fixedjhjzzoo.currentStateType.ordinal()];
            if (i12 == 1) {
                fieldtodouble = fieldToDouble.Complete;
            } else if (i12 == 2) {
                fieldtodouble = fieldToDouble.Inactive;
            } else {
                if (i12 != 3 && i12 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                fieldtodouble = fieldToDouble.Active;
            }
            fieldToDouble fieldtodouble2 = fieldtodouble;
            String str2 = fixedjhjzzoo.title;
            ConstraintsKt constraintsKt = fixedjhjzzoo.currentState;
            if (constraintsKt != null) {
                int i13 = serializer + 83;
                read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    String str3 = constraintsKt.description;
                    throw null;
                }
                str = constraintsKt.description;
            } else {
                str = null;
            }
            int i14 = i6 << 6;
            CustomerUnavailableStepComposableKt.CustomerUnavailableStepComposable(fieldtodouble2, coil3.ExtrasKt.write(-402228012, new SnackbarKt$$ExternalSyntheticLambda2(fixedjhjzzoo, 6, r8lambdaunavo3sxub_pc9xroryotnrlvsm), getpostalcode), modifier2, str2, str, num, z, getpostalcode, (i14 & 3670016) | (i6 & 896) | 48 | (458752 & i14), 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new convertToHex(fixedjhjzzoo, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, num, z, i);
        }
    }
}
