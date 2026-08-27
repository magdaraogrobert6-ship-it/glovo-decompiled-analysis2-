package com.roadrunner.push.presentation;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Parser;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.push.presentation.BasePushMessagesViewModel;
import com.roadrunner.push.presentation.PushMessagesActivity;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import o.BrazeImageUtilsExternalSyntheticLambda21;
import o.MemoryCachegetHoldoutsWithLock1;
import o.createFromParcel;
import o.lambdaisEnabled11;
import o.lambdaonActivityLifecycle1;
import o.q4ExternalSyntheticLambda9;
import o.r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setFocusable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PushMessagesActivity<VM extends BasePushMessagesViewModel> extends AppCompatActivity implements lambdaisEnabled11 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public q4ExternalSyntheticLambda9 MediaSessionCompatToken;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public VM PlaybackStateCompatCustomAction;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ RatingCompat;

    public static /* synthetic */ Object read(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i4 | i7;
        int i9 = ~i;
        int i10 = ~((~i4) | i7);
        int i11 = i6 + i + i3 + (1977613057 * i2) + (454551927 * i5);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i6) + 473956352 + (953991674 * i) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i3) + ((-981467136) * i2) + ((-830472192) * i5) + ((-499122176) * i12);
        int i14 = (i6 * (-1131120504)) + 246467939 + (i * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i3 * (-1131119791)) + (i2 * (-1039407535)) + (i5 * 1820920743) + (i12 * 1447034880);
        return i13 + ((i14 * i14) * 1170210816) != 1 ? serializer(objArr) : read(objArr);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        PushMessagesActivity pushMessagesActivity = (PushMessagesActivity) objArr[0];
        lambdaonActivityLifecycle1 lambdaonactivitylifecycle1 = (lambdaonActivityLifecycle1) objArr[1];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return serializer(pushMessagesActivity, lambdaonactivitylifecycle1);
        }
        createFromParcel createfromparcelSerializer = serializer(pushMessagesActivity, lambdaonactivitylifecycle1);
        int i3 = 81 / 0;
        return createfromparcelSerializer;
    }

    public static /* synthetic */ createFromParcel serializer(PushMessagesActivity pushMessagesActivity, MessageDialogData messageDialogData) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 1;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return RemoteActionCompatParcelizer(pushMessagesActivity, messageDialogData);
        }
        createFromParcel createfromparcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(pushMessagesActivity, messageDialogData);
        int i3 = 21 / 0;
        return createfromparcelRemoteActionCompatParcelizer;
    }

    private static final createFromParcel serializer(PushMessagesActivity pushMessagesActivity, lambdaonActivityLifecycle1 lambdaonactivitylifecycle1) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        pushMessagesActivity.RemoteActionCompatParcelizer();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            serializer();
            throw null;
        }
        super.onCreate(bundle);
        serializer();
        int i3 = MediaDescriptionCompat + 115;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final createFromParcel RemoteActionCompatParcelizer(PushMessagesActivity pushMessagesActivity, MessageDialogData messageDialogData) {
        int i = 2 % 2;
        if (messageDialogData != null) {
            int i2 = MediaBrowserCompatMediaItem + 35;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            pushMessagesActivity.RemoteActionCompatParcelizer(messageDialogData);
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = MediaDescriptionCompat + 3;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 31;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            super.onStart();
            int iWrite = MemoryCachegetHoldoutsWithLock1.write();
            ((BasePushMessagesViewModel) read(new Object[]{this}, -1985989632, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite, MemoryCachegetHoldoutsWithLock1.write(), 1985989632)).onActivityStart();
            throw null;
        }
        super.onStart();
        int iWrite2 = MemoryCachegetHoldoutsWithLock1.write();
        ((BasePushMessagesViewModel) read(new Object[]{this}, -1985989632, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite2, MemoryCachegetHoldoutsWithLock1.write(), 1985989632)).onActivityStart();
        int i3 = MediaBrowserCompatMediaItem + 19;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final q4ExternalSyntheticLambda9 MediaMetadataCompat() {
        int i = 2 % 2;
        q4ExternalSyntheticLambda9 q4externalsyntheticlambda9 = this.MediaSessionCompatToken;
        if (q4externalsyntheticlambda9 == null) {
            removeNodeAtDepth.serializer("mainNavigator");
            throw null;
        }
        int i2 = MediaDescriptionCompat + 51;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return q4externalsyntheticlambda9;
    }

    public final r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ r8lambda8mkyolzlh_k8e1g4buhcvycf8wq = this.RatingCompat;
        if (r8lambda8mkyolzlh_k8e1g4buhcvycf8wq == null) {
            removeNodeAtDepth.serializer("deepLinkNavigator");
            throw null;
        }
        int i5 = i3 + 47;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return r8lambda8mkyolzlh_k8e1g4buhcvycf8wq;
    }

    private final void RemoteActionCompatParcelizer() {
        q4ExternalSyntheticLambda9 q4externalsyntheticlambda9MediaMetadataCompat;
        Boolean bool;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 115;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            q4externalsyntheticlambda9MediaMetadataCompat = MediaMetadataCompat();
            bool = Boolean.TRUE;
            i = 38;
        } else {
            q4externalsyntheticlambda9MediaMetadataCompat = MediaMetadataCompat();
            bool = Boolean.TRUE;
            i = 8;
        }
        q4ExternalSyntheticLambda9.RemoteActionCompatParcelizer(q4externalsyntheticlambda9MediaMetadataCompat, this, bool, null, i);
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        PushMessagesActivity pushMessagesActivity = (PushMessagesActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 39;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        VM vm = pushMessagesActivity.PlaybackStateCompatCustomAction;
        if (vm == null) {
            removeNodeAtDepth.serializer("viewModel");
            throw null;
        }
        int i5 = i2 + 37;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return vm;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iWrite = MemoryCachegetHoldoutsWithLock1.write();
        ((BasePushMessagesViewModel) read(new Object[]{this}, -1985989632, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite, MemoryCachegetHoldoutsWithLock1.write(), 1985989632)).ComponentActivity.read();
        super.onStop();
        int i4 = MediaDescriptionCompat + 53;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void read(String str, PushAnalyticsData pushAnalyticsData) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        startActivity(((Parser.Pair) write()).read(this, str, null, pushAnalyticsData));
        int i4 = MediaDescriptionCompat + 125;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.lambdaisEnabled11
    public void write(String str, PushAnalyticsData pushAnalyticsData) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 49;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        read();
        int iWrite = MemoryCachegetHoldoutsWithLock1.write();
        ((BasePushMessagesViewModel) read(new Object[]{this}, -1985989632, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite, MemoryCachegetHoldoutsWithLock1.write(), 1985989632)).MediaMetadataCompat.RemoteActionCompatParcelizer((Object) null);
        read(str, pushAnalyticsData);
        int i4 = MediaDescriptionCompat + 11;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private final void RemoteActionCompatParcelizer(MessageDialogData messageDialogData) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            messageDialogData.RemoteActionCompatParcelizer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!messageDialogData.RemoteActionCompatParcelizer())) {
            read();
            setFocusable.read(messageDialogData).RemoteActionCompatParcelizer(getSupportFragmentManager(), "com.roadrunner.push.presentation.MessageDialogFragment");
        }
        int i3 = MediaDescriptionCompat + 23;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    private final void read() {
        DialogFragment dialogFragment;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("com.roadrunner.push.presentation.MessageDialogFragment");
        if (fragmentFindFragmentByTag instanceof DialogFragment) {
            dialogFragment = (DialogFragment) fragmentFindFragmentByTag;
        } else {
            int i4 = MediaBrowserCompatMediaItem + 1;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            dialogFragment = null;
        }
        if (dialogFragment != null) {
            int i6 = MediaDescriptionCompat + 37;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            dialogFragment.write();
        }
    }

    @Override // o.lambdaisEnabled11
    public void read(MessageDialogData messageDialogData) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        messageDialogData.getClass();
        boolean z = messageDialogData.read();
        if (z) {
            int i4 = MediaBrowserCompatMediaItem + 11;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            RemoteActionCompatParcelizer();
            return;
        }
        if (!(!z)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        read();
        ((BasePushMessagesViewModel) read(new Object[]{this}, -1985989632, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), 1985989632)).MediaMetadataCompat.RemoteActionCompatParcelizer((Object) null);
        int i6 = MediaBrowserCompatMediaItem + 55;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    private final void serializer() {
        int i = 2 % 2;
        int iWrite = MemoryCachegetHoldoutsWithLock1.write();
        final int i2 = 0;
        ((BasePushMessagesViewModel) read(new Object[]{this}, -1985989632, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite, MemoryCachegetHoldoutsWithLock1.write(), 1985989632)).PlaybackStateCompatCustomAction.serializer(this, new BrazeImageUtilsExternalSyntheticLambda21(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.lambdaprocessDeeplink13
            private static int read = 0;
            private static int write = 1;
            public final /* synthetic */ PushMessagesActivity RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = read + 101;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                PushMessagesActivity pushMessagesActivity = this.RemoteActionCompatParcelizer;
                if (i6 == 0) {
                    return PushMessagesActivity.serializer(pushMessagesActivity, (MessageDialogData) obj);
                }
                int iWrite2 = MemoryCachegetHoldoutsWithLock1.write();
                createFromParcel createfromparcel = (createFromParcel) PushMessagesActivity.read(new Object[]{pushMessagesActivity, (lambdaonActivityLifecycle1) obj}, -1148196001, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite2, MemoryCachegetHoldoutsWithLock1.write(), 1148196002);
                int i7 = read + 27;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 39 / 0;
                }
                return createfromparcel;
            }
        }, 2));
        int iWrite2 = MemoryCachegetHoldoutsWithLock1.write();
        final int i3 = 1;
        ((BasePushMessagesViewModel) read(new Object[]{this}, -1985989632, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite2, MemoryCachegetHoldoutsWithLock1.write(), 1985989632)).PlaybackStateCompat.serializer(this, new BrazeImageUtilsExternalSyntheticLambda21(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.lambdaprocessDeeplink13
            private static int read = 0;
            private static int write = 1;
            public final /* synthetic */ PushMessagesActivity RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = read + 101;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                PushMessagesActivity pushMessagesActivity = this.RemoteActionCompatParcelizer;
                if (i7 == 0) {
                    return PushMessagesActivity.serializer(pushMessagesActivity, (MessageDialogData) obj);
                }
                int iWrite3 = MemoryCachegetHoldoutsWithLock1.write();
                createFromParcel createfromparcel = (createFromParcel) PushMessagesActivity.read(new Object[]{pushMessagesActivity, (lambdaonActivityLifecycle1) obj}, -1148196001, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite3, MemoryCachegetHoldoutsWithLock1.write(), 1148196002);
                int i8 = read + 27;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 39 / 0;
                }
                return createfromparcel;
            }
        }, 2));
        int i4 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final VM MediaSessionCompatQueueItem() {
        int iWrite = MemoryCachegetHoldoutsWithLock1.write();
        return (VM) read(new Object[]{this}, -1985989632, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite, MemoryCachegetHoldoutsWithLock1.write(), 1985989632);
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(PushMessagesActivity pushMessagesActivity, lambdaonActivityLifecycle1 lambdaonactivitylifecycle1) {
        int iWrite = MemoryCachegetHoldoutsWithLock1.write();
        return (createFromParcel) read(new Object[]{pushMessagesActivity, lambdaonactivitylifecycle1}, -1148196001, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite, MemoryCachegetHoldoutsWithLock1.write(), 1148196002);
    }
}
