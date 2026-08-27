package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fastJoinToStringdefault implements getInAppMessageManager {
    public static final fastJoinToStringdefault IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        fastJoinToStringdefault fastjointostringdefault = new fastJoinToStringdefault();
        IconCompatParcelizer = fastjointostringdefault;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("expandable_button", fastjointostringdefault, 3);
        oncloseactionlambda1.read("icon", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("full_screen", false);
        descriptor = oncloseactionlambda1;
        int i = write + 19;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        int i = 2 % 2;
        int i2 = read + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            int i4 = 5 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        }
        int i5 = i3 + 99;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {shouldApplySecureFlag.RemoteActionCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, fastMapIndexedNotNull.read};
        int i4 = read + 25;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fastForEachReversed fastforeachreversed = (fastForEachReversed) obj;
        fastforeachreversed.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, shouldApplySecureFlag.RemoteActionCompatParcelizer, fastforeachreversed.iconToken);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, fastforeachreversed.title);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, fastMapIndexedNotNull.read, fastforeachreversed.fullscreenItem);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = RemoteActionCompatParcelizer + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        TagIconTokenV1 tagIconTokenV1 = null;
        String strMediaMetadataCompat = null;
        fastMapNotNull fastmapnotnull = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = RemoteActionCompatParcelizer + 93;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 == -1) {
                z = false;
            } else if (i5 != 0) {
                if (i5 != 1) {
                    int i6 = RemoteActionCompatParcelizer;
                    int i7 = i6 + 111;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (i5 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        return null;
                    }
                    int i9 = i6 + 125;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        fastmapnotnull = (fastMapNotNull) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, fastMapIndexedNotNull.read, fastmapnotnull);
                    } else {
                        fastmapnotnull = (fastMapNotNull) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, fastMapIndexedNotNull.read, fastmapnotnull);
                        i2 |= 4;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                }
                i2 |= 2;
            } else {
                tagIconTokenV1 = (TagIconTokenV1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, shouldApplySecureFlag.RemoteActionCompatParcelizer, tagIconTokenV1);
                i2 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        fastForEachReversed fastforeachreversed = new fastForEachReversed(i2, tagIconTokenV1, strMediaMetadataCompat, fastmapnotnull);
        int i10 = read + 37;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return fastforeachreversed;
        }
        throw null;
    }
}
