package com.mapbox.common.movement;

import com.mapbox.common.MovementInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface ActivityRecognitionClient {

    /* JADX INFO: loaded from: classes4.dex */
    public interface Observer {
        void onMovementInfo(MovementInfo movementInfo);
    }

    void addObserver(Observer observer);

    boolean isPlatformActivityRecognitionAvailable();

    void removeObserver(Observer observer);

    void start();

    void stop();
}
