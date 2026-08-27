package o;

/* JADX INFO: loaded from: classes2.dex */
public final class visitSubtreeIfYYKmhodefault extends DelegatableNode_androidKt {
    public final Object write;

    @Override // o.DelegatableNode_androidKt
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // o.DelegatableNode_androidKt
    public final Object read() {
        return this.write;
    }

    public final int hashCode() {
        return this.write.hashCode() + 1502476572;
    }

    public visitSubtreeIfYYKmhodefault(Object obj) {
        this.write = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof visitSubtreeIfYYKmhodefault) {
            return this.write.equals(((visitSubtreeIfYYKmhodefault) obj).write);
        }
        return false;
    }

    public final String toString() {
        return "Optional.of(" + this.write + ")";
    }
}
