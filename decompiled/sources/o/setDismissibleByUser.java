package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setDismissibleByUser {
    public static final setListener RemoteActionCompatParcelizer(isTest istest, long j, long j2, Boolean bool) {
        List<setDismissType.write> listIconCompatParcelizer = istest.RemoteActionCompatParcelizer().IconCompatParcelizer(j, j2);
        if (listIconCompatParcelizer.isEmpty()) {
            return null;
        }
        ArrayList arrayList = istest.read().read(j, j2, bool);
        ArrayList<setCropType.serializer> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((setCropType.serializer) obj).serializer(), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        long jRemoteActionCompatParcelizer = 0;
        long jIconCompatParcelizer = 0;
        for (setCropType.serializer serializerVar : arrayList2) {
            jIconCompatParcelizer += serializerVar.IconCompatParcelizer() - serializerVar.RemoteActionCompatParcelizer();
        }
        double d = jIconCompatParcelizer / 1000;
        ArrayList<setCropType.serializer> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((setCropType.serializer) obj2).serializer(), Boolean.FALSE}, getCieXyz.write())).booleanValue()) {
                arrayList3.add(obj2);
            }
        }
        long jIconCompatParcelizer2 = 0;
        for (setCropType.serializer serializerVar2 : arrayList3) {
            jIconCompatParcelizer2 += serializerVar2.IconCompatParcelizer() - serializerVar2.RemoteActionCompatParcelizer();
        }
        double d2 = jIconCompatParcelizer2 / 1000;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listIconCompatParcelizer) {
            setDismissType.write writeVar = (setDismissType.write) obj3;
            if (writeVar.serializer() && !writeVar.read()) {
                arrayList4.add(obj3);
            }
        }
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            jRemoteActionCompatParcelizer += ((setDismissType.write) it.next()).RemoteActionCompatParcelizer();
        }
        return new setListener(jRemoteActionCompatParcelizer / 1000, d2, d);
    }
}
