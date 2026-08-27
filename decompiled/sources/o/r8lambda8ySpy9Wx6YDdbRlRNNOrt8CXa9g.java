package o;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambda8ySpy9Wx6YDdbRlRNNOrt8CXa9g {
    private final parseLonglambda0 serializer;

    public final void read() {
        this.serializer.write("DSKOLogger: %s", "Model is not loaded! or was not loaded correctly!");
    }

    public r8lambda8ySpy9Wx6YDdbRlRNNOrt8CXa9g(parseLonglambda0 parselonglambda0) {
        this.serializer = parselonglambda0;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.serializer.RemoteActionCompatParcelizer("DSKOLogger: %s", str);
    }

    public final void read(String str) {
        this.serializer.IconCompatParcelizer("DSKOLogger: %s", str);
    }
}
