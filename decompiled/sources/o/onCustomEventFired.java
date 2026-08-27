package o;

/* JADX INFO: loaded from: classes4.dex */
public final class onCustomEventFired extends onOtherUrlActionlambda3 {
    public static final onCustomEventFired IconCompatParcelizer = new onCustomEventFired(afterInAppMessageViewClosed.RemoteActionCompatParcelizer);

    @Override // o.onOtherUrlActionlambda3
    public final Object RemoteActionCompatParcelizer() {
        return new short[0];
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return new IHtmlInAppMessageActionListener(sArr);
    }

    @Override // o.onOtherUrlActionlambda3
    public final void read(DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, Object obj, int i) {
        short[] sArr = (short[]) obj;
        defaultInAppMessageSlideupViewFactory.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            defaultInAppMessageSlideupViewFactory.RemoteActionCompatParcelizer(this.RatingCompat, i2, sArr[i2]);
        }
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA, o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener = (IHtmlInAppMessageActionListener) obj;
        iHtmlInAppMessageActionListener.getClass();
        iHtmlInAppMessageActionListener.write(createinappmessageviewlambda1.read(this.RatingCompat, i));
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    public onCustomEventFired(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
    }
}
