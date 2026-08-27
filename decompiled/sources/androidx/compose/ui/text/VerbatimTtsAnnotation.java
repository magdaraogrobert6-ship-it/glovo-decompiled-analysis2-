package androidx.compose.ui.text;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class VerbatimTtsAnnotation extends TtsAnnotation {
    public static final int $stable = 0;
    private final String verbatim;

    public VerbatimTtsAnnotation(String str) {
        super(null);
        this.verbatim = str;
    }

    public final String getVerbatim() {
        return this.verbatim;
    }

    public int hashCode() {
        return this.verbatim.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerbatimTtsAnnotation)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.verbatim, ((VerbatimTtsAnnotation) obj).verbatim}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.verbatim, ')');
    }
}
