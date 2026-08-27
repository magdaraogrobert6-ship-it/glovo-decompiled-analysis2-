package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class InstallReferrerReadListener implements getInAppMessageManager {
    public static final InstallReferrerReadListener IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        InstallReferrerReadListener installReferrerReadListener = new InstallReferrerReadListener();
        IconCompatParcelizer = installReferrerReadListener;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.rider.state.provider.data.model.WorkOpportunityResponse", installReferrerReadListener, 5);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("type", false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("zone", false);
        oncloseactionlambda1.read("control_areas", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 61;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 9;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) startConnection.$childSerializers[4].MediaSessionCompatResultReceiverWrapper());
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LicenseData.read, setgraphicmodalmaxwidthdp};
        int i4 = RemoteActionCompatParcelizer + 43;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        startConnection startconnection = (startConnection) obj;
        startconnection.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = startConnection.$childSerializers;
        String str = startconnection.id;
        List list = startconnection.subzones;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, startconnection.type);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, startconnection.description);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, LicenseData.read, startconnection.workZone);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (list != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i4 = write + 125;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = startConnection.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i2 = 1;
        boolean z = true;
        int i3 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        InstallReferrer2 installReferrer2 = null;
        List list = null;
        while (z) {
            int i4 = write + 79;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                throw null;
            }
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = write;
                int i7 = i6 + 93;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (i5 != 0) {
                    int i9 = i6 + 107;
                    int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i10;
                    int i11 = i9 % 2;
                    if (i5 != i2) {
                        int i12 = i10 + 85;
                        write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i12 % 2 == 0 ? i5 == 2 : i5 == 2) {
                            strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                            i3 |= 4;
                        } else if (i5 != 3) {
                            int i13 = i10 + 47;
                            write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            if (i5 != 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                                return null;
                            }
                            int i15 = i10 + 71;
                            write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list);
                            i3 |= 16;
                        } else {
                            installReferrer2 = (InstallReferrer2) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, LicenseData.read, installReferrer2);
                            i3 |= 8;
                        }
                        i2 = 1;
                    } else {
                        int i17 = i2;
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i17);
                        i3 |= 2;
                        int i18 = write + 67;
                        RemoteActionCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i18 % 2 == 0) {
                            int i19 = 5 / 3;
                        }
                        i2 = i17;
                    }
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i3 |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new startConnection(i3, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, installReferrer2, list);
    }
}
