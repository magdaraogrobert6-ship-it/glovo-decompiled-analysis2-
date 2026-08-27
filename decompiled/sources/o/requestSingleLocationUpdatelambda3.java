package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class requestSingleLocationUpdatelambda3 implements r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 {
    private final setSessionTimeout RemoteActionCompatParcelizer;

    @Override // o.r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38
    public final void serializer() {
    }

    @Override // o.r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38
    public final boolean write() {
        return false;
    }

    public final Object clone() throws CloneNotSupportedException {
        return new requestSingleLocationUpdatelambda3(this.RemoteActionCompatParcelizer);
    }

    public requestSingleLocationUpdatelambda3(setSessionTimeout setsessiontimeout) {
        this.RemoteActionCompatParcelizer = setsessiontimeout;
    }

    @Override // o.r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38
    public final void serializer(r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ r8lambda2qd0wtxyngtmhspveumb06dloaq) {
        r8lambda2qd0wtxyngtmhspveumb06dloaq.RemoteActionCompatParcelizer(this, new IOException("HttpClient is shutting down"));
    }
}
