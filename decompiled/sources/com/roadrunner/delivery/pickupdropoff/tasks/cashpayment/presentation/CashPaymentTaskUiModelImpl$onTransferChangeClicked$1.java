package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isInline;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.testOverrideAvailability;

/* JADX INFO: loaded from: classes3.dex */
public final class CashPaymentTaskUiModelImpl$onTransferChangeClicked$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ double IconCompatParcelizer;
    public final /* synthetic */ isInline read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ CashPaymentTaskUiModelImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashPaymentTaskUiModelImpl$onTransferChangeClicked$1(CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl, isInline isinline, String str, double d, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = cashPaymentTaskUiModelImpl;
        this.read = isinline;
        this.serializer = str;
        this.IconCompatParcelizer = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        CashPaymentTaskUiModelImpl$onTransferChangeClicked$1 cashPaymentTaskUiModelImpl$onTransferChangeClicked$1 = new CashPaymentTaskUiModelImpl$onTransferChangeClicked$1(this.write, this.read, this.serializer, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = MediaBrowserCompatMediaItem + 39;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return cashPaymentTaskUiModelImpl$onTransferChangeClicked$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            CashPaymentTaskUiModelImpl$onTransferChangeClicked$1 cashPaymentTaskUiModelImpl$onTransferChangeClicked$1 = (CashPaymentTaskUiModelImpl$onTransferChangeClicked$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            cashPaymentTaskUiModelImpl$onTransferChangeClicked$1.invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        CashPaymentTaskUiModelImpl$onTransferChangeClicked$1 cashPaymentTaskUiModelImpl$onTransferChangeClicked$2 = (CashPaymentTaskUiModelImpl$onTransferChangeClicked$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        cashPaymentTaskUiModelImpl$onTransferChangeClicked$2.invokeSuspend(createfromparcel2);
        int i3 = 12 / 0;
        return createfromparcel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        String str = this.read.uid;
        CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = this.write;
        cashPaymentTaskUiModelImpl.MediaBrowserCompatMediaItem.serializer(cashPaymentTaskUiModelImpl.write, str);
        cashPaymentTaskUiModelImpl.read.serializer(new testOverrideAvailability(this.read, this.serializer, this.IconCompatParcelizer, cashPaymentTaskUiModelImpl.write));
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = RemoteActionCompatParcelizer + 55;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return createfromparcel;
    }
}
