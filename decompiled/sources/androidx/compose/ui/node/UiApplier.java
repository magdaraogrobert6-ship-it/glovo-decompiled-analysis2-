package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class UiApplier extends AbstractApplier {
    public static final int $stable = AbstractApplier.$stable;

    public UiApplier(LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // o.getAddressCountry
    public void insertTopDown(int i, LayoutNode layoutNode) {
    }

    @Override // o.getAddressCountry
    public /* bridge */ /* synthetic */ void onBeginChanges() {
    }

    @Override // o.getAddressCountry
    public void IconCompatParcelizer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Object obj) {
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getCurrent(), obj);
    }

    @Override // o.getAddressCountry
    public void insertBottomUp(int i, LayoutNode layoutNode) {
        ((LayoutNode) getCurrent()).insertAt$ui(i, layoutNode);
    }

    @Override // o.getAddressCountry
    public void move(int i, int i2, int i3) {
        ((LayoutNode) getCurrent()).move$ui(i, i2, i3);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        ((LayoutNode) getRoot()).removeAll$ui();
    }

    @Override // o.getAddressCountry
    public void onEndChanges() {
        Owner owner$ui = ((LayoutNode) getRoot()).getOwner$ui();
        if (owner$ui != null) {
            owner$ui.onEndApplyChanges();
        }
    }

    @Override // o.getAddressCountry
    public void remove(int i, int i2) {
        ((LayoutNode) getCurrent()).removeAt$ui(i, i2);
    }

    @Override // o.getAddressCountry
    public void reuse() {
        ((LayoutNode) getCurrent()).onReuse();
    }
}
