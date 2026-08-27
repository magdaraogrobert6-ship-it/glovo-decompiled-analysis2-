package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.location.Vw$Vw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getLastLayerDrawingWasSkippedui {
    public final Object read;

    /* JADX WARN: Code duplicated, block: B:18:0x00a9  */
    public void RemoteActionCompatParcelizer(headH91voCI headh91voci) {
        Vw$Vw vw$Vw;
        while (true) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.read;
            if (concurrentHashMap.isEmpty()) {
                vw$Vw = null;
            } else {
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                Iterator it = concurrentHashMap.keySet().iterator();
                int i = 0;
                while (it.hasNext() && arrayList.size() < 900) {
                    setForceMeasureWithLookaheadConstraintsui setforcemeasurewithlookaheadconstraintsui = (setForceMeasureWithLookaheadConstraintsui) it.next();
                    releaseLayer releaselayer = (releaseLayer) concurrentHashMap.remove(setforcemeasurewithlookaheadconstraintsui);
                    if (releaselayer != null) {
                        i++;
                        arrayList.add(setforcemeasurewithlookaheadconstraintsui.write);
                        int size = arrayList.size();
                        arrayList.add(Integer.valueOf(setforcemeasurewithlookaheadconstraintsui.serializer));
                        int size2 = arrayList.size();
                        arrayList.add(Integer.valueOf(setforcemeasurewithlookaheadconstraintsui.read));
                        int size3 = arrayList.size();
                        arrayList.add(Integer.valueOf(releaselayer.dbValue));
                        int size4 = arrayList.size();
                        sb.append(" WHEN path=?");
                        sb.append(size);
                        c8$$ExternalSyntheticOutline0.m(size2, size3, " AND read_time_seconds=?", " AND read_time_nanos=?", sb);
                        sb.append(" THEN ?");
                        sb.append(size4);
                        if (sb2.length() > 0) {
                            sb2.append(" OR");
                        }
                        c8$$ExternalSyntheticOutline0.m(size, size2, " (path=?", " AND read_time_seconds=?", sb2);
                        sb2.append(" AND read_time_nanos=?");
                        sb2.append(size3);
                        sb2.append(')');
                    }
                }
                if (i == 0) {
                    vw$Vw = null;
                } else {
                    vw$Vw = new Vw$Vw("UPDATE remote_documents SET document_type = CASE" + ((Object) sb) + " ELSE NULL END WHERE" + ((Object) sb2), 7, arrayList.toArray());
                }
            }
            if (vw$Vw == null) {
                return;
            } else {
                headh91voci.IconCompatParcelizer((String) vw$Vw.serializer, (Object[]) vw$Vw.IconCompatParcelizer);
            }
        }
    }

    public boolean serializer(shareWithSiblings sharewithsiblings) {
        HashMap map = (HashMap) this.read;
        getRectManager.RemoteActionCompatParcelizer(sharewithsiblings.IconCompatParcelizer.size() % 2 == 1, "Expected a collection path.", new Object[0]);
        String strSerializer = sharewithsiblings.serializer();
        shareWithSiblings sharewithsiblings2 = (shareWithSiblings) sharewithsiblings.RemoteActionCompatParcelizer();
        HashSet hashSet = (HashSet) map.get(strSerializer);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(strSerializer, hashSet);
        }
        return hashSet.add(sharewithsiblings2);
    }

    public getLastLayerDrawingWasSkippedui(int i) {
        if (i != 2) {
            this.read = new ConcurrentHashMap();
        } else {
            this.read = new HashMap();
        }
    }

    public getLastLayerDrawingWasSkippedui(OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls, com.huawei.hmf.tasks.a.j jVar) {
        this.read = onGloballyPositionedModifierDefaultImpls;
    }

    public getLastLayerDrawingWasSkippedui(headH91voCI headh91voci) {
        this.read = headh91voci;
    }
}
