package o;

import android.text.TextUtils;
import androidx.transition.Transition$1;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetMinp {
    public static final Transition$1 IconCompatParcelizer = new Transition$1(12);
    public final _init_lambda5 RemoteActionCompatParcelizer;
    public final Object read;
    public volatile byte[] serializer;
    public final String write;

    public final Object read() {
        return this.read;
    }

    public static accessgetMinp serializer(Object obj, String str) {
        return new accessgetMinp(str, obj, IconCompatParcelizer);
    }

    public final void IconCompatParcelizer(Object obj, MessageDigest messageDigest) {
        _init_lambda5 _init_lambda5Var = this.RemoteActionCompatParcelizer;
        if (this.serializer == null) {
            this.serializer = this.write.getBytes(eotfFunclambda0.read);
        }
        _init_lambda5Var.RemoteActionCompatParcelizer(this.serializer, obj, messageDigest);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public accessgetMinp(String str, Object obj, _init_lambda5 _init_lambda5Var) {
        if (TextUtils.isEmpty(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must not be null or empty");
            throw null;
        }
        this.write = str;
        this.read = obj;
        this.RemoteActionCompatParcelizer = _init_lambda5Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof accessgetMinp) {
            return this.write.equals(((accessgetMinp) obj).write);
        }
        return false;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Option{key='"), this.write, "'}");
    }
}
