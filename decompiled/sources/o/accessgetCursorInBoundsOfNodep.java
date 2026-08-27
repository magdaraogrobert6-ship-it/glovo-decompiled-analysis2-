package o;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetCursorInBoundsOfNodep extends HoverIconModifierNode {
    public final zzu[] write(ObjectWrapper objectWrapper, zzan zzanVar) {
        Parcel parcel = read();
        int i = isRelevantPointerTypeuerMTgs.IconCompatParcelizer;
        parcel.writeStrongBinder(objectWrapper);
        parcel.writeInt(1);
        zzanVar.writeToParcel(parcel, 0);
        Parcel parcelSerializer = serializer(1, parcel);
        zzu[] zzuVarArr = (zzu[]) parcelSerializer.createTypedArray(zzu.CREATOR);
        parcelSerializer.recycle();
        return zzuVarArr;
    }

    public accessgetCursorInBoundsOfNodep(IBinder iBinder, String str) {
        super(iBinder, str);
    }
}
