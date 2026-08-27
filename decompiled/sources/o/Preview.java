package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Preview implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final Preview read;
    private static int serializer;
    private static int write;

    static {
        Preview preview = new Preview();
        read = preview;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.OfflineValidationUiItem", preview, 10);
        oncloseactionlambda1.read("pinSecret", false);
        oncloseactionlambda1.read("pinHash", false);
        oncloseactionlambda1.read("iterations", false);
        oncloseactionlambda1.read("outputLength", false);
        oncloseactionlambda1.read("successMessage", false);
        oncloseactionlambda1.read("errorMessage", false);
        oncloseactionlambda1.read("pinAttempts", false);
        oncloseactionlambda1.read("trackingEvents", false);
        oncloseactionlambda1.read("currentAttemptCount", true);
        oncloseactionlambda1.read("pinVerified", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 23;
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
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 27;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 73;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = apiLevel.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        union unionVar = union.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, afterclosed, afterclosed, unionVar, unionVar, PreviewFontScale.write, onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), afterclosed, getWasCloseMessageCalled.write};
        int i4 = write + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0072  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        apiLevel apilevel = (apiLevel) obj;
        apilevel.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = apiLevel.$childSerializers;
        String str = apilevel.pinSecret;
        boolean z = apilevel.pinVerified;
        int i2 = apilevel.currentAttemptCount;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, apilevel.pinHash);
        defaultInAppMessageSlideupViewFactorySerializer.write(2, apilevel.iterations, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.write(3, apilevel.outputLength, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        union unionVar = union.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, unionVar, apilevel.successMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, unionVar, apilevel.errorMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, PreviewFontScale.write, apilevel.pinAttempts);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), apilevel.trackingEvents);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (i2 != 0) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || !(!z)) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, z);
                int i3 = write + 87;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i5 = write + 15;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.write(8, i2, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, z);
            int i7 = write + 87;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, z);
            int i9 = write + 87;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = apiLevel.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        boolean z = true;
        C0212wallpaper c0212wallpaper = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        mapTreeWithStitching maptreewithstitching = null;
        mapTreeWithStitching maptreewithstitching2 = null;
        int iIconCompatParcelizer3 = 0;
        boolean zWrite = false;
        while (z) {
            int i6 = RemoteActionCompatParcelizer + 69;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                int i7 = 3 / 0;
                switch (i) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i2 = 0;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i5 |= 1;
                        break;
                    case 1:
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i3 = i5 | 4;
                        int i8 = RemoteActionCompatParcelizer + 103;
                        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        i5 = i3;
                        break;
                    case 3:
                        iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i3 = i5 | 8;
                        i5 = i3;
                        break;
                    case 4:
                        maptreewithstitching = (mapTreeWithStitching) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, union.RemoteActionCompatParcelizer, maptreewithstitching);
                        i3 = i5 | 16;
                        i5 = i3;
                        break;
                    case 5:
                        maptreewithstitching2 = (mapTreeWithStitching) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, union.RemoteActionCompatParcelizer, maptreewithstitching2);
                        i3 = i5 | 32;
                        i5 = i3;
                        break;
                    case 6:
                        c0212wallpaper = (C0212wallpaper) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, PreviewFontScale.write, c0212wallpaper);
                        i3 = i5 | 64;
                        i5 = i3;
                        break;
                    case 7:
                        list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), list);
                        i3 = i5 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        i5 = i3;
                        break;
                    case 8:
                        iIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                        i3 = i5 | androidx.compose.ui.graphics.Fields.RotationX;
                        i5 = i3;
                        break;
                    case 9:
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9);
                        i3 = i5 | androidx.compose.ui.graphics.Fields.RotationY;
                        i5 = i3;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        return null;
                }
            } else {
                i = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                switch (i) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i2 = 0;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2);
                        i5 |= 1;
                        break;
                    case 1:
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i3 = i5 | 4;
                        int i10 = RemoteActionCompatParcelizer + 103;
                        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        i5 = i3;
                        break;
                    case 3:
                        iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i3 = i5 | 8;
                        i5 = i3;
                        break;
                    case 4:
                        maptreewithstitching = (mapTreeWithStitching) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, union.RemoteActionCompatParcelizer, maptreewithstitching);
                        i3 = i5 | 16;
                        i5 = i3;
                        break;
                    case 5:
                        maptreewithstitching2 = (mapTreeWithStitching) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, union.RemoteActionCompatParcelizer, maptreewithstitching2);
                        i3 = i5 | 32;
                        i5 = i3;
                        break;
                    case 6:
                        c0212wallpaper = (C0212wallpaper) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, PreviewFontScale.write, c0212wallpaper);
                        i3 = i5 | 64;
                        i5 = i3;
                        break;
                    case 7:
                        list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[7].MediaSessionCompatResultReceiverWrapper(), list);
                        i3 = i5 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        i5 = i3;
                        break;
                    case 8:
                        iIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                        i3 = i5 | androidx.compose.ui.graphics.Fields.RotationX;
                        i5 = i3;
                        break;
                    case 9:
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9);
                        i3 = i5 | androidx.compose.ui.graphics.Fields.RotationY;
                        i5 = i3;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i);
                        return null;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new apiLevel(i5, strMediaMetadataCompat, strMediaMetadataCompat2, iIconCompatParcelizer, iIconCompatParcelizer2, maptreewithstitching, maptreewithstitching2, c0212wallpaper, list, iIconCompatParcelizer3, zWrite);
    }
}
