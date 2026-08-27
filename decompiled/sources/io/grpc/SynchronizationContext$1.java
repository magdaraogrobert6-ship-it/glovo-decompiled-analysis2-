package io.grpc;

import android.app.Activity;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.BlockRunner;
import com.adjust.sdk.Constants;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.net.zza;
import com.google.android.gms.tasks.zzw;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.AnonymousClass4;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.mlkit.vision.face.internal.zzh;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.location.logic.zp;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.reactivex.internal.operators.completable.CompletableFromAction;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.RandomAccess;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;
import kotlinx.coroutines.BuildersKt;
import o.BeyondBoundsLayoutProviderModifierNode;
import o.CanvasDrawScopeKtasDrawTransform1;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultIntrinsicMeasurable;
import o.DepthSortedSet;
import o.IAction;
import o.ImageVectorCacheImageVectorEntry;
import o.JsonUtilsc;
import o.LayoutNodeSubcompositionsStatecreateMeasurePolicy1;
import o.LookaheadDelegateKt;
import o.LookaheadScopeKt;
import o.LookaheadScopeKtLookaheadScope221;
import o.LookaheadScopeKtdefaultPlacementApproachInProgress1;
import o.MeasureScope;
import o.Measured;
import o.NoWindowInsetsAnimation;
import o.OnFirstVisibleModifierKt;
import o.OnLayoutRectChangedModifierKt;
import o.OwnerSnapshotObserveronCommitAffectingLookahead1;
import o.ParentDataModifierDefaultImpls;
import o.ParentDataModifierNode;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.SortedSet;
import o.TraversableNodeKt;
import o.UriAction;
import o.ViewRootForInspector;
import o._init_lambda0;
import o.accessapplyPausedPrecomposition;
import o.accessgetCurrentApproachIndexp;
import o.accessgetNinecp;
import o.accessgetNumPadMoveEndcp;
import o.accessgetProgramGreencp;
import o.accessgetRootp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputComposite1cp;
import o.accessgetTvTeletextcp;
import o.computeFillWidthiLBOSCw;
import o.createComposition;
import o.delegateUnprotectedui;
import o.didUpdate;
import o.drawPointsF8ZwMP8default;
import o.drawyzxVdVo;
import o.getAbovehoxUOeE;
import o.getBeyondBoundsLayout;
import o.getCallback;
import o.getChannel;
import o.getComposeViewContextui;
import o.getDebounceMillis;
import o.getEndXimpl;
import o.getFillWidthannotations;
import o.getFontLoaderannotations;
import o.getLambda641200809ui;
import o.getLookaheadDelegate;
import o.getMethodQuietlylambda1;
import o.getNumPadDivideEK5gGoQ;
import o.getQEK5gGoQ;
import o.getScaledHandwritingGestureLineMargin;
import o.getSelectionEndui_text;
import o.getShowLayoutBoundsannotations;
import o.getUseMinimumTouchTarget;
import o.hasTooManyZipEntrieslambda0;
import o.internalOnLayoutui;
import o.internalOnMeasureui;
import o.invokeMethodQuietlylambda0;
import o.isComplete;
import o.isTransitionGroup;
import o.lookaheadScopeCoordinates;
import o.modulate5vOe2sY;
import o.onAttachedToWindow;
import o.onLayoutRectChangeddefault;
import o.onRtlPropertiesChanged;
import o.optEnum;
import o.place;
import o.r8lambdaEBRBRotzagevF6hg_eSqZ9I4TM;
import o.r8lambdaI9S4Oy4uvsJFCZpX9_LGbxS5mDc;
import o.r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;
import o.r8lambdacc83FJQHWm1yiSXE4POrRGeuxZ0;
import o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc;
import o.r8lambdavFH2wnCVQAlDYBWQ6fWDFNezEDs;
import o.resetFocus3ESFkO8;
import o.resetLayoutState;
import o.scale0AR0LA0default;
import o.selectPaint;
import o.sendKeyEventZmokQxo;
import o.setMinFractionVisible;
import o.setResourcePackageNamelambda0;
import o.setScreenFlashOverlayColor;
import o.setViewportBounds;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class SynchronizationContext$1 implements Runnable {
    public Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public Object serializer;
    public Object write;

    public /* synthetic */ SynchronizationContext$1(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.read = i;
        this.write = obj2;
        this.IconCompatParcelizer = obj3;
        this.serializer = obj;
    }

    private final void RemoteActionCompatParcelizer() {
        onLayoutRectChangeddefault onlayoutrectchangeddefault;
        getQEK5gGoQ getqek5ggoq = (getQEK5gGoQ) this.IconCompatParcelizer;
        setViewportBounds setviewportbounds = (setViewportBounds) this.serializer;
        String strSerializer = null;
        try {
            try {
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
                if (lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
                    isComplete iscomplete = setviewportbounds.write;
                    if (iscomplete != null) {
                        strSerializer = iscomplete.serializer((zzr) this.write);
                        if (strSerializer != null) {
                            NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope221.ComponentActivity;
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            noWindowInsetsAnimation.MediaMetadataCompat.set(strSerializer);
                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
                            lookaheadScopeKt.RemoteActionCompatParcelizer.IconCompatParcelizer(strSerializer);
                        }
                        setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                        onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                        onlayoutrectchangeddefault.read(strSerializer, getqek5ggoq);
                    }
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to get app instance id");
                } else {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.RatingCompat.RemoteActionCompatParcelizer("Analytics storage consent denied; will not get app instance id");
                    NoWindowInsetsAnimation noWindowInsetsAnimation2 = lookaheadScopeKtLookaheadScope221.ComponentActivity;
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
                    noWindowInsetsAnimation2.MediaMetadataCompat.set(null);
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
                    lookaheadScopeKt.RemoteActionCompatParcelizer.IconCompatParcelizer(null);
                }
                onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            } catch (RemoteException e) {
                getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer(e, "Failed to get app instance id");
            }
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            onlayoutrectchangeddefault.read(strSerializer, getqek5ggoq);
        } catch (Throwable th) {
            onLayoutRectChangeddefault onlayoutrectchangeddefault2 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
            onlayoutrectchangeddefault2.read((String) null, getqek5ggoq);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [o.SortedSet] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay$2] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay$3] */
    /* JADX WARN: Type inference failed for: r8v9 */
    private final void write() {
        onAttachedToWindow onattachedtowindowWrite;
        ?? r8;
        final FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = (FirebaseInAppMessagingDisplay) this.serializer;
        final Activity activity = (Activity) this.write;
        ?? r3 = (SortedSet) this.IconCompatParcelizer;
        if (firebaseInAppMessagingDisplay.MediaBrowserCompatMediaItem == null) {
            return;
        }
        ?? r4 = new View.OnClickListener() { // from class: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.2
            public final /* synthetic */ Activity read;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay2 = FirebaseInAppMessagingDisplay.this;
                OwnerSnapshotObserveronCommitAffectingLookahead1 ownerSnapshotObserveronCommitAffectingLookahead1 = firebaseInAppMessagingDisplay2.IconCompatParcelizer;
                if (ownerSnapshotObserveronCommitAffectingLookahead1 != null) {
                    ((DisplayCallbacksImpl) ownerSnapshotObserveronCommitAffectingLookahead1).IconCompatParcelizer(ParentDataModifierNode.CLICK);
                }
                int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
                int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
                BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
                firebaseInAppMessagingDisplay2.IconCompatParcelizer(activity);
                firebaseInAppMessagingDisplay2.MediaBrowserCompatMediaItem = null;
                firebaseInAppMessagingDisplay2.IconCompatParcelizer = null;
            }

            public AnonymousClass2() {
                activity = activity;
            }
        };
        HashMap map = new HashMap();
        internalOnMeasureui internalonmeasureui = firebaseInAppMessagingDisplay.MediaBrowserCompatMediaItem;
        ArrayList<createComposition> arrayList = new ArrayList();
        int i = sendKeyEventZmokQxo.write[internalonmeasureui.MediaBrowserCompatMediaItem.ordinal()];
        if (i == 1) {
            arrayList.add(((getComposeViewContextui) internalonmeasureui).serializer);
        } else if (i == 2) {
            arrayList.add(((onRtlPropertiesChanged) internalonmeasureui).read);
        } else if (i == 3) {
            arrayList.add(((internalOnLayoutui) internalonmeasureui).RemoteActionCompatParcelizer);
        } else if (i != 4) {
            arrayList.add(new createComposition(null, null));
        } else {
            isTransitionGroup istransitiongroup = (isTransitionGroup) internalonmeasureui;
            arrayList.add(istransitiongroup.IconCompatParcelizer);
            arrayList.add(istransitiongroup.MediaMetadataCompat);
        }
        for (final createComposition createcomposition : arrayList) {
            if (createcomposition == null || TextUtils.isEmpty(createcomposition.RemoteActionCompatParcelizer)) {
                Log.isLoggable("FIAM.Display", 4);
                r8 = r4;
            } else {
                r8 = new View.OnClickListener() { // from class: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.3
                    public final /* synthetic */ createComposition IconCompatParcelizer;
                    public final /* synthetic */ Activity read;

                    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Intent intent;
                        ResolveInfo resolveInfoResolveActivity;
                        String scheme;
                        createComposition createcomposition2 = createcomposition;
                        String str = createcomposition2.RemoteActionCompatParcelizer;
                        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay2 = FirebaseInAppMessagingDisplay.this;
                        if (firebaseInAppMessagingDisplay2.IconCompatParcelizer != null) {
                            Log.isLoggable("FIAM.Display", 4);
                            DisplayCallbacksImpl displayCallbacksImpl = (DisplayCallbacksImpl) firebaseInAppMessagingDisplay2.IconCompatParcelizer;
                            if (!((zzbv) displayCallbacksImpl.serializer).write()) {
                                displayCallbacksImpl.IconCompatParcelizer("message click to metrics logger");
                            } else if (str == null) {
                                displayCallbacksImpl.IconCompatParcelizer(ParentDataModifierNode.CLICK);
                            } else {
                                DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
                                CompletableFromAction completableFromAction = new CompletableFromAction(new TraversableNodeKt(displayCallbacksImpl, createcomposition2));
                                if (!displayCallbacksImpl.MediaSessionCompatQueueItem) {
                                    displayCallbacksImpl.serializer();
                                }
                                DisplayCallbacksImpl.serializer(completableFromAction.serializer(), ((getShowLayoutBoundsannotations) displayCallbacksImpl.MediaDescriptionCompat).IconCompatParcelizer);
                            }
                        }
                        Uri uri = Uri.parse(str);
                        Activity activity2 = activity;
                        if (uri == null || (scheme = uri.getScheme()) == null || (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase(Constants.SCHEME))) {
                            intent = new Intent("android.intent.action.VIEW", uri);
                            resolveInfoResolveActivity = activity2.getPackageManager().resolveActivity(intent, 0);
                            intent.addFlags(1073741824);
                            intent.addFlags(268435456);
                            if (resolveInfoResolveActivity != null) {
                                activity2.startActivity(intent);
                            } else {
                                BuildersKt.write("Device cannot resolve intent for: android.intent.action.VIEW");
                            }
                        } else {
                            Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                            intent2.setPackage("com.android.chrome");
                            List<ResolveInfo> listQueryIntentServices = activity2.getPackageManager().queryIntentServices(intent2, 0);
                            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                intent = new Intent("android.intent.action.VIEW", uri);
                                resolveInfoResolveActivity = activity2.getPackageManager().resolveActivity(intent, 0);
                                intent.addFlags(1073741824);
                                intent.addFlags(268435456);
                                if (resolveInfoResolveActivity != null) {
                                    activity2.startActivity(intent);
                                } else {
                                    BuildersKt.write("Device cannot resolve intent for: android.intent.action.VIEW");
                                }
                            } else {
                                Intent intent3 = new Intent("android.intent.action.VIEW");
                                if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                                    intent3.putExtras(bundle);
                                }
                                intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                intent3.putExtras(new Bundle());
                                intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                                intent3.addFlags(1073741824);
                                intent3.addFlags(268435456);
                                intent3.setData(uri);
                                activity2.startActivity(intent3, null);
                            }
                        }
                        firebaseInAppMessagingDisplay2.IconCompatParcelizer(activity2);
                        firebaseInAppMessagingDisplay2.MediaBrowserCompatMediaItem = null;
                        firebaseInAppMessagingDisplay2.IconCompatParcelizer = null;
                    }

                    public AnonymousClass3() {
                        createcomposition = createcomposition;
                        activity = activity;
                    }
                };
            }
            map.put(createcomposition, r8);
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerWrite = r3.write(map, r4);
        if (onGlobalLayoutListenerWrite != null) {
            r3.RemoteActionCompatParcelizer().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerWrite);
        }
        internalOnMeasureui internalonmeasureui2 = firebaseInAppMessagingDisplay.MediaBrowserCompatMediaItem;
        if (internalonmeasureui2.MediaBrowserCompatMediaItem == MessageType.CARD) {
            isTransitionGroup istransitiongroup2 = (isTransitionGroup) internalonmeasureui2;
            onattachedtowindowWrite = istransitiongroup2.serializer;
            onAttachedToWindow onattachedtowindow = istransitiongroup2.read;
            if (firebaseInAppMessagingDisplay.read.getResources().getConfiguration().orientation != 1 ? !(onattachedtowindow == null || TextUtils.isEmpty(onattachedtowindow.write())) : !(onattachedtowindowWrite != null && !TextUtils.isEmpty(onattachedtowindowWrite.write()))) {
                onattachedtowindowWrite = onattachedtowindow;
            }
        } else {
            onattachedtowindowWrite = internalonmeasureui2.write();
        }
        FirebaseInAppMessagingDisplay.AnonymousClass4 anonymousClass4 = firebaseInAppMessagingDisplay.new AnonymousClass4(r3, activity, onGlobalLayoutListenerWrite);
        if (onattachedtowindowWrite == null || TextUtils.isEmpty(onattachedtowindowWrite.write())) {
            anonymousClass4.MediaBrowserCompatMediaItem();
            return;
        }
        getUseMinimumTouchTarget getuseminimumtouchtarget = firebaseInAppMessagingDisplay.MediaDescriptionCompat;
        String str = onattachedtowindowWrite.read;
        getuseminimumtouchtarget.getClass();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
        selectPaint selectpaint = new selectPaint();
        drawyzxVdVo drawyzxvdvo = new drawyzxVdVo("image/*");
        if (selectpaint.read) {
            selectpaint.read = false;
            HashMap map2 = new HashMap(selectpaint.IconCompatParcelizer.size());
            for (Map.Entry entry : selectpaint.IconCompatParcelizer.entrySet()) {
                map2.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            selectpaint.IconCompatParcelizer = map2;
        }
        List arrayList2 = (List) selectpaint.IconCompatParcelizer.get("Accept");
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            selectpaint.IconCompatParcelizer.put("Accept", arrayList2);
        }
        arrayList2.add(drawyzxvdvo);
        modulate5vOe2sY modulate5voe2sy = new modulate5vOe2sY(str, selectpaint.write());
        RequestManager requestManager = getuseminimumtouchtarget.serializer;
        requestManager.getClass();
        RequestBuilder requestBuilder = new RequestBuilder(requestManager.MediaSessionCompatQueueItem, requestManager, Drawable.class, requestManager.read).read(modulate5voe2sy);
        _init_lambda0 _init_lambda0Var = _init_lambda0.PREFER_ARGB_8888;
        requestBuilder.getClass();
        UrlUtils.read(_init_lambda0Var);
        RequestBuilder requestBuilder2 = (RequestBuilder) requestBuilder.serializer(CanvasDrawScopeKtasDrawTransform1.read, _init_lambda0Var).serializer(drawPointsF8ZwMP8default.RemoteActionCompatParcelizer, _init_lambda0Var);
        x xVar = new x(getuseminimumtouchtarget, requestBuilder2);
        requestBuilder2.serializer(new getEndXimpl(firebaseInAppMessagingDisplay.MediaBrowserCompatMediaItem, firebaseInAppMessagingDisplay.IconCompatParcelizer));
        xVar.RemoteActionCompatParcelizer = activity.getClass().getSimpleName();
        xVar.RemoteActionCompatParcelizer();
        requestBuilder2.IconCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
        ImageView imageViewRemoteActionCompatParcelizer = r3.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer5 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer6 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer6, -1540001960, new Object[0], iRemoteActionCompatParcelizer5);
        anonymousClass4.write = imageViewRemoteActionCompatParcelizer;
        requestBuilder2.write(anonymousClass4);
        xVar.read = anonymousClass4;
        xVar.RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a1  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object objCall;
        int i;
        zzw zzwVarRemoteActionCompatParcelizer;
        zzbe zzbeVar;
        Cursor cursorQuery;
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1;
        OnLayoutRectChangedModifierKt onLayoutRectChangedModifierKt;
        AtomicReference atomicReference;
        OverScroller overScroller;
        DepthSortedSet depthSortedSet;
        long j;
        r8lambdacc83FJQHWm1yiSXE4POrRGeuxZ0 r8lambdacc83fjqhwm1yisxe4porrgeuxz0;
        Iterator it;
        SynchronizationContext$1 synchronizationContext$1 = this;
        double d = 100.0d;
        int i2 = 3;
        switch (synchronizationContext$1.read) {
            case 0:
                ((getMethodQuietlylambda1) synchronizationContext$1.serializer).execute((invokeMethodQuietlylambda0) synchronizationContext$1.write);
                return;
            case 1:
                try {
                    objCall = ((resetFocus3ESFkO8) synchronizationContext$1.write).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) synchronizationContext$1.serializer).post(new zza((setScreenFlashOverlayColor) synchronizationContext$1.IconCompatParcelizer, 5, objCall));
                return;
            case 2:
                CloudMessage cloudMessage = (CloudMessage) synchronizationContext$1.IconCompatParcelizer;
                if (TextUtils.isEmpty(cloudMessage.RemoteActionCompatParcelizer())) {
                    zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("google.message_id", cloudMessage.RemoteActionCompatParcelizer());
                    Integer numSerializer = cloudMessage.serializer();
                    if (numSerializer != null) {
                        bundle.putInt("google.product_id", numSerializer.intValue());
                    }
                    Context context = (Context) synchronizationContext$1.write;
                    bundle.putBoolean("supports_message_handled", true);
                    r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcekWrite = r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.write(context);
                    synchronized (r8lambdau31fnmctqqics3i75jr9dkzcekWrite) {
                        i = r8lambdau31fnmctqqics3i75jr9dkzcekWrite.MediaBrowserCompatMediaItem;
                        r8lambdau31fnmctqqics3i75jr9dkzcekWrite.MediaBrowserCompatMediaItem = i + 1;
                    }
                    zzwVarRemoteActionCompatParcelizer = r8lambdau31fnmctqqics3i75jr9dkzcekWrite.RemoteActionCompatParcelizer(new accessgetNinecp(i, 2, bundle, 0));
                }
                zzwVarRemoteActionCompatParcelizer.addOnCompleteListener(new Executor() { // from class: o.accessgetNavigateOutcp
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, new ViewRootForInspector((CountDownLatch) synchronizationContext$1.serializer));
                return;
            case 3:
                accessgetNumPadMoveEndcp accessgetnumpadmoveendcp = (accessgetNumPadMoveEndcp) synchronizationContext$1.write;
                accessgetProgramGreencp accessgetprogramgreencp = (accessgetProgramGreencp) synchronizationContext$1.serializer;
                if (accessgetprogramgreencp.IconCompatParcelizer > 0) {
                    Bundle bundle2 = accessgetprogramgreencp.serializer;
                    accessgetnumpadmoveendcp.write(bundle2 != null ? bundle2.getBundle((String) synchronizationContext$1.IconCompatParcelizer) : null);
                }
                if (accessgetprogramgreencp.IconCompatParcelizer >= 2) {
                    accessgetnumpadmoveendcp.serializer();
                }
                if (accessgetprogramgreencp.IconCompatParcelizer >= 3) {
                    accessgetnumpadmoveendcp.RemoteActionCompatParcelizer();
                }
                if (accessgetprogramgreencp.IconCompatParcelizer >= 4) {
                    accessgetnumpadmoveendcp.read();
                }
                if (accessgetprogramgreencp.IconCompatParcelizer >= 5) {
                    accessgetnumpadmoveendcp.IconCompatParcelizer();
                    return;
                }
                return;
            case 4:
                resetLayoutState resetlayoutstate = (resetLayoutState) synchronizationContext$1.write;
                accessgetRootp accessgetrootp = (accessgetRootp) synchronizationContext$1.IconCompatParcelizer;
                i$d.a aVar = (i$d.a) synchronizationContext$1.serializer;
                HashMap map = resetlayoutstate.MediaSessionCompatResultReceiverWrapper;
                getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) map.get(accessgetrootp);
                if (getlambda641200809ui != null) {
                    getFillWidthannotations getfillwidthannotations = getlambda641200809ui.serializer;
                    getAbovehoxUOeE getabovehoxuoee = getlambda641200809ui.IconCompatParcelizer;
                    if (getabovehoxuoee == null) {
                        getabovehoxuoee = new getAbovehoxUOeE(getlambda641200809ui, getfillwidthannotations);
                        getlambda641200809ui.IconCompatParcelizer = getabovehoxuoee;
                    }
                    for (Object obj : getabovehoxuoee) {
                        Object arrayList = (Collection) getfillwidthannotations.get(obj);
                        if (arrayList == null) {
                            arrayList = new ArrayList(i2);
                        }
                        List list = (List) arrayList;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new BeyondBoundsLayoutProviderModifierNode(getlambda641200809ui, obj, list, null) : new getBeyondBoundsLayout(getlambda641200809ui, obj, list, (getBeyondBoundsLayout) null));
                        Collections.sort(arrayList2);
                        accessapplyPausedPrecomposition accessapplypausedprecomposition = new accessapplyPausedPrecomposition();
                        Iterator it2 = arrayList2.iterator();
                        long jLongValue = 0;
                        while (it2.hasNext()) {
                            jLongValue += ((Long) it2.next()).longValue();
                        }
                        accessapplypausedprecomposition.write = Long.valueOf((jLongValue / ((long) arrayList2.size())) & Long.MAX_VALUE);
                        accessapplypausedprecomposition.RemoteActionCompatParcelizer = Long.valueOf(resetLayoutState.write(arrayList2, d) & Long.MAX_VALUE);
                        accessapplypausedprecomposition.MediaDescriptionCompat = Long.valueOf(resetLayoutState.write(arrayList2, 75.0d) & Long.MAX_VALUE);
                        accessapplypausedprecomposition.serializer = Long.valueOf(resetLayoutState.write(arrayList2, 50.0d) & Long.MAX_VALUE);
                        accessapplypausedprecomposition.IconCompatParcelizer = Long.valueOf(resetLayoutState.write(arrayList2, 25.0d) & Long.MAX_VALUE);
                        accessapplypausedprecomposition.read = Long.valueOf(Long.MAX_VALUE & resetLayoutState.write(arrayList2, 0.0d));
                        r8lambdaI9S4Oy4uvsJFCZpX9_LGbxS5mDc r8lambdai9s4oy4uvsjfczpx9_lgbxs5mdc = new r8lambdaI9S4Oy4uvsJFCZpX9_LGbxS5mDc(accessapplypausedprecomposition);
                        int size = arrayList2.size();
                        zzh zzhVar = (zzh) aVar.read;
                        computeFillWidthiLBOSCw computefillwidthilboscw = (computeFillWidthiLBOSCw) obj;
                        BlockRunner blockRunner = new BlockRunner();
                        blockRunner.RatingCompat = zzhVar.MediaMetadataCompat ? accessgetCurrentApproachIndexp.TYPE_THICK : accessgetCurrentApproachIndexp.TYPE_THIN;
                        accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp((byte) 0, 14);
                        accessgettvteletextcp.serializer = Integer.valueOf(Integer.MAX_VALUE & size);
                        accessgettvteletextcp.RemoteActionCompatParcelizer = computefillwidthilboscw;
                        accessgettvteletextcp.write = r8lambdai9s4oy4uvsjfczpx9_lgbxs5mdc;
                        blockRunner.IconCompatParcelizer = new DefaultIntrinsicMeasurable(accessgettvteletextcp);
                        getScaledHandwritingGestureLineMargin.INSTANCE.execute(new ImageVectorCacheImageVectorEntry((Object) resetlayoutstate, (Object) new zp(blockRunner, 0, (byte) 0), (Enum) accessgetrootp, resetlayoutstate.read(), 6));
                        d = 100.0d;
                        i2 = 3;
                    }
                    map.remove(accessgetrootp);
                    return;
                }
                return;
            case 5:
                zzpg zzpgVar = ((LookaheadScopeKtdefaultPlacementApproachInProgress1) synchronizationContext$1.serializer).serializer;
                zzpgVar.serializer();
                zzah zzahVar = (zzah) synchronizationContext$1.write;
                Object objIconCompatParcelizer = zzahVar.serializer.IconCompatParcelizer();
                zzr zzrVar = (zzr) synchronizationContext$1.IconCompatParcelizer;
                if (objIconCompatParcelizer == null) {
                    zzpgVar.write(zzahVar, zzrVar);
                    return;
                } else {
                    zzpgVar.read(zzahVar, zzrVar);
                    return;
                }
            case 6:
                zzbg zzbgVar = (zzbg) synchronizationContext$1.write;
                zzr zzrVar2 = (zzr) synchronizationContext$1.IconCompatParcelizer;
                LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) synchronizationContext$1.serializer;
                lookaheadScopeKtdefaultPlacementApproachInProgress1.getClass();
                zzpg zzpgVar2 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
                if ("_cmp".equals(zzbgVar.IconCompatParcelizer) && (zzbeVar = zzbgVar.read) != null) {
                    Bundle bundle3 = zzbeVar.read;
                    if (bundle3.size() != 0) {
                        String string = bundle3.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            zzpgVar2.RatingCompat().MediaMetadataCompat.serializer(zzbgVar.toString(), "Event has been filtered ");
                            zzbgVar = new zzbg("_cmpx", zzbeVar, zzbgVar.write, zzbgVar.serializer);
                        }
                    }
                }
                String str = zzbgVar.IconCompatParcelizer;
                lookaheadScopeCoordinates lookaheadscopecoordinates = zzpgVar2.PlaybackStateCompat;
                zzgz zzgzVar = zzpgVar2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                zzpg.serializer(lookaheadscopecoordinates);
                String str2 = zzrVar2.RatingCompat;
                zzc zzcVar = TextUtils.isEmpty(str2) ? null : (zzc) lookaheadscopecoordinates.IconCompatParcelizer.get(str2);
                if (zzcVar == null) {
                    zzpgVar2.RatingCompat().PlaybackStateCompat.serializer(zzrVar2.RatingCompat, "EES not loaded for");
                    zzpgVar2.serializer();
                    zzpgVar2.read(zzbgVar, zzrVar2);
                    return;
                }
                try {
                    accessgetTvTeletextcp accessgettvteletextcp2 = zzcVar.RemoteActionCompatParcelizer;
                    zzpg.serializer(zzgzVar);
                    HashMap map2 = zzgz.read(zzbgVar.read.write(), true);
                    String str3 = (String) TuplesKt.RemoteActionCompatParcelizer(1514272013, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{str, Measured.RemoteActionCompatParcelizer, Measured.IconCompatParcelizer}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1514272013);
                    if (str3 == null) {
                        str3 = str;
                    }
                    if (zzcVar.serializer(new getNumPadDivideEK5gGoQ(str3, zzbgVar.serializer, map2))) {
                        if (((getNumPadDivideEK5gGoQ) accessgettvteletextcp2.serializer).equals((getNumPadDivideEK5gGoQ) accessgettvteletextcp2.RemoteActionCompatParcelizer)) {
                            zzpgVar2.serializer();
                            zzpgVar2.read(zzbgVar, zzrVar2);
                        } else {
                            zzpgVar2.RatingCompat().PlaybackStateCompat.serializer(str, "EES edited event");
                            zzpg.serializer(zzgzVar);
                            zzbg zzbgVarWrite = zzgz.write((getNumPadDivideEK5gGoQ) accessgettvteletextcp2.serializer);
                            zzpgVar2.serializer();
                            zzpgVar2.read(zzbgVarWrite, zzrVar2);
                        }
                        if (((ArrayList) accessgettvteletextcp2.write).isEmpty()) {
                            return;
                        }
                        for (getNumPadDivideEK5gGoQ getnumpaddivideek5ggoq : (ArrayList) accessgettvteletextcp2.write) {
                            zzpgVar2.RatingCompat().PlaybackStateCompat.serializer(getnumpaddivideek5ggoq.RemoteActionCompatParcelizer, "EES logging created event");
                            zzpg.serializer(zzgzVar);
                            zzbg zzbgVarWrite2 = zzgz.write(getnumpaddivideek5ggoq);
                            zzpgVar2.serializer();
                            zzpgVar2.read(zzbgVarWrite2, zzrVar2);
                        }
                        return;
                    }
                } catch (zzd unused2) {
                    zzpgVar2.RatingCompat().serializer.serializer("EES error. appId, eventName", zzrVar2.MediaBrowserCompatMediaItem, str);
                }
                zzpgVar2.RatingCompat().PlaybackStateCompat.serializer(str, "EES was not applied to event");
                zzpgVar2.serializer();
                zzpgVar2.read(zzbgVar, zzrVar2);
                return;
            case 7:
                LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress2 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) synchronizationContext$1.serializer;
                lookaheadScopeKtdefaultPlacementApproachInProgress2.serializer.serializer();
                lookaheadScopeKtdefaultPlacementApproachInProgress2.serializer.serializer((zzbg) synchronizationContext$1.write, (String) synchronizationContext$1.IconCompatParcelizer);
                return;
            case 8:
                zzpg zzpgVar3 = ((LookaheadScopeKtdefaultPlacementApproachInProgress1) synchronizationContext$1.serializer).serializer;
                zzpgVar3.serializer();
                zzpl zzplVar = (zzpl) synchronizationContext$1.write;
                Object objIconCompatParcelizer2 = zzplVar.IconCompatParcelizer();
                zzr zzrVar3 = (zzr) synchronizationContext$1.IconCompatParcelizer;
                if (objIconCompatParcelizer2 == null) {
                    zzpgVar3.read(zzplVar.write, zzrVar3);
                    return;
                } else {
                    zzpgVar3.IconCompatParcelizer(zzplVar, zzrVar3);
                    return;
                }
            case 9:
                LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress3 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) synchronizationContext$1.write;
                zzr zzrVar4 = (zzr) synchronizationContext$1.IconCompatParcelizer;
                zzaf zzafVar = (zzaf) synchronizationContext$1.serializer;
                zzpg zzpgVar4 = lookaheadScopeKtdefaultPlacementApproachInProgress3.serializer;
                zzpgVar4.serializer();
                String str4 = zzrVar4.RatingCompat;
                accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str4);
                HashMap map3 = zzpgVar4.MediaBrowserCompatMediaItem;
                zzpgVar4.PlaybackStateCompat().MediaSessionCompatToken();
                zzpgVar4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy2 = zzpgVar4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy2);
                long j2 = zzafVar.IconCompatParcelizer;
                long j3 = zzafVar.RemoteActionCompatParcelizer;
                int i3 = zzafVar.write;
                layoutNodeSubcompositionsStatecreateMeasurePolicy2.MediaSessionCompatToken();
                layoutNodeSubcompositionsStatecreateMeasurePolicy2.ComponentActivity();
                try {
                    cursorQuery = layoutNodeSubcompositionsStatecreateMeasurePolicy2.ResultReceiver().query("upload_queue", new String[]{"rowId", HiAnalyticsConstant.BI_KEY_APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string2 = cursorQuery.getString(1);
                                accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) string2);
                                layoutNodeSubcompositionsStatecreateMeasurePolicy1 = layoutNodeSubcompositionsStatecreateMeasurePolicy2;
                                try {
                                    OnLayoutRectChangedModifierKt onLayoutRectChangedModifierKtRemoteActionCompatParcelizer = layoutNodeSubcompositionsStatecreateMeasurePolicy1.RemoteActionCompatParcelizer(string2, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                    cursorQuery.close();
                                    onLayoutRectChangedModifierKt = onLayoutRectChangedModifierKtRemoteActionCompatParcelizer;
                                } catch (SQLiteException e) {
                                    e = e;
                                    getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    getlookaheaddelegate.serializer.serializer("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    onLayoutRectChangedModifierKt = null;
                                }
                            } else {
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                onLayoutRectChangedModifierKt = null;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            layoutNodeSubcompositionsStatecreateMeasurePolicy1 = layoutNodeSubcompositionsStatecreateMeasurePolicy2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    layoutNodeSubcompositionsStatecreateMeasurePolicy1 = layoutNodeSubcompositionsStatecreateMeasurePolicy2;
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursorQuery = null;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
                if (onLayoutRectChangedModifierKt == null) {
                    zzpgVar4.RatingCompat().MediaSessionCompatQueueItem.serializer("[sgtm] Queued batch doesn't exist. appId, rowId", str4, Long.valueOf(j2));
                    return;
                }
                String str5 = onLayoutRectChangedModifierKt.serializer;
                if (i3 != getCallback.SUCCESS.zza()) {
                    if (i3 == getCallback.BACKOFF.zza()) {
                        getDebounceMillis getdebouncemillis = (getDebounceMillis) map3.get(str5);
                        if (getdebouncemillis == null) {
                            getdebouncemillis = new getDebounceMillis(zzpgVar4);
                            map3.put(str5, getdebouncemillis);
                        } else {
                            getdebouncemillis.write++;
                            getdebouncemillis.RemoteActionCompatParcelizer = getdebouncemillis.write();
                        }
                        ((accessgetTvInputComposite1cp) zzpgVar4.ParcelableVolumeInfo()).getClass();
                        zzpgVar4.RatingCompat().PlaybackStateCompat.IconCompatParcelizer("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str5, Long.valueOf((getdebouncemillis.RemoteActionCompatParcelizer - System.currentTimeMillis()) / 1000));
                    }
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy3 = zzpgVar4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy3);
                    Long lValueOf = Long.valueOf(zzafVar.IconCompatParcelizer);
                    layoutNodeSubcompositionsStatecreateMeasurePolicy3.RemoteActionCompatParcelizer(lValueOf);
                    zzpgVar4.RatingCompat().PlaybackStateCompat.serializer("[sgtm] increased batch retry count after failed client upload. appId, rowId", str4, lValueOf);
                    return;
                }
                if (map3.containsKey(str5)) {
                    map3.remove(str5);
                }
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy4 = zzpgVar4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy4);
                Long lValueOf2 = Long.valueOf(j2);
                layoutNodeSubcompositionsStatecreateMeasurePolicy4.write(lValueOf2);
                zzpgVar4.RatingCompat().PlaybackStateCompat.serializer("[sgtm] queued batch deleted after successful client upload. appId, rowId", str4, lValueOf2);
                if (j3 > 0) {
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy5 = zzpgVar4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy5);
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    layoutNodeSubcompositionsStatecreateMeasurePolicy5.MediaSessionCompatToken();
                    layoutNodeSubcompositionsStatecreateMeasurePolicy5.ComponentActivity();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(OnFirstVisibleModifierKt.GOOGLE_SIGNAL.zza()));
                    accessgetTvInputComposite1cp accessgettvinputcomposite1cp = lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    accessgettvinputcomposite1cp.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    try {
                        if (layoutNodeSubcompositionsStatecreateMeasurePolicy5.ResultReceiver().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j3), str4, String.valueOf(OnFirstVisibleModifierKt.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                            getlookaheaddelegate2.MediaSessionCompatQueueItem.serializer("Google Signal pending batch not updated. appId, rowId", str4, Long.valueOf(j3));
                            break;
                        }
                        zzpgVar4.RatingCompat().PlaybackStateCompat.serializer("[sgtm] queued Google Signal batch updated. appId, signalRowId", str4, Long.valueOf(j3));
                        zzpgVar4.write(str4);
                        return;
                    } catch (SQLiteException e4) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                        getlookaheaddelegate2.serializer.IconCompatParcelizer("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j3), e4);
                        throw e4;
                    }
                }
                return;
            case 10:
                AtomicReference atomicReference2 = (AtomicReference) synchronizationContext$1.write;
                synchronized (atomicReference2) {
                    try {
                        try {
                            setViewportBounds setviewportbounds = (setViewportBounds) synchronizationContext$1.serializer;
                            isComplete iscomplete = setviewportbounds.write;
                            if (iscomplete == null) {
                                getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                getlookaheaddelegate3.serializer.RemoteActionCompatParcelizer("Failed to get all user properties; not connected to service");
                                atomicReference2.notify();
                                return;
                            }
                            atomicReference2.set(iscomplete.RemoteActionCompatParcelizer((zzr) synchronizationContext$1.IconCompatParcelizer, true));
                            setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            atomicReference = (AtomicReference) synchronizationContext$1.write;
                            atomicReference.notify();
                            return;
                        } catch (Throwable th3) {
                            ((AtomicReference) synchronizationContext$1.write).notify();
                            throw th3;
                        }
                    } catch (RemoteException e5) {
                        getLookaheadDelegate getlookaheaddelegate4 = ((LookaheadScopeKtLookaheadScope221) ((setViewportBounds) synchronizationContext$1.serializer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                        getlookaheaddelegate4.serializer.serializer(e5, "Failed to get all user properties; remote exception");
                        atomicReference = (AtomicReference) synchronizationContext$1.write;
                    }
                }
                break;
            case 11:
                RemoteActionCompatParcelizer();
                return;
            case 12:
                setViewportBounds setviewportbounds2 = (setViewportBounds) synchronizationContext$1.write;
                zzr zzrVar5 = (zzr) synchronizationContext$1.IconCompatParcelizer;
                zzaf zzafVar2 = (zzaf) synchronizationContext$1.serializer;
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                isComplete iscomplete2 = setviewportbounds2.write;
                if (iscomplete2 == null) {
                    getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                    getlookaheaddelegate5.serializer.RemoteActionCompatParcelizer("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    iscomplete2.write(zzrVar5, zzafVar2);
                    setviewportbounds2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    return;
                } catch (RemoteException e6) {
                    getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                    getlookaheaddelegate6.serializer.serializer("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar2.IconCompatParcelizer), e6);
                    return;
                }
            case 13:
                PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = (PinnableContainerKtLocalPinnableContainer1) synchronizationContext$1.write;
                getLookaheadDelegate getlookaheaddelegate7 = (getLookaheadDelegate) synchronizationContext$1.IconCompatParcelizer;
                JobParameters jobParameters = (JobParameters) synchronizationContext$1.serializer;
                getlookaheaddelegate7.PlaybackStateCompat.RemoteActionCompatParcelizer("AppMeasurementJobService processed last upload request.");
                ((setMinFractionVisible) ((Service) pinnableContainerKtLocalPinnableContainer1.serializer)).RemoteActionCompatParcelizer(jobParameters);
                return;
            case 14:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) synchronizationContext$1.write;
                place placeVar = (place) synchronizationContext$1.serializer;
                View view = (View) synchronizationContext$1.IconCompatParcelizer;
                if (view == null || (overScroller = placeVar.PlaybackStateCompatCustomAction) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    placeVar.RemoteActionCompatParcelizer(coordinatorLayout, view, placeVar.PlaybackStateCompatCustomAction.getCurrY());
                    view.postOnAnimation(synchronizationContext$1);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) placeVar).read(coordinatorLayout, appBarLayout);
                if (appBarLayout.MediaSessionCompatQueueItem) {
                    appBarLayout.RemoteActionCompatParcelizer(appBarLayout.serializer(AppBarLayout.BaseBehavior.IconCompatParcelizer(coordinatorLayout)));
                    return;
                }
                return;
            case 15:
                didUpdate didupdate = (didUpdate) synchronizationContext$1.serializer;
                didupdate.serializer((LookaheadDelegateKt) synchronizationContext$1.write, (ParentDataModifierDefaultImpls) synchronizationContext$1.IconCompatParcelizer);
                didupdate.IconCompatParcelizer.serializer.set(0);
                double dMin = Math.min(3600000.0d, Math.pow(didupdate.read, didupdate.RemoteActionCompatParcelizer()) * (60000.0d / didupdate.MediaSessionCompatQueueItem));
                String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d));
                Log.isLoggable("FirebaseCrashlytics", 3);
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused3) {
                    return;
                }
            case 16:
                write();
                return;
            case 17:
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = (hasTooManyZipEntrieslambda0) synchronizationContext$1.serializer;
                scale0AR0LA0default scale0ar0la0default = hastoomanyzipentrieslambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                getFontLoaderannotations getfontloaderannotations = (getFontLoaderannotations) synchronizationContext$1.write;
                Executor executor = hastoomanyzipentrieslambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                setResourcePackageNamelambda0 setresourcepackagenamelambda0 = (setResourcePackageNamelambda0) synchronizationContext$1.IconCompatParcelizer;
                scale0ar0la0default.getClass();
                TextStreamsKt.serializer(executor, "executor");
                TextStreamsKt.serializer(setresourcepackagenamelambda0, "source");
                r8lambdavFH2wnCVQAlDYBWQ6fWDFNezEDs r8lambdavfh2wncvqaldybwq6fwdfnezeds = new r8lambdavFH2wnCVQAlDYBWQ6fWDFNezEDs(getfontloaderannotations, executor);
                if (((setResourcePackageNamelambda0) scale0ar0la0default.RemoteActionCompatParcelizer) != setresourcepackagenamelambda0) {
                    r8lambdavfh2wncvqaldybwq6fwdfnezeds.write();
                    return;
                } else {
                    ((ArrayList) scale0ar0la0default.IconCompatParcelizer).add(r8lambdavfh2wncvqaldybwq6fwdfnezeds);
                    return;
                }
            default:
                IAction iAction = (IAction) synchronizationContext$1.serializer;
                iAction.MediaSessionCompatQueueItem = Long.valueOf(iAction.MediaSessionCompatToken.write());
                for (UriAction uriAction : ((IAction) synchronizationContext$1.serializer).PlaybackStateCompatCustomAction.IconCompatParcelizer.values()) {
                    FormBody.Builder builder = uriAction.write;
                    ((AtomicLong) builder.serializer).set(0L);
                    ((AtomicLong) builder.RemoteActionCompatParcelizer).set(0L);
                    FormBody.Builder builder2 = uriAction.IconCompatParcelizer;
                    uriAction.IconCompatParcelizer = uriAction.write;
                    uriAction.write = builder2;
                }
                r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20 r8lambdapxfx9i9wwy9pn8nj6g6puqyz20 = (r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20) synchronizationContext$1.write;
                r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc r8lambdan29im8cjkn7obdaxnvkijdq8rpc = (r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc) synchronizationContext$1.IconCompatParcelizer;
                DepthSortedSet depthSortedSet2 = delegateUnprotectedui.write;
                JsonUtilsc jsonUtilsc = new JsonUtilsc();
                if (r8lambdapxfx9i9wwy9pn8nj6g6puqyz20.MediaDescriptionCompat != null) {
                    jsonUtilsc.write(new r8lambdacc83FJQHWm1yiSXE4POrRGeuxZ0(r8lambdapxfx9i9wwy9pn8nj6g6puqyz20, r8lambdan29im8cjkn7obdaxnvkijdq8rpc, 0));
                }
                if (r8lambdapxfx9i9wwy9pn8nj6g6puqyz20.read != null) {
                    jsonUtilsc.write(new r8lambdacc83FJQHWm1yiSXE4POrRGeuxZ0(r8lambdapxfx9i9wwy9pn8nj6g6puqyz20, r8lambdan29im8cjkn7obdaxnvkijdq8rpc, 1));
                }
                jsonUtilsc.serializer = true;
                DepthSortedSet depthSortedSetListIterator = delegateUnprotectedui.IconCompatParcelizer(jsonUtilsc.read, (Object[]) jsonUtilsc.RemoteActionCompatParcelizer).listIterator(0);
                while (depthSortedSetListIterator.hasNext()) {
                    r8lambdacc83FJQHWm1yiSXE4POrRGeuxZ0 r8lambdacc83fjqhwm1yisxe4porrgeuxz1 = (r8lambdacc83FJQHWm1yiSXE4POrRGeuxZ0) depthSortedSetListIterator.next();
                    IAction iAction2 = (IAction) synchronizationContext$1.serializer;
                    getChannel getchannel = iAction2.PlaybackStateCompatCustomAction;
                    long jLongValue2 = iAction2.MediaSessionCompatQueueItem.longValue();
                    if (r8lambdacc83fjqhwm1yisxe4porrgeuxz1.serializer != 0) {
                        r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20 r8lambdapxfx9i9wwy9pn8nj6g6puqyz21 = r8lambdacc83fjqhwm1yisxe4porrgeuxz1.write;
                        ArrayList arrayListIconCompatParcelizer = IAction.IconCompatParcelizer(getchannel, r8lambdapxfx9i9wwy9pn8nj6g6puqyz21.read.write.intValue());
                        int size2 = arrayListIconCompatParcelizer.size();
                        r8lambdaEBRBRotzagevF6hg_eSqZ9I4TM r8lambdaebrbrotzagevf6hg_esqz9i4tm = r8lambdapxfx9i9wwy9pn8nj6g6puqyz21.read;
                        if (size2 >= r8lambdaebrbrotzagevf6hg_esqz9i4tm.IconCompatParcelizer.intValue() && arrayListIconCompatParcelizer.size() != 0) {
                            Iterator it3 = arrayListIconCompatParcelizer.iterator();
                            while (it3.hasNext()) {
                                UriAction uriAction2 = (UriAction) it3.next();
                                if (getchannel.IconCompatParcelizer() < r8lambdapxfx9i9wwy9pn8nj6g6puqyz21.IconCompatParcelizer.intValue()) {
                                    if (uriAction2.IconCompatParcelizer() >= r8lambdaebrbrotzagevf6hg_esqz9i4tm.write.intValue()) {
                                        Iterator it4 = it3;
                                        if (((AtomicLong) uriAction2.write.RemoteActionCompatParcelizer).get() / uriAction2.IconCompatParcelizer() > ((double) r8lambdaebrbrotzagevf6hg_esqz9i4tm.RemoteActionCompatParcelizer.intValue()) / 100.0d) {
                                            r8lambdacc83fjqhwm1yisxe4porrgeuxz1.read.IconCompatParcelizer(optEnum.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", uriAction2, Double.valueOf(((AtomicLong) uriAction2.write.RemoteActionCompatParcelizer).get() / uriAction2.IconCompatParcelizer()));
                                            if (new Random().nextInt(100) < r8lambdaebrbrotzagevf6hg_esqz9i4tm.serializer.intValue()) {
                                                uriAction2.RemoteActionCompatParcelizer(jLongValue2);
                                            }
                                        }
                                        it3 = it4;
                                    }
                                }
                            }
                        }
                    } else {
                        r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20 r8lambdapxfx9i9wwy9pn8nj6g6puqyz22 = r8lambdacc83fjqhwm1yisxe4porrgeuxz1.write;
                        ArrayList<UriAction> arrayListIconCompatParcelizer2 = IAction.IconCompatParcelizer(getchannel, r8lambdapxfx9i9wwy9pn8nj6g6puqyz22.MediaDescriptionCompat.write.intValue());
                        int size3 = arrayListIconCompatParcelizer2.size();
                        r8lambdaEBRBRotzagevF6hg_eSqZ9I4TM r8lambdaebrbrotzagevf6hg_esqz9i4tm2 = r8lambdapxfx9i9wwy9pn8nj6g6puqyz22.MediaDescriptionCompat;
                        if (size3 >= r8lambdaebrbrotzagevf6hg_esqz9i4tm2.IconCompatParcelizer.intValue() && arrayListIconCompatParcelizer2.size() != 0) {
                            ArrayList arrayList3 = new ArrayList();
                            for (UriAction uriAction3 : arrayListIconCompatParcelizer2) {
                                arrayList3.add(Double.valueOf(((AtomicLong) uriAction3.write.serializer).get() / uriAction3.IconCompatParcelizer()));
                                r8lambdacc83fjqhwm1yisxe4porrgeuxz1 = r8lambdacc83fjqhwm1yisxe4porrgeuxz1;
                            }
                            r8lambdacc83FJQHWm1yiSXE4POrRGeuxZ0 r8lambdacc83fjqhwm1yisxe4porrgeuxz2 = r8lambdacc83fjqhwm1yisxe4porrgeuxz1;
                            Iterator it5 = arrayList3.iterator();
                            double dDoubleValue = 0.0d;
                            while (it5.hasNext()) {
                                dDoubleValue += ((Double) it5.next()).doubleValue();
                            }
                            double size4 = dDoubleValue / ((double) arrayList3.size());
                            Iterator it6 = arrayList3.iterator();
                            double d2 = 0.0d;
                            while (it6.hasNext()) {
                                double dDoubleValue2 = ((Double) it6.next()).doubleValue() - size4;
                                d2 = (dDoubleValue2 * dDoubleValue2) + d2;
                            }
                            double dSqrt = Math.sqrt(d2 / ((double) arrayList3.size()));
                            double dIntValue = size4 - (((double) (r8lambdaebrbrotzagevf6hg_esqz9i4tm2.RemoteActionCompatParcelizer.intValue() / 1000.0f)) * dSqrt);
                            Iterator it7 = arrayListIconCompatParcelizer2.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    UriAction uriAction4 = (UriAction) it7.next();
                                    depthSortedSet = depthSortedSetListIterator;
                                    r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20 r8lambdapxfx9i9wwy9pn8nj6g6puqyz23 = r8lambdapxfx9i9wwy9pn8nj6g6puqyz22;
                                    getChannel getchannel2 = getchannel;
                                    if (getchannel.IconCompatParcelizer() >= r8lambdapxfx9i9wwy9pn8nj6g6puqyz22.IconCompatParcelizer.intValue()) {
                                    }
                                    if (((AtomicLong) uriAction4.write.serializer).get() / uriAction4.IconCompatParcelizer() < dIntValue) {
                                        r8lambdacc83fjqhwm1yisxe4porrgeuxz0 = r8lambdacc83fjqhwm1yisxe4porrgeuxz2;
                                        long j4 = jLongValue2;
                                        it = it7;
                                        r8lambdacc83fjqhwm1yisxe4porrgeuxz0.read.IconCompatParcelizer(optEnum.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", uriAction4, Double.valueOf(((AtomicLong) uriAction4.write.serializer).get() / uriAction4.IconCompatParcelizer()), Double.valueOf(size4), Double.valueOf(dSqrt), Double.valueOf(dIntValue));
                                        if (new Random().nextInt(100) < r8lambdaebrbrotzagevf6hg_esqz9i4tm2.serializer.intValue()) {
                                            j = j4;
                                            uriAction4.RemoteActionCompatParcelizer(j);
                                        } else {
                                            j = j4;
                                        }
                                    } else {
                                        j = jLongValue2;
                                        r8lambdacc83fjqhwm1yisxe4porrgeuxz0 = r8lambdacc83fjqhwm1yisxe4porrgeuxz2;
                                        it = it7;
                                    }
                                    jLongValue2 = j;
                                    it7 = it;
                                    getchannel = getchannel2;
                                    r8lambdapxfx9i9wwy9pn8nj6g6puqyz22 = r8lambdapxfx9i9wwy9pn8nj6g6puqyz23;
                                    r8lambdacc83fjqhwm1yisxe4porrgeuxz2 = r8lambdacc83fjqhwm1yisxe4porrgeuxz0;
                                    depthSortedSetListIterator = depthSortedSet;
                                    break;
                                }
                            }
                        }
                        synchronizationContext$1 = this;
                        depthSortedSetListIterator = depthSortedSet;
                    }
                    depthSortedSet = depthSortedSetListIterator;
                    synchronizationContext$1 = this;
                    depthSortedSetListIterator = depthSortedSet;
                }
                IAction iAction3 = (IAction) synchronizationContext$1.serializer;
                getChannel getchannel3 = iAction3.PlaybackStateCompatCustomAction;
                Long l = iAction3.MediaSessionCompatQueueItem;
                for (UriAction uriAction5 : getchannel3.IconCompatParcelizer.values()) {
                    if (!uriAction5.RemoteActionCompatParcelizer()) {
                        int i4 = uriAction5.RemoteActionCompatParcelizer;
                        uriAction5.RemoteActionCompatParcelizer = i4 == 0 ? 0 : i4 - 1;
                    }
                    if (uriAction5.RemoteActionCompatParcelizer()) {
                        if (l.longValue() > Math.min(uriAction5.serializer.serializer.longValue() * ((long) uriAction5.RemoteActionCompatParcelizer), Math.max(uriAction5.serializer.serializer.longValue(), uriAction5.serializer.MediaSessionCompatQueueItem.longValue())) + uriAction5.read.longValue()) {
                            uriAction5.read();
                        }
                    }
                }
                return;
        }
    }

    public String toString() {
        if (this.read != 0) {
            return super.toString();
        }
        return ((Runnable) this.IconCompatParcelizer).toString() + "(scheduled in SynchronizationContext)";
    }

    public /* synthetic */ SynchronizationContext$1() {
        this.read = 1;
    }

    public /* synthetic */ SynchronizationContext$1(Object obj, Object obj2, Object obj3, int i) {
        this.read = i;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
        this.serializer = obj3;
    }
}
