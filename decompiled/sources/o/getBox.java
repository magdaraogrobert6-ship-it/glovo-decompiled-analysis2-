package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getBox implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final getBox serializer;
    private static int write;

    static {
        getBox getbox = new getBox();
        serializer = getbox;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem", getbox, 13);
        oncloseactionlambda1.read("taskId", false);
        oncloseactionlambda1.read("isOptional", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("timerSeconds", false);
        oncloseactionlambda1.read("customerData", false);
        oncloseactionlambda1.read("dispatcherData", false);
        oncloseactionlambda1.read("cancelOrderData", false);
        oncloseactionlambda1.read("timerStartAction", false);
        oncloseactionlambda1.read("components", false);
        oncloseactionlambda1.read("trackingEvents", false);
        oncloseactionlambda1.read("componentIds", false);
        oncloseactionlambda1.read("taskState", true);
        descriptor = oncloseactionlambda1;
        int i = write + 103;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 121;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            int i4 = 61 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        }
        int i5 = i2 + 29;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = makeTreedefault.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, getWasCloseMessageCalled.write, beforeinappmessageviewclosed, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(afterClosed.IconCompatParcelizer), LazyKt__LazyJVMKt.read(getInlineClass.RemoteActionCompatParcelizer), LazyKt__LazyJVMKt.read(SlotTreeKt.serializer), LazyKt__LazyJVMKt.read(getFromDefault.write), LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper()), onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), fitPrioritizingWidthZbe2FdA.IconCompatParcelizer};
        int i4 = RemoteActionCompatParcelizer + 35;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        makeTreedefault maketreedefault = (makeTreedefault) obj;
        maketreedefault.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = makeTreedefault.$childSerializers;
        String str = maketreedefault.taskId;
        fixedHeightOenEA2s fixedheightoenea2s = maketreedefault.taskState;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, maketreedefault.isOptional);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, maketreedefault.title);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, maketreedefault.description);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, afterClosed.IconCompatParcelizer, maketreedefault.timerSeconds);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, getInlineClass.RemoteActionCompatParcelizer, maketreedefault.customerData);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, SlotTreeKt.serializer, maketreedefault.dispatcherData);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getFromDefault.write, maketreedefault.cancelOrderData);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), maketreedefault.timerStartAction);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), maketreedefault.components);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), maketreedefault.trackingEvents);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), maketreedefault.componentIds);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            Object[] objArr = {fixedheightoenea2s, new fixedHeightOenEA2s()};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i4 = read + 109;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, fitPrioritizingWidthZbe2FdA.IconCompatParcelizer, fixedheightoenea2s);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 1;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = makeTreedefault.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        fixedHeightOenEA2s fixedheightoenea2s = null;
        List list = null;
        getNoopState getnoopstate = null;
        ContextCache contextCache = null;
        getStable getstable = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        boolean zWrite = false;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        Integer num = null;
        r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i6) {
                case -1:
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    fixedheightoenea2s = fixedheightoenea2s;
                    z = false;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                case 0:
                    boolean z2 = z;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                    int i7 = RemoteActionCompatParcelizer + 35;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    list2 = list2;
                    z = z2;
                    fixedheightoenea2s = fixedheightoenea2s;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                case 1:
                    fixedheightoenea2s = fixedheightoenea2s;
                    z = z;
                    list2 = list2;
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                    list2 = list2;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    break;
                case 2:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i = i5 | 4;
                    i5 = i;
                    list2 = list2;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    break;
                case 3:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i = i5 | 8;
                    i5 = i;
                    list2 = list2;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    break;
                case 4:
                    num = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, afterClosed.IconCompatParcelizer, num);
                    i5 |= 16;
                    list2 = list2;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                case 5:
                    r8lambdakx1augmjk4nknxfqvyytyqzkc = (r8lambdakX1auGmjk4nKnxFqVYyTYqzkc) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, getInlineClass.RemoteActionCompatParcelizer, r8lambdakx1augmjk4nknxfqvyytyqzkc);
                    i5 |= 32;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                case 6:
                    getstable = (getStable) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, SlotTreeKt.serializer, getstable);
                    i5 |= 64;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                case 7:
                    contextCache = (ContextCache) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getFromDefault.write, contextCache);
                    i5 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                case 8:
                    getnoopstate = (getNoopState) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), getnoopstate);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationX;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                case 9:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), list);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationY;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                case 10:
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), list2);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                case 11:
                    list3 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[11].MediaSessionCompatResultReceiverWrapper(), list3);
                    i5 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                    z = z;
                    fixedheightoenea2s = fixedheightoenea2s;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                case 12:
                    boolean z3 = z;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    fixedheightoenea2s = (fixedHeightOenEA2s) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, fitPrioritizingWidthZbe2FdA.IconCompatParcelizer, fixedheightoenea2s);
                    i5 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                    int i9 = RemoteActionCompatParcelizer + 39;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    z = z3;
                    strMediaMetadataCompat3 = strMediaMetadataCompat3;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    return null;
            }
        }
        fixedHeightOenEA2s fixedheightoenea2s2 = fixedheightoenea2s;
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new makeTreedefault(i5, strMediaMetadataCompat, zWrite, strMediaMetadataCompat2, strMediaMetadataCompat3, num, r8lambdakx1augmjk4nknxfqvyytyqzkc, getstable, contextCache, getnoopstate, list, list2, list3, fixedheightoenea2s2);
    }
}
