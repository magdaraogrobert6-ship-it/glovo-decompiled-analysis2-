package o;

import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda4s7OvXv48SHY8g9QXR7tgugpjF8 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final decode IconCompatParcelizer;
    public final getContentViewGroupParentLayout write;

    public r8lambda4s7OvXv48SHY8g9QXR7tgugpjF8(decode decodeVar, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        decodeVar.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.IconCompatParcelizer = decodeVar;
        this.write = getcontentviewgroupparentlayout;
    }

    public final void RemoteActionCompatParcelizer(PushAnalyticsData pushAnalyticsData, boolean z) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(this.write, null, null, new GoAndStartDataStoreImpl$set$2(this, pushAnalyticsData, z, null), 3);
        int i2 = read + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
