package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getExtraBold implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final getExtraBold serializer;
    private static int write;

    static {
        getExtraBold getextrabold = new getExtraBold();
        serializer = getextrabold;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("delivery_notes", getextrabold, 2);
        oncloseactionlambda1.read("text", true);
        oncloseactionlambda1.read("components", false);
        descriptor = oncloseactionlambda1;
        int i = read + 41;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        int i3 = 81 / 0;
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer), getExtraLight.$childSerializers[1].MediaSessionCompatResultReceiverWrapper()};
        }
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getExtraLight.$childSerializers;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[3];
        setgraphicmodalmaxwidthdpArr[0] = LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer);
        setgraphicmodalmaxwidthdpArr[0] = onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper();
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getExtraLight getextralight = (getExtraLight) obj;
            getextralight.getClass();
            String str = getextralight.text;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getExtraLight.$childSerializers;
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            throw null;
        }
        getExtraLight getextralight2 = (getExtraLight) obj;
        getextralight2.getClass();
        String str2 = getextralight2.text;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer2 = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr2 = getExtraLight.$childSerializers;
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        }
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[1].MediaSessionCompatResultReceiverWrapper(), getextralight2.components);
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        int i3 = RemoteActionCompatParcelizer + 29;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getExtraLight.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        String str = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = IconCompatParcelizer + 29;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                throw null;
            }
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 == -1) {
                z = false;
            } else if (i4 == 0) {
                str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                i2 |= 1;
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                    return null;
                }
                int i5 = RemoteActionCompatParcelizer + 23;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
                i2 |= 2;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        getExtraLight getextralight = new getExtraLight(list, i2, str);
        int i7 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 62 / 0;
        }
        return getextralight;
    }
}
