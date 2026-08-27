package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class configureStrokePaintQ_0CZUIdefault implements drawImage9jGpkUE {
    public final Object read;
    public final /* synthetic */ int serializer;
    public final Object write;

    public configureStrokePaintQ_0CZUIdefault(Context context, androidx.navigation.internal.NavContext navContext) {
        this.serializer = 1;
        this.read = context.getApplicationContext();
        this.write = navContext;
    }

    @Override // o.drawImage9jGpkUE
    public final boolean write(Object obj) {
        int i = this.serializer;
        Object obj2 = this.read;
        if (i == 0) {
            Uri uri = (Uri) obj;
            return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
        }
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) obj2).getPackageName().equals(uri2.getAuthority());
            }
            return true;
        }
        Iterator it = ((ArrayList) obj2).iterator();
        while (it.hasNext()) {
            if (((drawImage9jGpkUE) it.next()).write(obj)) {
                return true;
            }
        }
        return false;
    }

    public static androidx.navigation.internal.NavContext IconCompatParcelizer(Context context) {
        return new androidx.navigation.internal.NavContext(context, 3, false);
    }

    public static androidx.navigation.internal.NavContext RemoteActionCompatParcelizer(Context context) {
        return new androidx.navigation.internal.NavContext(context, 6, false);
    }

    public static androidx.navigation.internal.NavContext read(Context context) {
        return new androidx.navigation.internal.NavContext(context, 7, false);
    }

    public static androidx.navigation.internal.NavContext serializer(Context context) {
        return new androidx.navigation.internal.NavContext(context, 2, false);
    }

    public static androidx.navigation.internal.NavContext write(Context context) {
        return new androidx.navigation.internal.NavContext(context, 4, false);
    }

    public String toString() {
        if (this.serializer != 2) {
            return super.toString();
        }
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.read).toArray()) + '}';
    }

    @Override // o.drawImage9jGpkUE
    public final drawLine1RTmtNc RemoteActionCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        drawLine1RTmtNc drawline1rtmtncRemoteActionCompatParcelizer;
        Uri uri;
        int i3 = this.serializer;
        Object obj2 = this.read;
        Object obj3 = this.write;
        if (i3 == 0) {
            Uri uri2 = (Uri) obj;
            String strSubstring = uri2.toString().substring(22);
            AssetManager assetManager = (AssetManager) obj2;
            return new drawLine1RTmtNc(new translatedefault(uri2), ((configurePaintswdJneEdefault) obj3).RemoteActionCompatParcelizer != 0 ? new RgbCompanion(assetManager, strSubstring, 1) : new RgbCompanion(assetManager, strSubstring, 0));
        }
        if (i3 == 1) {
            Integer num = (Integer) obj;
            Resources.Theme theme = (Resources.Theme) geteotffuncui_graphics.serializer(drawCircleV9BoPswdefault.IconCompatParcelizer);
            return new drawLine1RTmtNc(new translatedefault(num), new configureStrokePaintho4zsrMdefault(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (androidx.navigation.internal.NavContext) obj3, num.intValue()));
        }
        drawLine1RTmtNc drawline1rtmtncRemoteActionCompatParcelizer2 = null;
        if (i3 == 2) {
            ArrayList arrayList = (ArrayList) obj2;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            eotfFunclambda0 eotffunclambda0 = null;
            for (int i4 = 0; i4 < size; i4++) {
                drawImage9jGpkUE drawimage9jgpkue = (drawImage9jGpkUE) arrayList.get(i4);
                if (drawimage9jgpkue.write(obj) && (drawline1rtmtncRemoteActionCompatParcelizer = drawimage9jgpkue.RemoteActionCompatParcelizer(obj, i, i2, geteotffuncui_graphics)) != null) {
                    eotffunclambda0 = drawline1rtmtncRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                    arrayList2.add(drawline1rtmtncRemoteActionCompatParcelizer.IconCompatParcelizer);
                }
            }
            if (arrayList2.isEmpty() || eotffunclambda0 == null) {
                return null;
            }
            return new drawLine1RTmtNc(eotffunclambda0, new drawPathLG529CI(arrayList2, (setRootFocusNodeui) obj3));
        }
        if (i3 == 3) {
            Integer num2 = (Integer) obj;
            try {
                uri = Uri.parse("android.resource://" + ((Resources) obj3).getResourcePackageName(num2.intValue()) + '/' + num2);
            } catch (Resources.NotFoundException e) {
                if (Log.isLoggable("ResourceLoader", 5)) {
                    SentryLogcatAdapter.write("ResourceLoader", "Received invalid resource id: " + num2, e);
                }
                uri = null;
            }
            if (uri == null) {
                return null;
            }
            return ((drawImage9jGpkUE) obj2).RemoteActionCompatParcelizer(uri, i, i2, geteotffuncui_graphics);
        }
        Uri uri3 = (Uri) obj;
        drawImage9jGpkUE drawimage9jgpkue2 = (drawImage9jGpkUE) obj3;
        List<String> pathSegments = uri3.getPathSegments();
        if (pathSegments.size() == 1) {
            try {
                int i5 = Integer.parseInt(uri3.getPathSegments().get(0));
                if (i5 != 0) {
                    drawline1rtmtncRemoteActionCompatParcelizer2 = drawimage9jgpkue2.RemoteActionCompatParcelizer(Integer.valueOf(i5), i, i2, geteotffuncui_graphics);
                } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                    SentryLogcatAdapter.IconCompatParcelizer("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                }
                return drawline1rtmtncRemoteActionCompatParcelizer2;
            } catch (NumberFormatException e2) {
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return drawline1rtmtncRemoteActionCompatParcelizer2;
                }
                SentryLogcatAdapter.write("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                return drawline1rtmtncRemoteActionCompatParcelizer2;
            }
        }
        if (pathSegments.size() != 2) {
            if (!Log.isLoggable("ResourceUriLoader", 5)) {
                return null;
            }
            SentryLogcatAdapter.IconCompatParcelizer("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
            return null;
        }
        List<String> pathSegments2 = uri3.getPathSegments();
        Context context = (Context) obj2;
        int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
        if (identifier != 0) {
            return drawimage9jgpkue2.RemoteActionCompatParcelizer(Integer.valueOf(identifier), i, i2, geteotffuncui_graphics);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        SentryLogcatAdapter.IconCompatParcelizer("ResourceUriLoader", "Failed to find resource id for: " + uri3);
        return null;
    }

    public configureStrokePaintQ_0CZUIdefault(Resources resources, drawImage9jGpkUE drawimage9jgpkue) {
        this.serializer = 3;
        this.write = resources;
        this.read = drawimage9jgpkue;
    }

    public /* synthetic */ configureStrokePaintQ_0CZUIdefault(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.read = obj;
        this.write = obj2;
    }

    public configureStrokePaintQ_0CZUIdefault(Context context, drawImage9jGpkUE drawimage9jgpkue) {
        this.serializer = 4;
        this.read = context.getApplicationContext();
        this.write = drawimage9jgpkue;
    }
}
