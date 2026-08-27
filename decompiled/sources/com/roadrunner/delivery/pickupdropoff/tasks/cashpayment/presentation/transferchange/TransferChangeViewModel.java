package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import io.grpc.internal.SharedResourcePool;
import o.PopulateViewStructure_androidKtpopulate7;
import o.getBitmapui_graphics;
import o.getInAppMessageEventMap;
import o.getPositionannotations;
import o.parseAnimatedVisibility;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaKeEM9pspkHnqH2VAI0YnSTHzmEQ;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.searchAnylambda00;

/* JADX INFO: loaded from: classes3.dex */
public final class TransferChangeViewModel extends ViewModel {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompatCustomAction;
    public final InitiateTransferChangeUseCase IconCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaBrowserCompatMediaItem;
    public final getBitmapui_graphics MediaDescriptionCompat;
    public final SharedResourcePool MediaMetadataCompat;
    public getInAppMessageEventMap MediaSessionCompatQueueItem;
    public final PopulateViewStructure_androidKtpopulate7 PlaybackStateCompat;
    public final SignInDataStore RatingCompat;
    public final r8lambdaKeEM9pspkHnqH2VAI0YnSTHzmEQ RemoteActionCompatParcelizer;
    public getPositionannotations read;
    public final parseAnimatedVisibility serializer;
    public final DeliveryConfirmationLoggerImpl write;

    public final void read(getPositionannotations getpositionannotations) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 65;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        this.read = getpositionannotations;
        int i5 = i2 + 85;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final SharedResourcePool serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 45;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaMetadataCompat;
        }
        int i3 = 24 / 0;
        return this.MediaMetadataCompat;
    }

    public TransferChangeViewModel(InitiateTransferChangeUseCase initiateTransferChangeUseCase, r8lambdaKeEM9pspkHnqH2VAI0YnSTHzmEQ r8lambdakeem9pspkhnqh2vai0ynsthzmeq, SignInDataStore signInDataStore, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl, parseAnimatedVisibility parseanimatedvisibility, getBitmapui_graphics getbitmapui_graphics, SharedResourcePool sharedResourcePool) {
        initiateTransferChangeUseCase.getClass();
        r8lambdakeem9pspkhnqh2vai0ynsthzmeq.getClass();
        signInDataStore.getClass();
        deliveryConfirmationLoggerImpl.getClass();
        parseanimatedvisibility.getClass();
        getbitmapui_graphics.getClass();
        sharedResourcePool.getClass();
        this.IconCompatParcelizer = initiateTransferChangeUseCase;
        this.RemoteActionCompatParcelizer = r8lambdakeem9pspkhnqh2vai0ynsthzmeq;
        this.RatingCompat = signInDataStore;
        this.write = deliveryConfirmationLoggerImpl;
        this.serializer = parseanimatedvisibility;
        this.MediaDescriptionCompat = getbitmapui_graphics;
        this.MediaMetadataCompat = sharedResourcePool;
        TransferChangeViewState transferChangeViewState = (TransferChangeViewState) getbitmapui_graphics.write("transfer_change_ui_state");
        boolean z = false;
        if (transferChangeViewState == null) {
            TransferChangeViewState transferChangeViewState2 = new TransferChangeViewState(new AmountTextInputState("", false, false, false, ""), new CalculatorState((String) null, 7, z), new TransferButtonState(false));
            int i = PlaybackStateCompatCustomAction + 61;
            MediaSessionCompatToken = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
            transferChangeViewState = transferChangeViewState2;
        }
        this.PlaybackStateCompat = CompositionKt.RemoteActionCompatParcelizer(transferChangeViewState);
        int i3 = MediaSessionCompatToken + 69;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 117;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.MediaMetadataCompat.serializer(searchAnylambda00.read);
            int i3 = 78 / 0;
        } else {
            this.MediaMetadataCompat.serializer(searchAnylambda00.read);
        }
        int i4 = PlaybackStateCompatCustomAction + 17;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final TransferChangeViewState write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 91;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TransferChangeViewState transferChangeViewState = (TransferChangeViewState) this.PlaybackStateCompat.getValue();
        int i4 = PlaybackStateCompatCustomAction + 49;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return transferChangeViewState;
        }
        throw null;
    }

    public final void IconCompatParcelizer(String str) {
        int i = 2 % 2;
        str.getClass();
        this.MediaSessionCompatQueueItem = new getInAppMessageEventMap(str);
        int i2 = PlaybackStateCompatCustomAction + 53;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new ClearDatabaseUseCase$invoke$2(this, null, 2));
        int i2 = MediaSessionCompatToken + 103;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
