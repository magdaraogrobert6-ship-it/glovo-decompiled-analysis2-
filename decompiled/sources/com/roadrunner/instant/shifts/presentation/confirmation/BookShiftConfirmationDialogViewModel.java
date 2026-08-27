package com.roadrunner.instant.shifts.presentation.confirmation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import io.grpc.internal.SharedResourcePool;
import o.AndroidGraphicsContext2;
import o.BrazeLogger;
import o.getUnmodifiedPayloads;
import o.insertAndReturnIdsArray;
import o.insertAndReturnIdsArrayBox;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class BookShiftConfirmationDialogViewModel extends ViewModel {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final SharedResourcePool IconCompatParcelizer;
    public final setTransactionSuccessful MediaBrowserCompatMediaItem;
    public final BrazeLogger MediaMetadataCompat;
    public final n0 RemoteActionCompatParcelizer;
    public final NetworkErrorMapperImpl read;
    public final getUnmodifiedPayloads serializer;
    public final SendTestPushUseCase write;

    public final BrazeLogger IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 67;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        BrazeLogger brazeLogger = this.MediaMetadataCompat;
        int i5 = i2 + 115;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return brazeLogger;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SharedResourcePool read() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 47;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SharedResourcePool sharedResourcePool = this.IconCompatParcelizer;
        int i5 = i2 + 89;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return sharedResourcePool;
    }

    public BookShiftConfirmationDialogViewModel(SendTestPushUseCase sendTestPushUseCase, n0 n0Var, getUnmodifiedPayloads getunmodifiedpayloads, setTransactionSuccessful settransactionsuccessful, NetworkErrorMapperImpl networkErrorMapperImpl, SharedResourcePool sharedResourcePool) {
        sendTestPushUseCase.getClass();
        n0Var.getClass();
        getunmodifiedpayloads.getClass();
        settransactionsuccessful.getClass();
        networkErrorMapperImpl.getClass();
        sharedResourcePool.getClass();
        this.write = sendTestPushUseCase;
        this.RemoteActionCompatParcelizer = n0Var;
        this.serializer = getunmodifiedpayloads;
        this.MediaBrowserCompatMediaItem = settransactionsuccessful;
        this.read = networkErrorMapperImpl;
        this.IconCompatParcelizer = sharedResourcePool;
        this.MediaMetadataCompat = new BrazeLogger(new insertAndReturnIdsArray(null));
    }

    public final void serializer(BookShiftConfirmationParams bookShiftConfirmationParams) {
        int i = 2 % 2;
        BrazeLogger brazeLogger = this.MediaMetadataCompat;
        brazeLogger.getClass();
        AndroidGraphicsContext2 androidGraphicsContext2 = brazeLogger.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer.getClass();
        androidGraphicsContext2.RemoteActionCompatParcelizer(new insertAndReturnIdsArray(new insertAndReturnIdsArrayBox(bookShiftConfirmationParams.RemoteActionCompatParcelizer, bookShiftConfirmationParams.serializer, bookShiftConfirmationParams.read, bookShiftConfirmationParams.MediaBrowserCompatMediaItem, bookShiftConfirmationParams.IconCompatParcelizer, bookShiftConfirmationParams.write)));
        int i2 = RatingCompat + 95;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
