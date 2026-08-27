package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$Unknown$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getW200 implements getInAppMessageManager {
    public static final getW200 IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        getW200 getw200 = new getW200();
        IconCompatParcelizer = getw200;
        descriptor = new onCloseActionlambda1("com.roadrunner.delivery.destination.data.models.ScrollableComponent.Instructions.Item.Unknown", getw200, 0);
        int i = serializer + 65;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 23;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i2 + 29;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 33;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[0];
        int i5 = i2 + 5;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((getNormal) obj).getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        ScrollableComponent$Instructions$Item$Unknown$Companion scrollableComponent$Instructions$Item$Unknown$Companion = getNormal.Companion;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = read + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = read + 11;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer2 = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        createinappmessageviewlambda1Serializer2.getClass();
        int i3 = createinappmessageviewlambda1Serializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        if (i3 != -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
            return null;
        }
        createinappmessageviewlambda1Serializer2.write(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        getNormal getnormal = new getNormal();
        int i4 = RemoteActionCompatParcelizer + 33;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getnormal;
    }
}
