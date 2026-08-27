package com.roadrunner.rider.state.provider.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.CallOptions$Builder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createFromParcel;
import o.getInstallReferrer;
import o.getMaxFlingVelocity;
import o.isItemDismissable;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class ValidateAndSaveStatusResponseImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final CallOptions$Builder RemoteActionCompatParcelizer;
    public final resetTransientState write;

    public ValidateAndSaveStatusResponseImpl(CallOptions$Builder callOptions$Builder, resetTransientState resettransientstate) {
        this.RemoteActionCompatParcelizer = callOptions$Builder;
        this.write = resettransientstate;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m5031invokegIAlus(getMaxFlingVelocity getmaxflingvelocity, ContinuationImpl continuationImpl) {
        ValidateAndSaveStatusResponseImpl$invoke$1 validateAndSaveStatusResponseImpl$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof ValidateAndSaveStatusResponseImpl$invoke$1) {
            validateAndSaveStatusResponseImpl$invoke$1 = (ValidateAndSaveStatusResponseImpl$invoke$1) continuationImpl;
            int i2 = validateAndSaveStatusResponseImpl$invoke$1.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 35;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                validateAndSaveStatusResponseImpl$invoke$1.serializer = i2 - Integer.MIN_VALUE;
            } else {
                validateAndSaveStatusResponseImpl$invoke$1 = new ValidateAndSaveStatusResponseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            validateAndSaveStatusResponseImpl$invoke$1 = new ValidateAndSaveStatusResponseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = validateAndSaveStatusResponseImpl$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = validateAndSaveStatusResponseImpl$invoke$1.serializer;
        try {
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                resetTransientState resettransientstate = this.write;
                String string = getmaxflingvelocity.jsonBody.toString();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = getInstallReferrer.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                getInstallReferrer getinstallreferrer = (getInstallReferrer) resettransientstate.serializer(string, setgraphicmodalmaxwidthdpSerializer);
                CallOptions$Builder callOptions$Builder = this.RemoteActionCompatParcelizer;
                validateAndSaveStatusResponseImpl$invoke$1.serializer = 1;
                if (callOptions$Builder.invoke(getinstallreferrer, validateAndSaveStatusResponseImpl$invoke$1) == coroutineSingletons) {
                    int i6 = read + 51;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = IconCompatParcelizer + 77;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i9 = 66 / 0;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i10 = IconCompatParcelizer + 73;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return createfromparcel;
        } catch (Throwable th) {
            return new isItemDismissable(th);
        }
    }
}
