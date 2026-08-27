package o;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OneRowSnackbarkKq0p4A implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ float write;

    public /* synthetic */ OneRowSnackbarkKq0p4A(float f, float f2) {
        this.write = f;
        this.RemoteActionCompatParcelizer = f2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
        inspectorInfo.setName(MapboxMap.QFE_OFFSET);
        MediaSessionCompatQueueItem.serializer(this.write, inspectorInfo.getProperties(), "x", inspectorInfo).set("y", androidx.compose.ui.unit.Dp.m3671boximpl(this.RemoteActionCompatParcelizer));
        return createFromParcel.INSTANCE;
    }
}
