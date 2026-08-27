package o;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import java.util.HashMap;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SortedSet {
    public final internalOnMeasureui MediaBrowserCompatMediaItem;
    public final LayoutInflater MediaSessionCompatQueueItem;
    public final getDiagonalSizeimpl RatingCompat;

    public abstract ViewGroup IconCompatParcelizer();

    public abstract ImageView RemoteActionCompatParcelizer();

    public View.OnClickListener read() {
        return null;
    }

    public abstract View serializer();

    public abstract ViewTreeObserver.OnGlobalLayoutListener write(HashMap map, FirebaseInAppMessagingDisplay.AnonymousClass2 anonymousClass2);

    public getDiagonalSizeimpl write() {
        return this.RatingCompat;
    }

    public static void RemoteActionCompatParcelizer(android.widget.Button button, getAutoClearFocusBehavior4UtRPd4 getautoclearfocusbehavior4utrpd4) {
        String str = getautoclearfocusbehavior4utrpd4.write.read;
        String str2 = getautoclearfocusbehavior4utrpd4.IconCompatParcelizer;
        try {
            Drawable background = button.getBackground();
            background.setTint(android.graphics.Color.parseColor(str2));
            button.setBackground(background);
        } catch (IllegalArgumentException e) {
            BuildersKt.write("Error parsing background color: " + e.toString());
        }
        button.setText(getautoclearfocusbehavior4utrpd4.write.write);
        button.setTextColor(android.graphics.Color.parseColor(str));
    }

    public static void read(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(android.graphics.Color.parseColor(str));
        } catch (IllegalArgumentException e) {
            BuildersKt.write("Error parsing background color: " + e.toString() + " color: " + str);
        }
    }

    public SortedSet(getDiagonalSizeimpl getdiagonalsizeimpl, LayoutInflater layoutInflater, internalOnMeasureui internalonmeasureui) {
        this.RatingCompat = getdiagonalsizeimpl;
        this.MediaSessionCompatQueueItem = layoutInflater;
        this.MediaBrowserCompatMediaItem = internalonmeasureui;
    }
}
