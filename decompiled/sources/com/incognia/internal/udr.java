package com.incognia.internal;

import android.util.Log;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Locale;
import java.util.regex.Pattern;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class udr {
    public static final String[] BGx = {"finance", "food", "mobility"};

    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0111  */
    /* JADX WARN: Code duplicated, block: B:38:0x0127  */
    /* JADX WARN: Code duplicated, block: B:40:0x013d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0154  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0172, please report this as an issue */
    public static void BGx(String str, String str2) {
        int length;
        String upperCase;
        Pattern patternCompile;
        Pattern patternCompile2;
        Pattern patternCompile3;
        Pattern patternCompile4;
        Pattern patternCompile5;
        Pattern patternCompile6;
        String strRemoteActionCompatParcelizer;
        if (str == null) {
            return;
        }
        String str3 = HFN.BGx;
        String str4 = hF.BGx;
        str4.getClass();
        Pattern patternCompile7 = Pattern.compile(str4);
        patternCompile7.getClass();
        if (patternCompile7.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            int length2 = str.length();
            for (int i = 0; i < length2; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            if (string.length() > 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < string.length()) {
                        if (string.charAt(i2) == string.charAt(0)) {
                            i2++;
                        } else {
                            String strSubstring = string.substring(0, 9);
                            strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(strSubstring, hF.BGx(10, strSubstring));
                            if (!string.equals(strRemoteActionCompatParcelizer + hF.BGx(11, strRemoteActionCompatParcelizer))) {
                            }
                        }
                    }
                    length = str.length();
                    if (3 > length && length < 255) {
                        String str5 = HFN.hs;
                        str5.getClass();
                        Pattern patternCompile8 = Pattern.compile(str5);
                        patternCompile8.getClass();
                        if (!patternCompile8.matcher(str).matches()) {
                            upperCase = setCarryoverInAppMessage.write(str, " ", "").toUpperCase(Locale.getDefault());
                            String str6 = HFN.hIl;
                            str6.getClass();
                            patternCompile = Pattern.compile(str6);
                            patternCompile.getClass();
                            upperCase.getClass();
                            if (!patternCompile.matcher(upperCase).matches()) {
                                String str7 = HFN.BGx;
                                str7.getClass();
                                patternCompile2 = Pattern.compile(str7);
                                patternCompile2.getClass();
                                if (!patternCompile2.matcher(str).matches()) {
                                    String str8 = HFN.mbG;
                                    str8.getClass();
                                    patternCompile3 = Pattern.compile(str8);
                                    patternCompile3.getClass();
                                    if (!patternCompile3.matcher(str).matches()) {
                                        String str9 = HFN.HQ;
                                        str9.getClass();
                                        patternCompile4 = Pattern.compile(str9);
                                        patternCompile4.getClass();
                                        if (!patternCompile4.matcher(str).matches()) {
                                            String str10 = HFN.N;
                                            str10.getClass();
                                            patternCompile5 = Pattern.compile(str10);
                                            patternCompile5.getClass();
                                            if (!patternCompile5.matcher(str).matches()) {
                                                String str11 = HFN.x;
                                                str11.getClass();
                                                patternCompile6 = Pattern.compile(str11);
                                                patternCompile6.getClass();
                                                if (!patternCompile6.matcher(str).matches()) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (IU.BGx.get()) {
                                    Log.w("Incognia", isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("Possible invalid " + str2 + " received: you should not use personable identifiable \n                    information (such as email or civil registration numbers) as " + str2 + ".\n                    Please hash your value beforehand."));
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        upperCase = setCarryoverInAppMessage.write(str, " ", "").toUpperCase(Locale.getDefault());
                        String str12 = HFN.hIl;
                        str12.getClass();
                        patternCompile = Pattern.compile(str12);
                        patternCompile.getClass();
                        upperCase.getClass();
                        if (!patternCompile.matcher(upperCase).matches()) {
                            String str13 = HFN.BGx;
                            str13.getClass();
                            patternCompile2 = Pattern.compile(str13);
                            patternCompile2.getClass();
                            if (!patternCompile2.matcher(str).matches()) {
                                String str14 = HFN.mbG;
                                str14.getClass();
                                patternCompile3 = Pattern.compile(str14);
                                patternCompile3.getClass();
                                if (!patternCompile3.matcher(str).matches()) {
                                    String str15 = HFN.HQ;
                                    str15.getClass();
                                    patternCompile4 = Pattern.compile(str15);
                                    patternCompile4.getClass();
                                    if (!patternCompile4.matcher(str).matches()) {
                                        String str16 = HFN.N;
                                        str16.getClass();
                                        patternCompile5 = Pattern.compile(str16);
                                        patternCompile5.getClass();
                                        if (!patternCompile5.matcher(str).matches()) {
                                            String str17 = HFN.x;
                                            str17.getClass();
                                            patternCompile6 = Pattern.compile(str17);
                                            patternCompile6.getClass();
                                            if (!patternCompile6.matcher(str).matches()) {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            if (IU.BGx.get()) {
                                Log.w("Incognia", isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("Possible invalid " + str2 + " received: you should not use personable identifiable \n                    information (such as email or civil registration numbers) as " + str2 + ".\n                    Please hash your value beforehand."));
                                return;
                            }
                            return;
                        }
                    }
                }
            } else {
                String strSubstring2 = string.substring(0, 9);
                strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(strSubstring2, hF.BGx(10, strSubstring2));
                if (!string.equals(strRemoteActionCompatParcelizer + hF.BGx(11, strRemoteActionCompatParcelizer))) {
                    length = str.length();
                    if (3 > length) {
                        upperCase = setCarryoverInAppMessage.write(str, " ", "").toUpperCase(Locale.getDefault());
                        String str18 = HFN.hIl;
                        str18.getClass();
                        patternCompile = Pattern.compile(str18);
                        patternCompile.getClass();
                        upperCase.getClass();
                        if (!patternCompile.matcher(upperCase).matches()) {
                            String str19 = HFN.BGx;
                            str19.getClass();
                            patternCompile2 = Pattern.compile(str19);
                            patternCompile2.getClass();
                            if (!patternCompile2.matcher(str).matches()) {
                                String str110 = HFN.mbG;
                                str110.getClass();
                                patternCompile3 = Pattern.compile(str110);
                                patternCompile3.getClass();
                                if (!patternCompile3.matcher(str).matches()) {
                                    String str111 = HFN.HQ;
                                    str111.getClass();
                                    patternCompile4 = Pattern.compile(str111);
                                    patternCompile4.getClass();
                                    if (!patternCompile4.matcher(str).matches()) {
                                        String str112 = HFN.N;
                                        str112.getClass();
                                        patternCompile5 = Pattern.compile(str112);
                                        patternCompile5.getClass();
                                        if (!patternCompile5.matcher(str).matches()) {
                                            String str113 = HFN.x;
                                            str113.getClass();
                                            patternCompile6 = Pattern.compile(str113);
                                            patternCompile6.getClass();
                                            if (!patternCompile6.matcher(str).matches()) {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            if (IU.BGx.get()) {
                                Log.w("Incognia", isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("Possible invalid " + str2 + " received: you should not use personable identifiable \n                    information (such as email or civil registration numbers) as " + str2 + ".\n                    Please hash your value beforehand."));
                                return;
                            }
                            return;
                        }
                    } else {
                        upperCase = setCarryoverInAppMessage.write(str, " ", "").toUpperCase(Locale.getDefault());
                        String str114 = HFN.hIl;
                        str114.getClass();
                        patternCompile = Pattern.compile(str114);
                        patternCompile.getClass();
                        upperCase.getClass();
                        if (!patternCompile.matcher(upperCase).matches()) {
                            String str115 = HFN.BGx;
                            str115.getClass();
                            patternCompile2 = Pattern.compile(str115);
                            patternCompile2.getClass();
                            if (!patternCompile2.matcher(str).matches()) {
                                String str116 = HFN.mbG;
                                str116.getClass();
                                patternCompile3 = Pattern.compile(str116);
                                patternCompile3.getClass();
                                if (!patternCompile3.matcher(str).matches()) {
                                    String str117 = HFN.HQ;
                                    str117.getClass();
                                    patternCompile4 = Pattern.compile(str117);
                                    patternCompile4.getClass();
                                    if (!patternCompile4.matcher(str).matches()) {
                                        String str118 = HFN.N;
                                        str118.getClass();
                                        patternCompile5 = Pattern.compile(str118);
                                        patternCompile5.getClass();
                                        if (!patternCompile5.matcher(str).matches()) {
                                            String str119 = HFN.x;
                                            str119.getClass();
                                            patternCompile6 = Pattern.compile(str119);
                                            patternCompile6.getClass();
                                            if (!patternCompile6.matcher(str).matches()) {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            if (IU.BGx.get()) {
                                Log.w("Incognia", isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("Possible invalid " + str2 + " received: you should not use personable identifiable \n                    information (such as email or civil registration numbers) as " + str2 + ".\n                    Please hash your value beforehand."));
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        } else {
            length = str.length();
            if (3 > length) {
                upperCase = setCarryoverInAppMessage.write(str, " ", "").toUpperCase(Locale.getDefault());
                String str1110 = HFN.hIl;
                str1110.getClass();
                patternCompile = Pattern.compile(str1110);
                patternCompile.getClass();
                upperCase.getClass();
                if (!patternCompile.matcher(upperCase).matches()) {
                    String str1111 = HFN.BGx;
                    str1111.getClass();
                    patternCompile2 = Pattern.compile(str1111);
                    patternCompile2.getClass();
                    if (!patternCompile2.matcher(str).matches()) {
                        String str1112 = HFN.mbG;
                        str1112.getClass();
                        patternCompile3 = Pattern.compile(str1112);
                        patternCompile3.getClass();
                        if (!patternCompile3.matcher(str).matches()) {
                            String str1113 = HFN.HQ;
                            str1113.getClass();
                            patternCompile4 = Pattern.compile(str1113);
                            patternCompile4.getClass();
                            if (!patternCompile4.matcher(str).matches()) {
                                String str1114 = HFN.N;
                                str1114.getClass();
                                patternCompile5 = Pattern.compile(str1114);
                                patternCompile5.getClass();
                                if (!patternCompile5.matcher(str).matches()) {
                                    String str1115 = HFN.x;
                                    str1115.getClass();
                                    patternCompile6 = Pattern.compile(str1115);
                                    patternCompile6.getClass();
                                    if (!patternCompile6.matcher(str).matches()) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    if (IU.BGx.get()) {
                        Log.w("Incognia", isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("Possible invalid " + str2 + " received: you should not use personable identifiable \n                    information (such as email or civil registration numbers) as " + str2 + ".\n                    Please hash your value beforehand."));
                        return;
                    }
                    return;
                }
            } else {
                upperCase = setCarryoverInAppMessage.write(str, " ", "").toUpperCase(Locale.getDefault());
                String str1116 = HFN.hIl;
                str1116.getClass();
                patternCompile = Pattern.compile(str1116);
                patternCompile.getClass();
                upperCase.getClass();
                if (!patternCompile.matcher(upperCase).matches()) {
                    String str1117 = HFN.BGx;
                    str1117.getClass();
                    patternCompile2 = Pattern.compile(str1117);
                    patternCompile2.getClass();
                    if (!patternCompile2.matcher(str).matches()) {
                        String str1118 = HFN.mbG;
                        str1118.getClass();
                        patternCompile3 = Pattern.compile(str1118);
                        patternCompile3.getClass();
                        if (!patternCompile3.matcher(str).matches()) {
                            String str1119 = HFN.HQ;
                            str1119.getClass();
                            patternCompile4 = Pattern.compile(str1119);
                            patternCompile4.getClass();
                            if (!patternCompile4.matcher(str).matches()) {
                                String str11110 = HFN.N;
                                str11110.getClass();
                                patternCompile5 = Pattern.compile(str11110);
                                patternCompile5.getClass();
                                if (!patternCompile5.matcher(str).matches()) {
                                    String str11111 = HFN.x;
                                    str11111.getClass();
                                    patternCompile6 = Pattern.compile(str11111);
                                    patternCompile6.getClass();
                                    if (!patternCompile6.matcher(str).matches()) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    if (IU.BGx.get()) {
                        Log.w("Incognia", isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("Possible invalid " + str2 + " received: you should not use personable identifiable \n                    information (such as email or civil registration numbers) as " + str2 + ".\n                    Please hash your value beforehand."));
                        return;
                    }
                    return;
                }
            }
        }
        if (IU.BGx.get()) {
            Log.e("Incognia", isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("Invalid " + str2 + " received: you should not use personable identifiable information \n                    (such as email or civil registration numbers) as " + str2 + ".\n                    Please hash your value beforehand."));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0149  */
    public static boolean BGx(String str) {
        String str2;
        SjD sjD = (SjD) JY.BGx.get();
        boolean zBooleanValue = true;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, RsL.BGx}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, yIq.BGx}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, Qv.BGx}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, l8.BGx}, getCieXyz.write())).booleanValue()) {
                        zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, JTd.BGx}, getCieXyz.write())).booleanValue();
                    }
                }
                if (!zBooleanValue) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return false;
                }
                zBooleanValue = false;
            }
        }
        if (!zBooleanValue && str != null) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, Qv.BGx}, getCieXyz.write())).booleanValue()) {
                str2 = "the Incognia SDK is not initialized";
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, l8.BGx}, getCieXyz.write())).booleanValue()) {
                    str2 = "the Incognia SDK is in an error state";
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sjD, JTd.BGx}, getCieXyz.write())).booleanValue()) {
                        str2 = "the Incognia SDK is in an error state";
                    } else {
                        str2 = null;
                    }
                }
            }
            if (str2 != null && IU.BGx.get()) {
                Log.w("Incognia", str + " won't be executed because " + str2);
            }
        }
        return zBooleanValue;
    }
}
