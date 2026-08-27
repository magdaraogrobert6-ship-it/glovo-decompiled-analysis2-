package androidx.compose.ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.Set;
import kotlin.ranges.RangesKt;
import o.CaptionedImageContentCardView;
import o.ItemTouchHelperAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class DragAndDrop_androidKt {
    public static final DragEvent toAndroidDragEvent(DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent$ui();
    }

    public static final long getPositionInRoot(DragAndDropEvent dragAndDropEvent) {
        float x = dragAndDropEvent.getDragEvent$ui().getX();
        float y = dragAndDropEvent.getDragEvent$ui().getY();
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L));
    }

    public static final Set<String> mimeTypes(DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = dragAndDropEvent.getDragEvent$ui().getClipDescription();
        if (clipDescription == null) {
            return ItemTouchHelperAdapter.serializer;
        }
        CaptionedImageContentCardView captionedImageContentCardView = new CaptionedImageContentCardView(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i = 0; i < mimeTypeCount; i++) {
            captionedImageContentCardView.add(clipDescription.getMimeType(i));
        }
        return RangesKt.IconCompatParcelizer(captionedImageContentCardView);
    }
}
