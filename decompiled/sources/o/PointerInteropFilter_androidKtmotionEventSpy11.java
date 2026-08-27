package o;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import okhttp3.Cookie$Companion;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PointerInteropFilter_androidKtmotionEventSpy11 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public abstract Object RemoteActionCompatParcelizer(Uri uri, ShortNewsContentCardView shortNewsContentCardView);

    public abstract Object read(Uri uri, InputEvent inputEvent, ShortNewsContentCardView shortNewsContentCardView);

    public abstract Object write(ShortNewsContentCardView shortNewsContentCardView);

    /* JADX WARN: Code duplicated, block: B:109:0x017c  */
    public static final void write(final String str, final String str2, final String str3, final int i, final transferSessionPackageI transfersessionpackagei, final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2, final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3, final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny4, final FormBody.Builder builder, final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny5, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, ActivityHandler41 activityHandler41, getBirthDateFull getbirthdatefull, final int i2, final int i3) {
        int i4;
        int i5;
        getPostalCode getpostalcode;
        final ActivityHandler41 activityHandler42;
        setStrokeCapBeK7IIE defaultViewModelCreationExtras;
        int i6;
        ActivityHandler41 activityHandler43;
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 2 % 2;
        transfersessionpackagei.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1795836629);
        if ((i2 & 6) == 0) {
            int i12 = RemoteActionCompatParcelizer + 59;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode2.read(str);
                throw null;
            }
            i4 = (getpostalcode2.read(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.read(str2) ? 32 : 16;
        }
        int i13 = i2 & 384;
        int i14 = androidx.compose.ui.graphics.Fields.RotationX;
        if (i13 == 0) {
            i4 |= getpostalcode2.read(str3) ? 256 : 128;
        }
        int i15 = i2 & 3072;
        int i16 = androidx.compose.ui.graphics.Fields.RotationZ;
        if (i15 == 0) {
            i4 |= getpostalcode2.read(i) ? androidx.compose.ui.graphics.Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            if (getpostalcode2.IconCompatParcelizer(transfersessionpackagei)) {
                int i17 = IconCompatParcelizer + 17;
                RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i10 = androidx.compose.ui.graphics.Fields.Clip;
            } else {
                i10 = 8192;
            }
            i4 |= i10;
        }
        if ((i2 & 196608) == 0) {
            int i19 = RemoteActionCompatParcelizer + 53;
            IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i19 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdaudhhxliolpu0hpccqh6voskpny);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaudhhxliolpu0hpccqh6voskpny) ? androidx.compose.ui.graphics.Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaudhhxliolpu0hpccqh6voskpny2)) {
                int i20 = IconCompatParcelizer + 51;
                RemoteActionCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i21 = i20 % 2;
                i9 = 1048576;
            } else {
                i9 = androidx.compose.ui.graphics.Fields.BlendMode;
            }
            i4 |= i9;
        }
        if ((12582912 & i2) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaudhhxliolpu0hpccqh6voskpny3)) {
                int i22 = IconCompatParcelizer + 35;
                RemoteActionCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i23 = i22 % 2;
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i4 |= i8;
        }
        if ((100663296 & i2) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaudhhxliolpu0hpccqh6voskpny4) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            if (getpostalcode2.IconCompatParcelizer(builder)) {
                int i24 = RemoteActionCompatParcelizer + 101;
                IconCompatParcelizer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i25 = i24 % 2;
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i4 |= i7;
        }
        if ((i3 & 6) == 0) {
            i5 = (getpostalcode2.IconCompatParcelizer(r8lambdaudhhxliolpu0hpccqh6voskpny5) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            int i26 = RemoteActionCompatParcelizer + 51;
            IconCompatParcelizer = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i26 % 2 != 0) {
                int i27 = 97 / 0;
                if (!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i14 = 128;
                }
            } else if (!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i14 = 128;
            }
            i5 |= i14;
        }
        if ((i3 & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i16 = androidx.compose.ui.graphics.Fields.CameraDistance;
            }
            i5 |= i16;
        }
        if ((i3 & 24576) == 0) {
            i5 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ^ true ? 8192 : androidx.compose.ui.graphics.Fields.Clip;
        }
        if ((196608 & i3) == 0) {
            i5 |= 65536;
        }
        if (getpostalcode2.write(i4 & 1, ((306783379 & i4) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i2 & 1) == 0 || getpostalcode2.PlaybackStateCompat()) {
                asFrameworkPaint asframeworkpaintIconCompatParcelizer = setStrokeJoinWw9F2mQ.IconCompatParcelizer(getpostalcode2);
                if (asframeworkpaintIconCompatParcelizer == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                if (asframeworkpaintIconCompatParcelizer instanceof AndroidColorFilter_androidKt) {
                    int i28 = RemoteActionCompatParcelizer + 75;
                    IconCompatParcelizer = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i28 % 2 != 0) {
                        ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer).getDefaultViewModelCreationExtras();
                        throw null;
                    }
                    defaultViewModelCreationExtras = ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = setPathEffect.IconCompatParcelizer;
                }
                ActivityHandler41 activityHandler44 = (ActivityHandler41) Cookie$Companion.IconCompatParcelizer(asframeworkpaintIconCompatParcelizer, displayInAppMessagelambda1.serializer(ActivityHandler41.class), r8lambdaudhhxliolpu0hpccqh6voskpny5, defaultViewModelCreationExtras);
                i6 = i5 & (-458753);
                activityHandler43 = activityHandler44;
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i6 = i5 & (-458753);
                activityHandler43 = activityHandler41;
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(activityHandler43);
            int i29 = i4 & 14;
            boolean z2 = i29 == 4;
            int i30 = i4 & 7168;
            boolean z3 = i30 == 2048;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((zIconCompatParcelizer | z2 | z3) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new RxConvertKt$asFlow$1(activityHandler43, str, i, (ShortNewsContentCardView) null);
                getpostalcode2.write(objComponentActivity);
            }
            int i31 = i4 >> 6;
            getPhoneNumberNational.serializer(str, Integer.valueOf(i), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, getpostalcode2);
            Context context = (Context) getpostalcode2.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            relativeMoveTo relativemoveto = asComposePath.read(new toAndroidPathDashPathEffectStyleoQv6xUo[0], getpostalcode2);
            boolean z4 = i29 == 4;
            boolean z5 = i30 == 2048;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if ((z4 | z5) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = TextFieldImplKtCommonDecorationBox3borderContainerWithId1.RemoteActionCompatParcelizer(transfersessionpackagei, str, str2, str3);
                getpostalcode2.write(objComponentActivity2);
            }
            String str4 = (String) objComponentActivity2;
            if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_RACC_PASS_VERIFICATION_ENABLED)) {
                int i32 = RemoteActionCompatParcelizer + 111;
                IconCompatParcelizer = i32 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i33 = i32 % 2;
                r8lambdaudhhxliolpu0hpccqh6voskpny6 = r8lambdaudhhxliolpu0hpccqh6voskpny3;
            } else {
                r8lambdaudhhxliolpu0hpccqh6voskpny6 = null;
            }
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(context);
            ActivityHandler41 activityHandler45 = activityHandler43;
            if ((i6 & 57344) == 16384) {
                int i34 = RemoteActionCompatParcelizer + 63;
                IconCompatParcelizer = i34 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i34 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if ((zIconCompatParcelizer2 | z) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda1(context, 4, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                getpostalcode2.write(objComponentActivity3);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3;
            int i35 = i6 << 18;
            int i36 = ((i4 >> 21) & 896) | (i31 & 7168) | (57344 & i31) | (3670016 & i31) | (29360128 & i35) | (234881024 & i35) | (i35 & 1879048192);
            getpostalcode = getpostalcode2;
            ActivityHandler42.write(relativemoveto, str4, builder, r8lambdaudhhxliolpu0hpccqh6voskpny, r8lambdaudhhxliolpu0hpccqh6voskpny2, r8lambdaudhhxliolpu0hpccqh6voskpny6, r8lambdaudhhxliolpu0hpccqh6voskpny4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getpostalcode, i36, 0);
            activityHandler42 = activityHandler45;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            activityHandler42 = activityHandler41;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.ActivityHandler43
                private static int ComponentActivity = 0;
                private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj3, Object obj4) {
                    int i37 = 2 % 2;
                    int i38 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 113;
                    ComponentActivity = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i39 = i38 % 2;
                    ((Integer) obj4).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i3);
                    PointerInteropFilter_androidKtmotionEventSpy11.write(str, str2, str3, i, transfersessionpackagei, r8lambdaudhhxliolpu0hpccqh6voskpny, r8lambdaudhhxliolpu0hpccqh6voskpny2, r8lambdaudhhxliolpu0hpccqh6voskpny3, r8lambdaudhhxliolpu0hpccqh6voskpny4, builder, r8lambdaudhhxliolpu0hpccqh6voskpny5, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, activityHandler42, (getBirthDateFull) obj3, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i40 = ComponentActivity + 69;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i40 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i40 % 2 != 0) {
                        return createfromparcel;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            };
        }
    }
}
