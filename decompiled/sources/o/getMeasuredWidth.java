package o;

import android.os.Bundle;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getMeasuredWidth {
    public static final getMeasuredWidth RemoteActionCompatParcelizer = new getMeasuredWidth(100);
    public final int read;
    public final EnumMap serializer;

    public static boolean serializer(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public static char read(MeasureScopeDefaultImpls measureScopeDefaultImpls) {
        if (measureScopeDefaultImpls == null) {
            return '-';
        }
        int iOrdinal = measureScopeDefaultImpls.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static MeasureScopeDefaultImpls serializer(String str) {
        if (str == null) {
            return MeasureScopeDefaultImpls.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return MeasureScopeDefaultImpls.GRANTED;
        }
        return str.equals("denied") ? MeasureScopeDefaultImpls.DENIED : MeasureScopeDefaultImpls.UNINITIALIZED;
    }

    public final boolean IconCompatParcelizer(MeasureScope measureScope) {
        return ((MeasureScopeDefaultImpls) this.serializer.get(measureScope)) != MeasureScopeDefaultImpls.DENIED;
    }

    public final int hashCode() {
        Iterator it = this.serializer.values().iterator();
        int iHashCode = this.read * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((MeasureScopeDefaultImpls) it.next()).hashCode();
        }
        return iHashCode;
    }

    public static getMeasuredWidth IconCompatParcelizer(int i, String str) {
        EnumMap enumMap = new EnumMap(MeasureScope.class);
        MeasureScope[] measureScopeArrZza = accessisLookingAheadjd.STORAGE.zza();
        for (int i2 = 0; i2 < measureScopeArrZza.length; i2++) {
            String str2 = str == null ? "" : str;
            MeasureScope measureScope = measureScopeArrZza[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(measureScope, read(str2.charAt(i3)));
            } else {
                enumMap.put(measureScope, MeasureScopeDefaultImpls.UNINITIALIZED);
            }
        }
        return new getMeasuredWidth(enumMap, i);
    }

    public static getMeasuredWidth write(int i, Bundle bundle) {
        if (bundle == null) {
            return new getMeasuredWidth(i);
        }
        EnumMap enumMap = new EnumMap(MeasureScope.class);
        for (MeasureScope measureScope : accessisLookingAheadjd.STORAGE.zzb()) {
            enumMap.put(measureScope, serializer(bundle.getString(measureScope.zze)));
        }
        return new getMeasuredWidth(enumMap, i);
    }

    public final String RemoteActionCompatParcelizer() {
        StringBuilder sb = new StringBuilder("G1");
        for (MeasureScope measureScope : accessisLookingAheadjd.STORAGE.zza()) {
            sb.append(read((MeasureScopeDefaultImpls) this.serializer.get(measureScope)));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public final getMeasuredWidth RemoteActionCompatParcelizer(getMeasuredWidth getmeasuredwidth) {
        EnumMap enumMap = new EnumMap(MeasureScope.class);
        for (MeasureScope measureScope : accessisLookingAheadjd.STORAGE.zzb()) {
            MeasureScopeDefaultImpls measureScopeDefaultImpls = (MeasureScopeDefaultImpls) this.serializer.get(measureScope);
            MeasureScopeDefaultImpls measureScopeDefaultImpls2 = (MeasureScopeDefaultImpls) getmeasuredwidth.serializer.get(measureScope);
            if (measureScopeDefaultImpls == null) {
                measureScopeDefaultImpls = measureScopeDefaultImpls2;
            } else if (measureScopeDefaultImpls2 != null) {
                MeasureScopeDefaultImpls measureScopeDefaultImpls3 = MeasureScopeDefaultImpls.UNINITIALIZED;
                if (measureScopeDefaultImpls == measureScopeDefaultImpls3) {
                    measureScopeDefaultImpls = measureScopeDefaultImpls2;
                } else if (measureScopeDefaultImpls2 != measureScopeDefaultImpls3) {
                    MeasureScopeDefaultImpls measureScopeDefaultImpls4 = MeasureScopeDefaultImpls.POLICY;
                    if (measureScopeDefaultImpls == measureScopeDefaultImpls4) {
                        measureScopeDefaultImpls = measureScopeDefaultImpls2;
                    } else if (measureScopeDefaultImpls2 != measureScopeDefaultImpls4) {
                        MeasureScopeDefaultImpls measureScopeDefaultImpls5 = MeasureScopeDefaultImpls.DENIED;
                        measureScopeDefaultImpls = (measureScopeDefaultImpls == measureScopeDefaultImpls5 || measureScopeDefaultImpls2 == measureScopeDefaultImpls5) ? measureScopeDefaultImpls5 : MeasureScopeDefaultImpls.GRANTED;
                    }
                }
            }
            if (measureScopeDefaultImpls != null) {
                enumMap.put(measureScope, measureScopeDefaultImpls);
            }
        }
        return new getMeasuredWidth(enumMap, 100);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    public final String serializer() {
        char c;
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (MeasureScope measureScope : accessisLookingAheadjd.STORAGE.zza()) {
            MeasureScopeDefaultImpls measureScopeDefaultImpls = (MeasureScopeDefaultImpls) this.serializer.get(measureScope);
            if (measureScopeDefaultImpls == null || (iOrdinal = measureScopeDefaultImpls.ordinal()) == 0) {
                c = '-';
            } else if (iOrdinal == 1) {
                c = '1';
            } else if (iOrdinal == 2) {
                c = '0';
            } else if (iOrdinal != 3) {
                c = '-';
            } else {
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final getMeasuredWidth serializer(getMeasuredWidth getmeasuredwidth) {
        EnumMap enumMap = new EnumMap(MeasureScope.class);
        for (MeasureScope measureScope : accessisLookingAheadjd.STORAGE.zzb()) {
            MeasureScopeDefaultImpls measureScopeDefaultImpls = (MeasureScopeDefaultImpls) this.serializer.get(measureScope);
            if (measureScopeDefaultImpls == MeasureScopeDefaultImpls.UNINITIALIZED) {
                measureScopeDefaultImpls = (MeasureScopeDefaultImpls) getmeasuredwidth.serializer.get(measureScope);
            }
            if (measureScopeDefaultImpls != null) {
                enumMap.put(measureScope, measureScopeDefaultImpls);
            }
        }
        return new getMeasuredWidth(enumMap, this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(RemoteActionCompatParcelizer(this.read));
        for (MeasureScope measureScope : accessisLookingAheadjd.STORAGE.zzb()) {
            sb.append(",");
            sb.append(measureScope.zze);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            MeasureScopeDefaultImpls measureScopeDefaultImpls = (MeasureScopeDefaultImpls) this.serializer.get(measureScope);
            if (measureScopeDefaultImpls == null) {
                measureScopeDefaultImpls = MeasureScopeDefaultImpls.UNINITIALIZED;
            }
            sb.append(measureScopeDefaultImpls);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getMeasuredWidth)) {
            return false;
        }
        getMeasuredWidth getmeasuredwidth = (getMeasuredWidth) obj;
        for (MeasureScope measureScope : accessisLookingAheadjd.STORAGE.zzb()) {
            if (this.serializer.get(measureScope) != getmeasuredwidth.serializer.get(measureScope)) {
                return false;
            }
        }
        return this.read == getmeasuredwidth.read;
    }

    public getMeasuredWidth(int i) {
        EnumMap enumMap = new EnumMap(MeasureScope.class);
        this.serializer = enumMap;
        MeasureScope measureScope = MeasureScope.AD_STORAGE;
        MeasureScopeDefaultImpls measureScopeDefaultImpls = MeasureScopeDefaultImpls.UNINITIALIZED;
        enumMap.put(measureScope, measureScopeDefaultImpls);
        enumMap.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls);
        this.read = i;
    }

    public static MeasureScopeDefaultImpls read(char c) {
        if (c == '+') {
            return MeasureScopeDefaultImpls.POLICY;
        }
        if (c == '0') {
            return MeasureScopeDefaultImpls.DENIED;
        }
        if (c != '1') {
            return MeasureScopeDefaultImpls.UNINITIALIZED;
        }
        return MeasureScopeDefaultImpls.GRANTED;
    }

    public getMeasuredWidth(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(MeasureScope.class);
        this.serializer = enumMap2;
        enumMap2.putAll(enumMap);
        this.read = i;
    }

    public static String RemoteActionCompatParcelizer(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i == 90) {
            return "REMOTE_CONFIG";
        }
        if (i != 100) {
            return "OTHER";
        }
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }
}
