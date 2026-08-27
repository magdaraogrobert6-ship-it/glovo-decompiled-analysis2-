package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 {
    public final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);
    public final JsonUtilsExternalSyntheticLambda1[] write;

    public final void read(long j) {
        for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 : this.write) {
            jsonUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(j);
        }
    }

    static {
        new r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0(new JsonUtilsExternalSyntheticLambda1[0]);
    }

    public r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0(JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr) {
        this.write = jsonUtilsExternalSyntheticLambda1Arr;
    }
}
