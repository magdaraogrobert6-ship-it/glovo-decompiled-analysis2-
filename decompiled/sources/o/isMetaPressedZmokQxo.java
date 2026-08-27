package o;

import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class isMetaPressedZmokQxo {
    public int IconCompatParcelizer;
    public Object read;
    public int serializer;
    public long write;

    public isMetaPressedZmokQxo(OutlinedTextFieldLayout outlinedTextFieldLayout, long j, int i, int i2) {
        this.read = outlinedTextFieldLayout;
        this.write = j;
        this.serializer = i;
        this.IconCompatParcelizer = i2;
    }

    public static /* synthetic */ String read(String str, int i, byte b, String str2, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    public ModalBottomSheetKtScrimdismissSheet11 write(FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfo, boolean z, int i, int i2, int i3, int i4) {
        ModalBottomSheetKtScrimdismissSheet11 modalBottomSheetKtScrimdismissSheet11;
        androidx.compose.ui.layout.Measurable measurable;
        ScrollStateExternalSyntheticLambda3 scrollStateExternalSyntheticLambda3;
        androidx.compose.ui.layout.Placeable placeable;
        if (flowLayoutBuildingBlocks$WrapInfo.IconCompatParcelizer) {
            OutlinedTextFieldLayout outlinedTextFieldLayout = (OutlinedTextFieldLayout) this.read;
            int i5 = OutlinedTextFieldMeasurePolicy.read[outlinedTextFieldLayout.MediaMetadataCompat.ordinal()];
            boolean z2 = true;
            if (i5 == 1 || i5 == 2) {
                modalBottomSheetKtScrimdismissSheet11 = null;
            } else {
                if (i5 != 3 && i5 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                if (z) {
                    measurable = outlinedTextFieldLayout.RemoteActionCompatParcelizer;
                    scrollStateExternalSyntheticLambda3 = outlinedTextFieldLayout.RatingCompat;
                    placeable = outlinedTextFieldLayout.read;
                } else {
                    measurable = (i < -1 || i2 < 0) ? null : outlinedTextFieldLayout.serializer;
                    scrollStateExternalSyntheticLambda3 = outlinedTextFieldLayout.write;
                    placeable = outlinedTextFieldLayout.IconCompatParcelizer;
                }
                if (measurable == null) {
                    modalBottomSheetKtScrimdismissSheet11 = null;
                } else {
                    scrollStateExternalSyntheticLambda3.getClass();
                    modalBottomSheetKtScrimdismissSheet11 = new ModalBottomSheetKtScrimdismissSheet11(measurable, placeable, scrollStateExternalSyntheticLambda3.RemoteActionCompatParcelizer);
                }
            }
            if (modalBottomSheetKtScrimdismissSheet11 != null) {
                if (i < 0 || (i4 != 0 && (i3 - ((int) (modalBottomSheetKtScrimdismissSheet11.write >> 32)) < 0 || i4 >= Integer.MAX_VALUE))) {
                    z2 = false;
                }
                modalBottomSheetKtScrimdismissSheet11.read = z2;
                return modalBottomSheetKtScrimdismissSheet11;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if ((((((int) (r20 >> 32)) - ((int) (r9 >> 32))) - r4) - ((int) (r8.RemoteActionCompatParcelizer >> 32))) < 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo RemoteActionCompatParcelizer(boolean r18, int r19, long r20, o.ScrollStateExternalSyntheticLambda3 r22, int r23, int r24, int r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isMetaPressedZmokQxo.RemoteActionCompatParcelizer(boolean, int, long, o.ScrollStateExternalSyntheticLambda3, int, int, int, boolean, boolean):androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo");
    }

    public isMetaPressedZmokQxo() {
    }
}
