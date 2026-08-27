package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import coil3.util.ContextsKt;
import coil3.util.IntPair;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveKt;
import kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1;
import o.SwipeDismissTouchListener1;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.applyDisplayCutoutMarginsToCloseButtonlambda0;
import o.getCieXyz;
import o.getLookaheadDelegate;
import o.r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc;
import o.r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0;
import o.removeNodeAtDepth;
import o.requestDisallowParentIntercept;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgs {
    public final Object IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public boolean serializer;
    public int write;

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008c -> B:27:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$readObject(com.google.android.gms.measurement.internal.zzgs r13, kotlin.DeepRecursiveScopeImpl r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgs.access$readObject(com.google.android.gms.measurement.internal.zzgs, kotlin.DeepRecursiveScopeImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public SwipeDismissTouchListenerVerticalDismissDirection RemoteActionCompatParcelizer() {
        SwipeDismissTouchListenerVerticalDismissDirection r8lambdaerwhggzq_gqgn8cultnvrcshm8k;
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = (applyDisplayCutoutMarginsToCloseButtonlambda0) this.IconCompatParcelizer;
        byte bMediaBrowserCompatMediaItem = applydisplaycutoutmarginstoclosebuttonlambda0.MediaBrowserCompatMediaItem();
        if (bMediaBrowserCompatMediaItem == 1) {
            return RemoteActionCompatParcelizer(true);
        }
        if (bMediaBrowserCompatMediaItem == 0) {
            return RemoteActionCompatParcelizer(false);
        }
        if (bMediaBrowserCompatMediaItem != 6) {
            if (bMediaBrowserCompatMediaItem == 8) {
                return serializer();
            }
            applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Cannot read Json element because of unexpected ".concat(ContextsKt.serializer(bMediaBrowserCompatMediaItem)), 0, null, 6);
            throw null;
        }
        int i = this.write + 1;
        this.write = i;
        if (i == 200) {
            r8lambdaerwhggzq_gqgn8cultnvrcshm8k = (SwipeDismissTouchListenerVerticalDismissDirection) DeepRecursiveKt.invoke(new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(22, new JsonTreeReader$readDeepRecursive$1(this, null)));
        } else {
            byte bIconCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer((byte) 6);
            if (applydisplaycutoutmarginstoclosebuttonlambda0.MediaBrowserCompatMediaItem() == 4) {
                applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (applydisplaycutoutmarginstoclosebuttonlambda0.read()) {
                String strMediaMetadataCompat = this.serializer ? applydisplaycutoutmarginstoclosebuttonlambda0.MediaMetadataCompat() : applydisplaycutoutmarginstoclosebuttonlambda0.write();
                applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer((byte) 5);
                linkedHashMap.put(strMediaMetadataCompat, RemoteActionCompatParcelizer());
                bIconCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer();
                if (bIconCompatParcelizer != 4) {
                    if (bIconCompatParcelizer == 7) {
                        break;
                    }
                    applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bIconCompatParcelizer == 6) {
                applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer((byte) 7);
            } else if (bIconCompatParcelizer == 4) {
                if (!this.RemoteActionCompatParcelizer) {
                    IntPair.serializer(applydisplaycutoutmarginstoclosebuttonlambda0, "object");
                    throw null;
                }
                applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer((byte) 7);
            }
            r8lambdaerwhggzq_gqgn8cultnvrcshm8k = new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k(linkedHashMap);
        }
        this.write--;
        return r8lambdaerwhggzq_gqgn8cultnvrcshm8k;
    }

    public r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 RemoteActionCompatParcelizer(boolean z) {
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = (applyDisplayCutoutMarginsToCloseButtonlambda0) this.IconCompatParcelizer;
        String strMediaMetadataCompat = (this.serializer || !z) ? applydisplaycutoutmarginstoclosebuttonlambda0.MediaMetadataCompat() : applydisplaycutoutmarginstoclosebuttonlambda0.write();
        if (!z) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strMediaMetadataCompat, "null"}, getCieXyz.write())).booleanValue()) {
                return r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc.INSTANCE;
            }
        }
        return new r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U(strMediaMetadataCompat, z, null);
    }

    public requestDisallowParentIntercept serializer() {
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = (applyDisplayCutoutMarginsToCloseButtonlambda0) this.IconCompatParcelizer;
        byte bIconCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer();
        if (applydisplaycutoutmarginstoclosebuttonlambda0.MediaBrowserCompatMediaItem() == 4) {
            applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (applydisplaycutoutmarginstoclosebuttonlambda0.read()) {
            arrayList.add(RemoteActionCompatParcelizer());
            bIconCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer();
            if (bIconCompatParcelizer != 4) {
                boolean z = bIconCompatParcelizer == 9;
                int i = applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost;
                if (!z) {
                    applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bIconCompatParcelizer == 8) {
            applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer((byte) 9);
        } else if (bIconCompatParcelizer == 4) {
            if (!this.RemoteActionCompatParcelizer) {
                IntPair.serializer(applydisplaycutoutmarginstoclosebuttonlambda0, "array");
                throw null;
            }
            applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer((byte) 9);
        }
        return new requestDisallowParentIntercept(arrayList);
    }

    public void IconCompatParcelizer(String str, Object obj, Object obj2, Object obj3) {
        ((getLookaheadDelegate) this.IconCompatParcelizer).serializer(this.write, this.serializer, this.RemoteActionCompatParcelizer, str, obj, obj2, obj3);
    }

    public void RemoteActionCompatParcelizer(String str) {
        ((getLookaheadDelegate) this.IconCompatParcelizer).serializer(this.write, this.serializer, this.RemoteActionCompatParcelizer, str, null, null, null);
    }

    public void serializer(Object obj, String str) {
        ((getLookaheadDelegate) this.IconCompatParcelizer).serializer(this.write, this.serializer, this.RemoteActionCompatParcelizer, str, obj, null, null);
    }

    public void serializer(String str, Object obj, Object obj2) {
        ((getLookaheadDelegate) this.IconCompatParcelizer).serializer(this.write, this.serializer, this.RemoteActionCompatParcelizer, str, obj, obj2, null);
    }

    public zzgs(SharedPreferencesUtils sharedPreferencesUtils) {
        boolean z = false;
        this.write = 0;
        this.IconCompatParcelizer = sharedPreferencesUtils;
        FirebaseApp firebaseApp = sharedPreferencesUtils.serializer;
        firebaseApp.IconCompatParcelizer();
        SharedPreferences sharedPreferences = ((Application) firebaseApp.read).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        boolean z2 = true;
        if (sharedPreferences.contains("fresh_install")) {
            z2 = sharedPreferences.getBoolean("fresh_install", true);
        } else {
            sharedPreferencesUtils.read("fresh_install", true);
        }
        this.RemoteActionCompatParcelizer = z2;
        FirebaseApp firebaseApp2 = sharedPreferencesUtils.serializer;
        firebaseApp2.IconCompatParcelizer();
        SharedPreferences sharedPreferences2 = ((Application) firebaseApp2.read).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences2.contains("test_device")) {
            z = sharedPreferences2.getBoolean("test_device", false);
        } else {
            sharedPreferencesUtils.read("test_device", false);
        }
        this.serializer = z;
    }

    public zzgs(SwipeDismissTouchListener1 swipeDismissTouchListener1, applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0) {
        this.IconCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0;
        this.serializer = swipeDismissTouchListener1.MediaMetadataCompat;
        this.RemoteActionCompatParcelizer = swipeDismissTouchListener1.IconCompatParcelizer;
    }

    public zzgs(getLookaheadDelegate getlookaheaddelegate, int i, boolean z, boolean z2) {
        this.IconCompatParcelizer = getlookaheaddelegate;
        this.write = i;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = z2;
    }
}
