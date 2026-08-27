package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class onCustomEventActionlambda1 extends r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA {
    public final InAppMessageJavascriptInterface RemoteActionCompatParcelizer;
    public final getUnregisteredInAppMessageannotations write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return new ArrayList(listAsList);
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int RemoteActionCompatParcelizer(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read() {
        return new ArrayList();
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) Options.Companion.read(this.write), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA
    public final void read(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Iterator serializer(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(objArr);
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onCustomEventActionlambda1(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
        setgraphicmodalmaxwidthdp.getClass();
        this.write = getunregisteredinappmessageannotations;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = setgraphicmodalmaxwidthdp.getDescriptor();
        descriptor.getClass();
        this.RemoteActionCompatParcelizer = new InAppMessageJavascriptInterface(descriptor, 0);
    }
}
