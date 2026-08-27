package o;

import com.sentiance.core.model.thrift.PayloadTypeBucketForExternalSubmissionControl;
import com.sentiance.sdk.TransmittableDataType;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class BrazeNotificationUtilsExternalSyntheticLambda1 {
    private final ConfigurationManager read;

    public final HashSet write(Set set) {
        List list;
        ArrayList arrayList = new ArrayList();
        List list2 = (List) getApiKeyandroid_sdk_base_release.RemoteActionCompatParcelizer.get(PayloadTypeBucketForExternalSubmissionControl.ALWAYS_SUBMIT);
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int i = BrazeNotificationUtilsExternalSyntheticLambda2.write[((TransmittableDataType) it.next()).ordinal()];
            if (i == 1) {
                List list3 = (List) getApiKeyandroid_sdk_base_release.RemoteActionCompatParcelizer.get(PayloadTypeBucketForExternalSubmissionControl.SDK_INFO);
                if (list3 != null) {
                    arrayList.addAll(list3);
                }
            } else if (i == 2) {
                List list4 = (List) getApiKeyandroid_sdk_base_release.RemoteActionCompatParcelizer.get(PayloadTypeBucketForExternalSubmissionControl.VEHICLE_CRASH_INFO);
                if (list4 != null) {
                    arrayList.addAll(list4);
                }
            } else if (i == 3 && (list = (List) getApiKeyandroid_sdk_base_release.RemoteActionCompatParcelizer.get(PayloadTypeBucketForExternalSubmissionControl.GENERAL_DETECTIONS)) != null) {
                arrayList.addAll(list);
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte bByteValue = ((Byte) it2.next()).byteValue();
            this.read.getClass();
            String strIconCompatParcelizer = ConfigurationManager.IconCompatParcelizer(bByteValue);
            if (strIconCompatParcelizer != null) {
                hashSet.add(strIconCompatParcelizer);
            }
        }
        return hashSet;
    }

    public BrazeNotificationUtilsExternalSyntheticLambda1(ConfigurationManager configurationManager) {
        this.read = configurationManager;
    }
}
