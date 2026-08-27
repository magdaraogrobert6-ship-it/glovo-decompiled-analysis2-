package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import java.util.Arrays;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonUtilsc {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public boolean serializer;

    public JsonUtilsc() {
        androidx.sqlite.SQLite.serializer(4, "initialCapacity");
        this.RemoteActionCompatParcelizer = new Object[4];
        this.read = 0;
    }

    public void write(Object... objArr) {
        int length = objArr.length;
        coil3.util.ContextsKt.serializer(length, objArr);
        IconCompatParcelizer(this.read + length);
        System.arraycopy(objArr, 0, (Object[]) this.RemoteActionCompatParcelizer, this.read, length);
        this.read += length;
    }

    public void IconCompatParcelizer(int i) {
        Object[] objArr = (Object[]) this.RemoteActionCompatParcelizer;
        if (objArr.length < i) {
            this.RemoteActionCompatParcelizer = Arrays.copyOf(objArr, write(objArr.length, i));
            this.serializer = false;
        } else if (this.serializer) {
            this.RemoteActionCompatParcelizer = (Object[]) objArr.clone();
            this.serializer = false;
        }
    }

    public String toString() {
        if (this.IconCompatParcelizer != 0) {
            return super.toString();
        }
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((mergeJsonObjectslambda10) this.RemoteActionCompatParcelizer, "callOptions");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer("previousAttempts", String.valueOf(this.read));
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer("isTransparentRetry", this.serializer);
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public static int write(int i, int i2) {
        if (i2 < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "cannot store more than MAX_VALUE elements");
            return 0;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public JsonUtilsc(mergeJsonObjectslambda10 mergejsonobjectslambda10, int i, boolean z) {
        TextStreamsKt.serializer(mergejsonobjectslambda10, "callOptions");
        this.RemoteActionCompatParcelizer = mergejsonobjectslambda10;
        this.read = i;
        this.serializer = z;
    }

    public void write(Object obj) {
        obj.getClass();
        IconCompatParcelizer(this.read + 1);
        Object[] objArr = (Object[]) this.RemoteActionCompatParcelizer;
        int i = this.read;
        this.read = i + 1;
        objArr[i] = obj;
    }
}
