package com.roadrunner.startingarea.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AdjustEvent;
import o.ShortNewsContentCardView;
import o.accesssetAreOutboundNetworkRequestsOfflinecp;
import o.accesssetDelayedInitializationProvidercp;
import o.addSingleSynchronousSubscriptionlambda0;
import o.applyPendingRuntimeConfigurationlambda00;
import o.createFromParcel;
import o.getCieXyz;
import o.getDeduplicationId;
import o.o9;
import o.od;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class StartingAreaNavigateViewUiModelImpl$futureShiftFlow$1$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ StartingAreaNavigateViewUiModelImpl read;
    public /* synthetic */ accesssetAreOutboundNetworkRequestsOfflinecp serializer;
    public final /* synthetic */ AdjustEvent write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartingAreaNavigateViewUiModelImpl$futureShiftFlow$1$1(StartingAreaNavigateViewUiModelImpl startingAreaNavigateViewUiModelImpl, AdjustEvent adjustEvent, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.read = startingAreaNavigateViewUiModelImpl;
        this.write = adjustEvent;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StartingAreaNavigateViewUiModelImpl$futureShiftFlow$1$1 startingAreaNavigateViewUiModelImpl$futureShiftFlow$1$1 = new StartingAreaNavigateViewUiModelImpl$futureShiftFlow$1$1(this.read, this.write, (ShortNewsContentCardView) obj3);
        startingAreaNavigateViewUiModelImpl$futureShiftFlow$1$1.RemoteActionCompatParcelizer = zBooleanValue;
        startingAreaNavigateViewUiModelImpl$futureShiftFlow$1$1.serializer = (accesssetAreOutboundNetworkRequestsOfflinecp) obj2;
        Object objInvokeSuspend = startingAreaNavigateViewUiModelImpl$futureShiftFlow$1$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = IconCompatParcelizer + 1;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 95;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean z = this.RemoteActionCompatParcelizer;
        accesssetAreOutboundNetworkRequestsOfflinecp accesssetareoutboundnetworkrequestsofflinecp = this.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (z) {
            Object[] objArr = {accesssetareoutboundnetworkrequestsofflinecp, accesssetDelayedInitializationProvidercp.IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                applyPendingRuntimeConfigurationlambda00 applypendingruntimeconfigurationlambda00 = this.read.RatingCompat;
                getDeduplicationId getdeduplicationid = this.write.MediaSessionCompatQueueItem;
                setTransactionSuccessful settransactionsuccessful = applypendingruntimeconfigurationlambda00.read;
                getdeduplicationid.getClass();
                int i4 = addSingleSynchronousSubscriptionlambda0.serializer[getdeduplicationid.ordinal()];
                if (i4 == 1) {
                    return new o9(settransactionsuccessful.IconCompatParcelizer(R.string.starting_area_header_item_title), settransactionsuccessful.IconCompatParcelizer(R.string.starting_area_header_item_description), R.color.neutral_100, settransactionsuccessful.IconCompatParcelizer(R.string.home_bottom_sheet_navigate_button_text));
                }
                int i5 = IconCompatParcelizer + 63;
                MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i4 == 2) {
                    return new o9(settransactionsuccessful.IconCompatParcelizer(R.string.starting_area_header_item_title), settransactionsuccessful.IconCompatParcelizer(R.string.starting_area_header_item_late_description), R.color.error_dark_02, settransactionsuccessful.IconCompatParcelizer(R.string.home_bottom_sheet_navigate_button_text));
                }
            }
        }
        return od.write;
    }
}
