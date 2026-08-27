package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState;

/* JADX INFO: loaded from: classes3.dex */
public final class component4GVVA2EU implements Parcelable.Creator {
    private static int IconCompatParcelizer = 1;
    private static int read;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 111;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        InAppCameraOverlay.Structured[] structuredArr = new InAppCameraOverlay.Structured[i];
        int i6 = i3 + 69;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 34 / 0;
        }
        return structuredArr;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        InAppCameraOverlay.Structured structured = new InAppCameraOverlay.Structured(InAppCameraOverlayState.CREATOR.createFromParcel(parcel));
        int i2 = read + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return structured;
    }
}
