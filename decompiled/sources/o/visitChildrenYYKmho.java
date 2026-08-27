package o;

/* JADX INFO: loaded from: classes2.dex */
public final class visitChildrenYYKmho extends DelegatableNode_androidKt {
    public static final visitChildrenYYKmho read = new visitChildrenYYKmho();

    @Override // o.DelegatableNode_androidKt
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // o.DelegatableNode_androidKt
    public final Object read() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
