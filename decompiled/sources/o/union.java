package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.pudo.MessageBoxTypeToken;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class union implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final union RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        union unionVar = new union();
        RemoteActionCompatParcelizer = unionVar;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.MessageBoxUiItem", unionVar, 5);
        oncloseactionlambda1.read("icon", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.BODY_KEY, false);
        oncloseactionlambda1.read("button", false);
        oncloseactionlambda1.read("type", false);
        descriptor = oncloseactionlambda1;
        int i = write + 87;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 123;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 45;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = mapTreeWithStitching.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {LazyKt__LazyJVMKt.read(afterClosed.IconCompatParcelizer), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(getExitjXw82LU.read), onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper()};
        int i4 = serializer + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        mapTreeWithStitching maptreewithstitching = (mapTreeWithStitching) obj;
        maptreewithstitching.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = mapTreeWithStitching.$childSerializers;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, afterClosed.IconCompatParcelizer, maptreewithstitching.icon);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeinappmessageviewclosed, maptreewithstitching.title);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeinappmessageviewclosed, maptreewithstitching.body);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getExitjXw82LU.read, maptreewithstitching.button);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), maptreewithstitching.type);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 79;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:37:0x0056 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = mapTreeWithStitching.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i2 = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        ComposeAnimationState composeAnimationState = null;
        MessageBoxTypeToken messageBoxTypeToken = null;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i3 == -1) {
                z = false;
            } else if (i3 != 0) {
                int i4 = read;
                int i5 = i4 + 11;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i3 == 1) {
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i2 |= 2;
                } else if (i3 != 2) {
                    int i7 = i4 + 125;
                    serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        if (i3 == 5) {
                            composeAnimationState = (ComposeAnimationState) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getExitjXw82LU.read, composeAnimationState);
                            i2 |= 8;
                            int i8 = read + 89;
                            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                        } else {
                            if (i3 == 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                                return null;
                            }
                            messageBoxTypeToken = (MessageBoxTypeToken) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), messageBoxTypeToken);
                            i2 |= 16;
                        }
                    } else if (i3 == 3) {
                        composeAnimationState = (ComposeAnimationState) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getExitjXw82LU.read, composeAnimationState);
                        i2 |= 8;
                        int i10 = read + 89;
                        serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    } else {
                        if (i3 == 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                            return null;
                        }
                        messageBoxTypeToken = (MessageBoxTypeToken) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), messageBoxTypeToken);
                        i2 |= 16;
                    }
                } else {
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i2 |= 4;
                }
            } else {
                num = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, afterClosed.IconCompatParcelizer, num);
                i2 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new mapTreeWithStitching(i2, num, str, str2, composeAnimationState, messageBoxTypeToken);
    }
}
