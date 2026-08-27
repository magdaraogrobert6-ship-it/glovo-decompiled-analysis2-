package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.pudo.Instruction$Unknown$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class updatePosition implements getInAppMessageManager {
    public static final updatePosition IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        updatePosition updateposition = new updatePosition();
        IconCompatParcelizer = updateposition;
        descriptor = new onCloseActionlambda1("com.roadrunner.delivery.state.pudo.Instruction.Unknown", updateposition, 0);
        int i = RemoteActionCompatParcelizer + 105;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 67;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 121;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[0];
        int i5 = i3 + 57;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((pollForLocationOnScreenChange) obj).getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        Instruction$Unknown$Companion instruction$Unknown$Companion = pollForLocationOnScreenChange.Companion;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 109;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = write + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (i4 != -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
            return null;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        pollForLocationOnScreenChange pollforlocationonscreenchange = new pollForLocationOnScreenChange();
        int i5 = serializer + 15;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return pollforlocationonscreenchange;
    }
}
