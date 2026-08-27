package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import o.processDragGesture;
import o.setCheckable;
import o.supportInvalidateOptionsMenu;
import o.supportNavigateUpTo;
import o.supportShouldUpRecreateTask;

/* JADX INFO: loaded from: classes4.dex */
public class AppCompatViewInflater {
    public final Object[] MediaSessionCompatQueueItem = new Object[2];
    public static final Class[] IconCompatParcelizer = {Context.class, AttributeSet.class};
    public static final int[] MediaMetadataCompat = {R.attr.onClick};
    public static final int[] write = {R.attr.accessibilityHeading};
    public static final int[] RemoteActionCompatParcelizer = {R.attr.accessibilityPaneTitle};
    public static final int[] RatingCompat = {R.attr.screenReaderFocusable};
    public static final String[] serializer = {"android.widget.", "android.view.", "android.webkit."};
    public static final processDragGesture read = new processDragGesture(0);

    public setCheckable IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new setCheckable(context, attributeSet);
    }

    public final View RemoteActionCompatParcelizer(Context context, String str, String str2) {
        String strConcat;
        processDragGesture processdraggesture = read;
        Constructor constructor = (Constructor) processdraggesture.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(IconCompatParcelizer);
            processdraggesture.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.MediaSessionCompatQueueItem);
    }

    public AppCompatTextView RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public supportInvalidateOptionsMenu read(Context context, AttributeSet attributeSet) {
        return new supportInvalidateOptionsMenu(context, attributeSet);
    }

    public supportShouldUpRecreateTask serializer(Context context, AttributeSet attributeSet) {
        return new supportShouldUpRecreateTask(context, attributeSet);
    }

    public supportNavigateUpTo write(Context context, AttributeSet attributeSet) {
        return new supportNavigateUpTo(context, attributeSet);
    }
}
