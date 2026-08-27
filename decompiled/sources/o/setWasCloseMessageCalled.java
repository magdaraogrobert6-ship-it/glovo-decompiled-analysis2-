package o;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class setWasCloseMessageCalled extends r8lambda4ThYJOIoUJZTcgudf2yZsG4Gjzk {
    public final /* synthetic */ int serializer;
    public final onButtonClicked write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setWasCloseMessageCalled(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, int i) {
        super(setgraphicmodalmaxwidthdp);
        this.serializer = i;
        int i2 = 1;
        if (i != 1) {
            setgraphicmodalmaxwidthdp.getClass();
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = setgraphicmodalmaxwidthdp.getDescriptor();
            descriptor.getClass();
            this.write = new InAppMessageJavascriptInterfaceCompanion(descriptor, 0);
            return;
        }
        setgraphicmodalmaxwidthdp.getClass();
        super(setgraphicmodalmaxwidthdp);
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = setgraphicmodalmaxwidthdp.getDescriptor();
        descriptor2.getClass();
        this.write = new InAppMessageJavascriptInterfaceCompanion(descriptor2, i2);
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int RemoteActionCompatParcelizer(Object obj) {
        if (this.serializer != 0) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
            linkedHashSet.getClass();
            return linkedHashSet.size();
        }
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.serializer != 0 ? (InAppMessageJavascriptInterfaceCompanion) this.write : (InAppMessageJavascriptInterfaceCompanion) this.write;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read(Object obj) {
        if (this.serializer != 0) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
            linkedHashSet.getClass();
            return linkedHashSet;
        }
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA
    public final void read(Object obj, int i, Object obj2) {
        if (this.serializer != 0) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
            linkedHashSet.getClass();
            linkedHashSet.add(obj2);
        } else {
            ArrayList arrayList = (ArrayList) obj;
            arrayList.getClass();
            arrayList.add(i, obj2);
        }
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        Object obj2;
        if (this.serializer != 0) {
            Set set = (Set) obj;
            set.getClass();
            obj2 = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
            return obj2 == null ? new LinkedHashSet(set) : obj2;
        }
        List list = (List) obj;
        list.getClass();
        obj2 = list instanceof ArrayList ? (ArrayList) list : null;
        return obj2 == null ? new ArrayList(list) : obj2;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read() {
        return this.serializer != 0 ? new LinkedHashSet() : new ArrayList();
    }
}
