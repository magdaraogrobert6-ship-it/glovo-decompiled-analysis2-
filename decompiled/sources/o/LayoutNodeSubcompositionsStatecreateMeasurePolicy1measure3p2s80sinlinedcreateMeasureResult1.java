package o;

import android.os.Bundle;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 {
    public static final LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 IconCompatParcelizer = new LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1((Boolean) null, 100, (Boolean) null, (String) null);
    public final EnumMap MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final Boolean serializer;
    public final String write;

    public static LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 IconCompatParcelizer(String str) {
        if (str == null || str.length() <= 0) {
            return IconCompatParcelizer;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(MeasureScope.class);
        MeasureScope[] measureScopeArrZza = accessisLookingAheadjd.DMA.zza();
        int length = measureScopeArrZza.length;
        int i2 = 0;
        int i3 = 1;
        while (i2 < length) {
            enumMap.put(measureScopeArrZza[i2], getMeasuredWidth.read(strArrSplit[i3].charAt(0)));
            i2++;
            i3++;
        }
        return new LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1(enumMap, i, (Boolean) null, (String) null);
    }

    public final String read() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        for (MeasureScope measureScope : accessisLookingAheadjd.DMA.zza()) {
            sb.append(":");
            sb.append(getMeasuredWidth.read((MeasureScopeDefaultImpls) this.MediaSessionCompatQueueItem.get(measureScope)));
        }
        return sb.toString();
    }

    public final MeasureScopeDefaultImpls serializer() {
        MeasureScopeDefaultImpls measureScopeDefaultImpls = (MeasureScopeDefaultImpls) this.MediaSessionCompatQueueItem.get(MeasureScope.AD_USER_DATA);
        return measureScopeDefaultImpls == null ? MeasureScopeDefaultImpls.UNINITIALIZED : measureScopeDefaultImpls;
    }

    public static Boolean RemoteActionCompatParcelizer(Bundle bundle) {
        MeasureScopeDefaultImpls measureScopeDefaultImplsSerializer;
        if (bundle == null || (measureScopeDefaultImplsSerializer = getMeasuredWidth.serializer(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = measureScopeDefaultImplsSerializer.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 write(int i, Bundle bundle) {
        if (bundle == null) {
            return new LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(MeasureScope.class);
        for (MeasureScope measureScope : accessisLookingAheadjd.DMA.zza()) {
            enumMap.put(measureScope, getMeasuredWidth.serializer(bundle.getString(measureScope.zze)));
        }
        return new LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1)) {
            return false;
        }
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 = (LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1) obj;
        if (this.write.equalsIgnoreCase(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write) && Objects.equals(this.serializer, layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.serializer)) {
            return Objects.equals(this.RemoteActionCompatParcelizer, layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(getMeasuredWidth.RemoteActionCompatParcelizer(this.read));
        for (MeasureScope measureScope : accessisLookingAheadjd.DMA.zza()) {
            sb.append(",");
            sb.append(measureScope.zze);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            MeasureScopeDefaultImpls measureScopeDefaultImpls = (MeasureScopeDefaultImpls) this.MediaSessionCompatQueueItem.get(measureScope);
            if (measureScopeDefaultImpls == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = measureScopeDefaultImpls.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.serializer;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.RemoteActionCompatParcelizer;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(MeasureScope.class);
        this.MediaSessionCompatQueueItem = enumMap;
        enumMap.put(MeasureScope.AD_USER_DATA, bool == null ? MeasureScopeDefaultImpls.UNINITIALIZED : bool.booleanValue() ? MeasureScopeDefaultImpls.GRANTED : MeasureScopeDefaultImpls.DENIED);
        this.read = i;
        this.write = read();
        this.serializer = bool2;
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.serializer;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.RemoteActionCompatParcelizer;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.write.hashCode() + (i * 29);
    }

    public LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(MeasureScope.class);
        this.MediaSessionCompatQueueItem = enumMap2;
        enumMap2.putAll(enumMap);
        this.read = i;
        this.write = read();
        this.serializer = bool;
        this.RemoteActionCompatParcelizer = str;
    }
}
