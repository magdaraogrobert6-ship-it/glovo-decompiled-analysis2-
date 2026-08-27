package o;

import android.location.Location;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdajyieMEPHfDZ0H9VbS9ICj8_yOE {
    public static ArrayList serializer(List list, r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0 r8lambdaaig5zvykrh73tepxo0st1uppjw0) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Location location = (Location) it.next();
            long time = location.getTime();
            if (time >= r8lambdaaig5zvykrh73tepxo0st1uppjw0.IconCompatParcelizer() && time < r8lambdaaig5zvykrh73tepxo0st1uppjw0.serializer()) {
                long jIconCompatParcelizer = (long) ((time - r8lambdaaig5zvykrh73tepxo0st1uppjw0.IconCompatParcelizer()) / 1000.0d);
                Location location2 = (Location) map.get(Long.valueOf(jIconCompatParcelizer));
                if (location2 == null) {
                    map.put(Long.valueOf(jIconCompatParcelizer), location);
                } else {
                    float accuracy = location2.getAccuracy();
                    float accuracy2 = location.getAccuracy();
                    if (accuracy2 >= 0.0f && (accuracy < 0.0f || accuracy2 < accuracy)) {
                        map.put(Long.valueOf(jIconCompatParcelizer), location);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(map.values());
        arrayList.sort(Comparator.comparingLong(new H3Core$$ExternalSyntheticLambda1(1)));
        return arrayList;
    }

    public static String write(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, arrayList);
    }

    public static void IconCompatParcelizer(long j, ArrayList arrayList) {
        boolean z = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((Location) arrayList.get(size)).getTime() < j) {
                if (z) {
                    arrayList.remove(size);
                } else {
                    z = true;
                }
            }
        }
    }
}
