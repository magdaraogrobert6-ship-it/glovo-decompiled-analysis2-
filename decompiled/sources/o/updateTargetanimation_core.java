package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class updateTargetanimation_core {
    public static final HashMap IconCompatParcelizer;
    public static final HashMap RemoteActionCompatParcelizer;
    public static final HashMap read;
    public static final HashMap serializer;
    public static final HashMap write;

    static {
        HashMap map = new HashMap();
        RemoteActionCompatParcelizer = map;
        HashMap map2 = new HashMap();
        IconCompatParcelizer = map2;
        HashMap map3 = new HashMap();
        read = map3;
        HashMap map4 = new HashMap();
        serializer = map4;
        HashMap map5 = new HashMap();
        write = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        getNavigationIcon getnavigationicon = getNavigationIcon.MediaDescriptionCompat;
        map6.put(getnavigationicon, 1);
        getNavigationIcon getnavigationicon2 = getNavigationIcon.read;
        map6.put(getnavigationicon2, 2);
        Integer numValueOf = Integer.valueOf(androidx.compose.ui.graphics.Fields.TransformOrigin);
        getNavigationIcon getnavigationicon3 = getNavigationIcon.serializer;
        map6.put(getnavigationicon3, numValueOf);
        getNavigationIcon getnavigationicon4 = getNavigationIcon.write;
        map6.put(getnavigationicon4, 8192);
        HashMap map7 = new HashMap();
        map7.put(getnavigationicon, 1);
        map7.put(getnavigationicon2, 2);
        map7.put(getnavigationicon3, numValueOf);
        map7.put(getnavigationicon4, 8192);
        HashMap map8 = new HashMap();
        map8.put(getnavigationicon, 1);
        map8.put(getnavigationicon2, 4);
        map8.put(getnavigationicon3, numValueOf);
        map8.put(getnavigationicon4, Integer.valueOf(androidx.compose.ui.graphics.Fields.Clip));
        HashMap map9 = new HashMap();
        map9.put(getNavigationIcon.IconCompatParcelizer, Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationX));
        map9.put(getNavigationIcon.RemoteActionCompatParcelizer, Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationY));
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static boolean read(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, getNavigationIcon getnavigationicon) {
        int i = previewDelayWhenVideoCaptureIsBoundQuirk.serializer;
        Set set = (Set) RemoteActionCompatParcelizer.get(Integer.valueOf(getnavigationicon.MediaBrowserCompatMediaItem));
        if (set == null || !set.contains(Integer.valueOf(i))) {
            return false;
        }
        int i2 = previewDelayWhenVideoCaptureIsBoundQuirk.RatingCompat;
        Set set2 = (Set) IconCompatParcelizer.get(Integer.valueOf(getnavigationicon.MediaSessionCompatQueueItem));
        return set2 != null && set2.contains(Integer.valueOf(i2));
    }
}
