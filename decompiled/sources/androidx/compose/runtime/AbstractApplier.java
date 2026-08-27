package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.getAddressCountry;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractApplier implements getAddressCountry {
    public static final int $stable = 8;
    private Object read;
    private final ArrayList<Object> serializer = new ArrayList<>();
    private final Object write;

    @Override // o.getAddressCountry
    public Object getCurrent() {
        return this.read;
    }

    public final Object getRoot() {
        return this.write;
    }

    public abstract void onClear();

    public void setCurrent(Object obj) {
        this.read = obj;
    }

    @Override // o.getAddressCountry
    public final void clear() {
        this.serializer.clear();
        setCurrent(this.write);
        onClear();
    }

    @Override // o.getAddressCountry
    public void down(Object obj) {
        this.serializer.add(getCurrent());
        setCurrent(obj);
    }

    @Override // o.getAddressCountry
    public void up() {
        ArrayList<Object> arrayList = this.serializer;
        setCurrent(arrayList.remove(arrayList.size() - 1));
    }

    public AbstractApplier(Object obj) {
        this.write = obj;
        this.read = obj;
    }

    public final void remove(List<Object> list, int i, int i2) {
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }

    public final void move(List<Object> list, int i, int i2, int i3) {
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List<Object> listSubList = list.subList(i, i3 + i);
            ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) listSubList);
            listSubList.clear();
            list.addAll(i4, arrayListIconCompatParcelizer);
            return;
        }
        if (i != i2 + 1 && i != i2 - 1) {
            list.add(i4, list.remove(i));
        } else {
            list.set(i, list.set(i2, list.get(i)));
        }
    }
}
