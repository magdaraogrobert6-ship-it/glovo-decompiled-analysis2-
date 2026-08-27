package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetGetBooleanMethodcp extends r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw {
    public static accesssetGetBooleanMethodcp read;

    public static accesssetGetBooleanMethodcp read() {
        accesssetGetBooleanMethodcp accesssetgetbooleanmethodcp;
        synchronized (accesssetGetBooleanMethodcp.class) {
            if (read == null) {
                read = new accesssetGetBooleanMethodcp();
            }
            accesssetgetbooleanmethodcp = read;
        }
        return accesssetgetbooleanmethodcp;
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String RemoteActionCompatParcelizer() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String serializer() {
        return "experiment_app_start_ttid";
    }
}
