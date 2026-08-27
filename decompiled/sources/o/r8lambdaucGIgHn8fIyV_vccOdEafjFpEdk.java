package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk implements getUnregisteredInAppMessageannotations, r8lambdapgshWUFJiL1iPT8NmOl0aIo92oY {
    public static final Map serializer;
    public final Class IconCompatParcelizer;

    @Override // o.r8lambdapgshWUFJiL1iPT8NmOl0aIo92oY
    public final Class read() {
        return this.IconCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        String strIconCompatParcelizer;
        Class cls = this.IconCompatParcelizer;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strIconCompatParcelizer2 = getButtonThumbLeftEK5gGoQ.IconCompatParcelizer(cls.getName());
                return strIconCompatParcelizer2 == null ? cls.getSimpleName() : strIconCompatParcelizer2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strIconCompatParcelizer = getButtonThumbLeftEK5gGoQ.IconCompatParcelizer(componentType.getName())) != null) {
                strConcat = strIconCompatParcelizer.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer('$', simpleName, simpleName);
        }
        return hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final String RemoteActionCompatParcelizer() {
        String str;
        Class cls = this.IconCompatParcelizer;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String str2 = getButtonThumbLeftEK5gGoQ.read(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = getButtonThumbLeftEK5gGoQ.read(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final boolean read(Object obj) {
        Class clsIconCompatParcelizer = this.IconCompatParcelizer;
        clsIconCompatParcelizer.getClass();
        Map map = serializer;
        map.getClass();
        Integer num = (Integer) map.get(clsIconCompatParcelizer);
        if (num != null) {
            return pauseWebviewIfNecessarylambda10.write(num.intValue(), obj);
        }
        if (clsIconCompatParcelizer.isPrimitive()) {
            clsIconCompatParcelizer = Options.Companion.IconCompatParcelizer((getUnregisteredInAppMessageannotations) displayInAppMessagelambda1.serializer(clsIconCompatParcelizer));
        }
        return clsIconCompatParcelizer.isInstance(obj);
    }

    public final String toString() {
        return this.IconCompatParcelizer.toString() + " (Kotlin reflection is not available)";
    }

    public final Object write() {
        throw new r8lambdaRW1_n_nU4xArBI_btXJxixXwtrI();
    }

    public r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk(Class cls) {
        cls.getClass();
        this.IconCompatParcelizer = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) && Options.Companion.IconCompatParcelizer((getUnregisteredInAppMessageannotations) this).equals(Options.Companion.IconCompatParcelizer((getUnregisteredInAppMessageannotations) obj));
    }

    public final int hashCode() {
        return Options.Companion.IconCompatParcelizer((getUnregisteredInAppMessageannotations) this).hashCode();
    }

    static {
        List list = androidx.sqlite.SQLite.read(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0.class, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM.class, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0.class, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY.class, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds.class, r8lambdagdus9EWsajL31FKA79xR2Pb0c4E.class, r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM.class, r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE.class, r8lambdam6kPPA3z8dHTentc0gq2uQ_Iyco.class, r8lambdaqPv61rwIX7fwpHZY40hphRHQpZ8.class, r8lambdaVqRQRvr3UKPhHK_x9arK0s264.class, r8lambdaSQFu6AOFqpylmZRPZ50Z2TfR8UU.class, r8lambdaS80EyuXSYxGtuNOHoqBphNSWAwY.class, r8lambdaScekM2iB8lXAlFjjGbW7nu5ca8.class, r8lambdaWdJYQE7cd1YBN9rgKqoaFXB53ZM.class, r8lambdaW56WpyG3s7kCZVcDp3X2mz4mIY.class, r8lambdaZx3OXZoJJt1_BxZ4i_bdHj3NXM.class, r8lambdaWQlfmPfdJgpWJx7DDyi7sXvAlE.class, r8lambdaXQ9HBHyk0gHyCZjWaVGo09mEILs.class, r8lambdad2q08SPBZCTm0GxNUbGIRJJROyA.class, r8lambdadYjcH1_xGPFG3XH7gbXy_OXfQ.class, r8lambdafVx7XI7bO6Xm15vIIzhK9Uk9E.class, r8lambdadmuBfSWSWxHes1jVl2l4zZxps.class);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        int i = 0;
        for (Object obj : list) {
            if (i >= 0) {
                arrayList.add(new onViewAttachedToWindowlambda0((Class) obj, Integer.valueOf(i)));
                i++;
            } else {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
        }
        serializer = onMove.serializer(arrayList);
    }
}
