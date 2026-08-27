package io.sentry;

import android.app.Application;
import android.content.Context;
import android.location.Location;
import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import androidx.sqlite.SQLite;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.ContextsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.maps.plugin.locationcomponent.LocationProvider;
import com.mapbox.maps.plugin.locationcomponent.LocationPuckManager;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import io.grpc.Status;
import io.grpc.internal.SharedResourcePool;
import io.sentry.protocol.IconCompatParcelizer;
import io.sentry.protocol.MediaBrowserCompatMediaItem;
import io.sentry.protocol.addObserverForBackInvoker;
import io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLSocket;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AddToSubscriptionGroupStep;
import o.BannerView;
import o.BannerViewExternalSyntheticLambda2;
import o.BrazeActionUtils;
import o.ExtensionWindowAreaStatusRequirements;
import o.FocusListener;
import o.FrameworkServiceWorkerClient;
import o.IBannerWebViewClientListener;
import o.QueryListener;
import o.WebViewBuilderException;
import o._get_messageWebView_lambda0;
import o.accesssetShouldRequestFrameworkListenToNetworkUpdatescp;
import o.addSerializedCardJsonToStoragelambda0;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.constructObjectQuietlydefault;
import o.endRearDisplaySession;
import o.executelambda2;
import o.executelambda4;
import o.getActionViewIntent;
import o.getArgs;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getDoubleOrNull;
import o.getExitAnim;
import o.getFragmentManager;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.getPresentationContext;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.hideCurrentlyDisplayingInAppMessage;
import o.inCompatibilityMode;
import o.invokeMethodQuietly;
import o.isBlank;
import o.isNullOrBlank;
import o.isOpenInternalroom_runtime;
import o.isTrackingEnabled;
import o.lambdaverifyPlayStorePurchase45;
import o.logHtmlClicklambda0;
import o.onCapabilitiesChanged;
import o.onMeasureChild;
import o.openUriWithActionViewFromPushlambda0;
import o.postAnimationRunner;
import o.prepareForActivityTransitionCarryover;
import o.publishErrorlambda1;
import o.r8lambda4drVSO69yYFm67jLKp9xaf1w31E;
import o.r8lambda5RMxLAQdv9DJX4ayDOD0F7rfqx4;
import o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw;
import o.r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY;
import o.r8lambdaJPvm7ZRd1Lj4xMBdTc04D7x6Y;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k;
import o.r8lambdacIxdbs1VMz7DJpiM5hikhHgartg;
import o.r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4;
import o.r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY;
import o.removeListener;
import o.requestBannersRefreshlambda1;
import o.setSdkAuthenticationSignaturelambda1;
import o.setUseTempTrackingTableroom_runtime;
import o.setVerticalBias;
import o.subscribeToBannersUpdateslambda2;
import o.subscribeToFeatureFlagsUpdateslambda0;
import o.transferSessionPackageI;
import o.truncateToByteLength;
import o.vg;
import o.x1;
import retrofit2.OkHttpCall$1;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class CombinedScopeView implements LocationProvider, FrameworkServiceWorkerClient, r8lambda6LGSESzBuanebUADYycWZpXP5Kw, BrazeActionUtils {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object write;

    @Override // o.FrameworkServiceWorkerClient
    public void RemoteActionCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 103;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
    }

    public CombinedScopeView(WebViewBuilderException webViewBuilderException, transferSessionPackageI transfersessionpackagei) {
        this.IconCompatParcelizer = 9;
        webViewBuilderException.getClass();
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = webViewBuilderException;
        this.read = transfersessionpackagei;
        this.write = SQLite.read(isTrackingEnabled.AVAILABLE, isTrackingEnabled.ENDING, isTrackingEnabled.READY, isTrackingEnabled.WORKING, isTrackingEnabled.ON_BREAK, isTrackingEnabled.ON_PAID_BREAK);
    }

    @Override // o.FrameworkServiceWorkerClient
    public void RemoteActionCompatParcelizer(Location location) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 5;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            notifyLocationUpdates(location);
            return;
        }
        notifyLocationUpdates(location);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.BrazeActionUtils
    public void RemoteActionCompatParcelizer(Throwable th, IBannerWebViewClientListener iBannerWebViewClientListener, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 61;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((BrazeActionUtils) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(th, iBannerWebViewClientListener, str);
        int i4 = serializer + 81;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.BrazeActionUtils
    public void write(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = serializer + 69;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((BrazeActionUtils) this.RemoteActionCompatParcelizer).write(bannerViewExternalSyntheticLambda2);
            int i3 = 91 / 0;
        } else {
            ((BrazeActionUtils) this.RemoteActionCompatParcelizer).write(bannerViewExternalSyntheticLambda2);
        }
        int i4 = serializer + 99;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.BrazeActionUtils
    public void IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).IconCompatParcelizer(str);
        int i4 = MediaBrowserCompatMediaItem + 97;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.BrazeActionUtils
    public void IconCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 59;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).IconCompatParcelizer(str, str2);
        } else {
            write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).IconCompatParcelizer(str, str2);
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.BrazeActionUtils
    public void IconCompatParcelizer(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 29;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).IconCompatParcelizer(getchildstepiteratorandroid_sdk_ui_release);
        } else {
            write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).IconCompatParcelizer(getchildstepiteratorandroid_sdk_ui_release);
            int i3 = 23 / 0;
        }
    }

    @Override // o.BrazeActionUtils
    public MediaBrowserCompatMediaItem ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 15;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            PlaybackStateCompat().write();
            throw null;
        }
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItemWrite = PlaybackStateCompat().write();
        int i3 = MediaBrowserCompatMediaItem + 31;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
        return mediaBrowserCompatMediaItemWrite;
    }

    @Override // o.BrazeActionUtils
    public void RemoteActionCompatParcelizer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        int i = 2 % 2;
        int i2 = serializer + 33;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).RemoteActionCompatParcelizer(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        int i4 = MediaBrowserCompatMediaItem + 3;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.BrazeActionUtils
    public void RemoteActionCompatParcelizer(r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4 r8lambdan7tscdbgkncn7oadlcxuk9aaf4) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).RemoteActionCompatParcelizer(r8lambdan7tscdbgkncn7oadlcxuk9aaf4);
        int i4 = serializer + 3;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.BrazeActionUtils
    public SentryOptions ResultReceiver() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((BrazeActionUtils) this.RemoteActionCompatParcelizer).ResultReceiver();
        }
        ((BrazeActionUtils) this.RemoteActionCompatParcelizer).ResultReceiver();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.BrazeActionUtils
    public void read(addObserverForBackInvoker addobserverforbackinvoker) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 7;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).read(addobserverforbackinvoker);
        int i4 = MediaBrowserCompatMediaItem + 51;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.BrazeActionUtils
    public void read(_get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        int i = 2 % 2;
        int i2 = serializer + 21;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).read(_get_messagewebview_lambda0);
        } else {
            write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).read(_get_messagewebview_lambda0);
            int i3 = 91 / 0;
        }
    }

    @Override // o.BrazeActionUtils
    public void read(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1, executelambda4 executelambda4Var) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).read(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
            obj.hashCode();
            throw null;
        }
        write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).read(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
        int i3 = MediaBrowserCompatMediaItem + 85;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.BrazeActionUtils
    public void write() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).write();
        int i4 = serializer + 37;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.BrazeActionUtils
    public _get_messageWebView_lambda0 ComponentActivity() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 49;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).ComponentActivity();
            obj.hashCode();
            throw null;
        }
        _get_messageWebView_lambda0 _get_messagewebview_lambda0ComponentActivity = write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).ComponentActivity();
        int i3 = serializer + 91;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return _get_messagewebview_lambda0ComponentActivity;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.BrazeActionUtils
    public logHtmlClicklambda0 RemoteActionCompatParcelizer(r8lambdaJPvm7ZRd1Lj4xMBdTc04D7x6Y r8lambdajpvm7zrd1lj4xmbdtc04d7x6y) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 1;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).RemoteActionCompatParcelizer(r8lambdajpvm7zrd1lj4xmbdtc04d7x6y);
            throw null;
        }
        logHtmlClicklambda0 loghtmlclicklambda0RemoteActionCompatParcelizer = write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).RemoteActionCompatParcelizer(r8lambdajpvm7zrd1lj4xmbdtc04d7x6y);
        int i3 = serializer + 23;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return loghtmlclicklambda0RemoteActionCompatParcelizer;
    }

    @Override // o.BrazeActionUtils
    public OkHttpCall$1 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
        int i = 2 % 2;
        int i2 = serializer + 13;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        OkHttpCall$1 okHttpCall$1R8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        int i4 = MediaBrowserCompatMediaItem + 45;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return okHttpCall$1R8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        }
        throw null;
    }

    @Override // o.BrazeActionUtils
    public _get_messageWebView_lambda0 serializer(r8lambda5RMxLAQdv9DJX4ayDOD0F7rfqx4 r8lambda5rmxlaqdv9djx4aydod0f7rfqx4) {
        int i = 2 % 2;
        int i2 = serializer + 103;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).serializer(r8lambda5rmxlaqdv9djx4aydod0f7rfqx4);
        }
        int i3 = 51 / 0;
        return write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).serializer(r8lambda5rmxlaqdv9djx4aydod0f7rfqx4);
    }

    @Override // o.BrazeActionUtils
    public logHtmlClicklambda0 serializer() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        logHtmlClicklambda0 loghtmlclicklambda0Serializer = write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).serializer();
        int i4 = serializer + 63;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return loghtmlclicklambda0Serializer;
    }

    @Override // o.BrazeActionUtils
    public List MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 87;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CopyOnWriteArrayList copyOnWriteArrayListRemoteActionCompatParcelizer = ContextsKt.RemoteActionCompatParcelizer((CopyOnWriteArrayList) MediaDescriptionCompat());
        int i4 = MediaBrowserCompatMediaItem + 55;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return copyOnWriteArrayListRemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.FrameworkServiceWorkerClient
    public void PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 109;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.IconCompatParcelizer != 0) {
            return;
        }
        write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).PlaybackStateCompatCustomAction();
        int i3 = MediaBrowserCompatMediaItem + 69;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationProvider
    public void unRegisterLocationConsumer(LocationComponentPluginImpl locationComponentPluginImpl) {
        int i = 2 % 2;
        int i2 = serializer + 19;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.write;
        copyOnWriteArrayList.remove(locationComponentPluginImpl);
        if (copyOnWriteArrayList.isEmpty()) {
            ((getPresentationContext) this.read).serializer(this);
            int i4 = MediaBrowserCompatMediaItem + 45;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    @Override // o.BrazeActionUtils
    public void IconCompatParcelizer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        int i = 2 % 2;
        int i2 = serializer + 71;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((BrazeActionUtils) this.RemoteActionCompatParcelizer).IconCompatParcelizer(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        ((BrazeActionUtils) this.read).IconCompatParcelizer(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        ((BrazeActionUtils) this.write).IconCompatParcelizer(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        int i4 = MediaBrowserCompatMediaItem + 67;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public String r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        String str;
        char c;
        int i = 2 % 2;
        int i2 = serializer + 115;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str = ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) this.RemoteActionCompatParcelizer).write;
            c = 'N';
        } else {
            str = ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) this.RemoteActionCompatParcelizer).write;
            c = 'v';
        }
        return m1$$ExternalSyntheticOutline0.m(str, "@", hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(c, "v4.2634.5", "v4.2634.5"), "+1312");
    }

    @Override // o.BrazeActionUtils
    public BrazeActionUtils RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        CombinedScopeView combinedScopeView = new CombinedScopeView((BrazeActionUtils) this.RemoteActionCompatParcelizer, ((BrazeActionUtils) this.read).RemoteActionCompatParcelizer(), ((BrazeActionUtils) this.write).RemoteActionCompatParcelizer(), 0);
        int i2 = MediaBrowserCompatMediaItem + 27;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return combinedScopeView;
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public void serializer(Status status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        executelambda2.serializer();
        try {
            executelambda2.read();
            write(status, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
            executelambda2.serializer.getClass();
            int i4 = serializer + 51;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.IconCompatParcelizer == 0) {
            return RemoteActionCompatParcelizer();
        }
        Object objClone = super.clone();
        int i3 = serializer + 95;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objClone;
        }
        throw null;
    }

    public Object serializer(SSLSocket sSLSocket, Object... objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            Object objWrite = write(sSLSocket, objArr);
            int i4 = serializer + 19;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objWrite;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // o.BrazeActionUtils
    public r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int i = 2 % 2;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = ((BrazeActionUtils) this.write).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        if (r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            int i2 = MediaBrowserCompatMediaItem + 27;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        }
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7IJBVrN0sHyidCAZufWEJFc7yY2 = ((BrazeActionUtils) this.read).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        if (r8lambda7IJBVrN0sHyidCAZufWEJFc7yY2 == null) {
            return ((BrazeActionUtils) this.RemoteActionCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        }
        int i4 = MediaBrowserCompatMediaItem + 93;
        int i5 = i4 % Fields.SpotShadowColor;
        serializer = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = i5 + 53;
        MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return r8lambda7IJBVrN0sHyidCAZufWEJFc7yY2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.BrazeActionUtils
    public r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        int i = 2 % 2;
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxcoR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = ((BrazeActionUtils) this.write).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        if (r8lambdal32xcezw71g2xzeh1nm3nimxcoR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
            r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxcoR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = ((BrazeActionUtils) this.read).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            if (r8lambdal32xcezw71g2xzeh1nm3nimxcoR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == null) {
                return ((BrazeActionUtils) this.RemoteActionCompatParcelizer).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            }
            int i2 = MediaBrowserCompatMediaItem + 11;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return r8lambdal32xcezw71g2xzeh1nm3nimxcoR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        }
        int i4 = MediaBrowserCompatMediaItem + 97;
        int i5 = i4 % Fields.SpotShadowColor;
        serializer = i5;
        if (i4 % 2 != 0) {
            int i6 = 74 / 0;
        }
        int i7 = i5 + 31;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return r8lambdal32xcezw71g2xzeh1nm3nimxcoR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.BrazeActionUtils
    public String r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        int i = 2 % 2;
        String strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = ((BrazeActionUtils) this.write).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        if (strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != null) {
            int i2 = MediaBrowserCompatMediaItem + 33;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            }
            throw null;
        }
        String strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = ((BrazeActionUtils) this.read).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        if (strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == null) {
            return ((BrazeActionUtils) this.RemoteActionCompatParcelizer).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        }
        int i3 = serializer + 53;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
    }

    @Override // o.BrazeActionUtils
    public logHtmlClicklambda0 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 83;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        logHtmlClicklambda0 loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = ((BrazeActionUtils) this.write).r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        if (loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
            logHtmlClicklambda0 loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a5 = ((BrazeActionUtils) this.read).r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
            return loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a5 != null ? loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a5 : ((BrazeActionUtils) this.RemoteActionCompatParcelizer).r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        }
        int i4 = serializer + 77;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    }

    @Override // o.BrazeActionUtils
    public r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        int i = 2 % 2;
        int i2 = serializer + 119;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = ((BrazeActionUtils) this.write).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
            int i4 = serializer + 69;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            return r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM2 = ((BrazeActionUtils) this.read).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM2 == null) {
            return ((BrazeActionUtils) this.RemoteActionCompatParcelizer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        int i6 = serializer + 9;
        int i7 = i6 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i7;
        if (i6 % 2 == 0) {
            int i8 = 88 / 0;
        }
        int i9 = i7 + 25;
        serializer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 86 / 0;
        }
        return r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM2;
    }

    @Override // o.BrazeActionUtils
    public addObserverForBackInvoker r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        int i = 2 % 2;
        addObserverForBackInvoker addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = ((BrazeActionUtils) this.write).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        if (addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != null) {
            int i2 = serializer + 101;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 62 / 0;
            }
            return addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        }
        addObserverForBackInvoker addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr29 = ((BrazeActionUtils) this.read).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        if (addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr29 == null) {
            return ((BrazeActionUtils) this.RemoteActionCompatParcelizer).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        }
        int i4 = serializer;
        int i5 = i4 + 55;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 71;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 0 / 0;
        }
        return addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr29;
    }

    @Override // o.BrazeActionUtils
    public getChildStepIteratorandroid_sdk_ui_release r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() {
        int i = 2 % 2;
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = ((BrazeActionUtils) this.write).r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        if (getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != null) {
            int i2 = serializer + 107;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 13 / 0;
            }
            return getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        }
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ2 = ((BrazeActionUtils) this.read).r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        if (getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ2 == null) {
            return ((BrazeActionUtils) this.RemoteActionCompatParcelizer).r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        }
        int i4 = serializer + 117;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ2;
    }

    @Override // o.BrazeActionUtils
    public String r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 65;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strR8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = ((BrazeActionUtils) this.write).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        if (strR8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
            String strR8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH1 = ((BrazeActionUtils) this.read).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
            return strR8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH1 != null ? strR8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH1 : ((BrazeActionUtils) this.RemoteActionCompatParcelizer).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        }
        int i4 = serializer;
        int i5 = i4 + 17;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 89;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return strR8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        }
        throw null;
    }

    public Method write(Class cls) {
        int i = 2 % 2;
        Method method = read(cls, (String) this.read, (Class[]) this.write);
        if (method != null) {
            int i2 = serializer + 5;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Class cls2 = (Class) this.RemoteActionCompatParcelizer;
            if (cls2 != null && !cls2.isAssignableFrom(method.getReturnType())) {
                return null;
            }
        }
        int i3 = MediaBrowserCompatMediaItem + 27;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return method;
    }

    @Override // o.BrazeActionUtils
    public AddToSubscriptionGroupStep MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        AddToSubscriptionGroupStep addToSubscriptionGroupStepMediaSessionCompatQueueItem = ((BrazeActionUtils) this.write).MediaSessionCompatQueueItem();
        if (!(addToSubscriptionGroupStepMediaSessionCompatQueueItem instanceof getArgs)) {
            int i2 = MediaBrowserCompatMediaItem + 17;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return addToSubscriptionGroupStepMediaSessionCompatQueueItem;
        }
        AddToSubscriptionGroupStep addToSubscriptionGroupStepMediaSessionCompatQueueItem2 = ((BrazeActionUtils) this.read).MediaSessionCompatQueueItem();
        Object obj = null;
        if (!(addToSubscriptionGroupStepMediaSessionCompatQueueItem2 instanceof getArgs)) {
            int i4 = serializer + 103;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return addToSubscriptionGroupStepMediaSessionCompatQueueItem2;
            }
            throw null;
        }
        AddToSubscriptionGroupStep addToSubscriptionGroupStepMediaSessionCompatQueueItem3 = ((BrazeActionUtils) this.RemoteActionCompatParcelizer).MediaSessionCompatQueueItem();
        int i5 = MediaBrowserCompatMediaItem + 103;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return addToSubscriptionGroupStepMediaSessionCompatQueueItem3;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:14:0x002c A[Catch: NoSuchMethodException -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NoSuchMethodException -> 0x0051, blocks: (B:9:0x0019, B:14:0x002c, B:16:0x0039, B:18:0x0042), top: B:27:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039 A[Catch: NoSuchMethodException -> 0x0051, TRY_ENTER, TryCatch #0 {NoSuchMethodException -> 0x0051, blocks: (B:9:0x0019, B:14:0x002c, B:16:0x0039, B:18:0x0042), top: B:27:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0042 A[Catch: NoSuchMethodException -> 0x0051, TRY_LEAVE, TryCatch #0 {NoSuchMethodException -> 0x0051, blocks: (B:9:0x0019, B:14:0x002c, B:16:0x0039, B:18:0x0042), top: B:27:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Method read(Class cls, String str, Class[] clsArr) {
        Method method;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 15;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
            if (cls != null) {
                try {
                    if ((cls.getModifiers() & 1) == 0) {
                        i = MediaBrowserCompatMediaItem + 93;
                        serializer = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            return read(cls.getSuperclass(), str, clsArr);
                        }
                        Method method2 = read(cls.getSuperclass(), str, clsArr);
                        int i5 = 99 / 0;
                        return method2;
                    }
                    method = cls.getMethod(str, clsArr);
                    try {
                        if ((method.getModifiers() & 1) == 0) {
                            return method;
                        }
                    } catch (NoSuchMethodException unused) {
                        return method;
                    }
                } catch (NoSuchMethodException unused2) {
                    return null;
                }
            }
        } else if (cls != null) {
            if ((cls.getModifiers() & 1) == 0) {
                i = MediaBrowserCompatMediaItem + 93;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    return read(cls.getSuperclass(), str, clsArr);
                }
                Method method3 = read(cls.getSuperclass(), str, clsArr);
                int i6 = 99 / 0;
                return method3;
            }
            method = cls.getMethod(str, clsArr);
            if ((method.getModifiers() & 1) == 0) {
                return method;
            }
        }
        return null;
    }

    @Override // o.BrazeActionUtils
    public IconCompatParcelizer MediaMetadataCompat() {
        int i = 2 % 2;
        BrazeActionUtils brazeActionUtils = (BrazeActionUtils) this.RemoteActionCompatParcelizer;
        getActionViewIntent getactionviewintent = new getActionViewIntent(brazeActionUtils.MediaMetadataCompat(), ((BrazeActionUtils) this.read).MediaMetadataCompat(), ((BrazeActionUtils) this.write).MediaMetadataCompat(), brazeActionUtils.ResultReceiver().getDefaultScopeType());
        int i2 = MediaBrowserCompatMediaItem + 83;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return getactionviewintent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void RemoteActionCompatParcelizer(SSLSocket sSLSocket, Object... objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                write(sSLSocket.getClass());
                obj.hashCode();
                throw null;
            }
            Method methodWrite = write(sSLSocket.getClass());
            if (methodWrite == null) {
                return;
            }
            try {
                methodWrite.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
            int i3 = MediaBrowserCompatMediaItem + 13;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // o.BrazeActionUtils
    public List IconCompatParcelizer() {
        int i = 2 % 2;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((BrazeActionUtils) this.RemoteActionCompatParcelizer).IconCompatParcelizer());
        copyOnWriteArrayList.addAll(((BrazeActionUtils) this.read).IconCompatParcelizer());
        copyOnWriteArrayList.addAll(((BrazeActionUtils) this.write).IconCompatParcelizer());
        int i2 = serializer + 71;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return copyOnWriteArrayList;
    }

    @Override // o.BrazeActionUtils
    public Map MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((BrazeActionUtils) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper());
        concurrentHashMap.putAll(((BrazeActionUtils) this.read).MediaSessionCompatResultReceiverWrapper());
        concurrentHashMap.putAll(((BrazeActionUtils) this.write).MediaSessionCompatResultReceiverWrapper());
        int i2 = MediaBrowserCompatMediaItem + 45;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
        return concurrentHashMap;
    }

    @Override // o.BrazeActionUtils
    public List MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List listMediaSessionCompatToken = ((BrazeActionUtils) this.write).MediaSessionCompatToken();
        if (!listMediaSessionCompatToken.isEmpty()) {
            return listMediaSessionCompatToken;
        }
        List listMediaSessionCompatToken2 = ((BrazeActionUtils) this.read).MediaSessionCompatToken();
        if (!(!listMediaSessionCompatToken2.isEmpty())) {
            return ((BrazeActionUtils) this.RemoteActionCompatParcelizer).MediaSessionCompatToken();
        }
        int i4 = serializer + 35;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return listMediaSessionCompatToken2;
    }

    @Override // o.BrazeActionUtils
    public Map r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        int i = 2 % 2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((BrazeActionUtils) this.RemoteActionCompatParcelizer).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
        concurrentHashMap.putAll(((BrazeActionUtils) this.read).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
        concurrentHashMap.putAll(((BrazeActionUtils) this.write).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
        int i2 = MediaBrowserCompatMediaItem + 51;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return concurrentHashMap;
    }

    public /* synthetic */ CombinedScopeView(Object obj, Object obj2, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.write = obj3;
    }

    @Override // o.BrazeActionUtils
    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int i = 2 % 2;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys = ((BrazeActionUtils) this.write).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        if (!r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.equals(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys)) {
            int i2 = MediaBrowserCompatMediaItem + 71;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            }
            throw null;
        }
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = ((BrazeActionUtils) this.read).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.equals(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys2)) {
            return ((BrazeActionUtils) this.RemoteActionCompatParcelizer).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        }
        int i3 = MediaBrowserCompatMediaItem + 81;
        int i4 = i3 % Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 95;
        MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys2;
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public void serializer(SharedResourcePool sharedResourcePool) {
        int i = 2 % 2;
        isBlank isblank = (isBlank) this.write;
        executelambda2.serializer();
        try {
            executelambda2.read();
            executelambda2.write();
            isblank.serializer.execute(new isNullOrBlank(this, sharedResourcePool));
            executelambda2.serializer.getClass();
            int i2 = MediaBrowserCompatMediaItem + 35;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public void write(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        int i = 2 % 2;
        isBlank isblank = (isBlank) this.write;
        executelambda2.serializer();
        try {
            executelambda2.read();
            executelambda2.write();
            isblank.serializer.execute(new isNullOrBlank(this, r8lambdaqn1du6uas6agx4srbugfttxtpwa));
            executelambda2.serializer.getClass();
            int i2 = MediaBrowserCompatMediaItem + 29;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ CombinedScopeView() {
        this.IconCompatParcelizer = 25;
    }

    @Override // o.BrazeActionUtils
    public List MediaDescriptionCompat() {
        int i = 2 % 2;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((BrazeActionUtils) this.RemoteActionCompatParcelizer).MediaDescriptionCompat());
        copyOnWriteArrayList.addAll(((BrazeActionUtils) this.read).MediaDescriptionCompat());
        copyOnWriteArrayList.addAll(((BrazeActionUtils) this.write).MediaDescriptionCompat());
        Collections.sort(copyOnWriteArrayList);
        int i2 = serializer + 57;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return copyOnWriteArrayList;
    }

    public CombinedScopeView(io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, CreateHomeScope createHomeScope, SaveHeatmapUrlImpl saveHeatmapUrlImpl) {
        this.IconCompatParcelizer = 7;
        mediaBrowserCompatMediaItem.getClass();
        createHomeScope.getClass();
        saveHeatmapUrlImpl.getClass();
        this.RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
        this.read = createHomeScope;
        this.write = saveHeatmapUrlImpl;
    }

    public CombinedScopeView(Application application, getFragmentManager getfragmentmanager, getExitAnim getexitanim) {
        this.IconCompatParcelizer = 1;
        application.getClass();
        getfragmentmanager.getClass();
        getexitanim.getClass();
        this.RemoteActionCompatParcelizer = application;
        this.read = getfragmentmanager;
        this.write = getexitanim;
    }

    public CombinedScopeView(x1 x1Var, vg vgVar, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2) {
        this.IconCompatParcelizer = 14;
        x1Var.getClass();
        vgVar.getClass();
        subscribetobannersupdateslambda2.getClass();
        this.RemoteActionCompatParcelizer = x1Var;
        this.read = vgVar;
        this.write = subscribetobannersupdateslambda2;
    }

    public String r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() {
        String str;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 85;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = (Boolean) this.write;
        if (bool == null || !bool.booleanValue()) {
            int i3 = serializer + 79;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            str = "00";
        } else {
            int i5 = MediaBrowserCompatMediaItem + 53;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            str = HiAnalyticsConstant.KeyAndValue.NUMBER_01;
        }
        return "00-" + ((r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) this.RemoteActionCompatParcelizer) + "-" + ((r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) this.read) + "-" + str;
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public void read() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isBlank isblank = (isBlank) this.write;
        if (((constructObjectQuietlydefault) isblank.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer).clientSendsOneMessage()) {
            return;
        }
        executelambda2.serializer();
        try {
            executelambda2.read();
            executelambda2.write();
            isblank.serializer.execute(new r8lambda4drVSO69yYFm67jLKp9xaf1w31E(this));
            executelambda2.serializer.getClass();
            int i4 = serializer + 13;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public CombinedScopeView(getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET getstyleable_vector_drawable_path_trim_path_offset, removeListener removelistener, QueryListener queryListener) {
        this.IconCompatParcelizer = 11;
        removelistener.getClass();
        this.RemoteActionCompatParcelizer = getstyleable_vector_drawable_path_trim_path_offset;
        this.read = removelistener;
        this.write = queryListener;
    }

    @Override // o.BrazeActionUtils
    public Queue RatingCompat() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((BrazeActionUtils) this.RemoteActionCompatParcelizer).RatingCompat());
        arrayList.addAll(((BrazeActionUtils) this.read).RatingCompat());
        BrazeActionUtils brazeActionUtils = (BrazeActionUtils) this.write;
        arrayList.addAll(brazeActionUtils.RatingCompat());
        Collections.sort(arrayList);
        Queue queue = BannerView.read(brazeActionUtils.ResultReceiver().getMaxBreadcrumbs());
        queue.addAll(arrayList);
        int i2 = serializer + 9;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return queue;
    }

    public CombinedScopeView(Context context, getPresentationContext getpresentationcontext) {
        this.IconCompatParcelizer = 13;
        this.RemoteActionCompatParcelizer = context;
        this.read = getpresentationcontext;
        this.write = new CopyOnWriteArrayList();
    }

    public CombinedScopeView(onMeasureChild onmeasurechild, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setVerticalBias setverticalbias) {
        this.IconCompatParcelizer = 6;
        onmeasurechild.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = onmeasurechild;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = setverticalbias;
    }

    public BrazeActionUtils write(r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik r8lambdacr4tgcnfsm4f1f1q1igncb5rik) {
        int i = 2 % 2;
        BrazeActionUtils brazeActionUtils = (BrazeActionUtils) this.read;
        BrazeActionUtils brazeActionUtils2 = (BrazeActionUtils) this.write;
        BrazeActionUtils brazeActionUtils3 = (BrazeActionUtils) this.RemoteActionCompatParcelizer;
        if (r8lambdacr4tgcnfsm4f1f1q1igncb5rik != null) {
            int i2 = openUriWithActionViewFromPushlambda0.write[r8lambdacr4tgcnfsm4f1f1q1igncb5rik.ordinal()];
            if (i2 == 1) {
                return brazeActionUtils2;
            }
            if (i2 == 2) {
                int i3 = serializer + 91;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return brazeActionUtils;
            }
            int i5 = MediaBrowserCompatMediaItem + 67;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? i2 == 3 : i2 == 5) {
                return brazeActionUtils3;
            }
            if (i2 == 4) {
                return this;
            }
        }
        int i6 = openUriWithActionViewFromPushlambda0.write[brazeActionUtils3.ResultReceiver().getDefaultScopeType().ordinal()];
        if (i6 == 1) {
            return brazeActionUtils2;
        }
        if (i6 == 2) {
            return brazeActionUtils;
        }
        if (i6 == 3) {
            return brazeActionUtils3;
        }
        int i7 = serializer + 7;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return brazeActionUtils2;
    }

    public CombinedScopeView(setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, setVerticalBias setverticalbias, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.IconCompatParcelizer = 4;
        setverticalbias.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = setusetemptrackingtableroom_runtime;
        this.read = setverticalbias;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public CombinedScopeView(setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy2) {
        this.IconCompatParcelizer = 15;
        setusetemptrackingtableroom_runtime.getClass();
        r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy.getClass();
        this.RemoteActionCompatParcelizer = setusetemptrackingtableroom_runtime;
        this.read = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
        this.write = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy2;
    }

    public void notifyLocationUpdates(Location location) {
        int i = 2 % 2;
        for (LocationComponentPluginImpl locationComponentPluginImpl : (CopyOnWriteArrayList) this.write) {
            int i2 = MediaBrowserCompatMediaItem + 11;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            locationComponentPluginImpl.getClass();
            Point pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
            pointFromLngLat.getClass();
            locationComponentPluginImpl.onLocationUpdated(new Point[]{pointFromLngLat}, null);
            double[] dArr = {location.getBearing()};
            LocationPuckManager locationPuckManager = locationComponentPluginImpl.locationPuckManager;
            if (locationPuckManager != null) {
                int i4 = MediaBrowserCompatMediaItem + 117;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                LocationPuckManager.updateCurrentBearing$default(locationPuckManager, Arrays.copyOf(dArr, 1), null, 4);
            }
        }
    }

    public CombinedScopeView(setSdkAuthenticationSignaturelambda1 setsdkauthenticationsignaturelambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, requestBannersRefreshlambda1 requestbannersrefreshlambda1) {
        this.IconCompatParcelizer = 18;
        setsdkauthenticationsignaturelambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = setsdkauthenticationsignaturelambda1;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = requestbannersrefreshlambda1;
    }

    public CombinedScopeView(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, postAnimationRunner postanimationrunner, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.IconCompatParcelizer = 8;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = postanimationrunner;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r1
  0x0031: PHI (r1v6 o.isBlank) = (r1v5 o.isBlank), (r1v10 o.isBlank) binds: [B:8:0x002f, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public void write(Status status, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        isBlank isblank;
        r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 15;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            isblank = (isBlank) this.write;
            r8lambda9bwhxitij38r9epvsmivfryty = isblank.RemoteActionCompatParcelizer.serializer;
            isblank.MediaMetadataCompat.getClass();
            int i4 = 62 / 0;
            if (r8lambda9bwhxitij38r9epvsmivfryty == null) {
                i = MediaBrowserCompatMediaItem + 121;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    throw null;
                }
                r8lambda9bwhxitij38r9epvsmivfryty = null;
            }
        } else {
            isblank = (isBlank) this.write;
            r8lambda9bwhxitij38r9epvsmivfryty = isblank.RemoteActionCompatParcelizer.serializer;
            isblank.MediaMetadataCompat.getClass();
            if (r8lambda9bwhxitij38r9epvsmivfryty == null) {
                i = MediaBrowserCompatMediaItem + 121;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    throw null;
                }
                r8lambda9bwhxitij38r9epvsmivfryty = null;
            }
        }
        if (status.PlaybackStateCompat == invokeMethodQuietly.CANCELLED) {
            int i5 = MediaBrowserCompatMediaItem + 11;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (r8lambda9bwhxitij38r9epvsmivfryty != null && r8lambda9bwhxitij38r9epvsmivfryty.IconCompatParcelizer()) {
                applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 2);
                isblank.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(applydisplaycutoutmarginstocontentarealambda0);
                status = Status.read.read("ClientCall was cancelled at or after deadline. " + applydisplaycutoutmarginstocontentarealambda0);
                r8lambdaqn1du6uas6agx4srbugfttxtpwa = new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA();
            }
        }
        executelambda2.write();
        isblank.serializer.execute(new truncateToByteLength(this, status, r8lambdaqn1du6uas6agx4srbugfttxtpwa));
        int i7 = serializer + 105;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    public CombinedScopeView(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, getDoubleOrNull getdoubleornull) {
        this.IconCompatParcelizer = 17;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        lambdaverifyplaystorepurchase45.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = lambdaverifyplaystorepurchase45;
        this.write = getdoubleornull;
    }

    public CombinedScopeView(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, subscribeToFeatureFlagsUpdateslambda0 subscribetofeatureflagsupdateslambda0, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.IconCompatParcelizer = 16;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = subscribetofeatureflagsupdateslambda0;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public CombinedScopeView(accesssetShouldRequestFrameworkListenToNetworkUpdatescp accesssetshouldrequestframeworklistentonetworkupdatescp, IsRiderInsideAreaUseCaseImpl isRiderInsideAreaUseCaseImpl, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = 21;
        accesssetshouldrequestframeworklistentonetworkupdatescp.getClass();
        isRiderInsideAreaUseCaseImpl.getClass();
        isopeninternalroom_runtime.getClass();
        this.RemoteActionCompatParcelizer = accesssetshouldrequestframeworklistentonetworkupdatescp;
        this.read = isRiderInsideAreaUseCaseImpl;
        this.write = isopeninternalroom_runtime;
    }

    public CombinedScopeView(onCapabilitiesChanged oncapabilitieschanged, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, publishErrorlambda1 publisherrorlambda1) {
        this.IconCompatParcelizer = 19;
        oncapabilitieschanged.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = oncapabilitieschanged;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = publisherrorlambda1;
    }

    public CombinedScopeView(isBlank isblank, MathKt mathKt) {
        this.IconCompatParcelizer = 24;
        this.write = isblank;
        this.RemoteActionCompatParcelizer = mathKt;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationProvider
    public void registerLocationConsumer(LocationComponentPluginImpl locationComponentPluginImpl) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 51;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((CopyOnWriteArrayList) this.write).isEmpty();
            throw null;
        }
        getPresentationContext getpresentationcontext = (getPresentationContext) this.read;
        Context context = (Context) this.RemoteActionCompatParcelizer;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.write;
        if (copyOnWriteArrayList.isEmpty()) {
            if (FocusListener.write(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 || FocusListener.write(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                getpresentationcontext.RemoteActionCompatParcelizer(null, 1000L, endRearDisplaySession.PRIORITY_HIGH_ACCURACY, this);
            } else {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Missing location permission, location component will not take effect before location permission is granted.", new Object[0]);
            }
        }
        copyOnWriteArrayList.add(locationComponentPluginImpl);
        if (FocusListener.write(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            int i3 = MediaBrowserCompatMediaItem + 27;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else if (FocusListener.write(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Missing location permission, location component will not take effect before location permission is granted.", new Object[0]);
            return;
        }
        getpresentationcontext.write(new RoomDatabase$$ExternalSyntheticLambda2(28, this), new MapApiError$$ExternalSyntheticLambda1(20));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        if (r11 == 0) goto L50;
     */
    @Override // o.BrazeActionUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.sentry.featureflags.write PlaybackStateCompat() {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.CombinedScopeView.PlaybackStateCompat():io.sentry.featureflags.write");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r10 instanceof o.applyPendingRuntimeConfigurationlambda02) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r2 = r2 + 31;
        io.sentry.CombinedScopeView.MediaBrowserCompatMediaItem = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        r1 = (o.applyPendingRuntimeConfigurationlambda02) r10;
        r2 = r1.read;
        r8 = 16 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if ((r2 & Integer.MIN_VALUE) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r1 = (o.applyPendingRuntimeConfigurationlambda02) r10;
        r2 = r1.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if ((r2 & Integer.MIN_VALUE) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        r1.read = r2 - Integer.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r1 = new o.applyPendingRuntimeConfigurationlambda02(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r10 = r1.IconCompatParcelizer;
        r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r4 = r1.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r4 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r4 != 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (((o.v4) r9.write).RemoteActionCompatParcelizer() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r10 = (o.accesssetShouldRequestFrameworkListenToNetworkUpdatescp) r9.RemoteActionCompatParcelizer;
        r1.read = 1;
        r10 = r10.serializer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r10 != r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        r10 = io.sentry.CombinedScopeView.serializer + 87;
        io.sentry.CombinedScopeView.MediaBrowserCompatMediaItem = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        return new com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1((kotlinx.coroutines.flow.Flow) r10, r9, 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        r1 = (o.setTransactionSuccessful) r9.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if ((r10 instanceof o.FragmentInstantiationException) == true) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        r2 = r2 + 27;
        io.sentry.CombinedScopeView.MediaBrowserCompatMediaItem = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        if ((r2 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        r0 = (o.FragmentInstantiationException) r10;
        r2 = r0.IconCompatParcelizer;
        r8 = 19 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if ((r2 & Integer.MIN_VALUE) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        r0 = (o.FragmentInstantiationException) r10;
        r2 = r0.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
    
        if ((r2 & Integer.MIN_VALUE) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        r0.IconCompatParcelizer = r2 - Integer.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        r0 = new o.FragmentInstantiationException(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        r10 = r0.write;
        r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r4 = r0.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        if (r4 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        if (r4 != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
        r10 = (com.roadrunner.login.domain.auth.GetRiderNameUseCaseImpl) r9.read;
        r0.IconCompatParcelizer = 1;
        r10 = r10.invoke(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        if (r10 != r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f1, code lost:
    
        r10 = (java.lang.String) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r10 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f5, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f7, code lost:
    
        ((o.setNextTransition) r9.RemoteActionCompatParcelizer).IconCompatParcelizer(new o.setArguments(new o.setAllowReturnTransitionOverlap(new o.setEnterSharedElementCallback(com.logistics.rider.glovo.R.raw.reactivations), r1.read(com.logistics.rider.glovo.R.string.bubble_success_message_shift_ended_title, r10), r1.IconCompatParcelizer(com.logistics.rider.glovo.R.string.bubble_success_message_shift_ended_subtitle)), o.setEnterTransition.EXTRA_LARGE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0126, code lost:
    
        return o.createFromParcel.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new o.f9(o.instance_delegatelambda0.write));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r9.IconCompatParcelizer != 5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r9.IconCompatParcelizer != 5) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.CombinedScopeView.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object invoke(ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements, ContinuationImpl continuationImpl) {
        addSerializedCardJsonToStoragelambda0 addserializedcardjsontostoragelambda0;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof addSerializedCardJsonToStoragelambda0) {
            addserializedcardjsontostoragelambda0 = (addSerializedCardJsonToStoragelambda0) continuationImpl;
            int i4 = addserializedcardjsontostoragelambda0.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                addserializedcardjsontostoragelambda0.write = i4 - Integer.MIN_VALUE;
            } else {
                addserializedcardjsontostoragelambda0 = new addSerializedCardJsonToStoragelambda0(this, continuationImpl);
            }
        } else {
            addserializedcardjsontostoragelambda0 = new addSerializedCardJsonToStoragelambda0(this, continuationImpl);
        }
        Object objSerializer = addserializedcardjsontostoragelambda0.IconCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = addserializedcardjsontostoragelambda0.write;
        if (i5 != 0) {
            int i6 = serializer + 93;
            int i7 = i6 % Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i7;
            int i8 = i6 % 2;
            Object obj2 = null;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i7 + 47;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements2 = addserializedcardjsontostoragelambda0.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
                obj2.hashCode();
                throw null;
            }
            extensionWindowAreaStatusRequirements = addserializedcardjsontostoragelambda0.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            accesssetShouldRequestFrameworkListenToNetworkUpdatescp accesssetshouldrequestframeworklistentonetworkupdatescp = (accesssetShouldRequestFrameworkListenToNetworkUpdatescp) this.RemoteActionCompatParcelizer;
            addserializedcardjsontostoragelambda0.RemoteActionCompatParcelizer = extensionWindowAreaStatusRequirements;
            addserializedcardjsontostoragelambda0.write = 1;
            objSerializer = accesssetshouldrequestframeworklistentonetworkupdatescp.serializer();
            if (objSerializer == obj) {
                int i10 = MediaBrowserCompatMediaItem + 77;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return obj;
            }
        }
        GetNestScope$invoke$$inlined$map$1 getNestScope$invoke$$inlined$map$1 = new GetNestScope$invoke$$inlined$map$1((Flow) objSerializer, this, extensionWindowAreaStatusRequirements, 8);
        ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.write)).getClass();
        return FlowKt.RemoteActionCompatParcelizer(getNestScope$invoke$$inlined$map$1, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
    }

    public Object write(SSLSocket sSLSocket, Object... objArr) throws InvocationTargetException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            Method methodWrite = write(sSLSocket.getClass());
            if (methodWrite != null) {
                try {
                    Object objInvoke = methodWrite.invoke(sSLSocket, objArr);
                    int i3 = serializer + 3;
                    MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        return objInvoke;
                    }
                    throw null;
                } catch (IllegalAccessException e) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodWrite);
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            throw new AssertionError("Method " + ((String) this.read) + " not supported for object " + sSLSocket);
        }
        write(sSLSocket.getClass());
        obj.hashCode();
        throw null;
    }
}
