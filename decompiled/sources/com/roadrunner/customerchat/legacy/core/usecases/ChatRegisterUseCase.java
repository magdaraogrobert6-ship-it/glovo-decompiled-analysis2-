package com.roadrunner.customerchat.legacy.core.usecases;

import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.data.util.AndroidScheduleProvider;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import com.roadrunner.domain.usecase.ObservableUseCase;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.internal.operators.mixed.FlowableConcatMapSingle;
import io.reactivex.internal.util.ErrorMode;
import kotlinx.coroutines.flow.SharedFlowImpl;
import o.TextUnitType;
import o.createFromParcel;
import o.forEachNewCallbackNeverInvoked;
import o.getPivotOffsetF1C5BW0;
import o.onBackStartedlambda1;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog;
import o.r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRegisterUseCase extends ObservableUseCase {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final forEachNewCallbackNeverInvoked RemoteActionCompatParcelizer;
    public final TextUnitType read;
    public final transferSessionPackageI write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRegisterUseCase(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, transferSessionPackageI transfersessionpackagei, TextUnitType textUnitType, forEachNewCallbackNeverInvoked foreachnewcallbackneverinvoked) {
        super(((AndroidScheduleProvider) getpivotoffsetf1c5bw0).IconCompatParcelizer());
        getpivotoffsetf1c5bw0.getClass();
        transfersessionpackagei.getClass();
        textUnitType.getClass();
        foreachnewcallbackneverinvoked.getClass();
        this.write = transfersessionpackagei;
        this.read = textUnitType;
        this.RemoteActionCompatParcelizer = foreachnewcallbackneverinvoked;
    }

    @Override // com.roadrunner.domain.usecase.ObservableUseCase
    public final Flowable write(Object obj) {
        int i = 2 % 2;
        ((createFromParcel) obj).getClass();
        SharedFlowImpl sharedFlowImpl = ((ChatDeliveryRepositoryImpl) this.read).RemoteActionCompatParcelizer;
        r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4[] r8lambdaxxy0icvbkqrejyjmjwchaqi7z4Arr = onBackStartedlambda1.serializer;
        r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog r8lambdaw8l8p7bwyb0wtwnko8kzqkdckog = new r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog(sharedFlowImpl, prepareForActivityTransitionCarryover.read.plus(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write));
        int i2 = Flowable.write;
        FlowableFromPublisher flowableFromPublisher = new FlowableFromPublisher(r8lambdaw8l8p7bwyb0wtwnko8kzqkdckog);
        PerseusInitializerImpl$$ExternalSyntheticLambda0 perseusInitializerImpl$$ExternalSyntheticLambda0 = new PerseusInitializerImpl$$ExternalSyntheticLambda0(14, new RoomDatabase$$ExternalSyntheticLambda2(17, this));
        ObjectHelper.serializer(2, "prefetch");
        FlowableConcatMapSingle flowableConcatMapSingle = new FlowableConcatMapSingle(flowableFromPublisher, perseusInitializerImpl$$ExternalSyntheticLambda0, ErrorMode.IMMEDIATE);
        int i3 = RatingCompat + 123;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return flowableConcatMapSingle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        if (r3.MediaMetadataCompat.compareAndSet(!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r3.ResultReceiver, r7}, o.getCieXyz.write())).booleanValue(), true) != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void read(io.reactivex.SingleEmitter r21) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.legacy.core.usecases.ChatRegisterUseCase.read(io.reactivex.SingleEmitter):void");
    }
}
