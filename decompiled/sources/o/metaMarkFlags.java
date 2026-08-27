package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class metaMarkFlags implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final metaMarkFlags read;
    private static int serializer;
    private static int write;

    static {
        metaMarkFlags metamarkflags = new metaMarkFlags();
        read = metamarkflags;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.country.config.api.model.CountryConfig", metamarkflags, 9);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("country_code", false);
        oncloseactionlambda1.read("country_iso_code", false);
        oncloseactionlambda1.read("brand", false);
        oncloseactionlambda1.read("currency", false);
        oncloseactionlambda1.read("url", false);
        oncloseactionlambda1.read("global_entity_id", false);
        oncloseactionlambda1.read("register_url", false);
        oncloseactionlambda1.read("privacy_policy_url", false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 97;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 57;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed)};
        int i4 = IconCompatParcelizer + 115;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks = (metaMarkUpdatedAndHasCallbacks) obj;
        metamarkupdatedandhascallbacks.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, metamarkupdatedandhascallbacks.name);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, metamarkupdatedandhascallbacks.countryCode);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, metamarkupdatedandhascallbacks.countryIsoCode);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, metamarkupdatedandhascallbacks.brand);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, metamarkupdatedandhascallbacks.currency);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, metamarkupdatedandhascallbacks.url);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, metamarkupdatedandhascallbacks.globalEntityId);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeinappmessageviewclosed, metamarkupdatedandhascallbacks.registerUrl);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeinappmessageviewclosed, metamarkupdatedandhascallbacks.privacyPolicyUrl);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 87;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 73;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i6 = write + 73;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        int i8 = 1;
        boolean z = true;
        String str = null;
        String str2 = null;
        int i9 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        String strMediaMetadataCompat6 = null;
        String strMediaMetadataCompat7 = null;
        while (!(!z)) {
            int i10 = IconCompatParcelizer + 79;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            int i12 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i12) {
                case -1:
                    i = i8;
                    z = false;
                    i8 = i;
                    break;
                case 0:
                    i = i8;
                    str = str;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i9 |= 1;
                    str = str;
                    i8 = i;
                    break;
                case 1:
                    i = i8;
                    str = str;
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
                    i9 |= 2;
                    str = str;
                    i8 = i;
                    break;
                case 2:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i2 = i9 | 4;
                    i9 = i2;
                    i = 1;
                    str = str;
                    i8 = i;
                    break;
                case 3:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i2 = i9 | 8;
                    i9 = i2;
                    i = 1;
                    str = str;
                    i8 = i;
                    break;
                case 4:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i2 = i9 | 16;
                    i9 = i2;
                    i = 1;
                    str = str;
                    i8 = i;
                    break;
                case 5:
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                    i2 = i9 | 32;
                    i9 = i2;
                    i = 1;
                    str = str;
                    i8 = i;
                    break;
                case 6:
                    strMediaMetadataCompat7 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                    i2 = i9 | 64;
                    int i13 = write + 85;
                    IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    i9 = i2;
                    i = 1;
                    str = str;
                    i8 = i;
                    break;
                case 7:
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i2 = i9 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i9 = i2;
                    i = 1;
                    str = str;
                    i8 = i;
                    break;
                case 8:
                    String str3 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    int i15 = i9 | androidx.compose.ui.graphics.Fields.RotationX;
                    int i16 = IconCompatParcelizer + 37;
                    write = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    str = str3;
                    i9 = i15;
                    i = 1;
                    str = str;
                    i8 = i;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i12);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new metaMarkUpdatedAndHasCallbacks(i9, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, strMediaMetadataCompat5, strMediaMetadataCompat6, strMediaMetadataCompat7, str2, str);
    }
}
