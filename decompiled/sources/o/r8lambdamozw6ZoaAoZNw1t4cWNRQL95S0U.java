package o;

import com.google.android.gms.location.DeviceOrientationRequest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdamozw6ZoaAoZNw1t4cWNRQL95S0U {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    public static final void RemoteActionCompatParcelizer(r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc r8lambdaomj_unyzprj1upaauufsp7i4jfc, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        androidx.compose.ui.Modifier modifier2;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdaomj_unyzprj1upaauufsp7i4jfc.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-595144466);
        if ((i & 6) == 0) {
            i2 = (((i & 8) == 0 ? getpostalcode.read(r8lambdaomj_unyzprj1upaauufsp7i4jfc) : getpostalcode.IconCompatParcelizer(r8lambdaomj_unyzprj1upaauufsp7i4jfc)) ^ true ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i6 = write + 39;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i8 = write + 101;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 67 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    int i10 = read + 95;
                    write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i3 = androidx.compose.ui.graphics.Fields.CameraDistance;
                } else {
                    i3 = androidx.compose.ui.graphics.Fields.RotationZ;
                }
            } else if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i3 = androidx.compose.ui.graphics.Fields.RotationZ;
            } else {
                int i12 = read + 95;
                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = androidx.compose.ui.graphics.Fields.CameraDistance;
            }
            i2 |= i3;
        }
        int i14 = i2 | 24576;
        if ((i14 & 9363) != 9362) {
            int i15 = write + 37;
            read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i14 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            String str = r8lambdaomj_unyzprj1upaauufsp7i4jfc.RemoteActionCompatParcelizer;
            if (str != null) {
                int i17 = write + 55;
                read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i18 = i17 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            int i19 = i14 << 9;
            com.roadrunner.rrds.compose.component.tooltip.TooltipKt.m5064TooltipgHHVGI(str == null ? "" : str, coil3.ExtrasKt.write(2104635228, new getDoesBackButtonDismissInAppMessageView(5, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode), companion, 0L, 0L, AdjustBridgeUtil1.TOP, 0.0f, 0.0f, z2, false, false, false, Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_FAST), r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, ((i14 >> 6) & 896) | 1572912, (57344 & i19) | 3072 | (i19 & 458752), 7608);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new findNearestNeighbor(r8lambdaomj_unyzprj1upaauufsp7i4jfc, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i);
        }
    }
}
