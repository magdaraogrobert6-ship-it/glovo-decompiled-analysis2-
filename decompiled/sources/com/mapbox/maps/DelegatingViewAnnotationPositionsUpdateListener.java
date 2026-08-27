package com.mapbox.maps;

import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.List;
import o.accessgetInstancedelegatecp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DelegatingViewAnnotationPositionsUpdateListener implements ViewAnnotationPositionsUpdateListener {
    public abstract void onDelegatingViewAnnotationPositionsUpdate(List<DelegatingViewAnnotationPositionDescriptor> list);

    @Override // com.mapbox.maps.ViewAnnotationPositionsUpdateListener
    public final void onViewAnnotationPositionsUpdate(List<ViewAnnotationPositionDescriptor> list) {
        list.getClass();
        List<ViewAnnotationPositionDescriptor> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (ViewAnnotationPositionDescriptor viewAnnotationPositionDescriptor : list2) {
            String identifier = viewAnnotationPositionDescriptor.getIdentifier();
            identifier.getClass();
            double width = viewAnnotationPositionDescriptor.getWidth();
            double height = viewAnnotationPositionDescriptor.getHeight();
            ScreenCoordinate leftTopCoordinate = viewAnnotationPositionDescriptor.getLeftTopCoordinate();
            leftTopCoordinate.getClass();
            Point anchorCoordinate = viewAnnotationPositionDescriptor.getAnchorCoordinate();
            anchorCoordinate.getClass();
            ViewAnnotationAnchorConfig anchorConfig = viewAnnotationPositionDescriptor.getAnchorConfig();
            anchorConfig.getClass();
            arrayList.add(new DelegatingViewAnnotationPositionDescriptor(identifier, width, height, leftTopCoordinate, anchorCoordinate, anchorConfig));
        }
        onDelegatingViewAnnotationPositionsUpdate(arrayList);
    }
}
