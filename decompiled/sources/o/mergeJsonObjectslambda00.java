package o;

import android.text.TextUtils;
import android.util.Log;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.huawei.hms.framework.common.ContainerUtils;
import fwfd.com.fwfsdk.util.FWFHelper;
import io.sentry.android.core.SentryLogcatAdapter;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class mergeJsonObjectslambda00 {
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public mergeJsonObjectslambda00(String str) {
        this.write = 1;
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
    }

    public static HashMap serializer(getInspectableElements getinspectableelements) {
        HashMap map = new HashMap();
        map.put("build_version", getinspectableelements.IconCompatParcelizer);
        map.put("display_version", getinspectableelements.serializer);
        map.put("source", Integer.toString(getinspectableelements.MediaBrowserCompatMediaItem));
        String str = getinspectableelements.MediaSessionCompatQueueItem;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static mergeJsonObjectslambda00 serializer(getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0, List list) {
        String str;
        int i;
        String str2;
        boolean z;
        getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda1 = getintentarraywithconfiguredbackstacklambda0;
        String str3 = "\\+";
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
        String str4 = (list != null ? getIntentArrayWithConfiguredBackStacklambda0.serializer(io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(list), true, brazeActionParserExternalSyntheticLambda0) : getIntentArrayWithConfiguredBackStacklambda0.serializer(null, true, brazeActionParserExternalSyntheticLambda0)).MediaBrowserCompatMediaItem;
        ConcurrentHashMap concurrentHashMap = getintentarraywithconfiguredbackstacklambda1.read;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda1 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        if (str4 == null || str4.isEmpty()) {
            str = "";
            i = 0;
        } else {
            sb.append(str4);
            Charset charset = io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer;
            int i2 = 0;
            for (int i3 = 0; i3 < str4.length(); i3++) {
                if (str4.charAt(i3) == ',') {
                    i2++;
                }
            }
            i = i2 + 1;
            str = ",";
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = getintentarraywithconfiguredbackstacklambda1.RemoteActionCompatParcelizer.serializer();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(concurrentHashMap.keys()));
            uriActionExternalSyntheticLambda4Serializer.close();
            treeSet.add("sentry-sample_rate");
            treeSet.add("sentry-sample_rand");
            int i4 = i;
            String str5 = str;
            for (String str6 : treeSet) {
                String strIconCompatParcelizer = "sentry-sample_rate".equals(str6) ? getIntentArrayWithConfiguredBackStacklambda0.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem) : "sentry-sample_rand".equals(str6) ? getIntentArrayWithConfiguredBackStacklambda0.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1.MediaDescriptionCompat) : (String) concurrentHashMap.get(str6);
                if (strIconCompatParcelizer == null) {
                    str2 = str3;
                    z = true;
                } else if (i4 >= 64) {
                    brazeActionParserExternalSyntheticLambda1.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str6, 64);
                    str2 = str3;
                    z = true;
                } else {
                    try {
                        str2 = str3;
                        try {
                            String str7 = str5 + URLEncoder.encode(str6, com.adjust.sdk.Constants.ENCODING).replaceAll(str3, "%20") + ContainerUtils.KEY_VALUE_DELIMITER + URLEncoder.encode(strIconCompatParcelizer, com.adjust.sdk.Constants.ENCODING).replaceAll(str3, "%20");
                            if (sb.length() + str7.length() > 8192) {
                                r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR;
                                Object[] objArr = new Object[2];
                                try {
                                    objArr[0] = str6;
                                    z = true;
                                    try {
                                        objArr[1] = 8192;
                                        brazeActionParserExternalSyntheticLambda1.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", objArr);
                                    } catch (Throwable th) {
                                        th = th;
                                        brazeActionParserExternalSyntheticLambda1.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str6, strIconCompatParcelizer);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = true;
                                }
                            } else {
                                z = true;
                                i4++;
                                sb.append(str7);
                                str5 = ",";
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z = true;
                            brazeActionParserExternalSyntheticLambda1.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str6, strIconCompatParcelizer);
                            getintentarraywithconfiguredbackstacklambda1 = getintentarraywithconfiguredbackstacklambda0;
                            str3 = str2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = str3;
                    }
                }
                getintentarraywithconfiguredbackstacklambda1 = getintentarraywithconfiguredbackstacklambda0;
                str3 = str2;
            }
            String string = sb.toString();
            if (string.isEmpty()) {
                return null;
            }
            return new mergeJsonObjectslambda00(string, 4);
        } catch (Throwable th5) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    public JSONObject serializer(prune pruneVar) {
        String str = this.RemoteActionCompatParcelizer;
        int i = pruneVar.read();
        Log.isLoggable("FirebaseCrashlytics", 2);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Settings request failed; (status: " + i + ") from " + str, null);
            return null;
        }
        String strIconCompatParcelizer = pruneVar.IconCompatParcelizer();
        try {
            return new JSONObject(strIconCompatParcelizer);
        } catch (Exception e) {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Failed to parse settings JSON from ".concat(str), e);
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Settings response " + strIconCompatParcelizer, null);
            return null;
        }
    }

    public String toString() {
        return this.write != 0 ? super.toString() : this.RemoteActionCompatParcelizer;
    }

    public static void write(HttpGetRequest httpGetRequest, getInspectableElements getinspectableelements) {
        String str = getinspectableelements.read;
        if (str != null) {
            httpGetRequest.RemoteActionCompatParcelizer("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        httpGetRequest.RemoteActionCompatParcelizer("X-CRASHLYTICS-API-CLIENT-TYPE", FWFHelper.fwfDeviceOS);
        httpGetRequest.RemoteActionCompatParcelizer("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.4");
        httpGetRequest.RemoteActionCompatParcelizer("Accept", ConstantKt.CONTENT_TYPE_JSON);
        httpGetRequest.RemoteActionCompatParcelizer("X-CRASHLYTICS-DEVICE-MODEL", getinspectableelements.write);
        String str2 = getinspectableelements.RatingCompat;
        if (str2 != null) {
            httpGetRequest.RemoteActionCompatParcelizer("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = getinspectableelements.MediaDescriptionCompat;
        if (str3 != null) {
            httpGetRequest.RemoteActionCompatParcelizer("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = getinspectableelements.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().write;
        if (str4 != null) {
            httpGetRequest.RemoteActionCompatParcelizer("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public /* synthetic */ mergeJsonObjectslambda00(String str, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = str;
    }

    public mergeJsonObjectslambda00(String str, accessgetWcp accessgetwcp) {
        this.write = 3;
        this.RemoteActionCompatParcelizer = str;
    }

    public /* synthetic */ mergeJsonObjectslambda00() {
        this.write = 2;
    }
}
