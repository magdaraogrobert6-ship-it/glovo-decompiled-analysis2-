package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaK3UlZhg_wLDjB_zNg_nf20Gn_jg implements getInAppMessageManager {
    public static final r8lambdaK3UlZhg_wLDjB_zNg_nf20Gn_jg IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        r8lambdaK3UlZhg_wLDjB_zNg_nf20Gn_jg r8lambdak3ulzhg_wldjb_zng_nf20gn_jg = new r8lambdaK3UlZhg_wLDjB_zNg_nf20Gn_jg();
        IconCompatParcelizer = r8lambdak3ulzhg_wldjb_zng_nf20gn_jg;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("expandable_button", r8lambdak3ulzhg_wldjb_zng_nf20gn_jg, 3);
        oncloseactionlambda1.read("icon", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("full_screen", false);
        descriptor = oncloseactionlambda1;
        int i = serializer + 107;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 87;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 67;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {shouldApplySecureFlag.RemoteActionCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdadOLub9xw1cu9O14smUUegIXXoGg.RemoteActionCompatParcelizer};
        int i4 = RemoteActionCompatParcelizer + 101;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda67LOklY1h_D1LCU6c2cXTguN0BQ r8lambda67lokly1h_d1lcu6c2cxtgun0bq = (r8lambda67LOklY1h_D1LCU6c2cXTguN0BQ) obj;
        r8lambda67lokly1h_d1lcu6c2cxtgun0bq.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, shouldApplySecureFlag.RemoteActionCompatParcelizer, r8lambda67lokly1h_d1lcu6c2cxtgun0bq.iconToken);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambda67lokly1h_d1lcu6c2cxtgun0bq.title);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdadOLub9xw1cu9O14smUUegIXXoGg.RemoteActionCompatParcelizer, r8lambda67lokly1h_d1lcu6c2cxtgun0bq.fullscreenItem);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = RemoteActionCompatParcelizer + 109;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        TagIconTokenV1 tagIconTokenV1 = null;
        String strMediaMetadataCompat = null;
        r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU r8lambdac8d6osnexuwibcq6nvlssc9dhou = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = RemoteActionCompatParcelizer + 87;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = RemoteActionCompatParcelizer;
                int i7 = i6 + 71;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (i5 == 0) {
                    tagIconTokenV1 = (TagIconTokenV1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, shouldApplySecureFlag.RemoteActionCompatParcelizer, tagIconTokenV1);
                    i2 |= 1;
                } else if (i5 != 1) {
                    int i9 = i6 + 41;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    if (i5 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        return null;
                    }
                    r8lambdac8d6osnexuwibcq6nvlssc9dhou = (r8lambdaC8d6OSNexuWIBCq6nVlsSc9DHoU) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdadOLub9xw1cu9O14smUUegIXXoGg.RemoteActionCompatParcelizer, r8lambdac8d6osnexuwibcq6nvlssc9dhou);
                    i2 |= 4;
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i2 |= 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new r8lambda67LOklY1h_D1LCU6c2cXTguN0BQ(i2, tagIconTokenV1, strMediaMetadataCompat, r8lambdac8d6osnexuwibcq6nvlssc9dhou);
    }
}
