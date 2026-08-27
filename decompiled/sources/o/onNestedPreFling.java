package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onNestedPreFling implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final onNestedPreFling read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        onNestedPreFling onnestedprefling = new onNestedPreFling();
        read = onnestedprefling;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.DestinationInfo.ScrollableComponent.LocationDetail.EntrancePicture.Picture.VoteRequest", onnestedprefling, 3);
        oncloseactionlambda1.read("url", false);
        oncloseactionlambda1.read("method", false);
        oncloseactionlambda1.read("payload", false);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = serializer + 123;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[3];
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[5] = r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc.serializer;
        } else {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed2, beforeinappmessageviewclosed2, r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc.serializer};
        }
        int i3 = serializer + 11;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onNestedScroll onnestedscroll = (onNestedScroll) obj;
        onnestedscroll.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, onnestedscroll.url);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, onnestedscroll.method);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc.serializer, onnestedscroll.payload);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 63;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x001d A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 85;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k = null;
        int i5 = 0;
        boolean z = true;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 == -1) {
                z = false;
            } else if (i6 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i5 |= 1;
            } else if (i6 != 1) {
                int i7 = write + 25;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    if (i6 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                        return null;
                    }
                    r8lambdaerwhggzq_gqgn8cultnvrcshm8k = (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc.serializer, r8lambdaerwhggzq_gqgn8cultnvrcshm8k);
                    i5 |= 4;
                    i = write + 15;
                    serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i8 = 5 / 3;
                    }
                } else {
                    if (i6 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                        return null;
                    }
                    r8lambdaerwhggzq_gqgn8cultnvrcshm8k = (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc.serializer, r8lambdaerwhggzq_gqgn8cultnvrcshm8k);
                    i5 |= 4;
                    i = write + 15;
                    serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i9 = 5 / 3;
                    }
                }
            } else {
                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                i5 |= 2;
                int i10 = write + 25;
                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new onNestedScroll(i5, strMediaMetadataCompat, strMediaMetadataCompat2, r8lambdaerwhggzq_gqgn8cultnvrcshm8k);
    }
}
