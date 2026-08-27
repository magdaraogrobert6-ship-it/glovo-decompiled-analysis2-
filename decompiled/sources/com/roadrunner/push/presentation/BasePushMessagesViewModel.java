package com.roadrunner.push.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.roadrunner.push.DialogMessageRequestProxy;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import io.reactivex.disposables.CompositeDisposable;
import o.AndroidGraphicsContext2;
import o.access1000;
import o.getKeyboardTap5zf0vsI;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePushMessagesViewModel extends ViewModel {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final CompositeDisposable ComponentActivity;
    public final AndroidGraphicsContext2 MediaBrowserCompatMediaItem;
    public final AndroidGraphicsContext2 MediaMetadataCompat;
    public final AndroidGraphicsContext2 MediaSessionCompatQueueItem;
    public final AndroidGraphicsContext2 MediaSessionCompatResultReceiverWrapper;
    public DefaultForegroundSoundManager MediaSessionCompatToken;
    public access1000 ParcelableVolumeInfo;
    public final AndroidGraphicsContext2 PlaybackStateCompat;
    public final AndroidGraphicsContext2 PlaybackStateCompatCustomAction;
    public DialogMessageRequestProxy RatingCompat;
    public getKeyboardTap5zf0vsI r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    public BasePushMessagesViewModel() {
        AndroidGraphicsContext2 androidGraphicsContext2 = new AndroidGraphicsContext2();
        this.MediaMetadataCompat = androidGraphicsContext2;
        this.PlaybackStateCompatCustomAction = androidGraphicsContext2;
        AndroidGraphicsContext2 androidGraphicsContext3 = new AndroidGraphicsContext2();
        this.MediaBrowserCompatMediaItem = androidGraphicsContext3;
        this.PlaybackStateCompat = androidGraphicsContext3;
        AndroidGraphicsContext2 androidGraphicsContext4 = new AndroidGraphicsContext2();
        this.MediaSessionCompatQueueItem = androidGraphicsContext4;
        this.MediaSessionCompatResultReceiverWrapper = androidGraphicsContext4;
        this.ComponentActivity = new CompositeDisposable();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = read + 45;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.ComponentActivity.read();
        int i4 = RemoteActionCompatParcelizer + 17;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        r0 = 97 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        o.removeNodeAtDepth.serializer("dialogMessageRequestProxy");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1.write().RemoteActionCompatParcelizer(io.reactivex.android.schedulers.AndroidSchedulers.RemoteActionCompatParcelizer()).subscribe(new io.sentry.SentryTracer$$ExternalSyntheticLambda1(r0, new com.roadrunner.home.HomeFragment.AnonymousClass1(1, r12, com.roadrunner.push.presentation.BasePushMessagesViewModel.class, "onDialogMessageRequestEvent", "onDialogMessageRequestEvent(Lcom/roadrunner/push/event/DialogMessageRequestEvent;)V", 0, 25)), new io.sentry.SentryTracer$$ExternalSyntheticLambda1(3, new com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1(r2)));
        r1.getClass();
        r2 = r12.ComponentActivity;
        r2.getClass();
        r2.read(r1);
        r1 = com.roadrunner.push.presentation.BasePushMessagesViewModel.RemoteActionCompatParcelizer + 11;
        com.roadrunner.push.presentation.BasePushMessagesViewModel.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityStart() {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.push.presentation.BasePushMessagesViewModel.RemoteActionCompatParcelizer
            r2 = 23
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.roadrunner.push.presentation.BasePushMessagesViewModel.read = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            com.roadrunner.push.DialogMessageRequestProxy r1 = r12.RatingCompat
            r3 = 6
            int r3 = r3 / 0
            if (r1 == 0) goto L67
            goto L1b
        L17:
            com.roadrunner.push.DialogMessageRequestProxy r1 = r12.RatingCompat
            if (r1 == 0) goto L67
        L1b:
            io.reactivex.internal.operators.observable.ObservableMap r1 = r1.write()
            io.reactivex.Scheduler r3 = io.reactivex.android.schedulers.AndroidSchedulers.RemoteActionCompatParcelizer()
            io.reactivex.internal.operators.observable.ObservableObserveOn r1 = r1.RemoteActionCompatParcelizer(r3)
            com.roadrunner.home.HomeFragment$onViewCreated$1 r11 = new com.roadrunner.home.HomeFragment$onViewCreated$1
            r4 = 1
            java.lang.Class<com.roadrunner.push.presentation.BasePushMessagesViewModel> r6 = com.roadrunner.push.presentation.BasePushMessagesViewModel.class
            java.lang.String r7 = "onDialogMessageRequestEvent"
            java.lang.String r8 = "onDialogMessageRequestEvent(Lcom/roadrunner/push/event/DialogMessageRequestEvent;)V"
            r9 = 0
            r10 = 25
            r3 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            io.sentry.SentryTracer$$ExternalSyntheticLambda1 r3 = new io.sentry.SentryTracer$$ExternalSyntheticLambda1
            r3.<init>(r0, r11)
            com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1 r4 = new com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1
            r4.<init>(r2)
            io.sentry.SentryTracer$$ExternalSyntheticLambda1 r2 = new io.sentry.SentryTracer$$ExternalSyntheticLambda1
            r5 = 3
            r2.<init>(r5, r4)
            io.reactivex.disposables.Disposable r1 = r1.subscribe(r3, r2)
            r1.getClass()
            io.reactivex.disposables.CompositeDisposable r2 = r12.ComponentActivity
            r2.getClass()
            r2.read(r1)
            int r1 = com.roadrunner.push.presentation.BasePushMessagesViewModel.RemoteActionCompatParcelizer
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.roadrunner.push.presentation.BasePushMessagesViewModel.read = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L66
            r0 = 97
            int r0 = r0 / 0
        L66:
            return
        L67:
            java.lang.String r0 = "dialogMessageRequestProxy"
            o.removeNodeAtDepth.serializer(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.push.presentation.BasePushMessagesViewModel.onActivityStart():void");
    }
}
