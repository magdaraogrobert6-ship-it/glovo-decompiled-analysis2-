package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public class readIntlambda0 {
    public static final batchUpdate RemoteActionCompatParcelizer = new batchUpdate();
    private final Runnable IconCompatParcelizer;
    private final long read;
    private final int serializer;

    public static class read {
        private String IconCompatParcelizer = String.valueOf(System.identityHashCode(this));
        private final Runnable RemoteActionCompatParcelizer;
        private final long read;
        private final int write;

        public final void read(String str) {
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, "(");
            sbM.append(System.identityHashCode(this));
            sbM.append(")");
            this.IconCompatParcelizer = sbM.toString();
        }

        public read(int i, long j, Runnable runnable) {
            this.write = i;
            this.RemoteActionCompatParcelizer = runnable;
            this.read = j;
        }
    }

    public final Runnable RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int serializer() {
        return this.serializer;
    }

    public readIntlambda0(read readVar) {
        readVar.IconCompatParcelizer;
        this.serializer = readVar.write;
        this.IconCompatParcelizer = readVar.RemoteActionCompatParcelizer;
        this.read = readVar.read;
    }

    public final long read() {
        return this.read;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (this.serializer * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        readIntlambda0 readintlambda0 = (readIntlambda0) obj;
        if (this.serializer != readintlambda0.serializer) {
            return false;
        }
        return this.IconCompatParcelizer.equals(readintlambda0.IconCompatParcelizer);
    }
}
