package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onOtherUrlActionlambda3 extends r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA {
    public final onCloseActionlambda0 RatingCompat;

    public abstract Object RemoteActionCompatParcelizer();

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k, o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        return IconCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion, null);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.RatingCompat;
    }

    public abstract void read(DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, Object obj, int i);

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int RemoteActionCompatParcelizer(Object obj) {
        logHtmlInAppMessageClick loghtmlinappmessageclick = (logHtmlInAppMessageClick) obj;
        loghtmlinappmessageclick.getClass();
        return loghtmlinappmessageclick.serializer();
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read(Object obj) {
        logHtmlInAppMessageClick loghtmlinappmessageclick = (logHtmlInAppMessageClick) obj;
        loghtmlinappmessageclick.getClass();
        return loghtmlinappmessageclick.read();
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA
    public final void read(Object obj, int i, Object obj2) {
        ((logHtmlInAppMessageClick) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onOtherUrlActionlambda3(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
        setgraphicmodalmaxwidthdp.getClass();
        this.RatingCompat = new onCloseActionlambda0(setgraphicmodalmaxwidthdp.getDescriptor());
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA, o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        defaultInAppMessageViewWrapperFactory.getClass();
        int iWrite = write(obj);
        onCloseActionlambda0 oncloseactionlambda0 = this.RatingCompat;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactoryWrite = defaultInAppMessageViewWrapperFactory.write(oncloseactionlambda0, iWrite);
        read(defaultInAppMessageSlideupViewFactoryWrite, obj, iWrite);
        defaultInAppMessageSlideupViewFactoryWrite.IconCompatParcelizer(oncloseactionlambda0);
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object read() {
        return (logHtmlInAppMessageClick) IconCompatParcelizer(RemoteActionCompatParcelizer());
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Iterator serializer(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }
}
