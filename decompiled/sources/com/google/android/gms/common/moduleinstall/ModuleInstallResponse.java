package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zzq(1);
    public final int RemoteActionCompatParcelizer;
    public final boolean write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.write ? 1 : 0);
        SQLite.serializer(i2, parcel);
    }

    public ModuleInstallResponse(int i, boolean z) {
        this.RemoteActionCompatParcelizer = i;
        this.write = z;
    }
}
