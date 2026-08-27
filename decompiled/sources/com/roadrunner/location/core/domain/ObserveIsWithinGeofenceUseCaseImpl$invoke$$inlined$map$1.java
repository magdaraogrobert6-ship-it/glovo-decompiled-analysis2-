package com.roadrunner.location.core.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCursorCapsMode;
import o.startRearDisplaySession;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1 implements Flow {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Flow read;
    public final /* synthetic */ int write;

    /* JADX INFO: renamed from: com.roadrunner.location.core.domain.ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int IconCompatParcelizer = 1;
        private static int read;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public final /* synthetic */ FlowCollector serializer;
        public final /* synthetic */ int write;

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i, int i2) {
            this.write = i2;
            this.serializer = flowCollector;
            this.RemoteActionCompatParcelizer = i;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0039 A[PHI: r1 r10
  0x0039: PHI (r1v19 o.getCursorCapsMode) = (r1v18 o.getCursorCapsMode), (r1v21 o.getCursorCapsMode) binds: [B:12:0x0037, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r10v9 int) = (r10v8 int), (r10v11 int) binds: [B:12:0x0037, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x003d  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:64:0x0110  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            startRearDisplaySession startreardisplaysession;
            getCursorCapsMode getcursorcapsmode;
            int i;
            int i2 = 2 % 2;
            int i3 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i4 = this.RemoteActionCompatParcelizer;
            FlowCollector flowCollector = this.serializer;
            boolean z = false;
            Object obj2 = null;
            if (i3 == 0) {
                if (shortNewsContentCardView instanceof startRearDisplaySession) {
                    int i5 = read + 117;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    startreardisplaysession = (startRearDisplaySession) shortNewsContentCardView;
                    int i7 = startreardisplaysession.RemoteActionCompatParcelizer;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        int i8 = IconCompatParcelizer + 25;
                        read = i8 % Fields.SpotShadowColor;
                        startreardisplaysession.RemoteActionCompatParcelizer = i8 % 2 != 0 ? i7 - Integer.MIN_VALUE : i7 - Integer.MIN_VALUE;
                    } else {
                        startreardisplaysession = new startRearDisplaySession(this, shortNewsContentCardView);
                    }
                } else {
                    startreardisplaysession = new startRearDisplaySession(this, shortNewsContentCardView);
                }
                Object obj3 = startreardisplaysession.serializer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = startreardisplaysession.RemoteActionCompatParcelizer;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj3);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                Float f = (Float) obj;
                if (f != null) {
                    int i10 = IconCompatParcelizer + 87;
                    read = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        int i11 = 39 / 0;
                        if (f.floatValue() <= i4) {
                            z = true;
                        }
                    } else if (f.floatValue() <= i4) {
                        z = true;
                    }
                }
                startreardisplaysession.RemoteActionCompatParcelizer = 1;
                return flowCollector.emit(Boolean.valueOf(z), startreardisplaysession) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (shortNewsContentCardView instanceof getCursorCapsMode) {
                int i12 = IconCompatParcelizer + 45;
                read = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    getcursorcapsmode = (getCursorCapsMode) shortNewsContentCardView;
                    i = getcursorcapsmode.write;
                    int i13 = 53 / 0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getcursorcapsmode.write = i - Integer.MIN_VALUE;
                    } else {
                        getcursorcapsmode = new getCursorCapsMode(this, shortNewsContentCardView);
                    }
                } else {
                    getcursorcapsmode = (getCursorCapsMode) shortNewsContentCardView;
                    i = getcursorcapsmode.write;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getcursorcapsmode.write = i - Integer.MIN_VALUE;
                    } else {
                        getcursorcapsmode = new getCursorCapsMode(this, shortNewsContentCardView);
                    }
                }
            } else {
                getcursorcapsmode = new getCursorCapsMode(this, shortNewsContentCardView);
            }
            Object obj4 = getcursorcapsmode.read;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i14 = getcursorcapsmode.write;
            if (i14 != 0) {
                if (i14 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i15 = IconCompatParcelizer + 89;
                read = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                int i16 = 68 / 0;
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj4);
            Float f2 = (Float) obj;
            if (f2 != null) {
                int i17 = IconCompatParcelizer + 7;
                read = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    f2.floatValue();
                    obj2.hashCode();
                    throw null;
                }
                if (f2.floatValue() <= i4) {
                    z = true;
                }
            }
            getcursorcapsmode.write = 1;
            if (flowCollector.emit(Boolean.valueOf(z), getcursorcapsmode) != coroutineSingletons2) {
                return createfromparcel;
            }
            int i18 = IconCompatParcelizer + 123;
            read = i18 % Fields.SpotShadowColor;
            if (i18 % 2 == 0) {
                return coroutineSingletons2;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public /* synthetic */ ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1(Flow flow, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.read = flow;
        this.write = i;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj = createFromParcel.INSTANCE;
        int i3 = this.write;
        Flow flow = this.read;
        if (i2 != 0) {
            Object objCollect = flow.collect(new AnonymousClass2(flowCollector, i3, 1), shortNewsContentCardView);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return obj;
            }
            int i4 = serializer + 87;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objCollect;
        }
        Object objCollect2 = flow.collect(new AnonymousClass2(flowCollector, i3, 0), shortNewsContentCardView);
        if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            obj = objCollect2;
        }
        int i6 = serializer + 61;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
