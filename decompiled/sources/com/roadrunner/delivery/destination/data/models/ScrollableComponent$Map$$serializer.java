package com.roadrunner.delivery.destination.data.models;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getCieXyz;
import o.getInAppMessageManager;
import o.getWasCloseMessageCalled;
import o.instance_delegatelambda0;
import o.onCloseActionlambda1;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ScrollableComponent$Map$$serializer implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final ScrollableComponent$Map$$serializer serializer;
    private static int write = 1;

    static {
        ScrollableComponent$Map$$serializer scrollableComponent$Map$$serializer = new ScrollableComponent$Map$$serializer();
        serializer = scrollableComponent$Map$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("map", scrollableComponent$Map$$serializer, 7);
        oncloseactionlambda1.read("rider_location_enabled", false);
        oncloseactionlambda1.read("components", true);
        oncloseactionlambda1.read("destination_location", false);
        oncloseactionlambda1.read("pins", false);
        oncloseactionlambda1.read("style", true);
        oncloseactionlambda1.read("caption", true);
        oncloseactionlambda1.read("enable_pin_connections", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 78 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 111;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 119;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 15;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = ScrollableComponent$Map.$childSerializers;
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {getwasclosemessagecalled, onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), DestinationLocation$$serializer.RemoteActionCompatParcelizer, onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), getwasclosemessagecalled};
        int i4 = write + 9;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x005b  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 113;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ScrollableComponent$Map scrollableComponent$Map = (ScrollableComponent$Map) obj;
        scrollableComponent$Map.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = ScrollableComponent$Map.$childSerializers;
        boolean z = scrollableComponent$Map.riderLocationEnabled;
        boolean z2 = scrollableComponent$Map.enablePinConnections;
        String str = scrollableComponent$Map.expandMapCaption;
        String str2 = scrollableComponent$Map.style;
        List list = scrollableComponent$Map.components;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, z);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
        } else {
            Object[] objArr = {list, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, DestinationLocation$$serializer.RemoteActionCompatParcelizer, scrollableComponent$Map.destinationLocation);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), scrollableComponent$Map.pins);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, str2);
            int i4 = write + 1;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, "mapbox://styles/mapbox/streets-v11"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, str2);
                int i6 = write + 1;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (z2) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } else {
            int i8 = write + 67;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 5 % 2;
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, z2);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 33;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = ScrollableComponent$Map.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        int i5 = 0;
        boolean zWrite = false;
        boolean zWrite2 = false;
        boolean z = true;
        List list = null;
        DestinationLocation destinationLocation = null;
        List list2 = null;
        String strMediaMetadataCompat = null;
        String str = null;
        while (z) {
            int i6 = write + 93;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                throw null;
            }
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i7) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i = i5 | 1;
                    break;
                case 1:
                    list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[1].MediaSessionCompatResultReceiverWrapper(), list);
                    i = i5 | 2;
                    break;
                case 2:
                    destinationLocation = (DestinationLocation) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, DestinationLocation$$serializer.RemoteActionCompatParcelizer, destinationLocation);
                    i = i5 | 4;
                    break;
                case 3:
                    list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[3].MediaSessionCompatResultReceiverWrapper(), list2);
                    i = i5 | 8;
                    int i8 = write + 21;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    break;
                case 4:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i = i5 | 16;
                    int i10 = read + 33;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    break;
                case 5:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i = i5 | 32;
                    break;
                case 6:
                    zWrite2 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                    i5 |= 64;
                    continue;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                    return null;
            }
            i5 = i;
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        ScrollableComponent$Map scrollableComponent$Map = new ScrollableComponent$Map(i5, zWrite, list, destinationLocation, list2, strMediaMetadataCompat, str, zWrite2);
        int i12 = write + 93;
        read = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return scrollableComponent$Map;
    }
}
