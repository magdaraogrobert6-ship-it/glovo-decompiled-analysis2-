package com.roadrunner.delivery.accept.bottomsheet.overlay.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlow;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.drawTextLVfH_YU;
import o.drawTextTPWCCtMdefault;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class OverlayFooterUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public int read;
    public final /* synthetic */ drawTextLVfH_YU write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OverlayFooterUiModelImpl$1(drawTextLVfH_YU drawtextlvfh_yu, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = drawtextlvfh_yu;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 49;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        drawTextLVfH_YU drawtextlvfh_yu = this.write;
        if (i4 == 0) {
            return new OverlayFooterUiModelImpl$1(drawtextlvfh_yu, shortNewsContentCardView, 0);
        }
        OverlayFooterUiModelImpl$1 overlayFooterUiModelImpl$1 = new OverlayFooterUiModelImpl$1(drawtextlvfh_yu, shortNewsContentCardView, 1);
        int i5 = serializer + 119;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return overlayFooterUiModelImpl$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((OverlayFooterUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((OverlayFooterUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = serializer + 25;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        drawTextLVfH_YU drawtextlvfh_yu = this.write;
        CoroutineSingletons coroutineSingletons = null;
        int i3 = 1;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.read;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StateFlow stateFlow = ((DeliveryAcceptButtonUiModelImpl) drawtextlvfh_yu.serializer.serializer.MediaSessionCompatResultReceiverWrapper()).MediaSessionCompatResultReceiverWrapper;
                drawTextTPWCCtMdefault drawtexttpwcctmdefault = new drawTextTPWCCtMdefault(drawtextlvfh_yu, i3);
                this.read = 1;
                if (stateFlow.collect(drawtexttpwcctmdefault, this) == coroutineSingletons2) {
                    int i5 = RemoteActionCompatParcelizer + 49;
                    serializer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return coroutineSingletons2;
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            DrawableTransformation.read();
            int i7 = RemoteActionCompatParcelizer + 83;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return null;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.read;
        int i10 = 0;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StateFlow stateFlow2 = drawtextlvfh_yu.serializer.RatingCompat;
            drawTextTPWCCtMdefault drawtexttpwcctmdefault2 = new drawTextTPWCCtMdefault(drawtextlvfh_yu, i10);
            this.read = 1;
            if (stateFlow2.collect(drawtexttpwcctmdefault2, this) == coroutineSingletons3) {
                int i11 = serializer + 97;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    throw null;
                }
                coroutineSingletons = coroutineSingletons3;
            } else {
                DrawableTransformation.read();
            }
        } else if (i9 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            DrawableTransformation.read();
        }
        int i12 = serializer + 111;
        RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            int i13 = 34 / 0;
        }
        return coroutineSingletons;
    }
}
