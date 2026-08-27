package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaUifwJT5DPVd3p01R7jJ_bUXcVg implements getInAppMessageManager {
    public static final /* synthetic */ onCloseActionlambda1 IconCompatParcelizer;
    public static final r8lambdaUifwJT5DPVd3p01R7jJ_bUXcVg write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return IconCompatParcelizer;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        r8lambdaUifwJT5DPVd3p01R7jJ_bUXcVg r8lambdauifwjt5dpvd3p01r7jj_buxcvg = new r8lambdaUifwJT5DPVd3p01R7jJ_bUXcVg();
        write = r8lambdauifwjt5dpvd3p01r7jj_buxcvg;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.sentiance.visitessentials.OSMTypeMapping", r8lambdauifwjt5dpvd3p01r7jj_buxcvg, 5);
        oncloseactionlambda1.read("order_id", false);
        oncloseactionlambda1.read("internal_type", false);
        oncloseactionlambda1.read("business_type", false);
        oncloseactionlambda1.read("tod_model", false);
        oncloseactionlambda1.read("dur_model", false);
        IconCompatParcelizer = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = IconCompatParcelizer;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM.f;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        int iIconCompatParcelizer = 0;
        Object objIconCompatParcelizer = null;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0);
                i |= 1;
            } else if (i2 == 1) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 1);
                i |= 2;
            } else if (i2 == 2) {
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 2, setgraphicmodalmaxwidthdpArr[2], objIconCompatParcelizer);
                i |= 4;
            } else if (i2 == 3) {
                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 3);
                i |= 8;
            } else {
                if (i2 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 4);
                i |= 16;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM(i, iIconCompatParcelizer, strMediaMetadataCompat, (List) objIconCompatParcelizer, strMediaMetadataCompat2, strMediaMetadataCompat3);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM r8lambdab0isqpsb2j3nkxpxcm79mddzdtm = (r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM) obj;
        r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = IconCompatParcelizer;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM.f;
        defaultInAppMessageSlideupViewFactorySerializer.write(0, r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.a, oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.b);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 2, setgraphicmodalmaxwidthdpArr[2], r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.c);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 3, r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.d);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 4, r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.e);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM.f[2];
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{afterClosed.IconCompatParcelizer, beforeinappmessageviewclosed, setgraphicmodalmaxwidthdp, beforeinappmessageviewclosed, beforeinappmessageviewclosed};
    }
}
