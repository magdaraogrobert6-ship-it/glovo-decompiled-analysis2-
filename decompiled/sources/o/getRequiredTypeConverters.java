package o;

import com.roadrunner.lib.compose.permission.PermissionContentKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getRequiredTypeConverters {
    private static int read = 0;
    private static int write = 1;

    public static final void write(int i, getBirthDateFull getbirthdatefull, accessgetAltRightcp accessgetaltrightcp, getUseTempTrackingTableroom_runtime getusetemptrackingtableroom_runtime, getTypeConverter gettypeconverter, getTypeConverter gettypeconverter2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        accessgetaltrightcp.getClass();
        gettypeconverter.getClass();
        gettypeconverter2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getusetemptrackingtableroom_runtime.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(830158962);
        Object obj = null;
        if ((i & 6) == 0) {
            int i8 = read + 19;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode.read(accessgetaltrightcp);
                obj.hashCode();
                throw null;
            }
            i2 = (getpostalcode.read(accessgetaltrightcp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(gettypeconverter)) {
                int i9 = read + 23;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i6 = i9 % 2 == 0 ? 47 : 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(gettypeconverter2)) {
                int i10 = read + 111;
                write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i5 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i12 = read + 85;
                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i12 % 2 == 0 ? 28758 : androidx.compose.ui.graphics.Fields.CameraDistance;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.RotationZ;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            int i13 = write + 75;
            read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                getpostalcode.write(z);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.write(z) ? androidx.compose.ui.graphics.Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i14 = read + 39;
            write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            if (getpostalcode.read(getusetemptrackingtableroom_runtime.ordinal())) {
                int i16 = write + 1;
                read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = androidx.compose.ui.graphics.Fields.RenderEffect;
                if (i17 != 0) {
                    int i18 = 96 / 0;
                }
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 1048576 : androidx.compose.ui.graphics.Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= getpostalcode.write(z2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 536870912 : 268435456;
        }
        if (getpostalcode.write(i2 & 1, (306783379 & i2) != 306783378)) {
            int i19 = i2 >> 12;
            int i20 = i2 << 6;
            PermissionContentKt.PermissionDialogContent((i19 & 458752) | ((i2 >> 24) & 14) | (i19 & 112) | (i20 & 896) | (i20 & 7168) | (57344 & i20) | ((i2 << 9) & 3670016) | (29360128 & i2) | (i20 & 234881024) | ((i2 << 15) & 1879048192), getpostalcode, accessgetaltrightcp, getusetemptrackingtableroom_runtime, gettypeconverter, gettypeconverter2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z2, z);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getRequiredTypeConverterClassesMaproom_runtime(accessgetaltrightcp, gettypeconverter, gettypeconverter2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, getusetemptrackingtableroom_runtime, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, z2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i);
        }
    }
}
