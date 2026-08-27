package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_face.zzh;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutModifierImpl extends BeyondBoundsLayoutLayoutDirectionCompanion implements createMeasureResult {
    public final LayoutModifierDefaultImpls RemoteActionCompatParcelizer(ObjectWrapper objectWrapper, zzh zzhVar) {
        LayoutModifierDefaultImpls layoutModifierDefaultImpls;
        Parcel parcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i = ContentScaleCompanionCrop1.read;
        parcelRemoteActionCompatParcelizer.writeStrongBinder(objectWrapper);
        parcelRemoteActionCompatParcelizer.writeInt(1);
        zzhVar.writeToParcel(parcelRemoteActionCompatParcelizer, 0);
        Parcel parcel = read(1, parcelRemoteActionCompatParcelizer);
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            layoutModifierDefaultImpls = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            layoutModifierDefaultImpls = iInterfaceQueryLocalInterface instanceof LayoutModifierDefaultImpls ? (LayoutModifierDefaultImpls) iInterfaceQueryLocalInterface : new LayoutModifierDefaultImpls(strongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
        }
        parcel.recycle();
        return layoutModifierDefaultImpls;
    }

    public LayoutModifierImpl(IBinder iBinder, String str) {
        super(iBinder, str);
    }
}
