package o;

import bo.app.af$$ExternalSyntheticOutline0;
import fwfd.com.fwfsdk.util.FWFHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsInfoKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final setVerticalStyle read;
    public final setTransacterruntime serializer;
    public final setTransactionSuccessful write;

    public SemanticsInfoKt(setTransactionSuccessful settransactionsuccessful, setTransacterruntime settransacterruntime, setVerticalStyle setverticalstyle) {
        settransactionsuccessful.getClass();
        setverticalstyle.getClass();
        this.write = settransactionsuccessful;
        this.serializer = settransacterruntime;
        this.read = setverticalstyle;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.serializer.read();
        setVerticalStyle setverticalstyle = this.read;
        String str2 = "huawei";
        String str3 = FWFHelper.fwfDeviceOS;
        if (str != null) {
            int i4 = IconCompatParcelizer + 37;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                if (SemanticsConfigurationKtgetOrNull1.read[setverticalstyle.write().ordinal()] != 1) {
                    str2 = FWFHelper.fwfDeviceOS;
                }
            } else {
                if (SemanticsConfigurationKtgetOrNull1.read[setverticalstyle.write().ordinal()] != 1) {
                    str2 = FWFHelper.fwfDeviceOS;
                }
            }
            return af$$ExternalSyntheticOutline0.m("https://", str, ".usehurrier.com/app/", str2);
        }
        if (SemanticsConfigurationKtgetOrNull1.read[setverticalstyle.write().ordinal()] == 1) {
            int i5 = RemoteActionCompatParcelizer + 119;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 81;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            str3 = "huawei";
        }
        boolean zEquals = str3.equals("huawei");
        setTransactionSuccessful settransactionsuccessful = this.write;
        return zEquals ? settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.url_download_huawei) : settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.url_download_roadrunner);
    }
}
