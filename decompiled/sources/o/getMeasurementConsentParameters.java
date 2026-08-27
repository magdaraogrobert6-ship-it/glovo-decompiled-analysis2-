package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.quests.data.QuestStatus;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getMeasurementConsentParameters implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final getMeasurementConsentParameters read;
    private static int serializer = 1;
    private static int write;

    static {
        getMeasurementConsentParameters getmeasurementconsentparameters = new getMeasurementConsentParameters();
        read = getmeasurementconsentparameters;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.rider.state.quests.data.QuestResponse", getmeasurementconsentparameters, 10);
        oncloseactionlambda1.read("quest_id", false);
        oncloseactionlambda1.read("quest_detail_url", false);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("icon_url", false);
        oncloseactionlambda1.read("time_frame", true);
        oncloseactionlambda1.read("quest_state", true);
        oncloseactionlambda1.read("status", false);
        oncloseactionlambda1.read("reward_tag", true);
        oncloseactionlambda1.read("earning", true);
        oncloseactionlambda1.read("progress", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 111;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 87;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getClickParameters.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(injectFeatureFlagsWithParameters.read), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(getDefaultActivityPackage.write)};
        int i4 = RemoteActionCompatParcelizer + 93;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getClickParameters getclickparameters = (getClickParameters) obj;
        getclickparameters.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getClickParameters.$childSerializers;
        String str = getclickparameters.questId;
        getEventSuffix geteventsuffix = getclickparameters.progress;
        String str2 = getclickparameters.earning;
        buildAttributionPackage buildattributionpackage = getclickparameters.rewardTag;
        String str3 = getclickparameters.questState;
        String str4 = getclickparameters.timeFrame;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, getclickparameters.questDetailUrl);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, getclickparameters.name);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getclickparameters.iconUrl);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str4 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), getclickparameters.status);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || buildattributionpackage != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, injectFeatureFlagsWithParameters.read, buildattributionpackage);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
            int i4 = RemoteActionCompatParcelizer + 121;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (geteventsuffix != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i6 = write + 31;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getDefaultActivityPackage.write, geteventsuffix);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        boolean z;
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getClickParameters.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        String str = null;
        getEventSuffix geteventsuffix = null;
        buildAttributionPackage buildattributionpackage = null;
        boolean z2 = true;
        QuestStatus questStatus = null;
        int i2 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        String str2 = null;
        String str3 = null;
        while (z2) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i3) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    boolean z3 = z2;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i2 |= 1;
                    int i4 = RemoteActionCompatParcelizer + 9;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    z2 = z3;
                    break;
                case 1:
                    z = z2;
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i2 |= 2;
                    int i6 = write + 85;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        int i7 = 5 / 3;
                    }
                    z2 = z;
                    break;
                case 2:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i2 |= 4;
                    break;
                case 3:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i2 |= 8;
                    break;
                case 4:
                    z = z2;
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i2 |= 16;
                    z2 = z;
                    break;
                case 5:
                    z = z2;
                    str3 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                    i2 |= 32;
                    z2 = z;
                    break;
                case 6:
                    z = z2;
                    questStatus = (QuestStatus) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), questStatus);
                    i2 |= 64;
                    z2 = z;
                    break;
                case 7:
                    z = z2;
                    buildattributionpackage = (buildAttributionPackage) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, injectFeatureFlagsWithParameters.read, buildattributionpackage);
                    i2 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    z2 = z;
                    break;
                case 8:
                    z = z2;
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i2 |= androidx.compose.ui.graphics.Fields.RotationX;
                    z2 = z;
                    break;
                case 9:
                    z = z2;
                    geteventsuffix = (getEventSuffix) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, getDefaultActivityPackage.write, geteventsuffix);
                    i2 |= androidx.compose.ui.graphics.Fields.RotationY;
                    z2 = z;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new getClickParameters(i2, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, str2, str3, questStatus, buildattributionpackage, str, geteventsuffix);
    }
}
