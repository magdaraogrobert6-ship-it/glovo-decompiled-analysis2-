package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;

/* JADX INFO: loaded from: classes.dex */
public abstract class removeOnPictureInPictureModeChangedListener {
    public static final getDifferencertfAjoo RatingCompat = new getDifferencertfAjoo(new setMeasurementConstraintsBRTryo0(2));
    public static int read = -100;
    public static hasNonInteropFocusableContent MediaSessionCompatQueueItem = null;
    public static hasNonInteropFocusableContent MediaBrowserCompatMediaItem = null;
    public static Boolean IconCompatParcelizer = null;
    public static boolean MediaMetadataCompat = false;
    public static final createnHHXs2Y RemoteActionCompatParcelizer = new createnHHXs2Y(0);
    public static final Object serializer = new Object();
    public static final Object write = new Object();

    public abstract handleOnBackPressed IconCompatParcelizer(handleOnBackStarted handleonbackstarted);

    public abstract void IconCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer(int i);

    public abstract void read();

    public abstract void read(CharSequence charSequence);

    public abstract void serializer(View view);

    public abstract void serializer(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean serializer(int i);

    public abstract void write();

    public static void serializer(startActivityForResult startactivityforresult) {
        synchronized (serializer) {
            createnHHXs2Y createnhhxs2y = RemoteActionCompatParcelizer;
            createnhhxs2y.getClass();
            accessemitExit accessemitexit = new accessemitExit(createnhhxs2y);
            while (accessemitexit.hasNext()) {
                removeOnPictureInPictureModeChangedListener removeonpictureinpicturemodechangedlistener = (removeOnPictureInPictureModeChangedListener) ((java.lang.ref.WeakReference) accessemitexit.next()).get();
                if (removeonpictureinpicturemodechangedlistener == startactivityforresult || removeonpictureinpicturemodechangedlistener == null) {
                    accessemitexit.remove();
                }
            }
        }
    }

    public static boolean serializer(Context context) {
        if (IconCompatParcelizer == null) {
            try {
                int i = AppLocalesMetadataHolderService.RemoteActionCompatParcelizer;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), onStart.RemoteActionCompatParcelizer() | androidx.compose.ui.graphics.Fields.SpotShadowColor).metaData;
                if (bundle != null) {
                    IconCompatParcelizer = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                IconCompatParcelizer = Boolean.FALSE;
            }
        }
        return IconCompatParcelizer.booleanValue();
    }

    public static void IconCompatParcelizer(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && read != i) {
            read = i;
            synchronized (serializer) {
                createnHHXs2Y createnhhxs2y = RemoteActionCompatParcelizer;
                createnhhxs2y.getClass();
                accessemitExit accessemitexit = new accessemitExit(createnhhxs2y);
                while (accessemitexit.hasNext()) {
                    removeOnPictureInPictureModeChangedListener removeonpictureinpicturemodechangedlistener = (removeOnPictureInPictureModeChangedListener) ((java.lang.ref.WeakReference) accessemitexit.next()).get();
                    if (removeonpictureinpicturemodechangedlistener != null) {
                        ((startActivityForResult) removeonpictureinpicturemodechangedlistener).write(true, true);
                    }
                }
            }
        }
    }
}
