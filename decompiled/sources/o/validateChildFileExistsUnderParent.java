package o;

import com.huawei.hmf.tasks.a.d$a;
import io.grpc.Status;
import io.grpc.internal.DelayedStream$3;
import kotlin.io.TextStreamsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class validateChildFileExistsUnderParent extends RangesKt {
    public final unpackZipIntoDirectory IconCompatParcelizer;
    public final /* synthetic */ hasTooManyZipEntrieslambda0 RemoteActionCompatParcelizer;
    public final r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc read;

    @Override // kotlin.ranges.RangesKt
    public final void IconCompatParcelizer(getDeclaredMethodQuietly getdeclaredmethodquietly) {
        this.RemoteActionCompatParcelizer.addOnNewIntentListener.execute(new DelayedStream$3(this, 1, getdeclaredmethodquietly));
    }

    public validateChildFileExistsUnderParent(hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0, unpackZipIntoDirectory unpackzipintodirectory, markPageFinished markpagefinished) {
        this.RemoteActionCompatParcelizer = hastoomanyzipentrieslambda0;
        this.IconCompatParcelizer = unpackzipintodirectory;
        TextStreamsKt.serializer(markpagefinished, "resolver");
        this.read = markpagefinished;
    }

    @Override // kotlin.ranges.RangesKt
    public final void serializer(Status status) {
        TextStreamsKt.read("the error status must not be OK", !status.IconCompatParcelizer());
        this.RemoteActionCompatParcelizer.addOnNewIntentListener.execute(new d$a(this, 14, status));
    }
}
