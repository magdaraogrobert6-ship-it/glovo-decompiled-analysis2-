package com.roadrunner.database.domain;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import bo.app.d4$$ExternalSyntheticLambda2;
import coil3.ExtrasKt;
import com.mapbox.common.MapboxOptions;
import com.mapbox.common.MapboxSDKCommonInitializer;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordViewModel$generateMagicLink$1;
import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import com.roadrunner.order.history.data.HistoryRepository;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C0166g;
import o.C0180k;
import o.ShortNewsContentCardView;
import o.Transacter;
import o.createFromParcel;
import o.getPositionannotations;
import o.h9;
import o.igExternalSyntheticLambda2;
import o.igExternalSyntheticLambda7;
import o.isContainerdelegate;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.parseAnimatedVisibility;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setToSaturationimpl;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearDatabaseUseCase$invoke$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClearDatabaseUseCase$invoke$2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r1 != 5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r1 != 5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        return new com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2((com.roadrunner.order.history.data.HistoryRepository) r8, r11, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        return new com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2((androidx.work.impl.WorkerWrapper.Builder) r8, r11, r4);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(o.ShortNewsContentCardView r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2.read
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2.serializer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 1
            r7 = 3
            if (r1 == 0) goto L27
            int r1 = r10.RemoteActionCompatParcelizer
            java.lang.Object r8 = r10.write
            int r9 = r3 / r3
            if (r1 == 0) goto L73
            if (r1 == r6) goto L6b
            if (r1 == r0) goto L58
            if (r1 == r7) goto L50
            if (r1 == r5) goto L48
            if (r1 == r4) goto L40
            goto L37
        L27:
            int r1 = r10.RemoteActionCompatParcelizer
            java.lang.Object r8 = r10.write
            if (r1 == 0) goto L73
            if (r1 == r6) goto L6b
            if (r1 == r0) goto L58
            if (r1 == r7) goto L50
            if (r1 == r5) goto L48
            if (r1 == r4) goto L40
        L37:
            com.roadrunner.order.history.data.HistoryRepository r8 = (com.roadrunner.order.history.data.HistoryRepository) r8
            com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2 r0 = new com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2
            r1 = 6
            r0.<init>(r8, r11, r1)
            return r0
        L40:
            androidx.work.impl.WorkerWrapper$Builder r8 = (androidx.work.impl.WorkerWrapper.Builder) r8
            com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2 r0 = new com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2
            r0.<init>(r8, r11, r4)
            return r0
        L48:
            com.roadrunner.login.presentation.router.GetAuthStateViewModel r8 = (com.roadrunner.login.presentation.router.GetAuthStateViewModel) r8
            com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2 r0 = new com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2
            r0.<init>(r8, r11, r5)
            return r0
        L50:
            o.k r8 = (o.C0180k) r8
            com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2 r0 = new com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2
            r0.<init>(r8, r11, r7)
            return r0
        L58:
            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel r8 = (com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel) r8
            com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2 r1 = new com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2
            r1.<init>(r8, r11, r0)
            int r11 = com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2.read
            int r11 = r11 + r7
            int r3 = r11 % 128
            com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2.serializer = r3
            int r11 = r11 % r0
            if (r11 != 0) goto L6a
            return r1
        L6a:
            throw r2
        L6b:
            bo.app.d4$$ExternalSyntheticLambda2 r8 = (bo.app.d4$$ExternalSyntheticLambda2) r8
            com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2 r0 = new com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2
            r0.<init>(r8, r11, r6)
            return r0
        L73:
            com.roadrunner.database.domain.ClearDatabaseUseCase r8 = (com.roadrunner.database.domain.ClearDatabaseUseCase) r8
            com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2 r1 = new com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2
            r1.<init>(r8, r11, r3)
            int r11 = com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2.serializer
            int r11 = r11 + 31
            int r3 = r11 % 128
            com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2.read = r3
            int r11 = r11 % r0
            if (r11 == 0) goto L86
            return r1
        L86:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2.create(o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 23;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i3 == 0) {
            ((ClearDatabaseUseCase$invoke$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        if (i3 == 1) {
            ((ClearDatabaseUseCase$invoke$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        if (i3 == 2) {
            ((ClearDatabaseUseCase$invoke$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            int i4 = read + 1;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel2;
        }
        if (i3 == 3) {
            ((ClearDatabaseUseCase$invoke$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        if (i3 != 4) {
            if (i3 != 5) {
                ((ClearDatabaseUseCase$invoke$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            }
            ((ClearDatabaseUseCase$invoke$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        ((ClearDatabaseUseCase$invoke$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i6 = read + 53;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 62 / 0;
        }
        return createfromparcel2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.write;
        int i3 = 0;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((ClearDatabaseUseCase) obj2).serializer.clearAllTables();
            int i4 = read + 49;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 35 / 0;
            }
            return createfromparcel;
        }
        int i6 = 1;
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((d4$$ExternalSyntheticLambda2) obj2).invoke();
            return createfromparcel;
        }
        Map mapRemoteActionCompatParcelizer = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i2 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TransferChangeViewModel transferChangeViewModel = (TransferChangeViewModel) obj2;
            parseAnimatedVisibility parseanimatedvisibility = transferChangeViewModel.serializer;
            getPositionannotations getpositionannotations = transferChangeViewModel.read;
            if (getpositionannotations != null) {
                parseanimatedvisibility.getClass();
                mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", getpositionannotations.currentDeliveryId), new onViewAttachedToWindowlambda0("deliveryState", getpositionannotations.deliveryState), new onViewAttachedToWindowlambda0("deliveryTasks", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.taskIds, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("isTaskMandatory", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.tasksRequired, ",", null, null, null, 62)));
            }
            parseanimatedvisibility.IconCompatParcelizer.IconCompatParcelizer("Transfer Change", mapRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i2 == 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            C0180k c0180k = (C0180k) obj2;
            if (c0180k.RemoteActionCompatParcelizer instanceof C0166g) {
                OtpLogger otpLogger = c0180k.read;
                Transacter transacter = Transacter.EMAIL;
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) c0180k.MediaMetadataCompat;
                firebaseRemoteConfigImpl.getClass();
                otpLogger.read(transacter, firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED));
                c0180k.getClass();
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(c0180k, new ForgotPasswordViewModel$generateMagicLink$1(c0180k, objArr2 == true ? 1 : 0, i3));
            } else {
                OtpLogger otpLogger2 = c0180k.read;
                Transacter transacter2 = Transacter.SMS;
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) c0180k.MediaMetadataCompat;
                firebaseRemoteConfigImpl2.getClass();
                otpLogger2.read(transacter2, firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED));
                c0180k.getClass();
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(c0180k, new ForgotPasswordViewModel$generateMagicLink$1(c0180k, objArr == true ? 1 : 0, i6));
            }
            return createfromparcel;
        }
        if (i2 == 4) {
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((isContainerdelegate) ((GetAuthStateViewModel) obj2).ResultReceiver).write("Custom Password Not Completed");
            return createfromparcel;
        }
        if (i2 != 5) {
            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((HistoryRepository) obj2).serializer.clearAllTables();
            int i7 = serializer + 61;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return createfromparcel;
            }
            (objArr3 == true ? 1 : 0).hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        WorkerWrapper.Builder builder = (WorkerWrapper.Builder) obj2;
        setToSaturationimpl settosaturationimplIconCompatParcelizer = setToSaturationimpl.IconCompatParcelizer((Application) builder.write);
        settosaturationimplIconCompatParcelizer.read(MapboxSDKCommonInitializer.class);
        WorkerWrapper.Builder.IconCompatParcelizer();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Initializing mapbox SDK v11 on computation thread", new Object[0]);
        MapboxOptions.setAccessToken(((h9) builder.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer());
        ((igExternalSyntheticLambda2) builder.MediaBrowserCompatMediaItem).IconCompatParcelizer(igExternalSyntheticLambda7.MAPBOX_INITIALIZED);
        return createfromparcel;
    }
}
