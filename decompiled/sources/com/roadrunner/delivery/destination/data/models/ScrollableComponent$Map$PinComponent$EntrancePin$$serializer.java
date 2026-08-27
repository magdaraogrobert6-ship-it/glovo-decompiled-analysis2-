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
public final /* synthetic */ class ScrollableComponent$Map$PinComponent$EntrancePin$$serializer implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    public static final ScrollableComponent$Map$PinComponent$EntrancePin$$serializer RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        ScrollableComponent$Map$PinComponent$EntrancePin$$serializer scrollableComponent$Map$PinComponent$EntrancePin$$serializer = new ScrollableComponent$Map$PinComponent$EntrancePin$$serializer();
        RemoteActionCompatParcelizer = scrollableComponent$Map$PinComponent$EntrancePin$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("entrance", scrollableComponent$Map$PinComponent$EntrancePin$$serializer, 4);
        oncloseactionlambda1.read("address", false);
        oncloseactionlambda1.read("highlighted", true);
        oncloseactionlambda1.read("order", true);
        oncloseactionlambda1.read("style", true);
        descriptor = oncloseactionlambda1;
        int i = write + 63;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 51;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new setGraphicModalMaxWidthDp[]{Location$$serializer.write, getWasCloseMessageCalled.write, afterClosed.IconCompatParcelizer, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[4];
        setgraphicmodalmaxwidthdpArr[0] = Location$$serializer.write;
        setgraphicmodalmaxwidthdpArr[0] = getWasCloseMessageCalled.write;
        setgraphicmodalmaxwidthdpArr[5] = afterClosed.IconCompatParcelizer;
        setgraphicmodalmaxwidthdpArr[4] = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0076  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int iWrite;
        int iWrite2;
        int iWrite3;
        int i = 2 % 2;
        int i2 = serializer + 41;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ScrollableComponent$Map.PinComponent.EntrancePin entrancePin = (ScrollableComponent$Map.PinComponent.EntrancePin) obj;
        entrancePin.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        Location$$serializer location$$serializer = Location$$serializer.write;
        Location location = entrancePin.address;
        String str = entrancePin.style;
        int i4 = entrancePin.order;
        boolean z = entrancePin.highlighted;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, location$$serializer, location);
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (z) {
            }
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || i4 != 0) {
                defaultInAppMessageSlideupViewFactorySerializer.write(2, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
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
        int i5 = serializer + 107;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, z);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.write(2, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            defaultInAppMessageSlideupViewFactorySerializer.write(2, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
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

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = serializer + 65;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = i2 % 2 != 0 ? descriptor : descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i3 = 0;
        boolean zWrite = false;
        int iIconCompatParcelizer = 0;
        boolean z = true;
        Location location = null;
        String strMediaMetadataCompat = null;
        while (z) {
            int i4 = IconCompatParcelizer + 123;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                throw null;
            }
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 == -1) {
                int i6 = serializer + 15;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                z = false;
            } else if (i5 == 0) {
                location = (Location) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, Location$$serializer.write, location);
                i3 |= 1;
            } else if (i5 == 1) {
                zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                i3 |= 2;
            } else if (i5 != 2) {
                int i8 = IconCompatParcelizer + 115;
                serializer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    if (i5 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        return null;
                    }
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i3 |= 8;
                } else {
                    if (i5 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        return null;
                    }
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i3 |= 8;
                }
            } else {
                iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                i3 |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new ScrollableComponent$Map.PinComponent.EntrancePin(i3, location, zWrite, iIconCompatParcelizer, strMediaMetadataCompat);
    }
}
