package com.sentiance.sdk.events.eventextras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TimelineUpdateDetails {
    private final Map<UpdatedDataType, List<String>> IconCompatParcelizer;

    public enum UpdatedDataType {
        VENUE,
        TRANSPORT_STATE,
        SEGMENT,
        TRANSPORT_SAFETY_SCORE
    }

    public static TimelineUpdateDetails RemoteActionCompatParcelizer(UpdatedDataType updatedDataType, List<String> list) {
        TimelineUpdateDetails timelineUpdateDetails = new TimelineUpdateDetails();
        Map<UpdatedDataType, List<String>> map = timelineUpdateDetails.IconCompatParcelizer;
        List<String> list2 = map.get(updatedDataType);
        if (list2 == null) {
            map.put(updatedDataType, list);
            return timelineUpdateDetails;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list2);
        arrayList.addAll(list);
        map.put(updatedDataType, arrayList);
        return timelineUpdateDetails;
    }

    public final void RemoteActionCompatParcelizer(TimelineUpdateDetails timelineUpdateDetails) {
        Map<UpdatedDataType, List<String>> map = timelineUpdateDetails.IconCompatParcelizer;
        for (UpdatedDataType updatedDataType : map.keySet()) {
            List<String> arrayList = map.get(updatedDataType);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            Map<UpdatedDataType, List<String>> map2 = this.IconCompatParcelizer;
            if (map2.containsKey(updatedDataType)) {
                List<String> arrayList2 = map2.get(updatedDataType);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                HashSet hashSet = new HashSet(arrayList2);
                hashSet.addAll(arrayList);
                map2.put(updatedDataType, new ArrayList(hashSet));
            } else {
                map2.put(updatedDataType, arrayList);
            }
        }
    }

    public TimelineUpdateDetails() {
        this.IconCompatParcelizer = new HashMap();
    }

    public TimelineUpdateDetails(Map<UpdatedDataType, List<String>> map) {
        this.IconCompatParcelizer = map;
    }

    public final Map<UpdatedDataType, List<String>> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
