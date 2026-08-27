package o;

import com.sentiance.core.model.tile.venue.GeomV3;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda3YrtAT1KG4P0WwuSh0oKlbt6ks {
    public static void IconCompatParcelizer(InputStream inputStream, DustDataStoreProviderCompanion dustDataStoreProviderCompanion, String str, long j) throws IOException {
        boolean z = false;
        if (!((Boolean) dustDataStoreProviderCompanion.serializer(Boolean.FALSE, new getNotificationResponsivenessMs(dustDataStoreProviderCompanion, str, j, 2))).booleanValue()) {
            dustDataStoreProviderCompanion.IconCompatParcelizer(str, false);
            return;
        }
        boolean z2 = true;
        do {
            try {
                GeomV3 delimitedFrom = GeomV3.parseDelimitedFrom(inputStream);
                if (delimitedFrom == null) {
                    break;
                }
                GeomV3.Polygon polygon = delimitedFrom.getPolygon();
                z2 = dustDataStoreProviderCompanion.read(delimitedFrom.getId(), ((double) delimitedFrom.getCenter().getLat()) / 1000000.0d, ((double) delimitedFrom.getCenter().getLon()) / 1000000.0d, polygon.getVerticesCount() == 0 ? null : serializer(polygon.getVerticesList()), delimitedFrom.getTagsMap());
            } catch (IllegalStateException unused) {
            }
        } while (z2);
        z = z2;
        dustDataStoreProviderCompanion.IconCompatParcelizer(str, z);
    }

    private static com.sentiance.sdk.tile.store.c serializer(List list) {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, list.size(), 2);
        for (int i = 0; i < list.size(); i++) {
            GeomV3.Coord coord = (GeomV3.Coord) list.get(i);
            dArr[i][0] = ((double) coord.getLat()) / 1000000.0d;
            dArr[i][1] = ((double) coord.getLon()) / 1000000.0d;
        }
        return new com.sentiance.sdk.tile.store.c(dArr);
    }
}
