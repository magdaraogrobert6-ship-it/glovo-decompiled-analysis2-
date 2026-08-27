package o;

import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onRequestRelayout {
    public static fillVector read(fillVector fillvector) {
        serializer(fillvector);
        if (fillvector instanceof nodeReused) {
            return fillvector;
        }
        setShouldAttachOnInsert setshouldattachoninsert = (setShouldAttachOnInsert) fillvector;
        if (Collections.unmodifiableList(setshouldattachoninsert.read).size() == 1) {
            return read((fillVector) fillvector.RemoteActionCompatParcelizer().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableList(setshouldattachoninsert.read).iterator();
        while (it.hasNext()) {
            arrayList.add(read((fillVector) it.next()));
        }
        fillVector fillvectorWrite = write(new setShouldAttachOnInsert(arrayList, setshouldattachoninsert.serializer));
        if (IconCompatParcelizer(fillvectorWrite)) {
            return fillvectorWrite;
        }
        getRectManager.RemoteActionCompatParcelizer(fillvectorWrite instanceof setShouldAttachOnInsert, "field filters are already in DNF form.", new Object[0]);
        setShouldAttachOnInsert setshouldattachoninsert2 = (setShouldAttachOnInsert) fillvectorWrite;
        boolean zIconCompatParcelizer = setshouldattachoninsert2.IconCompatParcelizer();
        ArrayList arrayList2 = setshouldattachoninsert2.read;
        getRectManager.RemoteActionCompatParcelizer(zIconCompatParcelizer, "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        getRectManager.RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList2).size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        fillVector fillvectorSerializer = (fillVector) Collections.unmodifiableList(arrayList2).get(0);
        for (int i = 1; i < Collections.unmodifiableList(arrayList2).size(); i++) {
            fillvectorSerializer = serializer(fillvectorSerializer, (fillVector) Collections.unmodifiableList(arrayList2).get(i));
        }
        return fillvectorSerializer;
    }

    public static fillVector serializer(fillVector fillvector, fillVector fillvector2) {
        setShouldAttachOnInsert setshouldattachoninsert;
        serializer(fillvector);
        serializer(fillvector2);
        boolean z = fillvector instanceof nodeReused;
        if (z && (fillvector2 instanceof nodeReused)) {
            setshouldattachoninsert = new setShouldAttachOnInsert(Arrays.asList((nodeReused) fillvector, (nodeReused) fillvector2), linearDiffAborted.AND);
        } else if (z && (fillvector2 instanceof setShouldAttachOnInsert)) {
            setshouldattachoninsert = RemoteActionCompatParcelizer((nodeReused) fillvector, (setShouldAttachOnInsert) fillvector2);
        } else if ((fillvector instanceof setShouldAttachOnInsert) && (fillvector2 instanceof nodeReused)) {
            setshouldattachoninsert = RemoteActionCompatParcelizer((nodeReused) fillvector2, (setShouldAttachOnInsert) fillvector);
        } else {
            setShouldAttachOnInsert setshouldattachoninsert2 = (setShouldAttachOnInsert) fillvector;
            setShouldAttachOnInsert setshouldattachoninsert3 = (setShouldAttachOnInsert) fillvector2;
            ArrayList arrayList = setshouldattachoninsert2.read;
            linearDiffAborted lineardiffaborted = setshouldattachoninsert2.serializer;
            getRectManager.RemoteActionCompatParcelizer((Collections.unmodifiableList(arrayList).isEmpty() || Collections.unmodifiableList(setshouldattachoninsert3.read).isEmpty()) ? false : true, "Found an empty composite filter", new Object[0]);
            if (setshouldattachoninsert2.IconCompatParcelizer() && setshouldattachoninsert3.IconCompatParcelizer()) {
                List listUnmodifiableList = Collections.unmodifiableList(setshouldattachoninsert3.read);
                ArrayList arrayList2 = new ArrayList(setshouldattachoninsert2.read);
                arrayList2.addAll(listUnmodifiableList);
                setshouldattachoninsert = new setShouldAttachOnInsert(arrayList2, lineardiffaborted);
            } else {
                linearDiffAborted lineardiffaborted2 = linearDiffAborted.OR;
                setShouldAttachOnInsert setshouldattachoninsert4 = lineardiffaborted == lineardiffaborted2 ? setshouldattachoninsert2 : setshouldattachoninsert3;
                if (lineardiffaborted == lineardiffaborted2) {
                    setshouldattachoninsert2 = setshouldattachoninsert3;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = Collections.unmodifiableList(setshouldattachoninsert4.read).iterator();
                while (it.hasNext()) {
                    arrayList3.add(serializer((fillVector) it.next(), setshouldattachoninsert2));
                }
                setshouldattachoninsert = new setShouldAttachOnInsert(arrayList3, linearDiffAborted.OR);
            }
        }
        return write(setshouldattachoninsert);
    }

    public static fillVector write(fillVector fillvector) {
        serializer(fillvector);
        if (fillvector instanceof nodeReused) {
            return fillvector;
        }
        setShouldAttachOnInsert setshouldattachoninsert = (setShouldAttachOnInsert) fillvector;
        ArrayList arrayList = setshouldattachoninsert.read;
        linearDiffAborted lineardiffaborted = setshouldattachoninsert.serializer;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        if (listUnmodifiableList.size() == 1) {
            return write((fillVector) listUnmodifiableList.get(0));
        }
        Iterator it = setshouldattachoninsert.read.iterator();
        while (it.hasNext()) {
            if (((fillVector) it.next()) instanceof setShouldAttachOnInsert) {
                ArrayList<fillVector> arrayList2 = new ArrayList();
                Iterator it2 = listUnmodifiableList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(write((fillVector) it2.next()));
                }
                ArrayList arrayList3 = new ArrayList();
                for (fillVector fillvector2 : arrayList2) {
                    if (fillvector2 instanceof nodeReused) {
                        arrayList3.add(fillvector2);
                    } else if (fillvector2 instanceof setShouldAttachOnInsert) {
                        setShouldAttachOnInsert setshouldattachoninsert2 = (setShouldAttachOnInsert) fillvector2;
                        if (setshouldattachoninsert2.serializer.equals(lineardiffaborted)) {
                            arrayList3.addAll(Collections.unmodifiableList(setshouldattachoninsert2.read));
                        } else {
                            arrayList3.add(setshouldattachoninsert2);
                        }
                    }
                }
                return arrayList3.size() == 1 ? (fillVector) arrayList3.get(0) : new setShouldAttachOnInsert(arrayList3, lineardiffaborted);
            }
        }
        return setshouldattachoninsert;
    }

    public static boolean IconCompatParcelizer(fillVector fillvector) {
        if (fillvector instanceof nodeReused) {
            return true;
        }
        boolean z = fillvector instanceof setShouldAttachOnInsert;
        if (z) {
            setShouldAttachOnInsert setshouldattachoninsert = (setShouldAttachOnInsert) fillvector;
            Iterator it = setshouldattachoninsert.read.iterator();
            do {
                if (!it.hasNext()) {
                    if (!setshouldattachoninsert.IconCompatParcelizer()) {
                        break;
                    }
                    return true;
                }
            } while (!(((fillVector) it.next()) instanceof setShouldAttachOnInsert));
        }
        if (!z) {
            return false;
        }
        setShouldAttachOnInsert setshouldattachoninsert2 = (setShouldAttachOnInsert) fillvector;
        if (setshouldattachoninsert2.serializer != linearDiffAborted.OR) {
            return false;
        }
        for (fillVector fillvector2 : Collections.unmodifiableList(setshouldattachoninsert2.read)) {
            if (!(fillvector2 instanceof nodeReused)) {
                if (!(fillvector2 instanceof setShouldAttachOnInsert)) {
                    return false;
                }
                setShouldAttachOnInsert setshouldattachoninsert3 = (setShouldAttachOnInsert) fillvector2;
                Iterator it2 = setshouldattachoninsert3.read.iterator();
                while (it2.hasNext()) {
                    if (((fillVector) it2.next()) instanceof setShouldAttachOnInsert) {
                        return false;
                    }
                }
                if (!setshouldattachoninsert3.IconCompatParcelizer()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static fillVector RemoteActionCompatParcelizer(fillVector fillvector) {
        serializer(fillvector);
        ArrayList arrayList = new ArrayList();
        if (!(fillvector instanceof nodeReused)) {
            setShouldAttachOnInsert setshouldattachoninsert = (setShouldAttachOnInsert) fillvector;
            Iterator it = Collections.unmodifiableList(setshouldattachoninsert.read).iterator();
            while (it.hasNext()) {
                arrayList.add(RemoteActionCompatParcelizer((fillVector) it.next()));
            }
            return new setShouldAttachOnInsert(arrayList, setshouldattachoninsert.serializer);
        }
        if (!(fillvector instanceof actionForModifiers)) {
            return fillvector;
        }
        actionForModifiers actionformodifiers = (actionForModifiers) fillvector;
        Iterator<Value> it2 = actionformodifiers.RemoteActionCompatParcelizer.getArrayValue().getValuesList().iterator();
        while (it2.hasNext()) {
            arrayList.add(nodeReused.IconCompatParcelizer(actionformodifiers.serializer, updateUnsafe.EQUAL, it2.next()));
        }
        return new setShouldAttachOnInsert(arrayList, linearDiffAborted.OR);
    }

    public static void serializer(fillVector fillvector) {
        getRectManager.RemoteActionCompatParcelizer((fillvector instanceof nodeReused) || (fillvector instanceof setShouldAttachOnInsert), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    public static setShouldAttachOnInsert RemoteActionCompatParcelizer(nodeReused nodereused, setShouldAttachOnInsert setshouldattachoninsert) {
        boolean zIconCompatParcelizer = setshouldattachoninsert.IconCompatParcelizer();
        ArrayList arrayList = setshouldattachoninsert.read;
        if (zIconCompatParcelizer) {
            List listSingletonList = Collections.singletonList(nodereused);
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(listSingletonList);
            return new setShouldAttachOnInsert(arrayList2, setshouldattachoninsert.serializer);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = Collections.unmodifiableList(arrayList).iterator();
        while (it.hasNext()) {
            arrayList3.add(serializer(nodereused, (fillVector) it.next()));
        }
        return new setShouldAttachOnInsert(arrayList3, linearDiffAborted.OR);
    }
}
