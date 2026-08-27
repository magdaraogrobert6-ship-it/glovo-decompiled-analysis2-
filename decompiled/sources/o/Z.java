package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Z implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final Z read;
    private static int serializer = 1;
    private static int write = 1;

    static {
        Z z = new Z();
        read = z;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.opportunities.data.StartingPoint", z, 4);
        oncloseactionlambda1.read("geo_json", false);
        oncloseactionlambda1.read("center_geo_json", false);
        oncloseactionlambda1.read("name", false);
        oncloseactionlambda1.read("id", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 23;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 109;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        w0 w0Var = w0.serializer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {w0Var, w0Var, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer};
        int i4 = write + 39;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        w7ExternalSyntheticLambda0 w7externalsyntheticlambda0 = (w7ExternalSyntheticLambda0) obj;
        w7externalsyntheticlambda0.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        w0 w0Var = w0.serializer;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, w0Var, w7externalsyntheticlambda0.geoJson);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, w0Var, w7externalsyntheticlambda0.centerGeoJson);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, w7externalsyntheticlambda0.name);
        defaultInAppMessageSlideupViewFactorySerializer.write(3, w7externalsyntheticlambda0.id, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = RemoteActionCompatParcelizer + 17;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0034 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        vf vfVar = null;
        vf vfVar2 = null;
        String strMediaMetadataCompat = null;
        int i2 = 0;
        int iIconCompatParcelizer = 0;
        boolean z = true;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i3 == -1) {
                z = false;
            } else if (i3 != 0) {
                int i4 = write;
                int i5 = i4 + 29;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    if (i3 == 1) {
                        vfVar2 = (vf) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, w0.serializer, vfVar2);
                        i2 |= 2;
                    } else if (i3 != 2) {
                        int i6 = i4 + 17;
                        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (i3 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                            return null;
                        }
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i2 |= 8;
                    } else {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i2 |= 4;
                    }
                } else if (i3 == 1) {
                    vfVar2 = (vf) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, w0.serializer, vfVar2);
                    i2 |= 2;
                } else if (i3 != 2) {
                    int i8 = i4 + 17;
                    RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    if (i3 == 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                        return null;
                    }
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i2 |= 8;
                } else {
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i2 |= 4;
                }
            } else {
                vfVar = (vf) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, w0.serializer, vfVar);
                i2 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new w7ExternalSyntheticLambda0(i2, vfVar, vfVar2, strMediaMetadataCompat, iIconCompatParcelizer);
    }
}
