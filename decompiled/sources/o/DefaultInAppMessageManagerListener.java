package o;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageManagerListener extends onOtherUrlActionlambda3 {
    public static final DefaultInAppMessageManagerListener IconCompatParcelizer = new DefaultInAppMessageManagerListener(DefaultInAppMessageViewLifecycleListener.RemoteActionCompatParcelizer);

    @Override // o.onOtherUrlActionlambda3
    public final Object RemoteActionCompatParcelizer() {
        return new char[0];
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return new r8lambda14PesggIY_s2tF27Zrq3qgu3B8(cArr);
    }

    @Override // o.onOtherUrlActionlambda3
    public final void read(DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, Object obj, int i) {
        char[] cArr = (char[]) obj;
        defaultInAppMessageSlideupViewFactory.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            defaultInAppMessageSlideupViewFactory.RemoteActionCompatParcelizer(this.RatingCompat, i2, cArr[i2]);
        }
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA, o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        r8lambda14PesggIY_s2tF27Zrq3qgu3B8 r8lambda14pesggiy_s2tf27zrq3qgu3b8 = (r8lambda14PesggIY_s2tF27Zrq3qgu3B8) obj;
        r8lambda14pesggiy_s2tf27zrq3qgu3b8.getClass();
        r8lambda14pesggiy_s2tf27zrq3qgu3b8.read(createinappmessageviewlambda1.serializer(this.RatingCompat, i));
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    public DefaultInAppMessageManagerListener(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
    }
}
