package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class onInstallReferrerSetupFinishedIntI implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final onInstallReferrerSetupFinishedIntI serializer;
    private static int write = 1;

    static {
        onInstallReferrerSetupFinishedIntI oninstallreferrersetupfinishedinti = new onInstallReferrerSetupFinishedIntI();
        serializer = oninstallreferrersetupfinishedinti;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.rider.state.provider.data.model.TermsAndConditions", oninstallreferrersetupfinishedinti, 1);
        oncloseactionlambda1.read("url", false);
        descriptor = oncloseactionlambda1;
        int i = write + 41;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 14 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 113;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer};
        int i4 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        retryI retryi = (retryI) obj;
        retryi.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, retryi.url);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        String strMediaMetadataCompat = null;
        while (true) {
            int i4 = 0;
            while (true) {
                if (!z) {
                    createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                    return new retryI(i4, strMediaMetadataCompat);
                }
                int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i5 != -1) {
                    int i6 = RemoteActionCompatParcelizer;
                    int i7 = i6 + 19;
                    IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (i5 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        return null;
                    }
                    int i9 = i6 + 75;
                    IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        break;
                    }
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 = 1;
                } else {
                    z = false;
                }
            }
            strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
        }
    }
}
