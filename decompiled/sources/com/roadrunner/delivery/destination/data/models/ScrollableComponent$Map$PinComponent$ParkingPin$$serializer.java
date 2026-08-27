package com.roadrunner.delivery.destination.data.models;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getCieXyz;
import o.getInAppMessageManager;
import o.getWasCloseMessageCalled;
import o.onCloseActionlambda1;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ScrollableComponent$Map$PinComponent$ParkingPin$$serializer implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final ScrollableComponent$Map$PinComponent$ParkingPin$$serializer read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        ScrollableComponent$Map$PinComponent$ParkingPin$$serializer scrollableComponent$Map$PinComponent$ParkingPin$$serializer = new ScrollableComponent$Map$PinComponent$ParkingPin$$serializer();
        read = scrollableComponent$Map$PinComponent$ParkingPin$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("parking", scrollableComponent$Map$PinComponent$ParkingPin$$serializer, 4);
        oncloseactionlambda1.read("address", false);
        oncloseactionlambda1.read("highlighted", true);
        oncloseactionlambda1.read("order", true);
        oncloseactionlambda1.read("style", true);
        descriptor = oncloseactionlambda1;
        int i = serializer + 15;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        int i3 = 63 / 0;
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {Location$$serializer.write, getWasCloseMessageCalled.write, afterClosed.IconCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer};
        int i4 = write + 19;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:17:0x007f  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int iWrite;
        int iWrite2;
        int iWrite3;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ScrollableComponent$Map.PinComponent.ParkingPin parkingPin = (ScrollableComponent$Map.PinComponent.ParkingPin) obj;
        parkingPin.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        Location$$serializer location$$serializer = Location$$serializer.write;
        Location location = parkingPin.address;
        String str = parkingPin.style;
        int i4 = parkingPin.order;
        boolean z = parkingPin.highlighted;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, location$$serializer, location);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || z) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, z);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (i4 != 0) {
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
        int i5 = write + 97;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.write(2, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i7 = IconCompatParcelizer + 125;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
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

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x003b A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        String strMediaMetadataCompat;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 11;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        Location location = null;
        String str = null;
        int i5 = 0;
        boolean zWrite = false;
        int iIconCompatParcelizer = 0;
        boolean z = true;
        while (z) {
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 == -1) {
                z = false;
            } else if (i6 != 0) {
                int i7 = IconCompatParcelizer + 115;
                int i8 = i7 % Fields.SpotShadowColor;
                write = i8;
                if (i7 % 2 == 0) {
                    if (i6 == 1) {
                        zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                        i5 |= 2;
                        int i9 = IconCompatParcelizer + 53;
                        write = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    } else if (i6 != 2) {
                        iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                        i5 |= 4;
                    } else {
                        if (i6 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                            return null;
                        }
                        i = i8 + 115;
                        IconCompatParcelizer = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                            i5 |= 91;
                        } else {
                            strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                            i5 |= 8;
                        }
                        str = strMediaMetadataCompat;
                    }
                } else if (i6 == 1) {
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i5 |= 2;
                    int i11 = IconCompatParcelizer + 53;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                } else if (i6 != 2) {
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i5 |= 4;
                } else {
                    if (i6 == 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                        return null;
                    }
                    i = i8 + 115;
                    IconCompatParcelizer = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                        i5 |= 91;
                    } else {
                        strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                        i5 |= 8;
                    }
                    str = strMediaMetadataCompat;
                }
            } else {
                location = (Location) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, Location$$serializer.write, location);
                i5 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new ScrollableComponent$Map.PinComponent.ParkingPin(i5, location, zWrite, iIconCompatParcelizer, str);
    }
}
