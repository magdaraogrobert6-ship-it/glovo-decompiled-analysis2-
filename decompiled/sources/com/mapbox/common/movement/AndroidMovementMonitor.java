package com.mapbox.common.movement;

import android.os.Handler;
import android.os.Looper;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementInfoCallback;
import com.mapbox.common.MovementModeObserver;
import com.mapbox.common.MovementModeProvider;
import com.mapbox.common.MovementMonitorInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidMovementMonitor implements MovementMonitorInterface {
    public static final Companion Companion = new Companion(null);
    private static final String NO_MOVEMENT_INFO_ERROR = "Movement is not available";
    private final ActivityRecognitionClient activityRecognition;
    private final Map<MovementModeObserver, Handler> observers;
    private MovementInfo sdkMovementInfo;
    private MovementInfo systemMovementInfo;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final MovementMonitorInterface create() {
            ActivityRecognitionClient googleActivityRecognition;
            if (GoogleActivityRecognition.Companion.isAvailable$common_release()) {
                googleActivityRecognition = new GoogleActivityRecognition(MapboxSDKCommon.INSTANCE.getContext(), null, 2, 0 == true ? 1 : 0);
            } else {
                googleActivityRecognition = StubActivityRecognition.INSTANCE;
            }
            return new AndroidMovementMonitor(googleActivityRecognition);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlatformMovementInfoAvailable(MovementInfo movementInfo) {
        synchronized (this) {
            this.systemMovementInfo = movementInfo;
            notifyObservers(movementInfo);
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public void getMovementInfo(MovementInfoCallback movementInfoCallback) {
        Expected<String, MovementInfo> expectedCreateError;
        synchronized (this) {
            movementInfoCallback.getClass();
            MovementInfo movementInfo = this.systemMovementInfo;
            if (movementInfo == null) {
                movementInfo = this.sdkMovementInfo;
            }
            if (movementInfo != null) {
                expectedCreateError = ExpectedFactory.createValue(movementInfo);
                expectedCreateError.getClass();
            } else {
                expectedCreateError = ExpectedFactory.createError(NO_MOVEMENT_INFO_ERROR);
                expectedCreateError.getClass();
            }
            movementInfoCallback.run(expectedCreateError);
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public void registerObserver(MovementModeObserver movementModeObserver) {
        synchronized (this) {
            movementModeObserver.getClass();
            Map<MovementModeObserver, Handler> map = this.observers;
            Looper looperMyLooper = Looper.myLooper();
            map.put(movementModeObserver, looperMyLooper != null ? new Handler(looperMyLooper) : null);
            if (this.observers.size() == 1) {
                this.activityRecognition.start();
            }
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public void setMovementInfo(MovementInfo movementInfo) {
        synchronized (this) {
            movementInfo.getClass();
            if (!this.activityRecognition.isPlatformActivityRecognitionAvailable()) {
                this.sdkMovementInfo = new MovementInfo(movementInfo.getMovementMode(), MovementModeProvider.SDK);
                notifyObservers(movementInfo);
            }
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public void unregisterObserver(MovementModeObserver movementModeObserver) {
        synchronized (this) {
            movementModeObserver.getClass();
            this.observers.remove(movementModeObserver);
            if (this.observers.isEmpty()) {
                this.activityRecognition.stop();
            }
        }
    }

    public static final MovementMonitorInterface create() {
        return Companion.create();
    }

    private final void notifyObservers(MovementInfo movementInfo) {
        for (Map.Entry<MovementModeObserver, Handler> entry : this.observers.entrySet()) {
            MovementModeObserver key = entry.getKey();
            Handler value = entry.getValue();
            if (value != null) {
                Object[] objArr = {value.getLooper(), Looper.myLooper()};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    value.post(new ZM$$ExternalSyntheticLambda0(key, 4, movementInfo));
                }
            }
            key.onMovementModeChanged(movementInfo);
        }
    }

    public AndroidMovementMonitor(ActivityRecognitionClient activityRecognitionClient) {
        activityRecognitionClient.getClass();
        this.activityRecognition = activityRecognitionClient;
        this.observers = new LinkedHashMap();
        activityRecognitionClient.addObserver(new ActivityRecognitionClient.Observer() { // from class: com.mapbox.common.movement.AndroidMovementMonitor.1
            @Override // com.mapbox.common.movement.ActivityRecognitionClient.Observer
            public void onMovementInfo(MovementInfo movementInfo) {
                synchronized (this) {
                    movementInfo.getClass();
                    AndroidMovementMonitor.this.onPlatformMovementInfoAvailable(movementInfo);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$2$lambda$1(MovementModeObserver movementModeObserver, MovementInfo movementInfo) {
        movementModeObserver.getClass();
        movementInfo.getClass();
        movementModeObserver.onMovementModeChanged(movementInfo);
    }
}
