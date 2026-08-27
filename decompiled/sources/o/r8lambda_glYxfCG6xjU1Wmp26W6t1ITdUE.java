package o;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE {
    public static final parseJsonObjectIntoBundle IconCompatParcelizer = new parseJsonObjectIntoBundle("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final getPrettyPrintedStringlambda0 RemoteActionCompatParcelizer;
    public final List read;
    public final int serializer;

    public final int hashCode() {
        return this.serializer;
    }

    public r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE(SocketAddress socketAddress) {
        getPrettyPrintedStringlambda0 getprettyprintedstringlambda0 = getPrettyPrintedStringlambda0.serializer;
        List listSingletonList = Collections.singletonList(socketAddress);
        TextStreamsKt.read("addrs is empty", !listSingletonList.isEmpty());
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listSingletonList));
        this.read = listUnmodifiableList;
        TextStreamsKt.serializer(getprettyprintedstringlambda0, "attrs");
        this.RemoteActionCompatParcelizer = getprettyprintedstringlambda0;
        this.serializer = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE)) {
            return false;
        }
        r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE r8lambda_glyxfcg6xju1wmp26w6t1itdue = (r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) obj;
        List list = r8lambda_glyxfcg6xju1wmp26w6t1itdue.read;
        List list2 = this.read;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!((SocketAddress) list2.get(i)).equals(list.get(i))) {
                return false;
            }
        }
        return this.RemoteActionCompatParcelizer.equals(r8lambda_glyxfcg6xju1wmp26w6t1itdue.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "[" + this.read + "/" + this.RemoteActionCompatParcelizer + "]";
    }
}
