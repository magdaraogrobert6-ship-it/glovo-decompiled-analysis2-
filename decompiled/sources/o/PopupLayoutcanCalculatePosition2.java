package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PopupLayoutcanCalculatePosition2 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    public static final PopupLayoutcanCalculatePosition2 write;

    static {
        PopupLayoutcanCalculatePosition2 popupLayoutcanCalculatePosition2 = new PopupLayoutcanCalculatePosition2();
        write = popupLayoutcanCalculatePosition2;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.pudo.OrderStatusCountdownData", popupLayoutcanCalculatePosition2, 2);
        oncloseactionlambda1.read("condition", false);
        oncloseactionlambda1.read("value", false);
        descriptor = oncloseactionlambda1;
        int i = serializer + 41;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 119;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i2 + 73;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {PopupLayoutWhenMappings.read, PopupLayoutsnapshotStateObserver1.RemoteActionCompatParcelizer};
        int i4 = IconCompatParcelizer + 21;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PopupLayoutupdatePosition1 popupLayoutupdatePosition1 = (PopupLayoutupdatePosition1) obj;
        popupLayoutupdatePosition1.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, PopupLayoutWhenMappings.read, popupLayoutupdatePosition1.condition);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, PopupLayoutsnapshotStateObserver1.RemoteActionCompatParcelizer, popupLayoutupdatePosition1.value);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 113;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = read + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        PopupLayoutCompaniononCommitAffectingPopupPosition1 popupLayoutCompaniononCommitAffectingPopupPosition1 = null;
        PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 = null;
        int i4 = 0;
        boolean z = true;
        while (z) {
            int i5 = read + 51;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                throw null;
            }
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 != -1) {
                int i7 = IconCompatParcelizer;
                int i8 = i7 + 15;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    throw null;
                }
                if (i6 != 0) {
                    int i9 = i7 + 111;
                    int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i10;
                    int i11 = i9 % 2;
                    if (i6 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                        return null;
                    }
                    int i12 = i10 + 69;
                    IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 = (PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, PopupLayoutsnapshotStateObserver1.RemoteActionCompatParcelizer, popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0);
                        i4 |= 5;
                    } else {
                        popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 = (PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, PopupLayoutsnapshotStateObserver1.RemoteActionCompatParcelizer, popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0);
                        i4 |= 2;
                    }
                } else {
                    popupLayoutCompaniononCommitAffectingPopupPosition1 = (PopupLayoutCompaniononCommitAffectingPopupPosition1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, PopupLayoutWhenMappings.read, popupLayoutCompaniononCommitAffectingPopupPosition1);
                    i4 |= 1;
                    int i13 = IconCompatParcelizer + 57;
                    read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new PopupLayoutupdatePosition1(i4, popupLayoutCompaniononCommitAffectingPopupPosition1, popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0);
    }
}
