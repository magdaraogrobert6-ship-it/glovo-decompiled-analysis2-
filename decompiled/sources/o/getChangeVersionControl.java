package o;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class getChangeVersionControl implements FwFClientKt {
    public final /* synthetic */ int IconCompatParcelizer;
    public static final getChangeVersionControl write = new getChangeVersionControl(1);
    public static final getChangeVersionControl RemoteActionCompatParcelizer = new getChangeVersionControl(2);

    public List write() {
        return Collections.EMPTY_LIST;
    }

    public boolean write(Method method) {
        return false;
    }

    public /* synthetic */ getChangeVersionControl(int i) {
        this.IconCompatParcelizer = i;
    }

    public List serializer(Executor executor) {
        return Collections.singletonList(new accessgetActionp(executor));
    }

    public Object write(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    @Override // o.FwFClientKt
    public Object IconCompatParcelizer(Object obj) {
        if (this.IconCompatParcelizer == 1) {
            return obj.toString();
        }
        ((_get_messageWebView_lambda3) obj).close();
        return createFromParcel.INSTANCE;
    }

    public String IconCompatParcelizer(Method method, int i) {
        return "parameter #" + (i + 1);
    }
}
