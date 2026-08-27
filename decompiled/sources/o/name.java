package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Config$Trim;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class name implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    public static final name RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        name nameVar = new name();
        RemoteActionCompatParcelizer = nameVar;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems.Instruction.Config", nameVar, 1);
        oncloseactionlambda1.read("trim", true);
        descriptor = oncloseactionlambda1;
        int i = write + 51;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 51;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 23;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) C0183locale.$childSerializers[0].MediaSessionCompatResultReceiverWrapper())};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[1];
        setgraphicmodalmaxwidthdpArr[1] = LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) C0183locale.$childSerializers[0].MediaSessionCompatResultReceiverWrapper());
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            C0183locale c0183locale = (C0183locale) obj;
            c0183locale.getClass();
            OverlayItems$Instruction$Config$Trim overlayItems$Instruction$Config$Trim = c0183locale.trim;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = C0183locale.$childSerializers;
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        C0183locale c0183locale2 = (C0183locale) obj;
        c0183locale2.getClass();
        OverlayItems$Instruction$Config$Trim overlayItems$Instruction$Config$Trim2 = c0183locale2.trim;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer2 = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr2 = C0183locale.$childSerializers;
        if (!defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            if (overlayItems$Instruction$Config$Trim2 != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        } else {
            int i3 = read + 97;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[0].MediaSessionCompatResultReceiverWrapper(), overlayItems$Instruction$Config$Trim2);
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = read + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = C0183locale.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        OverlayItems$Instruction$Config$Trim overlayItems$Instruction$Config$Trim = null;
        boolean z = true;
        int i4 = 0;
        while (z) {
            int i5 = IconCompatParcelizer + 85;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 == -1) {
                z = false;
            } else {
                if (i7 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                    return null;
                }
                overlayItems$Instruction$Config$Trim = (OverlayItems$Instruction$Config$Trim) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), overlayItems$Instruction$Config$Trim);
                int i8 = read + 61;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new C0183locale(i4, overlayItems$Instruction$Config$Trim);
    }
}
