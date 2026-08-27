package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import java.util.Arrays;
import java.util.Set;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class onPageFinishedlambda00 {
    public final long IconCompatParcelizer;
    public final undelegateUnprotectedui MediaSessionCompatQueueItem;
    public final long RemoteActionCompatParcelizer;
    public final Long read;
    public final int serializer;
    public final double write;

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public onPageFinishedlambda00(int i, long j, long j2, double d, Long l, Set set) {
        undelegateUnprotectedui undelegateunprotecteduiRemoteActionCompatParcelizer;
        this.serializer = i;
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = j2;
        this.write = d;
        this.read = l;
        int i2 = undelegateUnprotectedui.read;
        if (!(set instanceof undelegateUnprotectedui) || (set instanceof java.util.SortedSet)) {
            Object[] array = set.toArray();
            undelegateunprotecteduiRemoteActionCompatParcelizer = undelegateUnprotectedui.RemoteActionCompatParcelizer(array.length, array);
        } else {
            undelegateunprotecteduiRemoteActionCompatParcelizer = (undelegateUnprotectedui) set;
            if (undelegateunprotecteduiRemoteActionCompatParcelizer.serializer()) {
                Object[] array2 = set.toArray();
                undelegateunprotecteduiRemoteActionCompatParcelizer = undelegateUnprotectedui.RemoteActionCompatParcelizer(array2.length, array2);
            }
        }
        this.MediaSessionCompatQueueItem = undelegateunprotecteduiRemoteActionCompatParcelizer;
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer("maxAttempts", String.valueOf(this.serializer));
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "initialBackoffNanos");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.IconCompatParcelizer, "maxBackoffNanos");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer("backoffMultiplier", String.valueOf(this.write));
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.read, "perAttemptRecvTimeoutNanos");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.MediaSessionCompatQueueItem, "retryableStatusCodes");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof onPageFinishedlambda00)) {
            return false;
        }
        onPageFinishedlambda00 onpagefinishedlambda00 = (onPageFinishedlambda00) obj;
        return this.serializer == onpagefinishedlambda00.serializer && this.RemoteActionCompatParcelizer == onpagefinishedlambda00.RemoteActionCompatParcelizer && this.IconCompatParcelizer == onpagefinishedlambda00.IconCompatParcelizer && Double.compare(this.write, onpagefinishedlambda00.write) == 0 && TuplesKt.RemoteActionCompatParcelizer(this.read, onpagefinishedlambda00.read) && TuplesKt.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, onpagefinishedlambda00.MediaSessionCompatQueueItem);
    }

    public final int hashCode() {
        int i = this.serializer;
        long j = this.RemoteActionCompatParcelizer;
        long j2 = this.IconCompatParcelizer;
        double d = this.write;
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Double.valueOf(d), this.read, this.MediaSessionCompatQueueItem});
    }
}
