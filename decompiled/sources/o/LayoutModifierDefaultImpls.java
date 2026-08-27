package o;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzp;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutModifierDefaultImpls extends BeyondBoundsLayoutLayoutDirectionCompanion {
    public final zzf[] read(ObjectWrapper objectWrapper, ObjectWrapper objectWrapper2, ObjectWrapper objectWrapper3, int i, int i2, int i3, int i4, int i5, int i6, zzp zzpVar) {
        Parcel parcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i7 = ContentScaleCompanionCrop1.read;
        parcelRemoteActionCompatParcelizer.writeStrongBinder(objectWrapper);
        parcelRemoteActionCompatParcelizer.writeStrongBinder(objectWrapper2);
        parcelRemoteActionCompatParcelizer.writeStrongBinder(objectWrapper3);
        parcelRemoteActionCompatParcelizer.writeInt(i);
        parcelRemoteActionCompatParcelizer.writeInt(i2);
        parcelRemoteActionCompatParcelizer.writeInt(i3);
        parcelRemoteActionCompatParcelizer.writeInt(i4);
        parcelRemoteActionCompatParcelizer.writeInt(i5);
        parcelRemoteActionCompatParcelizer.writeInt(i6);
        parcelRemoteActionCompatParcelizer.writeInt(1);
        zzpVar.writeToParcel(parcelRemoteActionCompatParcelizer, 0);
        Parcel parcel = read(4, parcelRemoteActionCompatParcelizer);
        zzf[] zzfVarArr = (zzf[]) parcel.createTypedArray(zzf.CREATOR);
        parcel.recycle();
        return zzfVarArr;
    }

    public LayoutModifierDefaultImpls(IBinder iBinder, String str) {
        super(iBinder, str);
    }
}
