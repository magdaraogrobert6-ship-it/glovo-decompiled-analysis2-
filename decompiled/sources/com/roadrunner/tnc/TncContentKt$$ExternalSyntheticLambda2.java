package com.roadrunner.tnc;

import android.content.Intent;
import android.webkit.WebView;
import androidx.activity.result.ActivityResult;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuverView;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.opportunities.calendar.BonusCalendarFragment;
import com.roadrunner.opportunities.calendar.BonusCalendarViewModel;
import com.roadrunner.overlay.bubble.banner.OverlayVisibilityBannerUiModel;
import com.roadrunner.overlay.bubble.banner.presentation.OverlayVisibilityBannerUiModelImpl;
import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionDialogFragment;
import com.roadrunner.permission.presentation.NonFloatablePermissionActivity;
import com.roadrunner.permission.presentation.PermissionActivity;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionFragment;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import com.roadrunner.vendor.review.presentation.VendorReviewFragment;
import com.roadrunner.web.presentation.WebViewFragment;
import com.roadrunner.web.presentation.authWebView.AuthBaseWebFragment;
import com.roadrunner.web.presentation.authWebView.AuthWebViewModel;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.N$b;
import com.sentiance.sdk.drivinginsights.api.DrivingInsights;
import com.sentiance.sdk.drivinginsights.api.DrivingInsightsApi;
import com.sentiance.sdk.drivinginsights.api.DrivingInsightsReadyListener;
import com.sentiance.sdk.drivinginsights.api.PhoneUsageEvent;
import com.sentiance.sdk.drivinginsights.api.PhoneUsageEventListener;
import com.ui.common.widget.calendar.CalendarView;
import com.ui.common.widget.calendar.DefaultCalendarManager;
import com.ui.common.widget.message_dialog.MessageDialogFragment;
import io.grpc.internal.SharedResourcePool;
import io.reactivex.CompletableEmitter;
import io.sentry.util.network.NetworkBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.ReversedListReadOnly;
import kotlin.text.RegexKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AdjustAdRevenue;
import o.AndroidGraphicsContext2;
import o.AsyncImagePainter;
import o.BrazeExternalSyntheticLambda11;
import o.BrazeExternalSyntheticLambda205;
import o.BrazeExternalSyntheticLambda54;
import o.BrazeExternalSyntheticLambda64;
import o.BrazeExternalSyntheticLambda71;
import o.BrazeLogger;
import o.C0169getOrderId;
import o.CrossfadePainter;
import o.HttpException;
import o.IndirectPointerInputDragCycleDetector;
import o.LineHeightStyleAlignmentCompanion;
import o.PreferenceGroupAdapter;
import o.RealImageLoaderexecute2job1;
import o.ReferrerDetails;
import o.ScrollingLogicdoFlingAnimation2reverseScope1;
import o.TapGestureDetectorKt;
import o.TypefaceResultImmutable;
import o.accessexecute;
import o.accessinstallForLifecycle;
import o.applyLayoutFeatures;
import o.createFromParcel;
import o.fetch;
import o.getActivityHandler;
import o.getBitmapui_graphics;
import o.getCieXyz;
import o.getConfigurationProviderSafeandroid_sdk_base_release;
import o.getContentCaptureSessionui;
import o.getDoubleOrNull;
import o.getExternalIEventMessengerandroid_sdk_base_release;
import o.getFailureMessage;
import o.getGdprUrl;
import o.getIsCurrentlyDisplayingInAppMessage;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getPersonNamePrefix;
import o.getQueryContext;
import o.getRegisteredPushToken;
import o.getSafeDrawing;
import o.getSceneString;
import o.getStyleTiuSbCo;
import o.handleInAppMessageTestPushandroid_sdk_base_release;
import o.installForLifecycle;
import o.isAdjustUninstallDetectionPayload;
import o.isValidSource;
import o.logBannerImpression;
import o.logEcommerceEvent;
import o.markAsRead;
import o.mergeJsonObjects;
import o.networkTimeClock_delegatelambda0;
import o.onContentCardDismissed;
import o.onKeyEventZmokQxo;
import o.onShowTranslationui;
import o.onViewAdded;
import o.populate;
import o.positionChangeInternalwfG_k4k;
import o.r8lambda4ctur6dHthQRF8ridJfgtUMxjY0;
import o.r8lambdaFzT8gcPxuxF8hQEg_gDeZCl890;
import o.r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I;
import o.r8lambdaP1frYJQmg54QrMLKfwUvXZE4A5U;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4;
import o.readContentProvider;
import o.reenqueueInAppMessagelambda1;
import o.refreshFeatureFlagslambda0;
import o.refreshFeatureFlagslambda10;
import o.removeGlobalCallbackParametersI;
import o.removeNodeAtDepth;
import o.report;
import o.requiredWidthInVpY3zN4default;
import o.s7;
import o.setTransactionSuccessful;
import o.subscribeToNewInAppMessageslambda1;
import o.td;
import o.trackThirdPartySharing;
import o.updateLayerElements;
import o.wdefault;
import o.z7ExternalSyntheticLambda6;
import org.joda.time.LocalDate;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TncContentKt$$ExternalSyntheticLambda2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ TncContentKt$$ExternalSyntheticLambda2(int i, Object obj) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[LOOP:2: B:69:0x0243->B:169:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0232  */
    /* JADX WARN: Code duplicated, block: B:71:0x0249  */
    /* JADX WARN: Code duplicated, block: B:76:0x0259  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Intent intent;
        String str;
        Object next;
        markAsRead markasread;
        ArrayList arrayList;
        readContentProvider readcontentprovider;
        Object obj2;
        r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I r8lambdagclptcgavtocpxgi4oq7oslwz3i;
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.IconCompatParcelizer;
        int i3 = 0;
        Object obj4 = null;
        switch (i2) {
            case 0:
                ((getPersonNamePrefix) obj).getClass();
                reenqueueInAppMessagelambda1 reenqueueinappmessagelambda1 = new reenqueueInAppMessagelambda1((refreshFeatureFlagslambda0) obj3);
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.IconCompatParcelizer;
                processLifecycleOwner.RatingCompat.IconCompatParcelizer(reenqueueinappmessagelambda1);
                return new refreshFeatureFlagslambda10(processLifecycleOwner, i3, reenqueueinappmessagelambda1);
            case 1:
                MapboxManeuverView mapboxManeuverView = (MapboxManeuverView) obj;
                mapboxManeuverView.getClass();
                Object obj5 = ((LineHeightStyleAlignmentCompanion) obj3).read;
                Expected expected = obj5 instanceof Expected ? (Expected) obj5 : null;
                if (expected != null) {
                    expected.onValue(new MapboxNavigation$$ExternalSyntheticLambda4(15, mapboxManeuverView));
                }
                return createfromparcel;
            case 2:
                getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) obj;
                getbitmapui_graphics.getClass();
                td tdVar = ((BonusCalendarFragment) obj3).getSavedStateRegistry;
                if (tdVar != null) {
                    N$b n$b = tdVar.read;
                    return new BonusCalendarViewModel((DropShadowEffect) ((r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4) n$b.read).write(), (NetworkErrorMapperImpl) ((mergeJsonObjects) n$b.write).write(), (s7) ((mergeJsonObjects) n$b.IconCompatParcelizer).write(), new getQueryContext(), getbitmapui_graphics, (setTransactionSuccessful) ((mergeJsonObjects) n$b.serializer).write());
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 3:
                CalendarView calendarView = (CalendarView) obj;
                calendarView.getClass();
                calendarView.setCalendarBehaviour((wdefault) obj3);
                return createfromparcel;
            case 4:
                installForLifecycle installforlifecycle = (installForLifecycle) obj3;
                ((List) obj).getClass();
                updateLayerElements updatelayerelements = ((z7ExternalSyntheticLambda6) installforlifecycle.read).read;
                Object obj6 = installforlifecycle.RemoteActionCompatParcelizer;
                if (obj6 == accessinstallForLifecycle.RemoteActionCompatParcelizer) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Item has not been set yet. That is an internal issue. Please report at https://github.com/sockeqwe/AdapterDelegates");
                    return null;
                }
                int i4 = write + 85;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    updatelayerelements.read((report) obj6);
                    return createfromparcel;
                }
                updatelayerelements.read((report) obj6);
                throw null;
            case 5:
                RealImageLoaderexecute2job1 realImageLoaderexecute2job1 = (RealImageLoaderexecute2job1) obj3;
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) obj;
                asyncImagePainter.getClass();
                realImageLoaderexecute2job1.MediaBrowserCompatMediaItem.read.logEvent("copy_history_code", null);
                realImageLoaderexecute2job1.write.serializer(asyncImagePainter);
                return createfromparcel;
            case 6:
                ((getStyleTiuSbCo) obj).getClass();
                ((OverlayVisibilityBannerUiModelImpl) ((OverlayVisibilityBannerUiModel) obj3)).RatingCompat.write(createfromparcel);
                return new TypefaceResultImmutable(4);
            case 7:
                getBitmapui_graphics getbitmapui_graphics2 = (getBitmapui_graphics) obj;
                getbitmapui_graphics2.getClass();
                fetch fetchVar = ((OverlayPermissionDialogFragment) obj3).getSavedStateRegistry;
                if (fetchVar != null) {
                    C$b c$b = fetchVar.serializer;
                    return new accessexecute((NetworkBody) ((PreferenceGroupAdapter) c$b.serializer).write(), getbitmapui_graphics2, (HttpException) ((getDoubleOrNull) c$b.write).write, new getQueryContext(), (CrossfadePainter) ((mergeJsonObjects) c$b.IconCompatParcelizer).write());
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 8:
                return NonFloatablePermissionActivity.RemoteActionCompatParcelizer((NonFloatablePermissionActivity) obj3, (getBitmapui_graphics) obj);
            case 9:
                return PermissionActivity.IconCompatParcelizer((PermissionActivity) obj3, (getBitmapui_graphics) obj);
            case 10:
                FirebaseRemoteConfigProvider firebaseRemoteConfigProvider = (FirebaseRemoteConfigProvider) obj3;
                firebaseRemoteConfigProvider.RemoteActionCompatParcelizer(false);
                firebaseRemoteConfigProvider.IconCompatParcelizer.incrementAndGet();
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Realtime activation is successful", new Object[0]);
                return createfromparcel;
            case 11:
                removeGlobalCallbackParametersI removeglobalcallbackparametersi = (removeGlobalCallbackParametersI) obj3;
                String str2 = (String) obj;
                str2.getClass();
                removeglobalcallbackparametersi.MediaBrowserCompatMediaItem.read(str2);
                removeglobalcallbackparametersi.MediaBrowserCompatMediaItem.read();
                return createfromparcel;
            case 12:
                OtpVerificationViewModel otpVerificationViewModel = (OtpVerificationViewModel) obj3;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.write == -1 && (intent = activityResult.RemoteActionCompatParcelizer) != null) {
                    String stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                    if (stringExtra == null) {
                        otpVerificationViewModel.getClass();
                    } else {
                        ((trackThirdPartySharing) otpVerificationViewModel.IconCompatParcelizer.read()).getClass();
                        Pattern patternCompile = Pattern.compile("\\b(\\d{4})\\b");
                        patternCompile.getClass();
                        Matcher matcher = patternCompile.matcher(stringExtra);
                        matcher.getClass();
                        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageWrite = RegexKt.write(matcher, 0, stringExtra);
                        if (getiscurrentlydisplayinginappmessageWrite == null || (str = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessageWrite.IconCompatParcelizer()).get(1)) == null) {
                            str = "";
                        }
                        if (str.length() > 0) {
                            int i5 = read + 29;
                            write = i5 % Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OTP is received and parsed", new Object[0]);
                            otpVerificationViewModel.RemoteActionCompatParcelizer = true;
                            otpVerificationViewModel.RemoteActionCompatParcelizer(removeNodeAtDepth.IconCompatParcelizer(str));
                        }
                    }
                }
                return createfromparcel;
            case 13:
                getBitmapui_graphics getbitmapui_graphics3 = (getBitmapui_graphics) obj;
                getbitmapui_graphics3.getClass();
                isValidSource isvalidsource = ((RiderSafetyPermissionFragment) obj3).getSavedStateRegistry;
                if (isvalidsource != null) {
                    E$b e$b = isvalidsource.write;
                    return new AdjustAdRevenue((C$b) ((applyLayoutFeatures) e$b.read).write(), (N$b) ((getFailureMessage) e$b.RemoteActionCompatParcelizer).write(), (RiderSafetyLifecycleManager) ((mergeJsonObjects) e$b.IconCompatParcelizer).write(), (PermissionHistoryRepository) ((mergeJsonObjects) e$b.MediaDescriptionCompat).write(), (DropShadowEffect) ((r8lambda4ctur6dHthQRF8ridJfgtUMxjY0) e$b.MediaBrowserCompatMediaItem).write(), getbitmapui_graphics3, (isAdjustUninstallDetectionPayload) ((getDoubleOrNull) e$b.write).write, new SharedResourcePool(24), (r8lambdaP1frYJQmg54QrMLKfwUvXZE4A5U) ((mergeJsonObjects) e$b.MediaMetadataCompat).write());
                }
                removeNodeAtDepth.serializer("riderSafetyPermissionViewModelFactory");
                throw null;
            case 14:
                C0169getOrderId c0169getOrderId = (C0169getOrderId) obj3;
                getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) obj;
                getoptimizationlevel.getClass();
                if (getoptimizationlevel instanceof onViewAdded) {
                    return createfromparcel;
                }
                int i7 = 5;
                if (getoptimizationlevel instanceof getSceneString) {
                    BrazeLogger brazeLogger = c0169getOrderId.MediaMetadataCompat;
                    brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(new TncContentKt$$ExternalSyntheticLambda1(c0169getOrderId, i7, getoptimizationlevel).invoke(brazeLogger.write()));
                    return createfromparcel;
                }
                if (getoptimizationlevel instanceof getMaxWidth) {
                    c0169getOrderId.IconCompatParcelizer.serializer(new getActivityHandler(new getGdprUrl(c0169getOrderId.RemoteActionCompatParcelizer.read(((getMaxWidth) getoptimizationlevel).serializer))));
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                int i8 = write + 5;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 4;
                }
                return null;
            case 15:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((CompletableEmitter) obj3).RemoteActionCompatParcelizer(th);
                return createfromparcel;
            case 16:
                ReferrerDetails referrerDetails = (ReferrerDetails) obj3;
                String str3 = ((markAsRead) referrerDetails.RemoteActionCompatParcelizer.get(((Integer) obj).intValue())).serializer.read;
                str3.getClass();
                Iterator it = referrerDetails.RemoteActionCompatParcelizer.iterator();
                do {
                    if (it.hasNext()) {
                        int i10 = read + 117;
                        write = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        next = it.next();
                    } else {
                        next = null;
                    }
                    markasread = (markAsRead) next;
                    if (markasread != null) {
                        ((onShowTranslationui) referrerDetails.serializer).setValue(markasread.serializer.read);
                        arrayList = markasread.write;
                        for (Object obj7 : arrayList) {
                            if (((readContentProvider) obj7).read) {
                                obj4 = obj7;
                                readcontentprovider = (readContentProvider) obj4;
                                if (readcontentprovider == null) {
                                    readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                                }
                                ((onShowTranslationui) referrerDetails.write).setValue(readcontentprovider.IconCompatParcelizer.read);
                                int i12 = read + 21;
                                write = i12 % Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                            }
                        }
                        readcontentprovider = (readContentProvider) obj4;
                        if (readcontentprovider == null) {
                            readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                        }
                        ((onShowTranslationui) referrerDetails.write).setValue(readcontentprovider.IconCompatParcelizer.read);
                        int i14 = read + 21;
                        write = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                    }
                    return createfromparcel;
                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((markAsRead) next).serializer.read, str3}, getCieXyz.write())).booleanValue());
                markasread = (markAsRead) next;
                if (markasread != null) {
                    ((onShowTranslationui) referrerDetails.serializer).setValue(markasread.serializer.read);
                    arrayList = markasread.write;
                    while (r5.hasNext()) {
                        if (((readContentProvider) obj7).read) {
                            obj4 = obj7;
                            readcontentprovider = (readContentProvider) obj4;
                            if (readcontentprovider == null) {
                                readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                            }
                            ((onShowTranslationui) referrerDetails.write).setValue(readcontentprovider.IconCompatParcelizer.read);
                            int i16 = read + 21;
                            write = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                        }
                    }
                    readcontentprovider = (readContentProvider) obj4;
                    if (readcontentprovider == null) {
                        readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                    }
                    ((onShowTranslationui) referrerDetails.write).setValue(readcontentprovider.IconCompatParcelizer.read);
                    int i18 = read + 21;
                    write = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                }
                return createfromparcel;
            case 17:
                Alignment alignment = (Alignment) obj3;
                IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = (IndirectPointerInputDragCycleDetector) obj;
                indirectPointerInputDragCycleDetector.getClass();
                CharSequence charSequence = (CharSequence) ((positionChangeInternalwfG_k4k) indirectPointerInputDragCycleDetector).serializer();
                if (charSequence != null) {
                    if (charSequence.length() != 0) {
                        return AnimatedContentKt.RemoteActionCompatParcelizer(ScrollingLogicdoFlingAnimation2reverseScope1.IconCompatParcelizer, onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) null, alignment, 13).read(onKeyEventZmokQxo.write(null, 3)));
                    }
                    int i20 = write + 109;
                    read = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                }
                ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Write = onKeyEventZmokQxo.write(null, alignment, 13);
                TapGestureDetectorKt tapGestureDetectorKt = TapGestureDetectorKt.RemoteActionCompatParcelizer;
                return AnimatedContentKt.RemoteActionCompatParcelizer(scrollingLogicdoFlingAnimation2reverseScope1Write, TapGestureDetectorKt.IconCompatParcelizer);
            case 18:
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                contentDrawScope.getClass();
                contentDrawScope.drawContent();
                DrawScope.m1297drawRectAsUm42w$default(contentDrawScope, (Brush) obj3, 0L, 0L, 0.0f, null, null, BlendMode.Companion.m660getSrcIn0nO6VwU(), 62, null);
                return createfromparcel;
            case 19:
                ((getContentCaptureSessionui) ((populate) obj3)).IconCompatParcelizer(((Float) obj).floatValue());
                return createfromparcel;
            case 20:
                C$b c$b2 = (C$b) obj3;
                if (((getSafeDrawing) obj).RemoteActionCompatParcelizer == 2) {
                    MutableStateFlow mutableStateFlow = (MutableStateFlow) c$b2.write;
                    do {
                        obj2 = mutableStateFlow.read();
                        ((Boolean) obj2).getClass();
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, Boolean.TRUE));
                }
                return createfromparcel;
            case 21:
                ((OneClickStartWorkingViewModel) obj3).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer("start_working_requested", Boolean.FALSE);
                return createfromparcel;
            case 22:
                getBitmapui_graphics getbitmapui_graphics4 = (getBitmapui_graphics) obj;
                getbitmapui_graphics4.getClass();
                logBannerImpression logbannerimpression = ((VendorReviewFragment) obj3).getOnBackPressedDispatcher;
                if (logbannerimpression != null) {
                    logEcommerceEvent logecommerceevent = logbannerimpression.read;
                    return new handleInAppMessageTestPushandroid_sdk_base_release((getConfigurationProviderSafeandroid_sdk_base_release) logecommerceevent.serializer.write(), (getRegisteredPushToken) logecommerceevent.write.write(), (getExternalIEventMessengerandroid_sdk_base_release) logecommerceevent.IconCompatParcelizer.write(), getbitmapui_graphics4, (subscribeToNewInAppMessageslambda1) logecommerceevent.RemoteActionCompatParcelizer.write(), new getQueryContext());
                }
                removeNodeAtDepth.serializer("vendorReviewViewModelFactory");
                throw null;
            case 23:
                WebViewFragment webViewFragment = (WebViewFragment) obj3;
                BrazeExternalSyntheticLambda54 brazeExternalSyntheticLambda54 = (BrazeExternalSyntheticLambda54) obj;
                brazeExternalSyntheticLambda54.getClass();
                if (!(brazeExternalSyntheticLambda54 instanceof BrazeExternalSyntheticLambda71)) {
                    if (brazeExternalSyntheticLambda54 instanceof BrazeExternalSyntheticLambda64) {
                        webViewFragment.read(false, false);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                String str4 = ((BrazeExternalSyntheticLambda71) brazeExternalSyntheticLambda54).IconCompatParcelizer;
                r8lambdaFzT8gcPxuxF8hQEg_gDeZCl890 r8lambdafzt8gcpxuxf8hqeg_gdezcl890 = (r8lambdaFzT8gcPxuxF8hQEg_gDeZCl890) webViewFragment.onRetainNonConfigurationInstance.MediaSessionCompatResultReceiverWrapper();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str4, r8lambdafzt8gcpxuxf8hqeg_gdezcl890 != null ? r8lambdafzt8gcpxuxf8hqeg_gdezcl890.getKey() : null}, getCieXyz.write())).booleanValue() || (r8lambdagclptcgavtocpxgi4oq7oslwz3i = (r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I) webViewFragment.removeOnNewIntentListener.MediaSessionCompatResultReceiverWrapper()) == null) {
                    return createfromparcel;
                }
                r8lambdagclptcgavtocpxgi4oq7oslwz3i.write();
                return createfromparcel;
            case 24:
                LayoutTileBinding layoutTileBinding = ((AuthBaseWebFragment) obj3).getOnBackPressedDispatcher;
                layoutTileBinding.getClass();
                ((WebView) layoutTileBinding.write).clearHistory();
                return createfromparcel;
            case 25:
                AndroidGraphicsContext2 androidGraphicsContext2 = ((AuthWebViewModel) obj3).write;
                BrazeExternalSyntheticLambda11 brazeExternalSyntheticLambda11 = (BrazeExternalSyntheticLambda11) obj;
                brazeExternalSyntheticLambda11.getClass();
                androidGraphicsContext2.RemoteActionCompatParcelizer(new BrazeExternalSyntheticLambda205(brazeExternalSyntheticLambda11.read, brazeExternalSyntheticLambda11.write));
                return createfromparcel;
            case 26:
                return DrivingInsightsApi.lambda$setPhoneUsageEventListener$2((PhoneUsageEventListener) obj3, (PhoneUsageEvent) obj);
            case 27:
                return DrivingInsightsApi.lambda$setDrivingInsightsReadyListener$5((DrivingInsightsReadyListener) obj3, (DrivingInsights) obj);
            case 28:
                Long l = (Long) obj;
                l.getClass();
                ((DefaultCalendarManager) obj3).read(new LocalDate(l.longValue()));
                return createfromparcel;
            default:
                MessageDialogFragment messageDialogFragment = (MessageDialogFragment) obj3;
                networkTimeClock_delegatelambda0 networktimeclock_delegatelambda0 = (networkTimeClock_delegatelambda0) obj;
                networktimeclock_delegatelambda0.getClass();
                if (networktimeclock_delegatelambda0 == networkTimeClock_delegatelambda0.read) {
                    messageDialogFragment.read(false, false);
                }
                return createfromparcel;
        }
    }
}
