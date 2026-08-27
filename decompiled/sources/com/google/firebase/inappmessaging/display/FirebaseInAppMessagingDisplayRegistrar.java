package com.google.firebase.inappmessaging.display;

import android.app.Application;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.annotation.Keep;
import coil3.util.IntPair;
import com.google.android.gms.dynamite.zzj;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader_Factory;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Arrays;
import java.util.List;
import o.AbstractC0178invalidateSemantics;
import o.PlatformHapticFeedbackType;
import o.Snake;
import o.accessgetWcp;
import o.captureRulersIfNeededui;
import o.firstDescendantOrNull;
import o.getAttachHasBeenRun;
import o.getHasMeasureResult;
import o.getMeasureResultui;
import o.notifyChanged;
import o.onUncaughtException;
import o.provideRelativeRulerValue;
import o.setAccessibilityEventBatchIntervalMillis;
import o.setAttachHasBeenRun;
import o.setUncaughtExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FirebaseInAppMessagingDisplayRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiamd";

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<getHasMeasureResult> getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(FirebaseInAppMessagingDisplay.class);
        capturerulersifneededuiWrite.IconCompatParcelizer = LIBRARY_NAME;
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(FirebaseInAppMessaging.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(27, this);
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer(2);
        return Arrays.asList(capturerulersifneededuiWrite.IconCompatParcelizer(), (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{LIBRARY_NAME, "22.0.2"}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseInAppMessagingDisplay buildFirebaseInAppMessagingUI(getMeasureResultui getmeasureresultui) {
        FirebaseApp firebaseApp = (FirebaseApp) getmeasureresultui.read(FirebaseApp.class);
        FirebaseInAppMessaging firebaseInAppMessaging = (FirebaseInAppMessaging) getmeasureresultui.read(FirebaseInAppMessaging.class);
        firebaseApp.IconCompatParcelizer();
        Application application = (Application) firebaseApp.read;
        int i = 1;
        PlatformHapticFeedbackType platformHapticFeedbackType = new PlatformHapticFeedbackType(application, 1);
        int i2 = 28;
        accessgetWcp accessgetwcp = new accessgetWcp(i2);
        int i3 = 0;
        firstDescendantOrNull firstdescendantornull = new firstDescendantOrNull(0);
        firstdescendantornull.serializer = setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new FiamImageLoader_Factory(i, platformHapticFeedbackType));
        firstdescendantornull.MediaSessionCompatToken = setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(Snake.IconCompatParcelizer);
        firstdescendantornull.MediaBrowserCompatMediaItem = setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new notifyChanged((onUncaughtException) firstdescendantornull.serializer));
        notifyChanged notifychanged = new notifyChanged(accessgetwcp, (onUncaughtException) firstdescendantornull.serializer);
        firstdescendantornull.read = new setAttachHasBeenRun(accessgetwcp, notifychanged, 7);
        firstdescendantornull.write = new setAttachHasBeenRun(accessgetwcp, notifychanged, 4);
        firstdescendantornull.MediaDescriptionCompat = new setAttachHasBeenRun(accessgetwcp, notifychanged, 5);
        firstdescendantornull.MediaSessionCompatQueueItem = new setAttachHasBeenRun(accessgetwcp, notifychanged, 6);
        int i4 = 3;
        firstdescendantornull.RatingCompat = new setAttachHasBeenRun(accessgetwcp, notifychanged, i4);
        firstdescendantornull.MediaMetadataCompat = new setAttachHasBeenRun(accessgetwcp, notifychanged, i3);
        int i5 = 2;
        firstdescendantornull.IconCompatParcelizer = new setAttachHasBeenRun(accessgetwcp, notifychanged, i5);
        firstdescendantornull.RemoteActionCompatParcelizer = new setAttachHasBeenRun(accessgetwcp, notifychanged, i);
        zzz zzzVar = new zzz(firebaseInAppMessaging);
        zzj zzjVar = new zzj(i2);
        onUncaughtException onuncaughtexceptionIconCompatParcelizer = setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new FiamImageLoader_Factory(i4, zzzVar));
        getAttachHasBeenRun getattachhasbeenrun = new getAttachHasBeenRun(firstdescendantornull, i5);
        getAttachHasBeenRun getattachhasbeenrun2 = new getAttachHasBeenRun(firstdescendantornull, i4);
        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = (FirebaseInAppMessagingDisplay) ((setAccessibilityEventBatchIntervalMillis) setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new setUncaughtExceptionHandler(onuncaughtexceptionIconCompatParcelizer, getattachhasbeenrun, setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new FiamImageLoader_Factory(i3, setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new FiamImageLoader_Factory(zzjVar, getattachhasbeenrun2)))), new getAttachHasBeenRun(firstdescendantornull, i), getattachhasbeenrun2, new getAttachHasBeenRun(firstdescendantornull, i3), setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(AbstractC0178invalidateSemantics.read)))).write();
        application.registerActivityLifecycleCallbacks(firebaseInAppMessagingDisplay);
        return firebaseInAppMessagingDisplay;
    }
}
