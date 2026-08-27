package com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;

/* JADX INFO: loaded from: classes3.dex */
public final class CrowdSourcingImageRepositoryImpl {
    private static int read = 1;
    private static int serializer;
    public final accessrequireViewFactoryHolder write;

    public CrowdSourcingImageRepositoryImpl(accessrequireViewFactoryHolder accessrequireviewfactoryholder) {
        accessrequireviewfactoryholder.getClass();
        this.write = accessrequireviewfactoryholder;
    }

    public final ObserveDivider$invoke$$inlined$map$1 serializer() {
        int i = 2 % 2;
        ObserveDivider$invoke$$inlined$map$1 observeDivider$invoke$$inlined$map$1 = new ObserveDivider$invoke$$inlined$map$1(new NestLoadingServiceImpl$special$$inlined$map$1(((StateProviderImpl) ((accesstoNestedScrollSource) this.write)).MediaBrowserCompatMediaItem, 14), 6);
        int i2 = serializer + 71;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return observeDivider$invoke$$inlined$map$1;
    }
}
