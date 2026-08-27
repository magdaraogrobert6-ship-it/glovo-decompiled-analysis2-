package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData;

/* JADX INFO: loaded from: classes3.dex */
public final class getLineBreakLgCVezoannotations implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 25;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        ChatViewData.Registration[] registrationArr = new ChatViewData.Registration[i];
        int i6 = i3 + 79;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return registrationArr;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        ChatViewData.Registration registration = new ChatViewData.Registration(parcel.readString(), parcel.readString());
        int i2 = RemoteActionCompatParcelizer + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return registration;
    }
}
