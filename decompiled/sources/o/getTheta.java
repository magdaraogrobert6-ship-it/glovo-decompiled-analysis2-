package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.persistence.cache.CacheData;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes4.dex */
public final class getTheta implements getInAppMessageManager {
    public final /* synthetic */ setGraphicModalMaxWidthDp IconCompatParcelizer;
    public final /* synthetic */ onCloseActionlambda1 write;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{this.IconCompatParcelizer, onDismissed.write};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.write;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = this.write;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        long jSerializer = 0;
        boolean z = true;
        int i = 0;
        Object objIconCompatParcelizer = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, this.IconCompatParcelizer, objIconCompatParcelizer);
                i |= 1;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                jSerializer = createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 1);
                i |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new CacheData(jSerializer, i, objIconCompatParcelizer);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        CacheData cacheData = (CacheData) obj;
        cacheData.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = this.write;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        CacheData.read(cacheData, defaultInAppMessageSlideupViewFactorySerializer, oncloseactionlambda1, this.IconCompatParcelizer);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return new setGraphicModalMaxWidthDp[]{this.IconCompatParcelizer};
    }

    public getTheta(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.persistence.cache.CacheData", this, 2);
        oncloseactionlambda1.read(RemoteMessageConst.DATA, false);
        final String[] strArr = {RemoteMessageConst.DATA, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY};
        oncloseactionlambda1.IconCompatParcelizer(new r8lambdaXNVkurBk5ihN67JvNZdyPWNMsNw() { // from class: o.r8lambdaOMHAsUSS0yMKXHeP18ZhpEuXXfY
            @Override // o.r8lambdaXNVkurBk5ihN67JvNZdyPWNMsNw
            public final /* synthetic */ String[] read() {
                return strArr;
            }
        });
        oncloseactionlambda1.read("expiryDateInSeconds", false);
        final String[] strArr2 = {"expiryDateInSeconds", "b"};
        oncloseactionlambda1.IconCompatParcelizer(new r8lambdaXNVkurBk5ihN67JvNZdyPWNMsNw() { // from class: o.r8lambdaOMHAsUSS0yMKXHeP18ZhpEuXXfY
            @Override // o.r8lambdaXNVkurBk5ihN67JvNZdyPWNMsNw
            public final /* synthetic */ String[] read() {
                return strArr2;
            }
        });
        this.write = oncloseactionlambda1;
        this.IconCompatParcelizer = setgraphicmodalmaxwidthdp;
    }
}
