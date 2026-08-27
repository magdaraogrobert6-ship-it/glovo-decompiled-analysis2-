package o;

/* JADX INFO: loaded from: classes3.dex */
final class configureFromServerConfiglambda0 implements Runnable {
    final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ configureFromServerConfiglambda0(int i, Object obj) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.write != 0) {
            ((r8lambdayNnfP9OWdJ6S3Hy631x_brBzgQA) this.RemoteActionCompatParcelizer).read();
            return;
        }
        synchronized (((r8lambdazmDtqPjRUbwDy4jaRuHv97mCORE) this.RemoteActionCompatParcelizer)) {
            if (((r8lambdazmDtqPjRUbwDy4jaRuHv97mCORE) this.RemoteActionCompatParcelizer).IconCompatParcelizer) {
                ((r8lambdazmDtqPjRUbwDy4jaRuHv97mCORE) this.RemoteActionCompatParcelizer).IconCompatParcelizer();
                ((r8lambdazmDtqPjRUbwDy4jaRuHv97mCORE) this.RemoteActionCompatParcelizer).read.serializer(this, 1000L);
            }
        }
    }
}
