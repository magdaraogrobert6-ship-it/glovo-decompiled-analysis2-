package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaivE2RM1mml2A9H2IkVxUz0Ay7OU implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final r8lambdaivE2RM1mml2A9H2IkVxUz0Ay7OU serializer;
    private static int write = 1;

    static {
        r8lambdaivE2RM1mml2A9H2IkVxUz0Ay7OU r8lambdaive2rm1mml2a9h2ikvxuz0ay7ou = new r8lambdaivE2RM1mml2A9H2IkVxUz0Ay7OU();
        serializer = r8lambdaive2rm1mml2a9h2ikvxuz0ay7ou;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("menu_item", r8lambdaive2rm1mml2a9h2ikvxuz0ay7ou, 6);
        oncloseactionlambda1.read("new_tag", true);
        oncloseactionlambda1.read("label", false);
        oncloseactionlambda1.read("logo", true);
        oncloseactionlambda1.read("link", false);
        oncloseactionlambda1.read("analytics", false);
        oncloseactionlambda1.read("unread_count", true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 49;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, r8lambdahCzl79tp_ropVRUma4k6vsEoRgU.RemoteActionCompatParcelizer, LazyKt__LazyJVMKt.read(afterClosed.IconCompatParcelizer)};
        int i4 = read + 63;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM r8lambdainxoipjdmwnizvqtkwsij_9trm = (r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM) obj;
        r8lambdainxoipjdmwnizvqtkwsij_9trm.getClass();
        String str = r8lambdainxoipjdmwnizvqtkwsij_9trm.newTag;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        String str2 = r8lambdainxoipjdmwnizvqtkwsij_9trm.label;
        Integer num = r8lambdainxoipjdmwnizvqtkwsij_9trm.unreadCount;
        String str3 = r8lambdainxoipjdmwnizvqtkwsij_9trm.logo;
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, str2);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        }
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, r8lambdainxoipjdmwnizvqtkwsij_9trm.link);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, r8lambdahCzl79tp_ropVRUma4k6vsEoRgU.RemoteActionCompatParcelizer, r8lambdainxoipjdmwnizvqtkwsij_9trm.analytics);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (num != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i4 = IconCompatParcelizer + 39;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, afterClosed.IconCompatParcelizer, num);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = read + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String str = null;
        String strMediaMetadataCompat = null;
        String str2 = null;
        String strMediaMetadataCompat2 = null;
        r8lambdahzshocQMpV5shdKumio5m5xOK0E r8lambdahzshocqmpv5shdkumio5m5xok0e = null;
        Integer num = null;
        int i4 = 0;
        boolean z = true;
        while (!(!z)) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i5) {
                case -1:
                    int i6 = IconCompatParcelizer + 63;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    z = false;
                    break;
                case 0:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i4 |= 1;
                    break;
                case 1:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                    break;
                case 2:
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i4 |= 4;
                    break;
                case 3:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i4 |= 8;
                    break;
                case 4:
                    r8lambdahzshocqmpv5shdkumio5m5xok0e = (r8lambdahzshocQMpV5shdKumio5m5xOK0E) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, r8lambdahCzl79tp_ropVRUma4k6vsEoRgU.RemoteActionCompatParcelizer, r8lambdahzshocqmpv5shdkumio5m5xok0e);
                    i4 |= 16;
                    break;
                case 5:
                    num = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, afterClosed.IconCompatParcelizer, num);
                    i4 |= 32;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM(i4, str, strMediaMetadataCompat, str2, strMediaMetadataCompat2, r8lambdahzshocqmpv5shdkumio5m5xok0e, num);
    }
}
