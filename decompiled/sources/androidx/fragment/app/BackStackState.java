package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new FragmentState.AnonymousClass1(2);
    public final ArrayList serializer;
    public final ArrayList write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.serializer);
        parcel.writeTypedList(this.write);
    }

    public BackStackState(Parcel parcel) {
        this.serializer = parcel.createStringArrayList();
        this.write = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.serializer = arrayList;
        this.write = arrayList2;
    }
}
