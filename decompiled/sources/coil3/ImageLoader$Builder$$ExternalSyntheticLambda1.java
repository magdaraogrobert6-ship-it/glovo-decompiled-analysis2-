package coil3;

import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Base64;
import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.preferences.core.PreferencesSerializer;
import androidx.emoji2.text.EmojiProcessor;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import androidx.sqlite.SQLite;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.local.db.TrackingDatabase_Impl;
import com.foodora.courier.app.application.CourierApplication$$ExternalSyntheticLambda2;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.logistics.rider.glovo.R;
import com.roadrunner.country.config.implementation.data.database.CountryConfigDatabase_Impl;
import com.roadrunner.customerchat.selfservice.data.repository.WebChatNativeAssetRepositoryImpl;
import com.roadrunner.database.Database_Impl;
import com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShowNavigationSettingsTooltipUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.experience_tools.braze.BrazeManagerImpl;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.freelancing.data.GoAndStartDataStoreImpl;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.state.data.HomeRepositoryImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.sentry.util.UrlUtils;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.CSSParseException;
import o.ConstraintReferenceIncorrectConstraintException;
import o.HapticFeedbackType;
import o.accessboundsInScreen;
import o.cancelAll;
import o.collectRangeTransitions;
import o.considerReleasingGlowsOnScroll;
import o.copyRootViewBounds;
import o.createFromParcel;
import o.createNotificationChannels;
import o.getBoundingRects;
import o.getCenterF1C5BW0ui_graphics;
import o.getHasNonTranslationComponentsannotations;
import o.getMessageImageView;
import o.getQueryParameterslambda2;
import o.getRadiusui_graphics;
import o.getTextIndent;
import o.getTextMotion;
import o.getWeight;
import o.oc;
import o.onViewAttachedToWindowlambda0;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeOnPictureInPictureModeChangedListener;
import o.requestContentCardsRefreshFromCache;
import o.setCarryoverInAppMessage;
import o.setFirstHorizontalStyle;
import o.setFirstVerticalStyle;
import o.setMinWidth;
import o.setPaddingTop;
import o.setPushDeliveryManagerandroid_sdk_base_release;
import o.setTargetFragment;
import o.setTransactionSuccessful;
import o.setVerticalStyle;
import o.updateAdidI;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ImageLoader$Builder$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static byte RemoteActionCompatParcelizer = -112;
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ ImageLoader$Builder$$ExternalSyntheticLambda1(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ RemoteActionCompatParcelizer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d4 A[PHI: r7
  0x02d4: PHI (r7v6 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x02f7 A[PHI: r7
  0x02f7: PHI (r7v3 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x030e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0324  */
    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r7
  0x0028: PHI (r7v62 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0375 A[PHI: r7
  0x0375: PHI (r7v1 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[PHI: r7
  0x0034: PHI (r7v60 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[PHI: r7
  0x0049: PHI (r7v58 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x005f A[PHI: r7
  0x005f: PHI (r7v56 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0084 A[PHI: r7
  0x0084: PHI (r7v52 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e6 A[PHI: r7
  0x00e6: PHI (r7v50 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:31:0x0106  */
    /* JADX WARN: Code duplicated, block: B:33:0x0111  */
    /* JADX WARN: Code duplicated, block: B:35:0x011b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0121  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129 A[PHI: r6 r7
  0x0129: PHI (r6v14 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v17 o.createFromParcel) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0129: PHI (r7v48 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x013e A[PHI: r7
  0x013e: PHI (r7v46 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0149 A[PHI: r7
  0x0149: PHI (r7v44 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0157 A[PHI: r7
  0x0157: PHI (r7v42 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0162 A[PHI: r7
  0x0162: PHI (r7v40 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x016e A[PHI: r7
  0x016e: PHI (r7v38 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0176 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0179 A[PHI: r7
  0x0179: PHI (r7v36 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0186 A[PHI: r7
  0x0186: PHI (r7v34 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x018d A[PHI: r6 r7
  0x018d: PHI (r6v13 o.createFromParcel) = (r6v0 o.createFromParcel), (r6v17 o.createFromParcel) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r7v32 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0195  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d8 A[PHI: r7
  0x01d8: PHI (r7v28 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01eb A[PHI: r7
  0x01eb: PHI (r7v26 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0202 A[PHI: r7
  0x0202: PHI (r7v24 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0209 A[PHI: r7
  0x0209: PHI (r7v22 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x021d A[PHI: r7
  0x021d: PHI (r7v20 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0224 A[PHI: r7
  0x0224: PHI (r7v18 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0236 A[PHI: r7
  0x0236: PHI (r7v16 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x02a6 A[PHI: r7
  0x02a6: PHI (r7v14 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x02ad A[PHI: r7
  0x02ad: PHI (r7v12 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x02ba A[PHI: r7
  0x02ba: PHI (r7v10 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x02c7 A[PHI: r7
  0x02c7: PHI (r7v8 java.lang.Object) = (r7v0 java.lang.Object), (r7v64 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Switch 'out' block B:69:0x01bc for B:8:0x0023 already processed. Defaulting to fallback option. */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        createFromParcel createfromparcel;
        Object obj;
        Context context;
        double d;
        int largeMemoryClass;
        Object systemService;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        String str;
        getTextMotion gettextmotion;
        Looper mainLooper;
        int i;
        MessageQueue queue;
        String str2;
        GoogleApiAvailability googleApiAvailability;
        Application application;
        int i2;
        setMinWidth setminwidth;
        Braze.Companion companion;
        Application application2;
        String string;
        int i3 = 2 % 2;
        int i4 = serializer + 61;
        write = i4 % Fields.SpotShadowColor;
        Object obj2 = null;
        boolean zM = true;
        int i5 = 0;
        if (i4 % 2 == 0) {
            int i6 = this.IconCompatParcelizer;
            createfromparcel = createFromParcel.INSTANCE;
            obj = this.read;
            switch (i6) {
                case 0:
                    context = (Context) ((ImageLoader$Builder) obj).RemoteActionCompatParcelizer;
                    systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        int i7 = write;
                        int i8 = i7 + 99;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        int i10 = i7 + 113;
                        serializer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        d = 0.15d;
                    } else {
                        d = 0.2d;
                    }
                    if (0.0d <= d) {
                        break;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("percent must be in the range [0.0, 1.0].");
                    return null;
                case 1:
                    return (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{(onViewAttachedToWindowlambda0) obj}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                case 2:
                    return (getWeight) ((RealImageLoader) obj).write.write.MediaSessionCompatResultReceiverWrapper();
                case 3:
                    return CallFactoryNetworkClient.RemoteActionCompatParcelizer((getMessageImageView) ((CourierApplication$$ExternalSyntheticLambda2) obj).invoke());
                case 4:
                    return ((Context) ((CardView$1) obj).RemoteActionCompatParcelizer).getSharedPreferences("perseus-sdk-pref", 0);
                case 5:
                    return TrackingDatabase_Impl.RemoteActionCompatParcelizer((TrackingDatabase_Impl) obj);
                case 6:
                    setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) obj;
                    return SQLite.read(new HapticFeedbackType(-65536, R.raw.annoying_alert, settransactionsuccessful.IconCompatParcelizer(R.string.channel_notification_push_id), settransactionsuccessful.IconCompatParcelizer(R.string.channel_notification_push_description), settransactionsuccessful.IconCompatParcelizer(R.string.channel_notification_push_name)), new HapticFeedbackType(-16776961, R.raw.high_prio, settransactionsuccessful.IconCompatParcelizer(R.string.channel_notification_high_id), settransactionsuccessful.IconCompatParcelizer(R.string.channel_notification_high_description), settransactionsuccessful.IconCompatParcelizer(R.string.channel_notification_high_name)), new HapticFeedbackType(-16711936, R.raw.low_prio, settransactionsuccessful.IconCompatParcelizer(R.string.channel_notification_low_id), settransactionsuccessful.IconCompatParcelizer(R.string.channel_notification_low_description), settransactionsuccessful.IconCompatParcelizer(R.string.channel_notification_low_name)));
                case 7:
                    Object systemService2 = ((Application) ((EmojiProcessor) obj).serializer).getSystemService(RemoteMessageConst.NOTIFICATION);
                    systemService2.getClass();
                    return (NotificationManager) systemService2;
                case 8:
                    return MainActivity.serializer((MainActivity) obj);
                case 9:
                    ((accessboundsInScreen) obj).getClass();
                    UUID uuidRandomUUID = UUID.randomUUID();
                    uuidRandomUUID.getClass();
                    String string2 = uuidRandomUUID.toString();
                    string2.getClass();
                    return string2;
                case 10:
                    return CountryConfigDatabase_Impl.write((CountryConfigDatabase_Impl) obj);
                case 11:
                    return Boolean.valueOf(((FirebaseRemoteConfigImpl) ((getHasNonTranslationComponentsannotations) obj).serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_SENTRY_CUSTOM_TRACES_ENABLED.getFirebaseFlagName()));
                case 12:
                    if (!(((WebChatNativeAssetRepositoryImpl) obj).write.RemoteActionCompatParcelizer.IconCompatParcelizer() ^ true)) {
                    }
                case 13:
                    zM = false;
                    firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((getTextIndent) obj).read;
                    str = firebaseRemoteConfigImpl.read.read();
                    if (str != null) {
                        zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_CUSTOMER_CHAT_MIGRATION_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, str, firebaseRemoteConfigImpl);
                    }
                    return Boolean.valueOf(zM);
                case 14:
                    gettextmotion = (getTextMotion) obj;
                    mainLooper = Looper.getMainLooper();
                    if (mainLooper != null) {
                        i = write + 29;
                        serializer = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            mainLooper.getQueue();
                            obj2.hashCode();
                            throw null;
                        }
                        queue = mainLooper.getQueue();
                        if (queue != null) {
                            int i12 = serializer + 7;
                            write = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            queue.removeIdleHandler(gettextmotion);
                        }
                    }
                    return createfromparcel;
                case 15:
                    return Database_Impl.serializer((Database_Impl) obj);
                case 16:
                    return ((setPushDeliveryManagerandroid_sdk_base_release) ((MidShiftIdVerificationCoordinator) obj).IconCompatParcelizer).read(requestContentCardsRefreshFromCache.ID_VERIFICATION_IN_MID_SHIFT);
                case 17:
                    str2 = ((oc) obj).read();
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                case 18:
                    return ((ShowNavigationSettingsTooltipUseCaseImpl) obj).RemoteActionCompatParcelizer.IconCompatParcelizer(R.string.turn_by_turn_settings_tooltip_edit_toll);
                case 19:
                    return (HomeRepositoryImpl) ((ConfirmationRepository) obj).MediaDescriptionCompat.write();
                case 20:
                    return DelayKt.serializer(new RoomDatabase$$ExternalSyntheticLambda2(20, (StateProviderImpl) obj));
                case 21:
                    return (SharedPreferences) ((ConstraintReferenceIncorrectConstraintException) obj).IconCompatParcelizer.write();
                case 22:
                    setFirstVerticalStyle setfirstverticalstyleRemoteActionCompatParcelizer = ((ConstraintReferenceIncorrectConstraintException) ((setFirstHorizontalStyle) obj).RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
                    setfirstverticalstyleRemoteActionCompatParcelizer.getClass();
                    removeOnPictureInPictureModeChangedListener.IconCompatParcelizer(setfirstverticalstyleRemoteActionCompatParcelizer.getModeInt());
                    return createfromparcel;
                case 23:
                    googleApiAvailability = GoogleApiAvailability.getInstance();
                    googleApiAvailability.getClass();
                    application = ((setVerticalStyle) obj).read;
                    if (googleApiAvailability.isGooglePlayServicesAvailable(application) == 0) {
                        return setPaddingTop.GOOGLE;
                    }
                    if (!(!setCarryoverInAppMessage.serializer(Build.MANUFACTURER, SystemUtils.PRODUCT_HUAWEI, true))) {
                        i2 = serializer + 15;
                        write = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(application);
                            throw null;
                        }
                        if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(application) == 0) {
                            return setPaddingTop.HUAWEI;
                        }
                    }
                    return setPaddingTop.NONE;
                case 24:
                    setminwidth = ((BrazeManagerImpl) obj).write;
                    companion = Braze.Companion;
                    application2 = setminwidth.write;
                    Context applicationContext = application2.getApplicationContext();
                    applicationContext.getClass();
                    Braze companion2 = companion.getInstance(applicationContext);
                    if (setminwidth.read.write() == setPaddingTop.HUAWEI) {
                        Context applicationContext2 = application2.getApplicationContext();
                        applicationContext2.getClass();
                        companion.wipeData(applicationContext2);
                        Context applicationContext3 = application2.getApplicationContext();
                        applicationContext3.getClass();
                        BrazeConfig.Builder builder = new BrazeConfig.Builder();
                        string = application2.getString(R.string.hms_com_braze_api_key);
                        if (string.startsWith("%('")) {
                            Object[] objArr = new Object[1];
                            a(string.substring(3), objArr);
                            string = ((String) objArr[0]).intern();
                        }
                        string.getClass();
                        companion.configure(applicationContext3, builder.setApiKey(string).build());
                    }
                    return companion2;
                case 25:
                    createNotificationChannels createnotificationchannels = new createNotificationChannels(0);
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    return PreferencesSerializer.write(YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer()).plus(createnotificationchannels)), new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(i5, (cancelAll) obj), 3);
                case 26:
                    performCustomExitMxy_nc0 performcustomexitmxy_nc0 = (performCustomExitMxy_nc0) ((GoAndStartDataStoreImpl) obj).write.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                    int i14 = write + 17;
                    serializer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    return performcustomexitmxy_nc0;
                case 27:
                    Object objWrite = ((copyRootViewBounds) obj).RemoteActionCompatParcelizer.read.write();
                    objWrite.getClass();
                    return new getBoundingRects((setTransactionSuccessful) objWrite);
                case 28:
                    return new setTargetFragment((SaveHeatmapUrlImpl) ((SaveHeatmapUrlImpl) obj).serializer);
                default:
                    return (performCustomExitMxy_nc0) ((considerReleasingGlowsOnScroll) obj).serializer.write.MediaSessionCompatResultReceiverWrapper();
            }
        }
        int i16 = this.IconCompatParcelizer;
        createfromparcel = createFromParcel.INSTANCE;
        obj = this.read;
        switch (i16) {
            case 0:
                context = (Context) ((ImageLoader$Builder) obj).RemoteActionCompatParcelizer;
                try {
                    systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        int i17 = write;
                        int i18 = i17 + 99;
                        serializer = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        int i110 = i17 + 113;
                        serializer = i110 % Fields.SpotShadowColor;
                        int i111 = i110 % 2;
                        d = 0.15d;
                    } else {
                        d = 0.2d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d <= d || d > 1.0d) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                CSSParseException cSSParseException = new CSSParseException((byte) 0, 3);
                try {
                    Object systemService3 = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService3.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService3;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = Fields.RotationX;
                }
                return new getRadiusui_graphics(new getCenterF1C5BW0ui_graphics((long) (d * ((long) largeMemoryClass) * 1048576), cSSParseException), cSSParseException);
            case 1:
                return (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{(onViewAttachedToWindowlambda0) obj}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            case 2:
                return (getWeight) ((RealImageLoader) obj).write.write.MediaSessionCompatResultReceiverWrapper();
            case 3:
                return CallFactoryNetworkClient.RemoteActionCompatParcelizer((getMessageImageView) ((CourierApplication$$ExternalSyntheticLambda2) obj).invoke());
            case 4:
                return ((Context) ((CardView$1) obj).RemoteActionCompatParcelizer).getSharedPreferences("perseus-sdk-pref", 0);
            case 5:
                return TrackingDatabase_Impl.RemoteActionCompatParcelizer((TrackingDatabase_Impl) obj);
            case 6:
                setTransactionSuccessful settransactionsuccessful2 = (setTransactionSuccessful) obj;
                return SQLite.read(new HapticFeedbackType(-65536, R.raw.annoying_alert, settransactionsuccessful2.IconCompatParcelizer(R.string.channel_notification_push_id), settransactionsuccessful2.IconCompatParcelizer(R.string.channel_notification_push_description), settransactionsuccessful2.IconCompatParcelizer(R.string.channel_notification_push_name)), new HapticFeedbackType(-16776961, R.raw.high_prio, settransactionsuccessful2.IconCompatParcelizer(R.string.channel_notification_high_id), settransactionsuccessful2.IconCompatParcelizer(R.string.channel_notification_high_description), settransactionsuccessful2.IconCompatParcelizer(R.string.channel_notification_high_name)), new HapticFeedbackType(-16711936, R.raw.low_prio, settransactionsuccessful2.IconCompatParcelizer(R.string.channel_notification_low_id), settransactionsuccessful2.IconCompatParcelizer(R.string.channel_notification_low_description), settransactionsuccessful2.IconCompatParcelizer(R.string.channel_notification_low_name)));
            case 7:
                Object systemService4 = ((Application) ((EmojiProcessor) obj).serializer).getSystemService(RemoteMessageConst.NOTIFICATION);
                systemService4.getClass();
                return (NotificationManager) systemService4;
            case 8:
                return MainActivity.serializer((MainActivity) obj);
            case 9:
                ((accessboundsInScreen) obj).getClass();
                UUID uuidRandomUUID2 = UUID.randomUUID();
                uuidRandomUUID2.getClass();
                String string3 = uuidRandomUUID2.toString();
                string3.getClass();
                return string3;
            case 10:
                return CountryConfigDatabase_Impl.write((CountryConfigDatabase_Impl) obj);
            case 11:
                return Boolean.valueOf(((FirebaseRemoteConfigImpl) ((getHasNonTranslationComponentsannotations) obj).serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_SENTRY_CUSTOM_TRACES_ENABLED.getFirebaseFlagName()));
            case 12:
                return !(((WebChatNativeAssetRepositoryImpl) obj).write.RemoteActionCompatParcelizer.IconCompatParcelizer() ^ true) ? collectRangeTransitions.STAGING : collectRangeTransitions.PRODUCTION;
            case 13:
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((getTextIndent) obj).read;
                str = firebaseRemoteConfigImpl.read.read();
                if (str != null) {
                    zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_CUSTOMER_CHAT_MIGRATION_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, str, firebaseRemoteConfigImpl);
                }
                return Boolean.valueOf(zM);
            case 14:
                gettextmotion = (getTextMotion) obj;
                mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    i = write + 29;
                    serializer = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        mainLooper.getQueue();
                        obj2.hashCode();
                        throw null;
                    }
                    queue = mainLooper.getQueue();
                    if (queue != null) {
                        int i112 = serializer + 7;
                        write = i112 % Fields.SpotShadowColor;
                        int i113 = i112 % 2;
                        queue.removeIdleHandler(gettextmotion);
                    }
                }
                return createfromparcel;
            case 15:
                return Database_Impl.serializer((Database_Impl) obj);
            case 16:
                return ((setPushDeliveryManagerandroid_sdk_base_release) ((MidShiftIdVerificationCoordinator) obj).IconCompatParcelizer).read(requestContentCardsRefreshFromCache.ID_VERIFICATION_IN_MID_SHIFT);
            case 17:
                str2 = ((oc) obj).read();
                if (str2 == null) {
                    return "";
                }
                return str2;
            case 18:
                return ((ShowNavigationSettingsTooltipUseCaseImpl) obj).RemoteActionCompatParcelizer.IconCompatParcelizer(R.string.turn_by_turn_settings_tooltip_edit_toll);
            case 19:
                return (HomeRepositoryImpl) ((ConfirmationRepository) obj).MediaDescriptionCompat.write();
            case 20:
                return DelayKt.serializer(new RoomDatabase$$ExternalSyntheticLambda2(20, (StateProviderImpl) obj));
            case 21:
                return (SharedPreferences) ((ConstraintReferenceIncorrectConstraintException) obj).IconCompatParcelizer.write();
            case 22:
                setFirstVerticalStyle setfirstverticalstyleRemoteActionCompatParcelizer2 = ((ConstraintReferenceIncorrectConstraintException) ((setFirstHorizontalStyle) obj).RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
                setfirstverticalstyleRemoteActionCompatParcelizer2.getClass();
                removeOnPictureInPictureModeChangedListener.IconCompatParcelizer(setfirstverticalstyleRemoteActionCompatParcelizer2.getModeInt());
                return createfromparcel;
            case 23:
                googleApiAvailability = GoogleApiAvailability.getInstance();
                googleApiAvailability.getClass();
                application = ((setVerticalStyle) obj).read;
                if (googleApiAvailability.isGooglePlayServicesAvailable(application) == 0) {
                    return setPaddingTop.GOOGLE;
                }
                if (!(!setCarryoverInAppMessage.serializer(Build.MANUFACTURER, SystemUtils.PRODUCT_HUAWEI, true))) {
                    i2 = serializer + 15;
                    write = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(application);
                        throw null;
                    }
                    if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(application) == 0) {
                        return setPaddingTop.HUAWEI;
                    }
                }
                return setPaddingTop.NONE;
            case 24:
                setminwidth = ((BrazeManagerImpl) obj).write;
                companion = Braze.Companion;
                application2 = setminwidth.write;
                Context applicationContext4 = application2.getApplicationContext();
                applicationContext4.getClass();
                Braze companion3 = companion.getInstance(applicationContext4);
                if (setminwidth.read.write() == setPaddingTop.HUAWEI) {
                    Context applicationContext5 = application2.getApplicationContext();
                    applicationContext5.getClass();
                    companion.wipeData(applicationContext5);
                    Context applicationContext6 = application2.getApplicationContext();
                    applicationContext6.getClass();
                    BrazeConfig.Builder builder2 = new BrazeConfig.Builder();
                    string = application2.getString(R.string.hms_com_braze_api_key);
                    if (string.startsWith("%('")) {
                        Object[] objArr2 = new Object[1];
                        a(string.substring(3), objArr2);
                        string = ((String) objArr2[0]).intern();
                    }
                    string.getClass();
                    companion.configure(applicationContext6, builder2.setApiKey(string).build());
                }
                return companion3;
            case 25:
                createNotificationChannels createnotificationchannels2 = new createNotificationChannels(0);
                DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                return PreferencesSerializer.write(YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer()).plus(createnotificationchannels2)), new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(i5, (cancelAll) obj), 3);
            case 26:
                performCustomExitMxy_nc0 performcustomexitmxy_nc1 = (performCustomExitMxy_nc0) ((GoAndStartDataStoreImpl) obj).write.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                int i114 = write + 17;
                serializer = i114 % Fields.SpotShadowColor;
                int i115 = i114 % 2;
                return performcustomexitmxy_nc1;
            case 27:
                Object objWrite2 = ((copyRootViewBounds) obj).RemoteActionCompatParcelizer.read.write();
                objWrite2.getClass();
                return new getBoundingRects((setTransactionSuccessful) objWrite2);
            case 28:
                return new setTargetFragment((SaveHeatmapUrlImpl) ((SaveHeatmapUrlImpl) obj).serializer);
            default:
                return (performCustomExitMxy_nc0) ((considerReleasingGlowsOnScroll) obj).serializer.write.MediaSessionCompatResultReceiverWrapper();
        }
    }
}
