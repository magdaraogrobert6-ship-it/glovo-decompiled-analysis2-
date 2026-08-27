package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r8lambda1CYrBXpmcx9Wx9KmhBpPTapUhnk {
    public static final void IconCompatParcelizer(List list, int i, int i2) {
        if (i > i2) {
            serializer(i, i2);
        }
        if (i < 0) {
            read(i);
        }
        if (i2 > list.size()) {
            read(i2, list.size());
        }
    }

    private static final void read(int i) {
        throw new IndexOutOfBoundsException(d$$ExternalSyntheticOutline0.m(i, "fromIndex (", ") is less than 0."));
    }

    private static final void read(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void RemoteActionCompatParcelizer(int i, int i2) {
        throw new IndexOutOfBoundsException(af$$ExternalSyntheticOutline0.m(i, i2, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void serializer(int i, int i2) {
        throw new IllegalArgumentException(af$$ExternalSyntheticOutline0.m(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }

    public static final void write(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            RemoteActionCompatParcelizer(i, size);
        }
    }
}
