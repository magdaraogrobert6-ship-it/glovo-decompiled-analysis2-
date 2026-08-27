package com.roadrunner.helpcenter.dispatcher_chat;

import android.app.Application;
import android.content.Intent;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.Constants;
import com.data.util.AndroidScheduleProvider;
import com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase;
import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.operators.observable.ObservableJust;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.CombinedScopeView;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.CodedInputStreamStreamDecoder;
import o.PreferencesKtedit2;
import o.boundingRectInRoot;
import o.getContentViewGroupParentLayout;
import o.getExitAnim;
import o.getFragmentManager;
import o.getMinHeight;
import o.getMinWidth;
import o.getPivotOffsetF1C5BW0;
import o.hideCurrentlyDisplayingInAppMessage;
import o.inCompatibilityMode;
import o.isMainThread;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.sourceInformationContextOfdefault;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class WebDispatcherChat implements getMinWidth {
    private static int PlaybackStateCompatCustomAction = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public final boundingRectInRoot IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final transferSessionPackageI MediaDescriptionCompat;
    public final CombinedScopeView MediaMetadataCompat;
    public long MediaSessionCompatQueueItem;
    public final AndroidUiDispatcherCompanioncurrentThread1 MediaSessionCompatResultReceiverWrapper;
    public final BehaviorSubject MediaSessionCompatToken;
    public final getPivotOffsetF1C5BW0 ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public final isMainThread RatingCompat;
    public final BehaviorSubject RemoteActionCompatParcelizer;
    public final isOpenInternalroom_runtime read;
    public final GetUnreadMessageCountUseCase serializer;
    public final getContentViewGroupParentLayout write;

    final class NotDispatcherBrazePushError extends Exception {
        public NotDispatcherBrazePushError(String str) {
            super(str, null);
        }
    }

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i) | i3);
        int i8 = ~i2;
        int i9 = i7 | (~(i8 | i3));
        int i10 = ~i3;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i);
        int i13 = (~(i8 | i)) | i11 | i12;
        int i14 = (~(i2 | i10)) | i12;
        int i15 = i + i3 + i4 + (1039959776 * i6) + ((-2046201414) * i5);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i) - 8388608) + ((-1785926397) * i3) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i4) + ((-201326592) * i6) + ((-406847488) * i5) + (529399808 * i16);
        int i18 = ((i * 868240256) - 1765242424) + (i3 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i4 * 868239597) + (i6 * 817356128) + (i5 * 406493490) + (i16 * 645267456);
        return i17 + ((i18 * i18) * 681705472) != 1 ? IconCompatParcelizer(objArr) : write(objArr);
    }

    @Override // o.getMinWidth
    public final void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 89;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.getMinWidth
    public final void serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 5;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getMinWidth
    public final void write(PreferencesKtedit2 preferencesKtedit2) {
        CombinedScopeView combinedScopeView = this.MediaMetadataCompat;
        combinedScopeView.getClass();
        getExitAnim getexitanim = (getExitAnim) combinedScopeView.write;
        synchronized (getexitanim.write) {
            if (getexitanim.MediaDescriptionCompat != null) {
                getexitanim.IconCompatParcelizer();
            }
            getexitanim.MediaBrowserCompatMediaItem.getClass();
            getexitanim.MediaDescriptionCompat = Long.valueOf(System.currentTimeMillis());
        }
        ((getFragmentManager) combinedScopeView.read).RemoteActionCompatParcelizer();
        Intent intent = new Intent();
        intent.setClass((Application) combinedScopeView.RemoteActionCompatParcelizer, HelpCenterActivity.class);
        intent.setAction(HelpCenterActivity.class.getName());
        intent.setFlags(276824064);
        intent.putExtra("order_id", "");
        intent.putExtra("initial_message", (String) null);
        intent.putExtra("reason_code", (String) null);
        intent.putExtra("page_id", preferencesKtedit2.IconCompatParcelizer());
        intent.putExtra("delivery_id", preferencesKtedit2.RemoteActionCompatParcelizer());
        intent.putExtra("flow_version", preferencesKtedit2.write());
        ((Application) combinedScopeView.RemoteActionCompatParcelizer).startActivity(intent);
    }

    public WebDispatcherChat(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, GetUnreadMessageCountUseCase getUnreadMessageCountUseCase, boundingRectInRoot boundingrectinroot, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime, AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, transferSessionPackageI transfersessionpackagei, CombinedScopeView combinedScopeView, isMainThread ismainthread) {
        getpivotoffsetf1c5bw0.getClass();
        getUnreadMessageCountUseCase.getClass();
        boundingrectinroot.getClass();
        getcontentviewgroupparentlayout.getClass();
        isopeninternalroom_runtime.getClass();
        androidUiDispatcherCompanioncurrentThread1.getClass();
        transfersessionpackagei.getClass();
        combinedScopeView.getClass();
        ismainthread.getClass();
        this.ParcelableVolumeInfo = getpivotoffsetf1c5bw0;
        this.serializer = getUnreadMessageCountUseCase;
        this.IconCompatParcelizer = boundingrectinroot;
        this.write = getcontentviewgroupparentlayout;
        this.read = isopeninternalroom_runtime;
        this.MediaSessionCompatResultReceiverWrapper = androidUiDispatcherCompanioncurrentThread1;
        this.MediaDescriptionCompat = transfersessionpackagei;
        this.MediaMetadataCompat = combinedScopeView;
        this.RatingCompat = ismainthread;
        this.MediaSessionCompatToken = BehaviorSubject.IconCompatParcelizer(0);
        this.MediaSessionCompatQueueItem = Long.MAX_VALUE;
        this.MediaBrowserCompatMediaItem = true;
        this.RemoteActionCompatParcelizer = BehaviorSubject.IconCompatParcelizer(new getMinHeight(this.PlaybackStateCompat, true));
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 73;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ObservableJust observableJust = Observable.read((Object) 0L);
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 125;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return observableJust;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        WebDispatcherChat webDispatcherChat = (WebDispatcherChat) objArr[0];
        int i = 2 % 2;
        webDispatcherChat.RemoteActionCompatParcelizer.onNext(new getMinHeight(webDispatcherChat.PlaybackStateCompat, webDispatcherChat.MediaBrowserCompatMediaItem));
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 71;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        ((inCompatibilityMode) this.read).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(this.write, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new WebDispatcherChat$triggerUnreadMessageCountApi$1(this, i, null), 2);
        int i3 = PlaybackStateCompatCustomAction + 31;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // o.getMinWidth
    public final Observable IconCompatParcelizer() {
        int i = 2 % 2;
        AndroidScheduleProvider androidScheduleProvider = (AndroidScheduleProvider) this.ParcelableVolumeInfo;
        Scheduler schedulerIconCompatParcelizer = androidScheduleProvider.IconCompatParcelizer();
        BehaviorSubject behaviorSubject = this.MediaSessionCompatToken;
        behaviorSubject.getClass();
        ObservableSubscribeOn observableSubscribeOn = new ObservableSubscribeOn(behaviorSubject, schedulerIconCompatParcelizer);
        androidScheduleProvider.getClass();
        ObservableObserveOn observableObserveOnRemoteActionCompatParcelizer = observableSubscribeOn.RemoteActionCompatParcelizer(AndroidSchedulers.RemoteActionCompatParcelizer());
        int i2 = PlaybackStateCompatCustomAction + 25;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return observableObserveOnRemoteActionCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer(Map map) {
        int i = 2 % 2;
        String str = (String) map.get(Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY);
        String string = null;
        if (str != null) {
            int i2 = PlaybackStateCompatCustomAction + 15;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString();
                throw null;
            }
            string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString();
        }
        boolean zEquals = "com_appboy_helpcenter_notification_channel".equals(string);
        if (!zEquals) {
            Timber.RemoteActionCompatParcelizer.write(new NotDispatcherBrazePushError(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Expected notification id is com_appboy_helpcenter_notification_channel, but actual id is ", string)));
        }
        int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 79;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return zEquals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r10.IconCompatParcelizer(r13 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r13 > 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r13 > 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write(com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat r10, java.lang.Exception r11, int r12, int r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 500(0x1f4, float:7.0E-43)
            r2 = 0
            if (r12 != r1) goto L21
            int r3 = com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY
            int r3 = r3 + 67
            int r4 = r3 % 128
            com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat.PlaybackStateCompatCustomAction = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L19
            r3 = 98
            int r3 = r3 / r2
            if (r13 <= 0) goto L21
            goto L1b
        L19:
            if (r13 <= 0) goto L21
        L1b:
            int r13 = r13 + (-1)
            r10.IconCompatParcelizer(r13)
            return
        L21:
            if (r12 != r1) goto L57
            if (r13 != 0) goto L57
            int r12 = com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat.PlaybackStateCompatCustomAction
            int r12 = r12 + 31
            int r13 = r12 % 128
            com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r13
            int r12 = r12 % r0
            timber.log.Timber$Forest r12 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.String r0 = "Consumed all retries, stopping unread messages"
            r12.RemoteActionCompatParcelizer(r11, r0, r13)
            r10.MediaBrowserCompatMediaItem = r2
            java.lang.Object[] r8 = new java.lang.Object[]{r10}
            int r4 = o.sourceInformationContextOfdefault.read()
            int r6 = o.sourceInformationContextOfdefault.read()
            int r9 = o.sourceInformationContextOfdefault.read()
            int r7 = o.sourceInformationContextOfdefault.read()
            r3 = -1410168088(0xffffffffabf28ae8, float:-1.7233688E-12)
            r5 = 1410168089(0x540d7519, float:2.4302198E12)
            write(r3, r4, r5, r6, r7, r8, r9)
            return
        L57:
            r11 = 404(0x194, float:5.66E-43)
            if (r12 != r11) goto L83
            timber.log.Timber$Forest r11 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.String r13 = "404 stopping unread messages"
            r11.read(r13, r12)
            r10.MediaBrowserCompatMediaItem = r2
            java.lang.Object[] r8 = new java.lang.Object[]{r10}
            int r4 = o.sourceInformationContextOfdefault.read()
            int r6 = o.sourceInformationContextOfdefault.read()
            int r9 = o.sourceInformationContextOfdefault.read()
            int r7 = o.sourceInformationContextOfdefault.read()
            r3 = -1410168088(0xffffffffabf28ae8, float:-1.7233688E-12)
            r5 = 1410168089(0x540d7519, float:2.4302198E12)
            write(r3, r4, r5, r6, r7, r8, r9)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat.write(com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat, java.lang.Exception, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    @Override // o.getMinWidth
    public final void MediaBrowserCompatMediaItem() {
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        long jCurrentTimeMillis;
        int i = 2 % 2;
        if (this.MediaBrowserCompatMediaItem) {
            int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 49;
            PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 / 0;
                if (this.PlaybackStateCompat == 0) {
                    firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.MediaDescriptionCompat;
                    firebaseRemoteConfigImpl.getClass();
                    if (firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_WEB_DISPATCHER_CHAT_UNREAD_COUNT_THROTTLING_ENABLED)) {
                        this.MediaSessionCompatResultReceiverWrapper.getClass();
                        jCurrentTimeMillis = (System.currentTimeMillis() - this.MediaSessionCompatQueueItem) / 1000;
                        if (jCurrentTimeMillis >= 0 || jCurrentTimeMillis > firebaseRemoteConfigImpl.IconCompatParcelizer.write("dispatcher_chat_unread_count_throttling_time")) {
                            IconCompatParcelizer(3);
                            return;
                        } else {
                            Timber.RemoteActionCompatParcelizer.read("Ignore the api call because of throttling", new Object[0]);
                            return;
                        }
                    }
                    IconCompatParcelizer(3);
                }
            } else if (this.PlaybackStateCompat == 0) {
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.MediaDescriptionCompat;
                firebaseRemoteConfigImpl.getClass();
                if (firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_WEB_DISPATCHER_CHAT_UNREAD_COUNT_THROTTLING_ENABLED)) {
                    this.MediaSessionCompatResultReceiverWrapper.getClass();
                    jCurrentTimeMillis = (System.currentTimeMillis() - this.MediaSessionCompatQueueItem) / 1000;
                    if (jCurrentTimeMillis >= 0) {
                    }
                    IconCompatParcelizer(3);
                    return;
                }
                IconCompatParcelizer(3);
            }
        }
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 93;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r1
  0x002f: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v17 java.lang.String) binds: [B:8:0x002d, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public final CodedInputStreamStreamDecoder write(Map map) {
        String str;
        String string;
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 37;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RatingCompat.getClass();
            str = (String) map.get(Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY);
            int i3 = 4 / 0;
            if (str != null) {
                string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString();
            } else {
                string = null;
            }
        } else {
            this.RatingCompat.getClass();
            str = (String) map.get(Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY);
            if (str != null) {
                string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString();
            } else {
                string = null;
            }
        }
        String str2 = (String) map.get(Constants.BRAZE_PUSH_CONTENT_KEY);
        if (string != null && str2 != null) {
            if ("com_appboy_helpcenter_notification_channel".equals(string)) {
                return new CodedInputStreamStreamDecoder(string, str2);
            }
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            final String strM = ff$$ExternalSyntheticOutline0.m("Cannot parse dispatcher chat. Channel id is '", string, "', but 'com_appboy_helpcenter_notification_channel' is expected.");
            forest.write(new Exception(strM) { // from class: com.roadrunner.helpcenter.domain.ParseDispatcherChatUseCase$InvalidChannelIdError
            });
            return null;
        }
        Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
        final String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Cannot parse dispatcher chat. Channel id is '", string, "', message is '", str2, "' None of them should be null.");
        forest2.write(new Exception(strWrite) { // from class: com.roadrunner.helpcenter.domain.ParseDispatcherChatUseCase$AbsentAgentChatDataError
        });
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 5;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        write(-1410168088, i, 1410168089, i2, sourceInformationContextOfdefault.read(), new Object[]{this}, i3);
    }

    @Override // o.getMinWidth
    public final Observable read() {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        return (Observable) write(-991999032, i, 991999032, i2, sourceInformationContextOfdefault.read(), new Object[]{this}, i3);
    }
}
