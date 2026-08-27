package com.foodora.courier.legacy.ui.main;

import androidx.cardview.widget.CardView$1;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.graphics.Fields;
import bo.app.d4$$ExternalSyntheticLambda2;
import bo.app.f2$$ExternalSyntheticLambda4;
import com.foodora.courier.base.presentation.view.presenter.BasePresenter;
import com.foodora.courier.main.presentation.MainActivity;
import com.roadrunner.appupdate.PlayStoreBasedAppUpdate;
import com.roadrunner.push.DialogMessageRequestProxy;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import io.reactivex.disposables.CompositeDisposable;
import java.lang.ref.WeakReference;
import o.getKeyboardTap5zf0vsI;
import o.getMinWidth;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.s2;
import o.setOnRemoteTriggerListener;
import o.setOnSessionTrackingFailedListener;

/* JADX INFO: loaded from: classes2.dex */
public final class MainPresenter extends BasePresenter {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final getMinWidth MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public final CardView$1 MediaMetadataCompat;
    public final PlayStoreBasedAppUpdate MediaSessionCompatQueueItem;
    public final setOnRemoteTriggerListener MediaSessionCompatToken;
    public final MainActivity ParcelableVolumeInfo;
    public final s2 PlaybackStateCompat;
    public final CompositeDisposable RatingCompat;

    public MainPresenter(MainActivity mainActivity, setOnRemoteTriggerListener setonremotetriggerlistener, CardView$1 cardView$1, DialogMessageRequestProxy dialogMessageRequestProxy, s2 s2Var, PlayStoreBasedAppUpdate playStoreBasedAppUpdate, getMinWidth getminwidth, DefaultForegroundSoundManager defaultForegroundSoundManager, getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi) {
        super(new WeakReference(mainActivity), defaultForegroundSoundManager, getkeyboardtap5zf0vsi, dialogMessageRequestProxy);
        this.MediaDescriptionCompat = false;
        this.ParcelableVolumeInfo = mainActivity;
        this.MediaSessionCompatToken = setonremotetriggerlistener;
        this.MediaMetadataCompat = cardView$1;
        this.PlaybackStateCompat = s2Var;
        this.MediaSessionCompatQueueItem = playStoreBasedAppUpdate;
        this.MediaBrowserCompatMediaItem = getminwidth;
        this.RatingCompat = new CompositeDisposable();
    }

    public final void write(setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, f2$$ExternalSyntheticLambda4 f2__externalsyntheticlambda4, String str) {
        int i = 2 % 2;
        this.MediaDescriptionCompat = true;
        this.MediaSessionCompatToken.read(str, setonsessiontrackingfailedlistener, false, new d4$$ExternalSyntheticLambda2(this, 20, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), new Recomposer$$ExternalSyntheticLambda4(this, 22, f2__externalsyntheticlambda4));
        int i2 = PlaybackStateCompatCustomAction + 123;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
