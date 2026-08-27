package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class BaselineShiftCompanion implements decryptAndGetPasswordBWLJW6A {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final StateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final DrawStyleSpan serializer;
    public final MutableStateFlow write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 81;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            stateFlow = this.IconCompatParcelizer;
            int i4 = 54 / 0;
        } else {
            stateFlow = this.IconCompatParcelizer;
        }
        int i5 = i2 + 95;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaselineShiftCompanion(getQueryContext getquerycontext, DrawStyleSpan drawStyleSpan, ContextScope contextScope, SendTestPushUseCase sendTestPushUseCase, transferSessionPackageI transfersessionpackagei) {
        this.read = getquerycontext;
        this.serializer = drawStyleSpan;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(shaderStatelambda0.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.MediaBrowserCompatMediaItem = mutableStateFlow2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null) {
            return;
        }
        boolean zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_TRIP_PLANNER_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl);
        int i = MediaSessionCompatQueueItem + 97;
        RatingCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
        int i3 = 2 % 2;
        if (zM) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(sendTestPushUseCase, this, null, 22), 3);
            int i4 = MediaSessionCompatQueueItem + 99;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
    }
}
