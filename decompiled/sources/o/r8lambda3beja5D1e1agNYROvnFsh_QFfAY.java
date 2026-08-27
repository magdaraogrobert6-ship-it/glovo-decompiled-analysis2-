package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda3beja5D1e1agNYROvnFsh_QFfAY extends r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k {
    public final setGraphicModalMaxWidthDp IconCompatParcelizer;
    public final setGraphicModalMaxWidthDp write;

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objIconCompatParcelizer = createinappmessageviewlambda1.IconCompatParcelizer(getDescriptor(), i, this.IconCompatParcelizer, null);
        int i2 = createinappmessageviewlambda1.read(getDescriptor());
        if (i2 != i + 1) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(i, "Value must follow key in a map, index for key: ", i2, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objIconCompatParcelizer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = this.write;
        map.put(objIconCompatParcelizer, (!zContainsKey || (setgraphicmodalmaxwidthdp.getDescriptor().RemoteActionCompatParcelizer() instanceof DefaultInAppMessageModalViewFactory)) ? createinappmessageviewlambda1.IconCompatParcelizer(getDescriptor(), i2, setgraphicmodalmaxwidthdp, null) : createinappmessageviewlambda1.IconCompatParcelizer(getDescriptor(), i2, setgraphicmodalmaxwidthdp, onMove.read(map, objIconCompatParcelizer)));
    }

    public r8lambda3beja5D1e1agNYROvnFsh_QFfAY(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2) {
        this.IconCompatParcelizer = setgraphicmodalmaxwidthdp;
        this.write = setgraphicmodalmaxwidthdp2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int iWrite = write(obj);
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactoryWrite = defaultInAppMessageViewWrapperFactory.write(descriptor, iWrite);
        Iterator itSerializer = serializer(obj);
        int i = 0;
        while (itSerializer.hasNext()) {
            Map.Entry entry = (Map.Entry) itSerializer.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            defaultInAppMessageSlideupViewFactoryWrite.IconCompatParcelizer(getDescriptor(), i, this.IconCompatParcelizer, key);
            int i2 = i + 2;
            defaultInAppMessageSlideupViewFactoryWrite.IconCompatParcelizer(getDescriptor(), i + 1, this.write, value);
            i = i2;
        }
        defaultInAppMessageSlideupViewFactoryWrite.IconCompatParcelizer(descriptor);
    }
}
