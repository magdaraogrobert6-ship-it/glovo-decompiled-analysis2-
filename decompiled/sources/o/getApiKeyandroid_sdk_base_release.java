package o;

import com.sentiance.core.model.thrift.PayloadTypeBucketForExternalSubmissionControl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getApiKeyandroid_sdk_base_release {
    public static final Map RemoteActionCompatParcelizer;
    public static final List read;

    static {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte) 3);
        map.put(PayloadTypeBucketForExternalSubmissionControl.ALWAYS_SUBMIT, Collections.unmodifiableList(arrayList));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte) 2);
        arrayList2.add((byte) 24);
        arrayList2.add((byte) 25);
        map.put(PayloadTypeBucketForExternalSubmissionControl.SDK_INFO, Collections.unmodifiableList(arrayList2));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add((byte) 16);
        map.put(PayloadTypeBucketForExternalSubmissionControl.VEHICLE_CRASH_INFO, Collections.unmodifiableList(arrayList3));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add((byte) 1);
        arrayList4.add((byte) 4);
        arrayList4.add((byte) 5);
        arrayList4.add((byte) 6);
        arrayList4.add((byte) 7);
        arrayList4.add((byte) 8);
        arrayList4.add((byte) 9);
        arrayList4.add((byte) 10);
        arrayList4.add((byte) 11);
        arrayList4.add((byte) 12);
        arrayList4.add((byte) 13);
        arrayList4.add((byte) 14);
        arrayList4.add((byte) 15);
        arrayList4.add((byte) 17);
        arrayList4.add((byte) 18);
        arrayList4.add((byte) 19);
        arrayList4.add((byte) 20);
        arrayList4.add((byte) 21);
        arrayList4.add((byte) 22);
        arrayList4.add((byte) 23);
        map.put(PayloadTypeBucketForExternalSubmissionControl.GENERAL_DETECTIONS, Collections.unmodifiableList(arrayList4));
        RemoteActionCompatParcelizer = Collections.unmodifiableMap(map);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add((byte) 2);
        arrayList5.add((byte) 24);
        arrayList5.add((byte) 25);
        arrayList5.add((byte) 3);
        arrayList5.add((byte) 13);
        arrayList5.add((byte) 14);
        read = Collections.unmodifiableList(arrayList5);
    }
}
