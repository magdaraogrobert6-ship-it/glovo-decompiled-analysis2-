package o;

import android.os.Build;
import com.huawei.hms.support.api.location.common.LocationConstant;

/* JADX INFO: loaded from: classes3.dex */
public final class disableCoppaComplianceInDelay {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final stopInstancelambda11 RemoteActionCompatParcelizer;
    public final disablePlayStoreKidsComplianceInDelay serializer;

    public disableCoppaComplianceInDelay(stopInstancelambda11 stopinstancelambda11, disablePlayStoreKidsComplianceInDelay disableplaystorekidscomplianceindelay) {
        stopinstancelambda11.getClass();
        disableplaystorekidscomplianceindelay.getClass();
        this.RemoteActionCompatParcelizer = stopinstancelambda11;
        this.serializer = disableplaystorekidscomplianceindelay;
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer.getClass();
            if (Build.VERSION.SDK_INT < 11) {
                return false;
            }
        } else {
            this.RemoteActionCompatParcelizer.getClass();
            if (Build.VERSION.SDK_INT < 29) {
                return false;
            }
        }
        int i3 = IconCompatParcelizer + 43;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (FocusListener.write(this.serializer.read, LocationConstant.BACKGROUND_PERMISSION) == 0) {
            return false;
        }
        int i5 = IconCompatParcelizer + 85;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
