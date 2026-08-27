package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getDeclaredMethodQuietly {
    public final getDeclaredMethodQuietlylambda1 IconCompatParcelizer;
    public final List serializer;
    public final getPrettyPrintedStringlambda0 write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer, this.write, this.IconCompatParcelizer});
    }

    public getDeclaredMethodQuietly(List list, getPrettyPrintedStringlambda0 getprettyprintedstringlambda0, getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda1) {
        this.serializer = Collections.unmodifiableList(new ArrayList(list));
        TextStreamsKt.serializer(getprettyprintedstringlambda0, "attributes");
        this.write = getprettyprintedstringlambda0;
        this.IconCompatParcelizer = getdeclaredmethodquietlylambda1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getDeclaredMethodQuietly)) {
            return false;
        }
        getDeclaredMethodQuietly getdeclaredmethodquietly = (getDeclaredMethodQuietly) obj;
        return TuplesKt.RemoteActionCompatParcelizer(this.serializer, getdeclaredmethodquietly.serializer) && TuplesKt.RemoteActionCompatParcelizer(this.write, getdeclaredmethodquietly.write) && TuplesKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getdeclaredmethodquietly.IconCompatParcelizer);
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.serializer, "addresses");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.write, "attributes");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.IconCompatParcelizer, "serviceConfig");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }
}
