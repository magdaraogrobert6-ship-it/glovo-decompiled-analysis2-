package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Settings6EWAqTQ implements getInAppMessageManager {
    public static final Settings6EWAqTQ IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        Settings6EWAqTQ settings6EWAqTQ = new Settings6EWAqTQ();
        IconCompatParcelizer = settings6EWAqTQ;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("timer_card", settings6EWAqTQ, 7);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, true);
        oncloseactionlambda1.read("required_steps", true);
        oncloseactionlambda1.read("timer_in_seconds", false);
        oncloseactionlambda1.read("disabled", true);
        oncloseactionlambda1.read("running", true);
        oncloseactionlambda1.read("completed", true);
        descriptor = oncloseactionlambda1;
        int i = write + 53;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 91;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = italic.$childSerializers;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        Setting setting = Setting.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), afterClosed.IconCompatParcelizer, LazyKt__LazyJVMKt.read(setting), LazyKt__LazyJVMKt.read(setting), LazyKt__LazyJVMKt.read(setting)};
        int i4 = serializer + 5;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0074  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        italic italicVar = (italic) obj;
        italicVar.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = italic.$childSerializers;
        String str = italicVar.id;
        FontVariation fontVariation = italicVar.completed;
        FontVariation fontVariation2 = italicVar.running;
        FontVariation fontVariation3 = italicVar.disabled;
        List list = italicVar.requiredSteps;
        String str2 = italicVar.title;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, str);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
            int i4 = RemoteActionCompatParcelizer + 41;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
            int i6 = serializer + 99;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            Object[] objArr = {list, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                int i8 = serializer + 99;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.write(3, italicVar.timerInSeconds, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || fontVariation3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, Setting.RemoteActionCompatParcelizer, fontVariation3);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || fontVariation2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, Setting.RemoteActionCompatParcelizer, fontVariation2);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || fontVariation != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, Setting.RemoteActionCompatParcelizer, fontVariation);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = italic.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i3 = serializer + 57;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = true;
        FontVariation fontVariation = null;
        int i5 = 0;
        String strMediaMetadataCompat = null;
        String str = null;
        List list = null;
        int iIconCompatParcelizer = 0;
        FontVariation fontVariation2 = null;
        FontVariation fontVariation3 = null;
        while (z) {
            int i6 = serializer + 29;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i8) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i5 |= 1;
                    continue;
                case 1:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i = i5 | 2;
                    break;
                case 2:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list);
                    i = i5 | 4;
                    int i9 = RemoteActionCompatParcelizer + 125;
                    serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    break;
                case 3:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i = i5 | 8;
                    break;
                case 4:
                    fontVariation2 = (FontVariation) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, Setting.RemoteActionCompatParcelizer, fontVariation2);
                    i = i5 | 16;
                    break;
                case 5:
                    fontVariation3 = (FontVariation) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, Setting.RemoteActionCompatParcelizer, fontVariation3);
                    i = i5 | 32;
                    break;
                case 6:
                    fontVariation = (FontVariation) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, Setting.RemoteActionCompatParcelizer, fontVariation);
                    i = i5 | 64;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i8);
                    return null;
            }
            i5 = i;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new italic(i5, strMediaMetadataCompat, str, list, iIconCompatParcelizer, fontVariation2, fontVariation3, fontVariation);
    }
}
