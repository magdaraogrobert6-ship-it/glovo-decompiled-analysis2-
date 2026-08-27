package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.SensitiveContentNode;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ButtonElevation$animateElevation$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ float IconCompatParcelizer;
    public final /* synthetic */ SensitiveContentNode MediaDescriptionCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ o.ButtonDefaults serializer;
    public final /* synthetic */ Animatable write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2$1(Animatable animatable, float f, boolean z, SensitiveContentNode sensitiveContentNode, o.ButtonDefaults buttonDefaults, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = animatable;
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = z;
        this.MediaDescriptionCompat = sensitiveContentNode;
        this.serializer = buttonDefaults;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new ButtonElevation$animateElevation$2$1(this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.MediaDescriptionCompat, this.serializer, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((ButtonElevation$animateElevation$2$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r8.snapTo(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m135animateElevationrAjV9yQ(r8, r5, r4, r7.serializer, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.read
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L19
            if (r1 == r3) goto L14
            if (r1 != r2) goto Le
            goto L14
        Le:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r4
        L14:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L90
        L19:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            androidx.compose.animation.core.Animatable r8 = r7.write
            o.PopulateViewStructure_androidKtpopulate7 r1 = r8.RatingCompat
            o.onShowTranslationui r1 = (o.onShowTranslationui) r1
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.unit.Dp r1 = (androidx.compose.ui.unit.Dp) r1
            float r1 = r1.m3687unboximpl()
            float r5 = r7.IconCompatParcelizer
            boolean r1 = androidx.compose.ui.unit.Dp.m3678equalsimpl0(r1, r5)
            if (r1 != 0) goto L90
            boolean r1 = r7.RemoteActionCompatParcelizer
            if (r1 != 0) goto L45
            androidx.compose.ui.unit.Dp r1 = androidx.compose.ui.unit.Dp.m3671boximpl(r5)
            r7.read = r3
            java.lang.Object r8 = r8.snapTo(r1, r7)
            if (r8 != r0) goto L90
            goto L8f
        L45:
            o.PopulateViewStructure_androidKtpopulate7 r1 = r8.RatingCompat
            o.onShowTranslationui r1 = (o.onShowTranslationui) r1
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.unit.Dp r1 = (androidx.compose.ui.unit.Dp) r1
            float r1 = r1.m3687unboximpl()
            o.SensitiveContentNode r3 = r7.MediaDescriptionCompat
            float r6 = r3.IconCompatParcelizer
            boolean r6 = androidx.compose.ui.unit.Dp.m3678equalsimpl0(r1, r6)
            if (r6 == 0) goto L6a
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.Companion
            long r3 = r1.m493getZeroF1C5BW0()
            o.Button r1 = new o.Button
            r1.<init>(r3)
            r4 = r1
            goto L85
        L6a:
            float r6 = r3.serializer
            boolean r6 = androidx.compose.ui.unit.Dp.m3678equalsimpl0(r1, r6)
            if (r6 == 0) goto L78
            o.ButtonKt r4 = new o.ButtonKt
            r4.<init>()
            goto L85
        L78:
            float r3 = r3.read
            boolean r1 = androidx.compose.ui.unit.Dp.m3678equalsimpl0(r1, r3)
            if (r1 == 0) goto L85
            o.BottomSheetScaffoldKtStandardBottomSheet3 r4 = new o.BottomSheetScaffoldKtStandardBottomSheet3
            r4.<init>()
        L85:
            r7.read = r2
            o.ButtonDefaults r1 = r7.serializer
            java.lang.Object r8 = androidx.compose.material3.internal.ElevationKt.m135animateElevationrAjV9yQ(r8, r5, r4, r1, r7)
            if (r8 != r0) goto L90
        L8f:
            return r0
        L90:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
