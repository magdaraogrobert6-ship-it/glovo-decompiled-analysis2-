package com.mapbox.api.directions.v5.utils;

import com.mapbox.geojson.Point;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FormatUtils {
    public static String join(String str, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i = 0; i <= list.size() - 1; i++) {
            if (z) {
                z = false;
            } else {
                sb.append((CharSequence) str);
            }
            Object obj = list.get(i);
            if (obj != null) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static String formatDouble(double d) {
        return new DecimalFormat("0.#######", new DecimalFormatSymbols(Locale.US)).format(d);
    }

    public static String formatPointsList(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Point point = (Point) it.next();
            if (point == null) {
                arrayList.add(null);
            } else {
                Locale locale = Locale.US;
                arrayList.add(formatDouble(point.longitude()) + "," + formatDouble(point.latitude()));
            }
        }
        return join(";", arrayList);
    }
}
