package androidx.activity;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.maps.QueriedFeature;
import com.mapbox.maps.QueriedRenderedFeature;
import java.util.Iterator;
import java.util.List;
import o.HitPathTrackeraddHitPath1;
import o.addContentView;
import o.createFromParcel;
import o.dispatchChanges;
import o.getCieXyz;
import o.getViewportSizeYbymL2g;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SystemBarStyle$Companion {
    public static HitPathTrackeraddHitPath1 read;

    public static void write() {
        synchronized (SystemBarStyle$Companion.class) {
            dispatchChanges dispatchchanges = new dispatchChanges();
            synchronized (SystemBarStyle$Companion.class) {
                if (read == null) {
                    read = new HitPathTrackeraddHitPath1(0);
                }
            }
        }
    }

    public static Expected getIndexOfFirstFeature(List list, List list2) {
        Feature feature;
        QueriedFeature queriedFeature;
        Feature feature2;
        list2.getClass();
        QueriedRenderedFeature queriedRenderedFeature = (QueriedRenderedFeature) onContentCardDismissed.MediaMetadataCompat(list);
        String strId = (queriedRenderedFeature == null || (queriedFeature = queriedRenderedFeature.getQueriedFeature()) == null || (feature2 = queriedFeature.getFeature()) == null) ? null : feature2.id();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (strId == null) {
            Expected expectedCreateError = ExpectedFactory.createError(createfromparcel);
            expectedCreateError.getClass();
            return expectedCreateError;
        }
        Iterator it = list2.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            List<Feature> listFeatures = ((FeatureCollection) it.next()).features();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(listFeatures == null || (feature = (Feature) onContentCardDismissed.MediaMetadataCompat((List) listFeatures)) == null) ? null : feature.id(), strId}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            Expected expectedCreateValue = ExpectedFactory.createValue(Integer.valueOf(i));
            expectedCreateValue.getClass();
            return expectedCreateValue;
        }
        Expected expectedCreateError2 = ExpectedFactory.createError(createfromparcel);
        expectedCreateError2.getClass();
        return expectedCreateError2;
    }

    public static addContentView read() {
        return new addContentView(0, 0, 1, new getViewportSizeYbymL2g(2));
    }
}
