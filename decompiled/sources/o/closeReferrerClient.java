package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class closeReferrerClient implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final closeReferrerClient serializer;
    private static int write = 1;

    static {
        closeReferrerClient closereferrerclient = new closeReferrerClient();
        serializer = closereferrerclient;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.rider.state.provider.data.model.ShiftResponse", closereferrerclient, 9);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("started_at", false);
        oncloseactionlambda1.read("ended_at", false);
        oncloseactionlambda1.read("zone", false);
        oncloseactionlambda1.read("zone_id", false);
        oncloseactionlambda1.read("bonus_multiplier", true);
        oncloseactionlambda1.read("bonus_types", true);
        oncloseactionlambda1.read("calendar_enabled", true);
        oncloseactionlambda1.read("metadata", true);
        descriptor = oncloseactionlambda1;
        int i = write + 37;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 19;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 63;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        InstallReferrer installReferrer = (InstallReferrer) obj;
        installReferrer.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        InstallReferrer.serializer(installReferrer, defaultInAppMessageSlideupViewFactorySerializer, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 71;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1ArrRemoteActionCompatParcelizer = InstallReferrer.RemoteActionCompatParcelizer();
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1ArrRemoteActionCompatParcelizer[6].MediaSessionCompatResultReceiverWrapper());
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = LazyKt__LazyJVMKt.read(getWasCloseMessageCalled.write);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp4 = LazyKt__LazyJVMKt.read(sendSdkClick.write);
        onDismissed ondismissed = onDismissed.write;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {ondismissed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, getResponseCode.RemoteActionCompatParcelizer, ondismissed, setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2, setgraphicmodalmaxwidthdp3, setgraphicmodalmaxwidthdp4};
        int i4 = IconCompatParcelizer + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = read + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1ArrRemoteActionCompatParcelizer = InstallReferrer.RemoteActionCompatParcelizer();
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = 1;
        long jSerializer = 0;
        long jSerializer2 = 0;
        IRunActivityHandler iRunActivityHandler = null;
        String str = null;
        List list = null;
        Boolean bool = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        InstallReferrer1 installReferrer1 = null;
        for (int i6 = 1; (i4 ^ 1) != i6; i6 = 1) {
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i7) {
                case -1:
                    int i8 = read + 125;
                    IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i4 = 0;
                    break;
                case 0:
                    jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                    break;
                case 1:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i6);
                    i5 |= 2;
                    break;
                case 2:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i5 |= 4;
                    break;
                case 3:
                    installReferrer1 = (InstallReferrer1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getResponseCode.RemoteActionCompatParcelizer, installReferrer1);
                    i5 |= 8;
                    break;
                case 4:
                    i5 |= 16;
                    jSerializer2 = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    break;
                case 5:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i5 |= 32;
                    break;
                case 6:
                    list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1ArrRemoteActionCompatParcelizer[6].MediaSessionCompatResultReceiverWrapper(), list);
                    i5 |= 64;
                    break;
                case 7:
                    bool = (Boolean) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getWasCloseMessageCalled.write, bool);
                    i5 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                case 8:
                    iRunActivityHandler = (IRunActivityHandler) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, sendSdkClick.write, iRunActivityHandler);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationX;
                    int i10 = read + 19;
                    IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new InstallReferrer(i5, jSerializer, strMediaMetadataCompat, strMediaMetadataCompat2, installReferrer1, jSerializer2, str, list, bool, iRunActivityHandler);
    }
}
