package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class SystemBarStyleCompanion extends MenuInflater {
    public static final Class[] RemoteActionCompatParcelizer;
    public static final Class[] serializer;
    public final Object[] IconCompatParcelizer;
    public Object RatingCompat;
    public final Context read;
    public final Object[] write;

    static {
        Class[] clsArr = {Context.class};
        RemoteActionCompatParcelizer = clsArr;
        serializer = clsArr;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof AlertControllerButtonHandler)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.read.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof AlertControllerButtonHandler) {
                    AlertControllerButtonHandler alertControllerButtonHandler = (AlertControllerButtonHandler) menu;
                    if (!alertControllerButtonHandler.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                        alertControllerButtonHandler.MediaDescriptionCompat();
                        z = true;
                    }
                }
                IconCompatParcelizer(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((AlertControllerButtonHandler) menu).MediaBrowserCompatMediaItem();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((AlertControllerButtonHandler) menu).MediaBrowserCompatMediaItem();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    public SystemBarStyleCompanion(Context context) {
        super(context);
        this.read = context;
        Object[] objArr = {context};
        this.write = objArr;
        this.IconCompatParcelizer = objArr;
    }

    public static Object read(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? read(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f5 A[PHI: r9
  0x00f5: PHI (r9v2 boolean) = 
  (r9v6 boolean)
  (r9v7 boolean)
  (r9v8 boolean)
  (r9v9 boolean)
  (r9v4 boolean)
  (r9v10 boolean)
  (r9v11 boolean)
  (r9v12 boolean)
  (r9v13 boolean)
 binds: [B:40:0x00b6, B:44:0x00c6, B:17:0x0045, B:38:0x00b2, B:39:0x00b4, B:30:0x0078, B:36:0x009c, B:35:0x0086, B:26:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    public final void IconCompatParcelizer(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        invokeSuspend invokesuspend = new invokeSuspend(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                Menu menu2 = invokesuspend.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                if (eventType != i) {
                    if (eventType != 3) {
                        z = z;
                        z = z;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            z2 = false;
                            str = null;
                        } else {
                            if (name2.equals("group")) {
                                invokesuspend.IconCompatParcelizer = 0;
                                invokesuspend.RemoteActionCompatParcelizer = 0;
                                invokesuspend.write = 0;
                                invokesuspend.serializer = 0;
                                invokesuspend.MediaBrowserCompatMediaItem = true;
                                invokesuspend.read = true;
                                z = z;
                            } else if (name2.equals("item")) {
                                if (!invokesuspend.MediaDescriptionCompat) {
                                    attachBaseContext attachbasecontext = invokesuspend.MediaSessionCompatQueueItem;
                                    if (attachbasecontext != null && attachbasecontext.RemoteActionCompatParcelizer.hasSubMenu()) {
                                        z = z;
                                        invokesuspend.MediaDescriptionCompat = true;
                                        invokesuspend.read(menu2.addSubMenu(invokesuspend.IconCompatParcelizer, invokesuspend.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, invokesuspend.PlaybackStateCompatCustomAction, invokesuspend.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw).getItem());
                                        z = z;
                                    } else {
                                        z = z;
                                        z = z;
                                        invokesuspend.MediaDescriptionCompat = true;
                                        invokesuspend.read(menu2.add(invokesuspend.IconCompatParcelizer, invokesuspend.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, invokesuspend.PlaybackStateCompatCustomAction, invokesuspend.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw));
                                        z = z;
                                    }
                                }
                            } else if (name2.equals("menu")) {
                                z = z;
                                z = true;
                            }
                            z = z;
                            z = z;
                        }
                    }
                } else if (z2) {
                    z = z;
                    z = z;
                } else {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.read;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.MenuGroup);
                        invokesuspend.IconCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        invokesuspend.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(3, 0);
                        invokesuspend.write = typedArrayObtainStyledAttributes.getInt(4, 0);
                        invokesuspend.serializer = typedArrayObtainStyledAttributes.getInt(5, 0);
                        invokesuspend.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        invokesuspend.read = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        z = z;
                        z = z;
                        z = z;
                    } else if (name3.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.MenuItem);
                        invokesuspend.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        invokesuspend.PlaybackStateCompatCustomAction = (typedArrayObtainStyledAttributes2.getInt(5, invokesuspend.RemoteActionCompatParcelizer) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, invokesuspend.write) & 65535);
                        invokesuspend.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = typedArrayObtainStyledAttributes2.getText(7);
                        invokesuspend.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = typedArrayObtainStyledAttributes2.getText(8);
                        invokesuspend.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        invokesuspend.MediaSessionCompatResultReceiverWrapper = string == null ? (char) 0 : string.charAt(0);
                        invokesuspend.MediaSessionCompatToken = typedArrayObtainStyledAttributes2.getInt(16, androidx.compose.ui.graphics.Fields.TransformOrigin);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        invokesuspend.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = string2 == null ? (char) 0 : string2.charAt(0);
                        invokesuspend.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = typedArrayObtainStyledAttributes2.getInt(20, androidx.compose.ui.graphics.Fields.TransformOrigin);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            invokesuspend.ParcelableVolumeInfo = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            invokesuspend.ParcelableVolumeInfo = invokesuspend.serializer;
                        }
                        invokesuspend.PlaybackStateCompat = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        invokesuspend.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = typedArrayObtainStyledAttributes2.getBoolean(4, invokesuspend.MediaBrowserCompatMediaItem);
                        invokesuspend.ComponentActivity = typedArrayObtainStyledAttributes2.getBoolean(1, invokesuspend.read);
                        invokesuspend.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        invokesuspend.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = typedArrayObtainStyledAttributes2.getString(12);
                        invokesuspend.RatingCompat = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        invokesuspend.MediaMetadataCompat = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && invokesuspend.RatingCompat == 0 && invokesuspend.MediaMetadataCompat == null) {
                            invokesuspend.MediaSessionCompatQueueItem = (attachBaseContext) invokesuspend.serializer(string3, serializer, this.IconCompatParcelizer);
                        } else {
                            if (z3) {
                                SentryLogcatAdapter.IconCompatParcelizer("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            invokesuspend.MediaSessionCompatQueueItem = null;
                        }
                        invokesuspend.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = typedArrayObtainStyledAttributes2.getText(17);
                        invokesuspend.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            invokesuspend.ResultReceiver = getNestedScrollAxes.IconCompatParcelizer(typedArrayObtainStyledAttributes2.getInt(19, -1), invokesuspend.ResultReceiver);
                        } else {
                            invokesuspend.ResultReceiver = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = FocusListener.write(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            invokesuspend.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = colorStateList;
                        } else {
                            invokesuspend.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        invokesuspend.MediaDescriptionCompat = false;
                    } else if (name3.equals("menu")) {
                        invokesuspend.MediaDescriptionCompat = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(invokesuspend.IconCompatParcelizer, invokesuspend.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, invokesuspend.PlaybackStateCompatCustomAction, invokesuspend.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
                        invokesuspend.read(subMenuAddSubMenu.getItem());
                        IconCompatParcelizer(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Unexpected end of document");
                return;
            }
        }
    }
}
