package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.sqlite.SQLite;
import coil3.util.IntPair;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.List;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AndroidComposeViewRootModifierNodemeasure1;
import o.AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled2;
import o.AndroidComposeView_inputModeManager1;
import o.AndroidComposeViewaddAndroidView1;
import o.AndroidComposeViewcontentCaptureManager1;
import o.AndroidComposeViewhandleRotaryEvent1;
import o.AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1;
import o.AndroidComposeViewsnapshotObserver1;
import o.AndroidComposeViewtextInputSession1;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.TextAnnouncementContentCardView;
import o.accessgetButton15cp;
import o.accessgetCurrentlyFocusedANIp;
import o.accessgetPendingHorizontalScrollEventsp;
import o.accessgetRulerScope;
import o.accessperformActionHelper;
import o.accesssetCurrentlyAccessibilityFocusedANIp;
import o.accesssetInstancecp;
import o.captureRulersIfNeededui;
import o.findAncestorRulerDefiner;
import o.getHasMeasureResult;
import o.getMeasureResultui;
import o.getViewModelStoreOwner;
import o.provideRelativeRulerValue;
import o.setPreviousGeneration;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final getViewModelStoreOwner Companion = new getViewModelStoreOwner();
    private static final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 appContext = LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(Context.class);
    private static final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 firebaseApp = LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(FirebaseApp.class);
    private static final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 firebaseInstallationsApi = LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(accesssetInstancecp.class);
    private static final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 backgroundDispatcher = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, CoroutineDispatcher.class);
    private static final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 blockingDispatcher = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, CoroutineDispatcher.class);
    private static final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 transportFactory = LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(accessgetButton15cp.class);
    private static final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 firebaseSessionsComponent = LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled2.class);

    static {
        try {
            MultiProcessDataStoreFactory.INSTANCE.getClass();
        } catch (NoClassDefFoundError unused) {
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda$0(getMeasureResultui getmeasureresultui) {
        return (FirebaseSessions) ((setPreviousGeneration) ((AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled2) getmeasureresultui.write(firebaseSessionsComponent))).MediaSessionCompatQueueItem.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled2 getComponents$lambda$1(getMeasureResultui getmeasureresultui) {
        Object objWrite = getmeasureresultui.write(appContext);
        objWrite.getClass();
        Object objWrite2 = getmeasureresultui.write(backgroundDispatcher);
        objWrite2.getClass();
        Object objWrite3 = getmeasureresultui.write(blockingDispatcher);
        objWrite3.getClass();
        Object objWrite4 = getmeasureresultui.write(firebaseApp);
        objWrite4.getClass();
        Object objWrite5 = getmeasureresultui.write(firebaseInstallationsApi);
        objWrite5.getClass();
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer = getmeasureresultui.IconCompatParcelizer(transportFactory);
        abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer.getClass();
        setPreviousGeneration setpreviousgeneration = new setPreviousGeneration();
        setpreviousgeneration.RemoteActionCompatParcelizer = AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.IconCompatParcelizer((FirebaseApp) objWrite4);
        AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1IconCompatParcelizer = AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.IconCompatParcelizer((Context) objWrite);
        setpreviousgeneration.IconCompatParcelizer = androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1IconCompatParcelizer;
        setpreviousgeneration.MediaBrowserCompatMediaItem = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewRootModifierNodemeasure1(androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1IconCompatParcelizer, 2));
        setpreviousgeneration.ParcelableVolumeInfo = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(AndroidComposeViewaddAndroidView1.RemoteActionCompatParcelizer);
        setpreviousgeneration.MediaMetadataCompat = AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.IconCompatParcelizer((accesssetInstancecp) objWrite5);
        int i = 1;
        setpreviousgeneration.write = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewRootModifierNodemeasure1(setpreviousgeneration.RemoteActionCompatParcelizer, i));
        AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1IconCompatParcelizer2 = AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.IconCompatParcelizer((TextAnnouncementContentCardView) objWrite3);
        setpreviousgeneration.serializer = androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1IconCompatParcelizer2;
        setpreviousgeneration.RatingCompat = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewhandleRotaryEvent1(setpreviousgeneration.write, androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1IconCompatParcelizer2));
        setpreviousgeneration.read = AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.IconCompatParcelizer((TextAnnouncementContentCardView) objWrite2);
        setpreviousgeneration.PlaybackStateCompat = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewsnapshotObserver1(setpreviousgeneration.MediaBrowserCompatMediaItem, accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new accessperformActionHelper(setpreviousgeneration.ParcelableVolumeInfo, setpreviousgeneration.MediaMetadataCompat, setpreviousgeneration.write, setpreviousgeneration.RatingCompat, accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new accesssetCurrentlyAccessibilityFocusedANIp(setpreviousgeneration.read, setpreviousgeneration.ParcelableVolumeInfo, accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewhandleRotaryEvent1(setpreviousgeneration.IconCompatParcelizer, setpreviousgeneration.serializer, i)))))), i));
        accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanipIconCompatParcelizer = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(AndroidComposeView_inputModeManager1.IconCompatParcelizer);
        setpreviousgeneration.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetcurrentlyfocusedanipIconCompatParcelizer;
        int i2 = 0;
        setpreviousgeneration.MediaSessionCompatToken = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewsnapshotObserver1(setpreviousgeneration.ParcelableVolumeInfo, accessgetcurrentlyfocusedanipIconCompatParcelizer, i2));
        setpreviousgeneration.PlaybackStateCompatCustomAction = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new accessperformActionHelper(setpreviousgeneration.RemoteActionCompatParcelizer, setpreviousgeneration.MediaMetadataCompat, setpreviousgeneration.PlaybackStateCompat, accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewRootModifierNodemeasure1(AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.IconCompatParcelizer(abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer), i2)), setpreviousgeneration.read));
        setpreviousgeneration.MediaDescriptionCompat = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new accesssetCurrentlyAccessibilityFocusedANIp(setpreviousgeneration.IconCompatParcelizer, setpreviousgeneration.serializer, accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1(i2, setpreviousgeneration.MediaSessionCompatToken))));
        accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanipIconCompatParcelizer2 = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewtextInputSession1(setpreviousgeneration.PlaybackStateCompat, setpreviousgeneration.MediaSessionCompatToken, setpreviousgeneration.PlaybackStateCompatCustomAction, setpreviousgeneration.ParcelableVolumeInfo, setpreviousgeneration.MediaDescriptionCompat, accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewhandleRotaryEvent1(setpreviousgeneration.IconCompatParcelizer, setpreviousgeneration.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, i2)), setpreviousgeneration.read));
        setpreviousgeneration.MediaSessionCompatResultReceiverWrapper = accessgetcurrentlyfocusedanipIconCompatParcelizer2;
        setpreviousgeneration.MediaSessionCompatQueueItem = accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewcontentCaptureManager1(setpreviousgeneration.RemoteActionCompatParcelizer, setpreviousgeneration.PlaybackStateCompat, setpreviousgeneration.read, accessgetPendingHorizontalScrollEventsp.IconCompatParcelizer(new AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1(i, accessgetcurrentlyfocusedanipIconCompatParcelizer2))));
        return setpreviousgeneration;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<getHasMeasureResult> getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(FirebaseSessions.class);
        capturerulersifneededuiWrite.IconCompatParcelizer = LIBRARY_NAME;
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.serializer(firebaseSessionsComponent));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new Gson$$ExternalSyntheticBUOutline0(25);
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer(2);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite2 = getHasMeasureResult.write(AndroidComposeViewRootModifierNodeonKeyEventfocusWasMovedOrCancelled2.class);
        capturerulersifneededuiWrite2.IconCompatParcelizer = "fire-sessions-component";
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.serializer(appContext));
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.serializer(backgroundDispatcher));
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.serializer(blockingDispatcher));
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.serializer(firebaseApp));
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.serializer(firebaseInstallationsApi));
        capturerulersifneededuiWrite2.write(new provideRelativeRulerValue(transportFactory, 1, 1));
        capturerulersifneededuiWrite2.RemoteActionCompatParcelizer = new Gson$$ExternalSyntheticBUOutline0(26);
        return SQLite.read(gethasmeasureresultIconCompatParcelizer, capturerulersifneededuiWrite2.IconCompatParcelizer(), (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{LIBRARY_NAME, "3.0.4"}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }
}
