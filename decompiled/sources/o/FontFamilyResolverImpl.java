package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import fwfd.com.fwfsdk.constant.FWFConstants;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FontFamilyResolverImpl implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final FontFamilyResolverImpl read;
    private static int serializer = 1;
    private static int write;

    static {
        FontFamilyResolverImpl fontFamilyResolverImpl = new FontFamilyResolverImpl();
        read = fontFamilyResolverImpl;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("date_picker", fontFamilyResolverImpl, 11);
        oncloseactionlambda1.read("id", true);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("description", false);
        oncloseactionlambda1.read("date_picker_title", false);
        oncloseactionlambda1.read("selection_text", false);
        oncloseactionlambda1.read("required", false);
        oncloseactionlambda1.read("min_age", true);
        oncloseactionlambda1.read("date_validation", true);
        oncloseactionlambda1.read(FWFConstants.EXPLANATION_TYPE_ERROR, false);
        oncloseactionlambda1.read("error_title", false);
        oncloseactionlambda1.read("edit_action_title", false);
        descriptor = oncloseactionlambda1;
        int i = write + 103;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 25;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(afterClosed.IconCompatParcelizer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read(r8lambdaQeb1b_Sm9krOS8DzOqWH4OENd3I.serializer);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed, getWasCloseMessageCalled.write, setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2, beforeinappmessageviewclosed, beforeinappmessageviewclosed, beforeinappmessageviewclosed};
        int i4 = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    /* JADX WARN: Code duplicated, block: B:9:0x004a  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI r8lambda9qm9dzbhose2hc4fmynbl__d5zi = (r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI) obj;
            r8lambda9qm9dzbhose2hc4fmynbl__d5zi.getClass();
            String str = r8lambda9qm9dzbhose2hc4fmynbl__d5zi.id;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda).read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            throw null;
        }
        r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI r8lambda9qm9dzbhose2hc4fmynbl__d5zi2 = (r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI) obj;
        r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.getClass();
        String str2 = r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.id;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, str2);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, "date_picker"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, str2);
            }
        }
        String str3 = r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.title;
        FontFamilyKt fontFamilyKt = r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.dateValidation;
        Integer num = r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.minimumAge;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 1, str3);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 2, r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.description);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 3, r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.datePickerTitle);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 4, r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.selectionPlaceHolder);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 5, r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.required);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            if (num != null) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || fontFamilyKt != null) {
                defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 7, r8lambdaQeb1b_Sm9krOS8DzOqWH4OENd3I.serializer, fontFamilyKt);
            }
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 8, r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.errorMessage);
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 9, r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.errorTitle);
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 10, r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.editDateText);
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        }
        int i3 = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 6, afterClosed.IconCompatParcelizer, num);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 7, r8lambdaQeb1b_Sm9krOS8DzOqWH4OENd3I.serializer, fontFamilyKt);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 7, r8lambdaQeb1b_Sm9krOS8DzOqWH4OENd3I.serializer, fontFamilyKt);
        }
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 8, r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.errorMessage);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 9, r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.errorTitle);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 10, r8lambda9qm9dzbhose2hc4fmynbl__d5zi2.editDateText);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        FontFamilyKt fontFamilyKt = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        String strMediaMetadataCompat2 = null;
        String strMediaMetadataCompat3 = null;
        String strMediaMetadataCompat4 = null;
        String strMediaMetadataCompat5 = null;
        boolean zWrite = false;
        Integer num = null;
        String strMediaMetadataCompat6 = null;
        String strMediaMetadataCompat7 = null;
        String strMediaMetadataCompat8 = null;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i6) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i = i5 | 1;
                    break;
                case 1:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i = i5 | 2;
                    break;
                case 2:
                    strMediaMetadataCompat3 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i = i5 | 4;
                    break;
                case 3:
                    strMediaMetadataCompat4 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i = i5 | 8;
                    break;
                case 4:
                    strMediaMetadataCompat5 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i = i5 | 16;
                    break;
                case 5:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                    i = i5 | 32;
                    break;
                case 6:
                    num = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, afterClosed.IconCompatParcelizer, num);
                    i = i5 | 64;
                    break;
                case 7:
                    fontFamilyKt = (FontFamilyKt) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, r8lambdaQeb1b_Sm9krOS8DzOqWH4OENd3I.serializer, fontFamilyKt);
                    i = i5 | androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                case 8:
                    strMediaMetadataCompat6 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationX;
                    continue;
                case 9:
                    strMediaMetadataCompat7 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationY;
                    int i7 = RemoteActionCompatParcelizer + 13;
                    IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    continue;
                case 10:
                    strMediaMetadataCompat8 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10);
                    i5 |= androidx.compose.ui.graphics.Fields.RotationZ;
                    continue;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    int i9 = IconCompatParcelizer + 53;
                    RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        return null;
                    }
                    int i10 = 82 / 0;
                    return null;
            }
            i5 = i;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI(i5, strMediaMetadataCompat, strMediaMetadataCompat2, strMediaMetadataCompat3, strMediaMetadataCompat4, strMediaMetadataCompat5, zWrite, num, fontFamilyKt, strMediaMetadataCompat6, strMediaMetadataCompat7, strMediaMetadataCompat8);
    }
}
