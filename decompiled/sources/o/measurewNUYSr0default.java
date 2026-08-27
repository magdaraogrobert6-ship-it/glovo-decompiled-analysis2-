package o;

import com.roadrunner.delivery.accept.backToBackOrder.presentation.banner.BackToBackOrderOverlayBannerKt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class measurewNUYSr0default {
    public static final DragAndDropTargetModifierNode IconCompatParcelizer = new DragAndDropTargetModifierNode(new r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE() { // from class: o.getHoveredStyle
        private static int read = 0;
        private static int write = 1;

        @Override // o.r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE
        public final Object RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
            int i;
            int i2;
            int i3 = 2 % 2;
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
                i = (((getPostalCode) getbirthdatefull).read(str) ^ true ? 2 : 4) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                if (((getPostalCode) getbirthdatefull).read(str2)) {
                    int i4 = read + 41;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    i2 = 32;
                } else {
                    i2 = 16;
                }
                i |= i2;
            }
            if ((iIntValue2 & 384) == 0) {
                i |= ((getPostalCode) getbirthdatefull).read(iIntValue) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            if ((iIntValue2 & 3072) == 0) {
                i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
            }
            if ((iIntValue2 & 24576) == 0) {
                i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? androidx.compose.ui.graphics.Fields.Clip : 8192;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(i & 1, (74899 & i) != 74898)) {
                int i6 = read + 25;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                int i8 = i << 3;
                BackToBackOrderOverlayBannerKt.BackToBackOrderOverlayBanner(iIntValue, (57344 & i) | (i8 & 896) | ((i >> 6) & 14) | (i8 & 112) | (i & 7168), getpostalcode, null, str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createFromParcel.INSTANCE;
        }
    }, false, -1569694344);
    private static int serializer = 1;
    private static int write;

    static {
        int i = serializer + 71;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
