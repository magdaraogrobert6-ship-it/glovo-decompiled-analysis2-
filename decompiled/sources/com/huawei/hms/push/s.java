package com.huawei.hms.push;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class s {
    public static int a(Context context, String str, String str2) {
        try {
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            Field field = Class.forName(context.getPackageName() + ".R$" + str).getField(str2);
            int i = Integer.parseInt(field.get(field.getName()).toString());
            if (i == 0) {
                HMSLog.i("ResourceLoader", "Error-resourceType=" + str + "--resourceName=" + str2 + "--resourceId =" + i);
            }
            return i;
        } catch (ClassNotFoundException e) {
            HMSLog.e("ResourceLoader", af$$ExternalSyntheticOutline0.m("!!!! ResourceLoader: ClassNotFoundException-resourceType=", str, "--resourceName=", str2), e);
            return 0;
        } catch (IllegalAccessException e2) {
            HMSLog.e("ResourceLoader", af$$ExternalSyntheticOutline0.m("!!!! ResourceLoader: IllegalAccessException-resourceType=", str, "--resourceName=", str2), e2);
            return 0;
        } catch (NoSuchFieldException e3) {
            HMSLog.e("ResourceLoader", af$$ExternalSyntheticOutline0.m("!!!! ResourceLoader: NoSuchFieldException-resourceType=", str, "--resourceName=", str2), e3);
            return 0;
        } catch (NumberFormatException e4) {
            HMSLog.e("ResourceLoader", af$$ExternalSyntheticOutline0.m("!!!! ResourceLoader: NumberFormatException-resourceType=", str, "--resourceName=", str2), e4);
            return 0;
        } catch (IllegalArgumentException e5) {
            HMSLog.e("ResourceLoader", af$$ExternalSyntheticOutline0.m("!!!! ResourceLoader: IllegalArgumentException-resourceType=", str, "--resourceName=", str2), e5);
            return 0;
        }
    }

    public static int a(Context context, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), Fields.SpotShadowColor);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt(str);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            HMSLog.w("ResourceLoader", "load meta data resource failed.");
            return 0;
        }
    }
}
