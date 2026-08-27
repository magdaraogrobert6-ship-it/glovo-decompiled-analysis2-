package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0 extends r8lambdaSZ2Qv5o_Tom9JUx0KS0E99hczu8 {
    private final boolean read;
    private final boolean write;

    public final boolean write() {
        return this.read;
    }

    public /* synthetic */ r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0(long j, long j2, boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, z, z2, (i & 16) != 0 ? instance_delegatelambda0.write : list);
    }

    public static r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0 RemoteActionCompatParcelizer(r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0 r8lambdauqhb7dt0btnjovszzbervrbdwj0, long j, ArrayList arrayList, int i) {
        long jSerializer = r8lambdauqhb7dt0btnjovszzbervrbdwj0.serializer();
        if ((i & 2) != 0) {
            j = r8lambdauqhb7dt0btnjovszzbervrbdwj0.IconCompatParcelizer();
        }
        long j2 = j;
        boolean z = r8lambdauqhb7dt0btnjovszzbervrbdwj0.write;
        boolean z2 = r8lambdauqhb7dt0btnjovszzbervrbdwj0.read;
        List listMediaDescriptionCompat = arrayList;
        if ((i & 16) != 0) {
            listMediaDescriptionCompat = r8lambdauqhb7dt0btnjovszzbervrbdwj0.MediaDescriptionCompat();
        }
        return new r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0(jSerializer, j2, z, z2, listMediaDescriptionCompat);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0(long j, long j2, boolean z, boolean z2, List<? extends handleLogClickdefault> list) {
        super(j, j2, list);
        list.getClass();
        this.write = z;
        this.read = z2;
    }
}
