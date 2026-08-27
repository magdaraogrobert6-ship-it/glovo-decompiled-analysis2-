package com.roadrunner.delivery.accept.laststop.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.map.integration.search.SelectorReverseGeocoder;
import dagger.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.createFromParcel;
import o.drawPoint;
import o.drawTextOnPath;
import o.drawVertices;
import o.getLayoutIntrinsics;
import o.getLineEllipsisOffset;
import o.getRearDisplayMetrics;
import o.isItemDismissable;
import o.onItemDismiss;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LastStopSelectionCoordinator {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final getRearDisplayMetrics IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final Lazy MediaDescriptionCompat;
    public final StateFlow RatingCompat;
    public final GetLastStopScreenUseCaseImpl RemoteActionCompatParcelizer;
    public final DeliveryAcceptanceLogger read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    final class LastStopGeocodingErrorException extends Exception {
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;
        public final String serializer;
        public final Throwable write;

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = read + 85;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            Throwable th = this.write;
            int i5 = i3 + 5;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return th;
            }
            throw null;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            int i = 2 % 2;
            int i2 = read + 33;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.serializer;
            int i4 = i3 + 123;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return str;
        }

        public LastStopGeocodingErrorException(String str, Throwable th) {
            super(str, th);
            this.serializer = str;
            this.write = th;
        }
    }

    public LastStopSelectionCoordinator(GetLastStopScreenUseCaseImpl getLastStopScreenUseCaseImpl, Lazy lazy, DeliveryAcceptanceLogger deliveryAcceptanceLogger, getRearDisplayMetrics getreardisplaymetrics) {
        this.RemoteActionCompatParcelizer = getLastStopScreenUseCaseImpl;
        this.MediaDescriptionCompat = lazy;
        this.read = deliveryAcceptanceLogger;
        this.IconCompatParcelizer = getreardisplaymetrics;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(drawVertices.RemoteActionCompatParcelizer);
        this.write = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(drawPoint.read);
        this.serializer = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (reverseGeocodeCoordinates(r3, r5, r7) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setInitialLocation(o.drawTextOnPath r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r10 instanceof o.getLineAscent
            if (r1 == 0) goto L26
            r1 = r10
            o.getLineAscent r1 = (o.getLineAscent) r1
            int r2 = r1.IconCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L26
            int r10 = com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator.MediaSessionCompatQueueItem
            int r10 = r10 + 113
            int r4 = r10 % 128
            com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator.MediaMetadataCompat = r4
            int r10 = r10 % r0
            if (r10 == 0) goto L22
            int r10 = r2 >> r3
            r1.IconCompatParcelizer = r10
            goto L2b
        L22:
            int r2 = r2 + r3
            r1.IconCompatParcelizer = r2
            goto L2b
        L26:
            o.getLineAscent r1 = new o.getLineAscent
            r1.<init>(r8, r10)
        L2b:
            r7 = r1
            java.lang.Object r10 = r7.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r7.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L5d
            int r9 = com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator.MediaSessionCompatQueueItem
            int r4 = r9 + 121
            int r5 = r4 % 128
            com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator.MediaMetadataCompat = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L43
            if (r2 == r3) goto L59
            goto L45
        L43:
            if (r2 == r3) goto L59
        L45:
            if (r2 != r0) goto L52
            int r9 = r9 + 119
            int r1 = r9 % 128
            com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator.MediaMetadataCompat = r1
            int r9 = r9 % r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L87
        L52:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            r9 = 0
            return r9
        L59:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L71
        L5d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            o.getDrawFilter r9 = r9.IconCompatParcelizer()
            if (r9 != 0) goto L87
            r7.IconCompatParcelizer = r3
            o.getRearDisplayMetrics r9 = r8.IconCompatParcelizer
            java.lang.Object r10 = r9.RemoteActionCompatParcelizer(r7)
            if (r10 != r1) goto L71
            goto L86
        L71:
            android.location.Location r10 = (android.location.Location) r10
            if (r10 == 0) goto L87
            double r3 = r10.getLatitude()
            double r5 = r10.getLongitude()
            r7.IconCompatParcelizer = r0
            r2 = r8
            java.lang.Object r9 = r2.reverseGeocodeCoordinates(r3, r5, r7)
            if (r9 != r1) goto L87
        L86:
            return r1
        L87:
            o.createFromParcel r9 = o.createFromParcel.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator.setInitialLocation(o.drawTextOnPath, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object initialize(ContinuationImpl continuationImpl) {
        getLineEllipsisOffset getlineellipsisoffset;
        int i;
        Object objM4905invokeIoAF18A;
        Object obj;
        Throwable thSerializer;
        int i2 = 2 % 2;
        if (continuationImpl instanceof getLineEllipsisOffset) {
            getlineellipsisoffset = (getLineEllipsisOffset) continuationImpl;
            int i3 = getlineellipsisoffset.write;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getlineellipsisoffset.write = i3 - Integer.MIN_VALUE;
            } else {
                getlineellipsisoffset = new getLineEllipsisOffset(this, continuationImpl);
                i = MediaMetadataCompat + 95;
                MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i4 = 2 % 5;
                }
            }
        } else {
            getlineellipsisoffset = new getLineEllipsisOffset(this, continuationImpl);
            i = MediaMetadataCompat + 95;
            MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i5 = 2 % 5;
            }
        }
        Object obj2 = getlineellipsisoffset.read;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = getlineellipsisoffset.write;
        MutableStateFlow mutableStateFlow = this.write;
        Object obj4 = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            mutableStateFlow.IconCompatParcelizer(drawVertices.RemoteActionCompatParcelizer);
            getlineellipsisoffset.write = 1;
            objM4905invokeIoAF18A = this.RemoteActionCompatParcelizer.m4905invokeIoAF18A(getlineellipsisoffset);
            if (objM4905invokeIoAF18A != obj3) {
            }
            return obj3;
        }
        if (i6 != 1) {
            int i7 = MediaSessionCompatQueueItem + 45;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0 ? i6 != 2 : i6 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = getlineellipsisoffset.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            objM4905invokeIoAF18A = ((onItemDismiss) obj2).IconCompatParcelizer;
        }
        objM4905invokeIoAF18A = obj;
        thSerializer = onItemDismiss.serializer(objM4905invokeIoAF18A);
        if (thSerializer != null) {
            int i8 = MediaMetadataCompat + 67;
            MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to initialize Last Stop selection screen", new Object[0]);
        }
        return createFromParcel.INSTANCE;
        if (!(objM4905invokeIoAF18A instanceof isItemDismissable)) {
            int i10 = MediaSessionCompatQueueItem + 15;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                obj4.hashCode();
                throw null;
            }
            drawTextOnPath drawtextonpath = (drawTextOnPath) objM4905invokeIoAF18A;
            if (drawtextonpath != null) {
                mutableStateFlow.IconCompatParcelizer(drawtextonpath);
                getlineellipsisoffset.IconCompatParcelizer = objM4905invokeIoAF18A;
                getlineellipsisoffset.write = 2;
                if (setInitialLocation(drawtextonpath, getlineellipsisoffset) != obj3) {
                    obj = objM4905invokeIoAF18A;
                    objM4905invokeIoAF18A = obj;
                }
                return obj3;
            }
            Timber.RemoteActionCompatParcelizer.read("Last Stop component was not found", new Object[0]);
        }
        thSerializer = onItemDismiss.serializer(objM4905invokeIoAF18A);
        if (thSerializer != null) {
            int i11 = MediaMetadataCompat + 67;
            MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to initialize Last Stop selection screen", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    public final Object geocodeCoordinates(double d, double d2, ContinuationImpl continuationImpl) {
        getLayoutIntrinsics getlayoutintrinsics;
        double d3;
        double d4;
        CompletableDeferredImpl completableDeferredImpl;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 91;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            if (!(continuationImpl instanceof getLayoutIntrinsics)) {
                getlayoutintrinsics = new getLayoutIntrinsics(this, continuationImpl);
            } else {
                int i4 = i2 + 91;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    getlayoutintrinsics = (getLayoutIntrinsics) continuationImpl;
                    int i5 = getlayoutintrinsics.write;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        getlayoutintrinsics.write = i5 - Integer.MIN_VALUE;
                    } else {
                        getlayoutintrinsics = new getLayoutIntrinsics(this, continuationImpl);
                    }
                } else {
                    int i6 = ((getLayoutIntrinsics) continuationImpl).write;
                    throw null;
                }
            }
            int i7 = MediaMetadataCompat + 99;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            Object obj = getlayoutintrinsics.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = getlayoutintrinsics.write;
            int i10 = 1;
            if (i9 != 0) {
                int i11 = MediaMetadataCompat + 61;
                MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (i9 != 1) {
                    if (i9 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d4 = getlayoutintrinsics.read;
                d3 = getlayoutintrinsics.RemoteActionCompatParcelizer;
                completableDeferredImpl = getlayoutintrinsics.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CompletableDeferredImpl completableDeferredImplWrite = JobKt.write();
                Object objWrite = this.MediaDescriptionCompat.write();
                objWrite.getClass();
                LastStopSelectionCoordinator$$ExternalSyntheticLambda1 lastStopSelectionCoordinator$$ExternalSyntheticLambda1 = new LastStopSelectionCoordinator$$ExternalSyntheticLambda1(this);
                LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda2 = new LastStopSelectionCoordinator$$ExternalSyntheticLambda2(completableDeferredImplWrite, 0);
                LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda3 = new LastStopSelectionCoordinator$$ExternalSyntheticLambda2(completableDeferredImplWrite, i10);
                getlayoutintrinsics.IconCompatParcelizer = completableDeferredImplWrite;
                getlayoutintrinsics.RemoteActionCompatParcelizer = d;
                getlayoutintrinsics.read = d2;
                getlayoutintrinsics.write = 1;
                if (((SelectorReverseGeocoder) objWrite).invoke(d, d2, lastStopSelectionCoordinator$$ExternalSyntheticLambda1, lastStopSelectionCoordinator$$ExternalSyntheticLambda2, lastStopSelectionCoordinator$$ExternalSyntheticLambda3, getlayoutintrinsics) != coroutineSingletons) {
                    d3 = d;
                    d4 = d2;
                    completableDeferredImpl = completableDeferredImplWrite;
                }
            }
            getlayoutintrinsics.IconCompatParcelizer = null;
            getlayoutintrinsics.RemoteActionCompatParcelizer = d3;
            getlayoutintrinsics.read = d4;
            getlayoutintrinsics.write = 2;
            Object objAwaitInternal = completableDeferredImpl.awaitInternal(getlayoutintrinsics);
            return objAwaitInternal == coroutineSingletons ? coroutineSingletons : objAwaitInternal;
        }
        boolean z = continuationImpl instanceof getLayoutIntrinsics;
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:12|61|13|14|67|31|(3:32|(1:34)(1:35)|36)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:24|65|25|26|63|27|(1:29)(1:30)) */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8 A[Catch: LastStopGeocodingErrorException -> 0x00d6, TryCatch #3 {LastStopGeocodingErrorException -> 0x00d6, blocks: (B:31:0x00ad, B:32:0x00bc, B:36:0x00ce, B:35:0x00c8), top: B:67:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        r3 = r14;
        r2 = r17;
        r4 = r18;
        r6 = r19;
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
    
        r2 = r17;
        r3 = r2;
        r4 = r18;
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f3, code lost:
    
        r2 = r5;
        r3 = r2;
        r4 = r4;
        r6 = r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:67:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reverseGeocodeCoordinates(double r24, double r26, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator.reverseGeocodeCoordinates(double, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
