package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.BundleUtil;
import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class accessgetTAGcp {
    public static final char[] write;

    static {
        char[] cArr = new char[80];
        write = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f3  */
    public static void IconCompatParcelizer(GeneratedMessageLite generatedMessageLite, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = generatedMessageLite.getClass().getDeclaredMethods();
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
                RemoteActionCompatParcelizer(sb, i, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(4, 0, strSubstring), GeneratedMessageLite.invokeOrDie(method2, generatedMessageLite, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                RemoteActionCompatParcelizer(sb, i, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(3, 0, strSubstring), GeneratedMessageLite.invokeOrDie(method, generatedMessageLite, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method4, generatedMessageLite, new Object[0]);
                    if (method5 == null) {
                        if (objInvokeOrDie instanceof Boolean) {
                            zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                        } else if (objInvokeOrDie instanceof Integer) {
                            if (((Integer) objInvokeOrDie).intValue() != 0) {
                                RemoteActionCompatParcelizer(sb, i, strSubstring, objInvokeOrDie);
                            }
                        } else if (objInvokeOrDie instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) != 0) {
                                RemoteActionCompatParcelizer(sb, i, strSubstring, objInvokeOrDie);
                            }
                        } else if (objInvokeOrDie instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) != 0) {
                                RemoteActionCompatParcelizer(sb, i, strSubstring, objInvokeOrDie);
                            }
                        } else if (objInvokeOrDie instanceof String) {
                            zEquals = objInvokeOrDie.equals("");
                        } else if (objInvokeOrDie instanceof ByteString) {
                            zEquals = objInvokeOrDie.equals(ByteString.RemoteActionCompatParcelizer);
                        } else if (objInvokeOrDie instanceof accessgetDiskCacheLockp) {
                            if (objInvokeOrDie != ((accessgetDiskCacheLockp) objInvokeOrDie).getDefaultInstanceForType()) {
                                RemoteActionCompatParcelizer(sb, i, strSubstring, objInvokeOrDie);
                            }
                        } else if (!(objInvokeOrDie instanceof Enum) || ((Enum) objInvokeOrDie).ordinal() != 0) {
                            RemoteActionCompatParcelizer(sb, i, strSubstring, objInvokeOrDie);
                        }
                        if (!zEquals) {
                            RemoteActionCompatParcelizer(sb, i, strSubstring, objInvokeOrDie);
                        }
                    } else if (((Boolean) GeneratedMessageLite.invokeOrDie(method5, generatedMessageLite, new Object[0])).booleanValue()) {
                        RemoteActionCompatParcelizer(sb, i, strSubstring, objInvokeOrDie);
                    }
                }
            }
            i2 = 3;
        }
        if (generatedMessageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator itRemoteActionCompatParcelizer = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.RemoteActionCompatParcelizer();
            while (itRemoteActionCompatParcelizer.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itRemoteActionCompatParcelizer.next();
                RemoteActionCompatParcelizer(sb, i, af$$ExternalSyntheticOutline0.m(((accessgetCardTypeMapcp) entry2.getKey()).RemoteActionCompatParcelizer, "]", new StringBuilder("[")), entry2.getValue());
            }
        }
        IValueCallback iValueCallback = generatedMessageLite.serializer;
        if (iValueCallback != null) {
            for (int i4 = 0; i4 < iValueCallback.IconCompatParcelizer; i4++) {
                RemoteActionCompatParcelizer(sb, i, String.valueOf(iValueCallback.serializer[i4] >>> 3), iValueCallback.read[i4]);
            }
        }
    }

    public static void RemoteActionCompatParcelizer(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                RemoteActionCompatParcelizer(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        write(i, sb);
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
            sb.append(ContentCardsUpdatedEvent.RemoteActionCompatParcelizer(ByteString.read((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(ContentCardsUpdatedEvent.RemoteActionCompatParcelizer((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            IconCompatParcelizer((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            write(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            RemoteActionCompatParcelizer(sb, i3, "key", entry.getKey());
            RemoteActionCompatParcelizer(sb, i3, "value", entry.getValue());
            sb.append("\n");
            write(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    public static void write(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(write, 0, i2);
            i -= i2;
        }
    }
}
