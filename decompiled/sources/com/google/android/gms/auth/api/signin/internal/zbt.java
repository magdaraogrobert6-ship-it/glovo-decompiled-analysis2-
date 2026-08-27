package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.camera.core.ImageCapture$1;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.zau;
import o.FlingCancellationException;
import o.ParentDataModifierDefaultImpls;
import o.accessgetMediaStepBackwardcp;
import o.accessgetMicrophoneMutecp;
import o.accessgetMinuscp;
import o.accessgetMoveEndcp;
import o.accessgetMuhenkancp;
import o.accessgetNumPad8cp;
import o.accessgetNumPadCommacp;
import o.accessgetNumPadMultiplycp;
import o.accessgetNumPadSubtractcp;
import o.accessgetQcp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvDataServicecp;
import o.accessgetTvInputHdmi4cp;
import o.getApostropheEK5gGoQ;
import o.toContentCaptureSession;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class zbt extends getApostropheEK5gGoQ {
    public final RevocationBoundService RemoteActionCompatParcelizer;

    public zbt(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.RemoteActionCompatParcelizer = revocationBoundService;
    }

    public final void read() {
        if (accessgetTvInputHdmi4cp.IconCompatParcelizer(this.RemoteActionCompatParcelizer, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

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
    @Override // o.getApostropheEK5gGoQ
    public final boolean serializer(int i, Parcel parcel, Parcel parcel2) {
        GoogleSignInOptions googleSignInOptionsSerializer;
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String str;
        RevocationBoundService revocationBoundService = this.RemoteActionCompatParcelizer;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            read();
            ImageCapture$1.read(revocationBoundService).MediaDescriptionCompat();
            return true;
        }
        read();
        Storage storageIconCompatParcelizer = Storage.IconCompatParcelizer(revocationBoundService);
        GoogleSignInAccount googleSignInAccountRemoteActionCompatParcelizer = storageIconCompatParcelizer.RemoteActionCompatParcelizer();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.IconCompatParcelizer;
        if (googleSignInAccountRemoteActionCompatParcelizer != null) {
            String str2 = storageIconCompatParcelizer.read("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(str2) || (str = storageIconCompatParcelizer.read(Storage.RemoteActionCompatParcelizer("googleSignInOptions", str2))) == null) {
                googleSignInOptionsSerializer = null;
            } else {
                try {
                    googleSignInOptionsSerializer = GoogleSignInOptions.serializer(str);
                } catch (JSONException unused) {
                    googleSignInOptionsSerializer = null;
                }
            }
        } else {
            googleSignInOptionsSerializer = googleSignInOptions;
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer(googleSignInOptionsSerializer);
        accessgetMoveEndcp accessgetmoveendcp = new accessgetMoveEndcp(revocationBoundService, null, accessgetMediaStepBackwardcp.IconCompatParcelizer, googleSignInOptionsSerializer, new accessgetNumPad8cp(new FlingCancellationException(9), Looper.getMainLooper()));
        Context context = accessgetmoveendcp.write;
        accessgetNumPadSubtractcp accessgetnumpadsubtractcp = accessgetmoveendcp.ParcelableVolumeInfo;
        int i2 = 20;
        if (googleSignInAccountRemoteActionCompatParcelizer != null) {
            boolean z = accessgetmoveendcp.read() == 3;
            accessgetTvDataServicecp accessgettvdataservicecp = accessgetMuhenkancp.IconCompatParcelizer;
            if (accessgettvdataservicecp.IconCompatParcelizer <= 3) {
                accessgettvdataservicecp.read.concat("Revoking access");
            }
            String str3 = Storage.IconCompatParcelizer(context).read("refreshToken");
            accessgetMuhenkancp.serializer(context);
            if (!z) {
                accessgetMicrophoneMutecp accessgetmicrophonemutecp = new accessgetMicrophoneMutecp(accessgetnumpadsubtractcp, 1);
                accessgetnumpadsubtractcp.IconCompatParcelizer.serializer(1, accessgetmicrophonemutecp);
                basePendingResult2 = accessgetmicrophonemutecp;
            } else if (str3 == null) {
                accessgetTvDataServicecp accessgettvdataservicecp2 = accessgetMinuscp.IconCompatParcelizer;
                Status status = new Status(4, null, null, null);
                accessgetSystemNavigationDowncp.write("Status code must not be SUCCESS", !status.write());
                accessgetQcp accessgetqcp = new accessgetQcp(status);
                accessgetqcp.write((accessgetNumPadCommacp) status);
                basePendingResult2 = accessgetqcp;
            } else {
                accessgetMinuscp accessgetminuscp = new accessgetMinuscp(str3);
                new Thread(accessgetminuscp).start();
                basePendingResult2 = accessgetminuscp.serializer;
            }
            basePendingResult2.write(new zau(basePendingResult2, new ParentDataModifierDefaultImpls(), new toContentCaptureSession(i2)));
        } else {
            boolean z2 = accessgetmoveendcp.read() == 3;
            accessgetTvDataServicecp accessgettvdataservicecp3 = accessgetMuhenkancp.IconCompatParcelizer;
            if (accessgettvdataservicecp3.IconCompatParcelizer <= 3) {
                accessgettvdataservicecp3.read.concat("Signing out");
            }
            accessgetMuhenkancp.serializer(context);
            if (z2) {
                accessgetNumPadMultiplycp accessgetnumpadmultiplycp = new accessgetNumPadMultiplycp(accessgetnumpadsubtractcp);
                accessgetnumpadmultiplycp.write((accessgetNumPadCommacp) Status.IconCompatParcelizer);
                basePendingResult = accessgetnumpadmultiplycp;
            } else {
                accessgetMicrophoneMutecp accessgetmicrophonemutecp2 = new accessgetMicrophoneMutecp(accessgetnumpadsubtractcp, 0);
                accessgetnumpadsubtractcp.IconCompatParcelizer.serializer(1, accessgetmicrophonemutecp2);
                basePendingResult = accessgetmicrophonemutecp2;
            }
            basePendingResult.write(new zau(basePendingResult, new ParentDataModifierDefaultImpls(), new toContentCaptureSession(i2)));
        }
        return true;
    }
}
