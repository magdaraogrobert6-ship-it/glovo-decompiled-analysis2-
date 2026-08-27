package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.HttpHeaders;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PopupLayoutsnapshotStateObserver1 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final PopupLayoutsnapshotStateObserver1 RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        PopupLayoutsnapshotStateObserver1 popupLayoutsnapshotStateObserver1 = new PopupLayoutsnapshotStateObserver1();
        RemoteActionCompatParcelizer = popupLayoutsnapshotStateObserver1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.pudo.OrderStatusValue", popupLayoutsnapshotStateObserver1, 3);
        oncloseactionlambda1.read("text", false);
        oncloseactionlambda1.read("style", false);
        oncloseactionlambda1.read(HttpHeaders.DATE, true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 79;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        int i = 2 % 2;
        int i2 = write + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            int i4 = 94 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        }
        int i5 = i3 + 33;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed);
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[3];
            setgraphicmodalmaxwidthdpArr[1] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[1] = getExcludeFromSystemGesture.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr[5] = setgraphicmodalmaxwidthdp;
        } else {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed2, getExcludeFromSystemGesture.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed2)};
        }
        int i3 = write + 67;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 = (PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0) obj;
        popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        String str = popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.text;
        String str2 = popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.date;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, getExcludeFromSystemGesture.RemoteActionCompatParcelizer, popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.style);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
            int i4 = IconCompatParcelizer + 81;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i2 = 0;
        String strMediaMetadataCompat = null;
        TagColorToken tagColorToken = null;
        String str = null;
        boolean z = true;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i3 != -1) {
                int i4 = IconCompatParcelizer + 73;
                int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i5;
                if (i4 % 2 == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i2 |= 1;
                } else if (i3 == 1) {
                    tagColorToken = (TagColorToken) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, getExcludeFromSystemGesture.RemoteActionCompatParcelizer, tagColorToken);
                    i2 |= 2;
                } else {
                    if (i3 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                        return null;
                    }
                    int i6 = i5 + 69;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    str = (String) (i6 % 2 != 0 ? createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str) : createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str));
                    i2 |= 4;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 = new PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0(i2, strMediaMetadataCompat, tagColorToken, str);
        int i7 = write + 77;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return popupLayoutsnapshotStateObserver1ExternalSyntheticLambda0;
        }
        throw null;
    }
}
