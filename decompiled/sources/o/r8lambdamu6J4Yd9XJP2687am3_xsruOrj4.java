package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdamu6J4Yd9XJP2687am3_xsruOrj4 extends coil3.util.UtilsKt {
    public abstract coil3.util.UtilsKt serializer();

    @Override // coil3.util.UtilsKt
    public wouldPushPermissionPromptDisplaylambda2 read() {
        return serializer().read();
    }

    public final String toString() {
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7aiSerializer = coil3.util.UtilsKt.serializer(this);
        r8lambdalmkbrrgswwtv97obrsj7trj7aiSerializer.IconCompatParcelizer(serializer(), "delegate");
        return r8lambdalmkbrrgswwtv97obrsj7trj7aiSerializer.toString();
    }
}
