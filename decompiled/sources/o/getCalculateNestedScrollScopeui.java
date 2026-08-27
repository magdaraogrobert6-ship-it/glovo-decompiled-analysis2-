package o;

import com.huawei.hms.framework.common.BundleUtil;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getCalculateNestedScrollScopeui {
    public static final char[] read;

    static {
        char[] cArr = new char[80];
        read = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void IconCompatParcelizer(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                IconCompatParcelizer(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                IconCompatParcelizer(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        IconCompatParcelizer(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append(BundleUtil.UNDERLINE_TAG);
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            onPreviewKeyEvent onpreviewkeyevent = onPreviewKeyEvent.IconCompatParcelizer;
            sb.append(accessgetNestedCoroutineScope.RemoteActionCompatParcelizer(new onPreviewKeyEvent(((String) obj).getBytes(accessonPreScrollOzD1aCkjd.write))));
            sb.append('\"');
            return;
        }
        if (obj instanceof onPreviewKeyEvent) {
            sb.append(": \"");
            sb.append(accessgetNestedCoroutineScope.RemoteActionCompatParcelizer((onPreviewKeyEvent) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof SoftwareKeyboardInterceptionModifierKt) {
            sb.append(" {");
            IconCompatParcelizer((SoftwareKeyboardInterceptionModifierKt) obj, sb, i + 2);
            sb.append("\n");
            IconCompatParcelizer(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        IconCompatParcelizer(sb, i3, "key", entry.getKey());
        IconCompatParcelizer(sb, i3, "value", entry.getValue());
        sb.append("\n");
        IconCompatParcelizer(i, sb);
        sb.append("}");
    }

    public static void IconCompatParcelizer(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(read, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fc  */
    public static void IconCompatParcelizer(SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = softwareKeyboardInterceptionModifierKt.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                IconCompatParcelizer(sb, i, strSubstring.substring(0, strSubstring.length() - 4), SoftwareKeyboardInterceptionModifierKt.write(method2, softwareKeyboardInterceptionModifierKt, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                IconCompatParcelizer(sb, i, strSubstring.substring(0, strSubstring.length() - 3), SoftwareKeyboardInterceptionModifierKt.write(method, softwareKeyboardInterceptionModifierKt, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objWrite = SoftwareKeyboardInterceptionModifierKt.write(method4, softwareKeyboardInterceptionModifierKt, new Object[0]);
                    if (method5 == null) {
                        if (objWrite instanceof Boolean) {
                            if (((Boolean) objWrite).booleanValue()) {
                                IconCompatParcelizer(sb, i, strSubstring, objWrite);
                            }
                        } else if (objWrite instanceof Integer) {
                            if (((Integer) objWrite).intValue() != 0) {
                                IconCompatParcelizer(sb, i, strSubstring, objWrite);
                            }
                        } else if (objWrite instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objWrite).floatValue()) != 0) {
                                IconCompatParcelizer(sb, i, strSubstring, objWrite);
                            }
                        } else if (!(objWrite instanceof Double)) {
                            if (objWrite instanceof String) {
                                zEquals = objWrite.equals("");
                            } else if (objWrite instanceof onPreviewKeyEvent) {
                                zEquals = objWrite.equals(onPreviewKeyEvent.IconCompatParcelizer);
                            } else if (objWrite instanceof getOnPreKeyEvent) {
                                if (objWrite != ((SoftwareKeyboardInterceptionModifierKt) ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) objWrite)).RemoteActionCompatParcelizer(6))) {
                                    IconCompatParcelizer(sb, i, strSubstring, objWrite);
                                }
                            } else if (!(objWrite instanceof Enum) || ((Enum) objWrite).ordinal() != 0) {
                                IconCompatParcelizer(sb, i, strSubstring, objWrite);
                            }
                            if (!zEquals) {
                                IconCompatParcelizer(sb, i, strSubstring, objWrite);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objWrite).doubleValue()) != 0) {
                            IconCompatParcelizer(sb, i, strSubstring, objWrite);
                        }
                    } else if (((Boolean) SoftwareKeyboardInterceptionModifierKt.write(method5, softwareKeyboardInterceptionModifierKt, new Object[0])).booleanValue()) {
                        IconCompatParcelizer(sb, i, strSubstring, objWrite);
                    }
                }
            }
            i2 = 3;
        }
        NestedScrollNode nestedScrollNode = softwareKeyboardInterceptionModifierKt.read;
        if (nestedScrollNode != null) {
            for (int i4 = 0; i4 < nestedScrollNode.read; i4++) {
                IconCompatParcelizer(sb, i, String.valueOf(nestedScrollNode.IconCompatParcelizer[i4] >>> 3), nestedScrollNode.serializer[i4]);
            }
        }
    }
}
