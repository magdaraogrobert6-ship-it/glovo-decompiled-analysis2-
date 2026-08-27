package o;

/* JADX INFO: loaded from: classes.dex */
public final class getBottomEnd {
    public static final getBottomEnd read = new getBottomEnd(null, 63);
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getBottomEnd) {
            return this.serializer == ((getBottomEnd) obj).serializer;
        }
        return false;
    }

    public final int hashCode() {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.serializer;
        return (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm.hashCode() : 0) * 28629151;
    }

    public getBottomEnd(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.serializer = (i & 1) != 0 ? null : r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
