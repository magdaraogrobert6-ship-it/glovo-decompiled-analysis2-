package o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda0yxD5DkGhVMG1YCzKpa6a1a1ps0 implements Closeable {
    public final /* synthetic */ r8lambdaMkSjJB1nMG37oUW_yupQha4 IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final ArrayList serializer;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer((ItemSingleChoiceBinding) it.next());
        }
    }

    public r8lambda0yxD5DkGhVMG1YCzKpa6a1a1ps0(r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4, String str, long j, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.IconCompatParcelizer = r8lambdamksjjb1nmg37ouw_yupqha4;
        this.RemoteActionCompatParcelizer = str;
        this.read = j;
        this.serializer = arrayList;
    }
}
