package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FocusGroupPropertiesNodeonEnter1 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    public static final FocusGroupPropertiesNodeonEnter1 write;

    static {
        FocusGroupPropertiesNodeonEnter1 focusGroupPropertiesNodeonEnter1 = new FocusGroupPropertiesNodeonEnter1();
        write = focusGroupPropertiesNodeonEnter1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.state.StateV3.AcceptData.DeclineConfirmationV2", focusGroupPropertiesNodeonEnter1, 8);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("current_acceptance_rate", false);
        oncloseactionlambda1.read("reduced_delta", false);
        oncloseactionlambda1.read("acceptance_rate_after_decline", true);
        oncloseactionlambda1.read("action_confirm", false);
        oncloseactionlambda1.read("action_accept", false);
        oncloseactionlambda1.read("decline_details", false);
        oncloseactionlambda1.read("accept_details", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 39;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = setFocusedChild.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, afterclosed, afterclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, beforeinappmessageviewclosed, accessonFocusStateChange.IconCompatParcelizer, onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper()};
        int i4 = RemoteActionCompatParcelizer + 29;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setFocusedChild setfocusedchild = (setFocusedChild) obj;
        setfocusedchild.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = setFocusedChild.$childSerializers;
        String str = setfocusedchild.title;
        String str2 = setfocusedchild.acceptanceRateAfterDecline;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.write(1, setfocusedchild.currentAcceptanceRate, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(2, setfocusedchild.reducedDelta, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (str2 != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, setfocusedchild.actionConfirm);
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, setfocusedchild.actionAccept);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, accessonFocusStateChange.IconCompatParcelizer, setfocusedchild.declineDetails);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), setfocusedchild.acceptDetails);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i4 = read + 115;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        int i6 = RemoteActionCompatParcelizer + 9;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, setfocusedchild.actionConfirm);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, setfocusedchild.actionAccept);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, accessonFocusStateChange.IconCompatParcelizer, setfocusedchild.declineDetails);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), setfocusedchild.acceptDetails);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = setFocusedChild.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        boolean z = true;
        FocusTargetInteropElement focusTargetInteropElement = null;
        int i3 = 0;
        String strMediaMetadataCompat = null;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        String str = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        while (z) {
            int i4 = read + 31;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i6) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i = i3 | 1;
                    break;
                case 1:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i = i3 | 2;
                    int i7 = RemoteActionCompatParcelizer + 91;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    break;
                case 2:
                    iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i = i3 | 4;
                    break;
                case 3:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i = i3 | 8;
                    break;
                case 4:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i = i3 | 16;
                    break;
                case 5:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                    i = i3 | 32;
                    break;
                case 6:
                    focusTargetInteropElement = (FocusTargetInteropElement) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, accessonFocusStateChange.IconCompatParcelizer, focusTargetInteropElement);
                    i = i3 | 64;
                    break;
                case 7:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), list);
                    i = i3 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    return null;
            }
            i3 = i;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        setFocusedChild setfocusedchild = new setFocusedChild(i3, strMediaMetadataCompat, iIconCompatParcelizer, iIconCompatParcelizer2, str, strMediaMetadataCompat2, strMediaMetadataCompat3, focusTargetInteropElement, list);
        int i9 = RemoteActionCompatParcelizer + 17;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            int i10 = 62 / 0;
        }
        return setfocusedchild;
    }
}
