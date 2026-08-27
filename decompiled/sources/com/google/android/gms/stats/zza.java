package com.google.android.gms.stats;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.internal.NavContext;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.gms.cloudmessaging.zzp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zacl;
import com.google.android.gms.internal.gtm.zzcp;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.oss.licenses.OssLicensesActivity;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.grpc.Status;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlinx.coroutines.BuildersKt;
import o.AlertControllerButtonHandler;
import o.ColorSpaceVerificationHelperV34;
import o.DrawModifierNodeKt;
import o.FocusPropertiesNode;
import o.LayoutNodeSubcompositionsStatecreateMeasurePolicy1;
import o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1;
import o.LookaheadScopeImpl;
import o.LookaheadScopeKt;
import o.LookaheadScopeKtLookaheadScope221;
import o.LookaheadScopeKtLookaheadScope4;
import o.MeasuringIntrinsicsDefaultIntrinsicMeasurable;
import o.NoWindowInsetsAnimation;
import o.OnBackPressedCallback;
import o.OnFirstVisibleNode;
import o.OnFirstVisibleNodestartTimer1;
import o.OnGloballyPositionedModifier;
import o.PendingValue;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.PinnableContainerPinnedHandle;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.SemanticsModifierNode;
import o.SignalEosOutputBufferNotComeQuirk;
import o.SizeCannotEncodeVideoQuirk;
import o.SortedSet;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputComposite1cp;
import o.accesssetProcessingCustomEnterp;
import o.addDiagonalToStackimpl;
import o.decrementKeepScreenOnCount;
import o.effectiveBoundsInRoot;
import o.fetchFocusRectui;
import o.getButton16EK5gGoQ;
import o.getButton6EK5gGoQ;
import o.getButtonThumbLeftEK5gGoQ;
import o.getButtonXEK5gGoQ;
import o.getCameraEK5gGoQ;
import o.getChannelUpEK5gGoQ;
import o.getContactsEK5gGoQ;
import o.getCutEK5gGoQ;
import o.getDiagonalSizeimpl;
import o.getEndYimpl;
import o.getExponentimpl;
import o.getLastViewport;
import o.getLookaheadDelegate;
import o.getRedirectui;
import o.getRootLookaheadDelegate;
import o.getShouldClearDescendantSemantics;
import o.getStartXimpl;
import o.localLookaheadPositionOfFgt4K4Q;
import o.lookaheadScopeCoordinates;
import o.maxHeight;
import o.onLayoutRectChangeddefault;
import o.onMeasuredSizeChanged;
import o.premeasure0kLqBqw;
import o.removeOnUserLeaveHintListener;
import o.reuseLayer;
import o.setCallback;
import o.setComposedWithReusableContentHost;
import o.setContent;
import o.setDebounceMillis;
import o.setDropDownBackgroundResource;
import o.setHasNonEmbeddedTabs;
import o.setJob;
import o.setMinDurationMs;
import o.setViewportBounds;
import o.startActivityForResult;
import o.toAndroidRect;
import o.triggerCallback;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zza implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public zza(zacl zaclVar) {
        this.RemoteActionCompatParcelizer = 14;
        Objects.requireNonNull(zaclVar);
        this.write = zaclVar;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x026a  */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                WakeLock wakeLock = (WakeLock) this.write;
                synchronized (wakeLock.write) {
                    if (wakeLock.write()) {
                        SentryLogcatAdapter.serializer("WakeLock", String.valueOf(wakeLock.MediaSessionCompatToken).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        wakeLock.serializer();
                        if (wakeLock.write()) {
                            wakeLock.MediaBrowserCompatMediaItem = 1;
                            wakeLock.RemoteActionCompatParcelizer();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                startActivityForResult startactivityforresult = (startActivityForResult) this.write;
                startactivityforresult.ResultReceiver.showAtLocation(startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, 55, 0, 0);
                getRedirectui getredirectui = startactivityforresult._init_lambda2;
                if (getredirectui != null) {
                    getredirectui.serializer();
                }
                if (!startactivityforresult.addOnConfigurationChangedListener || (viewGroup = startactivityforresult.addMenuProvider) == null || !viewGroup.isLaidOut()) {
                    startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setAlpha(1.0f);
                    startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setVisibility(0);
                    return;
                }
                startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setAlpha(0.0f);
                getRedirectui getredirectuiWrite = FocusPropertiesNode.write(startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                getredirectuiWrite.RemoteActionCompatParcelizer(1.0f);
                startactivityforresult._init_lambda2 = getredirectuiWrite;
                getredirectuiWrite.IconCompatParcelizer(new removeOnUserLeaveHintListener(i2, this));
                return;
            case 2:
                OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) this.write;
                Window.Callback callback = onBackPressedCallback.MediaSessionCompatQueueItem;
                Menu menu = onBackPressedCallback.getMenu();
                AlertControllerButtonHandler alertControllerButtonHandler = menu instanceof AlertControllerButtonHandler ? (AlertControllerButtonHandler) menu : null;
                if (alertControllerButtonHandler != null) {
                    alertControllerButtonHandler.MediaDescriptionCompat();
                }
                try {
                    menu.clear();
                    if (!callback.onCreatePanelMenu(0, menu) || !callback.onPreparePanel(0, null, menu)) {
                        menu.clear();
                    }
                    if (alertControllerButtonHandler != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (alertControllerButtonHandler != null) {
                        alertControllerButtonHandler.MediaBrowserCompatMediaItem();
                    }
                }
                break;
            case 3:
                setHasNonEmbeddedTabs sethasnonembeddedtabs = (setHasNonEmbeddedTabs) this.write;
                sethasnonembeddedtabs.IconCompatParcelizer = null;
                sethasnonembeddedtabs.drawableStateChanged();
                return;
            case 4:
                setDropDownBackgroundResource setdropdownbackgroundresource = (setDropDownBackgroundResource) this.write;
                if (setdropdownbackgroundresource.read) {
                    ((InputMethodManager) setdropdownbackgroundresource.getContext().getSystemService("input_method")).showSoftInput(setdropdownbackgroundresource, 0);
                    setdropdownbackgroundresource.read = false;
                    return;
                }
                return;
            case 5:
                ((Toolbar) this.write).RatingCompat();
                return;
            case 6:
                NavArgsLazy navArgsLazy = (NavArgsLazy) this.write;
                SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) navArgsLazy.RatingCompat;
                if (sizeCannotEncodeVideoQuirk.IconCompatParcelizer.getAndSet(null) != null) {
                    ((Handler) navArgsLazy.MediaSessionCompatQueueItem).removeCallbacks(sizeCannotEncodeVideoQuirk);
                    return;
                }
                return;
            case 7:
                try {
                    write();
                    return;
                } catch (Error e) {
                    synchronized (((PreviewFreezeAfterHighSpeedRecordingQuirk) this.write).read) {
                        ((PreviewFreezeAfterHighSpeedRecordingQuirk) this.write).RemoteActionCompatParcelizer = SignalEosOutputBufferNotComeQuirk.IDLE;
                        throw e;
                    }
                }
            case 8:
                ((DrawModifierNodeKt) this.write).cancel(true);
                return;
            case 9:
                PendingValue pendingValue = (PendingValue) this.write;
                pendingValue.MediaDescriptionCompat = null;
                pendingValue.RemoteActionCompatParcelizer = null;
                return;
            case 10:
                fetchFocusRectui fetchfocusrectui = (fetchFocusRectui) this.write;
                setHasNonEmbeddedTabs sethasnonembeddedtabs2 = fetchfocusrectui.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                accesssetProcessingCustomEnterp accesssetprocessingcustomenterp = fetchfocusrectui.ComponentActivity;
                if (fetchfocusrectui.IconCompatParcelizer) {
                    if (fetchfocusrectui.PlaybackStateCompat) {
                        fetchfocusrectui.PlaybackStateCompat = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        accesssetprocessingcustomenterp.serializer = jCurrentAnimationTimeMillis;
                        accesssetprocessingcustomenterp.RatingCompat = -1L;
                        accesssetprocessingcustomenterp.IconCompatParcelizer = jCurrentAnimationTimeMillis;
                        accesssetprocessingcustomenterp.MediaDescriptionCompat = 0.5f;
                    }
                    if ((accesssetprocessingcustomenterp.RatingCompat > 0 && AnimationUtils.currentAnimationTimeMillis() > accesssetprocessingcustomenterp.RatingCompat + ((long) accesssetprocessingcustomenterp.RemoteActionCompatParcelizer)) || !fetchfocusrectui.serializer()) {
                        fetchfocusrectui.IconCompatParcelizer = false;
                        return;
                    }
                    if (fetchfocusrectui.PlaybackStateCompatCustomAction) {
                        fetchfocusrectui.PlaybackStateCompatCustomAction = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        sethasnonembeddedtabs2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (accesssetprocessingcustomenterp.IconCompatParcelizer == 0) {
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fWrite = accesssetprocessingcustomenterp.write(jCurrentAnimationTimeMillis2);
                    long j = accesssetprocessingcustomenterp.IconCompatParcelizer;
                    accesssetprocessingcustomenterp.IconCompatParcelizer = jCurrentAnimationTimeMillis2;
                    fetchfocusrectui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.scrollListBy((int) ((jCurrentAnimationTimeMillis2 - j) * ((4.0f * fWrite) + ((-4.0f) * fWrite * fWrite)) * accesssetprocessingcustomenterp.MediaBrowserCompatMediaItem));
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    sethasnonembeddedtabs2.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                ((zzp) this.write).write("Service disconnected");
                return;
            case 12:
                ((zabk) this.write).write();
                return;
            case 13:
                zabk zabkVar = (zabk) ((getExponentimpl) this.write).read;
                zabkVar.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(zabkVar.RemoteActionCompatParcelizer.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 14:
                ((zacl) this.write).MediaMetadataCompat.serializer(new ConnectionResult(4, null, null));
                return;
            case 15:
                getCameraEK5gGoQ getcameraek5ggoq = (getCameraEK5gGoQ) this.write;
                getcameraek5ggoq.MediaDescriptionCompat = false;
                getcameraek5ggoq.serializer.read();
                return;
            case 16:
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                getCutEK5gGoQ getcutek5ggoq = ((getContactsEK5gGoQ) ((zzcp) this.write).read).RemoteActionCompatParcelizer;
                if (getcutek5ggoq.IconCompatParcelizer()) {
                    try {
                        getcutek5ggoq.read.RemoteActionCompatParcelizer();
                        return;
                    } catch (RemoteException e2) {
                        getButtonThumbLeftEK5gGoQ.read("Error calling service to dispatch pending events", e2);
                        return;
                    }
                }
                return;
            case 17:
                HashMap map = ((getChannelUpEK5gGoQ) this.write).read;
                if (map.isEmpty()) {
                    getButtonThumbLeftEK5gGoQ.serializer("TagManagerBackend dispatch called without loaded container.");
                    return;
                }
                for (getButton6EK5gGoQ getbutton6ek5ggoq : map.values()) {
                    getbutton6ek5ggoq.getClass();
                    getbutton6ek5ggoq.MediaMetadataCompat.execute(new getButton16EK5gGoQ(getbutton6ek5ggoq, i3));
                }
                return;
            case 18:
                ((getRootLookaheadDelegate) this.write).IconCompatParcelizer.MediaMetadataCompat();
                return;
            case 19:
                OnFirstVisibleNode onFirstVisibleNode = (OnFirstVisibleNode) this.write;
                onFirstVisibleNode.serializer = onFirstVisibleNode.MediaDescriptionCompat;
                return;
            case 20:
                setViewportBounds setviewportbounds = ((setCallback) this.write).serializer;
                setviewportbounds.serializer(new ComponentName(((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 21:
                setViewportBounds setviewportbounds2 = ((setCallback) ((com.google.android.gms.net.zza) this.write).read).serializer;
                LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                lookaheadScopeKtLookaheadScope4.write((Runnable) new setJob(setviewportbounds2, i3));
                return;
            case 22:
                OnFirstVisibleNodestartTimer1 onFirstVisibleNodestartTimer1 = (OnFirstVisibleNodestartTimer1) this.write;
                triggerCallback triggercallback = (triggerCallback) onFirstVisibleNodestartTimer1.IconCompatParcelizer.RemoteActionCompatParcelizer;
                triggercallback.MediaSessionCompatToken();
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                Context context = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Application going to the background");
                LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
                lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper.serializer(true);
                triggercallback.MediaSessionCompatToken();
                triggercallback.RatingCompat = true;
                setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
                if (!setcomposedwithreusablecontenthost.MediaSessionCompatResultReceiverWrapper()) {
                    long j2 = onFirstVisibleNodestartTimer1.RemoteActionCompatParcelizer;
                    toAndroidRect toandroidrect = triggercallback.write;
                    toandroidrect.RemoteActionCompatParcelizer(j2, false, false);
                    ((MeasuringIntrinsicsDefaultIntrinsicMeasurable) toandroidrect.serializer).IconCompatParcelizer();
                }
                long j3 = onFirstVisibleNodestartTimer1.write;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaMetadataCompat.serializer(Long.valueOf(j3), "Application backgrounded at: timestamp_millis");
                NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope221.ComponentActivity;
                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                noWindowInsetsAnimation.MediaSessionCompatToken();
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                noWindowInsetsAnimation.serializer();
                setViewportBounds setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat();
                setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
                setviewportboundsMediaDescriptionCompat.serializer();
                if (setviewportboundsMediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper()) {
                    onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) setviewportboundsMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                    if (onlayoutrectchangeddefault.MediaSessionCompatResultReceiverWrapper() >= 242600) {
                        setViewportBounds setviewportboundsMediaDescriptionCompat2 = lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat();
                        setviewportboundsMediaDescriptionCompat2.MediaSessionCompatToken();
                        setviewportboundsMediaDescriptionCompat2.serializer();
                        setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer((Runnable) new getLastViewport(setviewportboundsMediaDescriptionCompat2, setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer(true), i2));
                    }
                } else {
                    setViewportBounds setviewportboundsMediaDescriptionCompat3 = lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat();
                    setviewportboundsMediaDescriptionCompat3.MediaSessionCompatToken();
                    setviewportboundsMediaDescriptionCompat3.serializer();
                    setviewportboundsMediaDescriptionCompat3.RemoteActionCompatParcelizer((Runnable) new getLastViewport(setviewportboundsMediaDescriptionCompat3, setviewportboundsMediaDescriptionCompat3.RemoteActionCompatParcelizer(true), i2));
                }
                if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.addObserverForBackInvoker)) {
                    onLayoutRectChangeddefault onlayoutrectchangeddefault2 = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
                    long jRemoteActionCompatParcelizer = onlayoutrectchangeddefault2.IconCompatParcelizer(context.getPackageName(), setcomposedwithreusablecontenthost.serializer) ? 1000L : setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer(context.getPackageName(), premeasure0kLqBqw.RemoteActionCompatParcelizer);
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.PlaybackStateCompat.serializer(Long.valueOf(jRemoteActionCompatParcelizer), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope221.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                    lookaheadScopeKtLookaheadScope221.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(jRemoteActionCompatParcelizer);
                    return;
                }
                return;
            case 23:
                zzpg zzpgVar = (zzpg) this.write;
                zzpgVar.PlaybackStateCompat().MediaSessionCompatToken();
                zzpgVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new localLookaheadPositionOfFgt4K4Q(zzpgVar);
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = new LayoutNodeSubcompositionsStatecreateMeasurePolicy1(zzpgVar);
                layoutNodeSubcompositionsStatecreateMeasurePolicy1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = layoutNodeSubcompositionsStatecreateMeasurePolicy1;
                lookaheadScopeCoordinates lookaheadscopecoordinates = zzpgVar.PlaybackStateCompat;
                setComposedWithReusableContentHost setcomposedwithreusablecontenthostMediaDescriptionCompat = zzpgVar.MediaDescriptionCompat();
                accessgetSystemNavigationDowncp.IconCompatParcelizer(lookaheadscopecoordinates);
                setcomposedwithreusablecontenthostMediaDescriptionCompat.write = lookaheadscopecoordinates;
                setMinDurationMs setmindurationms = new setMinDurationMs(zzpgVar);
                setmindurationms.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                zzpgVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = setmindurationms;
                setContent setcontent = new setContent(zzpgVar);
                setcontent.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                zzpgVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setcontent;
                zzgz zzgzVar = new zzgz(zzpgVar, i2);
                zzgzVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                zzpgVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = zzgzVar;
                OnGloballyPositionedModifier onGloballyPositionedModifier = new OnGloballyPositionedModifier(zzpgVar);
                onGloballyPositionedModifier.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                zzpgVar.ComponentActivity = onGloballyPositionedModifier;
                zzpgVar.ResultReceiver = new getRootLookaheadDelegate(zzpgVar);
                if (zzpgVar.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != zzpgVar.accessensureViewModelStore) {
                    zzpgVar.RatingCompat().serializer.serializer("Not all upload components initialized", Integer.valueOf(zzpgVar.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28), Integer.valueOf(zzpgVar.accessensureViewModelStore));
                }
                zzpgVar.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.set(true);
                zzpgVar.RatingCompat().PlaybackStateCompat.RemoteActionCompatParcelizer("UploadController is now fully initialized");
                zzpgVar.PlaybackStateCompat().MediaSessionCompatToken();
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy2 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy2);
                layoutNodeSubcompositionsStatecreateMeasurePolicy2.MediaSessionCompatQueueItem();
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy3 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy3);
                layoutNodeSubcompositionsStatecreateMeasurePolicy3.MediaSessionCompatToken();
                layoutNodeSubcompositionsStatecreateMeasurePolicy3.ComponentActivity();
                if (layoutNodeSubcompositionsStatecreateMeasurePolicy3.MediaSessionCompatResultReceiverWrapper()) {
                    LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.onBackPressed;
                    if (((Long) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseResultReceiver = layoutNodeSubcompositionsStatecreateMeasurePolicy3.ResultReceiver();
                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        lookaheadScopeKtLookaheadScope223.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                        int iDelete = sQLiteDatabaseResultReceiver.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null))});
                        if (iDelete > 0) {
                            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                            getlookaheaddelegate2.PlaybackStateCompat.serializer(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (zzpgVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read.RemoteActionCompatParcelizer() == 0) {
                    LookaheadScopeImpl lookaheadScopeImpl = zzpgVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read;
                    ((accessgetTvInputComposite1cp) zzpgVar.ParcelableVolumeInfo()).getClass();
                    lookaheadScopeImpl.serializer(System.currentTimeMillis());
                }
                zzpgVar.MediaMetadataCompat();
                return;
            case 24:
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope224 = (LookaheadScopeKtLookaheadScope221) ((getButtonXEK5gGoQ) this.write).read;
                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.write.IconCompatParcelizer(null)).longValue());
                return;
            case 25:
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope225 = (LookaheadScopeKtLookaheadScope221) this.write;
                onLayoutRectChangeddefault onlayoutrectchangeddefault3 = lookaheadScopeKtLookaheadScope225.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                NoWindowInsetsAnimation noWindowInsetsAnimation2 = lookaheadScopeKtLookaheadScope225.ComponentActivity;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                onlayoutrectchangeddefault3.MediaSessionCompatToken();
                if (onlayoutrectchangeddefault3.MediaSessionCompatQueueItem() != 1) {
                    getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                    getlookaheaddelegate3.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("registerTrigger called but app not eligible");
                    return;
                }
                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
                noWindowInsetsAnimation2.MediaSessionCompatToken();
                maxHeight maxheight = noWindowInsetsAnimation2.PlaybackStateCompatCustomAction;
                if (maxheight != null) {
                    maxheight.IconCompatParcelizer();
                }
                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
                new Thread(new setDebounceMillis(noWindowInsetsAnimation2, i3)).start();
                return;
            case 26:
                OssLicensesActivity ossLicensesActivity = (OssLicensesActivity) this.write;
                ossLicensesActivity.IconCompatParcelizer().scrollTo(0, ossLicensesActivity.RemoteActionCompatParcelizer().getLayout().getLineTop(ossLicensesActivity.RemoteActionCompatParcelizer().getLayout().getLineForOffset(ossLicensesActivity.serializer())));
                return;
            case 27:
                onMeasuredSizeChanged onmeasuredsizechanged = (onMeasuredSizeChanged) this.write;
                synchronized (onmeasuredsizechanged.RemoteActionCompatParcelizer) {
                    PinnableContainerPinnedHandle pinnableContainerPinnedHandle = (PinnableContainerPinnedHandle) onmeasuredsizechanged.IconCompatParcelizer;
                    if (pinnableContainerPinnedHandle != null) {
                        pinnableContainerPinnedHandle.onCanceled();
                    }
                    break;
                }
                return;
            case 28:
                reuseLayer reuselayer = (reuseLayer) this.write;
                if (reuselayer.serializer()) {
                    reuselayer.write(decrementKeepScreenOnCount.Initial, Status.RatingCompat);
                    return;
                }
                return;
            default:
                FirebaseInAppMessagingDisplay.AnonymousClass4 anonymousClass4 = (FirebaseInAppMessagingDisplay.AnonymousClass4) this.write;
                FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = FirebaseInAppMessagingDisplay.this;
                effectiveBoundsInRoot effectiveboundsinroot = firebaseInAppMessagingDisplay.MediaSessionCompatResultReceiverWrapper;
                SortedSet sortedSet = anonymousClass4.read;
                Activity activity = anonymousClass4.serializer;
                SortedSet sortedSet2 = effectiveboundsinroot.serializer;
                if (sortedSet2 != null && sortedSet2.IconCompatParcelizer().isShown()) {
                    BuildersKt.write("Fiam already active. Cannot show new Fiam.");
                } else if (activity.isFinishing() || activity.isDestroyed()) {
                    BuildersKt.write("Activity is finishing or does not have valid window token. Cannot show FIAM.");
                } else {
                    getDiagonalSizeimpl getdiagonalsizeimplWrite = sortedSet.write();
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(getdiagonalsizeimplWrite.MediaSessionCompatToken.intValue(), getdiagonalsizeimplWrite.MediaBrowserCompatMediaItem.intValue(), ErrorCodes.MALFORMED_URL_EXCEPTION, getdiagonalsizeimplWrite.MediaMetadataCompat.intValue(), -3);
                    Rect rectIconCompatParcelizer = effectiveBoundsInRoot.IconCompatParcelizer(activity);
                    if ((getdiagonalsizeimplWrite.MediaDescriptionCompat.intValue() & 48) == 48) {
                        layoutParams.y = rectIconCompatParcelizer.top;
                    }
                    layoutParams.dimAmount = 0.3f;
                    layoutParams.gravity = getdiagonalsizeimplWrite.MediaDescriptionCompat.intValue();
                    layoutParams.windowAnimations = 0;
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    windowManager.addView(sortedSet.IconCompatParcelizer(), layoutParams);
                    effectiveBoundsInRoot.IconCompatParcelizer(activity);
                    BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
                    BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
                    if (sortedSet instanceof getStartXimpl) {
                        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = new PinnableContainerKtLocalPinnableContainer1(24, sortedSet);
                        sortedSet.serializer().setOnTouchListener(getdiagonalsizeimplWrite.MediaSessionCompatToken.intValue() == -1 ? new getEndYimpl(sortedSet.serializer(), pinnableContainerKtLocalPinnableContainer1) : new addDiagonalToStackimpl(sortedSet.serializer(), pinnableContainerKtLocalPinnableContainer1, layoutParams, windowManager, sortedSet));
                    }
                    effectiveboundsinroot.serializer = sortedSet;
                }
                if (sortedSet.write().IconCompatParcelizer.booleanValue()) {
                    getShouldClearDescendantSemantics getshouldcleardescendantsemantics = firebaseInAppMessagingDisplay.serializer;
                    Application application = firebaseInAppMessagingDisplay.read;
                    ViewGroup viewGroupIconCompatParcelizer = sortedSet.IconCompatParcelizer();
                    SemanticsModifierNode semanticsModifierNode = SemanticsModifierNode.TOP;
                    getshouldcleardescendantsemantics.getClass();
                    viewGroupIconCompatParcelizer.setAlpha(0.0f);
                    Point point = SemanticsModifierNode.getPoint(semanticsModifierNode, viewGroupIconCompatParcelizer);
                    viewGroupIconCompatParcelizer.animate().translationX(point.x).translationY(point.y).setDuration(1L).setListener(new ColorSpaceVerificationHelperV34(viewGroupIconCompatParcelizer, i, application));
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r0 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r3.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        o.setInflatedId.read("SequentialExecutor", "Exception while executing runnable " + r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.write     // Catch: java.lang.Throwable -> L69
            o.PreviewFreezeAfterHighSpeedRecordingQuirk r2 = (o.PreviewFreezeAfterHighSpeedRecordingQuirk) r2     // Catch: java.lang.Throwable -> L69
            java.util.ArrayDeque r2 = r2.read     // Catch: java.lang.Throwable -> L69
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L23
            java.lang.Object r1 = r9.write     // Catch: java.lang.Throwable -> L66
            o.PreviewFreezeAfterHighSpeedRecordingQuirk r1 = (o.PreviewFreezeAfterHighSpeedRecordingQuirk) r1     // Catch: java.lang.Throwable -> L66
            o.SignalEosOutputBufferNotComeQuirk r3 = r1.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L66
            o.SignalEosOutputBufferNotComeQuirk r4 = o.SignalEosOutputBufferNotComeQuirk.RUNNING     // Catch: java.lang.Throwable -> L66
            if (r3 != r4) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L43
            goto L3c
        L19:
            long r5 = r1.IconCompatParcelizer     // Catch: java.lang.Throwable -> L66
            r7 = 1
            long r5 = r5 + r7
            r1.IconCompatParcelizer = r5     // Catch: java.lang.Throwable -> L66
            r1.RemoteActionCompatParcelizer = r4     // Catch: java.lang.Throwable -> L66
            r1 = 1
        L23:
            java.lang.Object r3 = r9.write     // Catch: java.lang.Throwable -> L66
            o.PreviewFreezeAfterHighSpeedRecordingQuirk r3 = (o.PreviewFreezeAfterHighSpeedRecordingQuirk) r3     // Catch: java.lang.Throwable -> L66
            java.util.ArrayDeque r3 = r3.read     // Catch: java.lang.Throwable -> L66
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L66
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L44
            java.lang.Object r1 = r9.write     // Catch: java.lang.Throwable -> L66
            o.PreviewFreezeAfterHighSpeedRecordingQuirk r1 = (o.PreviewFreezeAfterHighSpeedRecordingQuirk) r1     // Catch: java.lang.Throwable -> L66
            o.SignalEosOutputBufferNotComeQuirk r3 = o.SignalEosOutputBufferNotComeQuirk.IDLE     // Catch: java.lang.Throwable -> L66
            r1.RemoteActionCompatParcelizer = r3     // Catch: java.lang.Throwable -> L66
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L43
        L3c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L43:
            return
        L44:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L66
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L69
            r0 = r0 | r2
            r3.run()     // Catch: java.lang.RuntimeException -> L4e java.lang.Throwable -> L69
            goto L2
        L4e:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r4.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = "Exception while executing runnable "
            r4.append(r5)     // Catch: java.lang.Throwable -> L69
            r4.append(r3)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "SequentialExecutor"
            o.setInflatedId.read(r4, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L2
        L66:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L66
            throw r1     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            if (r0 == 0) goto L73
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L73:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.zza.write():void");
    }

    public /* synthetic */ zza(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    public zza(getRootLookaheadDelegate getrootlookaheaddelegate, boolean z) {
        this.RemoteActionCompatParcelizer = 18;
        this.write = getrootlookaheaddelegate;
    }

    public zza(OnFirstVisibleNode onFirstVisibleNode) {
        this.RemoteActionCompatParcelizer = 19;
        Objects.requireNonNull(onFirstVisibleNode);
        this.write = onFirstVisibleNode;
    }

    public zza(zzpg zzpgVar, NavContext navContext) {
        this.RemoteActionCompatParcelizer = 23;
        this.write = zzpgVar;
    }
}
