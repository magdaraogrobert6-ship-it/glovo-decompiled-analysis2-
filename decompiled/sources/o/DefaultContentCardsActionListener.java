package o;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DefaultContentCardsActionListener extends AbstractList implements List, displayInAppMessagelambda12 {
    public abstract int IconCompatParcelizer();

    public abstract Object IconCompatParcelizer(int i);

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return IconCompatParcelizer(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return IconCompatParcelizer();
    }
}
