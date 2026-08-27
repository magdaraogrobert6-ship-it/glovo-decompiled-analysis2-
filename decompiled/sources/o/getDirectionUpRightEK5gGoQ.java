package o;

import com.google.android.gms.internal.gtm.zzbv;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getDirectionUpRightEK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public static final getDirectionUpRightEK5gGoQ serializer = new getDirectionUpRightEK5gGoQ(0);
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ getDirectionUpRightEK5gGoQ(int i) {
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        getFunctionEK5gGoQ getfunctionek5ggoq;
        int i = this.IconCompatParcelizer;
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        if (i == 0) {
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
            getFunctionEK5gGoQ getfunctionek5ggoq2 = getfunctionek5ggoqArr[0];
            getFunctionEK5gGoQ getfunctionek5ggoq3 = getfunctionek5ggoqArr[1];
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(!androidx.room.Room.RemoteActionCompatParcelizer(getfunctionek5ggoq2));
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(!androidx.room.Room.RemoteActionCompatParcelizer(getfunctionek5ggoq3));
            String strIconCompatParcelizer = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq3);
            if (getfunctionek5ggoq2 instanceof getHenkanEK5gGoQ) {
                if ("length".equals(strIconCompatParcelizer)) {
                    return new getGuideEK5gGoQ(Boolean.TRUE);
                }
                double dRemoteActionCompatParcelizer = LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoq3);
                if (dRemoteActionCompatParcelizer == Math.floor(dRemoteActionCompatParcelizer)) {
                    int i2 = (int) dRemoteActionCompatParcelizer;
                    if (strIconCompatParcelizer.equals(Integer.toString(i2)) && i2 >= 0 && i2 < ((getHenkanEK5gGoQ) getfunctionek5ggoq2).serializer.size()) {
                        return new getGuideEK5gGoQ(Boolean.TRUE);
                    }
                }
            } else if (getfunctionek5ggoq2 instanceof getInfoEK5gGoQ) {
                if ("length".equals(strIconCompatParcelizer)) {
                    return new getGuideEK5gGoQ(Boolean.TRUE);
                }
                double dRemoteActionCompatParcelizer2 = LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoq3);
                if (dRemoteActionCompatParcelizer2 == Math.floor(dRemoteActionCompatParcelizer2)) {
                    int i3 = (int) dRemoteActionCompatParcelizer2;
                    if (strIconCompatParcelizer.equals(Integer.toString(i3)) && i3 >= 0 && i3 < ((getInfoEK5gGoQ) getfunctionek5ggoq2).RemoteActionCompatParcelizer.length()) {
                        return new getGuideEK5gGoQ(Boolean.TRUE);
                    }
                }
                return new getGuideEK5gGoQ(Boolean.FALSE);
            }
            HashMap map = getfunctionek5ggoq2.write;
            return new getGuideEK5gGoQ(Boolean.valueOf(map != null && map.containsKey(strIconCompatParcelizer)));
        }
        if (i == 1) {
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
            getFunctionEK5gGoQ getfunctionek5ggoq4 = getfunctionek5ggoqArr[0];
            boolean z = getfunctionek5ggoq4 instanceof getInfoEK5gGoQ;
            getFunctionEK5gGoQ getfunctionek5ggoq5 = getfunctionek5ggoqArr[1];
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(z || !androidx.room.Room.serializer(getfunctionek5ggoq4));
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(!androidx.room.Room.RemoteActionCompatParcelizer(getfunctionek5ggoq4));
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(true ^ androidx.room.Room.RemoteActionCompatParcelizer(getfunctionek5ggoq5));
            String strIconCompatParcelizer2 = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq5);
            if (getfunctionek5ggoq4 instanceof getHenkanEK5gGoQ) {
                getHenkanEK5gGoQ gethenkanek5ggoq = (getHenkanEK5gGoQ) getfunctionek5ggoq4;
                if ("length".equals(strIconCompatParcelizer2)) {
                    return new getGEK5gGoQ(Double.valueOf(gethenkanek5ggoq.serializer.size()));
                }
                double dRemoteActionCompatParcelizer3 = LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoq5);
                if (dRemoteActionCompatParcelizer3 == Math.floor(dRemoteActionCompatParcelizer3)) {
                    int i4 = (int) dRemoteActionCompatParcelizer3;
                    if (strIconCompatParcelizer2.equals(Integer.toString(i4)) && (getfunctionek5ggoq = gethenkanek5ggoq.read(i4)) != gethelpek5ggoq) {
                        return getfunctionek5ggoq;
                    }
                }
            } else if (z) {
                String str = ((getInfoEK5gGoQ) getfunctionek5ggoq4).RemoteActionCompatParcelizer;
                if ("length".equals(strIconCompatParcelizer2)) {
                    return new getGEK5gGoQ(Double.valueOf(str.length()));
                }
                double dRemoteActionCompatParcelizer4 = LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoq5);
                if (dRemoteActionCompatParcelizer4 != Math.floor(dRemoteActionCompatParcelizer4)) {
                    return gethelpek5ggoq;
                }
                int i5 = (int) dRemoteActionCompatParcelizer4;
                return (!strIconCompatParcelizer2.equals(Integer.toString(i5)) || i5 < 0 || i5 >= str.length()) ? gethelpek5ggoq : new getInfoEK5gGoQ(String.valueOf(str.charAt(i5)));
            }
            return getfunctionek5ggoq4.IconCompatParcelizer(strIconCompatParcelizer2);
        }
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 3);
        getFunctionEK5gGoQ getfunctionek5ggoq6 = getfunctionek5ggoqArr[0];
        getFunctionEK5gGoQ getfunctionek5ggoq7 = getfunctionek5ggoqArr[1];
        getFunctionEK5gGoQ getfunctionek5ggoq8 = getfunctionek5ggoqArr[2];
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq6 != getHelpEK5gGoQ.serializer);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq6 != gethelpek5ggoq);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(!androidx.room.Room.RemoteActionCompatParcelizer(getfunctionek5ggoq6));
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(!androidx.room.Room.RemoteActionCompatParcelizer(getfunctionek5ggoq7));
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(!androidx.room.Room.RemoteActionCompatParcelizer(getfunctionek5ggoq8));
        if (!androidx.room.Room.serializer(getfunctionek5ggoq6)) {
            String strIconCompatParcelizer3 = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq7);
            if (getfunctionek5ggoq6 instanceof getHomeEK5gGoQ) {
                getHomeEK5gGoQ gethomeek5ggoq = (getHomeEK5gGoQ) getfunctionek5ggoq6;
                if (!gethomeek5ggoq.read) {
                    gethomeek5ggoq.write(getfunctionek5ggoq8, strIconCompatParcelizer3);
                }
            } else if (getfunctionek5ggoq6 instanceof getHenkanEK5gGoQ) {
                getHenkanEK5gGoQ gethenkanek5ggoq2 = (getHenkanEK5gGoQ) getfunctionek5ggoq6;
                if ("length".equals(strIconCompatParcelizer3)) {
                    double dRemoteActionCompatParcelizer5 = LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoq8);
                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(!Double.isInfinite(dRemoteActionCompatParcelizer5) && dRemoteActionCompatParcelizer5 == Math.floor(dRemoteActionCompatParcelizer5));
                    gethenkanek5ggoq2.IconCompatParcelizer((int) dRemoteActionCompatParcelizer5);
                } else {
                    double dRemoteActionCompatParcelizer6 = LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoq7);
                    if (Double.isInfinite(dRemoteActionCompatParcelizer6) || dRemoteActionCompatParcelizer6 < 0.0d) {
                        getfunctionek5ggoq6.write(getfunctionek5ggoq8, strIconCompatParcelizer3);
                    } else {
                        int i6 = (int) dRemoteActionCompatParcelizer6;
                        if (!strIconCompatParcelizer3.equals(Integer.toString(i6))) {
                            getfunctionek5ggoq6.write(getfunctionek5ggoq8, strIconCompatParcelizer3);
                        } else {
                            if (i6 < 0) {
                                throw new IndexOutOfBoundsException();
                            }
                            ArrayList arrayList = gethenkanek5ggoq2.serializer;
                            if (i6 >= arrayList.size()) {
                                gethenkanek5ggoq2.IconCompatParcelizer(i6 + 1);
                            }
                            arrayList.set(i6, getfunctionek5ggoq8);
                        }
                    }
                }
            } else {
                getfunctionek5ggoq6.write(getfunctionek5ggoq8, strIconCompatParcelizer3);
            }
        }
        return getfunctionek5ggoq8;
    }
}
