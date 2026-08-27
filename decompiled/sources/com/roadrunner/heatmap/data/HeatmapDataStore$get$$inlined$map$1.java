package com.roadrunner.heatmap.data;

import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.huawei.location.nlp.scan.FB;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.country.config.implementation.data.database.CountryConfigListLocalDataSource;
import com.roadrunner.delivery.accept.backToBackOrder.domain.ObserveBackToBackOrdersStateImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureRepository;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.usecase.ObserveEntrancePicture;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShowNavigationSettingsTooltipUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.delivery.repository.StateV3DeliveryProvider;
import com.roadrunner.delivery.state.DestinationLocation;
import com.roadrunner.delivery.state.StateDataStoreImpl;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import com.roadrunner.freelancing.domain.HasWorkNowOpportunityImpl$invoke$$inlined$map$1;
import com.roadrunner.freelancing.presentation.tab.ShouldShowTabs;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl$special$$inlined$map$1$2;
import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import com.roadrunner.login.logging.RouterLogger;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.ContextScope;
import o.AdjustEvent;
import o.AndroidViewHolderlayoutNode12;
import o.AndroidViewHolderlayoutNode1coreModifier3;
import o.AndroidViewHolderrelease1;
import o.FragmentManagerFragmentLifecycleCallbacks;
import o.FragmentTagUsageViolation;
import o.LineBreak_androidKt;
import o.Person;
import o.RemoteActionCompat;
import o.SetRetainInstanceUsageViolation;
import o.ShadowSaverlambda0;
import o.ShadowSpan;
import o.ShortNewsContentCardView;
import o.WindowInsetsCompatImpl30;
import o.accessgetGocp;
import o.accessgetInstancedelegatecp;
import o.accessgetMiddleEllipsiscp;
import o.accesslayoutAccordingTo;
import o.checkRevenue;
import o.considerReleasingGlowsOnScroll;
import o.createAndroidViewNodeFactory;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.fastCoerceAtMost;
import o.findFragmentById;
import o.getCieXyz;
import o.getDeduplicationId;
import o.getMToDpValuesannotations;
import o.getNoActiveChildannotations;
import o.getNotificationChannelsCompat;
import o.getSimplefcGXIks;
import o.getTouchaOaMEAU;
import o.hasFontAttributes;
import o.isItemDismissable;
import o.isRoot;
import o.isTrackingEnabled;
import o.isUnspecifiedR2X_6o;
import o.lerpC3pnCVY;
import o.markFragmentsCreated;
import o.maybeRegisterBackCallback;
import o.onContentCardDismissed;
import o.onFragmentResumed;
import o.onFragmentStarted;
import o.onInitializeAccessibilityEvent;
import o.onInitialized;
import o.onItemDismiss;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdat1peidAd9PyU23jWJ4Oj0nfx3d4;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.sc;
import o.setBulletSpans;
import o.setGraphicModalMaxWidthDp;
import o.timesmpE4wyQ;
import o.toComposeVelocity;
import o.vg;
import okio.Path$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class HeatmapDataStore$get$$inlined$map$1 implements Flow {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Flow read;
    public final /* synthetic */ int write;

    /* JADX INFO: renamed from: com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int IconCompatParcelizer = 0;
        private static int write = 1;
        public final /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ Object read;
        public final /* synthetic */ int serializer;

        public AnonymousClass2(createInAppMessageEventSubscriber createinappmessageeventsubscriber, FlowCollector flowCollector) {
            this.serializer = 14;
            this.read = createinappmessageeventsubscriber;
            this.RemoteActionCompatParcelizer = flowCollector;
        }

        public /* synthetic */ AnonymousClass2(Object obj, int i, Object obj2) {
            this.serializer = i;
            this.RemoteActionCompatParcelizer = obj;
            this.read = obj2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        private final Object emit$com$roadrunner$home$floatinglayer$config$GetFloatingLayerScope$invoke$lambda$0$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            FragmentTagUsageViolation fragmentTagUsageViolation;
            int i = 2 % 2;
            if (!(!(shortNewsContentCardView instanceof FragmentTagUsageViolation))) {
                fragmentTagUsageViolation = (FragmentTagUsageViolation) shortNewsContentCardView;
                int i2 = fragmentTagUsageViolation.RemoteActionCompatParcelizer;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fragmentTagUsageViolation.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
                } else {
                    fragmentTagUsageViolation = new FragmentTagUsageViolation(this, shortNewsContentCardView);
                }
            } else {
                fragmentTagUsageViolation = new FragmentTagUsageViolation(this, shortNewsContentCardView);
            }
            Object obj2 = fragmentTagUsageViolation.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = fragmentTagUsageViolation.RemoteActionCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
                onFragmentResumed onfragmentresumed = new onFragmentResumed((ContextScope) this.read, (onFragmentStarted) obj);
                fragmentTagUsageViolation.RemoteActionCompatParcelizer = 1;
                if (flowCollector.emit(onfragmentresumed, fragmentTagUsageViolation) == coroutineSingletons) {
                    int i4 = write + 87;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i6 = write + 71;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    Object obj3 = null;
                    if (i6 % 2 == 0) {
                        return null;
                    }
                    obj3.hashCode();
                    throw null;
                }
                int i7 = write + 51;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    int i8 = 16 / 0;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                }
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001f  */
        private final Object emit$com$roadrunner$delivery$state$StateDataStoreImpl$observeState$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            toComposeVelocity tocomposevelocity;
            int i = 2 % 2;
            if (shortNewsContentCardView instanceof toComposeVelocity) {
                tocomposevelocity = (toComposeVelocity) shortNewsContentCardView;
                int i2 = tocomposevelocity.serializer;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    int i3 = IconCompatParcelizer + 81;
                    write = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    tocomposevelocity.serializer = i2 - Integer.MIN_VALUE;
                } else {
                    tocomposevelocity = new toComposeVelocity(this, shortNewsContentCardView);
                }
            } else {
                tocomposevelocity = new toComposeVelocity(this, shortNewsContentCardView);
            }
            Object obj2 = tocomposevelocity.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = tocomposevelocity.serializer;
            if (i5 != 0) {
                int i6 = write + 87;
                int i7 = i6 % Fields.SpotShadowColor;
                IconCompatParcelizer = i7;
                Object obj3 = null;
                if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = i7 + 69;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    obj3.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
                Object objSerializer = ((getNoActiveChildannotations) obj).serializer(((StateDataStoreImpl) this.read).read);
                tocomposevelocity.serializer = 1;
                if (flowCollector.emit(objSerializer, tocomposevelocity) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027  */
        private final Object emit$com$roadrunner$delivery$repository$StateV3DeliveryProvider$deliveryInformationFlow$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            lerpC3pnCVY lerpc3pncvy;
            int i = 2 % 2;
            if (shortNewsContentCardView instanceof lerpC3pnCVY) {
                int i2 = IconCompatParcelizer + 85;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = ((lerpC3pnCVY) shortNewsContentCardView).write;
                    throw null;
                }
                lerpc3pncvy = (lerpC3pnCVY) shortNewsContentCardView;
                int i4 = lerpc3pncvy.write;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    lerpc3pncvy.write = i4 - Integer.MIN_VALUE;
                } else {
                    lerpc3pncvy = new lerpC3pnCVY(this, shortNewsContentCardView);
                }
            } else {
                lerpc3pncvy = new lerpC3pnCVY(this, shortNewsContentCardView);
            }
            Object obj2 = lerpc3pncvy.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = lerpc3pncvy.write;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
                ((StateV3DeliveryProvider) this.read).getClass();
                timesmpE4wyQ timesmpe4wyqWrite = StateV3DeliveryProvider.write((isUnspecifiedR2X_6o) obj);
                lerpc3pncvy.write = 1;
                if (flowCollector.emit(timesmpe4wyqWrite, lerpc3pncvy) == coroutineSingletons) {
                    int i6 = IconCompatParcelizer + 33;
                    write = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        int i7 = 31 / 0;
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001e  */
        private final Object emit$com$roadrunner$freelancing$domain$InitializeDefaultWorkTab$invoke$$inlined$map$2$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            onInitializeAccessibilityEvent oninitializeaccessibilityevent;
            sc scVar;
            int i = 2 % 2;
            vg vgVar = (vg) ((ProtobufEncoder) this.read).RemoteActionCompatParcelizer;
            if (shortNewsContentCardView instanceof onInitializeAccessibilityEvent) {
                oninitializeaccessibilityevent = (onInitializeAccessibilityEvent) shortNewsContentCardView;
                int i2 = oninitializeaccessibilityevent.write;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oninitializeaccessibilityevent.write = i2 - Integer.MIN_VALUE;
                } else {
                    oninitializeaccessibilityevent = new onInitializeAccessibilityEvent(this, shortNewsContentCardView);
                }
            } else {
                oninitializeaccessibilityevent = new onInitializeAccessibilityEvent(this, shortNewsContentCardView);
            }
            Object obj2 = oninitializeaccessibilityevent.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = oninitializeaccessibilityevent.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
            Person person = (Person) obj;
            if (((sc) vgVar.write.read()) != null) {
                int i4 = write + 55;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                if (person instanceof RemoteActionCompat) {
                    int i6 = write + 47;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    scVar = sc.START_NOW;
                } else {
                    if (!(person instanceof getNotificationChannelsCompat)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    scVar = sc.SCHEDULE;
                }
                vgVar.write.IconCompatParcelizer(scVar);
            }
            oninitializeaccessibilityevent.write = 1;
            return flowCollector.emit(createfromparcel, oninitializeaccessibilityevent) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:8:0x0025  */
        private final Object emit$com$roadrunner$freelancing$presentation$tab$ShouldShowTabs$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            WindowInsetsCompatImpl30 windowInsetsCompatImpl30;
            Boolean bool;
            int i = 2 % 2;
            if (!(shortNewsContentCardView instanceof WindowInsetsCompatImpl30)) {
                windowInsetsCompatImpl30 = new WindowInsetsCompatImpl30(this, shortNewsContentCardView);
            } else {
                windowInsetsCompatImpl30 = (WindowInsetsCompatImpl30) shortNewsContentCardView;
                int i2 = windowInsetsCompatImpl30.RemoteActionCompatParcelizer;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    int i3 = write + 91;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    windowInsetsCompatImpl30.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
                } else {
                    windowInsetsCompatImpl30 = new WindowInsetsCompatImpl30(this, shortNewsContentCardView);
                }
            }
            Object obj2 = windowInsetsCompatImpl30.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = windowInsetsCompatImpl30.RemoteActionCompatParcelizer;
            getDeduplicationId getdeduplicationid = null;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
                checkRevenue checkrevenue = (checkRevenue) obj;
                if (checkrevenue.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer != isTrackingEnabled.NOT_WORKING) {
                    bool = Boolean.FALSE;
                } else {
                    String str = ((ShouldShowTabs) this.read).serializer.read();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "ON_DEMAND"}, getCieXyz.write())).booleanValue() || str == null) {
                        bool = Boolean.FALSE;
                    } else {
                        int i6 = IconCompatParcelizer + 21;
                        write = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (str.length() == 0) {
                            bool = Boolean.FALSE;
                        } else {
                            AdjustEvent adjustEvent = checkrevenue.read;
                            if (adjustEvent != null) {
                                int i8 = IconCompatParcelizer + 121;
                                write = i8 % Fields.SpotShadowColor;
                                if (i8 % 2 == 0) {
                                    getDeduplicationId getdeduplicationid2 = adjustEvent.MediaSessionCompatQueueItem;
                                    getdeduplicationid.hashCode();
                                    throw null;
                                }
                                getdeduplicationid = adjustEvent.MediaSessionCompatQueueItem;
                            }
                            if (getdeduplicationid != getDeduplicationId.UPCOMING) {
                                int i9 = write + 105;
                                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                                int i10 = i9 % 2;
                                if (getdeduplicationid == getDeduplicationId.LATE) {
                                    bool = Boolean.FALSE;
                                } else {
                                    bool = Boolean.TRUE;
                                }
                            } else {
                                bool = Boolean.FALSE;
                            }
                        }
                    }
                }
                windowInsetsCompatImpl30.RemoteActionCompatParcelizer = 1;
                if (flowCollector.emit(bool, windowInsetsCompatImpl30) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001f  */
        private final Object emit$com$roadrunner$delivery$state$StateProviderImpl$special$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            createAndroidViewNodeFactory createandroidviewnodefactory;
            Object isitemdismissable;
            int i = 2 % 2;
            if (shortNewsContentCardView instanceof createAndroidViewNodeFactory) {
                int i2 = IconCompatParcelizer + 17;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                createandroidviewnodefactory = (createAndroidViewNodeFactory) shortNewsContentCardView;
                int i4 = createandroidviewnodefactory.write;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    createandroidviewnodefactory.write = i4 - Integer.MIN_VALUE;
                } else {
                    createandroidviewnodefactory = new createAndroidViewNodeFactory(this, shortNewsContentCardView);
                }
            } else {
                createandroidviewnodefactory = new createAndroidViewNodeFactory(this, shortNewsContentCardView);
            }
            Object obj2 = createandroidviewnodefactory.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = createandroidviewnodefactory.write;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
                accesslayoutAccordingTo accesslayoutaccordingto = (accesslayoutAccordingTo) obj;
                String str = (String) accesslayoutaccordingto.serializer;
                Throwable illegalStateException = accesslayoutaccordingto.read;
                if (str == null) {
                    if (illegalStateException == null) {
                        illegalStateException = new IllegalStateException("State data is null");
                    }
                    isitemdismissable = new isItemDismissable(illegalStateException);
                } else {
                    try {
                        resetTransientState resettransientstate = (resetTransientState) ((StateProviderImpl) this.read).write.MediaSessionCompatResultReceiverWrapper();
                        resettransientstate.getClass();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = maybeRegisterBackCallback.Companion.serializer();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                        isitemdismissable = (maybeRegisterBackCallback) resettransientstate.serializer(str, setgraphicmodalmaxwidthdpSerializer);
                    } catch (Exception e) {
                        Timber.RemoteActionCompatParcelizer.write(new Throwable("State V3 parsing failure StateV3Response, ".concat(str), e));
                        isitemdismissable = new isItemDismissable(e);
                    }
                }
                onItemDismiss onitemdismiss = new onItemDismiss(isitemdismissable);
                createandroidviewnodefactory.write = 1;
                if (flowCollector.emit(onitemdismiss, createandroidviewnodefactory) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = write + 33;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
            return createFromParcel.INSTANCE;
        }

        private final Object read(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            markFragmentsCreated markfragmentscreated = (markFragmentsCreated) this.RemoteActionCompatParcelizer;
            onFragmentStarted onfragmentstarted = (onFragmentStarted) this.read;
            onfragmentstarted.getClass();
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = onfragmentstarted.write;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                int i2 = write + 11;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                if (((Boolean) ((FragmentManagerFragmentLifecycleCallbacks) obj2).write.IconCompatParcelizer().read()).booleanValue()) {
                    int i4 = write + 111;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        arrayList.add(obj2);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (((FragmentManagerFragmentLifecycleCallbacks) obj4).IconCompatParcelizer == SetRetainInstanceUsageViolation.TOP) {
                    arrayList2.add(obj4);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj5 : arrayList) {
                if (((FragmentManagerFragmentLifecycleCallbacks) obj5).IconCompatParcelizer == SetRetainInstanceUsageViolation.BOTTOM) {
                    arrayList3.add(obj5);
                }
            }
            markfragmentscreated.serializer.IconCompatParcelizer(new findFragmentById(Path$Companion.IconCompatParcelizer(arrayList2, SetRetainInstanceUsageViolation.TOP), Path$Companion.IconCompatParcelizer(arrayList3, SetRetainInstanceUsageViolation.BOTTOM)));
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i5 = write + 101;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 0 / 0;
            }
            return createfromparcel;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0023  */
        private final Object emit$com$roadrunner$delivery$ontheway$routepreview$mapbox$domain$ObserveNavigationPointsForRoutePreview$collectStateProvider$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
            setBulletSpans setbulletspans;
            int i;
            hasFontAttributes hasfontattributes;
            AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier3;
            Object next;
            DestinationLocation destinationLocation;
            setBulletSpans setbulletspans2;
            int i2 = 2;
            int i3 = 2 % 2;
            if (shortNewsContentCardView instanceof setBulletSpans) {
                int i4 = write + 55;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                setbulletspans = (setBulletSpans) shortNewsContentCardView;
                int i6 = setbulletspans.IconCompatParcelizer;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    setbulletspans.IconCompatParcelizer = i6 - Integer.MIN_VALUE;
                } else {
                    setbulletspans = new setBulletSpans(this, shortNewsContentCardView);
                }
            } else {
                setbulletspans = new setBulletSpans(this, shortNewsContentCardView);
            }
            Object obj2 = setbulletspans.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = setbulletspans.IconCompatParcelizer;
            boolean z = true;
            Throwable th = null;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
                Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
                if (obj3 instanceof isItemDismissable) {
                    int i8 = write + 21;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        th.hashCode();
                        throw null;
                    }
                    obj3 = null;
                }
                fastCoerceAtMost fastcoerceatmost = (fastCoerceAtMost) obj3;
                if (fastcoerceatmost == null || (androidViewHolderlayoutNode1coreModifier3 = fastcoerceatmost.mapComponent) == null) {
                    setbulletspans = setbulletspans;
                    i = 1;
                    hasfontattributes = null;
                } else {
                    DestinationLocation destinationLocation2 = androidViewHolderlayoutNode1coreModifier3.destinationLocation;
                    LineBreak_androidKt lineBreak_androidKt = (LineBreak_androidKt) ((WorkerWrapper.Builder) this.read).RemoteActionCompatParcelizer;
                    accessgetGocp accessgetgocp = new accessgetGocp(destinationLocation2.serializer(), destinationLocation2.RemoteActionCompatParcelizer());
                    List listSerializer = onContentCardDismissed.serializer(androidViewHolderlayoutNode1coreModifier3.pins, new FB(26));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj4 : listSerializer) {
                        Integer numValueOf = Integer.valueOf(((AndroidViewHolderrelease1) obj4).write());
                        Object arrayList = linkedHashMap.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(numValueOf, arrayList);
                        }
                        ((List) arrayList).add(obj4);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext() == z) {
                        Map.Entry entry = (Map.Entry) it.next();
                        List list = (List) entry.getValue();
                        if ((list instanceof Collection) && list.isEmpty()) {
                            setbulletspans2 = setbulletspans;
                            destinationLocation = destinationLocation2;
                            int i9 = write + 25;
                            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            break;
                            break;
                        }
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                setbulletspans2 = setbulletspans;
                                destinationLocation = destinationLocation2;
                                int i11 = write + 25;
                                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                                int i12 = i11 % 2;
                                break;
                            }
                            AndroidViewHolderrelease1 androidViewHolderrelease1 = (AndroidViewHolderrelease1) it2.next();
                            destinationLocation = destinationLocation2;
                            setbulletspans2 = setbulletspans;
                            if (new accessgetGocp(androidViewHolderrelease1.serializer().RemoteActionCompatParcelizer(), androidViewHolderrelease1.serializer().read()).equals(accessgetgocp)) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                                break;
                            }
                            destinationLocation2 = destinationLocation;
                            setbulletspans = setbulletspans2;
                        }
                        destinationLocation2 = destinationLocation;
                        setbulletspans = setbulletspans2;
                        i2 = 2;
                        z = true;
                        th = null;
                    }
                    Set setKeySet = linkedHashMap2.keySet();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (!setKeySet.contains(Integer.valueOf(((Number) entry2.getKey()).intValue()))) {
                            int i13 = write + 121;
                            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % i2;
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    ArrayList<AndroidViewHolderlayoutNode12> arrayList2 = new ArrayList();
                    Iterator it3 = linkedHashMap3.entrySet().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((List) ((Map.Entry) it3.next()).getValue()).iterator();
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (it4.hasNext()) {
                                int iIconCompatParcelizer = ((AndroidViewHolderrelease1) next).IconCompatParcelizer();
                                do {
                                    Object next2 = it4.next();
                                    int iIconCompatParcelizer2 = ((AndroidViewHolderrelease1) next2).IconCompatParcelizer();
                                    if (iIconCompatParcelizer > iIconCompatParcelizer2) {
                                        iIconCompatParcelizer = iIconCompatParcelizer2;
                                        next = next2;
                                    }
                                } while (it4.hasNext());
                            }
                        } else {
                            int i15 = IconCompatParcelizer + 91;
                            write = i15 % Fields.SpotShadowColor;
                            if (i15 % i2 == 0) {
                                th.hashCode();
                                throw th;
                            }
                            next = th;
                        }
                        AndroidViewHolderrelease1 androidViewHolderrelease2 = (AndroidViewHolderrelease1) next;
                        Object objSerializer = androidViewHolderrelease2 != null ? androidViewHolderrelease2.serializer() : th;
                        if (objSerializer != null) {
                            int i16 = write + 55;
                            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                            if (i16 % i2 != 0) {
                                arrayList2.add(objSerializer);
                                th.hashCode();
                                throw th;
                            }
                            arrayList2.add(objSerializer);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                    int i17 = IconCompatParcelizer + 93;
                    write = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % i2;
                    for (AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 : arrayList2) {
                        arrayList3.add(new accessgetGocp(androidViewHolderlayoutNode12.RemoteActionCompatParcelizer(), androidViewHolderlayoutNode12.read()));
                    }
                    hasfontattributes = new hasFontAttributes(new getSimplefcGXIks(accessgetgocp, destinationLocation2.write().getCode(), lineBreak_androidKt.IconCompatParcelizer(), lineBreak_androidKt.serializer()), arrayList3);
                    i = 1;
                }
                setbulletspans.IconCompatParcelizer = i;
                if (flowCollector.emit(hasfontattributes, setbulletspans) == coroutineSingletons) {
                    int i19 = write + 5;
                    IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i7 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:106:0x029c  */
        /* JADX WARN: Code duplicated, block: B:113:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:168:0x02a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:171:0x02bd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x0383, code lost:
        
            if (r1.emit(r2, r3) == r5) goto L147;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x038d, code lost:
        
            if (r1.emit(r2, r3) == r5) goto L147;
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x038f, code lost:
        
            return r5;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.lang.Object emit$com$roadrunner$delivery$stacked$delivery$list$domain$ObserveStackedDeliveryList$invoke$$inlined$map$1$2(java.lang.Object r30, o.ShortNewsContentCardView r31) {
            /*
                Method dump skipped, instruction units count: 915
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1.AnonymousClass2.emit$com$roadrunner$delivery$stacked$delivery$list$domain$ObserveStackedDeliveryList$invoke$$inlined$map$1$2(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:115:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:145:0x022e  */
        /* JADX WARN: Code duplicated, block: B:186:0x02dc  */
        /* JADX WARN: Code duplicated, block: B:206:0x0329  */
        /* JADX WARN: Code duplicated, block: B:224:0x0371  */
        /* JADX WARN: Code duplicated, block: B:245:0x03ec  */
        /* JADX WARN: Code duplicated, block: B:26:0x006f  */
        /* JADX WARN: Code duplicated, block: B:304:0x0526  */
        /* JADX WARN: Code duplicated, block: B:341:0x0602  */
        /* JADX WARN: Code duplicated, block: B:347:0x0624  */
        /* JADX WARN: Code duplicated, block: B:348:0x0628  */
        /* JADX WARN: Code duplicated, block: B:359:0x0656  */
        /* JADX WARN: Code duplicated, block: B:391:0x06f1  */
        /* JADX WARN: Code duplicated, block: B:393:0x06f7  */
        /* JADX WARN: Code duplicated, block: B:395:0x06fb  */
        /* JADX WARN: Code duplicated, block: B:407:0x071c  */
        /* JADX WARN: Code duplicated, block: B:409:0x071f  */
        /* JADX WARN: Code duplicated, block: B:411:0x072b  */
        /* JADX WARN: Code duplicated, block: B:413:0x0737  */
        /* JADX WARN: Code duplicated, block: B:414:0x073e  */
        /* JADX WARN: Code duplicated, block: B:416:0x0746  */
        /* JADX WARN: Code duplicated, block: B:425:0x0778  */
        /* JADX WARN: Code duplicated, block: B:427:0x0786  */
        /* JADX WARN: Code duplicated, block: B:437:0x07ac  */
        /* JADX WARN: Code duplicated, block: B:454:0x0801  */
        /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:480:0x087c  */
        /* JADX WARN: Code duplicated, block: B:497:0x08bd  */
        /* JADX WARN: Code duplicated, block: B:523:0x0950  */
        /* JADX WARN: Code duplicated, block: B:540:0x09a6  */
        /* JADX WARN: Code duplicated, block: B:581:0x0a73  */
        /* JADX WARN: Code duplicated, block: B:616:0x0b09  */
        /* JADX WARN: Code duplicated, block: B:672:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:683:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:686:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:689:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:696:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:711:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x0156  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r23v0 */
        /* JADX WARN: Type inference failed for: r23v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r23v2 */
        /* JADX WARN: Type inference failed for: r25v0 */
        /* JADX WARN: Type inference failed for: r25v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r25v2 */
        /* JADX WARN: Type inference failed for: r5v0, types: [o.instance_delegatelambda0] */
        /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v53, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v54, types: [o.getStrictnessusljTpc] */
        /* JADX WARN: Type inference failed for: r8v38, types: [kotlinx.coroutines.flow.FlowCollector] */
        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v14 java.lang.Object, still in use, count: 2, list:
              (r12v14 java.lang.Object) from 0x0712: INSTANCE_OF (r12v14 java.lang.Object) A[WRAPPED] (LINE:1747) o.isPopupLayout
              (r12v14 java.lang.Object) from 0x0718: PHI (r12 I:??) = (r12v12 java.lang.Object), (r12v14 java.lang.Object) binds: [B:405:0x0717, B:654:0x0718] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(java.lang.Object r28, o.ShortNewsContentCardView r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2974
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
        }
    }

    public /* synthetic */ HeatmapDataStore$get$$inlined$map$1(Flow flow, Object obj, int i) {
        this.write = i;
        this.read = flow;
        this.IconCompatParcelizer = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.IconCompatParcelizer;
        Flow flow = this.read;
        int i3 = 1;
        int i4 = 24;
        int i5 = 21;
        int i6 = 15;
        int i7 = 16;
        int i8 = 8;
        int i9 = 0;
        int i10 = 5;
        Object obj2 = null;
        switch (i2) {
            case 0:
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, i9, (isRoot) obj), shortNewsContentCardView);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createfromparcel;
            case 1:
                Object objCollect2 = flow.collect(new AnonymousClass2(flowCollector, 3, (CardView$1) obj), shortNewsContentCardView);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : createfromparcel;
            case 2:
                Object objCollect3 = flow.collect(new AnonymousClass2(flowCollector, 4, (getTouchaOaMEAU) obj), shortNewsContentCardView);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : createfromparcel;
            case 3:
                Object objCollect4 = flow.collect(new AnonymousClass2(flowCollector, 6, (InitializeAppStartupItemsImpl) obj), shortNewsContentCardView);
                if (objCollect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i11 = RemoteActionCompatParcelizer + 51;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    return objCollect4;
                }
                obj2.hashCode();
                throw null;
            case 4:
                Object objCollect5 = ((FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) flow).collect(new AnonymousClass2(flowCollector, i8, (CountryConfigListLocalDataSource) obj), shortNewsContentCardView);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : createfromparcel;
            case 5:
                Object objCollect6 = flow.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, (ShadowSaverlambda0) obj, 11), shortNewsContentCardView);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : createfromparcel;
            case 6:
                Object objCollect7 = ((FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1) flow).collect(new AnonymousClass2(flowCollector, 9, (MetricsBatchProcessor) obj), shortNewsContentCardView);
                if (objCollect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i12 = RemoteActionCompatParcelizer + 107;
                serializer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    return objCollect7;
                }
                obj2.hashCode();
                throw null;
            case 7:
                Object objCollect8 = ((StateProviderImpl$special$$inlined$map$2) flow).collect(new AnonymousClass2(flowCollector, 10, (r8lambdat1peidAd9PyU23jWJ4Oj0nfx3d4) obj), shortNewsContentCardView);
                if (objCollect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i13 = RemoteActionCompatParcelizer + 101;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    return objCollect8;
                }
                throw null;
            case 8:
                Object objCollect9 = ((CombineKt$zipImpl$$inlined$unsafeFlow$1) flow).collect(new AnonymousClass2(flowCollector, 11, (ObserveBackToBackOrdersStateImpl) obj), shortNewsContentCardView);
                if (objCollect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i14 = RemoteActionCompatParcelizer + 93;
                serializer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    return objCollect9;
                }
                obj2.hashCode();
                throw null;
            case 9:
                Object objCollect10 = ((StateProviderImpl$special$$inlined$map$2) flow).collect(new AnonymousClass2(flowCollector, 12, (ImageLoader$Builder) obj), shortNewsContentCardView);
                if (objCollect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i15 = serializer + 107;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    int i16 = 88 / 0;
                }
                return objCollect10;
            case 10:
                Object objCollect11 = flow.collect(new AnonymousClass2(flowCollector, 13, (ShadowSpan) obj), shortNewsContentCardView);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : createfromparcel;
            case 11:
                Object objCollect12 = ((StateProviderImpl$special$$inlined$map$2) flow).collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, (EntrancePictureRepository) obj, i8), shortNewsContentCardView);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : createfromparcel;
            case 12:
                Object objCollect13 = ((HeatmapDataStore$get$$inlined$map$1) flow).collect(new AnonymousClass2(flowCollector, i7, (ObserveEntrancePicture) obj), shortNewsContentCardView);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : createfromparcel;
            case 13:
                Object objCollect14 = ((StateProviderImpl$special$$inlined$map$2) flow).collect(new AnonymousClass2(flowCollector, 17, (onInitialized) obj), shortNewsContentCardView);
                return objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect14 : createfromparcel;
            case 14:
                Object objCollect15 = ((StateProviderImpl$special$$inlined$map$2) flow).collect(new AnonymousClass2(flowCollector, 18, (WorkerWrapper.Builder) obj), shortNewsContentCardView);
                if (objCollect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i17 = serializer + 95;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                return objCollect15;
            case 15:
                Object objCollect16 = flow.collect(new AnonymousClass2(flowCollector, 19, (InitializeAppStartupItemsImpl) obj), shortNewsContentCardView);
                return objCollect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect16 : createfromparcel;
            case 16:
                Object objCollect17 = ((StateProviderImpl$special$$inlined$map$2) flow).collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, (InitializeAppStartupItemsImpl) obj, i6), shortNewsContentCardView);
                return objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect17 : createfromparcel;
            case 17:
                Object objCollect18 = flow.collect(new AnonymousClass2(flowCollector, 20, (SettingsOnboardingDataStore) obj), shortNewsContentCardView);
                return objCollect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect18 : createfromparcel;
            case 18:
                Object objCollect19 = ((HasWorkNowOpportunityImpl$invoke$$inlined$map$1) flow).collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, (ShowNavigationSettingsTooltipUseCaseImpl) obj, i7), shortNewsContentCardView);
                return objCollect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect19 : createfromparcel;
            case 19:
                Object objCollect20 = ((StateProviderImpl$special$$inlined$map$2) flow).collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, (ObservePuDoDeliveriesResponseImpl) obj, i5), shortNewsContentCardView);
                if (objCollect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i19 = serializer + 109;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    int i20 = 5 / 5;
                }
                return objCollect20;
            case 20:
                Object objCollect21 = flow.collect(new AnonymousClass2(flowCollector, i5, (StateV3DeliveryProvider) obj), shortNewsContentCardView);
                return objCollect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect21 : createfromparcel;
            case 21:
                Object objCollect22 = ((StateProviderImpl$special$$inlined$map$2) flow).collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, (accessgetMiddleEllipsiscp) obj, i4), shortNewsContentCardView);
                if (objCollect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i21 = RemoteActionCompatParcelizer + 69;
                serializer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                return objCollect22;
            case 22:
                Object objCollect23 = ((HeatmapDataStore$get$$inlined$map$1) flow).collect(new AnonymousClass2(flowCollector, 22, (getMToDpValuesannotations) obj), shortNewsContentCardView);
                return objCollect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect23 : createfromparcel;
            case 23:
                Object objCollect24 = flow.collect(new AnonymousClass2(flowCollector, 23, (StateDataStoreImpl) obj), shortNewsContentCardView);
                return objCollect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect24 : createfromparcel;
            case 24:
                Object objCollect25 = flow.collect(new AnonymousClass2(flowCollector, i4, (StateProviderImpl) obj), shortNewsContentCardView);
                if (objCollect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i23 = serializer + 103;
                RemoteActionCompatParcelizer = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                return objCollect25;
            case 25:
                Object objCollect26 = ((AbstractFlow) flow).collect(new AnonymousClass2(flowCollector, 25, (ProtobufEncoder) obj), shortNewsContentCardView);
                return objCollect26 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect26 : createfromparcel;
            case 26:
                Object objCollect27 = flow.collect(new AnonymousClass2(flowCollector, 26, (ShouldShowTabs) obj), shortNewsContentCardView);
                return objCollect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect27 : createfromparcel;
            case 27:
                Object objCollect28 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (RouterLogger) obj, i10), shortNewsContentCardView);
                return objCollect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect28 : createfromparcel;
            case 28:
                Object objCollect29 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i3, (considerReleasingGlowsOnScroll) obj), shortNewsContentCardView);
                if (objCollect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i25 = RemoteActionCompatParcelizer + 15;
                serializer = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                return objCollect29;
            default:
                Object objCollect30 = flow.collect(new RiderStateRepositoryImpl$special$$inlined$map$1$2(flowCollector, (RiderStateRepositoryImpl) obj, i3), shortNewsContentCardView);
                return objCollect30 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect30 : createfromparcel;
        }
    }
}
