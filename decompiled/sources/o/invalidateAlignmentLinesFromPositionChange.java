package o;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class invalidateAlignmentLinesFromPositionChange implements AbstractComposeViewExternalSyntheticLambda0 {
    public final /* synthetic */ int read;

    public /* synthetic */ invalidateAlignmentLinesFromPositionChange(int i) {
        this.read = i;
    }

    @Override // o.AbstractComposeViewExternalSyntheticLambda0
    public final Object write() {
        switch (this.read) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                provideRulerValue providerulervalue = ExecutorsRegistrar.serializer;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new setCoordinatesAccessed(Executors.newFixedThreadPool(4, new setShallowPlacingui("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.write.write());
            case 3:
                provideRulerValue providerulervalue2 = ExecutorsRegistrar.serializer;
                return new setCoordinatesAccessed(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new setShallowPlacingui("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.write.write());
            case 4:
                provideRulerValue providerulervalue3 = ExecutorsRegistrar.serializer;
                return new setCoordinatesAccessed(Executors.newCachedThreadPool(new setShallowPlacingui("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.write.write());
            case 5:
                provideRulerValue providerulervalue4 = ExecutorsRegistrar.serializer;
                return Executors.newSingleThreadScheduledExecutor(new setShallowPlacingui("Firebase Scheduler", 0, null));
            case 6:
                return FirebaseMessaging.lambda$static$0();
            case 7:
                return Executors.newSingleThreadScheduledExecutor();
            case 8:
                return GaugeManager.lambda$new$0();
            case 9:
                return GaugeManager.lambda$new$1();
            default:
                Random random = RemoteConfigComponent.read;
                return null;
        }
    }
}
