package com.roadrunner.location.toggle.presentation.bottomsheet;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AdjustEvent;
import o.ShortNewsContentCardView;
import o.UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1;
import o.WorkDatabase_Impl;
import o.checkRevenue;
import o.createFromParcel;
import o.isTrackingEnabled;
import o.notifyQueries;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;
import o.sc;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class GetEnableLocationUiState$invoke$2 extends SuspendLambda implements r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ WorkDatabase_Impl IconCompatParcelizer;
    public final /* synthetic */ WorkerWrapper.Builder MediaMetadataCompat;
    public /* synthetic */ boolean RemoteActionCompatParcelizer;
    public /* synthetic */ checkRevenue read;
    public /* synthetic */ boolean serializer;
    public /* synthetic */ sc write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEnableLocationUiState$invoke$2(WorkerWrapper.Builder builder, ShortNewsContentCardView shortNewsContentCardView) {
        super(6, shortNewsContentCardView);
        this.MediaMetadataCompat = builder;
    }

    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
    public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        GetEnableLocationUiState$invoke$2 getEnableLocationUiState$invoke$2 = new GetEnableLocationUiState$invoke$2(this.MediaMetadataCompat, (ShortNewsContentCardView) obj6);
        getEnableLocationUiState$invoke$2.IconCompatParcelizer = (WorkDatabase_Impl) obj;
        getEnableLocationUiState$invoke$2.read = (checkRevenue) obj2;
        getEnableLocationUiState$invoke$2.write = (sc) obj3;
        getEnableLocationUiState$invoke$2.serializer = zBooleanValue;
        getEnableLocationUiState$invoke$2.RemoteActionCompatParcelizer = zBooleanValue2;
        Object objInvokeSuspend = getEnableLocationUiState$invoke$2.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaBrowserCompatMediaItem + 19;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj7 = null;
        obj7.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 97;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        WorkDatabase_Impl workDatabase_Impl = this.IconCompatParcelizer;
        checkRevenue checkrevenue = this.read;
        sc scVar = this.write;
        boolean z = this.serializer;
        boolean z2 = this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!z) {
            int i4 = notifyQueries.RemoteActionCompatParcelizer[workDatabase_Impl.ordinal()];
            Object obj2 = null;
            switch (i4) {
                case 1:
                case 2:
                    WorkerWrapper.Builder builder = this.MediaMetadataCompat;
                    setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) builder.IconCompatParcelizer;
                    AdjustEvent adjustEvent = checkrevenue.read;
                    boolean z3 = adjustEvent != null ? adjustEvent.IconCompatParcelizer : false;
                    boolean zRemoteActionCompatParcelizer = ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) builder.MediaMetadataCompat)).RemoteActionCompatParcelizer(updateAdidI.SEARCH_SHIFTS);
                    if (z3) {
                        UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1 unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1 = new UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1(settransactionsuccessful.IconCompatParcelizer(R.string.location_sharing_start_session_description), settransactionsuccessful.IconCompatParcelizer(R.string.location_sharing_enable_button));
                        int i5 = MediaBrowserCompatMediaItem + 69;
                        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 != 0) {
                            return unfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                    if (checkrevenue.RemoteActionCompatParcelizer) {
                        return new UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1(settransactionsuccessful.IconCompatParcelizer(R.string.location_sharing_on_demand_description), settransactionsuccessful.IconCompatParcelizer(R.string.location_sharing_enable_button));
                    }
                    if (scVar == sc.START_NOW) {
                        return new UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1(settransactionsuccessful.IconCompatParcelizer(R.string.location_sharing_start_now_description), settransactionsuccessful.IconCompatParcelizer(R.string.location_sharing_enable_button));
                    }
                    if (scVar == sc.SCHEDULE && (!zRemoteActionCompatParcelizer)) {
                        int i6 = MediaSessionCompatQueueItem + 113;
                        MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (checkrevenue.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer == isTrackingEnabled.NOT_WORKING) {
                            int i8 = MediaSessionCompatQueueItem + 93;
                            MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                            if (!z2) {
                                return new UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1(settransactionsuccessful.IconCompatParcelizer(R.string.location_sharing_opportunities_description), settransactionsuccessful.IconCompatParcelizer(R.string.location_sharing_enable_button));
                            }
                        }
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
            }
        }
        o.WorkerWrapper workerWrapper = o.WorkerWrapper.RemoteActionCompatParcelizer;
        int i10 = MediaBrowserCompatMediaItem + 3;
        MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return workerWrapper;
    }
}
