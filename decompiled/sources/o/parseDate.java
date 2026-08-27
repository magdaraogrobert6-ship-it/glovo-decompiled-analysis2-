package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint
public final class parseDate extends FlexboxLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public parseDate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.MediaSessionCompatResultReceiverWrapper = -1;
        this.MediaSessionCompatToken = new accessgetMediaRewindcp(this);
        this.MediaBrowserCompatMediaItem = new ArrayList();
        this.MediaDescriptionCompat = new DeltaDecoder(6, (char) 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, accessgetMediaStepForwardcp.FlexboxLayout, 0, 0);
        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.RatingCompat = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.serializer = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i != 0) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
            this.ResultReceiver = i;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i2 != 0) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i3 != 0) {
            this.ResultReceiver = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, accessgetDependenciesSetp.TagView, 0, 0);
        typedArrayObtainStyledAttributes2.getResourceId(4, com.logistics.rider.glovo.R.style.Widget_RoadRunner_Tag_Background_White);
        typedArrayObtainStyledAttributes2.getResourceId(2, com.logistics.rider.glovo.R.style.Widget_RoadRunner_Tag_Background_Default);
        typedArrayObtainStyledAttributes2.getResourceId(3, com.logistics.rider.glovo.R.style.Widget_RoadRunner_Tag_Background_Success);
        typedArrayObtainStyledAttributes2.getResourceId(1, com.logistics.rider.glovo.R.style.Widget_RoadRunner_Tag_Background_Error);
        typedArrayObtainStyledAttributes2.getResourceId(0, com.logistics.rider.glovo.R.style.Widget_RoadRunner_Tag_Background_Alert);
        typedArrayObtainStyledAttributes2.recycle();
    }
}
