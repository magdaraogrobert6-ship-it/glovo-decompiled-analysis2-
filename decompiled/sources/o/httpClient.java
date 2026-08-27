package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class httpClient {
    public int[] serializer;

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.serializer;
        sb.append(iArr[0]);
        String string = sb.toString();
        for (int i = 1; i < iArr.length; i++) {
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(string, ", ");
            sbM.append(iArr[i]);
            string = sbM.toString();
        }
        return string.concat("]");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof httpClient) {
            return getJEK5gGoQ.IconCompatParcelizer(this.serializer, ((httpClient) obj).serializer);
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.serializer;
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }
}
