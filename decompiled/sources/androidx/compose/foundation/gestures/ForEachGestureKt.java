package androidx.compose.foundation.gestures;

import android.view.View;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.SequenceBuilderIterator;
import o.AlignmentHorizontal;
import o.AndroidContentCaptureManager;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getDriver;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ForEachGestureKt {
    private static int serializer = 0;
    private static int write = 1;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2, reason: invalid class name */
    public final class AnonymousClass2 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 0;
        private static int write = 1;
        public /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ int read;
        public int serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
            super(i, shortNewsContentCardView);
            this.read = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer + 53;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = this.read;
            if (i5 == 0) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(i, 0, shortNewsContentCardView);
                anonymousClass2.RemoteActionCompatParcelizer = obj;
                return anonymousClass2;
            }
            int i6 = 1;
            if (i5 == 1) {
                AnonymousClass2 anonymousClass3 = new AnonymousClass2(i, i6, shortNewsContentCardView);
                anonymousClass3.RemoteActionCompatParcelizer = obj;
                return anonymousClass3;
            }
            if (i5 == 2) {
                AnonymousClass2 anonymousClass4 = new AnonymousClass2(i, i, shortNewsContentCardView);
                anonymousClass4.RemoteActionCompatParcelizer = obj;
                int i7 = write + 49;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return anonymousClass4;
                }
                throw null;
            }
            int i8 = 3;
            if (i5 != 3) {
                AnonymousClass2 anonymousClass5 = new AnonymousClass2(i, 4, shortNewsContentCardView);
                anonymousClass5.RemoteActionCompatParcelizer = obj;
                return anonymousClass5;
            }
            AnonymousClass2 anonymousClass6 = new AnonymousClass2(i, i8, shortNewsContentCardView);
            anonymousClass6.RemoteActionCompatParcelizer = obj;
            return anonymousClass6;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (r1 != 3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            return ((androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2) create(r7, r8)).invokeSuspend(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        
            return ((androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2) create(r7, r8)).invokeSuspend(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (r1 != 3) goto L15;
         */
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.write
                int r1 = r1 + 47
                int r2 = r1 % 128
                androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.IconCompatParcelizer = r2
                int r1 = r1 % r0
                r2 = 3
                r3 = 1
                if (r1 == 0) goto L25
                int r1 = r6.read
                o.createFromParcel r4 = o.createFromParcel.INSTANCE
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
                r5 = 72
                int r5 = r5 / 0
                if (r1 == 0) goto L73
                if (r1 == r3) goto L5f
                if (r1 == r0) goto L4b
                if (r1 == r2) goto L40
                goto L35
            L25:
                int r1 = r6.read
                o.createFromParcel r4 = o.createFromParcel.INSTANCE
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
                if (r1 == 0) goto L73
                if (r1 == r3) goto L5f
                if (r1 == r0) goto L4b
                if (r1 == r2) goto L40
            L35:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r7 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                return r7
            L40:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r7 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                return r7
            L4b:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r7 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                int r8 = androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.IconCompatParcelizer
                int r8 = r8 + 113
                int r1 = r8 % 128
                androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.write = r1
                int r8 = r8 % r0
                return r7
            L5f:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r7 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                int r8 = androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.write
                int r8 = r8 + 125
                int r1 = r8 % 128
                androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.IconCompatParcelizer = r1
                int r8 = r8 % r0
                return r7
            L73:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r7 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                int r8 = androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.write
                int r8 = r8 + 5
                int r1 = r8 % 128
                androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.IconCompatParcelizer = r1
                int r8 = r8 % r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:62:0x00f7 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:65:0x0102  */
        /* JADX WARN: Code duplicated, block: B:67:0x010f  */
        /* JADX WARN: Code duplicated, block: B:71:0x0120 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:72:0x0122  */
        /* JADX WARN: Code duplicated, block: B:73:0x0126  */
        /* JADX WARN: Code duplicated, block: B:74:0x012a  */
        /* JADX WARN: Code duplicated, block: B:76:0x013b  */
        /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            if (r1 != 3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        
            r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8.RemoteActionCompatParcelizer;
            r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            r2 = r8.serializer;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        
            if (r2 == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        
            if (r2 != 1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
            r8.RemoteActionCompatParcelizer = null;
            r8.serializer = 1;
            r9 = com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.awaitTouchSlop(r0, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        
            if (r9 != r1) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        
            r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8.RemoteActionCompatParcelizer;
            r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            r7 = r8.serializer;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        
            if (r7 == 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        
            if (r7 != 1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        
            r1 = androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.write + 93;
            androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r1 = r1 % 2;
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
            r8.RemoteActionCompatParcelizer = null;
            r8.serializer = 1;
            r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r1, null, r8, 1, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
        
            if (r9 != r3) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        
            r9 = ((androidx.compose.ui.input.pointer.PointerEvent) r9).getChanges();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            if ((r9 instanceof java.util.Collection) == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        
            if (r9.isEmpty() == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        
            r9 = r9.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
        
            if (r9.hasNext() == false) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
        
            if (((androidx.compose.ui.input.pointer.PointerInputChange) r9.next()).isConsumed() == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
        
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
        
            return java.lang.Boolean.valueOf(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        
            if (r1 != 3) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2, reason: invalid class name and case insensitive filesystem */
    public final class C00342 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public Object IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public Object read;
        public int serializer;
        public final /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C00342(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.read = obj;
            this.write = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = this.RemoteActionCompatParcelizer;
            Object obj2 = this.write;
            if (i == 0) {
                C00342 c00342 = new C00342((TextAnnouncementContentCardView) this.read, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 0);
                c00342.IconCompatParcelizer = obj;
                return c00342;
            }
            int i2 = 1;
            if (i == 1) {
                C00342 c00343 = new C00342((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2, shortNewsContentCardView, i2);
                c00343.read = obj;
                return c00343;
            }
            int i3 = 2;
            if (i == 2) {
                C00342 c00344 = new C00342((PointerEventPass) this.read, (createInAppMessageEventSubscriber) obj2, shortNewsContentCardView, i3);
                c00344.IconCompatParcelizer = obj;
                return c00344;
            }
            int i4 = 3;
            if (i != 3) {
                C00342 c00345 = new C00342((RouteLeg) obj2, shortNewsContentCardView, 4);
                c00345.IconCompatParcelizer = obj;
                return c00345;
            }
            C00342 c00346 = new C00342((AlignmentHorizontal) obj2, shortNewsContentCardView, i4);
            c00346.IconCompatParcelizer = obj;
            return c00346;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i == 0) {
                return ((C00342) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            if (i == 1) {
                return ((C00342) create((SequenceBuilderIterator) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            if (i != 2) {
                return i != 3 ? ((C00342) create((SequenceBuilderIterator) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((C00342) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            return ((C00342) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }

        /* JADX WARN: Code duplicated, block: B:146:0x01d5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x0167 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x019f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x015b  */
        /* JADX WARN: Code duplicated, block: B:64:0x016d  */
        /* JADX WARN: Code duplicated, block: B:65:0x0173  */
        /* JADX WARN: Code duplicated, block: B:67:0x0181  */
        /* JADX WARN: Code duplicated, block: B:69:0x018d  */
        /* JADX WARN: Code duplicated, block: B:83:0x01d2 A[LOOP:3: B:59:0x0159->B:83:0x01d2, LOOP_END] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0] */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v44 */
        /* JADX WARN: Type inference failed for: r5v45 */
        /* JADX WARN: Type inference failed for: r5v46 */
        /* JADX WARN: Type inference failed for: r5v47 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0279 -> B:115:0x025b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x028d -> B:115:0x025b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d2 -> B:37:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01ac -> B:77:0x01b0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x021a -> B:98:0x021f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x021e -> B:98:0x021f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 659
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.C00342.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C00342(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.write = obj;
        }
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C00342(shortNewsContentCardView.getContext(), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView2, 0), shortNewsContentCardView);
        if (objAwaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = serializer + 81;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objAwaitPointerEventScope;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = serializer + 115;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel;
        }
        shortNewsContentCardView2.hashCode();
        throw null;
    }

    public static final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = write + 17;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(getDriver.RemoteActionCompatParcelizer);
            getpostalcode.write(objComponentActivity);
            int i4 = write + 5;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
        View view = (View) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(view);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(view, 24, populateViewStructure_androidKtpopulate7);
            getpostalcode.write(objComponentActivity2);
        }
        getPhoneNumberNational.serializer(view, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode);
        return populateViewStructure_androidKtpopulate7;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e A[LOOP:0: B:24:0x008f->B:28:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b A[EDGE_INSN: B:33:0x006b->B:19:0x006b BREAK  A[LOOP:0: B:24:0x008f->B:28:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:23:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r10, androidx.compose.ui.input.pointer.PointerEventPass r11, kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r12 instanceof o.toStringimpl
            if (r1 == 0) goto L16
            r1 = r12
            o.toStringimpl r1 = (o.toStringimpl) r1
            int r2 = r1.write
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.write = r2
            goto L1b
        L16:
            o.toStringimpl r1 = new o.toStringimpl
            r1.<init>(r12)
        L1b:
            java.lang.Object r12 = r1.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.write
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L42
            int r10 = androidx.compose.foundation.gestures.ForEachGestureKt.serializer
            int r10 = r10 + 3
            int r11 = r10 % 128
            androidx.compose.foundation.gestures.ForEachGestureKt.write = r11
            int r10 = r10 % r0
            if (r3 != r5) goto L3b
            androidx.compose.ui.input.pointer.PointerEventPass r10 = r1.RemoteActionCompatParcelizer
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = r1.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            r9 = r11
            r11 = r10
            r10 = r9
            goto L81
        L3b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            r10 = 0
            return r10
        L42:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r10.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r6 = r4
        L55:
            if (r6 >= r3) goto La4
            int r7 = androidx.compose.foundation.gestures.ForEachGestureKt.serializer
            int r7 = r7 + r5
            int r8 = r7 % 128
            androidx.compose.foundation.gestures.ForEachGestureKt.write = r8
            int r7 = r7 % r0
            java.lang.Object r7 = r12.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.getPressed()
            if (r7 == 0) goto La1
        L6b:
            r1.IconCompatParcelizer = r10
            r1.RemoteActionCompatParcelizer = r11
            r1.write = r5
            java.lang.Object r12 = r10.awaitPointerEvent(r11, r1)
            if (r12 != r2) goto L81
            int r10 = androidx.compose.foundation.gestures.ForEachGestureKt.write
            int r10 = r10 + 49
            int r11 = r10 % 128
            androidx.compose.foundation.gestures.ForEachGestureKt.serializer = r11
            int r10 = r10 % r0
            return r2
        L81:
            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.ui.input.pointer.PointerEvent) r12
            java.util.List r12 = r12.getChanges()
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r6 = r4
        L8f:
            if (r6 >= r3) goto La4
            java.lang.Object r7 = r12.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.getPressed()
            if (r7 == 0) goto L9e
            goto L6b
        L9e:
            int r6 = r6 + 1
            goto L8f
        La1:
            int r6 = r6 + 1
            goto L55
        La4:
            o.createFromParcel r10 = o.createFromParcel.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r12v18, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r12v2, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v3, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.deliveryhero.perseus.logger.PerseusLogger$e$1] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8, types: [o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0] */
    /* JADX WARN: Type inference failed for: r14v14, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r4v20, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope r12, com.deliveryhero.perseus.logger.PerseusLogger$e$1 r13, o.ShortNewsContentCardView r14) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, com.deliveryhero.perseus.logger.PerseusLogger$e$1, o.ShortNewsContentCardView):java.lang.Object");
    }
}
