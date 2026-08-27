package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextDirectionmmuk1toannotations implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = write + 103;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return new ChatViewData[i];
        }
        int i4 = 49 / 0;
        return new ChatViewData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        ChatViewData chatViewData = new ChatViewData(parcel.readString(), ChatViewData.Delivery.CREATOR.createFromParcel(parcel), ChatViewData.Registration.CREATOR.createFromParcel(parcel));
        int i2 = RemoteActionCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
        return chatViewData;
    }
}
