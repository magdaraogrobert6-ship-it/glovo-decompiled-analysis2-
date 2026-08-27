package com.roadrunner.rrds.compose.component.image.zoomable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import o.accessanimateWithTarget;
import o.mainAxisk4lQ0M;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoomState {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final long IconCompatParcelizer;
    public final VelocityTracker MediaBrowserCompatMediaItem;
    public final accessanimateWithTarget MediaDescriptionCompat;
    public long RatingCompat;
    public final Animatable RemoteActionCompatParcelizer;
    public long read;
    public final Animatable serializer;
    public final Animatable write;

    public ZoomState(long j, accessanimateWithTarget accessanimatewithtarget) {
        this.IconCompatParcelizer = j;
        this.MediaDescriptionCompat = accessanimatewithtarget;
        Animatable animatableWrite = mainAxisk4lQ0M.write(1.0f);
        animatableWrite.serializer(Float.valueOf(0.9f), Float.valueOf(5.0f));
        this.write = animatableWrite;
        this.serializer = mainAxisk4lQ0M.write(0.0f);
        this.RemoteActionCompatParcelizer = mainAxisk4lQ0M.write(0.0f);
        Size.Companion companion = Size.Companion;
        this.RatingCompat = companion.m555getZeroNHjbRc();
        this.read = companion.m555getZeroNHjbRc();
        this.MediaBrowserCompatMediaItem = new VelocityTracker();
    }

    public final float RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 47;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((Number) this.write.write()).floatValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fFloatValue = ((Number) this.write.write()).floatValue();
        int i3 = MediaSessionCompatQueueItem + 51;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return fFloatValue;
    }

    public final Rect calculateNewBounds(float f) {
        int i = 2 % 2;
        long jM549times7Ah8Wj8 = Size.m549times7Ah8Wj8(this.read, f);
        float fMax = Math.max(Float.intBitsToFloat((int) (jM549times7Ah8Wj8 >> 32)) - Float.intBitsToFloat((int) (this.RatingCompat >> 32)), 0.0f) * 0.5f;
        float fMax2 = Math.max(Float.intBitsToFloat((int) (jM549times7Ah8Wj8 & 4294967295L)) - Float.intBitsToFloat((int) (4294967295L & this.RatingCompat)), 0.0f) * 0.5f;
        Rect rect = new Rect(-fMax, -fMax2, fMax, fMax2);
        int i2 = MediaMetadataCompat + 27;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return rect;
    }

    /* JADX INFO: renamed from: setLayoutSize-uvyYCjk, reason: not valid java name */
    public final void m5041setLayoutSizeuvyYCjk(long j) {
        int i = 2 % 2;
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats) {
            j = Size.Companion.m555getZeroNHjbRc();
            int i2 = MediaSessionCompatQueueItem + 23;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        this.RatingCompat = j;
        Size.Companion companion = Size.Companion;
        if (!(!Size.m542equalsimpl0(j, companion.m555getZeroNHjbRc()))) {
            this.read = companion.m555getZeroNHjbRc();
            return;
        }
        long jM555getZeroNHjbRc = companion.m555getZeroNHjbRc();
        long j2 = this.IconCompatParcelizer;
        if (Size.m542equalsimpl0(j2, jM555getZeroNHjbRc)) {
            this.read = this.RatingCompat;
            int i4 = MediaMetadataCompat + 61;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        int i6 = (int) (j2 >> 32);
        int i7 = (int) (j2 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i6) / Float.intBitsToFloat(i7);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.RatingCompat >> 32)) / Float.intBitsToFloat((int) (this.RatingCompat & 4294967295L));
        long j3 = this.RatingCompat;
        this.read = fIntBitsToFloat > fIntBitsToFloat2 ? Size.m549times7Ah8Wj8(j2, Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat(i6)) : Size.m549times7Ah8Wj8(j2, Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat(i7));
        int i8 = MediaMetadataCompat + 71;
        MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 62 / 0;
        }
    }

    /* JADX INFO: renamed from: access$calculateNewOffset-DTl3nVk, reason: not valid java name */
    public static final long m5040access$calculateNewOffsetDTl3nVk(ZoomState zoomState, float f, long j, long j2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 49;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jM549times7Ah8Wj8 = Size.m549times7Ah8Wj8(zoomState.read, zoomState.RemoteActionCompatParcelizer());
        long jM549times7Ah8Wj9 = Size.m549times7Ah8Wj8(zoomState.read, f);
        int i4 = (int) (jM549times7Ah8Wj8 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM549times7Ah8Wj9 >> 32)) - Float.intBitsToFloat(i4);
        int i5 = (int) (jM549times7Ah8Wj8 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM549times7Ah8Wj9 & 4294967295L)) - Float.intBitsToFloat(i5);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        Animatable animatable = zoomState.serializer;
        float fFloatValue = ((Number) animatable.write()).floatValue();
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (zoomState.RatingCompat >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j & 4294967295L));
        Animatable animatable2 = zoomState.RemoteActionCompatParcelizer;
        float fFloatValue2 = ((Number) animatable2.write()).floatValue();
        float fIntBitsToFloat7 = Float.intBitsToFloat(i5);
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (zoomState.RatingCompat & 4294967295L));
        float fIntBitsToFloat9 = ((((fIntBitsToFloat4 - fIntBitsToFloat5) * 0.5f) + (fIntBitsToFloat3 - fFloatValue)) * fIntBitsToFloat) / Float.intBitsToFloat(i4);
        float fIntBitsToFloat10 = ((((fIntBitsToFloat7 - fIntBitsToFloat8) * 0.5f) + (fIntBitsToFloat6 - fFloatValue2)) * fIntBitsToFloat2) / Float.intBitsToFloat(i5);
        float fFloatValue3 = ((Number) animatable.write()).floatValue();
        float fIntBitsToFloat11 = Float.intBitsToFloat((int) (j2 >> 32));
        float fFloatValue4 = ((Number) animatable2.write()).floatValue();
        float fIntBitsToFloat12 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits((fIntBitsToFloat11 + fFloatValue3) + ((fIntBitsToFloat * 0.5f) - fIntBitsToFloat9))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat12 + fFloatValue4 + ((fIntBitsToFloat2 * 0.5f) - fIntBitsToFloat10))) & 4294967295L));
        int i6 = MediaSessionCompatQueueItem + 61;
        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return jM469constructorimpl;
    }
}
