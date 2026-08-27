package com.roadrunner.customerchat.selfservice.data.cache;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.auth.data.SignInDataStore$get$1;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.customerchat.legacy.chatlist.analytics.ChatLogger$log$2;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.flatMapAnnotationsui_text;
import o.isRoot;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.pushLink;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatNativeCacheDataStore {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final performCustomExitMxy_nc0 MediaDescriptionCompat;
    public static final isRoot write = new isRoot("poll_interval_sec");
    public static final isRoot RemoteActionCompatParcelizer = new isRoot("last_saved_timestamp");
    public static final isRoot IconCompatParcelizer = new isRoot("last_saved_version_name");
    public static final isRoot read = new isRoot("variant");
    public static final isRoot serializer = new isRoot("last_successful_port_number");

    public WebChatNativeCacheDataStore(performCustomExitMxy_nc0 performcustomexitmxy_nc0) {
        this.MediaDescriptionCompat = performcustomexitmxy_nc0;
    }

    static {
        int i = RatingCompat + 117;
        MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final Object RemoteActionCompatParcelizer(isRoot isroot, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        Object objFirstOrNull = FlowKt.firstOrNull(new SignInDataStore$get$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(this.MediaDescriptionCompat.serializer(), new SignInDataStore$get$1()), isroot, 4), continuationImpl);
        int i2 = MediaSessionCompatQueueItem + 79;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objFirstOrNull;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    public final Object updateLastSavedVersionAndTimestamp(long j, String str, ContinuationImpl continuationImpl) {
        flatMapAnnotationsui_text flatmapannotationsui_text;
        int i;
        int i2 = 2 % 2;
        if (!(continuationImpl instanceof flatMapAnnotationsui_text)) {
            flatmapannotationsui_text = new flatMapAnnotationsui_text(this, continuationImpl);
            i = MediaMetadataCompat + 95;
            MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i3 = 4 / 5;
            }
        } else {
            int i4 = MediaMetadataCompat + 85;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = ((flatMapAnnotationsui_text) continuationImpl).IconCompatParcelizer;
                throw null;
            }
            flatmapannotationsui_text = (flatMapAnnotationsui_text) continuationImpl;
            int i6 = flatmapannotationsui_text.IconCompatParcelizer;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                flatmapannotationsui_text.IconCompatParcelizer = i6 - Integer.MIN_VALUE;
                int i7 = MediaMetadataCompat + 113;
                MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                flatmapannotationsui_text = new flatMapAnnotationsui_text(this, continuationImpl);
                i = MediaMetadataCompat + 95;
                MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i9 = 4 / 5;
                }
            }
        }
        Object obj = flatmapannotationsui_text.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = flatmapannotationsui_text.IconCompatParcelizer;
        try {
            if (i10 != 0) {
                int i11 = MediaSessionCompatQueueItem + 97;
                MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0 ? i10 != 1 : i10 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.MediaDescriptionCompat;
                ChatLogger$log$2 chatLogger$log$2 = new ChatLogger$log$2(j, str, null);
                flatmapannotationsui_text.IconCompatParcelizer = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, chatLogger$log$2, flatmapannotationsui_text) == coroutineSingletons) {
                    int i12 = MediaMetadataCompat + 17;
                    MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to update last saved version and timestamp to DataStore", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final Object updateValue(isRoot isroot, Object obj, ContinuationImpl continuationImpl) {
        int i;
        pushLink pushlink;
        int i2;
        Object obj2;
        CoroutineSingletons coroutineSingletons;
        int i3;
        performCustomExitMxy_nc0 performcustomexitmxy_nc0;
        SignInDataStore$set$2 signInDataStore$set$2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = MediaMetadataCompat + 91;
        int i8 = i7 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i8;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i7 % 2 != 0) {
                if (continuationImpl instanceof pushLink) {
                    i = i8 + 45;
                    MediaMetadataCompat = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        int i9 = ((pushLink) continuationImpl).write;
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                    pushlink = (pushLink) continuationImpl;
                    i2 = pushlink.write;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        pushlink.write = i2 - Integer.MIN_VALUE;
                    }
                }
                obj2 = pushlink.read;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = pushlink.write;
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    performcustomexitmxy_nc0 = this.MediaDescriptionCompat;
                    signInDataStore$set$2 = new SignInDataStore$set$2(isroot, obj, shortNewsContentCardView, 16);
                    pushlink.RemoteActionCompatParcelizer = isroot;
                    pushlink.write = 1;
                    if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, signInDataStore$set$2, pushlink) == coroutineSingletons) {
                        int i10 = MediaSessionCompatQueueItem + 31;
                        int i11 = i10 % Fields.SpotShadowColor;
                        MediaMetadataCompat = i11;
                        int i12 = i10 % 2;
                        i4 = i11 + 29;
                        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            return coroutineSingletons;
                        }
                        throw null;
                    }
                } else {
                    if (i3 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = MediaSessionCompatQueueItem + 125;
                    MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        isRoot isroot2 = pushlink.RemoteActionCompatParcelizer;
                        ExtrasKt.RemoteActionCompatParcelizer(obj2);
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                    isRoot isroot3 = pushlink.RemoteActionCompatParcelizer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                }
                return createFromParcel.INSTANCE;
            }
            int i13 = 62 / 0;
            if (continuationImpl instanceof pushLink) {
                i = i8 + 45;
                MediaMetadataCompat = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i14 = ((pushLink) continuationImpl).write;
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                pushlink = (pushLink) continuationImpl;
                i2 = pushlink.write;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pushlink.write = i2 - Integer.MIN_VALUE;
                }
            }
            obj2 = pushlink.read;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i3 = pushlink.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                performcustomexitmxy_nc0 = this.MediaDescriptionCompat;
                signInDataStore$set$2 = new SignInDataStore$set$2(isroot, obj, shortNewsContentCardView, 16);
                pushlink.RemoteActionCompatParcelizer = isroot;
                pushlink.write = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, signInDataStore$set$2, pushlink) == coroutineSingletons) {
                    int i15 = MediaSessionCompatQueueItem + 31;
                    int i16 = i15 % Fields.SpotShadowColor;
                    MediaMetadataCompat = i16;
                    int i17 = i15 % 2;
                    i4 = i16 + 29;
                    MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = MediaSessionCompatQueueItem + 125;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    isRoot isroot4 = pushlink.RemoteActionCompatParcelizer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                isRoot isroot5 = pushlink.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
            return createFromParcel.INSTANCE;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                performcustomexitmxy_nc0 = this.MediaDescriptionCompat;
                signInDataStore$set$2 = new SignInDataStore$set$2(isroot, obj, shortNewsContentCardView, 16);
                pushlink.RemoteActionCompatParcelizer = isroot;
                pushlink.write = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, signInDataStore$set$2, pushlink) == coroutineSingletons) {
                    int i18 = MediaSessionCompatQueueItem + 31;
                    int i19 = i18 % Fields.SpotShadowColor;
                    MediaMetadataCompat = i19;
                    int i110 = i18 % 2;
                    i4 = i19 + 29;
                    MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = MediaSessionCompatQueueItem + 125;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    isRoot isroot6 = pushlink.RemoteActionCompatParcelizer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                isRoot isroot7 = pushlink.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, ff$$ExternalSyntheticOutline0.m("Failed to update key ", isroot.IconCompatParcelizer, " to DataStore"), new Object[0]);
            int i20 = MediaSessionCompatQueueItem + 17;
            MediaMetadataCompat = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
        }
        pushlink = new pushLink(this, continuationImpl);
        obj2 = pushlink.read;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = pushlink.write;
        return createFromParcel.INSTANCE;
    }
}
