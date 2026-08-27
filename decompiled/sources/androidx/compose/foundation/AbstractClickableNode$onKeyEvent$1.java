package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.Button;
import o.ButtonKtButton21;
import o.CheckboxKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class AbstractClickableNode$onKeyEvent$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ AbstractClickableNode read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Button write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractClickableNode$onKeyEvent$1(AbstractClickableNode abstractClickableNode, Button button, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.read = abstractClickableNode;
        this.write = button;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.serializer;
        Button button = this.write;
        AbstractClickableNode abstractClickableNode = this.read;
        if (i == 0) {
            return new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, button, shortNewsContentCardView, 0);
        }
        int i2 = 1;
        if (i != 1) {
            return i != 2 ? new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, button, shortNewsContentCardView, 3) : new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, button, shortNewsContentCardView, 2);
        }
        return new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, button, shortNewsContentCardView, i2);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i == 0) {
            return ((AbstractClickableNode$onKeyEvent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i != 1) {
            return i != 2 ? ((AbstractClickableNode$onKeyEvent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AbstractClickableNode$onKeyEvent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((AbstractClickableNode$onKeyEvent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Button button = this.write;
        AbstractClickableNode abstractClickableNode = this.read;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.IconCompatParcelizer;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableInteractionSourceImpl mutableInteractionSourceImpl = abstractClickableNode.PlaybackStateCompatCustomAction;
            if (mutableInteractionSourceImpl == null) {
                return createfromparcel;
            }
            this.IconCompatParcelizer = 1;
            return mutableInteractionSourceImpl.emit(button, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableInteractionSourceImpl mutableInteractionSourceImpl2 = abstractClickableNode.PlaybackStateCompatCustomAction;
            if (mutableInteractionSourceImpl2 == null) {
                return createfromparcel;
            }
            CheckboxKt checkboxKt = new CheckboxKt(button);
            this.IconCompatParcelizer = 1;
            return mutableInteractionSourceImpl2.emit(checkboxKt, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableInteractionSourceImpl mutableInteractionSourceImpl3 = abstractClickableNode.PlaybackStateCompatCustomAction;
            if (mutableInteractionSourceImpl3 == null) {
                return createfromparcel;
            }
            ButtonKtButton21 buttonKtButton21 = new ButtonKtButton21(button);
            this.IconCompatParcelizer = 1;
            return mutableInteractionSourceImpl3.emit(buttonKtButton21, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.IconCompatParcelizer;
        if (i5 != 0) {
            if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        MutableInteractionSourceImpl mutableInteractionSourceImpl4 = abstractClickableNode.PlaybackStateCompatCustomAction;
        if (mutableInteractionSourceImpl4 == null) {
            return createfromparcel;
        }
        CheckboxKt checkboxKt2 = new CheckboxKt(button);
        this.IconCompatParcelizer = 1;
        return mutableInteractionSourceImpl4.emit(checkboxKt2, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
    }
}
