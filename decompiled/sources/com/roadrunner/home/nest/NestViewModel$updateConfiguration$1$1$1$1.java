package com.roadrunner.home.nest;

import android.net.Uri;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Parser;
import com.logistics.rider.glovo.R;
import com.mapbox.common.location.Location;
import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.navigation.base.road.model.RoadComponent;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.mapbox.navigation.ui.maps.camera.data.MapboxNavigationViewportDataSource;
import com.mapbox.navigation.ui.maps.internal.camera.OverviewViewportDataSource;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.map.integration.mapbox.speedlimit.SpeedLimitApi;
import com.roadrunner.settings.SettingsViewModel;
import com.sentiance.core.model.events.N$b;
import io.socket.parser.IOParser$Decoder;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.FlowLiveDataConversionsasFlow11;
import o.MultiDexV14ICSElementConstructor;
import o.MultiDexV14JBMR11ElementConstructor;
import o.ResponseData;
import o.ResponseData1;
import o.SdkClickHandler;
import o.SdkClickHandler1;
import o.SdkClickResponseData;
import o.SessionResponseData;
import o.ShortNewsContentCardView;
import o.buildResponseData;
import o.checkSdkClickResponse;
import o.createFromParcel;
import o.decode;
import o.g9;
import o.getAdvertisingInfoObject;
import o.getCieXyz;
import o.getDeeplinkClickTime;
import o.getInstallTracked;
import o.getQueryParameterslambda2;
import o.getReferrer;
import o.getSamsungCloudDevGoogleAdId;
import o.getSamsungReferrer;
import o.gg;
import o.hideCurrentlyDisplayingInAppMessage;
import o.ia;
import o.ie;
import o.installSecondaryDexes;
import o.instance_delegatelambda0;
import o.isAppRunningInSamsungCloudEnvironment;
import o.isPlayTrackingEnabled;
import o.k7ExternalSyntheticLambda3;
import o.lambdaremoveGlobalCallbackParameter24;
import o.lambdaremoveGlobalPartnerParameters31;
import o.lambdasendPreinstallReferrer19;
import o.lambdasetOfflineMode8;
import o.lambdatrackThirdPartySharing37;
import o.launchAttributionResponseTasksI;
import o.logErrorMessageI;
import o.mkdirChecked;
import o.onActivityResumed;
import o.onContentCardDismissed;
import o.r8lambda0tFkXN0c4UQsJxVxyejUo1BomY;
import o.r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaEdQQWzTg5FJP9FEnVxOS8uVofXM;
import o.r8lambdaG7Yn9XwVXlqoD6tsvgXmOtCmXLE;
import o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I;
import o.r8lambdaThqcw6xkAmlG0vjGUd0l1mjil1o;
import o.r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.readField;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.retrySendingI;
import o.saveLong;
import o.saveString;
import o.sendSdkClickI;
import o.setAttributionHandler;
import o.setConnectionOptions;
import o.setGraphicModalMaxWidthDp;
import o.setLastHorizontalStyle;
import o.setPackageHandler;
import o.setSdkPrefix;
import o.setStoreInfo;
import o.setTransactionSuccessful;
import o.subscribeToBannersUpdateslambda2;
import o.t3;
import o.unpackInt2;
import o.v9;
import o.xa;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class NestViewModel$updateConfiguration$1$1$1$1 implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1(Object obj, int i, Object obj2) {
        this.write = i;
        this.read = obj;
        this.serializer = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    private final Object emit$com$roadrunner$settings$SettingsViewModel$special$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        r8lambdaG7Yn9XwVXlqoD6tsvgXmOtCmXLE r8lambdag7yn9xwvxlqod6tsvgxmotcmxle;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof r8lambdaG7Yn9XwVXlqoD6tsvgXmOtCmXLE) {
            r8lambdag7yn9xwvxlqod6tsvgxmotcmxle = (r8lambdaG7Yn9XwVXlqoD6tsvgXmOtCmXLE) shortNewsContentCardView;
            int i2 = r8lambdag7yn9xwvxlqod6tsvgxmotcmxle.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r8lambdag7yn9xwvxlqod6tsvgxmotcmxle.write = i2 - Integer.MIN_VALUE;
            } else {
                r8lambdag7yn9xwvxlqod6tsvgxmotcmxle = new r8lambdaG7Yn9XwVXlqoD6tsvgXmOtCmXLE(this, shortNewsContentCardView);
            }
        } else {
            r8lambdag7yn9xwvxlqod6tsvgxmotcmxle = new r8lambdaG7Yn9XwVXlqoD6tsvgXmOtCmXLE(this, shortNewsContentCardView);
        }
        Object obj2 = r8lambdag7yn9xwvxlqod6tsvgxmotcmxle.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = r8lambdag7yn9xwvxlqod6tsvgxmotcmxle.write;
        Object obj3 = null;
        if (i3 != 0) {
            int i4 = IconCompatParcelizer + 35;
            int i5 = i4 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i5;
            int i6 = i4 % 2;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = i5 + 69;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                int i8 = 2 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.read;
            Boolean bool = (Boolean) obj;
            if (!((SettingsViewModel) this.serializer).read.RemoteActionCompatParcelizer()) {
                bool = Boolean.FALSE;
            }
            r8lambdag7yn9xwvxlqod6tsvgxmotcmxle.write = 1;
            if (flowCollector.emit(bool, r8lambdag7yn9xwvxlqod6tsvgxmotcmxle) == coroutineSingletons) {
                int i9 = IconCompatParcelizer + 111;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    return coroutineSingletons;
                }
                obj3.hashCode();
                throw null;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    private final Object emit$com$roadrunner$settings$subscreens$chatLanguageSelector$ChatLanguageSelectorViewModel$1$invokeSuspend$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        r8lambdaThqcw6xkAmlG0vjGUd0l1mjil1o r8lambdathqcw6xkamlg0vjgud0l1mjil1o;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof r8lambdaThqcw6xkAmlG0vjGUd0l1mjil1o) {
            r8lambdathqcw6xkamlg0vjgud0l1mjil1o = (r8lambdaThqcw6xkAmlG0vjGUd0l1mjil1o) shortNewsContentCardView;
            int i2 = r8lambdathqcw6xkamlg0vjgud0l1mjil1o.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 33;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                r8lambdathqcw6xkamlg0vjgud0l1mjil1o.write = i3 % 2 != 0 ? i2 % Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                r8lambdathqcw6xkamlg0vjgud0l1mjil1o = new r8lambdaThqcw6xkAmlG0vjGUd0l1mjil1o(this, shortNewsContentCardView);
            }
        } else {
            r8lambdathqcw6xkamlg0vjgud0l1mjil1o = new r8lambdaThqcw6xkAmlG0vjGUd0l1mjil1o(this, shortNewsContentCardView);
        }
        Object obj2 = r8lambdathqcw6xkamlg0vjgud0l1mjil1o.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = r8lambdathqcw6xkamlg0vjgud0l1mjil1o.write;
        if (i4 != 0) {
            int i5 = IconCompatParcelizer;
            int i6 = i5 + 97;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = i5 + 93;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.read;
            String str = (String) obj;
            unpackInt2 unpackint2 = ((r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8) this.serializer).IconCompatParcelizer;
            if (str == null) {
                str = (String) ((Map.Entry) onContentCardDismissed.IconCompatParcelizer((Iterable) unpackint2.write().entrySet())).getKey();
            }
            r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I r8lambdatgpsxattz8gji5nphc8tulxhy9i = new r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I(unpackint2.write(), str);
            r8lambdathqcw6xkamlg0vjgud0l1mjil1o.write = 1;
            if (flowCollector.emit(r8lambdatgpsxattz8gji5nphc8tulxhy9i, r8lambdathqcw6xkamlg0vjgud0l1mjil1o) == coroutineSingletons) {
                int i10 = IconCompatParcelizer + 17;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return coroutineSingletons;
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i12 = RemoteActionCompatParcelizer + 73;
        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r10 == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r10 == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        r1 = r11;
        r11 = r10;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r11.emit(r10, r2) == r4) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object emit$com$roadrunner$nafath$data$NafathTimerDataStore$get$$inlined$map$1$2(java.lang.Object r10, o.ShortNewsContentCardView r11) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object r1 = r9.serializer
            com.roadrunner.nafath.data.NafathTimerDataStore r1 = (com.roadrunner.nafath.data.NafathTimerDataStore) r1
            boolean r2 = r11 instanceof o.q4ExternalSyntheticLambda6
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto Le
            goto L26
        Le:
            r2 = r11
            o.q4ExternalSyntheticLambda6 r2 = (o.q4ExternalSyntheticLambda6) r2
            int r4 = r2.RemoteActionCompatParcelizer
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L26
            int r11 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer
            int r11 = r11 + 69
            int r6 = r11 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer = r6
            int r11 = r11 % r0
            int r4 = r4 + r5
            r2.RemoteActionCompatParcelizer = r4
            goto L2b
        L26:
            o.q4ExternalSyntheticLambda6 r2 = new o.q4ExternalSyntheticLambda6
            r2.<init>(r9, r11)
        L2b:
            java.lang.Object r11 = r2.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r2.RemoteActionCompatParcelizer
            r6 = 0
            if (r5 == 0) goto L59
            if (r5 == r3) goto L43
            if (r5 != r0) goto L3d
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto La9
        L3d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r6
        L43:
            int r10 = r2.write
            kotlinx.coroutines.flow.FlowCollector r1 = r2.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            int r3 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer
            int r3 = r3 + 119
            int r5 = r3 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L95
            r3 = 4
            int r3 = r3 % 3
            goto L95
        L59:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            java.lang.Object r11 = r9.read
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            o.getNoActiveChildannotations r10 = (o.getNoActiveChildannotations) r10
            o.isRoot r5 = r1.RemoteActionCompatParcelizer
            java.lang.Object r10 = r10.serializer(r5)
            java.lang.String r10 = (java.lang.String) r10
            r5 = 0
            if (r10 == 0) goto L9b
            int r7 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer
            int r7 = r7 + 49
            int r8 = r7 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer = r8
            int r7 = r7 % r0
            if (r7 == 0) goto L85
            r2.read = r11
            r2.write = r3
            r2.RemoteActionCompatParcelizer = r3
            java.lang.Object r10 = com.roadrunner.nafath.data.NafathTimerDataStore.access$decodeFromJson(r1, r10, r2)
            if (r10 != r4) goto L92
            goto La8
        L85:
            r2.read = r11
            r2.write = r5
            r2.RemoteActionCompatParcelizer = r3
            java.lang.Object r10 = com.roadrunner.nafath.data.NafathTimerDataStore.access$decodeFromJson(r1, r10, r2)
            if (r10 != r4) goto L92
            goto La8
        L92:
            r1 = r11
            r11 = r10
            r10 = r5
        L95:
            o.q3ExternalSyntheticLambda1 r11 = (o.q3ExternalSyntheticLambda1) r11
            r5 = r10
            r10 = r11
            r11 = r1
            goto L9c
        L9b:
            r10 = r6
        L9c:
            r2.read = r6
            r2.write = r5
            r2.RemoteActionCompatParcelizer = r0
            java.lang.Object r10 = r11.emit(r10, r2)
            if (r10 != r4) goto La9
        La8:
            return r4
        La9:
            o.createFromParcel r10 = o.createFromParcel.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.emit$com$roadrunner$nafath$data$NafathTimerDataStore$get$$inlined$map$1$2(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (r11.emit(r10, r4) == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object emit$com$roadrunner$rider$state$quests$data$QuestsCache$get$$inlined$map$1$2(java.lang.Object r10, o.ShortNewsContentCardView r11) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto La1
            java.lang.Object r1 = r9.serializer
            com.roadrunner.rider.state.quests.data.QuestsCache r1 = (com.roadrunner.rider.state.quests.data.QuestsCache) r1
            boolean r4 = r11 instanceof o.getSubscriptionParameters
            r4 = r4 ^ r2
            if (r4 == 0) goto L19
            goto L28
        L19:
            r4 = r11
            o.getSubscriptionParameters r4 = (o.getSubscriptionParameters) r4
            int r5 = r4.IconCompatParcelizer
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L28
            int r5 = r5 + r6
            r4.IconCompatParcelizer = r5
            goto L2d
        L28:
            o.getSubscriptionParameters r4 = new o.getSubscriptionParameters
            r4.<init>(r9, r11)
        L2d:
            java.lang.Object r11 = r4.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r6 = r4.IconCompatParcelizer
            if (r6 == 0) goto L54
            if (r6 == r2) goto L4c
            if (r6 != r0) goto L46
            int r10 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer
            int r10 = r10 + 21
            int r1 = r10 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer = r1
            int r10 = r10 % r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L9e
        L46:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r3
        L4c:
            int r10 = r4.write
            kotlinx.coroutines.flow.FlowCollector r1 = r4.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L81
        L54:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            java.lang.Object r11 = r9.read
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            o.getNoActiveChildannotations r10 = (o.getNoActiveChildannotations) r10
            o.isRoot r6 = r1.RemoteActionCompatParcelizer
            java.lang.Object r10 = r10.serializer(r6)
            java.lang.String r10 = (java.lang.String) r10
            r6 = 0
            if (r10 == 0) goto L87
            int r7 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer
            int r7 = r7 + 47
            int r8 = r7 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer = r8
            int r7 = r7 % r0
            r4.RemoteActionCompatParcelizer = r11
            r4.write = r6
            r4.IconCompatParcelizer = r2
            java.lang.Object r10 = com.roadrunner.rider.state.quests.data.QuestsCache.access$fromJson(r1, r10, r4)
            if (r10 != r5) goto L7e
            goto L9d
        L7e:
            r1 = r11
            r11 = r10
            r10 = r6
        L81:
            o.getInfoParameters r11 = (o.getInfoParameters) r11
            r6 = r10
            r10 = r11
            r11 = r1
            goto L91
        L87:
            int r10 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer
            int r10 = r10 + 45
            int r1 = r10 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer = r1
            int r10 = r10 % r0
            r10 = r3
        L91:
            r4.RemoteActionCompatParcelizer = r3
            r4.write = r6
            r4.IconCompatParcelizer = r0
            java.lang.Object r10 = r11.emit(r10, r4)
            if (r10 != r5) goto L9e
        L9d:
            return r5
        L9e:
            o.createFromParcel r10 = o.createFromParcel.INSTANCE
            return r10
        La1:
            java.lang.Object r10 = r9.serializer
            com.roadrunner.rider.state.quests.data.QuestsCache r10 = (com.roadrunner.rider.state.quests.data.QuestsCache) r10
            boolean r10 = r11 instanceof o.getSubscriptionParameters
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.emit$com$roadrunner$rider$state$quests$data$QuestsCache$get$$inlined$map$1$2(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r9.emit(r8, r2) == r4) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object emit$com$roadrunner$settings$data$cache$SettingsCacheImpl$get$$inlined$map$1$2(java.lang.Object r8, o.ShortNewsContentCardView r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object r1 = r7.serializer
            com.roadrunner.settings.data.cache.SettingsCacheImpl r1 = (com.roadrunner.settings.data.cache.SettingsCacheImpl) r1
            boolean r2 = r9 instanceof o.r8lambdaK5iYeJTTQ3f6GfQjz6zM7UI9Ts
            r3 = 0
            if (r2 == 0) goto L2e
            int r2 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer
            int r2 = r2 + 21
            int r4 = r2 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L26
            r2 = r9
            o.r8lambdaK5iYeJTTQ3f6GfQjz6zM7UI9Ts r2 = (o.r8lambdaK5iYeJTTQ3f6GfQjz6zM7UI9Ts) r2
            int r4 = r2.write
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L2e
            int r4 = r4 + r5
            r2.write = r4
            goto L33
        L26:
            o.r8lambdaK5iYeJTTQ3f6GfQjz6zM7UI9Ts r9 = (o.r8lambdaK5iYeJTTQ3f6GfQjz6zM7UI9Ts) r9
            int r8 = r9.write
            r3.hashCode()
            throw r3
        L2e:
            o.r8lambdaK5iYeJTTQ3f6GfQjz6zM7UI9Ts r2 = new o.r8lambdaK5iYeJTTQ3f6GfQjz6zM7UI9Ts
            r2.<init>(r7, r9)
        L33:
            java.lang.Object r9 = r2.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r2.write
            r6 = 1
            if (r5 == 0) goto L52
            if (r5 == r6) goto L4a
            if (r5 != r0) goto L44
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L93
        L44:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r3
        L4a:
            int r8 = r2.IconCompatParcelizer
            kotlinx.coroutines.flow.FlowCollector r1 = r2.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L7f
        L52:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            java.lang.Object r9 = r7.read
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            o.getNoActiveChildannotations r8 = (o.getNoActiveChildannotations) r8
            o.isRoot r5 = r1.IconCompatParcelizer
            java.lang.Object r8 = r8.serializer(r5)
            java.lang.String r8 = (java.lang.String) r8
            r5 = 0
            if (r8 == 0) goto L85
            r2.RemoteActionCompatParcelizer = r9
            r2.IconCompatParcelizer = r5
            r2.write = r6
            java.lang.Object r8 = com.roadrunner.settings.data.cache.SettingsCacheImpl.access$fromJson(r1, r8, r2)
            if (r8 != r4) goto L7c
            int r8 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer
            int r8 = r8 + 47
            int r9 = r8 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer = r9
            int r8 = r8 % r0
            goto L92
        L7c:
            r1 = r9
            r9 = r8
            r8 = r5
        L7f:
            o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao r9 = (o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) r9
            r5 = r8
            r8 = r9
            r9 = r1
            goto L86
        L85:
            r8 = r3
        L86:
            r2.RemoteActionCompatParcelizer = r3
            r2.IconCompatParcelizer = r5
            r2.write = r0
            java.lang.Object r8 = r9.emit(r8, r2)
            if (r8 != r4) goto L93
        L92:
            return r4
        L93:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            int r9 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer
            int r9 = r9 + 49
            int r1 = r9 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer = r1
            int r9 = r9 % r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.emit$com$roadrunner$settings$data$cache$SettingsCacheImpl$get$$inlined$map$1$2(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r5.emit(r4, r1) == r3) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object emit$com$roadrunner$rider$state$worksettings$domain$FetchSettingsInfoVisibility$invoke$$inlined$map$1$2(java.lang.Object r8, o.ShortNewsContentCardView r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto Lbd
            boolean r1 = r9 instanceof o.setPreinstallPayloadReadStatus
            if (r1 == 0) goto L32
            r1 = r9
            o.setPreinstallPayloadReadStatus r1 = (o.setPreinstallPayloadReadStatus) r1
            int r3 = r1.serializer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L32
            int r9 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer
            int r9 = r9 + 29
            int r5 = r9 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer = r5
            int r9 = r9 % r0
            if (r9 != 0) goto L2e
            int r9 = r3 >>> r4
            r1.serializer = r9
            goto L37
        L2e:
            int r3 = r3 + r4
            r1.serializer = r3
            goto L37
        L32:
            o.setPreinstallPayloadReadStatus r1 = new o.setPreinstallPayloadReadStatus
            r1.<init>(r7, r9)
        L37:
            java.lang.Object r9 = r1.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.serializer
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L74
            if (r4 == r5) goto L6a
            if (r4 != r0) goto L5b
            int r8 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer
            int r8 = r8 + 23
            int r1 = r8 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L57
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            r8 = 97
            int r8 = r8 / r6
            goto Lba
        L57:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto Lba
        L5b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            int r8 = com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.IconCompatParcelizer
            int r8 = r8 + 15
            int r9 = r8 % 128
            com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.RemoteActionCompatParcelizer = r9
            int r8 = r8 % r0
            return r2
        L6a:
            int r8 = r1.RemoteActionCompatParcelizer
            o.setSdkPrefix r4 = r1.read
            kotlinx.coroutines.flow.FlowCollector r5 = r1.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L9a
        L74:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            java.lang.Object r9 = r7.read
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            r4 = r8
            o.setSdkPrefix r4 = (o.setSdkPrefix) r4
            java.lang.Object r8 = r7.serializer
            io.sentry.util.network.NetworkBody r8 = (io.sentry.util.network.NetworkBody) r8
            java.lang.Object r8 = r8.RemoteActionCompatParcelizer
            o.InternalPlatformTextApi r8 = (o.InternalPlatformTextApi) r8
            r1.write = r9
            r1.read = r4
            r1.RemoteActionCompatParcelizer = r6
            r1.serializer = r5
            o.TextRangeKt r8 = r8.read
            java.lang.Object r8 = r8.write(r1)
            if (r8 != r3) goto L97
            goto Lb9
        L97:
            r5 = r9
            r9 = r8
            r8 = r6
        L9a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r4 == 0) goto La6
            o.setStoreInfo r4 = r4.RatingCompat
            boolean r6 = r4.read
        La6:
            o.setLicenseVerificationTracked r4 = new o.setLicenseVerificationTracked
            r4.<init>(r9, r6)
            r1.write = r2
            r1.read = r2
            r1.RemoteActionCompatParcelizer = r8
            r1.serializer = r0
            java.lang.Object r8 = r5.emit(r4, r1)
            if (r8 != r3) goto Lba
        Lb9:
            return r3
        Lba:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            return r8
        Lbd:
            boolean r8 = r9 instanceof o.setPreinstallPayloadReadStatus
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.emit$com$roadrunner$rider$state$worksettings$domain$FetchSettingsInfoVisibility$invoke$$inlined$map$1$2(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    private final Object emit$com$roadrunner$rider$state$shiftextension$domain$GetShiftExtension$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        isAppRunningInSamsungCloudEnvironment isapprunninginsamsungcloudenvironment;
        Object getadvertisinginfoobject;
        setStoreInfo setstoreinfo;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof isAppRunningInSamsungCloudEnvironment) {
            isapprunninginsamsungcloudenvironment = (isAppRunningInSamsungCloudEnvironment) shortNewsContentCardView;
            int i2 = isapprunninginsamsungcloudenvironment.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                isapprunninginsamsungcloudenvironment.serializer = i2 - Integer.MIN_VALUE;
            } else {
                isapprunninginsamsungcloudenvironment = new isAppRunningInSamsungCloudEnvironment(this, shortNewsContentCardView);
            }
        } else {
            isapprunninginsamsungcloudenvironment = new isAppRunningInSamsungCloudEnvironment(this, shortNewsContentCardView);
        }
        Object obj2 = isapprunninginsamsungcloudenvironment.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = isapprunninginsamsungcloudenvironment.serializer;
        Long l = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.read;
            setSdkPrefix setsdkprefix = (setSdkPrefix) obj;
            getSamsungCloudDevGoogleAdId getsamsungclouddevgoogleadid = (getSamsungCloudDevGoogleAdId) this.serializer;
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2 = getsamsungclouddevgoogleadid.IconCompatParcelizer;
            forest.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("ContactType=", subscribetobannersupdateslambda2.read()), new Object[0]);
            String str = subscribetobannersupdateslambda2.read();
            if (str == null) {
                getadvertisinginfoobject = getSamsungReferrer.IconCompatParcelizer;
                int i4 = RemoteActionCompatParcelizer + 57;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                boolean zEquals = str.equals("ON_DEMAND");
                if (setsdkprefix != null) {
                    int i6 = RemoteActionCompatParcelizer + 61;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        setStoreInfo setstoreinfo2 = setsdkprefix.RatingCompat;
                        l.hashCode();
                        throw null;
                    }
                    setstoreinfo = setsdkprefix.RatingCompat;
                } else {
                    int i7 = IconCompatParcelizer + 123;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    setstoreinfo = null;
                }
                if (zEquals || setstoreinfo == null || !setstoreinfo.read) {
                    getadvertisinginfoobject = getSamsungReferrer.IconCompatParcelizer;
                    int i9 = RemoteActionCompatParcelizer + 57;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                } else {
                    if (setsdkprefix != null) {
                        int i11 = IconCompatParcelizer + 15;
                        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        getReferrer getreferrer = setsdkprefix.MediaBrowserCompatMediaItem;
                        if (getreferrer != null) {
                            int i13 = RemoteActionCompatParcelizer + 115;
                            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                            if (i13 % 2 == 0) {
                                Long l2 = getreferrer.MediaSessionCompatQueueItem;
                                l.hashCode();
                                throw null;
                            }
                            l = getreferrer.MediaSessionCompatQueueItem;
                        }
                    }
                    boolean z = setstoreinfo.serializer;
                    getadvertisinginfoobject = new getAdvertisingInfoObject(R.string.status_available_for_shift_extension, R.string.status_shift_will_be_extended, z, z, true, l);
                }
            }
            isapprunninginsamsungcloudenvironment.serializer = 1;
            if (flowCollector.emit(getadvertisinginfoobject, isapprunninginsamsungcloudenvironment) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            int i14 = IconCompatParcelizer + 49;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    private final Object emit$com$roadrunner$realtime$domain$RealtimeConnectionManagerImpl$observeMessages$1$invokeSuspend$$inlined$mapNotNull$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        launchAttributionResponseTasksI launchattributionresponsetasksi;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        lambdaremoveGlobalPartnerParameters31 lambdaremoveglobalpartnerparameters31 = null;
        if (i2 % 2 != 0) {
            boolean z = shortNewsContentCardView instanceof launchAttributionResponseTasksI;
            lambdaremoveglobalpartnerparameters31.hashCode();
            throw null;
        }
        if (!(shortNewsContentCardView instanceof launchAttributionResponseTasksI)) {
            launchattributionresponsetasksi = new launchAttributionResponseTasksI(this, shortNewsContentCardView);
        } else {
            launchattributionresponsetasksi = (launchAttributionResponseTasksI) shortNewsContentCardView;
            int i3 = launchattributionresponsetasksi.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                launchattributionresponsetasksi.serializer = i3 - Integer.MIN_VALUE;
            } else {
                launchattributionresponsetasksi = new launchAttributionResponseTasksI(this, shortNewsContentCardView);
            }
        }
        Object obj2 = launchattributionresponsetasksi.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = launchattributionresponsetasksi.serializer;
        if (i4 != 0) {
            int i5 = RemoteActionCompatParcelizer + 99;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = RemoteActionCompatParcelizer + 109;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.read;
            lambdasetOfflineMode8 lambdasetofflinemode8 = (lambdasetOfflineMode8) obj;
            lambdatrackThirdPartySharing37 lambdatrackthirdpartysharing37 = (lambdatrackThirdPartySharing37) this.serializer;
            lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24 = lambdatrackthirdpartysharing37.RemoteActionCompatParcelizer;
            decode decodeVar = lambdaremoveglobalcallbackparameter24.serializer;
            lambdasetofflinemode8.getClass();
            String str = lambdasetofflinemode8.IconCompatParcelizer;
            try {
                resetTransientState resettransientstate = (resetTransientState) lambdatrackthirdpartysharing37.write.MediaSessionCompatResultReceiverWrapper();
                resettransientstate.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = lambdasendPreinstallReferrer19.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                Object objSerializer = resettransientstate.serializer(str, setgraphicmodalmaxwidthdpSerializer);
                if (lambdaremoveglobalcallbackparameter24.RemoteActionCompatParcelizer()) {
                    decodeVar.logEvent("rtc_message_reload_home", null);
                }
                lambdaremoveglobalpartnerparameters31 = (lambdaremoveGlobalPartnerParameters31) objSerializer;
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to parse realtime message: server:delivery_updated ".concat(str), new Object[0]);
                if (lambdaremoveglobalcallbackparameter24.RemoteActionCompatParcelizer()) {
                    ff$$ExternalSyntheticOutline0.m("name", "server:delivery_updated", decodeVar, "rtc_message_decoding_error");
                }
            }
            if (lambdaremoveglobalpartnerparameters31 != null) {
                int i7 = RemoteActionCompatParcelizer + 111;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                launchattributionresponsetasksi.serializer = 1;
                if (flowCollector.emit(lambdaremoveglobalpartnerparameters31, launchattributionresponsetasksi) == coroutineSingletons) {
                    int i9 = IconCompatParcelizer + 55;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return coroutineSingletons;
                }
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x015c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0168  */
    /* JADX WARN: Code duplicated, block: B:39:0x0172  */
    /* JADX WARN: Code duplicated, block: B:40:0x0174  */
    /* JADX WARN: Code duplicated, block: B:42:0x017d  */
    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    private final Object emit$com$roadrunner$rider$state$currentshift$domain$ObserveCurrentShiftV2$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        setPackageHandler setpackagehandler;
        String str;
        boolean z;
        Object setconnectionoptions;
        int i;
        int i2;
        String str2;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 81;
        int i5 = i4 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i5;
        int i6 = i4 % 2;
        if (!(shortNewsContentCardView instanceof setPackageHandler)) {
            setpackagehandler = new setPackageHandler(this, shortNewsContentCardView);
        } else {
            int i7 = i5 + 59;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            setpackagehandler = (setPackageHandler) shortNewsContentCardView;
            int i9 = setpackagehandler.read;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                setpackagehandler.read = i9 - Integer.MIN_VALUE;
            } else {
                setpackagehandler = new setPackageHandler(this, shortNewsContentCardView);
            }
        }
        Object obj2 = setpackagehandler.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = setpackagehandler.read;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.read;
            onActivityResumed onactivityresumed = (onActivityResumed) obj;
            N$b n$b = (N$b) ((Parser.Pair) this.serializer).write;
            setLastHorizontalStyle setlasthorizontalstyle = (setLastHorizontalStyle) n$b.IconCompatParcelizer;
            if (onactivityresumed == null) {
                setconnectionoptions = setAttributionHandler.IconCompatParcelizer;
                i = 1;
            } else {
                FlowLiveDataConversionsasFlow11 flowLiveDataConversionsasFlow11 = onactivityresumed.data;
                String str3 = flowLiveDataConversionsasFlow11.title;
                String str4 = flowLiveDataConversionsasFlow11.area;
                String str5 = flowLiveDataConversionsasFlow11.subtitle;
                String str6 = flowLiveDataConversionsasFlow11.shiftEndedAt;
                if (str6 != null && str6.length() != 0) {
                    try {
                        Instant instant = Instant.parse(str6);
                        instant.getClass();
                        try {
                            DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.getDefault()).withZone(ZoneId.systemDefault());
                            dateTimeFormatterWithZone.getClass();
                            str2 = dateTimeFormatterWithZone.format(instant);
                            str2.getClass();
                        } catch (IllegalArgumentException e) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to format SHORT date in Locale " + Locale.getDefault() + ", falling back to 'h:mm a'", new Object[0]);
                            str2 = DateTimeFormatter.ofPattern("h:mm a", Locale.getDefault()).withLocale(Locale.getDefault()).withZone(ZoneId.systemDefault()).format(instant);
                            str2.getClass();
                        }
                        str = ((setTransactionSuccessful) n$b.serializer).read(R.string.current_shift_duration, str2);
                    } catch (Exception e2) {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Invalid ISO date ".concat(str6), new Object[0]);
                        str = "";
                    }
                    Integer num = flowLiveDataConversionsasFlow11.zoneId;
                    String str7 = flowLiveDataConversionsasFlow11.zoneName;
                    t3 t3VarIconCompatParcelizer = ((xa) n$b.read).IconCompatParcelizer(flowLiveDataConversionsasFlow11.bonusMultiplier, flowLiveDataConversionsasFlow11.bonusTypes, Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().addOnPictureInPictureUiStateChangedListener()), Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer()));
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{flowLiveDataConversionsasFlow11.calendarEnabled, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                        i2 = RemoteActionCompatParcelizer + 35;
                        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            if (((v9) n$b.write).serializer()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            ((v9) n$b.write).serializer();
                            throw null;
                        }
                    } else {
                        z = false;
                    }
                    setconnectionoptions = new setConnectionOptions(str3, str5, str4, str, num, str7, t3VarIconCompatParcelizer, Boolean.valueOf(z));
                    i = 1;
                }
                str = "";
                Integer num2 = flowLiveDataConversionsasFlow11.zoneId;
                String str8 = flowLiveDataConversionsasFlow11.zoneName;
                t3 t3VarIconCompatParcelizer2 = ((xa) n$b.read).IconCompatParcelizer(flowLiveDataConversionsasFlow11.bonusMultiplier, flowLiveDataConversionsasFlow11.bonusTypes, Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().addOnPictureInPictureUiStateChangedListener()), Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer()));
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{flowLiveDataConversionsasFlow11.calendarEnabled, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                    i2 = RemoteActionCompatParcelizer + 35;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        if (((v9) n$b.write).serializer()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        ((v9) n$b.write).serializer();
                        throw null;
                    }
                } else {
                    z = false;
                }
                setconnectionoptions = new setConnectionOptions(str3, str5, str4, str, num2, str8, t3VarIconCompatParcelizer2, Boolean.valueOf(z));
                i = 1;
            }
            setpackagehandler.read = i;
            if (flowCollector.emit(setconnectionoptions, setpackagehandler) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x0239  */
    /* JADX WARN: Code duplicated, block: B:107:0x023d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x023f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0242  */
    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0248  */
    /* JADX WARN: Code duplicated, block: B:113:0x024c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0259  */
    /* JADX WARN: Code duplicated, block: B:118:0x0262  */
    /* JADX WARN: Code duplicated, block: B:120:0x026f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0274  */
    /* JADX WARN: Code duplicated, block: B:125:0x027a  */
    /* JADX WARN: Code duplicated, block: B:129:0x028b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0293  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:141:0x02bb A[PHI: r26
  0x02bb: PHI (r26v3 java.util.Iterator) = 
  (r26v0 java.util.Iterator)
  (r26v1 java.util.Iterator)
  (r26v1 java.util.Iterator)
  (r26v1 java.util.Iterator)
  (r26v4 java.util.Iterator)
 binds: [B:136:0x02ab, B:130:0x0291, B:123:0x0277, B:126:0x0280, B:112:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:145:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:149:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:153:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:157:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:160:0x0303  */
    /* JADX WARN: Code duplicated, block: B:162:0x0347  */
    /* JADX WARN: Code duplicated, block: B:165:0x0351  */
    /* JADX WARN: Code duplicated, block: B:169:0x039d  */
    /* JADX WARN: Code duplicated, block: B:170:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0140  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0152  */
    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    /* JADX WARN: Code duplicated, block: B:62:0x016f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0170  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0184  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:87:0x0206  */
    /* JADX WARN: Code duplicated, block: B:88:0x0208  */
    /* JADX WARN: Code duplicated, block: B:90:0x0212  */
    /* JADX WARN: Code duplicated, block: B:92:0x021d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0221  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object emit$com$roadrunner$rider$state$summary$nest$domain$ObserveNestRiderStateSummary$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        getInstallTracked getinstalltracked;
        List list;
        MultiDexV14ICSElementConstructor multiDexV14ICSElementConstructor;
        SdkClickHandler1 sdkClickHandler1;
        ArrayList arrayList;
        Iterator it;
        int i;
        Object sessionResponseData;
        int i2;
        Object next;
        mkdirChecked mkdirchecked;
        String str;
        String str2;
        Iterator<E> it2;
        Object next2;
        saveLong savelong;
        int i3;
        ResponseData1 responseData1;
        String str3;
        int i4;
        int iHashCode;
        Iterator it3;
        Integer numValueOf;
        int i5;
        Integer numValueOf2;
        String str4;
        String str5;
        Uri uri;
        Object[] objArr;
        char c;
        byte b;
        buildResponseData sdkClickHandler;
        buildResponseData logerrormessagei;
        String str6;
        int iHashCode2;
        sendSdkClickI sendsdkclicki;
        int i6;
        mkdirChecked mkdirchecked2;
        int i7 = 2 % 2;
        if (shortNewsContentCardView instanceof getInstallTracked) {
            getinstalltracked = (getInstallTracked) shortNewsContentCardView;
            int i8 = getinstalltracked.write;
            if ((i8 & Integer.MIN_VALUE) == 0) {
                getinstalltracked = new getInstallTracked(this, shortNewsContentCardView);
            } else {
                int i9 = IconCompatParcelizer + 105;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    getinstalltracked.write = i8 << Integer.MIN_VALUE;
                } else {
                    getinstalltracked.write = i8 - Integer.MIN_VALUE;
                }
            }
        } else {
            getinstalltracked = new getInstallTracked(this, shortNewsContentCardView);
        }
        Object obj2 = getinstalltracked.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = getinstalltracked.write;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.read;
            installSecondaryDexes installsecondarydexes = (installSecondaryDexes) obj;
            IOParser$Decoder iOParser$Decoder = ((getDeeplinkClickTime) this.serializer).write;
            if (installsecondarydexes == null) {
                int i11 = RemoteActionCompatParcelizer + 7;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                sessionResponseData = SdkClickResponseData.read;
                i2 = 1;
            } else {
                MultiDexV14JBMR11ElementConstructor multiDexV14JBMR11ElementConstructor = installsecondarydexes.data;
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{multiDexV14JBMR11ElementConstructor.variant, "on_demand"}, getCieXyz.write())).booleanValue();
                boolean z = zBooleanValue && ((checkSdkClickResponse) iOParser$Decoder.read).RemoteActionCompatParcelizer();
                List list2 = instance_delegatelambda0.write;
                if (zBooleanValue) {
                    list = multiDexV14JBMR11ElementConstructor.buttons;
                    if (list == null) {
                        int i13 = IconCompatParcelizer + 95;
                        RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        list = list2;
                    }
                    if (!z) {
                        mkdirChecked mkdirchecked3 = (mkdirChecked) onContentCardDismissed.MediaMetadataCompat(list);
                        if (mkdirchecked3 != null) {
                            String str7 = mkdirchecked3.text;
                            String str8 = mkdirchecked3.type;
                            String str9 = mkdirchecked3.url;
                            Boolean bool = mkdirchecked3.confirmationRequired;
                            str7.getClass();
                            str8.getClass();
                            mkdirchecked2 = new mkdirChecked(str7, str8, str9, bool, null, null);
                        } else {
                            mkdirchecked2 = null;
                        }
                        if (mkdirchecked2 != null) {
                            list2 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{mkdirchecked2}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                        }
                    }
                    multiDexV14ICSElementConstructor = multiDexV14JBMR11ElementConstructor.description;
                    if (multiDexV14ICSElementConstructor != null) {
                        String str10 = multiDexV14ICSElementConstructor.text;
                        str6 = multiDexV14ICSElementConstructor.style;
                        iHashCode2 = str6.hashCode();
                        if (iHashCode2 != -1867169789) {
                            if (iHashCode2 != 92899676) {
                                if (!str6.equals("alert")) {
                                    sendsdkclicki = sendSdkClickI.ALERT;
                                } else {
                                    sendsdkclicki = sendSdkClickI.NEUTRAL;
                                }
                            } else {
                                i6 = IconCompatParcelizer + 97;
                                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                                if (i6 % 2 == 0) {
                                    throw null;
                                }
                                if (iHashCode2 == 1952151455 && str6.equals("critical")) {
                                    sendsdkclicki = sendSdkClickI.CRITICAL;
                                } else {
                                    sendsdkclicki = sendSdkClickI.NEUTRAL;
                                }
                            }
                        } else if (str6.equals("success")) {
                            sendsdkclicki = sendSdkClickI.SUCCESS;
                        } else {
                            sendsdkclicki = sendSdkClickI.NEUTRAL;
                        }
                        sdkClickHandler1 = new SdkClickHandler1(str10, sendsdkclicki);
                    } else {
                        sdkClickHandler1 = null;
                    }
                    arrayList = new ArrayList();
                    it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        if (i >= 0) {
                            mkdirchecked = (mkdirChecked) next;
                            str = mkdirchecked.style;
                            str2 = mkdirchecked.text;
                            saveLong.Companion.getClass();
                            it2 = saveLong.getEntries().iterator();
                            int i15 = IconCompatParcelizer + 63;
                            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            do {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                } else {
                                    next2 = null;
                                }
                                savelong = (saveLong) next2;
                                if (savelong == null) {
                                    i3 = -1;
                                } else {
                                    i3 = saveString.write[savelong.ordinal()];
                                }
                                if (i3 != -1) {
                                    int i17 = IconCompatParcelizer + 45;
                                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                                    if (i17 % 2 != 0 ? i3 != 1 : i3 != 1) {
                                        if (i3 == 2) {
                                            responseData1 = ResponseData1.SECONDARY;
                                        } else if (i3 == 3) {
                                            responseData1 = ResponseData1.PRIMARY;
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            return null;
                                        }
                                    }
                                } else {
                                    responseData1 = null;
                                }
                                if (responseData1 == null) {
                                    if (i == 0) {
                                        responseData1 = ResponseData1.SMALL_PRIMARY;
                                    } else {
                                        responseData1 = ResponseData1.SMALL_SECONDARY;
                                    }
                                }
                                str3 = mkdirchecked.icon;
                                if (z || str3 == null) {
                                    it3 = it;
                                } else {
                                    i4 = RemoteActionCompatParcelizer + 63;
                                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                                    if (i4 % 2 != 0) {
                                        iHashCode = str3.hashCode();
                                        if (iHashCode != -1015391860) {
                                            it3 = it;
                                            if (str3.equals("go_offline")) {
                                                numValueOf = Integer.valueOf(R.drawable.ic_power_on_off);
                                            }
                                        } else {
                                            i5 = RemoteActionCompatParcelizer + 41;
                                            it3 = it;
                                            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                                            if (i5 % 2 != 0) {
                                                Object obj3 = null;
                                                obj3.hashCode();
                                                throw null;
                                            }
                                            if (iHashCode != 197280525) {
                                                if (iHashCode == 1881624054 && str3.equals("session_resume")) {
                                                    numValueOf2 = Integer.valueOf(R.drawable.ic_play);
                                                    numValueOf = numValueOf2;
                                                }
                                            } else if (str3.equals("session_pause")) {
                                                numValueOf2 = Integer.valueOf(R.drawable.ic_timer_pause);
                                                numValueOf = numValueOf2;
                                            }
                                        }
                                        str4 = mkdirchecked.type;
                                        switch (str4.hashCode()) {
                                            case -2057707738:
                                                if (str4.equals("URL_ACTION") || (str5 = mkdirchecked.url) == null) {
                                                    c = 45513;
                                                    b = -1803334089;
                                                    logerrormessagei = null;
                                                } else {
                                                    int i18 = RemoteActionCompatParcelizer + 125;
                                                    IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                                                    int i19 = i18 % 2;
                                                    uri = Uri.parse(str5);
                                                    r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w r8lambda2fbyaooocvqhxqp2nim5pmocd5w = (r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w) ((r8lambda0tFkXN0c4UQsJxVxyejUo1BomY) iOParser$Decoder.RemoteActionCompatParcelizer);
                                                    uri.getClass();
                                                    objArr = new Object[]{r8lambda2fbyaooocvqhxqp2nim5pmocd5w.serializer.RemoteActionCompatParcelizer(uri), r8lambdaEdQQWzTg5FJP9FEnVxOS8uVofXM.read};
                                                    c = 45513;
                                                    b = -1803334089;
                                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                                                        sdkClickHandler = new ResponseData(str2, uri, responseData1, numValueOf);
                                                    } else {
                                                        sdkClickHandler = new SdkClickHandler(str2, uri, responseData1, numValueOf);
                                                    }
                                                    logerrormessagei = sdkClickHandler;
                                                }
                                                break;
                                            case 603143124:
                                                if (!str4.equals("STOP_WORKING")) {
                                                    c = 45513;
                                                    b = -1803334089;
                                                    logerrormessagei = null;
                                                } else {
                                                    logerrormessagei = new logErrorMessageI(mkdirchecked.text, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mkdirchecked.confirmationRequired, Boolean.TRUE}, getCieXyz.write())).booleanValue(), responseData1, numValueOf, z);
                                                    c = 45513;
                                                    b = -1803334089;
                                                }
                                                break;
                                            case 1343887451:
                                                if (!str4.equals("END_BREAK")) {
                                                    c = 45513;
                                                    b = -1803334089;
                                                    logerrormessagei = null;
                                                } else {
                                                    logerrormessagei = new readField(str2, responseData1, numValueOf, z);
                                                    c = 45513;
                                                    b = -1803334089;
                                                }
                                                break;
                                            case 1467773711:
                                                if (!str4.equals("REQUEST_BREAK")) {
                                                    c = 45513;
                                                    b = -1803334089;
                                                    logerrormessagei = null;
                                                } else {
                                                    logerrormessagei = new retrySendingI(str2, responseData1, numValueOf, z);
                                                    c = 45513;
                                                    b = -1803334089;
                                                }
                                                break;
                                            case 1741202138:
                                                if (!str4.equals("CANCEL_BREAK")) {
                                                    c = 45513;
                                                    b = -1803334089;
                                                    logerrormessagei = null;
                                                } else {
                                                    logerrormessagei = new isPlayTrackingEnabled(str2, responseData1, numValueOf);
                                                    c = 45513;
                                                    b = -1803334089;
                                                }
                                                break;
                                            default:
                                                c = 45513;
                                                b = -1803334089;
                                                logerrormessagei = null;
                                                break;
                                        }
                                        if (logerrormessagei != null) {
                                            arrayList.add(logerrormessagei);
                                        }
                                        i++;
                                        it = it3;
                                    } else {
                                        str3.hashCode();
                                        throw null;
                                    }
                                }
                                numValueOf = null;
                                str4 = mkdirchecked.type;
                                switch (str4.hashCode()) {
                                    case -2057707738:
                                        if (str4.equals("URL_ACTION")) {
                                            int i110 = RemoteActionCompatParcelizer + 125;
                                            IconCompatParcelizer = i110 % Fields.SpotShadowColor;
                                            int i111 = i110 % 2;
                                            uri = Uri.parse(str5);
                                            r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w r8lambda2fbyaooocvqhxqp2nim5pmocd5w2 = (r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w) ((r8lambda0tFkXN0c4UQsJxVxyejUo1BomY) iOParser$Decoder.RemoteActionCompatParcelizer);
                                            uri.getClass();
                                            objArr = new Object[]{r8lambda2fbyaooocvqhxqp2nim5pmocd5w2.serializer.RemoteActionCompatParcelizer(uri), r8lambdaEdQQWzTg5FJP9FEnVxOS8uVofXM.read};
                                            c = 45513;
                                            b = -1803334089;
                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                                                sdkClickHandler = new ResponseData(str2, uri, responseData1, numValueOf);
                                            } else {
                                                sdkClickHandler = new SdkClickHandler(str2, uri, responseData1, numValueOf);
                                            }
                                            logerrormessagei = sdkClickHandler;
                                        } else {
                                            c = 45513;
                                            b = -1803334089;
                                            logerrormessagei = null;
                                        }
                                        break;
                                    case 603143124:
                                        if (!str4.equals("STOP_WORKING")) {
                                            logerrormessagei = new logErrorMessageI(mkdirchecked.text, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mkdirchecked.confirmationRequired, Boolean.TRUE}, getCieXyz.write())).booleanValue(), responseData1, numValueOf, z);
                                            c = 45513;
                                            b = -1803334089;
                                        } else {
                                            c = 45513;
                                            b = -1803334089;
                                            logerrormessagei = null;
                                        }
                                        break;
                                    case 1343887451:
                                        if (!str4.equals("END_BREAK")) {
                                            logerrormessagei = new readField(str2, responseData1, numValueOf, z);
                                            c = 45513;
                                            b = -1803334089;
                                        } else {
                                            c = 45513;
                                            b = -1803334089;
                                            logerrormessagei = null;
                                        }
                                        break;
                                    case 1467773711:
                                        if (!str4.equals("REQUEST_BREAK")) {
                                            logerrormessagei = new retrySendingI(str2, responseData1, numValueOf, z);
                                            c = 45513;
                                            b = -1803334089;
                                        } else {
                                            c = 45513;
                                            b = -1803334089;
                                            logerrormessagei = null;
                                        }
                                        break;
                                    case 1741202138:
                                        if (!str4.equals("CANCEL_BREAK")) {
                                            logerrormessagei = new isPlayTrackingEnabled(str2, responseData1, numValueOf);
                                            c = 45513;
                                            b = -1803334089;
                                        } else {
                                            c = 45513;
                                            b = -1803334089;
                                            logerrormessagei = null;
                                        }
                                        break;
                                    default:
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                        break;
                                }
                                if (logerrormessagei != null) {
                                    arrayList.add(logerrormessagei);
                                }
                                i++;
                                it = it3;
                            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((saveLong) next2).getKey(), str}, getCieXyz.write())).booleanValue());
                            savelong = (saveLong) next2;
                            if (savelong == null) {
                                i3 = -1;
                            } else {
                                i3 = saveString.write[savelong.ordinal()];
                            }
                            if (i3 != -1) {
                                int i112 = IconCompatParcelizer + 45;
                                RemoteActionCompatParcelizer = i112 % Fields.SpotShadowColor;
                                responseData1 = i112 % 2 != 0 ? ResponseData1.DESTRUCTIVE : ResponseData1.DESTRUCTIVE;
                            } else {
                                responseData1 = null;
                            }
                            if (responseData1 == null) {
                                if (i == 0) {
                                    responseData1 = ResponseData1.SMALL_PRIMARY;
                                } else {
                                    responseData1 = ResponseData1.SMALL_SECONDARY;
                                }
                            }
                            str3 = mkdirchecked.icon;
                            if (z) {
                                it3 = it;
                                numValueOf = null;
                            } else {
                                i4 = RemoteActionCompatParcelizer + 63;
                                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                                if (i4 % 2 != 0) {
                                    iHashCode = str3.hashCode();
                                    if (iHashCode != -1015391860) {
                                        it3 = it;
                                        if (str3.equals("go_offline")) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(R.drawable.ic_power_on_off);
                                        }
                                    } else {
                                        i5 = RemoteActionCompatParcelizer + 41;
                                        it3 = it;
                                        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                                        if (i5 % 2 != 0) {
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        if (iHashCode != 197280525) {
                                            if (iHashCode == 1881624054) {
                                                numValueOf2 = Integer.valueOf(R.drawable.ic_play);
                                                numValueOf = numValueOf2;
                                            }
                                            numValueOf = null;
                                        } else if (str3.equals("session_pause")) {
                                            numValueOf2 = Integer.valueOf(R.drawable.ic_timer_pause);
                                            numValueOf = numValueOf2;
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                } else {
                                    str3.hashCode();
                                    throw null;
                                }
                            }
                            str4 = mkdirchecked.type;
                            switch (str4.hashCode()) {
                                case -2057707738:
                                    if (str4.equals("URL_ACTION")) {
                                        int i113 = RemoteActionCompatParcelizer + 125;
                                        IconCompatParcelizer = i113 % Fields.SpotShadowColor;
                                        int i114 = i113 % 2;
                                        uri = Uri.parse(str5);
                                        r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w r8lambda2fbyaooocvqhxqp2nim5pmocd5w3 = (r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w) ((r8lambda0tFkXN0c4UQsJxVxyejUo1BomY) iOParser$Decoder.RemoteActionCompatParcelizer);
                                        uri.getClass();
                                        objArr = new Object[]{r8lambda2fbyaooocvqhxqp2nim5pmocd5w3.serializer.RemoteActionCompatParcelizer(uri), r8lambdaEdQQWzTg5FJP9FEnVxOS8uVofXM.read};
                                        c = 45513;
                                        b = -1803334089;
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                                            sdkClickHandler = new ResponseData(str2, uri, responseData1, numValueOf);
                                        } else {
                                            sdkClickHandler = new SdkClickHandler(str2, uri, responseData1, numValueOf);
                                        }
                                        logerrormessagei = sdkClickHandler;
                                    } else {
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                    }
                                    break;
                                case 603143124:
                                    if (!str4.equals("STOP_WORKING")) {
                                        logerrormessagei = new logErrorMessageI(mkdirchecked.text, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mkdirchecked.confirmationRequired, Boolean.TRUE}, getCieXyz.write())).booleanValue(), responseData1, numValueOf, z);
                                        c = 45513;
                                        b = -1803334089;
                                    } else {
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                    }
                                    break;
                                case 1343887451:
                                    if (!str4.equals("END_BREAK")) {
                                        logerrormessagei = new readField(str2, responseData1, numValueOf, z);
                                        c = 45513;
                                        b = -1803334089;
                                    } else {
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                    }
                                    break;
                                case 1467773711:
                                    if (!str4.equals("REQUEST_BREAK")) {
                                        logerrormessagei = new retrySendingI(str2, responseData1, numValueOf, z);
                                        c = 45513;
                                        b = -1803334089;
                                    } else {
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                    }
                                    break;
                                case 1741202138:
                                    if (!str4.equals("CANCEL_BREAK")) {
                                        logerrormessagei = new isPlayTrackingEnabled(str2, responseData1, numValueOf);
                                        c = 45513;
                                        b = -1803334089;
                                    } else {
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                    }
                                    break;
                                default:
                                    c = 45513;
                                    b = -1803334089;
                                    logerrormessagei = null;
                                    break;
                            }
                            if (logerrormessagei != null) {
                                arrayList.add(logerrormessagei);
                            }
                            i++;
                            it = it3;
                        } else {
                            SQLite.serializer();
                            throw null;
                        }
                    }
                    i2 = 1;
                    sessionResponseData = new SessionResponseData(sdkClickHandler1, arrayList, true);
                } else {
                    mkdirChecked mkdirchecked4 = multiDexV14JBMR11ElementConstructor.action;
                    if (mkdirchecked4 != null) {
                        list2 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{mkdirchecked4}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    }
                }
                list = list2;
                multiDexV14ICSElementConstructor = multiDexV14JBMR11ElementConstructor.description;
                if (multiDexV14ICSElementConstructor != null) {
                    String str11 = multiDexV14ICSElementConstructor.text;
                    str6 = multiDexV14ICSElementConstructor.style;
                    iHashCode2 = str6.hashCode();
                    if (iHashCode2 != -1867169789) {
                        if (iHashCode2 != 92899676) {
                            if (!str6.equals("alert")) {
                                sendsdkclicki = sendSdkClickI.ALERT;
                            } else {
                                sendsdkclicki = sendSdkClickI.NEUTRAL;
                            }
                        } else {
                            i6 = IconCompatParcelizer + 97;
                            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                            if (i6 % 2 == 0) {
                                throw null;
                            }
                            if (iHashCode2 == 1952151455) {
                                sendsdkclicki = sendSdkClickI.CRITICAL;
                            } else {
                                sendsdkclicki = sendSdkClickI.NEUTRAL;
                            }
                        }
                    } else if (str6.equals("success")) {
                        sendsdkclicki = sendSdkClickI.SUCCESS;
                    } else {
                        sendsdkclicki = sendSdkClickI.NEUTRAL;
                    }
                    sdkClickHandler1 = new SdkClickHandler1(str11, sendsdkclicki);
                } else {
                    sdkClickHandler1 = null;
                }
                arrayList = new ArrayList();
                it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    next = it.next();
                    if (i >= 0) {
                        mkdirchecked = (mkdirChecked) next;
                        str = mkdirchecked.style;
                        str2 = mkdirchecked.text;
                        saveLong.Companion.getClass();
                        it2 = saveLong.getEntries().iterator();
                        int i115 = IconCompatParcelizer + 63;
                        RemoteActionCompatParcelizer = i115 % Fields.SpotShadowColor;
                        int i116 = i115 % 2;
                        do {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                            } else {
                                next2 = null;
                            }
                            savelong = (saveLong) next2;
                            if (savelong == null) {
                                i3 = -1;
                            } else {
                                i3 = saveString.write[savelong.ordinal()];
                            }
                            if (i3 != -1) {
                                int i117 = IconCompatParcelizer + 45;
                                RemoteActionCompatParcelizer = i117 % Fields.SpotShadowColor;
                                if (i117 % 2 != 0) {
                                }
                            } else {
                                responseData1 = null;
                            }
                            if (responseData1 == null) {
                                if (i == 0) {
                                    responseData1 = ResponseData1.SMALL_PRIMARY;
                                } else {
                                    responseData1 = ResponseData1.SMALL_SECONDARY;
                                }
                            }
                            str3 = mkdirchecked.icon;
                            if (z) {
                                it3 = it;
                                numValueOf = null;
                            } else {
                                i4 = RemoteActionCompatParcelizer + 63;
                                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                                if (i4 % 2 != 0) {
                                    iHashCode = str3.hashCode();
                                    if (iHashCode != -1015391860) {
                                        it3 = it;
                                        if (str3.equals("go_offline")) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(R.drawable.ic_power_on_off);
                                        }
                                    } else {
                                        i5 = RemoteActionCompatParcelizer + 41;
                                        it3 = it;
                                        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                                        if (i5 % 2 != 0) {
                                            Object obj5 = null;
                                            obj5.hashCode();
                                            throw null;
                                        }
                                        if (iHashCode != 197280525) {
                                            if (iHashCode == 1881624054) {
                                                numValueOf2 = Integer.valueOf(R.drawable.ic_play);
                                                numValueOf = numValueOf2;
                                            }
                                            numValueOf = null;
                                        } else if (str3.equals("session_pause")) {
                                            numValueOf2 = Integer.valueOf(R.drawable.ic_timer_pause);
                                            numValueOf = numValueOf2;
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                } else {
                                    str3.hashCode();
                                    throw null;
                                }
                            }
                            str4 = mkdirchecked.type;
                            switch (str4.hashCode()) {
                                case -2057707738:
                                    if (str4.equals("URL_ACTION")) {
                                        int i118 = RemoteActionCompatParcelizer + 125;
                                        IconCompatParcelizer = i118 % Fields.SpotShadowColor;
                                        int i119 = i118 % 2;
                                        uri = Uri.parse(str5);
                                        r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w r8lambda2fbyaooocvqhxqp2nim5pmocd5w4 = (r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w) ((r8lambda0tFkXN0c4UQsJxVxyejUo1BomY) iOParser$Decoder.RemoteActionCompatParcelizer);
                                        uri.getClass();
                                        objArr = new Object[]{r8lambda2fbyaooocvqhxqp2nim5pmocd5w4.serializer.RemoteActionCompatParcelizer(uri), r8lambdaEdQQWzTg5FJP9FEnVxOS8uVofXM.read};
                                        c = 45513;
                                        b = -1803334089;
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                                            sdkClickHandler = new ResponseData(str2, uri, responseData1, numValueOf);
                                        } else {
                                            sdkClickHandler = new SdkClickHandler(str2, uri, responseData1, numValueOf);
                                        }
                                        logerrormessagei = sdkClickHandler;
                                    } else {
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                    }
                                    break;
                                case 603143124:
                                    if (!str4.equals("STOP_WORKING")) {
                                        logerrormessagei = new logErrorMessageI(mkdirchecked.text, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mkdirchecked.confirmationRequired, Boolean.TRUE}, getCieXyz.write())).booleanValue(), responseData1, numValueOf, z);
                                        c = 45513;
                                        b = -1803334089;
                                    } else {
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                    }
                                    break;
                                case 1343887451:
                                    if (!str4.equals("END_BREAK")) {
                                        logerrormessagei = new readField(str2, responseData1, numValueOf, z);
                                        c = 45513;
                                        b = -1803334089;
                                    } else {
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                    }
                                    break;
                                case 1467773711:
                                    if (!str4.equals("REQUEST_BREAK")) {
                                        logerrormessagei = new retrySendingI(str2, responseData1, numValueOf, z);
                                        c = 45513;
                                        b = -1803334089;
                                    } else {
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                    }
                                    break;
                                case 1741202138:
                                    if (!str4.equals("CANCEL_BREAK")) {
                                        logerrormessagei = new isPlayTrackingEnabled(str2, responseData1, numValueOf);
                                        c = 45513;
                                        b = -1803334089;
                                    } else {
                                        c = 45513;
                                        b = -1803334089;
                                        logerrormessagei = null;
                                    }
                                    break;
                                default:
                                    c = 45513;
                                    b = -1803334089;
                                    logerrormessagei = null;
                                    break;
                            }
                            if (logerrormessagei != null) {
                                arrayList.add(logerrormessagei);
                            }
                            i++;
                            it = it3;
                        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((saveLong) next2).getKey(), str}, getCieXyz.write())).booleanValue());
                        savelong = (saveLong) next2;
                        if (savelong == null) {
                            i3 = -1;
                        } else {
                            i3 = saveString.write[savelong.ordinal()];
                        }
                        if (i3 != -1) {
                            int i1110 = IconCompatParcelizer + 45;
                            RemoteActionCompatParcelizer = i1110 % Fields.SpotShadowColor;
                            if (i1110 % 2 != 0) {
                            }
                        } else {
                            responseData1 = null;
                        }
                        if (responseData1 == null) {
                            if (i == 0) {
                                responseData1 = ResponseData1.SMALL_PRIMARY;
                            } else {
                                responseData1 = ResponseData1.SMALL_SECONDARY;
                            }
                        }
                        str3 = mkdirchecked.icon;
                        if (z) {
                            it3 = it;
                            numValueOf = null;
                        } else {
                            i4 = RemoteActionCompatParcelizer + 63;
                            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                iHashCode = str3.hashCode();
                                if (iHashCode != -1015391860) {
                                    it3 = it;
                                    if (str3.equals("go_offline")) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(R.drawable.ic_power_on_off);
                                    }
                                } else {
                                    i5 = RemoteActionCompatParcelizer + 41;
                                    it3 = it;
                                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                                    if (i5 % 2 != 0) {
                                        Object obj6 = null;
                                        obj6.hashCode();
                                        throw null;
                                    }
                                    if (iHashCode != 197280525) {
                                        if (iHashCode == 1881624054) {
                                            numValueOf2 = Integer.valueOf(R.drawable.ic_play);
                                            numValueOf = numValueOf2;
                                        }
                                        numValueOf = null;
                                    } else if (str3.equals("session_pause")) {
                                        numValueOf2 = Integer.valueOf(R.drawable.ic_timer_pause);
                                        numValueOf = numValueOf2;
                                    } else {
                                        numValueOf = null;
                                    }
                                }
                            } else {
                                str3.hashCode();
                                throw null;
                            }
                        }
                        str4 = mkdirchecked.type;
                        switch (str4.hashCode()) {
                            case -2057707738:
                                if (str4.equals("URL_ACTION")) {
                                    int i1111 = RemoteActionCompatParcelizer + 125;
                                    IconCompatParcelizer = i1111 % Fields.SpotShadowColor;
                                    int i1112 = i1111 % 2;
                                    uri = Uri.parse(str5);
                                    r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w r8lambda2fbyaooocvqhxqp2nim5pmocd5w5 = (r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w) ((r8lambda0tFkXN0c4UQsJxVxyejUo1BomY) iOParser$Decoder.RemoteActionCompatParcelizer);
                                    uri.getClass();
                                    objArr = new Object[]{r8lambda2fbyaooocvqhxqp2nim5pmocd5w5.serializer.RemoteActionCompatParcelizer(uri), r8lambdaEdQQWzTg5FJP9FEnVxOS8uVofXM.read};
                                    c = 45513;
                                    b = -1803334089;
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                                        sdkClickHandler = new ResponseData(str2, uri, responseData1, numValueOf);
                                    } else {
                                        sdkClickHandler = new SdkClickHandler(str2, uri, responseData1, numValueOf);
                                    }
                                    logerrormessagei = sdkClickHandler;
                                } else {
                                    c = 45513;
                                    b = -1803334089;
                                    logerrormessagei = null;
                                }
                                break;
                            case 603143124:
                                if (!str4.equals("STOP_WORKING")) {
                                    logerrormessagei = new logErrorMessageI(mkdirchecked.text, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mkdirchecked.confirmationRequired, Boolean.TRUE}, getCieXyz.write())).booleanValue(), responseData1, numValueOf, z);
                                    c = 45513;
                                    b = -1803334089;
                                } else {
                                    c = 45513;
                                    b = -1803334089;
                                    logerrormessagei = null;
                                }
                                break;
                            case 1343887451:
                                if (!str4.equals("END_BREAK")) {
                                    logerrormessagei = new readField(str2, responseData1, numValueOf, z);
                                    c = 45513;
                                    b = -1803334089;
                                } else {
                                    c = 45513;
                                    b = -1803334089;
                                    logerrormessagei = null;
                                }
                                break;
                            case 1467773711:
                                if (!str4.equals("REQUEST_BREAK")) {
                                    logerrormessagei = new retrySendingI(str2, responseData1, numValueOf, z);
                                    c = 45513;
                                    b = -1803334089;
                                } else {
                                    c = 45513;
                                    b = -1803334089;
                                    logerrormessagei = null;
                                }
                                break;
                            case 1741202138:
                                if (!str4.equals("CANCEL_BREAK")) {
                                    logerrormessagei = new isPlayTrackingEnabled(str2, responseData1, numValueOf);
                                    c = 45513;
                                    b = -1803334089;
                                } else {
                                    c = 45513;
                                    b = -1803334089;
                                    logerrormessagei = null;
                                }
                                break;
                            default:
                                c = 45513;
                                b = -1803334089;
                                logerrormessagei = null;
                                break;
                        }
                        if (logerrormessagei != null) {
                            arrayList.add(logerrormessagei);
                        }
                        i++;
                        it = it3;
                    } else {
                        SQLite.serializer();
                        throw null;
                    }
                }
                i2 = 1;
                sessionResponseData = new SessionResponseData(sdkClickHandler1, arrayList, true);
            }
            getinstalltracked.write = i2;
            if (flowCollector.emit(sessionResponseData, getinstalltracked) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            int i20 = RemoteActionCompatParcelizer + 3;
            IconCompatParcelizer = i20 % Fields.SpotShadowColor;
            if (i20 % 2 != 0 ? i10 == 1 : i10 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:149:0x0290  */
    /* JADX WARN: Code duplicated, block: B:187:0x035e  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a5 A[PHI: r4 r8
  0x03a5: PHI (r4v52 o.canDropOver) = (r4v51 o.canDropOver), (r4v54 o.canDropOver) binds: [B:201:0x03a3, B:198:0x0399] A[DONT_GENERATE, DONT_INLINE]
  0x03a5: PHI (r8v45 int) = (r8v44 int), (r8v47 int) binds: [B:201:0x03a3, B:198:0x0399] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:236:0x0445  */
    /* JADX WARN: Code duplicated, block: B:265:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:300:0x0553  */
    /* JADX WARN: Code duplicated, block: B:311:0x0578  */
    /* JADX WARN: Code duplicated, block: B:332:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:354:0x067d  */
    /* JADX WARN: Code duplicated, block: B:372:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:394:0x0750  */
    /* JADX WARN: Code duplicated, block: B:404:0x0772  */
    /* JADX WARN: Code duplicated, block: B:430:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:446:0x081d  */
    /* JADX WARN: Code duplicated, block: B:447:0x0820  */
    /* JADX WARN: Code duplicated, block: B:449:0x0823  */
    /* JADX WARN: Code duplicated, block: B:452:0x0838  */
    /* JADX WARN: Code duplicated, block: B:459:0x0847  */
    /* JADX WARN: Code duplicated, block: B:461:0x085f  */
    /* JADX WARN: Code duplicated, block: B:462:0x086a  */
    /* JADX WARN: Code duplicated, block: B:466:0x0873  */
    /* JADX WARN: Code duplicated, block: B:468:0x0883  */
    /* JADX WARN: Code duplicated, block: B:470:0x0886  */
    /* JADX WARN: Code duplicated, block: B:472:0x088f  */
    /* JADX WARN: Code duplicated, block: B:479:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:497:0x0909  */
    /* JADX WARN: Code duplicated, block: B:552:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:596:0x0caf  */
    /* JADX WARN: Code duplicated, block: B:62:0x0102  */
    /* JADX WARN: Code duplicated, block: B:633:0x0841 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0171  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v42 java.lang.Object, still in use, count: 2, list:
          (r2v42 java.lang.Object) from 0x0813: INSTANCE_OF (r2v42 java.lang.Object) A[WRAPPED] (LINE:1928) o.AndroidViewBindinglambda00
          (r2v42 java.lang.Object) from 0x0819: PHI (r2 I:??) = (r2v29 java.lang.Object), (r2v42 java.lang.Object) binds: [B:443:0x0818, B:631:0x0819] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object r38, o.ShortNewsContentCardView r39) {
        /*
            Method dump skipped, instruction units count: 3394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public Object emit(LocationMatcherResult locationMatcherResult, ShortNewsContentCardView shortNewsContentCardView) {
        k7ExternalSyntheticLambda3 k7externalsyntheticlambda3;
        MutableStateFlow mutableStateFlow;
        String str;
        int i = 2 % 2;
        MapNavigationImpl mapNavigationImpl = (MapNavigationImpl) this.serializer;
        if (shortNewsContentCardView instanceof k7ExternalSyntheticLambda3) {
            int i2 = RemoteActionCompatParcelizer + 49;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            k7externalsyntheticlambda3 = (k7ExternalSyntheticLambda3) shortNewsContentCardView;
            int i4 = k7externalsyntheticlambda3.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                k7externalsyntheticlambda3.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                k7externalsyntheticlambda3 = new k7ExternalSyntheticLambda3(this, shortNewsContentCardView);
            }
        } else {
            k7externalsyntheticlambda3 = new k7ExternalSyntheticLambda3(this, shortNewsContentCardView);
        }
        Object obj = k7externalsyntheticlambda3.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = k7externalsyntheticlambda3.IconCompatParcelizer;
        if (i5 != 0) {
            if (i5 == 1) {
                locationMatcherResult = k7externalsyntheticlambda3.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                if (i5 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = IconCompatParcelizer + 91;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                locationMatcherResult = k7externalsyntheticlambda3.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            mutableStateFlow = mapNavigationImpl.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.serializer.RemoteActionCompatParcelizer;
            locationMatcherResult.getClass();
            RoadComponent roadComponent = (RoadComponent) onContentCardDismissed.MediaMetadataCompat((List) locationMatcherResult.road.components);
            str = roadComponent != null ? roadComponent.text : null;
            if (str != null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                mutableStateFlow.write(g9.write);
            } else {
                mutableStateFlow.write(new gg(str));
            }
            return createFromParcel.INSTANCE;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (UseCaseAdditionSimulator.isNavigationInActiveGuidance((MapboxNavigation) this.read)) {
            ia iaVar = mapNavigationImpl.ResultReceiver;
            locationMatcherResult.getClass();
            MapboxNavigationViewportDataSource mapboxNavigationViewportDataSource = iaVar.ParcelableVolumeInfo;
            if (mapboxNavigationViewportDataSource != null) {
                Location location = locationMatcherResult.enhancedLocation;
                mapboxNavigationViewportDataSource.targetLocation = location;
                OverviewViewportDataSource overviewViewportDataSource = mapboxNavigationViewportDataSource.overviewViewportDataSource;
                overviewViewportDataSource.getClass();
                overviewViewportDataSource.targetLocation = location;
                mapboxNavigationViewportDataSource.evaluate();
                if (iaVar.MediaSessionCompatQueueItem) {
                    int i8 = RemoteActionCompatParcelizer + 19;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = iaVar.read;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        int i10 = IconCompatParcelizer + 13;
                        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    iaVar.MediaSessionCompatQueueItem = false;
                    MapView mapView = iaVar.MediaMetadataCompat;
                    if (mapView != null) {
                        SQLite.getCompass(mapView).setEnabled(false);
                        int i12 = RemoteActionCompatParcelizer + 97;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    }
                    MapView mapView2 = iaVar.MediaMetadataCompat;
                    if (mapView2 != null) {
                        mapView2.setKeepScreenOn(true);
                    }
                    MapView mapView3 = iaVar.MediaMetadataCompat;
                    if (mapView3 != null) {
                        CameraAnimationsPlugin camera = CameraAnimationsUtils.getCamera(mapView3);
                        ie ieVar = iaVar.PlaybackStateCompatCustomAction;
                        ieVar.getClass();
                        ((CameraAnimationsPluginImpl) camera).lifecycleListeners.add(ieVar);
                    }
                    iaVar.read();
                }
            }
        }
        k7externalsyntheticlambda3.write = locationMatcherResult;
        k7externalsyntheticlambda3.IconCompatParcelizer = 1;
        if (MapNavigationImpl.access$updatePuckPosition(mapNavigationImpl, locationMatcherResult, k7externalsyntheticlambda3) != coroutineSingletons) {
        }
        return coroutineSingletons;
        SpeedLimitApi speedLimitApi = mapNavigationImpl.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        k7externalsyntheticlambda3.write = locationMatcherResult;
        k7externalsyntheticlambda3.IconCompatParcelizer = 2;
        if (speedLimitApi.onLocationMatcherResult$mapbox(locationMatcherResult, k7externalsyntheticlambda3) != coroutineSingletons) {
            int i14 = IconCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            mutableStateFlow = mapNavigationImpl.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.serializer.RemoteActionCompatParcelizer;
            locationMatcherResult.getClass();
            RoadComponent roadComponent2 = (RoadComponent) onContentCardDismissed.MediaMetadataCompat((List) locationMatcherResult.road.components);
            if (roadComponent2 != null) {
            }
            if (str != null) {
                mutableStateFlow.write(g9.write);
            } else {
                mutableStateFlow.write(g9.write);
            }
            return createFromParcel.INSTANCE;
        }
        return coroutineSingletons;
    }
}
