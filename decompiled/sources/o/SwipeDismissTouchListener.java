package o;

/* JADX INFO: loaded from: classes4.dex */
public final class SwipeDismissTouchListener extends onOtherUrlActionlambda3 {
    public static final SwipeDismissTouchListener RemoteActionCompatParcelizer = new SwipeDismissTouchListener(IInAppMessageViewLifecycleListener.read);

    @Override // o.onOtherUrlActionlambda3
    public final Object RemoteActionCompatParcelizer() {
        return new ContentCardAdapterExternalSyntheticLambda6(new int[0]);
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        return new IInAppMessageWebViewClientListener(((ContentCardAdapterExternalSyntheticLambda6) obj).write);
    }

    @Override // o.onOtherUrlActionlambda3
    public final void read(DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, Object obj, int i) {
        int[] iArr = ((ContentCardAdapterExternalSyntheticLambda6) obj).write;
        defaultInAppMessageSlideupViewFactory.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(this.RatingCompat, i2).read(iArr[i2]);
        }
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA, o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener = (IInAppMessageWebViewClientListener) obj;
        iInAppMessageWebViewClientListener.getClass();
        iInAppMessageWebViewClientListener.IconCompatParcelizer(createinappmessageviewlambda1.RemoteActionCompatParcelizer(this.RatingCompat, i).MediaSessionCompatToken());
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        return ((ContentCardAdapterExternalSyntheticLambda6) obj).write.length;
    }

    public SwipeDismissTouchListener(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
    }
}
