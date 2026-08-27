package o;

import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class handleVerticalActionUp implements setGraphicModalMaxWidthDp {
    public static final handleVerticalActionUp serializer = new handleVerticalActionUp();
    public static final DefaultInAppMessageWebViewClientListenerCompanion RemoteActionCompatParcelizer = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.uuid.Uuid", DefaultInAppMessageModalViewFactory.RatingCompat);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y r8lambdacimonvyvlsic_dsu4kbdtue1h9y = (r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y) obj;
        r8lambdacimonvyvlsic_dsu4kbdtue1h9y.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(r8lambdacimonvyvlsic_dsu4kbdtue1h9y.toString());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        strResultReceiver.getClass();
        int length = strResultReceiver.length();
        if (length == 32) {
            return BrazeInAppMessageManagerunregisterInAppMessageManager3.RemoteActionCompatParcelizer(strResultReceiver);
        }
        if (length == 36) {
            return BrazeInAppMessageManagerunregisterInAppMessageManager3.serializer(strResultReceiver);
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(strResultReceiver.length(), BrazeInAppMessageManagerunregisterInAppMessageManager3.write(strResultReceiver), "\" of length ", "Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
        return null;
    }
}
