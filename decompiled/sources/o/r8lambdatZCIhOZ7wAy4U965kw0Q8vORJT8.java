package o;

import android.content.Context;
import android.provider.Settings;
import bo.app.d$$ExternalSyntheticOutline0;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdatZCIhOZ7wAy4U965kw0Q8vORJT8 {
    public static final getVonKries write(StrokeJoinCompanion strokeJoinCompanion, int i, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.write(683659508);
        int i3 = (i2 & 64) != 0 ? 1 : i;
        accessgetRgbcp accessgetrgbcp = accessgetRgbcp.Immediately;
        if (i3 <= 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i3, "Iterations must be a positive number (", ")."));
            return null;
        }
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is 1.0.").toString());
        }
        getpostalcode.write(2024497114);
        getpostalcode.write(-610207850);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = new getVonKries();
            getpostalcode.write(objComponentActivity);
        }
        getVonKries getvonkries = (getVonKries) objComponentActivity;
        getpostalcode.IconCompatParcelizer(false);
        getpostalcode.IconCompatParcelizer(false);
        getpostalcode.write(-180606964);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(true);
            getpostalcode.write(objComponentActivity2);
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
        getpostalcode.IconCompatParcelizer(false);
        getpostalcode.write(-180606834);
        Context context = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        android.graphics.Matrix matrix = newD50Xyzui_graphics.write;
        float f = 1.0f / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        getpostalcode.IconCompatParcelizer(false);
        getPhoneNumberNational.write(new Object[]{strokeJoinCompanion, true, null, Float.valueOf(f), Integer.valueOf(i3)}, new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(true, true, getvonkries, strokeJoinCompanion, i3, false, f, accessgetrgbcp, populateViewStructure_androidKtpopulate7, null), getpostalcode);
        getpostalcode.IconCompatParcelizer(false);
        return getvonkries;
    }

    public static final Method RemoteActionCompatParcelizer(pauseWebviewIfNecessarylambda1 pausewebviewifnecessarylambda1, String str) {
        str.getClass();
        if (!(pausewebviewifnecessarylambda1 instanceof r8lambdapgshWUFJiL1iPT8NmOl0aIo92oY)) {
            return null;
        }
        String strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str, '(');
        if (strIconCompatParcelizer.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + pausewebviewifnecessarylambda1 + '/' + str);
        }
        Method[] declaredMethods = ((r8lambdapgshWUFJiL1iPT8NmOl0aIo92oY) pausewebviewifnecessarylambda1).read().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{method.getName(), strIconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    read(cls, sb);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                read(returnType, sb);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    public static final void read(Class cls, StringBuilder sb) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append("L");
        String strReplace = cls.getName().replace('.', '/');
        strReplace.getClass();
        sb.append((CharSequence) strReplace);
        sb.append(";");
    }
}
