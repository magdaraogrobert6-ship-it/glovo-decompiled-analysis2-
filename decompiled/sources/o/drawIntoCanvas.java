package o;

/* JADX INFO: loaded from: classes.dex */
public enum drawIntoCanvas {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    private final boolean isComplete;

    public boolean isComplete() {
        return this.isComplete;
    }

    drawIntoCanvas(boolean z) {
        this.isComplete = z;
    }
}
