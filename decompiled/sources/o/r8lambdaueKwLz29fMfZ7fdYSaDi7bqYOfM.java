package o;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM implements Comparable<r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM> {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private static final getInAppMessageEventMap RemoteActionCompatParcelizer = new getInAppMessageEventMap("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:[-+].*)?$");
    private final int read;
    private final int serializer;
    private final int write;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int IconCompatParcelizer() {
        return this.serializer;
    }

    public final int read() {
        return this.read;
    }

    public final int write() {
        return this.write;
    }

    public final int hashCode() {
        return Integer.hashCode(this.read) + af$$ExternalSyntheticOutline0.m(this.serializer, Integer.hashCode(this.write) * 31, 31);
    }

    public r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM(int i, int i2, int i3) {
        this.write = i;
        this.serializer = i2;
        this.read = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM)) {
            return false;
        }
        r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM r8lambdauekwlz29fmfz7fdysadi7bqyofm = (r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM) obj;
        return this.write == r8lambdauekwlz29fmfz7fdysadi7bqyofm.write && this.serializer == r8lambdauekwlz29fmfz7fdysadi7bqyofm.serializer && this.read == r8lambdauekwlz29fmfz7fdysadi7bqyofm.read;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM r8lambdauekwlz29fmfz7fdysadi7bqyofm) {
        r8lambdauekwlz29fmfz7fdysadi7bqyofm.getClass();
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM[] r8lambdaunavo3sxub_pc9xroryotnrlvsmArr = {new accessgetInstanceLockcp(r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM.class, "major", "getMajor()I", 0) { // from class: com.sentiance.sdk.util.SemVer$compareTo$1
            @Override // o.accessgetInstanceLockcp, o.requestDisplayInAppMessagelambda0
            public final Object write(Object obj) {
                return Integer.valueOf(((r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM) obj).write());
            }
        }, new accessgetInstanceLockcp(r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM.class, "minor", "getMinor()I", 0) { // from class: com.sentiance.sdk.util.SemVer$compareTo$2
            @Override // o.accessgetInstanceLockcp, o.requestDisplayInAppMessagelambda0
            public final Object write(Object obj) {
                return Integer.valueOf(((r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM) obj).IconCompatParcelizer());
            }
        }, new accessgetInstanceLockcp(r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM.class, "patch", "getPatch()I", 0) { // from class: com.sentiance.sdk.util.SemVer$compareTo$3
            @Override // o.accessgetInstanceLockcp, o.requestDisplayInAppMessagelambda0
            public final Object write(Object obj) {
                return Integer.valueOf(((r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM) obj).read());
            }
        }};
        for (int i = 0; i < 3; i++) {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = r8lambdaunavo3sxub_pc9xroryotnrlvsmArr[i];
            int iRemoteActionCompatParcelizer = setNativeShader.RemoteActionCompatParcelizer((Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this), (Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(r8lambdauekwlz29fmfz7fdysadi7bqyofm));
            if (iRemoteActionCompatParcelizer != 0) {
                return iRemoteActionCompatParcelizer;
            }
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SemVer(major=");
        sb.append(this.write);
        sb.append(", minor=");
        sb.append(this.serializer);
        sb.append(", patch=");
        return af$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }
}
