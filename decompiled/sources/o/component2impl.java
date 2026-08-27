package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class component2impl extends accessgetZerocp {
    public static final Class read = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List serializer(long j, int i, Object obj) {
        List arrayList;
        List list = (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj);
        if (list.isEmpty()) {
            if (list instanceof twoDimensionalFocusSearchsMXa3k8) {
                arrayList = new CornerRadius(i);
            } else {
                arrayList = ((list instanceof getZerokKHJgLs) && (list instanceof TwoDimensionalFocusSearchKtgenerateAndSearchChildren1)) ? ((TwoDimensionalFocusSearchKtgenerateAndSearchChildren1) list).read(i) : new ArrayList(i);
            }
            getUint64Low32annotations.serializer(j, obj, arrayList);
            return arrayList;
        }
        if (read.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            getUint64Low32annotations.serializer(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof getFloatInfinityBaseannotations) {
            getFloatInfinityBaseannotations getfloatinfinitybaseannotations = (getFloatInfinityBaseannotations) list;
            CornerRadius cornerRadius = new CornerRadius(getfloatinfinitybaseannotations.size() + i);
            cornerRadius.addAll(getfloatinfinitybaseannotations);
            getUint64Low32annotations.serializer(j, obj, cornerRadius);
            return cornerRadius;
        }
        if ((list instanceof getZerokKHJgLs) && (list instanceof TwoDimensionalFocusSearchKtgenerateAndSearchChildren1)) {
            TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 twoDimensionalFocusSearchKtgenerateAndSearchChildren1 = (TwoDimensionalFocusSearchKtgenerateAndSearchChildren1) list;
            if (!((searchChildren4C6V_qg) twoDimensionalFocusSearchKtgenerateAndSearchChildren1).read) {
                TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 twoDimensionalFocusSearchKtgenerateAndSearchChildren2 = twoDimensionalFocusSearchKtgenerateAndSearchChildren1.read(list.size() + i);
                getUint64Low32annotations.serializer(j, obj, twoDimensionalFocusSearchKtgenerateAndSearchChildren2);
                return twoDimensionalFocusSearchKtgenerateAndSearchChildren2;
            }
        }
        return list;
    }

    @Override // o.accessgetZerocp
    public final void read(long j, Object obj, Object obj2) {
        List list = (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj2);
        List listSerializer = serializer(j, list.size(), obj);
        int size = listSerializer.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listSerializer.addAll(list);
        }
        if (size > 0) {
            list = listSerializer;
        }
        getUint64Low32annotations.serializer(j, obj, list);
    }

    @Override // o.accessgetZerocp
    public final void write(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj);
        if (list instanceof twoDimensionalFocusSearchsMXa3k8) {
            objUnmodifiableList = ((twoDimensionalFocusSearchsMXa3k8) list).read();
        } else {
            if (read.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof getZerokKHJgLs) && (list instanceof TwoDimensionalFocusSearchKtgenerateAndSearchChildren1)) {
                searchChildren4C6V_qg searchchildren4c6v_qg = (searchChildren4C6V_qg) ((TwoDimensionalFocusSearchKtgenerateAndSearchChildren1) list);
                if (searchchildren4c6v_qg.read) {
                    searchchildren4c6v_qg.read = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        getUint64Low32annotations.serializer(j, obj, objUnmodifiableList);
    }

    @Override // o.accessgetZerocp
    public final List RemoteActionCompatParcelizer(long j, Object obj) {
        return serializer(j, 10, obj);
    }
}
