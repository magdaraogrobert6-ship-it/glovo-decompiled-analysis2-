package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.compose;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class CashPaymentKt$CashTaskColumn$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ CashPaymentTaskUiItem IconCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashPaymentKt$CashTaskColumn$2$1(CashPaymentTaskUiItem cashPaymentTaskUiItem, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = cashPaymentTaskUiItem;
        this.read = populateViewStructure_androidKtpopulate7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = 0;
        if (this.write == 0) {
            return new CashPaymentKt$CashTaskColumn$2$1(this.IconCompatParcelizer, this.read, shortNewsContentCardView, i4);
        }
        CashPaymentKt$CashTaskColumn$2$1 cashPaymentKt$CashTaskColumn$2$1 = new CashPaymentKt$CashTaskColumn$2$1(this.IconCompatParcelizer, this.read, shortNewsContentCardView, 1);
        int i5 = RemoteActionCompatParcelizer + 111;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return cashPaymentKt$CashTaskColumn$2$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 101;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            ((CashPaymentKt$CashTaskColumn$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((CashPaymentKt$CashTaskColumn$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RemoteActionCompatParcelizer + 51;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 41;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CashPaymentTaskUiItem cashPaymentTaskUiItem = this.IconCompatParcelizer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.read;
        if (i4 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) populateViewStructure_androidKtpopulate7.getValue(), cashPaymentTaskUiItem.RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                populateViewStructure_androidKtpopulate7.setValue(cashPaymentTaskUiItem.RemoteActionCompatParcelizer());
            }
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) populateViewStructure_androidKtpopulate7.getValue(), cashPaymentTaskUiItem.RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
            populateViewStructure_androidKtpopulate7.setValue(cashPaymentTaskUiItem.RemoteActionCompatParcelizer());
        }
        int i5 = serializer + 103;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
