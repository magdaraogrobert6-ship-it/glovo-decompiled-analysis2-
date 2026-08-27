package o;

import com.google.android.gms.internal.gtm.zzbv;
import io.grpc.LoadBalancer$Helper;

/* JADX INFO: loaded from: classes2.dex */
public final class getEnvelopeEK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public static final getGEK5gGoQ serializer = new getGEK5gGoQ(Double.valueOf(0.0d));
    public static final getGEK5gGoQ RemoteActionCompatParcelizer = new getGEK5gGoQ(Double.valueOf(2.147483647E9d));

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        double dDoubleValue;
        double dDoubleValue2;
        int length = getfunctionek5ggoqArr.length;
        getFunctionEK5gGoQ getfunctionek5ggoq = length > 0 ? getfunctionek5ggoqArr[0] : serializer;
        getFunctionEK5gGoQ getfunctionek5ggoq2 = length > 1 ? getfunctionek5ggoqArr[1] : RemoteActionCompatParcelizer;
        if (getfunctionek5ggoq instanceof getGEK5gGoQ) {
            getGEK5gGoQ getgek5ggoq = (getGEK5gGoQ) getfunctionek5ggoq;
            if (Double.isNaN(getgek5ggoq.serializer.doubleValue()) || !(getfunctionek5ggoq2 instanceof getGEK5gGoQ)) {
                dDoubleValue = 0.0d;
                dDoubleValue2 = 2.147483647E9d;
            } else {
                getGEK5gGoQ getgek5ggoq2 = (getGEK5gGoQ) getfunctionek5ggoq2;
                if (Double.isNaN(getgek5ggoq2.serializer.doubleValue()) || !LoadBalancer$Helper.read(getfunctionek5ggoq, getfunctionek5ggoq2)) {
                    dDoubleValue = 0.0d;
                    dDoubleValue2 = 2.147483647E9d;
                } else {
                    dDoubleValue = getgek5ggoq.serializer.doubleValue();
                    dDoubleValue2 = getgek5ggoq2.serializer.doubleValue();
                }
            }
        } else {
            dDoubleValue = 0.0d;
            dDoubleValue2 = 2.147483647E9d;
        }
        return new getGEK5gGoQ(Double.valueOf(Math.round(((dDoubleValue2 - dDoubleValue) * Math.random()) + dDoubleValue)));
    }
}
