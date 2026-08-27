package o;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class setOnAttributionChangedListener implements FlowCollector {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ setOnEventTrackingSucceededListener write;

    public /* synthetic */ setOnAttributionChangedListener(setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener, int i) {
        this.read = i;
        this.write = setoneventtrackingsucceededlistener;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener = this.write;
        if (i4 != 0) {
            setoneventtrackingsucceededlistener.read.IconCompatParcelizer((GooglePlayServicesClient) obj);
            return createfromparcel;
        }
        setoneventtrackingsucceededlistener.serializer.IconCompatParcelizer((AdjustDeeplink) obj);
        int i5 = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
