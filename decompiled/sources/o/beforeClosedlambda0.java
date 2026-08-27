package o;

/* JADX INFO: loaded from: classes4.dex */
public final class beforeClosedlambda0 extends onOtherUrlActionlambda3 {
    public static final beforeClosedlambda0 serializer = new beforeClosedlambda0(onClickedlambda0.serializer);

    @Override // o.onOtherUrlActionlambda3
    public final Object RemoteActionCompatParcelizer() {
        return new float[0];
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return new afterOpenedlambda0(fArr);
    }

    @Override // o.onOtherUrlActionlambda3
    public final void read(DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, Object obj, int i) {
        float[] fArr = (float[]) obj;
        defaultInAppMessageSlideupViewFactory.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            defaultInAppMessageSlideupViewFactory.write(this.RatingCompat, i2, fArr[i2]);
        }
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA, o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        afterOpenedlambda0 afteropenedlambda0 = (afterOpenedlambda0) obj;
        afteropenedlambda0.getClass();
        afteropenedlambda0.serializer(createinappmessageviewlambda1.read((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) this.RatingCompat, i));
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    public beforeClosedlambda0(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
    }
}
