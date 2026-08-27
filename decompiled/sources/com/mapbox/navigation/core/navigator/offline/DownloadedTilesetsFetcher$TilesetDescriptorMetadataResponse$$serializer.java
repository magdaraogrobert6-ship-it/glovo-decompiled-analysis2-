package com.mapbox.navigation.core.navigator.offline;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.onCloseActionlambda1;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes5.dex */
public final class DownloadedTilesetsFetcher$TilesetDescriptorMetadataResponse$$serializer implements getInAppMessageManager {
    public static final DownloadedTilesetsFetcher$TilesetDescriptorMetadataResponse$$serializer INSTANCE;
    public static final /* synthetic */ onCloseActionlambda1 descriptor;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        DownloadedTilesetsFetcher$TilesetDescriptorMetadataResponse$$serializer downloadedTilesetsFetcher$TilesetDescriptorMetadataResponse$$serializer = new DownloadedTilesetsFetcher$TilesetDescriptorMetadataResponse$$serializer();
        INSTANCE = downloadedTilesetsFetcher$TilesetDescriptorMetadataResponse$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.mapbox.navigation.core.navigator.offline.DownloadedTilesetsFetcher.TilesetDescriptorMetadataResponse", downloadedTilesetsFetcher$TilesetDescriptorMetadataResponse$$serializer, 1);
        oncloseactionlambda1.read("resolved", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{new setWasCloseMessageCalled(DownloadedTileset$$serializer.INSTANCE, 0)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        Object objIconCompatParcelizer = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else {
                if (i2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(oncloseactionlambda1, 0, new setWasCloseMessageCalled(DownloadedTileset$$serializer.INSTANCE, 0), objIconCompatParcelizer);
                i = 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new DownloadedTilesetsFetcher.TilesetDescriptorMetadataResponse(i, (List) objIconCompatParcelizer);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        DownloadedTilesetsFetcher.TilesetDescriptorMetadataResponse tilesetDescriptorMetadataResponse = (DownloadedTilesetsFetcher.TilesetDescriptorMetadataResponse) obj;
        tilesetDescriptorMetadataResponse.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        defaultInAppMessageSlideupViewFactorySerializer.getClass();
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1, 0, new setWasCloseMessageCalled(DownloadedTileset$$serializer.INSTANCE, 0), tilesetDescriptorMetadataResponse.resolved);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
