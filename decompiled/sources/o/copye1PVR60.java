package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;

/* JADX INFO: loaded from: classes3.dex */
public final class copye1PVR60 implements Parcelable.Creator {
    private static int read = 1;
    private static int write;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = write + 57;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return new InAppCameraOverlay.TagItem[i];
        }
        InAppCameraOverlay.TagItem[] tagItemArr = new InAppCameraOverlay.TagItem[i];
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = read + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Integer numValueOf = null;
        if (i2 % 2 != 0) {
            parcel.getClass();
            parcel.readString();
            parcel.readInt();
            numValueOf.hashCode();
            throw null;
        }
        parcel.getClass();
        String string = parcel.readString();
        if (parcel.readInt() != 0) {
            numValueOf = Integer.valueOf(parcel.readInt());
            int i3 = write + 35;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        InAppCameraOverlay.TagItem tagItem = new InAppCameraOverlay.TagItem(string, numValueOf);
        int i5 = read + 75;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return tagItem;
    }
}
