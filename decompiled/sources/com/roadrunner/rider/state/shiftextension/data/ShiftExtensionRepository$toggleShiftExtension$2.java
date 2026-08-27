package com.roadrunner.rider.state.shiftextension.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getPlayAdId;
import o.getVivoReferrer;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class ShiftExtensionRepository$toggleShiftExtension$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ H$b read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShiftExtensionRepository$toggleShiftExtension$2(H$b h$b, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.read = h$b;
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ShiftExtensionRepository$toggleShiftExtension$2 shiftExtensionRepository$toggleShiftExtension$2 = new ShiftExtensionRepository$toggleShiftExtension$2(this.read, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = write + 87;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return shiftExtensionRepository$toggleShiftExtension$2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((ShiftExtensionRepository$toggleShiftExtension$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = write + 43;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.serializer;
        if (i2 != 0) {
            int i3 = RemoteActionCompatParcelizer + 59;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getPlayAdId getplayadid = (getPlayAdId) this.read.write;
            getVivoReferrer getvivoreferrer = new getVivoReferrer(this.IconCompatParcelizer);
            this.serializer = 1;
            if (getplayadid.write(getvivoreferrer, this) == coroutineSingletons) {
                int i5 = write + 3;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 56 / 0;
                }
                return coroutineSingletons;
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i7 = write + 99;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
