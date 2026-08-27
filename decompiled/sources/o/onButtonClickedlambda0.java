package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class onButtonClickedlambda0 extends r8lambda3beja5D1e1agNYROvnFsh_QFfAY {
    public final beforeOpenedlambda0 serializer;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.serializer;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int RemoteActionCompatParcelizer(Object obj) {
        HashMap map = (HashMap) obj;
        map.getClass();
        return map.size() * 2;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read() {
        return new HashMap();
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read(Object obj) {
        HashMap map = (HashMap) obj;
        map.getClass();
        return map;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Iterator serializer(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onButtonClickedlambda0(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2) {
        super(setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2);
        setgraphicmodalmaxwidthdp.getClass();
        setgraphicmodalmaxwidthdp2.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = setgraphicmodalmaxwidthdp.getDescriptor();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = setgraphicmodalmaxwidthdp2.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.serializer = new beforeOpenedlambda0("kotlin.collections.HashMap", descriptor, descriptor2);
    }
}
