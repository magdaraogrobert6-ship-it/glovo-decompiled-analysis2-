package com.deliveryhero.perseus.core.config;

import android.content.Context;
import androidx.emoji2.text.EmojiProcessor;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import com.deliveryhero.perseus.di.DataModule;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.accessgetIntersectcp;
import o.addGroup;
import o.createFromParcel;
import o.getPathFillTypeRgk1Os;
import o.onAddedToParentLayer;
import o.pauseWebviewIfNecessarylambda10;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultPerseusConfigProvider {
    public static final DefaultPerseusConfigProvider RemoteActionCompatParcelizer = new DefaultPerseusConfigProvider();
    public static final Object read = new Object();
    public static final EmojiProcessor serializer = new EmojiProcessor(new accessgetIntersectcp(17), new onAddedToParentLayer(12));
    public static PerseusParamsConfig write;

    public static boolean RemoteActionCompatParcelizer() {
        return write != null;
    }

    public static final Object access$persistSnapshot(PerseusParamsConfig perseusParamsConfig, SuspendLambda suspendLambda) {
        Context context = pauseWebviewIfNecessarylambda10.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (context == null) {
            getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Application context is missing, PerseusApp should be initialized!", null);
            return createfromparcel;
        }
        DataModule dataModule = DataModule.read;
        Object objPersistConfiguration = DataModule.IconCompatParcelizer().persistConfiguration(perseusParamsConfig, suspendLambda);
        return objPersistConfiguration == CoroutineSingletons.COROUTINE_SUSPENDED ? objPersistConfiguration : createfromparcel;
    }

    public static PerseusParamsConfig read(PerseusParamsConfig perseusParamsConfig) {
        PerseusParamsConfig perseusParamsConfig2 = new PerseusParamsConfig(perseusParamsConfig.getAdvertisingId(), perseusParamsConfig.getAppId(), perseusParamsConfig.getAppName(), perseusParamsConfig.getAppVersionName(), perseusParamsConfig.getAdjustId(), perseusParamsConfig.getUaId(), perseusParamsConfig.getEntity(), perseusParamsConfig.getDebuggable(), perseusParamsConfig.getBaseUrl(), perseusParamsConfig.getBatchSize(), perseusParamsConfig.getRetentionTime(), perseusParamsConfig.getCountryCode(), perseusParamsConfig.getUserId(), perseusParamsConfig.getGlobalEntityId(), perseusParamsConfig.getConsent(), perseusParamsConfig.getClientId(), perseusParamsConfig.getDebounceSessionLocalStorage(), perseusParamsConfig.getAppBuildVersion(), perseusParamsConfig.getRouting(), perseusParamsConfig.getRechargeTo(), perseusParamsConfig.getFirebaseInstanceId(), perseusParamsConfig.getPriorityMapping(), perseusParamsConfig.getDispatchDelay(), perseusParamsConfig.getMaxBackoffTime(), perseusParamsConfig.getTelemetryDelay(), perseusParamsConfig.getInfrastructureType());
        perseusParamsConfig2.setSdkVersionName$perseus_release(perseusParamsConfig.getSdkVersionName());
        return perseusParamsConfig2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getConfig(ContinuationImpl continuationImpl) {
        addGroup addgroup;
        PerseusParamsConfig perseusParamsConfig;
        if (continuationImpl instanceof addGroup) {
            addgroup = (addGroup) continuationImpl;
            int i = addgroup.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                addgroup.write = i - Integer.MIN_VALUE;
            } else {
                addgroup = new addGroup(this, continuationImpl);
            }
        } else {
            addgroup = new addGroup(this, continuationImpl);
        }
        Object objRetrieveConfiguration = addgroup.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = addgroup.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objRetrieveConfiguration);
            synchronized (read) {
                perseusParamsConfig = write;
                if (perseusParamsConfig == null) {
                    perseusParamsConfig = null;
                }
            }
            if (perseusParamsConfig != null) {
                return perseusParamsConfig;
            }
            DataModule dataModule = DataModule.read;
            PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImplIconCompatParcelizer = DataModule.IconCompatParcelizer();
            addgroup.write = 1;
            objRetrieveConfiguration = perseusConfigLocalDataStoreImplIconCompatParcelizer.retrieveConfiguration(addgroup);
            if (objRetrieveConfiguration == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objRetrieveConfiguration);
        }
        PerseusParamsConfig perseusParamsConfig2 = (PerseusParamsConfig) objRetrieveConfiguration;
        synchronized (read) {
            PerseusParamsConfig perseusParamsConfig3 = write;
            if (perseusParamsConfig3 != null) {
                return perseusParamsConfig3;
            }
            if (perseusParamsConfig2 != null) {
                PerseusParamsConfig perseusParamsConfig4 = read(perseusParamsConfig2);
                write = perseusParamsConfig4;
                return perseusParamsConfig4;
            }
            getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Application context is missing, PerseusApp should be initialized!", null);
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Application context is missing, PerseusApp should be initialized!");
            return null;
        }
    }
}
