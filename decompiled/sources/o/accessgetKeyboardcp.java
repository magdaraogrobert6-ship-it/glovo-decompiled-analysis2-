package o;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.location.ActivityConversionData;
import com.huawei.hms.location.ActivityConversionInfo;
import com.huawei.hms.location.ActivityConversionRequest;
import com.huawei.hms.location.ActivityConversionResponse;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.ActivityIdentificationResponse;
import com.huawei.hms.location.ActivityIdentificationService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetKeyboardcp extends getToggleOff5zf0vsI {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final ActivityIdentificationService RemoteActionCompatParcelizer;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = (~((~i5) | i)) | (~(i5 | i2));
        int i8 = ~i;
        int i9 = (~(i8 | i2)) | i5;
        int i10 = (~(i2 | i)) | (~(i8 | (~i2))) | i5;
        int i11 = i + i5 + i4 + ((-737137436) * i6) + ((-1840598144) * i3);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i) - 818937856) + (24099949 * i5) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i4) + (1335885824 * i6) + ((-1946157056) * i3) + ((-1593638912) * i12);
        int i14 = (i * 1252406331) + 1981669868 + (i5 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i4 * 1252407325) + (i6 * (-1820396076)) + (i3 * 1320834432) + (i12 * (-447283200));
        return i13 + ((i14 * i14) * 1511325696) != 1 ? RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    @Override // o.getToggleOff5zf0vsI
    public final Object IconCompatParcelizer(Intent intent) {
        int i = 2 % 2;
        int i2 = serializer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ActivityIdentificationResponse.getDataFromIntent(intent);
        }
        ActivityIdentificationResponse.getDataFromIntent(intent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getToggleOff5zf0vsI
    public final Object serializer(Intent intent) {
        int i = 2 % 2;
        int i2 = serializer + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ActivityConversionResponse.getDataFromIntent(intent);
        }
        int i3 = 13 / 0;
        return ActivityConversionResponse.getDataFromIntent(intent);
    }

    public accessgetKeyboardcp(int i, PendingIntent pendingIntent, Application application) {
        super(i, pendingIntent);
        this.RemoteActionCompatParcelizer = new ActivityIdentificationService(application);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        Intent intent = (Intent) objArr[1];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object[] objArr2 = {intent.getAction(), "com.huawei.hms.location.ACTION_PROCESS_LOCATION"};
            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue();
            throw null;
        }
        Object[] objArr3 = {intent.getAction(), "com.huawei.hms.location.ACTION_PROCESS_LOCATION"};
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue();
        int i3 = serializer + 69;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // o.getToggleOff5zf0vsI
    public final boolean RemoteActionCompatParcelizer(Intent intent) {
        int i = 2 % 2;
        int i2 = serializer + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object[] objArr = {intent.getAction(), "com.huawei.hms.location.ACTION_PROCESS_LOCATION"};
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
        int i4 = IconCompatParcelizer + 105;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    @Override // o.getToggleOff5zf0vsI
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        setShouldUseDispatchDrawui setshouldusedispatchdrawuiDeleteActivityIdentificationUpdates = this.RemoteActionCompatParcelizer.deleteActivityIdentificationUpdates(this.write);
        setshouldusedispatchdrawuiDeleteActivityIdentificationUpdates.read(new getKeyboardaOaMEAU(this, 1));
        setshouldusedispatchdrawuiDeleteActivityIdentificationUpdates.write(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(16));
        int i2 = IconCompatParcelizer + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.getToggleOff5zf0vsI
    public final void read() {
        int i = 2 % 2;
        setShouldUseDispatchDrawui setshouldusedispatchdrawuiDeleteActivityConversionUpdates = this.RemoteActionCompatParcelizer.deleteActivityConversionUpdates(this.write);
        setshouldusedispatchdrawuiDeleteActivityConversionUpdates.read(new getKeyboardaOaMEAU(this, 0));
        setshouldusedispatchdrawuiDeleteActivityConversionUpdates.write(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(15));
        int i2 = IconCompatParcelizer + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.getToggleOff5zf0vsI
    public final void write() {
        int i = 2 % 2;
        setShouldUseDispatchDrawui setshouldusedispatchdrawuiCreateActivityIdentificationUpdates = this.RemoteActionCompatParcelizer.createActivityIdentificationUpdates(Long.MAX_VALUE, this.write);
        setshouldusedispatchdrawuiCreateActivityIdentificationUpdates.read(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(13));
        setshouldusedispatchdrawuiCreateActivityIdentificationUpdates.write(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(14));
        int i2 = IconCompatParcelizer + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static String IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        if (i == 100) {
            return "automotive";
        }
        if (i == 101) {
            return "cycling";
        }
        int i3 = serializer + 111;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        if (i3 % 2 == 0) {
            if (i == 101) {
                return "still";
            }
        } else if (i == 103) {
            return "still";
        }
        if (i == 107) {
            return "walking";
        }
        if (i != 108) {
            int i5 = i4 + 61;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return SystemUtils.UNKNOWN;
        }
        return "running";
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        List<ActivityConversionData> activityConversionDatas = ((ActivityConversionResponse) objArr[1]).getActivityConversionDatas();
        activityConversionDatas.getClass();
        List<ActivityConversionData> list = activityConversionDatas;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        int i2 = IconCompatParcelizer + 95;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (ActivityConversionData activityConversionData : list) {
            arrayList.add(new getInputModeaOaMEAU(getToggleOff5zf0vsI.serializer(activityConversionData.getElapsedTimeFromReboot(), TimeUnit.MILLISECONDS), IconCompatParcelizer(activityConversionData.getActivityType()), null));
            int i4 = serializer + 53;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return arrayList;
    }

    @Override // o.getToggleOff5zf0vsI
    public final ArrayList IconCompatParcelizer(Object obj) {
        int i = 2 % 2;
        ActivityIdentificationResponse activityIdentificationResponse = (ActivityIdentificationResponse) obj;
        List<ActivityIdentificationData> activityIdentificationDatas = activityIdentificationResponse.getActivityIdentificationDatas();
        activityIdentificationDatas.getClass();
        List<ActivityIdentificationData> list = activityIdentificationDatas;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (ActivityIdentificationData activityIdentificationData : list) {
            arrayList.add(new getInputModeaOaMEAU(getToggleOff5zf0vsI.serializer(activityIdentificationResponse.getElapsedTimeFromReboot(), TimeUnit.MILLISECONDS), IconCompatParcelizer(activityIdentificationData.getIdentificationActivity()), String.valueOf(activityIdentificationData.getPossibility())));
        }
        int i2 = IconCompatParcelizer + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.getToggleOff5zf0vsI
    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ActivityConversionInfo(103, 0));
        arrayList.add(new ActivityConversionInfo(107, 0));
        arrayList.add(new ActivityConversionInfo(100, 0));
        arrayList.add(new ActivityConversionInfo(101, 0));
        arrayList.add(new ActivityConversionInfo(ActivityIdentificationData.RUNNING, 0));
        setShouldUseDispatchDrawui setshouldusedispatchdrawuiCreateActivityConversionUpdates = this.RemoteActionCompatParcelizer.createActivityConversionUpdates(new ActivityConversionRequest(arrayList), this.write);
        setshouldusedispatchdrawuiCreateActivityConversionUpdates.read(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(11));
        setshouldusedispatchdrawuiCreateActivityConversionUpdates.write(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(12));
        int i2 = serializer + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getToggleOff5zf0vsI
    public final ArrayList read(Object obj) {
        int iPlaybackStateCompat = r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat();
        int iPlaybackStateCompat2 = r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat();
        int iPlaybackStateCompat3 = r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat();
        return (ArrayList) RemoteActionCompatParcelizer(-1921080722, iPlaybackStateCompat, r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat(), new Object[]{this, obj}, iPlaybackStateCompat2, 1921080722, iPlaybackStateCompat3);
    }

    @Override // o.getToggleOff5zf0vsI
    public final boolean write(Intent intent) {
        int iPlaybackStateCompat = r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat();
        int iPlaybackStateCompat2 = r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat();
        int iPlaybackStateCompat3 = r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat();
        return ((Boolean) RemoteActionCompatParcelizer(1608482711, iPlaybackStateCompat, r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo.PlaybackStateCompat(), new Object[]{this, intent}, iPlaybackStateCompat2, -1608482710, iPlaybackStateCompat3)).booleanValue();
    }
}
