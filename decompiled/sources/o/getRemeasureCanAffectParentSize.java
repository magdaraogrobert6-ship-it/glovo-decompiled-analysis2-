package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class getRemeasureCanAffectParentSize extends MeasureBlocks {
    public String IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public String write;

    public getRemeasureCanAffectParentSize() {
    }

    public final getRemeasureCanAffectParentSize RemoteActionCompatParcelizer(String str) {
        if (str != null) {
            this.RemoteActionCompatParcelizer = str;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null libraryName");
        return null;
    }

    public final getRemeasureCanAffectParentSize read(String str) {
        if (str != null) {
            this.write = str;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null buildId");
        return null;
    }

    public final getRemeasureCanAffectParentSize serializer(String str) {
        if (str != null) {
            this.IconCompatParcelizer = str;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null arch");
        return null;
    }

    public final measurePending write() {
        String str;
        String str2;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null && (str = this.RemoteActionCompatParcelizer) != null && (str2 = this.write) != null) {
            return new measurePending(str3, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.IconCompatParcelizer == null) {
            sb.append(" arch");
        }
        if (this.RemoteActionCompatParcelizer == null) {
            sb.append(" libraryName");
        }
        if (this.write == null) {
            sb.append(" buildId");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }

    public getRemeasureCanAffectParentSize(int i) {
    }
}
