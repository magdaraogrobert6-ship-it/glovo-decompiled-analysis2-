package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new FragmentState.AnonymousClass1(3);
    public String RemoteActionCompatParcelizer;
    public int serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.serializer);
    }

    public FragmentManager$LaunchedFragmentInfo(String str, int i) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = i;
    }

    public FragmentManager$LaunchedFragmentInfo() {
    }
}
