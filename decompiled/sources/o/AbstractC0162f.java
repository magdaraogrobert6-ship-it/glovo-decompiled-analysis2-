package o;

import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;

/* JADX INFO: renamed from: o.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0162f {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:184:0x02be  */
    public static final void serializer(final C0179j c0179j, final getQueryContext getquerycontext, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6, final androidx.compose.ui.Modifier modifier, final getInvalidationTracker getinvalidationtracker, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        getPostalCode getpostalcode;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        boolean zIconCompatParcelizer;
        int i7;
        int i8 = 2 % 2;
        getquerycontext.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k4.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k5.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm4.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k6.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(421066169);
        if ((i & 6) == 0) {
            int i9 = read + 61;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(c0179j);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(c0179j);
                int i11 = write + 71;
                read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
            if (zIconCompatParcelizer) {
                int i13 = read + 3;
                write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? getpostalcode2.read(getquerycontext) : getpostalcode2.IconCompatParcelizer(getquerycontext) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i15 = i & 3072;
        int i16 = androidx.compose.ui.graphics.Fields.CameraDistance;
        if (i15 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 2048 : 1024;
        }
        int i17 = i & 24576;
        int i18 = androidx.compose.ui.graphics.Fields.Clip;
        if (i17 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3)) {
                int i19 = write + 125;
                read = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i20 = i19 % 2;
                i6 = androidx.compose.ui.graphics.Fields.RenderEffect;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4) ? 1048576 : androidx.compose.ui.graphics.Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            int i21 = write + 113;
            read = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i22 = i21 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k5) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k6)) {
                int i23 = write + 69;
                read = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i5 = i23 % 2 != 0 ? Constant.ERROR_WSS_LOW_FREQ : androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i5 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i4 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (!getpostalcode2.read(modifier)) {
                i16 = 1024;
            }
            i4 |= i16;
        }
        if ((i2 & 24576) == 0) {
            if (!((32768 & i2) == 0 ? getpostalcode2.read(getinvalidationtracker) : getpostalcode2.IconCompatParcelizer(getinvalidationtracker))) {
                i18 = 8192;
            }
            i4 |= i18;
        }
        int i24 = i4;
        if (getpostalcode2.write(i3 & 1, ((i3 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0) {
                int i25 = write + 103;
                read = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i26 = i25 % 2;
                if (!getpostalcode2.PlaybackStateCompat()) {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            if ((458752 & i3) == 131072) {
                int i27 = read + 123;
                write = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i28 = i27 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z3 = (3670016 & i3) == 1048576;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z | z3) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new p3(r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, 2);
                getpostalcode2.write(objComponentActivity);
            }
            getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity2);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean z4 = (i24 & 896) == 256;
            boolean z5 = (1879048192 & i3) == 536870912;
            boolean z6 = (i24 & 14) == 4;
            boolean z7 = (234881024 & i3) == 67108864;
            if ((29360128 & i3) == 8388608) {
                int i29 = write + 81;
                read = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i30 = i29 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z8 = (i24 & 112) == 32;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (!(zIconCompatParcelizer2 | z4 | z5 | z6 | z7 | z2) && !z8) {
                int i31 = write + 95;
                read = i31 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i32 = i31 % 2;
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new accesstoPlatformPathDirection(getcontentviewgroupparentlayout, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4);
                    getpostalcode2.write(objComponentActivity3);
                }
            } else {
                objComponentActivity3 = new accesstoPlatformPathDirection(getcontentviewgroupparentlayout, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4);
                getpostalcode2.write(objComponentActivity3);
            }
            androidx.sqlite.SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode2, ((i3 >> 3) & 14) | 8);
            getpostalcode = getpostalcode2;
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(c0179j.RatingCompat, androidx.compose.ui.Modifier.Companion, null, null, coil3.ExtrasKt.write(1103866673, new b8ExternalSyntheticLambda4(c0179j, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, getinvalidationtracker, 1), getpostalcode), getpostalcode, 24624, 12);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.d
                private static int ComponentActivity = 0;
                private static int ResultReceiver = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i33 = 2 % 2;
                    int i34 = ComponentActivity + 17;
                    ResultReceiver = i34 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i35 = i34 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    AbstractC0162f.serializer(c0179j, getquerycontext, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, modifier, getinvalidationtracker, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i36 = ComponentActivity + 47;
                    ResultReceiver = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i37 = i36 % 2;
                    return createfromparcel;
                }
            };
        }
    }
}
