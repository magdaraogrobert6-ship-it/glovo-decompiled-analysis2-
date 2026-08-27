package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
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
public abstract class nextDrawNode {
    public static final char[] read;

    static {
        char[] cArr = new char[80];
        read = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String serializer(GeneratedMessageLite generatedMessageLite, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        read(generatedMessageLite, sb, 0);
        return sb.toString();
    }

    public static void read(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                read(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                read(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        RemoteActionCompatParcelizer(i, sb);
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
            setOnDetachui setondetachui = setOnAttachui.IconCompatParcelizer;
            sb.append(getMeasureBlock.RemoteActionCompatParcelizer(new setOnDetachui(((String) obj).getBytes(getMinimumTouchTargetSizeMYxV2XQ.write))));
            sb.append('\"');
            return;
        }
        if (obj instanceof setOnAttachui) {
            sb.append(": \"");
            sb.append(getMeasureBlock.RemoteActionCompatParcelizer((setOnAttachui) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            read((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            RemoteActionCompatParcelizer(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        read(sb, i3, "key", entry.getKey());
        read(sb, i3, "value", entry.getValue());
        sb.append("\n");
        RemoteActionCompatParcelizer(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f3  */
    public static void read(GeneratedMessageLite generatedMessageLite, StringBuilder sb, int i) {
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
                read(sb, i, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(4, 0, strSubstring), GeneratedMessageLite.write(method2, generatedMessageLite, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                read(sb, i, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(3, 0, strSubstring), GeneratedMessageLite.write(method, generatedMessageLite, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objWrite = GeneratedMessageLite.write(method4, generatedMessageLite, new Object[0]);
                    if (method5 == null) {
                        if (objWrite instanceof Boolean) {
                            zEquals = !((Boolean) objWrite).booleanValue();
                        } else if (objWrite instanceof Integer) {
                            if (((Integer) objWrite).intValue() != 0) {
                                read(sb, i, strSubstring, objWrite);
                            }
                        } else if (objWrite instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objWrite).floatValue()) != 0) {
                                read(sb, i, strSubstring, objWrite);
                            }
                        } else if (objWrite instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objWrite).doubleValue()) != 0) {
                                read(sb, i, strSubstring, objWrite);
                            }
                        } else if (objWrite instanceof String) {
                            zEquals = objWrite.equals("");
                        } else if (objWrite instanceof setOnAttachui) {
                            zEquals = objWrite.equals(setOnAttachui.IconCompatParcelizer);
                        } else if (objWrite instanceof setInteropViewFactoryHolderui) {
                            if (objWrite != ((setInteropViewFactoryHolderui) objWrite).r_()) {
                                read(sb, i, strSubstring, objWrite);
                            }
                        } else if (!(objWrite instanceof Enum) || ((Enum) objWrite).ordinal() != 0) {
                            read(sb, i, strSubstring, objWrite);
                        }
                        if (!zEquals) {
                            read(sb, i, strSubstring, objWrite);
                        }
                    } else if (((Boolean) GeneratedMessageLite.write(method5, generatedMessageLite, new Object[0])).booleanValue()) {
                        read(sb, i, strSubstring, objWrite);
                    }
                }
            }
            i2 = 3;
        }
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacement = generatedMessageLite.IconCompatParcelizer;
        if (getcoordinatesaccessedduringmodifierplacement != null) {
            for (int i4 = 0; i4 < getcoordinatesaccessedduringmodifierplacement.read; i4++) {
                read(sb, i, String.valueOf(getcoordinatesaccessedduringmodifierplacement.MediaMetadataCompat[i4] >>> 3), getcoordinatesaccessedduringmodifierplacement.RemoteActionCompatParcelizer[i4]);
            }
        }
    }

    public static void RemoteActionCompatParcelizer(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(read, 0, i2);
            i -= i2;
        }
    }
}
