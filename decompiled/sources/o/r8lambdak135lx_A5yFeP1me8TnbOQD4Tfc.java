package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdak135lx_A5yFeP1me8TnbOQD4Tfc implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final r8lambdak135lx_A5yFeP1me8TnbOQD4Tfc serializer;
    private static int write = 1;

    static {
        r8lambdak135lx_A5yFeP1me8TnbOQD4Tfc r8lambdak135lx_a5yfep1me8tnboqd4tfc = new r8lambdak135lx_A5yFeP1me8TnbOQD4Tfc();
        serializer = r8lambdak135lx_a5yfep1me8tnboqd4tfc;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.sidemenu.data.model.SideMenuResponse", r8lambdak135lx_a5yfep1me8tnboqd4tfc, 2);
        oncloseactionlambda1.read("components", false);
        oncloseactionlambda1.read("photo_id", true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 31;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.$childSerializers[0].MediaSessionCompatResultReceiverWrapper(), LazyKt__LazyJVMKt.read(r8lambdajRJsaJiWFTCMdEbHZ2y6RLsL7MQ.IconCompatParcelizer)};
        int i4 = read + 81;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = read + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM r8lambdakqbp11wz4zjrp1b2dhszxunsbm = (r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) obj;
        r8lambdakqbp11wz4zjrp1b2dhszxunsbm.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.$childSerializers[0].MediaSessionCompatResultReceiverWrapper();
        List list = r8lambdakqbp11wz4zjrp1b2dhszxunsbm.components;
        r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4 r8lambdak1a0rpdupyoepimrlb5gqgel8x4 = r8lambdakqbp11wz4zjrp1b2dhszxunsbm.photoId;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setgraphicmodalmaxwidthdp, list);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (r8lambdak1a0rpdupyoepimrlb5gqgel8x4 != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i4 = read + 31;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambdajRJsaJiWFTCMdEbHZ2y6RLsL7MQ.IconCompatParcelizer, r8lambdak1a0rpdupyoepimrlb5gqgel8x4);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = null;
        List list = null;
        r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4 r8lambdak1a0rpdupyoepimrlb5gqgel8x4 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = IconCompatParcelizer + 51;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = read + 105;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i5 == 0) {
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
                    i2 |= 1;
                    int i7 = IconCompatParcelizer + 81;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    if (i5 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        return null;
                    }
                    r8lambdak1a0rpdupyoepimrlb5gqgel8x4 = (r8lambdak1a0rpdUPyOEpImrlB5GQGel8x4) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambdajRJsaJiWFTCMdEbHZ2y6RLsL7MQ.IconCompatParcelizer, r8lambdak1a0rpdupyoepimrlb5gqgel8x4);
                    i2 |= 2;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM(i2, list, r8lambdak1a0rpdupyoepimrlb5gqgel8x4);
    }
}
