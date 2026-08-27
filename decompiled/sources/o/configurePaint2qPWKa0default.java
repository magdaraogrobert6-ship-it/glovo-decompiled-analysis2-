package o;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class configurePaint2qPWKa0default implements accessgetDefaultJoincp {
    public final MessageDigest RemoteActionCompatParcelizer;
    public final ChildLayerDependenciesTracker read = new ChildLayerDependenciesTracker();

    @Override // o.accessgetDefaultJoincp
    public final ChildLayerDependenciesTracker n_() {
        return this.read;
    }

    public configurePaint2qPWKa0default(MessageDigest messageDigest) {
        this.RemoteActionCompatParcelizer = messageDigest;
    }
}
