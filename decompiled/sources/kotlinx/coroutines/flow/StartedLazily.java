package kotlinx.coroutines.flow;

/* JADX INFO: loaded from: classes4.dex */
final class StartedLazily implements SharingStarted {
    public final String toString() {
        return "SharingStarted.Lazily";
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public final Flow write(StateFlow stateFlow) {
        return new SafeFlow(new StartedLazily$command$1(stateFlow, null));
    }
}
