package o;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdatq6ACLpcPQ5kM_9Qo1nOx0ZDGDM {
    public static boolean serializer(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static StillCaptureFlashStopRepeatingQuirk serializer(StillCaptureFlashStopRepeatingQuirk... stillCaptureFlashStopRepeatingQuirkArr) {
        List listAsList = Arrays.asList(stillCaptureFlashStopRepeatingQuirkArr);
        if (listAsList.isEmpty()) {
            return new TextureViewIsClosedQuirk();
        }
        return listAsList.size() == 1 ? (StillCaptureFlashStopRepeatingQuirk) listAsList.get(0) : new UseTorchAsFlashQuirk(listAsList);
    }
}
