package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import fwfd.com.fwfsdk.util.FWFHelper;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class graphicsLayerpANQ8Wg implements graphicsLayer_6ThJ44, graphicsLayerAp8cVGQdefault, graphicsLayersKFY_QE {
    public final /* synthetic */ int IconCompatParcelizer;
    public static final graphicsLayerpANQ8Wg write = new graphicsLayerpANQ8Wg(0);
    public static final graphicsLayerpANQ8Wg read = new graphicsLayerpANQ8Wg(1);
    public static final graphicsLayerpANQ8Wg RemoteActionCompatParcelizer = new graphicsLayerpANQ8Wg(2);
    public static final graphicsLayerpANQ8Wg serializer = new graphicsLayerpANQ8Wg(3);

    public /* synthetic */ graphicsLayerpANQ8Wg(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.graphicsLayerAp8cVGQdefault
    public float RemoteActionCompatParcelizer(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // o.graphicsLayersKFY_QE
    public component17NrFUSI read(Context context, graphicsLayerAp8cVGQdefault graphicslayerap8cvgqdefault) {
        context.getClass();
        graphicslayerap8cvgqdefault.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            return IconCompatParcelizer((Activity) baseContext, graphicslayerap8cvgqdefault);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new component17NrFUSI(new android.graphics.Rect(0, 0, point.x, point.y), graphicslayerap8cvgqdefault.RemoteActionCompatParcelizer(context));
    }

    @Override // o.graphicsLayer_6ThJ44
    public android.graphics.Rect read(Activity activity) throws Exception {
        int i = this.IconCompatParcelizer;
        activity.getClass();
        DisplayCutout displayCutout = null;
        if (i != 0) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                return new android.graphics.Rect((android.graphics.Rect) objInvoke);
            } catch (Exception e) {
                if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                    throw e;
                }
                SentryLogcatAdapter.IconCompatParcelizer("BoundsHelper", e);
                return write.read(activity);
            }
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        Configuration configuration2 = activity.getResources().getConfiguration();
        try {
            Field declaredField2 = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(configuration2);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke2 = obj2.getClass().getDeclaredMethod("getBounds", null).invoke(obj2, null);
                objInvoke2.getClass();
                rect.set((android.graphics.Rect) objInvoke2);
            } else {
                Object objInvoke3 = obj2.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj2, null);
                objInvoke3.getClass();
                rect.set((android.graphics.Rect) objInvoke3);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            SentryLogcatAdapter.IconCompatParcelizer("BoundsHelper", e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", FWFHelper.fwfDeviceOS);
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField3 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField3.setAccessible(true);
                Object obj3 = declaredField3.get(objNewInstance);
                if (obj3 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj3;
                }
            } catch (Exception e3) {
                if (!(e3 instanceof ClassNotFoundException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof NoSuchFieldException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException) && !(e3 instanceof InstantiationException)) {
                    throw e3;
                }
                SentryLogcatAdapter.IconCompatParcelizer("BoundsHelper", e3);
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // o.graphicsLayersKFY_QE
    public component17NrFUSI IconCompatParcelizer(Activity activity, graphicsLayerAp8cVGQdefault graphicslayerap8cvgqdefault) {
        graphicsLayer_6ThJ44 graphicslayer_6thj44;
        activity.getClass();
        graphicslayerap8cvgqdefault.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            graphicslayer_6thj44 = graphicsLayerAp8cVGQ.read;
        } else {
            graphicslayer_6thj44 = i >= 29 ? read : write;
        }
        return new component17NrFUSI(new toCompareValue(graphicslayer_6thj44.read(activity)), graphicslayerap8cvgqdefault.RemoteActionCompatParcelizer(activity));
    }
}
