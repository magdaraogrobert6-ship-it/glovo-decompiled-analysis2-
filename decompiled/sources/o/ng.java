package o;

import com.mapbox.search.SearchEngineImpl;
import com.roadrunner.map.integration.search.InitialiseMapboxSearch;
import com.roadrunner.map.integration.search.MapboxReverseGeocoder$invoke$2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class ng implements ne {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final SearchEngineImpl read;
    public final InitialiseMapboxSearch write;

    public ng(InitialiseMapboxSearch initialiseMapboxSearch, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime, SearchEngineImpl searchEngineImpl) {
        this.write = initialiseMapboxSearch;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.read = searchEngineImpl;
    }

    @Override // o.ne
    public final Object invoke(double d, double d2, r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI r8lambdaaazn5el4wkw0o5j25k1e0csgpoi, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new MapboxReverseGeocoder$invoke$2(this, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, d2, d, r8lambdaaazn5el4wkw0o5j25k1e0csgpoi, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null), 2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = serializer + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return createfromparcel;
    }
}
