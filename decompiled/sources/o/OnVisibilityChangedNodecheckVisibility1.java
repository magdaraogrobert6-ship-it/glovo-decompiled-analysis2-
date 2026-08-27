package o;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class OnVisibilityChangedNodecheckVisibility1 extends getCalculatorEK5gGoQ implements getLastReportedResult {
    public OnVisibilityChangedNodecheckVisibility1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerApi");
    }

    @Override // o.getLastReportedResult
    public final void initialize(accessgetTwocp accessgettwocp, setLastReportedResult setlastreportedresult, OnVisibilityChangedNode onVisibilityChangedNode) {
        Parcel parcelSerializer = serializer();
        getDirectionCenterEK5gGoQ.write(parcelSerializer, accessgettwocp);
        getDirectionCenterEK5gGoQ.write(parcelSerializer, setlastreportedresult);
        getDirectionCenterEK5gGoQ.write(parcelSerializer, onVisibilityChangedNode);
        IconCompatParcelizer(1, parcelSerializer);
    }

    @Override // o.getLastReportedResult
    public final void previewIntent(Intent intent, accessgetTwocp accessgettwocp, accessgetTwocp accessgettwocp2, setLastReportedResult setlastreportedresult, OnVisibilityChangedNode onVisibilityChangedNode) {
        Parcel parcelSerializer = serializer();
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcelSerializer, intent);
        getDirectionCenterEK5gGoQ.write(parcelSerializer, accessgettwocp);
        getDirectionCenterEK5gGoQ.write(parcelSerializer, accessgettwocp2);
        getDirectionCenterEK5gGoQ.write(parcelSerializer, setlastreportedresult);
        getDirectionCenterEK5gGoQ.write(parcelSerializer, onVisibilityChangedNode);
        IconCompatParcelizer(3, parcelSerializer);
    }
}
