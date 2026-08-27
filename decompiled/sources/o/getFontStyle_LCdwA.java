package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;

/* JADX INFO: loaded from: classes3.dex */
public final class getFontStyle_LCdwA implements Parcelable.Creator {
    private static int read = 0;
    private static int serializer = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = serializer;
        int i4 = i3 + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        InAppCameraOverlay.None[] noneArr = new InAppCameraOverlay.None[i];
        int i6 = i3 + 21;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return noneArr;
        }
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = read + 57;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            parcel.getClass();
            parcel.readInt();
            return InAppCameraOverlay.None.read;
        }
        parcel.getClass();
        parcel.readInt();
        InAppCameraOverlay.None none = InAppCameraOverlay.None.read;
        throw null;
    }
}
