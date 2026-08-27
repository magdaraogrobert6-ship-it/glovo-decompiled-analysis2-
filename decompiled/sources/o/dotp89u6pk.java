package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dotp89u6pk implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ translateimpldefault IconCompatParcelizer;
    public final /* synthetic */ tintxETnrds serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ dotp89u6pk(translateimpldefault translateimpldefaultVar, tintxETnrds tintxetnrds, int i) {
        this.write = i;
        this.IconCompatParcelizer = translateimpldefaultVar;
        this.serializer = tintxetnrds;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        tintxETnrds tintxetnrds = this.serializer;
        translateimpldefault translateimpldefaultVar = this.IconCompatParcelizer;
        ImageKt imageKt = (ImageKt) obj;
        if (i != 0) {
            imageKt.getClass();
            translateimpldefaultVar.write(tintxetnrds, imageKt);
            return createfromparcel;
        }
        imageKt.getClass();
        translateimpldefaultVar.read(tintxetnrds, imageKt);
        return createfromparcel;
    }
}
