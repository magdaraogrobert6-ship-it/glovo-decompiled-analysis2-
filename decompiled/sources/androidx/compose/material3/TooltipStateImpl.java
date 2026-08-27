package androidx.compose.material3;

import androidx.compose.foundation.MutatorMutex$mutate$2;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.perseus.data.local.SharedPreferenceToDataStoreBridge;
import com.deliveryhero.selfServiceChat.domain.analytics.WebChatEventsTrackerImpl;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.mapbox.navigation.core.history.MapboxHistoryRecorder;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingPusher;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.delivery.accept.laststop.data.LastStopRepositoryImpl;
import com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository;
import com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository;
import com.roadrunner.liveness.failure.presentation.FailureViewModel;
import com.roadrunner.map.integration.mapbox.route.FetchMapboxRouteUseCase;
import com.roadrunner.twofa.data.repo.TwoFaRepository;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.YieldKt;
import o.AndroidView_androidKtupdateViewHolderParams2;
import o.BoxKt;
import o.Bullet;
import o.ShortNewsContentCardView;
import o.applyMeasureResultfoundation;
import o.awaitScrollDependencies;
import o.clearTextSubstitution;
import o.collapsedefault;
import o.copyaIRg9q4default;
import o.createFromParcel;
import o.dismiss;
import o.getSelectableGroup;
import o.getWidthXSAIIZE;
import o.onShowTranslationui;
import o.r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.validateSizeN5eqBDc;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes.dex */
public final class TooltipStateImpl {
    public CancellableContinuationImpl IconCompatParcelizer;
    public final awaitScrollDependencies RemoteActionCompatParcelizer;
    public final BoxKt serializer = new BoxKt(Boolean.FALSE);

    /* JADX INFO: renamed from: androidx.compose.material3.TooltipStateImpl$show$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int MediaDescriptionCompat = 0;
        private static int MediaMetadataCompat = 1;
        public final /* synthetic */ Object IconCompatParcelizer;
        public Object RemoteActionCompatParcelizer;
        public final /* synthetic */ int read;
        public int serializer;
        public Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(1, shortNewsContentCardView);
            this.read = i;
            this.RemoteActionCompatParcelizer = obj;
            this.write = obj2;
            this.IconCompatParcelizer = obj3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(1, shortNewsContentCardView);
            this.read = i;
            this.write = obj;
            this.IconCompatParcelizer = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(1, shortNewsContentCardView);
            this.read = i;
            this.IconCompatParcelizer = obj;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 35;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                obj2.hashCode();
                throw null;
            }
            int i3 = this.read;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
            switch (i3) {
                case 0:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 1:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 2:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 3:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 4:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 5:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 6:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 7:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 8:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 9:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 10:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 11:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 12:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 13:
                    Object objInvokeSuspend = ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                    int i4 = MediaDescriptionCompat + 69;
                    MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    obj2.hashCode();
                    throw null;
                case 14:
                    Object objInvokeSuspend2 = ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                    int i5 = MediaMetadataCompat + 105;
                    MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        return objInvokeSuspend2;
                    }
                    obj2.hashCode();
                    throw null;
                case 15:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 16:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 17:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 18:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                case 19:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                default:
                    return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = this.read;
            Object obj = this.IconCompatParcelizer;
            switch (i2) {
                case 0:
                    return new AnonymousClass2((TooltipStateImpl) this.RemoteActionCompatParcelizer, (MapboxNavigation$parsing$2) this.write, (applyMeasureResultfoundation) obj, shortNewsContentCardView, 0);
                case 1:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((AnchoredDraggableState) this.RemoteActionCompatParcelizer, this.write, (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) obj, shortNewsContentCardView, 1);
                    int i3 = MediaMetadataCompat + 77;
                    MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        int i4 = 18 / 0;
                    }
                    return anonymousClass2;
                case 2:
                    return new AnonymousClass2((androidx.compose.material3.internal.AnchoredDraggableState) this.RemoteActionCompatParcelizer, this.write, (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) obj, shortNewsContentCardView, 2);
                case 3:
                    return new AnonymousClass2((SharedPreferenceToDataStoreBridge) this.RemoteActionCompatParcelizer, (String) this.write, (String) obj, shortNewsContentCardView, 3);
                case 4:
                    AnonymousClass2 anonymousClass3 = new AnonymousClass2((WebChatEventsTrackerImpl) this.RemoteActionCompatParcelizer, (String) this.write, (validateSizeN5eqBDc) obj, shortNewsContentCardView, 4);
                    int i5 = MediaMetadataCompat + 33;
                    MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return anonymousClass3;
                case 5:
                    return new AnonymousClass2((RouteLineHistoryRecordingPusher) this.RemoteActionCompatParcelizer, (MapboxHistoryRecorder) this.write, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj, shortNewsContentCardView, 5);
                case 6:
                    return new AnonymousClass2((AuthRepository) this.RemoteActionCompatParcelizer, (collapsedefault) this.write, (String) obj, shortNewsContentCardView, 6);
                case 7:
                    return new AnonymousClass2((AuthRepository) this.RemoteActionCompatParcelizer, (clearTextSubstitution) this.write, (String) obj, shortNewsContentCardView, 7);
                case 8:
                    return new AnonymousClass2((AuthRepository) this.RemoteActionCompatParcelizer, (dismiss) this.write, (String) obj, shortNewsContentCardView, 8);
                case 9:
                    AnonymousClass2 anonymousClass4 = new AnonymousClass2((AuthRepository) this.RemoteActionCompatParcelizer, (getSelectableGroup) this.write, (String) obj, shortNewsContentCardView, 9);
                    int i7 = MediaMetadataCompat + 11;
                    MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        return anonymousClass4;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                case 10:
                    return new AnonymousClass2((ProtobufEncoder) this.write, (getWidthXSAIIZE) obj, shortNewsContentCardView, 10);
                case 11:
                    return new AnonymousClass2((com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl) this.RemoteActionCompatParcelizer, (Bullet) this.write, (String) obj, shortNewsContentCardView, 11);
                case 12:
                    return new AnonymousClass2((LastStopRepositoryImpl) this.RemoteActionCompatParcelizer, (String) this.write, (String) obj, shortNewsContentCardView, 12);
                case 13:
                    return new AnonymousClass2((DeliveryAcceptDataRepository) this.write, (AndroidView_androidKtupdateViewHolderParams2) obj, shortNewsContentCardView, 13);
                case 14:
                    return new AnonymousClass2((DeliveryAcceptDataRepository) this.write, (copyaIRg9q4default) obj, shortNewsContentCardView, 14);
                case 15:
                    return new AnonymousClass2((NotificationsDiagnosticsRepository) this.RemoteActionCompatParcelizer, (String) this.write, (String) obj, shortNewsContentCardView, 15);
                case 16:
                    return new AnonymousClass2((FailureViewModel) obj, shortNewsContentCardView, 16);
                case 17:
                    return new AnonymousClass2((MetricsBatchProcessor) obj, shortNewsContentCardView, 17);
                case 18:
                    return new AnonymousClass2((FetchMapboxRouteUseCase) this.RemoteActionCompatParcelizer, (MapboxNavigation) this.write, (RouteOptions) obj, shortNewsContentCardView, 18);
                case 19:
                    return new AnonymousClass2((FormBody.Builder) this.write, (r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM) obj, shortNewsContentCardView, 19);
                default:
                    return new AnonymousClass2((TwoFaRepository) this.RemoteActionCompatParcelizer, (String) this.write, (String) obj, shortNewsContentCardView, 20);
            }
        }

        /* JADX WARN: Code duplicated, block: B:296:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x017b  */
        /* JADX WARN: Code duplicated, block: B:69:0x018e  */
        /* JADX WARN: Code duplicated, block: B:73:0x019e  */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0230, code lost:
        
            if (r1 == r2) goto L105;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1626
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipStateImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void IconCompatParcelizer() {
        ((onShowTranslationui) this.serializer.write).setValue(Boolean.FALSE);
    }

    public final boolean read() {
        BoxKt boxKt = this.serializer;
        return ((Boolean) ((onShowTranslationui) boxKt.read).getValue()).booleanValue() || ((Boolean) ((onShowTranslationui) boxKt.write).getValue()).booleanValue();
    }

    public TooltipStateImpl(awaitScrollDependencies awaitscrolldependencies) {
        this.RemoteActionCompatParcelizer = awaitscrolldependencies;
    }

    public final Object show(applyMeasureResultfoundation applymeasureresultfoundation, SuspendLambda suspendLambda) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, new MapboxNavigation$parsing$2(this, null, 2), applymeasureresultfoundation, null, 0);
        awaitScrollDependencies awaitscrolldependencies = this.RemoteActionCompatParcelizer;
        awaitscrolldependencies.getClass();
        Object objCoroutineScope = YieldKt.coroutineScope(new MutatorMutex$mutate$2(applymeasureresultfoundation, (Object) awaitscrolldependencies, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) anonymousClass2, (ShortNewsContentCardView) null, 0), suspendLambda);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createFromParcel.INSTANCE;
    }
}
