package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class voteFrameRate {
    public final String read;
    public final ArrayList write;

    public static voteFrameRate write(String str, ArrayList arrayList) {
        return new voteFrameRate(str, arrayList);
    }

    public final int hashCode() {
        return ((this.read.hashCode() ^ 1000003) * 1000003) ^ this.write.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof voteFrameRate)) {
            return false;
        }
        voteFrameRate voteframerate = (voteFrameRate) obj;
        return this.read.equals(voteframerate.read) && this.write.equals(voteframerate.write);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.read + ", usedDates=" + this.write + "}";
    }

    public voteFrameRate(String str, ArrayList arrayList) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null userAgent");
            throw null;
        }
        this.read = str;
        this.write = arrayList;
    }
}
