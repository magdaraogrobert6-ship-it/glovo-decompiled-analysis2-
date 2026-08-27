package com.deliveryhero.contract.datastore;

import android.app.Application;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.FocusTransactionsKt;
import o.LayerSnapshotV28;
import o.ShortNewsContentCardView;
import o.accesstoBitmap;
import o.createBrazeUserChangeEventSubscriberlambda00;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.endRecording;
import o.performCustomExitMxy_nc0;
import o.registerInAppMessageManagerlambda2;
import o.requiresHardwareAcceleration;

/* JADX INFO: loaded from: classes2.dex */
public final class ChatConfigurationDataStoreHelperImpl implements accesstoBitmap {
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] serializer;
    public final FocusTransactionsKt IconCompatParcelizer;
    public final Application write;

    public ChatConfigurationDataStoreHelperImpl(Application application, requiresHardwareAcceleration requireshardwareacceleration) {
        this.write = application;
        this.IconCompatParcelizer = ExtrasKt.write("chat_configuration.json", requireshardwareacceleration);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object updateChatConfigurationToDataStore(LayerSnapshotV28 layerSnapshotV28, RootViewsSpy$Companion$install$1$1 rootViewsSpy$Companion$install$1$1, ContinuationImpl continuationImpl) {
        endRecording endrecording;
        if (continuationImpl instanceof endRecording) {
            endrecording = (endRecording) continuationImpl;
            int i = endrecording.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                endrecording.serializer = i - Integer.MIN_VALUE;
            } else {
                endrecording = new endRecording(this, continuationImpl);
            }
        } else {
            endrecording = new endRecording(this, continuationImpl);
        }
        Object obj = endrecording.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = endrecording.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i3 = 1;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = (performCustomExitMxy_nc0) this.IconCompatParcelizer.getValue(this.write, serializer[0]);
                MapLayersUiModel$1 mapLayersUiModel$1 = new MapLayersUiModel$1(layerSnapshotV28, shortNewsContentCardView, i3);
                endrecording.write = rootViewsSpy$Companion$install$1$1;
                endrecording.serializer = 1;
                if (performcustomexitmxy_nc0.updateData(mapLayersUiModel$1, endrecording) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rootViewsSpy$Companion$install$1$1 = endrecording.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            rootViewsSpy$Companion$install$1$1.invoke(e2);
        }
        return createFromParcel.INSTANCE;
    }

    static {
        createBrazeUserChangeEventSubscriberlambda00 createbrazeuserchangeeventsubscriberlambda00 = new createBrazeUserChangeEventSubscriberlambda00(ChatConfigurationDataStoreHelperImpl.class, "chatConfigurationDataStore", "getChatConfigurationDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        serializer = new registerInAppMessageManagerlambda2[]{createbrazeuserchangeeventsubscriberlambda00};
    }
}
