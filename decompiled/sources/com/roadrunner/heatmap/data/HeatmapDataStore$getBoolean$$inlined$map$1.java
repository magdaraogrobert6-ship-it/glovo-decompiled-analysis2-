package com.roadrunner.heatmap.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AnimatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1;
import o.ClockInfo;
import o.NestedScrollViewSavedState;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.deleteNotificationChannel;
import o.getNoActiveChildannotations;
import o.isRoot;
import o.pushBullet;
import o.setTestOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class HeatmapDataStore$getBoolean$$inlined$map$1 implements Flow {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ isRoot RemoteActionCompatParcelizer;
    public final /* synthetic */ Flow read;

    /* JADX INFO: renamed from: com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;
        public final /* synthetic */ isRoot IconCompatParcelizer;
        public final /* synthetic */ int read;
        public final /* synthetic */ FlowCollector serializer;

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, isRoot isroot, int i) {
            this.read = i;
            this.serializer = flowCollector;
            this.IconCompatParcelizer = isroot;
        }

        /* JADX WARN: Code duplicated, block: B:107:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:15:0x002f  */
        /* JADX WARN: Code duplicated, block: B:36:0x0085  */
        /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:76:0x0148  */
        /* JADX WARN: Code duplicated, block: B:92:0x01a8  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            NestedScrollViewSavedState nestedScrollViewSavedState;
            pushBullet pushbullet;
            ClockInfo clockInfo;
            AnimatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1 animatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1;
            deleteNotificationChannel deletenotificationchannel;
            setTestOptions settestoptions;
            int i = 2 % 2;
            int i2 = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            isRoot isroot = this.IconCompatParcelizer;
            FlowCollector flowCollector = this.serializer;
            Object obj2 = null;
            if (i2 == 0) {
                if (shortNewsContentCardView instanceof NestedScrollViewSavedState) {
                    nestedScrollViewSavedState = (NestedScrollViewSavedState) shortNewsContentCardView;
                    int i3 = nestedScrollViewSavedState.IconCompatParcelizer;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nestedScrollViewSavedState.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
                    } else {
                        nestedScrollViewSavedState = new NestedScrollViewSavedState(this, shortNewsContentCardView);
                    }
                } else {
                    nestedScrollViewSavedState = new NestedScrollViewSavedState(this, shortNewsContentCardView);
                }
                Object obj3 = nestedScrollViewSavedState.read;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = nestedScrollViewSavedState.IconCompatParcelizer;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                    Object objSerializer = ((getNoActiveChildannotations) obj).serializer(isroot);
                    nestedScrollViewSavedState.IconCompatParcelizer = 1;
                    return flowCollector.emit(objSerializer, nestedScrollViewSavedState) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                int i5 = RemoteActionCompatParcelizer + 5;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                return createfromparcel;
            }
            if (i2 == 1) {
                if (!(shortNewsContentCardView instanceof pushBullet)) {
                    pushbullet = new pushBullet(this, shortNewsContentCardView);
                } else {
                    pushbullet = (pushBullet) shortNewsContentCardView;
                    int i6 = pushbullet.IconCompatParcelizer;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        pushbullet.IconCompatParcelizer = i6 - Integer.MIN_VALUE;
                        int i7 = RemoteActionCompatParcelizer + 121;
                        write = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                    } else {
                        pushbullet = new pushBullet(this, shortNewsContentCardView);
                    }
                }
                Object obj4 = pushbullet.write;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = pushbullet.IconCompatParcelizer;
                if (i9 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                    Object objSerializer2 = ((getNoActiveChildannotations) obj).serializer(isroot);
                    pushbullet.IconCompatParcelizer = 1;
                    return flowCollector.emit(objSerializer2, pushbullet) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                }
                if (i9 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (i2 == 2) {
                if (shortNewsContentCardView instanceof ClockInfo) {
                    int i10 = RemoteActionCompatParcelizer + 37;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    clockInfo = (ClockInfo) shortNewsContentCardView;
                    int i12 = clockInfo.serializer;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        int i13 = write + 15;
                        RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            clockInfo.serializer = i12 << Integer.MIN_VALUE;
                        } else {
                            clockInfo.serializer = i12 - Integer.MIN_VALUE;
                        }
                    } else {
                        clockInfo = new ClockInfo(this, shortNewsContentCardView);
                    }
                } else {
                    clockInfo = new ClockInfo(this, shortNewsContentCardView);
                }
                Object obj5 = clockInfo.read;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = clockInfo.serializer;
                if (i14 != 0) {
                    if (i14 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i15 = RemoteActionCompatParcelizer + 85;
                    write = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj5);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj5);
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) ((getNoActiveChildannotations) obj);
                backwardfocussearch.getClass();
                Object obj6 = backwardfocussearch.RemoteActionCompatParcelizer.get(isroot);
                clockInfo.serializer = 1;
                if (flowCollector.emit(obj6, clockInfo) != coroutineSingletons3) {
                    return createfromparcel;
                }
                int i17 = RemoteActionCompatParcelizer + 43;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                return coroutineSingletons3;
            }
            if (i2 == 3) {
                if (shortNewsContentCardView instanceof AnimatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1) {
                    animatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1 = (AnimatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1) shortNewsContentCardView;
                    int i19 = animatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1.write;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        int i20 = RemoteActionCompatParcelizer + 77;
                        write = i20 % Fields.SpotShadowColor;
                        int i21 = i20 % 2;
                        animatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1.write = i19 - Integer.MIN_VALUE;
                    } else {
                        animatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1 = new AnimatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1(this, shortNewsContentCardView);
                    }
                } else {
                    animatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1 = new AnimatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1(this, shortNewsContentCardView);
                }
                Object obj7 = animatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = animatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1.write;
                if (i22 != 0) {
                    if (i22 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj7);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj7);
                backwardFocusSearch backwardfocussearch2 = (backwardFocusSearch) ((getNoActiveChildannotations) obj);
                backwardfocussearch2.getClass();
                Object obj8 = backwardfocussearch2.RemoteActionCompatParcelizer.get(isroot);
                animatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1.write = 1;
                if (flowCollector.emit(obj8, animatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1) != coroutineSingletons4) {
                    return createfromparcel;
                }
                int i23 = write + 45;
                RemoteActionCompatParcelizer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 != 0) {
                    return coroutineSingletons4;
                }
                obj2.hashCode();
                throw null;
            }
            if (i2 == 4) {
                if (shortNewsContentCardView instanceof deleteNotificationChannel) {
                    deletenotificationchannel = (deleteNotificationChannel) shortNewsContentCardView;
                    int i24 = deletenotificationchannel.serializer;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        deletenotificationchannel.serializer = i24 - Integer.MIN_VALUE;
                    } else {
                        deletenotificationchannel = new deleteNotificationChannel(this, shortNewsContentCardView);
                    }
                } else {
                    deletenotificationchannel = new deleteNotificationChannel(this, shortNewsContentCardView);
                }
                Object obj9 = deletenotificationchannel.write;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = deletenotificationchannel.serializer;
                if (i25 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj9);
                    Object objSerializer3 = ((getNoActiveChildannotations) obj).serializer(isroot);
                    deletenotificationchannel.serializer = 1;
                    return flowCollector.emit(objSerializer3, deletenotificationchannel) == coroutineSingletons5 ? coroutineSingletons5 : createfromparcel;
                }
                if (i25 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i26 = write + 73;
                RemoteActionCompatParcelizer = i26 % Fields.SpotShadowColor;
                if (i26 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj9);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj9);
                int i27 = 20 / 0;
                return createfromparcel;
            }
            if (shortNewsContentCardView instanceof setTestOptions) {
                settestoptions = (setTestOptions) shortNewsContentCardView;
                int i28 = settestoptions.IconCompatParcelizer;
                if ((i28 & Integer.MIN_VALUE) != 0) {
                    settestoptions.IconCompatParcelizer = i28 - Integer.MIN_VALUE;
                } else {
                    settestoptions = new setTestOptions(this, shortNewsContentCardView);
                }
            } else {
                settestoptions = new setTestOptions(this, shortNewsContentCardView);
            }
            Object obj10 = settestoptions.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i29 = settestoptions.IconCompatParcelizer;
            if (i29 != 0) {
                if (i29 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj10);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj10);
            Integer num = (Integer) ((getNoActiveChildannotations) obj).serializer(isroot);
            Integer num2 = new Integer(num != null ? num.intValue() : 0);
            settestoptions.IconCompatParcelizer = 1;
            if (flowCollector.emit(num2, settestoptions) != coroutineSingletons6) {
                return createfromparcel;
            }
            int i30 = RemoteActionCompatParcelizer + 21;
            write = i30 % Fields.SpotShadowColor;
            if (i30 % 2 == 0) {
                return coroutineSingletons6;
            }
            throw null;
        }
    }

    public /* synthetic */ HeatmapDataStore$getBoolean$$inlined$map$1(Flow flow, isRoot isroot, int i) {
        this.IconCompatParcelizer = i;
        this.read = flow;
        this.RemoteActionCompatParcelizer = isroot;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r1 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        r11 = r8.collect(new com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.AnonymousClass2(r11, r7, 5), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r11 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r11 = r8.collect(new com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.AnonymousClass2(r11, r7, 4), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r11 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r1 != 3) goto L15;
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r11, o.ShortNewsContentCardView r12) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.serializer
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.write = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L25
            int r1 = r10.IconCompatParcelizer
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            o.isRoot r7 = r10.RemoteActionCompatParcelizer
            kotlinx.coroutines.flow.Flow r8 = r10.read
            r9 = 4
            int r9 = r9 / r3
            if (r1 == 0) goto L89
            if (r1 == r2) goto L6d
            if (r1 == r0) goto L55
            if (r1 == r4) goto L45
            goto L35
        L25:
            int r1 = r10.IconCompatParcelizer
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            o.isRoot r7 = r10.RemoteActionCompatParcelizer
            kotlinx.coroutines.flow.Flow r8 = r10.read
            if (r1 == 0) goto L89
            if (r1 == r2) goto L6d
            if (r1 == r0) goto L55
            if (r1 == r4) goto L45
        L35:
            com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2 r0 = new com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2
            r1 = 5
            r0.<init>(r11, r7, r1)
            java.lang.Object r11 = r8.collect(r0, r12)
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r11 != r12) goto L44
            r6 = r11
        L44:
            return r6
        L45:
            com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2 r0 = new com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2
            r1 = 4
            r0.<init>(r11, r7, r1)
            java.lang.Object r11 = r8.collect(r0, r12)
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r11 != r12) goto L54
            r6 = r11
        L54:
            return r6
        L55:
            com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2 r1 = new com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2
            r1.<init>(r11, r7, r4)
            java.lang.Object r11 = r8.collect(r1, r12)
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r11 != r12) goto L6c
            int r12 = com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.write
            int r12 = r12 + 13
            int r1 = r12 % 128
            com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.serializer = r1
            int r12 = r12 % r0
            r6 = r11
        L6c:
            return r6
        L6d:
            com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2 r1 = new com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2
            r1.<init>(r11, r7, r0)
            java.lang.Object r11 = r8.collect(r1, r12)
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r11 != r12) goto L88
            int r12 = com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.write
            int r12 = r12 + 43
            int r1 = r12 % 128
            com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.serializer = r1
            int r12 = r12 % r0
            if (r12 == 0) goto L87
            r6 = r11
            goto L88
        L87:
            throw r5
        L88:
            return r6
        L89:
            com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2 r1 = new com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1$2
            r1.<init>(r11, r7, r3)
            java.lang.Object r11 = r8.collect(r1, r12)
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r11 != r12) goto La4
            int r12 = com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.write
            int r12 = r12 + 97
            int r1 = r12 % 128
            com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.serializer = r1
            int r12 = r12 % r0
            if (r12 == 0) goto La3
            r6 = r11
            goto La4
        La3:
            throw r5
        La4:
            int r11 = com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.write
            int r11 = r11 + 109
            int r12 = r11 % 128
            com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.serializer = r12
            int r11 = r11 % r0
            if (r11 == 0) goto Lb0
            return r6
        Lb0:
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1.collect(kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):java.lang.Object");
    }
}
