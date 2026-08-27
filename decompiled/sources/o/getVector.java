package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class getVector extends executeDiff {
    public int write;

    @Override // o.fillSnake
    public final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // o.executeDiff
    public final applyDiff write() {
        return applyDiff.BLACK;
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
        return new getVector(obj, obj2, fillsnake, fillsnake2);
    }

    public getVector(Object obj, Object obj2, fillSnake fillsnake, fillSnake fillsnake2) {
        super(obj, obj2, fillsnake, fillsnake2);
        this.write = -1;
    }

    @Override // o.fillSnake
    public final int serializer() {
        if (this.write == -1) {
            this.write = this.read.serializer() + this.RemoteActionCompatParcelizer.serializer() + 1;
        }
        return this.write;
    }

    @Override // o.executeDiff
    public final void write(executeDiff executediff) {
        if (this.write == -1) {
            this.RemoteActionCompatParcelizer = executediff;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't set left after using size");
        }
    }
}
