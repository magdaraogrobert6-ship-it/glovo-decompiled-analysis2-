package o;

import java.util.ArrayList;
import java.util.List;
import org.koin.core.error.NoParameterFoundException;

/* JADX INFO: loaded from: classes4.dex */
public class getTrackingServicefwf_client_release {
    public int IconCompatParcelizer;
    public final List serializer;

    public Object RemoteActionCompatParcelizer(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk) throws NoParameterFoundException {
        List list = this.serializer;
        if (list.size() > 0) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder("Can't get injected parameter #0 from ");
        sb.append(this);
        String strIconCompatParcelizer = FwFClientCompanion.IconCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk);
        sb.append(" for type '");
        sb.append(strIconCompatParcelizer);
        sb.append('\'');
        throw new NoParameterFoundException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public Object write(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk) {
        List list = this.serializer;
        if (list.isEmpty()) {
            return null;
        }
        Object obj = list.get(this.IconCompatParcelizer);
        if (!r8lambdaucgighn8fiyv_vccodeafjfpedk.read(obj)) {
            obj = null;
        }
        if (obj == null) {
            obj = null;
        }
        if (obj != null && this.IconCompatParcelizer < list.size() - 1) {
            this.IconCompatParcelizer++;
        }
        if (obj != null) {
            return obj;
        }
        for (Object obj2 : list) {
            if (r8lambdaucgighn8fiyv_vccodeafjfpedk.read(obj2)) {
                if (obj2 != null) {
                    return obj2;
                }
                return null;
            }
        }
        obj2 = null;
        if (obj2 != null) {
            return obj2;
        }
        return null;
    }

    public final String toString() {
        return "DefinitionParameters" + onContentCardDismissed.PlaybackStateCompat(this.serializer);
    }

    public getTrackingServicefwf_client_release(int i, ArrayList arrayList) {
        this.serializer = (i & 1) != 0 ? new ArrayList() : arrayList;
    }
}
