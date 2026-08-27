package o;

import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffUiModelImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import io.grpc.CallOptions$Builder;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeViewAdapterinit3111 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final CallOptions$Builder write;

    public ComposeViewAdapterinit3111(CallOptions$Builder callOptions$Builder) {
        this.write = callOptions$Builder;
    }

    public final PickUpDropOffUiModelImpl IconCompatParcelizer(ContextScope contextScope) {
        int i = 2 % 2;
        CallOptions$Builder callOptions$Builder = this.write;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.serializer).write();
        objWrite.getClass();
        ObservePuDoDeliveriesResponseImpl observePuDoDeliveriesResponseImpl = (ObservePuDoDeliveriesResponseImpl) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.RemoteActionCompatParcelizer).write();
        objWrite2.getClass();
        UpdateStateUseCaseImpl updateStateUseCaseImpl = (UpdateStateUseCaseImpl) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.read).write();
        objWrite3.getClass();
        r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA r8lambdatoejz8ebqikfdbp_lhyd8cduqfa = (r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA) objWrite3;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.write).write();
        objWrite4.getClass();
        isNullGroup isnullgroup = (isNullGroup) objWrite4;
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.MediaMetadataCompat).write();
        objWrite5.getClass();
        lerpMdfbLM lerpmdfblm = (lerpMdfbLM) objWrite5;
        Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.RatingCompat).write();
        objWrite6.getClass();
        isStateSaved isstatesaved = (isStateSaved) objWrite6;
        Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.IconCompatParcelizer).write();
        objWrite7.getClass();
        Object obj = ((getDoubleOrNull) callOptions$Builder.MediaSessionCompatQueueItem).write;
        obj.getClass();
        PickUpDropOffUiModelImpl pickUpDropOffUiModelImpl = new PickUpDropOffUiModelImpl(contextScope, observePuDoDeliveriesResponseImpl, updateStateUseCaseImpl, r8lambdatoejz8ebqikfdbp_lhyd8cduqfa, isnullgroup, lerpmdfblm, isstatesaved, (performCreate) objWrite7, (ComposableSingletonsComposeViewAdapter_androidKt) obj, new getQueryContext());
        int i2 = serializer + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return pickUpDropOffUiModelImpl;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
