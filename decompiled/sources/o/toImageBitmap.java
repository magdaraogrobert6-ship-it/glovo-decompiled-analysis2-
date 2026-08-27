package o;

/* JADX INFO: loaded from: classes2.dex */
public final class toImageBitmap implements setCompositingStrategyWpw9cng {
    public final String read;
    public final String write;

    @Override // o.setCompositingStrategyWpw9cng
    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // o.setCompositingStrategyWpw9cng
    public final String write() {
        return this.write;
    }

    public final int hashCode() {
        return this.read.hashCode() + (this.write.hashCode() * 31);
    }

    public toImageBitmap(String str, String str2) {
        this.write = str;
        this.read = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toImageBitmap)) {
            return false;
        }
        toImageBitmap toimagebitmap = (toImageBitmap) obj;
        return this.write.equals(toimagebitmap.write) && this.read.equals(toimagebitmap.read);
    }

    public final String toString() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Dispatcher(orderCode=", this.write, ", message=", this.read, ")");
    }
}
