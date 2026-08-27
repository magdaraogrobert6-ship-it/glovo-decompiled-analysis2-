package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaZyjUdpl8k8CsYRkQ_udSuHMGpvg extends onOtherUrlActionlambda3 {
    public static final r8lambdaZyjUdpl8k8CsYRkQ_udSuHMGpvg IconCompatParcelizer = new r8lambdaZyjUdpl8k8CsYRkQ_udSuHMGpvg(NestfgetmToken.IconCompatParcelizer);

    @Override // o.onOtherUrlActionlambda3
    public final Object RemoteActionCompatParcelizer() {
        return new DefaultContentCardsUpdateHandlerCompanion(new short[0]);
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        return new NestfgetmView(((DefaultContentCardsUpdateHandlerCompanion) obj).RemoteActionCompatParcelizer);
    }

    @Override // o.onOtherUrlActionlambda3
    public final void read(DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, Object obj, int i) {
        short[] sArr = ((DefaultContentCardsUpdateHandlerCompanion) obj).RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactory.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(this.RatingCompat, i2).read(sArr[i2]);
        }
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA, o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        NestfgetmView nestfgetmView = (NestfgetmView) obj;
        nestfgetmView.getClass();
        nestfgetmView.serializer(createinappmessageviewlambda1.RemoteActionCompatParcelizer(this.RatingCompat, i).ComponentActivity());
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        return ((DefaultContentCardsUpdateHandlerCompanion) obj).RemoteActionCompatParcelizer.length;
    }

    public r8lambdaZyjUdpl8k8CsYRkQ_udSuHMGpvg(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
    }
}
