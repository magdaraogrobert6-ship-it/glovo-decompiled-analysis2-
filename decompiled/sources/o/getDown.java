package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class getDown {
    public static final ThreadLocal read = new ThreadLocal();

    public static ColorStateList serializer(Resources resources, int i, Resources.Theme theme) {
        try {
            return serializer(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            SentryLogcatAdapter.read("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static ColorStateList serializer(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return serializer(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r35v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList serializer(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        ?? ObtainStyledAttributes;
        int color;
        float f;
        float f2;
        boolean z;
        int iIconCompatParcelizer;
        int i;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            ?? r4 = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            Object[] objArr = new int[20][];
            int[] iArr = new int[20];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    break;
                }
                if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                    int[] iArr2 = onFocusEvent.ColorStateListItem;
                    if (theme == null) {
                        ObtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr2);
                    } else {
                        ObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr2, i2, i2);
                    }
                    int resourceId = ObtainStyledAttributes.getResourceId(i2, -1);
                    if (resourceId != -1) {
                        ThreadLocal threadLocal = read;
                        TypedValue typedValue2 = (TypedValue) threadLocal.get();
                        if (typedValue2 == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        } else {
                            typedValue = typedValue2;
                        }
                        resources.getValue(resourceId, typedValue, r4);
                        int i4 = typedValue.type;
                        if (i4 < 28 || i4 > 31) {
                            try {
                                color = serializer((Resources) resources, resources.getXml(resourceId), theme).getDefaultColor();
                            } catch (Exception unused) {
                                color = ObtainStyledAttributes.getColor(i2, -65281);
                            }
                        } else {
                            color = ObtainStyledAttributes.getColor(i2, -65281);
                        }
                    } else {
                        color = ObtainStyledAttributes.getColor(i2, -65281);
                    }
                    if (ObtainStyledAttributes.hasValue(r4)) {
                        f = ObtainStyledAttributes.getFloat(r4, 1.0f);
                    } else {
                        f = ObtainStyledAttributes.hasValue(3) ? ObtainStyledAttributes.getFloat(3, 1.0f) : 1.0f;
                    }
                    if (Build.VERSION.SDK_INT >= 31 && ObtainStyledAttributes.hasValue(2)) {
                        f2 = ObtainStyledAttributes.getFloat(2, -1.0f);
                    } else {
                        f2 = ObtainStyledAttributes.getFloat(4, -1.0f);
                    }
                    ObtainStyledAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i5 = i2;
                    for (int i6 = i5; i6 < attributeCount; i6++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i6);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != com.logistics.rider.glovo.R.attr.alpha && attributeNameResource != com.logistics.rider.glovo.R.attr.lStar) {
                            if (!attributeSet.getAttributeBooleanValue(i6, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i5] = attributeNameResource;
                            i5++;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i5);
                    float f3 = 0.0f;
                    boolean z2 = f2 >= 0.0f && f2 <= 100.0f;
                    if (f != 1.0f || z2) {
                        int iRemoteActionCompatParcelizer = getActiveFocusTargetNode.RemoteActionCompatParcelizer((int) ((android.graphics.Color.alpha(color) * f) + 0.5f), 0, 255);
                        if (z2) {
                            FocusManagerDefaultImpls focusManagerDefaultImplsWrite = FocusManagerDefaultImpls.write(color);
                            float f4 = focusManagerDefaultImplsWrite.write;
                            float f5 = focusManagerDefaultImplsWrite.serializer;
                            setStart setstart = setStart.RemoteActionCompatParcelizer;
                            if (f5 >= 1.0d && Math.round(f2) > 0.0d && Math.round(f2) < 100.0d) {
                                float fMin = f4 < 0.0f ? 0.0f : Math.min(360.0f, f4);
                                float f6 = 0.0f;
                                float f7 = f5;
                                FocusManagerDefaultImpls focusManagerDefaultImpls = null;
                                boolean z3 = true;
                                while (true) {
                                    if (Math.abs(f6 - f5) < 0.4f) {
                                        depth2 = depth2;
                                        i3 = i3;
                                        setStart setstart2 = setstart;
                                        z = true;
                                        if (focusManagerDefaultImpls == null) {
                                            iIconCompatParcelizer = clearFocus.IconCompatParcelizer(f2);
                                            break;
                                        }
                                        iIconCompatParcelizer = focusManagerDefaultImpls.IconCompatParcelizer(setstart2);
                                        break;
                                    }
                                    float f8 = 1000.0f;
                                    float f9 = f3;
                                    float f10 = 1000.0f;
                                    float f11 = 100.0f;
                                    FocusManagerDefaultImpls focusManagerDefaultImpls2 = null;
                                    while (true) {
                                        if (Math.abs(f9 - f11) <= 0.01f) {
                                            depth2 = depth2;
                                            f3 = f3;
                                            i3 = i3;
                                            z = true;
                                            break;
                                        }
                                        float f12 = ((f11 - f9) / 2.0f) + f9;
                                        int iIconCompatParcelizer2 = FocusManagerDefaultImpls.read(f12, f7, fMin).IconCompatParcelizer(setStart.RemoteActionCompatParcelizer);
                                        float fIconCompatParcelizer = clearFocus.IconCompatParcelizer(android.graphics.Color.red(iIconCompatParcelizer2));
                                        float fIconCompatParcelizer2 = clearFocus.IconCompatParcelizer(android.graphics.Color.green(iIconCompatParcelizer2));
                                        float fIconCompatParcelizer3 = clearFocus.IconCompatParcelizer(android.graphics.Color.blue(iIconCompatParcelizer2));
                                        z = true;
                                        float[] fArr = clearFocus.RemoteActionCompatParcelizer[1];
                                        float f13 = ((fIconCompatParcelizer3 * fArr[2]) + ((fIconCompatParcelizer2 * fArr[1]) + (fIconCompatParcelizer * fArr[0]))) / 100.0f;
                                        float fCbrt = f13 <= 0.008856452f ? f13 * 903.2963f : (((float) Math.cbrt(f13)) * 116.0f) - 16.0f;
                                        float fAbs = Math.abs(f2 - fCbrt);
                                        if (fAbs < 0.2f) {
                                            FocusManagerDefaultImpls focusManagerDefaultImplsWrite2 = FocusManagerDefaultImpls.write(iIconCompatParcelizer2);
                                            FocusManagerDefaultImpls focusManagerDefaultImpls3 = FocusManagerDefaultImpls.read(focusManagerDefaultImplsWrite2.IconCompatParcelizer, focusManagerDefaultImplsWrite2.serializer, fMin);
                                            depth2 = depth2;
                                            float f14 = focusManagerDefaultImplsWrite2.MediaBrowserCompatMediaItem - focusManagerDefaultImpls3.MediaBrowserCompatMediaItem;
                                            float f15 = focusManagerDefaultImplsWrite2.RemoteActionCompatParcelizer - focusManagerDefaultImpls3.RemoteActionCompatParcelizer;
                                            float f16 = focusManagerDefaultImplsWrite2.read - focusManagerDefaultImpls3.read;
                                            float fPow = (float) (Math.pow(Math.sqrt((f16 * f16) + (f15 * f15) + (f14 * f14)), 0.63d) * 1.41d);
                                            if (fPow <= 1.0f) {
                                                focusManagerDefaultImpls2 = focusManagerDefaultImplsWrite2;
                                                f8 = fPow;
                                                f10 = fAbs;
                                            }
                                        } else {
                                            depth2 = depth2;
                                        }
                                        f3 = 0.0f;
                                        if (f10 == 0.0f && f8 == 0.0f) {
                                            break;
                                        }
                                        if (fCbrt < f2) {
                                            f9 = f12;
                                        } else {
                                            f11 = f12;
                                        }
                                        f3 = 0.0f;
                                        i3 = i3;
                                        depth2 = depth2;
                                    }
                                    FocusManagerDefaultImpls focusManagerDefaultImpls4 = focusManagerDefaultImpls2;
                                    if (!z3) {
                                        setStart setstart3 = setstart;
                                        if (focusManagerDefaultImpls4 == null) {
                                            f5 = f7;
                                        } else {
                                            focusManagerDefaultImpls = focusManagerDefaultImpls4;
                                            f6 = f7;
                                        }
                                        f7 = ((f5 - f6) / 2.0f) + f6;
                                        setstart = setstart3;
                                    } else {
                                        if (focusManagerDefaultImpls4 != null) {
                                            iIconCompatParcelizer = focusManagerDefaultImpls4.IconCompatParcelizer(setstart);
                                            break;
                                        }
                                        f7 = ((f5 - f6) / 2.0f) + f6;
                                        z3 = false;
                                    }
                                }
                            } else {
                                depth2 = depth2;
                                i3 = i3;
                                z = true;
                                iIconCompatParcelizer = clearFocus.IconCompatParcelizer(f2);
                            }
                            color = iIconCompatParcelizer;
                        } else {
                            depth2 = depth2;
                            i3 = i3;
                            z = true;
                        }
                        color = (16777215 & color) | (iRemoteActionCompatParcelizer << 24);
                    } else {
                        depth2 = depth2;
                        i3 = i3;
                        z = true;
                    }
                    int i7 = i3 + 1;
                    if (i7 > iArr.length) {
                        i = i3;
                        int[] iArr4 = new int[i <= 4 ? 8 : i * 2];
                        System.arraycopy(iArr, 0, iArr4, 0, i);
                        iArr = iArr4;
                    } else {
                        i = i3;
                    }
                    iArr[i] = color;
                    if (i7 > objArr.length) {
                        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i > 4 ? i * 2 : 8);
                        System.arraycopy(objArr, 0, objArr2, 0, i);
                        objArr = objArr2;
                    }
                    objArr[i] = iArrTrimStateSet;
                    objArr = (int[][]) objArr;
                    i3 = i7;
                    r4 = z;
                    depth2 = depth2;
                    i2 = 0;
                } else {
                    i3 = i3;
                    r4 = r4 == true ? 1 : 0;
                    depth2 = depth2;
                    i2 = 0;
                }
            }
            int i8 = i3;
            int[] iArr5 = new int[i8];
            int[][] iArr6 = new int[i8][];
            System.arraycopy(iArr, 0, iArr5, 0, i8);
            System.arraycopy(objArr, 0, iArr6, 0, i8);
            return new ColorStateList(iArr6, iArr5);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
