package o;

/* JADX INFO: loaded from: classes.dex */
public final class tryAwaitRelease {
    public final androidx.compose.ui.Alignment read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final Arrangement write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        return Boolean.hashCode(true) + ((this.write.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public tryAwaitRelease(Arrangement arrangement, androidx.compose.ui.Alignment alignment, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.read = alignment;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = arrangement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tryAwaitRelease)) {
            return false;
        }
        tryAwaitRelease tryawaitrelease = (tryAwaitRelease) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, tryawaitrelease.read}, getCieXyz.write())).booleanValue() || !this.serializer.equals(tryawaitrelease.serializer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, tryawaitrelease.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.read + ", size=" + this.serializer + ", animationSpec=" + this.write + ", clip=true)";
    }
}
