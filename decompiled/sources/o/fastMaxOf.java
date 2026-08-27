package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fastMaxOf implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final fastMaxOf serializer;
    private static int write = 1;

    static {
        fastMaxOf fastmaxof = new fastMaxOf();
        serializer = fastmaxof;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("deliveries_detail", fastmaxof, 8);
        oncloseactionlambda1.read("type", true);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("subtitle", true);
        oncloseactionlambda1.read("components", false);
        oncloseactionlambda1.read("deliveriesComponent", true);
        oncloseactionlambda1.read("deliveriesListComponent", true);
        oncloseactionlambda1.read("destinationInfoComponent", true);
        oncloseactionlambda1.read("mapComponent", true);
        descriptor = oncloseactionlambda1;
        int i = write + 121;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 61;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = fastCoerceAtMost.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(AndroidViewBindinglambda9.read), LazyKt__LazyJVMKt.read(AndroidViewHolderlayoutNode15measure1.write)};
        int i4 = read + 39;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier3;
        int i = 2;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = fastCoerceAtMost.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier4 = null;
        boolean z = true;
        AndroidViewBindinglambda00 androidViewBindinglambda00 = null;
        int i3 = 0;
        String str = null;
        String strMediaMetadataCompat = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (!(!z)) {
            int i4 = RemoteActionCompatParcelizer + 7;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % i;
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i6) {
                case -1:
                    androidViewHolderlayoutNode1coreModifier3 = androidViewHolderlayoutNode1coreModifier4;
                    z = false;
                    continue;
                    androidViewHolderlayoutNode1coreModifier4 = androidViewHolderlayoutNode1coreModifier3;
                    i = 2;
                    break;
                case 0:
                    androidViewHolderlayoutNode1coreModifier3 = androidViewHolderlayoutNode1coreModifier4;
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i3 |= 1;
                    continue;
                    androidViewHolderlayoutNode1coreModifier4 = androidViewHolderlayoutNode1coreModifier3;
                    i = 2;
                    break;
                case 1:
                    androidViewHolderlayoutNode1coreModifier3 = androidViewHolderlayoutNode1coreModifier4;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i3 |= 2;
                    continue;
                    androidViewHolderlayoutNode1coreModifier4 = androidViewHolderlayoutNode1coreModifier3;
                    i = 2;
                    break;
                case 2:
                    androidViewHolderlayoutNode1coreModifier3 = androidViewHolderlayoutNode1coreModifier4;
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i3 |= 4;
                    break;
                case 3:
                    androidViewHolderlayoutNode1coreModifier3 = androidViewHolderlayoutNode1coreModifier4;
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
                    i3 |= 8;
                    break;
                case 4:
                    androidViewHolderlayoutNode1coreModifier3 = androidViewHolderlayoutNode1coreModifier4;
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), list2);
                    i3 |= 16;
                    int i7 = RemoteActionCompatParcelizer + 35;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    break;
                case 5:
                    androidViewHolderlayoutNode1coreModifier3 = androidViewHolderlayoutNode1coreModifier4;
                    list3 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[5].MediaSessionCompatResultReceiverWrapper(), list3);
                    i3 |= 32;
                    break;
                case 6:
                    androidViewHolderlayoutNode1coreModifier3 = androidViewHolderlayoutNode1coreModifier4;
                    androidViewBindinglambda00 = (AndroidViewBindinglambda00) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, AndroidViewBindinglambda9.read, androidViewBindinglambda00);
                    i3 |= 64;
                    break;
                case 7:
                    AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier5 = (AndroidViewHolderlayoutNode1coreModifier3) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, AndroidViewHolderlayoutNode15measure1.write, androidViewHolderlayoutNode1coreModifier4);
                    i3 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    androidViewHolderlayoutNode1coreModifier3 = androidViewHolderlayoutNode1coreModifier5;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    return null;
            }
            androidViewHolderlayoutNode1coreModifier4 = androidViewHolderlayoutNode1coreModifier3;
            i = 2;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new fastCoerceAtMost(i3, str, strMediaMetadataCompat, str2, list, list2, list3, androidViewBindinglambda00, androidViewHolderlayoutNode1coreModifier4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:9:0x0052  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        Object next;
        Object next2;
        Object next3;
        List listIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = read + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            fastCoerceAtMost fastcoerceatmost = (fastCoerceAtMost) obj;
            fastcoerceatmost.getClass();
            String str = fastcoerceatmost.type;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = fastCoerceAtMost.$childSerializers;
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            throw null;
        }
        fastCoerceAtMost fastcoerceatmost2 = (fastCoerceAtMost) obj;
        fastcoerceatmost2.getClass();
        String str2 = fastcoerceatmost2.type;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer2 = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr2 = fastCoerceAtMost.$childSerializers;
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, "deliveries_detail"}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
            }
        }
        String str3 = fastcoerceatmost2.title;
        AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier3 = fastcoerceatmost2.mapComponent;
        AndroidViewBindinglambda00 androidViewBindinglambda00 = fastcoerceatmost2.destinationInfoComponent;
        List list = fastcoerceatmost2.deliveriesListComponent;
        List list2 = fastcoerceatmost2.deliveriesComponent;
        String str4 = fastcoerceatmost2.subtitle;
        List list3 = fastcoerceatmost2.components;
        defaultInAppMessageSlideupViewFactorySerializer2.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 1, str3);
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || str4 != null) {
            defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
        }
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[3].MediaSessionCompatResultReceiverWrapper(), list3);
        boolean z = defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        List list4 = instance_delegatelambda0.write;
        if (z) {
            defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[4].MediaSessionCompatResultReceiverWrapper(), list2);
        } else {
            Iterator it = list3.iterator();
            do {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                int i3 = RemoteActionCompatParcelizer + 17;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                next3 = it.next();
            } while (!(next3 instanceof fastAll));
            fastAll fastall = (fastAll) next3;
            if (fastall != null) {
                int i5 = read + 7;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                listIconCompatParcelizer = fastall.IconCompatParcelizer();
            } else {
                listIconCompatParcelizer = null;
            }
            if (listIconCompatParcelizer == null) {
                int i7 = read + 67;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                listIconCompatParcelizer = list4;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list2, listIconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[4].MediaSessionCompatResultReceiverWrapper(), list2);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[5].MediaSessionCompatResultReceiverWrapper(), list);
            int i9 = RemoteActionCompatParcelizer + 117;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            Iterator it2 = list3.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!(next2 instanceof AndroidViewBindingKt));
            AndroidViewBindingKt androidViewBindingKt = (AndroidViewBindingKt) next2;
            List list5 = androidViewBindingKt != null ? androidViewBindingKt.read() : null;
            if (list5 != null) {
                list4 = list5;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, list4}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 5, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[5].MediaSessionCompatResultReceiverWrapper(), list);
                int i11 = RemoteActionCompatParcelizer + 117;
                read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 6, AndroidViewBindinglambda9.read, androidViewBindinglambda00);
        } else {
            Iterator it3 = list3.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                int i13 = RemoteActionCompatParcelizer + 17;
                read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    boolean z2 = it3.next() instanceof AndroidViewBindinglambda00;
                    obj2.hashCode();
                    throw null;
                }
                next = it3.next();
            } while (!(next instanceof AndroidViewBindinglambda00));
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{androidViewBindinglambda00, (AndroidViewBindinglambda00) next}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 6, AndroidViewBindinglambda9.read, androidViewBindinglambda00);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 7, AndroidViewHolderlayoutNode15measure1.write, androidViewHolderlayoutNode1coreModifier3);
        } else {
            for (Object obj3 : list3) {
                if (obj3 instanceof AndroidViewHolderlayoutNode1coreModifier3) {
                    obj2 = obj3;
                    break;
                }
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{androidViewHolderlayoutNode1coreModifier3, (AndroidViewHolderlayoutNode1coreModifier3) obj2}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 7, AndroidViewHolderlayoutNode15measure1.write, androidViewHolderlayoutNode1coreModifier3);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
    }
}
