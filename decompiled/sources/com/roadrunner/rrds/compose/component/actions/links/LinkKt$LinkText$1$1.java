package com.roadrunner.rrds.compose.component.actions.links;

import androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import com.deliveryhero.perseus.logger.PerseusLogger$e$1;
import com.roadrunner.delivery.pickupdropoff.tasks.data.MergedTaskStateRepositoryImpl$getMergedState$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.YieldKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SelectionMagnifierKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkKt$LinkText$1$1 implements PointerInputEventHandler {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 write;

    public LinkKt$LinkText$1$1(AnnotatedString annotatedString, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8) {
        this.RemoteActionCompatParcelizer = annotatedString;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
        this.write = populateViewStructure_androidKtpopulate8;
    }

    public LinkKt$LinkText$1$1(getContentViewGroupParentLayout getcontentviewgroupparentlayout, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, MutableInteractionSourceImpl mutableInteractionSourceImpl, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8) {
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
        this.serializer = mutableInteractionSourceImpl;
        this.write = populateViewStructure_androidKtpopulate8;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.read;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.write;
        Object obj = this.serializer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            Object objForEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new PerseusLogger$e$1((TextLayoutResult) populateViewStructure_androidKtpopulate7.getValue(), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj, (AnnotatedString) obj2, (ShortNewsContentCardView) null, this.IconCompatParcelizer), shortNewsContentCardView);
            if (objForEachGesture != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return createfromparcel;
            }
            int i3 = MediaMetadataCompat + 57;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 61 / 0;
            }
            return objForEachGesture;
        }
        MergedTaskStateRepositoryImpl$getMergedState$2 mergedTaskStateRepositoryImpl$getMergedState$2 = new MergedTaskStateRepositoryImpl$getMergedState$2((getContentViewGroupParentLayout) obj2, this.IconCompatParcelizer, (MutableInteractionSourceImpl) obj, (ShortNewsContentCardView) null);
        SelectionMagnifierKt selectionMagnifierKt = new SelectionMagnifierKt(populateViewStructure_androidKtpopulate7, 1);
        DraggableKt$NoOpOnDragStarted$1 draggableKt$NoOpOnDragStarted$1 = TapGestureDetectorKt.RemoteActionCompatParcelizer;
        Object objCoroutineScope = YieldKt.coroutineScope(new PerseusLogger$e$1(pointerInputScope, mergedTaskStateRepositoryImpl$getMergedState$2, selectionMagnifierKt, new PressGestureScopeImpl(pointerInputScope), null, 2), shortNewsContentCardView);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objCoroutineScope != coroutineSingletons) {
            objCoroutineScope = createfromparcel;
        }
        if (objCoroutineScope != coroutineSingletons) {
            return createfromparcel;
        }
        int i5 = MediaMetadataCompat + 117;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objCoroutineScope;
    }
}
