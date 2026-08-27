package o;

/* JADX INFO: loaded from: classes4.dex */
public final class performInAppMessageButtonClicked extends onOtherUrlActionlambda3 {
    public static final performInAppMessageButtonClicked RemoteActionCompatParcelizer = new performInAppMessageButtonClicked(afterClosed.IconCompatParcelizer);

    @Override // o.onOtherUrlActionlambda3
    public final Object RemoteActionCompatParcelizer() {
        return new int[0];
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return new afterOpened(iArr);
    }

    @Override // o.onOtherUrlActionlambda3
    public final void read(DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, Object obj, int i) {
        int[] iArr = (int[]) obj;
        defaultInAppMessageSlideupViewFactory.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            defaultInAppMessageSlideupViewFactory.write(i2, iArr[i2], this.RatingCompat);
        }
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA, o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        afterOpened afteropened = (afterOpened) obj;
        afteropened.getClass();
        afteropened.write(createinappmessageviewlambda1.IconCompatParcelizer(this.RatingCompat, i));
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    public performInAppMessageButtonClicked(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
    }
}
