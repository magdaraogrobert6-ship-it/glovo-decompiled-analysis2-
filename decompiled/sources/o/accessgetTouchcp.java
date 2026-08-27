package o;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import bo.app.hg$$ExternalSyntheticLambda5;
import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.huawei.hms.android.SystemUtils;
import com.incognia.internal.pcn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTouchcp extends getToggleOff5zf0vsI {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final isAdapterPositionOnScreen serializer;

    public static /* synthetic */ Object read(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i4);
        int i11 = (~i4) | i7;
        int i12 = i10 | (~(i11 | i));
        int i13 = (~(i4 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i3));
        int i15 = i3 + i + i2 + (783392123 * i6) + ((-786872706) * i5);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i3) + 1729888256 + (218870266 * i) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i2) + ((-1731985408) * i6) + ((-471334912) * i5) + ((-600899584) * i16);
        int i18 = (i3 * 375823119) + 1642083618 + (i * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i2 * 375824245) + (i6 * (-117547465)) + (i5 * 763984278) + (i16 * (-763691008));
        return i17 + ((i18 * i18) * 1830354944) != 1 ? IconCompatParcelizer(objArr) : read(objArr);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        Intent intent = (Intent) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zHasResult = ActivityRecognitionResult.hasResult(intent);
        int i4 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zHasResult);
        }
        int i5 = 40 / 0;
        return Boolean.valueOf(zHasResult);
    }

    @Override // o.getToggleOff5zf0vsI
    public final Object IconCompatParcelizer(Intent intent) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ActivityRecognitionResult.extractResult(intent);
            throw null;
        }
        ActivityRecognitionResult activityRecognitionResultExtractResult = ActivityRecognitionResult.extractResult(intent);
        int i3 = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
        return activityRecognitionResultExtractResult;
    }

    @Override // o.getToggleOff5zf0vsI
    public final Object serializer(Intent intent) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ActivityTransitionResult activityTransitionResultExtractResult = ActivityTransitionResult.extractResult(intent);
        int i4 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return activityTransitionResultExtractResult;
        }
        throw null;
    }

    @Override // o.getToggleOff5zf0vsI
    public final boolean write(Intent intent) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zHasResult = ActivityTransitionResult.hasResult(intent);
        int i4 = RemoteActionCompatParcelizer + 51;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zHasResult;
    }

    public accessgetTouchcp(int i, PendingIntent pendingIntent, Application application) {
        super(i, pendingIntent);
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE(application, 1));
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        accessgetTouchcp accessgettouchcp = (accessgetTouchcp) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object objMediaSessionCompatResultReceiverWrapper = accessgettouchcp.serializer.MediaSessionCompatResultReceiverWrapper();
            objMediaSessionCompatResultReceiverWrapper.getClass();
            throw null;
        }
        Object objMediaSessionCompatResultReceiverWrapper2 = accessgettouchcp.serializer.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper2.getClass();
        ActivityRecognitionClient activityRecognitionClient = (ActivityRecognitionClient) objMediaSessionCompatResultReceiverWrapper2;
        int i3 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 13 / 0;
        }
        return activityRecognitionClient;
    }

    public static String write(int i) {
        int i2 = 2 % 2;
        if (i == 0) {
            return "automotive";
        }
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 115;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (i == 1) {
            return "cycling";
        }
        int i6 = i3 + 9;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            if (i == 5) {
                return "still";
            }
        } else if (i == 3) {
            return "still";
        }
        if (i != 7) {
            if (i != 8) {
                return SystemUtils.UNKNOWN;
            }
            return "running";
        }
        int i7 = i3 + 123;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return "walking";
        }
        throw null;
    }

    @Override // o.getToggleOff5zf0vsI
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int iSerializer = pcn.serializer();
        ((ActivityRecognitionClient) read(769732103, new Object[]{this}, pcn.serializer(), -769732103, iSerializer, pcn.serializer(), pcn.serializer())).removeActivityUpdates(this.write).addOnSuccessListener(new StreamSharing$$ExternalSyntheticLambda0(29, new InputModeCompanion(this, 1))).addOnFailureListener(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(7));
        int i2 = IconCompatParcelizer + 89;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
    }

    @Override // o.getToggleOff5zf0vsI
    public final void read() {
        int i = 2 % 2;
        int iSerializer = pcn.serializer();
        ((ActivityRecognitionClient) read(769732103, new Object[]{this}, pcn.serializer(), -769732103, iSerializer, pcn.serializer(), pcn.serializer())).removeActivityTransitionUpdates(this.write).addOnSuccessListener(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(2, new InputModeCompanion(this, 0))).addOnFailureListener(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(9));
        int i2 = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
    }

    @Override // o.getToggleOff5zf0vsI
    public final void write() {
        int i = 2 % 2;
        int iSerializer = pcn.serializer();
        ((ActivityRecognitionClient) read(769732103, new Object[]{this}, pcn.serializer(), -769732103, iSerializer, pcn.serializer(), pcn.serializer())).requestActivityUpdates(Long.MAX_VALUE, this.write).addOnSuccessListener(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(1, new hg$$ExternalSyntheticLambda5(5))).addOnFailureListener(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(8));
        int i2 = RemoteActionCompatParcelizer + 31;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.getToggleOff5zf0vsI
    public final ArrayList read(Object obj) {
        int i = 2 % 2;
        List<ActivityTransitionEvent> transitionEvents = ((ActivityTransitionResult) obj).getTransitionEvents();
        transitionEvents.getClass();
        List<ActivityTransitionEvent> list = transitionEvents;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (ActivityTransitionEvent activityTransitionEvent : list) {
            arrayList.add(new getInputModeaOaMEAU(getToggleOff5zf0vsI.serializer(activityTransitionEvent.getElapsedRealTimeNanos(), TimeUnit.NANOSECONDS), write(activityTransitionEvent.getActivityType()), null));
        }
        int i2 = IconCompatParcelizer + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return arrayList;
    }

    @Override // o.getToggleOff5zf0vsI
    public final ArrayList IconCompatParcelizer(Object obj) {
        int i = 2 % 2;
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        List<DetectedActivity> probableActivities = activityRecognitionResult.getProbableActivities();
        probableActivities.getClass();
        List<DetectedActivity> list = probableActivities;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        int i2 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (DetectedActivity detectedActivity : list) {
            arrayList.add(new getInputModeaOaMEAU(getToggleOff5zf0vsI.serializer(activityRecognitionResult.getElapsedRealtimeMillis(), TimeUnit.MILLISECONDS), write(detectedActivity.getType()), String.valueOf(detectedActivity.getConfidence())));
        }
        int i4 = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return arrayList;
    }

    @Override // o.getToggleOff5zf0vsI
    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int iSerializer = pcn.serializer();
        ActivityRecognitionClient activityRecognitionClient = (ActivityRecognitionClient) read(769732103, new Object[]{this}, pcn.serializer(), -769732103, iSerializer, pcn.serializer(), pcn.serializer());
        ArrayList arrayList = new ArrayList();
        ActivityTransition activityTransitionBuild = new ActivityTransition.Builder().setActivityType(3).setActivityTransition(0).build();
        activityTransitionBuild.getClass();
        arrayList.add(activityTransitionBuild);
        ActivityTransition activityTransitionBuild2 = new ActivityTransition.Builder().setActivityType(7).setActivityTransition(0).build();
        activityTransitionBuild2.getClass();
        arrayList.add(activityTransitionBuild2);
        ActivityTransition activityTransitionBuild3 = new ActivityTransition.Builder().setActivityType(0).setActivityTransition(0).build();
        activityTransitionBuild3.getClass();
        arrayList.add(activityTransitionBuild3);
        ActivityTransition activityTransitionBuild4 = new ActivityTransition.Builder().setActivityType(1).setActivityTransition(0).build();
        activityTransitionBuild4.getClass();
        arrayList.add(activityTransitionBuild4);
        ActivityTransition activityTransitionBuild5 = new ActivityTransition.Builder().setActivityType(8).setActivityTransition(0).build();
        activityTransitionBuild5.getClass();
        arrayList.add(activityTransitionBuild5);
        activityRecognitionClient.requestActivityTransitionUpdates(new ActivityTransitionRequest(arrayList), this.write).addOnSuccessListener(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(3, new hg$$ExternalSyntheticLambda5(6))).addOnFailureListener(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(10));
        int i2 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getToggleOff5zf0vsI
    public final boolean RemoteActionCompatParcelizer(Intent intent) {
        int iSerializer = pcn.serializer();
        return ((Boolean) read(-947923168, new Object[]{this, intent}, pcn.serializer(), 947923169, iSerializer, pcn.serializer(), pcn.serializer())).booleanValue();
    }

    public final ActivityRecognitionClient serializer() {
        int iSerializer = pcn.serializer();
        return (ActivityRecognitionClient) read(769732103, new Object[]{this}, pcn.serializer(), -769732103, iSerializer, pcn.serializer(), pcn.serializer());
    }
}
