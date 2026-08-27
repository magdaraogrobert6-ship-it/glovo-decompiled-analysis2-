package com.google.firebase.inappmessaging.display;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor;
import androidx.navigation.NavArgsLazy;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.stats.zza;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.google.firebase.inappmessaging.model.MessageType;
import com.huawei.location.ut;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.grpc.SynchronizationContext$1;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.FixedCountSubcomposeSlotReusePolicy;
import o.OwnerSnapshotObserveronCommitAffectingLookahead1;
import o.ParentDataModifierNode;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.RulerTrackingMap;
import o.SortedSet;
import o.TouchBoundsExpansion;
import o.TraversableNodeCompanion;
import o.effectiveBoundsInRoot;
import o.getDiagonalSizeimpl;
import o.getShouldClearDescendantSemantics;
import o.getUseMinimumTouchTarget;
import o.internalOnMeasureui;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.rotateRadRg1IO4cdefault;
import o.sendIndirectPointerEvent;
import o.sendKeyEventZmokQxo;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInAppMessagingDisplay implements com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay, Application.ActivityLifecycleCallbacks {
    public OwnerSnapshotObserveronCommitAffectingLookahead1 IconCompatParcelizer;
    public internalOnMeasureui MediaBrowserCompatMediaItem;
    public final getUseMinimumTouchTarget MediaDescriptionCompat;
    public final zzz MediaMetadataCompat;
    public final FirebaseInAppMessaging MediaSessionCompatQueueItem;
    public final effectiveBoundsInRoot MediaSessionCompatResultReceiverWrapper;
    public final Map PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public final RulerTrackingMap RemoteActionCompatParcelizer;
    public final Application read;
    public final getShouldClearDescendantSemantics serializer;
    public final zzz write;

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay$4, reason: invalid class name */
    public final class AnonymousClass4 extends rotateRadRg1IO4cdefault {
        public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener MediaSessionCompatQueueItem;
        public final /* synthetic */ SortedSet read;
        public final /* synthetic */ Activity serializer;
        public ImageView write;

        public AnonymousClass4(SortedSet sortedSet, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.read = sortedSet;
            this.serializer = activity;
            this.MediaSessionCompatQueueItem = onGlobalLayoutListener;
        }

        @Override // o.rotateRadRg1IO4cdefault
        public final void IconCompatParcelizer(Object obj) {
            Drawable drawable = (Drawable) obj;
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
            ImageView imageView = this.write;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            MediaBrowserCompatMediaItem();
        }

        public final void MediaBrowserCompatMediaItem() {
            SortedSet sortedSet = this.read;
            int i = 1;
            if (!sortedSet.write().read.booleanValue()) {
                sortedSet.IconCompatParcelizer().setOnTouchListener(new ListPopupWindow$PopupTouchInterceptor(i, this));
            }
            FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = FirebaseInAppMessagingDisplay.this;
            zzz zzzVar = firebaseInAppMessagingDisplay.MediaMetadataCompat;
            final sendIndirectPointerEvent sendindirectpointerevent = new sendIndirectPointerEvent(this, 0);
            zzzVar.getClass();
            final long j = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
            zzzVar.serializer = new CountDownTimer(j) { // from class: com.google.firebase.inappmessaging.display.internal.RenewableTimer$1
                @Override // android.os.CountDownTimer
                public final void onTick(long j2) {
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    OwnerSnapshotObserveronCommitAffectingLookahead1 ownerSnapshotObserveronCommitAffectingLookahead1;
                    sendIndirectPointerEvent sendindirectpointerevent2 = sendindirectpointerevent;
                    if (sendindirectpointerevent2.IconCompatParcelizer == 0) {
                        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay2 = FirebaseInAppMessagingDisplay.this;
                        internalOnMeasureui internalonmeasureui = firebaseInAppMessagingDisplay2.MediaBrowserCompatMediaItem;
                        if (internalonmeasureui == null || firebaseInAppMessagingDisplay2.IconCompatParcelizer == null) {
                            return;
                        }
                        ut utVar = internalonmeasureui.MediaDescriptionCompat;
                        Log.isLoggable("FIAM.Display", 4);
                        ((DisplayCallbacksImpl) firebaseInAppMessagingDisplay2.IconCompatParcelizer).serializer();
                        return;
                    }
                    FirebaseInAppMessagingDisplay.AnonymousClass4 anonymousClass4 = sendindirectpointerevent2.RemoteActionCompatParcelizer;
                    FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay3 = FirebaseInAppMessagingDisplay.this;
                    if (firebaseInAppMessagingDisplay3.MediaBrowserCompatMediaItem != null && (ownerSnapshotObserveronCommitAffectingLookahead1 = firebaseInAppMessagingDisplay3.IconCompatParcelizer) != null) {
                        ((DisplayCallbacksImpl) ownerSnapshotObserveronCommitAffectingLookahead1).IconCompatParcelizer(ParentDataModifierNode.AUTO);
                    }
                    Activity activity = anonymousClass4.serializer;
                    int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
                    BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
                    firebaseInAppMessagingDisplay3.IconCompatParcelizer(activity);
                    firebaseInAppMessagingDisplay3.MediaBrowserCompatMediaItem = null;
                    firebaseInAppMessagingDisplay3.IconCompatParcelizer = null;
                }
            }.start();
            if (sortedSet.write().write.booleanValue()) {
                zzz zzzVar2 = firebaseInAppMessagingDisplay.write;
                final sendIndirectPointerEvent sendindirectpointerevent2 = new sendIndirectPointerEvent(this, 1);
                zzzVar2.getClass();
                final long j2 = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
                zzzVar2.serializer = new CountDownTimer(j2) { // from class: com.google.firebase.inappmessaging.display.internal.RenewableTimer$1
                    @Override // android.os.CountDownTimer
                    public final void onTick(long j3) {
                    }

                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        OwnerSnapshotObserveronCommitAffectingLookahead1 ownerSnapshotObserveronCommitAffectingLookahead1;
                        sendIndirectPointerEvent sendindirectpointerevent3 = sendindirectpointerevent2;
                        if (sendindirectpointerevent3.IconCompatParcelizer == 0) {
                            FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay2 = FirebaseInAppMessagingDisplay.this;
                            internalOnMeasureui internalonmeasureui = firebaseInAppMessagingDisplay2.MediaBrowserCompatMediaItem;
                            if (internalonmeasureui == null || firebaseInAppMessagingDisplay2.IconCompatParcelizer == null) {
                                return;
                            }
                            ut utVar = internalonmeasureui.MediaDescriptionCompat;
                            Log.isLoggable("FIAM.Display", 4);
                            ((DisplayCallbacksImpl) firebaseInAppMessagingDisplay2.IconCompatParcelizer).serializer();
                            return;
                        }
                        FirebaseInAppMessagingDisplay.AnonymousClass4 anonymousClass4 = sendindirectpointerevent3.RemoteActionCompatParcelizer;
                        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay3 = FirebaseInAppMessagingDisplay.this;
                        if (firebaseInAppMessagingDisplay3.MediaBrowserCompatMediaItem != null && (ownerSnapshotObserveronCommitAffectingLookahead1 = firebaseInAppMessagingDisplay3.IconCompatParcelizer) != null) {
                            ((DisplayCallbacksImpl) ownerSnapshotObserveronCommitAffectingLookahead1).IconCompatParcelizer(ParentDataModifierNode.AUTO);
                        }
                        Activity activity = anonymousClass4.serializer;
                        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
                        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
                        firebaseInAppMessagingDisplay3.IconCompatParcelizer(activity);
                        firebaseInAppMessagingDisplay3.MediaBrowserCompatMediaItem = null;
                        firebaseInAppMessagingDisplay3.IconCompatParcelizer = null;
                    }
                }.start();
            }
            this.serializer.runOnUiThread(new zza(29, this));
        }

        @Override // o.rotateRadRg1IO4cdefault
        public final void read(Drawable drawable) {
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
            ImageView imageView = this.write;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            new Exception("Image loading failed!");
            BuildersKt.write("Image download failure ");
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.MediaSessionCompatQueueItem;
            if (onGlobalLayoutListener != null) {
                this.read.RemoteActionCompatParcelizer().getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
            }
            FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = FirebaseInAppMessagingDisplay.this;
            zzz zzzVar = firebaseInAppMessagingDisplay.MediaMetadataCompat;
            CountDownTimer countDownTimer = (CountDownTimer) zzzVar.serializer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                zzzVar.serializer = null;
            }
            zzz zzzVar2 = firebaseInAppMessagingDisplay.write;
            CountDownTimer countDownTimer2 = (CountDownTimer) zzzVar2.serializer;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                zzzVar2.serializer = null;
            }
            firebaseInAppMessagingDisplay.MediaBrowserCompatMediaItem = null;
            firebaseInAppMessagingDisplay.IconCompatParcelizer = null;
        }

        @Override // o.rotateRadRg1IO4cdefault
        public final void write(Drawable drawable) {
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
            ImageView imageView = this.write;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            MediaBrowserCompatMediaItem();
        }
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public final void displayMessage(internalOnMeasureui internalonmeasureui, OwnerSnapshotObserveronCommitAffectingLookahead1 ownerSnapshotObserveronCommitAffectingLookahead1) {
    }

    public final void IconCompatParcelizer(Activity activity) {
        SortedSet sortedSet = this.MediaSessionCompatResultReceiverWrapper.serializer;
        if (sortedSet != null && sortedSet.IconCompatParcelizer().isShown()) {
            getUseMinimumTouchTarget getuseminimumtouchtarget = this.MediaDescriptionCompat;
            Class<?> cls = activity.getClass();
            getuseminimumtouchtarget.getClass();
            String simpleName = cls.getSimpleName();
            synchronized (simpleName) {
                if (getuseminimumtouchtarget.RemoteActionCompatParcelizer.containsKey(simpleName)) {
                    for (rotateRadRg1IO4cdefault rotateradrg1io4cdefault : (Set) getuseminimumtouchtarget.RemoteActionCompatParcelizer.get(simpleName)) {
                        if (rotateradrg1io4cdefault != null) {
                            getuseminimumtouchtarget.serializer.read(rotateradrg1io4cdefault);
                        }
                    }
                }
            }
            effectiveBoundsInRoot effectiveboundsinroot = this.MediaSessionCompatResultReceiverWrapper;
            SortedSet sortedSet2 = effectiveboundsinroot.serializer;
            if (sortedSet2 != null && sortedSet2.IconCompatParcelizer().isShown()) {
                ((WindowManager) activity.getSystemService("window")).removeViewImmediate(effectiveboundsinroot.serializer.IconCompatParcelizer());
                effectiveboundsinroot.serializer = null;
            }
            zzz zzzVar = this.MediaMetadataCompat;
            CountDownTimer countDownTimer = (CountDownTimer) zzzVar.serializer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                zzzVar.serializer = null;
            }
            zzz zzzVar2 = this.write;
            CountDownTimer countDownTimer2 = (CountDownTimer) zzzVar2.serializer;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                zzzVar2.serializer = null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String str = this.RatingCompat;
        FirebaseInAppMessaging firebaseInAppMessaging = this.MediaSessionCompatQueueItem;
        if (str != null && str.equals(activity.getLocalClassName())) {
            activity.getLocalClassName();
            Log.isLoggable("FIAM.Display", 4);
            firebaseInAppMessaging.getClass();
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
            firebaseInAppMessaging.IconCompatParcelizer = null;
            IconCompatParcelizer(activity);
            this.RatingCompat = null;
        }
        TraversableNodeCompanion traversableNodeCompanion = firebaseInAppMessaging.RemoteActionCompatParcelizer;
        traversableNodeCompanion.RemoteActionCompatParcelizer.clear();
        traversableNodeCompanion.write.clear();
        traversableNodeCompanion.serializer.clear();
        traversableNodeCompanion.read.clear();
        read(activity);
    }

    public FirebaseInAppMessagingDisplay(FirebaseInAppMessaging firebaseInAppMessaging, Map map, getUseMinimumTouchTarget getuseminimumtouchtarget, zzz zzzVar, zzz zzzVar2, effectiveBoundsInRoot effectiveboundsinroot, Application application, RulerTrackingMap rulerTrackingMap, getShouldClearDescendantSemantics getshouldcleardescendantsemantics) {
        this.MediaSessionCompatQueueItem = firebaseInAppMessaging;
        this.PlaybackStateCompatCustomAction = map;
        this.MediaDescriptionCompat = getuseminimumtouchtarget;
        this.MediaMetadataCompat = zzzVar;
        this.write = zzzVar2;
        this.MediaSessionCompatResultReceiverWrapper = effectiveboundsinroot;
        this.read = application;
        this.RemoteActionCompatParcelizer = rulerTrackingMap;
        this.serializer = getshouldcleardescendantsemantics;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        write(activity);
        String str = this.RatingCompat;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            activity.getLocalClassName();
            Log.isLoggable("FIAM.Display", 4);
            JankStatsFrameTracker$$ExternalSyntheticLambda3 jankStatsFrameTracker$$ExternalSyntheticLambda3 = new JankStatsFrameTracker$$ExternalSyntheticLambda3(this, 6, activity);
            FirebaseInAppMessaging firebaseInAppMessaging = this.MediaSessionCompatQueueItem;
            firebaseInAppMessaging.getClass();
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
            firebaseInAppMessaging.IconCompatParcelizer = jankStatsFrameTracker$$ExternalSyntheticLambda3;
            this.RatingCompat = activity.getLocalClassName();
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            RemoteActionCompatParcelizer(activity);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    public final void RemoteActionCompatParcelizer(Activity activity) {
        String str;
        Object objIconCompatParcelizer;
        if (this.MediaBrowserCompatMediaItem == null) {
            BuildersKt.write("No active message found to render");
            return;
        }
        this.MediaSessionCompatQueueItem.getClass();
        if (this.MediaBrowserCompatMediaItem.IconCompatParcelizer().equals(MessageType.UNSUPPORTED)) {
            BuildersKt.write("The message being triggered is not supported by this version of the sdk.");
            return;
        }
        MessageType messageTypeIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        int i = 1;
        if (this.read.getResources().getConfiguration().orientation == 1) {
            int i2 = TouchBoundsExpansion.serializer[messageTypeIconCompatParcelizer.ordinal()];
            if (i2 == 1) {
                str = "MODAL_PORTRAIT";
            } else if (i2 == 2) {
                str = "CARD_PORTRAIT";
            } else if (i2 == 3) {
                str = "IMAGE_ONLY_PORTRAIT";
            } else if (i2 != 4) {
                str = null;
            } else {
                str = "BANNER_PORTRAIT";
            }
        } else {
            int i3 = TouchBoundsExpansion.serializer[messageTypeIconCompatParcelizer.ordinal()];
            if (i3 == 1) {
                str = "MODAL_LANDSCAPE";
            } else if (i3 == 2) {
                str = "CARD_LANDSCAPE";
            } else if (i3 == 3) {
                str = "IMAGE_ONLY_LANDSCAPE";
            } else if (i3 != 4) {
                str = null;
            } else {
                str = "BANNER_LANDSCAPE";
            }
        }
        getDiagonalSizeimpl getdiagonalsizeimpl = (getDiagonalSizeimpl) ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) this.PlaybackStateCompatCustomAction.get(str)).write();
        int i4 = sendKeyEventZmokQxo.write[this.MediaBrowserCompatMediaItem.IconCompatParcelizer().ordinal()];
        RulerTrackingMap rulerTrackingMap = this.RemoteActionCompatParcelizer;
        if (i4 == 1) {
            internalOnMeasureui internalonmeasureui = this.MediaBrowserCompatMediaItem;
            PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer = FixedCountSubcomposeSlotReusePolicy.RemoteActionCompatParcelizer();
            pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer.write(new NavArgsLazy(internalonmeasureui, getdiagonalsizeimpl, rulerTrackingMap.RemoteActionCompatParcelizer, i));
            objIconCompatParcelizer = pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer.serializer().IconCompatParcelizer();
        } else if (i4 == 2) {
            internalOnMeasureui internalonmeasureui2 = this.MediaBrowserCompatMediaItem;
            PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer2 = FixedCountSubcomposeSlotReusePolicy.RemoteActionCompatParcelizer();
            pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer2.write(new NavArgsLazy(internalonmeasureui2, getdiagonalsizeimpl, rulerTrackingMap.RemoteActionCompatParcelizer, i));
            objIconCompatParcelizer = pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer2.serializer().MediaDescriptionCompat();
        } else if (i4 == 3) {
            internalOnMeasureui internalonmeasureui3 = this.MediaBrowserCompatMediaItem;
            PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer3 = FixedCountSubcomposeSlotReusePolicy.RemoteActionCompatParcelizer();
            pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer3.write(new NavArgsLazy(internalonmeasureui3, getdiagonalsizeimpl, rulerTrackingMap.RemoteActionCompatParcelizer, i));
            objIconCompatParcelizer = pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer3.serializer().MediaBrowserCompatMediaItem();
        } else {
            if (i4 != 4) {
                BuildersKt.write("No bindings found for this message type");
                return;
            }
            internalOnMeasureui internalonmeasureui4 = this.MediaBrowserCompatMediaItem;
            PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer4 = FixedCountSubcomposeSlotReusePolicy.RemoteActionCompatParcelizer();
            pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer4.write(new NavArgsLazy(internalonmeasureui4, getdiagonalsizeimpl, rulerTrackingMap.RemoteActionCompatParcelizer, i));
            objIconCompatParcelizer = pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer4.serializer().RemoteActionCompatParcelizer();
        }
        activity.findViewById(R.id.content).post(new SynchronizationContext$1(16, this, activity, objIconCompatParcelizer, false));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        "Created activity: ".concat(activity.getClass().getName());
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        "Destroyed activity: ".concat(activity.getClass().getName());
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        "SavedInstance activity: ".concat(activity.getClass().getName());
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        "Started activity: ".concat(activity.getClass().getName());
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        "Stopped activity: ".concat(activity.getClass().getName());
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
    }

    public final void read(Activity activity) {
        "Pausing activity: ".concat(activity.getClass().getName());
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
    }

    public final void write(Activity activity) {
        "Resumed activity: ".concat(activity.getClass().getName());
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
    }
}
