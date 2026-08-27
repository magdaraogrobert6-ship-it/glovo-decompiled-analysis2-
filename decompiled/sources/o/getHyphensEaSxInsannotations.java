package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData;

/* JADX INFO: loaded from: classes3.dex */
public final class getHyphensEaSxInsannotations implements Parcelable.Creator {
    private static int read = 1;
    private static int write;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = read + 17;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return new ChatViewData.Delivery[i];
        }
        int i4 = 2 / 0;
        return new ChatViewData.Delivery[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        ChatViewData.Delivery delivery = new ChatViewData.Delivery(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        int i2 = write + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
        return delivery;
    }
}
