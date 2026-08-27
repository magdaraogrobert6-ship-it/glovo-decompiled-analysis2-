package o;

/* JADX INFO: loaded from: classes.dex */
public final class anglek4lQ0M {
    public final UpdatableAnimationState RemoteActionCompatParcelizer;
    public final accessdispatchTrackpadScroll read;

    public anglek4lQ0M(UpdatableAnimationState updatableAnimationState, accessdispatchTrackpadScroll accessdispatchtrackpadscroll) {
        this.RemoteActionCompatParcelizer = updatableAnimationState;
        this.read = accessdispatchtrackpadscroll;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.read + ", endState=" + this.RemoteActionCompatParcelizer + ')';
    }
}
