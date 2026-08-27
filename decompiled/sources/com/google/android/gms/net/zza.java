package com.google.android.gms.net;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.view.PendingValue;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.emoji2.text.EmojiProcessor;
import androidx.work.impl.WorkerWrapper;
import coil3.disk.DiskLruCache$Editor;
import coil3.util.UtilsKt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zacl;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.oss.licenses.zzm;
import com.google.android.gms.signin.internal.zak;
import com.google.mlkit.common.MlKitException;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.sentry.SentryClient;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.AndroidUiFrameClockwithFrameNanos2callback1;
import o.CanvasDrawScope;
import o.DrawModifierNodeKt;
import o.Fill;
import o.GlobalPositionAwareModifierNode;
import o.IntervalTreeKt;
import o.LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1;
import o.LookaheadScopeImpl;
import o.LookaheadScopeKt;
import o.LookaheadScopeKtLookaheadScope221;
import o.LookaheadScopeKtLookaheadScope4;
import o.LookaheadScopeKtdefaultPlacementApproachInProgress1;
import o.MeasureScope;
import o.MeasureScopeMarker;
import o.NoWindowInsetsAnimation;
import o.ParentDataModifierDefaultImpls;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.StretchedVideoResolutionQuirk;
import o.VideoEncoderCrashQuirk;
import o.VideoQualityQuirk;
import o.accessdrawImageAZ2fEMsjd;
import o.accessgetNumPadLeftParenthesiscp;
import o.accessgetProgramBluecp;
import o.accessgetProgramYellowcp;
import o.accessgetScp;
import o.accessgetScrollLockcp;
import o.accessgetSystemNavigationDowncp;
import o.addHitPathQJqDSyodefault;
import o.colorResource;
import o.displayIcon;
import o.forEachui_graphics;
import o.getButtonThumbLeftEK5gGoQ;
import o.getCieXyz;
import o.getContactsEK5gGoQ;
import o.getCutEK5gGoQ;
import o.getDefaultShadowColor;
import o.getGraphicsContext;
import o.getHandwritingSlop;
import o.getLastViewport;
import o.getLookaheadDelegate;
import o.getMeasuredWidth;
import o.getNativeFilterQuality;
import o.getNativeStrokeWidth;
import o.getPageDownEK5gGoQ;
import o.getPeriodEK5gGoQ;
import o.getPoundEK5gGoQ;
import o.getQEK5gGoQ;
import o.getRightBracketEK5gGoQ;
import o.getScopeCoordinates;
import o.isComplete;
import o.isItemDismissable;
import o.mapMKHz9U;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.onLayoutRectChangeddefault;
import o.premeasure0kLqBqw;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.recordJVtK1S4default;
import o.removeNodeAtDepth;
import o.setCallback;
import o.setFrom58bKbWc;
import o.setJob;
import o.setMinFractionVisible;
import o.setScreenFlashOverlayColor;
import o.setViewportBounds;
import o.toolingGraphicsLayer;
import o.triggerCallback;
import okio.Options;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zza implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;

    public zza(NoWindowInsetsAnimation noWindowInsetsAnimation, getQEK5gGoQ getqek5ggoq) {
        this.IconCompatParcelizer = 15;
        this.RemoteActionCompatParcelizer = getqek5ggoq;
        Objects.requireNonNull(noWindowInsetsAnimation);
        this.read = noWindowInsetsAnimation;
    }

    public String toString() {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i == 1) {
            return zza.class.getSimpleName() + "," + ((VideoEncoderCrashQuirk) obj);
        }
        if (i != 25) {
            return super.toString();
        }
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        EmojiProcessor emojiProcessor = new EmojiProcessor(26, false);
        ((EmojiProcessor) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).IconCompatParcelizer = emojiProcessor;
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer = emojiProcessor;
        emojiProcessor.read = (colorResource) obj;
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:322:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        setFrom58bKbWc setfrom58bkbwc = null;
        try {
            switch (this.IconCompatParcelizer) {
                case 0:
                    Context context = (Context) this.RemoteActionCompatParcelizer;
                    ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) this.read;
                    try {
                        CronetProviderInstaller.zzc(context);
                        parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
                        return;
                    } catch (Exception e) {
                        parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(e);
                        return;
                    }
                case 1:
                    VideoEncoderCrashQuirk videoEncoderCrashQuirk = (VideoEncoderCrashQuirk) this.read;
                    try {
                        videoEncoderCrashQuirk.a_(VideoQualityQuirk.write((Future) this.RemoteActionCompatParcelizer));
                        return;
                    } catch (Error e2) {
                        e = e2;
                        videoEncoderCrashQuirk.write(e);
                        return;
                    } catch (RuntimeException e3) {
                        e = e3;
                        videoEncoderCrashQuirk.write(e);
                        return;
                    } catch (ExecutionException e4) {
                        Throwable cause = e4.getCause();
                        if (cause == null) {
                            videoEncoderCrashQuirk.write(e4);
                            return;
                        } else {
                            videoEncoderCrashQuirk.write(cause);
                            return;
                        }
                    }
                case 2:
                    try {
                        StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk = (StretchedVideoResolutionQuirk) this.read;
                        Object objIconCompatParcelizer = VideoQualityQuirk.IconCompatParcelizer((DrawModifierNodeKt) this.RemoteActionCompatParcelizer);
                        onDrawWithContent ondrawwithcontent = stretchedVideoResolutionQuirk.RatingCompat;
                        if (ondrawwithcontent != null) {
                            ondrawwithcontent.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                        }
                        break;
                    } catch (CancellationException unused) {
                        ((StretchedVideoResolutionQuirk) this.read).cancel(false);
                    } catch (ExecutionException e5) {
                        StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk2 = (StretchedVideoResolutionQuirk) this.read;
                        Throwable cause2 = e5.getCause();
                        onDrawWithContent ondrawwithcontent2 = stretchedVideoResolutionQuirk2.RatingCompat;
                        if (ondrawwithcontent2 != null) {
                            ondrawwithcontent2.serializer(cause2);
                        }
                    }
                    return;
                case 3:
                    onDrawBehind ondrawbehind = (onDrawBehind) this.RemoteActionCompatParcelizer;
                    boolean zIsCancelled = ondrawbehind.isCancelled();
                    CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.read;
                    if (zIsCancelled) {
                        cancellableContinuationImpl.serializer((Throwable) null);
                        return;
                    }
                    try {
                        cancellableContinuationImpl.resumeWith(getGraphicsContext.write((DrawModifierNodeKt) ondrawbehind));
                        return;
                    } catch (ExecutionException e6) {
                        Throwable cause3 = e6.getCause();
                        if (cause3 != null) {
                            cancellableContinuationImpl.resumeWith(new isItemDismissable(cause3));
                            return;
                        } else {
                            removeNodeAtDepth.read();
                            throw null;
                        }
                    }
                case 4:
                    PendingValue pendingValue = (PendingValue) this.RemoteActionCompatParcelizer;
                    Typeface typeface = (Typeface) this.read;
                    ResourcesCompat$FontCallback resourcesCompat$FontCallback = (ResourcesCompat$FontCallback) pendingValue.serializer;
                    if (resourcesCompat$FontCallback != null) {
                        resourcesCompat$FontCallback.onFontRetrieved(typeface);
                        return;
                    }
                    return;
                case 5:
                    ((setScreenFlashOverlayColor) this.RemoteActionCompatParcelizer).accept(this.read);
                    return;
                case 6:
                    getNativeFilterQuality getnativefilterquality = (getNativeFilterQuality) this.read;
                    Object obj = this.RemoteActionCompatParcelizer;
                    boolean z = getnativefilterquality.serializer.get();
                    zzm zzmVar = getnativefilterquality.MediaSessionCompatQueueItem;
                    if (z) {
                        if (zzmVar.serializer == getnativefilterquality) {
                            SystemClock.uptimeMillis();
                            zzmVar.serializer = null;
                            zzmVar.write();
                        }
                    } else if (zzmVar.PlaybackStateCompat != getnativefilterquality) {
                        if (zzmVar.serializer == getnativefilterquality) {
                            SystemClock.uptimeMillis();
                            zzmVar.serializer = null;
                            zzmVar.write();
                        }
                    } else if (!zzmVar.IconCompatParcelizer) {
                        SystemClock.uptimeMillis();
                        zzmVar.PlaybackStateCompat = null;
                        if (zzmVar.read != 0) {
                            zzmVar.serializer(obj);
                        } else {
                            List list = (List) obj;
                            zzmVar.MediaSessionCompatResultReceiverWrapper = list;
                            zzmVar.serializer(list);
                        }
                    }
                    getnativefilterquality.RemoteActionCompatParcelizer = getNativeStrokeWidth.FINISHED;
                    return;
                case 7:
                    getDefaultShadowColor getdefaultshadowcolor = ((IntervalTreeKt) this.read).MediaBrowserCompatMediaItem.MediaMetadataCompat;
                    String str = (String) this.RemoteActionCompatParcelizer;
                    synchronized (getdefaultshadowcolor.MediaMetadataCompat) {
                        WorkerWrapper workerWrapperWrite = getdefaultshadowcolor.write(str);
                        if (workerWrapperWrite != null) {
                            setfrom58bkbwc = workerWrapperWrite.MediaSessionCompatQueueItem;
                        }
                    }
                    if (setfrom58bkbwc != null) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{toolingGraphicsLayer.IconCompatParcelizer, setfrom58bkbwc.read}, getCieXyz.write())).booleanValue()) {
                            return;
                        }
                        synchronized (((IntervalTreeKt) this.read).MediaDescriptionCompat) {
                            ((IntervalTreeKt) this.read).MediaSessionCompatQueueItem.put((mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), new Object[]{setfrom58bkbwc}, MaybeObserveOn.write()), setfrom58bkbwc);
                            IntervalTreeKt intervalTreeKt = (IntervalTreeKt) this.read;
                            ((IntervalTreeKt) this.read).RatingCompat.put((mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), new Object[]{setfrom58bkbwc}, MaybeObserveOn.write()), forEachui_graphics.serializer(intervalTreeKt.serializer, setfrom58bkbwc, intervalTreeKt.MediaMetadataCompat.serializer, intervalTreeKt));
                            break;
                        }
                        return;
                    }
                    return;
                case 8:
                    CanvasDrawScope canvasDrawScope = (CanvasDrawScope) this.read;
                    if (canvasDrawScope.read) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        ((Runnable) this.RemoteActionCompatParcelizer).run();
                        return;
                    } catch (Throwable th) {
                        canvasDrawScope.write.getClass();
                        if (Log.isLoggable("GlideExecutor", 6)) {
                            SentryLogcatAdapter.read("GlideExecutor", "Request threw uncaught throwable", th);
                            return;
                        }
                        return;
                    }
                case 9:
                    accessdrawImageAZ2fEMsjd accessdrawimageaz2femsjdSerializer = accessdrawImageAZ2fEMsjd.serializer();
                    accessdrawimageaz2femsjdSerializer.getClass();
                    Fill.serializer();
                    accessdrawimageaz2femsjdSerializer.MediaDescriptionCompat.set(true);
                    ((recordJVtK1S4default) this.read).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer = true;
                    ((recordJVtK1S4default) this.read).read.getViewTreeObserver().removeOnDrawListener((recordJVtK1S4default) this.RemoteActionCompatParcelizer);
                    ((recordJVtK1S4default) this.read).RemoteActionCompatParcelizer.write.clear();
                    return;
                case 10:
                    zacl zaclVar = (zacl) this.read;
                    zak zakVar = (zak) this.RemoteActionCompatParcelizer;
                    zaclVar.getClass();
                    ConnectionResult connectionResult = zakVar.write;
                    if (connectionResult.read()) {
                        zaaa zaaaVar = zakVar.IconCompatParcelizer;
                        accessgetSystemNavigationDowncp.IconCompatParcelizer(zaaaVar);
                        ConnectionResult connectionResult2 = zaaaVar.serializer;
                        if (!connectionResult2.read()) {
                            SentryLogcatAdapter.IconCompatParcelizer("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                            zaclVar.MediaMetadataCompat.serializer(connectionResult2);
                            zaclVar.MediaSessionCompatQueueItem.serializer();
                            return;
                        }
                        SentryClient sentryClient = zaclVar.MediaMetadataCompat;
                        accessgetScrollLockcp accessgetscrolllockcpIconCompatParcelizer = zaaaVar.IconCompatParcelizer();
                        Set set = zaclVar.serializer;
                        sentryClient.getClass();
                        if (accessgetscrolllockcpIconCompatParcelizer == null || set == null) {
                            SentryLogcatAdapter.IconCompatParcelizer("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            sentryClient.serializer(new ConnectionResult(4, null, null));
                        } else {
                            sentryClient.MediaDescriptionCompat = accessgetscrolllockcpIconCompatParcelizer;
                            sentryClient.write = set;
                            if (sentryClient.IconCompatParcelizer) {
                                ((accessgetScp) sentryClient.RemoteActionCompatParcelizer).IconCompatParcelizer(accessgetscrolllockcpIconCompatParcelizer, set);
                            }
                        }
                    } else {
                        zaclVar.MediaMetadataCompat.serializer(connectionResult);
                    }
                    zaclVar.MediaSessionCompatQueueItem.serializer();
                    return;
                case 11:
                    zap zapVar = (zap) this.read;
                    if (zapVar.write) {
                        accessgetProgramBluecp accessgetprogrambluecp = (accessgetProgramBluecp) this.RemoteActionCompatParcelizer;
                        ConnectionResult connectionResult3 = accessgetprogrambluecp.serializer;
                        int i = connectionResult3.IconCompatParcelizer;
                        GoogleApiAvailability googleApiAvailability = zapVar.MediaDescriptionCompat;
                        if (!googleApiAvailability.zaj(i)) {
                            SentryLogcatAdapter.IconCompatParcelizer("BaseLifecycleHelper", "Not showing dialog since ConnectionResult is not user-facing: ".concat(String.valueOf(connectionResult3)));
                            zapVar.RemoteActionCompatParcelizer(connectionResult3, accessgetprogrambluecp.read);
                            return;
                        }
                        if (connectionResult3.IconCompatParcelizer != 0 && connectionResult3.serializer != null) {
                            accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp = zapVar.read;
                            Activity activityWrite = zapVar.write();
                            PendingIntent pendingIntent = connectionResult3.serializer;
                            accessgetSystemNavigationDowncp.IconCompatParcelizer(pendingIntent);
                            accessgetnumpadleftparenthesiscp.startActivityForResult(GoogleApiActivity.write(activityWrite, pendingIntent, accessgetprogrambluecp.read, false), 1);
                            return;
                        }
                        if (googleApiAvailability.getErrorResolutionIntent(zapVar.write(), connectionResult3.IconCompatParcelizer, null) != null) {
                            googleApiAvailability.zab(zapVar.write(), zapVar.read, connectionResult3.IconCompatParcelizer, 2, zapVar);
                            googleApiAvailability.zae(zapVar.write().getApplicationContext(), connectionResult3, true);
                            return;
                        } else if (connectionResult3.IconCompatParcelizer != 18) {
                            zapVar.RemoteActionCompatParcelizer(connectionResult3, accessgetprogrambluecp.read);
                            return;
                        } else {
                            googleApiAvailability.zag(zapVar.write().getApplicationContext(), new accessgetProgramYellowcp(this, googleApiAvailability.zaf(zapVar.write(), zapVar)));
                            googleApiAvailability.zae(zapVar.write().getApplicationContext(), connectionResult3, true);
                            return;
                        }
                    }
                    return;
                case 12:
                    Uri uri = (Uri) this.RemoteActionCompatParcelizer;
                    "Preview requested to uri ".concat(String.valueOf(uri));
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    getContactsEK5gGoQ getcontactsek5ggoq = (getContactsEK5gGoQ) this.read;
                    synchronized (getcontactsek5ggoq.MediaSessionCompatQueueItem) {
                        if (getcontactsek5ggoq.MediaSessionCompatResultReceiverWrapper == 2) {
                            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                            getcontactsek5ggoq.PlaybackStateCompat.add(this);
                            return;
                        }
                        String str2 = (String) getcontactsek5ggoq.serializer().first;
                        if (str2 == null) {
                            getButtonThumbLeftEK5gGoQ.serializer("Preview failed (no container found)");
                            return;
                        }
                        if (!getcontactsek5ggoq.MediaMetadataCompat.read(uri, str2)) {
                            getButtonThumbLeftEK5gGoQ.serializer("Cannot preview the app with the uri: " + String.valueOf(uri) + ". Launching current version instead.");
                            return;
                        }
                        if (!getcontactsek5ggoq.PlaybackStateCompatCustomAction) {
                            String.valueOf(uri);
                            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                            return;
                        }
                        String.valueOf(uri);
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        getCutEK5gGoQ getcutek5ggoq = getcontactsek5ggoq.RemoteActionCompatParcelizer;
                        if (getcutek5ggoq.IconCompatParcelizer()) {
                            try {
                                getcutek5ggoq.read.IconCompatParcelizer();
                                getcontactsek5ggoq.PlaybackStateCompatCustomAction = false;
                                getcontactsek5ggoq.MediaSessionCompatResultReceiverWrapper = 1;
                                getcontactsek5ggoq.write();
                                return;
                            } catch (RemoteException e7) {
                                getButtonThumbLeftEK5gGoQ.read("Error in resetting service", e7);
                            }
                        }
                        getButtonThumbLeftEK5gGoQ.serializer("Failed to reset TagManager service for preview");
                        return;
                    }
                case 13:
                    getScopeCoordinates getscopecoordinates = (getScopeCoordinates) this.read;
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = getscopecoordinates.serializer.RemoteActionCompatParcelizer;
                    LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                    lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
                    Bundle bundle = new Bundle();
                    bundle.putString("package_name", getscopecoordinates.write);
                    try {
                        getPoundEK5gGoQ getpoundek5ggoq = (getPoundEK5gGoQ) ((getPeriodEK5gGoQ) this.RemoteActionCompatParcelizer);
                        Parcel parcelSerializer = getpoundek5ggoq.serializer();
                        getPageDownEK5gGoQ.read(parcelSerializer, bundle);
                        Parcel parcelSerializer2 = getpoundek5ggoq.serializer(1, parcelSerializer);
                        Bundle bundle2 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcelSerializer2, Bundle.CREATOR);
                        parcelSerializer2.recycle();
                        if (bundle2 == null) {
                            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Install Referrer Service returned a null response");
                        }
                        break;
                    } catch (Exception e8) {
                        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                        getlookaheaddelegate2.serializer.serializer(e8.getMessage(), "Exception occurred while retrieving the Install Referrer");
                    }
                    LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
                    lookaheadScopeKtLookaheadScope5.MediaSessionCompatToken();
                    throw new IllegalStateException("Unexpected call on client side");
                case 14:
                    LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) this.read;
                    lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
                    zzah zzahVar = (zzah) this.RemoteActionCompatParcelizer;
                    Object objIconCompatParcelizer2 = zzahVar.serializer.IconCompatParcelizer();
                    zzpg zzpgVar = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
                    if (objIconCompatParcelizer2 == null) {
                        zzpgVar.getClass();
                        String str3 = zzahVar.RemoteActionCompatParcelizer;
                        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str3);
                        zzr zzrVarIconCompatParcelizer = zzpgVar.IconCompatParcelizer(str3);
                        if (zzrVarIconCompatParcelizer != null) {
                            zzpgVar.write(zzahVar, zzrVarIconCompatParcelizer);
                            return;
                        }
                        return;
                    }
                    zzpgVar.getClass();
                    String str4 = zzahVar.RemoteActionCompatParcelizer;
                    accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str4);
                    zzr zzrVarIconCompatParcelizer2 = zzpgVar.IconCompatParcelizer(str4);
                    if (zzrVarIconCompatParcelizer2 != null) {
                        zzpgVar.read(zzahVar, zzrVarIconCompatParcelizer2);
                        return;
                    }
                    return;
                case 15:
                    getQEK5gGoQ getqek5ggoq = (getQEK5gGoQ) this.RemoteActionCompatParcelizer;
                    NoWindowInsetsAnimation noWindowInsetsAnimation = (NoWindowInsetsAnimation) this.read;
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    triggerCallback triggercallback = lookaheadScopeKtLookaheadScope222.MediaSessionCompatToken;
                    LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope224 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope224.PlaybackStateCompatCustomAction;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
                    if (lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
                        LookaheadScopeImpl lookaheadScopeImpl = lookaheadScopeKt.PlaybackStateCompat;
                        lookaheadScopeKtLookaheadScope224.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                        if (!lookaheadScopeKt.serializer(System.currentTimeMillis()) && lookaheadScopeImpl.RemoteActionCompatParcelizer() != 0) {
                            lValueOf = Long.valueOf(lookaheadScopeImpl.RemoteActionCompatParcelizer());
                        }
                        if (lValueOf == null) {
                            onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope223.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                            onlayoutrectchangeddefault.write(getqek5ggoq, lValueOf.longValue());
                            return;
                        } else {
                            try {
                                getqek5ggoq.RemoteActionCompatParcelizer(null);
                                return;
                            } catch (RemoteException e9) {
                                getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                getlookaheaddelegate3.serializer.serializer(e9, "getSessionId failed with exception");
                                return;
                            }
                        }
                    }
                    getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope224.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.RatingCompat.RemoteActionCompatParcelizer("Analytics storage consent denied; will not get session id");
                    lValueOf = null;
                    if (lValueOf == null) {
                        getqek5ggoq.RemoteActionCompatParcelizer(null);
                        return;
                    }
                    onLayoutRectChangeddefault onlayoutrectchangeddefault2 = lookaheadScopeKtLookaheadScope223.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
                    onlayoutrectchangeddefault2.write(getqek5ggoq, lValueOf.longValue());
                    return;
                case 16:
                    ((NoWindowInsetsAnimation) this.read).IconCompatParcelizer((Boolean) this.RemoteActionCompatParcelizer, true);
                    return;
                case 17:
                    NoWindowInsetsAnimation noWindowInsetsAnimation2 = (NoWindowInsetsAnimation) this.read;
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope225 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope225.PlaybackStateCompatCustomAction;
                    getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
                    lookaheadScopeKt2.MediaSessionCompatToken();
                    lookaheadScopeKt2.MediaSessionCompatToken();
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1IconCompatParcelizer = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.IconCompatParcelizer(lookaheadScopeKt2.serializer().getString("dma_consent_settings", null));
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 = (LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1) this.RemoteActionCompatParcelizer;
                    int i2 = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.read;
                    if (!getMeasuredWidth.serializer(i2, layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1IconCompatParcelizer.read)) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                        getlookaheaddelegate5.MediaMetadataCompat.serializer(Integer.valueOf(i2), "Lower precedence consent source ignored, proposed source");
                        return;
                    }
                    SharedPreferences.Editor editorEdit = lookaheadScopeKt2.serializer().edit();
                    editorEdit.putString("dma_consent_settings", layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write);
                    editorEdit.apply();
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                    getlookaheaddelegate5.PlaybackStateCompat.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1, "Setting DMA consent(FE)");
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope226 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    if (lookaheadScopeKtLookaheadScope226.MediaDescriptionCompat().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) {
                        setViewportBounds setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope226.MediaDescriptionCompat();
                        setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
                        setviewportboundsMediaDescriptionCompat.serializer();
                        setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new setJob(setviewportboundsMediaDescriptionCompat, 1 == true ? 1 : 0));
                        return;
                    }
                    setViewportBounds setviewportboundsMediaDescriptionCompat2 = lookaheadScopeKtLookaheadScope226.MediaDescriptionCompat();
                    setviewportboundsMediaDescriptionCompat2.MediaSessionCompatToken();
                    setviewportboundsMediaDescriptionCompat2.serializer();
                    if (setviewportboundsMediaDescriptionCompat2.ResultReceiver()) {
                        setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer((Runnable) new getLastViewport(setviewportboundsMediaDescriptionCompat2, setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer(false)));
                        return;
                    }
                    return;
                case 18:
                    NoWindowInsetsAnimation noWindowInsetsAnimation3 = ((AppMeasurementDynamiteService) this.read).zza.ComponentActivity;
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation3);
                    noWindowInsetsAnimation3.write((MeasureScopeMarker) this.RemoteActionCompatParcelizer);
                    return;
                case 19:
                    setCallback setcallback = (setCallback) this.read;
                    synchronized (setcallback) {
                        setcallback.read = false;
                        setViewportBounds setviewportbounds = setcallback.serializer;
                        if (!setviewportbounds.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()) {
                            getLookaheadDelegate getlookaheaddelegate6 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                            getlookaheaddelegate6.PlaybackStateCompat.RemoteActionCompatParcelizer("Connected to service");
                            isComplete iscomplete = (isComplete) this.RemoteActionCompatParcelizer;
                            setviewportbounds.MediaSessionCompatToken();
                            setviewportbounds.write = iscomplete;
                            setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            setviewportbounds.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                        }
                        break;
                    }
                    return;
                case 20:
                    ((setCallback) this.read).serializer.serializer((ComponentName) this.RemoteActionCompatParcelizer);
                    return;
                case 21:
                    setViewportBounds setviewportbounds2 = ((setCallback) this.read).serializer;
                    setviewportbounds2.write = null;
                    if (((ConnectionResult) this.RemoteActionCompatParcelizer).IconCompatParcelizer != 7777) {
                        setviewportbounds2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                        return;
                    }
                    if (setviewportbounds2.MediaDescriptionCompat == null) {
                        setviewportbounds2.MediaDescriptionCompat = Executors.newScheduledThreadPool(1);
                    }
                    setviewportbounds2.MediaDescriptionCompat.schedule(new com.google.android.gms.stats.zza(21, this), ((Long) premeasure0kLqBqw.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.IconCompatParcelizer(null)).longValue(), TimeUnit.MILLISECONDS);
                    return;
                case 22:
                    zzpg zzpgVar2 = (zzpg) this.RemoteActionCompatParcelizer;
                    zzpgVar2.serializer();
                    Runnable runnable = (Runnable) this.read;
                    zzpgVar2.PlaybackStateCompat().MediaSessionCompatToken();
                    if (zzpgVar2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == null) {
                        zzpgVar2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new ArrayList();
                    }
                    zzpgVar2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.add(runnable);
                    zzpgVar2.RemoteActionCompatParcelizer();
                    return;
                case 23:
                    ((setMinFractionVisible) ((Service) ((PinnableContainerKtLocalPinnableContainer1) this.RemoteActionCompatParcelizer).serializer)).RemoteActionCompatParcelizer((JobParameters) this.read);
                    return;
                case 24:
                    try {
                        ((getRightBracketEK5gGoQ) this.read).IconCompatParcelizer();
                        return;
                    } catch (RemoteException e10) {
                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = ((AppMeasurementDynamiteService) this.RemoteActionCompatParcelizer).zza;
                        accessgetSystemNavigationDowncp.IconCompatParcelizer(lookaheadScopeKtLookaheadScope227);
                        getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                        getlookaheaddelegate7.MediaSessionCompatQueueItem.serializer(e10, "Failed to call IDynamiteUploadBatchesCallback");
                        return;
                    }
                case 25:
                    colorResource colorresource = (colorResource) this.read;
                    try {
                        GlobalPositionAwareModifierNode.IconCompatParcelizer((DrawModifierNodeKt) this.RemoteActionCompatParcelizer);
                        NoWindowInsetsAnimation noWindowInsetsAnimation4 = (NoWindowInsetsAnimation) colorresource.write;
                        noWindowInsetsAnimation4.MediaSessionCompatToken();
                        colorresource.read();
                        noWindowInsetsAnimation4.MediaSessionCompatQueueItem = false;
                        noWindowInsetsAnimation4.PlaybackStateCompat = 1;
                        getLookaheadDelegate getlookaheaddelegate8 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate8);
                        getlookaheaddelegate8.MediaSessionCompatToken.serializer(((zzoh) colorresource.IconCompatParcelizer).serializer, "Successfully registered trigger URI");
                        noWindowInsetsAnimation4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        return;
                    } catch (Error e11) {
                        e = e11;
                        colorresource.write(e);
                        return;
                    } catch (RuntimeException e12) {
                        e = e12;
                        colorresource.write(e);
                        return;
                    } catch (ExecutionException e13) {
                        colorresource.write(e13.getCause());
                        return;
                    }
                case 26:
                    ReferenceQueue referenceQueue = (ReferenceQueue) this.RemoteActionCompatParcelizer;
                    while (!((Set) this.read).isEmpty()) {
                        try {
                            getHandwritingSlop gethandwritingslop = (getHandwritingSlop) referenceQueue.remove();
                            if (gethandwritingslop.write.remove(gethandwritingslop)) {
                                gethandwritingslop.clear();
                                gethandwritingslop.IconCompatParcelizer.getClass();
                            }
                        } catch (InterruptedException unused2) {
                        }
                    }
                    return;
                case 27:
                    Callable callable = (Callable) this.RemoteActionCompatParcelizer;
                    ParentDataModifierDefaultImpls parentDataModifierDefaultImpls2 = (ParentDataModifierDefaultImpls) this.read;
                    try {
                        parentDataModifierDefaultImpls2.IconCompatParcelizer(callable.call());
                        return;
                    } catch (MlKitException e14) {
                        parentDataModifierDefaultImpls2.RemoteActionCompatParcelizer(e14);
                        return;
                    } catch (Exception e15) {
                        parentDataModifierDefaultImpls2.RemoteActionCompatParcelizer(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e15));
                        return;
                    }
                case 28:
                    AndroidUiFrameClockwithFrameNanos2callback1 androidUiFrameClockwithFrameNanos2callback1 = (AndroidUiFrameClockwithFrameNanos2callback1) this.RemoteActionCompatParcelizer;
                    ParentDataModifierDefaultImpls parentDataModifierDefaultImpls3 = (ParentDataModifierDefaultImpls) this.read;
                    int iDecrementAndGet = ((AtomicInteger) androidUiFrameClockwithFrameNanos2callback1.RemoteActionCompatParcelizer).decrementAndGet();
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        androidUiFrameClockwithFrameNanos2callback1.read();
                        ((AtomicBoolean) androidUiFrameClockwithFrameNanos2callback1.IconCompatParcelizer).set(false);
                    }
                    addHitPathQJqDSyodefault.read.clear();
                    displayIcon.serializer.clear();
                    parentDataModifierDefaultImpls3.IconCompatParcelizer((Object) null);
                    return;
                default:
                    DiskLruCache$Editor diskLruCache$Editor = (DiskLruCache$Editor) this.RemoteActionCompatParcelizer;
                    AtomicReference atomicReference = (AtomicReference) diskLruCache$Editor.serializer;
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
                    try {
                        ((Runnable) this.read).run();
                        atomicReference.set(null);
                        diskLruCache$Editor.IconCompatParcelizer();
                        return;
                    } catch (Throwable th2) {
                        try {
                            atomicReference.set(null);
                            diskLruCache$Editor.IconCompatParcelizer();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
            }
        } finally {
            ((StretchedVideoResolutionQuirk) this.read).read = null;
        }
        ((StretchedVideoResolutionQuirk) this.read).read = null;
    }

    public /* synthetic */ zza(Object obj, Object obj2, boolean z, int i) {
        this.IconCompatParcelizer = i;
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    public zza(getScopeCoordinates getscopecoordinates, getPeriodEK5gGoQ getperiodek5ggoq, getScopeCoordinates getscopecoordinates2) {
        this.IconCompatParcelizer = 13;
        this.RemoteActionCompatParcelizer = getperiodek5ggoq;
        this.read = getscopecoordinates;
    }

    public /* synthetic */ zza(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
    }

    public zza(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1, zzpg zzpgVar, Runnable runnable) {
        this.IconCompatParcelizer = 22;
        this.RemoteActionCompatParcelizer = zzpgVar;
        this.read = runnable;
    }
}
