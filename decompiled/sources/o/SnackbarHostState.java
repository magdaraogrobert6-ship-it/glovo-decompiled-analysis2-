package o;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SnackbarHostState implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ SnackbarHostState(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        if (i == 0) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo.setName(MapboxMap.QFE_OFFSET);
            inspectorInfo.getProperties().set(MapboxMap.QFE_OFFSET, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            return createFromParcel.INSTANCE;
        }
        getBrush getbrush = (getBrush) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke((getFontScale) obj);
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            getOffsetF1C5BW0.MediaBrowserCompatMediaItem = getOffsetF1C5BW0.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        }
        return getbrush;
    }
}
