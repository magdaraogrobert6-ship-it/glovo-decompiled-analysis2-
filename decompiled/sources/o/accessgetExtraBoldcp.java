package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.Analytics;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetExtraBoldcp implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = serializer;
        int i4 = i3 + 49;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        Analytics.Parameter[] parameterArr = new Analytics.Parameter[i];
        int i6 = i3 + 29;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return parameterArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        Analytics.Parameter parameter = new Analytics.Parameter(parcel.readString(), parcel.readString());
        int i2 = serializer + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return parameter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
