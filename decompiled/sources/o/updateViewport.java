package o;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class updateViewport {
    public final HashMap read;

    public final String toString() {
        return write();
    }

    public final Bundle read() {
        int iRemoteActionCompatParcelizer;
        HashMap map = this.read;
        if ("1".equals(map.get("GoogleConsent")) && (iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                if (str.length() > 0) {
                    bundle.putString(MeasureScope.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(MeasureScope.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iRemoteActionCompatParcelizer >= 4) {
                    bundle.putString(MeasureScope.AD_USER_DATA.zze, (str.charAt(0) == '1' && str.charAt(6) == '1') ? "granted" : "denied");
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final String write() {
        StringBuilder sb = new StringBuilder();
        accessgetApproachSetp accessgetapproachsetp = OnGloballyPositionedElement.RemoteActionCompatParcelizer;
        int i = accessgetapproachsetp.serializer;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) accessgetapproachsetp.get(i2);
            HashMap map = this.read;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    public final Bundle IconCompatParcelizer() {
        LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.addOnMultiWindowModeChangedListener;
        boolean zBooleanValue = ((Boolean) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).booleanValue();
        HashMap map = this.read;
        if (!zBooleanValue ? !(!"1".equals(map.get("GoogleConsent")) || !"1".equals(map.get("gdprApplies")) || !"1".equals(map.get("EnableAdvertiserConsentMode"))) : !(!"1".equals(map.get("gdprApplies")) || !"1".equals(map.get("EnableAdvertiserConsentMode")))) {
            if (!((Boolean) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).booleanValue()) {
                return read();
            }
            if (map.get("Version") == null) {
                return read();
            }
            if (RemoteActionCompatParcelizer() >= 0) {
                Bundle bundle = new Bundle();
                String str = "denied";
                bundle.putString(MeasureScope.AD_STORAGE.zze, true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle.putString(MeasureScope.AD_PERSONALIZATION.zze, (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (RemoteActionCompatParcelizer() >= 4) {
                    String str2 = MeasureScope.AD_USER_DATA.zze;
                    if (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) {
                        str = "granted";
                    }
                    bundle.putString(str2, str);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final int RemoteActionCompatParcelizer() {
        try {
            String str = (String) this.read.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final int hashCode() {
        return write().hashCode();
    }

    public updateViewport(Map map) {
        HashMap map2 = new HashMap();
        this.read = map2;
        map2.putAll(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof updateViewport) {
            return write().equalsIgnoreCase(((updateViewport) obj).write());
        }
        return false;
    }

    public final String serializer() {
        int i;
        HashMap map = this.read;
        StringBuilder sb = new StringBuilder("1");
        try {
            String str = (String) map.get("CmpSdkID");
            i = !TextUtils.isEmpty(str) ? Integer.parseInt(str) : -1;
        } catch (NumberFormatException unused) {
        }
        if (i < 0 || i > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (iRemoteActionCompatParcelizer < 0 || iRemoteActionCompatParcelizer > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iRemoteActionCompatParcelizer));
        }
        int i2 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        int i3 = i2 | 4;
        if ("1".equals(map.get("EnableAdvertiserConsentMode"))) {
            i3 = i2 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i3));
        return sb.toString();
    }
}
