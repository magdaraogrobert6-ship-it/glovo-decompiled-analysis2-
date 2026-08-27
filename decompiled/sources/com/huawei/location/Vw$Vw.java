package com.huawei.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import androidx.activity.SystemBarStyle$Companion;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.huawei.riemann.common.api.location.CityTileCallback;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.ResourceLoadProgress;
import com.mapbox.common.ResourceLoadProgressCallback;
import com.mapbox.common.ResourceLoadResultCallback;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda1;
import com.mapbox.navigation.core.SetRoutes$RefreshRoutes$RefreshControllerRefresh;
import com.mapbox.navigation.core.routerefresh.RouteRefresherResult;
import com.mapbox.navigation.core.routerefresh.RoutesRefresherResult;
import com.mapbox.navigation.ui.utils.internal.resource.ResourceLoaderExtensionsKt;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.mapbox.navigator.RefreshRouteCallback;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.custom.password.data.CustomPasswordRepository$createPassword$1;
import com.roadrunner.delivery.ontheway.phonecall.data.PhoneCallRepository$getPhoneNumber$1;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.face.verification.domain.detection.DetectFaceWithFirebase;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2;
import io.sentry.SentryAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.AndroidWindowInfo_androidKt;
import o.BrazeExternalSyntheticLambda28;
import o.ComposeView;
import o.FeatureCombinationQueryImplExternalSyntheticLambda2;
import o.ParentDataModifier;
import o.ParentDataModifierDefaultImpls;
import o.PartialGapBuffer;
import o.Placeable;
import o.ProvideCompositionLocalsui;
import o.SemanticsPropertiesKtActionPropertyKey1;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessgetNumPad8cp;
import o.accessgetNumPadEntercp;
import o.accessgetNumPadRightParenthesiscp;
import o.accessgetParentLayoutDirection;
import o.accessgetSearchcp;
import o.accessgetSetTopBoxInputcp;
import o.accessgetSevencp;
import o.accessgetSlashcp;
import o.accessgetTvAntennaCablecp;
import o.calculateWindowSize;
import o.colorResource;
import o.createComposition;
import o.createFromParcel;
import o.findRelativeAdapterPositionIn;
import o.getAutoClearFocusBehavior4UtRPd4;
import o.getMeasurementConstraintsmsEJaDk;
import o.getMinusEK5gGoQ;
import o.getNavigateOutEK5gGoQ;
import o.getNineEK5gGoQ;
import o.getNotificationEK5gGoQ;
import o.getNumPad9EK5gGoQ;
import o.getNumPadDeleteEK5gGoQ;
import o.getQueryParameterslambda2;
import o.getStartEllipsisgIe3tQ8;
import o.hasPositionalLayerTransformations;
import o.inCompatibilityMode;
import o.insertOrUpdateTransformedNode;
import o.instance_delegatelambda0;
import o.isOpenInternalroom_runtime;
import o.isShowingLayoutBounds;
import o.notifyItemMoved;
import o.notifyItemRangeRemoved;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.pin;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.scale0AR0LA0default;
import o.sendInputCommandlambda0;
import o.setContentInsetEndWithActions;
import o.setFilterRedundantCalls;
import o.setInsetOffsetY;
import o.setRequestedFrameRate;
import o.setScrollState;
import o.setSemanticsInvalidatedui;
import o.setTextCompositionRangepsREZIo;
import o.setTransactionSuccessful;
import o.toContentCaptureSession;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class Vw$Vw implements accessgetNumPadRightParenthesiscp, CityTileCallback, RefreshRouteCallback, QueryRenderedFeaturesCallback, ResourceLoadProgressCallback, ResourceLoadResultCallback, setContentInsetEndWithActions {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public Object serializer;

    public Long getDelay() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 117;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Long l = (Long) this.IconCompatParcelizer;
        int i5 = i2 + 21;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return l;
    }

    public Long getDuration() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 69;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Long l = (Long) this.serializer;
        int i5 = i2 + 31;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return l;
    }

    public ProvideCompositionLocalsui read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 29;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ProvideCompositionLocalsui provideCompositionLocalsui = (ProvideCompositionLocalsui) this.serializer;
        int i4 = i2 + 45;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return provideCompositionLocalsui;
    }

    public Vw$Vw(byte b, int i) {
        this.read = i;
        if (i != 13) {
            this.serializer = new CopyOnWriteArraySet();
            this.IconCompatParcelizer = new CopyOnWriteArraySet();
        } else {
            AnalyticsServiceImpl analyticsServiceImpl = new AnalyticsServiceImpl(17);
            SentryAttributes sentryAttributes = new SentryAttributes();
            this.serializer = analyticsServiceImpl;
            this.IconCompatParcelizer = sentryAttributes;
        }
    }

    public setSemanticsInvalidatedui IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 91;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) this.serializer;
        int i5 = i2 + 53;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return setsemanticsinvalidatedui;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("Did not write as much data as expected.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((r1.write / r1.RemoteActionCompatParcelizer) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r1.write - r1.RemoteActionCompatParcelizer) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r2 = new o.setOnDetachui((byte[]) r4.IconCompatParcelizer);
        r1 = com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer + 75;
        com.huawei.location.Vw$Vw.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.setOnDetachui RemoteActionCompatParcelizer() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.huawei.location.Vw$Vw.write = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r4.serializer
            o.setSemanticsInvalidatedui r1 = (o.setSemanticsInvalidatedui) r1
            int r2 = r1.write
            int r1 = r1.RemoteActionCompatParcelizer
            int r2 = r2 / r1
            if (r2 != 0) goto L38
            goto L25
        L1a:
            java.lang.Object r1 = r4.serializer
            o.setSemanticsInvalidatedui r1 = (o.setSemanticsInvalidatedui) r1
            int r2 = r1.write
            int r1 = r1.RemoteActionCompatParcelizer
            int r2 = r2 - r1
            if (r2 != 0) goto L38
        L25:
            java.lang.Object r1 = r4.IconCompatParcelizer
            byte[] r1 = (byte[]) r1
            o.setOnDetachui r2 = new o.setOnDetachui
            r2.<init>(r1)
            int r1 = com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer
            int r1 = r1 + 75
            int r3 = r1 % 128
            com.huawei.location.Vw$Vw.write = r3
            int r1 = r1 % r0
            return r2
        L38:
            java.lang.String r0 = "Did not write as much data as expected."
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer():o.setOnDetachui");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return new o.ClipboardExtensions_androidKt((byte[]) r3.IconCompatParcelizer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("Did not write as much data as expected.");
        r1 = com.huawei.location.Vw$Vw.write + 43;
        com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (((o.ProvideCompositionLocalsui) r3.serializer).RemoteActionCompatParcelizer() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (((o.ProvideCompositionLocalsui) r3.serializer).RemoteActionCompatParcelizer() == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.ClipboardExtensions_androidKt serializer() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.location.Vw$Vw.write
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            java.lang.Object r1 = r3.serializer
            o.ProvideCompositionLocalsui r1 = (o.ProvideCompositionLocalsui) r1
            int r1 = r1.RemoteActionCompatParcelizer()
            r2 = 25
            int r2 = r2 / 0
            if (r1 != 0) goto L31
            goto L27
        L1d:
            java.lang.Object r1 = r3.serializer
            o.ProvideCompositionLocalsui r1 = (o.ProvideCompositionLocalsui) r1
            int r1 = r1.RemoteActionCompatParcelizer()
            if (r1 != 0) goto L31
        L27:
            o.ClipboardExtensions_androidKt r0 = new o.ClipboardExtensions_androidKt
            java.lang.Object r1 = r3.IconCompatParcelizer
            byte[] r1 = (byte[]) r1
            r0.<init>(r1)
            return r0
        L31:
            java.lang.String r1 = "Did not write as much data as expected."
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r1)
            int r1 = com.huawei.location.Vw$Vw.write
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r0 = 0
            if (r1 == 0) goto L43
            return r0
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.location.Vw$Vw.serializer():o.ClipboardExtensions_androidKt");
    }

    public createComposition write() {
        int i = 2 % 2;
        createComposition createcomposition = new createComposition((String) this.serializer, (getAutoClearFocusBehavior4UtRPd4) this.IconCompatParcelizer);
        int i2 = RemoteActionCompatParcelizer + 45;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
        return createcomposition;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static PartialGapBuffer serializer(PartialGapBuffer partialGapBuffer, Boolean bool) {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 89;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
            if (bool != null) {
                if (Boolean.valueOf(partialGapBuffer.write).equals(bool)) {
                    if (bool.booleanValue()) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    int i5 = partialGapBuffer.read + i;
                    return new PartialGapBuffer(i5 >= 0 ? i5 : 0, bool.booleanValue(), partialGapBuffer.RemoteActionCompatParcelizer);
                }
                int i6 = RemoteActionCompatParcelizer + 77;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        } else if (bool != null) {
            if (Boolean.valueOf(partialGapBuffer.write).equals(bool)) {
                if (bool.booleanValue()) {
                    i = 1;
                } else {
                    i = -1;
                }
                int i8 = partialGapBuffer.read + i;
                return new PartialGapBuffer(i8 >= 0 ? i8 : 0, bool.booleanValue(), partialGapBuffer.RemoteActionCompatParcelizer);
            }
            int i9 = RemoteActionCompatParcelizer + 77;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        int i11 = write + 77;
        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return partialGapBuffer;
    }

    public /* synthetic */ Vw$Vw(Object obj, int i, Object obj2) {
        this.read = i;
        this.serializer = obj;
        this.IconCompatParcelizer = obj2;
    }

    public /* synthetic */ Vw$Vw(Object obj, Object obj2, boolean z, int i) {
        this.read = i;
        this.serializer = obj2;
        this.IconCompatParcelizer = obj;
    }

    public Vw$Vw(Context context) {
        this.read = 3;
        this.IconCompatParcelizer = new AtomicLong(-1L);
        this.serializer = new accessgetSlashcp(context, null, accessgetSlashcp.IconCompatParcelizer, new accessgetSevencp("mlkit:vision"), accessgetNumPad8cp.IconCompatParcelizer);
    }

    public Vw$Vw(transferSessionPackageI transfersessionpackagei, g0 g0Var) {
        this.read = 20;
        transfersessionpackagei.getClass();
        g0Var.getClass();
        this.serializer = transfersessionpackagei;
        this.IconCompatParcelizer = g0Var;
    }

    @Override // com.huawei.riemann.common.api.location.CityTileCallback
    public byte[] get(long j) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 41;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        Handler handler = (Handler) this.IconCompatParcelizer;
        if (handler != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("tileId", j);
            Message messageObtain = Message.obtain();
            messageObtain.what = 18;
            messageObtain.setData(bundle);
            handler.sendMessageAtFrontOfQueue(messageObtain);
        } else {
            CityTileCallback cityTileCallback = (CityTileCallback) this.serializer;
            if (cityTileCallback != null) {
                int i4 = i2 + 123;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return cityTileCallback.get(j);
            }
            Log.e("SdmLocationManager", "hd and remote cb null");
        }
        return new byte[0];
    }

    public Vw$Vw(hasPositionalLayerTransformations haspositionallayertransformations, ExecuteApiRequest executeApiRequest) {
        this.read = 19;
        haspositionallayertransformations.getClass();
        executeApiRequest.getClass();
        this.serializer = haspositionallayertransformations;
        this.IconCompatParcelizer = executeApiRequest;
    }

    public Vw$Vw(transferSessionPackageI transfersessionpackagei, AuthRepository authRepository) {
        this.read = 17;
        transfersessionpackagei.getClass();
        authRepository.getClass();
        this.serializer = transfersessionpackagei;
        this.IconCompatParcelizer = authRepository;
    }

    public Vw$Vw(sendInputCommandlambda0 sendinputcommandlambda0, SendTestPushUseCase sendTestPushUseCase) {
        this.read = 22;
        sendinputcommandlambda0.getClass();
        sendTestPushUseCase.getClass();
        this.serializer = sendinputcommandlambda0;
        this.IconCompatParcelizer = sendTestPushUseCase;
    }

    public Vw$Vw(p0 p0Var, g0 g0Var) {
        this.read = 29;
        p0Var.getClass();
        g0Var.getClass();
        this.serializer = p0Var;
        this.IconCompatParcelizer = g0Var;
    }

    public Vw$Vw(setTextCompositionRangepsREZIo settextcompositionrangepsrezio, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.read = 18;
        settextcompositionrangepsrezio.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = settextcompositionrangepsrezio;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
    }

    public Vw$Vw(BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, g0 g0Var) {
        this.read = 24;
        brazeExternalSyntheticLambda28.getClass();
        g0Var.getClass();
        this.serializer = brazeExternalSyntheticLambda28;
        this.IconCompatParcelizer = g0Var;
    }

    public /* synthetic */ Vw$Vw(int i, char c) {
        this.read = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX INFO: renamed from: createPassword-gIAlu-s, reason: not valid java name */
    public Object m4509createPasswordgIAlus(insertOrUpdateTransformedNode insertorupdatetransformednode, ContinuationImpl continuationImpl) {
        CustomPasswordRepository$createPassword$1 customPasswordRepository$createPassword$1;
        int i = 2 % 2;
        if (continuationImpl instanceof CustomPasswordRepository$createPassword$1) {
            int i2 = RemoteActionCompatParcelizer + 103;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            customPasswordRepository$createPassword$1 = (CustomPasswordRepository$createPassword$1) continuationImpl;
            int i4 = customPasswordRepository$createPassword$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = RemoteActionCompatParcelizer + 121;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    customPasswordRepository$createPassword$1.RemoteActionCompatParcelizer = i4 >> Integer.MIN_VALUE;
                } else {
                    customPasswordRepository$createPassword$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
                }
            } else {
                customPasswordRepository$createPassword$1 = new CustomPasswordRepository$createPassword$1(this, continuationImpl);
            }
        } else {
            customPasswordRepository$createPassword$1 = new CustomPasswordRepository$createPassword$1(this, continuationImpl);
        }
        Object obj = customPasswordRepository$createPassword$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = customPasswordRepository$createPassword$1.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.IconCompatParcelizer;
            AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, insertorupdatetransformednode, shortNewsContentCardView, 8);
            customPasswordRepository$createPassword$1.RemoteActionCompatParcelizer = 1;
            Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(authRepository$logoutUser$2, customPasswordRepository$createPassword$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        int i7 = RemoteActionCompatParcelizer + 11;
        write = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0 ? i6 != 1 : i6 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        int i8 = RemoteActionCompatParcelizer + 117;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return obj2;
    }

    public Vw$Vw(DetectFaceWithFirebase detectFaceWithFirebase, OtpLogger otpLogger) {
        this.read = 26;
        detectFaceWithFirebase.getClass();
        otpLogger.getClass();
        this.serializer = detectFaceWithFirebase;
        this.IconCompatParcelizer = otpLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX INFO: renamed from: getPhoneNumber-0E7RQCE, reason: not valid java name */
    public Object m4510getPhoneNumber0E7RQCE(long j, String str, ContinuationImpl continuationImpl) {
        PhoneCallRepository$getPhoneNumber$1 phoneCallRepository$getPhoneNumber$1;
        int i = 2 % 2;
        if (continuationImpl instanceof PhoneCallRepository$getPhoneNumber$1) {
            int i2 = RemoteActionCompatParcelizer + 65;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            phoneCallRepository$getPhoneNumber$1 = (PhoneCallRepository$getPhoneNumber$1) continuationImpl;
            int i4 = phoneCallRepository$getPhoneNumber$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 105;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                phoneCallRepository$getPhoneNumber$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                phoneCallRepository$getPhoneNumber$1 = new PhoneCallRepository$getPhoneNumber$1(this, continuationImpl);
                int i7 = write + 33;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        } else {
            phoneCallRepository$getPhoneNumber$1 = new PhoneCallRepository$getPhoneNumber$1(this, continuationImpl);
            int i9 = write + 33;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        PhoneCallRepository$getPhoneNumber$1 phoneCallRepository$getPhoneNumber$2 = phoneCallRepository$getPhoneNumber$1;
        Object obj = phoneCallRepository$getPhoneNumber$2.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = phoneCallRepository$getPhoneNumber$2.RemoteActionCompatParcelizer;
        if (i11 != 0) {
            if (i11 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.IconCompatParcelizer;
        HistoryApiRequest$getHistory$2 historyApiRequest$getHistory$2 = new HistoryApiRequest$getHistory$2(this, j, str, (ShortNewsContentCardView) null, 4);
        phoneCallRepository$getPhoneNumber$2.RemoteActionCompatParcelizer = 1;
        Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(historyApiRequest$getHistory$2, phoneCallRepository$getPhoneNumber$2);
        if (objM4875invokegIAlus != coroutineSingletons) {
            return objM4875invokegIAlus;
        }
        int i12 = RemoteActionCompatParcelizer + 7;
        write = i12 % Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            return coroutineSingletons;
        }
        throw null;
    }

    public Vw$Vw(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.read = 25;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = AndroidWindowInfo_androidKt.read(new calculateWindowSize(Fields.RotationX));
    }

    public Vw$Vw(BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, setTransactionSuccessful settransactionsuccessful) {
        this.read = 21;
        brazeExternalSyntheticLambda28.getClass();
        settransactionsuccessful.getClass();
        this.serializer = brazeExternalSyntheticLambda28;
        this.IconCompatParcelizer = settransactionsuccessful;
    }

    @Override // com.mapbox.navigator.RefreshRouteCallback, com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        int i = 2 % 2;
        int i2 = this.read;
        expected.getClass();
        if (i2 == 12) {
            ((MapboxNavigation.AnonymousClass11) this.serializer).invoke((CancellableContinuationImpl) this.IconCompatParcelizer, expected);
            return;
        }
        if (i2 != 14) {
            ((ResourceLoaderExtensionsKt.AnonymousClass1) this.serializer).$onFinished.invoke(expected);
            Iterator it = ((Queue) this.IconCompatParcelizer).iterator();
            while (it.hasNext()) {
                ((ResourceLoaderExtensionsKt.AnonymousClass1) it.next()).$onFinished.invoke(expected);
            }
            return;
        }
        List list = (List) expected.getValue();
        if (list == null) {
            int i3 = write + 37;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            list = instance_delegatelambda0.write;
            int i4 = RemoteActionCompatParcelizer + 41;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 4 % 3;
            }
        }
        ((SafeContinuation) this.IconCompatParcelizer).resumeWith(SystemBarStyle$Companion.getIndexOfFirstFeature(list, (List) this.serializer));
    }

    @Override // o.setContentInsetEndWithActions
    public void serializer(FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Image imageRemoteActionCompatParcelizer = featureCombinationQueryImplExternalSyntheticLambda2.IconCompatParcelizer.RemoteActionCompatParcelizer();
        if (imageRemoteActionCompatParcelizer == null) {
            int i4 = RemoteActionCompatParcelizer + 57;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            featureCombinationQueryImplExternalSyntheticLambda2.close();
            return;
        }
        setRequestedFrameRate setrequestedframerateRemoteActionCompatParcelizer = setRequestedFrameRate.RemoteActionCompatParcelizer(imageRemoteActionCompatParcelizer, featureCombinationQueryImplExternalSyntheticLambda2.write.read());
        isShowingLayoutBounds isshowinglayoutbounds = (isShowingLayoutBounds) this.IconCompatParcelizer;
        Task taskOnSuccessTask = isshowinglayoutbounds.serializer(setrequestedframerateRemoteActionCompatParcelizer).onSuccessTask(new toContentCaptureSession(isshowinglayoutbounds, setrequestedframerateRemoteActionCompatParcelizer.read, setrequestedframerateRemoteActionCompatParcelizer.IconCompatParcelizer));
        RetryWithDelay$$ExternalSyntheticLambda1 retryWithDelay$$ExternalSyntheticLambda1 = new RetryWithDelay$$ExternalSyntheticLambda1(12, new RetryWithDelay$$ExternalSyntheticLambda0(8, this));
        zzw zzwVar = (zzw) taskOnSuccessTask;
        accessgetParentLayoutDirection accessgetparentlayoutdirection = Placeable.RemoteActionCompatParcelizer;
        zzwVar.addOnSuccessListener(accessgetparentlayoutdirection, retryWithDelay$$ExternalSyntheticLambda1);
        zzwVar.addOnFailureListener(accessgetparentlayoutdirection, new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(5));
        zzwVar.addOnCompleteListener(new getStartEllipsisgIe3tQ8(featureCombinationQueryImplExternalSyntheticLambda2, 1));
    }

    public Vw$Vw(x xVar, ResourceLoaderExtensionsKt.AnonymousClass1 anonymousClass1, Queue queue) {
        this.read = 15;
        queue.getClass();
        this.serializer = anonymousClass1;
        this.IconCompatParcelizer = queue;
    }

    public void onRoutesRefreshed(RoutesRefresherResult routesRefresherResult) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        routesRefresherResult.getClass();
        Iterator it = ((CopyOnWriteArraySet) this.serializer).iterator();
        while (it.hasNext()) {
            MapboxNavigation mapboxNavigation = ((MapboxNavigation$$ExternalSyntheticLambda1) it.next()).f$0;
            Object[] objArr = {routesRefresherResult.primaryRouteRefresherResult.route};
            int iSerializer = getQueryParameterslambda2.serializer();
            List list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
            ArrayList arrayList = routesRefresherResult.alternativesRouteRefresherResults;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int i4 = RemoteActionCompatParcelizer + 47;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    arrayList2.add(((RouteRefresherResult) it2.next()).route);
                    int i5 = 5 / 0;
                } else {
                    arrayList2.add(((RouteRefresherResult) it2.next()).route);
                }
            }
            mapboxNavigation.internalSetNavigationRoutes(onContentCardDismissed.IconCompatParcelizer(arrayList2, list), new SetRoutes$RefreshRoutes$RefreshControllerRefresh(routesRefresherResult), null);
        }
    }

    @Override // com.mapbox.common.ResourceLoadProgressCallback
    public void run(ResourceLoadProgress resourceLoadProgress) {
        int i = 2 % 2;
        resourceLoadProgress.getClass();
        Iterator it = ((Queue) this.IconCompatParcelizer).iterator();
        while (it.hasNext()) {
            int i2 = RemoteActionCompatParcelizer + 3;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ((ResourceLoaderExtensionsKt.AnonymousClass1) it.next()).getClass();
        }
        int i4 = RemoteActionCompatParcelizer + 41;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
    }

    public Vw$Vw(int i, int i2) {
        this.read = i2;
        if (i2 != 9) {
            byte[] bArr = new byte[i];
            this.IconCompatParcelizer = bArr;
            this.serializer = new setSemanticsInvalidatedui(bArr, i);
        } else {
            byte[] bArr2 = new byte[i];
            this.IconCompatParcelizer = bArr2;
            Logger logger = ComposeView.RemoteActionCompatParcelizer;
            this.serializer = new ProvideCompositionLocalsui(bArr2, 0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public Object invoke(String str, Cipher cipher, ContinuationImpl continuationImpl) throws Throwable {
        SemanticsPropertiesKtActionPropertyKey1 semanticsPropertiesKtActionPropertyKey1;
        setTextCompositionRangepsREZIo settextcompositionrangepsrezio;
        int i = 2 % 2;
        if (continuationImpl instanceof SemanticsPropertiesKtActionPropertyKey1) {
            semanticsPropertiesKtActionPropertyKey1 = (SemanticsPropertiesKtActionPropertyKey1) continuationImpl;
            int i2 = semanticsPropertiesKtActionPropertyKey1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                semanticsPropertiesKtActionPropertyKey1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                semanticsPropertiesKtActionPropertyKey1 = new SemanticsPropertiesKtActionPropertyKey1(this, continuationImpl);
            }
        } else {
            semanticsPropertiesKtActionPropertyKey1 = new SemanticsPropertiesKtActionPropertyKey1(this, continuationImpl);
        }
        Object obj = semanticsPropertiesKtActionPropertyKey1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = semanticsPropertiesKtActionPropertyKey1.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setTextCompositionRangepsREZIo settextcompositionrangepsrezio2 = (setTextCompositionRangepsREZIo) this.serializer;
            semanticsPropertiesKtActionPropertyKey1.IconCompatParcelizer = cipher;
            semanticsPropertiesKtActionPropertyKey1.write = settextcompositionrangepsrezio2;
            semanticsPropertiesKtActionPropertyKey1.RemoteActionCompatParcelizer = 1;
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.IconCompatParcelizer)).getClass();
            Object objWithContext = BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new LocalAuthDataSource.AnonymousClass2(cipher, str, shortNewsContentCardView, 4), semanticsPropertiesKtActionPropertyKey1);
            if (objWithContext == coroutineSingletons) {
                int i4 = RemoteActionCompatParcelizer + 119;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 20 / 0;
                }
                return coroutineSingletons;
            }
            obj = objWithContext;
            settextcompositionrangepsrezio = settextcompositionrangepsrezio2;
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = RemoteActionCompatParcelizer + 75;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                setTextCompositionRangepsREZIo settextcompositionrangepsrezio3 = semanticsPropertiesKtActionPropertyKey1.write;
                Cipher cipher2 = semanticsPropertiesKtActionPropertyKey1.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            }
            settextcompositionrangepsrezio = semanticsPropertiesKtActionPropertyKey1.write;
            cipher = semanticsPropertiesKtActionPropertyKey1.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i7 = RemoteActionCompatParcelizer + 59;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        obj.getClass();
        byte[] iv = cipher.getIV();
        iv.getClass();
        settextcompositionrangepsrezio.getClass();
        String strEncodeToString = Base64.encodeToString((byte[]) obj, 0);
        String strEncodeToString2 = Base64.encodeToString(iv, 0);
        SharedPreferences.Editor editorEdit = settextcompositionrangepsrezio.RemoteActionCompatParcelizer().edit();
        editorEdit.putString("SHARED_PREF_BIOMETRIC_PASSWORD", strEncodeToString);
        editorEdit.putString("SHARED_PREF_BIOMETRIC_IV", strEncodeToString2);
        editorEdit.apply();
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088 A[PHI: r7 r8
  0x0088: PHI (r7v7 boolean) = (r7v6 boolean), (r7v13 boolean) binds: [B:29:0x0086, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r8v10 com.roadrunner.login.logging.OtpLogger) = (r8v9 com.roadrunner.login.logging.OtpLogger), (r8v18 com.roadrunner.login.logging.OtpLogger) binds: [B:29:0x0086, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0090 A[DONT_INVERT, PHI: r7 r8
  0x0090: PHI (r7v11 boolean) = (r7v6 boolean), (r7v13 boolean) binds: [B:29:0x0086, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]
  0x0090: PHI (r8v15 com.roadrunner.login.logging.OtpLogger) = (r8v9 com.roadrunner.login.logging.OtpLogger), (r8v18 com.roadrunner.login.logging.OtpLogger) binds: [B:29:0x0086, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    public Object invoke(CameraImage cameraImage, ContinuationImpl continuationImpl) {
        setFilterRedundantCalls setfilterredundantcalls;
        Object objM4961invokegIAlus;
        boolean zBooleanValue;
        OtpLogger otpLogger;
        int i = 2 % 2;
        if (continuationImpl instanceof setFilterRedundantCalls) {
            setfilterredundantcalls = (setFilterRedundantCalls) continuationImpl;
            int i2 = setfilterredundantcalls.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = RemoteActionCompatParcelizer + 113;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    setfilterredundantcalls.RemoteActionCompatParcelizer = i2 >> Integer.MIN_VALUE;
                } else {
                    setfilterredundantcalls.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
                }
                int i4 = write + 5;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                setfilterredundantcalls = new setFilterRedundantCalls(this, continuationImpl);
            }
        } else {
            setfilterredundantcalls = new setFilterRedundantCalls(this, continuationImpl);
        }
        Object obj = setfilterredundantcalls.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = setfilterredundantcalls.RemoteActionCompatParcelizer;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            DetectFaceWithFirebase detectFaceWithFirebase = (DetectFaceWithFirebase) this.serializer;
            setfilterredundantcalls.RemoteActionCompatParcelizer = 1;
            objM4961invokegIAlus = detectFaceWithFirebase.m4961invokegIAlus(cameraImage, setfilterredundantcalls);
            if (objM4961invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4961invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4961invokegIAlus);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failure on ml kit face detection", new Object[0]);
            return setInsetOffsetY.serializer;
        }
        int i7 = write + 87;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            zBooleanValue = ((Boolean) objM4961invokegIAlus).booleanValue();
            otpLogger = (OtpLogger) this.IconCompatParcelizer;
            if (!zBooleanValue) {
                otpLogger.IconCompatParcelizer.logEvent("face_detection_success", null);
            } else {
                if (!zBooleanValue) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i8 = write + 101;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                otpLogger.IconCompatParcelizer.logEvent("face_detection_fail", null);
            }
        } else {
            zBooleanValue = ((Boolean) objM4961invokegIAlus).booleanValue();
            otpLogger = (OtpLogger) this.IconCompatParcelizer;
            if (zBooleanValue) {
                otpLogger.IconCompatParcelizer.logEvent("face_detection_success", null);
            } else {
                if (!zBooleanValue) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i10 = write + 101;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                otpLogger.IconCompatParcelizer.logEvent("face_detection_fail", null);
            }
        }
        if (zBooleanValue) {
            return setInsetOffsetY.write;
        }
        setInsetOffsetY setinsetoffsety = setInsetOffsetY.RemoteActionCompatParcelizer;
        int i12 = RemoteActionCompatParcelizer + 79;
        write = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return setinsetoffsety;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (r9 == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.huawei.location.Vw$Vw.write = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto Lbb
            boolean r1 = r9 instanceof o.TextInputServiceAndroidonEditCommand1
            if (r1 == 0) goto L22
            r1 = r9
            o.TextInputServiceAndroidonEditCommand1 r1 = (o.TextInputServiceAndroidonEditCommand1) r1
            int r3 = r1.RemoteActionCompatParcelizer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L22
            int r3 = r3 + r4
            r1.RemoteActionCompatParcelizer = r3
            goto L27
        L22:
            o.TextInputServiceAndroidonEditCommand1 r1 = new o.TextInputServiceAndroidonEditCommand1
            r1.<init>(r8, r9)
        L27:
            java.lang.Object r9 = r1.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.RemoteActionCompatParcelizer
            r5 = 1
            if (r4 == 0) goto L62
            int r6 = com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer
            int r6 = r6 + 77
            int r7 = r6 % 128
            com.huawei.location.Vw$Vw.write = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L3e
            if (r4 == 0) goto L5e
            goto L40
        L3e:
            if (r4 == r5) goto L5e
        L40:
            if (r4 != r0) goto L4f
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            int r1 = com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.location.Vw$Vw.write = r2
            int r1 = r1 % r0
            goto La9
        L4f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            int r9 = com.huawei.location.Vw$Vw.write
            int r9 = r9 + 49
            int r1 = r9 % 128
            com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer = r1
            int r9 = r9 % r0
            return r2
        L5e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L74
        L62:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            java.lang.Object r9 = r8.serializer
            o.sendInputCommandlambda0 r9 = (o.sendInputCommandlambda0) r9
            r1.RemoteActionCompatParcelizer = r5
            com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore r9 = r9.RemoteActionCompatParcelizer
            java.lang.Object r9 = r9.getTermsOfUseAccepted(r1)
            if (r9 != r3) goto L74
            goto La8
        L74:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto Lb5
            java.lang.Object r9 = r8.IconCompatParcelizer
            com.roadrunner.diagnostics.domain.SendTestPushUseCase r9 = (com.roadrunner.diagnostics.domain.SendTestPushUseCase) r9
            java.lang.Object r9 = r9.serializer
            o.getPhonePjHm6EEannotations r9 = (o.getPhonePjHm6EEannotations) r9
            com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl r9 = r9.serializer
            com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1 r9 = r9.serializer()
            com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.ObserveImageSharingUiState$invoke$$inlined$map$1 r2 = new com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.ObserveImageSharingUiState$invoke$$inlined$map$1
            r2.<init>(r9, r5)
            com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1 r9 = new com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1
            r4 = 7
            r9.<init>(r2, r4)
            com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1 r2 = new com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1
            r4 = 11
            r2.<init>(r9, r4)
            kotlinx.coroutines.flow.Flow r9 = kotlinx.coroutines.flow.FlowKt.serializer(r2)
            r1.RemoteActionCompatParcelizer = r0
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r9, r1)
            if (r9 != r3) goto La9
        La8:
            return r3
        La9:
            if (r9 == 0) goto Lb5
            int r9 = com.huawei.location.Vw$Vw.write
            int r9 = r9 + 113
            int r1 = r9 % 128
            com.huawei.location.Vw$Vw.RemoteActionCompatParcelizer = r1
            int r9 = r9 % r0
            goto Lb6
        Lb5:
            r5 = 0
        Lb6:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        Lbb:
            boolean r9 = r9 instanceof o.TextInputServiceAndroidonEditCommand1
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.location.Vw$Vw.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 int, still in use, count: 1, list:
  (r1v6 int) from 0x0039: SWITCH (r1v6 int)
 case 632538026: goto B:62:0x00ec
 case 632538027: goto B:58:0x00d7
 case 632538028: goto B:54:0x00cb
 default: goto B:66:0x00f8 A[RegionRef:SW:12]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public notifyItemRangeRemoved write(setScrollState setscrollstate) {
        float f;
        int i = 2 % 2;
        g0 g0Var = (g0) this.IconCompatParcelizer;
        Float f2 = setscrollstate.weight;
        g0Var.getClass();
        Float fWrite = g0.write(f2);
        String str = setscrollstate.size;
        if (str == null) {
            int i2 = write + 41;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (fWrite != null) {
                return new notifyItemMoved(fWrite.floatValue());
            }
        }
        ((p0) this.serializer).getClass();
        if (str != null) {
            switch (str) {
                case "spacing.00":
                    f = Dimensions.generateLayoutParams;
                    break;
                case "spacing.01":
                    f = Dimensions.getActionBarHideOffset;
                    break;
                case "spacing.02":
                    f = Dimensions.getNestedScrollAxes;
                    break;
                case "spacing.03":
                    f = Dimensions.setMenu;
                    break;
                case "spacing.04":
                    f = Dimensions.setActionBarVisibilityCallback;
                    break;
                case "spacing.05":
                    f = Dimensions.setHideOnContentScrollEnabled;
                    break;
                case "spacing.06":
                    f = Dimensions.setLogo;
                    break;
                case "spacing.07":
                    f = Dimensions.setHasNonEmbeddedTabs;
                    break;
                case "spacing.08":
                    f = Dimensions.setShowingForActionMode;
                    break;
                case "spacing.09":
                    f = Dimensions.setMenuPrepared;
                    int i4 = write + 53;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    break;
                default:
                    switch (str) {
                        case 632538026:
                            if (!str.equals("spacing.10")) {
                                f = Dimensions.getActionBarHideOffset;
                            } else {
                                f = Dimensions.setWindowCallback;
                            }
                            break;
                        case 632538027:
                            if (!str.equals("spacing.11")) {
                                int i6 = write + 61;
                                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                                f = Dimensions.getActionBarHideOffset;
                            } else {
                                f = Dimensions.setOverlayMode;
                            }
                            break;
                        case 632538028:
                            if (!str.equals("spacing.12")) {
                                f = Dimensions.getActionBarHideOffset;
                            } else {
                                f = Dimensions.setUiOptions;
                            }
                            break;
                        default:
                            f = Dimensions.getActionBarHideOffset;
                            break;
                    }
            }
        } else {
            f = Dimensions.getActionBarHideOffset;
        }
        return new findRelativeAdapterPositionIn(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 109;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) obj2;
        zzdz zzdzVar = (zzdz) obj;
        final int i4 = 1;
        if (this.read != 1) {
            zzdzVar.IconCompatParcelizer((GeofencingRequest) this.serializer, (PendingIntent) this.IconCompatParcelizer, parentDataModifierDefaultImpls);
            return;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) this.serializer;
        ParentDataModifier parentDataModifier = (ParentDataModifier) this.IconCompatParcelizer;
        if (zzdzVar.IconCompatParcelizer(zzo.zzj)) {
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) zzdzVar.MediaSessionCompatResultReceiverWrapper();
            zzee zzeeVar = new zzee(4, null, new getNavigateOutEK5gGoQ(parentDataModifierDefaultImpls), null, null);
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, currentLocationRequest);
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzeeVar);
            Parcel parcelZzb = getnumpaddeleteek5ggoq.zzb(92, parcelZza);
            final accessgetSearchcp accessgetsearchcpWrite = accessgetSetTopBoxInputcp.write(parcelZzb.readStrongBinder());
            parcelZzb.recycle();
            if (parentDataModifier != null) {
                parentDataModifier.RemoteActionCompatParcelizer(new pin() { // from class: com.google.android.gms.internal.location.zzeb
                    @Override // o.pin
                    public final void onCanceled() {
                        int i5 = i4;
                        accessgetSearchcp accessgetsearchcp = accessgetsearchcpWrite;
                        if (i5 != 0) {
                            try {
                                accessgetTvAntennaCablecp accessgettvantennacablecp = (accessgetTvAntennaCablecp) accessgetsearchcp;
                                Parcel parcelZza2 = accessgettvantennacablecp.zza();
                                try {
                                    accessgettvantennacablecp.write.transact(2, parcelZza2, null, 1);
                                    return;
                                } finally {
                                    parcelZza2.recycle();
                                }
                            } catch (RemoteException unused) {
                                return;
                            }
                        }
                        try {
                            accessgetTvAntennaCablecp accessgettvantennacablecp2 = (accessgetTvAntennaCablecp) accessgetsearchcp;
                            Parcel parcelZza3 = accessgettvantennacablecp2.zza();
                            try {
                                accessgettvantennacablecp2.write.transact(2, parcelZza3, null, 1);
                            } finally {
                                parcelZza3.recycle();
                            }
                        } catch (RemoteException unused2) {
                        }
                    }
                });
                return;
            }
            return;
        }
        final int i5 = 0;
        Object[] objArr = 0;
        if (zzdzVar.IconCompatParcelizer(zzo.zze)) {
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq2 = (getNumPadDeleteEK5gGoQ) zzdzVar.MediaSessionCompatResultReceiverWrapper();
            getNavigateOutEK5gGoQ getnavigateoutek5ggoq = new getNavigateOutEK5gGoQ(parentDataModifierDefaultImpls);
            Parcel parcelZza2 = getnumpaddeleteek5ggoq2.zza();
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza2, currentLocationRequest);
            parcelZza2.writeStrongBinder(getnavigateoutek5ggoq.asBinder());
            Parcel parcelZzb2 = getnumpaddeleteek5ggoq2.zzb(87, parcelZza2);
            final accessgetSearchcp accessgetsearchcpWrite2 = accessgetSetTopBoxInputcp.write(parcelZzb2.readStrongBinder());
            parcelZzb2.recycle();
            if (parentDataModifier != null) {
                parentDataModifier.RemoteActionCompatParcelizer(new pin() { // from class: com.google.android.gms.internal.location.zzeb
                    @Override // o.pin
                    public final void onCanceled() {
                        int i6 = i5;
                        accessgetSearchcp accessgetsearchcp = accessgetsearchcpWrite2;
                        if (i6 != 0) {
                            try {
                                accessgetTvAntennaCablecp accessgettvantennacablecp = (accessgetTvAntennaCablecp) accessgetsearchcp;
                                Parcel parcelZza3 = accessgettvantennacablecp.zza();
                                try {
                                    accessgettvantennacablecp.write.transact(2, parcelZza3, null, 1);
                                    return;
                                } finally {
                                    parcelZza3.recycle();
                                }
                            } catch (RemoteException unused) {
                                return;
                            }
                        }
                        try {
                            accessgetTvAntennaCablecp accessgettvantennacablecp2 = (accessgetTvAntennaCablecp) accessgetsearchcp;
                            Parcel parcelZza4 = accessgettvantennacablecp2.zza();
                            try {
                                accessgettvantennacablecp2.write.transact(2, parcelZza4, null, 1);
                            } finally {
                                parcelZza4.recycle();
                            }
                        } catch (RemoteException unused2) {
                        }
                    }
                });
                int i6 = write + 97;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return;
            }
            return;
        }
        scale0AR0LA0default scale0ar0la0defaultSerializer = MathKt.serializer(new getNineEK5gGoQ(zzdzVar, parentDataModifierDefaultImpls), getNumPad9EK5gGoQ.INSTANCE, "GetCurrentLocation");
        accessgetNumPadEntercp accessgetnumpadentercp = (accessgetNumPadEntercp) scale0ar0la0defaultSerializer.RemoteActionCompatParcelizer;
        Objects.requireNonNull(accessgetnumpadentercp);
        colorResource colorresource = new colorResource(scale0ar0la0defaultSerializer, parentDataModifierDefaultImpls, objArr == true ? 1 : 0, 25);
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls2 = new ParentDataModifierDefaultImpls();
        LocationRequest.Builder builder = new LocationRequest.Builder(currentLocationRequest.getPriority(), 0L);
        builder.setMinUpdateIntervalMillis(0L);
        builder.setDurationMillis(currentLocationRequest.getDurationMillis());
        builder.setGranularity(currentLocationRequest.getGranularity());
        builder.setMaxUpdateAgeMillis(currentLocationRequest.getMaxUpdateAgeMillis());
        builder.zzb(currentLocationRequest.zza());
        builder.zza(currentLocationRequest.zzb());
        builder.setWaitForAccurateLocation(true);
        builder.zzc(currentLocationRequest.zzc());
        zzdzVar.read(colorresource, builder.build(), parentDataModifierDefaultImpls2);
        parentDataModifierDefaultImpls2.RemoteActionCompatParcelizer.addOnCompleteListener(new getMeasurementConstraintsmsEJaDk(parentDataModifierDefaultImpls));
        if (parentDataModifier != null) {
            parentDataModifier.RemoteActionCompatParcelizer(new getNotificationEK5gGoQ(zzdzVar, accessgetnumpadentercp));
        }
    }
}
