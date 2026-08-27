package o;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageJavascriptInterfacerequestPushPermission1ExternalSyntheticLambda0 extends onOtherUrlActionlambda3 {
    public static final InAppMessageJavascriptInterfacerequestPushPermission1ExternalSyntheticLambda0 IconCompatParcelizer = new InAppMessageJavascriptInterfacerequestPushPermission1ExternalSyntheticLambda0(r8lambda1VgBO9VidiFdX4WL52nRFDgX4.RemoteActionCompatParcelizer);

    @Override // o.onOtherUrlActionlambda3
    public final Object RemoteActionCompatParcelizer() {
        return new byte[0];
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final Object IconCompatParcelizer(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return new DefaultHtmlInAppMessageActionListener(bArr);
    }

    @Override // o.onOtherUrlActionlambda3
    public final void read(DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        defaultInAppMessageSlideupViewFactory.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(this.RatingCompat, i2, bArr[i2]);
        }
    }

    @Override // o.r8lambdaNXJu59tlXDpHSBddc_dxhEpRRuA, o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final void serializer(createInAppMessageViewlambda1 createinappmessageviewlambda1, int i, Object obj) {
        DefaultHtmlInAppMessageActionListener defaultHtmlInAppMessageActionListener = (DefaultHtmlInAppMessageActionListener) obj;
        defaultHtmlInAppMessageActionListener.getClass();
        defaultHtmlInAppMessageActionListener.RemoteActionCompatParcelizer(createinappmessageviewlambda1.write(this.RatingCompat, i));
    }

    @Override // o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k
    public final int write(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    public InAppMessageJavascriptInterfacerequestPushPermission1ExternalSyntheticLambda0(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        super(setgraphicmodalmaxwidthdp);
    }
}
