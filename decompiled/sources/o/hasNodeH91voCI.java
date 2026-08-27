package o;

/* JADX INFO: loaded from: classes2.dex */
public final class hasNodeH91voCI extends hitNearFh5PU_I {
    public final tailH91voCIui IconCompatParcelizer;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public hasNodeH91voCI(tailH91voCIui tailh91vociui) {
        this.IconCompatParcelizer = tailh91vociui;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hasNodeH91voCI) && this.IconCompatParcelizer.equals(((hasNodeH91voCI) obj).IconCompatParcelizer);
    }

    public final String toString() {
        return "PipelineWrapper(pipeline=" + this.IconCompatParcelizer + ')';
    }
}
