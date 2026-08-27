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
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class PinValidationRowKt$PinInputField$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final /* synthetic */ r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinValidationRowKt$PinInputField$2$1(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        PinValidationRowKt$PinInputField$2$1 pinValidationRowKt$PinInputField$2$1 = new PinValidationRowKt$PinInputField$2$1(this.write, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = serializer + 11;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return pinValidationRowKt$PinInputField$2$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 97;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            PinValidationRowKt$PinInputField$2$1 pinValidationRowKt$PinInputField$2$1 = (PinValidationRowKt$PinInputField$2$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            pinValidationRowKt$PinInputField$2$1.invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((PinValidationRowKt$PinInputField$2$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 51;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            float f = PinValidationRowKt.IconCompatParcelizer;
            Object[] objArr = {this.write, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) this.IconCompatParcelizer.getValue()};
            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        float f2 = PinValidationRowKt.IconCompatParcelizer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.IconCompatParcelizer;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7.getValue();
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = this.write;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk}, iWrite3)).booleanValue()) {
            int i3 = read + 13;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                populateViewStructure_androidKtpopulate7.setValue(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2);
                obj2.hashCode();
                throw null;
            }
            populateViewStructure_androidKtpopulate7.setValue(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2);
        }
        return createFromParcel.INSTANCE;
    }
}
