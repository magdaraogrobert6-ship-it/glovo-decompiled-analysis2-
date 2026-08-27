package o;

/* JADX INFO: loaded from: classes4.dex */
public final class onInAppMessageButtonClicked extends onOtherUrlActionlambda3 {
    public static final onInAppMessageButtonClicked serializer = new onInAppMessageButtonClicked(onInAppMessageClicked.read);

    @Override // o.onOtherUrlActionlambda3
    public final Object RemoteActionCompatParcelizer() {
        return new ContentCardAdapterCardListDiffCallback(new byte[0]);
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        return new beforeInAppMessageViewOpened(((ContentCardAdapterCardListDiffCallback) obj).serializer);
    }

    @Override // o.onOtherUrlActionlambda3
    public final void read(DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, Object obj, int i) {
        byte[] bArr = ((ContentCardAdapterCardListDiffCallback) obj).serializer;
        defaultInAppMessageSlideupViewFactory.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(this.RatingCompat, i2).RemoteActionCompatParcelizer(bArr[i2]);
        }
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA, o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        beforeInAppMessageViewOpened beforeinappmessageviewopened = (beforeInAppMessageViewOpened) obj;
        beforeinappmessageviewopened.getClass();
        beforeinappmessageviewopened.serializer(createinappmessageviewlambda1.RemoteActionCompatParcelizer(this.RatingCompat, i).PlaybackStateCompatCustomAction());
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        return ((ContentCardAdapterCardListDiffCallback) obj).serializer.length;
    }

    public onInAppMessageButtonClicked(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
    }
}
