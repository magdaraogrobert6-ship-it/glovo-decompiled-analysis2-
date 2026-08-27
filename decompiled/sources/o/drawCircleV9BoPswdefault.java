package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class drawCircleV9BoPswdefault implements getInverseTransform {
    public static final accessgetMinp IconCompatParcelizer = new accessgetMinp("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, accessgetMinp.IconCompatParcelizer);
    public final Context read;

    @Override // o.getInverseTransform
    public final boolean RemoteActionCompatParcelizer(Object obj, getEotfFuncui_graphics geteotffuncui_graphics) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public drawCircleV9BoPswdefault(Context context) {
        this.read = context.getApplicationContext();
    }

    public final generateOetf IconCompatParcelizer(Uri uri, getEotfFuncui_graphics geteotffuncui_graphics) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Package name for ", uri, " is null or empty");
            return null;
        }
        Context context = this.read;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, FWFHelper.fwfDeviceOS);
            }
            if (identifier == 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Failed to find resource id for: "));
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Unrecognized Uri format: "));
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Unrecognized Uri format: "), e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) geteotffuncui_graphics.serializer(IconCompatParcelizer) : null;
        Drawable drawable = theme == null ? PositionCalculator.read(context, contextCreatePackageContext, identifier, null) : PositionCalculator.read(context, context, identifier, theme);
        if (drawable != null) {
            return new drawImagegbVJVH8default(drawable, 1);
        }
        return null;
    }

    @Override // o.getInverseTransform
    public final /* bridge */ /* synthetic */ generateOetf IconCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        return IconCompatParcelizer((Uri) obj, geteotffuncui_graphics);
    }
}
