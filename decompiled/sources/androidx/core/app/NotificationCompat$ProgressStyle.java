package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import o.FocusEventModifierKt;
import o.accessgetLeftcp;
import o.cancelFocus;
import o.focusTargetAvailable;
import o.getEnterdhqQ8s;
import o.getFocusState;
import o.invalidateFocusEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class NotificationCompat$ProgressStyle extends NotificationCompat$Style {
    public boolean IconCompatParcelizer;
    public IconCompat MediaBrowserCompatMediaItem;
    public IconCompat RatingCompat;
    public IconCompat serializer;
    public ArrayList MediaSessionCompatQueueItem = new ArrayList();
    public ArrayList read = new ArrayList();
    public int write = 0;
    public boolean RemoteActionCompatParcelizer = true;

    @Override // androidx.core.app.NotificationCompat$Style
    public final void apply(accessgetLeftcp accessgetleftcp) {
        NotificationCompatBuilder notificationCompatBuilder = (NotificationCompatBuilder) accessgetleftcp;
        Notification.Builder builder = notificationCompatBuilder.serializer;
        if (Build.VERSION.SDK_INT < 36) {
            int iIconCompatParcelizer = IconCompatParcelizer();
            builder.setProgress(iIconCompatParcelizer, Math.min(this.write, iIconCompatParcelizer), this.IconCompatParcelizer);
            return;
        }
        Context context = accessgetleftcp instanceof NotificationCompatBuilder ? notificationCompatBuilder.write : null;
        Notification.ProgressStyle progressStyleBi_ = cancelFocus.bi_();
        FocusEventModifierKt.bq_(progressStyleBi_, this.RemoteActionCompatParcelizer);
        FocusEventModifierKt.bj_(progressStyleBi_, this.write);
        FocusEventModifierKt.bl_(progressStyleBi_, this.IconCompatParcelizer);
        IconCompat iconCompat = this.MediaBrowserCompatMediaItem;
        FocusEventModifierKt.bo_(progressStyleBi_, iconCompat != null ? iconCompat.read(context) : null);
        IconCompat iconCompat2 = this.serializer;
        FocusEventModifierKt.bk_(progressStyleBi_, iconCompat2 != null ? iconCompat2.read(context) : null);
        IconCompat iconCompat3 = this.RatingCompat;
        FocusEventModifierKt.bp_(progressStyleBi_, iconCompat3 != null ? iconCompat3.read(context) : null);
        FocusEventModifierKt.bm_(progressStyleBi_, this.read);
        FocusEventModifierKt.bn_(progressStyleBi_, this.MediaSessionCompatQueueItem);
        builder.setStyle(progressStyleBi_);
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final boolean displayCustomViewInline() {
        return true;
    }

    public static IconCompat read(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return IconCompat.RemoteActionCompatParcelizer((Icon) parcelable);
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.IconCompatParcelizer = (Bitmap) parcelable;
        return iconCompat;
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        if (Build.VERSION.SDK_INT < 36) {
            ArrayList arrayList = this.MediaSessionCompatQueueItem;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    getFocusState getfocusstate = (getFocusState) arrayList.get(i);
                    if (getfocusstate.read > 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("length", getfocusstate.read);
                        bundle2.putInt("id", getfocusstate.IconCompatParcelizer);
                        bundle2.putInt("colorInt", getfocusstate.write);
                        arrayList2.add(bundle2);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressSegments", arrayList2);
            ArrayList arrayList3 = this.read;
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    invalidateFocusEvent invalidatefocusevent = (invalidateFocusEvent) arrayList3.get(i2);
                    if (invalidatefocusevent.write >= 0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("position", invalidatefocusevent.write);
                        bundle3.putInt("id", invalidatefocusevent.IconCompatParcelizer);
                        bundle3.putInt("colorInt", invalidatefocusevent.serializer);
                        arrayList4.add(bundle3);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressPoints", arrayList4);
            bundle.putInt("android.progress", this.write);
            bundle.putBoolean("android.progressIndeterminate", this.IconCompatParcelizer);
            bundle.putInt("android.progressMax", IconCompatParcelizer());
            bundle.putBoolean("android.styledByProgress", this.RemoteActionCompatParcelizer);
            getEnterdhqQ8s getenterdhqq8s = this.PlaybackStateCompatCustomAction;
            Context context = getenterdhqq8s != null ? getenterdhqq8s.MediaSessionCompatToken : null;
            if (context == null) {
                return;
            }
            IconCompat iconCompat = this.RatingCompat;
            if (iconCompat != null) {
                bundle.putParcelable("android.progressTrackerIcon", iconCompat.read(context));
            } else {
                bundle.remove("android.progressTrackerIcon");
            }
            IconCompat iconCompat2 = this.MediaBrowserCompatMediaItem;
            if (iconCompat2 != null) {
                bundle.putParcelable("android.progressStartIcon", iconCompat2.read(context));
            } else {
                bundle.remove("android.progressStartIcon");
            }
            IconCompat iconCompat3 = this.serializer;
            if (iconCompat3 != null) {
                bundle.putParcelable("android.progressEndIcon", iconCompat3.read(context));
            } else {
                bundle.remove("android.progressEndIcon");
            }
        }
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 34 ? focusTargetAvailable.read(bundle, "android.progressSegments", Bundle.class) : bundle.getParcelableArrayList("android.progressSegments");
        ArrayList arrayList = new ArrayList();
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                int i2 = bundle2.getInt("length");
                if (i2 > 0) {
                    int i3 = bundle2.getInt("id");
                    int i4 = bundle2.getInt("colorInt", 0);
                    getFocusState getfocusstate = new getFocusState();
                    getfocusstate.read = i2;
                    getfocusstate.IconCompatParcelizer = i3;
                    getfocusstate.write = i4;
                    arrayList.add(getfocusstate);
                }
            }
        }
        this.MediaSessionCompatQueueItem = arrayList;
        this.write = bundle.getInt("android.progress", 0);
        this.IconCompatParcelizer = bundle.getBoolean("android.progressIndeterminate", false);
        this.RemoteActionCompatParcelizer = bundle.getBoolean("android.styledByProgress", true);
        ArrayList parcelableArrayList2 = Build.VERSION.SDK_INT >= 34 ? focusTargetAvailable.read(bundle, "android.progressPoints", Bundle.class) : bundle.getParcelableArrayList("android.progressPoints");
        ArrayList arrayList2 = new ArrayList();
        if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
            for (int i5 = 0; i5 < parcelableArrayList2.size(); i5++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i5);
                int i6 = bundle3.getInt("position");
                if (i6 >= 0) {
                    int i7 = bundle3.getInt("id");
                    int i8 = bundle3.getInt("colorInt", 0);
                    invalidateFocusEvent invalidatefocusevent = new invalidateFocusEvent();
                    invalidatefocusevent.write = i6;
                    invalidatefocusevent.IconCompatParcelizer = i7;
                    invalidatefocusevent.serializer = i8;
                    arrayList2.add(invalidatefocusevent);
                }
            }
        }
        this.read = arrayList2;
        this.RatingCompat = read((Parcelable) SQLite.read(bundle, "android.progressTrackerIcon", Icon.class));
        this.MediaBrowserCompatMediaItem = read((Parcelable) SQLite.read(bundle, "android.progressStartIcon", Icon.class));
        this.serializer = read((Parcelable) SQLite.read(bundle, "android.progressEndIcon", Icon.class));
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.progressSegments");
        bundle.remove("android.progress");
        bundle.remove("android.styledByProgress");
        bundle.remove("android.progressTrackerIcon");
        bundle.remove("android.progressStartIcon");
        bundle.remove("android.progressEndIcon");
        bundle.remove("android.progressPoints");
        bundle.remove("android.progressIndeterminate");
    }

    public final int IconCompatParcelizer() {
        ArrayList arrayList = this.MediaSessionCompatQueueItem;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            int iAddExact = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                int i3 = ((getFocusState) arrayList.get(i2)).read;
                if (i3 > 0) {
                    try {
                        iAddExact = Math.addExact(iAddExact, i3);
                        i++;
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
            }
            if (i != 0) {
                return iAddExact;
            }
        }
        return 100;
    }
}
