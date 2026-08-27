package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.SignalPublisher;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
@com.mapbox.annotation.MapboxExperimental
public final class IndoorManager {
    public static final Companion Companion;
    private final onViewDetachedFromWindowlambda1 onIndoorUpdated$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.IndoorManager$onIndoorUpdated$2
        {
            super(0);
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Flow<IndoorState> invoke() {
            SignalPublisher signalPublisher = SignalPublisher.INSTANCE;
            final IndoorManager indoorManager = this.this$0;
            return signalPublisher.create(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.IndoorManager$onIndoorUpdated$2.1
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Cancelable invoke(final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                    return indoorManager.nativeSubscribeOnIndoorUpdated(new IndoorManager.OnIndoorUpdatedCallback() { // from class: com.mapbox.maps.IndoorManager.onIndoorUpdated.2.1.1
                        @Override // com.mapbox.maps.IndoorManager.OnIndoorUpdatedCallback
                        public void onIndoorUpdated(IndoorState indoorState) {
                            indoorState.getClass();
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(indoorState);
                        }
                    });
                }
            });
        }
    });
    private long peer;

    @com.mapbox.annotation.MapboxExperimental
    public interface OnIndoorUpdatedCallback {
        void onIndoorUpdated(IndoorState indoorState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j);

    @com.mapbox.annotation.MapboxExperimental
    public static /* synthetic */ void getOnIndoorUpdated$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSelfRegister();

    /* JADX INFO: Access modifiers changed from: private */
    public final native Cancelable nativeSubscribeOnIndoorUpdated(OnIndoorUpdatedCallback onIndoorUpdatedCallback);

    @com.mapbox.annotation.MapboxExperimental
    public final native void selectFloor(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPeer$lambda$0(long j) {
        Companion.cleanNativePeer(j);
    }

    public final Flow<IndoorState> getOnIndoorUpdated() {
        return (Flow) this.onIndoorUpdated$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long j) {
            IndoorManager.cleanNativePeer(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSelfRegister() {
            IndoorManager.nativeSelfRegister();
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        BaseMapboxInitializer.Companion.init(MapboxMapsInitializerImpl.class);
        try {
            companion.nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    @com.mapbox.annotation.MapboxExperimental
    public final Cancelable subscribeOnIndoorUpdated(OnIndoorUpdatedCallback onIndoorUpdatedCallback) {
        onIndoorUpdatedCallback.getClass();
        return nativeSubscribeOnIndoorUpdated(onIndoorUpdatedCallback);
    }

    public IndoorManager(long j) {
        setPeer(j);
    }

    public final void setPeer(final long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new Runnable() { // from class: com.mapbox.maps.IndoorManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IndoorManager.setPeer$lambda$0(j);
            }
        });
    }
}
