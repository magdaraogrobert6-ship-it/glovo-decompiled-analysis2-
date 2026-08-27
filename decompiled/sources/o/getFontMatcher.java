package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getFontMatcher implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final getFontMatcher serializer;
    private static int write;

    static {
        getFontMatcher getfontmatcher = new getFontMatcher();
        serializer = getfontmatcher;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.common.data.model.tasks.QrCodePaymentTask.QrPaymentScreen", getfontmatcher, 5);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("brand_icon", false);
        oncloseactionlambda1.read("close_button", true);
        oncloseactionlambda1.read("tracking_events", true);
        oncloseactionlambda1.read("success_message", false);
        descriptor = oncloseactionlambda1;
        int i = write + 69;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 49;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 29;
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
        int i2 = RemoteActionCompatParcelizer + 5;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = FontListFontFamilyTypefaceAdapterpreload321.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, shouldApplySecureFlag.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(PopupLayoutHelper.read), onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed};
        int i4 = RemoteActionCompatParcelizer + 39;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0070  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FontListFontFamilyTypefaceAdapterpreload321 fontListFontFamilyTypefaceAdapterpreload321 = (FontListFontFamilyTypefaceAdapterpreload321) obj;
        fontListFontFamilyTypefaceAdapterpreload321.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = FontListFontFamilyTypefaceAdapterpreload321.$childSerializers;
        String str = fontListFontFamilyTypefaceAdapterpreload321.title;
        List list = fontListFontFamilyTypefaceAdapterpreload321.trackingEvents;
        getDismissOnBackPress getdismissonbackpress = fontListFontFamilyTypefaceAdapterpreload321.closeButton;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, shouldApplySecureFlag.RemoteActionCompatParcelizer, fontListFontFamilyTypefaceAdapterpreload321.brandIcon);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getdismissonbackpress != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, PopupLayoutHelper.read, getdismissonbackpress);
            int i4 = IconCompatParcelizer + 1;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            Object[] objArr = {list, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, fontListFontFamilyTypefaceAdapterpreload321.successMessage);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i6 = IconCompatParcelizer + 81;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0036 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = FontListFontFamilyTypefaceAdapterpreload321.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        String strMediaMetadataCompat = null;
        TagIconTokenV1 tagIconTokenV1 = null;
        getDismissOnBackPress getdismissonbackpress = null;
        List list = null;
        String strMediaMetadataCompat2 = null;
        boolean z = true;
        int i2 = 0;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i3 == -1) {
                z = false;
            } else if (i3 != 0) {
                int i4 = RemoteActionCompatParcelizer + 25;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    if (i3 == 0) {
                        tagIconTokenV1 = (TagIconTokenV1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, shouldApplySecureFlag.RemoteActionCompatParcelizer, tagIconTokenV1);
                        i2 |= 2;
                    } else if (i3 != 2) {
                        getdismissonbackpress = (getDismissOnBackPress) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, PopupLayoutHelper.read, getdismissonbackpress);
                        i2 |= 4;
                    } else if (i3 != 3) {
                        list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
                        i2 |= 8;
                        int i5 = IconCompatParcelizer + 105;
                        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                    } else {
                        if (i3 == 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                            return null;
                        }
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                        i2 |= 16;
                    }
                } else if (i3 == 1) {
                    tagIconTokenV1 = (TagIconTokenV1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, shouldApplySecureFlag.RemoteActionCompatParcelizer, tagIconTokenV1);
                    i2 |= 2;
                } else if (i3 != 2) {
                    getdismissonbackpress = (getDismissOnBackPress) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, PopupLayoutHelper.read, getdismissonbackpress);
                    i2 |= 4;
                } else if (i3 != 3) {
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list);
                    i2 |= 8;
                    int i7 = IconCompatParcelizer + 105;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    if (i3 == 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                        return null;
                    }
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i2 |= 16;
                }
            } else {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i2 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new FontListFontFamilyTypefaceAdapterpreload321(i2, strMediaMetadataCompat, tagIconTokenV1, getdismissonbackpress, list, strMediaMetadataCompat2);
    }
}
