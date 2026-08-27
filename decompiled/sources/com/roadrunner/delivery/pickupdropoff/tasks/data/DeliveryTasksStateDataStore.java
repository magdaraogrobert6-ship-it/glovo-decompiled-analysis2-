package com.roadrunner.delivery.pickupdropoff.tasks.data;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.heatmap.data.HeatmapDataStore$setBoolean$2;
import java.io.IOException;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AnimatedVisibilityClock;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.isRoot;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCurrentValue;
import o.setState7IW2chM;
import o.toCurrentTargetPair7IW2chM;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryTasksStateDataStore {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final performCustomExitMxy_nc0 IconCompatParcelizer;

    /* JADX INFO: renamed from: com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore$add$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaDescriptionCompat = 1;
        private static int serializer;
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ isRoot RemoteActionCompatParcelizer;
        public /* synthetic */ Object read;
        public final /* synthetic */ String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(isRoot isroot, String str, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = isroot;
            this.write = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            r1 = new com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2(r4, r3, r8, r2);
            r1.read = r7;
            r7 = com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.MediaDescriptionCompat + 81;
            com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.serializer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = new com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2(r4, r3, r8, 1);
            r1.read = r7;
            r7 = com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.serializer + 67;
            com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.MediaDescriptionCompat = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r7 = r7 % 2;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.ShortNewsContentCardView create(java.lang.Object r7, o.ShortNewsContentCardView r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.MediaDescriptionCompat
                int r1 = r1 + 9
                int r2 = r1 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.serializer = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L1b
                int r1 = r6.IconCompatParcelizer
                java.lang.String r3 = r6.write
                o.isRoot r4 = r6.RemoteActionCompatParcelizer
                r5 = 11
                int r5 = r5 / r2
                if (r1 == 0) goto L35
                goto L23
            L1b:
                int r1 = r6.IconCompatParcelizer
                java.lang.String r3 = r6.write
                o.isRoot r4 = r6.RemoteActionCompatParcelizer
                if (r1 == 0) goto L35
            L23:
                com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore$add$2 r1 = new com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore$add$2
                r2 = 1
                r1.<init>(r4, r3, r8, r2)
                r1.read = r7
                int r7 = com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.serializer
                int r7 = r7 + 67
                int r8 = r7 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.MediaDescriptionCompat = r8
                int r7 = r7 % r0
                return r1
            L35:
                com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore$add$2 r1 = new com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore$add$2
                r1.<init>(r4, r3, r8, r2)
                r1.read = r7
                int r7 = com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.MediaDescriptionCompat
                int r7 = r7 + 81
                int r8 = r7 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.serializer = r8
                int r7 = r7 % r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore.AnonymousClass2.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = serializer + 109;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            backwardFocusSearch backwardfocussearch = (backwardFocusSearch) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 != 0) {
                ((AnonymousClass2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                return createfromparcel;
            }
            ((AnonymousClass2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = MediaDescriptionCompat + 85;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return createfromparcel;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 125;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                throw null;
            }
            int i3 = this.IconCompatParcelizer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            String str = this.write;
            isRoot isroot = this.RemoteActionCompatParcelizer;
            backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.read;
            if (i3 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch.getClass();
                backwardfocussearch.serializer(isroot, str);
                return createfromparcel2;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            backwardfocussearch.write(isroot, str);
            int i4 = MediaDescriptionCompat + 115;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel2;
        }
    }

    public DeliveryTasksStateDataStore(performCustomExitMxy_nc0 performcustomexitmxy_nc0) {
        this.IconCompatParcelizer = performcustomexitmxy_nc0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object retainAll(Set set, ContinuationImpl continuationImpl) {
        setState7IW2chM setstate7iw2chm;
        int i = 2 % 2;
        if (continuationImpl instanceof setState7IW2chM) {
            setstate7iw2chm = (setState7IW2chM) continuationImpl;
            int i2 = setstate7iw2chm.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setstate7iw2chm.serializer = i2 - Integer.MIN_VALUE;
            } else {
                setstate7iw2chm = new setState7IW2chM(this, continuationImpl);
            }
        } else {
            setstate7iw2chm = new setState7IW2chM(this, continuationImpl);
        }
        Object obj = setstate7iw2chm.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = setstate7iw2chm.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i4 = 1;
        try {
            if (i3 != 0) {
                int i5 = RemoteActionCompatParcelizer + 117;
                int i6 = i5 % Fields.SpotShadowColor;
                write = i6;
                int i7 = i5 % 2;
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i8 = write + 83;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        int i9 = 9 / 0;
                    }
                    return null;
                }
                int i10 = i6 + 55;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.IconCompatParcelizer;
                SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, shortNewsContentCardView, i4);
                setstate7iw2chm.serializer = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, sharedPreferencesMigrationKt$getShouldRunMigration$1, setstate7iw2chm) == coroutineSingletons) {
                    int i12 = write + 93;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    return coroutineSingletons;
                }
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to retain delivery task states", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final Object add(isRoot isroot, String str, ContinuationImpl continuationImpl) {
        AnimatedVisibilityClock animatedVisibilityClock;
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (continuationImpl instanceof AnimatedVisibilityClock) {
            int i2 = RemoteActionCompatParcelizer + 87;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((AnimatedVisibilityClock) continuationImpl).IconCompatParcelizer;
                throw null;
            }
            animatedVisibilityClock = (AnimatedVisibilityClock) continuationImpl;
            int i4 = animatedVisibilityClock.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                animatedVisibilityClock.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                animatedVisibilityClock = new AnimatedVisibilityClock(this, continuationImpl);
            }
        } else {
            animatedVisibilityClock = new AnimatedVisibilityClock(this, continuationImpl);
        }
        Object obj = animatedVisibilityClock.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = animatedVisibilityClock.IconCompatParcelizer;
        int i6 = 0;
        try {
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.IconCompatParcelizer;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(isroot, str, shortNewsContentCardView, i6);
                animatedVisibilityClock.IconCompatParcelizer = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, anonymousClass2, animatedVisibilityClock) == coroutineSingletons) {
                    int i7 = write + 91;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        return coroutineSingletons;
                    }
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = write + 79;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to add delivery task state", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public final Object delete(isRoot isroot, ContinuationImpl continuationImpl) {
        setCurrentValue setcurrentvalue;
        int i = 2;
        int i2 = 2 % 2;
        if (!(continuationImpl instanceof setCurrentValue)) {
            setcurrentvalue = new setCurrentValue(this, continuationImpl);
        } else {
            int i3 = RemoteActionCompatParcelizer + 37;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            setcurrentvalue = (setCurrentValue) continuationImpl;
            int i5 = setcurrentvalue.write;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = RemoteActionCompatParcelizer + 29;
                write = i6 % Fields.SpotShadowColor;
                setcurrentvalue.write = i6 % 2 == 0 ? i5 / Integer.MIN_VALUE : i5 - Integer.MIN_VALUE;
            } else {
                setcurrentvalue = new setCurrentValue(this, continuationImpl);
            }
        }
        Object obj = setcurrentvalue.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = setcurrentvalue.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i7 != 0) {
                int i8 = write + 3;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (i7 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.IconCompatParcelizer;
                HeatmapDataStore$setBoolean$2 heatmapDataStore$setBoolean$2 = new HeatmapDataStore$setBoolean$2(i, isroot, shortNewsContentCardView);
                setcurrentvalue.write = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, heatmapDataStore$setBoolean$2, setcurrentvalue) == coroutineSingletons) {
                    int i10 = write + 119;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        int i11 = 72 / 0;
                    }
                    return coroutineSingletons;
                }
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to delete delivery task state", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    public final Object clear(ContinuationImpl continuationImpl) {
        toCurrentTargetPair7IW2chM tocurrenttargetpair7iw2chm;
        int i = 2 % 2;
        if (!(!(continuationImpl instanceof toCurrentTargetPair7IW2chM))) {
            tocurrenttargetpair7iw2chm = (toCurrentTargetPair7IW2chM) continuationImpl;
            int i2 = tocurrenttargetpair7iw2chm.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = RemoteActionCompatParcelizer + 35;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    tocurrenttargetpair7iw2chm.RemoteActionCompatParcelizer = i2 >> Integer.MIN_VALUE;
                } else {
                    tocurrenttargetpair7iw2chm.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
                }
            } else {
                tocurrenttargetpair7iw2chm = new toCurrentTargetPair7IW2chM(this, continuationImpl);
            }
        } else {
            tocurrenttargetpair7iw2chm = new toCurrentTargetPair7IW2chM(this, continuationImpl);
        }
        Object obj = tocurrenttargetpair7iw2chm.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = tocurrenttargetpair7iw2chm.RemoteActionCompatParcelizer;
        try {
            if (i4 != 0) {
                int i5 = RemoteActionCompatParcelizer + 57;
                int i6 = i5 % Fields.SpotShadowColor;
                write = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = i6 + 45;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.IconCompatParcelizer;
                SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(11);
                tocurrenttargetpair7iw2chm.RemoteActionCompatParcelizer = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, signInDataStore$clear$2, tocurrenttargetpair7iw2chm) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to clear delivery task state", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }
}
