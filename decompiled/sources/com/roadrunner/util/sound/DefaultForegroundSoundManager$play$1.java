package com.roadrunner.util.sound;

import android.media.Ringtone;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigator.R;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.MutexImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultForegroundSoundManager$play$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ DefaultForegroundSoundManager IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public DefaultForegroundSoundManager serializer;
    public MutexImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultForegroundSoundManager$play$1(DefaultForegroundSoundManager defaultForegroundSoundManager, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = defaultForegroundSoundManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 15;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        DefaultForegroundSoundManager defaultForegroundSoundManager = this.IconCompatParcelizer;
        if (i3 != 0) {
            return new DefaultForegroundSoundManager$play$1(defaultForegroundSoundManager, shortNewsContentCardView, 1);
        }
        DefaultForegroundSoundManager$play$1 defaultForegroundSoundManager$play$1 = new DefaultForegroundSoundManager$play$1(defaultForegroundSoundManager, shortNewsContentCardView, 0);
        int i4 = MediaSessionCompatQueueItem + 45;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return defaultForegroundSoundManager$play$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 9;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            return ((DefaultForegroundSoundManager$play$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((DefaultForegroundSoundManager$play$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = RatingCompat + 79;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0123 A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:43:0x00f3, B:46:0x0100, B:50:0x0113, B:51:0x011b, B:52:0x0123, B:54:0x0130, B:55:0x0138, B:59:0x0149, B:60:0x014f, B:61:0x0154, B:63:0x0158), top: B:71:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0130 A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:43:0x00f3, B:46:0x0100, B:50:0x0113, B:51:0x011b, B:52:0x0123, B:54:0x0130, B:55:0x0138, B:59:0x0149, B:60:0x014f, B:61:0x0154, B:63:0x0158), top: B:71:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0149 A[Catch: all -> 0x015f, TRY_ENTER, TryCatch #1 {all -> 0x015f, blocks: (B:43:0x00f3, B:46:0x0100, B:50:0x0113, B:51:0x011b, B:52:0x0123, B:54:0x0130, B:55:0x0138, B:59:0x0149, B:60:0x014f, B:61:0x0154, B:63:0x0158), top: B:71:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014f A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:43:0x00f3, B:46:0x0100, B:50:0x0113, B:51:0x011b, B:52:0x0123, B:54:0x0130, B:55:0x0138, B:59:0x0149, B:60:0x014f, B:61:0x0154, B:63:0x0158), top: B:71:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0158 A[Catch: all -> 0x015f, TRY_LEAVE, TryCatch #1 {all -> 0x015f, blocks: (B:43:0x00f3, B:46:0x0100, B:50:0x0113, B:51:0x011b, B:52:0x0123, B:54:0x0130, B:55:0x0138, B:59:0x0149, B:60:0x014f, B:61:0x0154, B:63:0x0158), top: B:71:0x00f3 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutexImpl mutexImpl;
        Timber.Forest forest;
        Ringtone ringtone;
        int i;
        MutexImpl mutexImpl2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        DefaultForegroundSoundManager defaultForegroundSoundManager = this.IconCompatParcelizer;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.read;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MutexImpl mutexImpl3 = defaultForegroundSoundManager.MediaMetadataCompat;
                this.write = mutexImpl3;
                this.serializer = defaultForegroundSoundManager;
                this.read = 1;
                if (mutexImpl3.lock(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutexImpl2 = mutexImpl3;
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defaultForegroundSoundManager = this.serializer;
                mutexImpl2 = this.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i5 = RatingCompat + 101;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            try {
                Ringtone ringtone2 = defaultForegroundSoundManager.MediaDescriptionCompat;
                if (ringtone2 == null || !ringtone2.isPlaying()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("New delivery sound is not playing. Skipping stop request ", new Object[0]);
                } else {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Stopping new delivery sound", new Object[0]);
                    Ringtone ringtone3 = defaultForegroundSoundManager.MediaDescriptionCompat;
                    if (ringtone3 != null) {
                        int i7 = MediaSessionCompatQueueItem + 93;
                        RatingCompat = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        ringtone3.stop();
                    }
                }
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) defaultForegroundSoundManager.serializer.serializer;
                String str = firebaseRemoteConfigImpl.read.read();
                if (str != null) {
                    Object[] objArr = {firebaseRemoteConfigImpl, firebaseRemoteConfigImpl.IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_AUDIO_DUCKING_ENABLED.getFirebaseFlagName(), str)};
                    int iSerializer = R.serializer();
                    boolean zBooleanValue = ((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(28645399, R.serializer(), R.serializer(), -28645399, R.serializer(), iSerializer, objArr)).booleanValue();
                    int i9 = RatingCompat + 113;
                    MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    if (zBooleanValue) {
                        defaultForegroundSoundManager.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                    }
                }
                return createfromparcel;
            } finally {
                mutexImpl2.write(null);
            }
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.read;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutexImpl mutexImpl4 = defaultForegroundSoundManager.MediaMetadataCompat;
            this.write = mutexImpl4;
            this.serializer = defaultForegroundSoundManager;
            this.read = 1;
            if (mutexImpl4.lock(this) == coroutineSingletons2) {
                return coroutineSingletons2;
            }
            mutexImpl = mutexImpl4;
        } else {
            if (i11 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            defaultForegroundSoundManager = this.serializer;
            mutexImpl = this.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            Ringtone ringtone4 = defaultForegroundSoundManager.MediaBrowserCompatMediaItem;
            if (ringtone4 != null) {
                int i12 = MediaSessionCompatQueueItem + 71;
                RatingCompat = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (ringtone4.isPlaying()) {
                    int i14 = MediaSessionCompatQueueItem + 59;
                    RatingCompat = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Notification sound is already playing. Skipping play request", new Object[1]);
                    } else {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Notification sound is already playing. Skipping play request", new Object[0]);
                    }
                } else {
                    forest = Timber.RemoteActionCompatParcelizer;
                    forest.IconCompatParcelizer("Playing notification sound from new sound manager", new Object[0]);
                    if (defaultForegroundSoundManager.MediaBrowserCompatMediaItem == null) {
                        defaultForegroundSoundManager.MediaBrowserCompatMediaItem = defaultForegroundSoundManager.write.serializer(false);
                    }
                    if (defaultForegroundSoundManager.MediaBrowserCompatMediaItem == null) {
                        i = RatingCompat + 13;
                        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            forest.IconCompatParcelizer("Ringtone is null. Cannot play notification sound from new sound manager", new Object[1]);
                        } else {
                            forest.IconCompatParcelizer("Ringtone is null. Cannot play notification sound from new sound manager", new Object[0]);
                        }
                    }
                    ringtone = defaultForegroundSoundManager.MediaBrowserCompatMediaItem;
                    if (ringtone != null) {
                        DefaultForegroundSoundManager.serializer(defaultForegroundSoundManager, ringtone);
                    }
                }
            } else {
                forest = Timber.RemoteActionCompatParcelizer;
                forest.IconCompatParcelizer("Playing notification sound from new sound manager", new Object[0]);
                if (defaultForegroundSoundManager.MediaBrowserCompatMediaItem == null) {
                    defaultForegroundSoundManager.MediaBrowserCompatMediaItem = defaultForegroundSoundManager.write.serializer(false);
                }
                if (defaultForegroundSoundManager.MediaBrowserCompatMediaItem == null) {
                    i = RatingCompat + 13;
                    MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        forest.IconCompatParcelizer("Ringtone is null. Cannot play notification sound from new sound manager", new Object[1]);
                    } else {
                        forest.IconCompatParcelizer("Ringtone is null. Cannot play notification sound from new sound manager", new Object[0]);
                    }
                }
                ringtone = defaultForegroundSoundManager.MediaBrowserCompatMediaItem;
                if (ringtone != null) {
                    DefaultForegroundSoundManager.serializer(defaultForegroundSoundManager, ringtone);
                }
            }
            return createfromparcel;
        } finally {
            mutexImpl.write(null);
        }
    }
}
