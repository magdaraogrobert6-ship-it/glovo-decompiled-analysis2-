package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class loadExistingExtractions implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final loadExistingExtractions RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        loadExistingExtractions loadexistingextractions = new loadExistingExtractions();
        RemoteActionCompatParcelizer = loadexistingextractions;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.home.nest.api.data.StartTutorialData", loadexistingextractions, 3);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("subtitle", false);
        oncloseactionlambda1.read("action", false);
        descriptor = oncloseactionlambda1;
        int i = read + 107;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 14 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, getMultiDexPreferences.serializer};
        int i4 = write + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        putStoredApkInfo putstoredapkinfo = (putStoredApkInfo) obj;
        putstoredapkinfo.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, putstoredapkinfo.title);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, putstoredapkinfo.subtitle);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getMultiDexPreferences.serializer, putstoredapkinfo.action);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 97;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0034 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        getTimeStamp gettimestamp = null;
        int i4 = 0;
        boolean z = true;
        while (z) {
            int i5 = serializer + 7;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i6 = 9 / 0;
                if (i == -1) {
                    z = false;
                } else if (i != 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                } else if (i != 1) {
                    i2 = serializer + 17;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        if (i != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        gettimestamp = (getTimeStamp) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getMultiDexPreferences.serializer, gettimestamp);
                        i4 |= 4;
                    } else {
                        if (i != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        gettimestamp = (getTimeStamp) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getMultiDexPreferences.serializer, gettimestamp);
                        i4 |= 4;
                    }
                } else {
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i == -1) {
                    z = false;
                } else if (i != 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i4 |= 1;
                } else if (i != 1) {
                    i2 = serializer + 17;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        if (i != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        gettimestamp = (getTimeStamp) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getMultiDexPreferences.serializer, gettimestamp);
                        i4 |= 4;
                    } else {
                        if (i != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                            return null;
                        }
                        gettimestamp = (getTimeStamp) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getMultiDexPreferences.serializer, gettimestamp);
                        i4 |= 4;
                    }
                } else {
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new putStoredApkInfo(i4, strMediaMetadataCompat, strMediaMetadataCompat2, gettimestamp);
    }
}
