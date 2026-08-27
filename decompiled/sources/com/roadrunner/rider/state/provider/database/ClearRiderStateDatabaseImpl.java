package com.roadrunner.rider.state.provider.database;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.asBinder;
import o.onItemDismiss;
import o.onRemoteTrigger;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearRiderStateDatabaseImpl {
    private static int serializer = 1;
    private static int write;
    public final onRemoteTrigger IconCompatParcelizer;
    public final asBinder RemoteActionCompatParcelizer;
    public final ExecuteDatabaseRequest read;

    public ClearRiderStateDatabaseImpl(asBinder asbinder, ExecuteDatabaseRequest executeDatabaseRequest, onRemoteTrigger onremotetrigger) {
        this.RemoteActionCompatParcelizer = asbinder;
        this.read = executeDatabaseRequest;
        this.IconCompatParcelizer = onremotetrigger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m5030invokeIoAF18A(ContinuationImpl continuationImpl) {
        ClearRiderStateDatabaseImpl$invoke$1 clearRiderStateDatabaseImpl$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof ClearRiderStateDatabaseImpl$invoke$1) {
            int i2 = write + 1;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            clearRiderStateDatabaseImpl$invoke$1 = (ClearRiderStateDatabaseImpl$invoke$1) continuationImpl;
            int i4 = clearRiderStateDatabaseImpl$invoke$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                clearRiderStateDatabaseImpl$invoke$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                clearRiderStateDatabaseImpl$invoke$1 = new ClearRiderStateDatabaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            clearRiderStateDatabaseImpl$invoke$1 = new ClearRiderStateDatabaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = clearRiderStateDatabaseImpl$invoke$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = clearRiderStateDatabaseImpl$invoke$1.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 != 0) {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = write + 65;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 23);
        clearRiderStateDatabaseImpl$invoke$1.RemoteActionCompatParcelizer = 1;
        Object objM4876invokegIAlus = this.read.m4876invokegIAlus(mapboxNavigation$parsing$2, clearRiderStateDatabaseImpl$invoke$1);
        if (objM4876invokegIAlus == coroutineSingletons) {
            return coroutineSingletons;
        }
        int i8 = write + 87;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return objM4876invokegIAlus;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
