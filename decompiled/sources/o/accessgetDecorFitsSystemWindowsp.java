package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class accessgetDecorFitsSystemWindowsp implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final accessgetDecorFitsSystemWindowsp serializer;
    private static int write = 1;

    static {
        accessgetDecorFitsSystemWindowsp accessgetdecorfitssystemwindowsp = new accessgetDecorFitsSystemWindowsp();
        serializer = accessgetdecorfitssystemwindowsp;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.model.Analytics.Parameter", accessgetdecorfitssystemwindowsp, 2);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("value", false);
        descriptor = oncloseactionlambda1;
        int i = read + 85;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = write + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            return new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[3];
        beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed2;
        setgraphicmodalmaxwidthdpArr[1] = beforeinappmessageviewclosed2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getMaxDialogHeightExcludingInsets getmaxdialogheightexcludinginsets = (getMaxDialogHeightExcludingInsets) obj;
        getmaxdialogheightexcludinginsets.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getmaxdialogheightexcludinginsets.key);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, getmaxdialogheightexcludinginsets.value);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = RemoteActionCompatParcelizer + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        String strMediaMetadataCompat;
        String strMediaMetadataCompat2;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = write + 25;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            strMediaMetadataCompat2 = null;
            z = false;
            i = 1;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            strMediaMetadataCompat2 = null;
            i = 0;
            z = true;
        }
        while (z) {
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 != -1) {
                int i5 = RemoteActionCompatParcelizer + 65;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 62 / 0;
                    if (i4 == 0) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i |= 1;
                    } else {
                        if (i4 == 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                            return null;
                        }
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i |= 2;
                    }
                } else if (i4 == 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i |= 1;
                } else {
                    if (i4 == 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                        return null;
                    }
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i |= 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getMaxDialogHeightExcludingInsets(i, strMediaMetadataCompat, strMediaMetadataCompat2);
    }
}
