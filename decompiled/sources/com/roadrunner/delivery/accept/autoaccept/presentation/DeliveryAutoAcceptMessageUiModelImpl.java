package com.roadrunner.delivery.accept.autoaccept.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.work.CoroutineWorker$startWork$1;
import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.delivery.accept.domain.AutoAcceptEarningsUseCaseImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.FontEj4NQ78;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.findNestedRecyclerView;
import o.getContentViewGroupParentLayout;
import o.getPrimaryDownstream;
import o.isIncluded;
import o.packInts;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdajRJFbIqkkFSo0J2N8n3tH4yM;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAutoAcceptMessageUiModelImpl implements findNestedRecyclerView, DefaultLifecycleObserver {
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final isIncluded MediaDescriptionCompat;
    public final getContentViewGroupParentLayout MediaMetadataCompat;
    public final DeliveryAcceptanceLogger MediaSessionCompatQueueItem;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaSessionCompatResultReceiverWrapper;
    public final packInts MediaSessionCompatToken;
    public final FontEj4NQ78 ParcelableVolumeInfo;
    public final zzz PlaybackStateCompat;
    public final setTransactionSuccessful PlaybackStateCompatCustomAction;
    public final r8lambdajRJFbIqkkFSo0J2N8n3tH4yM RatingCompat;
    public final getPrimaryDownstream RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final StateFlow serializer;
    public final AutoAcceptEarningsUseCaseImpl write;

    @Override // o.findNestedRecyclerView
    public final StateFlow serializer() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i3 = i2 + 101;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaBrowserCompatMediaItem;
        int i5 = i2 + 117;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return stateFlow;
    }

    public DeliveryAutoAcceptMessageUiModelImpl(getContentViewGroupParentLayout getcontentviewgroupparentlayout, packInts packints, getPrimaryDownstream getprimarydownstream, setTransactionSuccessful settransactionsuccessful, AutoAcceptEarningsUseCaseImpl autoAcceptEarningsUseCaseImpl, r8lambdajRJFbIqkkFSo0J2N8n3tH4yM r8lambdajrjfbiqkkfso0j2n8n3th4ym, isIncluded isincluded, zzz zzzVar, FontEj4NQ78 fontEj4NQ78, DeliveryAcceptanceLogger deliveryAcceptanceLogger) {
        getcontentviewgroupparentlayout.getClass();
        this.MediaMetadataCompat = getcontentviewgroupparentlayout;
        this.MediaSessionCompatToken = packints;
        this.RemoteActionCompatParcelizer = getprimarydownstream;
        this.PlaybackStateCompatCustomAction = settransactionsuccessful;
        this.write = autoAcceptEarningsUseCaseImpl;
        this.RatingCompat = r8lambdajrjfbiqkkfso0j2n8n3th4ym;
        this.MediaDescriptionCompat = isincluded;
        this.PlaybackStateCompat = zzzVar;
        this.ParcelableVolumeInfo = fontEj4NQ78;
        this.MediaSessionCompatQueueItem = deliveryAcceptanceLogger;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.TRUE);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(null);
        this.read = mutableStateFlow2;
        this.serializer = mutableStateFlow2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 75;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessisrendernodecompatiblecp.getClass();
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaSessionCompatResultReceiverWrapper;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 37;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.MediaSessionCompatResultReceiverWrapper = null;
        super.onPause(accessisrendernodecompatiblecp);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaSessionCompatResultReceiverWrapper;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 117;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 39;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        this.MediaSessionCompatResultReceiverWrapper = BuildersKt.RemoteActionCompatParcelizer(this.MediaMetadataCompat, null, null, new CoroutineWorker$startWork$1(this, shortNewsContentCardView, 17), 3);
        super.onResume(accessisrendernodecompatiblecp);
        int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 103;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r11 == r3) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$getEarningsFromAutoAcceptedOrder(com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl r9, java.util.List r10, o.ShortNewsContentCardView r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl.access$getEarningsFromAutoAcceptedOrder(com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl, java.util.List, o.ShortNewsContentCardView):java.lang.Object");
    }
}
