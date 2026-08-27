package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenItemUi;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetFakeSavedStateRegistryOwnerp {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final Integer IconCompatParcelizer;
    public final String serializer;
    public final FullscreenItemUi write;

    public accessgetFakeSavedStateRegistryOwnerp(Integer num, String str, FullscreenItemUi fullscreenItemUi) {
        str.getClass();
        this.IconCompatParcelizer = num;
        this.serializer = str;
        this.write = fullscreenItemUi;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023 A[PHI: r1
  0x0023: PHI (r1v11 java.lang.Integer) = (r1v4 java.lang.Integer), (r1v12 java.lang.Integer) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final int hashCode() {
        Integer num;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int iHashCode = 0;
        if (i2 % 2 == 0) {
            num = this.IconCompatParcelizer;
            int i4 = 47 / 0;
            if (num == null) {
                int i5 = i3 + 119;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                iHashCode = num.hashCode();
            }
        } else {
            num = this.IconCompatParcelizer;
            if (num == null) {
                int i7 = i3 + 119;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                iHashCode = num.hashCode();
            }
        }
        int iHashCode2 = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.serializer);
        int i9 = read + 3;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ExpandableButtonItemUi(icon=" + this.IconCompatParcelizer + ", title=" + this.serializer + ", fullscreenItem=" + this.write + ")";
        int i2 = RemoteActionCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 51;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 109;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 / 2;
            }
        } else {
            if (!(obj instanceof accessgetFakeSavedStateRegistryOwnerp)) {
                return false;
            }
            accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp = (accessgetFakeSavedStateRegistryOwnerp) obj;
            Object[] objArr = {this.IconCompatParcelizer, accessgetfakesavedstateregistryownerp.IconCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.serializer, accessgetfakesavedstateregistryownerp.serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                if (!this.write.equals(accessgetfakesavedstateregistryownerp.write)) {
                    return false;
                }
            } else {
                int i7 = read + 51;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
        }
        int i9 = RemoteActionCompatParcelizer + 55;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
