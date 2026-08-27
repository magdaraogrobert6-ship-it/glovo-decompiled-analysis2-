package o;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdadoClphLDH84V28u6usJH1THq0 {
    public final int IconCompatParcelizer;
    public final String[] serializer;

    public final int hashCode() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        return Arrays.toString(this.serializer);
    }

    public r8lambdadoClphLDH84V28u6usJH1THq0(r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE r8lambda_glyxfcg6xju1wmp26w6t1itdue) {
        TextStreamsKt.serializer(r8lambda_glyxfcg6xju1wmp26w6t1itdue, "eag");
        List list = r8lambda_glyxfcg6xju1wmp26w6t1itdue.read;
        this.serializer = new String[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.serializer[i] = ((SocketAddress) it.next()).toString();
            i++;
        }
        Arrays.sort(this.serializer);
        this.IconCompatParcelizer = Arrays.hashCode(this.serializer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r8lambdadoClphLDH84V28u6usJH1THq0)) {
            return false;
        }
        r8lambdadoClphLDH84V28u6usJH1THq0 r8lambdadoclphldh84v28u6usjh1thq0 = (r8lambdadoClphLDH84V28u6usJH1THq0) obj;
        if (r8lambdadoclphldh84v28u6usjh1thq0.IconCompatParcelizer == this.IconCompatParcelizer) {
            String[] strArr = r8lambdadoclphldh84v28u6usjh1thq0.serializer;
            int length = strArr.length;
            String[] strArr2 = this.serializer;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }
}
