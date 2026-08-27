package o;

import com.huawei.hmf.tasks.a.i$d;
import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getOnTouchEvent {
    public final Integer IconCompatParcelizer;
    public final getDisallowInterceptui read;

    public /* synthetic */ getOnTouchEvent(i$d i_d) {
        this.read = (getDisallowInterceptui) i_d.serializer;
        this.IconCompatParcelizer = (Integer) i_d.read;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.read, this.IconCompatParcelizer, null, null});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getOnTouchEvent)) {
            return false;
        }
        getOnTouchEvent getontouchevent = (getOnTouchEvent) obj;
        return TuplesKt.write(this.read, getontouchevent.read) && TuplesKt.write(this.IconCompatParcelizer, getontouchevent.IconCompatParcelizer) && TuplesKt.write((Object) null, (Object) null) && TuplesKt.write((Object) null, (Object) null);
    }
}
