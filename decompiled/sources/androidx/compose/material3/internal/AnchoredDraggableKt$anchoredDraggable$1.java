package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableKt$anchoredDraggable$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public /* synthetic */ float IconCompatParcelizer;
    public /* synthetic */ getContentViewGroupParentLayout read;
    public final /* synthetic */ AnchoredDraggableState write;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaBrowserCompatMediaItem = 1;
        private static int RemoteActionCompatParcelizer;
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ float read;
        public int serializer;
        public final /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, float f, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.write = obj;
            this.read = f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if ((r6 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        
            return new androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1((androidx.compose.material3.internal.AnchoredDraggableState) r4.write, r4.read, r6, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r4.IconCompatParcelizer != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r4.IconCompatParcelizer != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r2 = new androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1((com.roadrunner.rrds.compose.component.image.zoomable.ZoomState) r4.write, r4.read, r6, 1);
            r6 = androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.RemoteActionCompatParcelizer + 31;
            androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.MediaBrowserCompatMediaItem = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.ShortNewsContentCardView create(java.lang.Object r5, o.ShortNewsContentCardView r6) {
            /*
                r4 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.RemoteActionCompatParcelizer
                int r0 = r0 + 65
                int r1 = r0 % 128
                androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.MediaBrowserCompatMediaItem = r1
                int r0 = r0 % r5
                r1 = 0
                if (r0 != 0) goto L17
                int r0 = r4.IconCompatParcelizer
                r2 = 91
                int r2 = r2 / r1
                if (r0 == 0) goto L35
                goto L1b
            L17:
                int r0 = r4.IconCompatParcelizer
                if (r0 == 0) goto L35
            L1b:
                java.lang.Object r0 = r4.write
                com.roadrunner.rrds.compose.component.image.zoomable.ZoomState r0 = (com.roadrunner.rrds.compose.component.image.zoomable.ZoomState) r0
                float r1 = r4.read
                androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1 r2 = new androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1
                r3 = 1
                r2.<init>(r0, r1, r6, r3)
                int r6 = androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.RemoteActionCompatParcelizer
                int r6 = r6 + 31
                int r0 = r6 % 128
                androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.MediaBrowserCompatMediaItem = r0
                int r6 = r6 % r5
                if (r6 == 0) goto L33
                return r2
            L33:
                r5 = 0
                throw r5
            L35:
                java.lang.Object r5 = r4.write
                androidx.compose.material3.internal.AnchoredDraggableState r5 = (androidx.compose.material3.internal.AnchoredDraggableState) r5
                float r0 = r4.read
                androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1 r2 = new androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1
                r2.<init>(r5, r0, r6, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            return ((androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1) create(r5, r6)).invokeSuspend(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        
            r5 = ((androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1) create(r5, r6)).invokeSuspend(r2);
            r6 = androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.RemoteActionCompatParcelizer + 105;
            androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.MediaBrowserCompatMediaItem = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        
            if (r1 != 0) goto L9;
         */
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.RemoteActionCompatParcelizer
                int r1 = r1 + 1
                int r2 = r1 % 128
                androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.MediaBrowserCompatMediaItem = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L1c
                int r1 = r4.IconCompatParcelizer
                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
                o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
                r3 = 5
                int r3 = r3 / 0
                if (r1 == 0) goto L31
                goto L26
            L1c:
                int r1 = r4.IconCompatParcelizer
                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
                o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
                if (r1 == 0) goto L31
            L26:
                o.ShortNewsContentCardView r5 = r4.create(r5, r6)
                androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1 r5 = (androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1) r5
                java.lang.Object r5 = r5.invokeSuspend(r2)
                return r5
            L31:
                o.ShortNewsContentCardView r5 = r4.create(r5, r6)
                androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1 r5 = (androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1) r5
                java.lang.Object r5 = r5.invokeSuspend(r2)
                int r6 = androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.RemoteActionCompatParcelizer
                int r6 = r6 + 105
                int r1 = r6 % 128
                androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.MediaBrowserCompatMediaItem = r1
                int r6 = r6 % r0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = this.IconCompatParcelizer;
            Object obj2 = createFromParcel.INSTANCE;
            float f = this.read;
            Object obj3 = this.write;
            Object obj4 = null;
            if (i2 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.serializer;
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    if (((AnchoredDraggableState) obj3).settle(f, this) != coroutineSingletons) {
                        return obj2;
                    }
                    int i4 = RemoteActionCompatParcelizer + 45;
                    MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return coroutineSingletons;
                }
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = MediaBrowserCompatMediaItem + 43;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj4.hashCode();
                throw null;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.serializer;
            if (i7 != 0) {
                int i8 = MediaBrowserCompatMediaItem + 37;
                int i9 = i8 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i9;
                int i10 = i8 % 2;
                if (i7 == 1) {
                    int i11 = i9 + 69;
                    MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    obj2 = null;
                }
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Animatable animatable = ((ZoomState) obj3).write;
                Float f2 = new Float(f);
                this.serializer = 1;
                if (animatable.snapTo(f2, this) == coroutineSingletons2) {
                    int i13 = MediaBrowserCompatMediaItem;
                    int i14 = i13 + 85;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    int i16 = i13 + 51;
                    RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    obj2 = coroutineSingletons2;
                }
            }
            int i18 = MediaBrowserCompatMediaItem + 119;
            RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            return obj2;
        }
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        AnchoredDraggableKt$anchoredDraggable$1 anchoredDraggableKt$anchoredDraggable$1 = new AnchoredDraggableKt$anchoredDraggable$1(this.write, (ShortNewsContentCardView) obj3);
        anchoredDraggableKt$anchoredDraggable$1.read = (getContentViewGroupParentLayout) obj;
        anchoredDraggableKt$anchoredDraggable$1.IconCompatParcelizer = fFloatValue;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        anchoredDraggableKt$anchoredDraggable$1.invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        BuildersKt.RemoteActionCompatParcelizer(this.read, null, null, new AnonymousClass1(this.write, this.IconCompatParcelizer, null, 0), 3);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$anchoredDraggable$1(AnchoredDraggableState anchoredDraggableState, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.write = anchoredDraggableState;
    }
}
