package o;

import bo.app.w$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.grpc.Status;
import java.util.Arrays;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getDeclaredMethodQuietlylambda1 {
    public final Status IconCompatParcelizer;
    public final Object write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.IconCompatParcelizer, this.write});
    }

    public getDeclaredMethodQuietlylambda1(Status status) {
        this.write = null;
        TextStreamsKt.serializer(status, "status");
        this.IconCompatParcelizer = status;
        TextStreamsKt.read(new Object[]{"cannot use OK status: %s", status, Boolean.valueOf(!status.IconCompatParcelizer())}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -783877068, w$$ExternalSyntheticLambda0.write(), 783877070, w$$ExternalSyntheticLambda0.write());
    }

    public final String toString() {
        Object obj = this.write;
        if (obj != null) {
            int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
            r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
            r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(obj, "config");
            return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
        }
        int i2 = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai2 = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i2, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai2.IconCompatParcelizer(this.IconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_ERROR);
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getDeclaredMethodQuietlylambda1.class != obj.getClass()) {
            return false;
        }
        getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda1 = (getDeclaredMethodQuietlylambda1) obj;
        return TuplesKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getdeclaredmethodquietlylambda1.IconCompatParcelizer) && TuplesKt.RemoteActionCompatParcelizer(this.write, getdeclaredmethodquietlylambda1.write);
    }

    public getDeclaredMethodQuietlylambda1(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer = null;
    }
}
