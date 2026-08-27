package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class getFontSynthesisGVVA2EU implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = write + 107;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return new InAppCameraOverlay.Tags[i];
        }
        InAppCameraOverlay.Tags[] tagsArr = new InAppCameraOverlay.Tags[i];
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = write + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        parcel.getClass();
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            int i4 = RemoteActionCompatParcelizer + 29;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(parcel.readInt());
            int i6 = write + 97;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        String string = parcel.readString();
        int i8 = 0;
        if (parcel.readInt() == 0) {
            int i9 = write + 43;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 11 / 0;
            }
        } else {
            int i11 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i11);
            while (i8 != i11) {
                arrayList2.add(InAppCameraOverlay.TagItem.CREATOR.createFromParcel(parcel));
                i8++;
                int i12 = RemoteActionCompatParcelizer + 119;
                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    int i13 = 3 % 5;
                }
            }
            arrayList = arrayList2;
        }
        return new InAppCameraOverlay.Tags(numValueOf, string, arrayList);
    }
}
