package com.google.firebase.encoders.proto;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.re2j.Parser;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerWrapper;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.customerchat.legacy.core.usecases.CustomerChatEventUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.data.repository.WebChatNativeAssetRepositoryImpl;
import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptDeliveryForegroundImpl$invoke$1;
import com.roadrunner.delivery.accept.domain.AutoAcceptDeliveryImpl;
import com.roadrunner.delivery.accept.domain.StoreAutoAcceptedDeliveryIdsImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.rrweb.read;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AndroidDialog_androidKtDialogLayout111;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.AnnotatedStringExhaustiveAnnotation;
import o.GraphicsLayerImplCompanionDefaultDrawBlock1;
import o.InlineClassHelper_jvmKt;
import o.LineBreakStrictness;
import o.LinkAnnotationUrl;
import o.PlatformHapticFeedbackType;
import o.SaversKtExternalSyntheticLambda0;
import o.TextMotionLinearitySaverlambda0;
import o.accessdetachAndRemoveNode;
import o.characters;
import o.collectRangeTransitions;
import o.copyNs73l9sdefault;
import o.forEachNewCallbackNeverInvoked;
import o.getActionViewIntentlambda0;
import o.getTransactionExecutor;
import o.i3;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.onItemDismiss;
import o.performingMeasureK40F9xA;
import o.positionIniSbpLlYui;
import o.registerOnGlobalChange;
import o.requireIndexInRangeInclusiveEnd;
import o.safeSetClipToOutline;
import o.skippedEntity;
import o.startDocument;
import o.toShortimpl;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtobufEncoder implements performingMeasureK40F9xA, positionIniSbpLlYui {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public Object RemoteActionCompatParcelizer;
    public Object serializer;
    public Object write;

    public void serializer() {
        synchronized (this) {
            if (!((LinkedHashSet) this.write).isEmpty()) {
                ((ConfigRealtimeHttpClient) this.serializer).IconCompatParcelizer(0L);
            }
        }
    }

    @Override // o.positionIniSbpLlYui
    public void read(Bundle bundle) {
        synchronized (this.serializer) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.RemoteActionCompatParcelizer = new CountDownLatch(1);
            ((zzz) this.write).read(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (((CountDownLatch) this.RemoteActionCompatParcelizer).await(500L, TimeUnit.MILLISECONDS)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                } else {
                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                SentryLogcatAdapter.read("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.RemoteActionCompatParcelizer = null;
        }
    }

    public ProtobufEncoder(getTransactionExecutor gettransactionexecutor, AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, getActionViewIntentlambda0 getactionviewintentlambda0) {
        gettransactionexecutor.getClass();
        androidUiDispatcherCompanioncurrentThread1.getClass();
        getactionviewintentlambda0.getClass();
        this.write = gettransactionexecutor;
        this.serializer = androidUiDispatcherCompanioncurrentThread1;
        this.RemoteActionCompatParcelizer = getactionviewintentlambda0;
    }

    @Override // o.performingMeasureK40F9xA
    public void RemoteActionCompatParcelizer(Bundle bundle, String str) {
        int i = 2 % 2;
        CountDownLatch countDownLatch = (CountDownLatch) this.RemoteActionCompatParcelizer;
        if (countDownLatch == null) {
            int i2 = IconCompatParcelizer + 13;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else if ("_ae".equals(str)) {
            int i4 = read + 117;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                countDownLatch.countDown();
                return;
            }
            countDownLatch.countDown();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ ProtobufEncoder(Object obj, Object obj2, Object obj3) {
        this.write = obj;
        this.serializer = obj2;
        this.RemoteActionCompatParcelizer = obj3;
    }

    public static int serializer(AndroidDialog_androidKtDialogLayout111 androidDialog_androidKtDialogLayout111) {
        int i = 2 % 2;
        int i2 = read + 1;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            androidDialog_androidKtDialogLayout111.RatingCompat();
            obj.hashCode();
            throw null;
        }
        if (androidDialog_androidKtDialogLayout111.RatingCompat() || androidDialog_androidKtDialogLayout111.MediaDescriptionCompat()) {
            int i3 = read + 121;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return R.drawable.ic_bold_large_essentials_shop;
        }
        if (androidDialog_androidKtDialogLayout111.RemoteActionCompatParcelizer()) {
            int i5 = read + 27;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return R.drawable.ic_bold_large_essentials_user_circle;
            }
            throw null;
        }
        if (!androidDialog_androidKtDialogLayout111.MediaBrowserCompatMediaItem()) {
            return R.drawable.ic_bold_large_essentials_user_circle_plus;
        }
        int i6 = IconCompatParcelizer + 17;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return R.drawable.ic_bold_large_essentials_shop_plus;
        }
        int i7 = 60 / 0;
        return R.drawable.ic_bold_large_essentials_shop_plus;
    }

    public void addLayerToMap(LocationLayerWrapper locationLayerWrapper) {
        int i = 2 % 2;
        int i2 = read + 63;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        locationLayerWrapper.getClass();
        Object obj = this.serializer;
        if (((String) obj) != null) {
            locationLayerWrapper.bindTo((MapboxStyleManager) this.write, new LayerPosition((String) obj, null, null));
            return;
        }
        Object obj2 = this.RemoteActionCompatParcelizer;
        String str = (String) obj2;
        MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) this.write;
        if (str == null) {
            locationLayerWrapper.bindTo(mapboxStyleManager, null);
            return;
        }
        locationLayerWrapper.bindTo(mapboxStyleManager, new LayerPosition(null, (String) obj2, null));
        int i4 = IconCompatParcelizer + 85;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void write(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        int i = 2 % 2;
        HashMap map = (HashMap) this.write;
        ProtobufDataEncoderContext protobufDataEncoderContext = new ProtobufDataEncoderContext(byteArrayOutputStream, map, (HashMap) this.serializer, (accessdetachAndRemoveNode) this.RemoteActionCompatParcelizer);
        if (obj == null) {
            int i2 = read + 55;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        accessdetachAndRemoveNode accessdetachandremovenode = (accessdetachAndRemoveNode) map.get(obj.getClass());
        if (accessdetachandremovenode == null) {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
        int i4 = read + 15;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        accessdetachandremovenode.serializer(obj, protobufDataEncoderContext);
    }

    public void RemoteActionCompatParcelizer(registerOnGlobalChange registeronglobalchange, long j, Activity activity) {
        int i = 2 % 2;
        Parser.Pair pair = new Parser.Pair(this, 13, activity);
        registeronglobalchange.getClass();
        forEachNewCallbackNeverInvoked foreachnewcallbackneverinvoked = registeronglobalchange.serializer;
        CustomerChatEventUseCase$$ExternalSyntheticLambda0 customerChatEventUseCase$$ExternalSyntheticLambda0 = new CustomerChatEventUseCase$$ExternalSyntheticLambda0(registeronglobalchange, j, pair);
        CustomerChatProviderImpl customerChatProviderImpl = (CustomerChatProviderImpl) foreachnewcallbackneverinvoked;
        if (!customerChatProviderImpl.IconCompatParcelizer()) {
            Timber.RemoteActionCompatParcelizer.read("CustomerChat is not initialized", new Object[0]);
            return;
        }
        int i2 = read + 3;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            CustomerChatManagerImpl customerChatManagerImpl = customerChatProviderImpl.read;
            if (customerChatManagerImpl.MediaMetadataCompat.write()) {
                return;
            }
            ((GraphicsLayerImplCompanionDefaultDrawBlock1) customerChatManagerImpl.read().ParcelableVolumeInfo.MediaSessionCompatResultReceiverWrapper()).serializer = customerChatEventUseCase$$ExternalSyntheticLambda0;
            int i3 = IconCompatParcelizer + 81;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        customerChatProviderImpl.read.MediaMetadataCompat.write();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public static final Object access$getSendEventsUrl(ProtobufEncoder protobufEncoder, ContinuationImpl continuationImpl) {
        characters charactersVar;
        collectRangeTransitions collectrangetransitions;
        int i = 2 % 2;
        protobufEncoder.getClass();
        if (continuationImpl instanceof characters) {
            int i2 = IconCompatParcelizer + 23;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            charactersVar = (characters) continuationImpl;
            int i4 = charactersVar.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                charactersVar.serializer = i4 - Integer.MIN_VALUE;
            } else {
                charactersVar = new characters(protobufEncoder, continuationImpl);
            }
        } else {
            charactersVar = new characters(protobufEncoder, continuationImpl);
        }
        Object objWrite = charactersVar.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = charactersVar.serializer;
        if (i5 != 0) {
            int i6 = read + 31;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            int i7 = read + 47;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl = (HelpCenterRemoteDataSourceImpl) protobufEncoder.RemoteActionCompatParcelizer;
            charactersVar.serializer = 1;
            objWrite = helpCenterRemoteDataSourceImpl.write(charactersVar);
            if (objWrite == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LinkAnnotationUrl linkAnnotationUrl = (LinkAnnotationUrl) objWrite;
        if (!((AnnotatedStringExhaustiveAnnotation) protobufEncoder.serializer).RemoteActionCompatParcelizer.IconCompatParcelizer()) {
            collectrangetransitions = collectRangeTransitions.PRODUCTION;
        } else {
            int i9 = IconCompatParcelizer + 123;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                collectRangeTransitions collectrangetransitions2 = collectRangeTransitions.STAGING;
                throw null;
            }
            collectrangetransitions = collectRangeTransitions.STAGING;
        }
        return skippedEntity.RemoteActionCompatParcelizer(collectrangetransitions, linkAnnotationUrl.IconCompatParcelizer()).concat("/events/v2/events");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032 A[PHI: r2 r4
  0x0032: PHI (r2v7 o.requireIndexInRangeInclusiveEnd) = (r2v6 o.requireIndexInRangeInclusiveEnd), (r2v9 o.requireIndexInRangeInclusiveEnd) binds: [B:10:0x0030, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r4v12 int) = (r4v11 int), (r4v14 int) binds: [B:10:0x0030, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public Object invoke(String str, ContinuationImpl continuationImpl) throws Throwable {
        requireIndexInRangeInclusiveEnd requireindexinrangeinclusiveend;
        String str2;
        Object objM4886fetchVariantBWLJW6A;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 121;
        int i4 = i3 % Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        if (continuationImpl instanceof requireIndexInRangeInclusiveEnd) {
            int i6 = i4 + 79;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                requireindexinrangeinclusiveend = (requireIndexInRangeInclusiveEnd) continuationImpl;
                i = requireindexinrangeinclusiveend.RemoteActionCompatParcelizer;
                int i7 = 58 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    requireindexinrangeinclusiveend.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    requireindexinrangeinclusiveend = new requireIndexInRangeInclusiveEnd(this, continuationImpl);
                    int i8 = read + 33;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
            } else {
                requireindexinrangeinclusiveend = (requireIndexInRangeInclusiveEnd) continuationImpl;
                i = requireindexinrangeinclusiveend.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    requireindexinrangeinclusiveend.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    requireindexinrangeinclusiveend = new requireIndexInRangeInclusiveEnd(this, continuationImpl);
                    int i10 = read + 33;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
            }
        } else {
            requireindexinrangeinclusiveend = new requireIndexInRangeInclusiveEnd(this, continuationImpl);
            int i12 = read + 33;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        Object obj = requireindexinrangeinclusiveend.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = requireindexinrangeinclusiveend.RemoteActionCompatParcelizer;
        if (i14 != 0) {
            int i15 = read + 67;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            if (i14 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4886fetchVariantBWLJW6A = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PlatformHapticFeedbackType platformHapticFeedbackType = (PlatformHapticFeedbackType) this.serializer;
            platformHapticFeedbackType.getClass();
            try {
                Application application = platformHapticFeedbackType.RemoteActionCompatParcelizer;
                int i17 = toShortimpl.IconCompatParcelizer;
                PackageInfo packageInfo = read.read();
                if (packageInfo == null) {
                    try {
                        String str3 = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
                        if (str3 == null) {
                            int i18 = IconCompatParcelizer + 55;
                            read = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            packageInfo = null;
                        } else {
                            packageInfo = application.getPackageManager().getPackageInfo(str3, 0);
                        }
                    } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                }
                str2 = packageInfo != null ? packageInfo.versionName : null;
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.write(e);
            }
            if (str2 == null) {
                return null;
            }
            startDocument startdocument = (startDocument) this.write;
            ((getActionViewIntentlambda0) this.RemoteActionCompatParcelizer).getClass();
            String str4 = Build.VERSION.RELEASE;
            str4.getClass();
            requireindexinrangeinclusiveend.RemoteActionCompatParcelizer = 1;
            objM4886fetchVariantBWLJW6A = ((WebChatNativeAssetRepositoryImpl) startdocument).m4886fetchVariantBWLJW6A(str, str4, str2, requireindexinrangeinclusiveend);
            if (objM4886fetchVariantBWLJW6A == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4886fetchVariantBWLJW6A);
        if (thSerializer == null) {
            return objM4886fetchVariantBWLJW6A;
        }
        if (thSerializer instanceof CancellationException) {
            throw thSerializer;
        }
        Timber.RemoteActionCompatParcelizer.write(thSerializer);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public Serializable invoke(ContinuationImpl continuationImpl) {
        LineBreakStrictness lineBreakStrictness;
        safeSetClipToOutline safesetcliptooutline;
        safeSetClipToOutline safesetcliptooutline2;
        safeSetClipToOutline safesetcliptooutline3;
        int i = 2 % 2;
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) this.write;
        if (continuationImpl instanceof LineBreakStrictness) {
            lineBreakStrictness = (LineBreakStrictness) continuationImpl;
            int i2 = lineBreakStrictness.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lineBreakStrictness.write = i2 - Integer.MIN_VALUE;
                int i3 = IconCompatParcelizer + 7;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                lineBreakStrictness = new LineBreakStrictness(this, continuationImpl);
            }
        } else {
            lineBreakStrictness = new LineBreakStrictness(this, continuationImpl);
        }
        Object obj = lineBreakStrictness.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = lineBreakStrictness.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            safesetcliptooutline = new safeSetClipToOutline();
            boolean zBooleanValue = ((Boolean) ((i3) this.serializer).write.read()).booleanValue();
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            if (firebaseRemoteConfigImpl.ComponentActivity()) {
                int i6 = read + 67;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    safesetcliptooutline.put("is_building_highlighted", String.valueOf(zBooleanValue));
                    throw null;
                }
                safesetcliptooutline.put("is_building_highlighted", String.valueOf(zBooleanValue));
            }
            if (!firebaseRemoteConfigImpl.MediaSessionCompatToken()) {
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) this.RemoteActionCompatParcelizer;
                lineBreakStrictness.read = safesetcliptooutline;
                lineBreakStrictness.IconCompatParcelizer = safesetcliptooutline;
                lineBreakStrictness.write = 1;
                Object objInvoke = initializeAppStartupItemsImpl.invoke(lineBreakStrictness);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                safesetcliptooutline2 = safesetcliptooutline;
                obj = objInvoke;
                safesetcliptooutline3 = safesetcliptooutline2;
            }
            safesetcliptooutline.getClass();
            return safesetcliptooutline.IconCompatParcelizer();
        }
        int i7 = IconCompatParcelizer;
        int i8 = i7 + 27;
        read = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i10 = i7 + 83;
        read = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        safesetcliptooutline3 = lineBreakStrictness.IconCompatParcelizer;
        safesetcliptooutline2 = lineBreakStrictness.read;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        safesetcliptooutline3.put("has_entrance_pin", String.valueOf(((Boolean) obj).booleanValue()));
        safesetcliptooutline = safesetcliptooutline2;
        safesetcliptooutline.getClass();
        return safesetcliptooutline.IconCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m4474invokegIAlus(SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        AutoAcceptDeliveryForegroundImpl$invoke$1 autoAcceptDeliveryForegroundImpl$invoke$1;
        Object objM4899autoAcceptDelivery0E7RQCE;
        List listIconCompatParcelizer;
        copyNs73l9sdefault copyns73l9sdefault;
        InlineClassHelper_jvmKt inlineClassHelper_jvmKtSerializer;
        StoreAutoAcceptedDeliveryIdsImpl storeAutoAcceptedDeliveryIdsImpl;
        Object obj;
        int i;
        TextMotionLinearitySaverlambda0 textMotionLinearitySaverlambda0;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 111;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (continuationImpl instanceof AutoAcceptDeliveryForegroundImpl$invoke$1) {
            autoAcceptDeliveryForegroundImpl$invoke$1 = (AutoAcceptDeliveryForegroundImpl$invoke$1) continuationImpl;
            int i5 = autoAcceptDeliveryForegroundImpl$invoke$1.write;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                autoAcceptDeliveryForegroundImpl$invoke$1.write = i5 - Integer.MIN_VALUE;
            } else {
                autoAcceptDeliveryForegroundImpl$invoke$1 = new AutoAcceptDeliveryForegroundImpl$invoke$1(this, continuationImpl);
            }
        } else {
            autoAcceptDeliveryForegroundImpl$invoke$1 = new AutoAcceptDeliveryForegroundImpl$invoke$1(this, continuationImpl);
        }
        Object obj2 = autoAcceptDeliveryForegroundImpl$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = autoAcceptDeliveryForegroundImpl$invoke$1.write;
        int i7 = 0;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            AutoAcceptDeliveryImpl autoAcceptDeliveryImpl = (AutoAcceptDeliveryImpl) this.write;
            String value = saversKtExternalSyntheticLambda0.getValue();
            autoAcceptDeliveryForegroundImpl$invoke$1.write = 1;
            objM4899autoAcceptDelivery0E7RQCE = autoAcceptDeliveryImpl.m4899autoAcceptDelivery0E7RQCE("back_to_back_delivery_dispatched", value, autoAcceptDeliveryForegroundImpl$invoke$1);
            if (objM4899autoAcceptDelivery0E7RQCE != coroutineSingletons) {
            }
            int i8 = IconCompatParcelizer + 91;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return coroutineSingletons;
        }
        if (i6 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            objM4899autoAcceptDelivery0E7RQCE = ((onItemDismiss) obj2).IconCompatParcelizer;
        } else {
            if (i6 == 2) {
                i7 = autoAcceptDeliveryForegroundImpl$invoke$1.RemoteActionCompatParcelizer;
                copyNs73l9sdefault copyns73l9sdefault2 = autoAcceptDeliveryForegroundImpl$invoke$1.IconCompatParcelizer;
                Object obj3 = autoAcceptDeliveryForegroundImpl$invoke$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                copyns73l9sdefault = copyns73l9sdefault2;
                objM4899autoAcceptDelivery0E7RQCE = obj3;
                storeAutoAcceptedDeliveryIdsImpl = (StoreAutoAcceptedDeliveryIdsImpl) this.serializer;
                autoAcceptDeliveryForegroundImpl$invoke$1.serializer = objM4899autoAcceptDelivery0E7RQCE;
                autoAcceptDeliveryForegroundImpl$invoke$1.IconCompatParcelizer = copyns73l9sdefault;
                autoAcceptDeliveryForegroundImpl$invoke$1.RemoteActionCompatParcelizer = i7;
                autoAcceptDeliveryForegroundImpl$invoke$1.write = 3;
                if (storeAutoAcceptedDeliveryIdsImpl.invoke((List) obj2, autoAcceptDeliveryForegroundImpl$invoke$1) == coroutineSingletons) {
                    int i10 = read + 79;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                } else {
                    obj = objM4899autoAcceptDelivery0E7RQCE;
                    i = i7;
                }
                int i12 = IconCompatParcelizer + 91;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return coroutineSingletons;
            }
            if (i6 != 3) {
                int i14 = IconCompatParcelizer + 11;
                read = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0 ? i6 != 4 : i6 != 5) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj4 = autoAcceptDeliveryForegroundImpl$invoke$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                int i15 = read + 87;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    int i16 = 63 / 0;
                }
                return obj4;
            }
            i = autoAcceptDeliveryForegroundImpl$invoke$1.RemoteActionCompatParcelizer;
            copyns73l9sdefault = autoAcceptDeliveryForegroundImpl$invoke$1.IconCompatParcelizer;
            obj = autoAcceptDeliveryForegroundImpl$invoke$1.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        textMotionLinearitySaverlambda0 = (TextMotionLinearitySaverlambda0) this.RemoteActionCompatParcelizer;
        autoAcceptDeliveryForegroundImpl$invoke$1.serializer = obj;
        autoAcceptDeliveryForegroundImpl$invoke$1.IconCompatParcelizer = null;
        autoAcceptDeliveryForegroundImpl$invoke$1.RemoteActionCompatParcelizer = i;
        autoAcceptDeliveryForegroundImpl$invoke$1.write = 4;
        if (textMotionLinearitySaverlambda0.serializer(copyns73l9sdefault, autoAcceptDeliveryForegroundImpl$invoke$1) != coroutineSingletons) {
            return obj;
        }
        int i17 = IconCompatParcelizer + 91;
        read = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        return coroutineSingletons;
        Throwable thSerializer = onItemDismiss.serializer(objM4899autoAcceptDelivery0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to auto accept foreground delivery", new Object[0]);
        }
        if (objM4899autoAcceptDelivery0E7RQCE instanceof isItemDismissable) {
            int i19 = read + 83;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            return objM4899autoAcceptDelivery0E7RQCE;
        }
        int i21 = read + 69;
        IconCompatParcelizer = i21 % Fields.SpotShadowColor;
        int i22 = i21 % 2;
        copyNs73l9sdefault copyns73l9sdefault3 = (copyNs73l9sdefault) objM4899autoAcceptDelivery0E7RQCE;
        autoAcceptDeliveryForegroundImpl$invoke$1.serializer = objM4899autoAcceptDelivery0E7RQCE;
        autoAcceptDeliveryForegroundImpl$invoke$1.IconCompatParcelizer = copyns73l9sdefault3;
        autoAcceptDeliveryForegroundImpl$invoke$1.RemoteActionCompatParcelizer = 0;
        autoAcceptDeliveryForegroundImpl$invoke$1.write = 2;
        if (copyns73l9sdefault3 == null || (inlineClassHelper_jvmKtSerializer = copyns73l9sdefault3.serializer()) == null || (listIconCompatParcelizer = inlineClassHelper_jvmKtSerializer.IconCompatParcelizer()) == null) {
            listIconCompatParcelizer = instance_delegatelambda0.write;
        }
        if (listIconCompatParcelizer != coroutineSingletons) {
            List list = listIconCompatParcelizer;
            copyns73l9sdefault = copyns73l9sdefault3;
            obj2 = list;
            storeAutoAcceptedDeliveryIdsImpl = (StoreAutoAcceptedDeliveryIdsImpl) this.serializer;
            autoAcceptDeliveryForegroundImpl$invoke$1.serializer = objM4899autoAcceptDelivery0E7RQCE;
            autoAcceptDeliveryForegroundImpl$invoke$1.IconCompatParcelizer = copyns73l9sdefault;
            autoAcceptDeliveryForegroundImpl$invoke$1.RemoteActionCompatParcelizer = i7;
            autoAcceptDeliveryForegroundImpl$invoke$1.write = 3;
            if (storeAutoAcceptedDeliveryIdsImpl.invoke((List) obj2, autoAcceptDeliveryForegroundImpl$invoke$1) == coroutineSingletons) {
                int i110 = read + 79;
                IconCompatParcelizer = i110 % Fields.SpotShadowColor;
                int i111 = i110 % 2;
            } else {
                obj = objM4899autoAcceptDelivery0E7RQCE;
                i = i7;
                textMotionLinearitySaverlambda0 = (TextMotionLinearitySaverlambda0) this.RemoteActionCompatParcelizer;
                autoAcceptDeliveryForegroundImpl$invoke$1.serializer = obj;
                autoAcceptDeliveryForegroundImpl$invoke$1.IconCompatParcelizer = null;
                autoAcceptDeliveryForegroundImpl$invoke$1.RemoteActionCompatParcelizer = i;
                autoAcceptDeliveryForegroundImpl$invoke$1.write = 4;
                if (textMotionLinearitySaverlambda0.serializer(copyns73l9sdefault, autoAcceptDeliveryForegroundImpl$invoke$1) != coroutineSingletons) {
                    return obj;
                }
            }
        }
        int i112 = IconCompatParcelizer + 91;
        read = i112 % Fields.SpotShadowColor;
        int i113 = i112 % 2;
        return coroutineSingletons;
    }

    public ProtobufEncoder() {
    }
}
