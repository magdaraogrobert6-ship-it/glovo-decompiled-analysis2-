package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class decodeFontStyle_LCdwA extends decodeSpanStyle {
    public static final Class write = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List RemoteActionCompatParcelizer(long j, int i, Object obj) {
        List arrayList;
        List list = (List) setDirty.RatingCompat.RatingCompat(j, obj);
        if (list.isEmpty()) {
            if (list instanceof decodeFontSynthesisGVVA2EU) {
                arrayList = new decodeFontWeight(i);
            } else {
                arrayList = ((list instanceof component24) && (list instanceof decodeString)) ? ((decodeString) list).read(i) : new ArrayList(i);
            }
            setDirty.write(j, obj, arrayList);
            return arrayList;
        }
        if (write.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            setDirty.write(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof getInverseMatrix3i98HWw) {
            getInverseMatrix3i98HWw getinversematrix3i98hww = (getInverseMatrix3i98HWw) list;
            decodeFontWeight decodefontweight = new decodeFontWeight(getinversematrix3i98hww.size() + i);
            decodefontweight.addAll(getinversematrix3i98hww);
            setDirty.write(j, obj, decodefontweight);
            return decodefontweight;
        }
        if ((list instanceof component24) && (list instanceof decodeString)) {
            decodeString decodestring = (decodeString) list;
            if (!((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
                decodeString decodestring2 = decodestring.read(list.size() + i);
                setDirty.write(j, obj, decodestring2);
                return decodestring2;
            }
        }
        return list;
    }

    @Override // o.decodeSpanStyle
    public final void RemoteActionCompatParcelizer(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) setDirty.RatingCompat.RatingCompat(j, obj);
        if (list instanceof decodeFontSynthesisGVVA2EU) {
            objUnmodifiableList = ((decodeFontSynthesisGVVA2EU) list).serializer();
        } else {
            if (write.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof component24) && (list instanceof decodeString)) {
                transformMatrixToWindowEL8BTi8 transformmatrixtowindowel8bti8 = (transformMatrixToWindowEL8BTi8) ((decodeString) list);
                boolean z = transformmatrixtowindowel8bti8.RemoteActionCompatParcelizer;
                if (z && z) {
                    transformmatrixtowindowel8bti8.RemoteActionCompatParcelizer = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        setDirty.write(j, obj, objUnmodifiableList);
    }

    @Override // o.decodeSpanStyle
    public final void RemoteActionCompatParcelizer(long j, Object obj, Object obj2) {
        List list = (List) setDirty.RatingCompat.RatingCompat(j, obj2);
        List listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j, list.size(), obj);
        int size = listRemoteActionCompatParcelizer.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listRemoteActionCompatParcelizer.addAll(list);
        }
        if (size > 0) {
            list = listRemoteActionCompatParcelizer;
        }
        setDirty.write(j, obj, list);
    }

    @Override // o.decodeSpanStyle
    public final List IconCompatParcelizer(long j, Object obj) {
        return RemoteActionCompatParcelizer(j, 10, obj);
    }
}
