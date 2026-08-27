package com.deliveryhero.customerchat.datastore;

import android.app.Application;
import androidx.lifecycle.BlockRunner$cancel$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import o.FocusTransactionsKt;
import o.LayerSnapshotV22;
import o.PlaceholderHardwareCanvas;
import o.ShortNewsContentCardView;
import o.applyAlpha;
import o.createBrazeUserChangeEventSubscriberlambda00;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.invalidateChildInParent;
import o.isIdentityannotations;
import o.onImageAvailable;
import o.performCustomExitMxy_nc0;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.registerInAppMessageManagerlambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class UserPropertiesDataStoreHelperImpl implements invalidateChildInParent {
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] write;
    public final FocusTransactionsKt RemoteActionCompatParcelizer;
    public final Application read;
    public final onImageAvailable serializer;

    public UserPropertiesDataStoreHelperImpl(Application application, onImageAvailable onimageavailable, UserPropertiesSerializer userPropertiesSerializer) {
        this.read = application;
        this.serializer = onimageavailable;
        this.RemoteActionCompatParcelizer = ExtrasKt.write("user_properties.json", userPropertiesSerializer);
    }

    public final applyAlpha IconCompatParcelizer() {
        return (applyAlpha) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new BlockRunner$cancel$1(this, (ShortNewsContentCardView) null, 19));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object updateUserPropertiesToDataStore(applyAlpha applyalpha, ContinuationImpl continuationImpl) {
        PlaceholderHardwareCanvas placeholderHardwareCanvas;
        UserPropertiesDataStoreHelperImpl userPropertiesDataStoreHelperImpl;
        isIdentityannotations isidentityannotations;
        if (continuationImpl instanceof PlaceholderHardwareCanvas) {
            placeholderHardwareCanvas = (PlaceholderHardwareCanvas) continuationImpl;
            int i = placeholderHardwareCanvas.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                placeholderHardwareCanvas.read = i - Integer.MIN_VALUE;
            } else {
                placeholderHardwareCanvas = new PlaceholderHardwareCanvas(this, continuationImpl);
            }
        } else {
            placeholderHardwareCanvas = new PlaceholderHardwareCanvas(this, continuationImpl);
        }
        Object obj = placeholderHardwareCanvas.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = placeholderHardwareCanvas.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                try {
                    performCustomExitMxy_nc0 performcustomexitmxy_nc0 = (performCustomExitMxy_nc0) this.RemoteActionCompatParcelizer.getValue(this.read, write[0]);
                    MapLayersUiModel$1 mapLayersUiModel$1 = new MapLayersUiModel$1(applyalpha, shortNewsContentCardView, 2);
                    placeholderHardwareCanvas.RemoteActionCompatParcelizer = this;
                    placeholderHardwareCanvas.read = 1;
                    if (performcustomexitmxy_nc0.updateData(mapLayersUiModel$1, placeholderHardwareCanvas) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Exception e) {
                    e = e;
                    userPropertiesDataStoreHelperImpl = this;
                    isidentityannotations = userPropertiesDataStoreHelperImpl.serializer.serializer;
                    if (isidentityannotations != null) {
                        isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "DATASTORE_OPERATION_CACHE_EVENT", "Customer chat updating user properties operation failed", e);
                    }
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                userPropertiesDataStoreHelperImpl = placeholderHardwareCanvas.RemoteActionCompatParcelizer;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                } catch (Exception e2) {
                    e = e2;
                    isidentityannotations = userPropertiesDataStoreHelperImpl.serializer.serializer;
                    if (isidentityannotations != null) {
                        isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "DATASTORE_OPERATION_CACHE_EVENT", "Customer chat updating user properties operation failed", e);
                    }
                }
            }
            return createFromParcel.INSTANCE;
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    static {
        createBrazeUserChangeEventSubscriberlambda00 createbrazeuserchangeeventsubscriberlambda00 = new createBrazeUserChangeEventSubscriberlambda00(UserPropertiesDataStoreHelperImpl.class, "userPropertiesDataStore", "getUserPropertiesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        write = new registerInAppMessageManagerlambda2[]{createbrazeuserchangeeventsubscriberlambda00};
    }
}
