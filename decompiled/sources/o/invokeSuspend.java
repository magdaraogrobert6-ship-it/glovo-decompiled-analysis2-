package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes4.dex */
public final class invokeSuspend {
    public boolean ComponentActivity;
    public boolean MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public attachBaseContext MediaSessionCompatQueueItem;
    public char MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public final /* synthetic */ SystemBarStyleCompanion _init_lambda4;
    public CharSequence r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public char r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public String r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public CharSequence r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public CharSequence r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public CharSequence r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final Menu r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public ColorStateList r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
    public PorterDuff.Mode ResultReceiver = null;
    public int IconCompatParcelizer = 0;
    public int RemoteActionCompatParcelizer = 0;
    public int write = 0;
    public int serializer = 0;
    public boolean MediaBrowserCompatMediaItem = true;
    public boolean read = true;

    public final void read(MenuItem menuItem) {
        SystemBarStyleCompanion systemBarStyleCompanion = this._init_lambda4;
        Context context = systemBarStyleCompanion.read;
        boolean z = false;
        menuItem.setChecked(this.PlaybackStateCompat).setVisible(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0).setEnabled(this.ComponentActivity).setCheckable(this.ParcelableVolumeInfo >= 1).setTitleCondensed(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).setIcon(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        int i = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
            if (context.isRestricted()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (systemBarStyleCompanion.RatingCompat == null) {
                systemBarStyleCompanion.RatingCompat = SystemBarStyleCompanion.read(context);
            }
            Object obj = systemBarStyleCompanion.RatingCompat;
            String str = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            setEnabled setenabled = new setEnabled();
            setenabled.read = obj;
            Class<?> cls = obj.getClass();
            try {
                setenabled.serializer = cls.getMethod(str, setEnabled.RemoteActionCompatParcelizer);
                menuItem.setOnMenuItemClickListener(setenabled);
            } catch (Exception e) {
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbM.append(cls.getName());
                InflateException inflateException = new InflateException(sbM.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.ParcelableVolumeInfo >= 2) {
            if (menuItem instanceof Keep) {
                Keep keep = (Keep) menuItem;
                keep.RatingCompat = (keep.RatingCompat & (-5)) | 4;
            } else if (menuItem instanceof closeOptionsMenu) {
                closeOptionsMenu closeoptionsmenu = (closeOptionsMenu) menuItem;
                dispatchIndirectPointerEvent dispatchindirectpointerevent = closeoptionsmenu.RemoteActionCompatParcelizer;
                try {
                    if (closeoptionsmenu.serializer == null) {
                        closeoptionsmenu.serializer = dispatchindirectpointerevent.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    closeoptionsmenu.serializer.invoke(dispatchindirectpointerevent, Boolean.TRUE);
                } catch (Exception e2) {
                    SentryLogcatAdapter.write("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.MediaMetadataCompat;
        if (str2 != null) {
            menuItem.setActionView((View) serializer(str2, SystemBarStyleCompanion.RemoteActionCompatParcelizer, systemBarStyleCompanion.write));
            z = true;
        }
        int i2 = this.RatingCompat;
        if (i2 > 0) {
            if (z) {
                SentryLogcatAdapter.IconCompatParcelizer("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        attachBaseContext attachbasecontext = this.MediaSessionCompatQueueItem;
        if (attachbasecontext != null) {
            if (menuItem instanceof dispatchIndirectPointerEvent) {
                ((dispatchIndirectPointerEvent) menuItem).RemoteActionCompatParcelizer(attachbasecontext);
            } else {
                SentryLogcatAdapter.IconCompatParcelizer("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        boolean z2 = menuItem instanceof dispatchIndirectPointerEvent;
        if (z2) {
            ((dispatchIndirectPointerEvent) menuItem).write(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (z2) {
            ((dispatchIndirectPointerEvent) menuItem).serializer(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.MediaSessionCompatResultReceiverWrapper;
        int i3 = this.MediaSessionCompatToken;
        if (z2) {
            ((dispatchIndirectPointerEvent) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        int i4 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (z2) {
            ((dispatchIndirectPointerEvent) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.ResultReceiver;
        if (mode != null) {
            if (z2) {
                ((dispatchIndirectPointerEvent) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (colorStateList != null) {
            if (z2) {
                ((dispatchIndirectPointerEvent) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    public final Object serializer(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this._init_lambda4.read.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            SentryLogcatAdapter.write("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public invokeSuspend(SystemBarStyleCompanion systemBarStyleCompanion, Menu menu) {
        this._init_lambda4 = systemBarStyleCompanion;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = menu;
    }
}
