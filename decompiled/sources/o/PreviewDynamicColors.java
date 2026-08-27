package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PreviewDynamicColors implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read;
    public static final PreviewDynamicColors serializer;
    private static int write;

    static {
        PreviewDynamicColors previewDynamicColors = new PreviewDynamicColors();
        serializer = previewDynamicColors;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.PinValidationTaskUiItem", previewDynamicColors, 11);
        oncloseactionlambda1.read("taskId", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("numDigits", false);
        oncloseactionlambda1.read("pinFieldTitle", false);
        oncloseactionlambda1.read("enteredPin", false);
        oncloseactionlambda1.read("errors", false);
        oncloseactionlambda1.read("errorMessage", false);
        oncloseactionlambda1.read("isOptional", false);
        oncloseactionlambda1.read("offlineValidation", true);
        oncloseactionlambda1.read("offlineValidationStatus", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 27;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 73;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i2 + 115;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = PreviewLightDark.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, afterClosed.IconCompatParcelizer, beforeinappmessageviewclosed, indexToBitOffset.write, onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed, getWasCloseMessageCalled.write, LazyKt__LazyJVMKt.read(Preview.read), onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper()};
        int i4 = RemoteActionCompatParcelizer + 19;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PreviewLightDark previewLightDark = (PreviewLightDark) obj;
        previewLightDark.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = PreviewLightDark.$childSerializers;
        String str = previewLightDark.taskId;
        getWEAR_OS_LARGE_ROUNDannotations getwear_os_large_roundannotations = previewLightDark.offlineValidationStatus;
        apiLevel apilevel = previewLightDark.offlineValidation;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, previewLightDark.title);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, previewLightDark.description);
        defaultInAppMessageSlideupViewFactorySerializer.write(3, previewLightDark.numDigits, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, previewLightDark.pinFieldTitle);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, indexToBitOffset.write, previewLightDark.enteredPin);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), previewLightDark.errors);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, previewLightDark.errorMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, previewLightDark.isOptional);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || apilevel != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, Preview.read, apilevel);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            Object[] objArr = {getwear_os_large_roundannotations, AndroidUiModes.INSTANCE};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i4 = write + 105;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), getwear_os_large_roundannotations);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 83;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = PreviewLightDark.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        getWEAR_OS_LARGE_ROUNDannotations getwear_os_large_roundannotations = null;
        apiLevel apilevel = null;
        boolean z = true;
        Map map = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        int iIconCompatParcelizer = 0;
        String strMediaMetadataCompat4 = null;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = null;
        String strMediaMetadataCompat5 = null;
        boolean zWrite = false;
        while (z) {
            int i6 = RemoteActionCompatParcelizer + 89;
            boolean z2 = z;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i8) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                    i = write + 49;
                    RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i % 2;
                    z = z2;
                    break;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                    z = z2;
                    break;
                case 2:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i5 |= 4;
                    z = z2;
                    break;
                case 3:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i5 |= 8;
                    z = z2;
                    break;
                case 4:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i5 |= 16;
                    i = write + 73;
                    RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i % 2;
                    z = z2;
                    break;
                case 5:
                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, indexToBitOffset.write, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                    i5 |= 32;
                    z = z2;
                    break;
                case 6:
                    map = (Map) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[6].MediaSessionCompatResultReceiverWrapper(), map);
                    i5 |= 64;
                    i = RemoteActionCompatParcelizer + 59;
                    write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i % 2;
                    z = z2;
                    break;
                case 7:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                    i5 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    z = z2;
                    break;
                case 8:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationX;
                    z = z2;
                    break;
                case 9:
                    apilevel = (apiLevel) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, Preview.read, apilevel);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationY;
                    z = z2;
                    break;
                case 10:
                    getwear_os_large_roundannotations = (getWEAR_OS_LARGE_ROUNDannotations) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[10].MediaSessionCompatResultReceiverWrapper(), getwear_os_large_roundannotations);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    z = z2;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i8);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new PreviewLightDark(i5, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, iIconCompatParcelizer, strMediaMetadataCompat4, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, map, strMediaMetadataCompat5, zWrite, apilevel, getwear_os_large_roundannotations);
    }
}
