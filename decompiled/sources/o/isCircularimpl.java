package o;

import com.huawei.hms.framework.common.BundleUtil;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class isCircularimpl {
    public static final String IconCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append(BundleUtil.UNDERLINE_TAG);
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static String write(isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        RemoteActionCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, sb, 0);
        return sb.toString();
    }

    public static final void write(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                write(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                write(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8 = moveFocusInChildren3ESFkO8.IconCompatParcelizer;
            sb.append(PointerInteropFilterpointerInputFilter1onCancel1.RemoteActionCompatParcelizer(new moveFocusInChildren3ESFkO8(((String) obj).getBytes(topLeft.serializer))));
            sb.append('\"');
            return;
        }
        if (obj instanceof moveFocusInChildren3ESFkO8) {
            sb.append(": \"");
            sb.append(PointerInteropFilterpointerInputFilter1onCancel1.RemoteActionCompatParcelizer((moveFocusInChildren3ESFkO8) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof isBetterCandidate_I7lrPNgminorAxisDistance) {
            sb.append(" {");
            RemoteActionCompatParcelizer((isBetterCandidate_I7lrPNgminorAxisDistance) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        write(sb, i4, "key", entry.getKey());
        write(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    public static void RemoteActionCompatParcelizer(isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : isbettercandidate_i7lrpngminoraxisdistance.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    write(sb, i, IconCompatParcelizer(str2), isBetterCandidate_I7lrPNgminorAxisDistance.write(method2, isbettercandidate_i7lrpngminoraxisdistance, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    write(sb, i, IconCompatParcelizer(str3), isBetterCandidate_I7lrPNgminorAxisDistance.write(method3, isbettercandidate_i7lrpngminoraxisdistance, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strReplaceFirst))) != null && (!strReplaceFirst.endsWith("Bytes") || !map.containsKey("get".concat(strReplaceFirst.substring(0, strReplaceFirst.length() - 5))))) {
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get".concat(strReplaceFirst));
                Method method5 = (Method) map.get("has".concat(strReplaceFirst));
                if (method4 != null) {
                    Object objWrite = isBetterCandidate_I7lrPNgminorAxisDistance.write(method4, isbettercandidate_i7lrpngminoraxisdistance, new Object[0]);
                    if (method5 == null) {
                        if (objWrite instanceof Boolean) {
                            zEquals = !((Boolean) objWrite).booleanValue();
                        } else if (objWrite instanceof Integer) {
                            if (((Integer) objWrite).intValue() != 0) {
                                write(sb, i, IconCompatParcelizer(str4), objWrite);
                            }
                        } else if (objWrite instanceof Float) {
                            if (((Float) objWrite).floatValue() != 0.0f) {
                                write(sb, i, IconCompatParcelizer(str4), objWrite);
                            }
                        } else if (objWrite instanceof Double) {
                            if (((Double) objWrite).doubleValue() != 0.0d) {
                                write(sb, i, IconCompatParcelizer(str4), objWrite);
                            }
                        } else if (objWrite instanceof String) {
                            zEquals = objWrite.equals("");
                        } else if (objWrite instanceof moveFocusInChildren3ESFkO8) {
                            zEquals = objWrite.equals(moveFocusInChildren3ESFkO8.IconCompatParcelizer);
                        } else if (objWrite instanceof PlatformFocusOwner) {
                            if (objWrite != ((isBetterCandidate_I7lrPNgminorAxisDistance) ((isBetterCandidate_I7lrPNgminorAxisDistance) ((PlatformFocusOwner) objWrite)).IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.GET_DEFAULT_INSTANCE))) {
                                write(sb, i, IconCompatParcelizer(str4), objWrite);
                            }
                        } else if (!(objWrite instanceof Enum) || ((Enum) objWrite).ordinal() != 0) {
                            write(sb, i, IconCompatParcelizer(str4), objWrite);
                        }
                        if (!zEquals) {
                            write(sb, i, IconCompatParcelizer(str4), objWrite);
                        }
                    } else if (((Boolean) isBetterCandidate_I7lrPNgminorAxisDistance.write(method5, isbettercandidate_i7lrpngminoraxisdistance, new Object[0])).booleanValue()) {
                        write(sb, i, IconCompatParcelizer(str4), objWrite);
                    }
                }
            }
        }
        getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotations = isbettercandidate_i7lrpngminoraxisdistance.serializer;
        if (getunspecifiedpackedfloatsannotations != null) {
            for (int i2 = 0; i2 < getunspecifiedpackedfloatsannotations.serializer; i2++) {
                write(sb, i, String.valueOf(getunspecifiedpackedfloatsannotations.RatingCompat[i2] >>> 3), getunspecifiedpackedfloatsannotations.read[i2]);
            }
        }
    }
}
