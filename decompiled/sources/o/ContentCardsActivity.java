package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.android.SystemUtils;
import fwfd.com.fwfsdk.util.FWFHelper;
import io.sentry.SentryUUID;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentCardsActivity implements RequestPushPermissionStep {
    public int IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public String MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public String MediaSessionCompatResultReceiverWrapper;
    public String MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String ResultReceiver;
    public final Map r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public String r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public Date r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public String r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final File r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public String r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public String r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final ArrayList r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public String r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public ConcurrentHashMap r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final Callable read;
    public String serializer;
    public List write = new ArrayList();
    public String ComponentActivity = null;
    public String MediaDescriptionCompat = java.util.Locale.getDefault().toString();

    public ContentCardsActivity(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = file;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = date;
        this.RemoteActionCompatParcelizer = str5;
        this.read = callable;
        this.IconCompatParcelizer = i;
        this.MediaMetadataCompat = str6 != null ? str6 : "";
        this.RatingCompat = str7 != null ? str7 : "";
        this.PlaybackStateCompatCustomAction = str8 != null ? str8 : "";
        this.MediaBrowserCompatMediaItem = bool != null ? bool.booleanValue() : false;
        this.MediaSessionCompatToken = str9 != null ? str9 : "0";
        this.MediaSessionCompatQueueItem = "";
        this.PlaybackStateCompat = FWFHelper.fwfDeviceOS;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = FWFHelper.fwfDeviceOS;
        this.serializer = str10 != null ? str10 : "";
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = arrayList;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = str.isEmpty() ? SystemUtils.UNKNOWN : str;
        this.ParcelableVolumeInfo = str4;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = "";
        this.ResultReceiver = str11 != null ? str11 : "";
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = str2;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = str3;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = SentryUUID.IconCompatParcelizer();
        this.MediaSessionCompatResultReceiverWrapper = str12 != null ? str12 : "production";
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = str13;
        if (!str13.equals(com.adjust.sdk.Constants.NORMAL) && !this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.equals("timeout") && !this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.equals("backgrounded")) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = com.adjust.sdk.Constants.NORMAL;
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = map;
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("android_api_level");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Integer.valueOf(this.IconCompatParcelizer));
        okHttpCall$1.write("device_locale");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaDescriptionCompat);
        okHttpCall$1.write("device_manufacturer");
        okHttpCall$1.IconCompatParcelizer(this.MediaMetadataCompat);
        okHttpCall$1.write("device_model");
        okHttpCall$1.IconCompatParcelizer(this.RatingCompat);
        okHttpCall$1.write("device_os_build_number");
        okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
        okHttpCall$1.write("device_os_name");
        okHttpCall$1.IconCompatParcelizer(this.PlaybackStateCompat);
        okHttpCall$1.write("device_os_version");
        okHttpCall$1.IconCompatParcelizer(this.PlaybackStateCompatCustomAction);
        okHttpCall$1.write("device_is_emulator");
        okHttpCall$1.write(this.MediaBrowserCompatMediaItem);
        okHttpCall$1.write("architecture");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        okHttpCall$1.write("device_cpu_frequencies");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        okHttpCall$1.write("device_physical_memory_bytes");
        okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatToken);
        okHttpCall$1.write("platform");
        okHttpCall$1.IconCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        okHttpCall$1.write("build_id");
        okHttpCall$1.IconCompatParcelizer(this.serializer);
        okHttpCall$1.write("transaction_name");
        okHttpCall$1.IconCompatParcelizer(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        okHttpCall$1.write("duration_ns");
        okHttpCall$1.IconCompatParcelizer(this.ParcelableVolumeInfo);
        okHttpCall$1.write("version_name");
        okHttpCall$1.IconCompatParcelizer(this.ResultReceiver);
        okHttpCall$1.write("version_code");
        okHttpCall$1.IconCompatParcelizer(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        ArrayList arrayList = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (!arrayList.isEmpty()) {
            okHttpCall$1.write("transactions");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, arrayList);
        }
        okHttpCall$1.write(CommonCode.MapKey.TRANSACTION_ID);
        okHttpCall$1.IconCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        okHttpCall$1.write("trace_id");
        okHttpCall$1.IconCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        okHttpCall$1.write("profile_id");
        okHttpCall$1.IconCompatParcelizer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        okHttpCall$1.write(com.deliveryhero.fwf_cache.UtilKt.ENVIRONMENT_KEY);
        okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper);
        okHttpCall$1.write("truncation_reason");
        okHttpCall$1.IconCompatParcelizer(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        if (this.ComponentActivity != null) {
            okHttpCall$1.write("sampled_profile");
            okHttpCall$1.IconCompatParcelizer(this.ComponentActivity);
        }
        String str = ((io.sentry.vendor.gson.stream.write) okHttpCall$1.write).read;
        okHttpCall$1.read("");
        okHttpCall$1.write("measurements");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        okHttpCall$1.read(str);
        okHttpCall$1.write("timestamp");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        ConcurrentHashMap concurrentHashMap = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, str2, okHttpCall$1, str2, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
