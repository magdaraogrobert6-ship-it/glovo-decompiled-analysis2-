package o;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class setEnforceSwitchWidth {
    public static final HashMap read;
    public static final HashMap serializer;

    static {
        getNavigationIcon getnavigationicon;
        HashMap map = new HashMap();
        read = map;
        HashMap map2 = new HashMap();
        serializer = map2;
        getNavigationIcon getnavigationicon2 = getNavigationIcon.MediaDescriptionCompat;
        map.put(1L, getnavigationicon2);
        map2.put(getnavigationicon2, Collections.singletonList(1L));
        map.put(2L, getNavigationIcon.read);
        map2.put((getNavigationIcon) map.get(2L), Collections.singletonList(2L));
        getNavigationIcon getnavigationicon3 = getNavigationIcon.serializer;
        map.put(4L, getnavigationicon3);
        map2.put(getnavigationicon3, Collections.singletonList(4L));
        getNavigationIcon getnavigationicon4 = getNavigationIcon.write;
        map.put(8L, getnavigationicon4);
        map2.put(getnavigationicon4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            getnavigationicon = getNavigationIcon.IconCompatParcelizer;
            if (!zHasNext) {
                break;
            }
            read.put((Long) it.next(), getnavigationicon);
        }
        serializer.put(getnavigationicon, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            getNavigationIcon getnavigationicon5 = getNavigationIcon.RemoteActionCompatParcelizer;
            if (!zHasNext2) {
                serializer.put(getnavigationicon5, listAsList2);
                return;
            } else {
                read.put((Long) it2.next(), getnavigationicon5);
            }
        }
    }

    public static Long am_(getNavigationIcon getnavigationicon, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) serializer.get(getnavigationicon);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
