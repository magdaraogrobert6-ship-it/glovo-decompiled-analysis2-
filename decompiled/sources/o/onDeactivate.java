package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.oss_licenses.zzg;

/* JADX INFO: loaded from: classes2.dex */
public final class onDeactivate implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzg[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzg(parcel);
    }
}
