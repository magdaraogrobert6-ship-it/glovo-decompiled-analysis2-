package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getGlobalAsyncTypefaceCache implements getInAppMessageManager {
    public static final getGlobalAsyncTypefaceCache IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        getGlobalAsyncTypefaceCache getglobalasynctypefacecache = new getGlobalAsyncTypefaceCache();
        IconCompatParcelizer = getglobalasynctypefacecache;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("overlay_instruction", getglobalasynctypefacecache, 3);
        oncloseactionlambda1.read("icon", true);
        oncloseactionlambda1.read("text", false);
        oncloseactionlambda1.read("config", true);
        descriptor = oncloseactionlambda1;
        int i = read + 27;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {LazyKt__LazyJVMKt.read(shouldApplySecureFlag.RemoteActionCompatParcelizer), beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(FontFamilyResolver_androidKt.serializer)};
        int i4 = serializer + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getGlobalTypefaceRequestCache getglobaltypefacerequestcache = (getGlobalTypefaceRequestCache) obj;
            getglobaltypefacerequestcache.getClass();
            TagIconTokenV1 tagIconTokenV1 = getglobaltypefacerequestcache.icon;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda).read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            throw null;
        }
        getGlobalTypefaceRequestCache getglobaltypefacerequestcache2 = (getGlobalTypefaceRequestCache) obj;
        getglobaltypefacerequestcache2.getClass();
        TagIconTokenV1 tagIconTokenV2 = getglobaltypefacerequestcache2.icon;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || tagIconTokenV2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, shouldApplySecureFlag.RemoteActionCompatParcelizer, tagIconTokenV2);
        }
        String str = getglobaltypefacerequestcache2.text;
        emptyCacheFontFamilyResolver emptycachefontfamilyresolver = getglobaltypefacerequestcache2.config;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 1, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || emptycachefontfamilyresolver != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 2, FontFamilyResolver_androidKt.serializer, emptycachefontfamilyresolver);
            int i3 = serializer + 93;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i2 = serializer + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TagIconTokenV1 tagIconTokenV1 = null;
        String strMediaMetadataCompat = null;
        emptyCacheFontFamilyResolver emptycachefontfamilyresolver = null;
        int i4 = 0;
        boolean z = true;
        while (!(!z)) {
            int i5 = write + 89;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 != -1) {
                int i8 = serializer;
                int i9 = i8 + 75;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i7 != 0) {
                    int i11 = i8 + 83;
                    write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        if (i7 == 0) {
                            strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i4 |= 2;
                        } else {
                            if (i7 == 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                                return null;
                            }
                            emptycachefontfamilyresolver = (emptyCacheFontFamilyResolver) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, FontFamilyResolver_androidKt.serializer, emptycachefontfamilyresolver);
                            i4 |= 4;
                        }
                    } else if (i7 == 1) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i4 |= 2;
                    } else {
                        if (i7 == 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                            return null;
                        }
                        emptycachefontfamilyresolver = (emptyCacheFontFamilyResolver) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, FontFamilyResolver_androidKt.serializer, emptycachefontfamilyresolver);
                        i4 |= 4;
                    }
                } else {
                    tagIconTokenV1 = (TagIconTokenV1) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, shouldApplySecureFlag.RemoteActionCompatParcelizer, tagIconTokenV1);
                    i4 |= 1;
                    int i12 = write + 89;
                    serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getGlobalTypefaceRequestCache(i4, tagIconTokenV1, strMediaMetadataCompat, emptycachefontfamilyresolver);
    }
}
