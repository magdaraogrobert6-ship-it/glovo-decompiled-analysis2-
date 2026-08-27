package o;

/* JADX INFO: loaded from: classes.dex */
public final class addContentView {
    public final int IconCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final int serializer;
    public final int write;

    public addContentView(int i, int i2, int i3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.serializer = i;
        this.IconCompatParcelizer = i2;
        this.write = i3;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final int serializer(boolean z) {
        if (this.write == 0) {
            return 0;
        }
        return z ? this.IconCompatParcelizer : this.serializer;
    }
}
