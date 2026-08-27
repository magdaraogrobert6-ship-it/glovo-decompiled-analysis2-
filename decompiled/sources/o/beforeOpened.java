package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class beforeOpened extends r8lambda3beja5D1e1agNYROvnFsh_QFfAY {
    public final performInAppMessageClicked read;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.read;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int RemoteActionCompatParcelizer(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read() {
        return new LinkedHashMap();
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
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
    public beforeOpened(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2) {
        super(setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2);
        setgraphicmodalmaxwidthdp.getClass();
        setgraphicmodalmaxwidthdp2.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = setgraphicmodalmaxwidthdp.getDescriptor();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = setgraphicmodalmaxwidthdp2.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.read = new performInAppMessageClicked("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }
}
