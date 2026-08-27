package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.sentry.android.core.SentryLogcatAdapter;
import o.MeasureScopelayout1;
import o.accessgetSystemNavigationDowncp;
import o.getProgramRedEK5gGoQ;
import o.getSleepEK5gGoQ;
import o.getSoftRightEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdr extends getSleepEK5gGoQ {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Context serializer;
    public final /* synthetic */ Bundle write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzfa zzfaVar, Bundle bundle, Activity activity) {
        super((getSoftRightEK5gGoQ) zzfaVar.IconCompatParcelizer, true);
        this.write = bundle;
        this.serializer = activity;
        this.read = zzfaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        Boolean boolValueOf;
        Bundle bundle = null;
        getProgramRedEK5gGoQ getprogramredek5ggoqAsInterface = null;
        if (this.RemoteActionCompatParcelizer != 0) {
            Bundle bundle2 = this.write;
            if (bundle2 != null) {
                bundle = new Bundle();
                if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                    Object obj = bundle2.get("com.google.app_measurement.screen_service");
                    if (obj instanceof Bundle) {
                        bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                    }
                }
            }
            getProgramRedEK5gGoQ getprogramredek5ggoq = ((getSoftRightEK5gGoQ) ((zzfa) this.read).IconCompatParcelizer).MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
            getprogramredek5ggoq.onActivityCreatedByScionActivityInfo(zzdf.IconCompatParcelizer((Activity) this.serializer), bundle, this.MediaMetadataCompat);
            return;
        }
        try {
            Context context = this.serializer;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
            String strRemoteActionCompatParcelizer = MeasureScopelayout1.RemoteActionCompatParcelizer(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                strRemoteActionCompatParcelizer = MeasureScopelayout1.RemoteActionCompatParcelizer(context);
            }
            int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strRemoteActionCompatParcelizer);
            if (identifier == 0) {
                boolValueOf = null;
            } else {
                try {
                    boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                } catch (Resources.NotFoundException unused) {
                    boolValueOf = null;
                }
            }
            getSoftRightEK5gGoQ getsoftrightek5ggoq = (getSoftRightEK5gGoQ) this.read;
            Object[] objArr = boolValueOf == null || !boolValueOf.booleanValue();
            getsoftrightek5ggoq.getClass();
            try {
                getprogramredek5ggoqAsInterface = zzcq.asInterface(DynamiteModule.load(context, objArr != false ? DynamiteModule.read : DynamiteModule.IconCompatParcelizer, ModuleDescriptor.MODULE_ID).RemoteActionCompatParcelizer("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e) {
                getsoftrightek5ggoq.RemoteActionCompatParcelizer(e, true, false);
            }
            getsoftrightek5ggoq.MediaDescriptionCompat = getprogramredek5ggoqAsInterface;
            if (getsoftrightek5ggoq.MediaDescriptionCompat == null) {
                SentryLogcatAdapter.IconCompatParcelizer("FA", "Failed to connect to measurement client.");
                return;
            }
            int iWrite = DynamiteModule.write(context, ModuleDescriptor.MODULE_ID);
            int iZza = DynamiteModule.zza(context, ModuleDescriptor.MODULE_ID, false);
            zzdd zzddVar = new zzdd(133005L, Math.max(iWrite, iZza), Boolean.TRUE.equals(boolValueOf) || iZza < iWrite, this.write, MeasureScopelayout1.RemoteActionCompatParcelizer(context));
            getProgramRedEK5gGoQ getprogramredek5ggoq2 = getsoftrightek5ggoq.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq2);
            getprogramredek5ggoq2.initialize(new ObjectWrapper(context), zzddVar, this.MediaSessionCompatQueueItem);
        } catch (Exception e2) {
            ((getSoftRightEK5gGoQ) this.read).RemoteActionCompatParcelizer(e2, true, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(getSoftRightEK5gGoQ getsoftrightek5ggoq, Context context, Bundle bundle) {
        super(getsoftrightek5ggoq, true);
        this.serializer = context;
        this.write = bundle;
        this.read = getsoftrightek5ggoq;
    }
}
