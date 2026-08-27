package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.Location$$serializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PlatformTypefaces_androidKt implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final PlatformTypefaces_androidKt serializer;
    private static int write = 1;

    static {
        PlatformTypefaces_androidKt platformTypefaces_androidKt = new PlatformTypefaces_androidKt();
        serializer = platformTypefaces_androidKt;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("parking", platformTypefaces_androidKt, 4);
        oncloseactionlambda1.read("address", false);
        oncloseactionlambda1.read("highlighted", true);
        oncloseactionlambda1.read("order", true);
        oncloseactionlambda1.read("style", true);
        descriptor = oncloseactionlambda1;
        int i = read + 13;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 73;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 101;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = write + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {Location$$serializer.write, getWasCloseMessageCalled.write, afterClosed.IconCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer};
        int i4 = RemoteActionCompatParcelizer + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        PlatformTypefacesApi28 platformTypefacesApi28 = (PlatformTypefacesApi28) obj;
        platformTypefacesApi28.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        Location$$serializer location$$serializer = Location$$serializer.write;
        Location location = platformTypefacesApi28.address;
        String str = platformTypefacesApi28.style;
        int i2 = platformTypefacesApi28.order;
        boolean z = platformTypefacesApi28.highlighted;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, location$$serializer, location);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, z);
            int i3 = write + 65;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || i2 != 0) {
            defaultInAppMessageSlideupViewFactorySerializer.write(2, i2, r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i5 = RemoteActionCompatParcelizer + 69;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, str);
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ""}, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, str);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0050 A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = write + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        Location location = null;
        String strMediaMetadataCompat = null;
        int i4 = 0;
        boolean zWrite = false;
        int iIconCompatParcelizer = 0;
        boolean z = true;
        while (!(!z)) {
            int i5 = write + 111;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 == -1) {
                z = false;
            } else if (i7 != 0) {
                int i8 = RemoteActionCompatParcelizer + 19;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    if (i7 == 0) {
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i4 |= 2;
                    } else if (i7 != 2) {
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i4 |= 4;
                    } else {
                        if (i7 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                            return null;
                        }
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i4 |= 8;
                    }
                } else if (i7 == 1) {
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i4 |= 2;
                } else if (i7 != 2) {
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i4 |= 4;
                } else {
                    if (i7 == 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                        return null;
                    }
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i4 |= 8;
                }
            } else {
                location = (Location) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, Location$$serializer.write, location);
                i4 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new PlatformTypefacesApi28(i4, location, zWrite, iIconCompatParcelizer, strMediaMetadataCompat);
    }
}
