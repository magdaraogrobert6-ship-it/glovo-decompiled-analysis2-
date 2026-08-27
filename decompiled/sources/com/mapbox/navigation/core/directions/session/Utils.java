package com.mapbox.navigation.core.directions.session;

import androidx.sqlite.SQLite;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.trip.session.NativeSetRouteValue;
import com.mapbox.navigator.RouteAlternative;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.getCutText;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Utils {
    public static DirectionsSessionRoutes createDirectionsSessionRoutes(List list, NativeSetRouteValue nativeSetRouteValue, getCutText getcuttext) {
        Collection collection;
        list.getClass();
        getcuttext.getClass();
        List listSerializer = onContentCardDismissed.serializer(list, 1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listSerializer) {
            NavigationRoute navigationRoute = (NavigationRoute) obj;
            List list2 = nativeSetRouteValue.nativeAlternatives;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object[] objArr = {((RouteAlternative) it.next()).getRoute().getRouteId(), navigationRoute.id};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            arrayList2.add(obj);
        }
        Object objMediaMetadataCompat = onContentCardDismissed.MediaMetadataCompat(nativeSetRouteValue.routes);
        if (objMediaMetadataCompat != null) {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            collection = (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{objMediaMetadataCompat}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        } else {
            collection = instance_delegatelambda0.write;
        }
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList, collection);
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new IgnoredRoute((NavigationRoute) it2.next(), "Route is invalid for navigation"));
        }
        return new DirectionsSessionRoutes(arrayListIconCompatParcelizer, arrayList3, getcuttext);
    }
}
