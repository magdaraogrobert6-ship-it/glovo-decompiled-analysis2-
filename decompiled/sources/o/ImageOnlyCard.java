package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImageOnlyCard {
    public static final getBackgroundColor RemoteActionCompatParcelizer(IInAppMessage iInAppMessage, String str, long j, long j2) {
        str.getClass();
        List<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> listRemoteActionCompatParcelizer = iInAppMessage.write().RemoteActionCompatParcelizer(j, j2);
        if (listRemoteActionCompatParcelizer.isEmpty()) {
            iInAppMessage.serializer().IconCompatParcelizer(String.format("Skipping the focus score calculation for the transport %s: no phone usage evaluations found.", Arrays.copyOf(new Object[]{str}, 1)), new Object[0]);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listRemoteActionCompatParcelizer) {
            if (((r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) obj).serializer()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            j3 += (long) ((r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) it.next()).read();
        }
        return new getBackgroundColor(j3, j2 - j);
    }
}
