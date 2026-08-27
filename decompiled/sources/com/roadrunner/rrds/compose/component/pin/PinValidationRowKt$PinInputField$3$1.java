package com.roadrunner.rrds.compose.component.pin;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class PinValidationRowKt$PinInputField$3$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinValidationRowKt$PinInputField$3$1(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        PinValidationRowKt$PinInputField$3$1 pinValidationRowKt$PinInputField$3$1 = new PinValidationRowKt$PinInputField$3$1(this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = serializer + 47;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return pinValidationRowKt$PinInputField$3$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 69;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((PinValidationRowKt$PinInputField$3$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            throw null;
        }
        PinValidationRowKt$PinInputField$3$1 pinValidationRowKt$PinInputField$3$1 = (PinValidationRowKt$PinInputField$3$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        pinValidationRowKt$PinInputField$3$1.invokeSuspend(createfromparcel);
        int i3 = serializer + 81;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 89;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            float f = PinValidationRowKt.IconCompatParcelizer;
            Object[] objArr = {(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) this.IconCompatParcelizer.getValue(), this.write};
            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        float f2 = PinValidationRowKt.IconCompatParcelizer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.IconCompatParcelizer;
        Object[] objArr2 = {(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7.getValue(), this.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            this.RemoteActionCompatParcelizer.invoke((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7.getValue());
            int i3 = read + 25;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        return createFromParcel.INSTANCE;
    }
}
