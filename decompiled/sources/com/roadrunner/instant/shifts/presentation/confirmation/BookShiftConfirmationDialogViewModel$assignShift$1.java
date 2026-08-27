package com.roadrunner.instant.shifts.presentation.confirmation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.instant.shifts.presentation.BookShiftConfirmationResult;
import io.grpc.internal.SharedResourcePool;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.EntityInsertionAdapter;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class BookShiftConfirmationDialogViewModel$assignShift$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ BookShiftConfirmationDialogViewModel RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookShiftConfirmationDialogViewModel$assignShift$1(BookShiftConfirmationDialogViewModel bookShiftConfirmationDialogViewModel, int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = bookShiftConfirmationDialogViewModel;
        this.read = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        BookShiftConfirmationDialogViewModel$assignShift$1 bookShiftConfirmationDialogViewModel$assignShift$1 = new BookShiftConfirmationDialogViewModel$assignShift$1(this.RemoteActionCompatParcelizer, this.read, shortNewsContentCardView);
        int i2 = serializer + 61;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return bookShiftConfirmationDialogViewModel$assignShift$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 25;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((BookShiftConfirmationDialogViewModel$assignShift$1) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }
        ((BookShiftConfirmationDialogViewModel$assignShift$1) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM4955invokegIAlus;
        int i = 2 % 2;
        BookShiftConfirmationDialogViewModel bookShiftConfirmationDialogViewModel = this.RemoteActionCompatParcelizer;
        SharedResourcePool sharedResourcePool = bookShiftConfirmationDialogViewModel.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.IconCompatParcelizer;
        int i3 = this.read;
        Object obj2 = null;
        if (i2 != 0) {
            int i4 = write + 111;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? i2 != 1 : i2 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4955invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SendTestPushUseCase sendTestPushUseCase = bookShiftConfirmationDialogViewModel.write;
            this.IconCompatParcelizer = 1;
            objM4955invokegIAlus = sendTestPushUseCase.m4955invokegIAlus(i3, this);
            if (objM4955invokegIAlus == coroutineSingletons) {
                int i5 = write + 109;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return coroutineSingletons;
                }
                obj2.hashCode();
                throw null;
            }
        }
        if (!(objM4955invokegIAlus instanceof isItemDismissable)) {
            bookShiftConfirmationDialogViewModel.serializer.IconCompatParcelizer.logEvent("status_shift_booked", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("status_shift_booked_type", "take_shift"), new onViewAttachedToWindowlambda0("book_shift_id", String.valueOf(i3))));
            sharedResourcePool.serializer(new EntityInsertionAdapter(new BookShiftConfirmationResult.ShiftBookedSuccessfully(bookShiftConfirmationDialogViewModel.MediaBrowserCompatMediaItem.IconCompatParcelizer(R.string.instant_shift_booking_successful))));
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4955invokegIAlus);
        if (thSerializer != null) {
            sharedResourcePool.serializer(new EntityInsertionAdapter(new BookShiftConfirmationResult.ShiftBookingFailed(bookShiftConfirmationDialogViewModel.read.read(thSerializer))));
        }
        return createFromParcel.INSTANCE;
    }
}
