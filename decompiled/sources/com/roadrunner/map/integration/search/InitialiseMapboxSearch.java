package com.roadrunner.map.integration.search;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.createFromParcel;
import o.igExternalSyntheticLambda2;
import o.igExternalSyntheticLambda7;
import o.isOpenInternalroom_runtime;
import o.nf;
import o.prepareForActivityTransitionCarryover;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class InitialiseMapboxSearch {
    private static int read = 0;
    private static int write = 1;
    public final igExternalSyntheticLambda2 IconCompatParcelizer;
    public volatile boolean RemoteActionCompatParcelizer;
    public final Application serializer;

    public InitialiseMapboxSearch(Application application, isOpenInternalroom_runtime isopeninternalroom_runtime, igExternalSyntheticLambda2 igexternalsyntheticlambda2) {
        this.serializer = application;
        this.IconCompatParcelizer = igexternalsyntheticlambda2;
    }

    public final Object invoke(ContinuationImpl continuationImpl) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 3;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!this.RemoteActionCompatParcelizer) {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new NafathModalUiModelImpl$1(this, null, i), continuationImpl);
            if (objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED) {
                int i5 = write + 91;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objWithContext;
            }
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object access$waitForMapboxInitialization(InitialiseMapboxSearch initialiseMapboxSearch, ContinuationImpl continuationImpl) {
        nf nfVar;
        int i = 2 % 2;
        StateFlow stateFlow = initialiseMapboxSearch.IconCompatParcelizer.write;
        if (continuationImpl instanceof nf) {
            nfVar = (nf) continuationImpl;
            int i2 = nfVar.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nfVar.read = i2 - Integer.MIN_VALUE;
            } else {
                nfVar = new nf(initialiseMapboxSearch, continuationImpl);
            }
        } else {
            nfVar = new nf(initialiseMapboxSearch, continuationImpl);
        }
        Object obj = nfVar.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = nfVar.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            igExternalSyntheticLambda7 igexternalsyntheticlambda7 = (igExternalSyntheticLambda7) stateFlow.read();
            igexternalsyntheticlambda7.getClass();
            if (igexternalsyntheticlambda7 != igExternalSyntheticLambda7.MAPBOX_INITIALIZED) {
                int i4 = read + 101;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (igexternalsyntheticlambda7 != igExternalSyntheticLambda7.NAVIGATION_INITIALIZED) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Waiting for Mapbox SDK initialization to complete", new Object[0]);
                    GetAppStateImpl$invoke$$inlined$map$1 getAppStateImpl$invoke$$inlined$map$1 = new GetAppStateImpl$invoke$$inlined$map$1(stateFlow, 4);
                    nfVar.read = 1;
                    if (FlowKt.first(getAppStateImpl$invoke$$inlined$map$1, nfVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return createfromparcel;
        }
        int i6 = write;
        int i7 = i6 + 57;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        if (i3 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i9 = i6 + 91;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Mapbox SDK initialization is complete", new Object[0]);
        return createfromparcel;
    }
}
