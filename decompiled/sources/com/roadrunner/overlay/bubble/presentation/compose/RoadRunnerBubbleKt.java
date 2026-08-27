package com.roadrunner.overlay.bubble.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.overlay.bubble.presentation.compose.RoadRunnerBubbleKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.buildMapping;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RoadRunnerBubbleKt {
    private static int IconCompatParcelizer = 0;
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(72.0f);
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 67;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x014a  */
    /* JADX INFO: renamed from: RoadRunnerBubble-jb-40ds, reason: not valid java name */
    public static final void m5000RoadRunnerBubblejb40ds(final Modifier modifier, int i, long j, float f, Shape shape, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i2) {
        int i3;
        int i4;
        long j2;
        float f2;
        Shape shape2;
        float f3;
        long j3;
        int i5;
        boolean z;
        int i6;
        int i7 = 2 % 2;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(732200461);
        if ((i2 & 6) == 0) {
            if (getpostalcode.read(modifier)) {
                int i8 = read + 35;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= 16;
        }
        if ((i2 & 384) == 0) {
            int i10 = read + 125;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 |= Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            int i12 = serializer + 31;
            read = i12 % Fields.SpotShadowColor;
            i3 = i12 % 2 == 0 ? i3 | 12044 : i3 | 8192;
        }
        if ((196608 & i2) == 0) {
            int i13 = serializer + 23;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= !getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.BlendMode : 1048576;
            int i15 = serializer + 89;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        if (getpostalcode.write(i3 & 1, !((599187 & i3) == 599186))) {
            int i17 = read + 17;
            serializer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i2 & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                long jIconCompatParcelizer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
                f3 = Dimensions.getActionBarHideOffset;
                shape2 = RoundedCornerShapeKt.IconCompatParcelizer;
                j3 = jIconCompatParcelizer;
                i5 = i3 & (-65521);
                i4 = R.drawable.ic_overlay;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                j3 = j;
                f3 = f;
                shape2 = shape;
                i5 = i3 & (-65521);
                i4 = i;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            Alignment center = Alignment.Companion.getCenter();
            if ((i5 & 458752) == 131072) {
                int i19 = serializer + 85;
                read = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new LazyLayoutPagerKt$dragDirectionDetector$1(8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier, createfromparcel, (PointerInputEventHandler) objComponentActivity);
            boolean z2 = (i5 & 3670016) == 1048576;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            Object obj = null;
            if (z2) {
                objComponentActivity2 = new LazyLayoutPagerKt$dragDirectionDetector$1(9, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                getpostalcode.write(objComponentActivity2);
                int i21 = serializer + 119;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
            } else {
                int i23 = read + 55;
                serializer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new LazyLayoutPagerKt$dragDirectionDetector$1(9, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                    getpostalcode.write(objComponentActivity2);
                    int i24 = serializer + 119;
                    read = i24 % Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                }
            }
            Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierPointerInput, createfromparcel, (PointerInputEventHandler) objComponentActivity2);
            float f4 = RemoteActionCompatParcelizer;
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(modifierPointerInput2, f4);
            getTopLeftannotations gettopleftannotations = RoundedCornerShapeKt.IconCompatParcelizer;
            Modifier modifierM317shadows4CzXII$default = ShadowKt.m317shadows4CzXII$default(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(modifierM83size3ABfNKs, gettopleftannotations), j3, RectangleShapeKt.getRectangleShape()), f3, shape2, false, 0L, 0L, 28, null);
            MeasurePolicy measurePolicy = BoxKt.read(center, false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM317shadows4CzXII$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            float f5 = f3;
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            j2 = j3;
            ImageKt.read(VectorResources_androidKt.vectorResource(ImageVector.Companion, i4, getpostalcode, 6), null, ClipKt.clip(SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(Modifier.Companion, f4), f4), gettopleftannotations), ContentScale.Companion.getInside(), null, getpostalcode, 24624, 104);
            getpostalcode.IconCompatParcelizer(true);
            f2 = f5;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i4 = i;
            j2 = j;
            f2 = f;
            shape2 = shape;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i26 = i4;
            final long j4 = j2;
            final float f6 = f2;
            final Shape shape3 = shape2;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.NetworkHeadersBuilder
                private static int MediaDescriptionCompat = 1;
                private static int RatingCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i27 = 2 % 2;
                    int i28 = RatingCompat + 125;
                    MediaDescriptionCompat = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i29 = i28 % 2;
                    ((Integer) obj3).getClass();
                    RoadRunnerBubbleKt.m5000RoadRunnerBubblejb40ds(modifier, i26, j4, f6, shape3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
                    createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                    int i30 = MediaDescriptionCompat + 103;
                    RatingCompat = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i30 % 2 != 0) {
                        int i31 = 45 / 0;
                    }
                    return createfromparcel2;
                }
            };
        }
    }
}
