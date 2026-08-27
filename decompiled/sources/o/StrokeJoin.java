package o;

import android.webkit.MimeTypeMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class StrokeJoin {
    public static final String serializer(String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
    }

    public static final StackTraceElement serializer(BaseContinuationImpl baseContinuationImpl) {
        int iIntValue;
        String strRemoteActionCompatParcelizer;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        TextAnnouncementContentCardViewViewHolder textAnnouncementContentCardViewViewHolder = (TextAnnouncementContentCardViewViewHolder) baseContinuationImpl.getClass().getAnnotation(TextAnnouncementContentCardViewViewHolder.class);
        String str = null;
        if (textAnnouncementContentCardViewViewHolder == null || textAnnouncementContentCardViewViewHolder.read() < 1) {
            return null;
        }
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? textAnnouncementContentCardViewViewHolder.write()[iIntValue] : -1;
        getPushDeepLinkBackStackActivityClassName getpushdeeplinkbackstackactivityclassname = BrazeInAppMessageManager.write;
        getPushDeepLinkBackStackActivityClassName getpushdeeplinkbackstackactivityclassname2 = BrazeInAppMessageManager.serializer;
        if (getpushdeeplinkbackstackactivityclassname == null) {
            try {
                getPushDeepLinkBackStackActivityClassName getpushdeeplinkbackstackactivityclassname3 = new getPushDeepLinkBackStackActivityClassName(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                BrazeInAppMessageManager.write = getpushdeeplinkbackstackactivityclassname3;
                getpushdeeplinkbackstackactivityclassname = getpushdeeplinkbackstackactivityclassname3;
            } catch (Exception unused2) {
                BrazeInAppMessageManager.write = getpushdeeplinkbackstackactivityclassname2;
                getpushdeeplinkbackstackactivityclassname = getpushdeeplinkbackstackactivityclassname2;
            }
        }
        if (getpushdeeplinkbackstackactivityclassname != getpushdeeplinkbackstackactivityclassname2 && (method = getpushdeeplinkbackstackactivityclassname.read) != null && (objInvoke = method.invoke(baseContinuationImpl.getClass(), null)) != null && (method2 = getpushdeeplinkbackstackactivityclassname.write) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = getpushdeeplinkbackstackactivityclassname.IconCompatParcelizer;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strRemoteActionCompatParcelizer = textAnnouncementContentCardViewViewHolder.RemoteActionCompatParcelizer();
        } else {
            strRemoteActionCompatParcelizer = str + '/' + textAnnouncementContentCardViewViewHolder.RemoteActionCompatParcelizer();
        }
        return new StackTraceElement(strRemoteActionCompatParcelizer, textAnnouncementContentCardViewViewHolder.IconCompatParcelizer(), textAnnouncementContentCardViewViewHolder.serializer(), i);
    }
}
