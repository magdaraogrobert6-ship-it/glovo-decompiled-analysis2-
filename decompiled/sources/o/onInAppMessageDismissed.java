package o;

/* JADX INFO: loaded from: classes4.dex */
public final class onInAppMessageDismissed extends onOtherUrlActionlambda3 {
    public static final onInAppMessageDismissed write = new onInAppMessageDismissed(handleHorizontalActionUp.RemoteActionCompatParcelizer);

    @Override // o.onOtherUrlActionlambda3
    public final Object RemoteActionCompatParcelizer() {
        return new EmptyContentCardsAdapter(new long[0]);
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        return new IWebViewClientStateListener(((EmptyContentCardsAdapter) obj).write);
    }

    @Override // o.onOtherUrlActionlambda3
    public final void read(DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, Object obj, int i) {
        long[] jArr = ((EmptyContentCardsAdapter) obj).write;
        defaultInAppMessageSlideupViewFactory.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(this.RatingCompat, i2).serializer(jArr[i2]);
        }
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA, o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        IWebViewClientStateListener iWebViewClientStateListener = (IWebViewClientStateListener) obj;
        iWebViewClientStateListener.getClass();
        iWebViewClientStateListener.write(createinappmessageviewlambda1.RemoteActionCompatParcelizer(this.RatingCompat, i).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        return ((EmptyContentCardsAdapter) obj).write.length;
    }

    public onInAppMessageDismissed(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
    }
}
