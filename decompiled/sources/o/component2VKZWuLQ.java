package o;

/* JADX INFO: loaded from: classes4.dex */
public final class component2VKZWuLQ extends r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw {
    public static component2VKZWuLQ IconCompatParcelizer;

    public static component2VKZWuLQ write() {
        component2VKZWuLQ component2vkzwulq;
        synchronized (component2VKZWuLQ.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new component2VKZWuLQ();
            }
            component2vkzwulq = IconCompatParcelizer;
        }
        return component2vkzwulq;
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String RemoteActionCompatParcelizer() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String serializer() {
        return "sessions_memory_capture_frequency_fg_ms";
    }
}
