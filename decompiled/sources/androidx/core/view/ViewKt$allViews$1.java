package androidx.core.view;

import android.view.View;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.SequenceBuilderIterator;
import o.Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ Object IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewKt$allViews$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.write;
        Object obj2 = this.IconCompatParcelizer;
        if (i == 0) {
            ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1((View) obj2, shortNewsContentCardView, 0);
            viewKt$allViews$1.read = obj;
            return viewKt$allViews$1;
        }
        int i2 = 1;
        if (i == 1) {
            ViewKt$allViews$1 viewKt$allViews$2 = new ViewKt$allViews$1((AndroidEdgeEffectOverscrollEffect) obj2, shortNewsContentCardView, i2);
            viewKt$allViews$2.read = obj;
            return viewKt$allViews$2;
        }
        int i3 = 2;
        if (i == 2) {
            ViewKt$allViews$1 viewKt$allViews$3 = new ViewKt$allViews$1((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, i3);
            viewKt$allViews$3.read = obj;
            return viewKt$allViews$3;
        }
        int i4 = 3;
        if (i == 3) {
            ViewKt$allViews$1 viewKt$allViews$4 = new ViewKt$allViews$1((Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1) obj2, shortNewsContentCardView, i4);
            viewKt$allViews$4.read = obj;
            return viewKt$allViews$4;
        }
        int i5 = 4;
        if (i != 4) {
            ViewKt$allViews$1 viewKt$allViews$5 = new ViewKt$allViews$1((LegAnnotation) obj2, shortNewsContentCardView, 5);
            viewKt$allViews$5.read = obj;
            return viewKt$allViews$5;
        }
        ViewKt$allViews$1 viewKt$allViews$6 = new ViewKt$allViews$1((PointerEventPass) obj2, shortNewsContentCardView, i5);
        viewKt$allViews$6.read = obj;
        return viewKt$allViews$6;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            return ((ViewKt$allViews$1) create((SequenceBuilderIterator) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i == 1) {
            return ((ViewKt$allViews$1) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i == 2) {
            return ((ViewKt$allViews$1) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i != 3) {
            return i != 4 ? ((ViewKt$allViews$1) create((SequenceBuilderIterator) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((ViewKt$allViews$1) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        return ((ViewKt$allViews$1) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3 A[PHI: r3
  0x00b3: PHI (r3v31 kotlin.sequences.SequenceBuilderIterator) = (r3v28 kotlin.sequences.SequenceBuilderIterator), (r3v33 kotlin.sequences.SequenceBuilderIterator) binds: [B:35:0x00af, B:20:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[PHI: r3
  0x00d0: PHI (r3v34 kotlin.sequences.SequenceBuilderIterator) = (r3v31 kotlin.sequences.SequenceBuilderIterator), (r3v36 kotlin.sequences.SequenceBuilderIterator) binds: [B:42:0x00cc, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed A[PHI: r3
  0x00ed: PHI (r3v37 kotlin.sequences.SequenceBuilderIterator) = (r3v34 kotlin.sequences.SequenceBuilderIterator), (r3v39 kotlin.sequences.SequenceBuilderIterator) binds: [B:49:0x00e9, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b A[PHI: r3
  0x010b: PHI (r3v40 kotlin.sequences.SequenceBuilderIterator) = (r3v37 kotlin.sequences.SequenceBuilderIterator), (r3v42 kotlin.sequences.SequenceBuilderIterator) binds: [B:56:0x0107, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128 A[PHI: r3
  0x0128: PHI (r3v43 kotlin.sequences.SequenceBuilderIterator) = (r3v40 kotlin.sequences.SequenceBuilderIterator), (r3v45 kotlin.sequences.SequenceBuilderIterator) binds: [B:63:0x0125, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0138  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145 A[PHI: r3
  0x0145: PHI (r3v46 kotlin.sequences.SequenceBuilderIterator) = (r3v43 kotlin.sequences.SequenceBuilderIterator), (r3v48 kotlin.sequences.SequenceBuilderIterator) binds: [B:70:0x0142, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0155  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163 A[PHI: r3
  0x0163: PHI (r3v49 kotlin.sequences.SequenceBuilderIterator) = (r3v46 kotlin.sequences.SequenceBuilderIterator), (r3v51 kotlin.sequences.SequenceBuilderIterator) binds: [B:77:0x0160, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0169  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x01cc -> B:106:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0286 -> B:138:0x028b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:96:0x01a6
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
