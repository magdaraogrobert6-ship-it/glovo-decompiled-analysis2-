package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getLayoutManager implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    public static final getLayoutManager write;

    static {
        getLayoutManager getlayoutmanager = new getLayoutManager();
        write = getlayoutmanager;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.home.state.entity.HomeResponseItem", getlayoutmanager, 2);
        oncloseactionlambda1.read("status_code", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.BODY_KEY, false);
        descriptor = oncloseactionlambda1;
        int i = read + 5;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 99 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[4];
            setgraphicmodalmaxwidthdpArr[1] = afterClosed.IconCompatParcelizer;
            setgraphicmodalmaxwidthdpArr[1] = r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer;
        } else {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{afterClosed.IconCompatParcelizer, r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer};
        }
        int i3 = serializer + 85;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getMaxFlingVelocity getmaxflingvelocity = (getMaxFlingVelocity) obj;
        getmaxflingvelocity.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(0, getmaxflingvelocity.statusCode, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer, getmaxflingvelocity.jsonBody);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = RemoteActionCompatParcelizer + 63;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x003c A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = null;
        int i5 = 0;
        int iIconCompatParcelizer = 0;
        boolean z = true;
        while (z) {
            int i6 = RemoteActionCompatParcelizer + 79;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i7 = 55 / 0;
                if (i != -1) {
                    i2 = RemoteActionCompatParcelizer;
                    int i8 = i2 + 95;
                    serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    if (i != 0) {
                        i3 = i2 + 25;
                        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            if (i != 1) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                return null;
                            }
                            swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer, swipeDismissTouchListenerVerticalDismissDirection);
                            i5 |= 2;
                        } else {
                            if (i != 1) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                return null;
                            }
                            swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer, swipeDismissTouchListenerVerticalDismissDirection);
                            i5 |= 2;
                        }
                    } else {
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i5 |= 1;
                    }
                } else {
                    z = false;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (i != -1) {
                    i2 = RemoteActionCompatParcelizer;
                    int i10 = i2 + 95;
                    serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (i != 0) {
                        i3 = i2 + 25;
                        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            if (i != 1) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                return null;
                            }
                            swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer, swipeDismissTouchListenerVerticalDismissDirection);
                            i5 |= 2;
                        } else {
                            if (i != 1) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                                return null;
                            }
                            swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambda2svec8wazNIYAk5Hq146H0SPIb4.IconCompatParcelizer, swipeDismissTouchListenerVerticalDismissDirection);
                            i5 |= 2;
                        }
                    } else {
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                        i5 |= 1;
                    }
                } else {
                    z = false;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getMaxFlingVelocity(i5, iIconCompatParcelizer, swipeDismissTouchListenerVerticalDismissDirection);
    }
}
