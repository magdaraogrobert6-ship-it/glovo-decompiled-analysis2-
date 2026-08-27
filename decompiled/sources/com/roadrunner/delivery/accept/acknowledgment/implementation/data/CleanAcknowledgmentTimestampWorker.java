package com.roadrunner.delivery.accept.acknowledgment.implementation.data;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.TextUnitTypeSaverlambda1;
import o.accesssetRenderEffectjd;
import o.getFontStyleSaver;
import o.pauseWebviewIfNecessarylambda10;
import o.setClip;

/* JADX INFO: loaded from: classes3.dex */
public final class CleanAcknowledgmentTimestampWorker extends CoroutineWorker {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final WorkerParameters MediaDescriptionCompat;
    public final TextUnitTypeSaverlambda1 RatingCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanAcknowledgmentTimestampWorker(Context context, WorkerParameters workerParameters, TextUnitTypeSaverlambda1 textUnitTypeSaverlambda1) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        textUnitTypeSaverlambda1.getClass();
        this.MediaDescriptionCompat = workerParameters;
        this.RatingCompat = textUnitTypeSaverlambda1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(ShortNewsContentCardView shortNewsContentCardView) {
        getFontStyleSaver getfontstylesaver;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof getFontStyleSaver) {
            getfontstylesaver = (getFontStyleSaver) shortNewsContentCardView;
            int i2 = getfontstylesaver.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaMetadataCompat + 67;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                getfontstylesaver.serializer = i2 - Integer.MIN_VALUE;
            } else {
                getfontstylesaver = new getFontStyleSaver(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            getfontstylesaver = new getFontStyleSaver(this, (ContinuationImpl) shortNewsContentCardView);
        }
        Object obj = getfontstylesaver.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getfontstylesaver.serializer;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        try {
            if (i5 != 0) {
                int i6 = MediaMetadataCompat + 37;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i7 = MediaSessionCompatQueueItem + 85;
                    MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                long jIconCompatParcelizer = this.MediaDescriptionCompat.RemoteActionCompatParcelizer.IconCompatParcelizer("delivery_id");
                if (jIconCompatParcelizer == 0) {
                    return new accesssetRenderEffectjd();
                }
                TextUnitTypeSaverlambda1 textUnitTypeSaverlambda1 = this.RatingCompat;
                getfontstylesaver.serializer = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(((TimestampRepositoryImpl) textUnitTypeSaverlambda1).RemoteActionCompatParcelizer, new TimestampRepositoryImpl$delete$2(jIconCompatParcelizer, shortNewsContentCardView2, 0), getfontstylesaver) == coroutineSingletons) {
                    int i9 = MediaSessionCompatQueueItem + 41;
                    MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return coroutineSingletons;
                }
            }
            return new setClip();
        } catch (Exception unused) {
            return new accesssetRenderEffectjd();
        }
    }
}
