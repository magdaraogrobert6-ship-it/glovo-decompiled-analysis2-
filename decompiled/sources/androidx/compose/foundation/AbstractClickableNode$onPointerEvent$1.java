package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ButtonKt;
import o.ShortNewsContentCardView;
import o.copyjRlVdoo;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class AbstractClickableNode$onPointerEvent$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ AbstractClickableNode write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractClickableNode$onPointerEvent$1(AbstractClickableNode abstractClickableNode, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = abstractClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.serializer;
        AbstractClickableNode abstractClickableNode = this.write;
        return i != 0 ? new AbstractClickableNode$onPointerEvent$1(abstractClickableNode, shortNewsContentCardView, 1) : new AbstractClickableNode$onPointerEvent$1(abstractClickableNode, shortNewsContentCardView, 0);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i != 0) {
            ((AbstractClickableNode$onPointerEvent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((AbstractClickableNode$onPointerEvent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        AbstractClickableNode abstractClickableNode = this.write;
        int i2 = 3;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (abstractClickableNode.MediaDescriptionCompat == null) {
                ButtonKt buttonKt = new ButtonKt();
                MutableInteractionSourceImpl mutableInteractionSourceImpl = abstractClickableNode.PlaybackStateCompatCustomAction;
                if (mutableInteractionSourceImpl != null) {
                    BuildersKt.RemoteActionCompatParcelizer(abstractClickableNode.getCoroutineScope(), null, null, new BlockRunner$maybeRun$1(mutableInteractionSourceImpl, buttonKt, shortNewsContentCardView, 2), 3);
                }
                abstractClickableNode.MediaDescriptionCompat = buttonKt;
            }
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ButtonKt buttonKt2 = abstractClickableNode.MediaDescriptionCompat;
        if (buttonKt2 != null) {
            copyjRlVdoo copyjrlvdoo = new copyjRlVdoo(buttonKt2);
            MutableInteractionSourceImpl mutableInteractionSourceImpl2 = abstractClickableNode.PlaybackStateCompatCustomAction;
            if (mutableInteractionSourceImpl2 != null) {
                BuildersKt.RemoteActionCompatParcelizer(abstractClickableNode.getCoroutineScope(), null, null, new BlockRunner$maybeRun$1(mutableInteractionSourceImpl2, copyjrlvdoo, shortNewsContentCardView, i2), 3);
            }
            abstractClickableNode.MediaDescriptionCompat = null;
        }
        return createfromparcel;
    }
}
