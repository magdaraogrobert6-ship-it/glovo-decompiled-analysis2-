package kotlinx.coroutines.flow;

/* JADX INFO: loaded from: classes4.dex */
final class StartedEagerly implements SharingStarted {
    public final String toString() {
        return "SharingStarted.Eagerly";
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public final Flow write(StateFlow stateFlow) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(SharingCommand.START);
    }
}
