package com.roadrunner.startworking.oneclick;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.location.core.domain.GetLocationUpdatesUseCaseImpl;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.network.NetworkBody;
import o.IBraze;
import o.SystemLifecycleSystemLifecycleCallback;
import o.createFromParcel;
import o.doesTransientStatePreventRecycling;
import o.elambda0;
import o.getBitmapui_graphics;
import o.getQueryContext;
import o.handleUrlOverridelambda1;
import o.isHiddenannotations;
import o.isOpenInternalroom_runtime;
import o.lambda31;
import o.lambda39;
import o.logLocationRecordedEventFromLocationUpdatelambda0;
import o.logPurchaselambda1;
import o.logPushStoryPageClickedlambda1;
import o.mergeJsonObjects;
import o.performPushDeliveryFlushlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.requestSingleLocationUpdatelambda1;
import o.setSdkAuthenticationSignature;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OneClickStartWorkingFragment$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ OneClickStartWorkingFragment RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ OneClickStartWorkingFragment$$ExternalSyntheticLambda0(OneClickStartWorkingFragment oneClickStartWorkingFragment, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = oneClickStartWorkingFragment;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        OneClickStartWorkingFragment oneClickStartWorkingFragment = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            ExtrasKt.write(oneClickStartWorkingFragment, bool);
            int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            ExtrasKt.read(662558831, iRemoteActionCompatParcelizer2, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -662558827, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, new Object[]{oneClickStartWorkingFragment, bool});
            return createFromParcel.INSTANCE;
        }
        getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) obj;
        getbitmapui_graphics.getClass();
        logLocationRecordedEventFromLocationUpdatelambda0 loglocationrecordedeventfromlocationupdatelambda0 = oneClickStartWorkingFragment.invalidateMenu;
        if (loglocationrecordedeventfromlocationupdatelambda0 == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        IBraze iBraze = loglocationrecordedeventfromlocationupdatelambda0.read;
        OneClickStartWorkingViewModel oneClickStartWorkingViewModel = new OneClickStartWorkingViewModel((lambda39) ((elambda0) iBraze.read).write(), (NetworkBody) ((setSdkAuthenticationSignature) iBraze.RemoteActionCompatParcelizer).write(), (N$b) ((isHiddenannotations) iBraze.MediaMetadataCompat).write(), (setTransactionSuccessful) ((mergeJsonObjects) iBraze.RatingCompat).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) iBraze.ParcelableVolumeInfo).write(), (transferSessionPackageI) ((mergeJsonObjects) iBraze.PlaybackStateCompat).write(), (C$b) ((lambda31) iBraze.serializer).write(), new logPushStoryPageClickedlambda1(), (NetworkErrorMapperImpl) ((mergeJsonObjects) iBraze.IconCompatParcelizer).write(), (SharedResourcePool) ((requestSingleLocationUpdatelambda1) iBraze.MediaBrowserCompatMediaItem).write(), (logPurchaselambda1) ((mergeJsonObjects) iBraze.MediaDescriptionCompat).write(), (CallTracer) ((performPushDeliveryFlushlambda0) iBraze.MediaSessionCompatQueueItem).write(), (SystemLifecycleSystemLifecycleCallback) ((mergeJsonObjects) iBraze.MediaSessionCompatResultReceiverWrapper).write(), new getQueryContext(), (C$b) ((setSdkAuthenticationSignature) iBraze.write).write(), (GetLocationUpdatesUseCaseImpl) ((mergeJsonObjects) iBraze.MediaSessionCompatToken).write(), (doesTransientStatePreventRecycling) ((mergeJsonObjects) iBraze.PlaybackStateCompatCustomAction).write(), getbitmapui_graphics);
        int i5 = IconCompatParcelizer + 83;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return oneClickStartWorkingViewModel;
    }
}
