package o;

/* JADX INFO: loaded from: classes4.dex */
public final class dispatchPendingInteropLayoutCallbacks extends r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw {
    public static dispatchPendingInteropLayoutCallbacks IconCompatParcelizer;

    public static dispatchPendingInteropLayoutCallbacks read() {
        dispatchPendingInteropLayoutCallbacks dispatchpendinginteroplayoutcallbacks;
        synchronized (dispatchPendingInteropLayoutCallbacks.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new dispatchPendingInteropLayoutCallbacks();
            }
            dispatchpendinginteroplayoutcallbacks = IconCompatParcelizer;
        }
        return dispatchpendinginteroplayoutcallbacks;
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String RemoteActionCompatParcelizer() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String serializer() {
        return "sessions_memory_capture_frequency_bg_ms";
    }
}
