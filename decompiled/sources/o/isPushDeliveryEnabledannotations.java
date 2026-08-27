package o;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class isPushDeliveryEnabledannotations {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private final ArrayList IconCompatParcelizer = new ArrayList();
    private final ArrayList write = new ArrayList();

    public final ArrayList IconCompatParcelizer() {
        ArrayList arrayList;
        synchronized (this.IconCompatParcelizer) {
            arrayList = new ArrayList(this.IconCompatParcelizer);
            this.IconCompatParcelizer.clear();
        }
        return arrayList;
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this.IconCompatParcelizer) {
            ArrayList arrayList = this.IconCompatParcelizer;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            while (true) {
                Object obj = !arrayList3.isEmpty() ? arrayList3.get(arrayList3.size() - 1) : null;
                if (obj == null) {
                    break;
                }
                if (!arrayList3.isEmpty()) {
                    arrayList3.remove(arrayList3.size() - 1);
                }
                long[] jArrSerializer = ((setTitleGravity) obj).serializer();
                this.read.getClass();
                if (System.currentTimeMillis() - jArrSerializer[0] > 600000 && System.currentTimeMillis() - jArrSerializer[jArrSerializer.length - 1] > 600000) {
                    arrayList2.add(obj);
                }
            }
            arrayList.removeAll(arrayList2);
        }
        synchronized (this.write) {
            ArrayList arrayList4 = this.write;
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList(arrayList4);
            while (true) {
                Object obj2 = !arrayList6.isEmpty() ? arrayList6.get(arrayList6.size() - 1) : null;
                if (obj2 != null) {
                    if (!arrayList6.isEmpty()) {
                        arrayList6.remove(arrayList6.size() - 1);
                    }
                    this.read.getClass();
                    if (System.currentTimeMillis() - ((Location) obj2).getTime() > 600000) {
                        arrayList5.add(obj2);
                    }
                } else {
                    arrayList4.removeAll(arrayList5);
                }
            }
        }
    }

    public final ArrayList read() {
        ArrayList arrayList;
        synchronized (this.write) {
            arrayList = new ArrayList(this.write);
            this.write.clear();
        }
        return arrayList;
    }

    public isPushDeliveryEnabledannotations(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final void RemoteActionCompatParcelizer(r8lambdabuq0kpt9xWGgh2Z3gBfct3eoBM r8lambdabuq0kpt9xwggh2z3gbfct3eobm) {
        if (r8lambdabuq0kpt9xwggh2z3gbfct3eobm.IconCompatParcelizer().serializer().length > 0) {
            synchronized (this.IconCompatParcelizer) {
                this.IconCompatParcelizer.add(r8lambdabuq0kpt9xwggh2z3gbfct3eobm.IconCompatParcelizer());
            }
        }
        List<Location> listRemoteActionCompatParcelizer = r8lambdabuq0kpt9xwggh2z3gbfct3eobm.RemoteActionCompatParcelizer();
        if (listRemoteActionCompatParcelizer.isEmpty()) {
            return;
        }
        synchronized (this.write) {
            this.write.addAll(listRemoteActionCompatParcelizer);
        }
    }

    public final void write() {
        synchronized (this.IconCompatParcelizer) {
            this.IconCompatParcelizer.clear();
        }
        synchronized (this.write) {
            this.write.clear();
        }
    }
}
