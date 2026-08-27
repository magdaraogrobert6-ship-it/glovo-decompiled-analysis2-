package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidPopup_androidKtPopuppopupLayout111121 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final AndroidPopup_androidKtPopuppopupLayout111121 read;
    private static int serializer;
    private static int write;

    static {
        AndroidPopup_androidKtPopuppopupLayout111121 androidPopup_androidKtPopuppopupLayout111121 = new AndroidPopup_androidKtPopuppopupLayout111121();
        read = androidPopup_androidKtPopuppopupLayout111121;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("preferences", androidPopup_androidKtPopuppopupLayout111121, 9);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, true);
        oncloseactionlambda1.read("description", true);
        oncloseactionlambda1.read("is_shift_ending", true);
        oncloseactionlambda1.read("state_on_text", true);
        oncloseactionlambda1.read("state_off_text", true);
        oncloseactionlambda1.read("state_paused_text", true);
        oncloseactionlambda1.read("details", true);
        oncloseactionlambda1.read("push_message", true);
        oncloseactionlambda1.read("dialog_message", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 63;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 58 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        int i3 = 80 / 0;
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), getWasCloseMessageCalled.write, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(AndroidPopup_androidKtSimpleStack113.serializer), LazyKt__LazyJVMKt.read(getMaxDialogHeightExcludingSystemBarInsets.read), LazyKt__LazyJVMKt.read(AndroidPopup_androidKtSimpleStack112.serializer)};
        int i4 = RemoteActionCompatParcelizer + 97;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        Api21Impl api21Impl;
        int i = 2;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        Api21Impl api21Impl2 = null;
        boolean z = true;
        getSystemBarsHeight getsystembarsheight = null;
        int i3 = 0;
        String str = null;
        String str2 = null;
        boolean zWrite = false;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        AndroidPopup_androidKtSimpleStack111 androidPopup_androidKtSimpleStack111 = null;
        while (!(!z)) {
            int i4 = RemoteActionCompatParcelizer + 39;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % i != 0) {
                Object obj = null;
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                obj.hashCode();
                throw null;
            }
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i5) {
                case -1:
                    api21Impl = api21Impl2;
                    z = false;
                    continue;
                    api21Impl2 = api21Impl;
                    i = 2;
                    break;
                case 0:
                    api21Impl = api21Impl2;
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i3 |= 1;
                    continue;
                    api21Impl2 = api21Impl;
                    i = 2;
                    break;
                case 1:
                    api21Impl = api21Impl2;
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i3 |= 2;
                    continue;
                    api21Impl2 = api21Impl;
                    i = 2;
                    break;
                case 2:
                    api21Impl = api21Impl2;
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
                    i3 |= 4;
                    break;
                case 3:
                    api21Impl = api21Impl2;
                    str3 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                    i3 |= 8;
                    break;
                case 4:
                    api21Impl = api21Impl2;
                    str4 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
                    i3 |= 16;
                    break;
                case 5:
                    api21Impl = api21Impl2;
                    str5 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
                    i3 |= 32;
                    break;
                case 6:
                    api21Impl = api21Impl2;
                    androidPopup_androidKtSimpleStack111 = (AndroidPopup_androidKtSimpleStack111) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, AndroidPopup_androidKtSimpleStack113.serializer, androidPopup_androidKtSimpleStack111);
                    i3 |= 64;
                    break;
                case 7:
                    api21Impl = api21Impl2;
                    getsystembarsheight = (getSystemBarsHeight) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getMaxDialogHeightExcludingSystemBarInsets.read, getsystembarsheight);
                    i3 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                case 8:
                    Api21Impl api21Impl3 = (Api21Impl) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, AndroidPopup_androidKtSimpleStack112.serializer, api21Impl2);
                    i3 |= androidx.compose.ui.graphics.Fields.RotationX;
                    api21Impl = api21Impl3;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                    return null;
            }
            api21Impl2 = api21Impl;
            i = 2;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        AndroidPopup_androidKtPopupTestTag1 androidPopup_androidKtPopupTestTag1 = new AndroidPopup_androidKtPopupTestTag1(i3, str, str2, zWrite, str3, str4, str5, androidPopup_androidKtSimpleStack111, getsystembarsheight, api21Impl2);
        int i6 = RemoteActionCompatParcelizer + 55;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % i;
        return androidPopup_androidKtPopupTestTag1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AndroidPopup_androidKtPopupTestTag1 androidPopup_androidKtPopupTestTag1 = (AndroidPopup_androidKtPopupTestTag1) obj;
        androidPopup_androidKtPopupTestTag1.getClass();
        Api21Impl api21Impl = androidPopup_androidKtPopupTestTag1.dialogMessage;
        getSystemBarsHeight getsystembarsheight = androidPopup_androidKtPopupTestTag1.pushMessage;
        AndroidPopup_androidKtSimpleStack111 androidPopup_androidKtSimpleStack111 = androidPopup_androidKtPopupTestTag1.details;
        String str = androidPopup_androidKtPopupTestTag1.statePausedText;
        String str2 = androidPopup_androidKtPopupTestTag1.stateOffText;
        String str3 = androidPopup_androidKtPopupTestTag1.stateOnText;
        boolean z = androidPopup_androidKtPopupTestTag1.isShiftEnding;
        String str4 = androidPopup_androidKtPopupTestTag1.description;
        String str5 = androidPopup_androidKtPopupTestTag1.title;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str5 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str4 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, z);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || androidPopup_androidKtSimpleStack111 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, AndroidPopup_androidKtSimpleStack113.serializer, androidPopup_androidKtSimpleStack111);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || getsystembarsheight != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getMaxDialogHeightExcludingSystemBarInsets.read, getsystembarsheight);
            int i4 = write + 125;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || api21Impl != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, AndroidPopup_androidKtSimpleStack112.serializer, api21Impl);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
