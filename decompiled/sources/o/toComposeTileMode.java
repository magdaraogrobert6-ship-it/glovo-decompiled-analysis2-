package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class toComposeTileMode implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int read;
    public final /* synthetic */ getFillTypeRgk1Os serializer;

    public /* synthetic */ toComposeTileMode(getFillTypeRgk1Os getfilltypergk1os, int i) {
        this.read = i;
        this.serializer = getfilltypergk1os;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.read;
        getFillTypeRgk1Os getfilltypergk1os = this.serializer;
        String str = (String) obj;
        if (i != 0) {
            str.getClass();
            zContains = getfilltypergk1os.read().contains(str);
        } else {
            str.getClass();
            zContains = getfilltypergk1os.read().contains(str);
        }
        return Boolean.valueOf(!zContains);
    }
}
