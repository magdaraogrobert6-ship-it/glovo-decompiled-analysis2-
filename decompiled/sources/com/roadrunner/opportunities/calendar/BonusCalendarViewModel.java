package com.roadrunner.opportunities.calendar;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.opportunities.api.navigation.BonusCalendarParams;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.getBitmapui_graphics;
import o.getQueryContext;
import o.isAdapterPositionOnScreen;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.s7;
import o.setTransactionSuccessful;
import o.ta;
import o.tf;
import o.tg;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class BonusCalendarViewModel extends ViewModel {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompatCustomAction;
    public final NetworkErrorMapperImpl IconCompatParcelizer;
    public final MutableStateFlow MediaBrowserCompatMediaItem;
    public final MutableStateFlow MediaDescriptionCompat;
    public final getBitmapui_graphics MediaMetadataCompat;
    public final s7 MediaSessionCompatQueueItem;
    public final getQueryContext RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU read;
    public final DropShadowEffect serializer;
    public final isAdapterPositionOnScreen write;

    public BonusCalendarViewModel(DropShadowEffect dropShadowEffect, NetworkErrorMapperImpl networkErrorMapperImpl, s7 s7Var, getQueryContext getquerycontext, getBitmapui_graphics getbitmapui_graphics, setTransactionSuccessful settransactionsuccessful) {
        dropShadowEffect.getClass();
        networkErrorMapperImpl.getClass();
        s7Var.getClass();
        getquerycontext.getClass();
        getbitmapui_graphics.getClass();
        settransactionsuccessful.getClass();
        this.serializer = dropShadowEffect;
        this.IconCompatParcelizer = networkErrorMapperImpl;
        this.MediaSessionCompatQueueItem = s7Var;
        this.RatingCompat = getquerycontext;
        this.MediaMetadataCompat = getbitmapui_graphics;
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new ta(this, 1));
        this.write = isadapterpositiononscreen;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new tf(((BonusCalendarParams) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer, settransactionsuccessful.IconCompatParcelizer(R.string.rush_bonus_calendar_title), settransactionsuccessful.IconCompatParcelizer(R.string.rush_bonus_calendar_no_available_title), settransactionsuccessful.IconCompatParcelizer(R.string.rush_bonus_calendar_no_available_subtitle), false));
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = StateFlowKt.read(null);
        s7Var.write.logEvent("bonus_calendar_opened", null);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new NafathModalUiModelImpl$1(this, null, 4), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 89;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        int i4 = i2 % 2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.read;
        Object obj = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i5 = i3 + 69;
            MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                obj.hashCode();
                throw null;
            }
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.read = null;
    }

    public static final void read(BonusCalendarViewModel bonusCalendarViewModel) {
        Object obj;
        Object objSerializer;
        int i = 2 % 2;
        MutableStateFlow mutableStateFlow = bonusCalendarViewModel.RemoteActionCompatParcelizer;
        do {
            obj = mutableStateFlow.read();
            if (obj instanceof tg) {
                objSerializer = tg.RemoteActionCompatParcelizer((tg) obj, false);
            } else if (!(obj instanceof tf)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            } else {
                int i2 = PlaybackStateCompatCustomAction + 117;
                MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
                objSerializer = i2 % 2 == 0 ? tf.serializer((tf) obj, true) : tf.serializer((tf) obj, false);
            }
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, objSerializer));
        int i3 = PlaybackStateCompatCustomAction + 103;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 18 / 0;
        }
    }
}
