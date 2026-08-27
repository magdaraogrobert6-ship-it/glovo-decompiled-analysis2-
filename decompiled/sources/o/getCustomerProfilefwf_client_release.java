package o;

import java.io.Serializable;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class getCustomerProfilefwf_client_release implements Serializable {
    public final transient long read;
    public final TreeMap serializer;

    public final getCustomerProfilefwf_client_release RemoteActionCompatParcelizer(getNetworkModule getnetworkmodule) {
        getCustomerProfilefwf_client_release getcustomerprofilefwf_client_release = new getCustomerProfilefwf_client_release(this.read);
        TreeMap treeMap = this.serializer;
        for (Integer num : treeMap.keySet()) {
            getAccountConfigfwf_client_release getaccountconfigfwf_client_release = (getAccountConfigfwf_client_release) treeMap.get(num);
            getaccountconfigfwf_client_release.getClass();
            getcustomerprofilefwf_client_release.serializer.put(num, new getAccountConfigfwf_client_release(getaccountconfigfwf_client_release, getnetworkmodule));
        }
        return getcustomerprofilefwf_client_release;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0115  */
    public getCustomerProfilefwf_client_release(setHoldoutKeysfwf_client_release setholdoutkeysfwf_client_release, long j, byte[] bArr, byte[] bArr2) {
        int i;
        long j2;
        long j3;
        getCustomerProfilefwf_client_release getcustomerprofilefwf_client_release;
        int i2;
        getCustomerProfilefwf_client_release getcustomerprofilefwf_client_release2 = this;
        setHoldoutKeysfwf_client_release setholdoutkeysfwf_client_release2 = setholdoutkeysfwf_client_release;
        getcustomerprofilefwf_client_release2.serializer = new TreeMap();
        long j4 = 1;
        getcustomerprofilefwf_client_release2.read = (1 << setholdoutkeysfwf_client_release2.read) - 1;
        long j5 = 0;
        while (j5 < j) {
            TreeMap treeMap = getcustomerprofilefwf_client_release2.serializer;
            MemoryCacheclearEvaluations1 memoryCacheclearEvaluations1 = setholdoutkeysfwf_client_release2.IconCompatParcelizer;
            int i3 = memoryCacheclearEvaluations1.RemoteActionCompatParcelizer;
            long j6 = j5 >> i3;
            long j7 = (j4 << i3) - j4;
            int i4 = (int) (j5 & j7);
            setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release = new setCustomerProfilefwf_client_release(1);
            setcustomerprofilefwf_client_release.MediaBrowserCompatMediaItem = j6;
            setcustomerprofilefwf_client_release.RemoteActionCompatParcelizer = i4;
            setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release = new setCustomerProfileUpdateTimefwf_client_release(setcustomerprofilefwf_client_release);
            int i5 = 1 << i3;
            int i6 = i5 - 1;
            if (i4 < i6) {
                if (((getAccountConfigfwf_client_release) treeMap.get(0)) == null || i4 == 0) {
                    treeMap.put(0, new getAccountConfigfwf_client_release(memoryCacheclearEvaluations1, bArr, bArr2, setcustomerprofileupdatetimefwf_client_release));
                }
                TreeMap treeMap2 = getcustomerprofilefwf_client_release2.serializer;
                getAccountConfigfwf_client_release getaccountconfigfwf_client_release = (getAccountConfigfwf_client_release) treeMap2.get(0);
                getaccountconfigfwf_client_release.getClass();
            }
            long j8 = j6;
            int i7 = 1;
            while (i7 < setholdoutkeysfwf_client_release2.RemoteActionCompatParcelizer) {
                int i8 = (int) (j8 & j7);
                long j9 = j8 >> i3;
                setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release2 = new setCustomerProfilefwf_client_release(1);
                setcustomerprofilefwf_client_release2.serializer = i7;
                setcustomerprofilefwf_client_release2.MediaBrowserCompatMediaItem = j9;
                setcustomerprofilefwf_client_release2.RemoteActionCompatParcelizer = i8;
                setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release2 = new setCustomerProfileUpdateTimefwf_client_release(setcustomerprofilefwf_client_release2);
                if (treeMap.get(Integer.valueOf(i7)) != null) {
                    j3 = 0;
                    if (j5 == 0) {
                        i = i5;
                        j2 = j9;
                    } else {
                        j2 = j9;
                        i = i5;
                        if (j5 % ((long) Math.pow(i5, i7 + 1)) == 0) {
                        }
                    }
                    if (i8 < i6 || j5 == j3) {
                        getcustomerprofilefwf_client_release = this;
                        i2 = i;
                    } else {
                        i2 = i;
                        if ((j5 + 1) % ((long) Math.pow(i2, i7)) == j3) {
                            getcustomerprofilefwf_client_release = this;
                            TreeMap treeMap3 = getcustomerprofilefwf_client_release.serializer;
                            getAccountConfigfwf_client_release getaccountconfigfwf_client_release2 = (getAccountConfigfwf_client_release) treeMap3.get(Integer.valueOf(i7));
                            getaccountconfigfwf_client_release2.getClass();
                        } else {
                            getcustomerprofilefwf_client_release = this;
                        }
                    }
                    i7++;
                    i5 = i2;
                    getcustomerprofilefwf_client_release2 = getcustomerprofilefwf_client_release;
                    j8 = j2;
                    setholdoutkeysfwf_client_release2 = setholdoutkeysfwf_client_release;
                } else {
                    i = i5;
                    j2 = j9;
                    j3 = 0;
                }
                treeMap.put(Integer.valueOf(i7), new getAccountConfigfwf_client_release(memoryCacheclearEvaluations1, bArr, bArr2, setcustomerprofileupdatetimefwf_client_release2));
                if (i8 < i6) {
                    getcustomerprofilefwf_client_release = this;
                    i2 = i;
                } else {
                    getcustomerprofilefwf_client_release = this;
                    i2 = i;
                }
                i7++;
                i5 = i2;
                getcustomerprofilefwf_client_release2 = getcustomerprofilefwf_client_release;
                j8 = j2;
                setholdoutkeysfwf_client_release2 = setholdoutkeysfwf_client_release;
            }
            j5++;
            j4 = 1;
            setholdoutkeysfwf_client_release2 = setholdoutkeysfwf_client_release;
        }
    }

    public getCustomerProfilefwf_client_release(getCustomerProfilefwf_client_release getcustomerprofilefwf_client_release, long j) {
        this.serializer = new TreeMap();
        for (Integer num : getcustomerprofilefwf_client_release.serializer.keySet()) {
            this.serializer.put(num, new getAccountConfigfwf_client_release((getAccountConfigfwf_client_release) getcustomerprofilefwf_client_release.serializer.get(num)));
        }
        this.read = j;
    }

    public getCustomerProfilefwf_client_release(long j) {
        this.serializer = new TreeMap();
        this.read = j;
    }
}
