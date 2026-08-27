package androidx.lifecycle;

import android.net.Uri;
import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.gestures.AnchoredDraggableNode;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.NonTouchScrollingLogic;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material.ripple.RippleNode;
import androidx.compose.material3.FloatingActionButtonElevationAnimatable;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.datastore.rxjava2.RxDataStore;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import androidx.room.coroutines.PooledConnectionImpl;
import bo.app.n$$ExternalSyntheticLambda3;
import com.huawei.location.logic.E5;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import o.AndroidGraphicsContext1;
import o.BezierKtWhenMappings;
import o.ButtonDefaults;
import o.ButtonKt;
import o.FloatingTextActionModeCallback;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TrackpadScrollingLogic;
import o.accessgetGreencp;
import o.accessunregisterComponentCallback;
import o.addOnPictureInPictureModeChangedListener;
import o.copyjRlVdoo;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getNormalNSsRyOo;
import o.getTraverseKey;
import o.logUnregisterActivitylambda1;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setFrameRate;
import o.setRootAutofillId;

/* JADX INFO: loaded from: classes.dex */
public final class BlockRunner$maybeRun$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public int serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$maybeRun$1(AndroidGraphicsContext1 androidGraphicsContext1, Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 27;
        this.write = androidGraphicsContext1;
        this.IconCompatParcelizer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.read;
        Object obj2 = this.write;
        switch (i) {
            case 0:
                BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1((BlockRunner) obj2, shortNewsContentCardView, 0);
                blockRunner$maybeRun$1.IconCompatParcelizer = obj;
                return blockRunner$maybeRun$1;
            case 1:
                return new BlockRunner$maybeRun$1((addOnPictureInPictureModeChangedListener) obj2, shortNewsContentCardView, 1);
            case 2:
                return new BlockRunner$maybeRun$1((MutableInteractionSourceImpl) this.IconCompatParcelizer, (ButtonKt) obj2, shortNewsContentCardView, 2);
            case 3:
                return new BlockRunner$maybeRun$1((MutableInteractionSourceImpl) this.IconCompatParcelizer, (copyjRlVdoo) obj2, shortNewsContentCardView, 3);
            case 4:
                return new BlockRunner$maybeRun$1((AnchoredDraggableNode) this.IconCompatParcelizer, (FloatingTextActionModeCallback) obj2, shortNewsContentCardView, 4);
            case 5:
                BlockRunner$maybeRun$1 blockRunner$maybeRun$2 = new BlockRunner$maybeRun$1((MouseWheelScrollingLogic) obj2, shortNewsContentCardView, 5);
                blockRunner$maybeRun$2.IconCompatParcelizer = obj;
                return blockRunner$maybeRun$2;
            case 6:
                return new BlockRunner$maybeRun$1((NonTouchScrollingLogic) this.IconCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 6);
            case 7:
                BlockRunner$maybeRun$1 blockRunner$maybeRun$3 = new BlockRunner$maybeRun$1((logUnregisterActivitylambda1) obj2, shortNewsContentCardView, 7);
                blockRunner$maybeRun$3.IconCompatParcelizer = obj;
                return blockRunner$maybeRun$3;
            case 8:
                return new BlockRunner$maybeRun$1((FloatingTextActionModeCallback) this.IconCompatParcelizer, (ScrollableNode) obj2, shortNewsContentCardView, 8);
            case 9:
                return new BlockRunner$maybeRun$1((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.IconCompatParcelizer, (PressGestureScopeImpl) obj2, shortNewsContentCardView, 9);
            case 10:
                return new BlockRunner$maybeRun$1((MutableInteractionSourceImpl) this.IconCompatParcelizer, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 10);
            case 11:
                return new BlockRunner$maybeRun$1((PointerInputScope) this.IconCompatParcelizer, (PagerState) obj2, shortNewsContentCardView, 11);
            case 12:
                return new BlockRunner$maybeRun$1((BringIntoViewResponderNode) this.IconCompatParcelizer, (n$$ExternalSyntheticLambda3) obj2, shortNewsContentCardView, 12);
            case 13:
                return new BlockRunner$maybeRun$1((PointerInputScope) this.IconCompatParcelizer, (TextFieldSelectionManager) obj2, shortNewsContentCardView, 13);
            case 14:
                return new BlockRunner$maybeRun$1((getNormalNSsRyOo) this.IconCompatParcelizer, (accessgetGreencp) obj2, shortNewsContentCardView, 14);
            case 15:
                return new BlockRunner$maybeRun$1((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.IconCompatParcelizer, (getTraverseKey) obj2, shortNewsContentCardView, 15);
            case 16:
                return new BlockRunner$maybeRun$1((setFrameRate) this.IconCompatParcelizer, (NavHostKt$NavHost$29$1) obj2, shortNewsContentCardView, 16);
            case 17:
                return new BlockRunner$maybeRun$1((TextClassifier) this.IconCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 17);
            case 18:
                BlockRunner$maybeRun$1 blockRunner$maybeRun$4 = new BlockRunner$maybeRun$1((RippleNode) obj2, shortNewsContentCardView, 18);
                blockRunner$maybeRun$4.IconCompatParcelizer = obj;
                return blockRunner$maybeRun$4;
            case 19:
                return new BlockRunner$maybeRun$1((E5) this.IconCompatParcelizer, (TrackpadScrollingLogic) obj2, shortNewsContentCardView, 19);
            case 20:
                return new BlockRunner$maybeRun$1((FloatingActionButtonElevationAnimatable) this.IconCompatParcelizer, (ButtonDefaults) obj2, shortNewsContentCardView, 20);
            case 21:
                return new BlockRunner$maybeRun$1((setRootAutofillId) this.IconCompatParcelizer, (AccessibilityManager) obj2, shortNewsContentCardView, 21);
            case 22:
                return new BlockRunner$maybeRun$1((FocusState) this.IconCompatParcelizer, (TooltipStateImpl) obj2, shortNewsContentCardView, 22);
            case 23:
                BlockRunner$maybeRun$1 blockRunner$maybeRun$5 = new BlockRunner$maybeRun$1((ArrivalProgressObserver$$ExternalSyntheticLambda0) obj2, shortNewsContentCardView, 23);
                blockRunner$maybeRun$5.IconCompatParcelizer = obj;
                return blockRunner$maybeRun$5;
            case 24:
                return new BlockRunner$maybeRun$1((RxDataStore) this.IconCompatParcelizer, (ArrivalProgressObserver$$ExternalSyntheticLambda0) obj2, shortNewsContentCardView, 24);
            case 25:
                BlockRunner$maybeRun$1 blockRunner$maybeRun$6 = new BlockRunner$maybeRun$1((accessunregisterComponentCallback) obj2, shortNewsContentCardView, 25);
                blockRunner$maybeRun$6.IconCompatParcelizer = obj;
                return blockRunner$maybeRun$6;
            case 26:
                BlockRunner$maybeRun$1 blockRunner$maybeRun$7 = new BlockRunner$maybeRun$1((Flow) obj2, shortNewsContentCardView, 26);
                blockRunner$maybeRun$7.IconCompatParcelizer = obj;
                return blockRunner$maybeRun$7;
            case 27:
                return new BlockRunner$maybeRun$1((AndroidGraphicsContext1) obj2, this.IconCompatParcelizer, shortNewsContentCardView);
            case 28:
                return new BlockRunner$maybeRun$1((BezierKtWhenMappings) this.IconCompatParcelizer, (Uri) obj2, shortNewsContentCardView, 28);
            default:
                return new BlockRunner$maybeRun$1((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.IconCompatParcelizer, (PooledConnectionImpl) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i) {
            case 0:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                return ((BlockRunner$maybeRun$1) create(obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                return ((BlockRunner$maybeRun$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 26:
                return ((BlockRunner$maybeRun$1) create((AndroidGraphicsContext1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 27:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((BlockRunner$maybeRun$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:335:0x0577 A[PHI: r1 r2
  0x0577: PHI (r1v20 o.getContentViewGroupParentLayout) = (r1v26 o.getContentViewGroupParentLayout), (r1v28 o.getContentViewGroupParentLayout) binds: [B:340:0x0597, B:334:0x0575] A[DONT_GENERATE, DONT_INLINE]
  0x0577: PHI (r2v18 java.lang.Object) = (r2v25 java.lang.Object), (r2v26 java.lang.Object) binds: [B:340:0x0597, B:334:0x0575] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:339:0x058a A[Catch: all -> 0x05c3, TryCatch #1 {all -> 0x05c3, blocks: (B:329:0x0565, B:337:0x0580, B:339:0x058a, B:342:0x059a, B:333:0x0572), top: B:425:0x055b }] */
    /* JADX WARN: Code duplicated, block: B:341:0x0599  */
    /* JADX WARN: Code duplicated, block: B:345:0x05be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:0x036f -> B:211:0x0373). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:345:0x05be -> B:337:0x0580). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.BlockRunner$maybeRun$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockRunner$maybeRun$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockRunner$maybeRun$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.write = obj;
    }
}
