package com.mapbox.common.experimental;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public final class MapboxSupport {
    public static final Companion Companion;
    private long peer;

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j);

    @MapboxExperimental
    public static final native Expected<String, DataRef> getSupportPackageData();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSelfRegister();

    @MapboxExperimental
    public static final native Expected<String, None> saveSupportPackageToFile(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPeer$lambda$0(long j) {
        Companion.cleanNativePeer(j);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long j) {
            MapboxSupport.cleanNativePeer(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSelfRegister() {
            MapboxSupport.nativeSelfRegister();
        }

        @MapboxExperimental
        public final Expected<String, DataRef> getSupportPackageData() {
            return MapboxSupport.getSupportPackageData();
        }

        @MapboxExperimental
        public final Expected<String, None> saveSupportPackageToFile(String str) {
            return MapboxSupport.saveSupportPackageToFile(str);
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        BaseMapboxInitializer.Companion.init(MapboxSDKCommonInitializerImpl.class);
        try {
            companion.nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MapboxSupport(long j) {
        setPeer(j);
    }

    public final void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapboxSupport$$ExternalSyntheticLambda0(j, 0));
    }
}
