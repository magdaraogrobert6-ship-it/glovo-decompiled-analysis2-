package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.getAddressStreet;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class VectorApplier extends AbstractApplier {
    public static final int $stable = AbstractApplier.$stable;

    public VectorApplier(VNode vNode) {
        super(vNode);
    }

    @Override // o.getAddressCountry
    public void insertTopDown(int i, VNode vNode) {
    }

    @Override // o.getAddressCountry
    public /* bridge */ /* synthetic */ void onBeginChanges() {
    }

    @Override // o.getAddressCountry
    public /* bridge */ /* synthetic */ void onEndChanges() {
    }

    private final GroupComponent asGroup(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot only insert VNode into Group");
        return null;
    }

    @Override // o.getAddressCountry
    public void IconCompatParcelizer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Object obj) {
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getCurrent(), obj);
    }

    @Override // o.getAddressCountry
    public void insertBottomUp(int i, VNode vNode) {
        asGroup((VNode) getCurrent()).insertAt(i, vNode);
    }

    @Override // o.getAddressCountry
    public void move(int i, int i2, int i3) {
        asGroup((VNode) getCurrent()).move(i, i2, i3);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        GroupComponent groupComponentAsGroup = asGroup((VNode) getRoot());
        groupComponentAsGroup.remove(0, groupComponentAsGroup.getNumChildren());
    }

    @Override // o.getAddressCountry
    public void remove(int i, int i2) {
        asGroup((VNode) getCurrent()).remove(i, i2);
    }

    @Override // o.getAddressCountry
    public void reuse() {
        Object current = getCurrent();
        getAddressStreet getaddressstreet = current instanceof getAddressStreet ? (getAddressStreet) current : null;
        if (getaddressstreet != null) {
            getaddressstreet.onReuse();
        }
    }
}
