package o;

import com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getClockui_toolingannotations implements findDesignInfoProviderslambda10 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final VendorReviewOptionUiModelImpl IconCompatParcelizer;

    public getClockui_toolingannotations(VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl) {
        this.IconCompatParcelizer = vendorReviewOptionUiModelImpl;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = read + 79;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 105;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof getClockui_toolingannotations) {
            if (this.IconCompatParcelizer == ((getClockui_toolingannotations) obj).IconCompatParcelizer) {
                return true;
            }
            int i3 = RemoteActionCompatParcelizer + 109;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i4 = read + 61;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VendorReviewItemUi(vendorReview=" + this.IconCompatParcelizer + ")";
        int i2 = read + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
