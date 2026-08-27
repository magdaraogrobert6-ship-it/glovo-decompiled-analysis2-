package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getDEK5gGoQ {
    public static final String[] RemoteActionCompatParcelizer = {getButtonL1EK5gGoQ.ARG0.toString(), getButtonL1EK5gGoQ.ARG1.toString()};
    public final String[] serializer;
    public final String write;

    public getDEK5gGoQ(String[] strArr) {
        this.write = "regex";
        this.serializer = strArr;
    }

    public getDEK5gGoQ(String str) {
        this.write = str;
        this.serializer = RemoteActionCompatParcelizer;
    }
}
