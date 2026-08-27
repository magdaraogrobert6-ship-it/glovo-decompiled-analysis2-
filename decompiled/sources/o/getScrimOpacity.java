package o;

import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.face.verification.presentation.selfie.camera.SelfieCameraContentKt;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getScrimOpacity {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, setWidgetBaseline setwidgetbaseline, onDependentViewRemoved ondependentviewremoved, NestFragment.AnonymousClass1 anonymousClass1, NestFragment.AnonymousClass1 anonymousClass2, NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        ondependentviewremoved.getClass();
        setwidgetbaseline.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-101316836);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i7 = RemoteActionCompatParcelizer + 77;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i5 = i7 % 2 != 0 ? 5 : 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(anonymousClass1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i8 = read + 11;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1)) {
                int i10 = read + 107;
                RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i10 % 2 == 0 ? 24904 : androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(anonymousClass2) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i11 = RemoteActionCompatParcelizer + 107;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(nestScreenKt$NestScreen$1$1);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(nestScreenKt$NestScreen$1$1) ? androidx.compose.ui.graphics.Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(ondependentviewremoved) ? androidx.compose.ui.graphics.Fields.RenderEffect : 65536;
        }
        boolean z = true;
        if ((1572864 & i) == 0) {
            if (!getpostalcode.IconCompatParcelizer(setwidgetbaseline)) {
                i3 = androidx.compose.ui.graphics.Fields.BlendMode;
            } else {
                int i12 = RemoteActionCompatParcelizer + 25;
                read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = 1048576;
            }
            i2 |= i3;
        }
        int i14 = i2 | 12582912;
        if ((4793491 & i14) != 4793490) {
            int i15 = read + 123;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i14 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            int i17 = i14 >> 3;
            SelfieCameraContentKt.SelfieCameraContent((i17 & 14) | ((i14 >> 9) & 112) | (i17 & 896) | ((i14 << 3) & 7168) | ((i14 << 12) & 57344) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128), getpostalcode, companion, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, setwidgetbaseline, ondependentviewremoved, anonymousClass1, anonymousClass2, nestScreenKt$NestScreen$1$1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new onAttachedToLayoutParams(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, anonymousClass1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, anonymousClass2, nestScreenKt$NestScreen$1$1, ondependentviewremoved, setwidgetbaseline, modifier2, i);
        }
    }
}
