package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaNpVD_Rx47cVAAPnb9cQAHcNxw implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final r8lambdaNpVD_Rx47cVAAPnb9cQAHcNxw read;
    private static int serializer = 1;
    private static int write;

    static {
        r8lambdaNpVD_Rx47cVAAPnb9cQAHcNxw r8lambdanpvd_rx47cvaapnb9cqahcnxw = new r8lambdaNpVD_Rx47cVAAPnb9cQAHcNxw();
        read = r8lambdanpvd_rx47cvaapnb9cqahcnxw;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.settings.data.model.SettingsResponse", r8lambdanpvd_rx47cvaapnb9cqahcnxw, 3);
        oncloseactionlambda1.read("legal_items", false);
        oncloseactionlambda1.read("feedback", false);
        oncloseactionlambda1.read("promotions", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 95;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 21;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao.$childSerializers;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), r8lambdaML72hY_CMX1wfAZLomMcydj5cFg.serializer, LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper())};
        int i4 = write + 45;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao r8lambdanyj3ixzjgs1drw4t7o1og6tkao = (r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) obj;
        r8lambdanyj3ixzjgs1drw4t7o1og6tkao.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao.$childSerializers;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper();
        List list = r8lambdanyj3ixzjgs1drw4t7o1og6tkao.legalItems;
        List list2 = r8lambdanyj3ixzjgs1drw4t7o1og6tkao.promotions;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdp, list);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambdaML72hY_CMX1wfAZLomMcydj5cFg.serializer, r8lambdanyj3ixzjgs1drw4t7o1og6tkao.feedback);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || list2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list2);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 87;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = write + 115;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        List list = null;
        r8lambdaKg12b_kAV6xLHkeltAkZS9jV9c r8lambdakg12b_kav6xlhkeltakzs9jv9c = null;
        List list2 = null;
        int i4 = 0;
        boolean z = true;
        while (z) {
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = serializer;
                int i7 = i6 + 95;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (i5 != 0) {
                    int i9 = i6 + 27;
                    int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i10;
                    int i11 = i9 % 2;
                    if (i5 != 1) {
                        int i12 = i10 + 119;
                        serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        if (i5 != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                            return null;
                        }
                        list2 = (List) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[2].MediaSessionCompatResultReceiverWrapper(), list2);
                        i4 |= 4;
                    } else {
                        r8lambdakg12b_kav6xlhkeltakzs9jv9c = (r8lambdaKg12b_kAV6xLHkeltAkZS9jV9c) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambdaML72hY_CMX1wfAZLomMcydj5cFg.serializer, r8lambdakg12b_kav6xlhkeltakzs9jv9c);
                        i4 |= 2;
                    }
                } else {
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
                    i4 |= 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao r8lambdanyj3ixzjgs1drw4t7o1og6tkao = new r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao(i4, list, r8lambdakg12b_kav6xlhkeltakzs9jv9c, list2);
        int i14 = write + 97;
        serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return r8lambdanyj3ixzjgs1drw4t7o1og6tkao;
    }
}
