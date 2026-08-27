package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class filterByClosestWeightui_textdefault implements getInAppMessageManager {
    public static final filterByClosestWeightui_textdefault IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        filterByClosestWeightui_textdefault filterbyclosestweightui_textdefault = new filterByClosestWeightui_textdefault();
        IconCompatParcelizer = filterbyclosestweightui_textdefault;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("take_picture", filterbyclosestweightui_textdefault, 12);
        oncloseactionlambda1.read("id", true);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("required", false);
        oncloseactionlambda1.read("required_text", true);
        oncloseactionlambda1.read("upload_path", false);
        oncloseactionlambda1.read("action_title", false);
        oncloseactionlambda1.read("action_title_delete", false);
        oncloseactionlambda1.read("compression", true);
        oncloseactionlambda1.read("image_overlay", true);
        oncloseactionlambda1.read("image_overlay_v2", true);
        oncloseactionlambda1.read(MapboxMap.QFE_LIMIT, true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 101;
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
        int i2 = write + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 59;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = matchFontRetOiIg.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, getWasCloseMessageCalled.write, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(FontStyleCompanion.read), LazyKt__LazyJVMKt.read(getItalic_LCdwAannotations.IconCompatParcelizer), LazyKt__LazyJVMKt.read(afterClosed.IconCompatParcelizer)};
        int i4 = write + 63;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00df  */
    /* JADX WARN: Code duplicated, block: B:9:0x0050  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            matchFontRetOiIg matchfontretoiig = (matchFontRetOiIg) obj;
            matchfontretoiig.getClass();
            String str = matchfontretoiig.id;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = matchFontRetOiIg.$childSerializers;
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            throw null;
        }
        matchFontRetOiIg matchfontretoiig2 = (matchFontRetOiIg) obj;
        matchfontretoiig2.getClass();
        String str2 = matchfontretoiig2.id;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer2 = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr2 = matchFontRetOiIg.$childSerializers;
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer2.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, str2);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, "picture"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer2.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, str2);
            }
        }
        String str3 = matchfontretoiig2.title;
        Integer num = matchfontretoiig2.limit;
        getItalic_LCdwA getitalic_lcdwa = matchfontretoiig2.imageOverlayV2;
        filterByClosestWeightui_text filterbyclosestweightui_text = matchfontretoiig2.imageOverlay;
        List list = matchfontretoiig2.compression;
        String str4 = matchfontretoiig2.requiredText;
        defaultInAppMessageSlideupViewFactorySerializer2.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 1, str3);
        defaultInAppMessageSlideupViewFactorySerializer2.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 2, matchfontretoiig2.description);
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 3, matchfontretoiig2.required);
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || str4 != null) {
            defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
        }
        defaultInAppMessageSlideupViewFactorySerializer2.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 5, matchfontretoiig2.uploadPath);
        defaultInAppMessageSlideupViewFactorySerializer2.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 6, matchfontretoiig2.actionTitle);
        defaultInAppMessageSlideupViewFactorySerializer2.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 7, matchfontretoiig2.actionTitleDelete);
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[8].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            Object[] objArr = {DeviceFontFamilyName.read};
            int iSerializer = getQueryParameterslambda2.serializer();
            Object[] objArr2 = {list, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer)};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[8].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || filterbyclosestweightui_text != null) {
            defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 9, FontStyleCompanion.read, filterbyclosestweightui_text);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || getitalic_lcdwa != null) {
            defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 10, getItalic_LCdwAannotations.IconCompatParcelizer, getitalic_lcdwa);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || num != null) {
            defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 11, afterClosed.IconCompatParcelizer, num);
            int i3 = write + 51;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = read + 123;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = matchFontRetOiIg.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        Integer num = null;
        getItalic_LCdwA getitalic_lcdwa = null;
        filterByClosestWeightui_text filterbyclosestweightui_text = null;
        boolean z = true;
        List list = null;
        int i9 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        boolean zWrite = false;
        String str = null;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        String strMediaMetadataCompat6 = null;
        while (z) {
            int i10 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i10) {
                case -1:
                    z = false;
                    i5 = 2;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i = i9 | 1;
                    i9 = i;
                    z = z;
                    i5 = 2;
                    break;
                case 1:
                    z = z;
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i9 |= 2;
                    int i11 = write + 101;
                    read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    z = z;
                    i5 = 2;
                    break;
                case 2:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i5);
                    i = i9 | 4;
                    i9 = i;
                    z = z;
                    i5 = 2;
                    break;
                case 3:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i2 = i9 | 8;
                    i3 = read + 21;
                    write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i3 % 2;
                    i9 = i2;
                    z = z;
                    i5 = 2;
                    break;
                case 4:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i4 = i9 | 16;
                    i9 = i4;
                    z = z;
                    i5 = 2;
                    break;
                case 5:
                    z = z;
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                    i2 = i9 | 32;
                    i9 = i2;
                    z = z;
                    i5 = 2;
                    break;
                case 6:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                    i2 = i9 | 64;
                    i3 = read + 97;
                    write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i3 % 2;
                    i9 = i2;
                    z = z;
                    i5 = 2;
                    break;
                case 7:
                    z = z;
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                    i2 = i9 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i9 = i2;
                    z = z;
                    i5 = 2;
                    break;
                case 8:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[8].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 = i9 | androidx.compose.ui.graphics.Fields.RotationX;
                    i9 = i4;
                    z = z;
                    i5 = 2;
                    break;
                case 9:
                    filterbyclosestweightui_text = (filterByClosestWeightui_text) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, FontStyleCompanion.read, filterbyclosestweightui_text);
                    i4 = i9 | androidx.compose.ui.graphics.Fields.RotationY;
                    i9 = i4;
                    z = z;
                    i5 = 2;
                    break;
                case 10:
                    getitalic_lcdwa = (getItalic_LCdwA) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, getItalic_LCdwAannotations.IconCompatParcelizer, getitalic_lcdwa);
                    i4 = i9 | androidx.compose.ui.graphics.Fields.RotationZ;
                    i9 = i4;
                    z = z;
                    i5 = 2;
                    break;
                case 11:
                    num = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, afterClosed.IconCompatParcelizer, num);
                    i4 = i9 | androidx.compose.ui.graphics.Fields.CameraDistance;
                    i9 = i4;
                    z = z;
                    i5 = 2;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i10);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new matchFontRetOiIg(i9, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, zWrite, str, strMediaMetadataCompat4, strMediaMetadataCompat5, strMediaMetadataCompat6, list, filterbyclosestweightui_text, getitalic_lcdwa, num);
    }
}
