package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setShouldAttachOnInsert extends fillVector {
    public ArrayList IconCompatParcelizer;
    public final ArrayList read;
    public final linearDiffAborted serializer;

    public final String toString() {
        return serializer();
    }

    public final boolean IconCompatParcelizer() {
        return this.serializer == linearDiffAborted.AND;
    }

    @Override // o.fillVector
    public final List RemoteActionCompatParcelizer() {
        return Collections.unmodifiableList(this.read);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof setShouldAttachOnInsert)) {
            return false;
        }
        setShouldAttachOnInsert setshouldattachoninsert = (setShouldAttachOnInsert) obj;
        return this.serializer == setshouldattachoninsert.serializer && this.read.equals(setshouldattachoninsert.read);
    }

    public final int hashCode() {
        return this.read.hashCode() + ((this.serializer.hashCode() + 1147) * 31);
    }

    @Override // o.fillVector
    public final String serializer() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.read;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((fillVector) it.next()) instanceof setShouldAttachOnInsert) {
                sb.append(this.serializer.toString() + "(");
                sb.append(TextUtils.join(",", arrayList));
                sb.append(")");
                return sb.toString();
            }
        }
        if (IconCompatParcelizer()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append(((fillVector) it2.next()).serializer());
            }
            return sb.toString();
        }
        sb.append(this.serializer.toString() + "(");
        sb.append(TextUtils.join(",", arrayList));
        sb.append(")");
        return sb.toString();
    }

    @Override // o.fillVector
    public final boolean IconCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        boolean zIconCompatParcelizer = IconCompatParcelizer();
        ArrayList arrayList = this.read;
        if (zIconCompatParcelizer) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((fillVector) it.next()).IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((fillVector) it2.next()).IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.fillVector
    public final List read() {
        ArrayList arrayList = this.IconCompatParcelizer;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        this.IconCompatParcelizer = new ArrayList();
        Iterator it = this.read.iterator();
        while (it.hasNext()) {
            this.IconCompatParcelizer.addAll(((fillVector) it.next()).read());
        }
        return Collections.unmodifiableList(this.IconCompatParcelizer);
    }

    public setShouldAttachOnInsert(List list, linearDiffAborted lineardiffaborted) {
        this.read = new ArrayList(list);
        this.serializer = lineardiffaborted;
    }
}
