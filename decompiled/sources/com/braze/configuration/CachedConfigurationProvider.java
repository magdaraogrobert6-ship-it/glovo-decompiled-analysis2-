package com.braze.configuration;

import android.content.Context;
import android.util.Base64;
import bo.app.bb$$ExternalSyntheticLambda0;
import bo.app.ih$$ExternalSyntheticLambda2;
import bo.app.ih$$ExternalSyntheticLambda9;
import bo.app.k3;
import bo.app.l3;
import com.braze.BrazeUser$$ExternalSyntheticLambda3;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import com.braze.support.c$$ExternalSyntheticLambda7;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public class CachedConfigurationProvider {
    public static final k3 Companion;
    private static int IconCompatParcelizer = 0;
    private static final int MISSING_RESOURCE_IDENTIFIER = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static byte read;
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private RuntimeAppConfigurationProvider runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    static {
        write();
        Companion = new k3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$1() {
        return "Caught exception retrieving resource value";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetCache$lambda$0() {
        return "Resetting cached configuration";
    }

    public CachedConfigurationProvider(Context context, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        context.getClass();
        runtimeAppConfigurationProvider.getClass();
        this.context = context;
        this.shouldUseConfigurationCache = z;
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.getClass();
        this.configurationCache = mapSynchronizedMap;
        this.resourcePackageName = PackageUtils.getResourcePackageName(this.context);
    }

    private final String getFallbackConfigKey(String str) {
        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "braze", false)) {
            return setCarryoverInAppMessage.write(str, "braze", "appboy");
        }
        return null;
    }

    public final boolean getBooleanValue(String str, boolean z) {
        str.getClass();
        Object configurationValue = getConfigurationValue(l3.BOOLEAN, str, Boolean.valueOf(z));
        configurationValue.getClass();
        return ((Boolean) configurationValue).booleanValue();
    }

    public final Integer getColorValue(String str) {
        str.getClass();
        return (Integer) getConfigurationValue(l3.COLOR, str, null);
    }

    public final Object getConfigurationValue(l3 l3Var, String str, Object obj) {
        l3Var.getClass();
        str.getClass();
        if (this.shouldUseConfigurationCache && this.configurationCache.containsKey(str)) {
            return this.configurationCache.get(str);
        }
        return this.runtimeAppConfigurationProvider.containsKey(str) ? getRuntimeConfigurationValue(l3Var, str, obj) : getResourceConfigurationValue(l3Var, str, obj);
    }

    public final int getDrawableValue(String str, int i) {
        str.getClass();
        Object configurationValue = getConfigurationValue(l3.DRAWABLE_IDENTIFIER, str, Integer.valueOf(i));
        configurationValue.getClass();
        return ((Integer) configurationValue).intValue();
    }

    public final int getIntValue(String str, int i) {
        str.getClass();
        Object configurationValue = getConfigurationValue(l3.INTEGER, str, Integer.valueOf(i));
        configurationValue.getClass();
        return ((Integer) configurationValue).intValue();
    }

    public final Object getResourceConfigurationValue(l3 l3Var, String str, Object obj) {
        l3Var.getClass();
        str.getClass();
        Object resourceValue = readResourceValue(l3Var, str, obj);
        this.configurationCache.put(str, resourceValue);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ih$$ExternalSyntheticLambda2(4, str, resourceValue), 7, (Object) null);
        return resourceValue;
    }

    public final Object getRuntimeConfigurationValue(l3 l3Var, String str, Object obj) {
        Object objValueOf;
        l3Var.getClass();
        str.getClass();
        int iOrdinal = l3Var.ordinal();
        int i = 3;
        if (iOrdinal == 0 || iOrdinal == 1) {
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = this.runtimeAppConfigurationProvider;
            objValueOf = Integer.valueOf(obj == null ? runtimeAppConfigurationProvider.getIntValue(str, 0) : runtimeAppConfigurationProvider.getIntValue(str, ((Integer) obj).intValue()));
        } else if (iOrdinal == 2) {
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2 = this.runtimeAppConfigurationProvider;
            obj.getClass();
            objValueOf = Boolean.valueOf(runtimeAppConfigurationProvider2.getBooleanValue(str, ((Boolean) obj).booleanValue()));
        } else if (iOrdinal == 3) {
            objValueOf = this.runtimeAppConfigurationProvider.getStringValue(str, (String) obj);
        } else if (iOrdinal == 4) {
            objValueOf = Integer.valueOf(getResourceIdentifier(this.runtimeAppConfigurationProvider.getStringValue(str, ""), l3.DRAWABLE_IDENTIFIER));
        } else {
            if (iOrdinal != 5) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            objValueOf = this.runtimeAppConfigurationProvider.getStringSetValue(str);
        }
        this.configurationCache.put(str, objValueOf);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ih$$ExternalSyntheticLambda9(i, str, objValueOf), 7, (Object) null);
        return objValueOf;
    }

    public final Set<String> getStringSetValue(String str, Set<String> set) {
        str.getClass();
        Object configurationValue = getConfigurationValue(l3.STRING_ARRAY, str, set);
        return configurationValue == null ? set : (Set) configurationValue;
    }

    public final String getStringValue(String str, String str2) {
        str.getClass();
        return (String) getConfigurationValue(l3.STRING, str, str2);
    }

    public final Object readResourceValue(l3 l3Var, String str, Object obj) {
        l3Var.getClass();
        str.getClass();
        try {
            int resourceIdentifier = getResourceIdentifier(str, l3Var);
            if (resourceIdentifier != 0) {
                return getValueFromResources(l3Var, resourceIdentifier);
            }
            String fallbackConfigKey = getFallbackConfigKey(str);
            if (fallbackConfigKey == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ih$$ExternalSyntheticLambda2(3, str, obj), 7, (Object) null);
                return obj;
            }
            int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, l3Var);
            if (resourceIdentifier2 != 0) {
                return getValueFromResources(l3Var, resourceIdentifier2);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new bb$$ExternalSyntheticLambda0(l3Var, str, obj, 6), 7, (Object) null);
            return obj;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(9), 4, (Object) null);
        }
    }

    public final void setRuntimeAppConfigurationProvider(RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        runtimeAppConfigurationProvider.getClass();
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getResourceConfigurationValue$lambda$0(String str, Object obj) {
        return "Using resources value for key: '" + str + "' and value: '" + obj + "'";
    }

    private final int getResourceIdentifier(String str, l3 l3Var) {
        if (str == null) {
            return 0;
        }
        return this.context.getResources().getIdentifier(str, l3Var.a, this.resourcePackageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRuntimeConfigurationValue$lambda$0(String str, Object obj) {
        return "Using runtime override value for key: '" + str + "' and value: '" + obj + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$0(String str, Object obj) {
        return "Primary key '" + str + "' had no identifier. No secondary key to read resource value. Returning default value: '" + obj + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$2(l3 l3Var, String str, Object obj) {
        return "Unable to find the xml " + l3Var + " configuration value with primary key '" + str + "'. Using default value '" + obj + "'.";
    }

    public final void resetCache$android_sdk_base_release() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(19), 7, (Object) null);
        this.configurationCache.clear();
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context, boolean z) {
        this(context, z, null, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context) {
        this(context, false, null, 6, null);
        context.getClass();
    }

    public /* synthetic */ CachedConfigurationProvider(Context context, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new RuntimeAppConfigurationProvider(context) : runtimeAppConfigurationProvider);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r6 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r6 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r6 == 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r6 == 4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2 = com.braze.configuration.CachedConfigurationProvider.RemoteActionCompatParcelizer + 71;
        com.braze.configuration.CachedConfigurationProvider.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if ((r2 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r6 != 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r6 != 5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        r6 = r1.getStringArray(r7);
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return new java.util.HashSet(androidx.sqlite.SQLite.read(java.util.Arrays.copyOf(r6, r6.length)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        return java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        r6 = r1.getString(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r6.startsWith("%('") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r7 = com.braze.configuration.CachedConfigurationProvider.RemoteActionCompatParcelizer + 19;
        com.braze.configuration.CachedConfigurationProvider.IconCompatParcelizer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if ((r7 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        r7 = new java.lang.Object[1];
        a(r6.substring(3), r7);
        r6 = ((java.lang.String) r7[0]).intern();
        r7 = 31 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        r7 = new java.lang.Object[1];
        a(r6.substring(3), r7);
        r6 = ((java.lang.String) r7[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        r6 = java.lang.Boolean.valueOf(r1.getBoolean(r7));
        r7 = com.braze.configuration.CachedConfigurationProvider.RemoteActionCompatParcelizer + 41;
        com.braze.configuration.CachedConfigurationProvider.IconCompatParcelizer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        if ((r7 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        r7 = 80 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        return java.lang.Integer.valueOf(r1.getColor(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        r6 = java.lang.Integer.valueOf(r1.getInteger(r7));
        r7 = com.braze.configuration.CachedConfigurationProvider.RemoteActionCompatParcelizer + 117;
        com.braze.configuration.CachedConfigurationProvider.IconCompatParcelizer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r6 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r6 != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getValueFromResources(bo.app.l3 r6, int r7) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.configuration.CachedConfigurationProvider.getValueFromResources(bo.app.l3, int):java.lang.Object");
    }

    static void write() {
        read = (byte) -112;
    }
}
