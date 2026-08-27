package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlinx.datetime.InstantJvmKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class getNativePathEffect {
    public static final ThreadLocal IconCompatParcelizer = new ThreadLocal();
    public final Context read;
    public final AndroidPathIterator serializer;

    public static addArcRad IconCompatParcelizer(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        asAndroidPathEffect asandroidpatheffectWrite;
        int iValueOf;
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = new setSupportCompoundDrawablesTintList(0);
        setsupportcompounddrawablestintlist.serializer = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = IconCompatParcelizer;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        Object objIconCompatParcelizer = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith("java")) {
                try {
                    asandroidpatheffectWrite = InstantJvmKt.serializer("j$".concat(string.substring(4)), resourcePackageName);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                    asandroidpatheffectWrite = InstantJvmKt.serializer(string, resourcePackageName);
                }
            } else {
                asandroidpatheffectWrite = InstantJvmKt.serializer(string, resourcePackageName);
            }
        } else {
            asandroidpatheffectWrite = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            int i2 = typedValue.resourceId;
            AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings = asAndroidPathEffect.PlaybackStateCompat;
            if (asandroidpatheffectWrite == androidPaint_androidKtWhenMappings) {
                if (i2 != 0) {
                    iValueOf = Integer.valueOf(i2);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        StringBuilder sb = new StringBuilder("unsupported value '");
                        sb.append((Object) typedValue.string);
                        String strSerializer = asandroidpatheffectWrite.serializer();
                        sb.append("' for ");
                        sb.append(strSerializer);
                        sb.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(sb.toString());
                    }
                    iValueOf = 0;
                }
                objIconCompatParcelizer = iValueOf;
            } else if (i2 == 0) {
                AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings2 = asAndroidPathEffect.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                if (asandroidpatheffectWrite == androidPaint_androidKtWhenMappings2) {
                    objIconCompatParcelizer = typedArray.getString(1);
                } else {
                    int i3 = typedValue.type;
                    AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings3 = asAndroidPathEffect.RemoteActionCompatParcelizer;
                    AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings4 = asAndroidPathEffect.MediaSessionCompatQueueItem;
                    AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings5 = asAndroidPathEffect.RatingCompat;
                    if (i3 == 3) {
                        String string2 = typedValue.string.toString();
                        if (asandroidpatheffectWrite == null) {
                            string2.getClass();
                            try {
                                try {
                                    try {
                                        try {
                                            androidPaint_androidKtWhenMappings4.IconCompatParcelizer(string2);
                                            asandroidpatheffectWrite = androidPaint_androidKtWhenMappings4;
                                        } catch (IllegalArgumentException unused) {
                                            androidPaint_androidKtWhenMappings3.IconCompatParcelizer(string2);
                                            asandroidpatheffectWrite = androidPaint_androidKtWhenMappings3;
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        androidPaint_androidKtWhenMappings5.IconCompatParcelizer(string2);
                                        asandroidpatheffectWrite = androidPaint_androidKtWhenMappings5;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings6 = asAndroidPathEffect.MediaSessionCompatResultReceiverWrapper;
                                    androidPaint_androidKtWhenMappings6.IconCompatParcelizer(string2);
                                    asandroidpatheffectWrite = androidPaint_androidKtWhenMappings6;
                                }
                            } catch (IllegalArgumentException unused4) {
                                asandroidpatheffectWrite = androidPaint_androidKtWhenMappings2;
                            }
                        }
                        objIconCompatParcelizer = asandroidpatheffectWrite.IconCompatParcelizer(string2);
                    } else if (i3 == 4) {
                        asandroidpatheffectWrite = onCreateWindowlambda2.write(typedValue, asandroidpatheffectWrite, androidPaint_androidKtWhenMappings5, string, "float");
                        objIconCompatParcelizer = Float.valueOf(typedValue.getFloat());
                    } else if (i3 == 5) {
                        asandroidpatheffectWrite = onCreateWindowlambda2.write(typedValue, asandroidpatheffectWrite, androidPaint_androidKtWhenMappings4, string, "dimension");
                        objIconCompatParcelizer = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i3 == 18) {
                        asandroidpatheffectWrite = onCreateWindowlambda2.write(typedValue, asandroidpatheffectWrite, androidPaint_androidKtWhenMappings3, string, "boolean");
                        objIconCompatParcelizer = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i3 < 16 || i3 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (asandroidpatheffectWrite == androidPaint_androidKtWhenMappings5) {
                            asandroidpatheffectWrite = onCreateWindowlambda2.write(typedValue, asandroidpatheffectWrite, androidPaint_androidKtWhenMappings5, string, "float");
                            objIconCompatParcelizer = Float.valueOf(typedValue.data);
                        } else {
                            asandroidpatheffectWrite = onCreateWindowlambda2.write(typedValue, asandroidpatheffectWrite, androidPaint_androidKtWhenMappings4, string, "integer");
                            objIconCompatParcelizer = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            } else {
                if (asandroidpatheffectWrite != null) {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue.string);
                    String strSerializer2 = asandroidpatheffectWrite.serializer();
                    sb2.append("' for ");
                    sb2.append(strSerializer2);
                    sb2.append(". You must use a \"reference\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
                objIconCompatParcelizer = Integer.valueOf(i2);
                asandroidpatheffectWrite = androidPaint_androidKtWhenMappings;
            }
        }
        if (objIconCompatParcelizer != null) {
            setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer(objIconCompatParcelizer);
        }
        if (asandroidpatheffectWrite != null) {
            setsupportcompounddrawablestintlist.write = asandroidpatheffectWrite;
        }
        return setsupportcompounddrawablestintlist.read();
    }

    public getNativePathEffect(Context context, AndroidPathIterator androidPathIterator) {
        context.getClass();
        androidPathIterator.getClass();
        this.read = context;
        this.serializer = androidPathIterator;
    }

    public final opN5in7k0 IconCompatParcelizer(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        String strWrite;
        String strWrite2;
        Context context;
        int i2;
        Object obj;
        int i3 = i;
        String name = xmlResourceParser.getName();
        name.getClass();
        opN5in7k0 opn5in7k0Write = this.serializer.RemoteActionCompatParcelizer(name).write();
        Context context2 = this.read;
        opn5in7k0Write.RemoteActionCompatParcelizer(context2, attributeSet);
        int i4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean zEquals = "argument".equals(name2);
                int[] iArr = getPath.NavArgument;
                if (zEquals) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    typedArrayObtainAttributes.getClass();
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string != null) {
                        addArcRad addarcradIconCompatParcelizer = IconCompatParcelizer(typedArrayObtainAttributes, resources, i3);
                        r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = opn5in7k0Write.serializer;
                        r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.getClass();
                        ((LinkedHashMap) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.IconCompatParcelizer).put(string, addarcradIconCompatParcelizer);
                        typedArrayObtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else if ("deepLink".equals(name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, getPath.NavDeepLink);
                    typedArrayObtainAttributes2.getClass();
                    String string2 = typedArrayObtainAttributes2.getString(3);
                    String string3 = typedArrayObtainAttributes2.getString(i4);
                    String string4 = typedArrayObtainAttributes2.getString(2);
                    if ((string2 != null && string2.length() != 0) || ((string3 != null && string3.length() != 0) || (string4 != null && string4.length() != 0))) {
                        String strWrite3 = null;
                        if (string2 != null) {
                            String packageName = context2.getPackageName();
                            packageName.getClass();
                            strWrite = setCarryoverInAppMessage.write(string2, "${applicationId}", packageName);
                        } else {
                            strWrite = null;
                        }
                        if (string3 == null || string3.length() == 0) {
                            strWrite2 = null;
                        } else {
                            String packageName2 = context2.getPackageName();
                            packageName2.getClass();
                            strWrite2 = setCarryoverInAppMessage.write(string3, "${applicationId}", packageName2);
                            if (strWrite2.length() <= 0) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The NavDeepLink cannot have an empty action.");
                                return null;
                            }
                        }
                        if (string4 != null) {
                            String packageName3 = context2.getPackageName();
                            packageName3.getClass();
                            strWrite3 = setCarryoverInAppMessage.write(string4, "${applicationId}", packageName3);
                        }
                        opn5in7k0Write.write(new getFillTypeRgk1Os(strWrite, strWrite2, strWrite3));
                        typedArrayObtainAttributes2.recycle();
                    } else {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                } else {
                    if ("action".equals(name2)) {
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, getPath.NavAction, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        addOval addoval = new addOval(typedArrayObtainStyledAttributes.getResourceId(i4, 0));
                        addoval.write = new transform58bKbWc(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(10, false), typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false), typedArrayObtainStyledAttributes.getResourceId(2, -1), typedArrayObtainStyledAttributes.getResourceId(3, -1), typedArrayObtainStyledAttributes.getResourceId(5, -1), typedArrayObtainStyledAttributes.getResourceId(6, -1));
                        Bundle bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                        int i5 = 1;
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        context = context2;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i5) {
                                i2 = depth2;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            i2 = depth2;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3 && "argument".equals(xmlResourceParser.getName())) {
                                TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                typedArrayObtainAttributes3.getClass();
                                String string5 = typedArrayObtainAttributes3.getString(0);
                                if (string5 != null) {
                                    addArcRad addarcradIconCompatParcelizer2 = IconCompatParcelizer(typedArrayObtainAttributes3, resources, i3);
                                    boolean z = addarcradIconCompatParcelizer2.serializer;
                                    if (z && z && (obj = addarcradIconCompatParcelizer2.read) != null) {
                                        addarcradIconCompatParcelizer2.write.read(string5, bundle, obj);
                                    }
                                    typedArrayObtainAttributes3.recycle();
                                } else {
                                    throw new XmlPullParserException("Arguments must have a name");
                                }
                            }
                            i3 = i;
                            depth2 = i2;
                            i5 = 1;
                        }
                        if (!bundle.isEmpty()) {
                            addoval.RemoteActionCompatParcelizer = bundle;
                        }
                        opn5in7k0Write.RemoteActionCompatParcelizer(resourceId, addoval);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        context = context2;
                        i2 = depth2;
                        if ("include".equals(name2) && (opn5in7k0Write instanceof relativeQuadraticTo)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, next.NavInclude);
                            typedArrayObtainAttributes4.getClass();
                            ((relativeQuadraticTo) opn5in7k0Write).IconCompatParcelizer.serializer(write(typedArrayObtainAttributes4.getResourceId(0, 0)));
                            typedArrayObtainAttributes4.recycle();
                        } else if (opn5in7k0Write instanceof relativeQuadraticTo) {
                            ((relativeQuadraticTo) opn5in7k0Write).IconCompatParcelizer.serializer(IconCompatParcelizer(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i3 = i;
                    context2 = context;
                    depth2 = i2;
                    i4 = 1;
                }
            }
        }
        return opn5in7k0Write;
    }

    public final relativeQuadraticTo write(int i) {
        int next;
        Resources resources = this.read.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            attributeSetAsAttributeSet.getClass();
            opN5in7k0 opn5in7k0IconCompatParcelizer = IconCompatParcelizer(resources, xml, attributeSetAsAttributeSet, i);
            if (opn5in7k0IconCompatParcelizer instanceof relativeQuadraticTo) {
                relativeQuadraticTo relativequadraticto = (relativeQuadraticTo) opn5in7k0IconCompatParcelizer;
                xml.close();
                return relativequadraticto;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
