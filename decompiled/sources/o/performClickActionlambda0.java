package o;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class performClickActionlambda0 extends r8lambda4ThYJOIoUJZTcgudf2yZsG4Gjzk {
    public final InAppMessageJavascriptInterface serializer;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.serializer;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        Set set = (Set) obj;
        set.getClass();
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int RemoteActionCompatParcelizer(Object obj) {
        HashSet hashSet = (HashSet) obj;
        hashSet.getClass();
        return hashSet.size();
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read() {
        return new HashSet();
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read(Object obj) {
        HashSet hashSet = (HashSet) obj;
        hashSet.getClass();
        return hashSet;
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA
    public final void read(Object obj, int i, Object obj2) {
        HashSet hashSet = (HashSet) obj;
        hashSet.getClass();
        hashSet.add(obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public performClickActionlambda0(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
        setgraphicmodalmaxwidthdp.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = setgraphicmodalmaxwidthdp.getDescriptor();
        descriptor.getClass();
        this.serializer = new InAppMessageJavascriptInterface(descriptor, 1);
    }
}
