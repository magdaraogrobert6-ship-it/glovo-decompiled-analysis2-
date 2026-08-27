package com.google.android.gms.internal.mlkit_vision_common;

import com.mapbox.api.directions.v5.models.Notification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzlk {
    public static ArrayList filterNotificationsByGeometryRange(List list, int i, int i2) {
        Integer numGeometryIndex;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Notification notification = (Notification) it.next();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{notification.refreshType(), "dynamic"}, getCieXyz.write())).booleanValue() && ((numGeometryIndex = notification.geometryIndex()) == null || (numGeometryIndex.intValue() >= i && numGeometryIndex.intValue() <= i2))) {
                notification = null;
            }
            if (notification != null) {
                arrayList.add(notification);
            }
        }
        return arrayList;
    }

    public static ArrayList adjustNotificationIndices(int i, List list) {
        List<Notification> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (Notification notification : list2) {
            Notification.Builder builder = notification.toBuilder();
            Integer numGeometryIndex = notification.geometryIndex();
            if (numGeometryIndex != null) {
                builder.geometryIndex(Integer.valueOf(numGeometryIndex.intValue() + i));
            }
            Integer numGeometryIndexStart = notification.geometryIndexStart();
            if (numGeometryIndexStart != null) {
                builder.geometryIndexStart(Integer.valueOf(numGeometryIndexStart.intValue() + i));
            }
            Integer numGeometryIndexEnd = notification.geometryIndexEnd();
            if (numGeometryIndexEnd != null) {
                builder.geometryIndexEnd(Integer.valueOf(numGeometryIndexEnd.intValue() + i));
            }
            Notification notificationBuild = builder.build();
            notificationBuild.getClass();
            arrayList.add(notificationBuild);
        }
        return arrayList;
    }
}
