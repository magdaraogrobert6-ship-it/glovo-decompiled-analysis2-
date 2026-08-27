package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import bo.app.c8$$ExternalSyntheticOutline0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class getSpotColor0d7_KjU {
    public int IconCompatParcelizer;
    public String MediaDescriptionCompat;
    public shadows4CzXII RatingCompat;
    public int RemoteActionCompatParcelizer;
    public float read;
    public boolean serializer;
    public boolean write;

    public final void write(Object obj) {
        switch (this.RatingCompat.ordinal()) {
            case 0:
            case 7:
                this.IconCompatParcelizer = ((Integer) obj).intValue();
                break;
            case 1:
                this.read = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.RemoteActionCompatParcelizer = ((Integer) obj).intValue();
                break;
            case 4:
                this.MediaDescriptionCompat = (String) obj;
                break;
            case 5:
                this.serializer = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.read = ((Float) obj).floatValue();
                break;
        }
    }

    public getSpotColor0d7_KjU(getSpotColor0d7_KjU getspotcolor0d7_kju, Object obj) {
        this.write = false;
        getspotcolor0d7_kju.getClass();
        this.RatingCompat = getspotcolor0d7_kju.RatingCompat;
        write(obj);
    }

    public static void RemoteActionCompatParcelizer(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        shadows4CzXII shadows4czxii;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), BeyondBoundsLayoutKt.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        shadows4CzXII shadows4czxii2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                shadows4czxii2 = shadows4CzXII.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    shadows4czxii = shadows4CzXII.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    shadows4czxii = shadows4CzXII.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    shadows4czxii = shadows4CzXII.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    shadows4czxii = shadows4CzXII.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    shadows4czxii = shadows4CzXII.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    shadows4czxii = shadows4CzXII.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    shadows4czxii = shadows4CzXII.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    shadows4czxii = shadows4CzXII.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                shadows4czxii2 = shadows4czxii;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            getSpotColor0d7_KjU getspotcolor0d7_kju = new getSpotColor0d7_KjU();
            getspotcolor0d7_kju.RatingCompat = shadows4czxii2;
            getspotcolor0d7_kju.write = z;
            getspotcolor0d7_kju.write(objValueOf2);
            map.put(string, getspotcolor0d7_kju);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void RemoteActionCompatParcelizer(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            getSpotColor0d7_KjU getspotcolor0d7_kju = (getSpotColor0d7_KjU) map.get(str);
            String strSerializer = !getspotcolor0d7_kju.write ? r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("set", str) : str;
            try {
                int iOrdinal = getspotcolor0d7_kju.RatingCompat.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strSerializer, cls3).invoke(view, Integer.valueOf(getspotcolor0d7_kju.IconCompatParcelizer));
                        break;
                    case 1:
                        cls.getMethod(strSerializer, cls2).invoke(view, Float.valueOf(getspotcolor0d7_kju.read));
                        break;
                    case 2:
                        cls.getMethod(strSerializer, cls3).invoke(view, Integer.valueOf(getspotcolor0d7_kju.RemoteActionCompatParcelizer));
                        break;
                    case 3:
                        Method method = cls.getMethod(strSerializer, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(getspotcolor0d7_kju.RemoteActionCompatParcelizer);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strSerializer, CharSequence.class).invoke(view, getspotcolor0d7_kju.MediaDescriptionCompat);
                        break;
                    case 5:
                        cls.getMethod(strSerializer, Boolean.TYPE).invoke(view, Boolean.valueOf(getspotcolor0d7_kju.serializer));
                        break;
                    case 6:
                        cls.getMethod(strSerializer, cls2).invoke(view, Float.valueOf(getspotcolor0d7_kju.read));
                        break;
                    case 7:
                        cls.getMethod(strSerializer, cls3).invoke(view, Integer.valueOf(getspotcolor0d7_kju.IconCompatParcelizer));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(" Custom Attribute \"", str, "\" not found on ");
                sbM.append(cls.getName());
                SentryLogcatAdapter.read("TransitionLayout", sbM.toString(), e);
            } catch (NoSuchMethodException e2) {
                SentryLogcatAdapter.read("TransitionLayout", cls.getName() + " must have a method " + strSerializer, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m(" Custom Attribute \"", str, "\" not found on ");
                sbM2.append(cls.getName());
                SentryLogcatAdapter.read("TransitionLayout", sbM2.toString(), e3);
            }
        }
    }

    public static HashMap read(View view, HashMap map) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            getSpotColor0d7_KjU getspotcolor0d7_kju = (getSpotColor0d7_KjU) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new getSpotColor0d7_KjU(getspotcolor0d7_kju, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new getSpotColor0d7_KjU(getspotcolor0d7_kju, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e) {
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(" Custom Attribute \"", str, "\" not found on ");
                sbM.append(cls.getName());
                SentryLogcatAdapter.read("TransitionLayout", sbM.toString(), e);
            } catch (NoSuchMethodException e2) {
                SentryLogcatAdapter.read("TransitionLayout", cls.getName() + " must have a method " + str, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m(" Custom Attribute \"", str, "\" not found on ");
                sbM2.append(cls.getName());
                SentryLogcatAdapter.read("TransitionLayout", sbM2.toString(), e3);
            }
        }
        return map2;
    }

    public getSpotColor0d7_KjU() {
    }
}
