package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.ondevice.api.Attribute;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaOjxGQ2KAKi6yqipEZlqYQGp4WgU implements Parcelable.Creator<Attribute> {
    @Override // android.os.Parcelable.Creator
    public final Attribute[] newArray(int i) {
        return new Attribute[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Attribute createFromParcel(Parcel parcel) {
        return new Attribute(parcel);
    }
}
