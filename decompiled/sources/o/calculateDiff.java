package o;

/* JADX INFO: loaded from: classes2.dex */
public final class calculateDiff extends executeDiff {
    @Override // o.fillSnake
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // o.executeDiff
    public final applyDiff write() {
        return applyDiff.RED;
    }

    @Override // o.executeDiff
    public final executeDiff read(Object obj, Object obj2, fillSnake fillsnake, fillSnake fillsnake2) {
        if (obj == null) {
            obj = this.IconCompatParcelizer;
        }
        if (obj2 == null) {
            obj2 = this.serializer;
        }
        if (fillsnake == null) {
            fillsnake = this.RemoteActionCompatParcelizer;
        }
        if (fillsnake2 == null) {
            fillsnake2 = this.read;
        }
        return new calculateDiff(obj, obj2, fillsnake, fillsnake2);
    }

    @Override // o.fillSnake
    public final int serializer() {
        return this.read.serializer() + this.RemoteActionCompatParcelizer.serializer() + 1;
    }

    public calculateDiff(Object obj, Object obj2, fillSnake fillsnake, fillSnake fillsnake2) {
        super(obj, obj2, fillsnake, fillsnake2);
    }
}
