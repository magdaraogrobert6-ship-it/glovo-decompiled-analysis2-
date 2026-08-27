package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getPrettyPrintedString implements mergeJsonObjects {
    public static final Object write = new Object();
    public volatile Object RemoteActionCompatParcelizer;
    public volatile getColorIntegerOrNulllambda0 read;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        Object obj = this.RemoteActionCompatParcelizer;
        if (obj != write) {
            return obj;
        }
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.read;
        if (getcolorintegerornulllambda0 == null) {
            return this.RemoteActionCompatParcelizer;
        }
        Object objWrite = getcolorintegerornulllambda0.write();
        this.RemoteActionCompatParcelizer = objWrite;
        this.read = null;
        return objWrite;
    }

    public static mergeJsonObjects RemoteActionCompatParcelizer(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0) {
        if ((getcolorintegerornulllambda0 instanceof getPrettyPrintedString) || (getcolorintegerornulllambda0 instanceof getColorIntegerOrNull)) {
            return getcolorintegerornulllambda0;
        }
        getPrettyPrintedString getprettyprintedstring = new getPrettyPrintedString();
        getprettyprintedstring.RemoteActionCompatParcelizer = write;
        getprettyprintedstring.read = getcolorintegerornulllambda0;
        return getprettyprintedstring;
    }
}
