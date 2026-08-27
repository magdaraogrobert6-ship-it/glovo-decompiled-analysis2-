package com.braze;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.PowerManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$1;
import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5$1;
import androidx.compose.material3.SheetState;
import androidx.work.impl.WorkerWrapper;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.foodora.courier.app.application.CourierApplication;
import com.foodora.courier.push.messages.domain.HandlePushMessageUseCase;
import com.huawei.hms.adapter.internal.CommonCode;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import o.AndroidAssetFont;
import o.AwaitFirstLayoutModifier;
import o.InputMethodManagerImpl;
import o.IntervalTreeKt;
import o.LogSqliteDriver;
import o.PaddingKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PrerenderException;
import o.ShortNewsContentCardView;
import o.TextDecorationSpan;
import o.ViewPager2SavedState;
import o.accesssetBlendModes9anfk8jd;
import o.checkAdjustAdRevenue;
import o.checkEventI;
import o.checkForInstallReferrerInfo;
import o.createDeeplinkIntentI;
import o.createFromParcel;
import o.deleteEventMetadata;
import o.deleteGlobalCallbackParameters;
import o.disableThirdPartySharingForCoppaEnabledI;
import o.drawOutlineHelper;
import o.endI;
import o.foregroundTimerFiredI;
import o.getAdd0d7_KjU;
import o.getAutofillTree;
import o.getCieXyz;
import o.getContentCaptureSessionui;
import o.getContentViewGroupParentLayout;
import o.getDefaultShadowColor;
import o.getImageLoader;
import o.getLiveRegiondelegate;
import o.getLogoDescription;
import o.getRootAutofillId;
import o.getSkewX;
import o.getStateDescription;
import o.getUnknown4ZHQPSE;
import o.handleAttributionCallbackI;
import o.handleThirdPartySharingCallbackI;
import o.hasSameCornerRadius;
import o.isAdapterPositionOnScreen;
import o.isUnderlineText;
import o.isValidReferrerDetails;
import o.lambdaaddGlobalCallbackParameter21;
import o.mapMKHz9U;
import o.moveTodefault;
import o.onMove;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.onViewAttachedToWindowlambda0;
import o.placeSpaceBetweenfoundation_layout;
import o.placeSpaceEvenlyfoundation_layout;
import o.populate;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.requiredWidth3ABfNKs;
import o.setCurrentItemInternal;
import o.setFrom58bKbWc;
import o.setRotationX;
import o.translateimpldefault;
import o.updateTextLayoutResult;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda9 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ Braze$$ExternalSyntheticLambda9(getStateDescription getstatedescription, LogSqliteDriver logSqliteDriver, LoginActivityViewModel loginActivityViewModel, String str) {
        this.$r8$classId = 7;
        this.f$0 = getstatedescription;
        this.f$2 = logSqliteDriver;
        this.f$3 = loginActivityViewModel;
        this.f$1 = str;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0248  */
    /* JADX WARN: Code duplicated, block: B:102:0x024b  */
    /* JADX WARN: Code duplicated, block: B:104:0x024e  */
    /* JADX WARN: Code duplicated, block: B:105:0x027f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0285  */
    /* JADX WARN: Code duplicated, block: B:110:0x02df  */
    /* JADX WARN: Code duplicated, block: B:113:0x031b  */
    /* JADX WARN: Code duplicated, block: B:114:0x031d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0344  */
    /* JADX WARN: Code duplicated, block: B:118:0x0348  */
    /* JADX WARN: Code duplicated, block: B:124:0x0353  */
    /* JADX WARN: Code duplicated, block: B:126:0x0357  */
    /* JADX WARN: Code duplicated, block: B:127:0x035b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0366  */
    /* JADX WARN: Code duplicated, block: B:135:0x036a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0375  */
    /* JADX WARN: Code duplicated, block: B:142:0x0382  */
    /* JADX WARN: Code duplicated, block: B:145:0x0395  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:149:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:156:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:159:0x0404  */
    /* JADX WARN: Code duplicated, block: B:160:0x0408  */
    /* JADX WARN: Code duplicated, block: B:162:0x040b  */
    /* JADX WARN: Code duplicated, block: B:163:0x040e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0502  */
    /* JADX WARN: Code duplicated, block: B:169:0x0512  */
    /* JADX WARN: Code duplicated, block: B:170:0x0517  */
    /* JADX WARN: Code duplicated, block: B:172:0x051a  */
    /* JADX WARN: Code duplicated, block: B:203:0x065b  */
    /* JADX WARN: Code duplicated, block: B:222:0x051c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        Object next;
        setCurrentItemInternal setcurrentiteminternal;
        int i;
        AwaitFirstLayoutModifier awaitFirstLayoutModifier;
        String str;
        boolean z;
        boolean z2;
        checkForInstallReferrerInfo checkforinstallreferrerinfo;
        String str2;
        checkForInstallReferrerInfo checkforinstallreferrerinfo2;
        String str3;
        checkForInstallReferrerInfo checkforinstallreferrerinfo3;
        String str4;
        checkForInstallReferrerInfo checkforinstallreferrerinfo4;
        String str5;
        checkForInstallReferrerInfo checkforinstallreferrerinfo5;
        String str6;
        checkForInstallReferrerInfo checkforinstallreferrerinfo6;
        String str7;
        LinkedHashMap linkedHashMap;
        Object value;
        String string;
        PushAnalyticsData pushAnalyticsData;
        PushAnalyticsData pushAnalyticsData2;
        PushAnalyticsData pushAnalyticsData3;
        updateTextLayoutResult updatetextlayoutresult;
        float fSerializer;
        getLogoDescription getlogodescription;
        Object obj = null;
        switch (this.$r8$classId) {
            case 0:
                return Braze.logCustomEvent$lambda$1((Braze) this.f$0, (String) this.f$1, (BrazeProperties) this.f$2, (BrazeProperties) this.f$3);
            case 1:
                Float f = (Float) this.f$0;
                placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layout = (placeSpaceBetweenfoundation_layout) this.f$1;
                Float f2 = (Float) this.f$2;
                placeSpaceEvenlyfoundation_layout placespaceevenlyfoundation_layout = (placeSpaceEvenlyfoundation_layout) this.f$3;
                if (!f.equals(placespacebetweenfoundation_layout.RemoteActionCompatParcelizer) || !f2.equals(placespacebetweenfoundation_layout.MediaBrowserCompatMediaItem)) {
                    placespacebetweenfoundation_layout.RemoteActionCompatParcelizer = f;
                    placespacebetweenfoundation_layout.MediaBrowserCompatMediaItem = f2;
                    placespacebetweenfoundation_layout.serializer = placespaceevenlyfoundation_layout;
                    placespacebetweenfoundation_layout.write = new PaddingKt(placespaceevenlyfoundation_layout, requiredWidth3ABfNKs.read, f, f2, null);
                    ((onShowTranslationui) placespacebetweenfoundation_layout.RatingCompat.RemoteActionCompatParcelizer).setValue(Boolean.TRUE);
                    placespacebetweenfoundation_layout.read = false;
                    placespacebetweenfoundation_layout.MediaDescriptionCompat = true;
                }
                return createFromParcel.INSTANCE;
            case 2:
                SheetState sheetState = (SheetState) this.f$0;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.f$1;
                Animatable animatable = (Animatable) this.f$2;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.f$3;
                if (sheetState.IconCompatParcelizer() != getAutofillTree.Expanded) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 8), 3).IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new getRootAutofillId(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k1));
                } else if (sheetState.IconCompatParcelizer.RemoteActionCompatParcelizer().serializer.containsKey(getAutofillTree.PartiallyExpanded)) {
                    ShortNewsContentCardView shortNewsContentCardView = null;
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable, shortNewsContentCardView, 0), 3);
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 7), 3);
                } else {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 8), 3).IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new getRootAutofillId(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k1));
                }
                return createFromParcel.INSTANCE;
            case 3:
                hasSameCornerRadius hassamecornerradius = (hasSameCornerRadius) this.f$0;
                UUID uuid = (UUID) this.f$1;
                accesssetBlendModes9anfk8jd accesssetblendmodes9anfk8jd = (accesssetBlendModes9anfk8jd) this.f$2;
                Context context = (Context) this.f$3;
                String string2 = uuid.toString();
                setFrom58bKbWc setfrom58bkbwcWrite = ((translateimpldefault) hassamecornerradius.IconCompatParcelizer).write(string2);
                if (setfrom58bkbwcWrite == null || setfrom58bkbwcWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.isFinished()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    return null;
                }
                getDefaultShadowColor getdefaultshadowcolor = hassamecornerradius.write;
                synchronized (getdefaultshadowcolor.MediaMetadataCompat) {
                    setRotationX.read().getClass();
                    WorkerWrapper workerWrapper = (WorkerWrapper) getdefaultshadowcolor.read.remove(string2);
                    if (workerWrapper != null) {
                        if (getdefaultshadowcolor.MediaSessionCompatQueueItem == null) {
                            PowerManager.WakeLock wakeLockWrite = drawOutlineHelper.write(getdefaultshadowcolor.IconCompatParcelizer);
                            getdefaultshadowcolor.MediaSessionCompatQueueItem = wakeLockWrite;
                            wakeLockWrite.acquire();
                        }
                        getdefaultshadowcolor.RatingCompat.put(string2, workerWrapper);
                        getdefaultshadowcolor.IconCompatParcelizer.startForegroundService(IntervalTreeKt.IconCompatParcelizer(getdefaultshadowcolor.IconCompatParcelizer, (mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), new Object[]{workerWrapper.MediaSessionCompatQueueItem}, MaybeObserveOn.write()), accesssetblendmodes9anfk8jd));
                    }
                    break;
                }
                mapMKHz9U mapmkhz9u = (mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), new Object[]{setfrom58bkbwcWrite}, MaybeObserveOn.write());
                String str8 = IntervalTreeKt.write;
                Intent intent = new Intent(context, (Class<?>) getAdd0d7_KjU.class);
                intent.setAction("ACTION_NOTIFY");
                intent.putExtra("KEY_NOTIFICATION_ID", accesssetblendmodes9anfk8jd.IconCompatParcelizer);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", accesssetblendmodes9anfk8jd.write);
                intent.putExtra("KEY_NOTIFICATION", accesssetblendmodes9anfk8jd.serializer);
                intent.putExtra("KEY_WORKSPEC_ID", mapmkhz9u.RemoteActionCompatParcelizer);
                intent.putExtra("KEY_GENERATION", mapmkhz9u.serializer);
                context.startService(intent);
                return null;
            case 4:
                return Braze.logPushNotificationActionClicked$lambda$1((String) this.f$1, (Braze) this.f$0, (String) this.f$2, (String) this.f$3);
            case 5:
                HandlePushMessageUseCase handlePushMessageUseCase = (HandlePushMessageUseCase) this.f$0;
                checkAdjustAdRevenue checkadjustadrevenueRemoteActionCompatParcelizer = (checkAdjustAdRevenue) this.f$1;
                CourierApplication courierApplication = (CourierApplication) this.f$2;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.f$3;
                AwaitFirstLayoutModifier awaitFirstLayoutModifier2 = checkadjustadrevenueRemoteActionCompatParcelizer.IconCompatParcelizer;
                checkForInstallReferrerInfo checkforinstallreferrerinfo7 = awaitFirstLayoutModifier2 instanceof checkForInstallReferrerInfo ? (checkForInstallReferrerInfo) awaitFirstLayoutModifier2 : null;
                String str9 = checkforinstallreferrerinfo7 != null ? checkforinstallreferrerinfo7.IconCompatParcelizer : null;
                String str10 = checkforinstallreferrerinfo7 != null ? checkforinstallreferrerinfo7.MediaSessionCompatQueueItem : null;
                String str11 = checkforinstallreferrerinfo7 != null ? checkforinstallreferrerinfo7.serializer : null;
                endI endi = new endI(str9, str10, str11);
                if (str11 != null && disableThirdPartySharingForCoppaEnabledI.RemoteActionCompatParcelizer(str11)) {
                    BuildersKt.RemoteActionCompatParcelizer(handlePushMessageUseCase.write, null, null, new PerseusLogger$w$1(handlePushMessageUseCase, endi, courierApplication, null, 4), 3);
                }
                PrerenderException prerenderException = handlePushMessageUseCase.ParcelableVolumeInfo;
                prerenderException.getClass();
                AwaitFirstLayoutModifier awaitFirstLayoutModifier3 = checkadjustadrevenueRemoteActionCompatParcelizer.IconCompatParcelizer;
                checkForInstallReferrerInfo checkforinstallreferrerinfo8 = awaitFirstLayoutModifier3 instanceof checkForInstallReferrerInfo ? (checkForInstallReferrerInfo) awaitFirstLayoutModifier3 : null;
                if (checkforinstallreferrerinfo8 != null) {
                    String str12 = checkforinstallreferrerinfo8.serializer;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str12, foregroundTimerFiredI.DELIVERY_DISPATCHED.getValue()}, getCieXyz.write())).booleanValue()) {
                        lambdaaddGlobalCallbackParameter21 lambdaaddglobalcallbackparameter21 = (lambdaaddGlobalCallbackParameter21) prerenderException.read;
                        List list = lambdaaddglobalcallbackparameter21.read();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            isValidReferrerDetails isvalidreferrerdetails = (isValidReferrerDetails) obj2;
                            isvalidreferrerdetails.getClass();
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                            if (Instant.now(lambdaaddglobalcallbackparameter21.serializer).toEpochMilli() - isvalidreferrerdetails.acknowledgedTimestamp < 3600000) {
                                arrayList.add(obj2);
                            }
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
                        }
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                isValidReferrerDetails isvalidreferrerdetails2 = (isValidReferrerDetails) next;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{isvalidreferrerdetails2.category, str12}, getCieXyz.write())).booleanValue()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{isvalidreferrerdetails2.deliveryId, checkforinstallreferrerinfo8.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                                    }
                                }
                            } else {
                                next = null;
                            }
                        }
                        isValidReferrerDetails isvalidreferrerdetails3 = (isValidReferrerDetails) next;
                        int i2 = ViewPager2SavedState.write[checkadjustadrevenueRemoteActionCompatParcelizer.serializer.ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            setcurrentiteminternal = (isvalidreferrerdetails3 != null ? isvalidreferrerdetails3.sourceTrigger : null) == deleteEventMetadata.Local ? setCurrentItemInternal.DuplicatePushForNewDelivery : setCurrentItemInternal.ShowPushNotification;
                        } else if (i2 == 3) {
                            setcurrentiteminternal = isvalidreferrerdetails3 != null ? setCurrentItemInternal.IgnorePushNotification : setCurrentItemInternal.ShowPushNotification;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        i = getUnknown4ZHQPSE.serializer[setcurrentiteminternal.ordinal()];
                        if (i != 1) {
                            handlePushMessageUseCase.read(checkadjustadrevenueRemoteActionCompatParcelizer, courierApplication, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        } else if (i != 2) {
                            if (i != 3) {
                                SignInDataStore signInDataStore = handlePushMessageUseCase.PlaybackStateCompat;
                                signInDataStore.getClass();
                                deleteGlobalCallbackParameters deleteglobalcallbackparameters = checkadjustadrevenueRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                                String str13 = (String) ((isAdapterPositionOnScreen) signInDataStore.read).MediaSessionCompatResultReceiverWrapper();
                                String str14 = (String) ((isAdapterPositionOnScreen) signInDataStore.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
                                int i3 = deleteglobalcallbackparameters.write;
                                createDeeplinkIntentI createdeeplinkintenti = deleteglobalcallbackparameters.RemoteActionCompatParcelizer;
                                createdeeplinkintenti.getClass();
                                checkadjustadrevenueRemoteActionCompatParcelizer = checkAdjustAdRevenue.RemoteActionCompatParcelizer(checkadjustadrevenueRemoteActionCompatParcelizer, new deleteGlobalCallbackParameters(i3, str13, str14, createdeeplinkintenti));
                                handlePushMessageUseCase.read(checkadjustadrevenueRemoteActionCompatParcelizer, courierApplication, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            }
                        }
                        awaitFirstLayoutModifier = checkadjustadrevenueRemoteActionCompatParcelizer.IconCompatParcelizer;
                        AndroidAssetFont androidAssetFont = handlePushMessageUseCase.IconCompatParcelizer;
                        Object objWrite = androidAssetFont.read.write();
                        objWrite.getClass();
                        TextDecorationSpan textDecorationSpan = (TextDecorationSpan) ((TraceTimeMeasurementWithPerformanceKit) androidAssetFont.serializer).read("silent_mode_tracking_get_notification_ringer_mode_info", new ViewUtils$$ExternalSyntheticLambda1(androidAssetFont, ((AudioManager) objWrite).getRingerMode(), 6));
                        handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki = handlePushMessageUseCase.MediaBrowserCompatMediaItem;
                        boolean zBooleanValue = ((Boolean) CourierApplication.read(InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), -1696115683, new Object[]{courierApplication}, InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), 1696115685)).booleanValue();
                        boolean zWrite = disableThirdPartySharingForCoppaEnabledI.write(awaitFirstLayoutModifier);
                        str = checkadjustadrevenueRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.serializer;
                        if (str == null) {
                            str = "null_msg";
                        }
                        checkEventI checkeventi = checkadjustadrevenueRemoteActionCompatParcelizer.read;
                        String str15 = checkeventi.RemoteActionCompatParcelizer;
                        String value2 = checkeventi.serializer.getValue();
                        Object systemService = courierApplication.getSystemService("activity");
                        systemService.getClass();
                        String strValueOf = String.valueOf(((ActivityManager) systemService).isBackgroundRestricted());
                        boolean zIsKeyguardLocked = handlePushMessageUseCase.MediaSessionCompatQueueItem.IconCompatParcelizer.isKeyguardLocked();
                        getSkewX getskewx = textDecorationSpan.write;
                        boolean z3 = textDecorationSpan.RemoteActionCompatParcelizer;
                        if (((NotificationManager) handlePushMessageUseCase.MediaMetadataCompat.IconCompatParcelizer.write()).getCurrentInterruptionFilter() != 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        isUnderlineText isunderlinetext = handlePushMessageUseCase.read;
                        checkAdjustAdRevenue checkadjustadrevenue = checkadjustadrevenueRemoteActionCompatParcelizer;
                        int iWrite = MathKt.write(((Number) ((TraceTimeMeasurementWithPerformanceKit) isunderlinetext.serializer).read("silent_mode_tracking_get_notification_volume", new BrazeUser$$ExternalSyntheticLambda28(26, isunderlinetext))).floatValue() * 100.0f);
                        z2 = awaitFirstLayoutModifier instanceof checkForInstallReferrerInfo;
                        if (z2) {
                            checkforinstallreferrerinfo = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                        } else {
                            checkforinstallreferrerinfo = null;
                        }
                        if (checkforinstallreferrerinfo != null || (pushAnalyticsData3 = checkforinstallreferrerinfo.write) == null || (str2 = pushAnalyticsData3.IconCompatParcelizer) == null) {
                            str2 = "";
                        }
                        if (z2) {
                            checkforinstallreferrerinfo2 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                        } else {
                            checkforinstallreferrerinfo2 = null;
                        }
                        if (checkforinstallreferrerinfo2 != null || (pushAnalyticsData2 = checkforinstallreferrerinfo2.write) == null || (str3 = pushAnalyticsData2.RemoteActionCompatParcelizer) == null) {
                            str3 = "";
                        }
                        if (z2) {
                            checkforinstallreferrerinfo3 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                        } else {
                            checkforinstallreferrerinfo3 = null;
                        }
                        if (checkforinstallreferrerinfo3 != null || (pushAnalyticsData = checkforinstallreferrerinfo3.write) == null || (str4 = pushAnalyticsData.read) == null) {
                            str4 = "";
                        }
                        handlethirdpartysharingcallbacki.getClass();
                        str15.getClass();
                        value2.getClass();
                        strValueOf.getClass();
                        getskewx.getClass();
                        if (z2) {
                            checkforinstallreferrerinfo4 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                        } else {
                            checkforinstallreferrerinfo4 = null;
                        }
                        if (checkforinstallreferrerinfo4 != null) {
                            str5 = checkforinstallreferrerinfo4.IconCompatParcelizer;
                        } else {
                            str5 = null;
                        }
                        String str16 = str2;
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(CommonCode.MapKey.TRANSACTION_ID, str5);
                        if (z2) {
                            checkforinstallreferrerinfo5 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                        } else {
                            checkforinstallreferrerinfo5 = null;
                        }
                        if (checkforinstallreferrerinfo5 != null) {
                            str6 = checkforinstallreferrerinfo5.MediaSessionCompatQueueItem;
                        } else {
                            str6 = null;
                        }
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("push_message_id", str6);
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("is_app_in_foreground", Boolean.valueOf(zBooleanValue));
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = new onViewAttachedToWindowlambda0("is_sync_push", Boolean.valueOf(zWrite));
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda4 = new onViewAttachedToWindowlambda0("notification_message", handleAttributionCallbackI.serializer(str));
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda5 = new onViewAttachedToWindowlambda0("channel_name", str15);
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda6 = new onViewAttachedToWindowlambda0("channel_priority", value2);
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda7 = new onViewAttachedToWindowlambda0("background_restricted", strValueOf);
                        if (z2) {
                            checkforinstallreferrerinfo6 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                        } else {
                            checkforinstallreferrerinfo6 = null;
                        }
                        if (checkforinstallreferrerinfo6 != null) {
                            str7 = checkforinstallreferrerinfo6.serializer;
                        } else {
                            str7 = null;
                        }
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda8 = new onViewAttachedToWindowlambda0("push_category", str7);
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda9 = new onViewAttachedToWindowlambda0("is_device_locked", Boolean.valueOf(zIsKeyguardLocked));
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda10 = new onViewAttachedToWindowlambda0("ringerMode", getskewx.getTitle());
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda11 = new onViewAttachedToWindowlambda0("isVibrationEnabled", Boolean.valueOf(z3));
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda12 = new onViewAttachedToWindowlambda0("isDndEnabled", Boolean.valueOf(z));
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda13 = new onViewAttachedToWindowlambda0("notificationVolumeLevel", Integer.valueOf(iWrite));
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda14 = new onViewAttachedToWindowlambda0("template_id", str16);
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda15 = new onViewAttachedToWindowlambda0("notification_id", str3);
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda16 = new onViewAttachedToWindowlambda0("campaign_id", str4);
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda17 = new onViewAttachedToWindowlambda0("rider_id", ((getLiveRegiondelegate) handlethirdpartysharingcallbacki.serializer).serializer());
                        String lowerCase = checkadjustadrevenue.serializer.name().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, onviewattachedtowindowlambda3, onviewattachedtowindowlambda4, onviewattachedtowindowlambda5, onviewattachedtowindowlambda6, onviewattachedtowindowlambda7, onviewattachedtowindowlambda8, onviewattachedtowindowlambda9, onviewattachedtowindowlambda10, onviewattachedtowindowlambda11, onviewattachedtowindowlambda12, onviewattachedtowindowlambda13, onviewattachedtowindowlambda14, onviewattachedtowindowlambda15, onviewattachedtowindowlambda16, onviewattachedtowindowlambda17, new onViewAttachedToWindowlambda0("sourceTrigger", lowerCase));
                        linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(mapRemoteActionCompatParcelizer.size()));
                        for (Map.Entry entry : mapRemoteActionCompatParcelizer.entrySet()) {
                            Object key = entry.getKey();
                            value = entry.getValue();
                            if (value != null) {
                                string = value.toString();
                            } else {
                                string = null;
                            }
                            if (string == null) {
                                string = "";
                            }
                            linkedHashMap.put(key, string);
                        }
                        handlethirdpartysharingcallbacki.IconCompatParcelizer.logEvent("push_received", linkedHashMap);
                        return createFromParcel.INSTANCE;
                    }
                    setcurrentiteminternal = setCurrentItemInternal.ShowPushNotification;
                    return null;
                }
                setcurrentiteminternal = setCurrentItemInternal.ShowPushNotification;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                i = getUnknown4ZHQPSE.serializer[setcurrentiteminternal.ordinal()];
                if (i != 1) {
                    handlePushMessageUseCase.read(checkadjustadrevenueRemoteActionCompatParcelizer, courierApplication, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                } else if (i != 2) {
                    if (i != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    SignInDataStore signInDataStore2 = handlePushMessageUseCase.PlaybackStateCompat;
                    signInDataStore2.getClass();
                    deleteGlobalCallbackParameters deleteglobalcallbackparameters2 = checkadjustadrevenueRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                    String str17 = (String) ((isAdapterPositionOnScreen) signInDataStore2.read).MediaSessionCompatResultReceiverWrapper();
                    String str18 = (String) ((isAdapterPositionOnScreen) signInDataStore2.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
                    int i4 = deleteglobalcallbackparameters2.write;
                    createDeeplinkIntentI createdeeplinkintenti2 = deleteglobalcallbackparameters2.RemoteActionCompatParcelizer;
                    createdeeplinkintenti2.getClass();
                    checkadjustadrevenueRemoteActionCompatParcelizer = checkAdjustAdRevenue.RemoteActionCompatParcelizer(checkadjustadrevenueRemoteActionCompatParcelizer, new deleteGlobalCallbackParameters(i4, str17, str18, createdeeplinkintenti2));
                    handlePushMessageUseCase.read(checkadjustadrevenueRemoteActionCompatParcelizer, courierApplication, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                }
                awaitFirstLayoutModifier = checkadjustadrevenueRemoteActionCompatParcelizer.IconCompatParcelizer;
                AndroidAssetFont androidAssetFont2 = handlePushMessageUseCase.IconCompatParcelizer;
                Object objWrite2 = androidAssetFont2.read.write();
                objWrite2.getClass();
                TextDecorationSpan textDecorationSpan2 = (TextDecorationSpan) ((TraceTimeMeasurementWithPerformanceKit) androidAssetFont2.serializer).read("silent_mode_tracking_get_notification_ringer_mode_info", new ViewUtils$$ExternalSyntheticLambda1(androidAssetFont2, ((AudioManager) objWrite2).getRingerMode(), 6));
                handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki2 = handlePushMessageUseCase.MediaBrowserCompatMediaItem;
                boolean zBooleanValue2 = ((Boolean) CourierApplication.read(InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), -1696115683, new Object[]{courierApplication}, InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), 1696115685)).booleanValue();
                boolean zWrite2 = disableThirdPartySharingForCoppaEnabledI.write(awaitFirstLayoutModifier);
                str = checkadjustadrevenueRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.serializer;
                if (str == null) {
                    str = "null_msg";
                }
                checkEventI checkeventi2 = checkadjustadrevenueRemoteActionCompatParcelizer.read;
                String str19 = checkeventi2.RemoteActionCompatParcelizer;
                String value3 = checkeventi2.serializer.getValue();
                Object systemService2 = courierApplication.getSystemService("activity");
                systemService2.getClass();
                String strValueOf2 = String.valueOf(((ActivityManager) systemService2).isBackgroundRestricted());
                boolean zIsKeyguardLocked2 = handlePushMessageUseCase.MediaSessionCompatQueueItem.IconCompatParcelizer.isKeyguardLocked();
                getSkewX getskewx2 = textDecorationSpan2.write;
                boolean z4 = textDecorationSpan2.RemoteActionCompatParcelizer;
                if (((NotificationManager) handlePushMessageUseCase.MediaMetadataCompat.IconCompatParcelizer.write()).getCurrentInterruptionFilter() != 1) {
                    z = true;
                } else {
                    z = false;
                }
                isUnderlineText isunderlinetext2 = handlePushMessageUseCase.read;
                checkAdjustAdRevenue checkadjustadrevenue2 = checkadjustadrevenueRemoteActionCompatParcelizer;
                int iWrite2 = MathKt.write(((Number) ((TraceTimeMeasurementWithPerformanceKit) isunderlinetext2.serializer).read("silent_mode_tracking_get_notification_volume", new BrazeUser$$ExternalSyntheticLambda28(26, isunderlinetext2))).floatValue() * 100.0f);
                z2 = awaitFirstLayoutModifier instanceof checkForInstallReferrerInfo;
                if (z2) {
                    checkforinstallreferrerinfo = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo = null;
                }
                if (checkforinstallreferrerinfo != null) {
                    str2 = "";
                } else {
                    str2 = "";
                }
                if (z2) {
                    checkforinstallreferrerinfo2 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo2 = null;
                }
                if (checkforinstallreferrerinfo2 != null) {
                    str3 = "";
                } else {
                    str3 = "";
                }
                if (z2) {
                    checkforinstallreferrerinfo3 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo3 = null;
                }
                if (checkforinstallreferrerinfo3 != null) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                handlethirdpartysharingcallbacki2.getClass();
                str19.getClass();
                value3.getClass();
                strValueOf2.getClass();
                getskewx2.getClass();
                if (z2) {
                    checkforinstallreferrerinfo4 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo4 = null;
                }
                if (checkforinstallreferrerinfo4 != null) {
                    str5 = checkforinstallreferrerinfo4.IconCompatParcelizer;
                } else {
                    str5 = null;
                }
                String str110 = str2;
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda18 = new onViewAttachedToWindowlambda0(CommonCode.MapKey.TRANSACTION_ID, str5);
                if (z2) {
                    checkforinstallreferrerinfo5 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo5 = null;
                }
                if (checkforinstallreferrerinfo5 != null) {
                    str6 = checkforinstallreferrerinfo5.MediaSessionCompatQueueItem;
                } else {
                    str6 = null;
                }
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda19 = new onViewAttachedToWindowlambda0("push_message_id", str6);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda20 = new onViewAttachedToWindowlambda0("is_app_in_foreground", Boolean.valueOf(zBooleanValue2));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda21 = new onViewAttachedToWindowlambda0("is_sync_push", Boolean.valueOf(zWrite2));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda22 = new onViewAttachedToWindowlambda0("notification_message", handleAttributionCallbackI.serializer(str));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda23 = new onViewAttachedToWindowlambda0("channel_name", str19);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda24 = new onViewAttachedToWindowlambda0("channel_priority", value3);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda25 = new onViewAttachedToWindowlambda0("background_restricted", strValueOf2);
                if (z2) {
                    checkforinstallreferrerinfo6 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo6 = null;
                }
                if (checkforinstallreferrerinfo6 != null) {
                    str7 = checkforinstallreferrerinfo6.serializer;
                } else {
                    str7 = null;
                }
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda26 = new onViewAttachedToWindowlambda0("push_category", str7);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda27 = new onViewAttachedToWindowlambda0("is_device_locked", Boolean.valueOf(zIsKeyguardLocked2));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda110 = new onViewAttachedToWindowlambda0("ringerMode", getskewx2.getTitle());
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda111 = new onViewAttachedToWindowlambda0("isVibrationEnabled", Boolean.valueOf(z4));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda112 = new onViewAttachedToWindowlambda0("isDndEnabled", Boolean.valueOf(z));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda113 = new onViewAttachedToWindowlambda0("notificationVolumeLevel", Integer.valueOf(iWrite2));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda114 = new onViewAttachedToWindowlambda0("template_id", str110);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda115 = new onViewAttachedToWindowlambda0("notification_id", str3);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda116 = new onViewAttachedToWindowlambda0("campaign_id", str4);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda117 = new onViewAttachedToWindowlambda0("rider_id", ((getLiveRegiondelegate) handlethirdpartysharingcallbacki2.serializer).serializer());
                String lowerCase2 = checkadjustadrevenue2.serializer.name().toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                Map mapRemoteActionCompatParcelizer2 = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda18, onviewattachedtowindowlambda19, onviewattachedtowindowlambda20, onviewattachedtowindowlambda21, onviewattachedtowindowlambda22, onviewattachedtowindowlambda23, onviewattachedtowindowlambda24, onviewattachedtowindowlambda25, onviewattachedtowindowlambda26, onviewattachedtowindowlambda27, onviewattachedtowindowlambda110, onviewattachedtowindowlambda111, onviewattachedtowindowlambda112, onviewattachedtowindowlambda113, onviewattachedtowindowlambda114, onviewattachedtowindowlambda115, onviewattachedtowindowlambda116, onviewattachedtowindowlambda117, new onViewAttachedToWindowlambda0("sourceTrigger", lowerCase2));
                linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(mapRemoteActionCompatParcelizer2.size()));
                while (r0.hasNext()) {
                    Object key2 = entry.getKey();
                    value = entry.getValue();
                    if (value != null) {
                        string = value.toString();
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = "";
                    }
                    linkedHashMap.put(key2, string);
                }
                handlethirdpartysharingcallbacki2.IconCompatParcelizer.logEvent("push_received", linkedHashMap);
                return createFromParcel.INSTANCE;
            case 6:
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) this.f$0;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) this.f$1;
                onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) this.f$2;
                populate populateVar = (populate) this.f$3;
                updateTextLayoutResult updatetextlayoutresult2 = (updateTextLayoutResult) populateViewStructure_androidKtpopulate7.getValue();
                boolean z5 = (updatetextlayoutresult2 == null || (getlogodescription = updatetextlayoutresult2.IconCompatParcelizer) == null) ? false : !(getlogodescription == getLogoDescription.serializer);
                for (Object obj3 : (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate8.getValue()) {
                    if (((updateTextLayoutResult) obj3).read.equals((String) onviewattachedtowindow.getValue())) {
                        obj = obj3;
                        updatetextlayoutresult = (updateTextLayoutResult) obj;
                        fSerializer = ((getContentCaptureSessionui) populateVar).serializer();
                        if (z5) {
                            if (updatetextlayoutresult != null) {
                                return updatetextlayoutresult.read;
                            }
                            return "0.5x";
                        }
                        if (updatetextlayoutresult == null) {
                            return moveTodefault.IconCompatParcelizer(fSerializer);
                        }
                        return Math.abs(fSerializer - updatetextlayoutresult.serializer) < 0.1f ? updatetextlayoutresult.read : moveTodefault.IconCompatParcelizer(fSerializer);
                    }
                }
                updatetextlayoutresult = (updateTextLayoutResult) obj;
                fSerializer = ((getContentCaptureSessionui) populateVar).serializer();
                if (z5) {
                    if (updatetextlayoutresult != null) {
                        return updatetextlayoutresult.read;
                    }
                    return "0.5x";
                }
                if (updatetextlayoutresult == null) {
                    return moveTodefault.IconCompatParcelizer(fSerializer);
                }
                if (Math.abs(fSerializer - updatetextlayoutresult.serializer) < 0.1f) {
                }
            case 7:
                return LoginActivityViewModel.write((getStateDescription) this.f$0, (LogSqliteDriver) this.f$2, (LoginActivityViewModel) this.f$3, (String) this.f$1);
            default:
                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) this.f$0, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1((SheetState) this.f$1, null, 20), 3).IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new getImageLoader((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.f$2, (PopulateViewStructure_androidKtpopulate7) this.f$3, 0));
                return createFromParcel.INSTANCE;
        }
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda9(String str, Braze braze, String str2, String str3) {
        this.$r8$classId = 4;
        this.f$1 = str;
        this.f$0 = braze;
        this.f$2 = str2;
        this.f$3 = str3;
    }
}
