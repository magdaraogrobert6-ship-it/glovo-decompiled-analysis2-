package o;

import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComposeKtPath25 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final VectorComposeKtPath25 RemoteActionCompatParcelizer = new VectorComposeKtPath25(1);

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return Uri.encode((String) entry.getKey()) + '=' + Uri.encode((String) entry.getValue());
    }

    public VectorComposeKtPath25(int i) {
        super(i);
    }
}
