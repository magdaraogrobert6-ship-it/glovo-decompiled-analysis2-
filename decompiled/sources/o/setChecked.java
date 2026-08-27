package o;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setChecked {
    public static boolean RemoteActionCompatParcelizer(DragEvent dragEvent, View view, Activity activity) {
        FocusOwnerImpltakeFocus1 focusProperties;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            focusProperties = new FocusProperties(clipData, 3);
        } else {
            getExitannotations getexitannotations = new getExitannotations();
            getexitannotations.serializer = clipData;
            getexitannotations.RatingCompat = 3;
            focusProperties = getexitannotations;
        }
        FocusPropertiesNode.write(view, focusProperties.write());
        return true;
    }

    public static boolean write(DragEvent dragEvent, TextView textView, Activity activity) {
        FocusOwnerImpltakeFocus1 focusProperties;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                focusProperties = new FocusProperties(clipData, 3);
            } else {
                getExitannotations getexitannotations = new getExitannotations();
                getexitannotations.serializer = clipData;
                getexitannotations.RatingCompat = 3;
                focusProperties = getexitannotations;
            }
            FocusPropertiesNode.write(textView, focusProperties.write());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }
}
