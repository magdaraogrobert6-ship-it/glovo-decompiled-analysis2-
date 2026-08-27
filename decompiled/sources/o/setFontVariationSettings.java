package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.Location$$serializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setFontVariationSettings implements getInAppMessageManager {
    public static final setFontVariationSettings IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        setFontVariationSettings setfontvariationsettings = new setFontVariationSettings();
        IconCompatParcelizer = setfontvariationsettings;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.destination.data.models.StepComponent.Map.PinComponent.Unknown", setfontvariationsettings, 4);
        oncloseactionlambda1.read("address", true);
        oncloseactionlambda1.read("highlighted", true);
        oncloseactionlambda1.read("order", true);
        oncloseactionlambda1.read("style", true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 123;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = serializer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[3];
            setgraphicmodalmaxwidthdpArr[1] = Location$$serializer.write;
            setgraphicmodalmaxwidthdpArr[1] = getWasCloseMessageCalled.write;
            setgraphicmodalmaxwidthdpArr[3] = afterClosed.IconCompatParcelizer;
            setgraphicmodalmaxwidthdpArr[2] = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        } else {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{Location$$serializer.write, getWasCloseMessageCalled.write, afterClosed.IconCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer};
        }
        int i3 = write + 25;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x002e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        Location location;
        String strMediaMetadataCompat;
        Object[] objArr;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 117;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            location = null;
            strMediaMetadataCompat = null;
            objArr = false;
            i = 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            location = null;
            strMediaMetadataCompat = null;
            objArr = true;
            i = 0;
        }
        boolean zWrite = i;
        int iIconCompatParcelizer = zWrite ? 1 : 0;
        while (objArr != false) {
            int i5 = write + 63;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 == -1) {
                objArr = false;
            } else if (i7 != 0) {
                int i8 = serializer + 109;
                int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i9;
                if (i8 % 2 != 0) {
                    if (i7 == 0) {
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i |= 2;
                        i2 = serializer + 31;
                        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i10 = 5 % 5;
                        }
                    } else if (i7 != 2) {
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i |= 4;
                    } else {
                        if (i7 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                            return null;
                        }
                        int i11 = i9 + 9;
                        serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i |= 8;
                    }
                } else if (i7 == 1) {
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i |= 2;
                    i2 = serializer + 31;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        int i13 = 5 % 5;
                    }
                } else if (i7 != 2) {
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i |= 4;
                } else {
                    if (i7 == 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                        return null;
                    }
                    int i14 = i9 + 9;
                    serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i |= 8;
                }
            } else {
                location = (Location) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, Location$$serializer.write, location);
                i |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new createAndroidTypefaceApi28RetOiIg(i, location, zWrite, iIconCompatParcelizer, strMediaMetadataCompat);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x00af  */
    /* JADX WARN: Code duplicated, block: B:8:0x004f  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int iWrite;
        int iWrite2;
        int iWrite3;
        int i = 2 % 2;
        createAndroidTypefaceApi28RetOiIg createandroidtypefaceapi28retoiig = (createAndroidTypefaceApi28RetOiIg) obj;
        createandroidtypefaceapi28retoiig.getClass();
        String str = createandroidtypefaceapi28retoiig.style;
        int i2 = createandroidtypefaceapi28retoiig.order;
        boolean z = createandroidtypefaceapi28retoiig.highlighted;
        Location location = createandroidtypefaceapi28retoiig.address;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, Location$$serializer.write, location);
            int i3 = write + 57;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            Object[] objArr = {location, new Location(0.0d, 0.0d)};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, Location$$serializer.write, location);
                int i5 = write + 57;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, z);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (i2 != 0) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, str);
            } else {
                iWrite = getCieXyz.write();
                iWrite2 = getCieXyz.write();
                iWrite3 = getCieXyz.write();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, ""}, iWrite3)).booleanValue()) {
                    defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, str);
                }
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        int i7 = write + 21;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.write(2, i2, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, str);
        } else {
            iWrite = getCieXyz.write();
            iWrite2 = getCieXyz.write();
            iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, ""}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, str);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
