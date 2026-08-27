package androidx.compose.foundation.text.selection;

import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManager$contextMenuAreaModifier$3 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ TextFieldSelectionManager read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldSelectionManager$contextMenuAreaModifier$3(TextFieldSelectionManager textFieldSelectionManager, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.write = i;
        this.read = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.write;
        TextFieldSelectionManager textFieldSelectionManager = this.read;
        if (i == 0) {
            return new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, shortNewsContentCardView, 0);
        }
        int i2 = 1;
        if (i != 1) {
            return i != 2 ? new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, shortNewsContentCardView, 3) : new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, shortNewsContentCardView, 2);
        }
        return new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, shortNewsContentCardView, i2);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i == 0) {
            ((TextFieldSelectionManager$contextMenuAreaModifier$3) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i == 1) {
            ((TextFieldSelectionManager$contextMenuAreaModifier$3) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i != 2) {
            ((TextFieldSelectionManager$contextMenuAreaModifier$3) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((TextFieldSelectionManager$contextMenuAreaModifier$3) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        TextFieldSelectionManager textFieldSelectionManager = this.read;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            textFieldSelectionManager.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = false;
            return createfromparcel;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            textFieldSelectionManager.IconCompatParcelizer();
            return createfromparcel;
        }
        if (i != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            textFieldSelectionManager.RatingCompat();
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        textFieldSelectionManager.write(textFieldSelectionManager.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        return createfromparcel;
    }
}
