package o;

import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import kotlin.TuplesKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getEverythingButParentId implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ getTombStone serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getEverythingButParentId(getTombStone gettombstone, int i) {
        this.write = i;
        this.serializer = gettombstone;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = 1;
        int i3 = RemoteActionCompatParcelizer + 1;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        getTombStone gettombstone = this.serializer;
        if (i5 == 0) {
            MutableStateFlow mutableStateFlow = StateFlowKt.read((metaMarkUpdatedAndHasCallbacks) ((TraceTimeMeasurementWithPerformanceKit) gettombstone.RemoteActionCompatParcelizer).read("asti_load_country_config_from_db", new getEverythingButParentId(gettombstone, i2)));
            int i6 = RemoteActionCompatParcelizer + 47;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return mutableStateFlow;
        }
        unpackMetaFocusable unpackmetafocusable = (unpackMetaFocusable) TuplesKt.write(((metaWithLastChildOffset) ((metaWithParentId) gettombstone.IconCompatParcelizer.IconCompatParcelizer.write())).serializer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new MapApiError$$ExternalSyntheticLambda1(3));
        if (unpackmetafocusable == null) {
            return null;
        }
        String str = unpackmetafocusable.serializer;
        String str2 = unpackmetafocusable.write;
        String str3 = unpackmetafocusable.RemoteActionCompatParcelizer;
        String str4 = unpackmetafocusable.read;
        String str5 = unpackmetafocusable.IconCompatParcelizer;
        String str6 = unpackmetafocusable.RatingCompat;
        return new metaMarkUpdatedAndHasCallbacks(unpackmetafocusable.MediaDescriptionCompat, str, str2, str4, str3, unpackmetafocusable.MediaBrowserCompatMediaItem, str5, str6, unpackmetafocusable.MediaMetadataCompat);
    }
}
