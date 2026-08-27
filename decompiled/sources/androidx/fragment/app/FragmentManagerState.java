package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new FragmentState.AnonymousClass1(4);
    public int IconCompatParcelizer;
    public ArrayList MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public ArrayList RatingCompat;
    public BackStackRecordState[] RemoteActionCompatParcelizer;
    public ArrayList read;
    public ArrayList serializer;
    public ArrayList write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.serializer);
        parcel.writeStringList(this.write);
        parcel.writeTypedArray(this.RemoteActionCompatParcelizer, i);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeStringList(this.read);
        parcel.writeTypedList(this.MediaDescriptionCompat);
        parcel.writeTypedList(this.RatingCompat);
    }

    public FragmentManagerState() {
        this.MediaMetadataCompat = null;
        this.read = new ArrayList();
        this.MediaDescriptionCompat = new ArrayList();
    }

    public FragmentManagerState(int i) {
    }
}
