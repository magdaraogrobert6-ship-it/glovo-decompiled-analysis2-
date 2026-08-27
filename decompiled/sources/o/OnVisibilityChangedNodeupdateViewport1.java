package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class OnVisibilityChangedNodeupdateViewport1 extends getCalculatorEK5gGoQ implements OuterRectRulers {
    public OnVisibilityChangedNodeupdateViewport1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    @Override // o.OuterRectRulers
    public final getButtonL2EK5gGoQ getService(accessgetTwocp accessgettwocp, setLastReportedResult setlastreportedresult, OnVisibilityChangedNode onVisibilityChangedNode) {
        getButtonL2EK5gGoQ getbuttonmodeek5ggoq;
        Parcel parcelSerializer = serializer();
        getDirectionCenterEK5gGoQ.write(parcelSerializer, accessgettwocp);
        getDirectionCenterEK5gGoQ.write(parcelSerializer, setlastreportedresult);
        getDirectionCenterEK5gGoQ.write(parcelSerializer, onVisibilityChangedNode);
        Parcel parcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1, parcelSerializer);
        IBinder strongBinder = parcelRemoteActionCompatParcelizer.readStrongBinder();
        int i = getChannelUpEK5gGoQ.serializer;
        if (strongBinder == null) {
            getbuttonmodeek5ggoq = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
            getbuttonmodeek5ggoq = iInterfaceQueryLocalInterface instanceof getButtonL2EK5gGoQ ? (getButtonL2EK5gGoQ) iInterfaceQueryLocalInterface : new getButtonModeEK5gGoQ(strongBinder);
        }
        parcelRemoteActionCompatParcelizer.recycle();
        return getbuttonmodeek5ggoq;
    }
}
