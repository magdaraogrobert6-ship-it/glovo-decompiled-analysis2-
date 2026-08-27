package o;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageBoundedLayout {
    public final setLargerCloseButtonClickArealambda0 delegate;

    /* JADX WARN: Type inference failed for: r13v1, types: [o.InAppMessageButton] */
    public InAppMessageBoundedLayout(int i, long j, TimeUnit timeUnit, InAppMessageHtmlFullView inAppMessageHtmlFullView, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, io.sentry.logger.serializer serializerVar, int i7) {
        int i8 = (i7 & 1) != 0 ? 5 : i;
        long j2 = (i7 & 2) != 0 ? 5L : j;
        TimeUnit timeUnit2 = (i7 & 4) != 0 ? TimeUnit.MINUTES : timeUnit;
        InAppMessageHtmlFullView inAppMessageHtmlFullView2 = (i7 & 8) != 0 ? InAppMessageHtmlFullView.INSTANCE : inAppMessageHtmlFullView;
        int i9 = (i7 & 32) != 0 ? 10000 : i2;
        int i10 = (i7 & 64) != 0 ? 10000 : i3;
        int i11 = (i7 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? 10000 : i4;
        int i12 = (i7 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? 10000 : i5;
        int i13 = (i7 & androidx.compose.ui.graphics.Fields.RotationY) == 0 ? i6 : 10000;
        boolean z3 = (i7 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? true : z;
        boolean z4 = (i7 & androidx.compose.ui.graphics.Fields.CameraDistance) == 0 ? z2 : true;
        io.sentry.logger.serializer serializerVar2 = (i7 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? new io.sentry.logger.serializer(2) : serializerVar;
        timeUnit2.getClass();
        inAppMessageHtmlFullView2.getClass();
        final InAppMessageHtmlFullView inAppMessageHtmlFullView3 = inAppMessageHtmlFullView2;
        final int i14 = i9;
        final int i15 = i10;
        final int i16 = i11;
        final int i17 = i12;
        final int i18 = i13;
        final boolean z5 = z3;
        final boolean z6 = z4;
        final io.sentry.logger.serializer serializerVar3 = serializerVar2;
        this.delegate = new setLargerCloseButtonClickArealambda0(inAppMessageHtmlFullView3, i8, j2, timeUnit2, InAppMessageImageView.NONE, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.InAppMessageButton
            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                setLargerCloseButtonClickArealambda0 setlargerclosebuttonclickarealambda0 = (setLargerCloseButtonClickArealambda0) obj;
                getMessageClickableView getmessageclickableview = (getMessageClickableView) obj2;
                InAppMessageHtmlView inAppMessageHtmlView = (InAppMessageHtmlView) obj3;
                setlargerclosebuttonclickarealambda0.getClass();
                getmessageclickableview.getClass();
                inAppMessageHtmlView.getClass();
                InAppMessageHtmlFullView inAppMessageHtmlFullView4 = inAppMessageHtmlFullView3;
                return new localLookaheadPositionOfauaQtc(new setClipPath(new setupDirectionalNavigationlambda1(inAppMessageHtmlFullView4, setlargerclosebuttonclickarealambda0, i14, i15, i16, i17, i18, z5, z6, getmessageclickableview, serializerVar3, inAppMessageHtmlView)), inAppMessageHtmlFullView4);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBoundedLayout(int i, long j, TimeUnit timeUnit) {
        this(i, j, timeUnit, InAppMessageHtmlFullView.INSTANCE, 0, 0, 0, 0, 0, false, false, null, 8160);
        timeUnit.getClass();
    }
}
