package o;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.wisesecurity.ucs.credential.outer.HACapability;
import com.roadrunner.domain.util.IsFixableByRetry;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionItemInfo {
    public final setDropDownVerticalOffset IconCompatParcelizer;
    public final IsFixableByRetry RemoteActionCompatParcelizer;
    public HiAnalyticsInstance read;
    public final String serializer;

    public final void serializer(Context context, String str) {
        HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setCollectURL(str).setEnableUUID(false).build();
        HiAnalyticsInstance hiAnalyticsInstanceRefresh = new HiAnalyticsInstance.Builder(context).setMaintConf(hiAnalyticsConfigBuild).setOperConf(hiAnalyticsConfigBuild).refresh(this.serializer);
        this.read = hiAnalyticsInstanceRefresh;
        if (hiAnalyticsInstanceRefresh == null) {
            this.RemoteActionCompatParcelizer.write("HaReporter", "The analytics instance was not successfully obtained, and the analytics capability cannot be used");
        } else {
            hiAnalyticsInstanceRefresh.setAppid("com.huawei.wisesecurity.common");
        }
    }

    public CollectionItemInfo(Context context, String str, IsFixableByRetry isFixableByRetry) {
        if (TextUtils.isEmpty(str)) {
            String strConcat = TextUtils.isEmpty("HaReporter") ? "Credential" : "Credential-".concat("HaReporter");
            getSteps.write.write(getSteps.IconCompatParcelizer(strConcat), getSteps.RemoteActionCompatParcelizer(strConcat, "hiAnalyticsUrl has not been initialized, and the report data will not be reported.", new Object[0]));
        } else {
            isFixableByRetry.write("HaReporter", "hiAnalyticsUrl is " + str);
        }
        this.serializer = HACapability.UCS_CREDENTIAL_HA_SERVICE_TAG;
        this.RemoteActionCompatParcelizer = isFixableByRetry;
        setDropDownVerticalOffset setdropdownverticaloffset = new setDropDownVerticalOffset();
        setdropdownverticaloffset.serializer = true;
        setdropdownverticaloffset.IconCompatParcelizer = isFixableByRetry;
        this.IconCompatParcelizer = setdropdownverticaloffset;
        serializer(context, str);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (o.setDropDownVerticalOffset.read == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (o.setDropDownVerticalOffset.read != 1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void read(android.content.Context r8, o.CollectionInfo r9, o.getColumnCount r10) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CollectionItemInfo.read(android.content.Context, o.CollectionInfo, o.getColumnCount):void");
    }
}
