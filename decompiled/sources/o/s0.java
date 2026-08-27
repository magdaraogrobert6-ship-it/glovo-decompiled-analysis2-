package o;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.roadrunner.notifications.NotificationChannelNotMatchingException;
import com.roadrunner.notifications.NotificationSoundNotMatchingException;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.util.sound.DefaultBackgroundSoundManager;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements deleteGlobalPartnerParameters, s2 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final androidx.core.app.NotificationManagerCompat MediaMetadataCompat;
    public final subscribeToNetworkFailureslambda0 MediaSessionCompatQueueItem;
    public final DefaultBackgroundSoundManager RatingCompat;
    public final s1 read;
    public final getContentViewGroupParentLayout serializer;
    public final isAdapterPositionOnScreen write;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(15));
    public final isAdapterPositionOnScreen IconCompatParcelizer = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(16));

    public s0(Application application, androidx.core.app.NotificationManagerCompat notificationManagerCompat, s1 s1Var, subscribeToNetworkFailureslambda0 subscribetonetworkfailureslambda0, DefaultBackgroundSoundManager defaultBackgroundSoundManager, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.MediaMetadataCompat = notificationManagerCompat;
        this.read = s1Var;
        this.MediaSessionCompatQueueItem = subscribetonetworkfailureslambda0;
        this.RatingCompat = defaultBackgroundSoundManager;
        this.serializer = getcontentviewgroupparentlayout;
        this.write = new isAdapterPositionOnScreen(new subscribeToContentCardsUpdateslambda30(application, 10));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r8 = o.s0.MediaDescriptionCompat + 97;
        o.s0.MediaBrowserCompatMediaItem = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8 = r8 % 2;
        r8 = "joy_long";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri RemoteActionCompatParcelizer(android.content.Context r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s0.RemoteActionCompatParcelizer(android.content.Context, java.lang.String):android.net.Uri");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0091  */
    /* JADX WARN: Code duplicated, block: B:20:0x009b  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    /* JADX WARN: Code duplicated, block: B:43:0x012b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code duplicated, block: B:51:0x016c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0178  */
    /* JADX WARN: Code duplicated, block: B:56:0x0185  */
    /* JADX WARN: Code duplicated, block: B:58:0x0190  */
    /* JADX WARN: Code duplicated, block: B:60:0x0196  */
    /* JADX WARN: Code duplicated, block: B:61:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0228  */
    /* JADX WARN: Code duplicated, block: B:75:0x0254  */
    /* JADX WARN: Code duplicated, block: B:78:0x0264  */
    /* JADX WARN: Code duplicated, block: B:79:0x0270  */
    /* JADX WARN: Code duplicated, block: B:81:0x027a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0289  */
    /* JADX WARN: Code duplicated, block: B:89:0x029f  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public final void RemoteActionCompatParcelizer(checkAdjustAdRevenue checkadjustadrevenue, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, PendingIntent pendingIntent) {
        String str;
        String strRemoteActionCompatParcelizer;
        String str2;
        boolean zM;
        String strRemoteActionCompatParcelizer2;
        NotificationChannel notificationChannel;
        Uri uriRemoteActionCompatParcelizer;
        isAdapterPositionOnScreen isadapterpositiononscreen;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        NotificationChannel notificationChannel2;
        Uri sound;
        Object[] objArr;
        Boolean boolValueOf;
        Uri uriRemoteActionCompatParcelizer2;
        Notification notificationWrite;
        Uri uriRemoteActionCompatParcelizer3;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2;
        String str3;
        boolean zM2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        transferSessionPackageI transfersessionpackagei = this.MediaSessionCompatQueueItem.IconCompatParcelizer;
        checkadjustadrevenue.getClass();
        androidx.core.app.NotificationManagerCompat notificationManagerCompat = this.MediaMetadataCompat;
        if (!notificationManagerCompat.areNotificationsEnabled()) {
            Timber.RemoteActionCompatParcelizer.read("Notification Permission is disabled", new Object[0]);
            return;
        }
        if (disableThirdPartySharingForCoppaEnabledI.IconCompatParcelizer(checkadjustadrevenue)) {
            int iSerializer = zzlq.serializer();
            str = (String) disableThirdPartySharingForCoppaEnabledI.read(new Object[]{checkadjustadrevenue}, 1781853030, zzlq.serializer(), zzlq.serializer(), zzlq.serializer(), iSerializer, -1781853030);
        } else {
            int i8 = MediaDescriptionCompat + 105;
            MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            str = null;
        }
        checkEventI checkeventiWrite = checkadjustadrevenue.write();
        deleteGlobalCallbackParameters deleteglobalcallbackparameters = checkadjustadrevenue.read();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl3 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        String str4 = firebaseRemoteConfigImpl3.read.read();
        if (str4 != null) {
            if (m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_MEDIA_AUDIO_ATTRIBUTES_ENABLED, firebaseRemoteConfigImpl3.IconCompatParcelizer, str4, firebaseRemoteConfigImpl3)) {
                strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(checkeventiWrite.read(), "_media");
            }
            boolean zIconCompatParcelizer = disableThirdPartySharingForCoppaEnabledI.IconCompatParcelizer(checkadjustadrevenue);
            str2 = firebaseRemoteConfigImpl3.read.read();
            if (str2 == null) {
                zM = false;
            } else {
                zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_MEDIA_AUDIO_ATTRIBUTES_ENABLED, firebaseRemoteConfigImpl3.IconCompatParcelizer, str2, firebaseRemoteConfigImpl3);
            }
            if (zM) {
                strRemoteActionCompatParcelizer2 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(checkeventiWrite.read(), "_media");
            } else {
                strRemoteActionCompatParcelizer2 = checkeventiWrite.read();
            }
            notificationChannel = notificationManagerCompat.getNotificationChannel(strRemoteActionCompatParcelizer2);
            isAdapterPositionOnScreen isadapterpositiononscreen2 = this.write;
            Context context = (Context) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper();
            context.getClass();
            uriRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, checkeventiWrite.MediaMetadataCompat());
            isadapterpositiononscreen = this.IconCompatParcelizer;
            if (uriRemoteActionCompatParcelizer == null) {
                uriRemoteActionCompatParcelizer = (Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
            }
            if (notificationChannel == null) {
                String strWrite = checkeventiWrite.write();
                i3 = rf.IconCompatParcelizer[checkeventiWrite.RemoteActionCompatParcelizer().ordinal()];
                if (i3 != 1) {
                    int i10 = MediaDescriptionCompat + 95;
                    firebaseRemoteConfigImpl = firebaseRemoteConfigImpl3;
                    MediaBrowserCompatMediaItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (i3 != 2) {
                        i4 = 3;
                        if (i3 != 3) {
                            i4 = 4;
                            if (i3 != 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return;
                            }
                        }
                    } else {
                        i4 = 2;
                    }
                } else {
                    firebaseRemoteConfigImpl = firebaseRemoteConfigImpl3;
                    i4 = 1;
                }
                notificationChannel2 = new NotificationChannel(strRemoteActionCompatParcelizer2, strWrite, i4);
                notificationChannel2.setDescription(checkeventiWrite.IconCompatParcelizer());
                notificationChannel2.setLightColor(checkeventiWrite.serializer());
                notificationChannel2.setSound(uriRemoteActionCompatParcelizer, (AudioAttributes) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
                notificationChannel2.enableVibration(true);
            } else {
                firebaseRemoteConfigImpl = firebaseRemoteConfigImpl3;
                notificationChannel2 = notificationChannel;
            }
            uriRemoteActionCompatParcelizer.getClass();
            if (notificationChannel != null) {
                i2 = MediaBrowserCompatMediaItem + 97;
                MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    notificationChannel.getSound();
                    throw null;
                }
                sound = notificationChannel.getSound();
            } else {
                sound = null;
            }
            objArr = new Object[]{sound, notificationChannel2.getSound()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                i = MediaDescriptionCompat + 101;
                MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    uriRemoteActionCompatParcelizer.equals((Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
                    throw null;
                }
                if (uriRemoteActionCompatParcelizer.equals((Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper())) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        boolValueOf = Boolean.valueOf(notificationChannel2.hasUserSetSound());
                    } else {
                        boolValueOf = null;
                    }
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    String id = notificationChannel2.getId();
                    id.getClass();
                    forest.write(new NotificationSoundNotMatchingException(id, boolValueOf, uriRemoteActionCompatParcelizer.equals((Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper())));
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    boolValueOf = Boolean.valueOf(notificationChannel2.hasUserSetSound());
                } else {
                    boolValueOf = null;
                }
                Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                String id2 = notificationChannel2.getId();
                id2.getClass();
                forest2.write(new NotificationSoundNotMatchingException(id2, boolValueOf, uriRemoteActionCompatParcelizer.equals((Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper())));
            }
            if (notificationChannel != null && notificationChannel.getImportance() != notificationChannel2.getImportance()) {
                Timber.Forest forest3 = Timber.RemoteActionCompatParcelizer;
                String id3 = notificationChannel2.getId();
                id3.getClass();
                forest3.write(new NotificationChannelNotMatchingException(id3, notificationChannel2.getImportance()));
            }
            if (zM && zIconCompatParcelizer) {
                int i12 = MediaBrowserCompatMediaItem + 13;
                MediaDescriptionCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                notificationChannel2.setSound(null, null);
            }
            notificationManagerCompat.createNotificationChannel(notificationChannel2);
            getEnterdhqQ8s getenterdhqq8s = new getEnterdhqQ8s((Context) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper(), strRemoteActionCompatParcelizer);
            getenterdhqq8s.IconCompatParcelizer(2131232003);
            getenterdhqq8s.read(deleteglobalcallbackparameters.serializer());
            getenterdhqq8s.RemoteActionCompatParcelizer(deleteglobalcallbackparameters.read());
            getenterdhqq8s.serializer(pendingIntent);
            Context context2 = (Context) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper();
            context2.getClass();
            uriRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(context2, checkeventiWrite.MediaMetadataCompat());
            if (uriRemoteActionCompatParcelizer2 == null) {
                uriRemoteActionCompatParcelizer2 = (Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
            }
            getenterdhqq8s.write(uriRemoteActionCompatParcelizer2);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getenterdhqq8s);
            notificationWrite = getenterdhqq8s.write();
            notificationWrite.getClass();
            Context context3 = (Context) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper();
            context3.getClass();
            uriRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(context3, checkadjustadrevenue.write().MediaMetadataCompat());
            if (uriRemoteActionCompatParcelizer3 == null) {
                uriRemoteActionCompatParcelizer3 = (Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
            }
            firebaseRemoteConfigImpl2 = firebaseRemoteConfigImpl;
            str3 = firebaseRemoteConfigImpl2.read.read();
            if (str3 == null) {
                int i14 = MediaBrowserCompatMediaItem + 79;
                MediaDescriptionCompat = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i15 = i14 % 2;
                zM2 = false;
            } else {
                zM2 = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_MEDIA_AUDIO_ATTRIBUTES_ENABLED, firebaseRemoteConfigImpl2.IconCompatParcelizer, str3, firebaseRemoteConfigImpl2);
            }
            if (str != 0) {
                notificationManagerCompat.notify(checkadjustadrevenue.read().IconCompatParcelizer(), notificationWrite);
                return;
            }
            notificationManagerCompat.notify(str, checkadjustadrevenue.read().IconCompatParcelizer(), notificationWrite);
            if (zM2) {
                DefaultBackgroundSoundManager defaultBackgroundSoundManager = this.RatingCompat;
                uriRemoteActionCompatParcelizer3.getClass();
                try {
                    defaultBackgroundSoundManager.read(uriRemoteActionCompatParcelizer3);
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "An error occurred while playing notification from new sound manager", new Object[0]);
                    return;
                }
            }
        }
        int i16 = MediaDescriptionCompat + 75;
        MediaBrowserCompatMediaItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i17 = i16 % 2;
        strRemoteActionCompatParcelizer = checkeventiWrite.read();
        boolean zIconCompatParcelizer2 = disableThirdPartySharingForCoppaEnabledI.IconCompatParcelizer(checkadjustadrevenue);
        str2 = firebaseRemoteConfigImpl3.read.read();
        if (str2 == null) {
            zM = false;
        } else {
            zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_MEDIA_AUDIO_ATTRIBUTES_ENABLED, firebaseRemoteConfigImpl3.IconCompatParcelizer, str2, firebaseRemoteConfigImpl3);
        }
        if (zM) {
            strRemoteActionCompatParcelizer2 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(checkeventiWrite.read(), "_media");
        } else {
            strRemoteActionCompatParcelizer2 = checkeventiWrite.read();
        }
        notificationChannel = notificationManagerCompat.getNotificationChannel(strRemoteActionCompatParcelizer2);
        isAdapterPositionOnScreen isadapterpositiononscreen3 = this.write;
        Context context4 = (Context) isadapterpositiononscreen3.MediaSessionCompatResultReceiverWrapper();
        context4.getClass();
        uriRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context4, checkeventiWrite.MediaMetadataCompat());
        isadapterpositiononscreen = this.IconCompatParcelizer;
        if (uriRemoteActionCompatParcelizer == null) {
            uriRemoteActionCompatParcelizer = (Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
        }
        if (notificationChannel == null) {
            String strWrite2 = checkeventiWrite.write();
            i3 = rf.IconCompatParcelizer[checkeventiWrite.RemoteActionCompatParcelizer().ordinal()];
            if (i3 != 1) {
                int i18 = MediaDescriptionCompat + 95;
                firebaseRemoteConfigImpl = firebaseRemoteConfigImpl3;
                MediaBrowserCompatMediaItem = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i19 = i18 % 2;
                if (i3 != 2) {
                    i4 = 3;
                    if (i3 != 3) {
                        i4 = 4;
                        if (i3 != 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return;
                        }
                    }
                } else {
                    i4 = 2;
                }
            } else {
                firebaseRemoteConfigImpl = firebaseRemoteConfigImpl3;
                i4 = 1;
            }
            notificationChannel2 = new NotificationChannel(strRemoteActionCompatParcelizer2, strWrite2, i4);
            notificationChannel2.setDescription(checkeventiWrite.IconCompatParcelizer());
            notificationChannel2.setLightColor(checkeventiWrite.serializer());
            notificationChannel2.setSound(uriRemoteActionCompatParcelizer, (AudioAttributes) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
            notificationChannel2.enableVibration(true);
        } else {
            firebaseRemoteConfigImpl = firebaseRemoteConfigImpl3;
            notificationChannel2 = notificationChannel;
        }
        uriRemoteActionCompatParcelizer.getClass();
        if (notificationChannel != null) {
            i2 = MediaBrowserCompatMediaItem + 97;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                notificationChannel.getSound();
                throw null;
            }
            sound = notificationChannel.getSound();
        } else {
            sound = null;
        }
        objArr = new Object[]{sound, notificationChannel2.getSound()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            i = MediaDescriptionCompat + 101;
            MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                uriRemoteActionCompatParcelizer.equals((Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper());
                throw null;
            }
            if (uriRemoteActionCompatParcelizer.equals((Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper())) {
                if (Build.VERSION.SDK_INT >= 30) {
                    boolValueOf = Boolean.valueOf(notificationChannel2.hasUserSetSound());
                } else {
                    boolValueOf = null;
                }
                Timber.Forest forest4 = Timber.RemoteActionCompatParcelizer;
                String id4 = notificationChannel2.getId();
                id4.getClass();
                forest4.write(new NotificationSoundNotMatchingException(id4, boolValueOf, uriRemoteActionCompatParcelizer.equals((Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper())));
            }
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                boolValueOf = Boolean.valueOf(notificationChannel2.hasUserSetSound());
            } else {
                boolValueOf = null;
            }
            Timber.Forest forest5 = Timber.RemoteActionCompatParcelizer;
            String id5 = notificationChannel2.getId();
            id5.getClass();
            forest5.write(new NotificationSoundNotMatchingException(id5, boolValueOf, uriRemoteActionCompatParcelizer.equals((Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper())));
        }
        if (notificationChannel != null) {
            Timber.Forest forest6 = Timber.RemoteActionCompatParcelizer;
            String id6 = notificationChannel2.getId();
            id6.getClass();
            forest6.write(new NotificationChannelNotMatchingException(id6, notificationChannel2.getImportance()));
        }
        if (zM) {
            int i110 = MediaBrowserCompatMediaItem + 13;
            MediaDescriptionCompat = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i111 = i110 % 2;
            notificationChannel2.setSound(null, null);
        }
        notificationManagerCompat.createNotificationChannel(notificationChannel2);
        getEnterdhqQ8s getenterdhqq8s2 = new getEnterdhqQ8s((Context) isadapterpositiononscreen3.MediaSessionCompatResultReceiverWrapper(), strRemoteActionCompatParcelizer);
        getenterdhqq8s2.IconCompatParcelizer(2131232003);
        getenterdhqq8s2.read(deleteglobalcallbackparameters.serializer());
        getenterdhqq8s2.RemoteActionCompatParcelizer(deleteglobalcallbackparameters.read());
        getenterdhqq8s2.serializer(pendingIntent);
        Context context5 = (Context) isadapterpositiononscreen3.MediaSessionCompatResultReceiverWrapper();
        context5.getClass();
        uriRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(context5, checkeventiWrite.MediaMetadataCompat());
        if (uriRemoteActionCompatParcelizer2 == null) {
            uriRemoteActionCompatParcelizer2 = (Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
        }
        getenterdhqq8s2.write(uriRemoteActionCompatParcelizer2);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getenterdhqq8s2);
        notificationWrite = getenterdhqq8s2.write();
        notificationWrite.getClass();
        Context context6 = (Context) isadapterpositiononscreen3.MediaSessionCompatResultReceiverWrapper();
        context6.getClass();
        uriRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(context6, checkadjustadrevenue.write().MediaMetadataCompat());
        if (uriRemoteActionCompatParcelizer3 == null) {
            uriRemoteActionCompatParcelizer3 = (Uri) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
        }
        firebaseRemoteConfigImpl2 = firebaseRemoteConfigImpl;
        str3 = firebaseRemoteConfigImpl2.read.read();
        if (str3 == null) {
            int i112 = MediaBrowserCompatMediaItem + 79;
            MediaDescriptionCompat = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i113 = i112 % 2;
            zM2 = false;
        } else {
            zM2 = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_MEDIA_AUDIO_ATTRIBUTES_ENABLED, firebaseRemoteConfigImpl2.IconCompatParcelizer, str3, firebaseRemoteConfigImpl2);
        }
        if (str != 0) {
            notificationManagerCompat.notify(checkadjustadrevenue.read().IconCompatParcelizer(), notificationWrite);
            return;
        }
        notificationManagerCompat.notify(str, checkadjustadrevenue.read().IconCompatParcelizer(), notificationWrite);
        if (zM2) {
            DefaultBackgroundSoundManager defaultBackgroundSoundManager2 = this.RatingCompat;
            uriRemoteActionCompatParcelizer3.getClass();
            defaultBackgroundSoundManager2.read(uriRemoteActionCompatParcelizer3);
        }
    }
}
