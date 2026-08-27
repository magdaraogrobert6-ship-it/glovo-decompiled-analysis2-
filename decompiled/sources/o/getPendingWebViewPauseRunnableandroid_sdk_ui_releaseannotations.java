package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public class getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations implements Iterable, displayInAppMessagelambda121 {
    public final int read;
    public final int serializer;
    public final int write;

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public final getInAppMessageStackannotations iterator() {
        return new getInAppMessageStackannotations(this.write, this.read, this.serializer);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.read;
        int i2 = this.serializer;
        int i3 = this.write;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }

    public boolean write() {
        int i = this.read;
        int i2 = this.serializer;
        int i3 = this.write;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations)) {
            return false;
        }
        if (write() && ((getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations) obj).write()) {
            return true;
        }
        getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations = (getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations) obj;
        return this.write == getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations.write && this.read == getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations.read && this.serializer == getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations.serializer;
    }

    public int hashCode() {
        if (write()) {
            return -1;
        }
        int i = this.write;
        return (((i * 31) + this.read) * 31) + this.serializer;
    }

    public getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations(int i, int i2, int i3) {
        if (i3 == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.write = i;
        this.read = TuplesKt.read(i, i2, i3);
        this.serializer = i3;
    }
}
