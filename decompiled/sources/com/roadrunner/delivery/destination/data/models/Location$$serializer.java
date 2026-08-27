package com.roadrunner.delivery.destination.data.models;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.onCloseActionlambda1;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Location$$serializer implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    public static final Location$$serializer write;

    static {
        Location$$serializer location$$serializer = new Location$$serializer();
        write = location$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.destination.data.models.Location", location$$serializer, 2);
        oncloseactionlambda1.read("latitude", false);
        oncloseactionlambda1.read("longitude", false);
        descriptor = oncloseactionlambda1;
        int i = serializer + 75;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 113;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 65;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s};
        int i4 = IconCompatParcelizer + 21;
        read = i4 % Fields.SpotShadowColor;
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
        int i2 = IconCompatParcelizer + 83;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Location location = (Location) obj;
        location.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, location.latitude);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, location.longitude);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 67;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i2 = 0;
        double dRemoteActionCompatParcelizer = 0.0d;
        double dRemoteActionCompatParcelizer2 = 0.0d;
        boolean z = true;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i3 == -1) {
                z = false;
            } else if (i3 != 0) {
                int i4 = read;
                int i5 = i4 + 29;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                    return null;
                }
                int i7 = i4 + 49;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                dRemoteActionCompatParcelizer2 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                i2 |= 2;
                int i9 = IconCompatParcelizer + 81;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i2 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new Location(dRemoteActionCompatParcelizer, dRemoteActionCompatParcelizer2, i2);
    }
}
