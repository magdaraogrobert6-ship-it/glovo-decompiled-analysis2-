package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class copyMaxDimensionsmsEJaDk implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    public static final copyMaxDimensionsmsEJaDk RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        copyMaxDimensionsmsEJaDk copymaxdimensionsmsejadk = new copyMaxDimensionsmsEJaDk();
        RemoteActionCompatParcelizer = copymaxdimensionsmsejadk;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem", copymaxdimensionsmsejadk, 15);
        oncloseactionlambda1.read("taskId", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("compression", false);
        oncloseactionlambda1.read("buttonIcon", false);
        oncloseactionlambda1.read("addIcon", false);
        oncloseactionlambda1.read("deleteIcon", false);
        oncloseactionlambda1.read("buttonText", false);
        oncloseactionlambda1.read("uploadedPath", false);
        oncloseactionlambda1.read("images", true);
        oncloseactionlambda1.read(MapboxMap.QFE_LIMIT, true);
        oncloseactionlambda1.read("imageOverlay", false);
        oncloseactionlambda1.read("overlayItems", false);
        oncloseactionlambda1.read("cameraTagsData", true);
        oncloseactionlambda1.read("isOptional", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 13;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 53;
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
        int i2 = write + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = accessgetLOREM_IPSUM_SOURCEp.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), afterclosed, afterclosed, afterclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), afterclosed, LazyKt__LazyJVMKt.read(ComposeUiUnitFlags.IconCompatParcelizer), LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper()), beforeinappmessageviewclosed, getWasCloseMessageCalled.write};
        int i4 = write + 115;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0090  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep = (accessgetLOREM_IPSUM_SOURCEp) obj;
        accessgetlorem_ipsum_sourcep.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = accessgetLOREM_IPSUM_SOURCEp.$childSerializers;
        String str = accessgetlorem_ipsum_sourcep.taskId;
        String str2 = accessgetlorem_ipsum_sourcep.cameraTagsData;
        int i4 = accessgetlorem_ipsum_sourcep.limit;
        List list = accessgetlorem_ipsum_sourcep.images;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, accessgetlorem_ipsum_sourcep.title);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, accessgetlorem_ipsum_sourcep.description);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), accessgetlorem_ipsum_sourcep.compression);
        defaultInAppMessageSlideupViewFactorySerializer.write(4, accessgetlorem_ipsum_sourcep.buttonIcon, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(5, accessgetlorem_ipsum_sourcep.addIcon, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(6, accessgetlorem_ipsum_sourcep.deleteIcon, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, accessgetlorem_ipsum_sourcep.buttonText);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, accessgetlorem_ipsum_sourcep.uploadedPath);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, instance_delegatelambda0.write}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || i4 != 1) {
            defaultInAppMessageSlideupViewFactorySerializer.write(10, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, ComposeUiUnitFlags.IconCompatParcelizer, accessgetlorem_ipsum_sourcep.imageOverlay);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper(), accessgetlorem_ipsum_sourcep.overlayItems);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, ""}, getCieXyz.write())).booleanValue()) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, accessgetlorem_ipsum_sourcep.isOptional);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i5 = read + 5;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13, str2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14, accessgetlorem_ipsum_sourcep.isOptional);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0083  */
    /* JADX WARN: Code duplicated, block: B:18:0x0091  */
    /* JADX WARN: Code duplicated, block: B:19:0x009a  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:31:0x0111  */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = accessgetLOREM_IPSUM_SOURCEp.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        Constraints constraints = null;
        boolean z = true;
        List list2 = null;
        int i4 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        List list3 = null;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        int iIconCompatParcelizer3 = 0;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        int iIconCompatParcelizer4 = 0;
        String strMediaMetadataCompat6 = null;
        boolean zWrite = false;
        while (z) {
            int i5 = read + 119;
            boolean z2 = z;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i6 = 26 / 0;
                switch (i) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        i2 = 0;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i4 |= 1;
                        break;
                    case 1:
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        list3 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list3);
                        i4 |= 8;
                        break;
                    case 4:
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        iIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                        i4 |= 64;
                        int i7 = read + 79;
                        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        break;
                    case 7:
                        strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                        i4 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        break;
                    case 8:
                        strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                        i4 |= androidx.compose.ui.graphics.Fields.RotationX;
                        break;
                    case 9:
                        list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), list2);
                        i4 |= androidx.compose.ui.graphics.Fields.RotationY;
                        break;
                    case 10:
                        iIconCompatParcelizer4 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10);
                        i4 |= androidx.compose.ui.graphics.Fields.RotationZ;
                        break;
                    case 11:
                        constraints = (Constraints) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, ComposeUiUnitFlags.IconCompatParcelizer, constraints);
                        i4 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                        break;
                    case 12:
                        list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper(), list);
                        i4 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                        break;
                    case 13:
                        strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13);
                        i4 |= 8192;
                        break;
                    case 14:
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14);
                        i4 |= androidx.compose.ui.graphics.Fields.Clip;
                        int i9 = write + 83;
                        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        return null;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                switch (i) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        i2 = 0;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i4 |= 1;
                        break;
                    case 1:
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        list3 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list3);
                        i4 |= 8;
                        break;
                    case 4:
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        iIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                        i4 |= 64;
                        int i11 = read + 79;
                        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        break;
                    case 7:
                        strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                        i4 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        break;
                    case 8:
                        strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                        i4 |= androidx.compose.ui.graphics.Fields.RotationX;
                        break;
                    case 9:
                        list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[9].MediaSessionCompatResultReceiverWrapper(), list2);
                        i4 |= androidx.compose.ui.graphics.Fields.RotationY;
                        break;
                    case 10:
                        iIconCompatParcelizer4 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10);
                        i4 |= androidx.compose.ui.graphics.Fields.RotationZ;
                        break;
                    case 11:
                        constraints = (Constraints) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, ComposeUiUnitFlags.IconCompatParcelizer, constraints);
                        i4 |= androidx.compose.ui.graphics.Fields.CameraDistance;
                        break;
                    case 12:
                        list = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 12, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[12].MediaSessionCompatResultReceiverWrapper(), list);
                        i4 |= androidx.compose.ui.graphics.Fields.TransformOrigin;
                        break;
                    case 13:
                        strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 13);
                        i4 |= 8192;
                        break;
                    case 14:
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 14);
                        i4 |= androidx.compose.ui.graphics.Fields.Clip;
                        int i13 = write + 83;
                        read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        return null;
                }
            }
            z = z2;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new accessgetLOREM_IPSUM_SOURCEp(i4, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, list3, iIconCompatParcelizer, iIconCompatParcelizer2, iIconCompatParcelizer3, strMediaMetadataCompat4, strMediaMetadataCompat5, list2, iIconCompatParcelizer4, constraints, list, strMediaMetadataCompat6, zWrite);
    }
}
