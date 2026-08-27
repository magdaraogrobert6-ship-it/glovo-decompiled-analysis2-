package o;

import com.roadrunner.delivery.accept.backToBackOrder.presentation.banner.BackToBackOrderBannerKt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getFocusedStyle {
    public static final DragAndDropTargetModifierNode IconCompatParcelizer = new DragAndDropTargetModifierNode(new r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE() { // from class: o.TextMeasurer
        private static int serializer = 0;
        private static int write = 1;

        /* JADX WARN: Code duplicated, block: B:11:0x0061  */
        /* JADX WARN: Code duplicated, block: B:12:0x0063  */
        @Override // o.r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE
        public final Object RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 2 % 2;
            int i7 = write + 121;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            String str = (String) obj;
            String str2 = (String) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj6;
            int iIntValue2 = ((Integer) serializable).intValue();
            str.getClass();
            str2.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            if ((iIntValue2 & 6) == 0) {
                int i9 = write + 57;
                serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 74 / 0;
                    if (((getPostalCode) getbirthdatefull).read(str)) {
                        i5 = 4;
                    } else {
                        i5 = 2;
                    }
                } else if (((getPostalCode) getbirthdatefull).read(str)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
                i = i5 | iIntValue2;
            } else {
                int i11 = serializer + 27;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                if (((getPostalCode) getbirthdatefull).read(str2)) {
                    int i13 = write + 107;
                    serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i |= i4;
            }
            boolean z = true;
            if ((iIntValue2 & 384) == 0) {
                i |= !((getPostalCode) getbirthdatefull).read(iIntValue) ? androidx.compose.ui.graphics.Fields.SpotShadowColor : androidx.compose.ui.graphics.Fields.RotationX;
            }
            if ((iIntValue2 & 3072) == 0) {
                if (((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i15 = serializer + 115;
                    write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i3 = i15 % 2 == 0 ? 3223 : androidx.compose.ui.graphics.Fields.CameraDistance;
                } else {
                    i3 = androidx.compose.ui.graphics.Fields.RotationZ;
                }
                i |= i3;
            }
            if ((iIntValue2 & 24576) == 0) {
                if (((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i2 = androidx.compose.ui.graphics.Fields.Clip;
                } else {
                    int i16 = serializer + 77;
                    write = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    i2 = 8192;
                }
                i |= i2;
            }
            if ((74899 & i) != 74898) {
                int i18 = write + 33;
                serializer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i19 = i18 % 2;
            } else {
                z = false;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(i & 1, z)) {
                int i20 = serializer + 69;
                write = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i20 % 2 == 0) {
                    BackToBackOrderBannerKt.BackToBackOrderBanner(iIntValue, i & 65534, getpostalcode, null, str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    int i21 = 16 / 0;
                } else {
                    BackToBackOrderBannerKt.BackToBackOrderBanner(iIntValue, i & 65534, getpostalcode, null, str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createFromParcel.INSTANCE;
        }
    }, false, -28386710);
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    static {
        int i = read + 63;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
