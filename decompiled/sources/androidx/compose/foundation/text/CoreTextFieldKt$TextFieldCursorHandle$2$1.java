package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.roadrunner.rider.recruitment.passverification.pass_error.PassErrorScreenKt$$ExternalSyntheticLambda4;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.YieldKt;
import o.AlignmentHorizontal;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.populate;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldKt$TextFieldCursorHandle$2$1 implements PointerInputEventHandler {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ CoreTextFieldKt$TextFieldCursorHandle$2$1(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
        this.write = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 113;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        Object obj = this.write;
        Object obj2 = this.serializer;
        Object obj3 = createFromParcel.INSTANCE;
        if (i5 != 0) {
            Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new TransformGestureDetectorKt$detectTransformGestures$2(new PassErrorScreenKt$$ExternalSyntheticLambda4((PopulateViewStructure_androidKtpopulate7) obj2, i, (populate) obj), null), shortNewsContentCardView);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objAwaitEachGesture != coroutineSingletons) {
                objAwaitEachGesture = obj3;
            }
            if (objAwaitEachGesture != coroutineSingletons) {
                return obj3;
            }
            int i6 = IconCompatParcelizer + 53;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return objAwaitEachGesture;
        }
        Object objCoroutineScope = YieldKt.coroutineScope(new SideMenuCacheImpl.AnonymousClass2(pointerInputScope, (AlignmentHorizontal) obj2, (TextFieldSelectionManager) obj, (ShortNewsContentCardView) null, 1), shortNewsContentCardView);
        if (objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i8 = IconCompatParcelizer + 117;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 6 / 0;
            }
            obj3 = objCoroutineScope;
        }
        int i10 = IconCompatParcelizer + 105;
        read = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return obj3;
        }
        throw null;
    }
}
