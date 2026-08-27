package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;

/* JADX INFO: loaded from: classes2.dex */
public final class findDescendantNodeWithCursorInBounds extends HoverIconModifierNode implements displayIconIfDescendantsDoNotHavePriority {
    public final accessgetCursorInBoundsOfNodep read(ObjectWrapper objectWrapper, zzah zzahVar) {
        accessgetCursorInBoundsOfNodep accessgetcursorinboundsofnodep;
        Parcel parcel = read();
        int i = isRelevantPointerTypeuerMTgs.IconCompatParcelizer;
        parcel.writeStrongBinder(objectWrapper);
        parcel.writeInt(1);
        zzahVar.writeToParcel(parcel, 0);
        Parcel parcelSerializer = serializer(1, parcel);
        IBinder strongBinder = parcelSerializer.readStrongBinder();
        if (strongBinder == null) {
            accessgetcursorinboundsofnodep = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            accessgetcursorinboundsofnodep = iInterfaceQueryLocalInterface instanceof accessgetCursorInBoundsOfNodep ? (accessgetCursorInBoundsOfNodep) iInterfaceQueryLocalInterface : new accessgetCursorInBoundsOfNodep(strongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
        }
        parcelSerializer.recycle();
        return accessgetcursorinboundsofnodep;
    }

    public findDescendantNodeWithCursorInBounds(IBinder iBinder, String str) {
        super(iBinder, str);
    }
}
