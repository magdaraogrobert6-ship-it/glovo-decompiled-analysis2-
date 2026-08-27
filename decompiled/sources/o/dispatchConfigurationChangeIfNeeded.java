package o;

/* JADX INFO: loaded from: classes4.dex */
public final class dispatchConfigurationChangeIfNeeded extends r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw {
    public static dispatchConfigurationChangeIfNeeded read;

    public static dispatchConfigurationChangeIfNeeded IconCompatParcelizer() {
        dispatchConfigurationChangeIfNeeded dispatchconfigurationchangeifneeded;
        synchronized (dispatchConfigurationChangeIfNeeded.class) {
            if (read == null) {
                read = new dispatchConfigurationChangeIfNeeded();
            }
            dispatchconfigurationchangeifneeded = read;
        }
        return dispatchconfigurationchangeifneeded;
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String RemoteActionCompatParcelizer() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String serializer() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }
}
