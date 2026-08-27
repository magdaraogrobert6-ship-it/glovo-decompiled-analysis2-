package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessisRelatedToAutoCommit implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ accessisRelatedToAutoCommit(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i) {
            case 0:
                getPhoneNumber getphonenumber = androidx.compose.material3.TextKt.IconCompatParcelizer;
                return createfromparcel;
            case 1:
                ((androidx.compose.animation.core.SeekableTransitionState) obj).MediaMetadataCompat();
                return createfromparcel;
            case 2:
                return new calculateCentroidSize(((Float) obj).floatValue());
            case 3:
                return new calculateCentroidSize(((Integer) obj).intValue());
            case 4:
                return Integer.valueOf((int) ((calculateCentroidSize) obj).read);
            case 5:
                return new calculateCentroidSize(((androidx.compose.ui.unit.Dp) obj).m3687unboximpl());
            case 6:
                return androidx.compose.ui.unit.Dp.m3671boximpl(androidx.compose.ui.unit.Dp.m3673constructorimpl(((calculateCentroidSize) obj).read));
            case 7:
                androidx.compose.ui.unit.DpOffset dpOffset = (androidx.compose.ui.unit.DpOffset) obj;
                return new animateToZero(androidx.compose.ui.unit.DpOffset.m3734getXD9Ej5fM(dpOffset.m3742unboximpl()), androidx.compose.ui.unit.DpOffset.m3736getYD9Ej5fM(dpOffset.m3742unboximpl()));
            case 8:
                animateToZero animatetozero = (animateToZero) obj;
                return androidx.compose.ui.unit.DpOffset.m3728boximpl(androidx.compose.ui.unit.DpOffset.m3729constructorimpl((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.Dp.m3673constructorimpl(animatetozero.RemoteActionCompatParcelizer))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(androidx.compose.ui.unit.Dp.m3673constructorimpl(animatetozero.serializer))))));
            case 9:
                androidx.compose.ui.geometry.Size size = (androidx.compose.ui.geometry.Size) obj;
                return new animateToZero(Float.intBitsToFloat((int) (size.m551unboximpl() >> 32)), Float.intBitsToFloat((int) (size.m551unboximpl() & 4294967295L)));
            case 10:
                animateToZero animatetozero2 = (animateToZero) obj;
                return androidx.compose.ui.geometry.Size.m534boximpl(androidx.compose.ui.geometry.Size.m537constructorimpl((((long) Float.floatToRawIntBits(animatetozero2.RemoteActionCompatParcelizer)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(animatetozero2.serializer)))));
            case 11:
                androidx.compose.ui.geometry.Offset offset = (androidx.compose.ui.geometry.Offset) obj;
                return new animateToZero(Float.intBitsToFloat((int) (offset.m487unboximpl() >> 32)), Float.intBitsToFloat((int) (offset.m487unboximpl() & 4294967295L)));
            case 12:
                animateToZero animatetozero3 = (animateToZero) obj;
                return androidx.compose.ui.geometry.Offset.m466boximpl(androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(animatetozero3.RemoteActionCompatParcelizer)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(animatetozero3.serializer)))));
            case 13:
                androidx.compose.ui.unit.IntOffset intOffset = (androidx.compose.ui.unit.IntOffset) obj;
                return new animateToZero(androidx.compose.ui.unit.IntOffset.m3801getXimpl(intOffset.m3810unboximpl()), androidx.compose.ui.unit.IntOffset.m3802getYimpl(intOffset.m3810unboximpl()));
            case 14:
                animateToZero animatetozero4 = (animateToZero) obj;
                return androidx.compose.ui.unit.IntOffset.m3792boximpl(androidx.compose.ui.unit.IntOffset.m3795constructorimpl((((long) Math.round(animatetozero4.RemoteActionCompatParcelizer)) << 32) | (4294967295L & ((long) Math.round(animatetozero4.serializer)))));
            case 15:
                androidx.compose.ui.unit.IntSize intSize = (androidx.compose.ui.unit.IntSize) obj;
                return new animateToZero((int) (intSize.m3848unboximpl() >> 32), (int) (intSize.m3848unboximpl() & 4294967295L));
            case 16:
                animateToZero animatetozero5 = (animateToZero) obj;
                int iRound = Math.round(animatetozero5.RemoteActionCompatParcelizer);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(animatetozero5.serializer);
                return androidx.compose.ui.unit.IntSize.m3836boximpl(androidx.compose.ui.unit.IntSize.m3839constructorimpl((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32)));
            case 17:
                androidx.compose.ui.geometry.Rect rect = (androidx.compose.ui.geometry.Rect) obj;
                return new calculateApproachOffset(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
            case 18:
                calculateApproachOffset calculateapproachoffset = (calculateApproachOffset) obj;
                return new androidx.compose.ui.geometry.Rect(calculateapproachoffset.read, calculateapproachoffset.write, calculateapproachoffset.IconCompatParcelizer, calculateapproachoffset.serializer);
            case 19:
                return Float.valueOf(((calculateCentroidSize) obj).read);
            case 20:
                return createfromparcel;
            case 21:
                accessisRelatedToAutoCommit accessisrelatedtoautocommit = androidx.compose.foundation.gestures.AnchoredDraggableKt.serializer;
                return Boolean.TRUE;
            case 22:
                ((Integer) obj).getClass();
                accessisRelatedToAutoCommit accessisrelatedtoautocommit2 = androidx.compose.foundation.gestures.AnchoredDraggableKt.serializer;
                return Float.valueOf(Float.NaN);
            case 23:
                return Boolean.TRUE;
            case 24:
                androidx.compose.ui.semantics.SemanticsPropertiesKt.m2833setRolekuIjeqM((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj, androidx.compose.ui.semantics.Role.Companion.m2814getButtono7Vup1c());
                return createfromparcel;
            case 25:
                androidx.compose.ui.semantics.SemanticsPropertiesKt.m2833setRolekuIjeqM((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj, androidx.compose.ui.semantics.Role.Companion.m2814getButtono7Vup1c());
                return createfromparcel;
            case 26:
                return createfromparcel;
            case 27:
                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) obj;
                traversableNode.getClass();
                ((setAutofillId) traversableNode).write();
                return Boolean.FALSE;
            case 28:
                ((bufferContentCaptureViewAppeared) obj).write();
                return createfromparcel;
            default:
                return obj;
        }
    }
}
