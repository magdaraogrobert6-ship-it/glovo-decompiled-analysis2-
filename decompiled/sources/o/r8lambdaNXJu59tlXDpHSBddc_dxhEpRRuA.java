package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA extends r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k {
    public final setGraphicModalMaxWidthDp read;

    public abstract void read(Object obj, int i, Object obj2);

    public r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        this.read = setgraphicmodalmaxwidthdp;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.getClass();
        int iWrite = write(obj);
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactoryWrite = defaultInAppMessageViewWrapperFactory.write(descriptor, iWrite);
        Iterator itSerializer = serializer(obj);
        for (int i = 0; i < iWrite; i++) {
            defaultInAppMessageSlideupViewFactoryWrite.IconCompatParcelizer(getDescriptor(), i, this.read, itSerializer.next());
        }
        defaultInAppMessageSlideupViewFactoryWrite.IconCompatParcelizer(descriptor);
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        read(obj, i, createinappmessageviewlambda1.IconCompatParcelizer(getDescriptor(), i, this.read, null));
    }
}
