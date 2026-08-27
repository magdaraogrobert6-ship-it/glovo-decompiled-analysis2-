package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getAndroidTypeannotations implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 2;
    public final /* synthetic */ Object read;
    public final /* synthetic */ float write;

    public /* synthetic */ getAndroidTypeannotations(float f, androidx.compose.ui.graphics.ImageBitmap imageBitmap, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.write = f;
        this.read = imageBitmap;
        this.IconCompatParcelizer = colorFilter;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        long j;
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.read;
        float fFloatValue = this.write;
        if (i == 0) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj3;
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
            androidx.compose.animation.core.Animatable animatable = ((androidx.compose.material3.ThumbNode) obj2).RatingCompat;
            if (animatable != null) {
                fFloatValue = ((Number) animatable.write()).floatValue();
            }
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (int) fFloatValue, 0, 0.0f, 4, null);
            return createfromparcel;
        }
        if (i == 1) {
            androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState = (androidx.compose.foundation.gestures.UpdatableAnimationState) obj3;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
            long jLongValue = ((Long) obj).longValue();
            if (updatableAnimationState.read == Long.MIN_VALUE) {
                updatableAnimationState.read = jLongValue;
            }
            float f = updatableAnimationState.IconCompatParcelizer;
            calculateCentroidSize calculatecentroidsize = new calculateCentroidSize(f);
            calculateCentroidSize calculatecentroidsize2 = androidx.compose.foundation.gestures.UpdatableAnimationState.RemoteActionCompatParcelizer;
            long jRemoteActionCompatParcelizer = fFloatValue == 0.0f ? updatableAnimationState.MediaMetadataCompat.RemoteActionCompatParcelizer(new calculateCentroidSize(f), calculatecentroidsize2, updatableAnimationState.serializer) : MathKt.read((jLongValue - updatableAnimationState.read) / fFloatValue);
            float f2 = ((calculateCentroidSize) updatableAnimationState.MediaMetadataCompat.serializer(jRemoteActionCompatParcelizer, calculatecentroidsize, calculatecentroidsize2, updatableAnimationState.serializer)).read;
            updatableAnimationState.serializer = (calculateCentroidSize) updatableAnimationState.MediaMetadataCompat.read(jRemoteActionCompatParcelizer, calculatecentroidsize, calculatecentroidsize2, updatableAnimationState.serializer);
            updatableAnimationState.read = jLongValue;
            float f3 = updatableAnimationState.IconCompatParcelizer;
            updatableAnimationState.IconCompatParcelizer = f2;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Float.valueOf(f3 - f2));
            return createfromparcel;
        }
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = (androidx.compose.ui.graphics.ImageBitmap) obj3;
        androidx.compose.ui.graphics.ColorFilter colorFilter = (androidx.compose.ui.graphics.ColorFilter) obj2;
        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope = (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj;
        contentDrawScope.drawContent();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            androidx.compose.ui.graphics.drawscope.DrawTransform transform = drawContext.getTransform();
            androidx.compose.ui.graphics.drawscope.DrawTransform.translate$default(transform, fFloatValue, 0.0f, 2, null);
            transform.mo1231rotateUv8p0NA(45.0f, androidx.compose.ui.geometry.Offset.Companion.m493getZeroF1C5BW0());
            j = jMo1225getSizeNHjbRc;
            try {
                androidx.compose.ui.graphics.drawscope.DrawScope.m1288drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                c8$$ExternalSyntheticOutline0.m(drawContext, j);
                return createfromparcel;
            } catch (Throwable th) {
                th = th;
                c8$$ExternalSyntheticOutline0.m(drawContext, j);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = jMo1225getSizeNHjbRc;
        }
    }

    public /* synthetic */ getAndroidTypeannotations(androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.read = updatableAnimationState;
        this.write = f;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public /* synthetic */ getAndroidTypeannotations(androidx.compose.ui.layout.Placeable placeable, androidx.compose.material3.ThumbNode thumbNode, float f) {
        this.read = placeable;
        this.IconCompatParcelizer = thumbNode;
        this.write = f;
    }
}
