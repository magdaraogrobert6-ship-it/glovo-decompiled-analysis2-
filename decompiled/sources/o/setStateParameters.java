package o;

import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableStepComposableKt;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setStateParameters {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void IconCompatParcelizer(bitOffsetToIndex bitoffsettoindex, androidx.compose.ui.Modifier modifier, Integer num, boolean z, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        androidx.compose.ui.Modifier modifier2;
        fieldToDouble fieldtodouble;
        String str;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1465422101);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(bitoffsettoindex);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(bitoffsettoindex);
                int i5 = serializer + 103;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            if (zIconCompatParcelizer) {
                int i7 = IconCompatParcelizer;
                int i8 = i7 + 101;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                int i10 = i7 + 79;
                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i12 = i2 | 48;
        if ((i & 384) == 0) {
            i12 |= getpostalcode.read(num) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = serializer + 9;
            IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 3 % 3;
            }
        }
        if ((i & 3072) == 0) {
            i12 |= getpostalcode.write(z) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if (getpostalcode.write(i12 & 1, (i12 & 1171) != 1170)) {
            modifier2 = androidx.compose.ui.Modifier.Companion;
            if (bitoffsettoindex.currentStateType == bitsNeedForSizeUnchecked.COMPLETED) {
                fieldtodouble = fieldToDouble.Complete;
            } else {
                fieldtodouble = bitoffsettoindex.isEnabled ? fieldToDouble.Active : fieldToDouble.Inactive;
            }
            String str2 = bitoffsettoindex.title;
            constrainWidthK40F9xA constrainwidthk40f9xa = bitoffsettoindex.currentState;
            if (constrainwidthk40f9xa != null) {
                int i15 = IconCompatParcelizer + 103;
                serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                str = constrainwidthk40f9xa.description;
            } else {
                str = null;
            }
            int i17 = i12 << 9;
            CustomerUnavailableStepComposableKt.CustomerUnavailableStepComposable(fieldtodouble, coil3.ExtrasKt.write(-340948534, new NestFragment$$ExternalSyntheticLambda1(10, bitoffsettoindex), getpostalcode), modifier2, str2, str, num, z, getpostalcode, ((i12 << 3) & 896) | 48 | (458752 & i17) | (3670016 & i17), 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(bitoffsettoindex, modifier2, num, z, i);
        }
    }
}
