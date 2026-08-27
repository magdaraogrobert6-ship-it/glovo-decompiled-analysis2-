package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setFontAttributeslambda2 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final setFontAttributeslambda2 RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        setFontAttributeslambda2 setfontattributeslambda2 = new setFontAttributeslambda2();
        RemoteActionCompatParcelizer = setfontattributeslambda2;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.ontheway.routepreview.naver.data.model.NaverRoutePreviewResponse.Route", setfontattributeslambda2, 4);
        oncloseactionlambda1.read("from_id", false);
        oncloseactionlambda1.read("to_id", false);
        oncloseactionlambda1.read("point", false);
        oncloseactionlambda1.read("routes", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 41;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = write + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 59;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = setLineHeightKmRG4DE.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, AndroidViewHolderlayoutNode13.IconCompatParcelizer, onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper()};
        int i4 = write + 41;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setLineHeightKmRG4DE setlineheightkmrg4de = (setLineHeightKmRG4DE) obj;
        setlineheightkmrg4de.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = setLineHeightKmRG4DE.$childSerializers;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setlineheightkmrg4de.fromId);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setlineheightkmrg4de.toId);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, AndroidViewHolderlayoutNode13.IconCompatParcelizer, setlineheightkmrg4de.destination);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), setlineheightkmrg4de.coordinates);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 109;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = write + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = setLineHeightKmRG4DE.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = null;
        List list = null;
        int i4 = 0;
        boolean z = true;
        while (!(!z)) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 == -1) {
                z = false;
            } else if (i5 == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i4 |= 1;
            } else if (i5 == 1) {
                strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                i4 |= 2;
            } else if (i5 == 2) {
                androidViewHolderlayoutNode12 = (AndroidViewHolderlayoutNode12) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, AndroidViewHolderlayoutNode13.IconCompatParcelizer, androidViewHolderlayoutNode12);
                i4 |= 4;
                int i6 = serializer + 89;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                if (i5 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                    return null;
                }
                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
                i4 |= 8;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        setLineHeightKmRG4DE setlineheightkmrg4de = new setLineHeightKmRG4DE(i4, strMediaMetadataCompat, strMediaMetadataCompat2, androidViewHolderlayoutNode12, list);
        int i8 = write + 125;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return setlineheightkmrg4de;
    }
}
