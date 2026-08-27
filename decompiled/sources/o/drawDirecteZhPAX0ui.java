package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class drawDirecteZhPAX0ui {
    public static draweZhPAX0ui RemoteActionCompatParcelizer(Object obj, Object obj2) {
        draweZhPAX0ui drawezhpax0uiRemoteActionCompatParcelizer = (draweZhPAX0ui) obj;
        draweZhPAX0ui drawezhpax0ui = (draweZhPAX0ui) obj2;
        if (!drawezhpax0ui.isEmpty()) {
            if (!drawezhpax0uiRemoteActionCompatParcelizer.write()) {
                drawezhpax0uiRemoteActionCompatParcelizer = drawezhpax0uiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
            drawezhpax0uiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(drawezhpax0ui);
        }
        return drawezhpax0uiRemoteActionCompatParcelizer;
    }

    public static void read(Object obj, Object obj2) {
        draweZhPAX0ui drawezhpax0ui = (draweZhPAX0ui) obj;
        m1$$ExternalSyntheticOutline0.m(obj2);
        if (drawezhpax0ui.isEmpty()) {
            return;
        }
        Iterator it = drawezhpax0ui.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
