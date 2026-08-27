package com.sentiance.core.model.events;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$2$job$1;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewManager;
import com.google.re2j.Parser;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.routerefresh.QueuedRequest;
import com.mapbox.turf.models.LineIntersectsResult;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.overdue.data.IssueDataSource$reportIssue$1;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.login.domain.forgotpassword.usecase.GenerateMagicLinkUseCase$invoke$1;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$combine$1$3;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import com.roadrunner.settings.data.SettingsRepository$fetchSettings$1;
import com.roadrunner.settings.data.cache.SettingsCacheImpl;
import com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.FocusGroupPropertiesNodeonExit1;
import o.RelativeLayoutBounds;
import o.ShortNewsContentCardView;
import o.Transacter;
import o.accessgetInstancedelegatecp;
import o.boundingRectInRoot;
import o.copyOhffZ5M;
import o.createFromParcel;
import o.decode;
import o.fireWithUpdatedRectui;
import o.getContentViewGroupParentLayout;
import o.getError;
import o.getLiveRegiondelegate;
import o.getPostCommitHooksruntime;
import o.inCompatibilityMode;
import o.isHidden;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.lambda39;
import o.logPushCampaign;
import o.logPushDeliverylambda1;
import o.mergelambda1;
import o.onActivityCreatedlambda0;
import o.onItemDismiss;
import o.onMove;
import o.onRequestFocusInDescendants;
import o.onViewAttachedToWindowlambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.processAdapterUpdatesAndSetAnimationFlags;
import o.publishBrazePushAction;
import o.r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA;
import o.r8lambdaGjDZxd7jQZoBcNzNhpVRngZ6jXY;
import o.r8lambdaHxE6sSkUDFbx2FiDxd81Y0EkMuU;
import o.r8lambdaJ_QfP3gOiW8g_GLIRW39GJgv5OI;
import o.r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q;
import o.r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w;
import o.r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I;
import o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setSuccessfulruntime;
import o.setTextCompositionRangepsREZIo;
import o.showTextSubstitution;
import o.transferSessionPackageI;
import o.unpackInt2;
import okio.Path$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class N$b {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public Object IconCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public N$b(performCustomExitMxy_nc0 performcustomexitmxy_nc0, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        performcustomexitmxy_nc0.getClass();
        isopeninternalroom_runtime.getClass();
        this.read = performcustomexitmxy_nc0;
        this.write = isopeninternalroom_runtime;
        this.IconCompatParcelizer = new isRoot("preference_key_magic_link_timer");
        this.serializer = new isRoot("preference_key_otp_timer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$updateCache(N$b n$b, r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao r8lambdanyj3ixzjgs1drw4t7o1og6tkao, ContinuationImpl continuationImpl) {
        r8lambdaHxE6sSkUDFbx2FiDxd81Y0EkMuU r8lambdahxe6sskudfbx2fidxd81y0ekmuu;
        if (continuationImpl instanceof r8lambdaHxE6sSkUDFbx2FiDxd81Y0EkMuU) {
            r8lambdahxe6sskudfbx2fidxd81y0ekmuu = (r8lambdaHxE6sSkUDFbx2FiDxd81Y0EkMuU) continuationImpl;
            int i = r8lambdahxe6sskudfbx2fidxd81y0ekmuu.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                r8lambdahxe6sskudfbx2fidxd81y0ekmuu.write = i - Integer.MIN_VALUE;
            } else {
                r8lambdahxe6sskudfbx2fidxd81y0ekmuu = new r8lambdaHxE6sSkUDFbx2FiDxd81Y0EkMuU(n$b, continuationImpl);
            }
        } else {
            r8lambdahxe6sskudfbx2fidxd81y0ekmuu = new r8lambdaHxE6sSkUDFbx2FiDxd81Y0EkMuU(n$b, continuationImpl);
        }
        Object obj = r8lambdahxe6sskudfbx2fidxd81y0ekmuu.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = r8lambdahxe6sskudfbx2fidxd81y0ekmuu.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SettingsCacheImpl settingsCacheImpl = (SettingsCacheImpl) n$b.IconCompatParcelizer;
            r8lambdahxe6sskudfbx2fidxd81y0ekmuu.read = r8lambdanyj3ixzjgs1drw4t7o1og6tkao;
            r8lambdahxe6sskudfbx2fidxd81y0ekmuu.write = 1;
            if (settingsCacheImpl.set(r8lambdanyj3ixzjgs1drw4t7o1og6tkao, r8lambdahxe6sskudfbx2fidxd81y0ekmuu) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r8lambdanyj3ixzjgs1drw4t7o1og6tkao = r8lambdahxe6sskudfbx2fidxd81y0ekmuu.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        r8lambdaGjDZxd7jQZoBcNzNhpVRngZ6jXY r8lambdagjdzxd7jqzobcnznhpvrngz6jxy = (r8lambdaGjDZxd7jQZoBcNzNhpVRngZ6jXY) n$b.write;
        List<r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w> list = r8lambdanyj3ixzjgs1drw4t7o1og6tkao.promotions;
        r8lambdaJ_QfP3gOiW8g_GLIRW39GJgv5OI r8lambdaj_qfp3goiw8g_glirw39gjgv5oi = r8lambdagjdzxd7jqzobcnznhpvrngz6jxy.read;
        if (list == null) {
            r8lambdaj_qfp3goiw8g_glirw39gjgv5oi.serializer.clear();
        } else {
            r8lambdaj_qfp3goiw8g_glirw39gjgv5oi.getClass();
            Map map = r8lambdaj_qfp3goiw8g_glirw39gjgv5oi.serializer;
            map.getClass();
            synchronized (map) {
                r8lambdaj_qfp3goiw8g_glirw39gjgv5oi.serializer.clear();
                for (r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w : list) {
                    Map map2 = r8lambdaj_qfp3goiw8g_glirw39gjgv5oi.serializer;
                    map2.getClass();
                    map2.put(r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.type, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w);
                }
            }
        }
        return createFromParcel.INSTANCE;
    }

    public N$b(transferSessionPackageI transfersessionpackagei, showTextSubstitution showtextsubstitution, setTextCompositionRangepsREZIo settextcompositionrangepsrezio, Parser.Pair pair) {
        transfersessionpackagei.getClass();
        showtextsubstitution.getClass();
        settextcompositionrangepsrezio.getClass();
        pair.getClass();
        this.read = transfersessionpackagei;
        this.write = showtextsubstitution;
        this.IconCompatParcelizer = settextcompositionrangepsrezio;
        this.serializer = pair;
    }

    public N$b(decode decodeVar, getError geterror, InAppNotificationsRepository inAppNotificationsRepository, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        decodeVar.getClass();
        geterror.getClass();
        inAppNotificationsRepository.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.read = decodeVar;
        this.write = geterror;
        this.IconCompatParcelizer = inAppNotificationsRepository;
        this.serializer = getcontentviewgroupparentlayout;
    }

    public void runQueue() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (((QueuedRequest) this.IconCompatParcelizer) == null) {
            int i4 = i3 + 29;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            QueuedRequest queuedRequest = (QueuedRequest) this.serializer;
            if (queuedRequest != null) {
                this.IconCompatParcelizer = queuedRequest;
                this.serializer = null;
                queuedRequest.startCallback.invoke();
                BuildersKt.RemoteActionCompatParcelizer((ContextScope) this.write, null, null, new RealImageLoader$execute$2$job$1(this, queuedRequest, shortNewsContentCardView, 18), 3);
                int i6 = RemoteActionCompatParcelizer + 51;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
    }

    public N$b(mergelambda1 mergelambda1Var, ExecuteApiRequest executeApiRequest, unpackInt2 unpackint2, Path$Companion path$Companion) {
        mergelambda1Var.getClass();
        executeApiRequest.getClass();
        unpackint2.getClass();
        path$Companion.getClass();
        this.read = mergelambda1Var;
        this.write = executeApiRequest;
        this.IconCompatParcelizer = unpackint2;
        this.serializer = path$Companion;
    }

    public N$b(r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA r8lambdaekymoxv_2c6wlkkhzt5tho0_ya, H$b h$b, transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.read = r8lambdaekymoxv_2c6wlkkhzt5tho0_ya;
        this.write = h$b;
        this.IconCompatParcelizer = transfersessionpackagei;
        this.serializer = new PermissionModel(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.CAMERA, true);
    }

    public /* synthetic */ N$b(Object obj, Object obj2, Object obj3, Object obj4) {
        this.read = obj;
        this.write = obj2;
        this.IconCompatParcelizer = obj3;
        this.serializer = obj4;
    }

    public r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (((String) this.read) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'userid' is missing");
        } else if (((String) this.write) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdk_version' is missing");
        } else if (((Byte) this.IconCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'os' is missing");
        } else {
            if (((Short) this.serializer) != null) {
                r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY r8lambda0mdkurosxeirnighcqsvy2a8sfy = new r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY(this);
                int i3 = MediaDescriptionCompat + 95;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return r8lambda0mdkurosxeirnighcqsvy2a8sfy;
                }
                throw null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timezone' is missing");
        }
        int i4 = MediaDescriptionCompat + 29;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public static ArrayList write(List list) {
        int i = 2 % 2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        while (!(!it.hasNext())) {
            fireWithUpdatedRectui firewithupdatedrectui = (fireWithUpdatedRectui) it.next();
            String str = firewithupdatedrectui.RemoteActionCompatParcelizer;
            String str2 = firewithupdatedrectui.IconCompatParcelizer;
            String str3 = firewithupdatedrectui.write;
            copyOhffZ5M copyohffz5m = firewithupdatedrectui.serializer;
            int i2 = firewithupdatedrectui.RatingCompat;
            long j = firewithupdatedrectui.MediaSessionCompatQueueItem;
            String str4 = firewithupdatedrectui.MediaMetadataCompat;
            if (str4 == null) {
                int i3 = RemoteActionCompatParcelizer + 9;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                str4 = "";
            }
            arrayList.add(new RelativeLayoutBounds(str, str2, str3, copyohffz5m, i2, j, str4));
            int i5 = RemoteActionCompatParcelizer + 43;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 5 / 2;
            }
        }
        int i7 = MediaDescriptionCompat + 103;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public onActivityCreatedlambda0 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (((String) this.read) != null) {
                if (((Byte) this.IconCompatParcelizer) != null) {
                    return new onActivityCreatedlambda0(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'severity' is missing");
                int i3 = RemoteActionCompatParcelizer + 17;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'category' is missing");
            }
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q IconCompatParcelizer() {
        int i = 2 % 2;
        Object obj = null;
        if (((Byte) this.IconCompatParcelizer) != null) {
            int i2 = RemoteActionCompatParcelizer + 65;
            int i3 = i2 % Fields.SpotShadowColor;
            MediaDescriptionCompat = i3;
            int i4 = i2 % 2;
            if (((publishBrazePushAction) this.read) != null) {
                if (((logPushCampaign) this.write) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'app_status' is missing");
                } else {
                    int i5 = i3 + 95;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        if (((r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I) this.serializer) != null) {
                            return new r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q(this);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'device_status' is missing");
                    } else {
                        obj.hashCode();
                        throw null;
                    }
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdk_status' is missing");
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'trigger' is missing");
        }
        return null;
    }

    public LineIntersectsResult build() {
        String strConcat;
        int i = 2 % 2;
        if (((Boolean) this.IconCompatParcelizer) == null) {
            int i2 = RemoteActionCompatParcelizer + 39;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            strConcat = " onLine1";
        } else {
            strConcat = "";
        }
        if (((Boolean) this.serializer) == null) {
            int i3 = MediaDescriptionCompat + 9;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                strConcat.concat(" onLine2");
                throw null;
            }
            strConcat = strConcat.concat(" onLine2");
        }
        if (strConcat.isEmpty()) {
            return new LineIntersectsResult((Double) this.read, (Double) this.write, ((Boolean) this.IconCompatParcelizer).booleanValue(), ((Boolean) this.serializer).booleanValue());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: fetchSettings-IoAF18A, reason: not valid java name */
    public Object m5078fetchSettingsIoAF18A(ContinuationImpl continuationImpl) throws Throwable {
        SettingsRepository$fetchSettings$1 settingsRepository$fetchSettings$1;
        int i = 2 % 2;
        if (continuationImpl instanceof SettingsRepository$fetchSettings$1) {
            settingsRepository$fetchSettings$1 = (SettingsRepository$fetchSettings$1) continuationImpl;
            int i2 = settingsRepository$fetchSettings$1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = RemoteActionCompatParcelizer + 93;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                settingsRepository$fetchSettings$1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                settingsRepository$fetchSettings$1 = new SettingsRepository$fetchSettings$1(this, continuationImpl);
            }
        } else {
            settingsRepository$fetchSettings$1 = new SettingsRepository$fetchSettings$1(this, continuationImpl);
        }
        Object objWithContext = settingsRepository$fetchSettings$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = settingsRepository$fetchSettings$1.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 != 0) {
            int i6 = RemoteActionCompatParcelizer;
            int i7 = i6 + 67;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? i5 != 1 : i5 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = i6 + 31;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.serializer)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1(this, shortNewsContentCardView, 13);
            settingsRepository$fetchSettings$1.RemoteActionCompatParcelizer = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, rxConvertKt$asFlow$1, settingsRepository$fetchSettings$1);
            if (objWithContext == coroutineSingletons) {
                int i9 = MediaDescriptionCompat + 121;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons;
            }
        }
        Object obj = ((onItemDismiss) objWithContext).IconCompatParcelizer;
        int i11 = MediaDescriptionCompat + 53;
        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r1 r3
  0x002e: PHI (r1v9 o.getPostCommitHooksruntime) = (r1v8 o.getPostCommitHooksruntime), (r1v11 o.getPostCommitHooksruntime) binds: [B:10:0x002c, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x002e: PHI (r3v6 int) = (r3v5 int), (r3v8 int) binds: [B:10:0x002c, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public static final Object access$decodeFromJson(N$b n$b, String str, ContinuationImpl continuationImpl) {
        getPostCommitHooksruntime getpostcommithooksruntime;
        int i;
        int i2 = 2 % 2;
        n$b.getClass();
        if (continuationImpl instanceof getPostCommitHooksruntime) {
            int i3 = RemoteActionCompatParcelizer + 65;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                getpostcommithooksruntime = (getPostCommitHooksruntime) continuationImpl;
                i = getpostcommithooksruntime.serializer;
                int i4 = 43 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getpostcommithooksruntime.serializer = i - Integer.MIN_VALUE;
                } else {
                    getpostcommithooksruntime = new getPostCommitHooksruntime(n$b, continuationImpl);
                    int i5 = MediaDescriptionCompat + 7;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
            } else {
                getpostcommithooksruntime = (getPostCommitHooksruntime) continuationImpl;
                i = getpostcommithooksruntime.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getpostcommithooksruntime.serializer = i - Integer.MIN_VALUE;
                } else {
                    getpostcommithooksruntime = new getPostCommitHooksruntime(n$b, continuationImpl);
                    int i7 = MediaDescriptionCompat + 7;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
            }
        } else {
            getpostcommithooksruntime = new getPostCommitHooksruntime(n$b, continuationImpl);
            int i9 = MediaDescriptionCompat + 7;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        Object obj = getpostcommithooksruntime.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = getpostcommithooksruntime.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(setSuccessfulruntime.Companion.serializer());
                return (setSuccessfulruntime) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdp);
            } catch (Exception unused) {
                getpostcommithooksruntime.serializer = 1;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) n$b.read, new GetNestScope$invoke$3(n$b, shortNewsContentCardView, 21), getpostcommithooksruntime);
                if (objSerializer != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objSerializer = createFromParcel.INSTANCE;
                }
                if (objSerializer == obj2) {
                    int i12 = RemoteActionCompatParcelizer + 117;
                    MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    return obj2;
                }
            }
        } else {
            if (i11 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i14 = MediaDescriptionCompat + 89;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX INFO: renamed from: reportIssue-yxL6bBk, reason: not valid java name */
    public Object m5081reportIssueyxL6bBk(String str, String str2, String str3, FocusGroupPropertiesNodeonExit1 focusGroupPropertiesNodeonExit1, ContinuationImpl continuationImpl) {
        IssueDataSource$reportIssue$1 issueDataSource$reportIssue$1;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 41;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object obj = null;
        if (continuationImpl instanceof IssueDataSource$reportIssue$1) {
            int i5 = i2 + 55;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = ((IssueDataSource$reportIssue$1) continuationImpl).read;
                throw null;
            }
            issueDataSource$reportIssue$1 = (IssueDataSource$reportIssue$1) continuationImpl;
            int i7 = issueDataSource$reportIssue$1.read;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                issueDataSource$reportIssue$1.read = i7 - Integer.MIN_VALUE;
            } else {
                issueDataSource$reportIssue$1 = new IssueDataSource$reportIssue$1(this, continuationImpl);
            }
        } else {
            issueDataSource$reportIssue$1 = new IssueDataSource$reportIssue$1(this, continuationImpl);
        }
        IssueDataSource$reportIssue$1 issueDataSource$reportIssue$2 = issueDataSource$reportIssue$1;
        Object obj2 = issueDataSource$reportIssue$2.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = issueDataSource$reportIssue$2.read;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.write;
            TwoFaViewModel$onPinChanged$1 twoFaViewModel$onPinChanged$1 = new TwoFaViewModel$onPinChanged$1((Object) this, str2, str3, (Object) focusGroupPropertiesNodeonExit1, (Object) str, (ShortNewsContentCardView) null, 7);
            issueDataSource$reportIssue$2.read = 1;
            objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(twoFaViewModel$onPinChanged$1, issueDataSource$reportIssue$2);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = RemoteActionCompatParcelizer + 117;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            objM4875invokegIAlus = ((onItemDismiss) obj2).IconCompatParcelizer;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer != null) {
            ((Path$Companion) this.serializer).getClass();
            return new isItemDismissable(Path$Companion.IconCompatParcelizer(thSerializer));
        }
        int i11 = RemoteActionCompatParcelizer + 7;
        MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return createFromParcel.INSTANCE;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (r9 == r2) goto L29;
     */
    /* JADX INFO: renamed from: getRecentDeliveries-IoAF18A$implementation, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m5079getRecentDeliveriesIoAF18A$implementation(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r9 instanceof com.roadrunner.recentdeliveries.data.RecentDeliveriesRepository$getRecentDeliveries$1
            if (r1 == 0) goto L26
            r1 = r9
            com.roadrunner.recentdeliveries.data.RecentDeliveriesRepository$getRecentDeliveries$1 r1 = (com.roadrunner.recentdeliveries.data.RecentDeliveriesRepository$getRecentDeliveries$1) r1
            int r2 = r1.serializer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L26
            int r9 = com.sentiance.core.model.events.N$b.RemoteActionCompatParcelizer
            int r9 = r9 + 119
            int r4 = r9 % 128
            com.sentiance.core.model.events.N$b.MediaDescriptionCompat = r4
            int r9 = r9 % r0
            if (r9 != 0) goto L22
            int r9 = r2 << r3
            r1.serializer = r9
            goto L2b
        L22:
            int r2 = r2 + r3
            r1.serializer = r2
            goto L2b
        L26:
            com.roadrunner.recentdeliveries.data.RecentDeliveriesRepository$getRecentDeliveries$1 r1 = new com.roadrunner.recentdeliveries.data.RecentDeliveriesRepository$getRecentDeliveries$1
            r1.<init>(r8, r9)
        L2b:
            java.lang.Object r9 = r1.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.serializer
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L5b
            int r6 = com.sentiance.core.model.events.N$b.MediaDescriptionCompat
            int r6 = r6 + 21
            int r7 = r6 % 128
            com.sentiance.core.model.events.N$b.RemoteActionCompatParcelizer = r7
            int r6 = r6 % r0
            if (r3 == r4) goto L53
            int r7 = r7 + 25
            int r1 = r7 % 128
            com.sentiance.core.model.events.N$b.MediaDescriptionCompat = r1
            int r7 = r7 % r0
            if (r3 != r0) goto L4d
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)     // Catch: java.lang.Throwable -> La3
            goto La0
        L4d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r5
        L53:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            o.onItemDismiss r9 = (o.onItemDismiss) r9
            java.lang.Object r9 = r9.IconCompatParcelizer
            goto L72
        L5b:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            java.lang.Object r9 = r8.write
            com.roadrunner.common.data.api.ExecuteApiRequest r9 = (com.roadrunner.common.data.api.ExecuteApiRequest) r9
            com.mapbox.navigation.core.MapboxNavigation$parsing$2 r3 = new com.mapbox.navigation.core.MapboxNavigation$parsing$2
            r6 = 20
            r3.<init>(r8, r5, r6)
            r1.serializer = r4
            java.lang.Object r9 = r9.m4875invokegIAlus(r3, r1)
            if (r9 != r2) goto L72
            goto L96
        L72:
            boolean r3 = r9 instanceof o.isItemDismissable
            if (r3 != 0) goto Laa
            o.processSessionI r9 = (o.processSessionI) r9     // Catch: java.lang.Throwable -> La3
            java.lang.Object r3 = r8.serializer     // Catch: java.lang.Throwable -> La3
            com.sentiance.core.model.events.C$b r3 = (com.sentiance.core.model.events.C$b) r3     // Catch: java.lang.Throwable -> La3
            r1.serializer = r0     // Catch: java.lang.Throwable -> La3
            java.lang.Object r4 = r3.IconCompatParcelizer     // Catch: java.lang.Throwable -> La3
            o.isOpenInternalroom_runtime r4 = (o.isOpenInternalroom_runtime) r4     // Catch: java.lang.Throwable -> La3
            o.inCompatibilityMode r4 = (o.inCompatibilityMode) r4     // Catch: java.lang.Throwable -> La3
            r4.getClass()     // Catch: java.lang.Throwable -> La3
            kotlinx.coroutines.scheduling.DefaultScheduler r4 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> La3
            com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1 r6 = new com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1     // Catch: java.lang.Throwable -> La3
            r7 = 11
            r6.<init>(r9, r3, r5, r7)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r4, r6, r1)     // Catch: java.lang.Throwable -> La3
            if (r9 != r2) goto La0
        L96:
            int r9 = com.sentiance.core.model.events.N$b.RemoteActionCompatParcelizer
            int r9 = r9 + 37
            int r1 = r9 % 128
            com.sentiance.core.model.events.N$b.MediaDescriptionCompat = r1
            int r9 = r9 % r0
            return r2
        La0:
            o.trackNewSessionI r9 = (o.trackNewSessionI) r9     // Catch: java.lang.Throwable -> La3
            return r9
        La3:
            r9 = move-exception
            o.isItemDismissable r1 = new o.isItemDismissable
            r1.<init>(r9)
            r9 = r1
        Laa:
            int r1 = com.sentiance.core.model.events.N$b.MediaDescriptionCompat
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.sentiance.core.model.events.N$b.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.core.model.events.N$b.m5079getRecentDeliveriesIoAF18A$implementation(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: invoke-0E7RQCE, reason: not valid java name */
    public Object m5080invoke0E7RQCE(String str, boolean z, ContinuationImpl continuationImpl) {
        GenerateMagicLinkUseCase$invoke$1 generateMagicLinkUseCase$invoke$1;
        Object objM4865generateMagicLinkhUnOzRk;
        int i = 2 % 2;
        OtpLogger otpLogger = (OtpLogger) this.IconCompatParcelizer;
        if (continuationImpl instanceof GenerateMagicLinkUseCase$invoke$1) {
            generateMagicLinkUseCase$invoke$1 = (GenerateMagicLinkUseCase$invoke$1) continuationImpl;
            int i2 = generateMagicLinkUseCase$invoke$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                generateMagicLinkUseCase$invoke$1.write = i2 - Integer.MIN_VALUE;
            } else {
                generateMagicLinkUseCase$invoke$1 = new GenerateMagicLinkUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            generateMagicLinkUseCase$invoke$1 = new GenerateMagicLinkUseCase$invoke$1(this, continuationImpl);
        }
        GenerateMagicLinkUseCase$invoke$1 generateMagicLinkUseCase$invoke$2 = generateMagicLinkUseCase$invoke$1;
        Object obj = generateMagicLinkUseCase$invoke$2.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = generateMagicLinkUseCase$invoke$2.write;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SignInDataStore signInDataStore = (SignInDataStore) this.read;
            String str2 = ((boundingRectInRoot) this.write).write().countryCode;
            String language = Locale.getDefault().getLanguage();
            language.getClass();
            generateMagicLinkUseCase$invoke$2.IconCompatParcelizer = z;
            generateMagicLinkUseCase$invoke$2.write = 1;
            objM4865generateMagicLinkhUnOzRk = signInDataStore.m4865generateMagicLinkhUnOzRk(str, "implicit", "custom_password", str2, language, generateMagicLinkUseCase$invoke$2);
            if (objM4865generateMagicLinkhUnOzRk == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = generateMagicLinkUseCase$invoke$2.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4865generateMagicLinkhUnOzRk = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4865generateMagicLinkhUnOzRk instanceof isItemDismissable)) {
            int i4 = MediaDescriptionCompat + 117;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            otpLogger.RemoteActionCompatParcelizer(Transacter.EMAIL, z);
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4865generateMagicLinkhUnOzRk);
        if (thSerializer != null) {
            int i6 = RemoteActionCompatParcelizer + 19;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                Transacter transacter = Transacter.EMAIL;
                ((Path$Companion) this.serializer).getClass();
                otpLogger.read(Path$Companion.serializer(thSerializer).write, transacter, z);
                throw null;
            }
            Transacter transacter2 = Transacter.EMAIL;
            ((Path$Companion) this.serializer).getClass();
            otpLogger.read(Path$Companion.serializer(thSerializer).write, transacter2, z);
        }
        return objM4865generateMagicLinkhUnOzRk;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    public Object launchAppReview(MainActivity mainActivity, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        isHidden ishidden;
        int i = 2 % 2;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.serializer;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (shortNewsContentCardView instanceof isHidden) {
            int i2 = RemoteActionCompatParcelizer + 125;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((isHidden) shortNewsContentCardView).IconCompatParcelizer;
                throw null;
            }
            ishidden = (isHidden) shortNewsContentCardView;
            int i4 = ishidden.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ishidden.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
                int i5 = MediaDescriptionCompat + 93;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                ishidden = new isHidden(this, shortNewsContentCardView);
            }
        } else {
            ishidden = new isHidden(this, shortNewsContentCardView);
        }
        Object objWithContext = ishidden.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = ishidden.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        try {
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                if (!atomicBoolean.get()) {
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                    DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$1 = new DiskLruCache$launchCleanup$1(this, shortNewsContentCardView2, 13);
                    ishidden.read = mainActivity;
                    ishidden.IconCompatParcelizer = 1;
                    objWithContext = BuildersKt.withContext(defaultIoScheduler, diskLruCache$launchCleanup$1, ishidden);
                    if (objWithContext == coroutineSingletons) {
                        int i8 = RemoteActionCompatParcelizer;
                        int i9 = i8 + 69;
                        MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        int i11 = i8 + 59;
                        MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        return coroutineSingletons;
                    }
                }
                return createfromparcel;
            }
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = RemoteActionCompatParcelizer + 93;
            MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                mainActivity = ishidden.read;
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                int i14 = 46 / 0;
            } else {
                mainActivity = ishidden.read;
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            }
            ReviewManager reviewManager = (ReviewManager) objWithContext;
            if (reviewManager != null && atomicBoolean.compareAndSet(false, true)) {
                ((OtpLogger) this.IconCompatParcelizer).IconCompatParcelizer.logEvent("in_app_review_triggered", null);
                Task taskRequestReviewFlow = reviewManager.requestReviewFlow();
                taskRequestReviewFlow.getClass();
                taskRequestReviewFlow.addOnCompleteListener(new ArrivalProgressObserver$$ExternalSyntheticLambda0(reviewManager, 11, mainActivity)).getClass();
                return createfromparcel;
            }
            return createfromparcel;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "App review flow request is failed with a general exception", new Object[0]);
            int i15 = MediaDescriptionCompat + 93;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                return createfromparcel;
            }
            shortNewsContentCardView2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    public static final Serializable access$baseParamMap(N$b n$b, ContinuationImpl continuationImpl) throws Throwable {
        onRequestFocusInDescendants onrequestfocusindescendants;
        LinkedHashMap linkedHashMapIconCompatParcelizer;
        int i = 2 % 2;
        n$b.getClass();
        if (continuationImpl instanceof onRequestFocusInDescendants) {
            onrequestfocusindescendants = (onRequestFocusInDescendants) continuationImpl;
            int i2 = onrequestfocusindescendants.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaDescriptionCompat + 65;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    onrequestfocusindescendants.serializer = i2 >> Integer.MIN_VALUE;
                } else {
                    onrequestfocusindescendants.serializer = i2 - Integer.MIN_VALUE;
                }
                int i4 = RemoteActionCompatParcelizer + 11;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                onrequestfocusindescendants = new onRequestFocusInDescendants(n$b, continuationImpl);
            }
        } else {
            onrequestfocusindescendants = new onRequestFocusInDescendants(n$b, continuationImpl);
        }
        Object objWithContext = onrequestfocusindescendants.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = onrequestfocusindescendants.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            InAppNotificationsRepository inAppNotificationsRepository = (InAppNotificationsRepository) n$b.IconCompatParcelizer;
            onrequestfocusindescendants.serializer = 1;
            ((inCompatibilityMode) inAppNotificationsRepository.write).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new DividerUiModelImpl$1(inAppNotificationsRepository, shortNewsContentCardView, 15), onrequestfocusindescendants);
            if (objWithContext == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i7 = RemoteActionCompatParcelizer + 111;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return null;
                }
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        processAdapterUpdatesAndSetAnimationFlags processadapterupdatesandsetanimationflags = (processAdapterUpdatesAndSetAnimationFlags) objWithContext;
        if (processadapterupdatesandsetanimationflags == null) {
            Timber.RemoteActionCompatParcelizer.write(new IllegalStateException("analyticsData is null, returning empty map"));
            linkedHashMapIconCompatParcelizer = new LinkedHashMap();
        } else {
            linkedHashMapIconCompatParcelizer = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0(PushNotificationParserObj.MESSAGE_ID_KEY, processadapterupdatesandsetanimationflags.RemoteActionCompatParcelizer), new onViewAttachedToWindowlambda0("campaign_id", processadapterupdatesandsetanimationflags.IconCompatParcelizer), new onViewAttachedToWindowlambda0("execution_id", processadapterupdatesandsetanimationflags.serializer), new onViewAttachedToWindowlambda0("template_id", processadapterupdatesandsetanimationflags.read), new onViewAttachedToWindowlambda0("notification_id", processadapterupdatesandsetanimationflags.write));
        }
        String strSerializer = ((getLiveRegiondelegate) ((getError) n$b.write)).serializer();
        if (strSerializer != null) {
            int i8 = RemoteActionCompatParcelizer + 85;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                linkedHashMapIconCompatParcelizer.put("rider_id", strSerializer);
                int i9 = 36 / 0;
            } else {
                linkedHashMapIconCompatParcelizer.put("rider_id", strSerializer);
            }
        }
        return linkedHashMapIconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[PHI: r8
  0x00b0: PHI (r8v22 java.lang.Boolean) = (r8v21 java.lang.Boolean), (r8v28 java.lang.Boolean) binds: [B:37:0x00ae, B:34:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r8 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r8.booleanValue() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        if (r8 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r7.booleanValue() == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.roadrunner.realtime.domain.GetAppStateImpl r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.core.model.events.N$b.invoke(com.roadrunner.realtime.domain.GetAppStateImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public SettingsViewModel$special$$inlined$map$1 write() {
        int i = 2 % 2;
        logPushDeliverylambda1 logpushdeliverylambda1 = (logPushDeliverylambda1) this.read;
        SettingsViewModel$special$$inlined$map$1 settingsViewModel$special$$inlined$map$1 = new SettingsViewModel$special$$inlined$map$1(logpushdeliverylambda1.IconCompatParcelizer.write().serializer(), 18, logpushdeliverylambda1);
        ((inCompatibilityMode) logpushdeliverylambda1.RemoteActionCompatParcelizer).getClass();
        FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(FlowKt.RemoteActionCompatParcelizer(settingsViewModel$special$$inlined$map$1, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer));
        lambda39 lambda39Var = (lambda39) this.write;
        int i2 = 17;
        SettingsViewModel$special$$inlined$map$1 settingsViewModel$special$$inlined$map$2 = new SettingsViewModel$special$$inlined$map$1(lambda39Var.write.write().serializer(), i2, lambda39Var);
        ((inCompatibilityMode) lambda39Var.IconCompatParcelizer).getClass();
        SettingsViewModel$special$$inlined$map$1 settingsViewModel$special$$inlined$map$3 = new SettingsViewModel$special$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, FlowKt.RemoteActionCompatParcelizer(settingsViewModel$special$$inlined$map$2, DefaultIoScheduler.RemoteActionCompatParcelizer), new SettingsViewModel$special$$inlined$combine$1$3(this, (ShortNewsContentCardView) null, i2)), 19, (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) this.IconCompatParcelizer);
        int i3 = MediaDescriptionCompat + 69;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return settingsViewModel$special$$inlined$map$3;
    }

    public N$b() {
    }
}
