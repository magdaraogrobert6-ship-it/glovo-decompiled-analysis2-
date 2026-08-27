package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getStringInstallReferrer implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    public static final getStringInstallReferrer write;

    static {
        getStringInstallReferrer getstringinstallreferrer = new getStringInstallReferrer();
        write = getstringinstallreferrer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.rider.state.provider.data.model.Status", getstringinstallreferrer, 4);
        oncloseactionlambda1.read("status", false);
        oncloseactionlambda1.read("status_text", false);
        oncloseactionlambda1.read("description", true);
        oncloseactionlambda1.read("action", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 99;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            int i4 = 59 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        }
        int i5 = i2 + 5;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {createProxyInstallReferrerStateListener.$childSerializers[0].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(getReferrerClickTimestampServerSeconds.RemoteActionCompatParcelizer)};
        int i4 = read + 11;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        createProxyInstallReferrerStateListener createproxyinstallreferrerstatelistener = (createProxyInstallReferrerStateListener) obj;
        createproxyinstallreferrerstatelistener.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) createProxyInstallReferrerStateListener.$childSerializers[0].MediaSessionCompatResultReceiverWrapper();
        isTrackingEnabled istrackingenabled = createproxyinstallreferrerstatelistener.type;
        getInstallReferrerStateListenerClass getinstallreferrerstatelistenerclass = createproxyinstallreferrerstatelistener.action;
        String str = createproxyinstallreferrerstatelistener.description;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdp, istrackingenabled);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, createproxyinstallreferrerstatelistener.text);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (str != null) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getinstallreferrerstatelistenerclass != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getReferrerClickTimestampServerSeconds.RemoteActionCompatParcelizer, getinstallreferrerstatelistenerclass);
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i2 = read + 105;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = RemoteActionCompatParcelizer + 59;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getReferrerClickTimestampServerSeconds.RemoteActionCompatParcelizer, getinstallreferrerstatelistenerclass);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getReferrerClickTimestampServerSeconds.RemoteActionCompatParcelizer, getinstallreferrerstatelistenerclass);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i6 = read + 105;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x003d A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = createProxyInstallReferrerStateListener.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        isTrackingEnabled istrackingenabled = null;
        String strMediaMetadataCompat = null;
        String str = null;
        getInstallReferrerStateListenerClass getinstallreferrerstatelistenerclass = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i3 != -1) {
                int i4 = read + 75;
                int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i5;
                int i6 = i4 % 2;
                if (i3 != 0) {
                    int i7 = i5 + 33;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        if (i3 == 1) {
                            strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                            i2 |= 2;
                            int i8 = RemoteActionCompatParcelizer + 77;
                            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                        } else if (i3 != 2) {
                            str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                            i2 |= 4;
                        } else {
                            if (i3 == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                                return null;
                            }
                            getinstallreferrerstatelistenerclass = (getInstallReferrerStateListenerClass) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getReferrerClickTimestampServerSeconds.RemoteActionCompatParcelizer, getinstallreferrerstatelistenerclass);
                            i2 |= 8;
                        }
                    } else if (i3 == 1) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i2 |= 2;
                        int i10 = RemoteActionCompatParcelizer + 77;
                        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    } else if (i3 != 2) {
                        str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                        i2 |= 4;
                    } else {
                        if (i3 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                            return null;
                        }
                        getinstallreferrerstatelistenerclass = (getInstallReferrerStateListenerClass) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getReferrerClickTimestampServerSeconds.RemoteActionCompatParcelizer, getinstallreferrerstatelistenerclass);
                        i2 |= 8;
                    }
                } else {
                    istrackingenabled = (isTrackingEnabled) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), istrackingenabled);
                    i2 |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new createProxyInstallReferrerStateListener(i2, istrackingenabled, strMediaMetadataCompat, str, getinstallreferrerstatelistenerclass);
    }
}
