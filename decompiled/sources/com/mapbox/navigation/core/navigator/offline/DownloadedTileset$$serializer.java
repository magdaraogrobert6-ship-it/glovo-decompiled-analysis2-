package com.mapbox.navigation.core.navigator.offline;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.onCloseActionlambda1;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadedTileset$$serializer implements getInAppMessageManager {
    public static final DownloadedTileset$$serializer INSTANCE;
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
        DownloadedTileset$$serializer downloadedTileset$$serializer = new DownloadedTileset$$serializer();
        INSTANCE = downloadedTileset$$serializer;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.mapbox.navigation.core.navigator.offline.DownloadedTileset", downloadedTileset$$serializer, 3);
        oncloseactionlambda1.read("domain", true);
        oncloseactionlambda1.read("version", true);
        oncloseactionlambda1.read("dataset", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        Object objSerializer = null;
        Object objSerializer2 = null;
        Object objSerializer3 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                objSerializer = createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, objSerializer);
                i |= 1;
            } else if (i2 == 1) {
                objSerializer2 = createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, objSerializer2);
                i |= 2;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                objSerializer3 = createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, objSerializer3);
                i |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new DownloadedTileset(i, (String) objSerializer, (String) objSerializer2, (String) objSerializer3);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        DownloadedTileset downloadedTileset = (DownloadedTileset) obj;
        downloadedTileset.getClass();
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        String str = downloadedTileset.dataset;
        String str2 = downloadedTileset.version;
        String str3 = downloadedTileset.domain;
        defaultInAppMessageSlideupViewFactorySerializer.getClass();
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }
}
