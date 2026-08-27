package com.roadrunner.delivery.destination.data.models;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.onCloseActionlambda1;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DestinationComponent$Location$$serializer implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final DestinationComponent$Location$$serializer read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        DestinationComponent$Location$$serializer destinationComponent$Location$$serializer = new DestinationComponent$Location$$serializer();
        read = destinationComponent$Location$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.destination.data.models.DestinationComponent.Location", destinationComponent$Location$$serializer, 3);
        oncloseactionlambda1.read("latitude", false);
        oncloseactionlambda1.read("longitude", false);
        oncloseactionlambda1.read("caption", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 49;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 111;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 93;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer);
        r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s, setgraphicmodalmaxwidthdp};
        int i4 = write + 91;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        DestinationComponent$Location destinationComponent$Location = (DestinationComponent$Location) obj;
        destinationComponent$Location.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        double d = destinationComponent$Location.latitude;
        String str = destinationComponent$Location.caption;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, d);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, destinationComponent$Location.longitude);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 105;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String str = null;
        int i2 = 0;
        double dRemoteActionCompatParcelizer = 0.0d;
        double dRemoteActionCompatParcelizer2 = 0.0d;
        boolean z = true;
        while (z) {
            int i3 = write + 75;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 == -1) {
                z = false;
            } else if (i5 != 0) {
                int i6 = RemoteActionCompatParcelizer + 73;
                int i7 = i6 % Fields.SpotShadowColor;
                write = i7;
                int i8 = i6 % 2;
                if (i5 == 1) {
                    dRemoteActionCompatParcelizer2 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i2 |= 2;
                    int i9 = write + 63;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                } else {
                    if (i5 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        int i11 = RemoteActionCompatParcelizer + 85;
                        write = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        return null;
                    }
                    int i13 = i7 + 47;
                    RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i2 |= 4;
                }
            } else {
                dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i2 |= 1;
                int i15 = write + 101;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    int i16 = 2 % 5;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new DestinationComponent$Location(dRemoteActionCompatParcelizer, dRemoteActionCompatParcelizer2, i2, str);
    }
}
