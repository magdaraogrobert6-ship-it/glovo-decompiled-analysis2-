package com.roadrunner.delivery.accept.autoaccept.preferences.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesLocalRepositoryImpl;
import com.roadrunner.sidemenu.presentation.SideMenuViewModel$observeSideMenuDrawerState$1$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import o.ShortNewsContentCardView;
import o.SpanStyle;
import o.TextMotionSaverlambda1;
import o.copyIuqyXdg;
import o.copyNcG25M8;
import o.createFromParcel;
import o.emojiSupportMatchSaverlambda0;
import o.getNoActiveChildannotations;
import o.getQueryContext;
import o.resolveSpanStyleDefaults;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptPreferencesViewModel extends ViewModel implements resolveSpanStyleDefaults {
    public final AutoAcceptPreferencesLocalRepositoryImpl IconCompatParcelizer;
    public final StateFlow serializer;
    public final getQueryContext write;

    public AutoAcceptPreferencesViewModel(AutoAcceptPreferencesLocalRepositoryImpl autoAcceptPreferencesLocalRepositoryImpl, getQueryContext getquerycontext) {
        autoAcceptPreferencesLocalRepositoryImpl.getClass();
        getquerycontext.getClass();
        this.IconCompatParcelizer = autoAcceptPreferencesLocalRepositoryImpl;
        this.write = getquerycontext;
        final AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl = autoAcceptPreferencesLocalRepositoryImpl.serializer;
        final Flow flowSerializer = autoAcceptPreferencesDataStoreImpl.read.serializer();
        final int i = 1;
        Flow flow = new Flow() { // from class: com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1
            private static int read = 1;
            private static int serializer;

            /* JADX INFO: renamed from: com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2 implements FlowCollector {
                private static int RemoteActionCompatParcelizer = 1;
                private static int read;
                public final /* synthetic */ int IconCompatParcelizer;
                public final /* synthetic */ AutoAcceptPreferencesDataStoreImpl serializer;
                public final /* synthetic */ FlowCollector write;

                public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl, int i) {
                    this.IconCompatParcelizer = i;
                    this.write = flowCollector;
                    this.serializer = autoAcceptPreferencesDataStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:12:0x0035  */
                /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                    copyNcG25M8 copyncg25m8;
                    boolean zBooleanValue;
                    copyIuqyXdg copyiuqyxdg;
                    int i = 2 % 2;
                    int i2 = this.IconCompatParcelizer;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl = this.serializer;
                    FlowCollector flowCollector = this.write;
                    Object obj2 = null;
                    if (i2 == 0) {
                        if (shortNewsContentCardView instanceof copyNcG25M8) {
                            int i3 = read + 81;
                            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                            int i4 = i3 % 2;
                            copyncg25m8 = (copyNcG25M8) shortNewsContentCardView;
                            int i5 = copyncg25m8.RemoteActionCompatParcelizer;
                            if ((i5 & Integer.MIN_VALUE) != 0) {
                                int i6 = read + 33;
                                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                                copyncg25m8.RemoteActionCompatParcelizer = i5 - Integer.MIN_VALUE;
                            } else {
                                copyncg25m8 = new copyNcG25M8(this, shortNewsContentCardView);
                            }
                        } else {
                            copyncg25m8 = new copyNcG25M8(this, shortNewsContentCardView);
                        }
                        Object obj3 = copyncg25m8.read;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i8 = copyncg25m8.RemoteActionCompatParcelizer;
                        if (i8 == 0) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj3);
                            Boolean bool = (Boolean) ((getNoActiveChildannotations) obj).serializer(autoAcceptPreferencesDataStoreImpl.write);
                            zBooleanValue = bool != null ? bool.booleanValue() : false;
                            copyncg25m8.RemoteActionCompatParcelizer = 1;
                            return flowCollector.emit(Boolean.valueOf(zBooleanValue), copyncg25m8) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                        }
                        if (i8 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i9 = RemoteActionCompatParcelizer + 117;
                        read = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        ExtrasKt.RemoteActionCompatParcelizer(obj3);
                        return createfromparcel;
                    }
                    if (shortNewsContentCardView instanceof copyIuqyXdg) {
                        copyiuqyxdg = (copyIuqyXdg) shortNewsContentCardView;
                        int i11 = copyiuqyxdg.IconCompatParcelizer;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            int i12 = read + 29;
                            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                            if (i12 % 2 == 0) {
                                copyiuqyxdg.IconCompatParcelizer = i11 >> Integer.MIN_VALUE;
                            } else {
                                copyiuqyxdg.IconCompatParcelizer = i11 - Integer.MIN_VALUE;
                            }
                        } else {
                            copyiuqyxdg = new copyIuqyXdg(this, shortNewsContentCardView);
                        }
                    } else {
                        copyiuqyxdg = new copyIuqyXdg(this, shortNewsContentCardView);
                    }
                    Object obj4 = copyiuqyxdg.write;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = copyiuqyxdg.IconCompatParcelizer;
                    if (i13 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj4);
                        Boolean bool2 = (Boolean) ((getNoActiveChildannotations) obj).serializer(autoAcceptPreferencesDataStoreImpl.serializer);
                        zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                        copyiuqyxdg.IconCompatParcelizer = 1;
                        return flowCollector.emit(Boolean.valueOf(zBooleanValue), copyiuqyxdg) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                    }
                    if (i13 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        int i14 = read + 107;
                        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        return null;
                    }
                    int i16 = RemoteActionCompatParcelizer + 87;
                    read = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj4);
                        return createfromparcel;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                    obj2.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
            
                if (r9 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
            
                r10 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.serializer + 47;
                com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                r10 = r10 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
            
                return r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
            
                r9 = r6.collect(new com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.AnonymousClass2(r9, r5, r2), r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
            
                if (r9 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
            
                r10 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read + 1;
                r1 = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.serializer = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
            
                if ((r10 % 2) != 0) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
            
                r1 = r1 + 45;
                com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
            
                return r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
            
                return r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
            
                return r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
            
                if (r1 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
            
                if (r1 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
            
                r9 = r6.collect(new com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.AnonymousClass2(r9, r5, r3), r10);
             */
            @Override // kotlinx.coroutines.flow.Flow
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r9, o.ShortNewsContentCardView r10) {
                /*
                    r8 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read
                    int r1 = r1 + 111
                    int r2 = r1 % 128
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.serializer = r2
                    int r1 = r1 % r0
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1e
                    int r1 = r3
                    o.createFromParcel r4 = o.createFromParcel.INSTANCE
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl r5 = r2
                    kotlinx.coroutines.flow.Flow r6 = r1
                    r7 = 39
                    int r7 = r7 / r2
                    if (r1 == 0) goto L40
                    goto L28
                L1e:
                    int r1 = r3
                    o.createFromParcel r4 = o.createFromParcel.INSTANCE
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl r5 = r2
                    kotlinx.coroutines.flow.Flow r6 = r1
                    if (r1 == 0) goto L40
                L28:
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1$2 r1 = new com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1$2
                    r1.<init>(r9, r5, r3)
                    java.lang.Object r9 = r6.collect(r1, r10)
                    kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    if (r9 != r10) goto L3f
                    int r10 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.serializer
                    int r10 = r10 + 47
                    int r1 = r10 % 128
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read = r1
                    int r10 = r10 % r0
                    r4 = r9
                L3f:
                    return r4
                L40:
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1$2 r1 = new com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1$2
                    r1.<init>(r9, r5, r2)
                    java.lang.Object r9 = r6.collect(r1, r10)
                    kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    if (r9 != r10) goto L62
                    int r10 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read
                    int r10 = r10 + r3
                    int r1 = r10 % 128
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.serializer = r1
                    int r10 = r10 % r0
                    if (r10 != 0) goto L60
                    int r1 = r1 + 45
                    int r10 = r1 % 128
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read = r10
                    int r1 = r1 % r0
                    r4 = r9
                    goto L62
                L60:
                    r9 = 0
                    throw r9
                L62:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.collect(kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):java.lang.Object");
            }
        };
        final Flow flowSerializer2 = autoAcceptPreferencesDataStoreImpl.read.serializer();
        final int i2 = 0;
        this.serializer = FlowKt.write(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, new Flow() { // from class: com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1
            private static int read = 1;
            private static int serializer;

            /* JADX INFO: renamed from: com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2 implements FlowCollector {
                private static int RemoteActionCompatParcelizer = 1;
                private static int read;
                public final /* synthetic */ int IconCompatParcelizer;
                public final /* synthetic */ AutoAcceptPreferencesDataStoreImpl serializer;
                public final /* synthetic */ FlowCollector write;

                public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl, int i) {
                    this.IconCompatParcelizer = i;
                    this.write = flowCollector;
                    this.serializer = autoAcceptPreferencesDataStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:12:0x0035  */
                /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                    copyNcG25M8 copyncg25m8;
                    boolean zBooleanValue;
                    copyIuqyXdg copyiuqyxdg;
                    int i = 2 % 2;
                    int i2 = this.IconCompatParcelizer;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl = this.serializer;
                    FlowCollector flowCollector = this.write;
                    Object obj2 = null;
                    if (i2 == 0) {
                        if (shortNewsContentCardView instanceof copyNcG25M8) {
                            int i3 = read + 81;
                            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                            int i4 = i3 % 2;
                            copyncg25m8 = (copyNcG25M8) shortNewsContentCardView;
                            int i5 = copyncg25m8.RemoteActionCompatParcelizer;
                            if ((i5 & Integer.MIN_VALUE) != 0) {
                                int i6 = read + 33;
                                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                                copyncg25m8.RemoteActionCompatParcelizer = i5 - Integer.MIN_VALUE;
                            } else {
                                copyncg25m8 = new copyNcG25M8(this, shortNewsContentCardView);
                            }
                        } else {
                            copyncg25m8 = new copyNcG25M8(this, shortNewsContentCardView);
                        }
                        Object obj3 = copyncg25m8.read;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i8 = copyncg25m8.RemoteActionCompatParcelizer;
                        if (i8 == 0) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj3);
                            Boolean bool = (Boolean) ((getNoActiveChildannotations) obj).serializer(autoAcceptPreferencesDataStoreImpl.write);
                            zBooleanValue = bool != null ? bool.booleanValue() : false;
                            copyncg25m8.RemoteActionCompatParcelizer = 1;
                            return flowCollector.emit(Boolean.valueOf(zBooleanValue), copyncg25m8) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                        }
                        if (i8 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i9 = RemoteActionCompatParcelizer + 117;
                        read = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        ExtrasKt.RemoteActionCompatParcelizer(obj3);
                        return createfromparcel;
                    }
                    if (shortNewsContentCardView instanceof copyIuqyXdg) {
                        copyiuqyxdg = (copyIuqyXdg) shortNewsContentCardView;
                        int i11 = copyiuqyxdg.IconCompatParcelizer;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            int i12 = read + 29;
                            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                            if (i12 % 2 == 0) {
                                copyiuqyxdg.IconCompatParcelizer = i11 >> Integer.MIN_VALUE;
                            } else {
                                copyiuqyxdg.IconCompatParcelizer = i11 - Integer.MIN_VALUE;
                            }
                        } else {
                            copyiuqyxdg = new copyIuqyXdg(this, shortNewsContentCardView);
                        }
                    } else {
                        copyiuqyxdg = new copyIuqyXdg(this, shortNewsContentCardView);
                    }
                    Object obj4 = copyiuqyxdg.write;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = copyiuqyxdg.IconCompatParcelizer;
                    if (i13 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj4);
                        Boolean bool2 = (Boolean) ((getNoActiveChildannotations) obj).serializer(autoAcceptPreferencesDataStoreImpl.serializer);
                        zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                        copyiuqyxdg.IconCompatParcelizer = 1;
                        return flowCollector.emit(Boolean.valueOf(zBooleanValue), copyiuqyxdg) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                    }
                    if (i13 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        int i14 = read + 107;
                        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        return null;
                    }
                    int i16 = RemoteActionCompatParcelizer + 87;
                    read = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj4);
                        return createfromparcel;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                    obj2.hashCode();
                    throw null;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r9, o.ShortNewsContentCardView r10) {
                /*
                    r8 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read
                    int r1 = r1 + 111
                    int r2 = r1 % 128
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.serializer = r2
                    int r1 = r1 % r0
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1e
                    int r1 = r3
                    o.createFromParcel r4 = o.createFromParcel.INSTANCE
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl r5 = r2
                    kotlinx.coroutines.flow.Flow r6 = r1
                    r7 = 39
                    int r7 = r7 / r2
                    if (r1 == 0) goto L40
                    goto L28
                L1e:
                    int r1 = r3
                    o.createFromParcel r4 = o.createFromParcel.INSTANCE
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl r5 = r2
                    kotlinx.coroutines.flow.Flow r6 = r1
                    if (r1 == 0) goto L40
                L28:
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1$2 r1 = new com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1$2
                    r1.<init>(r9, r5, r3)
                    java.lang.Object r9 = r6.collect(r1, r10)
                    kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    if (r9 != r10) goto L3f
                    int r10 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.serializer
                    int r10 = r10 + 47
                    int r1 = r10 % 128
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read = r1
                    int r10 = r10 % r0
                    r4 = r9
                L3f:
                    return r4
                L40:
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1$2 r1 = new com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1$2
                    r1.<init>(r9, r5, r2)
                    java.lang.Object r9 = r6.collect(r1, r10)
                    kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    if (r9 != r10) goto L62
                    int r10 = com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read
                    int r10 = r10 + r3
                    int r1 = r10 % 128
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.serializer = r1
                    int r10 = r10 % r0
                    if (r10 != 0) goto L60
                    int r1 = r1 + 45
                    int r10 = r1 % 128
                    com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.read = r10
                    int r1 = r1 % r0
                    r4 = r9
                    goto L62
                L60:
                    r9 = 0
                    throw r9
                L62:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$observeEndShiftOpted$$inlined$map$1.collect(kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):java.lang.Object");
            }
        }, new SideMenuViewModel$observeSideMenuDrawerState$1$1(3, i, null)), toBitmapConfig1JJdX4A.IconCompatParcelizer(this), SharingStarted.Companion.read(3), new TextMotionSaverlambda1(new SpanStyle(false), new emojiSupportMatchSaverlambda0(false, false)));
    }
}
