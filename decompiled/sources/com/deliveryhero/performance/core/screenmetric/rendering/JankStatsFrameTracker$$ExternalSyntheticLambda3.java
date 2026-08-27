package com.deliveryhero.performance.core.screenmetric.rendering;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Trace;
import androidx.compose.ui.graphics.Fields;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IValueCallback;
import com.data.util.AndroidScheduleProvider;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.push.tokenregistery.data.GMSPushTokenProvider;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.customerchat.legacy.core.usecases.ChatRegisterUseCase;
import com.roadrunner.experience_tools.braze.BrazeManagerImpl;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.instant.shifts.presentation.BookShiftConfirmationResult;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.completable.CompletableFromCallable;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import io.sentry.SentryOptions;
import io.sentry.metrics.MetricsBatchProcessor;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.LazyKt__LazyJVMKt;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AccessibilityIteratorsAbstractTextSegmentIterator;
import o.AndroidComposeViewCompanion;
import o.AndroidPlatformTextInputSessionstartInputMethod311;
import o.BannerUserJavascriptInterface;
import o.BrazeActionUtils;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.EnumColumnAdapter;
import o.OuterPlacementScope;
import o.PausedPrecompositionImpl;
import o._get_messageWebView_lambda0;
import o.access500;
import o.accessgetBrowsercp;
import o.accessgetEightcp;
import o.accessgetEndCallcp;
import o.accessgetHcp;
import o.accessgetLastChannelcp;
import o.accessgetMannerModecp;
import o.accessgetMediaAudioTrackcp;
import o.accessgetMediaEjectcp;
import o.accessgetMediaFastForwardcp;
import o.accessgetTvInputComposite1cp;
import o.ddefault;
import o.executeAsList;
import o.forEachNewCallbackNeverInvoked;
import o.getAlignmentLinesMap;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getCieXyz;
import o.getHasMeasureResult;
import o.getIntentArrayWithConfiguredBackStacklambda0;
import o.getPlacementScope;
import o.getViewAdapterIfExists;
import o.insertAndReturnIdsList;
import o.internalOnMeasureui;
import o.isUnspecifieduvyYCjk;
import o.packui;
import o.r8lambda5RMxLAQdv9DJX4ayDOD0F7rfqx4;
import o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4;
import o.r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeDelayedExecution;
import o.removeNodeAtDepth;
import o.reuse;
import o.setComposeViewContextui;
import o.setContentCaptureManagerui;
import o.setMaxWidth;
import o.setOnReadyForComposition;
import o.setOnSessionTrackingFailedListener;
import o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui;
import o.shouldDelayChildPressedState;
import o.traverseChildren;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class JankStatsFrameTracker$$ExternalSyntheticLambda3 implements OnFailureListener, accessgetMediaFastForwardcp, accessgetMediaEjectcp, AccessibilityIteratorsAbstractTextSegmentIterator, FirebaseInAppMessagingDisplay, Function, getPlacementScope, PausedPrecompositionImpl, OuterPlacementScope, Action, SingleOnSubscribe, IValueCallback, isUnspecifieduvyYCjk, BannerUserJavascriptInterface, r8lambdaaCm2JcMru73kJeywi54SW2Mni8U, r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4, r8lambda5RMxLAQdv9DJX4ayDOD0F7rfqx4 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ JankStatsFrameTracker$$ExternalSyntheticLambda3(BrazeManagerImpl brazeManagerImpl, setMaxWidth setmaxwidth, setMaxWidth setmaxwidth2) {
        this.write = 16;
        this.IconCompatParcelizer = setmaxwidth;
        this.RemoteActionCompatParcelizer = setmaxwidth2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    /* JADX WARN: Code duplicated, block: B:103:0x015d  */
    /* JADX WARN: Code duplicated, block: B:116:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc A[Catch: all -> 0x012e, TRY_LEAVE, TryCatch #7 {all -> 0x012e, blocks: (B:9:0x0037, B:11:0x003a, B:12:0x003b, B:16:0x004e, B:50:0x00b8, B:52:0x00bc, B:54:0x00bf, B:58:0x00c3, B:53:0x00bd), top: B:123:0x0013, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x0121  */
    /* JADX WARN: Code duplicated, block: B:95:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // o.OuterPlacementScope
    public Object then(Task task) throws Throwable {
        InputStream errorStream;
        Integer numValueOf;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        ?? r14 = (ConfigRealtimeHttpClient) this.IconCompatParcelizer;
        ?? inputStream = (Task) this.RemoteActionCompatParcelizer;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = r14.write;
        boolean z = true;
        ?? r7 = 0;
        try {
            try {
                if (!inputStream.isSuccessful()) {
                    throw new IOException(inputStream.getException());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream.getResult();
                r14.MediaSessionCompatResultReceiverWrapper = httpURLConnection;
                inputStream = httpURLConnection.getInputStream();
                try {
                    errorStream = r14.MediaSessionCompatResultReceiverWrapper.getErrorStream();
                    try {
                        int responseCode = r14.MediaSessionCompatResultReceiverWrapper.getResponseCode();
                        numValueOf = Integer.valueOf(responseCode);
                        if (responseCode == 200) {
                            try {
                                synchronized (r14) {
                                    r14.MediaSessionCompatQueueItem = 8;
                                }
                                r14.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(0, AndroidComposeViewCompanion.serializer);
                                r14.serializer(r14.MediaSessionCompatResultReceiverWrapper).RemoteActionCompatParcelizer();
                            } catch (IOException unused) {
                                if (r14.MediaSessionCompatToken) {
                                    synchronized (r14) {
                                        r14.MediaSessionCompatQueueItem = 8;
                                    }
                                }
                                r14.serializer(inputStream, errorStream);
                                synchronized (r14) {
                                    r14.ParcelableVolumeInfo = false;
                                }
                                if (r14.MediaSessionCompatToken || (numValueOf != null && !ConfigRealtimeHttpClient.RemoteActionCompatParcelizer(numValueOf.intValue()))) {
                                    z = false;
                                }
                                if (z) {
                                    accessgettvinputcomposite1cp.getClass();
                                    r14.RemoteActionCompatParcelizer(new Date(System.currentTimeMillis()));
                                }
                                if (!z || numValueOf.intValue() == 200) {
                                    r14.write();
                                } else {
                                    String strIconCompatParcelizer = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strIconCompatParcelizer = ConfigRealtimeHttpClient.IconCompatParcelizer(r14.MediaSessionCompatResultReceiverWrapper.getErrorStream());
                                    }
                                    int iIntValue = numValueOf.intValue();
                                    FirebaseRemoteConfigException.write writeVar = FirebaseRemoteConfigException.write.UNKNOWN;
                                    firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(iIntValue, 0, strIconCompatParcelizer);
                                }
                                r14.MediaSessionCompatResultReceiverWrapper = null;
                                return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
                            }
                        }
                        r14.serializer(inputStream, errorStream);
                        synchronized (r14) {
                            r14.ParcelableVolumeInfo = false;
                        }
                        z = !r14.MediaSessionCompatToken && ConfigRealtimeHttpClient.RemoteActionCompatParcelizer(responseCode);
                        if (z) {
                            accessgettvinputcomposite1cp.getClass();
                            r14.RemoteActionCompatParcelizer(new Date(System.currentTimeMillis()));
                        }
                        if (z || responseCode == 200) {
                            r14.write();
                        } else {
                            String strIconCompatParcelizer2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (responseCode == 403) {
                                strIconCompatParcelizer2 = ConfigRealtimeHttpClient.IconCompatParcelizer(r14.MediaSessionCompatResultReceiverWrapper.getErrorStream());
                            }
                            FirebaseRemoteConfigException.write writeVar2 = FirebaseRemoteConfigException.write.UNKNOWN;
                            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, 0, strIconCompatParcelizer2);
                            r14.IconCompatParcelizer(firebaseRemoteConfigServerException);
                        }
                    } catch (IOException unused2) {
                        numValueOf = null;
                    } catch (Throwable th) {
                        th = th;
                        numValueOf = null;
                        r7 = inputStream;
                        th = th;
                        r14.serializer(r7, errorStream);
                        synchronized (r14) {
                            r14.ParcelableVolumeInfo = false;
                            if (r14.MediaSessionCompatToken) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                accessgettvinputcomposite1cp.getClass();
                                r14.RemoteActionCompatParcelizer(new Date(System.currentTimeMillis()));
                            }
                            if (z) {
                            }
                            r14.write();
                            throw th;
                        }
                    }
                } catch (IOException unused3) {
                    errorStream = null;
                    numValueOf = null;
                    if (r14.MediaSessionCompatToken) {
                        synchronized (r14) {
                            r14.MediaSessionCompatQueueItem = 8;
                        }
                    }
                    r14.serializer(inputStream, errorStream);
                    synchronized (r14) {
                        r14.ParcelableVolumeInfo = false;
                        if (r14.MediaSessionCompatToken) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            accessgettvinputcomposite1cp.getClass();
                            r14.RemoteActionCompatParcelizer(new Date(System.currentTimeMillis()));
                        }
                        if (z) {
                        }
                        r14.write();
                        r14.MediaSessionCompatResultReceiverWrapper = null;
                        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    errorStream = null;
                    numValueOf = null;
                }
                r14.MediaSessionCompatResultReceiverWrapper = null;
                return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
            } catch (Throwable th3) {
                th = th3;
                r7 = inputStream;
                th = th;
                r14.serializer(r7, errorStream);
                synchronized (r14) {
                    r14.ParcelableVolumeInfo = false;
                    if (r14.MediaSessionCompatToken || (numValueOf != null && !ConfigRealtimeHttpClient.RemoteActionCompatParcelizer(numValueOf.intValue()))) {
                        z = false;
                    }
                    if (z) {
                        accessgettvinputcomposite1cp.getClass();
                        r14.RemoteActionCompatParcelizer(new Date(System.currentTimeMillis()));
                    }
                    if (!z || numValueOf.intValue() == 200) {
                        r14.write();
                        throw th;
                    }
                    String strIconCompatParcelizer3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                    if (numValueOf.intValue() == 403) {
                        strIconCompatParcelizer3 = ConfigRealtimeHttpClient.IconCompatParcelizer(r14.MediaSessionCompatResultReceiverWrapper.getErrorStream());
                    }
                    int iIntValue2 = numValueOf.intValue();
                    FirebaseRemoteConfigException.write writeVar3 = FirebaseRemoteConfigException.write.UNKNOWN;
                    r14.IconCompatParcelizer(new FirebaseRemoteConfigServerException(iIntValue2, 0, strIconCompatParcelizer3));
                    throw th;
                }
            }
        } catch (IOException unused4) {
            inputStream = 0;
        } catch (Throwable th4) {
            th = th4;
            errorStream = null;
            numValueOf = null;
            r14.serializer(r7, errorStream);
            synchronized (r14) {
                r14.ParcelableVolumeInfo = false;
                if (r14.MediaSessionCompatToken) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    accessgettvinputcomposite1cp.getClass();
                    r14.RemoteActionCompatParcelizer(new Date(System.currentTimeMillis()));
                }
                if (z) {
                }
                r14.write();
                throw th;
            }
        }
    }

    public /* synthetic */ JankStatsFrameTracker$$ExternalSyntheticLambda3(Object obj, int i, Object obj2) {
        this.write = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // o.AccessibilityIteratorsAbstractTextSegmentIterator
    public void RemoteActionCompatParcelizer(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = serializer + 69;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AccessibilityIteratorsAbstractTextSegmentIterator accessibilityIteratorsAbstractTextSegmentIterator = (AccessibilityIteratorsAbstractTextSegmentIterator) this.IconCompatParcelizer;
        AccessibilityIteratorsAbstractTextSegmentIterator accessibilityIteratorsAbstractTextSegmentIterator2 = (AccessibilityIteratorsAbstractTextSegmentIterator) this.RemoteActionCompatParcelizer;
        accessibilityIteratorsAbstractTextSegmentIterator.RemoteActionCompatParcelizer(abstractComposeViewExternalSyntheticLambda0);
        accessibilityIteratorsAbstractTextSegmentIterator2.RemoteActionCompatParcelizer(abstractComposeViewExternalSyntheticLambda0);
        int i4 = serializer + 33;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r10 = com.mapbox.common.location.AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        r7 = com.mapbox.common.location.AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        kotlinx.coroutines.BuildersKt.IconCompatParcelizer(1540001961, com.mapbox.common.location.AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), com.mapbox.common.location.AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), r7, -1540001960, new java.lang.Object[0], r10);
        r12 = com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.serializer + 95;
        com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.read = r12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        if ((r12 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        r12 = 40 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1.MediaBrowserCompatMediaItem == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r1.MediaBrowserCompatMediaItem == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1.MediaSessionCompatQueueItem.getClass();
        r1.MediaBrowserCompatMediaItem = r12;
        r1.IconCompatParcelizer = r13;
        r1.RemoteActionCompatParcelizer(r3);
     */
    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void displayMessage(o.internalOnMeasureui r12, o.OwnerSnapshotObserveronCommitAffectingLookahead1 r13) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.serializer
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.read = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1f
            java.lang.Object r1 = r11.IconCompatParcelizer
            com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay r1 = (com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay) r1
            java.lang.Object r3 = r11.RemoteActionCompatParcelizer
            android.app.Activity r3 = (android.app.Activity) r3
            o.internalOnMeasureui r4 = r1.MediaBrowserCompatMediaItem
            r5 = 82
            int r5 = r5 / r2
            if (r4 != 0) goto L38
            goto L2b
        L1f:
            java.lang.Object r1 = r11.IconCompatParcelizer
            com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay r1 = (com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay) r1
            java.lang.Object r3 = r11.RemoteActionCompatParcelizer
            android.app.Activity r3 = (android.app.Activity) r3
            o.internalOnMeasureui r4 = r1.MediaBrowserCompatMediaItem
            if (r4 != 0) goto L38
        L2b:
            com.google.firebase.inappmessaging.FirebaseInAppMessaging r0 = r1.MediaSessionCompatQueueItem
            r0.getClass()
            r1.MediaBrowserCompatMediaItem = r12
            r1.IconCompatParcelizer = r13
            r1.RemoteActionCompatParcelizer(r3)
            return
        L38:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            int r10 = com.mapbox.common.location.AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer()
            int r7 = com.mapbox.common.location.AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer()
            int r5 = com.mapbox.common.location.AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer()
            int r6 = com.mapbox.common.location.AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer()
            r8 = -1540001960(0xffffffffa4356f58, float:-3.934243E-17)
            r4 = 1540001961(0x5bca90a9, float:1.14034E17)
            kotlinx.coroutines.BuildersKt.IconCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            int r12 = com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.serializer
            int r12 = r12 + 95
            int r13 = r12 % 128
            com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.read = r13
            int r12 = r12 % r0
            if (r12 != 0) goto L61
            r12 = 40
            int r12 = r12 / r2
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.displayMessage(o.internalOnMeasureui, o.OwnerSnapshotObserveronCommitAffectingLookahead1):void");
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = 2 % 2;
        int i2 = read + 111;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        GMSPushTokenProvider gMSPushTokenProvider = (GMSPushTokenProvider) this.IconCompatParcelizer;
        SingleEmitter singleEmitter = (SingleEmitter) this.RemoteActionCompatParcelizer;
        exc.getClass();
        EnumColumnAdapter enumColumnAdapter = gMSPushTokenProvider.write.IconCompatParcelizer;
        executeAsList executeaslist = executeAsList.INFRA;
        String message = exc.getMessage();
        if (message == null) {
            int i4 = serializer + 69;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            message = "";
        }
        EnumColumnAdapter.serializer(enumColumnAdapter, "push_google_token_provider_failed", executeaslist, message);
        gMSPushTokenProvider.IconCompatParcelizer.IconCompatParcelizer.logEvent("push_google_token_provider_fail", null);
        singleEmitter.read(exc);
        int i6 = serializer + 7;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 36 / 0;
        }
    }

    @Override // io.reactivex.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        int i = 2 % 2;
        int i2 = serializer + 11;
        read = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                List list = (List) this.IconCompatParcelizer;
                singleEmitter.getClass();
                list.isEmpty();
                throw null;
            }
            List list2 = (List) this.IconCompatParcelizer;
            ChatRegisterUseCase chatRegisterUseCase = (ChatRegisterUseCase) this.RemoteActionCompatParcelizer;
            singleEmitter.getClass();
            if (!list2.isEmpty()) {
                chatRegisterUseCase.read(singleEmitter);
                return;
            }
            int i3 = read + 1;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            singleEmitter.IconCompatParcelizer(Boolean.FALSE);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Chat register interrupted; downstream likely disposed", new Object[0]);
            singleEmitter.read(e);
        }
    }

    public void write(MaybeEmitter maybeEmitter) {
        int i = 2 % 2;
        Task task = (Task) this.IconCompatParcelizer;
        Executor executor = (Executor) this.RemoteActionCompatParcelizer;
        task.addOnSuccessListener(executor, new getViewAdapterIfExists(maybeEmitter));
        task.addOnFailureListener(executor, new getViewAdapterIfExists(maybeEmitter));
        int i2 = read + 89;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isUnspecifieduvyYCjk
    public void onFragmentResult(Bundle bundle, String str) {
        int i = 2 % 2;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) this.IconCompatParcelizer;
        insertAndReturnIdsList insertandreturnidslist = (insertAndReturnIdsList) this.RemoteActionCompatParcelizer;
        bundle.getClass();
        BookShiftConfirmationResult bookShiftConfirmationResult = (BookShiftConfirmationResult) bundle.getParcelable("book_shift_confirmation_flow_result_key");
        if (bookShiftConfirmationResult instanceof BookShiftConfirmationResult.ShiftBookedSuccessfully) {
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((BookShiftConfirmationResult.ShiftBookedSuccessfully) bookShiftConfirmationResult).write(), ddefault.RemoteActionCompatParcelizer, 0);
            insertandreturnidslist.serializer.serializer(setOnSessionTrackingFailedListener.OTHER);
            return;
        }
        if (!(bookShiftConfirmationResult instanceof BookShiftConfirmationResult.ShiftBookingFailed)) {
            if (bookShiftConfirmationResult != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            int i2 = serializer + 67;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        int i4 = serializer + 113;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((BookShiftConfirmationResult.ShiftBookingFailed) bookShiftConfirmationResult).IconCompatParcelizer(), ddefault.IconCompatParcelizer, 0);
            insertandreturnidslist.serializer.serializer(setOnSessionTrackingFailedListener.OTHER);
        } else {
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((BookShiftConfirmationResult.ShiftBookingFailed) bookShiftConfirmationResult).IconCompatParcelizer(), ddefault.IconCompatParcelizer, 0);
            insertandreturnidslist.serializer.serializer(setOnSessionTrackingFailedListener.OTHER);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 != 21) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        ((o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) r5).write = r8.serializer(new com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3(r8, 23, (io.sentry.SentryOptions) r4));
        r8 = com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.serializer + 63;
        com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.read = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if ((r8 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r8.RemoteActionCompatParcelizer(new io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda6((io.sentry.android.core.ActivityLifecycleIntegration) r5, r8, (o.getChildStepIteratorandroid_sdk_ui_release) r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 != 21) goto L11;
     */
    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(o.BrazeActionUtils r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.serializer
            r2 = 19
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.read = r3
            int r1 = r1 % r0
            r3 = 21
            if (r1 != 0) goto L20
            int r1 = r7.write
            java.lang.Object r4 = r7.RemoteActionCompatParcelizer
            java.lang.Object r5 = r7.IconCompatParcelizer
            r6 = 13
            int r6 = r6 / 0
            if (r1 == r2) goto L56
            if (r1 == r3) goto L49
            goto L2a
        L20:
            int r1 = r7.write
            java.lang.Object r4 = r7.RemoteActionCompatParcelizer
            java.lang.Object r5 = r7.IconCompatParcelizer
            if (r1 == r2) goto L56
            if (r1 == r3) goto L49
        L2a:
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release r5 = (o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) r5
            io.sentry.SentryOptions r4 = (io.sentry.SentryOptions) r4
            com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3 r1 = new com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3
            r2 = 23
            r1.<init>(r8, r2, r4)
            o._get_messageWebView_lambda0 r8 = r8.serializer(r1)
            r5.write = r8
            int r8 = com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.serializer
            int r8 = r8 + 63
            int r1 = r8 % 128
            com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.read = r1
            int r8 = r8 % r0
            if (r8 == 0) goto L47
            return
        L47:
            r8 = 0
            throw r8
        L49:
            io.sentry.android.core.ActivityLifecycleIntegration r5 = (io.sentry.android.core.ActivityLifecycleIntegration) r5
            o.getChildStepIteratorandroid_sdk_ui_release r4 = (o.getChildStepIteratorandroid_sdk_ui_release) r4
            io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda6 r0 = new io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda6
            r0.<init>(r5, r8, r4)
            r8.RemoteActionCompatParcelizer(r0)
            return
        L56:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = (java.lang.String) r4
            r8.getClass()
            io.sentry.protocol.addObserverForBackInvoker r0 = r8.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()
            if (r0 != 0) goto L68
            io.sentry.protocol.addObserverForBackInvoker r0 = new io.sentry.protocol.addObserverForBackInvoker
            r0.<init>()
        L68:
            java.util.concurrent.ConcurrentHashMap r1 = r0.write
            if (r1 != 0) goto L71
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L71:
            r1.put(r5, r4)
            java.util.concurrent.ConcurrentHashMap r1 = okio.Options.Companion.RemoteActionCompatParcelizer(r1)
            r0.write = r1
            r8.read(r0)
            java.lang.String r0 = "last_active_screen"
            boolean r0 = r0.equalsIgnoreCase(r5)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == r1) goto L8a
            r8.IconCompatParcelizer(r5, r4)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3.write(o.BrazeActionUtils):void");
    }

    @Override // o.accessgetMediaFastForwardcp
    public Object read() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        access500 access500Var = (access500) this.IconCompatParcelizer;
        if (i4 == 2) {
            Iterable iterable = (Iterable) obj;
            SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) access500Var.IconCompatParcelizer;
            sQLiteEventStore.getClass();
            if (iterable.iterator().hasNext()) {
                sQLiteEventStore.IconCompatParcelizer().compileStatement("DELETE FROM events WHERE _id in ".concat(SQLiteEventStore.RemoteActionCompatParcelizer(iterable))).execute();
            }
            return null;
        }
        for (Map.Entry entry : ((HashMap) obj).entrySet()) {
            ((SQLiteEventStore) access500Var.RemoteActionCompatParcelizer).read(((Integer) entry.getValue()).intValue(), accessgetHcp.INVALID_PAYLOD, (String) entry.getKey());
            int i5 = read + 71;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return null;
    }

    @Override // io.reactivex.functions.Action
    public void run() {
        int i = 2 % 2;
        Boolean bool = (Boolean) this.IconCompatParcelizer;
        LegacyCustomerChatCommunicatorImpl legacyCustomerChatCommunicatorImpl = (LegacyCustomerChatCommunicatorImpl) this.RemoteActionCompatParcelizer;
        if (bool.booleanValue()) {
            int i2 = read + 105;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ((CustomerChatProviderImpl) legacyCustomerChatCommunicatorImpl.RatingCompat.serializer).RemoteActionCompatParcelizer();
            return;
        }
        CustomerChatProviderImpl customerChatProviderImpl = (CustomerChatProviderImpl) ((forEachNewCallbackNeverInvoked) legacyCustomerChatCommunicatorImpl.MediaBrowserCompatMediaItem.serializer);
        if (customerChatProviderImpl.IconCompatParcelizer()) {
            return;
        }
        customerChatProviderImpl.RatingCompat = new CompletableSubscribeOn(new CompletableFromCallable(new setContentCaptureManagerui(5, customerChatProviderImpl)), ((AndroidScheduleProvider) customerChatProviderImpl.PlaybackStateCompat).IconCompatParcelizer()).subscribe(new r8lambdayUqGVEpC1kg8ua3jc9a113shNIE(15), new PerseusInitializerImpl$$ExternalSyntheticLambda0(12, new HomeFragment.AnonymousClass1(1, Timber.RemoteActionCompatParcelizer, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 10)));
        int i4 = read + 29;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.braze.events.IValueCallback
    public void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 75;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setMaxWidth setmaxwidth = (setMaxWidth) this.IconCompatParcelizer;
        setMaxWidth setmaxwidth2 = (setMaxWidth) this.RemoteActionCompatParcelizer;
        BrazeUser brazeUser = (BrazeUser) obj;
        brazeUser.getClass();
        String str = null;
        String str2 = setmaxwidth != null ? setmaxwidth.IconCompatParcelizer : null;
        String str3 = setmaxwidth2.IconCompatParcelizer;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, str3}, getCieXyz.write())).booleanValue()) {
            brazeUser.setCustomUserAttribute("courier_id", str3);
        }
        String str4 = setmaxwidth != null ? setmaxwidth.write : null;
        String str5 = setmaxwidth2.write;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str4, str5}, getCieXyz.write())).booleanValue() && str5 != null) {
            String upperCase = str5.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            brazeUser.setCustomUserAttribute("rider_country", upperCase);
        }
        String str6 = setmaxwidth != null ? setmaxwidth.serializer : null;
        String str7 = setmaxwidth2.serializer;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str6, str7}, getCieXyz.write())).booleanValue()) {
            brazeUser.setCustomUserAttribute("rider_city", str7);
        }
        if (setmaxwidth != null) {
            int i4 = read + 7;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                str = setmaxwidth.read;
                int i5 = 70 / 0;
            } else {
                str = setmaxwidth.read;
            }
        }
        String str8 = setmaxwidth2.read;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str8}, getCieXyz.write())).booleanValue()) {
            brazeUser.setCustomUserAttribute("rider_language", str8);
        }
        brazeUser.setPushNotificationSubscriptionType(NotificationSubscriptionType.OPTED_IN);
    }

    @Override // o.r8lambda5RMxLAQdv9DJX4ayDOD0F7rfqx4
    public void RemoteActionCompatParcelizer(_get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        int i = 2 % 2;
        int i2 = read + 91;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        BrazeActionUtils brazeActionUtils = (BrazeActionUtils) this.IconCompatParcelizer;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0 = (getIntentArrayWithConfiguredBackStacklambda0) _get_messagewebview_lambda0.read;
        if (!getintentarraywithconfiguredbackstacklambda0.serializer) {
            return;
        }
        int i4 = serializer + 97;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0ComponentActivity = brazeActionUtils.ComponentActivity();
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys = brazeActionUtils.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        getintentarraywithconfiguredbackstacklambda0.write("sentry-trace_id", ((r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) _get_messagewebview_lambda0ComponentActivity.write).toString());
        getintentarraywithconfiguredbackstacklambda0.write("sentry-public_key", sentryOptions.retrieveParsedDsn().serializer);
        getintentarraywithconfiguredbackstacklambda0.write("sentry-release", sentryOptions.getRelease());
        getintentarraywithconfiguredbackstacklambda0.write("sentry-environment", sentryOptions.getEnvironment());
        if (!r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer.equals(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys)) {
            getintentarraywithconfiguredbackstacklambda0.write("sentry-replay_id", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys.toString());
        }
        getintentarraywithconfiguredbackstacklambda0.write("sentry-transaction", null);
        if (!(!getintentarraywithconfiguredbackstacklambda0.serializer)) {
            getintentarraywithconfiguredbackstacklambda0.MediaSessionCompatQueueItem = null;
        }
        getintentarraywithconfiguredbackstacklambda0.write("sentry-sampled", null);
        getintentarraywithconfiguredbackstacklambda0.serializer = false;
    }

    @Override // o.r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4
    public void accept(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release) {
        int i = 2 % 2;
        int i2 = read + 101;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release2 = (getChildStepIteratorandroid_sdk_ui_release) this.IconCompatParcelizer;
        BrazeActionUtils brazeActionUtils = (BrazeActionUtils) this.RemoteActionCompatParcelizer;
        if (getchildstepiteratorandroid_sdk_ui_release == getchildstepiteratorandroid_sdk_ui_release2) {
            int i5 = i3 + 69;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            brazeActionUtils.write();
            if (i6 == 0) {
                int i7 = 72 / 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    @Override // o.getPlacementScope
    public Object create(MetricsBatchProcessor metricsBatchProcessor) {
        String strValueOf;
        int i = 2 % 2;
        int i2 = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        String str = (String) this.IconCompatParcelizer;
        if (i2 != 10) {
            getHasMeasureResult gethasmeasureresult = (getHasMeasureResult) obj;
            try {
                Trace.beginSection(str);
                Object objCreate = gethasmeasureresult.IconCompatParcelizer.create(metricsBatchProcessor);
                Trace.endSection();
                int i3 = serializer + 31;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objCreate;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        Context context = (Context) metricsBatchProcessor.read(Context.class);
        switch (((getAlignmentLinesMap) obj).IconCompatParcelizer) {
            case 17:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo == null) {
                    strValueOf = "";
                } else {
                    int i5 = read + 109;
                    serializer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    } else {
                        strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        int i6 = 56 / 0;
                    }
                }
                break;
            case 18:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                if (applicationInfo2 == null) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                }
                break;
            case 19:
                if (!(!context.getPackageManager().hasSystemFeature("android.hardware.type.television"))) {
                    int i7 = serializer + 75;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    strValueOf = "tv";
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    strValueOf = "watch";
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    strValueOf = "auto";
                } else if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    strValueOf = "";
                } else {
                    strValueOf = "embedded";
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    strValueOf = "";
                } else {
                    strValueOf = FirebaseCommonRegistrar.serializer(installerPackageName);
                }
                break;
        }
        return new removeDelayedExecution(str, strValueOf);
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        setOnReadyForComposition setonreadyforcomposition = (setOnReadyForComposition) this.IconCompatParcelizer;
        setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui = (setPrimaryDirectionalMotionAxisOverrider2epLt8ui) this.RemoteActionCompatParcelizer;
        synchronized (setonreadyforcomposition) {
            setonreadyforcomposition.IconCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(setprimarydirectionalmotionaxisoverrider2eplt8ui);
        }
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(setprimarydirectionalmotionaxisoverrider2eplt8ui);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0175  */
    /* JADX WARN: Code duplicated, block: B:47:0x017e A[PHI: r11
  0x017e: PHI (r11v13 o.accessgetBrowsercp) = (r11v9 o.accessgetBrowsercp), (r11v16 o.accessgetBrowsercp) binds: [B:45:0x0173, B:42:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0188  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:94:0x0196 A[EDGE_INSN: B:94:0x0196->B:52:0x0196 BREAK  A[LOOP:1: B:38:0x0158->B:51:0x0193], SYNTHETIC] */
    @Override // o.accessgetMediaEjectcp
    public Object apply(Object obj) {
        accessgetBrowsercp accessgetbrowsercp;
        int size;
        String campaignId;
        String campaignName;
        int i = 2 % 2;
        int i2 = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.IconCompatParcelizer;
        int i3 = 1;
        if (i2 != 4) {
            if (i2 == 7) {
                ImpressionStorageClient impressionStorageClient = (ImpressionStorageClient) obj3;
                HashSet hashSet = (HashSet) obj2;
                CampaignImpressionList campaignImpressionList = (CampaignImpressionList) obj;
                impressionStorageClient.getClass();
                campaignImpressionList.toString();
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
                AndroidPlatformTextInputSessionstartInputMethod311 androidPlatformTextInputSessionstartInputMethod311NewBuilder = CampaignImpressionList.newBuilder();
                Iterator<CampaignImpression> it = campaignImpressionList.getAlreadySeenCampaignsList().iterator();
                while (!(!it.hasNext())) {
                    CampaignImpression next = it.next();
                    if (!hashSet.contains(next.getCampaignId())) {
                        androidPlatformTextInputSessionstartInputMethod311NewBuilder.RemoteActionCompatParcelizer();
                        ((CampaignImpressionList) androidPlatformTextInputSessionstartInputMethod311NewBuilder.RemoteActionCompatParcelizer).addAlreadySeenCampaigns(next);
                    }
                }
                CampaignImpressionList campaignImpressionList2 = (CampaignImpressionList) androidPlatformTextInputSessionstartInputMethod311NewBuilder.serializer();
                campaignImpressionList2.toString();
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
                r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm = impressionStorageClient.serializer;
                r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm.getClass();
                return new CompletableFromCallable(new SentryEnvelopeItem$$ExternalSyntheticLambda3(r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm, 3, campaignImpressionList2)).serializer(new traverseChildren(impressionStorageClient, campaignImpressionList2, i3));
            }
            reuse reuseVar = (reuse) obj3;
            String str = (String) obj2;
            CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
            reuseVar.getClass();
            Object obj4 = null;
            if (!campaignProto$ThickContent.getPayloadCase().equals(CampaignProto$ThickContent.write.VANILLA_PAYLOAD)) {
                if (campaignProto$ThickContent.getPayloadCase().equals(CampaignProto$ThickContent.write.EXPERIMENTAL_PAYLOAD)) {
                    int i4 = serializer + 11;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        campaignProto$ThickContent.getExperimentalPayload().getCampaignId();
                        campaignProto$ThickContent.getExperimentalPayload().getCampaignName();
                        campaignProto$ThickContent.getIsTestCampaign();
                        obj4.hashCode();
                        throw null;
                    }
                    campaignId = campaignProto$ThickContent.getExperimentalPayload().getCampaignId();
                    String campaignName2 = campaignProto$ThickContent.getExperimentalPayload().getCampaignName();
                    if (!campaignProto$ThickContent.getIsTestCampaign()) {
                        packui packuiVar = reuseVar.IconCompatParcelizer;
                        packuiVar.write.execute(new w4$$ExternalSyntheticLambda0(packuiVar, 25, campaignProto$ThickContent.getExperimentalPayload().getExperimentPayload()));
                    }
                    campaignName = campaignName2;
                }
                return MaybeEmpty.IconCompatParcelizer;
            }
            int i5 = serializer + 57;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                campaignProto$ThickContent.getVanillaPayload().getCampaignId();
                campaignProto$ThickContent.getVanillaPayload().getCampaignName();
                obj4.hashCode();
                throw null;
            }
            campaignId = campaignProto$ThickContent.getVanillaPayload().getCampaignId();
            campaignName = campaignProto$ThickContent.getVanillaPayload().getCampaignName();
            MessagesProto$Content content = campaignProto$ThickContent.getContent();
            boolean isTestCampaign = campaignProto$ThickContent.getIsTestCampaign();
            campaignProto$ThickContent.getDataBundleMap();
            internalOnMeasureui internalonmeasureuiRemoteActionCompatParcelizer = setComposeViewContextui.RemoteActionCompatParcelizer(content, campaignId, campaignName, isTestCampaign);
            if (!internalonmeasureuiRemoteActionCompatParcelizer.IconCompatParcelizer().equals(MessageType.UNSUPPORTED)) {
                return Maybe.RemoteActionCompatParcelizer(new shouldDelayChildPressedState(internalonmeasureuiRemoteActionCompatParcelizer, str));
            }
            return MaybeEmpty.IconCompatParcelizer;
        }
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) obj3;
        accessgetEightcp accessgeteightcp = (accessgetEightcp) obj2;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        accessgetLastChannelcp accessgetlastchannelcp = sQLiteEventStore.IconCompatParcelizer;
        ArrayList arrayListRemoteActionCompatParcelizer = sQLiteEventStore.RemoteActionCompatParcelizer(sQLiteDatabase, accessgeteightcp, accessgetlastchannelcp.IconCompatParcelizer);
        accessgetBrowsercp[] accessgetbrowsercpArrValues = accessgetBrowsercp.values();
        int length = accessgetbrowsercpArrValues.length;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = serializer + 83;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                accessgetbrowsercp = accessgetbrowsercpArrValues[i6];
                int i8 = 91 / 0;
                if (accessgetbrowsercp == accessgeteightcp.IconCompatParcelizer) {
                    int i9 = serializer + 1;
                    read = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                } else {
                    size = accessgetlastchannelcp.IconCompatParcelizer - arrayListRemoteActionCompatParcelizer.size();
                    if (size <= 0) {
                        break;
                    }
                    arrayListRemoteActionCompatParcelizer.addAll(sQLiteEventStore.RemoteActionCompatParcelizer(sQLiteDatabase, accessgeteightcp.write(accessgetbrowsercp), size));
                }
            } else {
                accessgetbrowsercp = accessgetbrowsercpArrValues[i6];
                if (accessgetbrowsercp == accessgeteightcp.IconCompatParcelizer) {
                    int i11 = serializer + 1;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                } else {
                    size = accessgetlastchannelcp.IconCompatParcelizer - arrayListRemoteActionCompatParcelizer.size();
                    if (size <= 0) {
                        break;
                        break;
                    }
                    arrayListRemoteActionCompatParcelizer.addAll(sQLiteEventStore.RemoteActionCompatParcelizer(sQLiteDatabase, accessgeteightcp.write(accessgetbrowsercp), size));
                }
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i13 = 0; i13 < arrayListRemoteActionCompatParcelizer.size(); i13++) {
            int i14 = read + 81;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                sb.append(((accessgetMannerModecp) arrayListRemoteActionCompatParcelizer.get(i13)).read);
                if (i13 < arrayListRemoteActionCompatParcelizer.size() % 1) {
                    sb.append(',');
                }
            } else {
                sb.append(((accessgetMannerModecp) arrayListRemoteActionCompatParcelizer.get(i13)).read);
                if (i13 < arrayListRemoteActionCompatParcelizer.size() - 1) {
                    sb.append(',');
                }
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet2 = (Set) map.get(Long.valueOf(j));
                if (hashSet2 == null) {
                    hashSet2 = new HashSet();
                    map.put(Long.valueOf(j), hashSet2);
                }
                hashSet2.add(new accessgetMediaAudioTrackcp(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListRemoteActionCompatParcelizer.listIterator();
        while (listIterator.hasNext()) {
            accessgetMannerModecp accessgetmannermodecp = (accessgetMannerModecp) listIterator.next();
            long j2 = accessgetmannermodecp.read;
            if (map.containsKey(Long.valueOf(j2))) {
                accessgetEndCallcp accessgetendcallcpIconCompatParcelizer = accessgetmannermodecp.write.IconCompatParcelizer();
                Iterator it2 = ((Set) map.get(Long.valueOf(j2))).iterator();
                while (!(!it2.hasNext())) {
                    accessgetMediaAudioTrackcp accessgetmediaaudiotrackcp = (accessgetMediaAudioTrackcp) it2.next();
                    accessgetendcallcpIconCompatParcelizer.serializer(accessgetmediaaudiotrackcp.IconCompatParcelizer, accessgetmediaaudiotrackcp.serializer);
                }
                listIterator.set(new accessgetMannerModecp(j2, accessgetmannermodecp.serializer, accessgetendcallcpIconCompatParcelizer.read()));
            } else {
                int i15 = read + 89;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
            }
        }
        return arrayListRemoteActionCompatParcelizer;
    }
}
