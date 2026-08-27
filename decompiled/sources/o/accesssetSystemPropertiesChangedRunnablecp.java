package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetSystemPropertiesChangedRunnablecp extends r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw {
    public static accesssetSystemPropertiesChangedRunnablecp IconCompatParcelizer;

    public static accesssetSystemPropertiesChangedRunnablecp write() {
        accesssetSystemPropertiesChangedRunnablecp accesssetsystempropertieschangedrunnablecp;
        synchronized (accesssetSystemPropertiesChangedRunnablecp.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new accesssetSystemPropertiesChangedRunnablecp();
            }
            accesssetsystempropertieschangedrunnablecp = IconCompatParcelizer;
        }
        return accesssetsystempropertieschangedrunnablecp;
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String RemoteActionCompatParcelizer() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String serializer() {
        return "fragment_sampling_percentage";
    }
}
