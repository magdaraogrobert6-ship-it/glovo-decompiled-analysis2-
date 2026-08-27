package com.mapbox.common.movement;

/* JADX INFO: loaded from: classes4.dex */
public final class StubActivityRecognition implements ActivityRecognitionClient {
    public static final StubActivityRecognition INSTANCE = new StubActivityRecognition();

    private StubActivityRecognition() {
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void addObserver(ActivityRecognitionClient.Observer observer) {
        observer.getClass();
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public boolean isPlatformActivityRecognitionAvailable() {
        return false;
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void removeObserver(ActivityRecognitionClient.Observer observer) {
        observer.getClass();
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void start() {
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void stop() {
    }
}
