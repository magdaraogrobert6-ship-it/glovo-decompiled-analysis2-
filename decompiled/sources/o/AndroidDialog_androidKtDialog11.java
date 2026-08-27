package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidDialog_androidKtDialog11 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final AndroidDialog_androidKtDialog11 RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        AndroidDialog_androidKtDialog11 androidDialog_androidKtDialog11 = new AndroidDialog_androidKtDialog11();
        RemoteActionCompatParcelizer = androidDialog_androidKtDialog11;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("payment", androidDialog_androidKtDialog11, 4);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, false);
        oncloseactionlambda1.read("formatted_amount", false);
        oncloseactionlambda1.read("payment_options", true);
        oncloseactionlambda1.read("new_design", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 17;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(AndroidDialog_androidKtDialogdialogId11.write);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed, setgraphicmodalmaxwidthdp, getWasCloseMessageCalled.write};
        int i4 = read + 81;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AndroidDialog_androidKtDialog3 androidDialog_androidKtDialog3 = (AndroidDialog_androidKtDialog3) obj;
        androidDialog_androidKtDialog3.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        String str = androidDialog_androidKtDialog3.title;
        boolean z = androidDialog_androidKtDialog3.newDesign;
        AndroidDialog_androidKtDialogLayout2 androidDialog_androidKtDialogLayout2 = androidDialog_androidKtDialog3.paymentOptions;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, androidDialog_androidKtDialog3.formattedAmount);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || androidDialog_androidKtDialogLayout2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, AndroidDialog_androidKtDialogdialogId11.write, androidDialog_androidKtDialogLayout2);
            int i4 = IconCompatParcelizer + 81;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, z);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x005c A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        String strMediaMetadataCompat;
        String strMediaMetadataCompat2;
        AndroidDialog_androidKtDialogLayout2 androidDialog_androidKtDialogLayout2;
        int i;
        boolean zWrite;
        boolean z;
        int i2 = 2 % 2;
        int i3 = read + 11;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            strMediaMetadataCompat2 = null;
            androidDialog_androidKtDialogLayout2 = null;
            z = true;
            i = 1;
            zWrite = true;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            strMediaMetadataCompat = null;
            strMediaMetadataCompat2 = null;
            androidDialog_androidKtDialogLayout2 = null;
            i = 0;
            zWrite = false;
            z = true;
        }
        while (!(!z)) {
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 == -1) {
                int i5 = IconCompatParcelizer + 27;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 3 / 5;
                }
                z = false;
            } else if (i4 != 0) {
                int i7 = read + 49;
                int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                IconCompatParcelizer = i8;
                if (i7 % 2 != 0) {
                    if (i4 == 0) {
                        strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i |= 2;
                    } else if (i4 != 2) {
                        int i9 = i8 + 51;
                        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        if (i4 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                            int i11 = IconCompatParcelizer + 9;
                            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            return null;
                        }
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i |= 8;
                    } else {
                        androidDialog_androidKtDialogLayout2 = (AndroidDialog_androidKtDialogLayout2) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, AndroidDialog_androidKtDialogdialogId11.write, androidDialog_androidKtDialogLayout2);
                        i |= 4;
                    }
                } else if (i4 == 1) {
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i |= 2;
                } else if (i4 != 2) {
                    int i13 = i8 + 51;
                    read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    if (i4 == 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                        int i15 = IconCompatParcelizer + 9;
                        read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        return null;
                    }
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i |= 8;
                } else {
                    androidDialog_androidKtDialogLayout2 = (AndroidDialog_androidKtDialogLayout2) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, AndroidDialog_androidKtDialogdialogId11.write, androidDialog_androidKtDialogLayout2);
                    i |= 4;
                }
            } else {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new AndroidDialog_androidKtDialog3(i, strMediaMetadataCompat, strMediaMetadataCompat2, androidDialog_androidKtDialogLayout2, zWrite);
    }
}
