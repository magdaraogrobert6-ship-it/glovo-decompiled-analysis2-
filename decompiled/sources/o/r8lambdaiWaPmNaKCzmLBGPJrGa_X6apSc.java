package o;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambdaiWaPmNaKCzmLBGPJrGa_X6apSc extends migratePushMaxStorageToJsonlambda20 {
    private Object read;
    final /* synthetic */ r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaiWaPmNaKCzmLBGPJrGa_X6apSc(r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4 r8lambdaid4jozuplgwksgkjox8hlmlmsd4) {
        super(r8lambdaid4jozuplgwksgkjox8hlmlmsd4);
        this.write = r8lambdaid4jozuplgwksgkjox8hlmlmsd4;
    }

    @Override // o.migratePushMaxStorageToJsonlambda20
    public final void read(int i, Object obj) {
        this.write.write(obj, i, this.read);
    }

    public final void write(Object obj) {
        this.read = obj;
        RemoteActionCompatParcelizer();
    }
}
