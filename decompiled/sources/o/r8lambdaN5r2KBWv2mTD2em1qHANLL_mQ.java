package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import java.util.Arrays;
import java.util.Set;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaN5r2KBWv2mTD2em1qHANLL_mQ {
    public final int RemoteActionCompatParcelizer;
    public final undelegateUnprotectedui serializer;
    public final long write;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public r8lambdaN5r2KBWv2mTD2em1qHANLL_mQ(int i, long j, Set set) {
        undelegateUnprotectedui undelegateunprotecteduiRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i;
        this.write = j;
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
        this.serializer = undelegateunprotecteduiRemoteActionCompatParcelizer;
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer("maxAttempts", String.valueOf(this.RemoteActionCompatParcelizer));
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.write, "hedgingDelayNanos");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.serializer, "nonFatalStatusCodes");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        long j = this.write;
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Long.valueOf(j), this.serializer});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdaN5r2KBWv2mTD2em1qHANLL_mQ.class != obj.getClass()) {
            return false;
        }
        r8lambdaN5r2KBWv2mTD2em1qHANLL_mQ r8lambdan5r2kbwv2mtd2em1qhanll_mq = (r8lambdaN5r2KBWv2mTD2em1qHANLL_mQ) obj;
        return this.RemoteActionCompatParcelizer == r8lambdan5r2kbwv2mtd2em1qhanll_mq.RemoteActionCompatParcelizer && this.write == r8lambdan5r2kbwv2mtd2em1qhanll_mq.write && TuplesKt.RemoteActionCompatParcelizer(this.serializer, r8lambdan5r2kbwv2mtd2em1qhanll_mq.serializer);
    }
}
