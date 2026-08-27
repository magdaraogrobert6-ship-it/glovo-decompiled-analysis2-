package com.roadrunner.map.measurement.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.util.UtilsKt;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.getQueryParameterslambda2;
import o.o7ExternalSyntheticLambda3;

/* JADX INFO: loaded from: classes3.dex */
public final class IsRiderInsideAreaUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public final boolean invoke(o7ExternalSyntheticLambda3 o7externalsyntheticlambda3, List list) {
        int i = 2 % 2;
        list.getClass();
        Point pointFromLngLat = Point.fromLngLat(o7externalsyntheticlambda3.write, o7externalsyntheticlambda3.read);
        pointFromLngLat.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        int i2 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = RemoteActionCompatParcelizer + 7;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                o7ExternalSyntheticLambda3 o7externalsyntheticlambda4 = (o7ExternalSyntheticLambda3) it.next();
                arrayList.add(Point.fromLngLat(o7externalsyntheticlambda4.write, o7externalsyntheticlambda4.read));
                int i5 = 27 / 0;
            } else {
                o7ExternalSyntheticLambda3 o7externalsyntheticlambda5 = (o7ExternalSyntheticLambda3) it.next();
                arrayList.add(Point.fromLngLat(o7externalsyntheticlambda5.write, o7externalsyntheticlambda5.read));
            }
        }
        int iSerializer = getQueryParameterslambda2.serializer();
        Polygon polygonFromLngLats = Polygon.fromLngLats((List<List<Point>>) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{arrayList}, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
        polygonFromLngLats.getClass();
        List<List<Point>> listCoordinates = polygonFromLngLats.coordinates();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(listCoordinates);
        List<List<List<Point>>> listCoordinates2 = MultiPolygon.fromLngLats(arrayList2).coordinates();
        boolean z = false;
        for (int i6 = 0; i6 < listCoordinates2.size() && !z; i6++) {
            if (UtilsKt.inRing(pointFromLngLat, listCoordinates2.get(i6).get(0))) {
                boolean z2 = false;
                for (int i7 = 1; i7 < listCoordinates2.get(i6).size(); i7++) {
                    int i8 = IconCompatParcelizer + 21;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    if (z2) {
                        break;
                    }
                    if (UtilsKt.inRing(pointFromLngLat, listCoordinates2.get(i6).get(i7))) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    z = true;
                }
            }
        }
        return z;
    }
}
