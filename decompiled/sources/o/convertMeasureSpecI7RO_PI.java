package o;

/* JADX INFO: loaded from: classes4.dex */
public final class convertMeasureSpecI7RO_PI extends r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw {
    public static convertMeasureSpecI7RO_PI read;

    public static convertMeasureSpecI7RO_PI IconCompatParcelizer() {
        convertMeasureSpecI7RO_PI convertmeasurespeci7ro_pi;
        synchronized (convertMeasureSpecI7RO_PI.class) {
            if (read == null) {
                read = new convertMeasureSpecI7RO_PI();
            }
            convertmeasurespeci7ro_pi = read;
        }
        return convertmeasurespeci7ro_pi;
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String RemoteActionCompatParcelizer() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String serializer() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }
}
