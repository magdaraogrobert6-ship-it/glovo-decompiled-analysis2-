package androidx.constraintlayout.core.parser;

import com.huawei.hms.android.SystemUtils;
import o.DropShadowScope;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public CLParsingException(String str, DropShadowScope dropShadowScope) {
        super(str);
        this.RemoteActionCompatParcelizer = str;
        if (dropShadowScope != null) {
            this.write = dropShadowScope.RatingCompat();
        } else {
            this.write = SystemUtils.UNKNOWN;
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.RemoteActionCompatParcelizer + " (" + this.write + " at line 0)");
        return sb.toString();
    }
}
