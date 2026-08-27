package com.foodora.courier.base.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.base.presentation.MvvmActivity;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.push.presentation.BasePushMessagesViewModel;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import o.access1000;
import o.createFromParcel;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END;
import o.lambdaonActivityLifecycle1;
import o.onItemDismisslambda0;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public abstract class MvvmActivity<VM extends BasePushMessagesViewModel> extends BaseActivity {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public VM MediaDescriptionCompat;

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(MvvmActivity mvvmActivity, lambdaonActivityLifecycle1 lambdaonactivitylifecycle1) {
        int i = 2 % 2;
        int i2 = RatingCompat + 77;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelSerializer = serializer(mvvmActivity, lambdaonactivitylifecycle1);
        int i4 = RatingCompat + 39;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return createfromparcelSerializer;
    }

    public static /* synthetic */ createFromParcel read(MvvmActivity mvvmActivity, MessageDialogData messageDialogData) {
        int i = 2 % 2;
        int i2 = RatingCompat + 121;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            serializer(mvvmActivity, messageDialogData);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        createFromParcel createfromparcelSerializer = serializer(mvvmActivity, messageDialogData);
        int i3 = RatingCompat + 115;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return createfromparcelSerializer;
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            read();
            int i3 = 24 / 0;
        } else {
            super.onCreate(bundle);
            read();
        }
        int i4 = MediaSessionCompatQueueItem + 87;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final createFromParcel serializer(MvvmActivity mvvmActivity, MessageDialogData messageDialogData) {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 43;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (messageDialogData != null) {
            int i5 = i2 + 53;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                mvvmActivity.write(messageDialogData);
                throw null;
            }
            mvvmActivity.write(messageDialogData);
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i6 = RatingCompat + 91;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 113;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onStart();
        RemoteActionCompatParcelizer().onActivityStart();
        int i4 = RatingCompat + 67;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final VM RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 87;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        VM vm = this.MediaDescriptionCompat;
        if (vm == null) {
            removeNodeAtDepth.serializer("viewModel");
            throw null;
        }
        int i5 = i3 + 97;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return vm;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int i = 2 % 2;
        int i2 = RatingCompat + 119;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer().ComponentActivity.read();
            super.onStop();
            int i3 = 40 / 0;
        } else {
            RemoteActionCompatParcelizer().ComponentActivity.read();
            super.onStop();
        }
        int i4 = RatingCompat + 95;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private static final createFromParcel serializer(MvvmActivity mvvmActivity, lambdaonActivityLifecycle1 lambdaonactivitylifecycle1) {
        int i = 2 % 2;
        int i2 = RatingCompat + 27;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            mvvmActivity.RemoteActionCompatParcelizer(lambdaonactivitylifecycle1.IconCompatParcelizer(), lambdaonactivitylifecycle1.serializer());
            return createFromParcel.INSTANCE;
        }
        mvvmActivity.RemoteActionCompatParcelizer(lambdaonactivitylifecycle1.IconCompatParcelizer(), lambdaonactivitylifecycle1.serializer());
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void read() {
        int i = 2 % 2;
        final int i2 = 0;
        RemoteActionCompatParcelizer().PlaybackStateCompatCustomAction.serializer(this, new getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT
            private static int read = 1;
            private static int serializer;
            public final /* synthetic */ MvvmActivity IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = serializer + 41;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                Object obj2 = null;
                if (i4 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i5 = i2;
                MvvmActivity mvvmActivity = this.IconCompatParcelizer;
                if (i5 != 0) {
                    createFromParcel createfromparcelRemoteActionCompatParcelizer = MvvmActivity.RemoteActionCompatParcelizer(mvvmActivity, (lambdaonActivityLifecycle1) obj);
                    int i6 = serializer + 37;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return createfromparcelRemoteActionCompatParcelizer;
                }
                createFromParcel createfromparcel = MvvmActivity.read(mvvmActivity, (MessageDialogData) obj);
                int i8 = read + 53;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            }
        }));
        final int i3 = 1;
        RemoteActionCompatParcelizer().PlaybackStateCompat.serializer(this, new getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT
            private static int read = 1;
            private static int serializer;
            public final /* synthetic */ MvvmActivity IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = serializer + 41;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                Object obj2 = null;
                if (i5 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i6 = i3;
                MvvmActivity mvvmActivity = this.IconCompatParcelizer;
                if (i6 != 0) {
                    createFromParcel createfromparcelRemoteActionCompatParcelizer = MvvmActivity.RemoteActionCompatParcelizer(mvvmActivity, (lambdaonActivityLifecycle1) obj);
                    int i7 = serializer + 37;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return createfromparcelRemoteActionCompatParcelizer;
                }
                createFromParcel createfromparcel = MvvmActivity.read(mvvmActivity, (MessageDialogData) obj);
                int i9 = read + 53;
                serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            }
        }));
        int i4 = RatingCompat + 45;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, o.lambdaisEnabled11
    @SuppressLint
    public void write(String str, PushAnalyticsData pushAnalyticsData) {
        int i = 2 % 2;
        str.getClass();
        access1000 access1000Var = RemoteActionCompatParcelizer().ParcelableVolumeInfo;
        if (access1000Var == null) {
            removeNodeAtDepth.serializer("pushNotificationLogger");
            throw null;
        }
        int i2 = MediaSessionCompatQueueItem + 69;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        access1000Var.IconCompatParcelizer.logEvent("push_notification_dialog_deep_link_button_clicked", access1000Var.IconCompatParcelizer(pushAnalyticsData));
        serializer();
        RemoteActionCompatParcelizer().MediaMetadataCompat.RemoteActionCompatParcelizer((Object) null);
        super.write(str, pushAnalyticsData);
        int i4 = MediaSessionCompatQueueItem + 73;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, o.lambdaisEnabled11
    public void read(MessageDialogData messageDialogData) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 77;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        messageDialogData.getClass();
        BasePushMessagesViewModel basePushMessagesViewModelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        PushAnalyticsData pushAnalyticsDataSerializer = messageDialogData.serializer();
        access1000 access1000Var = basePushMessagesViewModelRemoteActionCompatParcelizer.ParcelableVolumeInfo;
        Object obj = null;
        if (access1000Var == null) {
            removeNodeAtDepth.serializer("pushNotificationLogger");
            throw null;
        }
        access1000Var.IconCompatParcelizer.logEvent("push_notification_dialog_ok_button_clicked", access1000Var.IconCompatParcelizer(pushAnalyticsDataSerializer));
        boolean z = messageDialogData.read();
        if (z) {
            int i4 = RatingCompat + 39;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int iMediaMetadataCompat = FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat();
            int iMediaMetadataCompat2 = FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat();
            RemoteActionCompatParcelizer((String) MessageDialogData.RemoteActionCompatParcelizer(970192040, FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat(), iMediaMetadataCompat, FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat(), iMediaMetadataCompat2, -970192040, new Object[]{messageDialogData}), messageDialogData.IconCompatParcelizer());
            return;
        }
        if (z) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        int i6 = RatingCompat + 45;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            serializer();
            RemoteActionCompatParcelizer().MediaMetadataCompat.RemoteActionCompatParcelizer((Object) null);
        } else {
            serializer();
            RemoteActionCompatParcelizer().MediaMetadataCompat.RemoteActionCompatParcelizer((Object) null);
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
