package com.roadrunner.nafath.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import com.roadrunner.twofa.data.entity.TwoFaTimberException;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.isRoot;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.q3ExternalSyntheticLambda1;
import o.qExternalSyntheticLambda2;
import o.requestGeofenceRefreshlambda0;
import o.requestGeofenceRefreshlambda1;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.subscribeToFeatureFlagsUpdateslambda1;
import o.wa;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class NafathTimerDataStore {
    private static int RatingCompat = 1;
    private static int write;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final isRoot RemoteActionCompatParcelizer;
    public final isOpenInternalroom_runtime read;
    public final performCustomExitMxy_nc0 serializer;

    public NafathTimerDataStore(performCustomExitMxy_nc0 performcustomexitmxy_nc0, isOpenInternalroom_runtime isopeninternalroom_runtime, int i) {
        if (i != 1) {
            performcustomexitmxy_nc0.getClass();
            isopeninternalroom_runtime.getClass();
            this.serializer = performcustomexitmxy_nc0;
            this.read = isopeninternalroom_runtime;
            this.IconCompatParcelizer = new isAdapterPositionOnScreen(new wa(6));
            this.RemoteActionCompatParcelizer = new isRoot("preference_nafath_timer");
            return;
        }
        performcustomexitmxy_nc0.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = performcustomexitmxy_nc0;
        this.read = isopeninternalroom_runtime;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new subscribeToFeatureFlagsUpdateslambda1(7));
        this.RemoteActionCompatParcelizer = new isRoot("preference_two_fa_timer");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public static final Object access$decodeFromJson(NafathTimerDataStore nafathTimerDataStore, String str, ContinuationImpl continuationImpl) {
        qExternalSyntheticLambda2 qexternalsyntheticlambda2;
        int i = 2 % 2;
        int i2 = write + 113;
        RatingCompat = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            nafathTimerDataStore.getClass();
            boolean z = continuationImpl instanceof qExternalSyntheticLambda2;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        nafathTimerDataStore.getClass();
        if (continuationImpl instanceof qExternalSyntheticLambda2) {
            qexternalsyntheticlambda2 = (qExternalSyntheticLambda2) continuationImpl;
            int i3 = qexternalsyntheticlambda2.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = RatingCompat + 7;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                qexternalsyntheticlambda2.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                qexternalsyntheticlambda2 = new qExternalSyntheticLambda2(nafathTimerDataStore, continuationImpl);
            }
        } else {
            qexternalsyntheticlambda2 = new qExternalSyntheticLambda2(nafathTimerDataStore, continuationImpl);
        }
        Object obj = qexternalsyntheticlambda2.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = qexternalsyntheticlambda2.IconCompatParcelizer;
        if (i6 != 0) {
            int i7 = RatingCompat + 111;
            int i8 = i7 % Fields.SpotShadowColor;
            write = i8;
            if (i7 % 2 == 0 ? i6 != 1 : i6 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i8 + 115;
            RatingCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i10 = 83 / 0;
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        try {
            resetTransientState resettransientstate = (resetTransientState) nafathTimerDataStore.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
            resettransientstate.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(q3ExternalSyntheticLambda1.Companion.serializer());
            return (q3ExternalSyntheticLambda1) resettransientstate.serializer(str, setgraphicmodalmaxwidthdp);
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.write(new NafathTimberException("Failed to decode Nafath json datastore", e));
            qexternalsyntheticlambda2.IconCompatParcelizer = 1;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(nafathTimerDataStore.serializer, new PhotoIdUiModelImpl$1$1(nafathTimerDataStore, shortNewsContentCardView, 5), qexternalsyntheticlambda2);
            if (objSerializer != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objSerializer = createFromParcel.INSTANCE;
            }
            if (objSerializer != obj2) {
                return null;
            }
            int i11 = write + 77;
            RatingCompat = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return obj2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public static final Object access$decodeFromJson$1(NafathTimerDataStore nafathTimerDataStore, String str, ContinuationImpl continuationImpl) {
        requestGeofenceRefreshlambda1 requestgeofencerefreshlambda1;
        int i = 2 % 2;
        int i2 = RatingCompat + 83;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        nafathTimerDataStore.getClass();
        if (continuationImpl instanceof requestGeofenceRefreshlambda1) {
            requestgeofencerefreshlambda1 = (requestGeofenceRefreshlambda1) continuationImpl;
            int i4 = requestgeofencerefreshlambda1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 99;
                RatingCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                requestgeofencerefreshlambda1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                requestgeofencerefreshlambda1 = new requestGeofenceRefreshlambda1(nafathTimerDataStore, continuationImpl);
            }
        } else {
            requestgeofencerefreshlambda1 = new requestGeofenceRefreshlambda1(nafathTimerDataStore, continuationImpl);
        }
        Object obj = requestgeofencerefreshlambda1.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = requestgeofencerefreshlambda1.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                resetTransientState resettransientstate = (resetTransientState) nafathTimerDataStore.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                resettransientstate.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(requestGeofenceRefreshlambda0.Companion.serializer());
                return (requestGeofenceRefreshlambda0) resettransientstate.serializer(str, setgraphicmodalmaxwidthdp);
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.write(new TwoFaTimberException("Failed to decode two fa json datastore", e));
                requestgeofencerefreshlambda1.IconCompatParcelizer = 1;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(nafathTimerDataStore.serializer, new PhotoIdUiModelImpl$1$1(nafathTimerDataStore, shortNewsContentCardView, 25), requestgeofencerefreshlambda1);
                if (objSerializer != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objSerializer = createFromParcel.INSTANCE;
                }
                if (objSerializer == obj2) {
                    int i8 = write + 105;
                    RatingCompat = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        return obj2;
                    }
                    int i9 = 3 / 5;
                    return obj2;
                }
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return null;
    }
}
