package com.roadrunner.remoteconfig.firebase;

import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.auth.domain.token.IsUserSignedInImpl;
import io.grpc.internal.SharedResourcePool;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.SemanticsPropertiesContentDescription1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getAllSemanticsNodesToMap;
import o.onItemDismiss;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchRemoteConfigUseCaseImpl {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final decode IconCompatParcelizer;
    public final SharedResourcePool RemoteActionCompatParcelizer;
    public final getAllSemanticsNodesToMap read;
    public final transferSessionPackageI serializer;
    public final SemanticsPropertiesContentDescription1 write;

    public FetchRemoteConfigUseCaseImpl(transferSessionPackageI transfersessionpackagei, decode decodeVar, SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1, getAllSemanticsNodesToMap getallsemanticsnodestomap, SharedResourcePool sharedResourcePool) {
        this.serializer = transfersessionpackagei;
        this.IconCompatParcelizer = decodeVar;
        this.write = semanticsPropertiesContentDescription1;
        this.read = getallsemanticsnodestomap;
        this.RemoteActionCompatParcelizer = sharedResourcePool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: activateRemoteConfig-IoAF18A, reason: not valid java name */
    public final Object m5011activateRemoteConfigIoAF18A(ContinuationImpl continuationImpl) {
        FetchRemoteConfigUseCaseImpl$activateRemoteConfig$1 fetchRemoteConfigUseCaseImpl$activateRemoteConfig$1;
        int i = 2 % 2;
        if (continuationImpl instanceof FetchRemoteConfigUseCaseImpl$activateRemoteConfig$1) {
            fetchRemoteConfigUseCaseImpl$activateRemoteConfig$1 = (FetchRemoteConfigUseCaseImpl$activateRemoteConfig$1) continuationImpl;
            int i2 = fetchRemoteConfigUseCaseImpl$activateRemoteConfig$1.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaMetadataCompat + 7;
                RatingCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                fetchRemoteConfigUseCaseImpl$activateRemoteConfig$1.read = i2 - Integer.MIN_VALUE;
                int i5 = MediaMetadataCompat + 93;
                RatingCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                fetchRemoteConfigUseCaseImpl$activateRemoteConfig$1 = new FetchRemoteConfigUseCaseImpl$activateRemoteConfig$1(this, continuationImpl);
            }
        } else {
            fetchRemoteConfigUseCaseImpl$activateRemoteConfig$1 = new FetchRemoteConfigUseCaseImpl$activateRemoteConfig$1(this, continuationImpl);
        }
        Object objOfSuspend = fetchRemoteConfigUseCaseImpl$activateRemoteConfig$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = fetchRemoteConfigUseCaseImpl$activateRemoteConfig$1.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i8 = 1;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
            FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2 fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2 = new FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2(this, shortNewsContentCardView, i8);
            fetchRemoteConfigUseCaseImpl$activateRemoteConfig$1.read = 1;
            objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) this.read).ofSuspend("asti_remote_config_activate", fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2, fetchRemoteConfigUseCaseImpl$activateRemoteConfig$1);
            if (objOfSuspend == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = MediaMetadataCompat + 37;
            RatingCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
        }
        return ((onItemDismiss) objOfSuspend).IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX INFO: renamed from: fetchRemoteConfig-IoAF18A, reason: not valid java name */
    public final Object m5012fetchRemoteConfigIoAF18A(ContinuationImpl continuationImpl) {
        FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1 fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1;
        int i = 2 % 2;
        int i2 = RatingCompat + 71;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (continuationImpl instanceof FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1) {
            fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1 = (FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1) continuationImpl;
            int i3 = fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.write;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = MediaMetadataCompat + 7;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.write = i3 - Integer.MIN_VALUE;
            } else {
                fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1 = new FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1(this, continuationImpl);
                int i6 = RatingCompat + 71;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        } else {
            fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1 = new FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1(this, continuationImpl);
            int i8 = RatingCompat + 71;
            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        Object objOfSuspend = fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.write;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
            FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2 fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2 = new FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2(this, shortNewsContentCardView, 0);
            fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.write = 1;
            objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) this.read).ofSuspend("asti_remote_config_reset_and_fetch", fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2, fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1);
            if (objOfSuspend == coroutineSingletons) {
                int i11 = MediaMetadataCompat + 95;
                RatingCompat = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = RatingCompat + 7;
            MediaMetadataCompat = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
        }
        return ((onItemDismiss) objOfSuspend).IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a5 A[PHI: r7
  0x00a5: PHI (r7v1 boolean) = (r7v0 boolean), (r7v6 boolean) binds: [B:25:0x0067, B:30:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m5013invokegIAlus(boolean z, ContinuationImpl continuationImpl) {
        FetchRemoteConfigUseCaseImpl$invoke$1 fetchRemoteConfigUseCaseImpl$invoke$1;
        Object objM5012fetchRemoteConfigIoAF18A;
        int i = 2 % 2;
        if (continuationImpl instanceof FetchRemoteConfigUseCaseImpl$invoke$1) {
            fetchRemoteConfigUseCaseImpl$invoke$1 = (FetchRemoteConfigUseCaseImpl$invoke$1) continuationImpl;
            int i2 = fetchRemoteConfigUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchRemoteConfigUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                fetchRemoteConfigUseCaseImpl$invoke$1 = new FetchRemoteConfigUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            fetchRemoteConfigUseCaseImpl$invoke$1 = new FetchRemoteConfigUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object objInvoke = fetchRemoteConfigUseCaseImpl$invoke$1.write;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = fetchRemoteConfigUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            if (z) {
                fetchRemoteConfigUseCaseImpl$invoke$1.serializer = z;
                fetchRemoteConfigUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = 2;
                objM5012fetchRemoteConfigIoAF18A = m5012fetchRemoteConfigIoAF18A(fetchRemoteConfigUseCaseImpl$invoke$1);
                if (objM5012fetchRemoteConfigIoAF18A != obj) {
                    return objM5012fetchRemoteConfigIoAF18A;
                }
            } else {
                fetchRemoteConfigUseCaseImpl$invoke$1.serializer = z;
                fetchRemoteConfigUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = 1;
                objInvoke = ((IsUserSignedInImpl) this.write).invoke(fetchRemoteConfigUseCaseImpl$invoke$1);
                if (objInvoke != obj) {
                }
            }
            int i4 = MediaMetadataCompat + 85;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return obj;
        }
        if (i3 != 1) {
            int i6 = MediaMetadataCompat;
            int i7 = i6 + 49;
            RatingCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i3 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return ((onItemDismiss) objInvoke).IconCompatParcelizer;
            }
            int i9 = i6 + 47;
            RatingCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (i3 == 3) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return ((onItemDismiss) objInvoke).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i11 = MediaMetadataCompat + 83;
            RatingCompat = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                return null;
            }
            throw null;
        }
        z = fetchRemoteConfigUseCaseImpl$invoke$1.serializer;
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            fetchRemoteConfigUseCaseImpl$invoke$1.serializer = z;
            fetchRemoteConfigUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = 2;
            objM5012fetchRemoteConfigIoAF18A = m5012fetchRemoteConfigIoAF18A(fetchRemoteConfigUseCaseImpl$invoke$1);
            if (objM5012fetchRemoteConfigIoAF18A != obj) {
                return objM5012fetchRemoteConfigIoAF18A;
            }
        } else {
            if (!((SharedPreferences) ((FirebaseRemoteConfigImpl) this.serializer).IconCompatParcelizer.write.serializer).getBoolean("remote_config_cache_is_stale_key", false)) {
                return createFromParcel.INSTANCE;
            }
            fetchRemoteConfigUseCaseImpl$invoke$1.serializer = z;
            fetchRemoteConfigUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = 3;
            Object objM5011activateRemoteConfigIoAF18A = m5011activateRemoteConfigIoAF18A(fetchRemoteConfigUseCaseImpl$invoke$1);
            if (objM5011activateRemoteConfigIoAF18A != obj) {
                return objM5011activateRemoteConfigIoAF18A;
            }
        }
        int i12 = MediaMetadataCompat + 85;
        RatingCompat = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return obj;
    }
}
