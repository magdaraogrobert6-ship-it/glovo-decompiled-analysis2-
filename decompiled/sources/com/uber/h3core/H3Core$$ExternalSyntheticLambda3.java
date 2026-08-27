package com.uber.h3core;

import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.TimeSeriesType;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.util.Map;
import java.util.function.Function;
import o.getDefaultNotificationChannelNameandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H3Core$$ExternalSyntheticLambda3 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ H3Core$$ExternalSyntheticLambda3(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Short sh;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        if (i == 0) {
            long jLongValue = ((Long) obj).longValue();
            ((H3Core) obj2).getClass();
            return Long.toHexString(jLongValue);
        }
        if (i != 1) {
            int i2 = ConfigurationManager.RemoteActionCompatParcelizer;
            return ((ConfigurationManager) obj2).serializer((DetectionTrigger) obj).values();
        }
        TimeSeriesType timeSeriesType = (TimeSeriesType) obj;
        int i3 = ConfigurationManager.RemoteActionCompatParcelizer;
        Map map = ((getDefaultNotificationChannelNameandroid_sdk_base_release) obj2).RatingCompat;
        if (map == null || (sh = (Short) map.get(timeSeriesType)) == null) {
            return (short) 25;
        }
        return sh;
    }
}
