package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class isEqualTo implements getColorIntegerOrNulllambda0 {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final List IconCompatParcelizer;
    public final List write;

    static {
        getDoubleOrNull.write(Collections.EMPTY_SET);
    }

    public static OkHttpCall$1 RemoteActionCompatParcelizer(int i, int i2) {
        OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(0);
        okHttpCall$1.write = i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
        okHttpCall$1.serializer = i2 == 0 ? Collections.EMPTY_LIST : new ArrayList(i2);
        return okHttpCall$1;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        List list = this.IconCompatParcelizer;
        int size = list.size();
        List list2 = this.write;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((mergeJsonObjects) list2.get(i)).write();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object objWrite = ((mergeJsonObjects) list.get(i2)).write();
            objWrite.getClass();
            hashSet.add(objWrite);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public isEqualTo(List list, List list2) {
        this.IconCompatParcelizer = list;
        this.write = list2;
    }
}
