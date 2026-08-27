package o;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class decodeInt extends AbstractList {
    public final List IconCompatParcelizer;
    public final decodeULongsVKNKU read;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object obj = this.IconCompatParcelizer.get(i);
        ((invalidateDescendants) this.read).getClass();
        get_autofillManagerui get_autofillmanageruiForNumber = get_autofillManagerui.forNumber(((Integer) obj).intValue());
        return get_autofillmanageruiForNumber == null ? get_autofillManagerui.SESSION_VERBOSITY_NONE : get_autofillmanageruiForNumber;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.IconCompatParcelizer.size();
    }

    public decodeInt(List list, decodeULongsVKNKU decodeulongsvknku) {
        this.IconCompatParcelizer = list;
        this.read = decodeulongsvknku;
    }
}
