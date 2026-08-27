package com.roadrunner.delivery.stacked.delivery.list;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.stacked.delivery.list.api.StackedDeliveryListUiModel;
import com.roadrunner.delivery.stacked.delivery.list.domain.ObserveStackedDeliveryList;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.getZero9UxMQ8Mannotations;
import o.initlambda2;
import o.initlambda20;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.transferSessionPackageI;
import o.unaryMinus9UxMQ8M;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class StackedDeliveryListUiModelImpl implements StackedDeliveryListUiModel {
    private static int MediaSessionCompatToken = 0;
    private static int ParcelableVolumeInfo = 1;
    public final StateFlow IconCompatParcelizer;
    public final ObserveStackedDeliveryList MediaBrowserCompatMediaItem;
    public final initlambda2 MediaDescriptionCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaMetadataCompat;
    public final transferSessionPackageI MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final UpdateStateUseCaseImpl PlaybackStateCompat;
    public final initlambda20 PlaybackStateCompatCustomAction;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final ContextScope read;
    public final MutableStateFlow serializer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 5;
        MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        StateFlow stateFlow = this.IconCompatParcelizer;
        int i4 = i2 + 7;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return stateFlow;
        }
        obj.hashCode();
        throw null;
    }

    public final StateFlow serializer() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 93;
        int i3 = i2 % Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        if (i2 % 2 == 0) {
            stateFlow = this.MediaSessionCompatResultReceiverWrapper;
            int i4 = 82 / 0;
        } else {
            stateFlow = this.MediaSessionCompatResultReceiverWrapper;
        }
        int i5 = i3 + 37;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public StackedDeliveryListUiModelImpl(ContextScope contextScope, ObserveStackedDeliveryList observeStackedDeliveryList, transferSessionPackageI transfersessionpackagei, initlambda20 initlambda20Var, initlambda2 initlambda2Var, UpdateStateUseCaseImpl updateStateUseCaseImpl, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.read = contextScope;
        this.MediaBrowserCompatMediaItem = observeStackedDeliveryList;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        this.PlaybackStateCompatCustomAction = initlambda20Var;
        this.MediaDescriptionCompat = initlambda2Var;
        this.PlaybackStateCompat = updateStateUseCaseImpl;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(getZero9UxMQ8Mannotations.read);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow2;
        RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r6
  0x002e: PHI (r6v1 kotlinx.coroutines.internal.ContextScope) = (r6v0 kotlinx.coroutines.internal.ContextScope), (r6v3 kotlinx.coroutines.internal.ContextScope) binds: [B:8:0x002c, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public final void RemoteActionCompatParcelizer() {
        ContextScope contextScope;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        unaryMinus9UxMQ8M unaryminus9uxmq8m;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 75;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = 0;
        int i4 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            boolean zResultReceiver = ((FirebaseRemoteConfigImpl) this.MediaSessionCompatQueueItem).ResultReceiver();
            contextScope = this.read;
            int i5 = 29 / 0;
            if (zResultReceiver) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.write;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    int i6 = ParcelableVolumeInfo + 105;
                    MediaSessionCompatToken = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                this.write = BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 29), 3);
                int i8 = ParcelableVolumeInfo + 1;
                MediaSessionCompatToken = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
        } else {
            boolean zResultReceiver2 = ((FirebaseRemoteConfigImpl) this.MediaSessionCompatQueueItem).ResultReceiver();
            contextScope = this.read;
            if (zResultReceiver2) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.write;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    int i10 = ParcelableVolumeInfo + 105;
                    MediaSessionCompatToken = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                this.write = BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 29), 3);
                int i12 = ParcelableVolumeInfo + 1;
                MediaSessionCompatToken = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            }
        }
        if (!(!((FirebaseRemoteConfigImpl) this.MediaDescriptionCompat.serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ORDER_STATUS_COUNTDOWN_KILLSWITCH_ENABLED.getFirebaseFlagName()))) {
            return;
        }
        int i14 = ParcelableVolumeInfo + 23;
        MediaSessionCompatToken = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = this.MediaMetadataCompat;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
        }
        Object obj = this.RemoteActionCompatParcelizer.read();
        if (obj instanceof unaryMinus9UxMQ8M) {
            int i16 = ParcelableVolumeInfo + 59;
            MediaSessionCompatToken = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            unaryminus9uxmq8m = (unaryMinus9UxMQ8M) obj;
        } else {
            unaryminus9uxmq8m = null;
        }
        Instant instant = unaryminus9uxmq8m != null ? unaryminus9uxmq8m.read : null;
        if (instant != null) {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            this.MediaMetadataCompat = BuildersKt.RemoteActionCompatParcelizer(contextScope, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new StackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1(this, instant, shortNewsContentCardView, i3), 2);
        }
        Instant instantPlus = Instant.now().plus(1L, (TemporalUnit) ChronoUnit.MINUTES);
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 = this.RatingCompat;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
            int i18 = ParcelableVolumeInfo + 19;
            MediaSessionCompatToken = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
        }
        this.RatingCompat = BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new StackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1(this, instantPlus, shortNewsContentCardView, i4), 3);
        int i20 = MediaSessionCompatToken + 65;
        ParcelableVolumeInfo = i20 % Fields.SpotShadowColor;
        int i21 = i20 % 2;
    }
}
