package com.roadrunner.startingarea.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.location.core.domain.ObserveDistanceToLocationUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ExtensionWindowAreaStatusRequirements;
import o.ShortNewsContentCardView;
import o.ValidSpecification;
import o.accesssetCustomBrazeNotificationFactorycp;
import o.addSdkMetadata;
import o.createFromParcel;
import o.endRearDisplayPresentationSession;
import o.getActionViewIntentlambda0;
import o.getCieXyz;
import o.getRearDisplayPresentation;
import o.getWindowAreaDisplayMetrics;
import o.getWindowAreaStatus;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetStartingAreaClosestCoordinateImpl$invoke$$inlined$map$1 implements Flow {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ double IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Flow read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ double write;

    /* JADX INFO: renamed from: com.roadrunner.startingarea.domain.GetStartingAreaClosestCoordinateImpl$invoke$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int MediaBrowserCompatMediaItem = 0;
        private static int MediaSessionCompatQueueItem = 1;
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
        public final /* synthetic */ double read;
        public final /* synthetic */ Object serializer;
        public final /* synthetic */ double write;

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Object obj, double d, double d2, int i) {
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = flowCollector;
            this.serializer = obj;
            this.read = d;
            this.write = d2;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0048  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            addSdkMetadata addsdkmetadata;
            int i;
            Object objWithContext;
            int i2;
            ValidSpecification validSpecification;
            ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements;
            int i3 = 2 % 2;
            int i4 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = this.serializer;
            FlowCollector flowCollector = this.RemoteActionCompatParcelizer;
            Float fIconCompatParcelizer = null;
            if (i4 != 0) {
                if (!(shortNewsContentCardView instanceof ValidSpecification)) {
                    validSpecification = new ValidSpecification(this, shortNewsContentCardView);
                    int i5 = MediaBrowserCompatMediaItem + 35;
                    MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                } else {
                    int i7 = MediaBrowserCompatMediaItem + 43;
                    MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        validSpecification = (ValidSpecification) shortNewsContentCardView;
                        int i8 = validSpecification.IconCompatParcelizer;
                        if ((i8 & Integer.MIN_VALUE) == 0) {
                            validSpecification = new ValidSpecification(this, shortNewsContentCardView);
                            int i9 = MediaBrowserCompatMediaItem + 35;
                            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                        } else {
                            int i11 = MediaSessionCompatQueueItem + 3;
                            MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
                            if (i11 % 2 != 0) {
                                validSpecification.IconCompatParcelizer = i8 << Integer.MIN_VALUE;
                            } else {
                                validSpecification.IconCompatParcelizer = i8 - Integer.MIN_VALUE;
                            }
                        }
                    } else {
                        int i12 = ((ValidSpecification) shortNewsContentCardView).IconCompatParcelizer;
                        throw null;
                    }
                }
                Object obj3 = validSpecification.read;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = validSpecification.IconCompatParcelizer;
                if (i13 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                    getWindowAreaDisplayMetrics getwindowareadisplaymetrics = (getWindowAreaDisplayMetrics) obj;
                    if (getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession) {
                        int i14 = MediaSessionCompatQueueItem + 3;
                        MediaBrowserCompatMediaItem = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 == 0) {
                            extensionWindowAreaStatusRequirements = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                        } else {
                            ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements2 = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                            fIconCompatParcelizer.hashCode();
                            throw null;
                        }
                    } else if (getwindowareadisplaymetrics instanceof getRearDisplayPresentation) {
                        extensionWindowAreaStatusRequirements = ((getRearDisplayPresentation) getwindowareadisplaymetrics).RemoteActionCompatParcelizer;
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwindowareadisplaymetrics, getWindowAreaStatus.read}, getCieXyz.write())).booleanValue()) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        } else {
                            extensionWindowAreaStatusRequirements = null;
                        }
                    }
                    if (extensionWindowAreaStatusRequirements != null) {
                        getActionViewIntentlambda0 getactionviewintentlambda0 = ((ObserveDistanceToLocationUseCaseImpl) obj2).IconCompatParcelizer;
                        double d = extensionWindowAreaStatusRequirements.serializer;
                        double d2 = extensionWindowAreaStatusRequirements.read;
                        getactionviewintentlambda0.getClass();
                        fIconCompatParcelizer = getActionViewIntentlambda0.IconCompatParcelizer(d, d2, this.read, this.write);
                    }
                    validSpecification.IconCompatParcelizer = 1;
                    return flowCollector.emit(fIconCompatParcelizer, validSpecification) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i13 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ComponentRegistry$Builder componentRegistry$Builder = (ComponentRegistry$Builder) obj2;
            if (shortNewsContentCardView instanceof addSdkMetadata) {
                addsdkmetadata = (addSdkMetadata) shortNewsContentCardView;
                int i15 = addsdkmetadata.serializer;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    addsdkmetadata.serializer = i15 - Integer.MIN_VALUE;
                } else {
                    addsdkmetadata = new addSdkMetadata(this, shortNewsContentCardView);
                }
            } else {
                addsdkmetadata = new addSdkMetadata(this, shortNewsContentCardView);
            }
            Object obj4 = addsdkmetadata.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i16 = addsdkmetadata.serializer;
            if (i16 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp = (accesssetCustomBrazeNotificationFactorycp) obj;
                i = 0;
                if (accesssetcustombrazenotificationfactorycp == null) {
                    Timber.RemoteActionCompatParcelizer.write(new StartingAreaInMapsException("Starting area is not available", null));
                    i2 = 0;
                    obj4 = null;
                } else {
                    ((inCompatibilityMode) ((isOpenInternalroom_runtime) componentRegistry$Builder.serializer)).getClass();
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    GetStartingAreaClosestCoordinateImpl$invoke$2$1 getStartingAreaClosestCoordinateImpl$invoke$2$1 = new GetStartingAreaClosestCoordinateImpl$invoke$2$1(this.read, this.write, componentRegistry$Builder, accesssetcustombrazenotificationfactorycp, null);
                    addsdkmetadata.IconCompatParcelizer = flowCollector;
                    addsdkmetadata.read = 0;
                    addsdkmetadata.serializer = 1;
                    objWithContext = BuildersKt.withContext(defaultScheduler, getStartingAreaClosestCoordinateImpl$invoke$2$1, addsdkmetadata);
                    if (objWithContext != coroutineSingletons2) {
                        addsdkmetadata.IconCompatParcelizer = null;
                        addsdkmetadata.read = i;
                        addsdkmetadata.serializer = 2;
                        if (flowCollector.emit(objWithContext, addsdkmetadata) != coroutineSingletons2) {
                            return createfromparcel;
                        }
                    }
                }
                return coroutineSingletons2;
            }
            if (i16 != 1) {
                int i17 = MediaBrowserCompatMediaItem + 79;
                MediaSessionCompatQueueItem = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0 ? i16 == 2 : i16 == 4) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = addsdkmetadata.read;
            flowCollector = addsdkmetadata.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj4);
            int i18 = i2;
            objWithContext = obj4;
            i = i18;
            addsdkmetadata.IconCompatParcelizer = null;
            addsdkmetadata.read = i;
            addsdkmetadata.serializer = 2;
            if (flowCollector.emit(objWithContext, addsdkmetadata) != coroutineSingletons2) {
                return createfromparcel;
            }
            return coroutineSingletons2;
        }
    }

    public /* synthetic */ GetStartingAreaClosestCoordinateImpl$invoke$$inlined$map$1(Flow flow, Object obj, double d, double d2, int i) {
        this.serializer = i;
        this.read = flow;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = d;
        this.write = d2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.serializer;
        Object obj = createFromParcel.INSTANCE;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Flow flow = this.read;
        if (i2 != 0) {
            Object objCollect = ((FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1) flow).collect(new AnonymousClass2(flowCollector, (ObserveDistanceToLocationUseCaseImpl) obj2, this.IconCompatParcelizer, this.write, 1), shortNewsContentCardView);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return obj;
            }
            int i3 = MediaSessionCompatQueueItem + 19;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objCollect;
        }
        Object objCollect2 = flow.collect(new AnonymousClass2(flowCollector, (ComponentRegistry$Builder) obj2, this.IconCompatParcelizer, this.write, 0), shortNewsContentCardView);
        if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i5 = MediaSessionCompatQueueItem + 47;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 40 / 0;
            }
            obj = objCollect2;
        }
        int i7 = MediaBrowserCompatMediaItem + 53;
        MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 71 / 0;
        }
        return obj;
    }
}
