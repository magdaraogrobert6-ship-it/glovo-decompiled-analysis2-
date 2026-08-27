package o;

/* JADX INFO: loaded from: classes2.dex */
public final class childSizeCanAffectParentSize extends r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw {
    public static childSizeCanAffectParentSize IconCompatParcelizer;

    public static childSizeCanAffectParentSize read() {
        childSizeCanAffectParentSize childsizecanaffectparentsize;
        synchronized (childSizeCanAffectParentSize.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new childSizeCanAffectParentSize();
            }
            childsizecanaffectparentsize = IconCompatParcelizer;
        }
        return childsizecanaffectparentsize;
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String RemoteActionCompatParcelizer() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }
}
