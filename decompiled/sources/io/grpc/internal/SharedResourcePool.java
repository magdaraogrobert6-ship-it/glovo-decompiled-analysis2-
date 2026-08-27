package io.grpc.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import io.sentry.SentryOptions;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.ParcelableVolumeInfo;
import io.sentry.util.MediaMetadataCompat;
import java.io.File;
import java.io.InputStream;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AddToCustomAttributeArrayStep;
import o.AdjustDeeplink;
import o.AndroidGraphicsContext2;
import o.BrazeImageUtilsExternalSyntheticLambda11;
import o.BrazeImageUtilsExternalSyntheticLambda20;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.GooglePlayServicesClient;
import o.SimpleQuery;
import o.accessisRenderNodeCompatiblecp;
import o.configureWebView;
import o.executeAsOne;
import o.executeAsOneOrNull;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getInputTextdelegate;
import o.getLiveRegiondelegate;
import o.getReferrer;
import o.inCompatibilityMode;
import o.instance_delegatelambda0;
import o.loadHtmlData;
import o.metaMarkUpdatedAndHasCallbacks;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaFyeQZdkDmEYtgy0V6OzxNdEPxxo;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdagc9w6QBfCFPWhZlCuwheORqN8w;
import o.removeNodeAtDepth;
import o.setConfig;
import o.setNativeShader;
import o.setOnEventTrackingSucceededListener;
import o.setSdkPrefix;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedResourcePool implements configureWebView {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public Object IconCompatParcelizer;

    public SharedResourcePool(int i) {
        int i2 = 24;
        if (i == 24) {
            this.IconCompatParcelizer = new AndroidGraphicsContext2();
            return;
        }
        if (i == 28) {
            Looper mainLooper = Looper.getMainLooper();
            mainLooper.getClass();
            this.IconCompatParcelizer = new Handler(mainLooper);
        } else if (i != 29) {
            this.IconCompatParcelizer = StateFlowKt.read(instance_delegatelambda0.write);
        } else {
            this.IconCompatParcelizer = new MediaMetadataCompat(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(i2));
        }
    }

    public InputStream serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 25;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.IconCompatParcelizer = null;
            obj.hashCode();
            throw null;
        }
        InputStream inputStream = (InputStream) this.IconCompatParcelizer;
        this.IconCompatParcelizer = null;
        int i4 = i2 + 125;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return inputStream;
    }

    public void RemoteActionCompatParcelizer(Object obj) {
        int i = 2 % 2;
        ((AndroidGraphicsContext2) this.IconCompatParcelizer).serializer(new BrazeImageUtilsExternalSyntheticLambda20(obj));
        int i2 = read + 19;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public void RemoteActionCompatParcelizer(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        ((AndroidGraphicsContext2) this.IconCompatParcelizer).serializer(accessisrendernodecompatiblecp, new r8lambdaFyeQZdkDmEYtgy0V6OzxNdEPxxo(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0));
        int i2 = RemoteActionCompatParcelizer + 55;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public void serializer(Object obj) {
        int i = 2 % 2;
        int i2 = read + 77;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            BrazeImageUtilsExternalSyntheticLambda11.write.post(new ND$$ExternalSyntheticLambda0(this, 27, obj));
            return;
        }
        ((AndroidGraphicsContext2) this.IconCompatParcelizer).RemoteActionCompatParcelizer(new BrazeImageUtilsExternalSyntheticLambda20(obj));
        int i4 = read + 15;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = 23;
        int i3 = read + 23;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        IncogniaManagerImpl incogniaManagerImpl = (IncogniaManagerImpl) this.IconCompatParcelizer;
        if (((getInputTextdelegate) incogniaManagerImpl.MediaBrowserCompatMediaItem).read("incognia_set_account_id")) {
            return;
        }
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = incogniaManagerImpl.IconCompatParcelizer;
        ((inCompatibilityMode) incogniaManagerImpl.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new RiderStateRepositoryImpl.AnonymousClass1(incogniaManagerImpl, null, i2), 2);
        int i5 = read + 93;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public /* synthetic */ SharedResourcePool(Object obj) {
        this.IconCompatParcelizer = obj;
    }

    @Override // o.configureWebView
    public loadHtmlData IconCompatParcelizer(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, SentryOptions sentryOptions) {
        int i = 2 % 2;
        setNativeShader.read(addToCustomAttributeArrayStep, "Scopes are required");
        setNativeShader.read(sentryOptions, "SentryOptions is required");
        String cacheDirPath = ((ParcelableVolumeInfo) this.IconCompatParcelizer).RemoteActionCompatParcelizer.getCacheDirPath();
        if (cacheDirPath != null) {
            int i2 = RemoteActionCompatParcelizer + 79;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                configureWebView.IconCompatParcelizer(sentryOptions.getLogger(), cacheDirPath);
                throw null;
            }
            if (configureWebView.IconCompatParcelizer(sentryOptions.getLogger(), cacheDirPath)) {
                loadHtmlData loadhtmldata = new loadHtmlData(sentryOptions.getLogger(), cacheDirPath, new r8lambdagc9w6QBfCFPWhZlCuwheORqN8w(addToCustomAttributeArrayStep, sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis(), sentryOptions.getMaxQueueSize()), new File(cacheDirPath));
                int i3 = read + 25;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return loadhtmldata;
            }
            int i5 = read + 115;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    public Object invoke(ContinuationImpl continuationImpl) {
        SimpleQuery simpleQuery;
        String str;
        String str2;
        String lowerCase;
        String str3;
        String str4;
        String str5;
        String strValueOf;
        getReferrer getreferrer;
        int i = 2 % 2;
        setConfig setconfig = (setConfig) this.IconCompatParcelizer;
        setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener = setconfig.serializer;
        if (continuationImpl instanceof SimpleQuery) {
            int i2 = RemoteActionCompatParcelizer + 115;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            simpleQuery = (SimpleQuery) continuationImpl;
            int i4 = simpleQuery.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                simpleQuery.serializer = i4 - Integer.MIN_VALUE;
            } else {
                simpleQuery = new SimpleQuery(this, continuationImpl);
            }
        } else {
            simpleQuery = new SimpleQuery(this, continuationImpl);
        }
        Object executeasone = simpleQuery.IconCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = simpleQuery.serializer;
        String value = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(executeasone);
            simpleQuery.serializer = 1;
            String str6 = setconfig.write.read();
            metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksSerializer = setconfig.IconCompatParcelizer.serializer();
            String strSerializer = ((getLiveRegiondelegate) setconfig.RemoteActionCompatParcelizer).serializer();
            if (strSerializer == null) {
                int i6 = RemoteActionCompatParcelizer + 5;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    throw null;
                }
                str = "";
            } else {
                str = strSerializer;
            }
            GooglePlayServicesClient googlePlayServicesClient = (GooglePlayServicesClient) setoneventtrackingsucceededlistener.MediaMetadataCompat.read();
            String str7 = googlePlayServicesClient != null ? googlePlayServicesClient.IconCompatParcelizer : null;
            if (str7 == null) {
                str2 = "";
            } else {
                int i7 = RemoteActionCompatParcelizer + 73;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                str2 = str7;
            }
            if (metamarkupdatedandhascallbacksSerializer == null || (str5 = metamarkupdatedandhascallbacksSerializer.countryCode) == null) {
                lowerCase = null;
            } else {
                Locale locale = Locale.ENGLISH;
                locale.getClass();
                lowerCase = str5.toLowerCase(locale);
                lowerCase.getClass();
            }
            String str8 = lowerCase == null ? "" : lowerCase;
            String str9 = metamarkupdatedandhascallbacksSerializer != null ? metamarkupdatedandhascallbacksSerializer.globalEntityId : null;
            String str10 = str9 == null ? "" : str9;
            if (metamarkupdatedandhascallbacksSerializer != null) {
                int i9 = RemoteActionCompatParcelizer + 69;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    String str11 = metamarkupdatedandhascallbacksSerializer.brand;
                    value.hashCode();
                    throw null;
                }
                str3 = metamarkupdatedandhascallbacksSerializer.brand;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                int i10 = read + 21;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                str4 = "";
            } else {
                str4 = str3;
            }
            executeasone = new executeAsOne(str, str2, str4, str8, str6 == null ? "" : str6, str10);
            if (executeasone == obj) {
                int i12 = RemoteActionCompatParcelizer + 63;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return obj;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i14 = read + 111;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(executeasone);
        }
        executeAsOne executeasone2 = (executeAsOne) executeasone;
        AdjustDeeplink adjustDeeplink = (AdjustDeeplink) setoneventtrackingsucceededlistener.RatingCompat.read();
        setSdkPrefix setsdkprefix = adjustDeeplink != null ? adjustDeeplink.read : null;
        GooglePlayServicesClient googlePlayServicesClient2 = (GooglePlayServicesClient) setoneventtrackingsucceededlistener.MediaMetadataCompat.read();
        String str12 = googlePlayServicesClient2 != null ? googlePlayServicesClient2.PlaybackStateCompat : null;
        if (setsdkprefix == null || (getreferrer = setsdkprefix.MediaBrowserCompatMediaItem) == null) {
            strValueOf = null;
        } else {
            int i16 = read + 77;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            Long l = getreferrer.MediaSessionCompatQueueItem;
            if (l != null) {
                strValueOf = String.valueOf(l.longValue());
            } else {
                strValueOf = null;
            }
        }
        if (setsdkprefix != null) {
            int i18 = read + 103;
            RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0) {
                setsdkprefix.MediaMetadataCompat.getValue();
                value.hashCode();
                throw null;
            }
            value = setsdkprefix.MediaMetadataCompat.getValue();
        }
        String str13 = (String) setconfig.read.write.serializer.MediaSessionCompatResultReceiverWrapper();
        str13.getClass();
        executeasone2.getClass();
        return new executeAsOneOrNull(new ExecutableQueryexecuteAsOneOrNull1(executeasone2.write, executeasone2.RemoteActionCompatParcelizer, str13), str12, value, strValueOf, executeasone2.read, executeasone2.IconCompatParcelizer, executeasone2.serializer, executeasone2.RatingCompat);
    }

    public SharedResourcePool() {
    }
}
