package o;

import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class foregroundTimerFired {
    private static int serializer = 0;
    private static int write = 1;
    public final insertTextAtCursor IconCompatParcelizer;
    public final r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 RemoteActionCompatParcelizer;
    public final OkHttpCall$1 read;

    public foregroundTimerFired(r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8, accessgetOldDependencyp accessgetolddependencyp, insertTextAtCursor inserttextatcursor, OkHttpCall$1 okHttpCall$1) {
        this.RemoteActionCompatParcelizer = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
        this.IconCompatParcelizer = inserttextatcursor;
        this.read = okHttpCall$1;
    }

    public final String serializer() {
        String str;
        int i = 2 % 2;
        int i2 = write + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer.serializer();
        Object obj = null;
        if (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer == null) {
            return null;
        }
        int i4 = serializer + 33;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            str = r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.serializer;
            int i5 = 70 / 0;
        } else {
            str = r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.serializer;
        }
        int i6 = serializer + 65;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
