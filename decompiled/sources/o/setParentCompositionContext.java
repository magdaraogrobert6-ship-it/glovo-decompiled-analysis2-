package o;

/* JADX INFO: loaded from: classes2.dex */
public final class setParentCompositionContext {
    public final String read;
    public final String write;

    public final int hashCode() {
        String str = this.read;
        String str2 = this.write;
        if (str2 == null) {
            return str.hashCode();
        }
        return str.hashCode() + str2.hashCode();
    }

    public setParentCompositionContext(String str, String str2) {
        this.write = str;
        this.read = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setParentCompositionContext)) {
            return false;
        }
        setParentCompositionContext setparentcompositioncontext = (setParentCompositionContext) obj;
        String str = setparentcompositioncontext.write;
        if (hashCode() != setparentcompositioncontext.hashCode()) {
            return false;
        }
        String str2 = this.write;
        return (str2 != null || str == null) && (str2 == null || str2.equals(str)) && this.read.equals(setparentcompositioncontext.read);
    }
}
