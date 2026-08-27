package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k implements setGraphicModalMaxWidthDp {
    public abstract Object IconCompatParcelizer(Object obj);

    public abstract int RemoteActionCompatParcelizer(Object obj);

    @Override // o.setGraphicModalMaxWidthDp
    public Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return IconCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion, null);
    }

    public abstract Object read();

    public abstract Object read(Object obj);

    public abstract Iterator serializer(Object obj);

    public abstract void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj);

    public abstract int write(Object obj);

    public final Object IconCompatParcelizer(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion, Object obj) {
        Object objIconCompatParcelizer = obj != null ? IconCompatParcelizer(obj) : read();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(objIconCompatParcelizer);
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(getDescriptor());
        createinappmessageviewlambda1Serializer.getClass();
        while (true) {
            int i = createinappmessageviewlambda1Serializer.read(getDescriptor());
            if (i == -1) {
                createinappmessageviewlambda1Serializer.write(getDescriptor());
                return read(objIconCompatParcelizer);
            }
            serializer(createinappmessageviewlambda1Serializer, i + iRemoteActionCompatParcelizer, objIconCompatParcelizer);
        }
    }
}
